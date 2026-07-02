# AntiforgeryApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAndStoreTokens**](AntiforgeryApi.md#getAndStoreTokens) | **GET** /api/v2/SystemService/Antiforgery/GetAndStoreTokens | Get and store antiforgery tokens |
| [**isRequestValidAsync**](AntiforgeryApi.md#isRequestValidAsync) | **GET** /api/v2/SystemService/Antiforgery/IsRequestValid | Validate antiforgery request |


<a id="getAndStoreTokens"></a>
# **getAndStoreTokens**
> getAndStoreTokens(apiVersion, xApiVersion)

Get and store antiforgery tokens

Generates antiforgery tokens and stores them in the current HTTP context.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AntiforgeryApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getAndStoreTokens(apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling AntiforgeryApi#getAndStoreTokens")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntiforgeryApi#getAndStoreTokens")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="isRequestValidAsync"></a>
# **isRequestValidAsync**
> isRequestValidAsync(apiVersion, xApiVersion)

Validate antiforgery request

Validates whether the current HTTP request contains a valid antiforgery token.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AntiforgeryApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.isRequestValidAsync(apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling AntiforgeryApi#isRequestValidAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntiforgeryApi#isRequestValidAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

