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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A single order item.
 */
@ApiModel(description = "A single order item.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-14T00:23:32.684+03:00")
public class OrderItem {
  @SerializedName("ASIN")
  private String ASIN = null;

  @SerializedName("SellerSKU")
  private String sellerSKU = null;

  @SerializedName("OrderItemId")
  private String orderItemId = null;

  @SerializedName("Title")
  private String title = null;

  @SerializedName("QuantityOrdered")
  private Integer quantityOrdered = null;

  @SerializedName("QuantityShipped")
  private Integer quantityShipped = null;

  @SerializedName("ProductInfo")
  private ProductInfoDetail productInfo = null;

  @SerializedName("PointsGranted")
  private PointsGrantedDetail pointsGranted = null;

  @SerializedName("ItemPrice")
  private Money itemPrice = null;

  @SerializedName("ShippingPrice")
  private Money shippingPrice = null;

  @SerializedName("ItemTax")
  private Money itemTax = null;

  @SerializedName("ShippingTax")
  private Money shippingTax = null;

  @SerializedName("ShippingDiscount")
  private Money shippingDiscount = null;

  @SerializedName("ShippingDiscountTax")
  private Money shippingDiscountTax = null;

  @SerializedName("PromotionDiscount")
  private Money promotionDiscount = null;

  @SerializedName("PromotionDiscountTax")
  private Money promotionDiscountTax = null;

  @SerializedName("PromotionIds")
  private PromotionIdList promotionIds = null;

  @SerializedName("CODFee")
  private Money coDFee = null;

  @SerializedName("CODFeeDiscount")
  private Money coDFeeDiscount = null;

  @SerializedName("IsGift")
  private Boolean isGift = null;

  @SerializedName("ConditionNote")
  private String conditionNote = null;

  @SerializedName("ConditionId")
  private String conditionId = null;

  @SerializedName("ConditionSubtypeId")
  private String conditionSubtypeId = null;

  @SerializedName("ScheduledDeliveryStartDate")
  private String scheduledDeliveryStartDate = null;

  @SerializedName("ScheduledDeliveryEndDate")
  private String scheduledDeliveryEndDate = null;

  @SerializedName("PriceDesignation")
  private String priceDesignation = null;

  @SerializedName("TaxCollection")
  private TaxCollection taxCollection = null;

  @SerializedName("SerialNumberRequired")
  private Boolean serialNumberRequired = null;

  @SerializedName("IsTransparency")
  private Boolean isTransparency = null;

  @SerializedName("IossNumber")
  private String iossNumber = null;

  @SerializedName("StoreChainStoreId")
  private String storeChainStoreId = null;

  /**
   * The category of deemed reseller. This applies to selling partners that are not based in the EU and is used to help them meet the VAT Deemed Reseller tax laws in the EU and UK.
   */
  @JsonAdapter(DeemedResellerCategoryEnum.Adapter.class)
  public enum DeemedResellerCategoryEnum {
    IOSS("IOSS"),
    
    UOSS("UOSS");

    private String value;

    DeemedResellerCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DeemedResellerCategoryEnum fromValue(String text) {
      for (DeemedResellerCategoryEnum b : DeemedResellerCategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DeemedResellerCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DeemedResellerCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DeemedResellerCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DeemedResellerCategoryEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DeemedResellerCategory")
  private DeemedResellerCategoryEnum deemedResellerCategory = null;

  @SerializedName("BuyerInfo")
  private ItemBuyerInfo buyerInfo = null;

  @SerializedName("BuyerRequestedCancel")
  private BuyerRequestedCancel buyerRequestedCancel = null;

  @SerializedName("SerialNumbers")
  private List<String> serialNumbers = null;

  public OrderItem ASIN(String ASIN) {
    this.ASIN = ASIN;
    return this;
  }

   /**
   * The Amazon Standard Identification Number (ASIN) of the item.
   * @return ASIN
  **/
  @ApiModelProperty(required = true, value = "The Amazon Standard Identification Number (ASIN) of the item.")
  public String getASIN() {
    return ASIN;
  }

  public void setASIN(String ASIN) {
    this.ASIN = ASIN;
  }

  public OrderItem sellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
    return this;
  }

   /**
   * The seller stock keeping unit (SKU) of the item.
   * @return sellerSKU
  **/
  @ApiModelProperty(value = "The seller stock keeping unit (SKU) of the item.")
  public String getSellerSKU() {
    return sellerSKU;
  }

  public void setSellerSKU(String sellerSKU) {
    this.sellerSKU = sellerSKU;
  }

  public OrderItem orderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
    return this;
  }

   /**
   * An Amazon-defined order item identifier.
   * @return orderItemId
  **/
  @ApiModelProperty(required = true, value = "An Amazon-defined order item identifier.")
  public String getOrderItemId() {
    return orderItemId;
  }

  public void setOrderItemId(String orderItemId) {
    this.orderItemId = orderItemId;
  }

  public OrderItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The name of the item.
   * @return title
  **/
  @ApiModelProperty(value = "The name of the item.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public OrderItem quantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
    return this;
  }

   /**
   * The number of items in the order. 
   * @return quantityOrdered
  **/
  @ApiModelProperty(required = true, value = "The number of items in the order. ")
  public Integer getQuantityOrdered() {
    return quantityOrdered;
  }

  public void setQuantityOrdered(Integer quantityOrdered) {
    this.quantityOrdered = quantityOrdered;
  }

  public OrderItem quantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
    return this;
  }

   /**
   * The number of items shipped.
   * @return quantityShipped
  **/
  @ApiModelProperty(value = "The number of items shipped.")
  public Integer getQuantityShipped() {
    return quantityShipped;
  }

  public void setQuantityShipped(Integer quantityShipped) {
    this.quantityShipped = quantityShipped;
  }

  public OrderItem productInfo(ProductInfoDetail productInfo) {
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Product information for the item.
   * @return productInfo
  **/
  @ApiModelProperty(value = "Product information for the item.")
  public ProductInfoDetail getProductInfo() {
    return productInfo;
  }

  public void setProductInfo(ProductInfoDetail productInfo) {
    this.productInfo = productInfo;
  }

  public OrderItem pointsGranted(PointsGrantedDetail pointsGranted) {
    this.pointsGranted = pointsGranted;
    return this;
  }

   /**
   * The number and value of Amazon Points granted with the purchase of an item.
   * @return pointsGranted
  **/
  @ApiModelProperty(value = "The number and value of Amazon Points granted with the purchase of an item.")
  public PointsGrantedDetail getPointsGranted() {
    return pointsGranted;
  }

  public void setPointsGranted(PointsGrantedDetail pointsGranted) {
    this.pointsGranted = pointsGranted;
  }

  public OrderItem itemPrice(Money itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

   /**
   * The selling price of the order item. Note that an order item is an item and a quantity. This means that the value of ItemPrice is equal to the selling price of the item multiplied by the quantity ordered. Note that ItemPrice excludes ShippingPrice and GiftWrapPrice.
   * @return itemPrice
  **/
  @ApiModelProperty(value = "The selling price of the order item. Note that an order item is an item and a quantity. This means that the value of ItemPrice is equal to the selling price of the item multiplied by the quantity ordered. Note that ItemPrice excludes ShippingPrice and GiftWrapPrice.")
  public Money getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(Money itemPrice) {
    this.itemPrice = itemPrice;
  }

  public OrderItem shippingPrice(Money shippingPrice) {
    this.shippingPrice = shippingPrice;
    return this;
  }

   /**
   * The shipping price of the item.
   * @return shippingPrice
  **/
  @ApiModelProperty(value = "The shipping price of the item.")
  public Money getShippingPrice() {
    return shippingPrice;
  }

  public void setShippingPrice(Money shippingPrice) {
    this.shippingPrice = shippingPrice;
  }

  public OrderItem itemTax(Money itemTax) {
    this.itemTax = itemTax;
    return this;
  }

   /**
   * The tax on the item price.
   * @return itemTax
  **/
  @ApiModelProperty(value = "The tax on the item price.")
  public Money getItemTax() {
    return itemTax;
  }

  public void setItemTax(Money itemTax) {
    this.itemTax = itemTax;
  }

  public OrderItem shippingTax(Money shippingTax) {
    this.shippingTax = shippingTax;
    return this;
  }

   /**
   * The tax on the shipping price.
   * @return shippingTax
  **/
  @ApiModelProperty(value = "The tax on the shipping price.")
  public Money getShippingTax() {
    return shippingTax;
  }

  public void setShippingTax(Money shippingTax) {
    this.shippingTax = shippingTax;
  }

  public OrderItem shippingDiscount(Money shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
    return this;
  }

   /**
   * The discount on the shipping price.
   * @return shippingDiscount
  **/
  @ApiModelProperty(value = "The discount on the shipping price.")
  public Money getShippingDiscount() {
    return shippingDiscount;
  }

  public void setShippingDiscount(Money shippingDiscount) {
    this.shippingDiscount = shippingDiscount;
  }

  public OrderItem shippingDiscountTax(Money shippingDiscountTax) {
    this.shippingDiscountTax = shippingDiscountTax;
    return this;
  }

   /**
   * The tax on the discount on the shipping price.
   * @return shippingDiscountTax
  **/
  @ApiModelProperty(value = "The tax on the discount on the shipping price.")
  public Money getShippingDiscountTax() {
    return shippingDiscountTax;
  }

  public void setShippingDiscountTax(Money shippingDiscountTax) {
    this.shippingDiscountTax = shippingDiscountTax;
  }

  public OrderItem promotionDiscount(Money promotionDiscount) {
    this.promotionDiscount = promotionDiscount;
    return this;
  }

   /**
   * The total of all promotional discounts in the offer.
   * @return promotionDiscount
  **/
  @ApiModelProperty(value = "The total of all promotional discounts in the offer.")
  public Money getPromotionDiscount() {
    return promotionDiscount;
  }

  public void setPromotionDiscount(Money promotionDiscount) {
    this.promotionDiscount = promotionDiscount;
  }

  public OrderItem promotionDiscountTax(Money promotionDiscountTax) {
    this.promotionDiscountTax = promotionDiscountTax;
    return this;
  }

   /**
   * The tax on the total of all promotional discounts in the offer.
   * @return promotionDiscountTax
  **/
  @ApiModelProperty(value = "The tax on the total of all promotional discounts in the offer.")
  public Money getPromotionDiscountTax() {
    return promotionDiscountTax;
  }

  public void setPromotionDiscountTax(Money promotionDiscountTax) {
    this.promotionDiscountTax = promotionDiscountTax;
  }

  public OrderItem promotionIds(PromotionIdList promotionIds) {
    this.promotionIds = promotionIds;
    return this;
  }

   /**
   * Get promotionIds
   * @return promotionIds
  **/
  @ApiModelProperty(value = "")
  public PromotionIdList getPromotionIds() {
    return promotionIds;
  }

  public void setPromotionIds(PromotionIdList promotionIds) {
    this.promotionIds = promotionIds;
  }

  public OrderItem coDFee(Money coDFee) {
    this.coDFee = coDFee;
    return this;
  }

   /**
   * The fee charged for COD service.
   * @return coDFee
  **/
  @ApiModelProperty(value = "The fee charged for COD service.")
  public Money getCoDFee() {
    return coDFee;
  }

  public void setCoDFee(Money coDFee) {
    this.coDFee = coDFee;
  }

  public OrderItem coDFeeDiscount(Money coDFeeDiscount) {
    this.coDFeeDiscount = coDFeeDiscount;
    return this;
  }

   /**
   * The discount on the COD fee.
   * @return coDFeeDiscount
  **/
  @ApiModelProperty(value = "The discount on the COD fee.")
  public Money getCoDFeeDiscount() {
    return coDFeeDiscount;
  }

  public void setCoDFeeDiscount(Money coDFeeDiscount) {
    this.coDFeeDiscount = coDFeeDiscount;
  }

  public OrderItem isGift(Boolean isGift) {
    this.isGift = isGift;
    return this;
  }

   /**
   * When true, the item is a gift.
   * @return isGift
  **/
  @ApiModelProperty(value = "When true, the item is a gift.")
  public Boolean isIsGift() {
    return isGift;
  }

  public void setIsGift(Boolean isGift) {
    this.isGift = isGift;
  }

  public OrderItem conditionNote(String conditionNote) {
    this.conditionNote = conditionNote;
    return this;
  }

   /**
   * The condition of the item as described by the seller.
   * @return conditionNote
  **/
  @ApiModelProperty(value = "The condition of the item as described by the seller.")
  public String getConditionNote() {
    return conditionNote;
  }

  public void setConditionNote(String conditionNote) {
    this.conditionNote = conditionNote;
  }

  public OrderItem conditionId(String conditionId) {
    this.conditionId = conditionId;
    return this;
  }

   /**
   * The condition of the item.  Possible values: New, Used, Collectible, Refurbished, Preorder, Club.
   * @return conditionId
  **/
  @ApiModelProperty(value = "The condition of the item.  Possible values: New, Used, Collectible, Refurbished, Preorder, Club.")
  public String getConditionId() {
    return conditionId;
  }

  public void setConditionId(String conditionId) {
    this.conditionId = conditionId;
  }

  public OrderItem conditionSubtypeId(String conditionSubtypeId) {
    this.conditionSubtypeId = conditionSubtypeId;
    return this;
  }

   /**
   * The subcondition of the item.  Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, Any, Other.
   * @return conditionSubtypeId
  **/
  @ApiModelProperty(value = "The subcondition of the item.  Possible values: New, Mint, Very Good, Good, Acceptable, Poor, Club, OEM, Warranty, Refurbished Warranty, Refurbished, Open Box, Any, Other.")
  public String getConditionSubtypeId() {
    return conditionSubtypeId;
  }

  public void setConditionSubtypeId(String conditionSubtypeId) {
    this.conditionSubtypeId = conditionSubtypeId;
  }

  public OrderItem scheduledDeliveryStartDate(String scheduledDeliveryStartDate) {
    this.scheduledDeliveryStartDate = scheduledDeliveryStartDate;
    return this;
  }

   /**
   * The start date of the scheduled delivery window in the time zone of the order destination. In ISO 8601 date time format.
   * @return scheduledDeliveryStartDate
  **/
  @ApiModelProperty(value = "The start date of the scheduled delivery window in the time zone of the order destination. In ISO 8601 date time format.")
  public String getScheduledDeliveryStartDate() {
    return scheduledDeliveryStartDate;
  }

  public void setScheduledDeliveryStartDate(String scheduledDeliveryStartDate) {
    this.scheduledDeliveryStartDate = scheduledDeliveryStartDate;
  }

  public OrderItem scheduledDeliveryEndDate(String scheduledDeliveryEndDate) {
    this.scheduledDeliveryEndDate = scheduledDeliveryEndDate;
    return this;
  }

   /**
   * The end date of the scheduled delivery window in the time zone of the order destination. In ISO 8601 date time format.
   * @return scheduledDeliveryEndDate
  **/
  @ApiModelProperty(value = "The end date of the scheduled delivery window in the time zone of the order destination. In ISO 8601 date time format.")
  public String getScheduledDeliveryEndDate() {
    return scheduledDeliveryEndDate;
  }

  public void setScheduledDeliveryEndDate(String scheduledDeliveryEndDate) {
    this.scheduledDeliveryEndDate = scheduledDeliveryEndDate;
  }

  public OrderItem priceDesignation(String priceDesignation) {
    this.priceDesignation = priceDesignation;
    return this;
  }

   /**
   * Indicates that the selling price is a special price that is available only for Amazon Business orders. For more information about the Amazon Business Seller Program, see the [Amazon Business website](https://www.amazon.com/b2b/info/amazon-business).   Possible values: BusinessPrice - A special price that is available only for Amazon Business orders.
   * @return priceDesignation
  **/
  @ApiModelProperty(value = "Indicates that the selling price is a special price that is available only for Amazon Business orders. For more information about the Amazon Business Seller Program, see the [Amazon Business website](https://www.amazon.com/b2b/info/amazon-business).   Possible values: BusinessPrice - A special price that is available only for Amazon Business orders.")
  public String getPriceDesignation() {
    return priceDesignation;
  }

  public void setPriceDesignation(String priceDesignation) {
    this.priceDesignation = priceDesignation;
  }

  public OrderItem taxCollection(TaxCollection taxCollection) {
    this.taxCollection = taxCollection;
    return this;
  }

   /**
   * Information about withheld taxes.
   * @return taxCollection
  **/
  @ApiModelProperty(value = "Information about withheld taxes.")
  public TaxCollection getTaxCollection() {
    return taxCollection;
  }

  public void setTaxCollection(TaxCollection taxCollection) {
    this.taxCollection = taxCollection;
  }

  public OrderItem serialNumberRequired(Boolean serialNumberRequired) {
    this.serialNumberRequired = serialNumberRequired;
    return this;
  }

   /**
   * When true, the product type for this item has a serial number.  Returned only for Amazon Easy Ship orders.
   * @return serialNumberRequired
  **/
  @ApiModelProperty(value = "When true, the product type for this item has a serial number.  Returned only for Amazon Easy Ship orders.")
  public Boolean isSerialNumberRequired() {
    return serialNumberRequired;
  }

  public void setSerialNumberRequired(Boolean serialNumberRequired) {
    this.serialNumberRequired = serialNumberRequired;
  }

  public OrderItem isTransparency(Boolean isTransparency) {
    this.isTransparency = isTransparency;
    return this;
  }

   /**
   * When true, transparency codes are required.
   * @return isTransparency
  **/
  @ApiModelProperty(value = "When true, transparency codes are required.")
  public Boolean isIsTransparency() {
    return isTransparency;
  }

  public void setIsTransparency(Boolean isTransparency) {
    this.isTransparency = isTransparency;
  }

  public OrderItem iossNumber(String iossNumber) {
    this.iossNumber = iossNumber;
    return this;
  }

   /**
   * The IOSS number for the marketplace. Sellers shipping to the European Union (EU) from outside of the EU must provide this IOSS number to their carrier when Amazon has collected the VAT on the sale.
   * @return iossNumber
  **/
  @ApiModelProperty(value = "The IOSS number for the marketplace. Sellers shipping to the European Union (EU) from outside of the EU must provide this IOSS number to their carrier when Amazon has collected the VAT on the sale.")
  public String getIossNumber() {
    return iossNumber;
  }

  public void setIossNumber(String iossNumber) {
    this.iossNumber = iossNumber;
  }

  public OrderItem storeChainStoreId(String storeChainStoreId) {
    this.storeChainStoreId = storeChainStoreId;
    return this;
  }

   /**
   * The store chain store identifier. Linked to a specific store in a store chain.
   * @return storeChainStoreId
  **/
  @ApiModelProperty(value = "The store chain store identifier. Linked to a specific store in a store chain.")
  public String getStoreChainStoreId() {
    return storeChainStoreId;
  }

  public void setStoreChainStoreId(String storeChainStoreId) {
    this.storeChainStoreId = storeChainStoreId;
  }

  public OrderItem deemedResellerCategory(DeemedResellerCategoryEnum deemedResellerCategory) {
    this.deemedResellerCategory = deemedResellerCategory;
    return this;
  }

   /**
   * The category of deemed reseller. This applies to selling partners that are not based in the EU and is used to help them meet the VAT Deemed Reseller tax laws in the EU and UK.
   * @return deemedResellerCategory
  **/
  @ApiModelProperty(value = "The category of deemed reseller. This applies to selling partners that are not based in the EU and is used to help them meet the VAT Deemed Reseller tax laws in the EU and UK.")
  public DeemedResellerCategoryEnum getDeemedResellerCategory() {
    return deemedResellerCategory;
  }

  public void setDeemedResellerCategory(DeemedResellerCategoryEnum deemedResellerCategory) {
    this.deemedResellerCategory = deemedResellerCategory;
  }

  public OrderItem buyerInfo(ItemBuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
    return this;
  }

   /**
   * Get buyerInfo
   * @return buyerInfo
  **/
  @ApiModelProperty(value = "")
  public ItemBuyerInfo getBuyerInfo() {
    return buyerInfo;
  }

  public void setBuyerInfo(ItemBuyerInfo buyerInfo) {
    this.buyerInfo = buyerInfo;
  }

  public OrderItem buyerRequestedCancel(BuyerRequestedCancel buyerRequestedCancel) {
    this.buyerRequestedCancel = buyerRequestedCancel;
    return this;
  }

   /**
   * Information about whether or not a buyer requested cancellation.
   * @return buyerRequestedCancel
  **/
  @ApiModelProperty(value = "Information about whether or not a buyer requested cancellation.")
  public BuyerRequestedCancel getBuyerRequestedCancel() {
    return buyerRequestedCancel;
  }

  public void setBuyerRequestedCancel(BuyerRequestedCancel buyerRequestedCancel) {
    this.buyerRequestedCancel = buyerRequestedCancel;
  }

  public OrderItem serialNumbers(List<String> serialNumbers) {
    this.serialNumbers = serialNumbers;
    return this;
  }

  public OrderItem addSerialNumbersItem(String serialNumbersItem) {
    if (this.serialNumbers == null) {
      this.serialNumbers = new ArrayList<String>();
    }
    this.serialNumbers.add(serialNumbersItem);
    return this;
  }

   /**
   * A list of serial numbers for electronic products that are shipped to customers. Returned for FBA orders only.
   * @return serialNumbers
  **/
  @ApiModelProperty(value = "A list of serial numbers for electronic products that are shipped to customers. Returned for FBA orders only.")
  public List<String> getSerialNumbers() {
    return serialNumbers;
  }

  public void setSerialNumbers(List<String> serialNumbers) {
    this.serialNumbers = serialNumbers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.ASIN, orderItem.ASIN) &&
        Objects.equals(this.sellerSKU, orderItem.sellerSKU) &&
        Objects.equals(this.orderItemId, orderItem.orderItemId) &&
        Objects.equals(this.title, orderItem.title) &&
        Objects.equals(this.quantityOrdered, orderItem.quantityOrdered) &&
        Objects.equals(this.quantityShipped, orderItem.quantityShipped) &&
        Objects.equals(this.productInfo, orderItem.productInfo) &&
        Objects.equals(this.pointsGranted, orderItem.pointsGranted) &&
        Objects.equals(this.itemPrice, orderItem.itemPrice) &&
        Objects.equals(this.shippingPrice, orderItem.shippingPrice) &&
        Objects.equals(this.itemTax, orderItem.itemTax) &&
        Objects.equals(this.shippingTax, orderItem.shippingTax) &&
        Objects.equals(this.shippingDiscount, orderItem.shippingDiscount) &&
        Objects.equals(this.shippingDiscountTax, orderItem.shippingDiscountTax) &&
        Objects.equals(this.promotionDiscount, orderItem.promotionDiscount) &&
        Objects.equals(this.promotionDiscountTax, orderItem.promotionDiscountTax) &&
        Objects.equals(this.promotionIds, orderItem.promotionIds) &&
        Objects.equals(this.coDFee, orderItem.coDFee) &&
        Objects.equals(this.coDFeeDiscount, orderItem.coDFeeDiscount) &&
        Objects.equals(this.isGift, orderItem.isGift) &&
        Objects.equals(this.conditionNote, orderItem.conditionNote) &&
        Objects.equals(this.conditionId, orderItem.conditionId) &&
        Objects.equals(this.conditionSubtypeId, orderItem.conditionSubtypeId) &&
        Objects.equals(this.scheduledDeliveryStartDate, orderItem.scheduledDeliveryStartDate) &&
        Objects.equals(this.scheduledDeliveryEndDate, orderItem.scheduledDeliveryEndDate) &&
        Objects.equals(this.priceDesignation, orderItem.priceDesignation) &&
        Objects.equals(this.taxCollection, orderItem.taxCollection) &&
        Objects.equals(this.serialNumberRequired, orderItem.serialNumberRequired) &&
        Objects.equals(this.isTransparency, orderItem.isTransparency) &&
        Objects.equals(this.iossNumber, orderItem.iossNumber) &&
        Objects.equals(this.storeChainStoreId, orderItem.storeChainStoreId) &&
        Objects.equals(this.deemedResellerCategory, orderItem.deemedResellerCategory) &&
        Objects.equals(this.buyerInfo, orderItem.buyerInfo) &&
        Objects.equals(this.buyerRequestedCancel, orderItem.buyerRequestedCancel) &&
        Objects.equals(this.serialNumbers, orderItem.serialNumbers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASIN, sellerSKU, orderItemId, title, quantityOrdered, quantityShipped, productInfo, pointsGranted, itemPrice, shippingPrice, itemTax, shippingTax, shippingDiscount, shippingDiscountTax, promotionDiscount, promotionDiscountTax, promotionIds, coDFee, coDFeeDiscount, isGift, conditionNote, conditionId, conditionSubtypeId, scheduledDeliveryStartDate, scheduledDeliveryEndDate, priceDesignation, taxCollection, serialNumberRequired, isTransparency, iossNumber, storeChainStoreId, deemedResellerCategory, buyerInfo, buyerRequestedCancel, serialNumbers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    ASIN: ").append(toIndentedString(ASIN)).append("\n");
    sb.append("    sellerSKU: ").append(toIndentedString(sellerSKU)).append("\n");
    sb.append("    orderItemId: ").append(toIndentedString(orderItemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    quantityOrdered: ").append(toIndentedString(quantityOrdered)).append("\n");
    sb.append("    quantityShipped: ").append(toIndentedString(quantityShipped)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    pointsGranted: ").append(toIndentedString(pointsGranted)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    shippingPrice: ").append(toIndentedString(shippingPrice)).append("\n");
    sb.append("    itemTax: ").append(toIndentedString(itemTax)).append("\n");
    sb.append("    shippingTax: ").append(toIndentedString(shippingTax)).append("\n");
    sb.append("    shippingDiscount: ").append(toIndentedString(shippingDiscount)).append("\n");
    sb.append("    shippingDiscountTax: ").append(toIndentedString(shippingDiscountTax)).append("\n");
    sb.append("    promotionDiscount: ").append(toIndentedString(promotionDiscount)).append("\n");
    sb.append("    promotionDiscountTax: ").append(toIndentedString(promotionDiscountTax)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
    sb.append("    coDFee: ").append(toIndentedString(coDFee)).append("\n");
    sb.append("    coDFeeDiscount: ").append(toIndentedString(coDFeeDiscount)).append("\n");
    sb.append("    isGift: ").append(toIndentedString(isGift)).append("\n");
    sb.append("    conditionNote: ").append(toIndentedString(conditionNote)).append("\n");
    sb.append("    conditionId: ").append(toIndentedString(conditionId)).append("\n");
    sb.append("    conditionSubtypeId: ").append(toIndentedString(conditionSubtypeId)).append("\n");
    sb.append("    scheduledDeliveryStartDate: ").append(toIndentedString(scheduledDeliveryStartDate)).append("\n");
    sb.append("    scheduledDeliveryEndDate: ").append(toIndentedString(scheduledDeliveryEndDate)).append("\n");
    sb.append("    priceDesignation: ").append(toIndentedString(priceDesignation)).append("\n");
    sb.append("    taxCollection: ").append(toIndentedString(taxCollection)).append("\n");
    sb.append("    serialNumberRequired: ").append(toIndentedString(serialNumberRequired)).append("\n");
    sb.append("    isTransparency: ").append(toIndentedString(isTransparency)).append("\n");
    sb.append("    iossNumber: ").append(toIndentedString(iossNumber)).append("\n");
    sb.append("    storeChainStoreId: ").append(toIndentedString(storeChainStoreId)).append("\n");
    sb.append("    deemedResellerCategory: ").append(toIndentedString(deemedResellerCategory)).append("\n");
    sb.append("    buyerInfo: ").append(toIndentedString(buyerInfo)).append("\n");
    sb.append("    buyerRequestedCancel: ").append(toIndentedString(buyerRequestedCancel)).append("\n");
    sb.append("    serialNumbers: ").append(toIndentedString(serialNumbers)).append("\n");
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

