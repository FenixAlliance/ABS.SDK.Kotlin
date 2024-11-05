# RatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ForexServiceRatesHistoryCurrencyIdGet**](RatesApi.md#apiV2ForexServiceRatesHistoryCurrencyIdGet) | **GET** /api/v2/ForexService/Rates/History/{currencyId} |  |
| [**apiV2ForexServiceRatesHistoryGet**](RatesApi.md#apiV2ForexServiceRatesHistoryGet) | **GET** /api/v2/ForexService/Rates/History |  |
| [**apiV2ForexServiceRatesLatestCurrencyIdGet**](RatesApi.md#apiV2ForexServiceRatesLatestCurrencyIdGet) | **GET** /api/v2/ForexService/Rates/Latest/{currencyId} |  |
| [**apiV2ForexServiceRatesLatestGet**](RatesApi.md#apiV2ForexServiceRatesLatestGet) | **GET** /api/v2/ForexService/Rates/Latest |  |


<a id="apiV2ForexServiceRatesHistoryCurrencyIdGet"></a>
# **apiV2ForexServiceRatesHistoryCurrencyIdGet**
> ExchangeRateEnvelope apiV2ForexServiceRatesHistoryCurrencyIdGet(currencyId, date, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RatesApi()
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val date : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExchangeRateEnvelope = apiInstance.apiV2ForexServiceRatesHistoryCurrencyIdGet(currencyId, date, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RatesApi#apiV2ForexServiceRatesHistoryCurrencyIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RatesApi#apiV2ForexServiceRatesHistoryCurrencyIdGet")
    e.printStackTrace()
}
```

### Parameters
| **currencyId** | **kotlin.String**|  | |
| **date** | **java.time.OffsetDateTime**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExchangeRateEnvelope**](ExchangeRateEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ForexServiceRatesHistoryGet"></a>
# **apiV2ForexServiceRatesHistoryGet**
> ForexRatesDtoEnvelope apiV2ForexServiceRatesHistoryGet(date, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RatesApi()
val date : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ForexRatesDtoEnvelope = apiInstance.apiV2ForexServiceRatesHistoryGet(date, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RatesApi#apiV2ForexServiceRatesHistoryGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RatesApi#apiV2ForexServiceRatesHistoryGet")
    e.printStackTrace()
}
```

### Parameters
| **date** | **java.time.OffsetDateTime**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ForexRatesDtoEnvelope**](ForexRatesDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ForexServiceRatesLatestCurrencyIdGet"></a>
# **apiV2ForexServiceRatesLatestCurrencyIdGet**
> ExchangeRateEnvelope apiV2ForexServiceRatesLatestCurrencyIdGet(currencyId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RatesApi()
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExchangeRateEnvelope = apiInstance.apiV2ForexServiceRatesLatestCurrencyIdGet(currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RatesApi#apiV2ForexServiceRatesLatestCurrencyIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RatesApi#apiV2ForexServiceRatesLatestCurrencyIdGet")
    e.printStackTrace()
}
```

### Parameters
| **currencyId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExchangeRateEnvelope**](ExchangeRateEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ForexServiceRatesLatestGet"></a>
# **apiV2ForexServiceRatesLatestGet**
> ForexRatesDtoEnvelope apiV2ForexServiceRatesLatestGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RatesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ForexRatesDtoEnvelope = apiInstance.apiV2ForexServiceRatesLatestGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RatesApi#apiV2ForexServiceRatesLatestGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RatesApi#apiV2ForexServiceRatesLatestGet")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ForexRatesDtoEnvelope**](ForexRatesDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

