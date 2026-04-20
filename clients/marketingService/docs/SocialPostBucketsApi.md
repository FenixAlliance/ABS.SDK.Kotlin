# SocialPostBucketsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSocialPostBucketAsync**](SocialPostBucketsApi.md#createSocialPostBucketAsync) | **POST** /api/v2/MarketingService/SocialPostBuckets | Create a social post bucket |
| [**deleteSocialPostBucketAsync**](SocialPostBucketsApi.md#deleteSocialPostBucketAsync) | **DELETE** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | Delete a social post bucket |
| [**getSocialPostBucketDetailsAsync**](SocialPostBucketsApi.md#getSocialPostBucketDetailsAsync) | **GET** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | Get social post bucket by ID |
| [**getSocialPostBucketsCountAsync**](SocialPostBucketsApi.md#getSocialPostBucketsCountAsync) | **GET** /api/v2/MarketingService/SocialPostBuckets/Count | Get social post buckets count |
| [**getSocialPostBucketsODataAsync**](SocialPostBucketsApi.md#getSocialPostBucketsODataAsync) | **GET** /api/v2/MarketingService/SocialPostBuckets | Get social post buckets |
| [**updateSocialPostBucketAsync**](SocialPostBucketsApi.md#updateSocialPostBucketAsync) | **PUT** /api/v2/MarketingService/SocialPostBuckets/{socialpostbucketId} | Update a social post bucket |


<a id="createSocialPostBucketAsync"></a>
# **createSocialPostBucketAsync**
> EmptyEnvelope createSocialPostBucketAsync(tenantId, socialPostBucketCreateDto, apiVersion, xApiVersion)

Create a social post bucket

Creates a new social post bucket for the specified tenant.

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
    val result : EmptyEnvelope = apiInstance.createSocialPostBucketAsync(tenantId, socialPostBucketCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#createSocialPostBucketAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#createSocialPostBucketAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSocialPostBucketAsync"></a>
# **deleteSocialPostBucketAsync**
> EmptyEnvelope deleteSocialPostBucketAsync(socialpostbucketId, tenantId, apiVersion, xApiVersion)

Delete a social post bucket

Deletes a social post bucket by its ID.

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
    val result : EmptyEnvelope = apiInstance.deleteSocialPostBucketAsync(socialpostbucketId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#deleteSocialPostBucketAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#deleteSocialPostBucketAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialPostBucketDetailsAsync"></a>
# **getSocialPostBucketDetailsAsync**
> SocialPostBucketDtoEnvelope getSocialPostBucketDetailsAsync(socialpostbucketId, tenantId, apiVersion, xApiVersion)

Get social post bucket by ID

Retrieves the details of a specific social post bucket by its ID.

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
    val result : SocialPostBucketDtoEnvelope = apiInstance.getSocialPostBucketDetailsAsync(socialpostbucketId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#getSocialPostBucketDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#getSocialPostBucketDetailsAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialPostBucketsCountAsync"></a>
# **getSocialPostBucketsCountAsync**
> Int32Envelope getSocialPostBucketsCountAsync(tenantId, apiVersion, xApiVersion)

Get social post buckets count

Returns the count of social post buckets for the specified tenant using OData query options.

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
    val result : Int32Envelope = apiInstance.getSocialPostBucketsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#getSocialPostBucketsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#getSocialPostBucketsCountAsync")
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

<a id="getSocialPostBucketsODataAsync"></a>
# **getSocialPostBucketsODataAsync**
> SocialPostBucketDtoListEnvelope getSocialPostBucketsODataAsync(tenantId, apiVersion, xApiVersion)

Get social post buckets

Retrieves a collection of social post buckets for the specified tenant using OData query options.

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
    val result : SocialPostBucketDtoListEnvelope = apiInstance.getSocialPostBucketsODataAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#getSocialPostBucketsODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#getSocialPostBucketsODataAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateSocialPostBucketAsync"></a>
# **updateSocialPostBucketAsync**
> EmptyEnvelope updateSocialPostBucketAsync(socialpostbucketId, tenantId, socialPostBucketUpdateDto, apiVersion, xApiVersion)

Update a social post bucket

Updates an existing social post bucket by its ID.

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
    val result : EmptyEnvelope = apiInstance.updateSocialPostBucketAsync(socialpostbucketId, tenantId, socialPostBucketUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialPostBucketsApi#updateSocialPostBucketAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialPostBucketsApi#updateSocialPostBucketAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

