# ExchangeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**exchangeAmountAsync**](ExchangeApi.md#exchangeAmountAsync) | **GET** /api/v2/ForexService/Exchange/Latest | Exchange currency at latest rates |
| [**exchangeAmountHistoricalAsync**](ExchangeApi.md#exchangeAmountHistoricalAsync) | **GET** /api/v2/ForexService/Exchange/History | Exchange currency at historical rates |


<a id="exchangeAmountAsync"></a>
# **exchangeAmountAsync**
> MoneyEnvelope exchangeAmountAsync(amount, sourceCurrencyId, targetCurrencyId)

Exchange currency at latest rates

Exchange an amount of money from one currency to another using the latest available exchange rates.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExchangeApi()
val amount : kotlin.Double = 1.2 // kotlin.Double | 
val sourceCurrencyId : kotlin.String = sourceCurrencyId_example // kotlin.String | 
val targetCurrencyId : kotlin.String = targetCurrencyId_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.exchangeAmountAsync(amount, sourceCurrencyId, targetCurrencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExchangeApi#exchangeAmountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExchangeApi#exchangeAmountAsync")
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

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="exchangeAmountHistoricalAsync"></a>
# **exchangeAmountHistoricalAsync**
> MoneyEnvelope exchangeAmountHistoricalAsync(amount, sourceCurrencyId, targetCurrencyId, date)

Exchange currency at historical rates

Exchange an amount of money from one currency to another using exchange rates from a specific historical date.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExchangeApi()
val amount : kotlin.Double = 1.2 // kotlin.Double | 
val sourceCurrencyId : kotlin.String = sourceCurrencyId_example // kotlin.String | 
val targetCurrencyId : kotlin.String = targetCurrencyId_example // kotlin.String | 
val date : java.time.LocalDate = 2013-10-20 // java.time.LocalDate | 
try {
    val result : MoneyEnvelope = apiInstance.exchangeAmountHistoricalAsync(amount, sourceCurrencyId, targetCurrencyId, date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExchangeApi#exchangeAmountHistoricalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExchangeApi#exchangeAmountHistoricalAsync")
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

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

