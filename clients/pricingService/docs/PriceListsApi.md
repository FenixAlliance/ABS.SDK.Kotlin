# PriceListsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPriceListAsync**](PriceListsApi.md#createPriceListAsync) | **POST** /api/v2/PricingService/PriceLists | Creates a new price list |
| [**createPriceListPricesAsync**](PriceListsApi.md#createPriceListPricesAsync) | **POST** /api/v2/PricingService/PriceLists/{priceListId}/Prices | Creates a price list entry |
| [**deletePriceListAsync**](PriceListsApi.md#deletePriceListAsync) | **DELETE** /api/v2/PricingService/PriceLists/{priceListId} | Deletes a price list |
| [**deletePriceListPriceAsync**](PriceListsApi.md#deletePriceListPriceAsync) | **DELETE** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} | Deletes a price list entry |
| [**getPriceListAsync**](PriceListsApi.md#getPriceListAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId} | Gets a price list by ID |
| [**getPriceListPriceAsync**](PriceListsApi.md#getPriceListPriceAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} | Gets a price list entry by ID |
| [**getPriceListPricesAsync**](PriceListsApi.md#getPriceListPricesAsync) | **GET** /api/v2/PricingService/PriceLists/{priceListId}/Prices | Retrieves prices in a price list |
| [**getPriceListsAsync**](PriceListsApi.md#getPriceListsAsync) | **GET** /api/v2/PricingService/PriceLists | Retrieves all price lists |
| [**getPriceListsCountAsync**](PriceListsApi.md#getPriceListsCountAsync) | **GET** /api/v2/PricingService/PriceLists/Count | Counts price lists |
| [**updatePriceListAsync**](PriceListsApi.md#updatePriceListAsync) | **PUT** /api/v2/PricingService/PriceLists/{priceListId} | Updates a price list |
| [**updatePriceListPriceAsync**](PriceListsApi.md#updatePriceListPriceAsync) | **PUT** /api/v2/PricingService/PriceLists/{priceListId}/Prices/{priceId} | Updates a price list entry |


<a id="createPriceListAsync"></a>
# **createPriceListAsync**
> EmptyEnvelope createPriceListAsync(tenantId, priceListCreateDto)

Creates a new price list

Creates a new price list for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceListCreateDto : PriceListCreateDto =  // PriceListCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPriceListAsync(tenantId, priceListCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#createPriceListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#createPriceListAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **priceListCreateDto** | [**PriceListCreateDto**](PriceListCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createPriceListPricesAsync"></a>
# **createPriceListPricesAsync**
> EmptyEnvelope createPriceListPricesAsync(priceListId, tenantId, itemPriceCreateDto)

Creates a price list entry

Creates a new price entry in the specified price list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemPriceCreateDto : ItemPriceCreateDto =  // ItemPriceCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPriceListPricesAsync(priceListId, tenantId, itemPriceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#createPriceListPricesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#createPriceListPricesAsync")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPriceCreateDto** | [**ItemPriceCreateDto**](ItemPriceCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePriceListAsync"></a>
# **deletePriceListAsync**
> EmptyEnvelope deletePriceListAsync(priceListId, tenantId)

Deletes a price list

Deletes the specified price list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deletePriceListAsync(priceListId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#deletePriceListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#deletePriceListAsync")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deletePriceListPriceAsync"></a>
# **deletePriceListPriceAsync**
> EmptyEnvelope deletePriceListPriceAsync(priceListId, priceId, tenantId)

Deletes a price list entry

Deletes the specified price entry from a price list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deletePriceListPriceAsync(priceListId, priceId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#deletePriceListPriceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#deletePriceListPriceAsync")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **priceId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPriceListAsync"></a>
# **getPriceListAsync**
> PriceListDtoEnvelope getPriceListAsync(priceListId, tenantId)

Gets a price list by ID

Retrieves the details of a price list using its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PriceListDtoEnvelope = apiInstance.getPriceListAsync(priceListId, tenantId)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**PriceListDtoEnvelope**](PriceListDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPriceListPriceAsync"></a>
# **getPriceListPriceAsync**
> ItemPriceDtoEnvelope getPriceListPriceAsync(priceListId, priceId, tenantId)

Gets a price list entry by ID

Retrieves a specific price entry from a price list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ItemPriceDtoEnvelope = apiInstance.getPriceListPriceAsync(priceListId, priceId, tenantId)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ItemPriceDtoEnvelope**](ItemPriceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPriceListPricesAsync"></a>
# **getPriceListPricesAsync**
> ItemPriceDtoListEnvelope getPriceListPricesAsync(priceListId, tenantId, itemId)

Retrieves prices in a price list

Gets all price entries for a specific price list with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ItemPriceDtoListEnvelope = apiInstance.getPriceListPricesAsync(priceListId, tenantId, itemId)
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **java.util.UUID**|  | [optional] |

### Return type

[**ItemPriceDtoListEnvelope**](ItemPriceDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPriceListsAsync"></a>
# **getPriceListsAsync**
> PriceListDtoListEnvelope getPriceListsAsync(tenantId)

Retrieves all price lists

Gets all price lists for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PriceListDtoListEnvelope = apiInstance.getPriceListsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#getPriceListsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#getPriceListsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**PriceListDtoListEnvelope**](PriceListDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPriceListsCountAsync"></a>
# **getPriceListsCountAsync**
> Int32Envelope getPriceListsCountAsync(tenantId)

Counts price lists

Gets the count of price lists for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getPriceListsCountAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#getPriceListsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#getPriceListsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updatePriceListAsync"></a>
# **updatePriceListAsync**
> EmptyEnvelope updatePriceListAsync(priceListId, tenantId, priceListUpdateDto)

Updates a price list

Updates the specified price list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceListUpdateDto : PriceListUpdateDto =  // PriceListUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePriceListAsync(priceListId, tenantId, priceListUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#updatePriceListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#updatePriceListAsync")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **priceListUpdateDto** | [**PriceListUpdateDto**](PriceListUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updatePriceListPriceAsync"></a>
# **updatePriceListPriceAsync**
> EmptyEnvelope updatePriceListPriceAsync(priceListId, priceId, tenantId, itemPriceUpdateDto)

Updates a price list entry

Updates the specified price entry in a price list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PriceListsApi()
val priceListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val priceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemPriceUpdateDto : ItemPriceUpdateDto =  // ItemPriceUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePriceListPriceAsync(priceListId, priceId, tenantId, itemPriceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PriceListsApi#updatePriceListPriceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PriceListsApi#updatePriceListPriceAsync")
    e.printStackTrace()
}
```

### Parameters
| **priceListId** | **java.util.UUID**|  | |
| **priceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPriceUpdateDto** | [**ItemPriceUpdateDto**](ItemPriceUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

