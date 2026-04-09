# RecordsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addItemToCart**](RecordsApi.md#addItemToCart) | **POST** /api/v2/CartService/Records/AddItem | Add an item to a cart |
| [**addProductToCartAsync**](RecordsApi.md#addProductToCartAsync) | **POST** /api/v2/CartService/Records | Add a product to a cart with tracking |
| [**clearCartAsync**](RecordsApi.md#clearCartAsync) | **POST** /api/v2/CartService/Records/ClearCart | Clear all items from a cart |
| [**decreaseItemCartRecord**](RecordsApi.md#decreaseItemCartRecord) | **PUT** /api/v2/CartService/Records/{recordId}/Decrease | Decrease cart record quantity |
| [**getItemCartRecord**](RecordsApi.md#getItemCartRecord) | **GET** /api/v2/CartService/Records/{recordId}/Details | Get a cart record by ID |
| [**getItemsInCartAsync**](RecordsApi.md#getItemsInCartAsync) | **GET** /api/v2/CartService/Records/{cartId} | Get all items in a cart |
| [**increaseItemCartRecord**](RecordsApi.md#increaseItemCartRecord) | **PUT** /api/v2/CartService/Records/{recordId}/Increase | Increase cart record quantity |
| [**isItemAlreadyInCart**](RecordsApi.md#isItemAlreadyInCart) | **GET** /api/v2/CartService/Records/IsInCart | Check if an item is in a cart |
| [**removeProductFromCartByParams**](RecordsApi.md#removeProductFromCartByParams) | **DELETE** /api/v2/CartService/Records | Remove a product from a cart |
| [**removeProductFromCartByRecordId**](RecordsApi.md#removeProductFromCartByRecordId) | **DELETE** /api/v2/CartService/Records/{recordId} | Remove a product from a cart by record ID |
| [**updateItemCartRecord**](RecordsApi.md#updateItemCartRecord) | **PUT** /api/v2/CartService/Records/{recordId} | Update a cart record |


<a id="addItemToCart"></a>
# **addItemToCart**
> EmptyEnvelope addItemToCart(cartId, itemId, quantity, apiVersion, xApiVersion)

Add an item to a cart

Adds an item with the specified quantity to the given cart.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quantity : kotlin.Int = 56 // kotlin.Int | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.addItemToCart(cartId, itemId, quantity, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#addItemToCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#addItemToCart")
    e.printStackTrace()
}
```

### Parameters
| **cartId** | **java.util.UUID**|  | [optional] |
| **itemId** | **java.util.UUID**|  | [optional] |
| **quantity** | **kotlin.Int**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="addProductToCartAsync"></a>
# **addProductToCartAsync**
> EmptyEnvelope addProductToCartAsync(apiVersion, xApiVersion, itemCartRecordCreateDto)

Add a product to a cart with tracking

Adds a product to the cart using a request body with cart ID, product ID, and quantity.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemCartRecordCreateDto : ItemCartRecordCreateDto =  // ItemCartRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.addProductToCartAsync(apiVersion, xApiVersion, itemCartRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#addProductToCartAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#addProductToCartAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemCartRecordCreateDto** | [**ItemCartRecordCreateDto**](ItemCartRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="clearCartAsync"></a>
# **clearCartAsync**
> EmptyEnvelope clearCartAsync(cartID, apiVersion, xApiVersion)

Clear all items from a cart

Removes all item records from the specified cart.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val cartID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.clearCartAsync(cartID, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#clearCartAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#clearCartAsync")
    e.printStackTrace()
}
```

### Parameters
| **cartID** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="decreaseItemCartRecord"></a>
# **decreaseItemCartRecord**
> EmptyEnvelope decreaseItemCartRecord(recordId, quantity, apiVersion, xApiVersion)

Decrease cart record quantity

Decreases the quantity of the specified item cart record by the given amount.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quantity : kotlin.Double = 1.2 // kotlin.Double | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.decreaseItemCartRecord(recordId, quantity, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#decreaseItemCartRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#decreaseItemCartRecord")
    e.printStackTrace()
}
```

### Parameters
| **recordId** | **java.util.UUID**|  | |
| **quantity** | **kotlin.Double**|  | [optional] [default to 1.0] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemCartRecord"></a>
# **getItemCartRecord**
> EmptyEnvelope getItemCartRecord(recordId, apiVersion, xApiVersion)

Get a cart record by ID

Retrieves the details of a specific item cart record.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getItemCartRecord(recordId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#getItemCartRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#getItemCartRecord")
    e.printStackTrace()
}
```

### Parameters
| **recordId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemsInCartAsync"></a>
# **getItemsInCartAsync**
> ItemCartRecordDtoListEnvelope getItemsInCartAsync(cartId, apiVersion, xApiVersion)

Get all items in a cart

Retrieves all item cart records for the specified cart.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemCartRecordDtoListEnvelope = apiInstance.getItemsInCartAsync(cartId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#getItemsInCartAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#getItemsInCartAsync")
    e.printStackTrace()
}
```

### Parameters
| **cartId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemCartRecordDtoListEnvelope**](ItemCartRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="increaseItemCartRecord"></a>
# **increaseItemCartRecord**
> EmptyEnvelope increaseItemCartRecord(recordId, quantity, apiVersion, xApiVersion)

Increase cart record quantity

Increases the quantity of the specified item cart record by the given amount.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val quantity : kotlin.Double = 1.2 // kotlin.Double | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.increaseItemCartRecord(recordId, quantity, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#increaseItemCartRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#increaseItemCartRecord")
    e.printStackTrace()
}
```

### Parameters
| **recordId** | **java.util.UUID**|  | |
| **quantity** | **kotlin.Double**|  | [optional] [default to 1.0] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="isItemAlreadyInCart"></a>
# **isItemAlreadyInCart**
> BooleanEnvelope isItemAlreadyInCart(itemID, cartID, apiVersion, xApiVersion)

Check if an item is in a cart

Returns a boolean indicating whether the specified item is already in the given cart.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val itemID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val cartID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BooleanEnvelope = apiInstance.isItemAlreadyInCart(itemID, cartID, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#isItemAlreadyInCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#isItemAlreadyInCart")
    e.printStackTrace()
}
```

### Parameters
| **itemID** | **java.util.UUID**|  | |
| **cartID** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeProductFromCartByParams"></a>
# **removeProductFromCartByParams**
> EmptyEnvelope removeProductFromCartByParams(cartId, productId, apiVersion, xApiVersion)

Remove a product from a cart

Removes a product from the cart using cart ID and product ID query parameters.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val productId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.removeProductFromCartByParams(cartId, productId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#removeProductFromCartByParams")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#removeProductFromCartByParams")
    e.printStackTrace()
}
```

### Parameters
| **cartId** | **java.util.UUID**|  | [optional] |
| **productId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeProductFromCartByRecordId"></a>
# **removeProductFromCartByRecordId**
> EmptyEnvelope removeProductFromCartByRecordId(recordId, apiVersion, xApiVersion)

Remove a product from a cart by record ID

Removes a specific item record from the cart by its record ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.removeProductFromCartByRecordId(recordId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#removeProductFromCartByRecordId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#removeProductFromCartByRecordId")
    e.printStackTrace()
}
```

### Parameters
| **recordId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemCartRecord"></a>
# **updateItemCartRecord**
> EmptyEnvelope updateItemCartRecord(recordId, apiVersion, xApiVersion, itemCartRecordUpdateDto)

Update a cart record

Updates the specified item cart record with the provided data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RecordsApi()
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemCartRecordUpdateDto : ItemCartRecordUpdateDto =  // ItemCartRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemCartRecord(recordId, apiVersion, xApiVersion, itemCartRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RecordsApi#updateItemCartRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RecordsApi#updateItemCartRecord")
    e.printStackTrace()
}
```

### Parameters
| **recordId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemCartRecordUpdateDto** | [**ItemCartRecordUpdateDto**](ItemCartRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

