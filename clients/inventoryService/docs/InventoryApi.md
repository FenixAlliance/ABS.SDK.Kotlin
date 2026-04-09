# InventoryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getInventoryDetailsAsync**](InventoryApi.md#getInventoryDetailsAsync) | **GET** /api/v2/InventoryService/Inventory/{stockItemId}/Details | Get inventory details for a stock item |


<a id="getInventoryDetailsAsync"></a>
# **getInventoryDetailsAsync**
> getInventoryDetailsAsync(stockItemId, apiVersion, xApiVersion)

Get inventory details for a stock item

Retrieves the inventory details for a specific stock item by its ID.

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
    apiInstance.getInventoryDetailsAsync(stockItemId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling InventoryApi#getInventoryDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InventoryApi#getInventoryDetailsAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

