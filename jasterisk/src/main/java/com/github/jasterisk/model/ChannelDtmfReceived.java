/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.jasterisk.model;

import java.util.Objects;
import com.github.jasterisk.model.Channel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * DTMF received on a channel.  This event is sent when the DTMF ends. There is no notification about the start of DTMF
 */
@ApiModel(description = "DTMF received on a channel.  This event is sent when the DTMF ends. There is no notification about the start of DTMF")

public class ChannelDtmfReceived {
  @SerializedName("digit")
  private String digit = null;

  @SerializedName("duration_ms")
  private Integer durationMs = null;

  @SerializedName("channel")
  private Channel channel = null;

  public ChannelDtmfReceived digit(String digit) {
    this.digit = digit;
    return this;
  }

   /**
   * DTMF digit received (0-9, A-E, # or *)
   * @return digit
  **/
  @ApiModelProperty(required = true, value = "DTMF digit received (0-9, A-E, # or *)")
  public String getDigit() {
    return digit;
  }

  public void setDigit(String digit) {
    this.digit = digit;
  }

  public ChannelDtmfReceived durationMs(Integer durationMs) {
    this.durationMs = durationMs;
    return this;
  }

   /**
   * Number of milliseconds DTMF was received
   * @return durationMs
  **/
  @ApiModelProperty(required = true, value = "Number of milliseconds DTMF was received")
  public Integer getDurationMs() {
    return durationMs;
  }

  public void setDurationMs(Integer durationMs) {
    this.durationMs = durationMs;
  }

  public ChannelDtmfReceived channel(Channel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel on which DTMF was received
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "The channel on which DTMF was received")
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDtmfReceived channelDtmfReceived = (ChannelDtmfReceived) o;
    return Objects.equals(this.digit, channelDtmfReceived.digit) &&
        Objects.equals(this.durationMs, channelDtmfReceived.durationMs) &&
        Objects.equals(this.channel, channelDtmfReceived.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(digit, durationMs, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDtmfReceived {\n");
    
    sb.append("    digit: ").append(toIndentedString(digit)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
