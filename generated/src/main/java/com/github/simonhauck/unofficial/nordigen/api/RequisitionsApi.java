package com.github.simonhauck.unofficial.nordigen.api;

import com.github.simonhauck.unofficial.nordigen.ApiClient;

import org.openapitools.client.model.PaginatedRequisitionList;
import org.openapitools.client.model.Requisition;
import org.openapitools.client.model.RequisitionLinkParams;
import org.openapitools.client.model.RequisitionLinks;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-16T21:54:12.243372Z[Etc/UTC]")
@Component("com.github.simonhauck.unofficial.nordigen.api.RequisitionsApi")
public class RequisitionsApi {
    private ApiClient apiClient;

    public RequisitionsApi() {
        this(new ApiClient());
    }

    @Autowired
    public RequisitionsApi(ApiClient apiClient) {
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
     * API endpoints related to requisitions.
     * <p><b>201</b> - requisition
     * @param requisition  (required)
     * @return Requisition
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Requisition createANewRequisition(Requisition requisition) throws RestClientException {
        return createANewRequisitionWithHttpInfo(requisition).getBody();
    }

    /**
     * 
     * API endpoints related to requisitions.
     * <p><b>201</b> - requisition
     * @param requisition  (required)
     * @return ResponseEntity&lt;Requisition&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Requisition> createANewRequisitionWithHttpInfo(Requisition requisition) throws RestClientException {
        Object postBody = requisition;
        
        // verify the required parameter 'requisition' is set
        if (requisition == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requisition' when calling createANewRequisition");
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

        ParameterizedTypeReference<Requisition> returnType = new ParameterizedTypeReference<Requisition>() {};
        return apiClient.invokeAPI("/api/requisitions/", HttpMethod.POST, Collections.<String, Object>emptyMap(), queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get links for user redirection.
     * <p><b>200</b> - link to initiate authorization with ASPSP
     * @param id A UUID string identifying this requisition. (required)
     * @param requisitionLinkParams  (required)
     * @return RequisitionLinks
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RequisitionLinks createASPSPAuthorizationLink(UUID id, RequisitionLinkParams requisitionLinkParams) throws RestClientException {
        return createASPSPAuthorizationLinkWithHttpInfo(id, requisitionLinkParams).getBody();
    }

    /**
     * 
     * Get links for user redirection.
     * <p><b>200</b> - link to initiate authorization with ASPSP
     * @param id A UUID string identifying this requisition. (required)
     * @param requisitionLinkParams  (required)
     * @return ResponseEntity&lt;RequisitionLinks&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RequisitionLinks> createASPSPAuthorizationLinkWithHttpInfo(UUID id, RequisitionLinkParams requisitionLinkParams) throws RestClientException {
        Object postBody = requisitionLinkParams;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createASPSPAuthorizationLink");
        }
        
        // verify the required parameter 'requisitionLinkParams' is set
        if (requisitionLinkParams == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requisitionLinkParams' when calling createASPSPAuthorizationLink");
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

        ParameterizedTypeReference<RequisitionLinks> returnType = new ParameterizedTypeReference<RequisitionLinks>() {};
        return apiClient.invokeAPI("/api/requisitions/{id}/links/", HttpMethod.POST, uriVariables, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Delete Requisition and all End User Agreements.
     * <p><b>204</b> - No response body
     * @param id A UUID string identifying this requisition. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteRequisition(UUID id) throws RestClientException {
        deleteRequisitionWithHttpInfo(id);
    }

    /**
     * 
     * Delete Requisition and all End User Agreements.
     * <p><b>204</b> - No response body
     * @param id A UUID string identifying this requisition. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteRequisitionWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteRequisition");
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
        return apiClient.invokeAPI("/api/requisitions/{id}/", HttpMethod.DELETE, uriVariables, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * API endpoints related to requisitions.
     * <p><b>200</b> - requisition
     * @param id A UUID string identifying this requisition. (required)
     * @return Requisition
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Requisition requisitionById(UUID id) throws RestClientException {
        return requisitionByIdWithHttpInfo(id).getBody();
    }

    /**
     * 
     * API endpoints related to requisitions.
     * <p><b>200</b> - requisition
     * @param id A UUID string identifying this requisition. (required)
     * @return ResponseEntity&lt;Requisition&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Requisition> requisitionByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling requisitionById");
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

        ParameterizedTypeReference<Requisition> returnType = new ParameterizedTypeReference<Requisition>() {};
        return apiClient.invokeAPI("/api/requisitions/{id}/", HttpMethod.GET, uriVariables, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * API endpoints related to requisitions.
     * <p><b>200</b>
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @return PaginatedRequisitionList
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaginatedRequisitionList retrieveAllRequisitions(Integer limit, Integer offset) throws RestClientException {
        return retrieveAllRequisitionsWithHttpInfo(limit, offset).getBody();
    }

    /**
     * 
     * API endpoints related to requisitions.
     * <p><b>200</b>
     * @param limit Number of results to return per page. (optional)
     * @param offset The initial index from which to return the results. (optional)
     * @return ResponseEntity&lt;PaginatedRequisitionList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaginatedRequisitionList> retrieveAllRequisitionsWithHttpInfo(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] { "cookieAuth", "tokenAuth" };

        ParameterizedTypeReference<PaginatedRequisitionList> returnType = new ParameterizedTypeReference<PaginatedRequisitionList>() {};
        return apiClient.invokeAPI("/api/requisitions/", HttpMethod.GET, Collections.<String, Object>emptyMap(), queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
