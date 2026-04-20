# ShipmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getShipmentsAsync**](ShipmentsApi.md#getShipmentsAsync) | **GET** /api/v2/ShipmentsService/Shipments | Retrieve a list of shipments |


<a id="getShipmentsAsync"></a>
# **getShipmentsAsync**
> ShipmentDtoListEnvelope getShipmentsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of shipments

Retrieves a list of shipments for the specified tenant.

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
    val result : ShipmentDtoListEnvelope = apiInstance.getShipmentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#getShipmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#getShipmentsAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

