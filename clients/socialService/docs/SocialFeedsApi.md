# SocialFeedsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFeedPostAsync**](SocialFeedsApi.md#createFeedPostAsync) | **POST** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts | Create a social feed post |
| [**deleteFeedPostAsync**](SocialFeedsApi.md#deleteFeedPostAsync) | **DELETE** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts/{feedPostId} | Delete a social feed post |
| [**getFeedNotifications**](SocialFeedsApi.md#getFeedNotifications) | **GET** /api/v2/SocialService/SocialFeeds | Get social feeds |
| [**getFeedPostAsync**](SocialFeedsApi.md#getFeedPostAsync) | **GET** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts/{feedPostId} | Get social feed post by ID |
| [**getFeedPostsAsync**](SocialFeedsApi.md#getFeedPostsAsync) | **GET** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts | Get social feed posts |
| [**getFeedPostsCountAsync**](SocialFeedsApi.md#getFeedPostsCountAsync) | **GET** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts/Count | Count social feed posts |
| [**getNotificationAsync**](SocialFeedsApi.md#getNotificationAsync) | **GET** /api/v2/SocialService/SocialFeeds/{socialFeedId} | Get social feed by ID |
| [**getNotificationsCountAsync**](SocialFeedsApi.md#getNotificationsCountAsync) | **GET** /api/v2/SocialService/SocialFeeds/Count | Count social feeds |
| [**updateFeedPostAsync**](SocialFeedsApi.md#updateFeedPostAsync) | **PUT** /api/v2/SocialService/SocialFeeds/{socialFeedId}/Posts/{feedPostId} | Update a social feed post |


<a id="createFeedPostAsync"></a>
# **createFeedPostAsync**
> SocialFeedPostDtoEnvelope createFeedPostAsync(socialFeedId, socialProfileId, apiVersion, xApiVersion, socialFeedPostCreateDto)

Create a social feed post

Creates a new post in a specific social feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialFeedPostCreateDto : SocialFeedPostCreateDto =  // SocialFeedPostCreateDto | 
try {
    val result : SocialFeedPostDtoEnvelope = apiInstance.createFeedPostAsync(socialFeedId, socialProfileId, apiVersion, xApiVersion, socialFeedPostCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#createFeedPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#createFeedPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialFeedId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialFeedPostCreateDto** | [**SocialFeedPostCreateDto**](SocialFeedPostCreateDto.md)|  | [optional] |

### Return type

[**SocialFeedPostDtoEnvelope**](SocialFeedPostDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFeedPostAsync"></a>
# **deleteFeedPostAsync**
> EmptyEnvelope deleteFeedPostAsync(socialFeedId, feedPostId, socialProfileId, apiVersion, xApiVersion)

Delete a social feed post

Deletes a post from a specific social feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val feedPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFeedPostAsync(socialFeedId, feedPostId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#deleteFeedPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#deleteFeedPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialFeedId** | **java.util.UUID**|  | |
| **feedPostId** | **java.util.UUID**|  | |
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

<a id="getFeedNotifications"></a>
# **getFeedNotifications**
> SocialFeedDtoListEnvelope getFeedNotifications(socialProfileId, apiVersion, xApiVersion)

Get social feeds

Retrieves a list of social feeds for the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialFeedDtoListEnvelope = apiInstance.getFeedNotifications(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#getFeedNotifications")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#getFeedNotifications")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialFeedDtoListEnvelope**](SocialFeedDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFeedPostAsync"></a>
# **getFeedPostAsync**
> SocialFeedPostDtoEnvelope getFeedPostAsync(socialFeedId, feedPostId, socialProfileId, apiVersion, xApiVersion)

Get social feed post by ID

Retrieves a specific post from a social feed by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val feedPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialFeedPostDtoEnvelope = apiInstance.getFeedPostAsync(socialFeedId, feedPostId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#getFeedPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#getFeedPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialFeedId** | **java.util.UUID**|  | |
| **feedPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialFeedPostDtoEnvelope**](SocialFeedPostDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFeedPostsAsync"></a>
# **getFeedPostsAsync**
> SocialFeedPostDtoListEnvelope getFeedPostsAsync(socialFeedId, socialProfileId, apiVersion, xApiVersion)

Get social feed posts

Retrieves a list of posts for a specific social feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialFeedPostDtoListEnvelope = apiInstance.getFeedPostsAsync(socialFeedId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#getFeedPostsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#getFeedPostsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialFeedId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialFeedPostDtoListEnvelope**](SocialFeedPostDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFeedPostsCountAsync"></a>
# **getFeedPostsCountAsync**
> Int32Envelope getFeedPostsCountAsync(socialFeedId, socialProfileId, apiVersion, xApiVersion)

Count social feed posts

Returns the count of posts for a specific social feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getFeedPostsCountAsync(socialFeedId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#getFeedPostsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#getFeedPostsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialFeedId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
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

<a id="getNotificationAsync"></a>
# **getNotificationAsync**
> SocialFeedDtoEnvelope getNotificationAsync(socialFeedId, socialProfileId, apiVersion, xApiVersion)

Get social feed by ID

Retrieves a specific social feed by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialFeedDtoEnvelope = apiInstance.getNotificationAsync(socialFeedId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#getNotificationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#getNotificationAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialFeedId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialFeedDtoEnvelope**](SocialFeedDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNotificationsCountAsync"></a>
# **getNotificationsCountAsync**
> Int32Envelope getNotificationsCountAsync(socialProfileId, apiVersion, xApiVersion)

Count social feeds

Returns the count of social feeds for the specified social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getNotificationsCountAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#getNotificationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#getNotificationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
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

<a id="updateFeedPostAsync"></a>
# **updateFeedPostAsync**
> SocialFeedPostDtoEnvelope updateFeedPostAsync(socialFeedId, feedPostId, socialProfileId, apiVersion, xApiVersion, socialFeedPostUpdateDto)

Update a social feed post

Updates an existing post in a specific social feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialFeedsApi()
val socialFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val feedPostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialFeedPostUpdateDto : SocialFeedPostUpdateDto =  // SocialFeedPostUpdateDto | 
try {
    val result : SocialFeedPostDtoEnvelope = apiInstance.updateFeedPostAsync(socialFeedId, feedPostId, socialProfileId, apiVersion, xApiVersion, socialFeedPostUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialFeedsApi#updateFeedPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialFeedsApi#updateFeedPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialFeedId** | **java.util.UUID**|  | |
| **feedPostId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialFeedPostUpdateDto** | [**SocialFeedPostUpdateDto**](SocialFeedPostUpdateDto.md)|  | [optional] |

### Return type

[**SocialFeedPostDtoEnvelope**](SocialFeedPostDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

