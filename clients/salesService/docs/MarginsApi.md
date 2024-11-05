# MarginsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SalesServiceMarginsMarginIdDetailsGet**](MarginsApi.md#apiV2SalesServiceMarginsMarginIdDetailsGet) | **GET** /api/v2/SalesService/Margins/{marginId}/Details |  |


<a id="apiV2SalesServiceMarginsMarginIdDetailsGet"></a>
# **apiV2SalesServiceMarginsMarginIdDetailsGet**
> apiV2SalesServiceMarginsMarginIdDetailsGet(marginId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarginsApi()
val marginId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2SalesServiceMarginsMarginIdDetailsGet(marginId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling MarginsApi#apiV2SalesServiceMarginsMarginIdDetailsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarginsApi#apiV2SalesServiceMarginsMarginIdDetailsGet")
    e.printStackTrace()
}
```

### Parameters
| **marginId** | **java.util.UUID**|  | |
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

