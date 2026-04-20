# CourseAssignmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseAssignmentAsync**](CourseAssignmentsApi.md#createCourseAssignmentAsync) | **POST** /api/v2/LearningService/CourseAssignments | Create a new course assignment |
| [**deleteCourseAssignmentAsync**](CourseAssignmentsApi.md#deleteCourseAssignmentAsync) | **DELETE** /api/v2/LearningService/CourseAssignments/{assignmentId} | Delete a course assignment |
| [**getCourseAssignmentByIdAsync**](CourseAssignmentsApi.md#getCourseAssignmentByIdAsync) | **GET** /api/v2/LearningService/CourseAssignments/{assignmentId} | Get course assignment by ID |
| [**getCourseAssignmentsAsync**](CourseAssignmentsApi.md#getCourseAssignmentsAsync) | **GET** /api/v2/LearningService/CourseAssignments | Get all course assignments |
| [**getCourseAssignmentsCountAsync**](CourseAssignmentsApi.md#getCourseAssignmentsCountAsync) | **GET** /api/v2/LearningService/CourseAssignments/Count | Get course assignments count |
| [**updateCourseAssignmentAsync**](CourseAssignmentsApi.md#updateCourseAssignmentAsync) | **PUT** /api/v2/LearningService/CourseAssignments/{assignmentId} | Update a course assignment |


<a id="createCourseAssignmentAsync"></a>
# **createCourseAssignmentAsync**
> createCourseAssignmentAsync(tenantId, apiVersion, xApiVersion, courseAssignmentCreateDto)

Create a new course assignment

Creates a new course assignment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseAssignmentCreateDto : CourseAssignmentCreateDto =  // CourseAssignmentCreateDto | 
try {
    apiInstance.createCourseAssignmentAsync(tenantId, apiVersion, xApiVersion, courseAssignmentCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentsApi#createCourseAssignmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentsApi#createCourseAssignmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseAssignmentCreateDto** | [**CourseAssignmentCreateDto**](CourseAssignmentCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseAssignmentAsync"></a>
# **deleteCourseAssignmentAsync**
> deleteCourseAssignmentAsync(assignmentId, tenantId, apiVersion, xApiVersion)

Delete a course assignment

Deletes a course assignment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentsApi()
val assignmentId : kotlin.String = assignmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseAssignmentAsync(assignmentId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentsApi#deleteCourseAssignmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentsApi#deleteCourseAssignmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **assignmentId** | **kotlin.String**|  | |
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

<a id="getCourseAssignmentByIdAsync"></a>
# **getCourseAssignmentByIdAsync**
> CourseAssignmentDto getCourseAssignmentByIdAsync(assignmentId, apiVersion, xApiVersion)

Get course assignment by ID

Retrieves a specific course assignment by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentsApi()
val assignmentId : kotlin.String = assignmentId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseAssignmentDto = apiInstance.getCourseAssignmentByIdAsync(assignmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentsApi#getCourseAssignmentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentsApi#getCourseAssignmentByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **assignmentId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseAssignmentDto**](CourseAssignmentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseAssignmentsAsync"></a>
# **getCourseAssignmentsAsync**
> kotlin.collections.List&lt;CourseAssignmentDto&gt; getCourseAssignmentsAsync(tenantId, apiVersion, xApiVersion)

Get all course assignments

Retrieves all course assignments for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseAssignmentDto> = apiInstance.getCourseAssignmentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentsApi#getCourseAssignmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentsApi#getCourseAssignmentsAsync")
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

[**kotlin.collections.List&lt;CourseAssignmentDto&gt;**](CourseAssignmentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseAssignmentsCountAsync"></a>
# **getCourseAssignmentsCountAsync**
> kotlin.Int getCourseAssignmentsCountAsync(tenantId, apiVersion, xApiVersion)

Get course assignments count

Returns the count of course assignments for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseAssignmentsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentsApi#getCourseAssignmentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentsApi#getCourseAssignmentsCountAsync")
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

<a id="updateCourseAssignmentAsync"></a>
# **updateCourseAssignmentAsync**
> updateCourseAssignmentAsync(assignmentId, tenantId, apiVersion, xApiVersion, courseAssignmentUpdateDto)

Update a course assignment

Updates an existing course assignment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentsApi()
val assignmentId : kotlin.String = assignmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseAssignmentUpdateDto : CourseAssignmentUpdateDto =  // CourseAssignmentUpdateDto | 
try {
    apiInstance.updateCourseAssignmentAsync(assignmentId, tenantId, apiVersion, xApiVersion, courseAssignmentUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentsApi#updateCourseAssignmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentsApi#updateCourseAssignmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **assignmentId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseAssignmentUpdateDto** | [**CourseAssignmentUpdateDto**](CourseAssignmentUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

