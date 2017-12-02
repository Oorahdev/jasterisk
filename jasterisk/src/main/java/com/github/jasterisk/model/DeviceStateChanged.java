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
import com.github.jasterisk.model.DeviceState;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Notification that a device state has changed.
 */
@ApiModel(description = "Notification that a device state has changed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-02T16:24:17.590+02:00")
public class DeviceStateChanged {
  @SerializedName("device_state")
  private DeviceState deviceState = null;

  public DeviceStateChanged deviceState(DeviceState deviceState) {
    this.deviceState = deviceState;
    return this;
  }

   /**
   * Device state object
   * @return deviceState
  **/
  @ApiModelProperty(required = true, value = "Device state object")
  public DeviceState getDeviceState() {
    return deviceState;
  }

  public void setDeviceState(DeviceState deviceState) {
    this.deviceState = deviceState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceStateChanged deviceStateChanged = (DeviceStateChanged) o;
    return Objects.equals(this.deviceState, deviceStateChanged.deviceState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceState);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceStateChanged {\n");
    
    sb.append("    deviceState: ").append(toIndentedString(deviceState)).append("\n");
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
