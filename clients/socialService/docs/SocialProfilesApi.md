# SocialProfilesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countConversationsAsync**](SocialProfilesApi.md#countConversationsAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Conversations/Count | Count Conversations |
| [**countFollowedProfilesAsync**](SocialProfilesApi.md#countFollowedProfilesAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Follows/Profiles/Count | Count Followed Profiles |
| [**countFollowerProfilesAsync**](SocialProfilesApi.md#countFollowerProfilesAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Followers/Profiles/Count | Count Follower Profiles |
| [**countFollowersAsync**](SocialProfilesApi.md#countFollowersAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Followers/Count | Count Followers |
| [**countFollowsAsync**](SocialProfilesApi.md#countFollowsAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Follows/Count | Count Follows |
| [**countMessagesAsync**](SocialProfilesApi.md#countMessagesAsync) | **GET** /api/v2/SocialService/SocialProfiles/{conversationId}/Messages/Count | Count Messages |
| [**countNotificationsAsync**](SocialProfilesApi.md#countNotificationsAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Notifications/Count | Count Notifications |
| [**countSocialProfilesAsync**](SocialProfilesApi.md#countSocialProfilesAsync) | **GET** /api/v2/SocialService/SocialProfiles/Count | Count Social Profiles |
| [**createConversationAsync**](SocialProfilesApi.md#createConversationAsync) | **POST** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Conversations | Create Conversation |
| [**createMessageAsync**](SocialProfilesApi.md#createMessageAsync) | **POST** /api/v2/SocialService/SocialProfiles/{conversationId}/Messages | Create Message |
| [**deleteMessageAsync**](SocialProfilesApi.md#deleteMessageAsync) | **DELETE** /api/v2/SocialService/SocialProfiles/{conversationId}/Messages/{messageId} | Delete Message |
| [**followAsync**](SocialProfilesApi.md#followAsync) | **POST** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Follows/{followedSocialProfileId} | Follow |
| [**followExistsAsync**](SocialProfilesApi.md#followExistsAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Follows/{followedSocialProfileId} | Check if Follow Exists |
| [**getConversationsAsync**](SocialProfilesApi.md#getConversationsAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Conversations | Get Conversations |
| [**getFollowedProfilesAsync**](SocialProfilesApi.md#getFollowedProfilesAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Follows/Profiles | Get Followed Profiles |
| [**getFollowerProfilesAsync**](SocialProfilesApi.md#getFollowerProfilesAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Followers/Profiles | Get Follower Profiles |
| [**getFollowersAsync**](SocialProfilesApi.md#getFollowersAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Followers | Get Followers |
| [**getFollowsAsync**](SocialProfilesApi.md#getFollowsAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Follows | Get Follows |
| [**getMessagesAsync**](SocialProfilesApi.md#getMessagesAsync) | **GET** /api/v2/SocialService/SocialProfiles/{conversationId}/Messages | Get Messages |
| [**getNotificationsAsync**](SocialProfilesApi.md#getNotificationsAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Notifications | Get Notifications |
| [**getSocialProfileAsync**](SocialProfilesApi.md#getSocialProfileAsync) | **GET** /api/v2/SocialService/SocialProfiles/{socialProfileId} | Get Social Profile |
| [**getSocialProfilesAsync**](SocialProfilesApi.md#getSocialProfilesAsync) | **GET** /api/v2/SocialService/SocialProfiles | Get Social Profiles |
| [**unfollowAsync**](SocialProfilesApi.md#unfollowAsync) | **DELETE** /api/v2/SocialService/SocialProfiles/{socialProfileId}/Follows/{followedSocialProfileId} | Unfollow |
| [**updateMessageAsync**](SocialProfilesApi.md#updateMessageAsync) | **PUT** /api/v2/SocialService/SocialProfiles/{conversationId}/Messages/{messageId} | Update Message |


<a id="countConversationsAsync"></a>
# **countConversationsAsync**
> Int32Envelope countConversationsAsync(socialProfileId, apiVersion, xApiVersion)

Count Conversations

Count conversations for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countConversationsAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#countConversationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#countConversationsAsync")
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

<a id="countFollowedProfilesAsync"></a>
# **countFollowedProfilesAsync**
> Int32Envelope countFollowedProfilesAsync(socialProfileId, apiVersion, xApiVersion)

Count Followed Profiles

Count followed profiles for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countFollowedProfilesAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#countFollowedProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#countFollowedProfilesAsync")
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

<a id="countFollowerProfilesAsync"></a>
# **countFollowerProfilesAsync**
> Int32Envelope countFollowerProfilesAsync(socialProfileId, apiVersion, xApiVersion)

Count Follower Profiles

Count follower profiles for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countFollowerProfilesAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#countFollowerProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#countFollowerProfilesAsync")
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

<a id="countFollowersAsync"></a>
# **countFollowersAsync**
> Int32Envelope countFollowersAsync(socialProfileId, apiVersion, xApiVersion)

Count Followers

Count followers for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countFollowersAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#countFollowersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#countFollowersAsync")
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

<a id="countFollowsAsync"></a>
# **countFollowsAsync**
> Int32Envelope countFollowsAsync(socialProfileId, apiVersion, xApiVersion)

Count Follows

Count follows for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countFollowsAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#countFollowsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#countFollowsAsync")
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

<a id="countMessagesAsync"></a>
# **countMessagesAsync**
> Int32Envelope countMessagesAsync(conversationId, apiVersion, xApiVersion)

Count Messages

Count messages for a conversation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countMessagesAsync(conversationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#countMessagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#countMessagesAsync")
    e.printStackTrace()
}
```

### Parameters
| **conversationId** | **java.util.UUID**|  | |
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

<a id="countNotificationsAsync"></a>
# **countNotificationsAsync**
> Int32Envelope countNotificationsAsync(socialProfileId, apiVersion, xApiVersion)

Count Notifications

Count notifications for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countNotificationsAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#countNotificationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#countNotificationsAsync")
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

<a id="countSocialProfilesAsync"></a>
# **countSocialProfilesAsync**
> Int32Envelope countSocialProfilesAsync(apiVersion, xApiVersion)

Count Social Profiles

Count social profiles.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countSocialProfilesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#countSocialProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#countSocialProfilesAsync")
    e.printStackTrace()
}
```

### Parameters
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

<a id="createConversationAsync"></a>
# **createConversationAsync**
> EmptyEnvelope createConversationAsync(socialProfileId, apiVersion, xApiVersion, conversationCreateDto)

Create Conversation

Create a new conversation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val conversationCreateDto : ConversationCreateDto =  // ConversationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createConversationAsync(socialProfileId, apiVersion, xApiVersion, conversationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#createConversationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#createConversationAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **conversationCreateDto** | [**ConversationCreateDto**](ConversationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createMessageAsync"></a>
# **createMessageAsync**
> EmptyEnvelope createMessageAsync(conversationId, socialProfileId, apiVersion, xApiVersion, privateMessageCreateDto)

Create Message

Create a new message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val privateMessageCreateDto : PrivateMessageCreateDto =  // PrivateMessageCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createMessageAsync(conversationId, socialProfileId, apiVersion, xApiVersion, privateMessageCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#createMessageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#createMessageAsync")
    e.printStackTrace()
}
```

### Parameters
| **conversationId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **privateMessageCreateDto** | [**PrivateMessageCreateDto**](PrivateMessageCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteMessageAsync"></a>
# **deleteMessageAsync**
> EmptyEnvelope deleteMessageAsync(conversationId, messageId, socialProfileId, apiVersion, xApiVersion)

Delete Message

Delete a message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val messageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteMessageAsync(conversationId, messageId, socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#deleteMessageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#deleteMessageAsync")
    e.printStackTrace()
}
```

### Parameters
| **conversationId** | **java.util.UUID**|  | |
| **messageId** | **java.util.UUID**|  | |
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

<a id="followAsync"></a>
# **followAsync**
> EmptyEnvelope followAsync(socialProfileId, followedSocialProfileId, apiVersion, xApiVersion)

Follow

Follow a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val followedSocialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.followAsync(socialProfileId, followedSocialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#followAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#followAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **followedSocialProfileId** | **java.util.UUID**|  | |
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

<a id="followExistsAsync"></a>
# **followExistsAsync**
> BooleanEnvelope followExistsAsync(socialProfileId, followedSocialProfileId, apiVersion, xApiVersion)

Check if Follow Exists

Check if a follow record exists between two social profiles.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val followedSocialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BooleanEnvelope = apiInstance.followExistsAsync(socialProfileId, followedSocialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#followExistsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#followExistsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **followedSocialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getConversationsAsync"></a>
# **getConversationsAsync**
> ConversationDtoListEnvelope getConversationsAsync(socialProfileId, apiVersion, xApiVersion)

Get Conversations

Get a list of conversations for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ConversationDtoListEnvelope = apiInstance.getConversationsAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getConversationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getConversationsAsync")
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

[**ConversationDtoListEnvelope**](ConversationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFollowedProfilesAsync"></a>
# **getFollowedProfilesAsync**
> SocialProfileDtoListEnvelope getFollowedProfilesAsync(socialProfileId, apiVersion, xApiVersion)

Get Followed Profiles

Get a list of followed profiles for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialProfileDtoListEnvelope = apiInstance.getFollowedProfilesAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getFollowedProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getFollowedProfilesAsync")
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

[**SocialProfileDtoListEnvelope**](SocialProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFollowerProfilesAsync"></a>
# **getFollowerProfilesAsync**
> SocialProfileDtoListEnvelope getFollowerProfilesAsync(socialProfileId, apiVersion, xApiVersion)

Get Follower Profiles

Get a list of follower profiles for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialProfileDtoListEnvelope = apiInstance.getFollowerProfilesAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getFollowerProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getFollowerProfilesAsync")
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

[**SocialProfileDtoListEnvelope**](SocialProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFollowersAsync"></a>
# **getFollowersAsync**
> FollowRecordDtoListEnvelope getFollowersAsync(socialProfileId, apiVersion, xApiVersion)

Get Followers

Get a list of followers for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FollowRecordDtoListEnvelope = apiInstance.getFollowersAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getFollowersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getFollowersAsync")
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

[**FollowRecordDtoListEnvelope**](FollowRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFollowsAsync"></a>
# **getFollowsAsync**
> FollowRecordDtoListEnvelope getFollowsAsync(socialProfileId, apiVersion, xApiVersion)

Get Follows

Get a list of follows for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FollowRecordDtoListEnvelope = apiInstance.getFollowsAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getFollowsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getFollowsAsync")
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

[**FollowRecordDtoListEnvelope**](FollowRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMessagesAsync"></a>
# **getMessagesAsync**
> PrivateMessageDtoListEnvelope getMessagesAsync(conversationId, apiVersion, xApiVersion)

Get Messages

Get a list of messages for a conversation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PrivateMessageDtoListEnvelope = apiInstance.getMessagesAsync(conversationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getMessagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getMessagesAsync")
    e.printStackTrace()
}
```

### Parameters
| **conversationId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PrivateMessageDtoListEnvelope**](PrivateMessageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNotificationsAsync"></a>
# **getNotificationsAsync**
> NotificationDtoListEnvelope getNotificationsAsync(socialProfileId, apiVersion, xApiVersion)

Get Notifications

Get a list of notifications for a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NotificationDtoListEnvelope = apiInstance.getNotificationsAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getNotificationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getNotificationsAsync")
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

[**NotificationDtoListEnvelope**](NotificationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialProfileAsync"></a>
# **getSocialProfileAsync**
> SocialProfileDtoEnvelope getSocialProfileAsync(socialProfileId, apiVersion, xApiVersion)

Get Social Profile

Get a social profile by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialProfileDtoEnvelope = apiInstance.getSocialProfileAsync(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getSocialProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getSocialProfileAsync")
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

[**SocialProfileDtoEnvelope**](SocialProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialProfilesAsync"></a>
# **getSocialProfilesAsync**
> SocialProfileDtoListEnvelope getSocialProfilesAsync(apiVersion, xApiVersion)

Get Social Profiles

Get a list of social profiles.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialProfileDtoListEnvelope = apiInstance.getSocialProfilesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#getSocialProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#getSocialProfilesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialProfileDtoListEnvelope**](SocialProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="unfollowAsync"></a>
# **unfollowAsync**
> EmptyEnvelope unfollowAsync(socialProfileId, followedSocialProfileId, apiVersion, xApiVersion)

Unfollow

Unfollow a social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val followedSocialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.unfollowAsync(socialProfileId, followedSocialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#unfollowAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#unfollowAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **followedSocialProfileId** | **java.util.UUID**|  | |
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

<a id="updateMessageAsync"></a>
# **updateMessageAsync**
> EmptyEnvelope updateMessageAsync(conversationId, messageId, socialProfileId, apiVersion, xApiVersion, privateMessageUpdateDto)

Update Message

Update a message.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialProfilesApi()
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val messageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val privateMessageUpdateDto : PrivateMessageUpdateDto =  // PrivateMessageUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateMessageAsync(conversationId, messageId, socialProfileId, apiVersion, xApiVersion, privateMessageUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialProfilesApi#updateMessageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialProfilesApi#updateMessageAsync")
    e.printStackTrace()
}
```

### Parameters
| **conversationId** | **java.util.UUID**|  | |
| **messageId** | **java.util.UUID**|  | |
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **privateMessageUpdateDto** | [**PrivateMessageUpdateDto**](PrivateMessageUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

