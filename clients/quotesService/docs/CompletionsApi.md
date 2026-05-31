# CompletionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2AiServiceCompletionsCompleteGet**](CompletionsApi.md#apiV2AiServiceCompletionsCompleteGet) | **GET** /api/v2/AiService/Completions/Complete |  |


<a id="apiV2AiServiceCompletionsCompleteGet"></a>
# **apiV2AiServiceCompletionsCompleteGet**
> apiV2AiServiceCompletionsCompleteGet(tenantId, conversationId, message)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CompletionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val conversationId : kotlin.String = conversationId_example // kotlin.String | 
val message : kotlin.String = message_example // kotlin.String | 
try {
    apiInstance.apiV2AiServiceCompletionsCompleteGet(tenantId, conversationId, message)
} catch (e: ClientException) {
    println("4xx response calling CompletionsApi#apiV2AiServiceCompletionsCompleteGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompletionsApi#apiV2AiServiceCompletionsCompleteGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **conversationId** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **message** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;odata.metadata=minimal;odata.streaming=true, application/json;odata.metadata=minimal;odata.streaming=false, application/json;odata.metadata=minimal, application/json;odata.metadata=full;odata.streaming=true, application/json;odata.metadata=full;odata.streaming=false, application/json;odata.metadata=full, application/json;odata.metadata=none;odata.streaming=true, application/json;odata.metadata=none;odata.streaming=false, application/json;odata.metadata=none, application/json;odata.streaming=true, application/json;odata.streaming=false, application/json, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=minimal;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=minimal;IEEE754Compatible=false, application/json;odata.metadata=minimal;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=full;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=full;IEEE754Compatible=false, application/json;odata.metadata=full;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=false, application/json;odata.metadata=none;odata.streaming=true;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=true, application/json;odata.metadata=none;odata.streaming=false;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=false, application/json;odata.metadata=none;IEEE754Compatible=true, application/json;odata.streaming=true;IEEE754Compatible=false, application/json;odata.streaming=true;IEEE754Compatible=true, application/json;odata.streaming=false;IEEE754Compatible=false, application/json;odata.streaming=false;IEEE754Compatible=true, application/json;IEEE754Compatible=false, application/json;IEEE754Compatible=true, application/octet-stream

