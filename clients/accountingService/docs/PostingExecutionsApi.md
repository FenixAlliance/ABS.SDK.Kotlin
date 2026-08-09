# PostingExecutionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countPostingExecutionsAsync**](PostingExecutionsApi.md#countPostingExecutionsAsync) | **GET** /api/v2/AccountingService/PostingExecutions/Count | Count posting executions |
| [**getPostingExecutionsAsync**](PostingExecutionsApi.md#getPostingExecutionsAsync) | **GET** /api/v2/AccountingService/PostingExecutions | List posting executions |


<a id="countPostingExecutionsAsync"></a>
# **countPostingExecutionsAsync**
> Int32Envelope countPostingExecutionsAsync(tenantId, apiVersion, xApiVersion, postingExecutionDtoCollectionQueryParameters)

Count posting executions

Returns the count of the tenant&#39;s posting-inbox executions under the same OData shaping as the list read (e.g. $filter&#x3D;Status eq &#39;Rejected&#39; to count rejected intents). Requires journals_read.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PostingExecutionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val postingExecutionDtoCollectionQueryParameters : PostingExecutionDtoCollectionQueryParameters =  // PostingExecutionDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.countPostingExecutionsAsync(tenantId, apiVersion, xApiVersion, postingExecutionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostingExecutionsApi#countPostingExecutionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostingExecutionsApi#countPostingExecutionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postingExecutionDtoCollectionQueryParameters** | [**PostingExecutionDtoCollectionQueryParameters**](PostingExecutionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getPostingExecutionsAsync"></a>
# **getPostingExecutionsAsync**
> PostingExecutionDtoIReadOnlyListEnvelope getPostingExecutionsAsync(tenantId, apiVersion, xApiVersion, postingExecutionDtoCollectionQueryParameters)

List posting executions

Lists the tenant&#39;s posting-inbox executions (the durable evidence of every posting intent). Use OData to scope to a state — e.g. $filter&#x3D;Status eq &#39;Rejected&#39; for rejected intents, or Status eq &#39;PendingMapping&#39;/&#39;PendingPeriod&#39;/&#39;PendingRate&#39; for the retryable pending set — and to page/order. Requires journals_read.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PostingExecutionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val postingExecutionDtoCollectionQueryParameters : PostingExecutionDtoCollectionQueryParameters =  // PostingExecutionDtoCollectionQueryParameters | 
try {
    val result : PostingExecutionDtoIReadOnlyListEnvelope = apiInstance.getPostingExecutionsAsync(tenantId, apiVersion, xApiVersion, postingExecutionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PostingExecutionsApi#getPostingExecutionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PostingExecutionsApi#getPostingExecutionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postingExecutionDtoCollectionQueryParameters** | [**PostingExecutionDtoCollectionQueryParameters**](PostingExecutionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**PostingExecutionDtoIReadOnlyListEnvelope**](PostingExecutionDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

