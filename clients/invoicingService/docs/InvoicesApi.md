# InvoicesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2InvoicingServiceInvoicesCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesCountGet) | **GET** /api/v2/InvoicingService/Invoices/Count |  |
| [**apiV2InvoicingServiceInvoicesDiscountsAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesDiscountsAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/DiscountsAggregate |  |
| [**apiV2InvoicingServiceInvoicesExtendedCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesExtendedCountGet) | **GET** /api/v2/InvoicingService/Invoices/Extended/Count |  |
| [**apiV2InvoicingServiceInvoicesExtendedGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesExtendedGet) | **GET** /api/v2/InvoicingService/Invoices/Extended |  |
| [**apiV2InvoicingServiceInvoicesGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesGet) | **GET** /api/v2/InvoicingService/Invoices |  |
| [**apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/GlobalSurchargesAggregate |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Calculate |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Extended |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Calculate |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/{invoiceLineTaxId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/{invoiceLineTaxId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdLinesPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdLinesPost) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Payments/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Payments |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References/Count |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} |  |
| [**apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/References |  |
| [**apiV2InvoicingServiceInvoicesPost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesPost) | **POST** /api/v2/InvoicingService/Invoices |  |
| [**apiV2InvoicingServiceInvoicesTaxBasesAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesTaxBasesAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/TaxBasesAggregate |  |
| [**apiV2InvoicingServiceInvoicesTaxesAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesTaxesAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/TaxesAggregate |  |
| [**apiV2InvoicingServiceInvoicesTotalsAggregatePost**](InvoicesApi.md#apiV2InvoicingServiceInvoicesTotalsAggregatePost) | **POST** /api/v2/InvoicingService/Invoices/TotalsAggregate |  |
| [**getInvoiceAsync**](InvoicesApi.md#getInvoiceAsync) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId} |  |


<a id="apiV2InvoicingServiceInvoicesCountGet"></a>
# **apiV2InvoicingServiceInvoicesCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesCountGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesCountGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesCountGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesDiscountsAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesDiscountsAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesDiscountsAggregatePost(javaUtilUUID, currencyId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesDiscountsAggregatePost(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesDiscountsAggregatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesDiscountsAggregatePost")
    e.printStackTrace()
}
```

### Parameters
| **javaUtilUUID** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **currencyId** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesExtendedCountGet"></a>
# **apiV2InvoicingServiceInvoicesExtendedCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesExtendedCountGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesExtendedCountGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesExtendedCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesExtendedCountGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesExtendedGet"></a>
# **apiV2InvoicingServiceInvoicesExtendedGet**
> ExtendedInvoiceDtoListEnvelope apiV2InvoicingServiceInvoicesExtendedGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedInvoiceDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesExtendedGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesExtendedGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedInvoiceDtoListEnvelope**](ExtendedInvoiceDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesGet"></a>
# **apiV2InvoicingServiceInvoicesGet**
> InvoiceDtoListEnvelope apiV2InvoicingServiceInvoicesGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceDtoListEnvelope**](InvoiceDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost(javaUtilUUID, currencyId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesGlobalSurchargesAggregatePost")
    e.printStackTrace()
}
```

### Parameters
| **javaUtilUUID** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **currencyId** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsCountGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet**
> InvoiceAdjustmentDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceAdjustmentDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceAdjustmentDtoListEnvelope**](InvoiceAdjustmentDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete(invoiceId, invoiceAdjustmentId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceAdjustmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete(invoiceId, invoiceAdjustmentId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceAdjustmentId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet**
> InvoiceAdjustmentDtoEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet(invoiceId, invoiceAdjustmentId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceAdjustmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceAdjustmentDtoEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet(invoiceId, invoiceAdjustmentId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceAdjustmentId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceAdjustmentDtoEnvelope**](InvoiceAdjustmentDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut(invoiceId, invoiceAdjustmentId, tenantId, invoiceAdjustmentUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceAdjustmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceAdjustmentUpdateDto : InvoiceAdjustmentUpdateDto =  // InvoiceAdjustmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut(invoiceId, invoiceAdjustmentId, tenantId, invoiceAdjustmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsInvoiceAdjustmentIdPut")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceAdjustmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceAdjustmentUpdateDto** | [**InvoiceAdjustmentUpdateDto**](InvoiceAdjustmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost(invoiceId, tenantId, invoiceAdjustmentCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceAdjustmentCreateDto : InvoiceAdjustmentCreateDto =  // InvoiceAdjustmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost(invoiceId, tenantId, invoiceAdjustmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdAdjustmentsPost")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceAdjustmentCreateDto** | [**InvoiceAdjustmentCreateDto**](InvoiceAdjustmentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdCalculatePut")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdDelete(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdDelete(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet**
> InvoiceDtoEnvelope apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceDtoEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdExtendedGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceDtoEnvelope**](InvoiceDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesCountGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesGet**
> InvoiceLineDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesGet(invoiceId, tenantId, itemId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceLineDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesGet(invoiceId, tenantId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **java.util.UUID**|  | [optional] |

### Return type

[**InvoiceLineDtoListEnvelope**](InvoiceLineDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut(invoiceId, invoiceLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdCalculatePut")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete(invoiceId, invoiceLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet**
> InvoiceLineDtoEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet(invoiceId, invoiceLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceLineDtoEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceLineDtoEnvelope**](InvoiceLineDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut(invoiceId, invoiceLineId, tenantId, invoiceLineUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineUpdateDto : InvoiceLineUpdateDto =  // InvoiceLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut(invoiceId, invoiceLineId, tenantId, invoiceLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdPut")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceLineUpdateDto** | [**InvoiceLineUpdateDto**](InvoiceLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet(invoiceId, invoiceLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesCountGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet**
> InvoiceLineAppliedTaxDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet(invoiceId, invoiceLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceLineAppliedTaxDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceLineAppliedTaxDtoListEnvelope**](InvoiceLineAppliedTaxDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineTaxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| **invoiceLineTaxId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId, invoiceLineAppliedTaxUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineTaxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineAppliedTaxUpdateDto : InvoiceLineAppliedTaxUpdateDto =  // InvoiceLineAppliedTaxUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId, invoiceLineAppliedTaxUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesInvoiceLineTaxIdPut")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| **invoiceLineTaxId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceLineAppliedTaxUpdateDto** | [**InvoiceLineAppliedTaxUpdateDto**](InvoiceLineAppliedTaxUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost(invoiceId, invoiceLineId, tenantId, invoiceLineAppliedTaxCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineAppliedTaxCreateDto : InvoiceLineAppliedTaxCreateDto =  // InvoiceLineAppliedTaxCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost(invoiceId, invoiceLineId, tenantId, invoiceLineAppliedTaxCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesInvoiceLineIdTaxesPost")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceLineAppliedTaxCreateDto** | [**InvoiceLineAppliedTaxCreateDto**](InvoiceLineAppliedTaxCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdLinesPost"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdLinesPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdLinesPost(invoiceId, tenantId, invoiceLineCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceLineCreateDto : InvoiceLineCreateDto =  // InvoiceLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdLinesPost(invoiceId, tenantId, invoiceLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdLinesPost")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceLineCreateDto** | [**InvoiceLineCreateDto**](InvoiceLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet(invoiceId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet(invoiceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsCountGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet**
> InvoiceDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet(invoiceId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet(invoiceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPaymentsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceId** | **java.util.UUID**|  | |

### Return type

[**InvoiceDtoListEnvelope**](InvoiceDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdPut(invoiceId, tenantId, invoiceUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceUpdateDto : InvoiceUpdateDto =  // InvoiceUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdPut(invoiceId, tenantId, invoiceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdPut")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceUpdateDto** | [**InvoiceUpdateDto**](InvoiceUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet**
> Int32Envelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesCountGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet**
> InvoiceReferenceDtoListEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceReferenceDtoListEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceReferenceDtoListEnvelope**](InvoiceReferenceDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete(invoiceId, invoiceReferenceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceReferenceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete(invoiceId, invoiceReferenceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceReferenceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet**
> InvoiceReferenceDtoEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet(invoiceId, invoiceReferenceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceReferenceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceReferenceDtoEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet(invoiceId, invoiceReferenceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceReferenceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceReferenceDtoEnvelope**](InvoiceReferenceDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut(invoiceId, invoiceReferenceId, tenantId, invoiceReferenceUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceReferenceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceReferenceUpdateDto : InvoiceReferenceUpdateDto =  // InvoiceReferenceUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut(invoiceId, invoiceReferenceId, tenantId, invoiceReferenceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesInvoiceReferenceIdPut")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **invoiceReferenceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceReferenceUpdateDto** | [**InvoiceReferenceUpdateDto**](InvoiceReferenceUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost"></a>
# **apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost(invoiceId, tenantId, invoiceReferenceCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceReferenceCreateDto : InvoiceReferenceCreateDto =  // InvoiceReferenceCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost(invoiceId, tenantId, invoiceReferenceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesInvoiceIdReferencesPost")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceReferenceCreateDto** | [**InvoiceReferenceCreateDto**](InvoiceReferenceCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesPost"></a>
# **apiV2InvoicingServiceInvoicesPost**
> EmptyEnvelope apiV2InvoicingServiceInvoicesPost(tenantId, invoiceCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceCreateDto : InvoiceCreateDto =  // InvoiceCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesPost(tenantId, invoiceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceCreateDto** | [**InvoiceCreateDto**](InvoiceCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesTaxBasesAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesTaxBasesAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesTaxBasesAggregatePost(javaUtilUUID, currencyId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesTaxBasesAggregatePost(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesTaxBasesAggregatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesTaxBasesAggregatePost")
    e.printStackTrace()
}
```

### Parameters
| **javaUtilUUID** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **currencyId** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesTaxesAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesTaxesAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesTaxesAggregatePost(javaUtilUUID, currencyId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesTaxesAggregatePost(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesTaxesAggregatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesTaxesAggregatePost")
    e.printStackTrace()
}
```

### Parameters
| **javaUtilUUID** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **currencyId** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2InvoicingServiceInvoicesTotalsAggregatePost"></a>
# **apiV2InvoicingServiceInvoicesTotalsAggregatePost**
> MoneyEnvelope apiV2InvoicingServiceInvoicesTotalsAggregatePost(javaUtilUUID, currencyId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.apiV2InvoicingServiceInvoicesTotalsAggregatePost(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesTotalsAggregatePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#apiV2InvoicingServiceInvoicesTotalsAggregatePost")
    e.printStackTrace()
}
```

### Parameters
| **javaUtilUUID** | [**kotlin.collections.List&lt;java.util.UUID&gt;**](java.util.UUID.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **currencyId** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getInvoiceAsync"></a>
# **getInvoiceAsync**
> InvoiceDtoEnvelope getInvoiceAsync(invoiceId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceDtoEnvelope = apiInstance.getInvoiceAsync(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceAsync")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceDtoEnvelope**](InvoiceDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

