# TrackingPixelsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTrackingPixelAsync**](TrackingPixelsApi.md#getTrackingPixelAsync) | **GET** /api/v2/MarketingService/TrackingPixels/{pixelId} | Get a tracking pixel |


<a id="getTrackingPixelAsync"></a>
# **getTrackingPixelAsync**
> OrderDtoEnvelope getTrackingPixelAsync(pixelId, apiVersion, xApiVersion)

Get a tracking pixel

Retrieves a tracking pixel by its ID.

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
    val result : OrderDtoEnvelope = apiInstance.getTrackingPixelAsync(pixelId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrackingPixelsApi#getTrackingPixelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrackingPixelsApi#getTrackingPixelAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

