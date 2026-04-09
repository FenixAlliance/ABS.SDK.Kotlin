# CourseWikisApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseWikiAsync**](CourseWikisApi.md#createCourseWikiAsync) | **POST** /api/v2/LearningService/CourseWikis | Create a new course wiki |
| [**deleteCourseWikiAsync**](CourseWikisApi.md#deleteCourseWikiAsync) | **DELETE** /api/v2/LearningService/CourseWikis/{wikiId} | Delete a course wiki |
| [**getCourseWikiByIdAsync**](CourseWikisApi.md#getCourseWikiByIdAsync) | **GET** /api/v2/LearningService/CourseWikis/{wikiId} | Get course wiki by ID |
| [**getCourseWikisAsync**](CourseWikisApi.md#getCourseWikisAsync) | **GET** /api/v2/LearningService/CourseWikis | Get all course wikis |
| [**getCourseWikisCountAsync**](CourseWikisApi.md#getCourseWikisCountAsync) | **GET** /api/v2/LearningService/CourseWikis/Count | Get course wikis count |
| [**updateCourseWikiAsync**](CourseWikisApi.md#updateCourseWikiAsync) | **PUT** /api/v2/LearningService/CourseWikis/{wikiId} | Update a course wiki |


<a id="createCourseWikiAsync"></a>
# **createCourseWikiAsync**
> createCourseWikiAsync(tenantId, apiVersion, xApiVersion, courseWikiCreateDto)

Create a new course wiki

Creates a new course wiki for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseWikisApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseWikiCreateDto : CourseWikiCreateDto =  // CourseWikiCreateDto | 
try {
    apiInstance.createCourseWikiAsync(tenantId, apiVersion, xApiVersion, courseWikiCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseWikisApi#createCourseWikiAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseWikisApi#createCourseWikiAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseWikiCreateDto** | [**CourseWikiCreateDto**](CourseWikiCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseWikiAsync"></a>
# **deleteCourseWikiAsync**
> deleteCourseWikiAsync(wikiId, tenantId, apiVersion, xApiVersion)

Delete a course wiki

Deletes a course wiki for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseWikisApi()
val wikiId : kotlin.String = wikiId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseWikiAsync(wikiId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseWikisApi#deleteCourseWikiAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseWikisApi#deleteCourseWikiAsync")
    e.printStackTrace()
}
```

### Parameters
| **wikiId** | **kotlin.String**|  | |
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

<a id="getCourseWikiByIdAsync"></a>
# **getCourseWikiByIdAsync**
> CourseWikiDto getCourseWikiByIdAsync(wikiId, apiVersion, xApiVersion)

Get course wiki by ID

Retrieves a specific course wiki by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseWikisApi()
val wikiId : kotlin.String = wikiId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseWikiDto = apiInstance.getCourseWikiByIdAsync(wikiId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseWikisApi#getCourseWikiByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseWikisApi#getCourseWikiByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **wikiId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseWikiDto**](CourseWikiDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseWikisAsync"></a>
# **getCourseWikisAsync**
> kotlin.collections.List&lt;CourseWikiDto&gt; getCourseWikisAsync(tenantId, apiVersion, xApiVersion)

Get all course wikis

Retrieves all course wikis for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseWikisApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseWikiDto> = apiInstance.getCourseWikisAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseWikisApi#getCourseWikisAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseWikisApi#getCourseWikisAsync")
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

[**kotlin.collections.List&lt;CourseWikiDto&gt;**](CourseWikiDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseWikisCountAsync"></a>
# **getCourseWikisCountAsync**
> kotlin.Int getCourseWikisCountAsync(tenantId, apiVersion, xApiVersion)

Get course wikis count

Returns the count of course wikis for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseWikisApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseWikisCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseWikisApi#getCourseWikisCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseWikisApi#getCourseWikisCountAsync")
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

<a id="updateCourseWikiAsync"></a>
# **updateCourseWikiAsync**
> updateCourseWikiAsync(wikiId, tenantId, apiVersion, xApiVersion, courseWikiUpdateDto)

Update a course wiki

Updates an existing course wiki for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseWikisApi()
val wikiId : kotlin.String = wikiId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseWikiUpdateDto : CourseWikiUpdateDto =  // CourseWikiUpdateDto | 
try {
    apiInstance.updateCourseWikiAsync(wikiId, tenantId, apiVersion, xApiVersion, courseWikiUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseWikisApi#updateCourseWikiAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseWikisApi#updateCourseWikiAsync")
    e.printStackTrace()
}
```

### Parameters
| **wikiId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseWikiUpdateDto** | [**CourseWikiUpdateDto**](CourseWikiUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

