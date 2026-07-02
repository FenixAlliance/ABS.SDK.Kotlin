# CourseAssignmentTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseAssignmentTypeAsync**](CourseAssignmentTypesApi.md#createCourseAssignmentTypeAsync) | **POST** /api/v2/LearningService/CourseAssignmentTypes | Create a course assignment type |
| [**deleteCourseAssignmentTypeAsync**](CourseAssignmentTypesApi.md#deleteCourseAssignmentTypeAsync) | **DELETE** /api/v2/LearningService/CourseAssignmentTypes/{assignmentTypeId} | Delete a course assignment type |
| [**getCourseAssignmentTypeByIdAsync**](CourseAssignmentTypesApi.md#getCourseAssignmentTypeByIdAsync) | **GET** /api/v2/LearningService/CourseAssignmentTypes/{assignmentTypeId} | Get course assignment type by ID |
| [**getCourseAssignmentTypesAsync**](CourseAssignmentTypesApi.md#getCourseAssignmentTypesAsync) | **GET** /api/v2/LearningService/CourseAssignmentTypes | Get all course assignment types |
| [**getCourseAssignmentTypesCountAsync**](CourseAssignmentTypesApi.md#getCourseAssignmentTypesCountAsync) | **GET** /api/v2/LearningService/CourseAssignmentTypes/Count | Get course assignment types count |
| [**patchCourseAssignmentTypeAsync**](CourseAssignmentTypesApi.md#patchCourseAssignmentTypeAsync) | **PATCH** /api/v2/LearningService/CourseAssignmentTypes/{assignmentTypeId} | Patch a course assignment type |
| [**updateCourseAssignmentTypeAsync**](CourseAssignmentTypesApi.md#updateCourseAssignmentTypeAsync) | **PUT** /api/v2/LearningService/CourseAssignmentTypes/{assignmentTypeId} | Update a course assignment type |


<a id="createCourseAssignmentTypeAsync"></a>
# **createCourseAssignmentTypeAsync**
> createCourseAssignmentTypeAsync(tenantId, apiVersion, xApiVersion, courseAssignmentTypeCreateDto)

Create a course assignment type

Creates a new course assignment type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseAssignmentTypeCreateDto : CourseAssignmentTypeCreateDto =  // CourseAssignmentTypeCreateDto | 
try {
    apiInstance.createCourseAssignmentTypeAsync(tenantId, apiVersion, xApiVersion, courseAssignmentTypeCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentTypesApi#createCourseAssignmentTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentTypesApi#createCourseAssignmentTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseAssignmentTypeCreateDto** | [**CourseAssignmentTypeCreateDto**](CourseAssignmentTypeCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseAssignmentTypeAsync"></a>
# **deleteCourseAssignmentTypeAsync**
> deleteCourseAssignmentTypeAsync(assignmentTypeId, tenantId, apiVersion, xApiVersion)

Delete a course assignment type

Deletes a course assignment type by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentTypesApi()
val assignmentTypeId : kotlin.String = assignmentTypeId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseAssignmentTypeAsync(assignmentTypeId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentTypesApi#deleteCourseAssignmentTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentTypesApi#deleteCourseAssignmentTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **assignmentTypeId** | **kotlin.String**|  | |
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

<a id="getCourseAssignmentTypeByIdAsync"></a>
# **getCourseAssignmentTypeByIdAsync**
> CourseAssignmentTypeDto getCourseAssignmentTypeByIdAsync(assignmentTypeId, apiVersion, xApiVersion)

Get course assignment type by ID

Retrieves a specific course assignment type by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentTypesApi()
val assignmentTypeId : kotlin.String = assignmentTypeId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseAssignmentTypeDto = apiInstance.getCourseAssignmentTypeByIdAsync(assignmentTypeId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentTypesApi#getCourseAssignmentTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentTypesApi#getCourseAssignmentTypeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **assignmentTypeId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseAssignmentTypeDto**](CourseAssignmentTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseAssignmentTypesAsync"></a>
# **getCourseAssignmentTypesAsync**
> kotlin.collections.List&lt;CourseAssignmentTypeDto&gt; getCourseAssignmentTypesAsync(tenantId, apiVersion, xApiVersion)

Get all course assignment types

Retrieves all course assignment types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseAssignmentTypeDto> = apiInstance.getCourseAssignmentTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentTypesApi#getCourseAssignmentTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentTypesApi#getCourseAssignmentTypesAsync")
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

[**kotlin.collections.List&lt;CourseAssignmentTypeDto&gt;**](CourseAssignmentTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseAssignmentTypesCountAsync"></a>
# **getCourseAssignmentTypesCountAsync**
> kotlin.Int getCourseAssignmentTypesCountAsync(tenantId, apiVersion, xApiVersion)

Get course assignment types count

Returns the count of course assignment types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseAssignmentTypesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentTypesApi#getCourseAssignmentTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentTypesApi#getCourseAssignmentTypesCountAsync")
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

<a id="patchCourseAssignmentTypeAsync"></a>
# **patchCourseAssignmentTypeAsync**
> EmptyEnvelope patchCourseAssignmentTypeAsync(assignmentTypeId, tenantId, apiVersion, xApiVersion, operation)

Patch a course assignment type

Partially updates a course assignment type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentTypesApi()
val assignmentTypeId : kotlin.String = assignmentTypeId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchCourseAssignmentTypeAsync(assignmentTypeId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentTypesApi#patchCourseAssignmentTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentTypesApi#patchCourseAssignmentTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **assignmentTypeId** | **kotlin.String**|  | |
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

<a id="updateCourseAssignmentTypeAsync"></a>
# **updateCourseAssignmentTypeAsync**
> updateCourseAssignmentTypeAsync(assignmentTypeId, tenantId, apiVersion, xApiVersion, courseAssignmentTypeUpdateDto)

Update a course assignment type

Updates an existing course assignment type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseAssignmentTypesApi()
val assignmentTypeId : kotlin.String = assignmentTypeId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseAssignmentTypeUpdateDto : CourseAssignmentTypeUpdateDto =  // CourseAssignmentTypeUpdateDto | 
try {
    apiInstance.updateCourseAssignmentTypeAsync(assignmentTypeId, tenantId, apiVersion, xApiVersion, courseAssignmentTypeUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseAssignmentTypesApi#updateCourseAssignmentTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseAssignmentTypesApi#updateCourseAssignmentTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **assignmentTypeId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseAssignmentTypeUpdateDto** | [**CourseAssignmentTypeUpdateDto**](CourseAssignmentTypeUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

