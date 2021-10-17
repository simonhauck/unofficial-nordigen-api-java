package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;

import org.openapitools.client.model.Aspsp;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-17T11:46:57.069002Z[Etc/UTC]")
@Component("com.github.simonhauck.unofficial.nordigen.api.AspspsApi")
public class AspspsApi {
    private ApiClient apiClient;

    public AspspsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AspspsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * List all ASPSPs available.
     * <p><b>200</b> - list of supported ASPSPs in the country
     * @param country ISO 3166 two-character country code (required)
     * @return List&lt;Aspsp&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Aspsp> retrieveAllSupportedASPSPSInAGivenCountry(String country) throws RestClientException {
        return retrieveAllSupportedASPSPSInAGivenCountryWithHttpInfo(country).getBody();
    }

    /**
     * 
     * List all ASPSPs available.
     * <p><b>200</b> - list of supported ASPSPs in the country
     * @param country ISO 3166 two-character country code (required)
     * @return ResponseEntity&lt;List&lt;Aspsp&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Aspsp>> retrieveAllSupportedASPSPSInAGivenCountryWithHttpInfo(String country) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'country' when calling retrieveAllSupportedASPSPSInAGivenCountry");
        }
        

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country", country));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "cookieAuth", "tokenAuth" };

        ParameterizedTypeReference<List<Aspsp>> returnType = new ParameterizedTypeReference<List<Aspsp>>() {};
        return apiClient.invokeAPI("/api/aspsps/", HttpMethod.GET, Collections.<String, Object>emptyMap(), queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get details about a specific ASPSP.
     * <p><b>200</b> - ASPSP Representation
     * @param id  (required)
     * @return Aspsp
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Aspsp retrieveDetailsAboutSpecificASPSP(String id) throws RestClientException {
        return retrieveDetailsAboutSpecificASPSPWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Get details about a specific ASPSP.
     * <p><b>200</b> - ASPSP Representation
     * @param id  (required)
     * @return ResponseEntity&lt;Aspsp&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Aspsp> retrieveDetailsAboutSpecificASPSPWithHttpInfo(String id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling retrieveDetailsAboutSpecificASPSP");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "cookieAuth", "tokenAuth" };

        ParameterizedTypeReference<Aspsp> returnType = new ParameterizedTypeReference<Aspsp>() {};
        return apiClient.invokeAPI("/api/aspsps/{id}/", HttpMethod.GET, uriVariables, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
