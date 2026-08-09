# SocialPostsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSocialCommentReactionAsync**](SocialPostsApi.md#createSocialCommentReactionAsync) | **POST** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId}/Reactions | Create a social comment reaction |
| [**createSocialPostAsync**](SocialPostsApi.md#createSocialPostAsync) | **POST** /api/v2/SocialService/SocialPosts | Create a social post |
| [**createSocialPostAttachmentAsync**](SocialPostsApi.md#createSocialPostAttachmentAsync) | **POST** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments | Create a social post attachment |
| [**createSocialPostCommentAsync**](SocialPostsApi.md#createSocialPostCommentAsync) | **POST** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments | Create a social post comment |
| [**createSocialPostReactionAsync**](SocialPostsApi.md#createSocialPostReactionAsync) | **POST** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions | Create a social post reaction |
| [**deleteSocialCommentReactionAsync**](SocialPostsApi.md#deleteSocialCommentReactionAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId}/Reactions/{reactionId} | Delete a social comment reaction |
| [**deleteSocialPostAsync**](SocialPostsApi.md#deleteSocialPostAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId} | Delete a social post |
| [**deleteSocialPostAttachmentAsync**](SocialPostsApi.md#deleteSocialPostAttachmentAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/{attachmentId} | Delete a social post attachment |
| [**deleteSocialPostCommentAsync**](SocialPostsApi.md#deleteSocialPostCommentAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId} | Delete a social post comment |
| [**deleteSocialPostReactionAsync**](SocialPostsApi.md#deleteSocialPostReactionAsync) | **DELETE** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions/{reactionId} | Delete a social post reaction |
| [**getSocialCommentReactionAsync**](SocialPostsApi.md#getSocialCommentReactionAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId}/Reactions/{reactionId} | Get social comment reaction by ID |
| [**getSocialCommentReactionsAsync**](SocialPostsApi.md#getSocialCommentReactionsAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId}/Reactions | Get social comment reactions |
| [**getSocialCommentReactionsCountAsync**](SocialPostsApi.md#getSocialCommentReactionsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId}/Reactions/Count | Count social comment reactions |
| [**getSocialPostAsync**](SocialPostsApi.md#getSocialPostAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId} | Get social post by ID |
| [**getSocialPostAttachmentAsync**](SocialPostsApi.md#getSocialPostAttachmentAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/{attachmentId} | Get social post attachment by ID |
| [**getSocialPostAttachmentsAsync**](SocialPostsApi.md#getSocialPostAttachmentsAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments | Get social post attachments |
| [**getSocialPostAttachmentsCountAsync**](SocialPostsApi.md#getSocialPostAttachmentsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/Count | Count social post attachments |
| [**getSocialPostCommentAsync**](SocialPostsApi.md#getSocialPostCommentAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId} | Get social post comment by ID |
| [**getSocialPostCommentsAsync**](SocialPostsApi.md#getSocialPostCommentsAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments | Get social post comments |
| [**getSocialPostCommentsCountAsync**](SocialPostsApi.md#getSocialPostCommentsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/Count | Count social post comments |
| [**getSocialPostReactionAsync**](SocialPostsApi.md#getSocialPostReactionAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions/{reactionId} | Get social post reaction by ID |
| [**getSocialPostReactionsAsync**](SocialPostsApi.md#getSocialPostReactionsAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions | Get social post reactions |
| [**getSocialPostReactionsCountAsync**](SocialPostsApi.md#getSocialPostReactionsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions/Count | Count social post reactions |
| [**getSocialPostsAsync**](SocialPostsApi.md#getSocialPostsAsync) | **GET** /api/v2/SocialService/SocialPosts | Get social posts |
| [**getSocialPostsCountAsync**](SocialPostsApi.md#getSocialPostsCountAsync) | **GET** /api/v2/SocialService/SocialPosts/Count | Count social posts |
| [**patchSocialPostAsync**](SocialPostsApi.md#patchSocialPostAsync) | **PATCH** /api/v2/SocialService/SocialPosts/{socialPostId} | Patch a social post |
| [**updateSocialCommentReactionAsync**](SocialPostsApi.md#updateSocialCommentReactionAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId}/Reactions/{reactionId} | Update a social comment reaction |
| [**updateSocialPostAsync**](SocialPostsApi.md#updateSocialPostAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId} | Update a social post |
| [**updateSocialPostAttachmentAsync**](SocialPostsApi.md#updateSocialPostAttachmentAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/{attachmentId} | Update a social post attachment |
| [**updateSocialPostCommentAsync**](SocialPostsApi.md#updateSocialPostCommentAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId}/Comments/{commentId} | Update a social post comment |
| [**updateSocialPostReactionAsync**](SocialPostsApi.md#updateSocialPostReactionAsync) | **PUT** /api/v2/SocialService/SocialPosts/{socialPostId}/Reactions/{reactionId} | Update a social post reaction |
| [**uploadSocialPostImageAttachmentAsync**](SocialPostsApi.md#uploadSocialPostImageAttachmentAsync) | **POST** /api/v2/SocialService/SocialPosts/{socialPostId}/Attachments/Image | Upload a social post image attachment |


<a id="createSocialCommentReactionAsync"></a>
# **createSocialCommentReactionAsync**
> SocialCommentReactionDtoEnvelope createSocialCommentReactionAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion, socialReactionCreateDto)

Create a social comment reaction

Creates a new reaction on a specific social comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialReactionCreateDto : SocialReactionCreateDto =  // SocialReactionCreateDto | 
try {
    val result : SocialCommentReactionDtoEnvelope = apiInstance.createSocialCommentReactionAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion, socialReactionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#createSocialCommentReactionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#createSocialCommentReactionAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialReactionCreateDto** | [**SocialReactionCreateDto**](SocialReactionCreateDto.md)|  | [optional] |

### Return type

[**SocialCommentReactionDtoEnvelope**](SocialCommentReactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createSocialPostAsync"></a>
# **createSocialPostAsync**
> SocialPostDtoEnvelope createSocialPostAsync(socialProfileId, apiVersion, xApiVersion, socialPostCreateDto)

Create a social post

Creates a new social post for the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostCreateDto : SocialPostCreateDto =  // SocialPostCreateDto | 
try {
    val result : SocialPostDtoEnvelope = apiInstance.createSocialPostAsync(socialProfileId, apiVersion, xApiVersion, socialPostCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#createSocialPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#createSocialPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostCreateDto** | [**SocialPostCreateDto**](SocialPostCreateDto.md)|  | [optional] |

### Return type

[**SocialPostDtoEnvelope**](SocialPostDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createSocialPostAttachmentAsync"></a>
# **createSocialPostAttachmentAsync**
> SocialPostAttachmentDtoEnvelope createSocialPostAttachmentAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostAttachmentCreateDto)

Create a social post attachment

Creates a new attachment for a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostAttachmentCreateDto : SocialPostAttachmentCreateDto =  // SocialPostAttachmentCreateDto | 
try {
    val result : SocialPostAttachmentDtoEnvelope = apiInstance.createSocialPostAttachmentAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostAttachmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#createSocialPostAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#createSocialPostAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostAttachmentCreateDto** | [**SocialPostAttachmentCreateDto**](SocialPostAttachmentCreateDto.md)|  | [optional] |

### Return type

[**SocialPostAttachmentDtoEnvelope**](SocialPostAttachmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createSocialPostCommentAsync"></a>
# **createSocialPostCommentAsync**
> EmptyEnvelope createSocialPostCommentAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostCommentCreateDto)

Create a social post comment

Creates a new comment on a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostCommentCreateDto : SocialPostCommentCreateDto =  // SocialPostCommentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSocialPostCommentAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostCommentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#createSocialPostCommentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#createSocialPostCommentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostCommentCreateDto** | [**SocialPostCommentCreateDto**](SocialPostCommentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createSocialPostReactionAsync"></a>
# **createSocialPostReactionAsync**
> SocialPostReactionDtoEnvelope createSocialPostReactionAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialReactionCreateDto)

Create a social post reaction

Creates a new reaction on a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialReactionCreateDto : SocialReactionCreateDto =  // SocialReactionCreateDto | 
try {
    val result : SocialPostReactionDtoEnvelope = apiInstance.createSocialPostReactionAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialReactionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#createSocialPostReactionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#createSocialPostReactionAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialReactionCreateDto** | [**SocialReactionCreateDto**](SocialReactionCreateDto.md)|  | [optional] |

### Return type

[**SocialPostReactionDtoEnvelope**](SocialPostReactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSocialCommentReactionAsync"></a>
# **deleteSocialCommentReactionAsync**
> EmptyEnvelope deleteSocialCommentReactionAsync(socialPostId, commentId, reactionId, socialProfileId, apiVersion, xApiVersion)

Delete a social comment reaction

Deletes a reaction from a specific social comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val reactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSocialCommentReactionAsync(socialPostId, commentId, reactionId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#deleteSocialCommentReactionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#deleteSocialCommentReactionAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **reactionId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
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

<a id="deleteSocialPostAsync"></a>
# **deleteSocialPostAsync**
> EmptyEnvelope deleteSocialPostAsync(socialPostId, socialProfileId, apiVersion, xApiVersion)

Delete a social post

Deletes a social post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSocialPostAsync(socialPostId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#deleteSocialPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#deleteSocialPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
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

<a id="deleteSocialPostAttachmentAsync"></a>
# **deleteSocialPostAttachmentAsync**
> EmptyEnvelope deleteSocialPostAttachmentAsync(socialPostId, attachmentId, socialProfileId, apiVersion, xApiVersion)

Delete a social post attachment

Deletes an attachment from a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val attachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSocialPostAttachmentAsync(socialPostId, attachmentId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#deleteSocialPostAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#deleteSocialPostAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **attachmentId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
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

<a id="deleteSocialPostCommentAsync"></a>
# **deleteSocialPostCommentAsync**
> EmptyEnvelope deleteSocialPostCommentAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion)

Delete a social post comment

Deletes a comment from a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSocialPostCommentAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#deleteSocialPostCommentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#deleteSocialPostCommentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
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

<a id="deleteSocialPostReactionAsync"></a>
# **deleteSocialPostReactionAsync**
> EmptyEnvelope deleteSocialPostReactionAsync(socialPostId, reactionId, socialProfileId, apiVersion, xApiVersion)

Delete a social post reaction

Deletes a reaction from a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val reactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSocialPostReactionAsync(socialPostId, reactionId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#deleteSocialPostReactionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#deleteSocialPostReactionAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **reactionId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
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

<a id="getSocialCommentReactionAsync"></a>
# **getSocialCommentReactionAsync**
> SocialCommentReactionDtoEnvelope getSocialCommentReactionAsync(socialPostId, commentId, reactionId, apiVersion, xApiVersion)

Get social comment reaction by ID

Retrieves a specific reaction from a social comment by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val reactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialCommentReactionDtoEnvelope = apiInstance.getSocialCommentReactionAsync(socialPostId, commentId, reactionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialCommentReactionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialCommentReactionAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **reactionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialCommentReactionDtoEnvelope**](SocialCommentReactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialCommentReactionsAsync"></a>
# **getSocialCommentReactionsAsync**
> SocialCommentReactionDtoListEnvelope getSocialCommentReactionsAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion, socialCommentReactionDtoCollectionQueryParameters)

Get social comment reactions

Retrieves a list of reactions for a specific social comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialCommentReactionDtoCollectionQueryParameters : SocialCommentReactionDtoCollectionQueryParameters =  // SocialCommentReactionDtoCollectionQueryParameters | 
try {
    val result : SocialCommentReactionDtoListEnvelope = apiInstance.getSocialCommentReactionsAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion, socialCommentReactionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialCommentReactionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialCommentReactionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialCommentReactionDtoCollectionQueryParameters** | [**SocialCommentReactionDtoCollectionQueryParameters**](SocialCommentReactionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SocialCommentReactionDtoListEnvelope**](SocialCommentReactionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialCommentReactionsCountAsync"></a>
# **getSocialCommentReactionsCountAsync**
> Int32Envelope getSocialCommentReactionsCountAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion, socialCommentReactionDtoCollectionQueryParameters)

Count social comment reactions

Returns the count of reactions for a specific social comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialCommentReactionDtoCollectionQueryParameters : SocialCommentReactionDtoCollectionQueryParameters =  // SocialCommentReactionDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSocialCommentReactionsCountAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion, socialCommentReactionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialCommentReactionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialCommentReactionsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialCommentReactionDtoCollectionQueryParameters** | [**SocialCommentReactionDtoCollectionQueryParameters**](SocialCommentReactionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialPostAsync"></a>
# **getSocialPostAsync**
> SocialPostDtoEnvelope getSocialPostAsync(socialPostId, socialProfileId, apiVersion, xApiVersion)

Get social post by ID

Retrieves a specific social post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialPostDtoEnvelope = apiInstance.getSocialPostAsync(socialPostId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialPostDtoEnvelope**](SocialPostDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialPostAttachmentAsync"></a>
# **getSocialPostAttachmentAsync**
> EmptyEnvelope getSocialPostAttachmentAsync(socialPostId, attachmentId, apiVersion, xApiVersion)

Get social post attachment by ID

Retrieves a specific attachment from a social post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val attachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getSocialPostAttachmentAsync(socialPostId, attachmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **attachmentId** | **java.util.UUID**|  | |
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

<a id="getSocialPostAttachmentsAsync"></a>
# **getSocialPostAttachmentsAsync**
> SocialPostAttachmentDtoListEnvelope getSocialPostAttachmentsAsync(socialPostId, apiVersion, xApiVersion, socialPostAttachmentDtoCollectionQueryParameters)

Get social post attachments

Retrieves a list of attachments for a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostAttachmentDtoCollectionQueryParameters : SocialPostAttachmentDtoCollectionQueryParameters =  // SocialPostAttachmentDtoCollectionQueryParameters | 
try {
    val result : SocialPostAttachmentDtoListEnvelope = apiInstance.getSocialPostAttachmentsAsync(socialPostId, apiVersion, xApiVersion, socialPostAttachmentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostAttachmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostAttachmentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostAttachmentDtoCollectionQueryParameters** | [**SocialPostAttachmentDtoCollectionQueryParameters**](SocialPostAttachmentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SocialPostAttachmentDtoListEnvelope**](SocialPostAttachmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialPostAttachmentsCountAsync"></a>
# **getSocialPostAttachmentsCountAsync**
> Int32Envelope getSocialPostAttachmentsCountAsync(socialPostId, apiVersion, xApiVersion, socialPostAttachmentDtoCollectionQueryParameters)

Count social post attachments

Returns the count of attachments for a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostAttachmentDtoCollectionQueryParameters : SocialPostAttachmentDtoCollectionQueryParameters =  // SocialPostAttachmentDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSocialPostAttachmentsCountAsync(socialPostId, apiVersion, xApiVersion, socialPostAttachmentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostAttachmentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostAttachmentsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostAttachmentDtoCollectionQueryParameters** | [**SocialPostAttachmentDtoCollectionQueryParameters**](SocialPostAttachmentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialPostCommentAsync"></a>
# **getSocialPostCommentAsync**
> SocialPostCommentDtoEnvelope getSocialPostCommentAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion)

Get social post comment by ID

Retrieves a specific comment from a social post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialPostCommentDtoEnvelope = apiInstance.getSocialPostCommentAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostCommentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostCommentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialPostCommentDtoEnvelope**](SocialPostCommentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialPostCommentsAsync"></a>
# **getSocialPostCommentsAsync**
> SocialPostCommentDtoListEnvelope getSocialPostCommentsAsync(socialPostId, socialProfileId, parentCommentId, apiVersion, xApiVersion, socialPostCommentDtoCollectionQueryParameters)

Get social post comments

Retrieves a list of comments for a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val parentCommentId : kotlin.String = parentCommentId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostCommentDtoCollectionQueryParameters : SocialPostCommentDtoCollectionQueryParameters =  // SocialPostCommentDtoCollectionQueryParameters | 
try {
    val result : SocialPostCommentDtoListEnvelope = apiInstance.getSocialPostCommentsAsync(socialPostId, socialProfileId, parentCommentId, apiVersion, xApiVersion, socialPostCommentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostCommentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostCommentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **parentCommentId** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostCommentDtoCollectionQueryParameters** | [**SocialPostCommentDtoCollectionQueryParameters**](SocialPostCommentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SocialPostCommentDtoListEnvelope**](SocialPostCommentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialPostCommentsCountAsync"></a>
# **getSocialPostCommentsCountAsync**
> Int32Envelope getSocialPostCommentsCountAsync(socialPostId, socialProfileId, parentCommentId, apiVersion, xApiVersion, socialPostCommentDtoCollectionQueryParameters)

Count social post comments

Returns the count of comments for a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val parentCommentId : kotlin.String = parentCommentId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostCommentDtoCollectionQueryParameters : SocialPostCommentDtoCollectionQueryParameters =  // SocialPostCommentDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSocialPostCommentsCountAsync(socialPostId, socialProfileId, parentCommentId, apiVersion, xApiVersion, socialPostCommentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostCommentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostCommentsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **parentCommentId** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostCommentDtoCollectionQueryParameters** | [**SocialPostCommentDtoCollectionQueryParameters**](SocialPostCommentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialPostReactionAsync"></a>
# **getSocialPostReactionAsync**
> SocialReactionDtoEnvelope getSocialPostReactionAsync(socialPostId, reactionId, apiVersion, xApiVersion)

Get social post reaction by ID

Retrieves a specific reaction from a social post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val reactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialReactionDtoEnvelope = apiInstance.getSocialPostReactionAsync(socialPostId, reactionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostReactionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostReactionAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **reactionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialReactionDtoEnvelope**](SocialReactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialPostReactionsAsync"></a>
# **getSocialPostReactionsAsync**
> SocialReactionDtoListEnvelope getSocialPostReactionsAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostReactionDtoCollectionQueryParameters)

Get social post reactions

Retrieves a list of reactions for a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostReactionDtoCollectionQueryParameters : SocialPostReactionDtoCollectionQueryParameters =  // SocialPostReactionDtoCollectionQueryParameters | 
try {
    val result : SocialReactionDtoListEnvelope = apiInstance.getSocialPostReactionsAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostReactionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostReactionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostReactionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostReactionDtoCollectionQueryParameters** | [**SocialPostReactionDtoCollectionQueryParameters**](SocialPostReactionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SocialReactionDtoListEnvelope**](SocialReactionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialPostReactionsCountAsync"></a>
# **getSocialPostReactionsCountAsync**
> Int32Envelope getSocialPostReactionsCountAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostReactionDtoCollectionQueryParameters)

Count social post reactions

Returns the count of reactions for a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostReactionDtoCollectionQueryParameters : SocialPostReactionDtoCollectionQueryParameters =  // SocialPostReactionDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSocialPostReactionsCountAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostReactionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostReactionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostReactionsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostReactionDtoCollectionQueryParameters** | [**SocialPostReactionDtoCollectionQueryParameters**](SocialPostReactionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialPostsAsync"></a>
# **getSocialPostsAsync**
> SocialPostDtoListEnvelope getSocialPostsAsync(socialProfileId, apiVersion, xApiVersion, socialPostDtoCollectionQueryParameters)

Get social posts

Retrieves a list of social posts for the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostDtoCollectionQueryParameters : SocialPostDtoCollectionQueryParameters =  // SocialPostDtoCollectionQueryParameters | 
try {
    val result : SocialPostDtoListEnvelope = apiInstance.getSocialPostsAsync(socialProfileId, apiVersion, xApiVersion, socialPostDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostDtoCollectionQueryParameters** | [**SocialPostDtoCollectionQueryParameters**](SocialPostDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SocialPostDtoListEnvelope**](SocialPostDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSocialPostsCountAsync"></a>
# **getSocialPostsCountAsync**
> Int32Envelope getSocialPostsCountAsync(socialProfileId, apiVersion, xApiVersion, socialPostDtoCollectionQueryParameters)

Count social posts

Returns the count of social posts for the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostDtoCollectionQueryParameters : SocialPostDtoCollectionQueryParameters =  // SocialPostDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSocialPostsCountAsync(socialProfileId, apiVersion, xApiVersion, socialPostDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#getSocialPostsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#getSocialPostsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostDtoCollectionQueryParameters** | [**SocialPostDtoCollectionQueryParameters**](SocialPostDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchSocialPostAsync"></a>
# **patchSocialPostAsync**
> EmptyEnvelope patchSocialPostAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, patchOperation)

Patch a social post

Partially updates an existing social post by its ID using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSocialPostAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#patchSocialPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#patchSocialPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSocialCommentReactionAsync"></a>
# **updateSocialCommentReactionAsync**
> SocialCommentReactionDtoEnvelope updateSocialCommentReactionAsync(socialPostId, commentId, reactionId, socialProfileId, apiVersion, xApiVersion, socialReactionUpdateDto)

Update a social comment reaction

Updates an existing reaction on a specific social comment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val reactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialReactionUpdateDto : SocialReactionUpdateDto =  // SocialReactionUpdateDto | 
try {
    val result : SocialCommentReactionDtoEnvelope = apiInstance.updateSocialCommentReactionAsync(socialPostId, commentId, reactionId, socialProfileId, apiVersion, xApiVersion, socialReactionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#updateSocialCommentReactionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#updateSocialCommentReactionAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **reactionId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialReactionUpdateDto** | [**SocialReactionUpdateDto**](SocialReactionUpdateDto.md)|  | [optional] |

### Return type

[**SocialCommentReactionDtoEnvelope**](SocialCommentReactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSocialPostAsync"></a>
# **updateSocialPostAsync**
> EmptyEnvelope updateSocialPostAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostUpdateDto)

Update a social post

Updates an existing social post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostUpdateDto : SocialPostUpdateDto =  // SocialPostUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSocialPostAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, socialPostUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#updateSocialPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#updateSocialPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostUpdateDto** | [**SocialPostUpdateDto**](SocialPostUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSocialPostAttachmentAsync"></a>
# **updateSocialPostAttachmentAsync**
> EmptyEnvelope updateSocialPostAttachmentAsync(socialPostId, attachmentId, socialProfileId, apiVersion, xApiVersion, socialPostAttachmentUpdateDto)

Update a social post attachment

Updates an existing attachment on a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val attachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostAttachmentUpdateDto : SocialPostAttachmentUpdateDto =  // SocialPostAttachmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSocialPostAttachmentAsync(socialPostId, attachmentId, socialProfileId, apiVersion, xApiVersion, socialPostAttachmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#updateSocialPostAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#updateSocialPostAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **attachmentId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostAttachmentUpdateDto** | [**SocialPostAttachmentUpdateDto**](SocialPostAttachmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSocialPostCommentAsync"></a>
# **updateSocialPostCommentAsync**
> EmptyEnvelope updateSocialPostCommentAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion, socialPostCommentUpdateDto)

Update a social post comment

Updates an existing comment on a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialPostCommentUpdateDto : SocialPostCommentUpdateDto =  // SocialPostCommentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSocialPostCommentAsync(socialPostId, commentId, socialProfileId, apiVersion, xApiVersion, socialPostCommentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#updateSocialPostCommentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#updateSocialPostCommentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **commentId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialPostCommentUpdateDto** | [**SocialPostCommentUpdateDto**](SocialPostCommentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSocialPostReactionAsync"></a>
# **updateSocialPostReactionAsync**
> SocialPostReactionDtoEnvelope updateSocialPostReactionAsync(socialPostId, reactionId, socialProfileId, apiVersion, xApiVersion, socialReactionUpdateDto)

Update a social post reaction

Updates an existing reaction on a specific social post.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val reactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialReactionUpdateDto : SocialReactionUpdateDto =  // SocialReactionUpdateDto | 
try {
    val result : SocialPostReactionDtoEnvelope = apiInstance.updateSocialPostReactionAsync(socialPostId, reactionId, socialProfileId, apiVersion, xApiVersion, socialReactionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#updateSocialPostReactionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#updateSocialPostReactionAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **reactionId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialReactionUpdateDto** | [**SocialReactionUpdateDto**](SocialReactionUpdateDto.md)|  | [optional] |

### Return type

[**SocialPostReactionDtoEnvelope**](SocialPostReactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="uploadSocialPostImageAttachmentAsync"></a>
# **uploadSocialPostImageAttachmentAsync**
> SocialPostAttachmentDtoEnvelope uploadSocialPostImageAttachmentAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, file)

Upload a social post image attachment

Uploads an image and attaches it to a social post, storing the bytes through the storage spine.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostsApi()
val socialPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : SocialPostAttachmentDtoEnvelope = apiInstance.uploadSocialPostImageAttachmentAsync(socialPostId, socialProfileId, apiVersion, xApiVersion, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostsApi#uploadSocialPostImageAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostsApi#uploadSocialPostImageAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

[**SocialPostAttachmentDtoEnvelope**](SocialPostAttachmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

