# WebhooksApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getWebhookRequestsAsync**](WebhooksApi.md#getWebhookRequestsAsync) | **GET** /api/v2/SecurityService/Webhooks | Get all webhook requests |
| [**getWebhookRequestsCountAsync**](WebhooksApi.md#getWebhookRequestsCountAsync) | **GET** /api/v2/SecurityService/Webhooks/Count | Get webhook requests count |


<a id="getWebhookRequestsAsync"></a>
# **getWebhookRequestsAsync**
> WebhookRequestDtoListEnvelope getWebhookRequestsAsync(tenantId, apiVersion, xApiVersion)

Get all webhook requests

Retrieves all webhook requests for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebhookRequestDtoListEnvelope = apiInstance.getWebhookRequestsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhookRequestsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhookRequestsAsync")
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

[**WebhookRequestDtoListEnvelope**](WebhookRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebhookRequestsCountAsync"></a>
# **getWebhookRequestsCountAsync**
> Int32Envelope getWebhookRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get webhook requests count

Retrieves the count of webhook requests for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebhooksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWebhookRequestsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#getWebhookRequestsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#getWebhookRequestsCountAsync")
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

