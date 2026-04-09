# BlogPostAuthorsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countBlogPostsByAuthorAsync**](BlogPostAuthorsApi.md#countBlogPostsByAuthorAsync) | **GET** /api/v2/ContentService/BlogPostAuthors/{authorId}/BlogPosts/Count | Count blog posts by author |
| [**getBlogAuthorByIdAsync**](BlogPostAuthorsApi.md#getBlogAuthorByIdAsync) | **GET** /api/v2/ContentService/BlogPostAuthors/{authorId} | Get blog author by ID |
| [**getBlogAuthorsAsync**](BlogPostAuthorsApi.md#getBlogAuthorsAsync) | **GET** /api/v2/ContentService/BlogPostAuthors | Get blog authors |
| [**getBlogPostsByAuthorAsync**](BlogPostAuthorsApi.md#getBlogPostsByAuthorAsync) | **GET** /api/v2/ContentService/BlogPostAuthors/{authorId}/BlogPosts | Get blog posts by author |


<a id="countBlogPostsByAuthorAsync"></a>
# **countBlogPostsByAuthorAsync**
> Int32Envelope countBlogPostsByAuthorAsync(authorId, apiVersion, xApiVersion)

Count blog posts by author

Returns the count of blog posts written by a specific author.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostAuthorsApi()
val authorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countBlogPostsByAuthorAsync(authorId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostAuthorsApi#countBlogPostsByAuthorAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostAuthorsApi#countBlogPostsByAuthorAsync")
    e.printStackTrace()
}
```

### Parameters
| **authorId** | **java.util.UUID**|  | |
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

<a id="getBlogAuthorByIdAsync"></a>
# **getBlogAuthorByIdAsync**
> BlogAuthorDtoEnvelope getBlogAuthorByIdAsync(authorId, apiVersion, xApiVersion)

Get blog author by ID

Retrieves a specific blog author by their identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostAuthorsApi()
val authorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlogAuthorDtoEnvelope = apiInstance.getBlogAuthorByIdAsync(authorId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostAuthorsApi#getBlogAuthorByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostAuthorsApi#getBlogAuthorByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **authorId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlogAuthorDtoEnvelope**](BlogAuthorDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlogAuthorsAsync"></a>
# **getBlogAuthorsAsync**
> BlogAuthorDtoListEnvelope getBlogAuthorsAsync(tenantId, apiVersion, xApiVersion)

Get blog authors

Retrieves all blog authors, optionally filtered by tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostAuthorsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlogAuthorDtoListEnvelope = apiInstance.getBlogAuthorsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostAuthorsApi#getBlogAuthorsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostAuthorsApi#getBlogAuthorsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlogAuthorDtoListEnvelope**](BlogAuthorDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlogPostsByAuthorAsync"></a>
# **getBlogPostsByAuthorAsync**
> BlogPostDtoListEnvelope getBlogPostsByAuthorAsync(authorId, apiVersion, xApiVersion)

Get blog posts by author

Retrieves all blog posts written by a specific author.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostAuthorsApi()
val authorId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlogPostDtoListEnvelope = apiInstance.getBlogPostsByAuthorAsync(authorId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostAuthorsApi#getBlogPostsByAuthorAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostAuthorsApi#getBlogPostsByAuthorAsync")
    e.printStackTrace()
}
```

### Parameters
| **authorId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlogPostDtoListEnvelope**](BlogPostDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

