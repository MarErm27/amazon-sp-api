/*
 * Selling Partner API for Catalog Items
 * The Selling Partner API for Catalog Items provides programmatic access to information about items in the Amazon catalog.  For more information, refer to the [Catalog Items API Use Case Guide](doc:catalog-items-api-v2022-04-01-use-case-guide).
 *
 * OpenAPI spec version: 2022-04-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.models.catalogItems;

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

/**
 * Description of a classification that can be used to get more fine-grained search results.
 */
@ApiModel(description = "Description of a classification that can be used to get more fine-grained search results.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-03-13T21:22:56.933+03:00")
public class ClassificationRefinement {
  @SerializedName("numberOfResults")
  private Integer numberOfResults = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("classificationId")
  private String classificationId = null;

  public ClassificationRefinement numberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
    return this;
  }

   /**
   * The estimated number of results that would still be returned if refinement key applied.
   * @return numberOfResults
  **/
  @ApiModelProperty(required = true, value = "The estimated number of results that would still be returned if refinement key applied.")
  public Integer getNumberOfResults() {
    return numberOfResults;
  }

  public void setNumberOfResults(Integer numberOfResults) {
    this.numberOfResults = numberOfResults;
  }

  public ClassificationRefinement displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name for the classification.
   * @return displayName
  **/
  @ApiModelProperty(required = true, value = "Display name for the classification.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ClassificationRefinement classificationId(String classificationId) {
    this.classificationId = classificationId;
    return this;
  }

   /**
   * Identifier for the classification that can be used for search refinement purposes.
   * @return classificationId
  **/
  @ApiModelProperty(required = true, value = "Identifier for the classification that can be used for search refinement purposes.")
  public String getClassificationId() {
    return classificationId;
  }

  public void setClassificationId(String classificationId) {
    this.classificationId = classificationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationRefinement classificationRefinement = (ClassificationRefinement) o;
    return Objects.equals(this.numberOfResults, classificationRefinement.numberOfResults) &&
        Objects.equals(this.displayName, classificationRefinement.displayName) &&
        Objects.equals(this.classificationId, classificationRefinement.classificationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfResults, displayName, classificationId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationRefinement {\n");
    
    sb.append("    numberOfResults: ").append(toIndentedString(numberOfResults)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    classificationId: ").append(toIndentedString(classificationId)).append("\n");
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

