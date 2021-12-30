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
 * Obtain JWT pair.
 */
@ApiModel(description = "Obtain JWT pair.")
@JsonPropertyOrder({
  JWTObtainPair.JSON_PROPERTY_SECRET_ID,
  JWTObtainPair.JSON_PROPERTY_SECRET_KEY
})
@JsonTypeName("JWTObtainPair")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-30T16:02:29.348425Z[Etc/UTC]")
public class JWTObtainPair {
  public static final String JSON_PROPERTY_SECRET_ID = "secret_id";
  private String secretId;

  public static final String JSON_PROPERTY_SECRET_KEY = "secret_key";
  private String secretKey;

  public JWTObtainPair() { 
  }

  public JWTObtainPair secretId(String secretId) {
    
    this.secretId = secretId;
    return this;
  }

   /**
   * Secret id from /user-secrets/
   * @return secretId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Secret id from /user-secrets/")
  @JsonProperty(JSON_PROPERTY_SECRET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecretId() {
    return secretId;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecretId(String secretId) {
    this.secretId = secretId;
  }


  public JWTObtainPair secretKey(String secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * Secret key from /user-secrets/
   * @return secretKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Secret key from /user-secrets/")
  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecretKey() {
    return secretKey;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JWTObtainPair jwTObtainPair = (JWTObtainPair) o;
    return Objects.equals(this.secretId, jwTObtainPair.secretId) &&
        Objects.equals(this.secretKey, jwTObtainPair.secretKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secretId, secretKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JWTObtainPair {\n");
    sb.append("    secretId: ").append(toIndentedString(secretId)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
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

