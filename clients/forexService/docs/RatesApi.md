# RatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getHistoricalCurrencyRateAsync**](RatesApi.md#getHistoricalCurrencyRateAsync) | **GET** /api/v2/ForexService/Rates/History/{currencyId} | Get historical rate for a currency |
| [**getHistoricalCurrencyRatesAsync**](RatesApi.md#getHistoricalCurrencyRatesAsync) | **GET** /api/v2/ForexService/Rates/History | Get historical currency rates |
| [**getLatestCurrencyRateAsync**](RatesApi.md#getLatestCurrencyRateAsync) | **GET** /api/v2/ForexService/Rates/Latest/{currencyId} | Get latest rate for a currency |
| [**getLatestCurrencyRatesModelAsync**](RatesApi.md#getLatestCurrencyRatesModelAsync) | **GET** /api/v2/ForexService/Rates/Latest | Get latest currency rates |


<a id="getHistoricalCurrencyRateAsync"></a>
# **getHistoricalCurrencyRateAsync**
> ExchangeRateEnvelope getHistoricalCurrencyRateAsync(currencyId, date, apiVersion, xApiVersion)

Get historical rate for a currency

Retrieves the exchange rate for a specific currency as of a specific historical date.

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
    val result : ExchangeRateEnvelope = apiInstance.getHistoricalCurrencyRateAsync(currencyId, date, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RatesApi#getHistoricalCurrencyRateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RatesApi#getHistoricalCurrencyRateAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getHistoricalCurrencyRatesAsync"></a>
# **getHistoricalCurrencyRatesAsync**
> ForexRatesDtoEnvelope getHistoricalCurrencyRatesAsync(date, apiVersion, xApiVersion)

Get historical currency rates

Retrieves exchange rates for all supported currencies as of a specific historical date.

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
    val result : ForexRatesDtoEnvelope = apiInstance.getHistoricalCurrencyRatesAsync(date, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RatesApi#getHistoricalCurrencyRatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RatesApi#getHistoricalCurrencyRatesAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLatestCurrencyRateAsync"></a>
# **getLatestCurrencyRateAsync**
> ExchangeRateEnvelope getLatestCurrencyRateAsync(currencyId, apiVersion, xApiVersion)

Get latest rate for a currency

Retrieves the latest exchange rate for a specific currency by its identifier.

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
    val result : ExchangeRateEnvelope = apiInstance.getLatestCurrencyRateAsync(currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RatesApi#getLatestCurrencyRateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RatesApi#getLatestCurrencyRateAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLatestCurrencyRatesModelAsync"></a>
# **getLatestCurrencyRatesModelAsync**
> ForexRatesDtoEnvelope getLatestCurrencyRatesModelAsync(apiVersion, xApiVersion)

Get latest currency rates

Retrieves the latest exchange rates for all supported currencies.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RatesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ForexRatesDtoEnvelope = apiInstance.getLatestCurrencyRatesModelAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RatesApi#getLatestCurrencyRatesModelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RatesApi#getLatestCurrencyRatesModelAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

