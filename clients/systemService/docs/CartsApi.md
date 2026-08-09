# CartsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteSystemCart**](CartsApi.md#deleteSystemCart) | **DELETE** /api/v2/SystemService/Carts/{cartId} | Delete a system cart |
| [**getSystemCartById**](CartsApi.md#getSystemCartById) | **GET** /api/v2/SystemService/Carts/{cartId} | Retrieve a single system cart by its ID |
| [**getSystemCarts**](CartsApi.md#getSystemCarts) | **GET** /api/v2/SystemService/Carts | Retrieve a list of system carts |
| [**getSystemCartsCount**](CartsApi.md#getSystemCartsCount) | **GET** /api/v2/SystemService/Carts/Count | Get the count of system carts |
| [**purgeSystemGuestCarts**](CartsApi.md#purgeSystemGuestCarts) | **DELETE** /api/v2/SystemService/Carts/Guests | Purge all guest carts |


<a id="deleteSystemCart"></a>
# **deleteSystemCart**
> EmptyEnvelope deleteSystemCart(cartId, apiVersion, xApiVersion)

Delete a system cart

Delete a system cart by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartsApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSystemCart(cartId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartsApi#deleteSystemCart")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartsApi#deleteSystemCart")
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemCartById"></a>
# **getSystemCartById**
> CartDtoEnvelope getSystemCartById(cartId, apiVersion, xApiVersion)

Retrieve a single system cart by its ID

Retrieve a single system cart by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartsApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CartDtoEnvelope = apiInstance.getSystemCartById(cartId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartsApi#getSystemCartById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartsApi#getSystemCartById")
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

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemCarts"></a>
# **getSystemCarts**
> CartDtoListEnvelope getSystemCarts(apiVersion, xApiVersion, cartDtoCollectionQueryParameters)

Retrieve a list of system carts

Retrieve a list of all carts in the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cartDtoCollectionQueryParameters : CartDtoCollectionQueryParameters =  // CartDtoCollectionQueryParameters | 
try {
    val result : CartDtoListEnvelope = apiInstance.getSystemCarts(apiVersion, xApiVersion, cartDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartsApi#getSystemCarts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartsApi#getSystemCarts")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cartDtoCollectionQueryParameters** | [**CartDtoCollectionQueryParameters**](CartDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CartDtoListEnvelope**](CartDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSystemCartsCount"></a>
# **getSystemCartsCount**
> Int32Envelope getSystemCartsCount(apiVersion, xApiVersion, cartDtoCollectionQueryParameters)

Get the count of system carts

Get the count of all carts in the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val cartDtoCollectionQueryParameters : CartDtoCollectionQueryParameters =  // CartDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSystemCartsCount(apiVersion, xApiVersion, cartDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartsApi#getSystemCartsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartsApi#getSystemCartsCount")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **cartDtoCollectionQueryParameters** | [**CartDtoCollectionQueryParameters**](CartDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="purgeSystemGuestCarts"></a>
# **purgeSystemGuestCarts**
> GuestCartPurgeResultDtoEnvelope purgeSystemGuestCarts(apiVersion, xApiVersion)

Purge all guest carts

Deletes every guest cart, cascading its item cart records, compare records and wish lists, and returns the removed-row counts. Idempotent.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CartsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : GuestCartPurgeResultDtoEnvelope = apiInstance.purgeSystemGuestCarts(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CartsApi#purgeSystemGuestCarts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CartsApi#purgeSystemGuestCarts")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**GuestCartPurgeResultDtoEnvelope**](GuestCartPurgeResultDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

