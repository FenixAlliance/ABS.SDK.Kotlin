# CourseContentGroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseContentGroupAsync**](CourseContentGroupsApi.md#createCourseContentGroupAsync) | **POST** /api/v2/LearningService/CourseContentGroups | Create a new course content group |
| [**deleteCourseContentGroupAsync**](CourseContentGroupsApi.md#deleteCourseContentGroupAsync) | **DELETE** /api/v2/LearningService/CourseContentGroups/{groupId} | Delete a course content group |
| [**getCourseContentGroupByIdAsync**](CourseContentGroupsApi.md#getCourseContentGroupByIdAsync) | **GET** /api/v2/LearningService/CourseContentGroups/{groupId} | Get course content group by ID |
| [**getCourseContentGroupsAsync**](CourseContentGroupsApi.md#getCourseContentGroupsAsync) | **GET** /api/v2/LearningService/CourseContentGroups | Get all course content groups |
| [**getCourseContentGroupsByCourseAsync**](CourseContentGroupsApi.md#getCourseContentGroupsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/ContentGroups | Get course content groups by course |
| [**getCourseContentGroupsByCourseCountAsync**](CourseContentGroupsApi.md#getCourseContentGroupsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/ContentGroups/Count | Get course content groups count by course |
| [**getCourseContentGroupsCountAsync**](CourseContentGroupsApi.md#getCourseContentGroupsCountAsync) | **GET** /api/v2/LearningService/CourseContentGroups/Count | Get course content groups count |
| [**patchCourseContentGroupAsync**](CourseContentGroupsApi.md#patchCourseContentGroupAsync) | **PATCH** /api/v2/LearningService/CourseContentGroups/{groupId} | Patch a course content group |
| [**updateCourseContentGroupAsync**](CourseContentGroupsApi.md#updateCourseContentGroupAsync) | **PUT** /api/v2/LearningService/CourseContentGroups/{groupId} | Update a course content group |


<a id="createCourseContentGroupAsync"></a>
# **createCourseContentGroupAsync**
> createCourseContentGroupAsync(tenantId, apiVersion, xApiVersion, courseContentGroupCreateDto)

Create a new course content group

Creates a new course content group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseContentGroupCreateDto : CourseContentGroupCreateDto =  // CourseContentGroupCreateDto | 
try {
    apiInstance.createCourseContentGroupAsync(tenantId, apiVersion, xApiVersion, courseContentGroupCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#createCourseContentGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#createCourseContentGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseContentGroupCreateDto** | [**CourseContentGroupCreateDto**](CourseContentGroupCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseContentGroupAsync"></a>
# **deleteCourseContentGroupAsync**
> deleteCourseContentGroupAsync(groupId, tenantId, apiVersion, xApiVersion)

Delete a course content group

Deletes a course content group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseContentGroupAsync(groupId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#deleteCourseContentGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#deleteCourseContentGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **groupId** | **kotlin.String**|  | |
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

<a id="getCourseContentGroupByIdAsync"></a>
# **getCourseContentGroupByIdAsync**
> CourseContentGroupDto getCourseContentGroupByIdAsync(groupId, apiVersion, xApiVersion)

Get course content group by ID

Retrieves a specific course content group by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseContentGroupDto = apiInstance.getCourseContentGroupByIdAsync(groupId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#getCourseContentGroupByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#getCourseContentGroupByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **groupId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseContentGroupDto**](CourseContentGroupDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseContentGroupsAsync"></a>
# **getCourseContentGroupsAsync**
> kotlin.collections.List&lt;CourseContentGroupDto&gt; getCourseContentGroupsAsync(tenantId, apiVersion, xApiVersion)

Get all course content groups

Retrieves all course content groups for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseContentGroupDto> = apiInstance.getCourseContentGroupsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#getCourseContentGroupsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#getCourseContentGroupsAsync")
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

[**kotlin.collections.List&lt;CourseContentGroupDto&gt;**](CourseContentGroupDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseContentGroupsByCourseAsync"></a>
# **getCourseContentGroupsByCourseAsync**
> kotlin.collections.List&lt;CourseContentGroupDto&gt; getCourseContentGroupsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course content groups by course

Retrieves all course content groups for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseContentGroupDto> = apiInstance.getCourseContentGroupsByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#getCourseContentGroupsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#getCourseContentGroupsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseContentGroupDto&gt;**](CourseContentGroupDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseContentGroupsByCourseCountAsync"></a>
# **getCourseContentGroupsByCourseCountAsync**
> kotlin.Int getCourseContentGroupsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course content groups count by course

Returns the count of course content groups for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseContentGroupsByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#getCourseContentGroupsByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#getCourseContentGroupsByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseContentGroupsCountAsync"></a>
# **getCourseContentGroupsCountAsync**
> kotlin.Int getCourseContentGroupsCountAsync(tenantId, apiVersion, xApiVersion)

Get course content groups count

Returns the count of course content groups for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseContentGroupsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#getCourseContentGroupsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#getCourseContentGroupsCountAsync")
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

<a id="patchCourseContentGroupAsync"></a>
# **patchCourseContentGroupAsync**
> EmptyEnvelope patchCourseContentGroupAsync(groupId, tenantId, apiVersion, xApiVersion, operation)

Patch a course content group

Partially updates a course content group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchCourseContentGroupAsync(groupId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#patchCourseContentGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#patchCourseContentGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **groupId** | **kotlin.String**|  | |
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

<a id="updateCourseContentGroupAsync"></a>
# **updateCourseContentGroupAsync**
> updateCourseContentGroupAsync(groupId, tenantId, apiVersion, xApiVersion, courseContentGroupUpdateDto)

Update a course content group

Updates an existing course content group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseContentGroupsApi()
val groupId : kotlin.String = groupId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseContentGroupUpdateDto : CourseContentGroupUpdateDto =  // CourseContentGroupUpdateDto | 
try {
    apiInstance.updateCourseContentGroupAsync(groupId, tenantId, apiVersion, xApiVersion, courseContentGroupUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseContentGroupsApi#updateCourseContentGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseContentGroupsApi#updateCourseContentGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **groupId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseContentGroupUpdateDto** | [**CourseContentGroupUpdateDto**](CourseContentGroupUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

