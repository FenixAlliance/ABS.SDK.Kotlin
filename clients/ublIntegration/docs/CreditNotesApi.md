# CreditNotesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2UblServiceCreditNotesInvoiceIdGet**](CreditNotesApi.md#apiV2UblServiceCreditNotesInvoiceIdGet) | **GET** /api/v2/UblService/CreditNotes/{invoiceId} |  |


<a id="apiV2UblServiceCreditNotesInvoiceIdGet"></a>
# **apiV2UblServiceCreditNotesInvoiceIdGet**
> apiV2UblServiceCreditNotesInvoiceIdGet(invoiceId, tenantId, profile, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CreditNotesApi()
val invoiceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val profile : kotlin.String = profile_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2UblServiceCreditNotesInvoiceIdGet(invoiceId, tenantId, profile, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CreditNotesApi#apiV2UblServiceCreditNotesInvoiceIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CreditNotesApi#apiV2UblServiceCreditNotesInvoiceIdGet")
    e.printStackTrace()
}
```

### Parameters
| **invoiceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **profile** | **kotlin.String**|  | [optional] [default to Generic] [enum: Generic, Dian] |
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

