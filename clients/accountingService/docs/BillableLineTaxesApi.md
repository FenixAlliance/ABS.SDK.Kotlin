# BillableLineTaxesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBillableLineTax**](BillableLineTaxesApi.md#createBillableLineTax) | **POST** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes | Create a new tax for a billable line. |
| [**deleteBillableLineTax**](BillableLineTaxesApi.md#deleteBillableLineTax) | **DELETE** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes/{taxId} | Delete a tax from a billable line. |
| [**getBillableLineTaxes**](BillableLineTaxesApi.md#getBillableLineTaxes) | **GET** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes | Get taxes for a billable line. |
| [**getBillableLineTaxesCount**](BillableLineTaxesApi.md#getBillableLineTaxesCount) | **GET** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes/Count | Get the count of taxes for a billable line. |
| [**patchBillableLineTaxAsync**](BillableLineTaxesApi.md#patchBillableLineTaxAsync) | **PATCH** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes/{taxId} | Patch a billable line tax |
| [**updateBillableLineTax**](BillableLineTaxesApi.md#updateBillableLineTax) | **PUT** /api/v2/AccountingService/BillableLines/{billableLineId}/Taxes/{taxId} | Update a tax for a billable line. |


<a id="createBillableLineTax"></a>
# **createBillableLineTax**
> EmptyEnvelope createBillableLineTax(billableLineId, tenantId, apiVersion, xApiVersion, appliedItemTaxRecordCreateDto)

Create a new tax for a billable line.

Creates a new tax entry for the specified billable line.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillableLineTaxesApi()
val billableLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val appliedItemTaxRecordCreateDto : AppliedItemTaxRecordCreateDto =  // AppliedItemTaxRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createBillableLineTax(billableLineId, tenantId, apiVersion, xApiVersion, appliedItemTaxRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillableLineTaxesApi#createBillableLineTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillableLineTaxesApi#createBillableLineTax")
    e.printStackTrace()
}
```

### Parameters
| **billableLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appliedItemTaxRecordCreateDto** | [**AppliedItemTaxRecordCreateDto**](AppliedItemTaxRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteBillableLineTax"></a>
# **deleteBillableLineTax**
> EmptyEnvelope deleteBillableLineTax(billableLineId, taxId, tenantId, apiVersion, xApiVersion)

Delete a tax from a billable line.

Deletes the specified tax entry from the billable line.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillableLineTaxesApi()
val billableLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val taxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBillableLineTax(billableLineId, taxId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillableLineTaxesApi#deleteBillableLineTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillableLineTaxesApi#deleteBillableLineTax")
    e.printStackTrace()
}
```

### Parameters
| **billableLineId** | **java.util.UUID**|  | |
| **taxId** | **java.util.UUID**|  | |
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

<a id="getBillableLineTaxes"></a>
# **getBillableLineTaxes**
> AppliedItemTaxRecordDtoIReadOnlyListEnvelope getBillableLineTaxes(billableLineId, tenantId, apiVersion, xApiVersion)

Get taxes for a billable line.

Retrieves the taxes applied to the specified billable line.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillableLineTaxesApi()
val billableLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AppliedItemTaxRecordDtoIReadOnlyListEnvelope = apiInstance.getBillableLineTaxes(billableLineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillableLineTaxesApi#getBillableLineTaxes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillableLineTaxesApi#getBillableLineTaxes")
    e.printStackTrace()
}
```

### Parameters
| **billableLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AppliedItemTaxRecordDtoIReadOnlyListEnvelope**](AppliedItemTaxRecordDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBillableLineTaxesCount"></a>
# **getBillableLineTaxesCount**
> Int32Envelope getBillableLineTaxesCount(billableLineId, tenantId, apiVersion, xApiVersion)

Get the count of taxes for a billable line.

Retrieves the total count of taxes applied to the specified billable line.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillableLineTaxesApi()
val billableLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBillableLineTaxesCount(billableLineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillableLineTaxesApi#getBillableLineTaxesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillableLineTaxesApi#getBillableLineTaxesCount")
    e.printStackTrace()
}
```

### Parameters
| **billableLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="patchBillableLineTaxAsync"></a>
# **patchBillableLineTaxAsync**
> EmptyEnvelope patchBillableLineTaxAsync(billableLineId, taxId, tenantId, apiVersion, xApiVersion, operation)

Patch a billable line tax

Partially updates a billable line tax.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillableLineTaxesApi()
val billableLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val taxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchBillableLineTaxAsync(billableLineId, taxId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillableLineTaxesApi#patchBillableLineTaxAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillableLineTaxesApi#patchBillableLineTaxAsync")
    e.printStackTrace()
}
```

### Parameters
| **billableLineId** | **java.util.UUID**|  | |
| **taxId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBillableLineTax"></a>
# **updateBillableLineTax**
> EmptyEnvelope updateBillableLineTax(billableLineId, taxId, tenantId, apiVersion, xApiVersion, appliedItemTaxRecordUpdateDto)

Update a tax for a billable line.

Updates the specified tax entry for the billable line.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillableLineTaxesApi()
val billableLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val taxId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val appliedItemTaxRecordUpdateDto : AppliedItemTaxRecordUpdateDto =  // AppliedItemTaxRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateBillableLineTax(billableLineId, taxId, tenantId, apiVersion, xApiVersion, appliedItemTaxRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillableLineTaxesApi#updateBillableLineTax")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillableLineTaxesApi#updateBillableLineTax")
    e.printStackTrace()
}
```

### Parameters
| **billableLineId** | **java.util.UUID**|  | |
| **taxId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appliedItemTaxRecordUpdateDto** | [**AppliedItemTaxRecordUpdateDto**](AppliedItemTaxRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

