# CourseUnitComponentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseUnitComponentAsync**](CourseUnitComponentsApi.md#createCourseUnitComponentAsync) | **POST** /api/v2/LearningService/CourseUnitComponents | Create a new course unit component |
| [**deleteCourseUnitComponentAsync**](CourseUnitComponentsApi.md#deleteCourseUnitComponentAsync) | **DELETE** /api/v2/LearningService/CourseUnitComponents/{componentId} | Delete a course unit component |
| [**getCourseUnitComponentByIdAsync**](CourseUnitComponentsApi.md#getCourseUnitComponentByIdAsync) | **GET** /api/v2/LearningService/CourseUnitComponents/{componentId} | Get course unit component by ID |
| [**getCourseUnitComponentsAsync**](CourseUnitComponentsApi.md#getCourseUnitComponentsAsync) | **GET** /api/v2/LearningService/CourseUnitComponents | Get all course unit components |
| [**getCourseUnitComponentsCountAsync**](CourseUnitComponentsApi.md#getCourseUnitComponentsCountAsync) | **GET** /api/v2/LearningService/CourseUnitComponents/Count | Get course unit components count |
| [**updateCourseUnitComponentAsync**](CourseUnitComponentsApi.md#updateCourseUnitComponentAsync) | **PUT** /api/v2/LearningService/CourseUnitComponents/{componentId} | Update a course unit component |


<a id="createCourseUnitComponentAsync"></a>
# **createCourseUnitComponentAsync**
> createCourseUnitComponentAsync(tenantId, apiVersion, xApiVersion, courseUnitComponentCreateDto)

Create a new course unit component

Creates a new course unit component for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseUnitComponentCreateDto : CourseUnitComponentCreateDto =  // CourseUnitComponentCreateDto | 
try {
    apiInstance.createCourseUnitComponentAsync(tenantId, apiVersion, xApiVersion, courseUnitComponentCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitComponentsApi#createCourseUnitComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitComponentsApi#createCourseUnitComponentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseUnitComponentCreateDto** | [**CourseUnitComponentCreateDto**](CourseUnitComponentCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseUnitComponentAsync"></a>
# **deleteCourseUnitComponentAsync**
> deleteCourseUnitComponentAsync(componentId, tenantId, apiVersion, xApiVersion)

Delete a course unit component

Deletes a course unit component for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitComponentsApi()
val componentId : kotlin.String = componentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseUnitComponentAsync(componentId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitComponentsApi#deleteCourseUnitComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitComponentsApi#deleteCourseUnitComponentAsync")
    e.printStackTrace()
}
```

### Parameters
| **componentId** | **kotlin.String**|  | |
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

<a id="getCourseUnitComponentByIdAsync"></a>
# **getCourseUnitComponentByIdAsync**
> CourseUnitComponentDto getCourseUnitComponentByIdAsync(componentId, apiVersion, xApiVersion)

Get course unit component by ID

Retrieves a specific course unit component by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitComponentsApi()
val componentId : kotlin.String = componentId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseUnitComponentDto = apiInstance.getCourseUnitComponentByIdAsync(componentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitComponentsApi#getCourseUnitComponentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitComponentsApi#getCourseUnitComponentByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **componentId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseUnitComponentDto**](CourseUnitComponentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUnitComponentsAsync"></a>
# **getCourseUnitComponentsAsync**
> kotlin.collections.List&lt;CourseUnitComponentDto&gt; getCourseUnitComponentsAsync(tenantId, apiVersion, xApiVersion)

Get all course unit components

Retrieves all course unit components for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseUnitComponentDto> = apiInstance.getCourseUnitComponentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitComponentsApi#getCourseUnitComponentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitComponentsApi#getCourseUnitComponentsAsync")
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

[**kotlin.collections.List&lt;CourseUnitComponentDto&gt;**](CourseUnitComponentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUnitComponentsCountAsync"></a>
# **getCourseUnitComponentsCountAsync**
> kotlin.Int getCourseUnitComponentsCountAsync(tenantId, apiVersion, xApiVersion)

Get course unit components count

Returns the count of course unit components for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseUnitComponentsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitComponentsApi#getCourseUnitComponentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitComponentsApi#getCourseUnitComponentsCountAsync")
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

<a id="updateCourseUnitComponentAsync"></a>
# **updateCourseUnitComponentAsync**
> updateCourseUnitComponentAsync(componentId, tenantId, apiVersion, xApiVersion, courseUnitComponentUpdateDto)

Update a course unit component

Updates an existing course unit component for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitComponentsApi()
val componentId : kotlin.String = componentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseUnitComponentUpdateDto : CourseUnitComponentUpdateDto =  // CourseUnitComponentUpdateDto | 
try {
    apiInstance.updateCourseUnitComponentAsync(componentId, tenantId, apiVersion, xApiVersion, courseUnitComponentUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitComponentsApi#updateCourseUnitComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitComponentsApi#updateCourseUnitComponentAsync")
    e.printStackTrace()
}
```

### Parameters
| **componentId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseUnitComponentUpdateDto** | [**CourseUnitComponentUpdateDto**](CourseUnitComponentUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

