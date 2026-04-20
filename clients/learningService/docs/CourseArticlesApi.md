# CourseArticlesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseArticleAsync**](CourseArticlesApi.md#createCourseArticleAsync) | **POST** /api/v2/LearningService/CourseArticles | Create a new course article |
| [**deleteCourseArticleAsync**](CourseArticlesApi.md#deleteCourseArticleAsync) | **DELETE** /api/v2/LearningService/CourseArticles/{articleId} | Delete a course article |
| [**getCourseArticleByIdAsync**](CourseArticlesApi.md#getCourseArticleByIdAsync) | **GET** /api/v2/LearningService/CourseArticles/{articleId} | Get course article by ID |
| [**getCourseArticlesAsync**](CourseArticlesApi.md#getCourseArticlesAsync) | **GET** /api/v2/LearningService/CourseArticles | Get all course articles |
| [**getCourseArticlesCountAsync**](CourseArticlesApi.md#getCourseArticlesCountAsync) | **GET** /api/v2/LearningService/CourseArticles/Count | Get course articles count |
| [**updateCourseArticleAsync**](CourseArticlesApi.md#updateCourseArticleAsync) | **PUT** /api/v2/LearningService/CourseArticles/{articleId} | Update a course article |


<a id="createCourseArticleAsync"></a>
# **createCourseArticleAsync**
> createCourseArticleAsync(tenantId, apiVersion, xApiVersion, courseArticleCreateDto)

Create a new course article

Creates a new course article for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseArticlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseArticleCreateDto : CourseArticleCreateDto =  // CourseArticleCreateDto | 
try {
    apiInstance.createCourseArticleAsync(tenantId, apiVersion, xApiVersion, courseArticleCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseArticlesApi#createCourseArticleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseArticlesApi#createCourseArticleAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseArticleCreateDto** | [**CourseArticleCreateDto**](CourseArticleCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseArticleAsync"></a>
# **deleteCourseArticleAsync**
> deleteCourseArticleAsync(articleId, tenantId, apiVersion, xApiVersion)

Delete a course article

Deletes a course article for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseArticlesApi()
val articleId : kotlin.String = articleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseArticleAsync(articleId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseArticlesApi#deleteCourseArticleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseArticlesApi#deleteCourseArticleAsync")
    e.printStackTrace()
}
```

### Parameters
| **articleId** | **kotlin.String**|  | |
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

<a id="getCourseArticleByIdAsync"></a>
# **getCourseArticleByIdAsync**
> CourseArticleDto getCourseArticleByIdAsync(articleId, apiVersion, xApiVersion)

Get course article by ID

Retrieves a specific course article by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseArticlesApi()
val articleId : kotlin.String = articleId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseArticleDto = apiInstance.getCourseArticleByIdAsync(articleId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseArticlesApi#getCourseArticleByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseArticlesApi#getCourseArticleByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **articleId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseArticleDto**](CourseArticleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseArticlesAsync"></a>
# **getCourseArticlesAsync**
> kotlin.collections.List&lt;CourseArticleDto&gt; getCourseArticlesAsync(tenantId, apiVersion, xApiVersion)

Get all course articles

Retrieves all course articles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseArticlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseArticleDto> = apiInstance.getCourseArticlesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseArticlesApi#getCourseArticlesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseArticlesApi#getCourseArticlesAsync")
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

[**kotlin.collections.List&lt;CourseArticleDto&gt;**](CourseArticleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseArticlesCountAsync"></a>
# **getCourseArticlesCountAsync**
> kotlin.Int getCourseArticlesCountAsync(tenantId, apiVersion, xApiVersion)

Get course articles count

Returns the count of course articles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseArticlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseArticlesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseArticlesApi#getCourseArticlesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseArticlesApi#getCourseArticlesCountAsync")
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

<a id="updateCourseArticleAsync"></a>
# **updateCourseArticleAsync**
> updateCourseArticleAsync(articleId, tenantId, apiVersion, xApiVersion, courseArticleUpdateDto)

Update a course article

Updates an existing course article for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseArticlesApi()
val articleId : kotlin.String = articleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseArticleUpdateDto : CourseArticleUpdateDto =  // CourseArticleUpdateDto | 
try {
    apiInstance.updateCourseArticleAsync(articleId, tenantId, apiVersion, xApiVersion, courseArticleUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseArticlesApi#updateCourseArticleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseArticlesApi#updateCourseArticleAsync")
    e.printStackTrace()
}
```

### Parameters
| **articleId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseArticleUpdateDto** | [**CourseArticleUpdateDto**](CourseArticleUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

