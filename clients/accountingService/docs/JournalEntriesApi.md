# JournalEntriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getExpensesSumAsync**](JournalEntriesApi.md#getExpensesSumAsync) | **GET** /api/v2/AccountingService/JournalEntries/Expenses/Sum | Sum tenant expenses |
| [**getIncomesSumAsync**](JournalEntriesApi.md#getIncomesSumAsync) | **GET** /api/v2/AccountingService/JournalEntries/Incomes/Sum | Sum tenant incomes |


<a id="getExpensesSumAsync"></a>
# **getExpensesSumAsync**
> DecimalEnvelope getExpensesSumAsync(tenantId, apiVersion, xApiVersion)

Sum tenant expenses

Returns SUM(JournalEntry.Debit) for Debit-direction journal entries in the tenant, filtered by the supplied OData date range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalEntriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DecimalEnvelope = apiInstance.getExpensesSumAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalEntriesApi#getExpensesSumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalEntriesApi#getExpensesSumAsync")
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

<a id="getIncomesSumAsync"></a>
# **getIncomesSumAsync**
> DecimalEnvelope getIncomesSumAsync(tenantId, apiVersion, xApiVersion)

Sum tenant incomes

Returns SUM(JournalEntry.Credit) for Credit-direction journal entries in the tenant, filtered by the supplied OData date range.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalEntriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DecimalEnvelope = apiInstance.getIncomesSumAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalEntriesApi#getIncomesSumAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalEntriesApi#getIncomesSumAsync")
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

