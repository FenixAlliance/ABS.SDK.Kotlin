# CompareApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addItemToCompareTableAsync**](CompareApi.md#addItemToCompareTableAsync) | **POST** /api/v2/CartService/Compare | Add an item to the compare table |
| [**getItemToCompareRecord**](CompareApi.md#getItemToCompareRecord) | **GET** /api/v2/CartService/Compare/{recordId}/Details | Get compare record details |
| [**getItemToCompareRecords**](CompareApi.md#getItemToCompareRecords) | **GET** /api/v2/CartService/Compare/{cartId} | Get items to compare in a cart |
| [**removeItemFromCompareTable**](CompareApi.md#removeItemFromCompareTable) | **DELETE** /api/v2/CartService/Compare/{recordId} | Remove an item from the compare table |


<a id="addItemToCompareTableAsync"></a>
# **addItemToCompareTableAsync**
> ItemCartRecordDto addItemToCompareTableAsync(apiVersion, xApiVersion, addProductToCompareRequest)

Add an item to the compare table

Adds a product to the compare table for the specified cart with tracking.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CompareApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val addProductToCompareRequest : AddProductToCompareRequest =  // AddProductToCompareRequest | 
try {
    val result : ItemCartRecordDto = apiInstance.addItemToCompareTableAsync(apiVersion, xApiVersion, addProductToCompareRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompareApi#addItemToCompareTableAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompareApi#addItemToCompareTableAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **addProductToCompareRequest** | [**AddProductToCompareRequest**](AddProductToCompareRequest.md)|  | [optional] |

### Return type

[**ItemCartRecordDto**](ItemCartRecordDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getItemToCompareRecord"></a>
# **getItemToCompareRecord**
> ItemToCompareCartRecordDtoEnvelope getItemToCompareRecord(recordId, apiVersion, xApiVersion)

Get compare record details

Retrieves the details of a specific item-to-compare cart record.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CompareApi()
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemToCompareCartRecordDtoEnvelope = apiInstance.getItemToCompareRecord(recordId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompareApi#getItemToCompareRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompareApi#getItemToCompareRecord")
    e.printStackTrace()
}
```

### Parameters
| **recordId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemToCompareCartRecordDtoEnvelope**](ItemToCompareCartRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemToCompareRecords"></a>
# **getItemToCompareRecords**
> ItemToCompareCartRecordDtoListEnvelope getItemToCompareRecords(cartId, apiVersion, xApiVersion)

Get items to compare in a cart

Retrieves all items added to the compare table for the specified cart.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CompareApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemToCompareCartRecordDtoListEnvelope = apiInstance.getItemToCompareRecords(cartId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompareApi#getItemToCompareRecords")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompareApi#getItemToCompareRecords")
    e.printStackTrace()
}
```

### Parameters
| **cartId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemToCompareCartRecordDtoListEnvelope**](ItemToCompareCartRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeItemFromCompareTable"></a>
# **removeItemFromCompareTable**
> ItemToCompareCartRecordDto removeItemFromCompareTable(recordId, apiVersion, xApiVersion)

Remove an item from the compare table

Removes a specific record from the compare table by its record ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CompareApi()
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemToCompareCartRecordDto = apiInstance.removeItemFromCompareTable(recordId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CompareApi#removeItemFromCompareTable")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CompareApi#removeItemFromCompareTable")
    e.printStackTrace()
}
```

### Parameters
| **recordId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemToCompareCartRecordDto**](ItemToCompareCartRecordDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

