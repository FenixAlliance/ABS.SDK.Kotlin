# TrackingPixelsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceTrackingPixelsPixelIdGet**](TrackingPixelsApi.md#apiV2MarketingServiceTrackingPixelsPixelIdGet) | **GET** /api/v2/MarketingService/TrackingPixels/{pixelId} |  |


<a id="apiV2MarketingServiceTrackingPixelsPixelIdGet"></a>
# **apiV2MarketingServiceTrackingPixelsPixelIdGet**
> OrderDtoEnvelope apiV2MarketingServiceTrackingPixelsPixelIdGet(pixelId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrackingPixelsApi()
val pixelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OrderDtoEnvelope = apiInstance.apiV2MarketingServiceTrackingPixelsPixelIdGet(pixelId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrackingPixelsApi#apiV2MarketingServiceTrackingPixelsPixelIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrackingPixelsApi#apiV2MarketingServiceTrackingPixelsPixelIdGet")
    e.printStackTrace()
}
```

### Parameters
| **pixelId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OrderDtoEnvelope**](OrderDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

