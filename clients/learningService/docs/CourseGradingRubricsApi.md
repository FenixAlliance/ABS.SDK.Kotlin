# CourseGradingRubricsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseGradingRubricAsync**](CourseGradingRubricsApi.md#createCourseGradingRubricAsync) | **POST** /api/v2/LearningService/CourseGradingRubrics | Create a course grading rubric |
| [**deleteCourseGradingRubricAsync**](CourseGradingRubricsApi.md#deleteCourseGradingRubricAsync) | **DELETE** /api/v2/LearningService/CourseGradingRubrics/{rubricId} | Delete a course grading rubric |
| [**getCourseGradingRubricByIdAsync**](CourseGradingRubricsApi.md#getCourseGradingRubricByIdAsync) | **GET** /api/v2/LearningService/CourseGradingRubrics/{rubricId} | Get course grading rubric by ID |
| [**getCourseGradingRubricsAsync**](CourseGradingRubricsApi.md#getCourseGradingRubricsAsync) | **GET** /api/v2/LearningService/CourseGradingRubrics | Get all course grading rubrics |
| [**getCourseGradingRubricsCountAsync**](CourseGradingRubricsApi.md#getCourseGradingRubricsCountAsync) | **GET** /api/v2/LearningService/CourseGradingRubrics/Count | Get course grading rubrics count |
| [**patchCourseGradingRubricAsync**](CourseGradingRubricsApi.md#patchCourseGradingRubricAsync) | **PATCH** /api/v2/LearningService/CourseGradingRubrics/{rubricId} | Patch a course grading rubric |
| [**updateCourseGradingRubricAsync**](CourseGradingRubricsApi.md#updateCourseGradingRubricAsync) | **PUT** /api/v2/LearningService/CourseGradingRubrics/{rubricId} | Update a course grading rubric |


<a id="createCourseGradingRubricAsync"></a>
# **createCourseGradingRubricAsync**
> createCourseGradingRubricAsync(tenantId, apiVersion, xApiVersion, courseGradingRubricCreateDto)

Create a course grading rubric

Creates a new course grading rubric for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseGradingRubricsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseGradingRubricCreateDto : CourseGradingRubricCreateDto =  // CourseGradingRubricCreateDto | 
try {
    apiInstance.createCourseGradingRubricAsync(tenantId, apiVersion, xApiVersion, courseGradingRubricCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseGradingRubricsApi#createCourseGradingRubricAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseGradingRubricsApi#createCourseGradingRubricAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseGradingRubricCreateDto** | [**CourseGradingRubricCreateDto**](CourseGradingRubricCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseGradingRubricAsync"></a>
# **deleteCourseGradingRubricAsync**
> deleteCourseGradingRubricAsync(rubricId, tenantId, apiVersion, xApiVersion)

Delete a course grading rubric

Deletes a course grading rubric by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseGradingRubricsApi()
val rubricId : kotlin.String = rubricId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseGradingRubricAsync(rubricId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseGradingRubricsApi#deleteCourseGradingRubricAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseGradingRubricsApi#deleteCourseGradingRubricAsync")
    e.printStackTrace()
}
```

### Parameters
| **rubricId** | **kotlin.String**|  | |
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

<a id="getCourseGradingRubricByIdAsync"></a>
# **getCourseGradingRubricByIdAsync**
> CourseGradingRubricDto getCourseGradingRubricByIdAsync(rubricId, apiVersion, xApiVersion)

Get course grading rubric by ID

Retrieves a specific course grading rubric by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseGradingRubricsApi()
val rubricId : kotlin.String = rubricId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseGradingRubricDto = apiInstance.getCourseGradingRubricByIdAsync(rubricId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseGradingRubricsApi#getCourseGradingRubricByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseGradingRubricsApi#getCourseGradingRubricByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **rubricId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseGradingRubricDto**](CourseGradingRubricDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseGradingRubricsAsync"></a>
# **getCourseGradingRubricsAsync**
> kotlin.collections.List&lt;CourseGradingRubricDto&gt; getCourseGradingRubricsAsync(tenantId, apiVersion, xApiVersion)

Get all course grading rubrics

Retrieves all course grading rubrics for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseGradingRubricsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseGradingRubricDto> = apiInstance.getCourseGradingRubricsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseGradingRubricsApi#getCourseGradingRubricsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseGradingRubricsApi#getCourseGradingRubricsAsync")
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

[**kotlin.collections.List&lt;CourseGradingRubricDto&gt;**](CourseGradingRubricDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseGradingRubricsCountAsync"></a>
# **getCourseGradingRubricsCountAsync**
> kotlin.Int getCourseGradingRubricsCountAsync(tenantId, apiVersion, xApiVersion)

Get course grading rubrics count

Returns the count of course grading rubrics for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseGradingRubricsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseGradingRubricsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseGradingRubricsApi#getCourseGradingRubricsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseGradingRubricsApi#getCourseGradingRubricsCountAsync")
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

<a id="patchCourseGradingRubricAsync"></a>
# **patchCourseGradingRubricAsync**
> patchCourseGradingRubricAsync(rubricId, tenantId, apiVersion, xApiVersion, operation)

Patch a course grading rubric

Partially updates an existing course grading rubric.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseGradingRubricsApi()
val rubricId : kotlin.String = rubricId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.patchCourseGradingRubricAsync(rubricId, tenantId, apiVersion, xApiVersion, operation)
} catch (e: ClientException) {
    println("4xx response calling CourseGradingRubricsApi#patchCourseGradingRubricAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseGradingRubricsApi#patchCourseGradingRubricAsync")
    e.printStackTrace()
}
```

### Parameters
| **rubricId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCourseGradingRubricAsync"></a>
# **updateCourseGradingRubricAsync**
> updateCourseGradingRubricAsync(rubricId, tenantId, apiVersion, xApiVersion, courseGradingRubricUpdateDto)

Update a course grading rubric

Updates an existing course grading rubric.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseGradingRubricsApi()
val rubricId : kotlin.String = rubricId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseGradingRubricUpdateDto : CourseGradingRubricUpdateDto =  // CourseGradingRubricUpdateDto | 
try {
    apiInstance.updateCourseGradingRubricAsync(rubricId, tenantId, apiVersion, xApiVersion, courseGradingRubricUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseGradingRubricsApi#updateCourseGradingRubricAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseGradingRubricsApi#updateCourseGradingRubricAsync")
    e.printStackTrace()
}
```

### Parameters
| **rubricId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseGradingRubricUpdateDto** | [**CourseGradingRubricUpdateDto**](CourseGradingRubricUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

