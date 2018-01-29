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
 * Channel changed Caller ID.
 */
@ApiModel(description = "Channel changed Caller ID.")

public class ChannelCallerId {
  @SerializedName("caller_presentation")
  private Integer callerPresentation = null;

  @SerializedName("caller_presentation_txt")
  private String callerPresentationTxt = null;

  @SerializedName("channel")
  private Channel channel = null;

  public ChannelCallerId callerPresentation(Integer callerPresentation) {
    this.callerPresentation = callerPresentation;
    return this;
  }

   /**
   * The integer representation of the Caller Presentation value.
   * @return callerPresentation
  **/
  @ApiModelProperty(required = true, value = "The integer representation of the Caller Presentation value.")
  public Integer getCallerPresentation() {
    return callerPresentation;
  }

  public void setCallerPresentation(Integer callerPresentation) {
    this.callerPresentation = callerPresentation;
  }

  public ChannelCallerId callerPresentationTxt(String callerPresentationTxt) {
    this.callerPresentationTxt = callerPresentationTxt;
    return this;
  }

   /**
   * The text representation of the Caller Presentation value.
   * @return callerPresentationTxt
  **/
  @ApiModelProperty(required = true, value = "The text representation of the Caller Presentation value.")
  public String getCallerPresentationTxt() {
    return callerPresentationTxt;
  }

  public void setCallerPresentationTxt(String callerPresentationTxt) {
    this.callerPresentationTxt = callerPresentationTxt;
  }

  public ChannelCallerId channel(Channel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel that changed Caller ID.
   * @return channel
  **/
  @ApiModelProperty(required = true, value = "The channel that changed Caller ID.")
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
    ChannelCallerId channelCallerId = (ChannelCallerId) o;
    return Objects.equals(this.callerPresentation, channelCallerId.callerPresentation) &&
        Objects.equals(this.callerPresentationTxt, channelCallerId.callerPresentationTxt) &&
        Objects.equals(this.channel, channelCallerId.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callerPresentation, callerPresentationTxt, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelCallerId {\n");
    
    sb.append("    callerPresentation: ").append(toIndentedString(callerPresentation)).append("\n");
    sb.append("    callerPresentationTxt: ").append(toIndentedString(callerPresentationTxt)).append("\n");
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

