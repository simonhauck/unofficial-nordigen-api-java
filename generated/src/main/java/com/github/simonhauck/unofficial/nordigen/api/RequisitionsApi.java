package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.PaginatedRequisitionV2List;
import org.openapitools.client.model.RequisitionV2;
import org.openapitools.client.model.SpectacularRequisitionV2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-30T16:06:26.310052Z[Etc/UTC]")
public interface RequisitionsApi extends ApiClient.Api {


  /**
   * 
   * Delete Requisition and all End User Agreements.
   * @param id A UUID string identifying this requisition. (required)
   */
  @RequestLine("DELETE /api/v2/requisitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  void deleteRequisitionByIdV2(@Param("id") String id);

  /**
   * 
   * Similar to <code>deleteRequisitionByIdV2</code> but it also returns the http response headers .
   * Delete Requisition and all End User Agreements.
   * @param id A UUID string identifying this requisition. (required)
   */
  @RequestLine("DELETE /api/v2/requisitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> deleteRequisitionByIdV2WithHttpInfo(@Param("id") String id);



  /**
   * 
   * API endpoints related to requisitions.
   * @param id A UUID string identifying this requisition. (required)
   * @return RequisitionV2
   */
  @RequestLine("GET /api/v2/requisitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  RequisitionV2 requisitionById(@Param("id") String id);

  /**
   * 
   * Similar to <code>requisitionById</code> but it also returns the http response headers .
   * API endpoints related to requisitions.
   * @param id A UUID string identifying this requisition. (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/requisitions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<RequisitionV2> requisitionByIdWithHttpInfo(@Param("id") String id);



  /**
   * 
   * API endpoints related to requisitions.
   * @param requisitionV2  (required)
   * @return SpectacularRequisitionV2
   */
  @RequestLine("POST /api/v2/requisitions/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpectacularRequisitionV2 requisitionCreated(RequisitionV2 requisitionV2);

  /**
   * 
   * Similar to <code>requisitionCreated</code> but it also returns the http response headers .
   * API endpoints related to requisitions.
   * @param requisitionV2  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/v2/requisitions/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpectacularRequisitionV2> requisitionCreatedWithHttpInfo(RequisitionV2 requisitionV2);



  /**
   * 
   * API endpoints related to requisitions.
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @return PaginatedRequisitionV2List
   */
  @RequestLine("GET /api/v2/requisitions/?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  PaginatedRequisitionV2List retrieveAllRequisitions(@Param("limit") Integer limit, @Param("offset") Integer offset);

  /**
   * 
   * Similar to <code>retrieveAllRequisitions</code> but it also returns the http response headers .
   * API endpoints related to requisitions.
   * @param limit Number of results to return per page. (optional)
   * @param offset The initial index from which to return the results. (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/requisitions/?limit={limit}&offset={offset}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<PaginatedRequisitionV2List> retrieveAllRequisitionsWithHttpInfo(@Param("limit") Integer limit, @Param("offset") Integer offset);


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
   * @return PaginatedRequisitionV2List
   */
  @RequestLine("GET /api/v2/requisitions/?limit={limit}&offset={offset}")
  @Headers({
  "Accept: application/json",
  })
  PaginatedRequisitionV2List retrieveAllRequisitions(@QueryMap(encoded=true) Map<String, Object> queryParams);

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
          * @return PaginatedRequisitionV2List
      */
      @RequestLine("GET /api/v2/requisitions/?limit={limit}&offset={offset}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<PaginatedRequisitionV2List> retrieveAllRequisitionsWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


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
