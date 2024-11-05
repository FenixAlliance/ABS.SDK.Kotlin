# ExchangeVApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV3ForexServiceExchangeHistoryGet**](ExchangeVApi.md#apiV3ForexServiceExchangeHistoryGet) | **GET** /api/v3/ForexService/Exchange/History |  |
| [**apiV3ForexServiceExchangeLatestGet**](ExchangeVApi.md#apiV3ForexServiceExchangeLatestGet) | **GET** /api/v3/ForexService/Exchange/Latest |  |


<a id="apiV3ForexServiceExchangeHistoryGet"></a>
# **apiV3ForexServiceExchangeHistoryGet**
> ExchangeRateEnvelope apiV3ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date)



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
    val result : ExchangeRateEnvelope = apiInstance.apiV3ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExchangeVApi#apiV3ForexServiceExchangeHistoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExchangeVApi#apiV3ForexServiceExchangeHistoryGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV3ForexServiceExchangeLatestGet"></a>
# **apiV3ForexServiceExchangeLatestGet**
> ExchangeRateEnvelope apiV3ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId)



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
    val result : ExchangeRateEnvelope = apiInstance.apiV3ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExchangeVApi#apiV3ForexServiceExchangeLatestGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExchangeVApi#apiV3ForexServiceExchangeLatestGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

