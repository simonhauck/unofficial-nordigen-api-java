# AgreementsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptEUA**](AgreementsApi.md#acceptEUA) | **PUT** /api/agreements/enduser/{id}/accept/ | 
[**createEUA**](AgreementsApi.md#createEUA) | **POST** /api/agreements/enduser/ | 
[**deleteEUAById**](AgreementsApi.md#deleteEUAById) | **DELETE** /api/agreements/enduser/{id}/ | 
[**retrieveAllEUAsForAnEndUser**](AgreementsApi.md#retrieveAllEUAsForAnEndUser) | **GET** /api/agreements/enduser/ | 
[**retrieveEUAById**](AgreementsApi.md#retrieveEUAById) | **GET** /api/agreements/enduser/{id}/ | 
[**retrieveEUAText**](AgreementsApi.md#retrieveEUAText) | **GET** /api/agreements/enduser/{id}/text/ | 



## acceptEUA

> EndUserAgreement acceptEUA(id, enduserAcceptanceDetails)



Accept an end-user agreement via the API.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.AgreementsApi;

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

        AgreementsApi apiInstance = new AgreementsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this end user agreement.
        EnduserAcceptanceDetails enduserAcceptanceDetails = new EnduserAcceptanceDetails(); // EnduserAcceptanceDetails | 
        try {
            EndUserAgreement result = apiInstance.acceptEUA(id, enduserAcceptanceDetails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgreementsApi#acceptEUA");
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
 **id** | **UUID**| A UUID string identifying this end user agreement. |
 **enduserAcceptanceDetails** | [**EnduserAcceptanceDetails**](EnduserAcceptanceDetails.md)|  |

### Return type

[**EndUserAgreement**](EndUserAgreement.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | EUA |  -  |


## createEUA

> EndUserAgreement createEUA(endUserAgreement)



API endpoints related to end-user agreements.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.AgreementsApi;

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

        AgreementsApi apiInstance = new AgreementsApi(defaultClient);
        EndUserAgreement endUserAgreement = new EndUserAgreement(); // EndUserAgreement | 
        try {
            EndUserAgreement result = apiInstance.createEUA(endUserAgreement);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgreementsApi#createEUA");
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
 **endUserAgreement** | [**EndUserAgreement**](EndUserAgreement.md)|  |

### Return type

[**EndUserAgreement**](EndUserAgreement.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: application/json, application/x-www-form-urlencoded, multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  |  -  |


## deleteEUAById

> deleteEUAById(id)



Delete End User Agreement.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.AgreementsApi;

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

        AgreementsApi apiInstance = new AgreementsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this end user agreement.
        try {
            apiInstance.deleteEUAById(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgreementsApi#deleteEUAById");
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
 **id** | **UUID**| A UUID string identifying this end user agreement. |

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


## retrieveAllEUAsForAnEndUser

> PaginatedEndUserAgreementList retrieveAllEUAsForAnEndUser(enduserId, limit, offset)



API endpoints related to end-user agreements.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.AgreementsApi;

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

        AgreementsApi apiInstance = new AgreementsApi(defaultClient);
        String enduserId = "enduserId_example"; // String | Your enduser ID, used for filtering results.
        Integer limit = 56; // Integer | Number of results to return per page.
        Integer offset = 56; // Integer | The initial index from which to return the results.
        try {
            PaginatedEndUserAgreementList result = apiInstance.retrieveAllEUAsForAnEndUser(enduserId, limit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgreementsApi#retrieveAllEUAsForAnEndUser");
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
 **enduserId** | **String**| Your enduser ID, used for filtering results. |
 **limit** | **Integer**| Number of results to return per page. | [optional]
 **offset** | **Integer**| The initial index from which to return the results. | [optional]

### Return type

[**PaginatedEndUserAgreementList**](PaginatedEndUserAgreementList.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## retrieveEUAById

> EndUserAgreement retrieveEUAById(id)



API endpoints related to end-user agreements.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.AgreementsApi;

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

        AgreementsApi apiInstance = new AgreementsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this end user agreement.
        try {
            EndUserAgreement result = apiInstance.retrieveEUAById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgreementsApi#retrieveEUAById");
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
 **id** | **UUID**| A UUID string identifying this end user agreement. |

### Return type

[**EndUserAgreement**](EndUserAgreement.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | EUA |  -  |


## retrieveEUAText

> retrieveEUAText(id)



Show the text of the end-user agreement.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.AgreementsApi;

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

        AgreementsApi apiInstance = new AgreementsApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | A UUID string identifying this end user agreement.
        try {
            apiInstance.retrieveEUAText(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AgreementsApi#retrieveEUAText");
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
 **id** | **UUID**| A UUID string identifying this end user agreement. |

### Return type

null (empty response body)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | EUA Text |  -  |

