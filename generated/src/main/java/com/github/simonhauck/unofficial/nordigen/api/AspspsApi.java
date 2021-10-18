package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.HttpResponse;

import org.openapitools.client.model.Aspsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-18T17:11:55.968860Z[Etc/UTC]")
public interface AspspsApi extends ApiClient.Api {


  /**
   * 
   * List all ASPSPs available.
   * @param country ISO 3166 two-character country code (required)
   * @return List&lt;Aspsp&gt;
   */
  @RequestLine("GET /api/aspsps/?country={country}")
  @Headers({
    "Accept: application/json",
  })
  List<Aspsp> retrieveAllSupportedASPSPSInAGivenCountry(@Param("country") String country);

  /**
   * 
   * Similar to <code>retrieveAllSupportedASPSPSInAGivenCountry</code> but it also returns the http response headers .
   * List all ASPSPs available.
   * @param country ISO 3166 two-character country code (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/aspsps/?country={country}")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<List<Aspsp>> retrieveAllSupportedASPSPSInAGivenCountryWithHttpInfo(@Param("country") String country);


  /**
   * 
   * List all ASPSPs available.
   * Note, this is equivalent to the other <code>retrieveAllSupportedASPSPSInAGivenCountry</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAllSupportedASPSPSInAGivenCountryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>country - ISO 3166 two-character country code (required)</li>
   *   </ul>
   * @return List&lt;Aspsp&gt;
   */
  @RequestLine("GET /api/aspsps/?country={country}")
  @Headers({
  "Accept: application/json",
  })
  List<Aspsp> retrieveAllSupportedASPSPSInAGivenCountry(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * 
  * List all ASPSPs available.
  * Note, this is equivalent to the other <code>retrieveAllSupportedASPSPSInAGivenCountry</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>country - ISO 3166 two-character country code (required)</li>
      *   </ul>
          * @return List&lt;Aspsp&gt;
      */
      @RequestLine("GET /api/aspsps/?country={country}")
      @Headers({
    "Accept: application/json",
      })
   HttpResponse<List<Aspsp>> retrieveAllSupportedASPSPSInAGivenCountryWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAllSupportedASPSPSInAGivenCountry</code> method in a fluent style.
   */
  public static class RetrieveAllSupportedASPSPSInAGivenCountryQueryParams extends HashMap<String, Object> {
    public RetrieveAllSupportedASPSPSInAGivenCountryQueryParams country(final String value) {
      put("country", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * Get details about a specific ASPSP.
   * @param id  (required)
   * @return Aspsp
   */
  @RequestLine("GET /api/aspsps/{id}/")
  @Headers({
    "Accept: application/json",
  })
  Aspsp retrieveDetailsAboutSpecificASPSP(@Param("id") String id);

  /**
   * 
   * Similar to <code>retrieveDetailsAboutSpecificASPSP</code> but it also returns the http response headers .
   * Get details about a specific ASPSP.
   * @param id  (required)
   * @return A HttpResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/aspsps/{id}/")
  @Headers({
    "Accept: application/json",
  })
  HttpResponse<Aspsp> retrieveDetailsAboutSpecificASPSPWithHttpInfo(@Param("id") String id);


}
