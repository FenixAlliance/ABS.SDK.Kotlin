# SocialPostBucketsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceSocialPostBucketsCountGet**](SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsCountGet) | **GET** /api/v2/MarketingService/SocialPostBuckets/Count |  |
| [**apiV2MarketingServiceSocialPostBucketsGet**](SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsGet) | **GET** /api/v2/MarketingService/SocialPostBuckets |  |
| [**apiV2MarketingServiceSocialPostBucketsPost**](SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsPost) | **POST** /api/v2/MarketingService/SocialPostBuckets |  |
| [**apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete**](SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete) | **DELETE** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} |  |
| [**apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet**](SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet) | **GET** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} |  |
| [**apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut**](SocialPostBucketsApi.md#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut) | **PUT** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} |  |


<a id="apiV2MarketingServiceSocialPostBucketsCountGet"></a>
# **apiV2MarketingServiceSocialPostBucketsCountGet**
> Int32Envelope apiV2MarketingServiceSocialPostBucketsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostBucketsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2MarketingServiceSocialPostBucketsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsCountGet")
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

<a id="apiV2MarketingServiceSocialPostBucketsGet"></a>
# **apiV2MarketingServiceSocialPostBucketsGet**
> SocialPostBucketDtoListEnvelope apiV2MarketingServiceSocialPostBucketsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostBucketsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialPostBucketDtoListEnvelope = apiInstance.apiV2MarketingServiceSocialPostBucketsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsGet")
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

[**SocialPostBucketDtoListEnvelope**](SocialPostBucketDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceSocialPostBucketsPost"></a>
# **apiV2MarketingServiceSocialPostBucketsPost**
> EmptyEnvelope apiV2MarketingServiceSocialPostBucketsPost(tenantId, socialPostBucketCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostBucketsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialPostBucketCreateDto : SocialPostBucketCreateDto =  // SocialPostBucketCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialPostBucketsPost(tenantId, socialPostBucketCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **socialPostBucketCreateDto** | [**SocialPostBucketCreateDto**](SocialPostBucketCreateDto.md)|  | |
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

<a id="apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete"></a>
# **apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete**
> EmptyEnvelope apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete(socialpostbucketId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostBucketsApi()
val socialpostbucketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete(socialpostbucketId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **socialpostbucketId** | **java.util.UUID**|  | |
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

<a id="apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet"></a>
# **apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet**
> SocialPostBucketDtoEnvelope apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet(socialpostbucketId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostBucketsApi()
val socialpostbucketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialPostBucketDtoEnvelope = apiInstance.apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet(socialpostbucketId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdGet")
    e.printStackTrace()
}
```

### Parameters
| **socialpostbucketId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialPostBucketDtoEnvelope**](SocialPostBucketDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut"></a>
# **apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut**
> EmptyEnvelope apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut(socialpostbucketId, tenantId, socialPostBucketUpdateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialPostBucketsApi()
val socialpostbucketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val socialPostBucketUpdateDto : SocialPostBucketUpdateDto =  // SocialPostBucketUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut(socialpostbucketId, tenantId, socialPostBucketUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#apiV2MarketingServiceSocialPostBucketsSocialpostbucketIdPut")
    e.printStackTrace()
}
```

### Parameters
| **socialpostbucketId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **socialPostBucketUpdateDto** | [**SocialPostBucketUpdateDto**](SocialPostBucketUpdateDto.md)|  | |
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

