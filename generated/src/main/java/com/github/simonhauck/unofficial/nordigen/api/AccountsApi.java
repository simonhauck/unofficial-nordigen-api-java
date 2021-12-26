package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.AccountV2;
import org.threeten.bp.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T15:24:39.802060Z[Etc/UTC]")
public interface AccountsApi extends ApiClient.Api {


  /**
   * 
   * Access account balances.  Balances will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /api/v2/accounts/{id}/balances/")
  @Headers({
    "Accept: application/json",
  })
  Map<String, Object> retrieveAccountBalancesV22(@Param("id") String id);

  /**
   * 
   * Similar to <code>retrieveAccountBalancesV22</code> but it also returns the http response headers .
   * Access account balances.  Balances will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/accounts/{id}/balances/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Map<String, Object>> retrieveAccountBalancesV22WithHttpInfo(@Param("id") String id);



  /**
   * 
   * Access account details.  Account details will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /api/v2/accounts/{id}/details/")
  @Headers({
    "Accept: application/json",
  })
  Map<String, Object> retrieveAccountDetailsV22(@Param("id") String id);

  /**
   * 
   * Similar to <code>retrieveAccountDetailsV22</code> but it also returns the http response headers .
   * Access account details.  Account details will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/accounts/{id}/details/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Map<String, Object>> retrieveAccountDetailsV22WithHttpInfo(@Param("id") String id);



  /**
   * 
   * Access account metadata.  Information about the account record, such as the processing status and IBAN.  Account status is recalculated based on the error count in the latest req.
   * @param id  (required)
   * @return AccountV2
   */
  @RequestLine("GET /api/v2/accounts/{id}/")
  @Headers({
    "Accept: application/json",
  })
  AccountV2 retrieveAccountMetadata(@Param("id") String id);

  /**
   * 
   * Similar to <code>retrieveAccountMetadata</code> but it also returns the http response headers .
   * Access account metadata.  Information about the account record, such as the processing status and IBAN.  Account status is recalculated based on the error count in the latest req.
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/accounts/{id}/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<AccountV2> retrieveAccountMetadataWithHttpInfo(@Param("id") String id);



  /**
   * 
   * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @param dateFrom  (optional)
   * @param dateTo  (optional)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /api/v2/accounts/{id}/transactions/?date_from={dateFrom}&date_to={dateTo}")
  @Headers({
    "Accept: application/json",
  })
  Map<String, Object> retrieveAccountTransactionsV22(@Param("id") String id, @Param("dateFrom") LocalDate dateFrom, @Param("dateTo") LocalDate dateTo);

  /**
   * 
   * Similar to <code>retrieveAccountTransactionsV22</code> but it also returns the http response headers .
   * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @param dateFrom  (optional)
   * @param dateTo  (optional)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/accounts/{id}/transactions/?date_from={dateFrom}&date_to={dateTo}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Map<String, Object>> retrieveAccountTransactionsV22WithHttpInfo(@Param("id") String id, @Param("dateFrom") LocalDate dateFrom, @Param("dateTo") LocalDate dateTo);


  /**
   * 
   * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
   * Note, this is equivalent to the other <code>retrieveAccountTransactionsV22</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAccountTransactionsV22QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>dateFrom -  (optional)</li>
   *   <li>dateTo -  (optional)</li>
   *   </ul>
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /api/v2/accounts/{id}/transactions/?date_from={dateFrom}&date_to={dateTo}")
  @Headers({
  "Accept: application/json",
  })
  Map<String, Object> retrieveAccountTransactionsV22(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * 
  * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
  * Note, this is equivalent to the other <code>retrieveAccountTransactionsV22</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>dateFrom -  (optional)</li>
          *   <li>dateTo -  (optional)</li>
      *   </ul>
          * @return Map&lt;String, Object&gt;
      */
      @RequestLine("GET /api/v2/accounts/{id}/transactions/?date_from={dateFrom}&date_to={dateTo}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Map<String, Object>> retrieveAccountTransactionsV22WithHttpInfo(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAccountTransactionsV22</code> method in a fluent style.
   */
  public static class RetrieveAccountTransactionsV22QueryParams extends HashMap<String, Object> {
    public RetrieveAccountTransactionsV22QueryParams dateFrom(final LocalDate value) {
      put("date_from", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAccountTransactionsV22QueryParams dateTo(final LocalDate value) {
      put("date_to", EncodingUtils.encode(value));
      return this;
    }
  }
}
