# CognitiveAgentVariablesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCognitiveAgentVariableAsync**](CognitiveAgentVariablesApi.md#createCognitiveAgentVariableAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables | Add a variable to a cognitive agent |
| [**deleteCognitiveAgentVariableAsync**](CognitiveAgentVariablesApi.md#deleteCognitiveAgentVariableAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables/{id} | Remove a variable from a cognitive agent |
| [**getCognitiveAgentVariableByIdAsync**](CognitiveAgentVariablesApi.md#getCognitiveAgentVariableByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables/{id} | Get a cognitive agent variable by ID |
| [**getCognitiveAgentVariablesAsync**](CognitiveAgentVariablesApi.md#getCognitiveAgentVariablesAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables | Get all variables for a cognitive agent |
| [**getCognitiveAgentVariablesCountAsync**](CognitiveAgentVariablesApi.md#getCognitiveAgentVariablesCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables/Count | Get variable count for a cognitive agent |
| [**updateCognitiveAgentVariableAsync**](CognitiveAgentVariablesApi.md#updateCognitiveAgentVariableAsync) | **PUT** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Variables/{id} | Update a cognitive agent variable |


<a id="createCognitiveAgentVariableAsync"></a>
# **createCognitiveAgentVariableAsync**
> createCognitiveAgentVariableAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentVariableCreateDto)

Add a variable to a cognitive agent

Adds a key/value variable to the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentVariablesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentVariableCreateDto : CognitiveAgentVariableCreateDto =  // CognitiveAgentVariableCreateDto | 
try {
    apiInstance.createCognitiveAgentVariableAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentVariableCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentVariablesApi#createCognitiveAgentVariableAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentVariablesApi#createCognitiveAgentVariableAsync")
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
| **cognitiveAgentVariableCreateDto** | [**CognitiveAgentVariableCreateDto**](CognitiveAgentVariableCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCognitiveAgentVariableAsync"></a>
# **deleteCognitiveAgentVariableAsync**
> deleteCognitiveAgentVariableAsync(agentId, id, tenantId, apiVersion, xApiVersion)

Remove a variable from a cognitive agent

Removes a variable from the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentVariablesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCognitiveAgentVariableAsync(agentId, id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentVariablesApi#deleteCognitiveAgentVariableAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentVariablesApi#deleteCognitiveAgentVariableAsync")
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

<a id="getCognitiveAgentVariableByIdAsync"></a>
# **getCognitiveAgentVariableByIdAsync**
> CognitiveAgentVariableDtoEnvelope getCognitiveAgentVariableByIdAsync(agentId, id, tenantId, apiVersion, xApiVersion)

Get a cognitive agent variable by ID

Retrieves a specific variable of a cognitive agent by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentVariablesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CognitiveAgentVariableDtoEnvelope = apiInstance.getCognitiveAgentVariableByIdAsync(agentId, id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentVariablesApi#getCognitiveAgentVariableByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentVariablesApi#getCognitiveAgentVariableByIdAsync")
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

[**CognitiveAgentVariableDtoEnvelope**](CognitiveAgentVariableDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCognitiveAgentVariablesAsync"></a>
# **getCognitiveAgentVariablesAsync**
> CognitiveAgentVariableDtoListEnvelope getCognitiveAgentVariablesAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentVariableDtoCollectionQueryParameters)

Get all variables for a cognitive agent

Retrieves all key/value variables for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentVariablesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentVariableDtoCollectionQueryParameters : CognitiveAgentVariableDtoCollectionQueryParameters =  // CognitiveAgentVariableDtoCollectionQueryParameters | 
try {
    val result : CognitiveAgentVariableDtoListEnvelope = apiInstance.getCognitiveAgentVariablesAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentVariableDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentVariablesApi#getCognitiveAgentVariablesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentVariablesApi#getCognitiveAgentVariablesAsync")
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
| **cognitiveAgentVariableDtoCollectionQueryParameters** | [**CognitiveAgentVariableDtoCollectionQueryParameters**](CognitiveAgentVariableDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentVariableDtoListEnvelope**](CognitiveAgentVariableDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCognitiveAgentVariablesCountAsync"></a>
# **getCognitiveAgentVariablesCountAsync**
> Int32Envelope getCognitiveAgentVariablesCountAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentVariableDtoCollectionQueryParameters)

Get variable count for a cognitive agent

Returns the count of variables for the specified cognitive agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentVariablesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentVariableDtoCollectionQueryParameters : CognitiveAgentVariableDtoCollectionQueryParameters =  // CognitiveAgentVariableDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getCognitiveAgentVariablesCountAsync(agentId, tenantId, apiVersion, xApiVersion, cognitiveAgentVariableDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentVariablesApi#getCognitiveAgentVariablesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentVariablesApi#getCognitiveAgentVariablesCountAsync")
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
| **cognitiveAgentVariableDtoCollectionQueryParameters** | [**CognitiveAgentVariableDtoCollectionQueryParameters**](CognitiveAgentVariableDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCognitiveAgentVariableAsync"></a>
# **updateCognitiveAgentVariableAsync**
> updateCognitiveAgentVariableAsync(agentId, id, tenantId, apiVersion, xApiVersion, cognitiveAgentVariableUpdateDto)

Update a cognitive agent variable

Updates the value of a variable for the specified agent and tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentVariablesApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentVariableUpdateDto : CognitiveAgentVariableUpdateDto =  // CognitiveAgentVariableUpdateDto | 
try {
    apiInstance.updateCognitiveAgentVariableAsync(agentId, id, tenantId, apiVersion, xApiVersion, cognitiveAgentVariableUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentVariablesApi#updateCognitiveAgentVariableAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentVariablesApi#updateCognitiveAgentVariableAsync")
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
| **cognitiveAgentVariableUpdateDto** | [**CognitiveAgentVariableUpdateDto**](CognitiveAgentVariableUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

