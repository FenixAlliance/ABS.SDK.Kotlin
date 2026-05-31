# PricesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getFinalPrice**](PricesApi.md#getFinalPrice) | **GET** /api/v2/PricingService/Prices/{itemId}/FinalPrice | Gets the final price for an item |
| [**getPrice**](PricesApi.md#getPrice) | **GET** /api/v2/PricingService/Prices/{itemId}/Price | Gets the calculated price for an item |
| [**getTotalSavingsInUsd**](PricesApi.md#getTotalSavingsInUsd) | **GET** /api/v2/PricingService/Prices/{itemId}/TotalSavings | Gets total savings for an item |
| [**getTotalTaxesInUsd**](PricesApi.md#getTotalTaxesInUsd) | **GET** /api/v2/PricingService/Prices/{itemId}/TotalTaxes | Gets total taxes for an item |


<a id="getFinalPrice"></a>
# **getFinalPrice**
> MoneyEnvelope getFinalPrice(itemId, currencyId, apiVersion, xApiVersion)

Gets the final price for an item

Gets the final price for an item after all discounts and taxes in the specified currency.

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
    val result : MoneyEnvelope = apiInstance.getFinalPrice(itemId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#getFinalPrice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#getFinalPrice")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPrice"></a>
# **getPrice**
> ItemPriceCalculationEnvelope getPrice(itemId, priceListId, discountsListId, quantity, currencyId, apiVersion, xApiVersion)

Gets the calculated price for an item

Calculates the price for an item considering price list, discount list, quantity, and currency.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountsListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quantity : kotlin.Double = 1.2 // kotlin.Double | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPriceCalculationEnvelope = apiInstance.getPrice(itemId, priceListId, discountsListId, quantity, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#getPrice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#getPrice")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **priceListId** | **java.util.UUID**|  | [optional] |
| **discountsListId** | **java.util.UUID**|  | [optional] |
| **quantity** | **kotlin.Double**|  | [optional] [default to 1.0] |
| **currencyId** | **kotlin.String**|  | [optional] [default to &quot;USD.USA&quot;] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemPriceCalculationEnvelope**](ItemPriceCalculationEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTotalSavingsInUsd"></a>
# **getTotalSavingsInUsd**
> MoneyEnvelope getTotalSavingsInUsd(itemId, currencyId, apiVersion, xApiVersion)

Gets total savings for an item

Gets the total savings amount for an item in the specified currency.

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
    val result : MoneyEnvelope = apiInstance.getTotalSavingsInUsd(itemId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#getTotalSavingsInUsd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#getTotalSavingsInUsd")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTotalTaxesInUsd"></a>
# **getTotalTaxesInUsd**
> MoneyEnvelope getTotalTaxesInUsd(itemId, currencyId, apiVersion, xApiVersion)

Gets total taxes for an item

Gets the total tax amount for an item in the specified currency.

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
    val result : MoneyEnvelope = apiInstance.getTotalTaxesInUsd(itemId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricesApi#getTotalTaxesInUsd")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricesApi#getTotalTaxesInUsd")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

