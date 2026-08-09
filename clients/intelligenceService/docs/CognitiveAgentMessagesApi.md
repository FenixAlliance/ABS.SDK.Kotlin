# CognitiveAgentMessagesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCognitiveAgentMessageByIdAsync**](CognitiveAgentMessagesApi.md#getCognitiveAgentMessageByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{conversationId}/Messages/{id} | Get a cognitive agent conversation message by ID |
| [**getCognitiveAgentMessagesAsync**](CognitiveAgentMessagesApi.md#getCognitiveAgentMessagesAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{conversationId}/Messages | Get all messages for a cognitive agent conversation |
| [**getCognitiveAgentMessagesCountAsync**](CognitiveAgentMessagesApi.md#getCognitiveAgentMessagesCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{conversationId}/Messages/Count | Get message count for a cognitive agent conversation |


<a id="getCognitiveAgentMessageByIdAsync"></a>
# **getCognitiveAgentMessageByIdAsync**
> CognitiveAgentMessageDtoEnvelope getCognitiveAgentMessageByIdAsync(agentId, conversationId, id, tenantId, apiVersion, xApiVersion)

Get a cognitive agent conversation message by ID

Retrieves a specific durable message of a conversation by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentMessagesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CognitiveAgentMessageDtoEnvelope = apiInstance.getCognitiveAgentMessageByIdAsync(agentId, conversationId, id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentMessagesApi#getCognitiveAgentMessageByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentMessagesApi#getCognitiveAgentMessageByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **conversationId** | **java.util.UUID**|  | |
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CognitiveAgentMessageDtoEnvelope**](CognitiveAgentMessageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCognitiveAgentMessagesAsync"></a>
# **getCognitiveAgentMessagesAsync**
> CognitiveAgentMessageDtoListEnvelope getCognitiveAgentMessagesAsync(agentId, conversationId, tenantId, apiVersion, xApiVersion, cognitiveAgentMessageDtoCollectionQueryParameters)

Get all messages for a cognitive agent conversation

Retrieves all durable messages for the specified conversation, agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentMessagesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentMessageDtoCollectionQueryParameters : CognitiveAgentMessageDtoCollectionQueryParameters =  // CognitiveAgentMessageDtoCollectionQueryParameters | 
try {
    val result : CognitiveAgentMessageDtoListEnvelope = apiInstance.getCognitiveAgentMessagesAsync(agentId, conversationId, tenantId, apiVersion, xApiVersion, cognitiveAgentMessageDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentMessagesApi#getCognitiveAgentMessagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentMessagesApi#getCognitiveAgentMessagesAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **conversationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentMessageDtoCollectionQueryParameters** | [**CognitiveAgentMessageDtoCollectionQueryParameters**](CognitiveAgentMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentMessageDtoListEnvelope**](CognitiveAgentMessageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCognitiveAgentMessagesCountAsync"></a>
# **getCognitiveAgentMessagesCountAsync**
> Int32Envelope getCognitiveAgentMessagesCountAsync(agentId, conversationId, tenantId, apiVersion, xApiVersion, cognitiveAgentMessageDtoCollectionQueryParameters)

Get message count for a cognitive agent conversation

Returns the count of durable messages for the specified conversation, agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentMessagesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentMessageDtoCollectionQueryParameters : CognitiveAgentMessageDtoCollectionQueryParameters =  // CognitiveAgentMessageDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getCognitiveAgentMessagesCountAsync(agentId, conversationId, tenantId, apiVersion, xApiVersion, cognitiveAgentMessageDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentMessagesApi#getCognitiveAgentMessagesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentMessagesApi#getCognitiveAgentMessagesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **conversationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentMessageDtoCollectionQueryParameters** | [**CognitiveAgentMessageDtoCollectionQueryParameters**](CognitiveAgentMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

