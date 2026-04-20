# CourseUnitsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseUnitAsync**](CourseUnitsApi.md#createCourseUnitAsync) | **POST** /api/v2/LearningService/CourseUnits | Create a new course unit |
| [**deleteCourseUnitAsync**](CourseUnitsApi.md#deleteCourseUnitAsync) | **DELETE** /api/v2/LearningService/CourseUnits/{unitId} | Delete a course unit |
| [**getCourseUnitByIdAsync**](CourseUnitsApi.md#getCourseUnitByIdAsync) | **GET** /api/v2/LearningService/CourseUnits/{unitId} | Get course unit by ID |
| [**getCourseUnitsAsync**](CourseUnitsApi.md#getCourseUnitsAsync) | **GET** /api/v2/LearningService/CourseUnits | Get all course units |
| [**getCourseUnitsCountAsync**](CourseUnitsApi.md#getCourseUnitsCountAsync) | **GET** /api/v2/LearningService/CourseUnits/Count | Get course units count |
| [**updateCourseUnitAsync**](CourseUnitsApi.md#updateCourseUnitAsync) | **PUT** /api/v2/LearningService/CourseUnits/{unitId} | Update a course unit |


<a id="createCourseUnitAsync"></a>
# **createCourseUnitAsync**
> createCourseUnitAsync(tenantId, apiVersion, xApiVersion, courseUnitCreateDto)

Create a new course unit

Creates a new course unit for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseUnitCreateDto : CourseUnitCreateDto =  // CourseUnitCreateDto | 
try {
    apiInstance.createCourseUnitAsync(tenantId, apiVersion, xApiVersion, courseUnitCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitsApi#createCourseUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitsApi#createCourseUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseUnitCreateDto** | [**CourseUnitCreateDto**](CourseUnitCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseUnitAsync"></a>
# **deleteCourseUnitAsync**
> deleteCourseUnitAsync(unitId, tenantId, apiVersion, xApiVersion)

Delete a course unit

Deletes a course unit for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitsApi()
val unitId : kotlin.String = unitId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseUnitAsync(unitId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitsApi#deleteCourseUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitsApi#deleteCourseUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitId** | **kotlin.String**|  | |
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

<a id="getCourseUnitByIdAsync"></a>
# **getCourseUnitByIdAsync**
> CourseUnitDto getCourseUnitByIdAsync(unitId, apiVersion, xApiVersion)

Get course unit by ID

Retrieves a specific course unit by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitsApi()
val unitId : kotlin.String = unitId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseUnitDto = apiInstance.getCourseUnitByIdAsync(unitId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitsApi#getCourseUnitByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitsApi#getCourseUnitByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseUnitDto**](CourseUnitDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUnitsAsync"></a>
# **getCourseUnitsAsync**
> kotlin.collections.List&lt;CourseUnitDto&gt; getCourseUnitsAsync(tenantId, apiVersion, xApiVersion)

Get all course units

Retrieves all course units for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseUnitDto> = apiInstance.getCourseUnitsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitsApi#getCourseUnitsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitsApi#getCourseUnitsAsync")
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

[**kotlin.collections.List&lt;CourseUnitDto&gt;**](CourseUnitDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUnitsCountAsync"></a>
# **getCourseUnitsCountAsync**
> kotlin.Int getCourseUnitsCountAsync(tenantId, apiVersion, xApiVersion)

Get course units count

Returns the count of course units for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseUnitsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitsApi#getCourseUnitsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitsApi#getCourseUnitsCountAsync")
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

<a id="updateCourseUnitAsync"></a>
# **updateCourseUnitAsync**
> updateCourseUnitAsync(unitId, tenantId, apiVersion, xApiVersion, courseUnitUpdateDto)

Update a course unit

Updates an existing course unit for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseUnitsApi()
val unitId : kotlin.String = unitId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseUnitUpdateDto : CourseUnitUpdateDto =  // CourseUnitUpdateDto | 
try {
    apiInstance.updateCourseUnitAsync(unitId, tenantId, apiVersion, xApiVersion, courseUnitUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseUnitsApi#updateCourseUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseUnitsApi#updateCourseUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseUnitUpdateDto** | [**CourseUnitUpdateDto**](CourseUnitUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

