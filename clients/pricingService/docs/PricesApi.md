# PricesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2PricingServicePricesItemIdFinalPriceGet**](PricesApi.md#apiV2PricingServicePricesItemIdFinalPriceGet) | **GET** /api/v2/PricingService/Prices/{itemId}/FinalPrice |  |
| [**apiV2PricingServicePricesItemIdPriceGet**](PricesApi.md#apiV2PricingServicePricesItemIdPriceGet) | **GET** /api/v2/PricingService/Prices/{itemId}/Price |  |
| [**apiV2PricingServicePricesItemIdTotalSavingsGet**](PricesApi.md#apiV2PricingServicePricesItemIdTotalSavingsGet) | **GET** /api/v2/PricingService/Prices/{itemId}/TotalSavings |  |
| [**apiV2PricingServicePricesItemIdTotalTaxesGet**](PricesApi.md#apiV2PricingServicePricesItemIdTotalTaxesGet) | **GET** /api/v2/PricingService/Prices/{itemId}/TotalTaxes |  |


<a id="apiV2PricingServicePricesItemIdFinalPriceGet"></a>
# **apiV2PricingServicePricesItemIdFinalPriceGet**
> MoneyEnvelope apiV2PricingServicePricesItemIdFinalPriceGet(itemId, currencyId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.apiV2PricingServicePricesItemIdFinalPriceGet(itemId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#apiV2PricingServicePricesItemIdFinalPriceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#apiV2PricingServicePricesItemIdFinalPriceGet")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **currencyId** | **kotlin.String**|  | [optional] [default to &quot;USD.USA&quot;] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServicePricesItemIdPriceGet"></a>
# **apiV2PricingServicePricesItemIdPriceGet**
> PriceCalculationDtoEnvelope apiV2PricingServicePricesItemIdPriceGet(itemId, priceListId, discountsListId, currencyId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountsListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PriceCalculationDtoEnvelope = apiInstance.apiV2PricingServicePricesItemIdPriceGet(itemId, priceListId, discountsListId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#apiV2PricingServicePricesItemIdPriceGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#apiV2PricingServicePricesItemIdPriceGet")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **priceListId** | **java.util.UUID**|  | [optional] |
| **discountsListId** | **java.util.UUID**|  | [optional] |
| **currencyId** | **kotlin.String**|  | [optional] [default to &quot;USD.USA&quot;] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PriceCalculationDtoEnvelope**](PriceCalculationDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServicePricesItemIdTotalSavingsGet"></a>
# **apiV2PricingServicePricesItemIdTotalSavingsGet**
> MoneyEnvelope apiV2PricingServicePricesItemIdTotalSavingsGet(itemId, currencyId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.apiV2PricingServicePricesItemIdTotalSavingsGet(itemId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#apiV2PricingServicePricesItemIdTotalSavingsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#apiV2PricingServicePricesItemIdTotalSavingsGet")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **currencyId** | **kotlin.String**|  | [optional] [default to &quot;USD.USA&quot;] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServicePricesItemIdTotalTaxesGet"></a>
# **apiV2PricingServicePricesItemIdTotalTaxesGet**
> MoneyEnvelope apiV2PricingServicePricesItemIdTotalTaxesGet(itemId, currencyId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.apiV2PricingServicePricesItemIdTotalTaxesGet(itemId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#apiV2PricingServicePricesItemIdTotalTaxesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#apiV2PricingServicePricesItemIdTotalTaxesGet")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **currencyId** | **kotlin.String**|  | [optional] [default to &quot;USD.USA&quot;] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

