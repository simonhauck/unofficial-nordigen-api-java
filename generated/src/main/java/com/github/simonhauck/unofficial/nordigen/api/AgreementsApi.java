package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.HttpResponse;

import org.openapitools.client.model.EndUserAgreement;
import org.openapitools.client.model.EnduserAcceptanceDetails;
import org.openapitools.client.model.PaginatedEndUserAgreementList;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-18T17:11:55.968860Z[Etc/UTC]")
public interface AgreementsApi extends ApiClient.Api {


  /**
   * 
   * Accept an end-user agreement via the API.
   * @param id A UUID string identifying this end user agreement. (required)
   * @param enduserAcceptanceDetails  (required)
   * @return EndUserAgreement
   */
  @RequestLine("PUT /api/agreements/enduser/{id}/accept/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EndUserAgreement acceptEUA(@Param("id") UUID id, EnduserAcceptanceDetails enduserAcceptanceDetails);

  /**
   * 
   * Similar to <code>acceptEUA</code> but it also returns the http response headers .
   * Accept an end-user agreement via the API.
   * @param id A UUID string identifying this end user agreement. (required)
   * @param enduserAcceptanceDetails  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/agreements/enduser/{id}/accept/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HttpResponse<EndUserAgreement> acceptEUAWithHttpInfo(@Param("id") UUID id, EnduserAcceptanceDetails enduserAcceptanceDetails);



  /**
   * 
   * API endpoints related to end-user agreements.
   * @param endUserAgreement  (required)
   * @return EndUserAgreement
   */
  @RequestLine("POST /api/agreements/enduser/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EndUserAgreement createEUA(EndUserAgreement endUserAgreement);

  /**
   * 
   * Similar to <code>createEUA</code> but it also returns the http response headers .
   * API endpoints related to end-user agreements.
   * @param endUserAgreement  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/agreements/enduser/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HttpResponse<EndUserAgreement> createEUAWithHttpInfo(EndUserAgreement endUserAgreement);



  /**
   * 
   * Delete End User Agreement.
   * @param id A UUID string identifying this end user agreement. (required)
   */
  @RequestLine("DELETE /api/agreements/enduser/{id}/")
  @Headers({
    "Accept: application/json",
  })
  void deleteEUAById(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>deleteEUAById</code> but it also returns the http response headers .
   * Delete End User Agreement.
   * @param id A UUID string identifying this end user agreement. (required)
   */
  @RequestLine("DELETE /api/agreements/enduser/{id}/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<Void> deleteEUAByIdWithHttpInfo(@Param("id") UUID id);



  /**
   * 
   * API endpoints related to end-user agreements.
   * @param enduserId Your enduser ID, used for filtering results. (required)
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @return PaginatedEndUserAgreementList
   */
  @RequestLine("GET /api/agreements/enduser/?enduser_id={enduserId}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  PaginatedEndUserAgreementList retrieveAllEUAsForAnEndUser(@Param("enduserId") String enduserId, @Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * 
   * Similar to <code>retrieveAllEUAsForAnEndUser</code> but it also returns the http response headers .
   * API endpoints related to end-user agreements.
   * @param enduserId Your enduser ID, used for filtering results. (required)
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/agreements/enduser/?enduser_id={enduserId}&limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<PaginatedEndUserAgreementList> retrieveAllEUAsForAnEndUserWithHttpInfo(@Param("enduserId") String enduserId, @Param("limit") Integer limit, @Param("offset") Integer offset);


  /**
   * 
   * API endpoints related to end-user agreements.
   * Note, this is equivalent to the other <code>retrieveAllEUAsForAnEndUser</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAllEUAsForAnEndUserQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>enduserId - Your enduser ID, used for filtering results. (required)</li>
   *   <li>limit - Number of results to return per page. (optional)</li>
   *   <li>offset - The initial index from which to return the results. (optional)</li>
   *   </ul>
   * @return PaginatedEndUserAgreementList
   */
  @RequestLine("GET /api/agreements/enduser/?enduser_id={enduserId}&limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  PaginatedEndUserAgreementList retrieveAllEUAsForAnEndUser(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * 
  * API endpoints related to end-user agreements.
  * Note, this is equivalent to the other <code>retrieveAllEUAsForAnEndUser</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>enduserId - Your enduser ID, used for filtering results. (required)</li>
          *   <li>limit - Number of results to return per page. (optional)</li>
          *   <li>offset - The initial index from which to return the results. (optional)</li>
      *   </ul>
          * @return PaginatedEndUserAgreementList
      */
      @RequestLine("GET /api/agreements/enduser/?enduser_id={enduserId}&limit={limit}&offset={offset}")
      @Headers({
    "Accept: application/json",
      })
   HttpResponse<PaginatedEndUserAgreementList> retrieveAllEUAsForAnEndUserWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAllEUAsForAnEndUser</code> method in a fluent style.
   */
  public static class RetrieveAllEUAsForAnEndUserQueryParams extends HashMap<String, Object> {
    public RetrieveAllEUAsForAnEndUserQueryParams enduserId(final String value) {
      put("enduser_id", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAllEUAsForAnEndUserQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAllEUAsForAnEndUserQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * API endpoints related to end-user agreements.
   * @param id A UUID string identifying this end user agreement. (required)
   * @return EndUserAgreement
   */
  @RequestLine("GET /api/agreements/enduser/{id}/")
  @Headers({
    "Accept: application/json",
  })
  EndUserAgreement retrieveEUAById(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveEUAById</code> but it also returns the http response headers .
   * API endpoints related to end-user agreements.
   * @param id A UUID string identifying this end user agreement. (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/agreements/enduser/{id}/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<EndUserAgreement> retrieveEUAByIdWithHttpInfo(@Param("id") UUID id);



  /**
   * 
   * Show the text of the end-user agreement.
   * @param id A UUID string identifying this end user agreement. (required)
   * @return String
   */
  @RequestLine("GET /api/agreements/enduser/{id}/text/")
  @Headers({
    "Accept: application/json",
  })
  String retrieveEUAText(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveEUAText</code> but it also returns the http response headers .
   * Show the text of the end-user agreement.
   * @param id A UUID string identifying this end user agreement. (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/agreements/enduser/{id}/text/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<String> retrieveEUATextWithHttpInfo(@Param("id") UUID id);


}
