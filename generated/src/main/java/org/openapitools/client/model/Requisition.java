/*
 * Nordigen Account Information Services API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.7
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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.RequisitionStatusEnum;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RequisitionSerializer.
 */
@ApiModel(description = "RequisitionSerializer.")
@JsonPropertyOrder({
  Requisition.JSON_PROPERTY_ID,
  Requisition.JSON_PROPERTY_CREATED,
  Requisition.JSON_PROPERTY_REDIRECT,
  Requisition.JSON_PROPERTY_STATUS,
  Requisition.JSON_PROPERTY_AGREEMENTS,
  Requisition.JSON_PROPERTY_ACCOUNTS,
  Requisition.JSON_PROPERTY_REFERENCE,
  Requisition.JSON_PROPERTY_ENDUSER_ID,
  Requisition.JSON_PROPERTY_USER_LANGUAGE
})
@JsonTypeName("Requisition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-18T16:39:14.085122Z[Etc/UTC]")
public class Requisition {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_REDIRECT = "redirect";
  private URI redirect;

  public static final String JSON_PROPERTY_STATUS = "status";
  private RequisitionStatusEnum status;

  public static final String JSON_PROPERTY_AGREEMENTS = "agreements";
  private List<UUID> agreements = null;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<UUID> accounts = new ArrayList<UUID>();

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_ENDUSER_ID = "enduser_id";
  private String enduserId;

  public static final String JSON_PROPERTY_USER_LANGUAGE = "user_language";
  private String userLanguage;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }




   /**
   * The date &amp; time at which the requisition was created.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date & time at which the requisition was created.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreated() {
    return created;
  }




  public Requisition redirect(URI redirect) {
    
    this.redirect = redirect;
    return this;
  }

   /**
   * redirect URL to your application after end-user authorization with ASPSP
   * @return redirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "redirect URL to your application after end-user authorization with ASPSP")
  @JsonProperty(JSON_PROPERTY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getRedirect() {
    return redirect;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedirect(URI redirect) {
    this.redirect = redirect;
  }


   /**
   * status of this requisition
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "status of this requisition")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RequisitionStatusEnum getStatus() {
    return status;
  }




  public Requisition agreements(List<UUID> agreements) {
    
    this.agreements = agreements;
    return this;
  }

  public Requisition addAgreementsItem(UUID agreementsItem) {
    if (this.agreements == null) {
      this.agreements = new ArrayList<UUID>();
    }
    this.agreements.add(agreementsItem);
    return this;
  }

   /**
   * array of EUAs associated with this requisition
   * @return agreements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "array of EUAs associated with this requisition")
  @JsonProperty(JSON_PROPERTY_AGREEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAgreements() {
    return agreements;
  }


  @JsonProperty(JSON_PROPERTY_AGREEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgreements(List<UUID> agreements) {
    this.agreements = agreements;
  }


   /**
   * array of account IDs retrieved within a scope of this requisition
   * @return accounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "array of account IDs retrieved within a scope of this requisition")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<UUID> getAccounts() {
    return accounts;
  }




  public Requisition reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * additional ID to identify the end user
   * @return reference
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "additional ID to identify the end user")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReference(String reference) {
    this.reference = reference;
  }


  public Requisition enduserId(String enduserId) {
    
    this.enduserId = enduserId;
    return this;
  }

   /**
   * end-user id in client&#39;s system, usually a UUID
   * @return enduserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "end-user id in client's system, usually a UUID")
  @JsonProperty(JSON_PROPERTY_ENDUSER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnduserId() {
    return enduserId;
  }


  @JsonProperty(JSON_PROPERTY_ENDUSER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnduserId(String enduserId) {
    this.enduserId = enduserId;
  }


  public Requisition userLanguage(String userLanguage) {
    
    this.userLanguage = userLanguage;
    return this;
  }

   /**
   * user language for the views
   * @return userLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "user language for the views")
  @JsonProperty(JSON_PROPERTY_USER_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserLanguage() {
    return userLanguage;
  }


  @JsonProperty(JSON_PROPERTY_USER_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserLanguage(String userLanguage) {
    this.userLanguage = userLanguage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Requisition requisition = (Requisition) o;
    return Objects.equals(this.id, requisition.id) &&
        Objects.equals(this.created, requisition.created) &&
        Objects.equals(this.redirect, requisition.redirect) &&
        Objects.equals(this.status, requisition.status) &&
        Objects.equals(this.agreements, requisition.agreements) &&
        Objects.equals(this.accounts, requisition.accounts) &&
        Objects.equals(this.reference, requisition.reference) &&
        Objects.equals(this.enduserId, requisition.enduserId) &&
        Objects.equals(this.userLanguage, requisition.userLanguage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, redirect, status, agreements, accounts, reference, enduserId, userLanguage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Requisition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    agreements: ").append(toIndentedString(agreements)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    enduserId: ").append(toIndentedString(enduserId)).append("\n");
    sb.append("    userLanguage: ").append(toIndentedString(userLanguage)).append("\n");
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

