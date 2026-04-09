# CourseUpdatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseUpdateAsync**](CourseUpdatesApi.md#createCourseUpdateAsync) | **POST** /api/v2/LearningService/CourseUpdates | Create a new course update |
| [**deleteCourseUpdateAsync**](CourseUpdatesApi.md#deleteCourseUpdateAsync) | **DELETE** /api/v2/LearningService/CourseUpdates/{updateId} | Delete a course update |
| [**getCourseUpdateByIdAsync**](CourseUpdatesApi.md#getCourseUpdateByIdAsync) | **GET** /api/v2/LearningService/CourseUpdates/{updateId} | Get course update by ID |
| [**getCourseUpdatesAsync**](CourseUpdatesApi.md#getCourseUpdatesAsync) | **GET** /api/v2/LearningService/CourseUpdates | Get all course updates |
| [**getCourseUpdatesCountAsync**](CourseUpdatesApi.md#getCourseUpdatesCountAsync) | **GET** /api/v2/LearningService/CourseUpdates/Count | Get course updates count |
| [**updateCourseUpdateAsync**](CourseUpdatesApi.md#updateCourseUpdateAsync) | **PUT** /api/v2/LearningService/CourseUpdates/{updateId} | Update a course update |


<a id="createCourseUpdateAsync"></a>
# **createCourseUpdateAsync**
> createCourseUpdateAsync(tenantId, apiVersion, xApiVersion, courseNewsCreateDto)

Create a new course update

Creates a new course update for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUpdatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseNewsCreateDto : CourseNewsCreateDto =  // CourseNewsCreateDto | 
try {
    apiInstance.createCourseUpdateAsync(tenantId, apiVersion, xApiVersion, courseNewsCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseUpdatesApi#createCourseUpdateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUpdatesApi#createCourseUpdateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseNewsCreateDto** | [**CourseNewsCreateDto**](CourseNewsCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseUpdateAsync"></a>
# **deleteCourseUpdateAsync**
> deleteCourseUpdateAsync(updateId, tenantId, apiVersion, xApiVersion)

Delete a course update

Deletes a course update for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUpdatesApi()
val updateId : kotlin.String = updateId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseUpdateAsync(updateId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseUpdatesApi#deleteCourseUpdateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUpdatesApi#deleteCourseUpdateAsync")
    e.printStackTrace()
}
```

### Parameters
| **updateId** | **kotlin.String**|  | |
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

<a id="getCourseUpdateByIdAsync"></a>
# **getCourseUpdateByIdAsync**
> CourseNewsDto getCourseUpdateByIdAsync(updateId, apiVersion, xApiVersion)

Get course update by ID

Retrieves a specific course update by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUpdatesApi()
val updateId : kotlin.String = updateId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseNewsDto = apiInstance.getCourseUpdateByIdAsync(updateId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUpdatesApi#getCourseUpdateByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUpdatesApi#getCourseUpdateByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **updateId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseNewsDto**](CourseNewsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUpdatesAsync"></a>
# **getCourseUpdatesAsync**
> kotlin.collections.List&lt;CourseNewsDto&gt; getCourseUpdatesAsync(tenantId, apiVersion, xApiVersion)

Get all course updates

Retrieves all course updates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUpdatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseNewsDto> = apiInstance.getCourseUpdatesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUpdatesApi#getCourseUpdatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUpdatesApi#getCourseUpdatesAsync")
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

[**kotlin.collections.List&lt;CourseNewsDto&gt;**](CourseNewsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUpdatesCountAsync"></a>
# **getCourseUpdatesCountAsync**
> kotlin.Int getCourseUpdatesCountAsync(tenantId, apiVersion, xApiVersion)

Get course updates count

Returns the count of course updates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUpdatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseUpdatesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUpdatesApi#getCourseUpdatesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUpdatesApi#getCourseUpdatesCountAsync")
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

<a id="updateCourseUpdateAsync"></a>
# **updateCourseUpdateAsync**
> updateCourseUpdateAsync(updateId, tenantId, apiVersion, xApiVersion, courseNewsUpdateDto)

Update a course update

Updates an existing course update for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUpdatesApi()
val updateId : kotlin.String = updateId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseNewsUpdateDto : CourseNewsUpdateDto =  // CourseNewsUpdateDto | 
try {
    apiInstance.updateCourseUpdateAsync(updateId, tenantId, apiVersion, xApiVersion, courseNewsUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseUpdatesApi#updateCourseUpdateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUpdatesApi#updateCourseUpdateAsync")
    e.printStackTrace()
}
```

### Parameters
| **updateId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseNewsUpdateDto** | [**CourseNewsUpdateDto**](CourseNewsUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

