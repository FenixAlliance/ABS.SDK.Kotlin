# BlogPostTagsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countBlogPostTagsAsync**](BlogPostTagsApi.md#countBlogPostTagsAsync) | **GET** /api/v2/ContentService/BlogPostTags/Count | Count blog post tags |
| [**createBlogPostTagAsync**](BlogPostTagsApi.md#createBlogPostTagAsync) | **POST** /api/v2/ContentService/BlogPostTags | Create a blog post tag |
| [**deleteBlogPostTagAsync**](BlogPostTagsApi.md#deleteBlogPostTagAsync) | **DELETE** /api/v2/ContentService/BlogPostTags/{blogPostTagId} | Delete a blog post tag |
| [**getBlogPostTagByIdAsync**](BlogPostTagsApi.md#getBlogPostTagByIdAsync) | **GET** /api/v2/ContentService/BlogPostTags/{blogPostTagId} | Get blog post tag by ID |
| [**getBlogPostTagsAsync**](BlogPostTagsApi.md#getBlogPostTagsAsync) | **GET** /api/v2/ContentService/BlogPostTags | Get blog post tags |
| [**updateBlogPostTagAsync**](BlogPostTagsApi.md#updateBlogPostTagAsync) | **PUT** /api/v2/ContentService/BlogPostTags/{blogPostTagId} | Update a blog post tag |


<a id="countBlogPostTagsAsync"></a>
# **countBlogPostTagsAsync**
> Int32Envelope countBlogPostTagsAsync(tenantId, apiVersion, xApiVersion)

Count blog post tags

Counts all blog post tags for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostTagsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countBlogPostTagsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostTagsApi#countBlogPostTagsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostTagsApi#countBlogPostTagsAsync")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createBlogPostTagAsync"></a>
# **createBlogPostTagAsync**
> EmptyEnvelope createBlogPostTagAsync(tenantId, apiVersion, xApiVersion, blogPostTagCreateDto)

Create a blog post tag

Creates a new blog post tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostTagsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blogPostTagCreateDto : BlogPostTagCreateDto =  // BlogPostTagCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createBlogPostTagAsync(tenantId, apiVersion, xApiVersion, blogPostTagCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostTagsApi#createBlogPostTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostTagsApi#createBlogPostTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostTagCreateDto** | [**BlogPostTagCreateDto**](BlogPostTagCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteBlogPostTagAsync"></a>
# **deleteBlogPostTagAsync**
> EmptyEnvelope deleteBlogPostTagAsync(blogPostTagId, tenantId, apiVersion, xApiVersion)

Delete a blog post tag

Deletes a blog post tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostTagsApi()
val blogPostTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBlogPostTagAsync(blogPostTagId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostTagsApi#deleteBlogPostTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostTagsApi#deleteBlogPostTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlogPostTagByIdAsync"></a>
# **getBlogPostTagByIdAsync**
> BlogPostTagDtoEnvelope getBlogPostTagByIdAsync(blogPostTagId, tenantId, apiVersion, xApiVersion)

Get blog post tag by ID

Retrieves a specific blog post tag by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostTagsApi()
val blogPostTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlogPostTagDtoEnvelope = apiInstance.getBlogPostTagByIdAsync(blogPostTagId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostTagsApi#getBlogPostTagByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostTagsApi#getBlogPostTagByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlogPostTagDtoEnvelope**](BlogPostTagDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlogPostTagsAsync"></a>
# **getBlogPostTagsAsync**
> BlogPostTagDtoListEnvelope getBlogPostTagsAsync(tenantId, apiVersion, xApiVersion)

Get blog post tags

Retrieves all blog post tags for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostTagsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlogPostTagDtoListEnvelope = apiInstance.getBlogPostTagsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostTagsApi#getBlogPostTagsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostTagsApi#getBlogPostTagsAsync")
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

[**BlogPostTagDtoListEnvelope**](BlogPostTagDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateBlogPostTagAsync"></a>
# **updateBlogPostTagAsync**
> EmptyEnvelope updateBlogPostTagAsync(blogPostTagId, tenantId, apiVersion, xApiVersion, blogPostTagUpdateDto)

Update a blog post tag

Updates an existing blog post tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostTagsApi()
val blogPostTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blogPostTagUpdateDto : BlogPostTagUpdateDto =  // BlogPostTagUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateBlogPostTagAsync(blogPostTagId, tenantId, apiVersion, xApiVersion, blogPostTagUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostTagsApi#updateBlogPostTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostTagsApi#updateBlogPostTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostTagUpdateDto** | [**BlogPostTagUpdateDto**](BlogPostTagUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

