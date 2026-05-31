# MarginsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getQuoteAsync**](MarginsApi.md#getQuoteAsync) | **GET** /api/v2/SalesService/Margins/{marginId}/Details | Get margin details by ID |


<a id="getQuoteAsync"></a>
# **getQuoteAsync**
> getQuoteAsync(marginId, apiVersion, xApiVersion)

Get margin details by ID

Retrieves the details of a specific sales margin by its ID.

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
    apiInstance.getQuoteAsync(marginId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling MarginsApi#getQuoteAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarginsApi#getQuoteAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

