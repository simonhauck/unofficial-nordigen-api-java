package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.JWTObtainPair;
import org.openapitools.client.model.JWTRefresh;
import org.openapitools.client.model.SpectacularJWTObtain;
import org.openapitools.client.model.SpectacularJWTRefresh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-30T15:39:18.485873Z[Etc/UTC]")
public interface TokenApi extends ApiClient.Api {


  /**
   * 
   * Obtain JWT pair
   * @param jwTObtainPair  (required)
   * @return SpectacularJWTObtain
   */
  @RequestLine("POST /api/v2/token/new/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpectacularJWTObtain jWTObtain(JWTObtainPair jwTObtainPair);

  /**
   * 
   * Similar to <code>jWTObtain</code> but it also returns the http response headers .
   * Obtain JWT pair
   * @param jwTObtainPair  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/v2/token/new/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpectacularJWTObtain> jWTObtainWithHttpInfo(JWTObtainPair jwTObtainPair);



  /**
   * 
   * Refresh access token
   * @param jwTRefresh  (required)
   * @return SpectacularJWTRefresh
   */
  @RequestLine("POST /api/v2/token/refresh/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  SpectacularJWTRefresh jWTRefresh(JWTRefresh jwTRefresh);

  /**
   * 
   * Similar to <code>jWTRefresh</code> but it also returns the http response headers .
   * Refresh access token
   * @param jwTRefresh  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("POST /api/v2/token/refresh/")
  @Headers({
    "Content-Type: application/json",
    "Accept: application/json",
  })
  ApiResponse<SpectacularJWTRefresh> jWTRefreshWithHttpInfo(JWTRefresh jwTRefresh);


}
