# ShipmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ShipmentsServiceShipmentsGet**](ShipmentsApi.md#apiV2ShipmentsServiceShipmentsGet) | **GET** /api/v2/ShipmentsService/Shipments |  |


<a id="apiV2ShipmentsServiceShipmentsGet"></a>
# **apiV2ShipmentsServiceShipmentsGet**
> ShipmentDtoListEnvelope apiV2ShipmentsServiceShipmentsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShipmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShipmentDtoListEnvelope = apiInstance.apiV2ShipmentsServiceShipmentsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#apiV2ShipmentsServiceShipmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#apiV2ShipmentsServiceShipmentsGet")
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

[**ShipmentDtoListEnvelope**](ShipmentDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

