# ReportsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getTrialBalanceAsync**](ReportsApi.md#getTrialBalanceAsync) | **GET** /api/v2/AccountingService/Reports/TrialBalance | Trial balance for a fiscal period |


<a id="getTrialBalanceAsync"></a>
# **getTrialBalanceAsync**
> TrialBalanceDtoEnvelope getTrialBalanceAsync(tenantId, fiscalPeriodId, financialBookId, currencyId, apiVersion, xApiVersion)

Trial balance for a fiscal period

Returns the per-account posted debit/credit totals for the given fiscal period (optionally scoped to a single financial book), plus grand totals and the Σdebits &#x3D;&#x3D; Σcredits balanced flag. Amounts are normalized to the target currency (default USD) from the stored USD reporting amounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReportsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val financialBookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrialBalanceDtoEnvelope = apiInstance.getTrialBalanceAsync(tenantId, fiscalPeriodId, financialBookId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getTrialBalanceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getTrialBalanceAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **fiscalPeriodId** | **java.util.UUID**|  | |
| **financialBookId** | **java.util.UUID**|  | [optional] |
| **currencyId** | **kotlin.String**|  | [optional] [default to &quot;USD.USA&quot;] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TrialBalanceDtoEnvelope**](TrialBalanceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

