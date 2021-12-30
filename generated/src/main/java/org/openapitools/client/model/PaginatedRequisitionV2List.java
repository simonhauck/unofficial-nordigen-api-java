/*
 * Nordigen Account Information Services API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0 (v2)
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.RequisitionV2;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PaginatedRequisitionV2List
 */
@JsonPropertyOrder({
  PaginatedRequisitionV2List.JSON_PROPERTY_COUNT,
  PaginatedRequisitionV2List.JSON_PROPERTY_NEXT,
  PaginatedRequisitionV2List.JSON_PROPERTY_PREVIOUS,
  PaginatedRequisitionV2List.JSON_PROPERTY_RESULTS
})
@JsonTypeName("PaginatedRequisitionV2List")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-30T15:39:18.485873Z[Etc/UTC]")
public class PaginatedRequisitionV2List {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_NEXT = "next";
  private JsonNullable<String> next = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_PREVIOUS = "previous";
  private JsonNullable<String> previous = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<RequisitionV2> results = null;

  public PaginatedRequisitionV2List() { 
  }

  public PaginatedRequisitionV2List count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123", value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public PaginatedRequisitionV2List next(String next) {
    this.next = JsonNullable.<String>of(next);
    
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://ob.nordigen.com/api/v2/requisitions/?limit=100&offset=0", value = "")
  @JsonIgnore

  public String getNext() {
        return next.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNext_JsonNullable() {
    return next;
  }
  
  @JsonProperty(JSON_PROPERTY_NEXT)
  public void setNext_JsonNullable(JsonNullable<String> next) {
    this.next = next;
  }

  public void setNext(String next) {
    this.next = JsonNullable.<String>of(next);
  }


  public PaginatedRequisitionV2List previous(String previous) {
    this.previous = JsonNullable.<String>of(previous);
    
    return this;
  }

   /**
   * Get previous
   * @return previous
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://ob.nordigen.com/api/v2/requisitions/?limit=100&offset=0", value = "")
  @JsonIgnore

  public String getPrevious() {
        return previous.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getPrevious_JsonNullable() {
    return previous;
  }
  
  @JsonProperty(JSON_PROPERTY_PREVIOUS)
  public void setPrevious_JsonNullable(JsonNullable<String> previous) {
    this.previous = previous;
  }

  public void setPrevious(String previous) {
    this.previous = JsonNullable.<String>of(previous);
  }


  public PaginatedRequisitionV2List results(List<RequisitionV2> results) {
    
    this.results = results;
    return this;
  }

  public PaginatedRequisitionV2List addResultsItem(RequisitionV2 resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<RequisitionV2>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RequisitionV2> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<RequisitionV2> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedRequisitionV2List paginatedRequisitionV2List = (PaginatedRequisitionV2List) o;
    return Objects.equals(this.count, paginatedRequisitionV2List.count) &&
        equalsNullable(this.next, paginatedRequisitionV2List.next) &&
        equalsNullable(this.previous, paginatedRequisitionV2List.previous) &&
        Objects.equals(this.results, paginatedRequisitionV2List.results);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, hashCodeNullable(next), hashCodeNullable(previous), results);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedRequisitionV2List {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    previous: ").append(toIndentedString(previous)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

