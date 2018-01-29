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
import java.util.ArrayList;
import java.util.List;

/**
 * An external device that may offer/accept calls to/from Asterisk.  Unlike most resources, which have a single unique identifier, an endpoint is uniquely identified by the technology/resource pair.
 */
@ApiModel(description = "An external device that may offer/accept calls to/from Asterisk.  Unlike most resources, which have a single unique identifier, an endpoint is uniquely identified by the technology/resource pair.")

public class Endpoint {
  @SerializedName("technology")
  private String technology = null;

  @SerializedName("resource")
  private String resource = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("channel_ids")
  private List<String> channelIds = new ArrayList<>();

  public Endpoint technology(String technology) {
    this.technology = technology;
    return this;
  }

   /**
   * Technology of the endpoint
   * @return technology
  **/
  @ApiModelProperty(required = true, value = "Technology of the endpoint")
  public String getTechnology() {
    return technology;
  }

  public void setTechnology(String technology) {
    this.technology = technology;
  }

  public Endpoint resource(String resource) {
    this.resource = resource;
    return this;
  }

   /**
   * Identifier of the endpoint, specific to the given technology.
   * @return resource
  **/
  @ApiModelProperty(required = true, value = "Identifier of the endpoint, specific to the given technology.")
  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }

  public Endpoint state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Endpoint&#39;s state
   * @return state
  **/
  @ApiModelProperty(value = "Endpoint's state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Endpoint channelIds(List<String> channelIds) {
    this.channelIds = channelIds;
    return this;
  }

  public Endpoint addChannelIdsItem(String channelIdsItem) {
    this.channelIds.add(channelIdsItem);
    return this;
  }

   /**
   * Id&#39;s of channels associated with this endpoint
   * @return channelIds
  **/
  @ApiModelProperty(required = true, value = "Id's of channels associated with this endpoint")
  public List<String> getChannelIds() {
    return channelIds;
  }

  public void setChannelIds(List<String> channelIds) {
    this.channelIds = channelIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Endpoint endpoint = (Endpoint) o;
    return Objects.equals(this.technology, endpoint.technology) &&
        Objects.equals(this.resource, endpoint.resource) &&
        Objects.equals(this.state, endpoint.state) &&
        Objects.equals(this.channelIds, endpoint.channelIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technology, resource, state, channelIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Endpoint {\n");
    
    sb.append("    technology: ").append(toIndentedString(technology)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    channelIds: ").append(toIndentedString(channelIds)).append("\n");
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

