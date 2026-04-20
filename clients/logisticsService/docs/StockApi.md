# StockApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getContactsAsync**](StockApi.md#getContactsAsync) | **GET** /api/v2/LogisticsService/Stock | Get all stock-related contacts |


<a id="getContactsAsync"></a>
# **getContactsAsync**
> ContactDtoListEnvelope getContactsAsync(tenantId, apiVersion, xApiVersion)

Get all stock-related contacts

Retrieves all business-owned contacts related to stock and logistics for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StockApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getContactsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StockApi#getContactsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StockApi#getContactsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

