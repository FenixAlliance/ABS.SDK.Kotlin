# OrdersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2OrdersServiceOrdersCountGet**](OrdersApi.md#apiV2OrdersServiceOrdersCountGet) | **GET** /api/v2/OrdersService/Orders/Count |  |
| [**apiV2OrdersServiceOrdersExtendedGet**](OrdersApi.md#apiV2OrdersServiceOrdersExtendedGet) | **GET** /api/v2/OrdersService/Orders/Extended |  |
| [**apiV2OrdersServiceOrdersOrderIdCalculatePut**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdCalculatePut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Calculate |  |
| [**apiV2OrdersServiceOrdersOrderIdDelete**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdDelete) | **DELETE** /api/v2/OrdersService/Orders/{orderId} |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesCountGet**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesCountGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/Count |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesGet**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId}/Calculate |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete) | **DELETE** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} |  |
| [**apiV2OrdersServiceOrdersOrderIdLinesPost**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdLinesPost) | **POST** /api/v2/OrdersService/Orders/{orderId}/Lines |  |
| [**apiV2OrdersServiceOrdersOrderIdPut**](OrdersApi.md#apiV2OrdersServiceOrdersOrderIdPut) | **PUT** /api/v2/OrdersService/Orders/{orderId} |  |
| [**apiV2OrdersServiceOrdersPost**](OrdersApi.md#apiV2OrdersServiceOrdersPost) | **POST** /api/v2/OrdersService/Orders |  |
| [**apiV2OrdersServiceOrdersSubmitCartPost**](OrdersApi.md#apiV2OrdersServiceOrdersSubmitCartPost) | **POST** /api/v2/OrdersService/Orders/SubmitCart |  |
| [**getOrderAsync**](OrdersApi.md#getOrderAsync) | **GET** /api/v2/OrdersService/Orders/{orderId} |  |
| [**getOrdersAsync**](OrdersApi.md#getOrdersAsync) | **GET** /api/v2/OrdersService/Orders |  |


<a id="apiV2OrdersServiceOrdersCountGet"></a>
# **apiV2OrdersServiceOrdersCountGet**
> Int32Envelope apiV2OrdersServiceOrdersCountGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2OrdersServiceOrdersCountGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersCountGet")
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

<a id="apiV2OrdersServiceOrdersExtendedGet"></a>
# **apiV2OrdersServiceOrdersExtendedGet**
> ExtendedOrderDtoListEnvelope apiV2OrdersServiceOrdersExtendedGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedOrderDtoListEnvelope = apiInstance.apiV2OrdersServiceOrdersExtendedGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersExtendedGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedOrderDtoListEnvelope**](ExtendedOrderDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2OrdersServiceOrdersOrderIdCalculatePut"></a>
# **apiV2OrdersServiceOrdersOrderIdCalculatePut**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdCalculatePut(orderId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdCalculatePut(orderId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdCalculatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdCalculatePut")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
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

<a id="apiV2OrdersServiceOrdersOrderIdDelete"></a>
# **apiV2OrdersServiceOrdersOrderIdDelete**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdDelete(orderId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdDelete(orderId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
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

<a id="apiV2OrdersServiceOrdersOrderIdLinesCountGet"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesCountGet**
> Int32Envelope apiV2OrdersServiceOrdersOrderIdLinesCountGet(orderId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesCountGet(orderId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesCountGet")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
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

<a id="apiV2OrdersServiceOrdersOrderIdLinesGet"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesGet**
> OrderLineDtoListEnvelope apiV2OrdersServiceOrdersOrderIdLinesGet(orderId, tenantId, itemId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OrderLineDtoListEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesGet(orderId, tenantId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesGet")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **java.util.UUID**|  | [optional] |

### Return type

[**OrderLineDtoListEnvelope**](OrderLineDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut(orderId, orderLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut(orderId, orderLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdCalculatePut")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **orderLineId** | **java.util.UUID**|  | |
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

<a id="apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete(orderId, orderLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete(orderId, orderLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **orderLineId** | **java.util.UUID**|  | |
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

<a id="apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet**
> OrderLineDtoEnvelope apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet(orderId, orderLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OrderLineDtoEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet(orderId, orderLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdGet")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **orderLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**OrderLineDtoEnvelope**](OrderLineDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut(orderId, orderLineId, tenantId, orderLineUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderLineUpdateDto : OrderLineUpdateDto =  // OrderLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut(orderId, orderLineId, tenantId, orderLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesOrderLineIdPut")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **orderLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderLineUpdateDto** | [**OrderLineUpdateDto**](OrderLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2OrdersServiceOrdersOrderIdLinesPost"></a>
# **apiV2OrdersServiceOrdersOrderIdLinesPost**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdLinesPost(orderId, tenantId, orderLineCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderLineCreateDto : OrderLineCreateDto =  // OrderLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdLinesPost(orderId, tenantId, orderLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdLinesPost")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderLineCreateDto** | [**OrderLineCreateDto**](OrderLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2OrdersServiceOrdersOrderIdPut"></a>
# **apiV2OrdersServiceOrdersOrderIdPut**
> EmptyEnvelope apiV2OrdersServiceOrdersOrderIdPut(orderId, tenantId, orderUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderUpdateDto : OrderUpdateDto =  // OrderUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2OrdersServiceOrdersOrderIdPut(orderId, tenantId, orderUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersOrderIdPut")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderUpdateDto** | [**OrderUpdateDto**](OrderUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2OrdersServiceOrdersPost"></a>
# **apiV2OrdersServiceOrdersPost**
> EmptyEnvelope apiV2OrdersServiceOrdersPost(tenantId, orderCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderCreateDto : OrderCreateDto =  // OrderCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2OrdersServiceOrdersPost(tenantId, orderCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orderCreateDto** | [**OrderCreateDto**](OrderCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2OrdersServiceOrdersSubmitCartPost"></a>
# **apiV2OrdersServiceOrdersSubmitCartPost**
> OrderDtoEnvelope apiV2OrdersServiceOrdersSubmitCartPost(cartId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OrderDtoEnvelope = apiInstance.apiV2OrdersServiceOrdersSubmitCartPost(cartId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#apiV2OrdersServiceOrdersSubmitCartPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#apiV2OrdersServiceOrdersSubmitCartPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cartId** | **java.util.UUID**|  | |

### Return type

[**OrderDtoEnvelope**](OrderDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrderAsync"></a>
# **getOrderAsync**
> OrderDtoEnvelope getOrderAsync(orderId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OrderDtoEnvelope = apiInstance.getOrderAsync(orderId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderAsync")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**OrderDtoEnvelope**](OrderDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrdersAsync"></a>
# **getOrdersAsync**
> OrderDtoListEnvelope getOrdersAsync(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OrderDtoListEnvelope = apiInstance.getOrdersAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrdersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrdersAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**OrderDtoListEnvelope**](OrderDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

