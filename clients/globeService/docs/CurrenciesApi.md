# CurrenciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2GlobeServiceCurrenciesCurrencyIdGet**](CurrenciesApi.md#apiV2GlobeServiceCurrenciesCurrencyIdGet) | **GET** /api/v2/GlobeService/Currencies/{currencyId} |  |
| [**apiV2GlobeServiceCurrenciesGet**](CurrenciesApi.md#apiV2GlobeServiceCurrenciesGet) | **GET** /api/v2/GlobeService/Currencies |  |


<a id="apiV2GlobeServiceCurrenciesCurrencyIdGet"></a>
# **apiV2GlobeServiceCurrenciesCurrencyIdGet**
> CurrencyDtoEnvelope apiV2GlobeServiceCurrenciesCurrencyIdGet(currencyId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurrenciesApi()
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CurrencyDtoEnvelope = apiInstance.apiV2GlobeServiceCurrenciesCurrencyIdGet(currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurrenciesApi#apiV2GlobeServiceCurrenciesCurrencyIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurrenciesApi#apiV2GlobeServiceCurrenciesCurrencyIdGet")
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

[**CurrencyDtoEnvelope**](CurrencyDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceCurrenciesGet"></a>
# **apiV2GlobeServiceCurrenciesGet**
> CurrencyDtoListEnvelope apiV2GlobeServiceCurrenciesGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurrenciesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CurrencyDtoListEnvelope = apiInstance.apiV2GlobeServiceCurrenciesGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurrenciesApi#apiV2GlobeServiceCurrenciesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurrenciesApi#apiV2GlobeServiceCurrenciesGet")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CurrencyDtoListEnvelope**](CurrencyDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

