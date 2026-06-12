# TrainingProgramCoursesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTrainingProgramCourseAsync**](TrainingProgramCoursesApi.md#createTrainingProgramCourseAsync) | **POST** /api/v2/HrmsService/TrainingProgramCourses | Create a training program course |
| [**deleteTrainingProgramCourseAsync**](TrainingProgramCoursesApi.md#deleteTrainingProgramCourseAsync) | **DELETE** /api/v2/HrmsService/TrainingProgramCourses/{courseId} | Delete a training program course |
| [**getTrainingProgramCourseByIdAsync**](TrainingProgramCoursesApi.md#getTrainingProgramCourseByIdAsync) | **GET** /api/v2/HrmsService/TrainingProgramCourses/{courseId} | Get training program course by ID |
| [**getTrainingProgramCoursesAsync**](TrainingProgramCoursesApi.md#getTrainingProgramCoursesAsync) | **GET** /api/v2/HrmsService/TrainingProgramCourses | Get training program courses |
| [**getTrainingProgramCoursesCountAsync**](TrainingProgramCoursesApi.md#getTrainingProgramCoursesCountAsync) | **GET** /api/v2/HrmsService/TrainingProgramCourses/Count | Count training program courses |
| [**patchTrainingProgramCourseAsync**](TrainingProgramCoursesApi.md#patchTrainingProgramCourseAsync) | **PATCH** /api/v2/HrmsService/TrainingProgramCourses/{courseId} | Patch a training program course |
| [**updateTrainingProgramCourseAsync**](TrainingProgramCoursesApi.md#updateTrainingProgramCourseAsync) | **PUT** /api/v2/HrmsService/TrainingProgramCourses/{courseId} | Update a training program course |


<a id="createTrainingProgramCourseAsync"></a>
# **createTrainingProgramCourseAsync**
> EmptyEnvelope createTrainingProgramCourseAsync(tenantId, apiVersion, xApiVersion, trainingProgramCourseCreateDto)

Create a training program course

Creates a new training program course for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramCoursesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trainingProgramCourseCreateDto : TrainingProgramCourseCreateDto =  // TrainingProgramCourseCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTrainingProgramCourseAsync(tenantId, apiVersion, xApiVersion, trainingProgramCourseCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramCoursesApi#createTrainingProgramCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramCoursesApi#createTrainingProgramCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trainingProgramCourseCreateDto** | [**TrainingProgramCourseCreateDto**](TrainingProgramCourseCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTrainingProgramCourseAsync"></a>
# **deleteTrainingProgramCourseAsync**
> EmptyEnvelope deleteTrainingProgramCourseAsync(courseId, tenantId, apiVersion, xApiVersion)

Delete a training program course

Deletes a training program course for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramCoursesApi()
val courseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTrainingProgramCourseAsync(courseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramCoursesApi#deleteTrainingProgramCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramCoursesApi#deleteTrainingProgramCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **java.util.UUID**|  | |
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

<a id="getTrainingProgramCourseByIdAsync"></a>
# **getTrainingProgramCourseByIdAsync**
> TrainingProgramCourseDtoEnvelope getTrainingProgramCourseByIdAsync(courseId, tenantId, apiVersion, xApiVersion)

Get training program course by ID

Retrieves a specific training program course by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramCoursesApi()
val courseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrainingProgramCourseDtoEnvelope = apiInstance.getTrainingProgramCourseByIdAsync(courseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramCoursesApi#getTrainingProgramCourseByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramCoursesApi#getTrainingProgramCourseByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TrainingProgramCourseDtoEnvelope**](TrainingProgramCourseDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTrainingProgramCoursesAsync"></a>
# **getTrainingProgramCoursesAsync**
> TrainingProgramCourseDtoListEnvelope getTrainingProgramCoursesAsync(tenantId, apiVersion, xApiVersion)

Get training program courses

Retrieves training program courses for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramCoursesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrainingProgramCourseDtoListEnvelope = apiInstance.getTrainingProgramCoursesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramCoursesApi#getTrainingProgramCoursesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramCoursesApi#getTrainingProgramCoursesAsync")
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

[**TrainingProgramCourseDtoListEnvelope**](TrainingProgramCourseDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTrainingProgramCoursesCountAsync"></a>
# **getTrainingProgramCoursesCountAsync**
> Int32Envelope getTrainingProgramCoursesCountAsync(tenantId, apiVersion, xApiVersion)

Count training program courses

Counts training program courses for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramCoursesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTrainingProgramCoursesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramCoursesApi#getTrainingProgramCoursesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramCoursesApi#getTrainingProgramCoursesCountAsync")
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

<a id="patchTrainingProgramCourseAsync"></a>
# **patchTrainingProgramCourseAsync**
> EmptyEnvelope patchTrainingProgramCourseAsync(courseId, tenantId, apiVersion, xApiVersion, operation)

Patch a training program course

Partially updates an existing training program course for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramCoursesApi()
val courseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchTrainingProgramCourseAsync(courseId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramCoursesApi#patchTrainingProgramCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramCoursesApi#patchTrainingProgramCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **java.util.UUID**|  | |
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

<a id="updateTrainingProgramCourseAsync"></a>
# **updateTrainingProgramCourseAsync**
> EmptyEnvelope updateTrainingProgramCourseAsync(courseId, tenantId, apiVersion, xApiVersion, trainingProgramCourseUpdateDto)

Update a training program course

Updates an existing training program course for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramCoursesApi()
val courseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trainingProgramCourseUpdateDto : TrainingProgramCourseUpdateDto =  // TrainingProgramCourseUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTrainingProgramCourseAsync(courseId, tenantId, apiVersion, xApiVersion, trainingProgramCourseUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramCoursesApi#updateTrainingProgramCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramCoursesApi#updateTrainingProgramCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trainingProgramCourseUpdateDto** | [**TrainingProgramCourseUpdateDto**](TrainingProgramCourseUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

