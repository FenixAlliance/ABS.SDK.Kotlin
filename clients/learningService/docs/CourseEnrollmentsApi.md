# CourseEnrollmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseEnrollmentAsync**](CourseEnrollmentsApi.md#createCourseEnrollmentAsync) | **POST** /api/v2/LearningService/CourseEnrollments | Create a new course enrollment |
| [**deleteCourseEnrollmentAsync**](CourseEnrollmentsApi.md#deleteCourseEnrollmentAsync) | **DELETE** /api/v2/LearningService/CourseEnrollments/{courseEnrollmentId} | Delete a course enrollment |
| [**getCourseEnrollmentAsync**](CourseEnrollmentsApi.md#getCourseEnrollmentAsync) | **GET** /api/v2/LearningService/CourseEnrollments/{courseEnrollmentId} | Get course enrollment by ID |
| [**getEnrollmentsAsync**](CourseEnrollmentsApi.md#getEnrollmentsAsync) | **GET** /api/v2/LearningService/CourseEnrollments | Get all course enrollments |
| [**getEnrollmentsCountAsync**](CourseEnrollmentsApi.md#getEnrollmentsCountAsync) | **GET** /api/v2/LearningService/CourseEnrollments/Count | Get course enrollments count |
| [**getStudentCourseEnrollmentsAsync**](CourseEnrollmentsApi.md#getStudentCourseEnrollmentsAsync) | **GET** /api/v2/LearningService/CourseEnrollments/Student/{studentProfileId} | Get enrollments by student |
| [**updateCourseEnrollmentAsync**](CourseEnrollmentsApi.md#updateCourseEnrollmentAsync) | **PUT** /api/v2/LearningService/CourseEnrollments/{courseEnrollmentId} | Update a course enrollment |


<a id="createCourseEnrollmentAsync"></a>
# **createCourseEnrollmentAsync**
> createCourseEnrollmentAsync(tenantId, apiVersion, xApiVersion, courseEnrollmentCreateDto)

Create a new course enrollment

Creates a new course enrollment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseEnrollmentCreateDto : CourseEnrollmentCreateDto =  // CourseEnrollmentCreateDto | 
try {
    apiInstance.createCourseEnrollmentAsync(tenantId, apiVersion, xApiVersion, courseEnrollmentCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseEnrollmentsApi#createCourseEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseEnrollmentsApi#createCourseEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseEnrollmentCreateDto** | [**CourseEnrollmentCreateDto**](CourseEnrollmentCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseEnrollmentAsync"></a>
# **deleteCourseEnrollmentAsync**
> deleteCourseEnrollmentAsync(courseEnrollmentId, tenantId, apiVersion, xApiVersion)

Delete a course enrollment

Deletes a course enrollment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseEnrollmentsApi()
val courseEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseEnrollmentAsync(courseEnrollmentId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseEnrollmentsApi#deleteCourseEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseEnrollmentsApi#deleteCourseEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseEnrollmentId** | **java.util.UUID**|  | |
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

<a id="getCourseEnrollmentAsync"></a>
# **getCourseEnrollmentAsync**
> CourseEnrollmentDto getCourseEnrollmentAsync(courseEnrollmentId, tenantId, apiVersion, xApiVersion)

Get course enrollment by ID

Retrieves a specific course enrollment by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseEnrollmentsApi()
val courseEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseEnrollmentDto = apiInstance.getCourseEnrollmentAsync(courseEnrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseEnrollmentsApi#getCourseEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseEnrollmentsApi#getCourseEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseEnrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseEnrollmentDto**](CourseEnrollmentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnrollmentsAsync"></a>
# **getEnrollmentsAsync**
> kotlin.collections.List&lt;CourseEnrollmentDto&gt; getEnrollmentsAsync(tenantId, apiVersion, xApiVersion)

Get all course enrollments

Retrieves all course enrollments for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseEnrollmentDto> = apiInstance.getEnrollmentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseEnrollmentsApi#getEnrollmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseEnrollmentsApi#getEnrollmentsAsync")
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

[**kotlin.collections.List&lt;CourseEnrollmentDto&gt;**](CourseEnrollmentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnrollmentsCountAsync"></a>
# **getEnrollmentsCountAsync**
> kotlin.Int getEnrollmentsCountAsync(tenantId, apiVersion, xApiVersion)

Get course enrollments count

Returns the count of course enrollments for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getEnrollmentsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseEnrollmentsApi#getEnrollmentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseEnrollmentsApi#getEnrollmentsCountAsync")
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

<a id="getStudentCourseEnrollmentsAsync"></a>
# **getStudentCourseEnrollmentsAsync**
> kotlin.collections.List&lt;CourseEnrollmentDto&gt; getStudentCourseEnrollmentsAsync(studentProfileId, tenantId, apiVersion, xApiVersion)

Get enrollments by student

Retrieves all enrollments for a specific student.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseEnrollmentsApi()
val studentProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseEnrollmentDto> = apiInstance.getStudentCourseEnrollmentsAsync(studentProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseEnrollmentsApi#getStudentCourseEnrollmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseEnrollmentsApi#getStudentCourseEnrollmentsAsync")
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

[**kotlin.collections.List&lt;CourseEnrollmentDto&gt;**](CourseEnrollmentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateCourseEnrollmentAsync"></a>
# **updateCourseEnrollmentAsync**
> updateCourseEnrollmentAsync(courseEnrollmentId, tenantId, apiVersion, xApiVersion, courseEnrollmentUpdateDto)

Update a course enrollment

Updates an existing course enrollment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseEnrollmentsApi()
val courseEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseEnrollmentUpdateDto : CourseEnrollmentUpdateDto =  // CourseEnrollmentUpdateDto | 
try {
    apiInstance.updateCourseEnrollmentAsync(courseEnrollmentId, tenantId, apiVersion, xApiVersion, courseEnrollmentUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseEnrollmentsApi#updateCourseEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseEnrollmentsApi#updateCourseEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseEnrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseEnrollmentUpdateDto** | [**CourseEnrollmentUpdateDto**](CourseEnrollmentUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

