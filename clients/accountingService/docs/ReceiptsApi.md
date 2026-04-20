# ReceiptsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createReceiptAsync**](ReceiptsApi.md#createReceiptAsync) | **POST** /api/v2/AccountingService/Receipts | Creates a new receipt |
| [**deleteReceiptAsync**](ReceiptsApi.md#deleteReceiptAsync) | **DELETE** /api/v2/AccountingService/Receipts/{receiptId} | Deletes a receipt |
| [**getReceiptDetailsAsync**](ReceiptsApi.md#getReceiptDetailsAsync) | **GET** /api/v2/AccountingService/Receipts/{receiptId} | Gets details of a receipt |
| [**getReceiptsAsync**](ReceiptsApi.md#getReceiptsAsync) | **GET** /api/v2/AccountingService/Receipts | Retrieves tenant receipts |
| [**getReceiptsCountAsync**](ReceiptsApi.md#getReceiptsCountAsync) | **GET** /api/v2/AccountingService/Receipts/Count | Gets count of tenant receipts |
| [**updateReceiptAsync**](ReceiptsApi.md#updateReceiptAsync) | **PUT** /api/v2/AccountingService/Receipts/{receiptId} | Updates a receipt |


<a id="createReceiptAsync"></a>
# **createReceiptAsync**
> EmptyEnvelope createReceiptAsync(tenantId, receiptCreateDto)

Creates a new receipt

Adds a new receipt record under the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReceiptsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val receiptCreateDto : ReceiptCreateDto =  // ReceiptCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createReceiptAsync(tenantId, receiptCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReceiptsApi#createReceiptAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReceiptsApi#createReceiptAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **receiptCreateDto** | [**ReceiptCreateDto**](ReceiptCreateDto.md)|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteReceiptAsync"></a>
# **deleteReceiptAsync**
> EmptyEnvelope deleteReceiptAsync(receiptId, tenantId)

Deletes a receipt

Removes an existing receipt from the tenant’s records.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReceiptsApi()
val receiptId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteReceiptAsync(receiptId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReceiptsApi#deleteReceiptAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReceiptsApi#deleteReceiptAsync")
    e.printStackTrace()
}
```

### Parameters
| **receiptId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReceiptDetailsAsync"></a>
# **getReceiptDetailsAsync**
> ReceiptDtoEnvelope getReceiptDetailsAsync(receiptId, tenantId)

Gets details of a receipt

Retrieves a specific receipt by its ID for the given tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReceiptsApi()
val receiptId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ReceiptDtoEnvelope = apiInstance.getReceiptDetailsAsync(receiptId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReceiptsApi#getReceiptDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReceiptsApi#getReceiptDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **receiptId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ReceiptDtoEnvelope**](ReceiptDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReceiptsAsync"></a>
# **getReceiptsAsync**
> ReceiptDtoIReadOnlyListEnvelope getReceiptsAsync(tenantId)

Retrieves tenant receipts

Fetches all receipts for a given tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReceiptsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ReceiptDtoIReadOnlyListEnvelope = apiInstance.getReceiptsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReceiptsApi#getReceiptsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReceiptsApi#getReceiptsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ReceiptDtoIReadOnlyListEnvelope**](ReceiptDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReceiptsCountAsync"></a>
# **getReceiptsCountAsync**
> Int32Envelope getReceiptsCountAsync(tenantId)

Gets count of tenant receipts

Returns total number of receipts for the tenant with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReceiptsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getReceiptsCountAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReceiptsApi#getReceiptsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReceiptsApi#getReceiptsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateReceiptAsync"></a>
# **updateReceiptAsync**
> EmptyEnvelope updateReceiptAsync(receiptId, tenantId, receiptUpdateDto)

Updates a receipt

Modifies the data of an existing receipt for the given tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReceiptsApi()
val receiptId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val receiptUpdateDto : ReceiptUpdateDto =  // ReceiptUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateReceiptAsync(receiptId, tenantId, receiptUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReceiptsApi#updateReceiptAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReceiptsApi#updateReceiptAsync")
    e.printStackTrace()
}
```

### Parameters
| **receiptId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **receiptUpdateDto** | [**ReceiptUpdateDto**](ReceiptUpdateDto.md)|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

