# CourseAssignmentComponentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseAssignmentComponentAsync**](CourseAssignmentComponentsApi.md#createCourseAssignmentComponentAsync) | **POST** /api/v2/LearningService/CourseAssignmentComponents | Create a course assignment component |
| [**deleteCourseAssignmentComponentAsync**](CourseAssignmentComponentsApi.md#deleteCourseAssignmentComponentAsync) | **DELETE** /api/v2/LearningService/CourseAssignmentComponents/{componentId} | Delete a course assignment component |
| [**getCourseAssignmentComponentByIdAsync**](CourseAssignmentComponentsApi.md#getCourseAssignmentComponentByIdAsync) | **GET** /api/v2/LearningService/CourseAssignmentComponents/{componentId} | Get course assignment component by ID |
| [**getCourseAssignmentComponentsAsync**](CourseAssignmentComponentsApi.md#getCourseAssignmentComponentsAsync) | **GET** /api/v2/LearningService/CourseAssignmentComponents | Get all course assignment components |
| [**getCourseAssignmentComponentsCountAsync**](CourseAssignmentComponentsApi.md#getCourseAssignmentComponentsCountAsync) | **GET** /api/v2/LearningService/CourseAssignmentComponents/Count | Get course assignment components count |
| [**patchCourseAssignmentComponentAsync**](CourseAssignmentComponentsApi.md#patchCourseAssignmentComponentAsync) | **PATCH** /api/v2/LearningService/CourseAssignmentComponents/{componentId} | Patch a course assignment component |
| [**updateCourseAssignmentComponentAsync**](CourseAssignmentComponentsApi.md#updateCourseAssignmentComponentAsync) | **PUT** /api/v2/LearningService/CourseAssignmentComponents/{componentId} | Update a course assignment component |


<a id="createCourseAssignmentComponentAsync"></a>
# **createCourseAssignmentComponentAsync**
> createCourseAssignmentComponentAsync(tenantId, apiVersion, xApiVersion, courseAssignmentComponentCreateDto)

Create a course assignment component

Creates a new course assignment component for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseAssignmentComponentCreateDto : CourseAssignmentComponentCreateDto =  // CourseAssignmentComponentCreateDto | 
try {
    apiInstance.createCourseAssignmentComponentAsync(tenantId, apiVersion, xApiVersion, courseAssignmentComponentCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentComponentsApi#createCourseAssignmentComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentComponentsApi#createCourseAssignmentComponentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseAssignmentComponentCreateDto** | [**CourseAssignmentComponentCreateDto**](CourseAssignmentComponentCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseAssignmentComponentAsync"></a>
# **deleteCourseAssignmentComponentAsync**
> deleteCourseAssignmentComponentAsync(componentId, tenantId, apiVersion, xApiVersion)

Delete a course assignment component

Deletes a course assignment component by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentComponentsApi()
val componentId : kotlin.String = componentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseAssignmentComponentAsync(componentId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentComponentsApi#deleteCourseAssignmentComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentComponentsApi#deleteCourseAssignmentComponentAsync")
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

<a id="getCourseAssignmentComponentByIdAsync"></a>
# **getCourseAssignmentComponentByIdAsync**
> CourseAssignmentComponentDto getCourseAssignmentComponentByIdAsync(componentId, apiVersion, xApiVersion)

Get course assignment component by ID

Retrieves a specific course assignment component by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentComponentsApi()
val componentId : kotlin.String = componentId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseAssignmentComponentDto = apiInstance.getCourseAssignmentComponentByIdAsync(componentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentComponentsApi#getCourseAssignmentComponentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentComponentsApi#getCourseAssignmentComponentByIdAsync")
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

[**CourseAssignmentComponentDto**](CourseAssignmentComponentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseAssignmentComponentsAsync"></a>
# **getCourseAssignmentComponentsAsync**
> kotlin.collections.List&lt;CourseAssignmentComponentDto&gt; getCourseAssignmentComponentsAsync(tenantId, apiVersion, xApiVersion)

Get all course assignment components

Retrieves all course assignment components for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseAssignmentComponentDto> = apiInstance.getCourseAssignmentComponentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentComponentsApi#getCourseAssignmentComponentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentComponentsApi#getCourseAssignmentComponentsAsync")
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

[**kotlin.collections.List&lt;CourseAssignmentComponentDto&gt;**](CourseAssignmentComponentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseAssignmentComponentsCountAsync"></a>
# **getCourseAssignmentComponentsCountAsync**
> kotlin.Int getCourseAssignmentComponentsCountAsync(tenantId, apiVersion, xApiVersion)

Get course assignment components count

Returns the count of course assignment components for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseAssignmentComponentsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentComponentsApi#getCourseAssignmentComponentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentComponentsApi#getCourseAssignmentComponentsCountAsync")
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

<a id="patchCourseAssignmentComponentAsync"></a>
# **patchCourseAssignmentComponentAsync**
> EmptyEnvelope patchCourseAssignmentComponentAsync(componentId, tenantId, apiVersion, xApiVersion, operation)

Patch a course assignment component

Partially updates a course assignment component for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentComponentsApi()
val componentId : kotlin.String = componentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchCourseAssignmentComponentAsync(componentId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentComponentsApi#patchCourseAssignmentComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentComponentsApi#patchCourseAssignmentComponentAsync")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateCourseAssignmentComponentAsync"></a>
# **updateCourseAssignmentComponentAsync**
> updateCourseAssignmentComponentAsync(componentId, tenantId, apiVersion, xApiVersion, courseAssignmentComponentUpdateDto)

Update a course assignment component

Updates an existing course assignment component.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentComponentsApi()
val componentId : kotlin.String = componentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseAssignmentComponentUpdateDto : CourseAssignmentComponentUpdateDto =  // CourseAssignmentComponentUpdateDto | 
try {
    apiInstance.updateCourseAssignmentComponentAsync(componentId, tenantId, apiVersion, xApiVersion, courseAssignmentComponentUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentComponentsApi#updateCourseAssignmentComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentComponentsApi#updateCourseAssignmentComponentAsync")
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
| **courseAssignmentComponentUpdateDto** | [**CourseAssignmentComponentUpdateDto**](CourseAssignmentComponentUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

