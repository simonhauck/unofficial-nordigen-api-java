# RequisitionsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createANewRequisition**](RequisitionsApi.md#createANewRequisition) | **POST** /api/requisitions/ | 
[**createASPSPAuthorizationLink**](RequisitionsApi.md#createASPSPAuthorizationLink) | **POST** /api/requisitions/{id}/links/ | 
[**deleteRequisition**](RequisitionsApi.md#deleteRequisition) | **DELETE** /api/requisitions/{id}/ | 
[**requisitionById**](RequisitionsApi.md#requisitionById) | **GET** /api/requisitions/{id}/ | 
[**retrieveAllRequisitions**](RequisitionsApi.md#retrieveAllRequisitions) | **GET** /api/requisitions/ | 



## createANewRequisition

> Requisition createANewRequisition(requisition)



API endpoints related to requisitions.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.RequisitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RequisitionsApi apiInstance = new RequisitionsApi(defaultClient);
        Requisition requisition = new Requisition(); // Requisition | 
        try {
            Requisition result = apiInstance.createANewRequisition(requisition);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequisitionsApi#createANewRequisition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requisition** | [**Requisition**](Requisition.md)|  |

### Return type

[**Requisition**](Requisition.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | requisition |  -  |


## createASPSPAuthorizationLink

> RequisitionLinks createASPSPAuthorizationLink(id, requisitionLinkParams)



Get links for user redirection.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.RequisitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RequisitionsApi apiInstance = new RequisitionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this requisition.
        RequisitionLinkParams requisitionLinkParams = new RequisitionLinkParams(); // RequisitionLinkParams | 
        try {
            RequisitionLinks result = apiInstance.createASPSPAuthorizationLink(id, requisitionLinkParams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequisitionsApi#createASPSPAuthorizationLink");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| A UUID string identifying this requisition. |
 **requisitionLinkParams** | [**RequisitionLinkParams**](RequisitionLinkParams.md)|  |

### Return type

[**RequisitionLinks**](RequisitionLinks.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | link to initiate authorization with ASPSP |  -  |


## deleteRequisition

> deleteRequisition(id)



Delete Requisition and all End User Agreements.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.RequisitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RequisitionsApi apiInstance = new RequisitionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this requisition.
        try {
            apiInstance.deleteRequisition(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequisitionsApi#deleteRequisition");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| A UUID string identifying this requisition. |

### Return type

null (empty response body)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No response body |  -  |


## requisitionById

> Requisition requisitionById(id)



API endpoints related to requisitions.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.RequisitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RequisitionsApi apiInstance = new RequisitionsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this requisition.
        try {
            Requisition result = apiInstance.requisitionById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequisitionsApi#requisitionById");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **UUID**| A UUID string identifying this requisition. |

### Return type

[**Requisition**](Requisition.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | requisition |  -  |


## retrieveAllRequisitions

> PaginatedRequisitionList retrieveAllRequisitions(limit, offset)



API endpoints related to requisitions.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.RequisitionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: cookieAuth
        ApiKeyAuth cookieAuth = (ApiKeyAuth) defaultClient.getAuthentication("cookieAuth");
        cookieAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //cookieAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: tokenAuth
        ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
        tokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tokenAuth.setApiKeyPrefix("Token");

        RequisitionsApi apiInstance = new RequisitionsApi(defaultClient);
        Integer limit = 56; // Integer | Number of results to return per page.
        Integer offset = 56; // Integer | The initial index from which to return the results.
        try {
            PaginatedRequisitionList result = apiInstance.retrieveAllRequisitions(limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RequisitionsApi#retrieveAllRequisitions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional]
 **offset** | **Integer**| The initial index from which to return the results. | [optional]

### Return type

[**PaginatedRequisitionList**](PaginatedRequisitionList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

