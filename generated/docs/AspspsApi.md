# AspspsApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllSupportedASPSPSInAGivenCountry**](AspspsApi.md#retrieveAllSupportedASPSPSInAGivenCountry) | **GET** /api/aspsps/ | 
[**retrieveDetailsAboutSpecificASPSP**](AspspsApi.md#retrieveDetailsAboutSpecificASPSP) | **GET** /api/aspsps/{id}/ | 



## retrieveAllSupportedASPSPSInAGivenCountry

> List&lt;Aspsp&gt; retrieveAllSupportedASPSPSInAGivenCountry(country)



List all ASPSPs available.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.AspspsApi;

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

        AspspsApi apiInstance = new AspspsApi(defaultClient);
        String country = "DE"; // String | ISO 3166 two-character country code
        try {
            List<Aspsp> result = apiInstance.retrieveAllSupportedASPSPSInAGivenCountry(country);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AspspsApi#retrieveAllSupportedASPSPSInAGivenCountry");
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
 **country** | **String**| ISO 3166 two-character country code |

### Return type

[**List&lt;Aspsp&gt;**](Aspsp.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list of supported ASPSPs in the country |  -  |


## retrieveDetailsAboutSpecificASPSP

> Aspsp retrieveDetailsAboutSpecificASPSP(id)



Get details about a specific ASPSP.

### Example

```java
// Import classes:
import com.github.simonhauck.unofficial.nordigen.ApiClient;
import com.github.simonhauck.unofficial.nordigen.ApiException;
import com.github.simonhauck.unofficial.nordigen.Configuration;
import com.github.simonhauck.unofficial.nordigen.auth.*;
import com.github.simonhauck.unofficial.nordigen.models.*;
import com.github.simonhauck.unofficial.nordigen.api.AspspsApi;

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

        AspspsApi apiInstance = new AspspsApi(defaultClient);
        String id = "N26_NTSBDEB1"; // String | 
        try {
            Aspsp result = apiInstance.retrieveDetailsAboutSpecificASPSP(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AspspsApi#retrieveDetailsAboutSpecificASPSP");
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
 **id** | **String**|  |

### Return type

[**Aspsp**](Aspsp.md)

### Authorization

[cookieAuth](../README.md#cookieAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ASPSP Representation |  -  |

