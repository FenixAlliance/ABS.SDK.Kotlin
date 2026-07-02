# CourseTeamMembershipsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseTeamMembershipAsync**](CourseTeamMembershipsApi.md#createCourseTeamMembershipAsync) | **POST** /api/v2/LearningService/CourseTeamMemberships | Create a course team membership |
| [**deleteCourseTeamMembershipAsync**](CourseTeamMembershipsApi.md#deleteCourseTeamMembershipAsync) | **DELETE** /api/v2/LearningService/CourseTeamMemberships/{membershipId} | Delete a course team membership |
| [**getCourseTeamMembershipByIdAsync**](CourseTeamMembershipsApi.md#getCourseTeamMembershipByIdAsync) | **GET** /api/v2/LearningService/CourseTeamMemberships/{membershipId} | Get course team membership by ID |
| [**getCourseTeamMembershipsAsync**](CourseTeamMembershipsApi.md#getCourseTeamMembershipsAsync) | **GET** /api/v2/LearningService/CourseTeamMemberships | Get all course team memberships |
| [**getCourseTeamMembershipsCountAsync**](CourseTeamMembershipsApi.md#getCourseTeamMembershipsCountAsync) | **GET** /api/v2/LearningService/CourseTeamMemberships/Count | Get course team memberships count |
| [**patchCourseTeamMembershipAsync**](CourseTeamMembershipsApi.md#patchCourseTeamMembershipAsync) | **PATCH** /api/v2/LearningService/CourseTeamMemberships/{membershipId} | Patch a course team membership |
| [**updateCourseTeamMembershipAsync**](CourseTeamMembershipsApi.md#updateCourseTeamMembershipAsync) | **PUT** /api/v2/LearningService/CourseTeamMemberships/{membershipId} | Update a course team membership |


<a id="createCourseTeamMembershipAsync"></a>
# **createCourseTeamMembershipAsync**
> createCourseTeamMembershipAsync(tenantId, apiVersion, xApiVersion, courseTeamMembershipCreateDto)

Create a course team membership

Creates a new course team membership for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseTeamMembershipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseTeamMembershipCreateDto : CourseTeamMembershipCreateDto =  // CourseTeamMembershipCreateDto | 
try {
    apiInstance.createCourseTeamMembershipAsync(tenantId, apiVersion, xApiVersion, courseTeamMembershipCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseTeamMembershipsApi#createCourseTeamMembershipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseTeamMembershipsApi#createCourseTeamMembershipAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseTeamMembershipCreateDto** | [**CourseTeamMembershipCreateDto**](CourseTeamMembershipCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseTeamMembershipAsync"></a>
# **deleteCourseTeamMembershipAsync**
> deleteCourseTeamMembershipAsync(membershipId, tenantId, apiVersion, xApiVersion)

Delete a course team membership

Deletes a course team membership by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseTeamMembershipsApi()
val membershipId : kotlin.String = membershipId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseTeamMembershipAsync(membershipId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseTeamMembershipsApi#deleteCourseTeamMembershipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseTeamMembershipsApi#deleteCourseTeamMembershipAsync")
    e.printStackTrace()
}
```

### Parameters
| **membershipId** | **kotlin.String**|  | |
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

<a id="getCourseTeamMembershipByIdAsync"></a>
# **getCourseTeamMembershipByIdAsync**
> CourseTeamMembershipDto getCourseTeamMembershipByIdAsync(membershipId, apiVersion, xApiVersion)

Get course team membership by ID

Retrieves a specific course team membership by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseTeamMembershipsApi()
val membershipId : kotlin.String = membershipId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseTeamMembershipDto = apiInstance.getCourseTeamMembershipByIdAsync(membershipId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseTeamMembershipsApi#getCourseTeamMembershipByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseTeamMembershipsApi#getCourseTeamMembershipByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **membershipId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseTeamMembershipDto**](CourseTeamMembershipDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseTeamMembershipsAsync"></a>
# **getCourseTeamMembershipsAsync**
> kotlin.collections.List&lt;CourseTeamMembershipDto&gt; getCourseTeamMembershipsAsync(tenantId, apiVersion, xApiVersion)

Get all course team memberships

Retrieves all course team memberships for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseTeamMembershipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseTeamMembershipDto> = apiInstance.getCourseTeamMembershipsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseTeamMembershipsApi#getCourseTeamMembershipsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseTeamMembershipsApi#getCourseTeamMembershipsAsync")
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

[**kotlin.collections.List&lt;CourseTeamMembershipDto&gt;**](CourseTeamMembershipDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseTeamMembershipsCountAsync"></a>
# **getCourseTeamMembershipsCountAsync**
> kotlin.Int getCourseTeamMembershipsCountAsync(tenantId, apiVersion, xApiVersion)

Get course team memberships count

Returns the count of course team memberships for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseTeamMembershipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseTeamMembershipsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseTeamMembershipsApi#getCourseTeamMembershipsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseTeamMembershipsApi#getCourseTeamMembershipsCountAsync")
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

<a id="patchCourseTeamMembershipAsync"></a>
# **patchCourseTeamMembershipAsync**
> EmptyEnvelope patchCourseTeamMembershipAsync(membershipId, tenantId, apiVersion, xApiVersion, operation)

Patch a course team membership

Partially updates a course team membership for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseTeamMembershipsApi()
val membershipId : kotlin.String = membershipId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchCourseTeamMembershipAsync(membershipId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseTeamMembershipsApi#patchCourseTeamMembershipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseTeamMembershipsApi#patchCourseTeamMembershipAsync")
    e.printStackTrace()
}
```

### Parameters
| **membershipId** | **kotlin.String**|  | |
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

<a id="updateCourseTeamMembershipAsync"></a>
# **updateCourseTeamMembershipAsync**
> updateCourseTeamMembershipAsync(membershipId, tenantId, apiVersion, xApiVersion, courseTeamMembershipUpdateDto)

Update a course team membership

Updates an existing course team membership.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseTeamMembershipsApi()
val membershipId : kotlin.String = membershipId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseTeamMembershipUpdateDto : CourseTeamMembershipUpdateDto =  // CourseTeamMembershipUpdateDto | 
try {
    apiInstance.updateCourseTeamMembershipAsync(membershipId, tenantId, apiVersion, xApiVersion, courseTeamMembershipUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseTeamMembershipsApi#updateCourseTeamMembershipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseTeamMembershipsApi#updateCourseTeamMembershipAsync")
    e.printStackTrace()
}
```

### Parameters
| **membershipId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseTeamMembershipUpdateDto** | [**CourseTeamMembershipUpdateDto**](CourseTeamMembershipUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

