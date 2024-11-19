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
import io.swagger.client.models.finances.FinancialEvents;
import java.io.IOException;

/**
 * The payload for the listFinancialEvents operation.
 */
@ApiModel(description = "The payload for the listFinancialEvents operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-04-17T22:25:31.339+03:00")
public class ListFinancialEventsPayload {
  @SerializedName("NextToken")
  private String nextToken = null;

  @SerializedName("FinancialEvents")
  private FinancialEvents financialEvents = null;

  public ListFinancialEventsPayload nextToken(String nextToken) {
    this.nextToken = nextToken;
    return this;
  }

   /**
   * When present and not empty, pass this string token in the next request to return the next response page.
   * @return nextToken
  **/
  @ApiModelProperty(value = "When present and not empty, pass this string token in the next request to return the next response page.")
  public String getNextToken() {
    return nextToken;
  }

  public void setNextToken(String nextToken) {
    this.nextToken = nextToken;
  }

  public ListFinancialEventsPayload financialEvents(FinancialEvents financialEvents) {
    this.financialEvents = financialEvents;
    return this;
  }

   /**
   * Get financialEvents
   * @return financialEvents
  **/
  @ApiModelProperty(value = "")
  public FinancialEvents getFinancialEvents() {
    return financialEvents;
  }

  public void setFinancialEvents(FinancialEvents financialEvents) {
    this.financialEvents = financialEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListFinancialEventsPayload listFinancialEventsPayload = (ListFinancialEventsPayload) o;
    return Objects.equals(this.nextToken, listFinancialEventsPayload.nextToken) &&
        Objects.equals(this.financialEvents, listFinancialEventsPayload.financialEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextToken, financialEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListFinancialEventsPayload {\n");
    
    sb.append("    nextToken: ").append(toIndentedString(nextToken)).append("\n");
    sb.append("    financialEvents: ").append(toIndentedString(financialEvents)).append("\n");
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

