# MarketingCampaignsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMarketingCampaignAsync**](MarketingCampaignsApi.md#createMarketingCampaignAsync) | **POST** /api/v2/MarketingService/MarketingCampaigns | Create a marketing campaign |
| [**deleteMarketingCampaignAsync**](MarketingCampaignsApi.md#deleteMarketingCampaignAsync) | **DELETE** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | Delete a marketing campaign |
| [**getMarketingCampaignDetailsAsync**](MarketingCampaignsApi.md#getMarketingCampaignDetailsAsync) | **GET** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | Get marketing campaign by ID |
| [**getMarketingCampaignODataAsync**](MarketingCampaignsApi.md#getMarketingCampaignODataAsync) | **GET** /api/v2/MarketingService/MarketingCampaigns | Get marketing campaigns |
| [**getMarketingCampaignsCountAsync**](MarketingCampaignsApi.md#getMarketingCampaignsCountAsync) | **GET** /api/v2/MarketingService/MarketingCampaigns/Count | Get marketing campaigns count |
| [**updateMarketingCampaignAsync**](MarketingCampaignsApi.md#updateMarketingCampaignAsync) | **PUT** /api/v2/MarketingService/MarketingCampaigns/{marketingcampaignId} | Update a marketing campaign |


<a id="createMarketingCampaignAsync"></a>
# **createMarketingCampaignAsync**
> EmptyEnvelope createMarketingCampaignAsync(tenantId, marketingCampaignCreateDto, apiVersion, xApiVersion)

Create a marketing campaign

Creates a new marketing campaign for the specified tenant.

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
    val result : EmptyEnvelope = apiInstance.createMarketingCampaignAsync(tenantId, marketingCampaignCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#createMarketingCampaignAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#createMarketingCampaignAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteMarketingCampaignAsync"></a>
# **deleteMarketingCampaignAsync**
> EmptyEnvelope deleteMarketingCampaignAsync(marketingcampaignId, tenantId, apiVersion, xApiVersion)

Delete a marketing campaign

Deletes a marketing campaign by its ID.

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
    val result : EmptyEnvelope = apiInstance.deleteMarketingCampaignAsync(marketingcampaignId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#deleteMarketingCampaignAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#deleteMarketingCampaignAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingCampaignDetailsAsync"></a>
# **getMarketingCampaignDetailsAsync**
> MarketingCampaignDtoEnvelope getMarketingCampaignDetailsAsync(marketingcampaignId, tenantId, apiVersion, xApiVersion)

Get marketing campaign by ID

Retrieves the details of a specific marketing campaign by its ID.

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
    val result : MarketingCampaignDtoEnvelope = apiInstance.getMarketingCampaignDetailsAsync(marketingcampaignId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#getMarketingCampaignDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#getMarketingCampaignDetailsAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingCampaignODataAsync"></a>
# **getMarketingCampaignODataAsync**
> getMarketingCampaignODataAsync(tenantId, apiVersion, xApiVersion)

Get marketing campaigns

Retrieves a collection of marketing campaigns for the specified tenant using OData query options.

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
    apiInstance.getMarketingCampaignODataAsync(tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#getMarketingCampaignODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#getMarketingCampaignODataAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingCampaignsCountAsync"></a>
# **getMarketingCampaignsCountAsync**
> Int32Envelope getMarketingCampaignsCountAsync(tenantId, apiVersion, xApiVersion)

Get marketing campaigns count

Returns the count of marketing campaigns for the specified tenant using OData query options.

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
    val result : Int32Envelope = apiInstance.getMarketingCampaignsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#getMarketingCampaignsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#getMarketingCampaignsCountAsync")
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

<a id="updateMarketingCampaignAsync"></a>
# **updateMarketingCampaignAsync**
> EmptyEnvelope updateMarketingCampaignAsync(marketingcampaignId, tenantId, marketingCampaignUpdateDto, apiVersion, xApiVersion)

Update a marketing campaign

Updates an existing marketing campaign by its ID.

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
    val result : EmptyEnvelope = apiInstance.updateMarketingCampaignAsync(marketingcampaignId, tenantId, marketingCampaignUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingCampaignsApi#updateMarketingCampaignAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingCampaignsApi#updateMarketingCampaignAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

