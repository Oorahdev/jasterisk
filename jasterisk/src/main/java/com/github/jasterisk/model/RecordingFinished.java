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
import com.github.jasterisk.model.LiveRecording;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Event showing the completion of a recording operation.
 */
@ApiModel(description = "Event showing the completion of a recording operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-07T21:43:27.583+02:00")
public class RecordingFinished {
  @SerializedName("recording")
  private LiveRecording recording = null;

  public RecordingFinished recording(LiveRecording recording) {
    this.recording = recording;
    return this;
  }

   /**
   * Recording control object
   * @return recording
  **/
  @ApiModelProperty(required = true, value = "Recording control object")
  public LiveRecording getRecording() {
    return recording;
  }

  public void setRecording(LiveRecording recording) {
    this.recording = recording;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingFinished recordingFinished = (RecordingFinished) o;
    return Objects.equals(this.recording, recordingFinished.recording);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recording);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingFinished {\n");
    
    sb.append("    recording: ").append(toIndentedString(recording)).append("\n");
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

