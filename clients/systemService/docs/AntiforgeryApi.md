# AntiforgeryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SystemServiceAntiforgeryGetAndStoreTokensGet**](AntiforgeryApi.md#apiV2SystemServiceAntiforgeryGetAndStoreTokensGet) | **GET** /api/v2/SystemService/Antiforgery/GetAndStoreTokens |  |
| [**apiV2SystemServiceAntiforgeryIsRequestValidGet**](AntiforgeryApi.md#apiV2SystemServiceAntiforgeryIsRequestValidGet) | **GET** /api/v2/SystemService/Antiforgery/IsRequestValid |  |


<a id="apiV2SystemServiceAntiforgeryGetAndStoreTokensGet"></a>
# **apiV2SystemServiceAntiforgeryGetAndStoreTokensGet**
> apiV2SystemServiceAntiforgeryGetAndStoreTokensGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AntiforgeryApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2SystemServiceAntiforgeryGetAndStoreTokensGet(apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling AntiforgeryApi#apiV2SystemServiceAntiforgeryGetAndStoreTokensGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntiforgeryApi#apiV2SystemServiceAntiforgeryGetAndStoreTokensGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="apiV2SystemServiceAntiforgeryIsRequestValidGet"></a>
# **apiV2SystemServiceAntiforgeryIsRequestValidGet**
> apiV2SystemServiceAntiforgeryIsRequestValidGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AntiforgeryApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2SystemServiceAntiforgeryIsRequestValidGet(apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling AntiforgeryApi#apiV2SystemServiceAntiforgeryIsRequestValidGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AntiforgeryApi#apiV2SystemServiceAntiforgeryIsRequestValidGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

