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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Base type for errors and events
 */
@ApiModel(description = "Base type for errors and events")

public class Message {
  @SerializedName("type")
  private String type = null;

  @SerializedName("asterisk_id")
  private String asteriskId = null;

  public Message type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the type of this message.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Indicates the type of this message.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Message asteriskId(String asteriskId) {
    this.asteriskId = asteriskId;
    return this;
  }

   /**
   * The unique ID for the Asterisk instance that raised this event.
   * @return asteriskId
  **/
  @ApiModelProperty(value = "The unique ID for the Asterisk instance that raised this event.")
  public String getAsteriskId() {
    return asteriskId;
  }

  public void setAsteriskId(String asteriskId) {
    this.asteriskId = asteriskId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.type, message.type) &&
        Objects.equals(this.asteriskId, message.asteriskId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, asteriskId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    asteriskId: ").append(toIndentedString(asteriskId)).append("\n");
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

