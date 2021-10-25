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
 * Obtain new JWT pair.
 */
@ApiModel(description = "Obtain new JWT pair.")
@JsonPropertyOrder({
  SpectacularJWTObtain.JSON_PROPERTY_PASSWORD,
  SpectacularJWTObtain.JSON_PROPERTY_ACCESS,
  SpectacularJWTObtain.JSON_PROPERTY_ACCESS_EXPIRES,
  SpectacularJWTObtain.JSON_PROPERTY_REFRESH,
  SpectacularJWTObtain.JSON_PROPERTY_REFRESH_EXPIRES
})
@JsonTypeName("SpectacularJWTObtain")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T19:27:09.503691Z[Etc/UTC]")
public class SpectacularJWTObtain {
  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_ACCESS = "access";
  private String access;

  public static final String JSON_PROPERTY_ACCESS_EXPIRES = "access_expires";
  private Integer accessExpires = 86400;

  public static final String JSON_PROPERTY_REFRESH = "refresh";
  private String refresh;

  public static final String JSON_PROPERTY_REFRESH_EXPIRES = "refresh_expires";
  private Integer refreshExpires = 2592000;


  public SpectacularJWTObtain password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


   /**
   * Your access token
   * @return access
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Your access token")
  @JsonProperty(JSON_PROPERTY_ACCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccess() {
    return access;
  }




   /**
   * Access token expires in seconds
   * @return accessExpires
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Access token expires in seconds")
  @JsonProperty(JSON_PROPERTY_ACCESS_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAccessExpires() {
    return accessExpires;
  }




   /**
   * Your refresh token
   * @return refresh
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Your refresh token")
  @JsonProperty(JSON_PROPERTY_REFRESH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRefresh() {
    return refresh;
  }




   /**
   * Refresh token expires in seconds
   * @return refreshExpires
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Refresh token expires in seconds")
  @JsonProperty(JSON_PROPERTY_REFRESH_EXPIRES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getRefreshExpires() {
    return refreshExpires;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpectacularJWTObtain spectacularJWTObtain = (SpectacularJWTObtain) o;
    return Objects.equals(this.password, spectacularJWTObtain.password) &&
        Objects.equals(this.access, spectacularJWTObtain.access) &&
        Objects.equals(this.accessExpires, spectacularJWTObtain.accessExpires) &&
        Objects.equals(this.refresh, spectacularJWTObtain.refresh) &&
        Objects.equals(this.refreshExpires, spectacularJWTObtain.refreshExpires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, access, accessExpires, refresh, refreshExpires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpectacularJWTObtain {\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    accessExpires: ").append(toIndentedString(accessExpires)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
    sb.append("    refreshExpires: ").append(toIndentedString(refreshExpires)).append("\n");
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

