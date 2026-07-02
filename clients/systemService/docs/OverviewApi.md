# OverviewApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSystemOverview**](OverviewApi.md#getSystemOverview) | **GET** /api/v2/SystemService/Overview | Get system overview information |


<a id="getSystemOverview"></a>
# **getSystemOverview**
> SystemOverviewDtoEnvelope getSystemOverview(apiVersion, xApiVersion)

Get system overview information

Returns runtime, memory, and entity count information for the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OverviewApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SystemOverviewDtoEnvelope = apiInstance.getSystemOverview(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OverviewApi#getSystemOverview")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OverviewApi#getSystemOverview")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SystemOverviewDtoEnvelope**](SystemOverviewDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

