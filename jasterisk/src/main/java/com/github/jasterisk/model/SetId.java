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
 * Effective user/group id
 */
@ApiModel(description = "Effective user/group id")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-07T21:43:27.583+02:00")
public class SetId {
  @SerializedName("user")
  private String user = null;

  @SerializedName("group")
  private String group = null;

  public SetId user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Effective user id.
   * @return user
  **/
  @ApiModelProperty(required = true, value = "Effective user id.")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public SetId group(String group) {
    this.group = group;
    return this;
  }

   /**
   * Effective group id.
   * @return group
  **/
  @ApiModelProperty(required = true, value = "Effective group id.")
  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetId setId = (SetId) o;
    return Objects.equals(this.user, setId.user) &&
        Objects.equals(this.group, setId.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, group);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetId {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

