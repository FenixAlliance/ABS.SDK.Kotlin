# ExchangeApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ForexServiceExchangeHistoryGet**](ExchangeApi.md#apiV2ForexServiceExchangeHistoryGet) | **GET** /api/v2/ForexService/Exchange/History |  |
| [**apiV2ForexServiceExchangeLatestGet**](ExchangeApi.md#apiV2ForexServiceExchangeLatestGet) | **GET** /api/v2/ForexService/Exchange/Latest |  |


<a id="apiV2ForexServiceExchangeHistoryGet"></a>
# **apiV2ForexServiceExchangeHistoryGet**
> MoneyEnvelope apiV2ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date)



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
    val result : MoneyEnvelope = apiInstance.apiV2ForexServiceExchangeHistoryGet(amount, sourceCurrencyId, targetCurrencyId, date)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExchangeApi#apiV2ForexServiceExchangeHistoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExchangeApi#apiV2ForexServiceExchangeHistoryGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ForexServiceExchangeLatestGet"></a>
# **apiV2ForexServiceExchangeLatestGet**
> MoneyEnvelope apiV2ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId)



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
    val result : MoneyEnvelope = apiInstance.apiV2ForexServiceExchangeLatestGet(amount, sourceCurrencyId, targetCurrencyId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExchangeApi#apiV2ForexServiceExchangeLatestGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExchangeApi#apiV2ForexServiceExchangeLatestGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

