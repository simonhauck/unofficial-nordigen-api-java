package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.HttpResponse;

import org.openapitools.client.model.Account;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-18T16:42:20.649024Z[Etc/UTC]")
public interface AccountsApi extends ApiClient.Api {


  /**
   * 
   * Access account balances.  Balances will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return String
   */
  @RequestLine("GET /api/accounts/{id}/balances/")
  @Headers({
    "Accept: application/json",
  })
  String retrieveAccountBalances(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveAccountBalances</code> but it also returns the http response headers .
   * Access account balances.  Balances will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/accounts/{id}/balances/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<String> retrieveAccountBalancesWithHttpInfo(@Param("id") UUID id);



  /**
   * 
   * Access account details.  Account details will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return String
   */
  @RequestLine("GET /api/accounts/{id}/details/")
  @Headers({
    "Accept: application/json",
  })
  String retrieveAccountDetails(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveAccountDetails</code> but it also returns the http response headers .
   * Access account details.  Account details will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/accounts/{id}/details/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<String> retrieveAccountDetailsWithHttpInfo(@Param("id") UUID id);



  /**
   * 
   * Access account metadata.  Information about the account record, such as the processing status and IBAN.  Account status is recalculated based on the error count in the latest req.
   * @param id  (required)
   * @return Account
   */
  @RequestLine("GET /api/accounts/{id}/")
  @Headers({
    "Accept: application/json",
  })
  Account retrieveAccountMetadata(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveAccountMetadata</code> but it also returns the http response headers .
   * Access account metadata.  Information about the account record, such as the processing status and IBAN.  Account status is recalculated based on the error count in the latest req.
   * @param id  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/accounts/{id}/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<Account> retrieveAccountMetadataWithHttpInfo(@Param("id") UUID id);



  /**
   * 
   * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return String
   */
  @RequestLine("GET /api/accounts/{id}/transactions/")
  @Headers({
    "Accept: application/json",
  })
  String retrieveAccountTransactions(@Param("id") UUID id);

  /**
   * 
   * Similar to <code>retrieveAccountTransactions</code> but it also returns the http response headers .
   * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
   * @param id  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/accounts/{id}/transactions/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<String> retrieveAccountTransactionsWithHttpInfo(@Param("id") UUID id);


}
