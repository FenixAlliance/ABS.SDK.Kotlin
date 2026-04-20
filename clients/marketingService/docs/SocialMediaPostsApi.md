# SocialMediaPostsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSocialMediaPostAsync**](SocialMediaPostsApi.md#createSocialMediaPostAsync) | **POST** /api/v2/MarketingService/SocialMediaPosts | Create a social media post |
| [**deleteSocialMediaPostAsync**](SocialMediaPostsApi.md#deleteSocialMediaPostAsync) | **DELETE** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | Delete a social media post |
| [**getSocialMediaPostDetailsAsync**](SocialMediaPostsApi.md#getSocialMediaPostDetailsAsync) | **GET** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | Get social media post by ID |
| [**getSocialMediaPostsCountAsync**](SocialMediaPostsApi.md#getSocialMediaPostsCountAsync) | **GET** /api/v2/MarketingService/SocialMediaPosts/Count | Get social media posts count |
| [**getSocialMediaPostsODataAsync**](SocialMediaPostsApi.md#getSocialMediaPostsODataAsync) | **GET** /api/v2/MarketingService/SocialMediaPosts | Get social media posts |
| [**updateSocialMediaPostAsync**](SocialMediaPostsApi.md#updateSocialMediaPostAsync) | **PUT** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} | Update a social media post |


<a id="createSocialMediaPostAsync"></a>
# **createSocialMediaPostAsync**
> EmptyEnvelope createSocialMediaPostAsync(tenantId, socialMediaPostCreateDto, apiVersion, xApiVersion)

Create a social media post

Creates a new social media post for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialMediaPostsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialMediaPostCreateDto : SocialMediaPostCreateDto =  // SocialMediaPostCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createSocialMediaPostAsync(tenantId, socialMediaPostCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#createSocialMediaPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#createSocialMediaPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **socialMediaPostCreateDto** | [**SocialMediaPostCreateDto**](SocialMediaPostCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSocialMediaPostAsync"></a>
# **deleteSocialMediaPostAsync**
> EmptyEnvelope deleteSocialMediaPostAsync(socialmediapostId, tenantId, apiVersion, xApiVersion)

Delete a social media post

Deletes a social media post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialMediaPostsApi()
val socialmediapostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSocialMediaPostAsync(socialmediapostId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#deleteSocialMediaPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#deleteSocialMediaPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialmediapostId** | **java.util.UUID**|  | |
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

<a id="getSocialMediaPostDetailsAsync"></a>
# **getSocialMediaPostDetailsAsync**
> SocialMediaPostDtoEnvelope getSocialMediaPostDetailsAsync(socialmediapostId, tenantId, apiVersion, xApiVersion)

Get social media post by ID

Retrieves the details of a specific social media post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialMediaPostsApi()
val socialmediapostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialMediaPostDtoEnvelope = apiInstance.getSocialMediaPostDetailsAsync(socialmediapostId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#getSocialMediaPostDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#getSocialMediaPostDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialmediapostId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialMediaPostDtoEnvelope**](SocialMediaPostDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialMediaPostsCountAsync"></a>
# **getSocialMediaPostsCountAsync**
> Int32Envelope getSocialMediaPostsCountAsync(tenantId, apiVersion, xApiVersion)

Get social media posts count

Returns the count of social media posts for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialMediaPostsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSocialMediaPostsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#getSocialMediaPostsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#getSocialMediaPostsCountAsync")
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

<a id="getSocialMediaPostsODataAsync"></a>
# **getSocialMediaPostsODataAsync**
> SocialMediaPostDtoListEnvelope getSocialMediaPostsODataAsync(tenantId, apiVersion, xApiVersion)

Get social media posts

Retrieves a collection of social media posts for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialMediaPostsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialMediaPostDtoListEnvelope = apiInstance.getSocialMediaPostsODataAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#getSocialMediaPostsODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#getSocialMediaPostsODataAsync")
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

[**SocialMediaPostDtoListEnvelope**](SocialMediaPostDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateSocialMediaPostAsync"></a>
# **updateSocialMediaPostAsync**
> EmptyEnvelope updateSocialMediaPostAsync(socialmediapostId, tenantId, socialMediaPostUpdateDto, apiVersion, xApiVersion)

Update a social media post

Updates an existing social media post by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialMediaPostsApi()
val socialmediapostId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialMediaPostUpdateDto : SocialMediaPostUpdateDto =  // SocialMediaPostUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateSocialMediaPostAsync(socialmediapostId, tenantId, socialMediaPostUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#updateSocialMediaPostAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#updateSocialMediaPostAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialmediapostId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **socialMediaPostUpdateDto** | [**SocialMediaPostUpdateDto**](SocialMediaPostUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

