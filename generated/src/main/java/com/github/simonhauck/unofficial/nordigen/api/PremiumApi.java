package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.threeten.bp.LocalDate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-30T16:06:26.310052Z[Etc/UTC]")
public interface PremiumApi extends ApiClient.Api {


  /**
   * 
   * Access account premium balances.
   * @param id  (required)
   */
  @RequestLine("GET /api/v2/accounts/premium/{id}/balances/")
  @Headers({
    "Accept: application/json",
  })
  void retrieveAccountBalancesV2(@Param("id") String id);

  /**
   * 
   * Similar to <code>retrieveAccountBalancesV2</code> but it also returns the http response headers .
   * Access account premium balances.
   * @param id  (required)
   */
  @RequestLine("GET /api/v2/accounts/premium/{id}/balances/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> retrieveAccountBalancesV2WithHttpInfo(@Param("id") String id);



  /**
   * 
   * Access account premium details.
   * @param id  (required)
   * @param country ISO 3166 two-character country code (optional)
   */
  @RequestLine("GET /api/v2/accounts/premium/{id}/details/?country={country}")
  @Headers({
    "Accept: application/json",
  })
  void retrieveAccountDetailsV2(@Param("id") String id, @Param("country") String country);

  /**
   * 
   * Similar to <code>retrieveAccountDetailsV2</code> but it also returns the http response headers .
   * Access account premium details.
   * @param id  (required)
   * @param country ISO 3166 two-character country code (optional)
   */
  @RequestLine("GET /api/v2/accounts/premium/{id}/details/?country={country}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> retrieveAccountDetailsV2WithHttpInfo(@Param("id") String id, @Param("country") String country);


  /**
   * 
   * Access account premium details.
   * Note, this is equivalent to the other <code>retrieveAccountDetailsV2</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAccountDetailsV2QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>country - ISO 3166 two-character country code (optional)</li>
   *   </ul>
   */
  @RequestLine("GET /api/v2/accounts/premium/{id}/details/?country={country}")
  @Headers({
  "Accept: application/json",
  })
  void retrieveAccountDetailsV2(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * 
  * Access account premium details.
  * Note, this is equivalent to the other <code>retrieveAccountDetailsV2</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>country - ISO 3166 two-character country code (optional)</li>
      *   </ul>
      */
      @RequestLine("GET /api/v2/accounts/premium/{id}/details/?country={country}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> retrieveAccountDetailsV2WithHttpInfo(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAccountDetailsV2</code> method in a fluent style.
   */
  public static class RetrieveAccountDetailsV2QueryParams extends HashMap<String, Object> {
    public RetrieveAccountDetailsV2QueryParams country(final String value) {
      put("country", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * Access account premium transactions.
   * @param id  (required)
   * @param country ISO 3166 two-character country code (optional)
   * @param dateFrom  (optional)
   * @param dateTo  (optional)
   */
  @RequestLine("GET /api/v2/accounts/premium/{id}/transactions/?country={country}&date_from={dateFrom}&date_to={dateTo}")
  @Headers({
    "Accept: application/json",
  })
  void retrieveAccountTransactionsV2(@Param("id") String id, @Param("country") String country, @Param("dateFrom") LocalDate dateFrom, @Param("dateTo") LocalDate dateTo);

  /**
   * 
   * Similar to <code>retrieveAccountTransactionsV2</code> but it also returns the http response headers .
   * Access account premium transactions.
   * @param id  (required)
   * @param country ISO 3166 two-character country code (optional)
   * @param dateFrom  (optional)
   * @param dateTo  (optional)
   */
  @RequestLine("GET /api/v2/accounts/premium/{id}/transactions/?country={country}&date_from={dateFrom}&date_to={dateTo}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Void> retrieveAccountTransactionsV2WithHttpInfo(@Param("id") String id, @Param("country") String country, @Param("dateFrom") LocalDate dateFrom, @Param("dateTo") LocalDate dateTo);


  /**
   * 
   * Access account premium transactions.
   * Note, this is equivalent to the other <code>retrieveAccountTransactionsV2</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAccountTransactionsV2QueryParams} class that allows for
   * building up this map in a fluent style.
   * @param id  (required)
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>country - ISO 3166 two-character country code (optional)</li>
   *   <li>dateFrom -  (optional)</li>
   *   <li>dateTo -  (optional)</li>
   *   </ul>
   */
  @RequestLine("GET /api/v2/accounts/premium/{id}/transactions/?country={country}&date_from={dateFrom}&date_to={dateTo}")
  @Headers({
  "Accept: application/json",
  })
  void retrieveAccountTransactionsV2(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * 
  * Access account premium transactions.
  * Note, this is equivalent to the other <code>retrieveAccountTransactionsV2</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
              * @param id  (required)
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>country - ISO 3166 two-character country code (optional)</li>
          *   <li>dateFrom -  (optional)</li>
          *   <li>dateTo -  (optional)</li>
      *   </ul>
      */
      @RequestLine("GET /api/v2/accounts/premium/{id}/transactions/?country={country}&date_from={dateFrom}&date_to={dateTo}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<Void> retrieveAccountTransactionsV2WithHttpInfo(@Param("id") String id, @QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAccountTransactionsV2</code> method in a fluent style.
   */
  public static class RetrieveAccountTransactionsV2QueryParams extends HashMap<String, Object> {
    public RetrieveAccountTransactionsV2QueryParams country(final String value) {
      put("country", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAccountTransactionsV2QueryParams dateFrom(final LocalDate value) {
      put("date_from", EncodingUtils.encode(value));
      return this;
    }
    public RetrieveAccountTransactionsV2QueryParams dateTo(final LocalDate value) {
      put("date_to", EncodingUtils.encode(value));
      return this;
    }
  }
}
