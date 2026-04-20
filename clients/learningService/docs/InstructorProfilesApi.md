# InstructorProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2LearningServiceInstructorProfilesCountGet**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesCountGet) | **GET** /api/v2/LearningService/InstructorProfiles/Count |  |
| [**apiV2LearningServiceInstructorProfilesGet**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesGet) | **GET** /api/v2/LearningService/InstructorProfiles |  |
| [**apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete) | **DELETE** /api/v2/LearningService/InstructorProfiles/{instructorProfileId} |  |
| [**apiV2LearningServiceInstructorProfilesInstructorProfileIdGet**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesInstructorProfileIdGet) | **GET** /api/v2/LearningService/InstructorProfiles/{instructorProfileId} |  |
| [**apiV2LearningServiceInstructorProfilesInstructorProfileIdPut**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesInstructorProfileIdPut) | **PUT** /api/v2/LearningService/InstructorProfiles/{instructorProfileId} |  |
| [**apiV2LearningServiceInstructorProfilesPost**](InstructorProfilesApi.md#apiV2LearningServiceInstructorProfilesPost) | **POST** /api/v2/LearningService/InstructorProfiles |  |


<a id="apiV2LearningServiceInstructorProfilesCountGet"></a>
# **apiV2LearningServiceInstructorProfilesCountGet**
> kotlin.Int apiV2LearningServiceInstructorProfilesCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InstructorProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.apiV2LearningServiceInstructorProfilesCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesCountGet")
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

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2LearningServiceInstructorProfilesGet"></a>
# **apiV2LearningServiceInstructorProfilesGet**
> kotlin.collections.List&lt;InstructorProfileDto&gt; apiV2LearningServiceInstructorProfilesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InstructorProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<InstructorProfileDto> = apiInstance.apiV2LearningServiceInstructorProfilesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesGet")
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

[**kotlin.collections.List&lt;InstructorProfileDto&gt;**](InstructorProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete"></a>
# **apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete**
> apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete(instructorProfileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InstructorProfilesApi()
val instructorProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete(instructorProfileId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **instructorProfileId** | **java.util.UUID**|  | |
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

<a id="apiV2LearningServiceInstructorProfilesInstructorProfileIdGet"></a>
# **apiV2LearningServiceInstructorProfilesInstructorProfileIdGet**
> InstructorProfileDto apiV2LearningServiceInstructorProfilesInstructorProfileIdGet(instructorProfileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InstructorProfilesApi()
val instructorProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InstructorProfileDto = apiInstance.apiV2LearningServiceInstructorProfilesInstructorProfileIdGet(instructorProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdGet")
    e.printStackTrace()
}
```

### Parameters
| **instructorProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**InstructorProfileDto**](InstructorProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2LearningServiceInstructorProfilesInstructorProfileIdPut"></a>
# **apiV2LearningServiceInstructorProfilesInstructorProfileIdPut**
> apiV2LearningServiceInstructorProfilesInstructorProfileIdPut(instructorProfileId, tenantId, apiVersion, xApiVersion, instructorProfileUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InstructorProfilesApi()
val instructorProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val instructorProfileUpdateDto : InstructorProfileUpdateDto =  // InstructorProfileUpdateDto | 
try {
    apiInstance.apiV2LearningServiceInstructorProfilesInstructorProfileIdPut(instructorProfileId, tenantId, apiVersion, xApiVersion, instructorProfileUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesInstructorProfileIdPut")
    e.printStackTrace()
}
```

### Parameters
| **instructorProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **instructorProfileUpdateDto** | [**InstructorProfileUpdateDto**](InstructorProfileUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2LearningServiceInstructorProfilesPost"></a>
# **apiV2LearningServiceInstructorProfilesPost**
> apiV2LearningServiceInstructorProfilesPost(tenantId, apiVersion, xApiVersion, instructorProfileCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InstructorProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val instructorProfileCreateDto : InstructorProfileCreateDto =  // InstructorProfileCreateDto | 
try {
    apiInstance.apiV2LearningServiceInstructorProfilesPost(tenantId, apiVersion, xApiVersion, instructorProfileCreateDto)
} catch (e: ClientException) {
    println("4xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InstructorProfilesApi#apiV2LearningServiceInstructorProfilesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **instructorProfileCreateDto** | [**InstructorProfileCreateDto**](InstructorProfileCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

