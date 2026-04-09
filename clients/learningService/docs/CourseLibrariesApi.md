# CourseLibrariesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseLibraryAsync**](CourseLibrariesApi.md#createCourseLibraryAsync) | **POST** /api/v2/LearningService/CourseLibraries | Create a course library |
| [**deleteCourseLibraryAsync**](CourseLibrariesApi.md#deleteCourseLibraryAsync) | **DELETE** /api/v2/LearningService/CourseLibraries/{libraryId} | Delete a course library |
| [**getCourseLibrariesAsync**](CourseLibrariesApi.md#getCourseLibrariesAsync) | **GET** /api/v2/LearningService/CourseLibraries | Get all course libraries |
| [**getCourseLibrariesCountAsync**](CourseLibrariesApi.md#getCourseLibrariesCountAsync) | **GET** /api/v2/LearningService/CourseLibraries/Count | Get course libraries count |
| [**getCourseLibraryByIdAsync**](CourseLibrariesApi.md#getCourseLibraryByIdAsync) | **GET** /api/v2/LearningService/CourseLibraries/{libraryId} | Get course library by ID |
| [**updateCourseLibraryAsync**](CourseLibrariesApi.md#updateCourseLibraryAsync) | **PUT** /api/v2/LearningService/CourseLibraries/{libraryId} | Update a course library |


<a id="createCourseLibraryAsync"></a>
# **createCourseLibraryAsync**
> CourseLibraryDto createCourseLibraryAsync(tenantId, apiVersion, xApiVersion, courseLibraryCreateDto)

Create a course library

Creates a new course library for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseLibrariesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseLibraryCreateDto : CourseLibraryCreateDto =  // CourseLibraryCreateDto | 
try {
    val result : CourseLibraryDto = apiInstance.createCourseLibraryAsync(tenantId, apiVersion, xApiVersion, courseLibraryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseLibrariesApi#createCourseLibraryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseLibrariesApi#createCourseLibraryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseLibraryCreateDto** | [**CourseLibraryCreateDto**](CourseLibraryCreateDto.md)|  | [optional] |

### Return type

[**CourseLibraryDto**](CourseLibraryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseLibraryAsync"></a>
# **deleteCourseLibraryAsync**
> deleteCourseLibraryAsync(libraryId, tenantId, apiVersion, xApiVersion)

Delete a course library

Deletes a course library by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseLibrariesApi()
val libraryId : kotlin.String = libraryId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseLibraryAsync(libraryId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseLibrariesApi#deleteCourseLibraryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseLibrariesApi#deleteCourseLibraryAsync")
    e.printStackTrace()
}
```

### Parameters
| **libraryId** | **kotlin.String**|  | |
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

<a id="getCourseLibrariesAsync"></a>
# **getCourseLibrariesAsync**
> kotlin.collections.List&lt;CourseLibraryDto&gt; getCourseLibrariesAsync(tenantId, apiVersion, xApiVersion)

Get all course libraries

Retrieves all course libraries for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseLibrariesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseLibraryDto> = apiInstance.getCourseLibrariesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseLibrariesApi#getCourseLibrariesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseLibrariesApi#getCourseLibrariesAsync")
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

[**kotlin.collections.List&lt;CourseLibraryDto&gt;**](CourseLibraryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseLibrariesCountAsync"></a>
# **getCourseLibrariesCountAsync**
> kotlin.Int getCourseLibrariesCountAsync(tenantId, apiVersion, xApiVersion)

Get course libraries count

Returns the count of course libraries for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseLibrariesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseLibrariesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseLibrariesApi#getCourseLibrariesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseLibrariesApi#getCourseLibrariesCountAsync")
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

<a id="getCourseLibraryByIdAsync"></a>
# **getCourseLibraryByIdAsync**
> CourseLibraryDto getCourseLibraryByIdAsync(libraryId, apiVersion, xApiVersion)

Get course library by ID

Retrieves a specific course library by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseLibrariesApi()
val libraryId : kotlin.String = libraryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseLibraryDto = apiInstance.getCourseLibraryByIdAsync(libraryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseLibrariesApi#getCourseLibraryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseLibrariesApi#getCourseLibraryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **libraryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseLibraryDto**](CourseLibraryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateCourseLibraryAsync"></a>
# **updateCourseLibraryAsync**
> CourseLibraryDto updateCourseLibraryAsync(libraryId, tenantId, apiVersion, xApiVersion, courseLibraryUpdateDto)

Update a course library

Updates an existing course library.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseLibrariesApi()
val libraryId : kotlin.String = libraryId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseLibraryUpdateDto : CourseLibraryUpdateDto =  // CourseLibraryUpdateDto | 
try {
    val result : CourseLibraryDto = apiInstance.updateCourseLibraryAsync(libraryId, tenantId, apiVersion, xApiVersion, courseLibraryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseLibrariesApi#updateCourseLibraryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseLibrariesApi#updateCourseLibraryAsync")
    e.printStackTrace()
}
```

### Parameters
| **libraryId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseLibraryUpdateDto** | [**CourseLibraryUpdateDto**](CourseLibraryUpdateDto.md)|  | [optional] |

### Return type

[**CourseLibraryDto**](CourseLibraryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

