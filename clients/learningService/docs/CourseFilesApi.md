# CourseFilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseFileAsync**](CourseFilesApi.md#createCourseFileAsync) | **POST** /api/v2/LearningService/CourseFiles | Create a new course file |
| [**deleteCourseFileAsync**](CourseFilesApi.md#deleteCourseFileAsync) | **DELETE** /api/v2/LearningService/CourseFiles/{fileId} | Delete a course file |
| [**getCourseFileByIdAsync**](CourseFilesApi.md#getCourseFileByIdAsync) | **GET** /api/v2/LearningService/CourseFiles/{fileId} | Get course file by ID |
| [**getCourseFilesAsync**](CourseFilesApi.md#getCourseFilesAsync) | **GET** /api/v2/LearningService/CourseFiles | Get all course files |
| [**getCourseFilesCountAsync**](CourseFilesApi.md#getCourseFilesCountAsync) | **GET** /api/v2/LearningService/CourseFiles/Count | Get course files count |
| [**updateCourseFileAsync**](CourseFilesApi.md#updateCourseFileAsync) | **PUT** /api/v2/LearningService/CourseFiles/{fileId} | Update a course file |


<a id="createCourseFileAsync"></a>
# **createCourseFileAsync**
> createCourseFileAsync(tenantId, apiVersion, xApiVersion, courseFileCreateDto)

Create a new course file

Creates a new course file for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseFilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseFileCreateDto : CourseFileCreateDto =  // CourseFileCreateDto | 
try {
    apiInstance.createCourseFileAsync(tenantId, apiVersion, xApiVersion, courseFileCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseFilesApi#createCourseFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseFilesApi#createCourseFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseFileCreateDto** | [**CourseFileCreateDto**](CourseFileCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseFileAsync"></a>
# **deleteCourseFileAsync**
> deleteCourseFileAsync(fileId, tenantId, apiVersion, xApiVersion)

Delete a course file

Deletes a course file for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseFilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseFileAsync(fileId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseFilesApi#deleteCourseFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseFilesApi#deleteCourseFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileId** | **kotlin.String**|  | |
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

<a id="getCourseFileByIdAsync"></a>
# **getCourseFileByIdAsync**
> CourseFileDto getCourseFileByIdAsync(fileId, apiVersion, xApiVersion)

Get course file by ID

Retrieves a specific course file by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseFilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseFileDto = apiInstance.getCourseFileByIdAsync(fileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseFilesApi#getCourseFileByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseFilesApi#getCourseFileByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseFileDto**](CourseFileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseFilesAsync"></a>
# **getCourseFilesAsync**
> kotlin.collections.List&lt;CourseFileDto&gt; getCourseFilesAsync(tenantId, apiVersion, xApiVersion)

Get all course files

Retrieves all course files for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseFilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseFileDto> = apiInstance.getCourseFilesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseFilesApi#getCourseFilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseFilesApi#getCourseFilesAsync")
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

[**kotlin.collections.List&lt;CourseFileDto&gt;**](CourseFileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseFilesCountAsync"></a>
# **getCourseFilesCountAsync**
> kotlin.Int getCourseFilesCountAsync(tenantId, apiVersion, xApiVersion)

Get course files count

Returns the count of course files for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseFilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseFilesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseFilesApi#getCourseFilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseFilesApi#getCourseFilesCountAsync")
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

<a id="updateCourseFileAsync"></a>
# **updateCourseFileAsync**
> updateCourseFileAsync(fileId, tenantId, apiVersion, xApiVersion, courseFileUpdateDto)

Update a course file

Updates an existing course file for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseFilesApi()
val fileId : kotlin.String = fileId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseFileUpdateDto : CourseFileUpdateDto =  // CourseFileUpdateDto | 
try {
    apiInstance.updateCourseFileAsync(fileId, tenantId, apiVersion, xApiVersion, courseFileUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseFilesApi#updateCourseFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseFilesApi#updateCourseFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseFileUpdateDto** | [**CourseFileUpdateDto**](CourseFileUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

