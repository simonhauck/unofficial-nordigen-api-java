package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.EncodingUtils;
import org.openapitools.client.model.ApiResponse;

import org.openapitools.client.model.Aspsp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-30T15:39:18.485873Z[Etc/UTC]")
public interface InstitutionsApi extends ApiClient.Api {


  /**
   * 
   * List all available institutions
   * @param country ISO 3166 two-character country code (required)
   * @return List&lt;Aspsp&gt;
   */
  @RequestLine("GET /api/v2/institutions/?country={country}")
  @Headers({
    "Accept: application/json",
  })
  List<Aspsp> retrieveAllSupportedInstitutionsInAGivenCountry(@Param("country") String country);

  /**
   * 
   * Similar to <code>retrieveAllSupportedInstitutionsInAGivenCountry</code> but it also returns the http response headers .
   * List all available institutions
   * @param country ISO 3166 two-character country code (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/institutions/?country={country}")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<List<Aspsp>> retrieveAllSupportedInstitutionsInAGivenCountryWithHttpInfo(@Param("country") String country);


  /**
   * 
   * List all available institutions
   * Note, this is equivalent to the other <code>retrieveAllSupportedInstitutionsInAGivenCountry</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link RetrieveAllSupportedInstitutionsInAGivenCountryQueryParams} class that allows for
   * building up this map in a fluent style.
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
   *   <li>country - ISO 3166 two-character country code (required)</li>
   *   </ul>
   * @return List&lt;Aspsp&gt;
   */
  @RequestLine("GET /api/v2/institutions/?country={country}")
  @Headers({
  "Accept: application/json",
  })
  List<Aspsp> retrieveAllSupportedInstitutionsInAGivenCountry(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
  * 
  * List all available institutions
  * Note, this is equivalent to the other <code>retrieveAllSupportedInstitutionsInAGivenCountry</code> that receives the query parameters as a map,
  * but this one also exposes the Http response headers
      * @param queryParams Map of query parameters as name-value pairs
      *   <p>The following elements may be specified in the query map:</p>
      *   <ul>
          *   <li>country - ISO 3166 two-character country code (required)</li>
      *   </ul>
          * @return List&lt;Aspsp&gt;
      */
      @RequestLine("GET /api/v2/institutions/?country={country}")
      @Headers({
    "Accept: application/json",
      })
   ApiResponse<List<Aspsp>> retrieveAllSupportedInstitutionsInAGivenCountryWithHttpInfo(@QueryMap(encoded=true) Map<String, Object> queryParams);


   /**
   * A convenience class for generating query parameters for the
   * <code>retrieveAllSupportedInstitutionsInAGivenCountry</code> method in a fluent style.
   */
  public static class RetrieveAllSupportedInstitutionsInAGivenCountryQueryParams extends HashMap<String, Object> {
    public RetrieveAllSupportedInstitutionsInAGivenCountryQueryParams country(final String value) {
      put("country", EncodingUtils.encode(value));
      return this;
    }
  }

  /**
   * 
   * Get details about a specific Institution
   * @param id  (required)
   * @return Aspsp
   */
  @RequestLine("GET /api/v2/institutions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  Aspsp retrieveInstitution(@Param("id") String id);

  /**
   * 
   * Similar to <code>retrieveInstitution</code> but it also returns the http response headers .
   * Get details about a specific Institution
   * @param id  (required)
   * @return A ApiResponse that wraps the response boyd and the http headers.
   */
  @RequestLine("GET /api/v2/institutions/{id}/")
  @Headers({
    "Accept: application/json",
  })
  ApiResponse<Aspsp> retrieveInstitutionWithHttpInfo(@Param("id") String id);


}
