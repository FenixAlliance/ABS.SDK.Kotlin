# MarketingCampaignsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceMarketingCampaignsCountGet**](MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsCountGet) | **GET** /api/v2/MarketingService/MarketingCampaigns/Count |  |
| [**apiV2MarketingServiceMarketingCampaignsGet**](MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsGet) | **GET** /api/v2/MarketingService/MarketingCampaigns |  |
| [**apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete**](MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete) | **DELETE** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} |  |
| [**apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet**](MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet) | **GET** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} |  |
| [**apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut**](MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut) | **PUT** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} |  |
| [**apiV2MarketingServiceMarketingCampaignsPost**](MarketingCampaignsApi.md#apiV2MarketingServiceMarketingCampaignsPost) | **POST** /api/v2/MarketingService/MarketingCampaigns |  |


<a id="apiV2MarketingServiceMarketingCampaignsCountGet"></a>
# **apiV2MarketingServiceMarketingCampaignsCountGet**
> Int32Envelope apiV2MarketingServiceMarketingCampaignsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingCampaignsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2MarketingServiceMarketingCampaignsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsCountGet")
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

<a id="apiV2MarketingServiceMarketingCampaignsGet"></a>
# **apiV2MarketingServiceMarketingCampaignsGet**
> apiV2MarketingServiceMarketingCampaignsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingCampaignsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2MarketingServiceMarketingCampaignsGet(tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsGet")
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

<a id="apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete"></a>
# **apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete**
> EmptyEnvelope apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete(marketingcampaignId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingCampaignsApi()
val marketingcampaignId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete(marketingcampaignId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **marketingcampaignId** | **java.util.UUID**|  | |
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

<a id="apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet"></a>
# **apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet**
> MarketingCampaignDtoEnvelope apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet(marketingcampaignId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingCampaignsApi()
val marketingcampaignId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingCampaignDtoEnvelope = apiInstance.apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet(marketingcampaignId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdGet")
    e.printStackTrace()
}
```

### Parameters
| **marketingcampaignId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MarketingCampaignDtoEnvelope**](MarketingCampaignDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut"></a>
# **apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut**
> EmptyEnvelope apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut(marketingcampaignId, tenantId, marketingCampaignUpdateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingCampaignsApi()
val marketingcampaignId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingCampaignUpdateDto : MarketingCampaignUpdateDto =  // MarketingCampaignUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut(marketingcampaignId, tenantId, marketingCampaignUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsMarketingcampaignIdPut")
    e.printStackTrace()
}
```

### Parameters
| **marketingcampaignId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **marketingCampaignUpdateDto** | [**MarketingCampaignUpdateDto**](MarketingCampaignUpdateDto.md)|  | |
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

<a id="apiV2MarketingServiceMarketingCampaignsPost"></a>
# **apiV2MarketingServiceMarketingCampaignsPost**
> EmptyEnvelope apiV2MarketingServiceMarketingCampaignsPost(tenantId, marketingCampaignCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingCampaignsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingCampaignCreateDto : MarketingCampaignCreateDto =  // MarketingCampaignCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceMarketingCampaignsPost(tenantId, marketingCampaignCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#apiV2MarketingServiceMarketingCampaignsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **marketingCampaignCreateDto** | [**MarketingCampaignCreateDto**](MarketingCampaignCreateDto.md)|  | |
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

