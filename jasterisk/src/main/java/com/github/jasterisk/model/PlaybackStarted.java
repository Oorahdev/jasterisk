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
import com.github.jasterisk.model.Playback;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Event showing the start of a media playback operation.
 */
@ApiModel(description = "Event showing the start of a media playback operation.")

public class PlaybackStarted {
  @SerializedName("playback")
  private Playback playback = null;

  public PlaybackStarted playback(Playback playback) {
    this.playback = playback;
    return this;
  }

   /**
   * Playback control object
   * @return playback
  **/
  @ApiModelProperty(required = true, value = "Playback control object")
  public Playback getPlayback() {
    return playback;
  }

  public void setPlayback(Playback playback) {
    this.playback = playback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaybackStarted playbackStarted = (PlaybackStarted) o;
    return Objects.equals(this.playback, playbackStarted.playback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(playback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlaybackStarted {\n");
    
    sb.append("    playback: ").append(toIndentedString(playback)).append("\n");
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

