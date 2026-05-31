# CourseForumsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseForumAsync**](CourseForumsApi.md#createCourseForumAsync) | **POST** /api/v2/LearningService/CourseForums | Create a course forum |
| [**deleteCourseForumAsync**](CourseForumsApi.md#deleteCourseForumAsync) | **DELETE** /api/v2/LearningService/CourseForums/{forumId} | Delete a course forum |
| [**getCourseForumByIdAsync**](CourseForumsApi.md#getCourseForumByIdAsync) | **GET** /api/v2/LearningService/CourseForums/{forumId} | Get course forum by ID |
| [**getCourseForumsAsync**](CourseForumsApi.md#getCourseForumsAsync) | **GET** /api/v2/LearningService/CourseForums | Get all course forums |
| [**getCourseForumsCountAsync**](CourseForumsApi.md#getCourseForumsCountAsync) | **GET** /api/v2/LearningService/CourseForums/Count | Get course forums count |
| [**updateCourseForumAsync**](CourseForumsApi.md#updateCourseForumAsync) | **PUT** /api/v2/LearningService/CourseForums/{forumId} | Update a course forum |


<a id="createCourseForumAsync"></a>
# **createCourseForumAsync**
> CourseForumDto createCourseForumAsync(tenantId, apiVersion, xApiVersion, courseForumCreateDto)

Create a course forum

Creates a new course forum for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseForumsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseForumCreateDto : CourseForumCreateDto =  // CourseForumCreateDto | 
try {
    val result : CourseForumDto = apiInstance.createCourseForumAsync(tenantId, apiVersion, xApiVersion, courseForumCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseForumsApi#createCourseForumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseForumsApi#createCourseForumAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseForumCreateDto** | [**CourseForumCreateDto**](CourseForumCreateDto.md)|  | [optional] |

### Return type

[**CourseForumDto**](CourseForumDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseForumAsync"></a>
# **deleteCourseForumAsync**
> deleteCourseForumAsync(forumId, tenantId, apiVersion, xApiVersion)

Delete a course forum

Deletes a course forum by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseForumsApi()
val forumId : kotlin.String = forumId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseForumAsync(forumId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseForumsApi#deleteCourseForumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseForumsApi#deleteCourseForumAsync")
    e.printStackTrace()
}
```

### Parameters
| **forumId** | **kotlin.String**|  | |
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

<a id="getCourseForumByIdAsync"></a>
# **getCourseForumByIdAsync**
> CourseForumDto getCourseForumByIdAsync(forumId, apiVersion, xApiVersion)

Get course forum by ID

Retrieves a specific course forum by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseForumsApi()
val forumId : kotlin.String = forumId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseForumDto = apiInstance.getCourseForumByIdAsync(forumId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseForumsApi#getCourseForumByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseForumsApi#getCourseForumByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **forumId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseForumDto**](CourseForumDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseForumsAsync"></a>
# **getCourseForumsAsync**
> kotlin.collections.List&lt;CourseForumDto&gt; getCourseForumsAsync(tenantId, apiVersion, xApiVersion)

Get all course forums

Retrieves all course forums for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseForumsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseForumDto> = apiInstance.getCourseForumsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseForumsApi#getCourseForumsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseForumsApi#getCourseForumsAsync")
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

[**kotlin.collections.List&lt;CourseForumDto&gt;**](CourseForumDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseForumsCountAsync"></a>
# **getCourseForumsCountAsync**
> kotlin.Int getCourseForumsCountAsync(tenantId, apiVersion, xApiVersion)

Get course forums count

Returns the count of course forums for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseForumsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseForumsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseForumsApi#getCourseForumsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseForumsApi#getCourseForumsCountAsync")
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

<a id="updateCourseForumAsync"></a>
# **updateCourseForumAsync**
> CourseForumDto updateCourseForumAsync(forumId, tenantId, apiVersion, xApiVersion, courseForumUpdateDto)

Update a course forum

Updates an existing course forum.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseForumsApi()
val forumId : kotlin.String = forumId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseForumUpdateDto : CourseForumUpdateDto =  // CourseForumUpdateDto | 
try {
    val result : CourseForumDto = apiInstance.updateCourseForumAsync(forumId, tenantId, apiVersion, xApiVersion, courseForumUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseForumsApi#updateCourseForumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseForumsApi#updateCourseForumAsync")
    e.printStackTrace()
}
```

### Parameters
| **forumId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseForumUpdateDto** | [**CourseForumUpdateDto**](CourseForumUpdateDto.md)|  | [optional] |

### Return type

[**CourseForumDto**](CourseForumDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

