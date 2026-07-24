# DespatchAdvicesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2UblServiceDespatchAdvicesShipmentIdGet**](DespatchAdvicesApi.md#apiV2UblServiceDespatchAdvicesShipmentIdGet) | **GET** /api/v2/UblService/DespatchAdvices/{shipmentId} |  |


<a id="apiV2UblServiceDespatchAdvicesShipmentIdGet"></a>
# **apiV2UblServiceDespatchAdvicesShipmentIdGet**
> apiV2UblServiceDespatchAdvicesShipmentIdGet(shipmentId, tenantId, profile, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DespatchAdvicesApi()
val shipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val profile : kotlin.String = profile_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2UblServiceDespatchAdvicesShipmentIdGet(shipmentId, tenantId, profile, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling DespatchAdvicesApi#apiV2UblServiceDespatchAdvicesShipmentIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DespatchAdvicesApi#apiV2UblServiceDespatchAdvicesShipmentIdGet")
    e.printStackTrace()
}
```

### Parameters
| **shipmentId** | **java.util.UUID**|  | |
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

