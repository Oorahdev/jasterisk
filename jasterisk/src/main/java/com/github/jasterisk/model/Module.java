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
 * Details of an Asterisk module
 */
@ApiModel(description = "Details of an Asterisk module")

public class Module {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("use_count")
  private Integer useCount = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("support_level")
  private String supportLevel = null;

  public Module name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this module
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this module")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Module description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of this module
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of this module")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Module useCount(Integer useCount) {
    this.useCount = useCount;
    return this;
  }

   /**
   * The number of times this module is being used
   * @return useCount
  **/
  @ApiModelProperty(required = true, value = "The number of times this module is being used")
  public Integer getUseCount() {
    return useCount;
  }

  public void setUseCount(Integer useCount) {
    this.useCount = useCount;
  }

  public Module status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The running status of this module
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The running status of this module")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Module supportLevel(String supportLevel) {
    this.supportLevel = supportLevel;
    return this;
  }

   /**
   * The support state of this module
   * @return supportLevel
  **/
  @ApiModelProperty(required = true, value = "The support state of this module")
  public String getSupportLevel() {
    return supportLevel;
  }

  public void setSupportLevel(String supportLevel) {
    this.supportLevel = supportLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Module module = (Module) o;
    return Objects.equals(this.name, module.name) &&
        Objects.equals(this.description, module.description) &&
        Objects.equals(this.useCount, module.useCount) &&
        Objects.equals(this.status, module.status) &&
        Objects.equals(this.supportLevel, module.supportLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, useCount, status, supportLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Module {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    useCount: ").append(toIndentedString(useCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    supportLevel: ").append(toIndentedString(supportLevel)).append("\n");
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

