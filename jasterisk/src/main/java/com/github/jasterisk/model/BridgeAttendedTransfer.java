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
import com.github.jasterisk.model.Bridge;
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
 * Notification that an attended transfer has occurred.
 */
@ApiModel(description = "Notification that an attended transfer has occurred.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-07T21:43:27.583+02:00")
public class BridgeAttendedTransfer {
  @SerializedName("transferer_first_leg")
  private Channel transfererFirstLeg = null;

  @SerializedName("transferer_second_leg")
  private Channel transfererSecondLeg = null;

  @SerializedName("replace_channel")
  private Channel replaceChannel = null;

  @SerializedName("transferee")
  private Channel transferee = null;

  @SerializedName("transfer_target")
  private Channel transferTarget = null;

  @SerializedName("result")
  private String result = null;

  @SerializedName("is_external")
  private Boolean isExternal = null;

  @SerializedName("transferer_first_leg_bridge")
  private Bridge transfererFirstLegBridge = null;

  @SerializedName("transferer_second_leg_bridge")
  private Bridge transfererSecondLegBridge = null;

  @SerializedName("destination_type")
  private String destinationType = null;

  @SerializedName("destination_bridge")
  private String destinationBridge = null;

  @SerializedName("destination_application")
  private String destinationApplication = null;

  @SerializedName("destination_link_first_leg")
  private Channel destinationLinkFirstLeg = null;

  @SerializedName("destination_link_second_leg")
  private Channel destinationLinkSecondLeg = null;

  @SerializedName("destination_threeway_channel")
  private Channel destinationThreewayChannel = null;

  @SerializedName("destination_threeway_bridge")
  private Bridge destinationThreewayBridge = null;

  public BridgeAttendedTransfer transfererFirstLeg(Channel transfererFirstLeg) {
    this.transfererFirstLeg = transfererFirstLeg;
    return this;
  }

   /**
   * First leg of the transferer
   * @return transfererFirstLeg
  **/
  @ApiModelProperty(required = true, value = "First leg of the transferer")
  public Channel getTransfererFirstLeg() {
    return transfererFirstLeg;
  }

  public void setTransfererFirstLeg(Channel transfererFirstLeg) {
    this.transfererFirstLeg = transfererFirstLeg;
  }

  public BridgeAttendedTransfer transfererSecondLeg(Channel transfererSecondLeg) {
    this.transfererSecondLeg = transfererSecondLeg;
    return this;
  }

   /**
   * Second leg of the transferer
   * @return transfererSecondLeg
  **/
  @ApiModelProperty(required = true, value = "Second leg of the transferer")
  public Channel getTransfererSecondLeg() {
    return transfererSecondLeg;
  }

  public void setTransfererSecondLeg(Channel transfererSecondLeg) {
    this.transfererSecondLeg = transfererSecondLeg;
  }

  public BridgeAttendedTransfer replaceChannel(Channel replaceChannel) {
    this.replaceChannel = replaceChannel;
    return this;
  }

   /**
   * The channel that is replacing transferer_first_leg in the swap
   * @return replaceChannel
  **/
  @ApiModelProperty(value = "The channel that is replacing transferer_first_leg in the swap")
  public Channel getReplaceChannel() {
    return replaceChannel;
  }

  public void setReplaceChannel(Channel replaceChannel) {
    this.replaceChannel = replaceChannel;
  }

  public BridgeAttendedTransfer transferee(Channel transferee) {
    this.transferee = transferee;
    return this;
  }

   /**
   * The channel that is being transferred
   * @return transferee
  **/
  @ApiModelProperty(value = "The channel that is being transferred")
  public Channel getTransferee() {
    return transferee;
  }

  public void setTransferee(Channel transferee) {
    this.transferee = transferee;
  }

  public BridgeAttendedTransfer transferTarget(Channel transferTarget) {
    this.transferTarget = transferTarget;
    return this;
  }

   /**
   * The channel that is being transferred to
   * @return transferTarget
  **/
  @ApiModelProperty(value = "The channel that is being transferred to")
  public Channel getTransferTarget() {
    return transferTarget;
  }

  public void setTransferTarget(Channel transferTarget) {
    this.transferTarget = transferTarget;
  }

  public BridgeAttendedTransfer result(String result) {
    this.result = result;
    return this;
  }

   /**
   * The result of the transfer attempt
   * @return result
  **/
  @ApiModelProperty(required = true, value = "The result of the transfer attempt")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public BridgeAttendedTransfer isExternal(Boolean isExternal) {
    this.isExternal = isExternal;
    return this;
  }

   /**
   * Whether the transfer was externally initiated or not
   * @return isExternal
  **/
  @ApiModelProperty(required = true, value = "Whether the transfer was externally initiated or not")
  public Boolean isIsExternal() {
    return isExternal;
  }

  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }

  public BridgeAttendedTransfer transfererFirstLegBridge(Bridge transfererFirstLegBridge) {
    this.transfererFirstLegBridge = transfererFirstLegBridge;
    return this;
  }

   /**
   * Bridge the transferer first leg is in
   * @return transfererFirstLegBridge
  **/
  @ApiModelProperty(value = "Bridge the transferer first leg is in")
  public Bridge getTransfererFirstLegBridge() {
    return transfererFirstLegBridge;
  }

  public void setTransfererFirstLegBridge(Bridge transfererFirstLegBridge) {
    this.transfererFirstLegBridge = transfererFirstLegBridge;
  }

  public BridgeAttendedTransfer transfererSecondLegBridge(Bridge transfererSecondLegBridge) {
    this.transfererSecondLegBridge = transfererSecondLegBridge;
    return this;
  }

   /**
   * Bridge the transferer second leg is in
   * @return transfererSecondLegBridge
  **/
  @ApiModelProperty(value = "Bridge the transferer second leg is in")
  public Bridge getTransfererSecondLegBridge() {
    return transfererSecondLegBridge;
  }

  public void setTransfererSecondLegBridge(Bridge transfererSecondLegBridge) {
    this.transfererSecondLegBridge = transfererSecondLegBridge;
  }

  public BridgeAttendedTransfer destinationType(String destinationType) {
    this.destinationType = destinationType;
    return this;
  }

   /**
   * How the transfer was accomplished
   * @return destinationType
  **/
  @ApiModelProperty(required = true, value = "How the transfer was accomplished")
  public String getDestinationType() {
    return destinationType;
  }

  public void setDestinationType(String destinationType) {
    this.destinationType = destinationType;
  }

  public BridgeAttendedTransfer destinationBridge(String destinationBridge) {
    this.destinationBridge = destinationBridge;
    return this;
  }

   /**
   * Bridge that survived the merge result
   * @return destinationBridge
  **/
  @ApiModelProperty(value = "Bridge that survived the merge result")
  public String getDestinationBridge() {
    return destinationBridge;
  }

  public void setDestinationBridge(String destinationBridge) {
    this.destinationBridge = destinationBridge;
  }

  public BridgeAttendedTransfer destinationApplication(String destinationApplication) {
    this.destinationApplication = destinationApplication;
    return this;
  }

   /**
   * Application that has been transferred into
   * @return destinationApplication
  **/
  @ApiModelProperty(value = "Application that has been transferred into")
  public String getDestinationApplication() {
    return destinationApplication;
  }

  public void setDestinationApplication(String destinationApplication) {
    this.destinationApplication = destinationApplication;
  }

  public BridgeAttendedTransfer destinationLinkFirstLeg(Channel destinationLinkFirstLeg) {
    this.destinationLinkFirstLeg = destinationLinkFirstLeg;
    return this;
  }

   /**
   * First leg of a link transfer result
   * @return destinationLinkFirstLeg
  **/
  @ApiModelProperty(value = "First leg of a link transfer result")
  public Channel getDestinationLinkFirstLeg() {
    return destinationLinkFirstLeg;
  }

  public void setDestinationLinkFirstLeg(Channel destinationLinkFirstLeg) {
    this.destinationLinkFirstLeg = destinationLinkFirstLeg;
  }

  public BridgeAttendedTransfer destinationLinkSecondLeg(Channel destinationLinkSecondLeg) {
    this.destinationLinkSecondLeg = destinationLinkSecondLeg;
    return this;
  }

   /**
   * Second leg of a link transfer result
   * @return destinationLinkSecondLeg
  **/
  @ApiModelProperty(value = "Second leg of a link transfer result")
  public Channel getDestinationLinkSecondLeg() {
    return destinationLinkSecondLeg;
  }

  public void setDestinationLinkSecondLeg(Channel destinationLinkSecondLeg) {
    this.destinationLinkSecondLeg = destinationLinkSecondLeg;
  }

  public BridgeAttendedTransfer destinationThreewayChannel(Channel destinationThreewayChannel) {
    this.destinationThreewayChannel = destinationThreewayChannel;
    return this;
  }

   /**
   * Transferer channel that survived the threeway result
   * @return destinationThreewayChannel
  **/
  @ApiModelProperty(value = "Transferer channel that survived the threeway result")
  public Channel getDestinationThreewayChannel() {
    return destinationThreewayChannel;
  }

  public void setDestinationThreewayChannel(Channel destinationThreewayChannel) {
    this.destinationThreewayChannel = destinationThreewayChannel;
  }

  public BridgeAttendedTransfer destinationThreewayBridge(Bridge destinationThreewayBridge) {
    this.destinationThreewayBridge = destinationThreewayBridge;
    return this;
  }

   /**
   * Bridge that survived the threeway result
   * @return destinationThreewayBridge
  **/
  @ApiModelProperty(value = "Bridge that survived the threeway result")
  public Bridge getDestinationThreewayBridge() {
    return destinationThreewayBridge;
  }

  public void setDestinationThreewayBridge(Bridge destinationThreewayBridge) {
    this.destinationThreewayBridge = destinationThreewayBridge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BridgeAttendedTransfer bridgeAttendedTransfer = (BridgeAttendedTransfer) o;
    return Objects.equals(this.transfererFirstLeg, bridgeAttendedTransfer.transfererFirstLeg) &&
        Objects.equals(this.transfererSecondLeg, bridgeAttendedTransfer.transfererSecondLeg) &&
        Objects.equals(this.replaceChannel, bridgeAttendedTransfer.replaceChannel) &&
        Objects.equals(this.transferee, bridgeAttendedTransfer.transferee) &&
        Objects.equals(this.transferTarget, bridgeAttendedTransfer.transferTarget) &&
        Objects.equals(this.result, bridgeAttendedTransfer.result) &&
        Objects.equals(this.isExternal, bridgeAttendedTransfer.isExternal) &&
        Objects.equals(this.transfererFirstLegBridge, bridgeAttendedTransfer.transfererFirstLegBridge) &&
        Objects.equals(this.transfererSecondLegBridge, bridgeAttendedTransfer.transfererSecondLegBridge) &&
        Objects.equals(this.destinationType, bridgeAttendedTransfer.destinationType) &&
        Objects.equals(this.destinationBridge, bridgeAttendedTransfer.destinationBridge) &&
        Objects.equals(this.destinationApplication, bridgeAttendedTransfer.destinationApplication) &&
        Objects.equals(this.destinationLinkFirstLeg, bridgeAttendedTransfer.destinationLinkFirstLeg) &&
        Objects.equals(this.destinationLinkSecondLeg, bridgeAttendedTransfer.destinationLinkSecondLeg) &&
        Objects.equals(this.destinationThreewayChannel, bridgeAttendedTransfer.destinationThreewayChannel) &&
        Objects.equals(this.destinationThreewayBridge, bridgeAttendedTransfer.destinationThreewayBridge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transfererFirstLeg, transfererSecondLeg, replaceChannel, transferee, transferTarget, result, isExternal, transfererFirstLegBridge, transfererSecondLegBridge, destinationType, destinationBridge, destinationApplication, destinationLinkFirstLeg, destinationLinkSecondLeg, destinationThreewayChannel, destinationThreewayBridge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BridgeAttendedTransfer {\n");
    
    sb.append("    transfererFirstLeg: ").append(toIndentedString(transfererFirstLeg)).append("\n");
    sb.append("    transfererSecondLeg: ").append(toIndentedString(transfererSecondLeg)).append("\n");
    sb.append("    replaceChannel: ").append(toIndentedString(replaceChannel)).append("\n");
    sb.append("    transferee: ").append(toIndentedString(transferee)).append("\n");
    sb.append("    transferTarget: ").append(toIndentedString(transferTarget)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    isExternal: ").append(toIndentedString(isExternal)).append("\n");
    sb.append("    transfererFirstLegBridge: ").append(toIndentedString(transfererFirstLegBridge)).append("\n");
    sb.append("    transfererSecondLegBridge: ").append(toIndentedString(transfererSecondLegBridge)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    destinationBridge: ").append(toIndentedString(destinationBridge)).append("\n");
    sb.append("    destinationApplication: ").append(toIndentedString(destinationApplication)).append("\n");
    sb.append("    destinationLinkFirstLeg: ").append(toIndentedString(destinationLinkFirstLeg)).append("\n");
    sb.append("    destinationLinkSecondLeg: ").append(toIndentedString(destinationLinkSecondLeg)).append("\n");
    sb.append("    destinationThreewayChannel: ").append(toIndentedString(destinationThreewayChannel)).append("\n");
    sb.append("    destinationThreewayBridge: ").append(toIndentedString(destinationThreewayBridge)).append("\n");
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

