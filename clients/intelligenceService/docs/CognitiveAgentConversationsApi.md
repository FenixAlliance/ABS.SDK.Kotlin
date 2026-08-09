# CognitiveAgentConversationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCognitiveAgentConversationAsync**](CognitiveAgentConversationsApi.md#createCognitiveAgentConversationAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations | Create a new cognitive agent conversation |
| [**deleteCognitiveAgentConversationAsync**](CognitiveAgentConversationsApi.md#deleteCognitiveAgentConversationAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{id} | Delete a cognitive agent conversation |
| [**getCognitiveAgentConversationByIdAsync**](CognitiveAgentConversationsApi.md#getCognitiveAgentConversationByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{id} | Get a cognitive agent conversation by ID |
| [**getCognitiveAgentConversationsAsync**](CognitiveAgentConversationsApi.md#getCognitiveAgentConversationsAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations | Get all conversations for a cognitive agent |
| [**getCognitiveAgentConversationsCountAsync**](CognitiveAgentConversationsApi.md#getCognitiveAgentConversationsCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/Count | Get conversation count for a cognitive agent |
| [**updateCognitiveAgentConversationAsync**](CognitiveAgentConversationsApi.md#updateCognitiveAgentConversationAsync) | **PUT** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{id} | Update a cognitive agent conversation |


<a id="createCognitiveAgentConversationAsync"></a>
# **createCognitiveAgentConversationAsync**
> createCognitiveAgentConversationAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentConversationCreateDto)

Create a new cognitive agent conversation

Creates a new managed conversation for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentConversationsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentConversationCreateDto : CognitiveAgentConversationCreateDto =  // CognitiveAgentConversationCreateDto | 
try {
    apiInstance.createCognitiveAgentConversationAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentConversationCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentConversationsApi#createCognitiveAgentConversationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentConversationsApi#createCognitiveAgentConversationAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentConversationCreateDto** | [**CognitiveAgentConversationCreateDto**](CognitiveAgentConversationCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCognitiveAgentConversationAsync"></a>
# **deleteCognitiveAgentConversationAsync**
> deleteCognitiveAgentConversationAsync(agentId, id, tenantId, apiVersion, xApiVersion)

Delete a cognitive agent conversation

Deletes a managed conversation for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentConversationsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCognitiveAgentConversationAsync(agentId, id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentConversationsApi#deleteCognitiveAgentConversationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentConversationsApi#deleteCognitiveAgentConversationAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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
 - **Accept**: application/json

<a id="getCognitiveAgentConversationByIdAsync"></a>
# **getCognitiveAgentConversationByIdAsync**
> CognitiveAgentConversationDtoEnvelope getCognitiveAgentConversationByIdAsync(agentId, id, tenantId, apiVersion, xApiVersion)

Get a cognitive agent conversation by ID

Retrieves a specific managed conversation of a cognitive agent by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentConversationsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CognitiveAgentConversationDtoEnvelope = apiInstance.getCognitiveAgentConversationByIdAsync(agentId, id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentConversationsApi#getCognitiveAgentConversationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentConversationsApi#getCognitiveAgentConversationByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CognitiveAgentConversationDtoEnvelope**](CognitiveAgentConversationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCognitiveAgentConversationsAsync"></a>
# **getCognitiveAgentConversationsAsync**
> CognitiveAgentConversationDtoListEnvelope getCognitiveAgentConversationsAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentConversationDtoCollectionQueryParameters)

Get all conversations for a cognitive agent

Retrieves all managed conversations for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentConversationsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentConversationDtoCollectionQueryParameters : CognitiveAgentConversationDtoCollectionQueryParameters =  // CognitiveAgentConversationDtoCollectionQueryParameters | 
try {
    val result : CognitiveAgentConversationDtoListEnvelope = apiInstance.getCognitiveAgentConversationsAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentConversationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentConversationsApi#getCognitiveAgentConversationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentConversationsApi#getCognitiveAgentConversationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentConversationDtoCollectionQueryParameters** | [**CognitiveAgentConversationDtoCollectionQueryParameters**](CognitiveAgentConversationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentConversationDtoListEnvelope**](CognitiveAgentConversationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCognitiveAgentConversationsCountAsync"></a>
# **getCognitiveAgentConversationsCountAsync**
> Int32Envelope getCognitiveAgentConversationsCountAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentConversationDtoCollectionQueryParameters)

Get conversation count for a cognitive agent

Returns the count of managed conversations for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentConversationsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentConversationDtoCollectionQueryParameters : CognitiveAgentConversationDtoCollectionQueryParameters =  // CognitiveAgentConversationDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getCognitiveAgentConversationsCountAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentConversationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentConversationsApi#getCognitiveAgentConversationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentConversationsApi#getCognitiveAgentConversationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentConversationDtoCollectionQueryParameters** | [**CognitiveAgentConversationDtoCollectionQueryParameters**](CognitiveAgentConversationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCognitiveAgentConversationAsync"></a>
# **updateCognitiveAgentConversationAsync**
> updateCognitiveAgentConversationAsync(agentId, id, tenantId, apiVersion, xApiVersion, cognitiveAgentConversationUpdateDto)

Update a cognitive agent conversation

Updates an existing managed conversation for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentConversationsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentConversationUpdateDto : CognitiveAgentConversationUpdateDto =  // CognitiveAgentConversationUpdateDto | 
try {
    apiInstance.updateCognitiveAgentConversationAsync(agentId, id, tenantId, apiVersion, xApiVersion, cognitiveAgentConversationUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentConversationsApi#updateCognitiveAgentConversationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentConversationsApi#updateCognitiveAgentConversationAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentConversationUpdateDto** | [**CognitiveAgentConversationUpdateDto**](CognitiveAgentConversationUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

