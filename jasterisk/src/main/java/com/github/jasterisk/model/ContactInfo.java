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
 * Detailed information about a contact on an endpoint.
 */
@ApiModel(description = "Detailed information about a contact on an endpoint.")

public class ContactInfo {
  @SerializedName("uri")
  private String uri = null;

  @SerializedName("contact_status")
  private String contactStatus = null;

  @SerializedName("aor")
  private String aor = null;

  @SerializedName("roundtrip_usec")
  private String roundtripUsec = null;

  public ContactInfo uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The location of the contact.
   * @return uri
  **/
  @ApiModelProperty(required = true, value = "The location of the contact.")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public ContactInfo contactStatus(String contactStatus) {
    this.contactStatus = contactStatus;
    return this;
  }

   /**
   * The current status of the contact.
   * @return contactStatus
  **/
  @ApiModelProperty(required = true, value = "The current status of the contact.")
  public String getContactStatus() {
    return contactStatus;
  }

  public void setContactStatus(String contactStatus) {
    this.contactStatus = contactStatus;
  }

  public ContactInfo aor(String aor) {
    this.aor = aor;
    return this;
  }

   /**
   * The Address of Record this contact belongs to.
   * @return aor
  **/
  @ApiModelProperty(required = true, value = "The Address of Record this contact belongs to.")
  public String getAor() {
    return aor;
  }

  public void setAor(String aor) {
    this.aor = aor;
  }

  public ContactInfo roundtripUsec(String roundtripUsec) {
    this.roundtripUsec = roundtripUsec;
    return this;
  }

   /**
   * Current round trip time, in microseconds, for the contact.
   * @return roundtripUsec
  **/
  @ApiModelProperty(value = "Current round trip time, in microseconds, for the contact.")
  public String getRoundtripUsec() {
    return roundtripUsec;
  }

  public void setRoundtripUsec(String roundtripUsec) {
    this.roundtripUsec = roundtripUsec;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactInfo contactInfo = (ContactInfo) o;
    return Objects.equals(this.uri, contactInfo.uri) &&
        Objects.equals(this.contactStatus, contactInfo.contactStatus) &&
        Objects.equals(this.aor, contactInfo.aor) &&
        Objects.equals(this.roundtripUsec, contactInfo.roundtripUsec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(uri, contactStatus, aor, roundtripUsec);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactInfo {\n");
    
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    contactStatus: ").append(toIndentedString(contactStatus)).append("\n");
    sb.append("    aor: ").append(toIndentedString(aor)).append("\n");
    sb.append("    roundtripUsec: ").append(toIndentedString(roundtripUsec)).append("\n");
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

