# OrdersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateOrder**](OrdersApi.md#calculateOrder) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Calculate | Calculates totals for an order. |
| [**calculateOrderLine**](OrdersApi.md#calculateOrderLine) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId}/Calculate | Calculates totals for an order line. |
| [**createOrder**](OrdersApi.md#createOrder) | **POST** /api/v2/OrdersService/Orders | Creates a new order. |
| [**createOrderLine**](OrdersApi.md#createOrderLine) | **POST** /api/v2/OrdersService/Orders/{orderId}/Lines | Creates a new order line. |
| [**deleteOrder**](OrdersApi.md#deleteOrder) | **DELETE** /api/v2/OrdersService/Orders/{orderId} | Deletes an order. |
| [**deleteOrderLine**](OrdersApi.md#deleteOrderLine) | **DELETE** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | Deletes an order line. |
| [**getExtendedOrders**](OrdersApi.md#getExtendedOrders) | **GET** /api/v2/OrdersService/Orders/Extended | Gets a list of extended orders for a tenant. |
| [**getOrder**](OrdersApi.md#getOrder) | **GET** /api/v2/OrdersService/Orders/{orderId} | Gets a specific order by ID. |
| [**getOrderLine**](OrdersApi.md#getOrderLine) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | Gets a specific order line. |
| [**getOrderLines**](OrdersApi.md#getOrderLines) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines | Gets order lines for an order. |
| [**getOrderLinesCount**](OrdersApi.md#getOrderLinesCount) | **GET** /api/v2/OrdersService/Orders/{orderId}/Lines/Count | Gets the count of order lines for an order. |
| [**getOrders**](OrdersApi.md#getOrders) | **GET** /api/v2/OrdersService/Orders | Gets a list of orders for a tenant. |
| [**getOrdersCount**](OrdersApi.md#getOrdersCount) | **GET** /api/v2/OrdersService/Orders/Count | Gets the count of orders for a tenant. |
| [**previewOrderEmailTemplate**](OrdersApi.md#previewOrderEmailTemplate) | **POST** /api/v2/OrdersService/Orders/{orderId}/Emails/Preview | Preview the rendered email for an Order. |
| [**sendOrderEmail**](OrdersApi.md#sendOrderEmail) | **POST** /api/v2/OrdersService/Orders/{orderId}/Emails/Send | Send a transactional email for an order. |
| [**submitCart**](OrdersApi.md#submitCart) | **POST** /api/v2/OrdersService/Orders/SubmitCart | Submits a cart and creates an order. |
| [**updateOrder**](OrdersApi.md#updateOrder) | **PUT** /api/v2/OrdersService/Orders/{orderId} | Updates an existing order. |
| [**updateOrderLine**](OrdersApi.md#updateOrderLine) | **PUT** /api/v2/OrdersService/Orders/{orderId}/Lines/{orderLineId} | Updates an order line. |


<a id="calculateOrder"></a>
# **calculateOrder**
> EmptyEnvelope calculateOrder(orderId, tenantId)

Calculates totals for an order.

Performs calculation of totals and taxes for the specified order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.calculateOrder(orderId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#calculateOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#calculateOrder")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="calculateOrderLine"></a>
# **calculateOrderLine**
> EmptyEnvelope calculateOrderLine(orderId, orderLineId, tenantId)

Calculates totals for an order line.

Performs calculation of totals and taxes for the specified order line.

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
    val result : EmptyEnvelope = apiInstance.calculateOrderLine(orderId, orderLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#calculateOrderLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#calculateOrderLine")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createOrder"></a>
# **createOrder**
> EmptyEnvelope createOrder(tenantId, orderCreateDto)

Creates a new order.

Creates a new order for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val orderCreateDto : OrderCreateDto =  // OrderCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createOrder(tenantId, orderCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrder")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createOrderLine"></a>
# **createOrderLine**
> EmptyEnvelope createOrderLine(orderId, tenantId, orderLineCreateDto)

Creates a new order line.

Creates a new line (item) for the specified order.

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
    val result : EmptyEnvelope = apiInstance.createOrderLine(orderId, tenantId, orderLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#createOrderLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#createOrderLine")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteOrder"></a>
# **deleteOrder**
> EmptyEnvelope deleteOrder(orderId, tenantId)

Deletes an order.

Deletes the specified order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteOrder(orderId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#deleteOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#deleteOrder")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteOrderLine"></a>
# **deleteOrderLine**
> EmptyEnvelope deleteOrderLine(orderId, orderLineId, tenantId)

Deletes an order line.

Deletes the specified order line.

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
    val result : EmptyEnvelope = apiInstance.deleteOrderLine(orderId, orderLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#deleteOrderLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#deleteOrderLine")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedOrders"></a>
# **getExtendedOrders**
> ExtendedOrderDtoListEnvelope getExtendedOrders(tenantId)

Gets a list of extended orders for a tenant.

Retrieves a list of extended order details for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedOrderDtoListEnvelope = apiInstance.getExtendedOrders(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getExtendedOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getExtendedOrders")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrder"></a>
# **getOrder**
> OrderDtoEnvelope getOrder(orderId, tenantId)

Gets a specific order by ID.

Retrieves the details of a specific order by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OrderDtoEnvelope = apiInstance.getOrder(orderId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrder")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrderLine"></a>
# **getOrderLine**
> OrderLineDtoEnvelope getOrderLine(orderId, orderLineId, tenantId)

Gets a specific order line.

Retrieves the details of a specific order line by its ID.

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
    val result : OrderLineDtoEnvelope = apiInstance.getOrderLine(orderId, orderLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderLine")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrderLines"></a>
# **getOrderLines**
> OrderLineDtoListEnvelope getOrderLines(orderId, tenantId, itemId)

Gets order lines for an order.

Retrieves the lines (items) for the specified order.

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
    val result : OrderLineDtoListEnvelope = apiInstance.getOrderLines(orderId, tenantId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderLines")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderLines")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrderLinesCount"></a>
# **getOrderLinesCount**
> Int32Envelope getOrderLinesCount(orderId, tenantId)

Gets the count of order lines for an order.

Retrieves the total number of lines for the specified order.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getOrderLinesCount(orderId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrderLinesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrderLinesCount")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrders"></a>
# **getOrders**
> OrderDtoListEnvelope getOrders(tenantId)

Gets a list of orders for a tenant.

Retrieves a list of orders for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OrderDtoListEnvelope = apiInstance.getOrders(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrders")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrders")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrdersCount"></a>
# **getOrdersCount**
> Int32Envelope getOrdersCount(tenantId)

Gets the count of orders for a tenant.

Retrieves the total number of orders for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getOrdersCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#getOrdersCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#getOrdersCount")
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

<a id="previewOrderEmailTemplate"></a>
# **previewOrderEmailTemplate**
> previewOrderEmailTemplate(orderId, tenantId, emailDispatchRequest)

Preview the rendered email for an Order.

Previews the rendered email template for the specified order. Only users with the &#39;send_email&#39; permission are permitted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    apiInstance.previewOrderEmailTemplate(orderId, tenantId, emailDispatchRequest)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#previewOrderEmailTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#previewOrderEmailTemplate")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sendOrderEmail"></a>
# **sendOrderEmail**
> EmptyEnvelope sendOrderEmail(orderId, tenantId, emailDispatchRequest)

Send a transactional email for an order.

Sends a transactional email for the specified order. Only users with the &#39;send_email&#39; permission are permitted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val orderId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    val result : EmptyEnvelope = apiInstance.sendOrderEmail(orderId, tenantId, emailDispatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#sendOrderEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#sendOrderEmail")
    e.printStackTrace()
}
```

### Parameters
| **orderId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="submitCart"></a>
# **submitCart**
> OrderDtoEnvelope submitCart(cartId)

Submits a cart and creates an order.

Submits the specified cart and creates an order for the authenticated user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OrdersApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : OrderDtoEnvelope = apiInstance.submitCart(cartId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#submitCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#submitCart")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateOrder"></a>
# **updateOrder**
> EmptyEnvelope updateOrder(orderId, tenantId, orderUpdateDto)

Updates an existing order.

Updates the details of an existing order.

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
    val result : EmptyEnvelope = apiInstance.updateOrder(orderId, tenantId, orderUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#updateOrder")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#updateOrder")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateOrderLine"></a>
# **updateOrderLine**
> EmptyEnvelope updateOrderLine(orderId, orderLineId, tenantId, orderLineUpdateDto)

Updates an order line.

Updates the details of a specific order line.

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
    val result : EmptyEnvelope = apiInstance.updateOrderLine(orderId, orderLineId, tenantId, orderLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OrdersApi#updateOrderLine")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrdersApi#updateOrderLine")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

