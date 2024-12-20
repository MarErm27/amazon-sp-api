/*
 * Selling Partner API for Orders
 * The Selling Partner API for Orders helps you programmatically retrieve order information. These APIs let you develop fast, flexible, custom applications in areas like order synchronization, order research, and demand-based decision support tools. The Orders API only supports orders that are less than two years old. Orders more than two years old will not show in the API response.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.models.orders;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.models.reports.ErrorList;

/**
 * The response schema for the getOrderBuyerInfo operation.
 */
@ApiModel(description = "The response schema for the getOrderBuyerInfo operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-14T00:23:32.684+03:00")
public class GetOrderBuyerInfoResponse {
  @SerializedName("payload")
  private OrderBuyerInfo payload = null;

  @SerializedName("errors")
  private ErrorList errors = null;

  public GetOrderBuyerInfoResponse payload(OrderBuyerInfo payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload for the getOrderBuyerInfo operation.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload for the getOrderBuyerInfo operation.")
  public OrderBuyerInfo getPayload() {
    return payload;
  }

  public void setPayload(OrderBuyerInfo payload) {
    this.payload = payload;
  }

  public GetOrderBuyerInfoResponse errors(ErrorList errors) {
    this.errors = errors;
    return this;
  }

   /**
   * One or more unexpected errors occurred during the getOrderBuyerInfo operation.
   * @return errors
  **/
  @ApiModelProperty(value = "One or more unexpected errors occurred during the getOrderBuyerInfo operation.")
  public ErrorList getErrors() {
    return errors;
  }

  public void setErrors(ErrorList errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrderBuyerInfoResponse getOrderBuyerInfoResponse = (GetOrderBuyerInfoResponse) o;
    return Objects.equals(this.payload, getOrderBuyerInfoResponse.payload) &&
        Objects.equals(this.errors, getOrderBuyerInfoResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderBuyerInfoResponse {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

