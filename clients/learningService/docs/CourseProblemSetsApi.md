# CourseProblemSetsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseProblemSetAsync**](CourseProblemSetsApi.md#createCourseProblemSetAsync) | **POST** /api/v2/LearningService/CourseProblemSets | Create a new course problem set |
| [**deleteCourseProblemSetAsync**](CourseProblemSetsApi.md#deleteCourseProblemSetAsync) | **DELETE** /api/v2/LearningService/CourseProblemSets/{problemSetId} | Delete a course problem set |
| [**getCourseProblemSetByIdAsync**](CourseProblemSetsApi.md#getCourseProblemSetByIdAsync) | **GET** /api/v2/LearningService/CourseProblemSets/{problemSetId} | Get course problem set by ID |
| [**getCourseProblemSetsAsync**](CourseProblemSetsApi.md#getCourseProblemSetsAsync) | **GET** /api/v2/LearningService/CourseProblemSets | Get all course problem sets |
| [**getCourseProblemSetsCountAsync**](CourseProblemSetsApi.md#getCourseProblemSetsCountAsync) | **GET** /api/v2/LearningService/CourseProblemSets/Count | Get course problem sets count |
| [**updateCourseProblemSetAsync**](CourseProblemSetsApi.md#updateCourseProblemSetAsync) | **PUT** /api/v2/LearningService/CourseProblemSets/{problemSetId} | Update a course problem set |


<a id="createCourseProblemSetAsync"></a>
# **createCourseProblemSetAsync**
> createCourseProblemSetAsync(tenantId, apiVersion, xApiVersion, courseProblemSetCreateDto)

Create a new course problem set

Creates a new course problem set for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseProblemSetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseProblemSetCreateDto : CourseProblemSetCreateDto =  // CourseProblemSetCreateDto | 
try {
    apiInstance.createCourseProblemSetAsync(tenantId, apiVersion, xApiVersion, courseProblemSetCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseProblemSetsApi#createCourseProblemSetAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseProblemSetsApi#createCourseProblemSetAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseProblemSetCreateDto** | [**CourseProblemSetCreateDto**](CourseProblemSetCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseProblemSetAsync"></a>
# **deleteCourseProblemSetAsync**
> deleteCourseProblemSetAsync(problemSetId, tenantId, apiVersion, xApiVersion)

Delete a course problem set

Deletes a course problem set for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseProblemSetsApi()
val problemSetId : kotlin.String = problemSetId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseProblemSetAsync(problemSetId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseProblemSetsApi#deleteCourseProblemSetAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseProblemSetsApi#deleteCourseProblemSetAsync")
    e.printStackTrace()
}
```

### Parameters
| **problemSetId** | **kotlin.String**|  | |
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

<a id="getCourseProblemSetByIdAsync"></a>
# **getCourseProblemSetByIdAsync**
> CourseProblemSetDto getCourseProblemSetByIdAsync(problemSetId, apiVersion, xApiVersion)

Get course problem set by ID

Retrieves a specific course problem set by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseProblemSetsApi()
val problemSetId : kotlin.String = problemSetId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseProblemSetDto = apiInstance.getCourseProblemSetByIdAsync(problemSetId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseProblemSetsApi#getCourseProblemSetByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseProblemSetsApi#getCourseProblemSetByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **problemSetId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseProblemSetDto**](CourseProblemSetDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseProblemSetsAsync"></a>
# **getCourseProblemSetsAsync**
> kotlin.collections.List&lt;CourseProblemSetDto&gt; getCourseProblemSetsAsync(tenantId, apiVersion, xApiVersion)

Get all course problem sets

Retrieves all course problem sets for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseProblemSetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseProblemSetDto> = apiInstance.getCourseProblemSetsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseProblemSetsApi#getCourseProblemSetsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseProblemSetsApi#getCourseProblemSetsAsync")
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

[**kotlin.collections.List&lt;CourseProblemSetDto&gt;**](CourseProblemSetDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseProblemSetsCountAsync"></a>
# **getCourseProblemSetsCountAsync**
> kotlin.Int getCourseProblemSetsCountAsync(tenantId, apiVersion, xApiVersion)

Get course problem sets count

Returns the count of course problem sets for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseProblemSetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseProblemSetsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseProblemSetsApi#getCourseProblemSetsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseProblemSetsApi#getCourseProblemSetsCountAsync")
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

<a id="updateCourseProblemSetAsync"></a>
# **updateCourseProblemSetAsync**
> updateCourseProblemSetAsync(problemSetId, tenantId, apiVersion, xApiVersion, courseProblemSetUpdateDto)

Update a course problem set

Updates an existing course problem set for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseProblemSetsApi()
val problemSetId : kotlin.String = problemSetId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseProblemSetUpdateDto : CourseProblemSetUpdateDto =  // CourseProblemSetUpdateDto | 
try {
    apiInstance.updateCourseProblemSetAsync(problemSetId, tenantId, apiVersion, xApiVersion, courseProblemSetUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseProblemSetsApi#updateCourseProblemSetAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseProblemSetsApi#updateCourseProblemSetAsync")
    e.printStackTrace()
}
```

### Parameters
| **problemSetId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseProblemSetUpdateDto** | [**CourseProblemSetUpdateDto**](CourseProblemSetUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

