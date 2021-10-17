package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;

import org.openapitools.client.model.EndUserAgreement;
import org.openapitools.client.model.EnduserAcceptanceDetails;
import org.openapitools.client.model.PaginatedEndUserAgreementList;
import java.util.UUID;

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
@Component("com.github.simonhauck.unofficial.nordigen.api.AgreementsApi")
public class AgreementsApi {
    private ApiClient apiClient;

    public AgreementsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AgreementsApi(ApiClient apiClient) {
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
     * Accept an end-user agreement via the API.
     * <p><b>200</b> - EUA
     * @param id A UUID string identifying this end user agreement. (required)
     * @param enduserAcceptanceDetails  (required)
     * @return EndUserAgreement
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EndUserAgreement acceptEUA(UUID id, EnduserAcceptanceDetails enduserAcceptanceDetails) throws RestClientException {
        return acceptEUAWithHttpInfo(id, enduserAcceptanceDetails).getBody();
    }

    /**
     * 
     * Accept an end-user agreement via the API.
     * <p><b>200</b> - EUA
     * @param id A UUID string identifying this end user agreement. (required)
     * @param enduserAcceptanceDetails  (required)
     * @return ResponseEntity&lt;EndUserAgreement&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EndUserAgreement> acceptEUAWithHttpInfo(UUID id, EnduserAcceptanceDetails enduserAcceptanceDetails) throws RestClientException {
        Object postBody = enduserAcceptanceDetails;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling acceptEUA");
        }
        
        // verify the required parameter 'enduserAcceptanceDetails' is set
        if (enduserAcceptanceDetails == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'enduserAcceptanceDetails' when calling acceptEUA");
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
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "cookieAuth", "tokenAuth" };

        ParameterizedTypeReference<EndUserAgreement> returnType = new ParameterizedTypeReference<EndUserAgreement>() {};
        return apiClient.invokeAPI("/api/agreements/enduser/{id}/accept/", HttpMethod.PUT, uriVariables, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * API endpoints related to end-user agreements.
     * <p><b>201</b>
     * @param endUserAgreement  (required)
     * @return EndUserAgreement
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EndUserAgreement createEUA(EndUserAgreement endUserAgreement) throws RestClientException {
        return createEUAWithHttpInfo(endUserAgreement).getBody();
    }

    /**
     * 
     * API endpoints related to end-user agreements.
     * <p><b>201</b>
     * @param endUserAgreement  (required)
     * @return ResponseEntity&lt;EndUserAgreement&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EndUserAgreement> createEUAWithHttpInfo(EndUserAgreement endUserAgreement) throws RestClientException {
        Object postBody = endUserAgreement;
        
        // verify the required parameter 'endUserAgreement' is set
        if (endUserAgreement == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endUserAgreement' when calling createEUA");
        }
        

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json", "application/x-www-form-urlencoded", "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "cookieAuth", "tokenAuth" };

        ParameterizedTypeReference<EndUserAgreement> returnType = new ParameterizedTypeReference<EndUserAgreement>() {};
        return apiClient.invokeAPI("/api/agreements/enduser/", HttpMethod.POST, Collections.<String, Object>emptyMap(), queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Delete End User Agreement.
     * <p><b>204</b> - No response body
     * @param id A UUID string identifying this end user agreement. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteEUAById(UUID id) throws RestClientException {
        deleteEUAByIdWithHttpInfo(id);
    }

    /**
     * 
     * Delete End User Agreement.
     * <p><b>204</b> - No response body
     * @param id A UUID string identifying this end user agreement. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteEUAByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteEUAById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "cookieAuth", "tokenAuth" };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/agreements/enduser/{id}/", HttpMethod.DELETE, uriVariables, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * API endpoints related to end-user agreements.
     * <p><b>200</b>
     * @param enduserId Your enduser ID, used for filtering results. (required)
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @return PaginatedEndUserAgreementList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedEndUserAgreementList retrieveAllEUAsForAnEndUser(String enduserId, Integer limit, Integer offset) throws RestClientException {
        return retrieveAllEUAsForAnEndUserWithHttpInfo(enduserId, limit, offset).getBody();
    }

    /**
     * 
     * API endpoints related to end-user agreements.
     * <p><b>200</b>
     * @param enduserId Your enduser ID, used for filtering results. (required)
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @return ResponseEntity&lt;PaginatedEndUserAgreementList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaginatedEndUserAgreementList> retrieveAllEUAsForAnEndUserWithHttpInfo(String enduserId, Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'enduserId' is set
        if (enduserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'enduserId' when calling retrieveAllEUAsForAnEndUser");
        }
        

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "enduser_id", enduserId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "cookieAuth", "tokenAuth" };

        ParameterizedTypeReference<PaginatedEndUserAgreementList> returnType = new ParameterizedTypeReference<PaginatedEndUserAgreementList>() {};
        return apiClient.invokeAPI("/api/agreements/enduser/", HttpMethod.GET, Collections.<String, Object>emptyMap(), queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * API endpoints related to end-user agreements.
     * <p><b>200</b> - EUA
     * @param id A UUID string identifying this end user agreement. (required)
     * @return EndUserAgreement
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EndUserAgreement retrieveEUAById(UUID id) throws RestClientException {
        return retrieveEUAByIdWithHttpInfo(id).getBody();
    }

    /**
     * 
     * API endpoints related to end-user agreements.
     * <p><b>200</b> - EUA
     * @param id A UUID string identifying this end user agreement. (required)
     * @return ResponseEntity&lt;EndUserAgreement&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EndUserAgreement> retrieveEUAByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling retrieveEUAById");
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

        ParameterizedTypeReference<EndUserAgreement> returnType = new ParameterizedTypeReference<EndUserAgreement>() {};
        return apiClient.invokeAPI("/api/agreements/enduser/{id}/", HttpMethod.GET, uriVariables, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Show the text of the end-user agreement.
     * <p><b>200</b> - EUA Text
     * @param id A UUID string identifying this end user agreement. (required)
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String retrieveEUAText(UUID id) throws RestClientException {
        return retrieveEUATextWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Show the text of the end-user agreement.
     * <p><b>200</b> - EUA Text
     * @param id A UUID string identifying this end user agreement. (required)
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> retrieveEUATextWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling retrieveEUAText");
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

        ParameterizedTypeReference<String> returnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/api/agreements/enduser/{id}/text/", HttpMethod.GET, uriVariables, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
