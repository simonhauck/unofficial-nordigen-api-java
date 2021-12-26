package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.EndUserAgreement;
import org.openapitools.client.model.EnduserAcceptanceDetails;
import org.openapitools.client.model.PaginatedEndUserAgreementList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T16:06:45.421496Z[Etc/UTC]")
public interface AgreementsApi extends ApiClient.Api {


  /**
   * 
   * Accept an end-user agreement via the API.
   * @param id A UUID string identifying this end user agreement. (required)
   * @param enduserAcceptanceDetails  (required)
   * @return EndUserAgreement
   */
  @RequestLine("PUT /api/v2/agreements/enduser/{id}/accept/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EndUserAgreement acceptEUA(@Param("id") String id, EnduserAcceptanceDetails enduserAcceptanceDetails);

  /**
   * 
   * Similar to <code>acceptEUA</code> but it also returns the http response headers .
   * Accept an end-user agreement via the API.
   * @param id A UUID string identifying this end user agreement. (required)
   * @param enduserAcceptanceDetails  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("PUT /api/v2/agreements/enduser/{id}/accept/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EndUserAgreement> acceptEUAWithHttpInfo(@Param("id") String id, EnduserAcceptanceDetails enduserAcceptanceDetails);



  /**
   * 
   * API endpoints related to end-user agreements.
   * @param endUserAgreement  (required)
   * @return EndUserAgreement
   */
  @RequestLine("POST /api/v2/agreements/enduser/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  EndUserAgreement createEUAV2(EndUserAgreement endUserAgreement);

  /**
   * 
   * Similar to <code>createEUAV2</code> but it also returns the http response headers .
   * API endpoints related to end-user agreements.
   * @param endUserAgreement  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/v2/agreements/enduser/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<EndUserAgreement> createEUAV2WithHttpInfo(EndUserAgreement endUserAgreement);



  /**
   * 
   * Delete End User Agreement.
   * @param id A UUID string identifying this end user agreement. (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("DELETE /api/v2/agreements/enduser/{id}/")
  @Headers({
    "Accept: application/json",
  })
  Map<String, Object> deleteEUAByIdV2(@Param("id") String id);

  /**
   * 
   * Similar to <code>deleteEUAByIdV2</code> but it also returns the http response headers .
   * Delete End User Agreement.
   * @param id A UUID string identifying this end user agreement. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("DELETE /api/v2/agreements/enduser/{id}/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Map<String, Object>> deleteEUAByIdV2WithHttpInfo(@Param("id") String id);



  /**
   * 
   * API endpoints related to end-user agreements.
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @return PaginatedEndUserAgreementList
   */
  @RequestLine("GET /api/v2/agreements/enduser/?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  PaginatedEndUserAgreementList retrieveAllEUAsForAnEndUserV2(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * 
   * Similar to <code>retrieveAllEUAsForAnEndUserV2</code> but it also returns the http response headers .
   * API endpoints related to end-user agreements.
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/agreements/enduser/?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaginatedEndUserAgreementList> retrieveAllEUAsForAnEndUserV2WithHttpInfo(@Param("limit") Integer limit, @Param("offset") Integer offset);


  /**
   * 
   * API endpoints related to end-user agreements.
   * Note, this is equivalent to the other <code>retrieveAllEUAsForAnEndUserV2</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAllEUAsForAnEndUserV2QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Number of results to return per page. (optional)</li>
   *   <li>offset - The initial index from which to return the results. (optional)</li>
   *   </ul>
   * @return PaginatedEndUserAgreementList
   */
  @RequestLine("GET /api/v2/agreements/enduser/?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  PaginatedEndUserAgreementList retrieveAllEUAsForAnEndUserV2(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * 
  * API endpoints related to end-user agreements.
  * Note, this is equivalent to the other <code>retrieveAllEUAsForAnEndUserV2</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - Number of results to return per page. (optional)</li>
          *   <li>offset - The initial index from which to return the results. (optional)</li>
      *   </ul>
          * @return PaginatedEndUserAgreementList
      */
      @RequestLine("GET /api/v2/agreements/enduser/?limit={limit}&offset={offset}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PaginatedEndUserAgreementList> retrieveAllEUAsForAnEndUserV2WithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAllEUAsForAnEndUserV2</code> method in a fluent style.
   */
  public static class RetrieveAllEUAsForAnEndUserV2QueryParams extends HashMap<String, Object> {
    public RetrieveAllEUAsForAnEndUserV2QueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAllEUAsForAnEndUserV2QueryParams offset(final Integer value) {
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
  @RequestLine("GET /api/v2/agreements/enduser/{id}/")
  @Headers({
    "Accept: application/json",
  })
  EndUserAgreement retrieveEUAByIdV2(@Param("id") String id);

  /**
   * 
   * Similar to <code>retrieveEUAByIdV2</code> but it also returns the http response headers .
   * API endpoints related to end-user agreements.
   * @param id A UUID string identifying this end user agreement. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/agreements/enduser/{id}/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<EndUserAgreement> retrieveEUAByIdV2WithHttpInfo(@Param("id") String id);


}
