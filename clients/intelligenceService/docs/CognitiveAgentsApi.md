# CognitiveAgentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCognitiveAgentAsync**](CognitiveAgentsApi.md#createCognitiveAgentAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents | Create a new cognitive agent |
| [**deleteCognitiveAgentAsync**](CognitiveAgentsApi.md#deleteCognitiveAgentAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveAgents/{id} | Delete a cognitive agent |
| [**getCognitiveAgentByIdAsync**](CognitiveAgentsApi.md#getCognitiveAgentByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/{id} | Get cognitive agent by ID |
| [**getCognitiveAgentsAsync**](CognitiveAgentsApi.md#getCognitiveAgentsAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents | Get all cognitive agents |
| [**getCognitiveAgentsCountAsync**](CognitiveAgentsApi.md#getCognitiveAgentsCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveAgents/Count | Get cognitive agents count |
| [**updateCognitiveAgentAsync**](CognitiveAgentsApi.md#updateCognitiveAgentAsync) | **PUT** /api/v2/IntelligenceService/CognitiveAgents/{id} | Update a cognitive agent |


<a id="createCognitiveAgentAsync"></a>
# **createCognitiveAgentAsync**
> createCognitiveAgentAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentCreateDto)

Create a new cognitive agent

Creates a new managed cognitive agent for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentCreateDto : CognitiveAgentCreateDto =  // CognitiveAgentCreateDto | 
try {
    apiInstance.createCognitiveAgentAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentsApi#createCognitiveAgentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentsApi#createCognitiveAgentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentCreateDto** | [**CognitiveAgentCreateDto**](CognitiveAgentCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCognitiveAgentAsync"></a>
# **deleteCognitiveAgentAsync**
> deleteCognitiveAgentAsync(id, tenantId, apiVersion, xApiVersion)

Delete a cognitive agent

Deletes a managed cognitive agent for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCognitiveAgentAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentsApi#deleteCognitiveAgentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentsApi#deleteCognitiveAgentAsync")
    e.printStackTrace()
}
```

### Parameters
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

<a id="getCognitiveAgentByIdAsync"></a>
# **getCognitiveAgentByIdAsync**
> CognitiveAgentDtoEnvelope getCognitiveAgentByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get cognitive agent by ID

Retrieves a specific managed cognitive agent by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CognitiveAgentDtoEnvelope = apiInstance.getCognitiveAgentByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentsApi#getCognitiveAgentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentsApi#getCognitiveAgentByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CognitiveAgentDtoEnvelope**](CognitiveAgentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCognitiveAgentsAsync"></a>
# **getCognitiveAgentsAsync**
> CognitiveAgentDtoListEnvelope getCognitiveAgentsAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentDtoCollectionQueryParameters)

Get all cognitive agents

Retrieves all managed cognitive agents for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentDtoCollectionQueryParameters : CognitiveAgentDtoCollectionQueryParameters =  // CognitiveAgentDtoCollectionQueryParameters | 
try {
    val result : CognitiveAgentDtoListEnvelope = apiInstance.getCognitiveAgentsAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentsApi#getCognitiveAgentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentsApi#getCognitiveAgentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentDtoCollectionQueryParameters** | [**CognitiveAgentDtoCollectionQueryParameters**](CognitiveAgentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveAgentDtoListEnvelope**](CognitiveAgentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCognitiveAgentsCountAsync"></a>
# **getCognitiveAgentsCountAsync**
> Int32Envelope getCognitiveAgentsCountAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentDtoCollectionQueryParameters)

Get cognitive agents count

Returns the count of managed cognitive agents for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentDtoCollectionQueryParameters : CognitiveAgentDtoCollectionQueryParameters =  // CognitiveAgentDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getCognitiveAgentsCountAsync(tenantId, apiVersion, xApiVersion, cognitiveAgentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentsApi#getCognitiveAgentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentsApi#getCognitiveAgentsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentDtoCollectionQueryParameters** | [**CognitiveAgentDtoCollectionQueryParameters**](CognitiveAgentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCognitiveAgentAsync"></a>
# **updateCognitiveAgentAsync**
> updateCognitiveAgentAsync(id, tenantId, apiVersion, xApiVersion, cognitiveAgentUpdateDto)

Update a cognitive agent

Updates an existing managed cognitive agent for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveAgentUpdateDto : CognitiveAgentUpdateDto =  // CognitiveAgentUpdateDto | 
try {
    apiInstance.updateCognitiveAgentAsync(id, tenantId, apiVersion, xApiVersion, cognitiveAgentUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentsApi#updateCognitiveAgentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentsApi#updateCognitiveAgentAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveAgentUpdateDto** | [**CognitiveAgentUpdateDto**](CognitiveAgentUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

