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
import com.github.jasterisk.model.BuildInfo;
import com.github.jasterisk.model.ConfigInfo;
import com.github.jasterisk.model.StatusInfo;
import com.github.jasterisk.model.SystemInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Asterisk system information
 */
@ApiModel(description = "Asterisk system information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-07T21:43:27.583+02:00")
public class AsteriskInfo {
  @SerializedName("build")
  private BuildInfo build = null;

  @SerializedName("system")
  private SystemInfo system = null;

  @SerializedName("config")
  private ConfigInfo config = null;

  @SerializedName("status")
  private StatusInfo status = null;

  public AsteriskInfo build(BuildInfo build) {
    this.build = build;
    return this;
  }

   /**
   * Info about how Asterisk was built
   * @return build
  **/
  @ApiModelProperty(value = "Info about how Asterisk was built")
  public BuildInfo getBuild() {
    return build;
  }

  public void setBuild(BuildInfo build) {
    this.build = build;
  }

  public AsteriskInfo system(SystemInfo system) {
    this.system = system;
    return this;
  }

   /**
   * Info about the system running Asterisk
   * @return system
  **/
  @ApiModelProperty(value = "Info about the system running Asterisk")
  public SystemInfo getSystem() {
    return system;
  }

  public void setSystem(SystemInfo system) {
    this.system = system;
  }

  public AsteriskInfo config(ConfigInfo config) {
    this.config = config;
    return this;
  }

   /**
   * Info about Asterisk configuration
   * @return config
  **/
  @ApiModelProperty(value = "Info about Asterisk configuration")
  public ConfigInfo getConfig() {
    return config;
  }

  public void setConfig(ConfigInfo config) {
    this.config = config;
  }

  public AsteriskInfo status(StatusInfo status) {
    this.status = status;
    return this;
  }

   /**
   * Info about Asterisk status
   * @return status
  **/
  @ApiModelProperty(value = "Info about Asterisk status")
  public StatusInfo getStatus() {
    return status;
  }

  public void setStatus(StatusInfo status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsteriskInfo asteriskInfo = (AsteriskInfo) o;
    return Objects.equals(this.build, asteriskInfo.build) &&
        Objects.equals(this.system, asteriskInfo.system) &&
        Objects.equals(this.config, asteriskInfo.config) &&
        Objects.equals(this.status, asteriskInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(build, system, config, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsteriskInfo {\n");
    
    sb.append("    build: ").append(toIndentedString(build)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

