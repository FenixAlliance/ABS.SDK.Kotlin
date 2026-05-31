# InvoiceEnumerationRangesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createInvoiceEnumerationRangeAsync**](InvoiceEnumerationRangesApi.md#createInvoiceEnumerationRangeAsync) | **POST** /api/v2/AccountingService/InvoiceEnumerationRanges | Create a new invoice enumeration range |
| [**deleteInvoiceEnumerationRangeAsync**](InvoiceEnumerationRangesApi.md#deleteInvoiceEnumerationRangeAsync) | **DELETE** /api/v2/AccountingService/InvoiceEnumerationRanges/{rangeId} | Delete an invoice enumeration range |
| [**getInvoiceEnumerationRangeDetailsAsync**](InvoiceEnumerationRangesApi.md#getInvoiceEnumerationRangeDetailsAsync) | **GET** /api/v2/AccountingService/InvoiceEnumerationRanges/{rangeId} | Get invoice enumeration range by ID |
| [**getInvoiceEnumerationRangesAsync**](InvoiceEnumerationRangesApi.md#getInvoiceEnumerationRangesAsync) | **GET** /api/v2/AccountingService/InvoiceEnumerationRanges | Get all invoice enumeration ranges |
| [**updateInvoiceEnumerationRangeAsync**](InvoiceEnumerationRangesApi.md#updateInvoiceEnumerationRangeAsync) | **PUT** /api/v2/AccountingService/InvoiceEnumerationRanges/{rangeId} | Update an invoice enumeration range |


<a id="createInvoiceEnumerationRangeAsync"></a>
# **createInvoiceEnumerationRangeAsync**
> EmptyEnvelope createInvoiceEnumerationRangeAsync(tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeCreateDto)

Create a new invoice enumeration range

Creates a new invoice enumeration range for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoiceEnumerationRangesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val invoiceEnumerationRangeCreateDto : InvoiceEnumerationRangeCreateDto =  // InvoiceEnumerationRangeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createInvoiceEnumerationRangeAsync(tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceEnumerationRangesApi#createInvoiceEnumerationRangeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceEnumerationRangesApi#createInvoiceEnumerationRangeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceEnumerationRangeCreateDto** | [**InvoiceEnumerationRangeCreateDto**](InvoiceEnumerationRangeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteInvoiceEnumerationRangeAsync"></a>
# **deleteInvoiceEnumerationRangeAsync**
> EmptyEnvelope deleteInvoiceEnumerationRangeAsync(rangeId, tenantId, apiVersion, xApiVersion)

Delete an invoice enumeration range

Deletes an invoice enumeration range by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoiceEnumerationRangesApi()
val rangeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteInvoiceEnumerationRangeAsync(rangeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceEnumerationRangesApi#deleteInvoiceEnumerationRangeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceEnumerationRangesApi#deleteInvoiceEnumerationRangeAsync")
    e.printStackTrace()
}
```

### Parameters
| **rangeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceEnumerationRangeDetailsAsync"></a>
# **getInvoiceEnumerationRangeDetailsAsync**
> InvoiceEnumerationRangeDtoEnvelope getInvoiceEnumerationRangeDetailsAsync(rangeId, tenantId, apiVersion, xApiVersion)

Get invoice enumeration range by ID

Retrieves the details of a specific invoice enumeration range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoiceEnumerationRangesApi()
val rangeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InvoiceEnumerationRangeDtoEnvelope = apiInstance.getInvoiceEnumerationRangeDetailsAsync(rangeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceEnumerationRangesApi#getInvoiceEnumerationRangeDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceEnumerationRangesApi#getInvoiceEnumerationRangeDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **rangeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**InvoiceEnumerationRangeDtoEnvelope**](InvoiceEnumerationRangeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceEnumerationRangesAsync"></a>
# **getInvoiceEnumerationRangesAsync**
> InvoiceEnumerationRangeDtoListEnvelope getInvoiceEnumerationRangesAsync(tenantId, apiVersion, xApiVersion)

Get all invoice enumeration ranges

Retrieves all invoice enumeration ranges for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoiceEnumerationRangesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InvoiceEnumerationRangeDtoListEnvelope = apiInstance.getInvoiceEnumerationRangesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceEnumerationRangesApi#getInvoiceEnumerationRangesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceEnumerationRangesApi#getInvoiceEnumerationRangesAsync")
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

[**InvoiceEnumerationRangeDtoListEnvelope**](InvoiceEnumerationRangeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateInvoiceEnumerationRangeAsync"></a>
# **updateInvoiceEnumerationRangeAsync**
> EmptyEnvelope updateInvoiceEnumerationRangeAsync(rangeId, tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeUpdateDto)

Update an invoice enumeration range

Updates an existing invoice enumeration range with the provided data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoiceEnumerationRangesApi()
val rangeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val invoiceEnumerationRangeUpdateDto : InvoiceEnumerationRangeUpdateDto =  // InvoiceEnumerationRangeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateInvoiceEnumerationRangeAsync(rangeId, tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoiceEnumerationRangesApi#updateInvoiceEnumerationRangeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoiceEnumerationRangesApi#updateInvoiceEnumerationRangeAsync")
    e.printStackTrace()
}
```

### Parameters
| **rangeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceEnumerationRangeUpdateDto** | [**InvoiceEnumerationRangeUpdateDto**](InvoiceEnumerationRangeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

