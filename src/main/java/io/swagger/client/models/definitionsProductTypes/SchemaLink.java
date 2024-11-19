/*
 * Selling Partner API for Product Type Definitions
 * The Selling Partner API for Product Type Definitions provides programmatic access to attribute and data requirements for product types in the Amazon catalog. Use this API to return the JSON Schema for a product type that you can then use with other Selling Partner APIs, such as the Selling Partner API for Listings Items, the Selling Partner API for Catalog Items, and the Selling Partner API for Feeds (for JSON-based listing feeds).  For more information, see the [Product Type Definitions API Use Case Guide](doc:product-type-api-use-case-guide).
 *
 * OpenAPI spec version: 2020-09-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.models.definitionsProductTypes;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.models.definitionsProductTypes.SchemaLinkLink;
import java.io.IOException;

/**
 * SchemaLink
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-17T11:50:46.305+03:00")
public class SchemaLink {
  @SerializedName("link")
  private SchemaLinkLink link = null;

  @SerializedName("checksum")
  private String checksum = null;

  public SchemaLink link(SchemaLinkLink link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @ApiModelProperty(required = true, value = "")
  public SchemaLinkLink getLink() {
    return link;
  }

  public void setLink(SchemaLinkLink link) {
    this.link = link;
  }

  public SchemaLink checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

   /**
   * Checksum hash of the schema (Base64 MD5). Can be used to verify schema contents, identify changes between schema versions, and for caching.
   * @return checksum
  **/
  @ApiModelProperty(required = true, value = "Checksum hash of the schema (Base64 MD5). Can be used to verify schema contents, identify changes between schema versions, and for caching.")
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemaLink schemaLink = (SchemaLink) o;
    return Objects.equals(this.link, schemaLink.link) &&
        Objects.equals(this.checksum, schemaLink.checksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(link, checksum);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemaLink {\n");
    
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
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

