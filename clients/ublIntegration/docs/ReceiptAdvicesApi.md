# ReceiptAdvicesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2UblServiceReceiptAdvicesItemRestockIdGet**](ReceiptAdvicesApi.md#apiV2UblServiceReceiptAdvicesItemRestockIdGet) | **GET** /api/v2/UblService/ReceiptAdvices/{itemRestockId} |  |
| [**apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet**](ReceiptAdvicesApi.md#apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet) | **GET** /api/v2/UblService/ReceiptAdvices/{itemRestockId}/partitions |  |


<a id="apiV2UblServiceReceiptAdvicesItemRestockIdGet"></a>
# **apiV2UblServiceReceiptAdvicesItemRestockIdGet**
> apiV2UblServiceReceiptAdvicesItemRestockIdGet(itemRestockId, tenantId, profile, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReceiptAdvicesApi()
val itemRestockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val profile : kotlin.String = profile_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2UblServiceReceiptAdvicesItemRestockIdGet(itemRestockId, tenantId, profile, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ReceiptAdvicesApi#apiV2UblServiceReceiptAdvicesItemRestockIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReceiptAdvicesApi#apiV2UblServiceReceiptAdvicesItemRestockIdGet")
    e.printStackTrace()
}
```

### Parameters
| **itemRestockId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **profile** | **kotlin.String**|  | [optional] [default to Generic] [enum: Generic, Dian] |
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
 - **Accept**: Not defined

<a id="apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet"></a>
# **apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet**
> apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet(itemRestockId, tenantId, profile, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReceiptAdvicesApi()
val itemRestockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val profile : kotlin.String = profile_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet(itemRestockId, tenantId, profile, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ReceiptAdvicesApi#apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReceiptAdvicesApi#apiV2UblServiceReceiptAdvicesItemRestockIdPartitionsGet")
    e.printStackTrace()
}
```

### Parameters
| **itemRestockId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **profile** | **kotlin.String**|  | [optional] [default to Generic] [enum: Generic, Dian] |
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
 - **Accept**: Not defined

