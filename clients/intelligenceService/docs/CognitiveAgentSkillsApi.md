# CognitiveAgentSkillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCognitiveAgentSkillAsync**](CognitiveAgentSkillsApi.md#createCognitiveAgentSkillAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills | Assign a skill to a cognitive agent |
| [**deleteCognitiveAgentSkillAsync**](CognitiveAgentSkillsApi.md#deleteCognitiveAgentSkillAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills/{id} | Remove a skill assignment from a cognitive agent |
| [**getCognitiveAgentSkillByIdAsync**](CognitiveAgentSkillsApi.md#getCognitiveAgentSkillByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills/{id} | Get a cognitive agent skill assignment by ID |
| [**getCognitiveAgentSkillsAsync**](CognitiveAgentSkillsApi.md#getCognitiveAgentSkillsAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills | Get all skill assignments for a cognitive agent |
| [**getCognitiveAgentSkillsCountAsync**](CognitiveAgentSkillsApi.md#getCognitiveAgentSkillsCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills/Count | Get skill assignment count for a cognitive agent |
| [**updateCognitiveAgentSkillAsync**](CognitiveAgentSkillsApi.md#updateCognitiveAgentSkillAsync) | **PUT** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Skills/{id} | Update a cognitive agent skill assignment |


<a id="createCognitiveAgentSkillAsync"></a>
# **createCognitiveAgentSkillAsync**
> createCognitiveAgentSkillAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentSkillCreateDto)

Assign a skill to a cognitive agent

Assigns a reusable catalog skill to the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentSkillsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentSkillCreateDto : CognitiveAgentSkillCreateDto =  // CognitiveAgentSkillCreateDto | 
try {
    apiInstance.createCognitiveAgentSkillAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentSkillCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentSkillsApi#createCognitiveAgentSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentSkillsApi#createCognitiveAgentSkillAsync")
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
| **cognitiveAgentSkillCreateDto** | [**CognitiveAgentSkillCreateDto**](CognitiveAgentSkillCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCognitiveAgentSkillAsync"></a>
# **deleteCognitiveAgentSkillAsync**
> deleteCognitiveAgentSkillAsync(agentId, id, tenantId, apiVersion, xApiVersion)

Remove a skill assignment from a cognitive agent

Removes a skill assignment from the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentSkillsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCognitiveAgentSkillAsync(agentId, id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentSkillsApi#deleteCognitiveAgentSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentSkillsApi#deleteCognitiveAgentSkillAsync")
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

<a id="getCognitiveAgentSkillByIdAsync"></a>
# **getCognitiveAgentSkillByIdAsync**
> CognitiveAgentSkillDtoEnvelope getCognitiveAgentSkillByIdAsync(agentId, id, tenantId, apiVersion, xApiVersion)

Get a cognitive agent skill assignment by ID

Retrieves a specific skill assignment of a cognitive agent by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentSkillsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CognitiveAgentSkillDtoEnvelope = apiInstance.getCognitiveAgentSkillByIdAsync(agentId, id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentSkillsApi#getCognitiveAgentSkillByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentSkillsApi#getCognitiveAgentSkillByIdAsync")
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

[**CognitiveAgentSkillDtoEnvelope**](CognitiveAgentSkillDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCognitiveAgentSkillsAsync"></a>
# **getCognitiveAgentSkillsAsync**
> CognitiveAgentSkillDtoListEnvelope getCognitiveAgentSkillsAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentSkillDtoCollectionQueryParameters)

Get all skill assignments for a cognitive agent

Retrieves all skill assignments for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentSkillsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentSkillDtoCollectionQueryParameters : CognitiveAgentSkillDtoCollectionQueryParameters =  // CognitiveAgentSkillDtoCollectionQueryParameters | 
try {
    val result : CognitiveAgentSkillDtoListEnvelope = apiInstance.getCognitiveAgentSkillsAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentSkillDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentSkillsApi#getCognitiveAgentSkillsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentSkillsApi#getCognitiveAgentSkillsAsync")
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
| **cognitiveAgentSkillDtoCollectionQueryParameters** | [**CognitiveAgentSkillDtoCollectionQueryParameters**](CognitiveAgentSkillDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentSkillDtoListEnvelope**](CognitiveAgentSkillDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCognitiveAgentSkillsCountAsync"></a>
# **getCognitiveAgentSkillsCountAsync**
> Int32Envelope getCognitiveAgentSkillsCountAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentSkillDtoCollectionQueryParameters)

Get skill assignment count for a cognitive agent

Returns the count of skill assignments for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentSkillsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentSkillDtoCollectionQueryParameters : CognitiveAgentSkillDtoCollectionQueryParameters =  // CognitiveAgentSkillDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getCognitiveAgentSkillsCountAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentSkillDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentSkillsApi#getCognitiveAgentSkillsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentSkillsApi#getCognitiveAgentSkillsCountAsync")
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
| **cognitiveAgentSkillDtoCollectionQueryParameters** | [**CognitiveAgentSkillDtoCollectionQueryParameters**](CognitiveAgentSkillDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCognitiveAgentSkillAsync"></a>
# **updateCognitiveAgentSkillAsync**
> updateCognitiveAgentSkillAsync(agentId, id, tenantId, apiVersion, xApiVersion, cognitiveAgentSkillUpdateDto)

Update a cognitive agent skill assignment

Updates the per-assignment overrides of a skill assignment for the specified agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentSkillsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentSkillUpdateDto : CognitiveAgentSkillUpdateDto =  // CognitiveAgentSkillUpdateDto | 
try {
    apiInstance.updateCognitiveAgentSkillAsync(agentId, id, tenantId, apiVersion, xApiVersion, cognitiveAgentSkillUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentSkillsApi#updateCognitiveAgentSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentSkillsApi#updateCognitiveAgentSkillAsync")
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
| **cognitiveAgentSkillUpdateDto** | [**CognitiveAgentSkillUpdateDto**](CognitiveAgentSkillUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

