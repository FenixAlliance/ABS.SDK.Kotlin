# CourseCohortsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseCohortAsync**](CourseCohortsApi.md#createCourseCohortAsync) | **POST** /api/v2/LearningService/CourseCohorts | Create a new course cohort |
| [**deleteCourseCohortAsync**](CourseCohortsApi.md#deleteCourseCohortAsync) | **DELETE** /api/v2/LearningService/CourseCohorts/{cohortId} | Delete a course cohort |
| [**getCourseCohortByIdAsync**](CourseCohortsApi.md#getCourseCohortByIdAsync) | **GET** /api/v2/LearningService/CourseCohorts/{cohortId} | Get course cohort by ID |
| [**getCourseCohortsAsync**](CourseCohortsApi.md#getCourseCohortsAsync) | **GET** /api/v2/LearningService/CourseCohorts | Get all course cohorts |
| [**getCourseCohortsCountAsync**](CourseCohortsApi.md#getCourseCohortsCountAsync) | **GET** /api/v2/LearningService/CourseCohorts/Count | Get course cohorts count |
| [**updateCourseCohortAsync**](CourseCohortsApi.md#updateCourseCohortAsync) | **PUT** /api/v2/LearningService/CourseCohorts/{cohortId} | Update a course cohort |


<a id="createCourseCohortAsync"></a>
# **createCourseCohortAsync**
> createCourseCohortAsync(tenantId, apiVersion, xApiVersion, courseCohortCreateDto)

Create a new course cohort

Creates a new course cohort for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCohortsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCohortCreateDto : CourseCohortCreateDto =  // CourseCohortCreateDto | 
try {
    apiInstance.createCourseCohortAsync(tenantId, apiVersion, xApiVersion, courseCohortCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseCohortsApi#createCourseCohortAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCohortsApi#createCourseCohortAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCohortCreateDto** | [**CourseCohortCreateDto**](CourseCohortCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseCohortAsync"></a>
# **deleteCourseCohortAsync**
> deleteCourseCohortAsync(cohortId, tenantId, apiVersion, xApiVersion)

Delete a course cohort

Deletes a course cohort for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCohortsApi()
val cohortId : kotlin.String = cohortId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseCohortAsync(cohortId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseCohortsApi#deleteCourseCohortAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCohortsApi#deleteCourseCohortAsync")
    e.printStackTrace()
}
```

### Parameters
| **cohortId** | **kotlin.String**|  | |
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

<a id="getCourseCohortByIdAsync"></a>
# **getCourseCohortByIdAsync**
> CourseCohortDto getCourseCohortByIdAsync(cohortId, apiVersion, xApiVersion)

Get course cohort by ID

Retrieves a specific course cohort by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCohortsApi()
val cohortId : kotlin.String = cohortId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseCohortDto = apiInstance.getCourseCohortByIdAsync(cohortId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCohortsApi#getCourseCohortByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCohortsApi#getCourseCohortByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **cohortId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseCohortDto**](CourseCohortDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCohortsAsync"></a>
# **getCourseCohortsAsync**
> kotlin.collections.List&lt;CourseCohortDto&gt; getCourseCohortsAsync(tenantId, apiVersion, xApiVersion)

Get all course cohorts

Retrieves all course cohorts for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCohortsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseCohortDto> = apiInstance.getCourseCohortsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCohortsApi#getCourseCohortsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCohortsApi#getCourseCohortsAsync")
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

[**kotlin.collections.List&lt;CourseCohortDto&gt;**](CourseCohortDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCohortsCountAsync"></a>
# **getCourseCohortsCountAsync**
> kotlin.Int getCourseCohortsCountAsync(tenantId, apiVersion, xApiVersion)

Get course cohorts count

Returns the count of course cohorts for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCohortsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseCohortsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCohortsApi#getCourseCohortsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCohortsApi#getCourseCohortsCountAsync")
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

<a id="updateCourseCohortAsync"></a>
# **updateCourseCohortAsync**
> updateCourseCohortAsync(cohortId, tenantId, apiVersion, xApiVersion, courseCohortUpdateDto)

Update a course cohort

Updates an existing course cohort for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCohortsApi()
val cohortId : kotlin.String = cohortId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCohortUpdateDto : CourseCohortUpdateDto =  // CourseCohortUpdateDto | 
try {
    apiInstance.updateCourseCohortAsync(cohortId, tenantId, apiVersion, xApiVersion, courseCohortUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseCohortsApi#updateCourseCohortAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCohortsApi#updateCourseCohortAsync")
    e.printStackTrace()
}
```

### Parameters
| **cohortId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCohortUpdateDto** | [**CourseCohortUpdateDto**](CourseCohortUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

