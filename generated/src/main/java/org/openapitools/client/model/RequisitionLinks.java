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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RequisitionLinksSerializer.
 */
@ApiModel(description = "RequisitionLinksSerializer.")
@JsonPropertyOrder({
  RequisitionLinks.JSON_PROPERTY_INITIATE
})
@JsonTypeName("RequisitionLinks")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T21:29:23.050133Z[Etc/UTC]")
public class RequisitionLinks {
  public static final String JSON_PROPERTY_INITIATE = "initiate";
  private String initiate;


   /**
   * Get initiate
   * @return initiate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INITIATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInitiate() {
    return initiate;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequisitionLinks requisitionLinks = (RequisitionLinks) o;
    return Objects.equals(this.initiate, requisitionLinks.initiate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequisitionLinks {\n");
    sb.append("    initiate: ").append(toIndentedString(initiate)).append("\n");
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

