# NewslettersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceNewslettersCountGet**](NewslettersApi.md#apiV2MarketingServiceNewslettersCountGet) | **GET** /api/v2/MarketingService/Newsletters/Count |  |
| [**apiV2MarketingServiceNewslettersGet**](NewslettersApi.md#apiV2MarketingServiceNewslettersGet) | **GET** /api/v2/MarketingService/Newsletters |  |
| [**apiV2MarketingServiceNewslettersNewsletterIdDelete**](NewslettersApi.md#apiV2MarketingServiceNewslettersNewsletterIdDelete) | **DELETE** /api/v2/MarketingService/Newsletters/{newsletterId} |  |
| [**apiV2MarketingServiceNewslettersNewsletterIdGet**](NewslettersApi.md#apiV2MarketingServiceNewslettersNewsletterIdGet) | **GET** /api/v2/MarketingService/Newsletters/{newsletterId} |  |
| [**apiV2MarketingServiceNewslettersNewsletterIdPut**](NewslettersApi.md#apiV2MarketingServiceNewslettersNewsletterIdPut) | **PUT** /api/v2/MarketingService/Newsletters/{newsletterId} |  |
| [**apiV2MarketingServiceNewslettersPost**](NewslettersApi.md#apiV2MarketingServiceNewslettersPost) | **POST** /api/v2/MarketingService/Newsletters |  |


<a id="apiV2MarketingServiceNewslettersCountGet"></a>
# **apiV2MarketingServiceNewslettersCountGet**
> Int32Envelope apiV2MarketingServiceNewslettersCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2MarketingServiceNewslettersCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#apiV2MarketingServiceNewslettersCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#apiV2MarketingServiceNewslettersCountGet")
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

<a id="apiV2MarketingServiceNewslettersGet"></a>
# **apiV2MarketingServiceNewslettersGet**
> apiV2MarketingServiceNewslettersGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2MarketingServiceNewslettersGet(tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#apiV2MarketingServiceNewslettersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#apiV2MarketingServiceNewslettersGet")
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

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceNewslettersNewsletterIdDelete"></a>
# **apiV2MarketingServiceNewslettersNewsletterIdDelete**
> EmptyEnvelope apiV2MarketingServiceNewslettersNewsletterIdDelete(newsletterId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceNewslettersNewsletterIdDelete(newsletterId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#apiV2MarketingServiceNewslettersNewsletterIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#apiV2MarketingServiceNewslettersNewsletterIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **newsletterId** | **java.util.UUID**|  | |
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

<a id="apiV2MarketingServiceNewslettersNewsletterIdGet"></a>
# **apiV2MarketingServiceNewslettersNewsletterIdGet**
> NewsletterDtoEnvelope apiV2MarketingServiceNewslettersNewsletterIdGet(newsletterId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NewsletterDtoEnvelope = apiInstance.apiV2MarketingServiceNewslettersNewsletterIdGet(newsletterId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#apiV2MarketingServiceNewslettersNewsletterIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#apiV2MarketingServiceNewslettersNewsletterIdGet")
    e.printStackTrace()
}
```

### Parameters
| **newsletterId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**NewsletterDtoEnvelope**](NewsletterDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceNewslettersNewsletterIdPut"></a>
# **apiV2MarketingServiceNewslettersNewsletterIdPut**
> EmptyEnvelope apiV2MarketingServiceNewslettersNewsletterIdPut(newsletterId, tenantId, newsletterUpdateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val newsletterUpdateDto : NewsletterUpdateDto =  // NewsletterUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceNewslettersNewsletterIdPut(newsletterId, tenantId, newsletterUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#apiV2MarketingServiceNewslettersNewsletterIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#apiV2MarketingServiceNewslettersNewsletterIdPut")
    e.printStackTrace()
}
```

### Parameters
| **newsletterId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **newsletterUpdateDto** | [**NewsletterUpdateDto**](NewsletterUpdateDto.md)|  | |
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

<a id="apiV2MarketingServiceNewslettersPost"></a>
# **apiV2MarketingServiceNewslettersPost**
> EmptyEnvelope apiV2MarketingServiceNewslettersPost(tenantId, newsletterCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val newsletterCreateDto : NewsletterCreateDto =  // NewsletterCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceNewslettersPost(tenantId, newsletterCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#apiV2MarketingServiceNewslettersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#apiV2MarketingServiceNewslettersPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **newsletterCreateDto** | [**NewsletterCreateDto**](NewsletterCreateDto.md)|  | |
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

