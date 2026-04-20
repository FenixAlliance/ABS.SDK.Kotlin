# CurrenciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countCurrenciesAsync**](CurrenciesApi.md#countCurrenciesAsync) | **GET** /api/v2/GlobeService/Currencies/Count | Count currencies |
| [**getCurrencyByIdAsync**](CurrenciesApi.md#getCurrencyByIdAsync) | **GET** /api/v2/GlobeService/Currencies/{currencyId} | Get currency by ID |
| [**getEnabledCurrenciesAsync**](CurrenciesApi.md#getEnabledCurrenciesAsync) | **GET** /api/v2/GlobeService/Currencies | Get all currencies |


<a id="countCurrenciesAsync"></a>
# **countCurrenciesAsync**
> Int32Envelope countCurrenciesAsync(apiVersion, xApiVersion)

Count currencies

Returns the total number of enabled currencies, with optional OData filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurrenciesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrenciesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurrenciesApi#countCurrenciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurrenciesApi#countCurrenciesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurrencyByIdAsync"></a>
# **getCurrencyByIdAsync**
> CurrencyDtoEnvelope getCurrencyByIdAsync(currencyId, apiVersion, xApiVersion)

Get currency by ID

Retrieves a single currency by its unique identifier.

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
    val result : CurrencyDtoEnvelope = apiInstance.getCurrencyByIdAsync(currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurrenciesApi#getCurrencyByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurrenciesApi#getCurrencyByIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnabledCurrenciesAsync"></a>
# **getEnabledCurrenciesAsync**
> CurrencyDtoListEnvelope getEnabledCurrenciesAsync(apiVersion, xApiVersion)

Get all currencies

Retrieves the list of all enabled currencies with optional OData pagination and filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CurrenciesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CurrencyDtoListEnvelope = apiInstance.getEnabledCurrenciesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CurrenciesApi#getEnabledCurrenciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CurrenciesApi#getEnabledCurrenciesAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

