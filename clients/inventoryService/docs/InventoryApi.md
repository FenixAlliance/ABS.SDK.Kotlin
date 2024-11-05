# InventoryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2InventoryServiceInventoryStockItemIdDetailsGet**](InventoryApi.md#apiV2InventoryServiceInventoryStockItemIdDetailsGet) | **GET** /api/v2/InventoryService/Inventory/{stockItemId}/Details |  |


<a id="apiV2InventoryServiceInventoryStockItemIdDetailsGet"></a>
# **apiV2InventoryServiceInventoryStockItemIdDetailsGet**
> apiV2InventoryServiceInventoryStockItemIdDetailsGet(stockItemId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InventoryApi()
val stockItemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2InventoryServiceInventoryStockItemIdDetailsGet(stockItemId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#apiV2InventoryServiceInventoryStockItemIdDetailsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#apiV2InventoryServiceInventoryStockItemIdDetailsGet")
    e.printStackTrace()
}
```

### Parameters
| **stockItemId** | **java.util.UUID**|  | |
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
 - **Accept**: Not defined

