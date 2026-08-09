# CognitiveSkillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCognitiveSkillAsync**](CognitiveSkillsApi.md#createCognitiveSkillAsync) | **POST** /api/v2/IntelligenceService/CognitiveSkills | Create a new cognitive skill |
| [**deleteCognitiveSkillAsync**](CognitiveSkillsApi.md#deleteCognitiveSkillAsync) | **DELETE** /api/v2/IntelligenceService/CognitiveSkills/{id} | Delete a cognitive skill |
| [**getCognitiveSkillByIdAsync**](CognitiveSkillsApi.md#getCognitiveSkillByIdAsync) | **GET** /api/v2/IntelligenceService/CognitiveSkills/{id} | Get cognitive skill by ID |
| [**getCognitiveSkillsAsync**](CognitiveSkillsApi.md#getCognitiveSkillsAsync) | **GET** /api/v2/IntelligenceService/CognitiveSkills | Get all cognitive skills |
| [**getCognitiveSkillsCountAsync**](CognitiveSkillsApi.md#getCognitiveSkillsCountAsync) | **GET** /api/v2/IntelligenceService/CognitiveSkills/Count | Get cognitive skills count |
| [**updateCognitiveSkillAsync**](CognitiveSkillsApi.md#updateCognitiveSkillAsync) | **PUT** /api/v2/IntelligenceService/CognitiveSkills/{id} | Update a cognitive skill |


<a id="createCognitiveSkillAsync"></a>
# **createCognitiveSkillAsync**
> createCognitiveSkillAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillCreateDto)

Create a new cognitive skill

Creates a new reusable cognitive skill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveSkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveSkillCreateDto : CognitiveSkillCreateDto =  // CognitiveSkillCreateDto | 
try {
    apiInstance.createCognitiveSkillAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveSkillsApi#createCognitiveSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveSkillsApi#createCognitiveSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveSkillCreateDto** | [**CognitiveSkillCreateDto**](CognitiveSkillCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCognitiveSkillAsync"></a>
# **deleteCognitiveSkillAsync**
> deleteCognitiveSkillAsync(id, tenantId, apiVersion, xApiVersion)

Delete a cognitive skill

Deletes a reusable cognitive skill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveSkillsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCognitiveSkillAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CognitiveSkillsApi#deleteCognitiveSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveSkillsApi#deleteCognitiveSkillAsync")
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

<a id="getCognitiveSkillByIdAsync"></a>
# **getCognitiveSkillByIdAsync**
> CognitiveSkillDtoEnvelope getCognitiveSkillByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get cognitive skill by ID

Retrieves a specific reusable cognitive skill by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveSkillsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CognitiveSkillDtoEnvelope = apiInstance.getCognitiveSkillByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveSkillsApi#getCognitiveSkillByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveSkillsApi#getCognitiveSkillByIdAsync")
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

[**CognitiveSkillDtoEnvelope**](CognitiveSkillDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCognitiveSkillsAsync"></a>
# **getCognitiveSkillsAsync**
> CognitiveSkillDtoListEnvelope getCognitiveSkillsAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillDtoCollectionQueryParameters)

Get all cognitive skills

Retrieves all reusable cognitive skills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveSkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveSkillDtoCollectionQueryParameters : CognitiveSkillDtoCollectionQueryParameters =  // CognitiveSkillDtoCollectionQueryParameters | 
try {
    val result : CognitiveSkillDtoListEnvelope = apiInstance.getCognitiveSkillsAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveSkillsApi#getCognitiveSkillsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveSkillsApi#getCognitiveSkillsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveSkillDtoCollectionQueryParameters** | [**CognitiveSkillDtoCollectionQueryParameters**](CognitiveSkillDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CognitiveSkillDtoListEnvelope**](CognitiveSkillDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCognitiveSkillsCountAsync"></a>
# **getCognitiveSkillsCountAsync**
> Int32Envelope getCognitiveSkillsCountAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillDtoCollectionQueryParameters)

Get cognitive skills count

Returns the count of reusable cognitive skills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveSkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveSkillDtoCollectionQueryParameters : CognitiveSkillDtoCollectionQueryParameters =  // CognitiveSkillDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getCognitiveSkillsCountAsync(tenantId, apiVersion, xApiVersion, cognitiveSkillDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveSkillsApi#getCognitiveSkillsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveSkillsApi#getCognitiveSkillsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cognitiveSkillDtoCollectionQueryParameters** | [**CognitiveSkillDtoCollectionQueryParameters**](CognitiveSkillDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCognitiveSkillAsync"></a>
# **updateCognitiveSkillAsync**
> updateCognitiveSkillAsync(id, tenantId, apiVersion, xApiVersion, cognitiveSkillUpdateDto)

Update a cognitive skill

Updates an existing reusable cognitive skill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveSkillsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cognitiveSkillUpdateDto : CognitiveSkillUpdateDto =  // CognitiveSkillUpdateDto | 
try {
    apiInstance.updateCognitiveSkillAsync(id, tenantId, apiVersion, xApiVersion, cognitiveSkillUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CognitiveSkillsApi#updateCognitiveSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveSkillsApi#updateCognitiveSkillAsync")
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
| **cognitiveSkillUpdateDto** | [**CognitiveSkillUpdateDto**](CognitiveSkillUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

