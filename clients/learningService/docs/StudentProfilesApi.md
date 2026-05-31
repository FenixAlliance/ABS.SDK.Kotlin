# StudentProfilesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2LearningServiceStudentProfilesCountGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesCountGet) | **GET** /api/v2/LearningService/StudentProfiles/Count |  |
| [**apiV2LearningServiceStudentProfilesGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesGet) | **GET** /api/v2/LearningService/StudentProfiles |  |
| [**apiV2LearningServiceStudentProfilesPost**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesPost) | **POST** /api/v2/LearningService/StudentProfiles |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet) | **GET** /api/v2/LearningService/StudentProfiles/{studentProfileId}/Average |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdDelete**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdDelete) | **DELETE** /api/v2/LearningService/StudentProfiles/{studentProfileId} |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdGet) | **GET** /api/v2/LearningService/StudentProfiles/{studentProfileId} |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet) | **GET** /api/v2/LearningService/StudentProfiles/{studentProfileId}/HoursCompleted |  |
| [**apiV2LearningServiceStudentProfilesStudentProfileIdPut**](StudentProfilesApi.md#apiV2LearningServiceStudentProfilesStudentProfileIdPut) | **PUT** /api/v2/LearningService/StudentProfiles/{studentProfileId} |  |


<a id="apiV2LearningServiceStudentProfilesCountGet"></a>
# **apiV2LearningServiceStudentProfilesCountGet**
> kotlin.Int apiV2LearningServiceStudentProfilesCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.apiV2LearningServiceStudentProfilesCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesCountGet")
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

<a id="apiV2LearningServiceStudentProfilesGet"></a>
# **apiV2LearningServiceStudentProfilesGet**
> kotlin.collections.List&lt;StudentProfileDto&gt; apiV2LearningServiceStudentProfilesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<StudentProfileDto> = apiInstance.apiV2LearningServiceStudentProfilesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesGet")
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

[**kotlin.collections.List&lt;StudentProfileDto&gt;**](StudentProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2LearningServiceStudentProfilesPost"></a>
# **apiV2LearningServiceStudentProfilesPost**
> apiV2LearningServiceStudentProfilesPost(tenantId, apiVersion, xApiVersion, studentProfileCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val studentProfileCreateDto : StudentProfileCreateDto =  // StudentProfileCreateDto | 
try {
    apiInstance.apiV2LearningServiceStudentProfilesPost(tenantId, apiVersion, xApiVersion, studentProfileCreateDto)
} catch (e: ClientException) {
    println("4xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **studentProfileCreateDto** | [**StudentProfileCreateDto**](StudentProfileCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet**
> AverageDto apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet(studentProfileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentProfilesApi()
val studentProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AverageDto = apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet(studentProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdAverageGet")
    e.printStackTrace()
}
```

### Parameters
| **studentProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AverageDto**](AverageDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdDelete"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdDelete**
> apiV2LearningServiceStudentProfilesStudentProfileIdDelete(studentProfileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentProfilesApi()
val studentProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdDelete(studentProfileId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **studentProfileId** | **java.util.UUID**|  | |
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

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdGet"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdGet**
> StudentProfileDto apiV2LearningServiceStudentProfilesStudentProfileIdGet(studentProfileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentProfilesApi()
val studentProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : StudentProfileDto = apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdGet(studentProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdGet")
    e.printStackTrace()
}
```

### Parameters
| **studentProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**StudentProfileDto**](StudentProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet**
> CountDto apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet(studentProfileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentProfilesApi()
val studentProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountDto = apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet(studentProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdHoursCompletedGet")
    e.printStackTrace()
}
```

### Parameters
| **studentProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountDto**](CountDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2LearningServiceStudentProfilesStudentProfileIdPut"></a>
# **apiV2LearningServiceStudentProfilesStudentProfileIdPut**
> apiV2LearningServiceStudentProfilesStudentProfileIdPut(studentProfileId, tenantId, apiVersion, xApiVersion, studentProfileUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StudentProfilesApi()
val studentProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val studentProfileUpdateDto : StudentProfileUpdateDto =  // StudentProfileUpdateDto | 
try {
    apiInstance.apiV2LearningServiceStudentProfilesStudentProfileIdPut(studentProfileId, tenantId, apiVersion, xApiVersion, studentProfileUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StudentProfilesApi#apiV2LearningServiceStudentProfilesStudentProfileIdPut")
    e.printStackTrace()
}
```

### Parameters
| **studentProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **studentProfileUpdateDto** | [**StudentProfileUpdateDto**](StudentProfileUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

