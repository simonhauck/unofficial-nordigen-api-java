package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.HttpResponse;

import org.openapitools.client.model.PaginatedRequisitionList;
import org.openapitools.client.model.Requisition;
import org.openapitools.client.model.RequisitionLinkParams;
import org.openapitools.client.model.RequisitionLinks;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-18T17:20:21.539882Z[Etc/UTC]")
public interface RequisitionsApi extends ApiClient.Api {


  /**
   * 
   * API endpoints related to requisitions.
   * @param requisition  (required)
   * @return Requisition
   */
  @RequestLine("POST /api/requisitions/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  Requisition createANewRequisition(Requisition requisition);

  /**
   * 
   * Similar to <code>createANewRequisition</code> but it also returns the http response headers .
   * API endpoints related to requisitions.
   * @param requisition  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/requisitions/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HttpResponse<Requisition> createANewRequisitionWithHttpInfo(Requisition requisition);



  /**
   * 
   * Get links for user redirection.
   * @param id A UUID string identifying this requisition. (required)
   * @param requisitionLinkParams  (required)
   * @return RequisitionLinks
   */
  @RequestLine("POST /api/requisitions/{id}/links/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  RequisitionLinks createASPSPAuthorizationLink(@Param("id") UUID id, RequisitionLinkParams requisitionLinkParams);

  /**
   * 
   * Similar to <code>createASPSPAuthorizationLink</code> but it also returns the http response headers .
   * Get links for user redirection.
   * @param id A UUID string identifying this requisition. (required)
   * @param requisitionLinkParams  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/requisitions/{id}/links/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  HttpResponse<RequisitionLinks> createASPSPAuthorizationLinkWithHttpInfo(@Param("id") UUID id, RequisitionLinkParams requisitionLinkParams);



  /**
   * 
   * Delete Requisition and all End User Agreements.
   * @param id A UUID string identifying this requisition. (required)
   */
  @RequestLine("DELETE /api/requisitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  void deleteRequisition(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>deleteRequisition</code> but it also returns the http response headers .
   * Delete Requisition and all End User Agreements.
   * @param id A UUID string identifying this requisition. (required)
   */
  @RequestLine("DELETE /api/requisitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<Void> deleteRequisitionWithHttpInfo(@Param("id") UUID id);



  /**
   * 
   * API endpoints related to requisitions.
   * @param id A UUID string identifying this requisition. (required)
   * @return Requisition
   */
  @RequestLine("GET /api/requisitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  Requisition requisitionById(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>requisitionById</code> but it also returns the http response headers .
   * API endpoints related to requisitions.
   * @param id A UUID string identifying this requisition. (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/requisitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<Requisition> requisitionByIdWithHttpInfo(@Param("id") UUID id);



  /**
   * 
   * API endpoints related to requisitions.
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @return PaginatedRequisitionList
   */
  @RequestLine("GET /api/requisitions/?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  PaginatedRequisitionList retrieveAllRequisitions(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * 
   * Similar to <code>retrieveAllRequisitions</code> but it also returns the http response headers .
   * API endpoints related to requisitions.
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/requisitions/?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<PaginatedRequisitionList> retrieveAllRequisitionsWithHttpInfo(@Param("limit") Integer limit, @Param("offset") Integer offset);


  /**
   * 
   * API endpoints related to requisitions.
   * Note, this is equivalent to the other <code>retrieveAllRequisitions</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAllRequisitionsQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>limit - Number of results to return per page. (optional)</li>
   *   <li>offset - The initial index from which to return the results. (optional)</li>
   *   </ul>
   * @return PaginatedRequisitionList
   */
  @RequestLine("GET /api/requisitions/?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  PaginatedRequisitionList retrieveAllRequisitions(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * 
  * API endpoints related to requisitions.
  * Note, this is equivalent to the other <code>retrieveAllRequisitions</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>limit - Number of results to return per page. (optional)</li>
          *   <li>offset - The initial index from which to return the results. (optional)</li>
      *   </ul>
          * @return PaginatedRequisitionList
      */
      @RequestLine("GET /api/requisitions/?limit={limit}&offset={offset}")
      @Headers({
    "Accept: application/json",
      })
   HttpResponse<PaginatedRequisitionList> retrieveAllRequisitionsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAllRequisitions</code> method in a fluent style.
   */
  public static class RetrieveAllRequisitionsQueryParams extends HashMap<String, Object> {
    public RetrieveAllRequisitionsQueryParams limit(final Integer value) {
      put("limit", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAllRequisitionsQueryParams offset(final Integer value) {
      put("offset", EncodingUtils.encode(value));
      return this;
    }
  }
}
