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
 * Object representing the playback of media to a channel
 */
@ApiModel(description = "Object representing the playback of media to a channel")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-07T21:43:27.583+02:00")
public class Playback {
  @SerializedName("id")
  private String id = null;

  @SerializedName("media_uri")
  private String mediaUri = null;

  @SerializedName("next_media_uri")
  private String nextMediaUri = null;

  @SerializedName("target_uri")
  private String targetUri = null;

  @SerializedName("language")
  private String language = null;

  @SerializedName("state")
  private String state = null;

  public Playback id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID for this playback operation
   * @return id
  **/
  @ApiModelProperty(required = true, value = "ID for this playback operation")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Playback mediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
    return this;
  }

   /**
   * The URI for the media currently being played back.
   * @return mediaUri
  **/
  @ApiModelProperty(required = true, value = "The URI for the media currently being played back.")
  public String getMediaUri() {
    return mediaUri;
  }

  public void setMediaUri(String mediaUri) {
    this.mediaUri = mediaUri;
  }

  public Playback nextMediaUri(String nextMediaUri) {
    this.nextMediaUri = nextMediaUri;
    return this;
  }

   /**
   * If a list of URIs is being played, the next media URI to be played back.
   * @return nextMediaUri
  **/
  @ApiModelProperty(value = "If a list of URIs is being played, the next media URI to be played back.")
  public String getNextMediaUri() {
    return nextMediaUri;
  }

  public void setNextMediaUri(String nextMediaUri) {
    this.nextMediaUri = nextMediaUri;
  }

  public Playback targetUri(String targetUri) {
    this.targetUri = targetUri;
    return this;
  }

   /**
   * URI for the channel or bridge to play the media on
   * @return targetUri
  **/
  @ApiModelProperty(required = true, value = "URI for the channel or bridge to play the media on")
  public String getTargetUri() {
    return targetUri;
  }

  public void setTargetUri(String targetUri) {
    this.targetUri = targetUri;
  }

  public Playback language(String language) {
    this.language = language;
    return this;
  }

   /**
   * For media types that support multiple languages, the language requested for playback.
   * @return language
  **/
  @ApiModelProperty(value = "For media types that support multiple languages, the language requested for playback.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Playback state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Current state of the playback operation.
   * @return state
  **/
  @ApiModelProperty(required = true, value = "Current state of the playback operation.")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Playback playback = (Playback) o;
    return Objects.equals(this.id, playback.id) &&
        Objects.equals(this.mediaUri, playback.mediaUri) &&
        Objects.equals(this.nextMediaUri, playback.nextMediaUri) &&
        Objects.equals(this.targetUri, playback.targetUri) &&
        Objects.equals(this.language, playback.language) &&
        Objects.equals(this.state, playback.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaUri, nextMediaUri, targetUri, language, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Playback {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaUri: ").append(toIndentedString(mediaUri)).append("\n");
    sb.append("    nextMediaUri: ").append(toIndentedString(nextMediaUri)).append("\n");
    sb.append("    targetUri: ").append(toIndentedString(targetUri)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

