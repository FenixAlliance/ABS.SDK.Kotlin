# CourseHandoutsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseHandoutAsync**](CourseHandoutsApi.md#createCourseHandoutAsync) | **POST** /api/v2/LearningService/CourseHandouts | Create a course handout |
| [**deleteCourseHandoutAsync**](CourseHandoutsApi.md#deleteCourseHandoutAsync) | **DELETE** /api/v2/LearningService/CourseHandouts/{handoutId} | Delete a course handout |
| [**getCourseHandoutByIdAsync**](CourseHandoutsApi.md#getCourseHandoutByIdAsync) | **GET** /api/v2/LearningService/CourseHandouts/{handoutId} | Get course handout by ID |
| [**getCourseHandoutsAsync**](CourseHandoutsApi.md#getCourseHandoutsAsync) | **GET** /api/v2/LearningService/CourseHandouts | Get all course handouts |
| [**getCourseHandoutsCountAsync**](CourseHandoutsApi.md#getCourseHandoutsCountAsync) | **GET** /api/v2/LearningService/CourseHandouts/Count | Get course handouts count |
| [**updateCourseHandoutAsync**](CourseHandoutsApi.md#updateCourseHandoutAsync) | **PUT** /api/v2/LearningService/CourseHandouts/{handoutId} | Update a course handout |


<a id="createCourseHandoutAsync"></a>
# **createCourseHandoutAsync**
> CourseHandoutDto createCourseHandoutAsync(tenantId, apiVersion, xApiVersion, courseHandoutCreateDto)

Create a course handout

Creates a new course handout for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseHandoutsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseHandoutCreateDto : CourseHandoutCreateDto =  // CourseHandoutCreateDto | 
try {
    val result : CourseHandoutDto = apiInstance.createCourseHandoutAsync(tenantId, apiVersion, xApiVersion, courseHandoutCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseHandoutsApi#createCourseHandoutAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseHandoutsApi#createCourseHandoutAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseHandoutCreateDto** | [**CourseHandoutCreateDto**](CourseHandoutCreateDto.md)|  | [optional] |

### Return type

[**CourseHandoutDto**](CourseHandoutDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseHandoutAsync"></a>
# **deleteCourseHandoutAsync**
> deleteCourseHandoutAsync(handoutId, tenantId, apiVersion, xApiVersion)

Delete a course handout

Deletes a course handout by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseHandoutsApi()
val handoutId : kotlin.String = handoutId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseHandoutAsync(handoutId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseHandoutsApi#deleteCourseHandoutAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseHandoutsApi#deleteCourseHandoutAsync")
    e.printStackTrace()
}
```

### Parameters
| **handoutId** | **kotlin.String**|  | |
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

<a id="getCourseHandoutByIdAsync"></a>
# **getCourseHandoutByIdAsync**
> CourseHandoutDto getCourseHandoutByIdAsync(handoutId, apiVersion, xApiVersion)

Get course handout by ID

Retrieves a specific course handout by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseHandoutsApi()
val handoutId : kotlin.String = handoutId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseHandoutDto = apiInstance.getCourseHandoutByIdAsync(handoutId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseHandoutsApi#getCourseHandoutByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseHandoutsApi#getCourseHandoutByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **handoutId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseHandoutDto**](CourseHandoutDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseHandoutsAsync"></a>
# **getCourseHandoutsAsync**
> kotlin.collections.List&lt;CourseHandoutDto&gt; getCourseHandoutsAsync(tenantId, apiVersion, xApiVersion)

Get all course handouts

Retrieves all course handouts for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseHandoutsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseHandoutDto> = apiInstance.getCourseHandoutsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseHandoutsApi#getCourseHandoutsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseHandoutsApi#getCourseHandoutsAsync")
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

[**kotlin.collections.List&lt;CourseHandoutDto&gt;**](CourseHandoutDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseHandoutsCountAsync"></a>
# **getCourseHandoutsCountAsync**
> kotlin.Int getCourseHandoutsCountAsync(tenantId, apiVersion, xApiVersion)

Get course handouts count

Returns the count of course handouts for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseHandoutsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseHandoutsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseHandoutsApi#getCourseHandoutsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseHandoutsApi#getCourseHandoutsCountAsync")
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

<a id="updateCourseHandoutAsync"></a>
# **updateCourseHandoutAsync**
> CourseHandoutDto updateCourseHandoutAsync(handoutId, tenantId, apiVersion, xApiVersion, courseHandoutUpdateDto)

Update a course handout

Updates an existing course handout.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseHandoutsApi()
val handoutId : kotlin.String = handoutId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseHandoutUpdateDto : CourseHandoutUpdateDto =  // CourseHandoutUpdateDto | 
try {
    val result : CourseHandoutDto = apiInstance.updateCourseHandoutAsync(handoutId, tenantId, apiVersion, xApiVersion, courseHandoutUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseHandoutsApi#updateCourseHandoutAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseHandoutsApi#updateCourseHandoutAsync")
    e.printStackTrace()
}
```

### Parameters
| **handoutId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseHandoutUpdateDto** | [**CourseHandoutUpdateDto**](CourseHandoutUpdateDto.md)|  | [optional] |

### Return type

[**CourseHandoutDto**](CourseHandoutDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

