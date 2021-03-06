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
 * Channel variable changed.
 */
@ApiModel(description = "Channel variable changed.")

public class ChannelVarset {
  @SerializedName("variable")
  private String variable = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("channel")
  private Channel channel = null;

  public ChannelVarset variable(String variable) {
    this.variable = variable;
    return this;
  }

   /**
   * The variable that changed.
   * @return variable
  **/
  @ApiModelProperty(required = true, value = "The variable that changed.")
  public String getVariable() {
    return variable;
  }

  public void setVariable(String variable) {
    this.variable = variable;
  }

  public ChannelVarset value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The new value of the variable.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The new value of the variable.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ChannelVarset channel(Channel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * The channel on which the variable was set.  If missing, the variable is a global variable.
   * @return channel
  **/
  @ApiModelProperty(value = "The channel on which the variable was set.  If missing, the variable is a global variable.")
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
    ChannelVarset channelVarset = (ChannelVarset) o;
    return Objects.equals(this.variable, channelVarset.variable) &&
        Objects.equals(this.value, channelVarset.value) &&
        Objects.equals(this.channel, channelVarset.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variable, value, channel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelVarset {\n");
    
    sb.append("    variable: ").append(toIndentedString(variable)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

