# CurriculumsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCurriculumAsync**](CurriculumsApi.md#createCurriculumAsync) | **POST** /api/v2/SocialService/Curriculums | Create a curriculum |
| [**deleteCurriculumAsync**](CurriculumsApi.md#deleteCurriculumAsync) | **DELETE** /api/v2/SocialService/Curriculums/{curriculumId} | Delete a curriculum |
| [**getCurriculumAsync**](CurriculumsApi.md#getCurriculumAsync) | **GET** /api/v2/SocialService/Curriculums/{curriculumId} | Get curriculum by ID |
| [**getCurriculumsAsync**](CurriculumsApi.md#getCurriculumsAsync) | **GET** /api/v2/SocialService/Curriculums | Get curricula |
| [**getCurriculumsCountAsync**](CurriculumsApi.md#getCurriculumsCountAsync) | **GET** /api/v2/SocialService/Curriculums/Count | Count curricula |
| [**patchCurriculumAsync**](CurriculumsApi.md#patchCurriculumAsync) | **PATCH** /api/v2/SocialService/Curriculums/{curriculumId} | Patch a curriculum |
| [**updateCurriculumAsync**](CurriculumsApi.md#updateCurriculumAsync) | **PUT** /api/v2/SocialService/Curriculums/{curriculumId} | Update a curriculum |


<a id="createCurriculumAsync"></a>
# **createCurriculumAsync**
> EmptyEnvelope createCurriculumAsync(socialProfileId, tenantId, apiVersion, xApiVersion, curriculumCreateDto)

Create a curriculum

Creates a curriculum (CV) on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val curriculumCreateDto : CurriculumCreateDto =  // CurriculumCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createCurriculumAsync(socialProfileId, tenantId, apiVersion, xApiVersion, curriculumCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumsApi#createCurriculumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumsApi#createCurriculumAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **curriculumCreateDto** | [**CurriculumCreateDto**](CurriculumCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCurriculumAsync"></a>
# **deleteCurriculumAsync**
> EmptyEnvelope deleteCurriculumAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion)

Delete a curriculum

Deletes a curriculum authored on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumsApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteCurriculumAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumsApi#deleteCurriculumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumsApi#deleteCurriculumAsync")
    e.printStackTrace()
}
```

### Parameters
| **curriculumId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="getCurriculumAsync"></a>
# **getCurriculumAsync**
> CurriculumDtoEnvelope getCurriculumAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion)

Get curriculum by ID

Retrieves a specific curriculum authored on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumsApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CurriculumDtoEnvelope = apiInstance.getCurriculumAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumsApi#getCurriculumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumsApi#getCurriculumAsync")
    e.printStackTrace()
}
```

### Parameters
| **curriculumId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CurriculumDtoEnvelope**](CurriculumDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurriculumsAsync"></a>
# **getCurriculumsAsync**
> CurriculumDtoListEnvelope getCurriculumsAsync(socialProfileId, tenantId, apiVersion, xApiVersion)

Get curricula

Retrieves the curricula (CVs) authored on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CurriculumDtoListEnvelope = apiInstance.getCurriculumsAsync(socialProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumsApi#getCurriculumsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumsApi#getCurriculumsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CurriculumDtoListEnvelope**](CurriculumDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurriculumsCountAsync"></a>
# **getCurriculumsCountAsync**
> Int32Envelope getCurriculumsCountAsync(socialProfileId, tenantId, apiVersion, xApiVersion)

Count curricula

Returns the count of curricula authored on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getCurriculumsCountAsync(socialProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumsApi#getCurriculumsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumsApi#getCurriculumsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="patchCurriculumAsync"></a>
# **patchCurriculumAsync**
> EmptyEnvelope patchCurriculumAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, operation)

Patch a curriculum

Partially updates an existing curriculum authored on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumsApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchCurriculumAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumsApi#patchCurriculumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumsApi#patchCurriculumAsync")
    e.printStackTrace()
}
```

### Parameters
| **curriculumId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="updateCurriculumAsync"></a>
# **updateCurriculumAsync**
> EmptyEnvelope updateCurriculumAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumUpdateDto)

Update a curriculum

Updates an existing curriculum authored on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumsApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val curriculumUpdateDto : CurriculumUpdateDto =  // CurriculumUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateCurriculumAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumsApi#updateCurriculumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumsApi#updateCurriculumAsync")
    e.printStackTrace()
}
```

### Parameters
| **curriculumId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **curriculumUpdateDto** | [**CurriculumUpdateDto**](CurriculumUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

