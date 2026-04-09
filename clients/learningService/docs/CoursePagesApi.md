# CoursePagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCoursePageAsync**](CoursePagesApi.md#createCoursePageAsync) | **POST** /api/v2/LearningService/CoursePages | Create a new course page |
| [**deleteCoursePageAsync**](CoursePagesApi.md#deleteCoursePageAsync) | **DELETE** /api/v2/LearningService/CoursePages/{pageId} | Delete a course page |
| [**getCoursePageByIdAsync**](CoursePagesApi.md#getCoursePageByIdAsync) | **GET** /api/v2/LearningService/CoursePages/{pageId} | Get course page by ID |
| [**getCoursePagesAsync**](CoursePagesApi.md#getCoursePagesAsync) | **GET** /api/v2/LearningService/CoursePages | Get all course pages |
| [**getCoursePagesCountAsync**](CoursePagesApi.md#getCoursePagesCountAsync) | **GET** /api/v2/LearningService/CoursePages/Count | Get course pages count |
| [**updateCoursePageAsync**](CoursePagesApi.md#updateCoursePageAsync) | **PUT** /api/v2/LearningService/CoursePages/{pageId} | Update a course page |


<a id="createCoursePageAsync"></a>
# **createCoursePageAsync**
> createCoursePageAsync(tenantId, apiVersion, xApiVersion, coursePageCreateDto)

Create a new course page

Creates a new course page for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursePagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val coursePageCreateDto : CoursePageCreateDto =  // CoursePageCreateDto | 
try {
    apiInstance.createCoursePageAsync(tenantId, apiVersion, xApiVersion, coursePageCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CoursePagesApi#createCoursePageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursePagesApi#createCoursePageAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **coursePageCreateDto** | [**CoursePageCreateDto**](CoursePageCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCoursePageAsync"></a>
# **deleteCoursePageAsync**
> deleteCoursePageAsync(pageId, tenantId, apiVersion, xApiVersion)

Delete a course page

Deletes a course page for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursePagesApi()
val pageId : kotlin.String = pageId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCoursePageAsync(pageId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CoursePagesApi#deleteCoursePageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursePagesApi#deleteCoursePageAsync")
    e.printStackTrace()
}
```

### Parameters
| **pageId** | **kotlin.String**|  | |
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

<a id="getCoursePageByIdAsync"></a>
# **getCoursePageByIdAsync**
> CoursePageDto getCoursePageByIdAsync(pageId, apiVersion, xApiVersion)

Get course page by ID

Retrieves a specific course page by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursePagesApi()
val pageId : kotlin.String = pageId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CoursePageDto = apiInstance.getCoursePageByIdAsync(pageId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursePagesApi#getCoursePageByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursePagesApi#getCoursePageByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **pageId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CoursePageDto**](CoursePageDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCoursePagesAsync"></a>
# **getCoursePagesAsync**
> kotlin.collections.List&lt;CoursePageDto&gt; getCoursePagesAsync(tenantId, apiVersion, xApiVersion)

Get all course pages

Retrieves all course pages for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursePagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CoursePageDto> = apiInstance.getCoursePagesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursePagesApi#getCoursePagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursePagesApi#getCoursePagesAsync")
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

[**kotlin.collections.List&lt;CoursePageDto&gt;**](CoursePageDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCoursePagesCountAsync"></a>
# **getCoursePagesCountAsync**
> kotlin.Int getCoursePagesCountAsync(tenantId, apiVersion, xApiVersion)

Get course pages count

Returns the count of course pages for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursePagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCoursePagesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursePagesApi#getCoursePagesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursePagesApi#getCoursePagesCountAsync")
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

<a id="updateCoursePageAsync"></a>
# **updateCoursePageAsync**
> updateCoursePageAsync(pageId, tenantId, apiVersion, xApiVersion, coursePageUpdateDto)

Update a course page

Updates an existing course page for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursePagesApi()
val pageId : kotlin.String = pageId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val coursePageUpdateDto : CoursePageUpdateDto =  // CoursePageUpdateDto | 
try {
    apiInstance.updateCoursePageAsync(pageId, tenantId, apiVersion, xApiVersion, coursePageUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CoursePagesApi#updateCoursePageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursePagesApi#updateCoursePageAsync")
    e.printStackTrace()
}
```

### Parameters
| **pageId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **coursePageUpdateDto** | [**CoursePageUpdateDto**](CoursePageUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

