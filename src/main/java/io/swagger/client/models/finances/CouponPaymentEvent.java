/*
 * Selling Partner API for Finances
 * The Selling Partner API for Finances helps you obtain financial information relevant to a seller's business. You can obtain financial events for a given order, financial event group, or date range without having to wait until a statement period closes. You can also obtain financial event groups for a given date range.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.models.finances;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.models.finances.ChargeComponent;
import io.swagger.client.models.finances.Currency;
import io.swagger.client.models.finances.FeeComponent;
import java.io.IOException;

/**
 * An event related to coupon payments.
 */
@ApiModel(description = "An event related to coupon payments.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T22:25:31.339+03:00")
public class CouponPaymentEvent {
  @SerializedName("PostedDate")
  private String postedDate = null;

  @SerializedName("CouponId")
  private String couponId = null;

  @SerializedName("SellerCouponDescription")
  private String sellerCouponDescription = null;

  @SerializedName("ClipOrRedemptionCount")
  private Long clipOrRedemptionCount = null;

  @SerializedName("PaymentEventId")
  private String paymentEventId = null;

  @SerializedName("FeeComponent")
  private FeeComponent feeComponent = null;

  @SerializedName("ChargeComponent")
  private ChargeComponent chargeComponent = null;

  @SerializedName("TotalAmount")
  private Currency totalAmount = null;

  public CouponPaymentEvent postedDate(String postedDate) {
    this.postedDate = postedDate;
    return this;
  }

   /**
   * The date and time when the financial event was posted.
   * @return postedDate
  **/
  @ApiModelProperty(value = "The date and time when the financial event was posted.")
  public String getPostedDate() {
    return postedDate;
  }

  public void setPostedDate(String postedDate) {
    this.postedDate = postedDate;
  }

  public CouponPaymentEvent couponId(String couponId) {
    this.couponId = couponId;
    return this;
  }

   /**
   * A coupon identifier.
   * @return couponId
  **/
  @ApiModelProperty(value = "A coupon identifier.")
  public String getCouponId() {
    return couponId;
  }

  public void setCouponId(String couponId) {
    this.couponId = couponId;
  }

  public CouponPaymentEvent sellerCouponDescription(String sellerCouponDescription) {
    this.sellerCouponDescription = sellerCouponDescription;
    return this;
  }

   /**
   * The description provided by the seller when they created the coupon.
   * @return sellerCouponDescription
  **/
  @ApiModelProperty(value = "The description provided by the seller when they created the coupon.")
  public String getSellerCouponDescription() {
    return sellerCouponDescription;
  }

  public void setSellerCouponDescription(String sellerCouponDescription) {
    this.sellerCouponDescription = sellerCouponDescription;
  }

  public CouponPaymentEvent clipOrRedemptionCount(Long clipOrRedemptionCount) {
    this.clipOrRedemptionCount = clipOrRedemptionCount;
    return this;
  }

   /**
   * The number of coupon clips or redemptions.
   * @return clipOrRedemptionCount
  **/
  @ApiModelProperty(value = "The number of coupon clips or redemptions.")
  public Long getClipOrRedemptionCount() {
    return clipOrRedemptionCount;
  }

  public void setClipOrRedemptionCount(Long clipOrRedemptionCount) {
    this.clipOrRedemptionCount = clipOrRedemptionCount;
  }

  public CouponPaymentEvent paymentEventId(String paymentEventId) {
    this.paymentEventId = paymentEventId;
    return this;
  }

   /**
   * A payment event identifier.
   * @return paymentEventId
  **/
  @ApiModelProperty(value = "A payment event identifier.")
  public String getPaymentEventId() {
    return paymentEventId;
  }

  public void setPaymentEventId(String paymentEventId) {
    this.paymentEventId = paymentEventId;
  }

  public CouponPaymentEvent feeComponent(FeeComponent feeComponent) {
    this.feeComponent = feeComponent;
    return this;
  }

   /**
   * Get feeComponent
   * @return feeComponent
  **/
  @ApiModelProperty(value = "")
  public FeeComponent getFeeComponent() {
    return feeComponent;
  }

  public void setFeeComponent(FeeComponent feeComponent) {
    this.feeComponent = feeComponent;
  }

  public CouponPaymentEvent chargeComponent(ChargeComponent chargeComponent) {
    this.chargeComponent = chargeComponent;
    return this;
  }

   /**
   * Get chargeComponent
   * @return chargeComponent
  **/
  @ApiModelProperty(value = "")
  public ChargeComponent getChargeComponent() {
    return chargeComponent;
  }

  public void setChargeComponent(ChargeComponent chargeComponent) {
    this.chargeComponent = chargeComponent;
  }

  public CouponPaymentEvent totalAmount(Currency totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * The FeeComponent value plus the ChargeComponent value.
   * @return totalAmount
  **/
  @ApiModelProperty(value = "The FeeComponent value plus the ChargeComponent value.")
  public Currency getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Currency totalAmount) {
    this.totalAmount = totalAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CouponPaymentEvent couponPaymentEvent = (CouponPaymentEvent) o;
    return Objects.equals(this.postedDate, couponPaymentEvent.postedDate) &&
        Objects.equals(this.couponId, couponPaymentEvent.couponId) &&
        Objects.equals(this.sellerCouponDescription, couponPaymentEvent.sellerCouponDescription) &&
        Objects.equals(this.clipOrRedemptionCount, couponPaymentEvent.clipOrRedemptionCount) &&
        Objects.equals(this.paymentEventId, couponPaymentEvent.paymentEventId) &&
        Objects.equals(this.feeComponent, couponPaymentEvent.feeComponent) &&
        Objects.equals(this.chargeComponent, couponPaymentEvent.chargeComponent) &&
        Objects.equals(this.totalAmount, couponPaymentEvent.totalAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postedDate, couponId, sellerCouponDescription, clipOrRedemptionCount, paymentEventId, feeComponent, chargeComponent, totalAmount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CouponPaymentEvent {\n");
    
    sb.append("    postedDate: ").append(toIndentedString(postedDate)).append("\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    sellerCouponDescription: ").append(toIndentedString(sellerCouponDescription)).append("\n");
    sb.append("    clipOrRedemptionCount: ").append(toIndentedString(clipOrRedemptionCount)).append("\n");
    sb.append("    paymentEventId: ").append(toIndentedString(paymentEventId)).append("\n");
    sb.append("    feeComponent: ").append(toIndentedString(feeComponent)).append("\n");
    sb.append("    chargeComponent: ").append(toIndentedString(chargeComponent)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
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
