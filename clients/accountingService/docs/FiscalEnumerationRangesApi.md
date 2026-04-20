# FiscalEnumerationRangesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createInvoiceEnumerationRange**](FiscalEnumerationRangesApi.md#createInvoiceEnumerationRange) | **POST** /api/v2/AccountingService/Fiscals/Authorities/EnumerationRanges | Create an invoice enumeration range |
| [**deleteInvoiceEnumerationRange**](FiscalEnumerationRangesApi.md#deleteInvoiceEnumerationRange) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/EnumerationRanges/{enumerationRangeId} | Delete an invoice enumeration range |
| [**getInvoiceEnumerationRange**](FiscalEnumerationRangesApi.md#getInvoiceEnumerationRange) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/EnumerationRanges/{enumerationRangeId} | Get invoice enumeration range by ID |
| [**getInvoiceEnumerationRanges**](FiscalEnumerationRangesApi.md#getInvoiceEnumerationRanges) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/EnumerationRanges | Get invoice enumeration ranges for an authority |
| [**getInvoiceEnumerationRangesCount**](FiscalEnumerationRangesApi.md#getInvoiceEnumerationRangesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/EnumerationRanges/Count | Get invoice enumeration ranges count |
| [**updateInvoiceEnumerationRange**](FiscalEnumerationRangesApi.md#updateInvoiceEnumerationRange) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/EnumerationRanges/{enumerationRangeId} | Update an invoice enumeration range |


<a id="createInvoiceEnumerationRange"></a>
# **createInvoiceEnumerationRange**
> EmptyEnvelope createInvoiceEnumerationRange(tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeCreateDto)

Create an invoice enumeration range

Creates a new invoice enumeration range for a fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalEnumerationRangesApi()
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val invoiceEnumerationRangeCreateDto : InvoiceEnumerationRangeCreateDto =  // InvoiceEnumerationRangeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createInvoiceEnumerationRange(tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalEnumerationRangesApi#createInvoiceEnumerationRange")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalEnumerationRangesApi#createInvoiceEnumerationRange")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | [**kotlin.Any**](.md)|  | |
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

<a id="deleteInvoiceEnumerationRange"></a>
# **deleteInvoiceEnumerationRange**
> EmptyEnvelope deleteInvoiceEnumerationRange(enumerationRangeId, tenantId, apiVersion, xApiVersion)

Delete an invoice enumeration range

Deletes an invoice enumeration range identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalEnumerationRangesApi()
val enumerationRangeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteInvoiceEnumerationRange(enumerationRangeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalEnumerationRangesApi#deleteInvoiceEnumerationRange")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalEnumerationRangesApi#deleteInvoiceEnumerationRange")
    e.printStackTrace()
}
```

### Parameters
| **enumerationRangeId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
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

<a id="getInvoiceEnumerationRange"></a>
# **getInvoiceEnumerationRange**
> InvoiceEnumerationRangeDtoEnvelope getInvoiceEnumerationRange(fiscalAuthorityId, enumerationRangeId, tenantId, apiVersion, xApiVersion)

Get invoice enumeration range by ID

Retrieves a specific invoice enumeration range by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalEnumerationRangesApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enumerationRangeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InvoiceEnumerationRangeDtoEnvelope = apiInstance.getInvoiceEnumerationRange(fiscalAuthorityId, enumerationRangeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalEnumerationRangesApi#getInvoiceEnumerationRange")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalEnumerationRangesApi#getInvoiceEnumerationRange")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **enumerationRangeId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
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

<a id="getInvoiceEnumerationRanges"></a>
# **getInvoiceEnumerationRanges**
> InvoiceEnumerationRangeDtoListEnvelope getInvoiceEnumerationRanges(authorityId, fiscalAuthorityId, apiVersion, xApiVersion)

Get invoice enumeration ranges for an authority

Retrieves all invoice enumeration ranges for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalEnumerationRangesApi()
val authorityId : kotlin.String = authorityId_example // kotlin.String | 
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InvoiceEnumerationRangeDtoListEnvelope = apiInstance.getInvoiceEnumerationRanges(authorityId, fiscalAuthorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalEnumerationRangesApi#getInvoiceEnumerationRanges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalEnumerationRangesApi#getInvoiceEnumerationRanges")
    e.printStackTrace()
}
```

### Parameters
| **authorityId** | **kotlin.String**|  | |
| **fiscalAuthorityId** | **java.util.UUID**|  | |
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

<a id="getInvoiceEnumerationRangesCount"></a>
# **getInvoiceEnumerationRangesCount**
> Int32Envelope getInvoiceEnumerationRangesCount(fiscalAuthorityId, apiVersion, xApiVersion)

Get invoice enumeration ranges count

Returns the total count of invoice enumeration ranges for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalEnumerationRangesApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getInvoiceEnumerationRangesCount(fiscalAuthorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalEnumerationRangesApi#getInvoiceEnumerationRangesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalEnumerationRangesApi#getInvoiceEnumerationRangesCount")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
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

<a id="updateInvoiceEnumerationRange"></a>
# **updateInvoiceEnumerationRange**
> EmptyEnvelope updateInvoiceEnumerationRange(enumerationRangeId, tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeUpdateDto)

Update an invoice enumeration range

Updates an existing invoice enumeration range identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalEnumerationRangesApi()
val enumerationRangeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val invoiceEnumerationRangeUpdateDto : InvoiceEnumerationRangeUpdateDto =  // InvoiceEnumerationRangeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateInvoiceEnumerationRange(enumerationRangeId, tenantId, apiVersion, xApiVersion, invoiceEnumerationRangeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalEnumerationRangesApi#updateInvoiceEnumerationRange")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalEnumerationRangesApi#updateInvoiceEnumerationRange")
    e.printStackTrace()
}
```

### Parameters
| **enumerationRangeId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
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

