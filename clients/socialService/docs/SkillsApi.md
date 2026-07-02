# SkillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSkillAsync**](SkillsApi.md#createSkillAsync) | **POST** /api/v2/SocialService/Skills | Create a skill |
| [**deleteSkillAsync**](SkillsApi.md#deleteSkillAsync) | **DELETE** /api/v2/SocialService/Skills/{skillId} | Delete a skill |
| [**getSkillByIdAsync**](SkillsApi.md#getSkillByIdAsync) | **GET** /api/v2/SocialService/Skills/{skillId} | Get skill by ID |
| [**getSkillsAsync**](SkillsApi.md#getSkillsAsync) | **GET** /api/v2/SocialService/Skills | Get skills |
| [**getSkillsCountAsync**](SkillsApi.md#getSkillsCountAsync) | **GET** /api/v2/SocialService/Skills/Count | Count skills |
| [**patchSkillAsync**](SkillsApi.md#patchSkillAsync) | **PATCH** /api/v2/SocialService/Skills/{skillId} | Patch a skill |
| [**updateSkillAsync**](SkillsApi.md#updateSkillAsync) | **PUT** /api/v2/SocialService/Skills/{skillId} | Update a skill |


<a id="createSkillAsync"></a>
# **createSkillAsync**
> EmptyEnvelope createSkillAsync(tenantId, apiVersion, xApiVersion, skillCreateDto)

Create a skill

Creates a new skill catalog entry for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val skillCreateDto : SkillCreateDto =  // SkillCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSkillAsync(tenantId, apiVersion, xApiVersion, skillCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#createSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#createSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillCreateDto** | [**SkillCreateDto**](SkillCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSkillAsync"></a>
# **deleteSkillAsync**
> EmptyEnvelope deleteSkillAsync(skillId, tenantId, apiVersion, xApiVersion)

Delete a skill

Deletes a skill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkillsApi()
val skillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSkillAsync(skillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#deleteSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#deleteSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **skillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSkillByIdAsync"></a>
# **getSkillByIdAsync**
> SkillDtoEnvelope getSkillByIdAsync(skillId, tenantId, apiVersion, xApiVersion)

Get skill by ID

Retrieves a specific skill by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkillsApi()
val skillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SkillDtoEnvelope = apiInstance.getSkillByIdAsync(skillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#getSkillByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#getSkillByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **skillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SkillDtoEnvelope**](SkillDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSkillsAsync"></a>
# **getSkillsAsync**
> SkillDtoListEnvelope getSkillsAsync(tenantId, apiVersion, xApiVersion)

Get skills

Retrieves the skill catalog for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SkillDtoListEnvelope = apiInstance.getSkillsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#getSkillsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#getSkillsAsync")
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

[**SkillDtoListEnvelope**](SkillDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSkillsCountAsync"></a>
# **getSkillsCountAsync**
> Int32Envelope getSkillsCountAsync(tenantId, apiVersion, xApiVersion)

Count skills

Counts skill catalog entries for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSkillsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#getSkillsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#getSkillsCountAsync")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchSkillAsync"></a>
# **patchSkillAsync**
> EmptyEnvelope patchSkillAsync(skillId, tenantId, apiVersion, xApiVersion, operation)

Patch a skill

Partially updates an existing skill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkillsApi()
val skillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSkillAsync(skillId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#patchSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#patchSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **skillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSkillAsync"></a>
# **updateSkillAsync**
> EmptyEnvelope updateSkillAsync(skillId, tenantId, apiVersion, xApiVersion, skillUpdateDto)

Update a skill

Updates an existing skill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkillsApi()
val skillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val skillUpdateDto : SkillUpdateDto =  // SkillUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSkillAsync(skillId, tenantId, apiVersion, xApiVersion, skillUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SkillsApi#updateSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkillsApi#updateSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **skillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **skillUpdateDto** | [**SkillUpdateDto**](SkillUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

