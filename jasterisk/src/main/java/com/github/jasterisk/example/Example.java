package com.github.jasterisk.example;

import com.github.jasterisk.api.DefaultApi;
import com.github.jasterisk.client.Jasterisk;
import com.github.jasterisk.model.Bridge;
import com.github.jasterisk.model.BridgeCreated;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import retrofit2.Response;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

class Example {

    private static final String uri = "http://192.168.1.207:8088/ari";
    private static final String apiKeyValue = "asterisk:asterisk";

    public static void main(String[] args) throws IOException, InterruptedException {
        OkHttpClient okClient = new OkHttpClient.Builder()
            .dispatcher(new Dispatcher(Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors())))
            .build();

        DefaultApi client = Jasterisk.createClient(uri, apiKeyValue, okClient);
        WebSocket eventWebSocket = Jasterisk
                .createEventWebSocket(uri, apiKeyValue, null, okClient, new MyWebSocketListener());
        Thread.sleep(1000); // give time for the websocket to get setup

        Response<Bridge> response = client
                .createBridge("holding", null, null) // null for optional values
                .execute();// sync, use .enqueue for async
        if(response.isSuccessful()) {
            System.out.println("new Bridge id is " + response.body().getId());
        }
        eventWebSocket.close(1000, "closing");
    }

    public static class MyWebSocketListener extends WebSocketListener {

        private final Map<Class<?>, Consumer<Object>> handlers = new HashMap<>();

        @SuppressWarnings("unchecked")
        private <T> void setHandler(Class<T> klass, Consumer<T> consumer) {
            handlers.put(klass, (Consumer<Object>) consumer);
        }

        MyWebSocketListener() {
            setHandler(BridgeCreated.class, this::handleBridgeCreated);
            // similar for other events
        }

        private void handleBridgeCreated(BridgeCreated bc) {
            System.out.println("received event for new bridge " + bc.getBridge().getId());
        }

        @Override
        public void onMessage(WebSocket webSocket, String json) {
            Object obj = Jasterisk.jsonToObject(json);
            Consumer<Object> consumer = handlers.get(obj.getClass());
            if(consumer != null) consumer.accept(obj);
        }
    }
}