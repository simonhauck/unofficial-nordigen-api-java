package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.AccountV2;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-25T19:32:12.154376Z[Etc/UTC]")
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
  Map<String, Object> retrieveAccountBalances(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveAccountBalances</code> but it also returns the http response headers .
   * Access account balances.  Balances will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/accounts/{id}/balances/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Map<String, Object>> retrieveAccountBalancesWithHttpInfo(@Param("id") UUID id);



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
  Map<String, Object> retrieveAccountDetails(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveAccountDetails</code> but it also returns the http response headers .
   * Access account details.  Account details will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/accounts/{id}/details/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Map<String, Object>> retrieveAccountDetailsWithHttpInfo(@Param("id") UUID id);



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
  AccountV2 retrieveAccountMetadata(@Param("id") UUID id);

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
  ApiResponse<AccountV2> retrieveAccountMetadataWithHttpInfo(@Param("id") UUID id);



  /**
   * 
   * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return Map&lt;String, Object&gt;
   */
  @RequestLine("GET /api/v2/accounts/{id}/transactions/")
  @Headers({
    "Accept: application/json",
  })
  Map<String, Object> retrieveAccountTransactions(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveAccountTransactions</code> but it also returns the http response headers .
   * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/accounts/{id}/transactions/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Map<String, Object>> retrieveAccountTransactionsWithHttpInfo(@Param("id") UUID id);


}
