# AccountingEntriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCreditsSumAsync**](AccountingEntriesApi.md#getCreditsSumAsync) | **GET** /api/v2/AccountingService/AccountingEntries/Credits/Sum | Sum tenant accounting-entry credits |
| [**getDebitsSumAsync**](AccountingEntriesApi.md#getDebitsSumAsync) | **GET** /api/v2/AccountingService/AccountingEntries/Debits/Sum | Sum tenant accounting-entry debits |


<a id="getCreditsSumAsync"></a>
# **getCreditsSumAsync**
> DecimalEnvelope getCreditsSumAsync(tenantId, apiVersion, xApiVersion)

Sum tenant accounting-entry credits

Returns SUM(AccountingEntry.Credit) for the tenant, filtered by the supplied OData date range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountingEntriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DecimalEnvelope = apiInstance.getCreditsSumAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountingEntriesApi#getCreditsSumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountingEntriesApi#getCreditsSumAsync")
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

[**DecimalEnvelope**](DecimalEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDebitsSumAsync"></a>
# **getDebitsSumAsync**
> DecimalEnvelope getDebitsSumAsync(tenantId, apiVersion, xApiVersion)

Sum tenant accounting-entry debits

Returns SUM(AccountingEntry.Debit) for the tenant, filtered by the supplied OData date range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountingEntriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DecimalEnvelope = apiInstance.getDebitsSumAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountingEntriesApi#getDebitsSumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountingEntriesApi#getDebitsSumAsync")
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

[**DecimalEnvelope**](DecimalEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

