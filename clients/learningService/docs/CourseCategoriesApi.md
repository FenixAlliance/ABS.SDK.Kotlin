# CourseCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseCategoryAsync**](CourseCategoriesApi.md#createCourseCategoryAsync) | **POST** /api/v2/LearningService/CourseCategories | Create a new course category |
| [**deleteCourseCategoryAsync**](CourseCategoriesApi.md#deleteCourseCategoryAsync) | **DELETE** /api/v2/LearningService/CourseCategories/{categoryId} | Delete a course category |
| [**getCourseCategoriesAsync**](CourseCategoriesApi.md#getCourseCategoriesAsync) | **GET** /api/v2/LearningService/CourseCategories | Get all course categories |
| [**getCourseCategoriesCountAsync**](CourseCategoriesApi.md#getCourseCategoriesCountAsync) | **GET** /api/v2/LearningService/CourseCategories/Count | Get course categories count |
| [**getCourseCategoryByIdAsync**](CourseCategoriesApi.md#getCourseCategoryByIdAsync) | **GET** /api/v2/LearningService/CourseCategories/{categoryId} | Get course category by ID |
| [**updateCourseCategoryAsync**](CourseCategoriesApi.md#updateCourseCategoryAsync) | **PUT** /api/v2/LearningService/CourseCategories/{categoryId} | Update a course category |


<a id="createCourseCategoryAsync"></a>
# **createCourseCategoryAsync**
> createCourseCategoryAsync(tenantId, apiVersion, xApiVersion, courseCategoryCreateDto)

Create a new course category

Creates a new course category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCategoryCreateDto : CourseCategoryCreateDto =  // CourseCategoryCreateDto | 
try {
    apiInstance.createCourseCategoryAsync(tenantId, apiVersion, xApiVersion, courseCategoryCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseCategoriesApi#createCourseCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCategoriesApi#createCourseCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCategoryCreateDto** | [**CourseCategoryCreateDto**](CourseCategoryCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseCategoryAsync"></a>
# **deleteCourseCategoryAsync**
> deleteCourseCategoryAsync(categoryId, tenantId, apiVersion, xApiVersion)

Delete a course category

Deletes a course category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCategoriesApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseCategoryAsync(categoryId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseCategoriesApi#deleteCourseCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCategoriesApi#deleteCourseCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**|  | |
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

<a id="getCourseCategoriesAsync"></a>
# **getCourseCategoriesAsync**
> kotlin.collections.List&lt;CourseCategoryDto&gt; getCourseCategoriesAsync(tenantId, apiVersion, xApiVersion)

Get all course categories

Retrieves all course categories for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseCategoryDto> = apiInstance.getCourseCategoriesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCategoriesApi#getCourseCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCategoriesApi#getCourseCategoriesAsync")
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

[**kotlin.collections.List&lt;CourseCategoryDto&gt;**](CourseCategoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCategoriesCountAsync"></a>
# **getCourseCategoriesCountAsync**
> kotlin.Int getCourseCategoriesCountAsync(tenantId, apiVersion, xApiVersion)

Get course categories count

Returns the count of course categories for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseCategoriesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCategoriesApi#getCourseCategoriesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCategoriesApi#getCourseCategoriesCountAsync")
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

<a id="getCourseCategoryByIdAsync"></a>
# **getCourseCategoryByIdAsync**
> CourseCategoryDto getCourseCategoryByIdAsync(categoryId, apiVersion, xApiVersion)

Get course category by ID

Retrieves a specific course category by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCategoriesApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseCategoryDto = apiInstance.getCourseCategoryByIdAsync(categoryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCategoriesApi#getCourseCategoryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCategoriesApi#getCourseCategoryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseCategoryDto**](CourseCategoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateCourseCategoryAsync"></a>
# **updateCourseCategoryAsync**
> updateCourseCategoryAsync(categoryId, tenantId, apiVersion, xApiVersion, courseCategoryUpdateDto)

Update a course category

Updates an existing course category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCategoriesApi()
val categoryId : kotlin.String = categoryId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCategoryUpdateDto : CourseCategoryUpdateDto =  // CourseCategoryUpdateDto | 
try {
    apiInstance.updateCourseCategoryAsync(categoryId, tenantId, apiVersion, xApiVersion, courseCategoryUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseCategoriesApi#updateCourseCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCategoriesApi#updateCourseCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCategoryUpdateDto** | [**CourseCategoryUpdateDto**](CourseCategoryUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

