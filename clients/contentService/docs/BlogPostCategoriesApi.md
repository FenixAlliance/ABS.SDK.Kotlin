# BlogPostCategoriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countBlogPostCategoriesAsync**](BlogPostCategoriesApi.md#countBlogPostCategoriesAsync) | **GET** /api/v2/ContentService/BlogPostCategories/Count | Count blog post categories |
| [**createBlogPostCategoryAsync**](BlogPostCategoriesApi.md#createBlogPostCategoryAsync) | **POST** /api/v2/ContentService/BlogPostCategories | Create a blog post category |
| [**deleteBlogPostCategoryAsync**](BlogPostCategoriesApi.md#deleteBlogPostCategoryAsync) | **DELETE** /api/v2/ContentService/BlogPostCategories/{blogPostCategoryId} | Delete a blog post category |
| [**getBlogPostCategoriesAsync**](BlogPostCategoriesApi.md#getBlogPostCategoriesAsync) | **GET** /api/v2/ContentService/BlogPostCategories | Get blog post categories |
| [**getBlogPostCategoryByIdAsync**](BlogPostCategoriesApi.md#getBlogPostCategoryByIdAsync) | **GET** /api/v2/ContentService/BlogPostCategories/{blogPostCategoryId} | Get blog post category by ID |
| [**updateBlogPostCategoryAsync**](BlogPostCategoriesApi.md#updateBlogPostCategoryAsync) | **PUT** /api/v2/ContentService/BlogPostCategories/{blogPostCategoryId} | Update a blog post category |


<a id="countBlogPostCategoriesAsync"></a>
# **countBlogPostCategoriesAsync**
> Int32Envelope countBlogPostCategoriesAsync(tenantId, apiVersion, xApiVersion)

Count blog post categories

Counts all blog post categories for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countBlogPostCategoriesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostCategoriesApi#countBlogPostCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostCategoriesApi#countBlogPostCategoriesAsync")
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

<a id="createBlogPostCategoryAsync"></a>
# **createBlogPostCategoryAsync**
> EmptyEnvelope createBlogPostCategoryAsync(tenantId, apiVersion, xApiVersion, blogPostCategoryCreateDto)

Create a blog post category

Creates a new blog post category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blogPostCategoryCreateDto : BlogPostCategoryCreateDto =  // BlogPostCategoryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createBlogPostCategoryAsync(tenantId, apiVersion, xApiVersion, blogPostCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostCategoriesApi#createBlogPostCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostCategoriesApi#createBlogPostCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostCategoryCreateDto** | [**BlogPostCategoryCreateDto**](BlogPostCategoryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteBlogPostCategoryAsync"></a>
# **deleteBlogPostCategoryAsync**
> EmptyEnvelope deleteBlogPostCategoryAsync(blogPostCategoryId, tenantId, apiVersion, xApiVersion)

Delete a blog post category

Deletes a blog post category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostCategoriesApi()
val blogPostCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBlogPostCategoryAsync(blogPostCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostCategoriesApi#deleteBlogPostCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostCategoriesApi#deleteBlogPostCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostCategoryId** | **java.util.UUID**|  | |
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

<a id="getBlogPostCategoriesAsync"></a>
# **getBlogPostCategoriesAsync**
> BlogPostCategoryDtoListEnvelope getBlogPostCategoriesAsync(tenantId, apiVersion, xApiVersion)

Get blog post categories

Retrieves all blog post categories for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlogPostCategoryDtoListEnvelope = apiInstance.getBlogPostCategoriesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostCategoriesApi#getBlogPostCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostCategoriesApi#getBlogPostCategoriesAsync")
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

[**BlogPostCategoryDtoListEnvelope**](BlogPostCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlogPostCategoryByIdAsync"></a>
# **getBlogPostCategoryByIdAsync**
> BlogPostCategoryDtoEnvelope getBlogPostCategoryByIdAsync(blogPostCategoryId, tenantId, apiVersion, xApiVersion)

Get blog post category by ID

Retrieves a specific blog post category by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostCategoriesApi()
val blogPostCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlogPostCategoryDtoEnvelope = apiInstance.getBlogPostCategoryByIdAsync(blogPostCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostCategoriesApi#getBlogPostCategoryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostCategoriesApi#getBlogPostCategoryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlogPostCategoryDtoEnvelope**](BlogPostCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateBlogPostCategoryAsync"></a>
# **updateBlogPostCategoryAsync**
> EmptyEnvelope updateBlogPostCategoryAsync(blogPostCategoryId, tenantId, apiVersion, xApiVersion, blogPostCategoryUpdateDto)

Update a blog post category

Updates an existing blog post category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostCategoriesApi()
val blogPostCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blogPostCategoryUpdateDto : BlogPostCategoryUpdateDto =  // BlogPostCategoryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateBlogPostCategoryAsync(blogPostCategoryId, tenantId, apiVersion, xApiVersion, blogPostCategoryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostCategoriesApi#updateBlogPostCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostCategoriesApi#updateBlogPostCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostCategoryUpdateDto** | [**BlogPostCategoryUpdateDto**](BlogPostCategoryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

