# InvoicesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aggregateInvoiceDiscounts**](InvoicesApi.md#aggregateInvoiceDiscounts) | **POST** /api/v2/InvoicingService/Invoices/DiscountsAggregate | Aggregate invoice discounts. |
| [**aggregateInvoiceGlobalSurcharges**](InvoicesApi.md#aggregateInvoiceGlobalSurcharges) | **POST** /api/v2/InvoicingService/Invoices/GlobalSurchargesAggregate | Aggregate invoice global surcharges. |
| [**aggregateInvoiceTaxBases**](InvoicesApi.md#aggregateInvoiceTaxBases) | **POST** /api/v2/InvoicingService/Invoices/TaxBasesAggregate | Aggregate invoice tax bases. |
| [**aggregateInvoiceTaxes**](InvoicesApi.md#aggregateInvoiceTaxes) | **POST** /api/v2/InvoicingService/Invoices/TaxesAggregate | Aggregate invoice taxes. |
| [**aggregateInvoiceTotals**](InvoicesApi.md#aggregateInvoiceTotals) | **POST** /api/v2/InvoicingService/Invoices/TotalsAggregate | Aggregate invoice totals. |
| [**calculateInvoice**](InvoicesApi.md#calculateInvoice) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Calculate | Calculate an invoice. |
| [**calculateInvoiceLine**](InvoicesApi.md#calculateInvoiceLine) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Calculate | Calculate an invoice line. |
| [**createInvoice**](InvoicesApi.md#createInvoice) | **POST** /api/v2/InvoicingService/Invoices | Create a new invoice. |
| [**createInvoiceAdjustment**](InvoicesApi.md#createInvoiceAdjustment) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments | Create a new invoice adjustment. |
| [**createInvoiceLine**](InvoicesApi.md#createInvoiceLine) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines | Create a new invoice line. |
| [**createInvoiceLineTax**](InvoicesApi.md#createInvoiceLineTax) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes | Create a new tax for an invoice line. |
| [**createInvoiceReference**](InvoicesApi.md#createInvoiceReference) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/References | Create a new invoice reference. |
| [**deleteInvoice**](InvoicesApi.md#deleteInvoice) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId} | Delete an invoice. |
| [**deleteInvoiceAdjustment**](InvoicesApi.md#deleteInvoiceAdjustment) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} | Delete an invoice adjustment. |
| [**deleteInvoiceLine**](InvoicesApi.md#deleteInvoiceLine) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} | Delete an invoice line. |
| [**deleteInvoiceLineTax**](InvoicesApi.md#deleteInvoiceLineTax) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/{invoiceLineTaxId} | Delete a tax from an invoice line. |
| [**deleteInvoiceReference**](InvoicesApi.md#deleteInvoiceReference) | **DELETE** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} | Delete an invoice reference. |
| [**getExtendedInvoice**](InvoicesApi.md#getExtendedInvoice) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Extended | Get an extended invoice by ID. |
| [**getExtendedInvoices**](InvoicesApi.md#getExtendedInvoices) | **GET** /api/v2/InvoicingService/Invoices/Extended | Get a list of extended invoices. |
| [**getExtendedInvoicesCount**](InvoicesApi.md#getExtendedInvoicesCount) | **GET** /api/v2/InvoicingService/Invoices/Extended/Count | Get the count of extended invoices. |
| [**getInvoice**](InvoicesApi.md#getInvoice) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId} | Get an invoice by ID. |
| [**getInvoiceAdjustment**](InvoicesApi.md#getInvoiceAdjustment) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} | Get an invoice adjustment by ID. |
| [**getInvoiceAdjustments**](InvoicesApi.md#getInvoiceAdjustments) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments | Get invoice adjustments. |
| [**getInvoiceAdjustmentsCount**](InvoicesApi.md#getInvoiceAdjustmentsCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/Count | Get the count of invoice adjustments. |
| [**getInvoiceLine**](InvoicesApi.md#getInvoiceLine) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} | Get an invoice line by ID. |
| [**getInvoiceLineTaxes**](InvoicesApi.md#getInvoiceLineTaxes) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes | Get taxes for an invoice line. |
| [**getInvoiceLineTaxesCount**](InvoicesApi.md#getInvoiceLineTaxesCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/Count | Get the count of taxes for an invoice line. |
| [**getInvoiceLines**](InvoicesApi.md#getInvoiceLines) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines | Get invoice lines. |
| [**getInvoiceLinesCount**](InvoicesApi.md#getInvoiceLinesCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/Count | Get the count of invoice lines. |
| [**getInvoicePayments**](InvoicesApi.md#getInvoicePayments) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Payments | Get payments for an invoice. |
| [**getInvoicePaymentsCount**](InvoicesApi.md#getInvoicePaymentsCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/Payments/Count | Get the count of payments for an invoice. |
| [**getInvoiceReference**](InvoicesApi.md#getInvoiceReference) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} | Get an invoice reference by ID. |
| [**getInvoiceReferences**](InvoicesApi.md#getInvoiceReferences) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References | Get invoice references. |
| [**getInvoiceReferencesCount**](InvoicesApi.md#getInvoiceReferencesCount) | **GET** /api/v2/InvoicingService/Invoices/{invoiceId}/References/Count | Get the count of invoice references. |
| [**getInvoices**](InvoicesApi.md#getInvoices) | **GET** /api/v2/InvoicingService/Invoices | Get a list of invoices. |
| [**getInvoicesCount**](InvoicesApi.md#getInvoicesCount) | **GET** /api/v2/InvoicingService/Invoices/Count | Get the count of invoices. |
| [**previewInvoiceEmail**](InvoicesApi.md#previewInvoiceEmail) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Emails/Preview | Preview the rendered email for an invoice. |
| [**sendInvoiceEmail**](InvoicesApi.md#sendInvoiceEmail) | **POST** /api/v2/InvoicingService/Invoices/{invoiceId}/Emails/Send | Send an invoice transactional email to recipients. |
| [**updateInvoice**](InvoicesApi.md#updateInvoice) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId} | Update an invoice. |
| [**updateInvoiceAdjustment**](InvoicesApi.md#updateInvoiceAdjustment) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Adjustments/{invoiceAdjustmentId} | Update an invoice adjustment. |
| [**updateInvoiceLine**](InvoicesApi.md#updateInvoiceLine) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId} | Update an invoice line. |
| [**updateInvoiceLineTax**](InvoicesApi.md#updateInvoiceLineTax) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/Lines/{invoiceLineId}/Taxes/{invoiceLineTaxId} | Update a tax for an invoice line. |
| [**updateInvoiceReference**](InvoicesApi.md#updateInvoiceReference) | **PUT** /api/v2/InvoicingService/Invoices/{invoiceId}/References/{invoiceReferenceId} | Update an invoice reference. |


<a id="aggregateInvoiceDiscounts"></a>
# **aggregateInvoiceDiscounts**
> MoneyEnvelope aggregateInvoiceDiscounts(javaUtilUUID, currencyId)

Aggregate invoice discounts.

Aggregates the discounts for the specified invoices.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.aggregateInvoiceDiscounts(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#aggregateInvoiceDiscounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#aggregateInvoiceDiscounts")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="aggregateInvoiceGlobalSurcharges"></a>
# **aggregateInvoiceGlobalSurcharges**
> MoneyEnvelope aggregateInvoiceGlobalSurcharges(javaUtilUUID, currencyId)

Aggregate invoice global surcharges.

Aggregates the global surcharges for the specified invoices.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.aggregateInvoiceGlobalSurcharges(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#aggregateInvoiceGlobalSurcharges")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#aggregateInvoiceGlobalSurcharges")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="aggregateInvoiceTaxBases"></a>
# **aggregateInvoiceTaxBases**
> MoneyEnvelope aggregateInvoiceTaxBases(javaUtilUUID, currencyId)

Aggregate invoice tax bases.

Aggregates the tax bases for the specified invoices.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.aggregateInvoiceTaxBases(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#aggregateInvoiceTaxBases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#aggregateInvoiceTaxBases")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="aggregateInvoiceTaxes"></a>
# **aggregateInvoiceTaxes**
> MoneyEnvelope aggregateInvoiceTaxes(javaUtilUUID, currencyId)

Aggregate invoice taxes.

Aggregates the taxes for the specified invoices.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.aggregateInvoiceTaxes(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#aggregateInvoiceTaxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#aggregateInvoiceTaxes")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="aggregateInvoiceTotals"></a>
# **aggregateInvoiceTotals**
> MoneyEnvelope aggregateInvoiceTotals(javaUtilUUID, currencyId)

Aggregate invoice totals.

Aggregates the totals for the specified invoices.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val javaUtilUUID : kotlin.collections.List<java.util.UUID> =  // kotlin.collections.List<java.util.UUID> | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.aggregateInvoiceTotals(javaUtilUUID, currencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#aggregateInvoiceTotals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#aggregateInvoiceTotals")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="calculateInvoice"></a>
# **calculateInvoice**
> EmptyEnvelope calculateInvoice(invoiceId, tenantId)

Calculate an invoice.

Calculates the totals and taxes for the specified invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.calculateInvoice(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#calculateInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#calculateInvoice")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="calculateInvoiceLine"></a>
# **calculateInvoiceLine**
> EmptyEnvelope calculateInvoiceLine(invoiceId, invoiceLineId, tenantId)

Calculate an invoice line.

Calculates the totals and taxes for the specified invoice line.

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
    val result : EmptyEnvelope = apiInstance.calculateInvoiceLine(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#calculateInvoiceLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#calculateInvoiceLine")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createInvoice"></a>
# **createInvoice**
> EmptyEnvelope createInvoice(tenantId, invoiceCreateDto)

Create a new invoice.

Creates a new invoice for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val invoiceCreateDto : InvoiceCreateDto =  // InvoiceCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createInvoice(tenantId, invoiceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#createInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#createInvoice")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createInvoiceAdjustment"></a>
# **createInvoiceAdjustment**
> EmptyEnvelope createInvoiceAdjustment(invoiceId, tenantId, invoiceAdjustmentCreateDto)

Create a new invoice adjustment.

Creates a new adjustment for the specified invoice.

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
    val result : EmptyEnvelope = apiInstance.createInvoiceAdjustment(invoiceId, tenantId, invoiceAdjustmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#createInvoiceAdjustment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#createInvoiceAdjustment")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createInvoiceLine"></a>
# **createInvoiceLine**
> InvoiceLineDtoIReadOnlyListEnvelope createInvoiceLine(invoiceId, tenantId, invoiceLineCreateDto)

Create a new invoice line.

Creates a new invoice line for the specified invoice.

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
    val result : InvoiceLineDtoIReadOnlyListEnvelope = apiInstance.createInvoiceLine(invoiceId, tenantId, invoiceLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#createInvoiceLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#createInvoiceLine")
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

[**InvoiceLineDtoIReadOnlyListEnvelope**](InvoiceLineDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createInvoiceLineTax"></a>
# **createInvoiceLineTax**
> EmptyEnvelope createInvoiceLineTax(invoiceId, invoiceLineId, tenantId, invoiceLineAppliedTaxCreateDto)

Create a new tax for an invoice line.

Creates a new tax entry for the specified invoice line.

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
    val result : EmptyEnvelope = apiInstance.createInvoiceLineTax(invoiceId, invoiceLineId, tenantId, invoiceLineAppliedTaxCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#createInvoiceLineTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#createInvoiceLineTax")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createInvoiceReference"></a>
# **createInvoiceReference**
> EmptyEnvelope createInvoiceReference(invoiceId, tenantId, invoiceReferenceCreateDto)

Create a new invoice reference.

Creates a new reference for the specified invoice.

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
    val result : EmptyEnvelope = apiInstance.createInvoiceReference(invoiceId, tenantId, invoiceReferenceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#createInvoiceReference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#createInvoiceReference")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteInvoice"></a>
# **deleteInvoice**
> EmptyEnvelope deleteInvoice(invoiceId, tenantId)

Delete an invoice.

Deletes the specified invoice for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteInvoice(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#deleteInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#deleteInvoice")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteInvoiceAdjustment"></a>
# **deleteInvoiceAdjustment**
> EmptyEnvelope deleteInvoiceAdjustment(invoiceId, invoiceAdjustmentId, tenantId)

Delete an invoice adjustment.

Deletes the specified adjustment from the invoice.

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
    val result : EmptyEnvelope = apiInstance.deleteInvoiceAdjustment(invoiceId, invoiceAdjustmentId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#deleteInvoiceAdjustment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#deleteInvoiceAdjustment")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteInvoiceLine"></a>
# **deleteInvoiceLine**
> EmptyEnvelope deleteInvoiceLine(invoiceId, invoiceLineId, tenantId)

Delete an invoice line.

Deletes the specified invoice line.

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
    val result : EmptyEnvelope = apiInstance.deleteInvoiceLine(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#deleteInvoiceLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#deleteInvoiceLine")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteInvoiceLineTax"></a>
# **deleteInvoiceLineTax**
> EmptyEnvelope deleteInvoiceLineTax(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId)

Delete a tax from an invoice line.

Deletes the specified tax entry from the invoice line.

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
    val result : EmptyEnvelope = apiInstance.deleteInvoiceLineTax(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#deleteInvoiceLineTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#deleteInvoiceLineTax")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteInvoiceReference"></a>
# **deleteInvoiceReference**
> EmptyEnvelope deleteInvoiceReference(invoiceId, invoiceReferenceId, tenantId)

Delete an invoice reference.

Deletes the specified reference from the invoice.

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
    val result : EmptyEnvelope = apiInstance.deleteInvoiceReference(invoiceId, invoiceReferenceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#deleteInvoiceReference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#deleteInvoiceReference")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedInvoice"></a>
# **getExtendedInvoice**
> InvoiceDtoEnvelope getExtendedInvoice(invoiceId, tenantId)

Get an extended invoice by ID.

Retrieves the extended invoice details for the specified invoice ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceDtoEnvelope = apiInstance.getExtendedInvoice(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getExtendedInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getExtendedInvoice")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedInvoices"></a>
# **getExtendedInvoices**
> ExtendedInvoiceDtoListEnvelope getExtendedInvoices(tenantId)

Get a list of extended invoices.

Retrieves a list of extended invoice details for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedInvoiceDtoListEnvelope = apiInstance.getExtendedInvoices(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getExtendedInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getExtendedInvoices")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedInvoicesCount"></a>
# **getExtendedInvoicesCount**
> Int32Envelope getExtendedInvoicesCount(tenantId)

Get the count of extended invoices.

Retrieves the total count of extended invoices for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getExtendedInvoicesCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getExtendedInvoicesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getExtendedInvoicesCount")
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

<a id="getInvoice"></a>
# **getInvoice**
> InvoiceDtoEnvelope getInvoice(invoiceId, tenantId)

Get an invoice by ID.

Retrieves the invoice details for the specified invoice ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceDtoEnvelope = apiInstance.getInvoice(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoice")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceAdjustment"></a>
# **getInvoiceAdjustment**
> InvoiceAdjustmentDtoEnvelope getInvoiceAdjustment(invoiceId, invoiceAdjustmentId, tenantId)

Get an invoice adjustment by ID.

Retrieves the adjustment details for the specified invoice adjustment ID.

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
    val result : InvoiceAdjustmentDtoEnvelope = apiInstance.getInvoiceAdjustment(invoiceId, invoiceAdjustmentId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceAdjustment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceAdjustment")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceAdjustments"></a>
# **getInvoiceAdjustments**
> InvoiceAdjustmentDtoIReadOnlyListEnvelope getInvoiceAdjustments(invoiceId, tenantId)

Get invoice adjustments.

Retrieves the adjustments for the specified invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceAdjustmentDtoIReadOnlyListEnvelope = apiInstance.getInvoiceAdjustments(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceAdjustments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceAdjustments")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceAdjustmentDtoIReadOnlyListEnvelope**](InvoiceAdjustmentDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceAdjustmentsCount"></a>
# **getInvoiceAdjustmentsCount**
> Int32Envelope getInvoiceAdjustmentsCount(invoiceId, tenantId)

Get the count of invoice adjustments.

Retrieves the total count of adjustments for the specified invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getInvoiceAdjustmentsCount(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceAdjustmentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceAdjustmentsCount")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceLine"></a>
# **getInvoiceLine**
> InvoiceLineDtoEnvelope getInvoiceLine(invoiceId, invoiceLineId, tenantId)

Get an invoice line by ID.

Retrieves the invoice line details for the specified invoice line ID.

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
    val result : InvoiceLineDtoEnvelope = apiInstance.getInvoiceLine(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceLine")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceLineTaxes"></a>
# **getInvoiceLineTaxes**
> InvoiceLineAppliedTaxDtoIReadOnlyListEnvelope getInvoiceLineTaxes(invoiceId, invoiceLineId, tenantId)

Get taxes for an invoice line.

Retrieves the taxes applied to the specified invoice line.

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
    val result : InvoiceLineAppliedTaxDtoIReadOnlyListEnvelope = apiInstance.getInvoiceLineTaxes(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceLineTaxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceLineTaxes")
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

[**InvoiceLineAppliedTaxDtoIReadOnlyListEnvelope**](InvoiceLineAppliedTaxDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceLineTaxesCount"></a>
# **getInvoiceLineTaxesCount**
> Int32Envelope getInvoiceLineTaxesCount(invoiceId, invoiceLineId, tenantId)

Get the count of taxes for an invoice line.

Retrieves the total count of taxes applied to the specified invoice line.

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
    val result : Int32Envelope = apiInstance.getInvoiceLineTaxesCount(invoiceId, invoiceLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceLineTaxesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceLineTaxesCount")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceLines"></a>
# **getInvoiceLines**
> InvoiceLineDtoListEnvelope getInvoiceLines(invoiceId, tenantId, itemId)

Get invoice lines.

Retrieves the invoice lines for the specified invoice.

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
    val result : InvoiceLineDtoListEnvelope = apiInstance.getInvoiceLines(invoiceId, tenantId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceLines")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceLinesCount"></a>
# **getInvoiceLinesCount**
> Int32Envelope getInvoiceLinesCount(invoiceId, tenantId)

Get the count of invoice lines.

Retrieves the total count of invoice lines for the specified invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getInvoiceLinesCount(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceLinesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceLinesCount")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoicePayments"></a>
# **getInvoicePayments**
> PaymentDtoIReadOnlyListEnvelope getInvoicePayments(invoiceId)

Get payments for an invoice.

Retrieves the list of payments related to the specified invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaymentDtoIReadOnlyListEnvelope = apiInstance.getInvoicePayments(invoiceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoicePayments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoicePayments")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **invoiceId** | **java.util.UUID**|  | |

### Return type

[**PaymentDtoIReadOnlyListEnvelope**](PaymentDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoicePaymentsCount"></a>
# **getInvoicePaymentsCount**
> Int32Envelope getInvoicePaymentsCount(invoiceId)

Get the count of payments for an invoice.

Retrieves the total count of payments for the specified invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getInvoicePaymentsCount(invoiceId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoicePaymentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoicePaymentsCount")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceReference"></a>
# **getInvoiceReference**
> InvoiceReferenceDtoEnvelope getInvoiceReference(invoiceId, invoiceReferenceId, tenantId)

Get an invoice reference by ID.

Retrieves the reference details for the specified invoice reference ID.

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
    val result : InvoiceReferenceDtoEnvelope = apiInstance.getInvoiceReference(invoiceId, invoiceReferenceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceReference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceReference")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceReferences"></a>
# **getInvoiceReferences**
> InvoiceReferenceDtoIReadOnlyListEnvelope getInvoiceReferences(invoiceId, tenantId)

Get invoice references.

Retrieves the references for the specified invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceReferenceDtoIReadOnlyListEnvelope = apiInstance.getInvoiceReferences(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceReferences")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceReferences")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**InvoiceReferenceDtoIReadOnlyListEnvelope**](InvoiceReferenceDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoiceReferencesCount"></a>
# **getInvoiceReferencesCount**
> Int32Envelope getInvoiceReferencesCount(invoiceId, tenantId)

Get the count of invoice references.

Retrieves the total count of references for the specified invoice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getInvoiceReferencesCount(invoiceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoiceReferencesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoiceReferencesCount")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoices"></a>
# **getInvoices**
> InvoiceDtoListEnvelope getInvoices(tenantId)

Get a list of invoices.

Retrieves a list of invoices for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : InvoiceDtoListEnvelope = apiInstance.getInvoices(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoices")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInvoicesCount"></a>
# **getInvoicesCount**
> Int32Envelope getInvoicesCount(tenantId)

Get the count of invoices.

Retrieves the total count of invoices for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getInvoicesCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#getInvoicesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#getInvoicesCount")
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

<a id="previewInvoiceEmail"></a>
# **previewInvoiceEmail**
> previewInvoiceEmail(invoiceId, tenantId, emailDispatchRequest)

Preview the rendered email for an invoice.

This action is only available for users with the &#39;send_email&#39; permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    apiInstance.previewInvoiceEmail(invoiceId, tenantId, emailDispatchRequest)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#previewInvoiceEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#previewInvoiceEmail")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sendInvoiceEmail"></a>
# **sendInvoiceEmail**
> Envelope sendInvoiceEmail(invoiceId, tenantId, emailDispatchRequest)

Send an invoice transactional email to recipients.

This action is only available for users with the &#39;send_email&#39; permission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InvoicesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    val result : Envelope = apiInstance.sendInvoiceEmail(invoiceId, tenantId, emailDispatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#sendInvoiceEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#sendInvoiceEmail")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateInvoice"></a>
# **updateInvoice**
> EmptyEnvelope updateInvoice(invoiceId, tenantId, invoiceUpdateDto)

Update an invoice.

Updates the specified invoice for the tenant.

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
    val result : EmptyEnvelope = apiInstance.updateInvoice(invoiceId, tenantId, invoiceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#updateInvoice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#updateInvoice")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateInvoiceAdjustment"></a>
# **updateInvoiceAdjustment**
> EmptyEnvelope updateInvoiceAdjustment(invoiceId, invoiceAdjustmentId, tenantId, invoiceAdjustmentUpdateDto)

Update an invoice adjustment.

Updates the specified adjustment for the invoice.

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
    val result : EmptyEnvelope = apiInstance.updateInvoiceAdjustment(invoiceId, invoiceAdjustmentId, tenantId, invoiceAdjustmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#updateInvoiceAdjustment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#updateInvoiceAdjustment")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateInvoiceLine"></a>
# **updateInvoiceLine**
> InvoiceLineDtoEnvelope updateInvoiceLine(invoiceId, invoiceLineId, tenantId, invoiceLineUpdateDto)

Update an invoice line.

Updates the specified invoice line.

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
    val result : InvoiceLineDtoEnvelope = apiInstance.updateInvoiceLine(invoiceId, invoiceLineId, tenantId, invoiceLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#updateInvoiceLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#updateInvoiceLine")
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

[**InvoiceLineDtoEnvelope**](InvoiceLineDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateInvoiceLineTax"></a>
# **updateInvoiceLineTax**
> EmptyEnvelope updateInvoiceLineTax(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId, invoiceLineAppliedTaxUpdateDto)

Update a tax for an invoice line.

Updates the specified tax entry for the invoice line.

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
    val result : EmptyEnvelope = apiInstance.updateInvoiceLineTax(invoiceId, invoiceLineId, invoiceLineTaxId, tenantId, invoiceLineAppliedTaxUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#updateInvoiceLineTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#updateInvoiceLineTax")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateInvoiceReference"></a>
# **updateInvoiceReference**
> EmptyEnvelope updateInvoiceReference(invoiceId, invoiceReferenceId, tenantId, invoiceReferenceUpdateDto)

Update an invoice reference.

Updates the specified reference for the invoice.

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
    val result : EmptyEnvelope = apiInstance.updateInvoiceReference(invoiceId, invoiceReferenceId, tenantId, invoiceReferenceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InvoicesApi#updateInvoiceReference")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InvoicesApi#updateInvoiceReference")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

