# CurriculumExperiencesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCurriculumExperienceAsync**](CurriculumExperiencesApi.md#createCurriculumExperienceAsync) | **POST** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences | Create a curriculum experience |
| [**deleteCurriculumExperienceAsync**](CurriculumExperiencesApi.md#deleteCurriculumExperienceAsync) | **DELETE** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/{experienceId} | Delete a curriculum experience |
| [**getCurriculumExperienceAsync**](CurriculumExperiencesApi.md#getCurriculumExperienceAsync) | **GET** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/{experienceId} | Get curriculum experience by ID |
| [**getCurriculumExperiencesAsync**](CurriculumExperiencesApi.md#getCurriculumExperiencesAsync) | **GET** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences | Get curriculum experiences |
| [**getCurriculumExperiencesCountAsync**](CurriculumExperiencesApi.md#getCurriculumExperiencesCountAsync) | **GET** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/Count | Count curriculum experiences |
| [**patchCurriculumExperienceAsync**](CurriculumExperiencesApi.md#patchCurriculumExperienceAsync) | **PATCH** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/{experienceId} | Patch a curriculum experience |
| [**updateCurriculumExperienceAsync**](CurriculumExperiencesApi.md#updateCurriculumExperienceAsync) | **PUT** /api/v2/SocialService/Curriculums/{curriculumId}/Experiences/{experienceId} | Update a curriculum experience |


<a id="createCurriculumExperienceAsync"></a>
# **createCurriculumExperienceAsync**
> EmptyEnvelope createCurriculumExperienceAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceCreateDto)

Create a curriculum experience

Adds a work-experience record to a curriculum authored on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumExperiencesApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val curriculumExperienceCreateDto : CurriculumExperienceCreateDto =  // CurriculumExperienceCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createCurriculumExperienceAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumExperiencesApi#createCurriculumExperienceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumExperiencesApi#createCurriculumExperienceAsync")
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
| **curriculumExperienceCreateDto** | [**CurriculumExperienceCreateDto**](CurriculumExperienceCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCurriculumExperienceAsync"></a>
# **deleteCurriculumExperienceAsync**
> EmptyEnvelope deleteCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion)

Delete a curriculum experience

Removes a work-experience record from a curriculum.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumExperiencesApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val experienceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumExperiencesApi#deleteCurriculumExperienceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumExperiencesApi#deleteCurriculumExperienceAsync")
    e.printStackTrace()
}
```

### Parameters
| **curriculumId** | **java.util.UUID**|  | |
| **experienceId** | **java.util.UUID**|  | |
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

<a id="getCurriculumExperienceAsync"></a>
# **getCurriculumExperienceAsync**
> CurriculumExperienceDtoEnvelope getCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion)

Get curriculum experience by ID

Retrieves a specific work-experience record of a curriculum.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumExperiencesApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val experienceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CurriculumExperienceDtoEnvelope = apiInstance.getCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumExperiencesApi#getCurriculumExperienceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumExperiencesApi#getCurriculumExperienceAsync")
    e.printStackTrace()
}
```

### Parameters
| **curriculumId** | **java.util.UUID**|  | |
| **experienceId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CurriculumExperienceDtoEnvelope**](CurriculumExperienceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurriculumExperiencesAsync"></a>
# **getCurriculumExperiencesAsync**
> CurriculumExperienceDtoListEnvelope getCurriculumExperiencesAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion)

Get curriculum experiences

Retrieves the work-experience records of a curriculum authored on the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumExperiencesApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CurriculumExperienceDtoListEnvelope = apiInstance.getCurriculumExperiencesAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumExperiencesApi#getCurriculumExperiencesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumExperiencesApi#getCurriculumExperiencesAsync")
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

[**CurriculumExperienceDtoListEnvelope**](CurriculumExperienceDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurriculumExperiencesCountAsync"></a>
# **getCurriculumExperiencesCountAsync**
> Int32Envelope getCurriculumExperiencesCountAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion)

Count curriculum experiences

Returns the count of work-experience records of a curriculum.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumExperiencesApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getCurriculumExperiencesCountAsync(curriculumId, socialProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumExperiencesApi#getCurriculumExperiencesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumExperiencesApi#getCurriculumExperiencesCountAsync")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchCurriculumExperienceAsync"></a>
# **patchCurriculumExperienceAsync**
> EmptyEnvelope patchCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion, operation)

Patch a curriculum experience

Partially updates an existing work-experience record of a curriculum.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumExperiencesApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val experienceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumExperiencesApi#patchCurriculumExperienceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumExperiencesApi#patchCurriculumExperienceAsync")
    e.printStackTrace()
}
```

### Parameters
| **curriculumId** | **java.util.UUID**|  | |
| **experienceId** | **java.util.UUID**|  | |
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

<a id="updateCurriculumExperienceAsync"></a>
# **updateCurriculumExperienceAsync**
> EmptyEnvelope updateCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceUpdateDto)

Update a curriculum experience

Updates an existing work-experience record of a curriculum.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurriculumExperiencesApi()
val curriculumId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val experienceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val curriculumExperienceUpdateDto : CurriculumExperienceUpdateDto =  // CurriculumExperienceUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateCurriculumExperienceAsync(curriculumId, experienceId, socialProfileId, tenantId, apiVersion, xApiVersion, curriculumExperienceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurriculumExperiencesApi#updateCurriculumExperienceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurriculumExperiencesApi#updateCurriculumExperienceAsync")
    e.printStackTrace()
}
```

### Parameters
| **curriculumId** | **java.util.UUID**|  | |
| **experienceId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **curriculumExperienceUpdateDto** | [**CurriculumExperienceUpdateDto**](CurriculumExperienceUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

