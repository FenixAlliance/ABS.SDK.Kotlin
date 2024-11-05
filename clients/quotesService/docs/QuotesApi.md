# QuotesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2QuotesServiceQuotesCountGet**](QuotesApi.md#apiV2QuotesServiceQuotesCountGet) | **GET** /api/v2/QuotesService/Quotes/Count |  |
| [**apiV2QuotesServiceQuotesExtendedGet**](QuotesApi.md#apiV2QuotesServiceQuotesExtendedGet) | **GET** /api/v2/QuotesService/Quotes/Extended |  |
| [**apiV2QuotesServiceQuotesGet**](QuotesApi.md#apiV2QuotesServiceQuotesGet) | **GET** /api/v2/QuotesService/Quotes |  |
| [**apiV2QuotesServiceQuotesPost**](QuotesApi.md#apiV2QuotesServiceQuotesPost) | **POST** /api/v2/QuotesService/Quotes |  |
| [**apiV2QuotesServiceQuotesQuoteIdCalculatePut**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdCalculatePut) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Calculate |  |
| [**apiV2QuotesServiceQuotesQuoteIdDelete**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdDelete) | **DELETE** /api/v2/QuotesService/Quotes/{quoteId} |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesCountGet**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesCountGet) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/Count |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesGet**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesGet) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesPost**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesPost) | **POST** /api/v2/QuotesService/Quotes/{quoteId}/Lines |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId}/Calculate |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete) | **DELETE** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet) | **GET** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} |  |
| [**apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut) | **PUT** /api/v2/QuotesService/Quotes/{quoteId}/Lines/{quoteLineId} |  |
| [**apiV2QuotesServiceQuotesQuoteIdPut**](QuotesApi.md#apiV2QuotesServiceQuotesQuoteIdPut) | **PUT** /api/v2/QuotesService/Quotes/{quoteId} |  |
| [**getQuoteAsync**](QuotesApi.md#getQuoteAsync) | **GET** /api/v2/QuotesService/Quotes/{quoteId} |  |


<a id="apiV2QuotesServiceQuotesCountGet"></a>
# **apiV2QuotesServiceQuotesCountGet**
> Int32Envelope apiV2QuotesServiceQuotesCountGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2QuotesServiceQuotesCountGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesCountGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesExtendedGet"></a>
# **apiV2QuotesServiceQuotesExtendedGet**
> ExtendedQuoteDtoListEnvelope apiV2QuotesServiceQuotesExtendedGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedQuoteDtoListEnvelope = apiInstance.apiV2QuotesServiceQuotesExtendedGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesExtendedGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedQuoteDtoListEnvelope**](ExtendedQuoteDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesGet"></a>
# **apiV2QuotesServiceQuotesGet**
> QuoteDtoListEnvelope apiV2QuotesServiceQuotesGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuoteDtoListEnvelope = apiInstance.apiV2QuotesServiceQuotesGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**QuoteDtoListEnvelope**](QuoteDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesPost"></a>
# **apiV2QuotesServiceQuotesPost**
> EmptyEnvelope apiV2QuotesServiceQuotesPost(tenantId, quoteCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteCreateDto : QuoteCreateDto =  // QuoteCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2QuotesServiceQuotesPost(tenantId, quoteCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteCreateDto** | [**QuoteCreateDto**](QuoteCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdCalculatePut"></a>
# **apiV2QuotesServiceQuotesQuoteIdCalculatePut**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdCalculatePut(quoteId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdCalculatePut(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdCalculatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdCalculatePut")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdDelete"></a>
# **apiV2QuotesServiceQuotesQuoteIdDelete**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdDelete(quoteId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdDelete(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdLinesCountGet"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesCountGet**
> Int32Envelope apiV2QuotesServiceQuotesQuoteIdLinesCountGet(quoteId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesCountGet(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesCountGet")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdLinesGet"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesGet**
> QuoteLineDtoListEnvelope apiV2QuotesServiceQuotesQuoteIdLinesGet(quoteId, tenantId, itemId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuoteLineDtoListEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesGet(quoteId, tenantId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesGet")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **java.util.UUID**|  | [optional] |

### Return type

[**QuoteLineDtoListEnvelope**](QuoteLineDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdLinesPost"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesPost**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdLinesPost(quoteId, tenantId, quoteLineCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineCreateDto : QuoteLineCreateDto =  // QuoteLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesPost(quoteId, tenantId, quoteLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesPost")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteLineCreateDto** | [**QuoteLineCreateDto**](QuoteLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut(quoteId, quoteLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut(quoteId, quoteLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdCalculatePut")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete(quoteId, quoteLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete(quoteId, quoteLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet**
> QuoteLineDtoEnvelope apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet(quoteId, quoteLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuoteLineDtoEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet(quoteId, quoteLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdGet")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**QuoteLineDtoEnvelope**](QuoteLineDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut"></a>
# **apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut(quoteId, quoteLineId, tenantId, quoteLineUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteLineUpdateDto : QuoteLineUpdateDto =  // QuoteLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut(quoteId, quoteLineId, tenantId, quoteLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdLinesQuoteLineIdPut")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **quoteLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteLineUpdateDto** | [**QuoteLineUpdateDto**](QuoteLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2QuotesServiceQuotesQuoteIdPut"></a>
# **apiV2QuotesServiceQuotesQuoteIdPut**
> EmptyEnvelope apiV2QuotesServiceQuotesQuoteIdPut(quoteId, tenantId, quoteUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quoteUpdateDto : QuoteUpdateDto =  // QuoteUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2QuotesServiceQuotesQuoteIdPut(quoteId, tenantId, quoteUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#apiV2QuotesServiceQuotesQuoteIdPut")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **quoteUpdateDto** | [**QuoteUpdateDto**](QuoteUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getQuoteAsync"></a>
# **getQuoteAsync**
> QuoteDtoEnvelope getQuoteAsync(quoteId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = QuotesApi()
val quoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : QuoteDtoEnvelope = apiInstance.getQuoteAsync(quoteId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling QuotesApi#getQuoteAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling QuotesApi#getQuoteAsync")
    e.printStackTrace()
}
```

### Parameters
| **quoteId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**QuoteDtoEnvelope**](QuoteDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

