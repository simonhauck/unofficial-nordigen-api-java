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
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Status6e6Enum;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Create requisition.
 */
@ApiModel(description = "Create requisition.")
@JsonPropertyOrder({
  SpectacularRequisitionV2.JSON_PROPERTY_ID,
  SpectacularRequisitionV2.JSON_PROPERTY_CREATED,
  SpectacularRequisitionV2.JSON_PROPERTY_REDIRECT,
  SpectacularRequisitionV2.JSON_PROPERTY_STATUS,
  SpectacularRequisitionV2.JSON_PROPERTY_INSTITUTION_ID,
  SpectacularRequisitionV2.JSON_PROPERTY_AGREEMENT,
  SpectacularRequisitionV2.JSON_PROPERTY_REFERENCE,
  SpectacularRequisitionV2.JSON_PROPERTY_ACCOUNTS,
  SpectacularRequisitionV2.JSON_PROPERTY_USER_LANGUAGE,
  SpectacularRequisitionV2.JSON_PROPERTY_LINK
})
@JsonTypeName("SpectacularRequisitionV2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-26T16:56:39.273839Z[Etc/UTC]")
public class SpectacularRequisitionV2 {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_REDIRECT = "redirect";
  private URI redirect;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status6e6Enum status;

  public static final String JSON_PROPERTY_INSTITUTION_ID = "institution_id";
  private String institutionId;

  public static final String JSON_PROPERTY_AGREEMENT = "agreement";
  private UUID agreement;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<Object> accounts = new ArrayList<Object>();

  public static final String JSON_PROPERTY_USER_LANGUAGE = "user_language";
  private String userLanguage;

  public static final String JSON_PROPERTY_LINK = "link";
  private URI link = URI.create("https://ob.nordigen.com/psd2/start/3fa85f64-5717-4562-b3fc-2c963f66afa6/some_institution_id");


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




  public SpectacularRequisitionV2 redirect(URI redirect) {
    
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

  public Status6e6Enum getStatus() {
    return status;
  }




  public SpectacularRequisitionV2 institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * an Institution ID for this Requisition
   * @return institutionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "an Institution ID for this Requisition")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstitutionId() {
    return institutionId;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public SpectacularRequisitionV2 agreement(UUID agreement) {
    
    this.agreement = agreement;
    return this;
  }

   /**
   * EUA associated with this requisition
   * @return agreement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EUA associated with this requisition")
  @JsonProperty(JSON_PROPERTY_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getAgreement() {
    return agreement;
  }


  @JsonProperty(JSON_PROPERTY_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgreement(UUID agreement) {
    this.agreement = agreement;
  }


  public SpectacularRequisitionV2 reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * additional ID to identify the end user
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "additional ID to identify the end user")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


   /**
   * array of account IDs retrieved within a scope of this requisition
   * @return accounts
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "array of account IDs retrieved within a scope of this requisition")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getAccounts() {
    return accounts;
  }




  public SpectacularRequisitionV2 userLanguage(String userLanguage) {
    
    this.userLanguage = userLanguage;
    return this;
  }

   /**
   * A two-letter country code (ISO 639-1)
   * @return userLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A two-letter country code (ISO 639-1)")
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


   /**
   * link to initiate authorization with Institution
   * @return link
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "link to initiate authorization with Institution")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public URI getLink() {
    return link;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpectacularRequisitionV2 spectacularRequisitionV2 = (SpectacularRequisitionV2) o;
    return Objects.equals(this.id, spectacularRequisitionV2.id) &&
        Objects.equals(this.created, spectacularRequisitionV2.created) &&
        Objects.equals(this.redirect, spectacularRequisitionV2.redirect) &&
        Objects.equals(this.status, spectacularRequisitionV2.status) &&
        Objects.equals(this.institutionId, spectacularRequisitionV2.institutionId) &&
        Objects.equals(this.agreement, spectacularRequisitionV2.agreement) &&
        Objects.equals(this.reference, spectacularRequisitionV2.reference) &&
        Objects.equals(this.accounts, spectacularRequisitionV2.accounts) &&
        Objects.equals(this.userLanguage, spectacularRequisitionV2.userLanguage) &&
        Objects.equals(this.link, spectacularRequisitionV2.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, redirect, status, institutionId, agreement, reference, accounts, userLanguage, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpectacularRequisitionV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    userLanguage: ").append(toIndentedString(userLanguage)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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

