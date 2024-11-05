# PriceListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2PricingServicePriceListsCountGet**](PriceListsApi.md#apiV2PricingServicePriceListsCountGet) | **GET** /api/v2/PricingService/PriceLists/Count |  |
| [**apiV2PricingServicePriceListsGet**](PriceListsApi.md#apiV2PricingServicePriceListsGet) | **GET** /api/v2/PricingService/PriceLists |  |
| [**apiV2PricingServicePriceListsPost**](PriceListsApi.md#apiV2PricingServicePriceListsPost) | **POST** /api/v2/PricingService/PriceLists |  |
| [**apiV2PricingServicePriceListsPriceListIdDelete**](PriceListsApi.md#apiV2PricingServicePriceListsPriceListIdDelete) | **DELETE** /api/v2/PricingService/PriceLists/{priceListId} |  |
| [**apiV2PricingServicePriceListsPriceListIdPricesPost**](PriceListsApi.md#apiV2PricingServicePriceListsPriceListIdPricesPost) | **POST** /api/v2/PricingService/PriceLists/{priceListId}/Prices |  |
| [**apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete**](PriceListsApi.md#apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete) | **DELETE** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} |  |
| [**apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut**](PriceListsApi.md#apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut) | **PUT** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} |  |
| [**apiV2PricingServicePriceListsPriceListIdPut**](PriceListsApi.md#apiV2PricingServicePriceListsPriceListIdPut) | **PUT** /api/v2/PricingService/PriceLists/{priceListId} |  |
| [**getPriceListAsync**](PriceListsApi.md#getPriceListAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId} |  |
| [**getPriceListPriceAsync**](PriceListsApi.md#getPriceListPriceAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} |  |
| [**getPriceListPricesAsync**](PriceListsApi.md#getPriceListPricesAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId}/Prices |  |


<a id="apiV2PricingServicePriceListsCountGet"></a>
# **apiV2PricingServicePriceListsCountGet**
> Int32Envelope apiV2PricingServicePriceListsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2PricingServicePriceListsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#apiV2PricingServicePriceListsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#apiV2PricingServicePriceListsCountGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServicePriceListsGet"></a>
# **apiV2PricingServicePriceListsGet**
> PriceListDtoListEnvelope apiV2PricingServicePriceListsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PriceListDtoListEnvelope = apiInstance.apiV2PricingServicePriceListsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#apiV2PricingServicePriceListsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#apiV2PricingServicePriceListsGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PriceListDtoListEnvelope**](PriceListDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServicePriceListsPost"></a>
# **apiV2PricingServicePriceListsPost**
> EmptyEnvelope apiV2PricingServicePriceListsPost(tenantId, apiVersion, xApiVersion, priceListCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val priceListCreateDto : PriceListCreateDto =  // PriceListCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPost(tenantId, apiVersion, xApiVersion, priceListCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#apiV2PricingServicePriceListsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#apiV2PricingServicePriceListsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **priceListCreateDto** | [**PriceListCreateDto**](PriceListCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2PricingServicePriceListsPriceListIdDelete"></a>
# **apiV2PricingServicePriceListsPriceListIdDelete**
> EmptyEnvelope apiV2PricingServicePriceListsPriceListIdDelete(priceListId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdDelete(priceListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServicePriceListsPriceListIdPricesPost"></a>
# **apiV2PricingServicePriceListsPriceListIdPricesPost**
> EmptyEnvelope apiV2PricingServicePriceListsPriceListIdPricesPost(priceListId, tenantId, apiVersion, xApiVersion, itemPriceCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPriceCreateDto : ItemPriceCreateDto =  // ItemPriceCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdPricesPost(priceListId, tenantId, apiVersion, xApiVersion, itemPriceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdPricesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdPricesPost")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPriceCreateDto** | [**ItemPriceCreateDto**](ItemPriceCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete"></a>
# **apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete**
> EmptyEnvelope apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete(priceListId, priceId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete(priceListId, priceId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdPricesPriceIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **priceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut"></a>
# **apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut**
> EmptyEnvelope apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut(priceListId, priceId, tenantId, apiVersion, xApiVersion, itemPriceUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPriceUpdateDto : ItemPriceUpdateDto =  // ItemPriceUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut(priceListId, priceId, tenantId, apiVersion, xApiVersion, itemPriceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdPricesPriceIdPut")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **priceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPriceUpdateDto** | [**ItemPriceUpdateDto**](ItemPriceUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2PricingServicePriceListsPriceListIdPut"></a>
# **apiV2PricingServicePriceListsPriceListIdPut**
> EmptyEnvelope apiV2PricingServicePriceListsPriceListIdPut(priceListId, tenantId, apiVersion, xApiVersion, priceListUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val priceListUpdateDto : PriceListUpdateDto =  // PriceListUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServicePriceListsPriceListIdPut(priceListId, tenantId, apiVersion, xApiVersion, priceListUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#apiV2PricingServicePriceListsPriceListIdPut")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **priceListUpdateDto** | [**PriceListUpdateDto**](PriceListUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getPriceListAsync"></a>
# **getPriceListAsync**
> PriceListDtoEnvelope getPriceListAsync(priceListId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PriceListDtoEnvelope = apiInstance.getPriceListAsync(priceListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#getPriceListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#getPriceListAsync")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PriceListDtoEnvelope**](PriceListDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPriceListPriceAsync"></a>
# **getPriceListPriceAsync**
> ItemPriceDtoEnvelope getPriceListPriceAsync(priceListId, priceId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPriceDtoEnvelope = apiInstance.getPriceListPriceAsync(priceListId, priceId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#getPriceListPriceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#getPriceListPriceAsync")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **priceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemPriceDtoEnvelope**](ItemPriceDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPriceListPricesAsync"></a>
# **getPriceListPricesAsync**
> ItemPriceDtoListEnvelope getPriceListPricesAsync(priceListId, tenantId, itemId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPriceDtoListEnvelope = apiInstance.getPriceListPricesAsync(priceListId, tenantId, itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#getPriceListPricesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#getPriceListPricesAsync")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemPriceDtoListEnvelope**](ItemPriceDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

