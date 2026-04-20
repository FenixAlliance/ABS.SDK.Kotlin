# ExchangeVApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**exchangeAmountHistoricalV3Async**](ExchangeVApi.md#exchangeAmountHistoricalV3Async) | **GET** /api/v3/ForexService/Exchange/History | Exchange currency at historical rates (v3) |
| [**exchangeAmountV3Async**](ExchangeVApi.md#exchangeAmountV3Async) | **GET** /api/v3/ForexService/Exchange/Latest | Exchange currency at latest rates (v3) |


<a id="exchangeAmountHistoricalV3Async"></a>
# **exchangeAmountHistoricalV3Async**
> ExchangeRateEnvelope exchangeAmountHistoricalV3Async(amount, sourceCurrencyId, targetCurrencyId, date)

Exchange currency at historical rates (v3)

Exchange an amount of money from one currency to another using exchange rates from a specific historical date. Returns the full ExchangeRate details.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExchangeVApi()
val amount : kotlin.Double = 1.2 // kotlin.Double | 
val sourceCurrencyId : kotlin.String = sourceCurrencyId_example // kotlin.String | 
val targetCurrencyId : kotlin.String = targetCurrencyId_example // kotlin.String | 
val date : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
try {
    val result : ExchangeRateEnvelope = apiInstance.exchangeAmountHistoricalV3Async(amount, sourceCurrencyId, targetCurrencyId, date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExchangeVApi#exchangeAmountHistoricalV3Async")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExchangeVApi#exchangeAmountHistoricalV3Async")
    e.printStackTrace()
}
```

### Parameters
| **amount** | **kotlin.Double**|  | |
| **sourceCurrencyId** | **kotlin.String**|  | |
| **targetCurrencyId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **date** | **java.time.LocalDate**|  | |

### Return type

[**ExchangeRateEnvelope**](ExchangeRateEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exchangeAmountV3Async"></a>
# **exchangeAmountV3Async**
> ExchangeRateEnvelope exchangeAmountV3Async(amount, sourceCurrencyId, targetCurrencyId)

Exchange currency at latest rates (v3)

Exchange an amount of money from one currency to another using the latest available exchange rates. Returns the full ExchangeRate details.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExchangeVApi()
val amount : kotlin.Double = 1.2 // kotlin.Double | 
val sourceCurrencyId : kotlin.String = sourceCurrencyId_example // kotlin.String | 
val targetCurrencyId : kotlin.String = targetCurrencyId_example // kotlin.String | 
try {
    val result : ExchangeRateEnvelope = apiInstance.exchangeAmountV3Async(amount, sourceCurrencyId, targetCurrencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExchangeVApi#exchangeAmountV3Async")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExchangeVApi#exchangeAmountV3Async")
    e.printStackTrace()
}
```

### Parameters
| **amount** | **kotlin.Double**|  | |
| **sourceCurrencyId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **targetCurrencyId** | **kotlin.String**|  | |

### Return type

[**ExchangeRateEnvelope**](ExchangeRateEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

