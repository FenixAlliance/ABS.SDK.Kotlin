# SocialMediaPostsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceSocialMediaPostsCountGet**](SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsCountGet) | **GET** /api/v2/MarketingService/SocialMediaPosts/Count |  |
| [**apiV2MarketingServiceSocialMediaPostsGet**](SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsGet) | **GET** /api/v2/MarketingService/SocialMediaPosts |  |
| [**apiV2MarketingServiceSocialMediaPostsPost**](SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsPost) | **POST** /api/v2/MarketingService/SocialMediaPosts |  |
| [**apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete**](SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete) | **DELETE** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} |  |
| [**apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet**](SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet) | **GET** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} |  |
| [**apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut**](SocialMediaPostsApi.md#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut) | **PUT** /api/v2/MarketingService/SocialMediaPosts/{socialmediapostId} |  |


<a id="apiV2MarketingServiceSocialMediaPostsCountGet"></a>
# **apiV2MarketingServiceSocialMediaPostsCountGet**
> Int32Envelope apiV2MarketingServiceSocialMediaPostsCountGet(tenantId, apiVersion, xApiVersion)



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
    val result : Int32Envelope = apiInstance.apiV2MarketingServiceSocialMediaPostsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsCountGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceSocialMediaPostsGet"></a>
# **apiV2MarketingServiceSocialMediaPostsGet**
> SocialMediaPostDtoListEnvelope apiV2MarketingServiceSocialMediaPostsGet(tenantId, apiVersion, xApiVersion)



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
    val result : SocialMediaPostDtoListEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceSocialMediaPostsPost"></a>
# **apiV2MarketingServiceSocialMediaPostsPost**
> EmptyEnvelope apiV2MarketingServiceSocialMediaPostsPost(tenantId, socialMediaPostCreateDto, apiVersion, xApiVersion)



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
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsPost(tenantId, socialMediaPostCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsPost")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete"></a>
# **apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete**
> EmptyEnvelope apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete(socialmediapostId, tenantId, apiVersion, xApiVersion)



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
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete(socialmediapostId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdDelete")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet"></a>
# **apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet**
> SocialMediaPostDtoEnvelope apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet(socialmediapostId, tenantId, apiVersion, xApiVersion)



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
    val result : SocialMediaPostDtoEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet(socialmediapostId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut"></a>
# **apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut**
> EmptyEnvelope apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut(socialmediapostId, tenantId, socialMediaPostUpdateDto, apiVersion, xApiVersion)



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
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut(socialmediapostId, tenantId, socialMediaPostUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialMediaPostsApi#apiV2MarketingServiceSocialMediaPostsSocialmediapostIdPut")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

