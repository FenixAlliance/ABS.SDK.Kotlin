# BlogPostsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBlogPostAsync**](BlogPostsApi.md#createBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts | Create a new blog post |
| [**createCategoryForBlogPostAsync**](BlogPostsApi.md#createCategoryForBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Categories | Create a category for a blog post |
| [**createCommentForBlogPostAsync**](BlogPostsApi.md#createCommentForBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments | Create a comment for a blog post |
| [**createTagForBlogPostAsync**](BlogPostsApi.md#createTagForBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Tags | Create a tag for a blog post |
| [**deleteBlogPostAsync**](BlogPostsApi.md#deleteBlogPostAsync) | **DELETE** /api/v2/ContentService/BlogPosts/{blogPostId} | Delete a blog post |
| [**deleteCommentFromBlogPostAsync**](BlogPostsApi.md#deleteCommentFromBlogPostAsync) | **DELETE** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments/{commentId} | Delete a blog post comment |
| [**getBlogPostByIdAsync**](BlogPostsApi.md#getBlogPostByIdAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId} | Get a blog post by ID |
| [**getBlogPostsAsync**](BlogPostsApi.md#getBlogPostsAsync) | **GET** /api/v2/ContentService/BlogPosts | Retrieve a list of blog posts |
| [**getBlogPostsCountAsync**](BlogPostsApi.md#getBlogPostsCountAsync) | **GET** /api/v2/ContentService/BlogPosts/Count | Get the count of blog posts |
| [**getCategoriesForBlogPostAsync**](BlogPostsApi.md#getCategoriesForBlogPostAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId}/Categories | Get categories for a blog post |
| [**getCommentsForBlogPostAsync**](BlogPostsApi.md#getCommentsForBlogPostAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments | Get comments for a blog post |
| [**getRepliesForCommentAsync**](BlogPostsApi.md#getRepliesForCommentAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments/{commentId}/Replies | Get replies for a comment |
| [**getTagsForBlogPostAsync**](BlogPostsApi.md#getTagsForBlogPostAsync) | **GET** /api/v2/ContentService/BlogPosts/{blogPostId}/Tags | Get tags for a blog post |
| [**relateCategoryToBlogPostAsync**](BlogPostsApi.md#relateCategoryToBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Categories/{categoryId} | Relate an existing category to a blog post |
| [**relateTagToBlogPostAsync**](BlogPostsApi.md#relateTagToBlogPostAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Tags/{tagId} | Relate an existing tag to a blog post |
| [**replyToCommentAsync**](BlogPostsApi.md#replyToCommentAsync) | **POST** /api/v2/ContentService/BlogPosts/{blogPostId}/Comments/{commentId}/Reply | Reply to a blog post comment |
| [**unrelateCategoryFromBlogPostAsync**](BlogPostsApi.md#unrelateCategoryFromBlogPostAsync) | **DELETE** /api/v2/ContentService/BlogPosts/{blogPostId}/Categories/{categoryId} | Remove a category from a blog post |
| [**unrelateTagFromBlogPostAsync**](BlogPostsApi.md#unrelateTagFromBlogPostAsync) | **DELETE** /api/v2/ContentService/BlogPosts/{blogPostId}/Tags/{tagId} | Remove a tag from a blog post |
| [**updateBlogPostAsync**](BlogPostsApi.md#updateBlogPostAsync) | **PUT** /api/v2/ContentService/BlogPosts/{blogPostId} | Update a blog post |


<a id="createBlogPostAsync"></a>
# **createBlogPostAsync**
> EmptyEnvelope createBlogPostAsync(tenantId, blogPostCreateDto)

Create a new blog post

Creates a new blog post for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blogPostCreateDto : BlogPostCreateDto =  // BlogPostCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createBlogPostAsync(tenantId, blogPostCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#createBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#createBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostCreateDto** | [**BlogPostCreateDto**](BlogPostCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCategoryForBlogPostAsync"></a>
# **createCategoryForBlogPostAsync**
> EmptyEnvelope createCategoryForBlogPostAsync(blogPostId, tenantId, blogPostCategoryCreateDto)

Create a category for a blog post

Creates a new category and relates it to a specific blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blogPostCategoryCreateDto : BlogPostCategoryCreateDto =  // BlogPostCategoryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createCategoryForBlogPostAsync(blogPostId, tenantId, blogPostCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#createCategoryForBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#createCategoryForBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="createCommentForBlogPostAsync"></a>
# **createCommentForBlogPostAsync**
> EmptyEnvelope createCommentForBlogPostAsync(blogPostId, tenantId, blogPostCommentCreateDto)

Create a comment for a blog post

Creates a new comment on a specific blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blogPostCommentCreateDto : BlogPostCommentCreateDto =  // BlogPostCommentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createCommentForBlogPostAsync(blogPostId, tenantId, blogPostCommentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#createCommentForBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#createCommentForBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostCommentCreateDto** | [**BlogPostCommentCreateDto**](BlogPostCommentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTagForBlogPostAsync"></a>
# **createTagForBlogPostAsync**
> EmptyEnvelope createTagForBlogPostAsync(blogPostId, tenantId, blogPostTagCreateDto)

Create a tag for a blog post

Creates a new tag and relates it to a specific blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blogPostTagCreateDto : BlogPostTagCreateDto =  // BlogPostTagCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTagForBlogPostAsync(blogPostId, tenantId, blogPostTagCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#createTagForBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#createTagForBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="deleteBlogPostAsync"></a>
# **deleteBlogPostAsync**
> EmptyEnvelope deleteBlogPostAsync(blogPostId, tenantId)

Delete a blog post

Deletes a blog post for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBlogPostAsync(blogPostId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#deleteBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#deleteBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteCommentFromBlogPostAsync"></a>
# **deleteCommentFromBlogPostAsync**
> EmptyEnvelope deleteCommentFromBlogPostAsync(blogPostId, commentId, tenantId)

Delete a blog post comment

Deletes a comment from a specific blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteCommentFromBlogPostAsync(blogPostId, commentId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#deleteCommentFromBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#deleteCommentFromBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlogPostByIdAsync"></a>
# **getBlogPostByIdAsync**
> BlogPostDtoEnvelope getBlogPostByIdAsync(blogPostId)

Get a blog post by ID

Retrieves a single blog post by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BlogPostDtoEnvelope = apiInstance.getBlogPostByIdAsync(blogPostId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#getBlogPostByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#getBlogPostByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostId** | **java.util.UUID**|  | |

### Return type

[**BlogPostDtoEnvelope**](BlogPostDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlogPostsAsync"></a>
# **getBlogPostsAsync**
> BlogPostDtoListEnvelope getBlogPostsAsync(tenantId)

Retrieve a list of blog posts

Retrieves all blog posts, optionally filtered by tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BlogPostDtoListEnvelope = apiInstance.getBlogPostsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#getBlogPostsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#getBlogPostsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | [optional] |

### Return type

[**BlogPostDtoListEnvelope**](BlogPostDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlogPostsCountAsync"></a>
# **getBlogPostsCountAsync**
> Int32Envelope getBlogPostsCountAsync(tenantId)

Get the count of blog posts

Returns the total count of blog posts, optionally filtered by tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getBlogPostsCountAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#getBlogPostsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#getBlogPostsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCategoriesForBlogPostAsync"></a>
# **getCategoriesForBlogPostAsync**
> BlogPostCategoryDtoListEnvelope getCategoriesForBlogPostAsync(blogPostId)

Get categories for a blog post

Retrieves all categories related to a specific blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BlogPostCategoryDtoListEnvelope = apiInstance.getCategoriesForBlogPostAsync(blogPostId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#getCategoriesForBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#getCategoriesForBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostId** | **java.util.UUID**|  | |

### Return type

[**BlogPostCategoryDtoListEnvelope**](BlogPostCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCommentsForBlogPostAsync"></a>
# **getCommentsForBlogPostAsync**
> BlogPostCommentDtoListEnvelope getCommentsForBlogPostAsync(blogPostId)

Get comments for a blog post

Retrieves all comments for a specific blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BlogPostCommentDtoListEnvelope = apiInstance.getCommentsForBlogPostAsync(blogPostId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#getCommentsForBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#getCommentsForBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostId** | **java.util.UUID**|  | |

### Return type

[**BlogPostCommentDtoListEnvelope**](BlogPostCommentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRepliesForCommentAsync"></a>
# **getRepliesForCommentAsync**
> BlogPostCommentDtoListEnvelope getRepliesForCommentAsync(commentId, blogPostId)

Get replies for a comment

Retrieves all replies for a specific blog post comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blogPostId : kotlin.String = blogPostId_example // kotlin.String | 
try {
    val result : BlogPostCommentDtoListEnvelope = apiInstance.getRepliesForCommentAsync(commentId, blogPostId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#getRepliesForCommentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#getRepliesForCommentAsync")
    e.printStackTrace()
}
```

### Parameters
| **commentId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostId** | **kotlin.String**|  | |

### Return type

[**BlogPostCommentDtoListEnvelope**](BlogPostCommentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagsForBlogPostAsync"></a>
# **getTagsForBlogPostAsync**
> BlogPostTagDtoListEnvelope getTagsForBlogPostAsync(blogPostId)

Get tags for a blog post

Retrieves all tags related to a specific blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : BlogPostTagDtoListEnvelope = apiInstance.getTagsForBlogPostAsync(blogPostId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#getTagsForBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#getTagsForBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostId** | **java.util.UUID**|  | |

### Return type

[**BlogPostTagDtoListEnvelope**](BlogPostTagDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateCategoryToBlogPostAsync"></a>
# **relateCategoryToBlogPostAsync**
> EmptyEnvelope relateCategoryToBlogPostAsync(blogPostId, categoryId, tenantId)

Relate an existing category to a blog post

Creates a relationship between an existing category and a blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.relateCategoryToBlogPostAsync(blogPostId, categoryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#relateCategoryToBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#relateCategoryToBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **categoryId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateTagToBlogPostAsync"></a>
# **relateTagToBlogPostAsync**
> EmptyEnvelope relateTagToBlogPostAsync(blogPostId, tagId, tenantId)

Relate an existing tag to a blog post

Creates a relationship between an existing tag and a blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.relateTagToBlogPostAsync(blogPostId, tagId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#relateTagToBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#relateTagToBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **tagId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="replyToCommentAsync"></a>
# **replyToCommentAsync**
> EmptyEnvelope replyToCommentAsync(blogPostId, commentId, tenantId, blogPostCommentCreateDto)

Reply to a blog post comment

Creates a reply to an existing comment on a blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blogPostCommentCreateDto : BlogPostCommentCreateDto =  // BlogPostCommentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.replyToCommentAsync(blogPostId, commentId, tenantId, blogPostCommentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#replyToCommentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#replyToCommentAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostCommentCreateDto** | [**BlogPostCommentCreateDto**](BlogPostCommentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="unrelateCategoryFromBlogPostAsync"></a>
# **unrelateCategoryFromBlogPostAsync**
> EmptyEnvelope unrelateCategoryFromBlogPostAsync(blogPostId, categoryId, tenantId)

Remove a category from a blog post

Removes the relationship between a category and a blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.unrelateCategoryFromBlogPostAsync(blogPostId, categoryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#unrelateCategoryFromBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#unrelateCategoryFromBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **categoryId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="unrelateTagFromBlogPostAsync"></a>
# **unrelateTagFromBlogPostAsync**
> EmptyEnvelope unrelateTagFromBlogPostAsync(blogPostId, tagId, tenantId)

Remove a tag from a blog post

Removes the relationship between a tag and a blog post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.unrelateTagFromBlogPostAsync(blogPostId, tagId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#unrelateTagFromBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#unrelateTagFromBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **tagId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateBlogPostAsync"></a>
# **updateBlogPostAsync**
> EmptyEnvelope updateBlogPostAsync(blogPostId, tenantId, blogPostUpdateDto)

Update a blog post

Updates an existing blog post for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlogPostsApi()
val blogPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blogPostUpdateDto : BlogPostUpdateDto =  // BlogPostUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateBlogPostAsync(blogPostId, tenantId, blogPostUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlogPostsApi#updateBlogPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlogPostsApi#updateBlogPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **blogPostId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blogPostUpdateDto** | [**BlogPostUpdateDto**](BlogPostUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

