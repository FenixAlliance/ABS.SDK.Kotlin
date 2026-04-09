# WishListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addProductToWishList**](WishListsApi.md#addProductToWishList) | **POST** /api/v2/CartService/WishLists/Records | Add a product to a wish list |
| [**createWishList**](WishListsApi.md#createWishList) | **POST** /api/v2/CartService/WishLists | Create a wish list |
| [**deleteWishList**](WishListsApi.md#deleteWishList) | **DELETE** /api/v2/CartService/WishLists/{wishListId} | Delete a wish list |
| [**deleteWishListRecord**](WishListsApi.md#deleteWishListRecord) | **DELETE** /api/v2/CartService/WishLists/Records/{recordId} | Delete a wish list record |
| [**getCartWishListDetailsAsync**](WishListsApi.md#getCartWishListDetailsAsync) | **GET** /api/v2/CartService/WishLists/{wishListId}/Details | Get wish list details |
| [**getCartWishListItemsAsync**](WishListsApi.md#getCartWishListItemsAsync) | **GET** /api/v2/CartService/WishLists/{wishListId}/Records | Get wish list item records |
| [**getWishListAsync**](WishListsApi.md#getWishListAsync) | **GET** /api/v2/CartService/WishLists/{cartId} | Get wish lists for a cart |
| [**isProductInWishLists**](WishListsApi.md#isProductInWishLists) | **GET** /api/v2/CartService/WishLists/Contains | Check if a product is in any wish list |
| [**updateProductToWishList**](WishListsApi.md#updateProductToWishList) | **PUT** /api/v2/CartService/WishLists/{wishListId} | Update a wish list |
| [**wishListExists**](WishListsApi.md#wishListExists) | **GET** /api/v2/CartService/WishLists/Exists | Check if a wish list exists |
| [**wishListExistsHeadAsync**](WishListsApi.md#wishListExistsHeadAsync) | **HEAD** /api/v2/CartService/WishLists/Exists | Check if a wish list exists (HEAD) |


<a id="addProductToWishList"></a>
# **addProductToWishList**
> EmptyEnvelope addProductToWishList(apiVersion, xApiVersion, productToWishListRequest)

Add a product to a wish list

Adds the specified product to the given wish list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val productToWishListRequest : ProductToWishListRequest =  // ProductToWishListRequest | 
try {
    val result : EmptyEnvelope = apiInstance.addProductToWishList(apiVersion, xApiVersion, productToWishListRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#addProductToWishList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#addProductToWishList")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productToWishListRequest** | [**ProductToWishListRequest**](ProductToWishListRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWishList"></a>
# **createWishList**
> EmptyEnvelope createWishList(apiVersion, xApiVersion, newWishListRequest)

Create a wish list

Creates a new wish list from the provided request data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val newWishListRequest : NewWishListRequest =  // NewWishListRequest | 
try {
    val result : EmptyEnvelope = apiInstance.createWishList(apiVersion, xApiVersion, newWishListRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#createWishList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#createWishList")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **newWishListRequest** | [**NewWishListRequest**](NewWishListRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWishList"></a>
# **deleteWishList**
> EmptyEnvelope deleteWishList(wishListId, apiVersion, xApiVersion)

Delete a wish list

Deletes the specified wish list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val wishListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWishList(wishListId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#deleteWishList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#deleteWishList")
    e.printStackTrace()
}
```

### Parameters
| **wishListId** | **java.util.UUID**|  | |
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

<a id="deleteWishListRecord"></a>
# **deleteWishListRecord**
> deleteWishListRecord(recordId, apiVersion, xApiVersion)

Delete a wish list record

Removes a specific item record from a wish list by its record ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteWishListRecord(recordId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#deleteWishListRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#deleteWishListRecord")
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getCartWishListDetailsAsync"></a>
# **getCartWishListDetailsAsync**
> WishListDto getCartWishListDetailsAsync(wishListId, apiVersion, xApiVersion)

Get wish list details

Retrieves the full details of the specified wish list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val wishListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WishListDto = apiInstance.getCartWishListDetailsAsync(wishListId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#getCartWishListDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#getCartWishListDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **wishListId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WishListDto**](WishListDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCartWishListItemsAsync"></a>
# **getCartWishListItemsAsync**
> kotlin.collections.List&lt;WishListItemRecordDto&gt; getCartWishListItemsAsync(wishListId, apiVersion, xApiVersion)

Get wish list item records

Retrieves all item records in the specified wish list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val wishListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<WishListItemRecordDto> = apiInstance.getCartWishListItemsAsync(wishListId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#getCartWishListItemsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#getCartWishListItemsAsync")
    e.printStackTrace()
}
```

### Parameters
| **wishListId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;WishListItemRecordDto&gt;**](WishListItemRecordDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWishListAsync"></a>
# **getWishListAsync**
> kotlin.collections.List&lt;WishListDto&gt; getWishListAsync(cartId, apiVersion, xApiVersion)

Get wish lists for a cart

Retrieves all wish lists associated with the specified cart.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<WishListDto> = apiInstance.getWishListAsync(cartId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#getWishListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#getWishListAsync")
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

[**kotlin.collections.List&lt;WishListDto&gt;**](WishListDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="isProductInWishLists"></a>
# **isProductInWishLists**
> BooleanEnvelope isProductInWishLists(cartId, productId, apiVersion, xApiVersion)

Check if a product is in any wish list

Returns a boolean indicating whether the specified product exists in any wish list of the given cart.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val cartId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val productId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BooleanEnvelope = apiInstance.isProductInWishLists(cartId, productId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#isProductInWishLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#isProductInWishLists")
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

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateProductToWishList"></a>
# **updateProductToWishList**
> EmptyEnvelope updateProductToWishList(wishListId, apiVersion, xApiVersion, wishListUpdateDto)

Update a wish list

Updates the specified wish list with the provided data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val wishListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val wishListUpdateDto : WishListUpdateDto =  // WishListUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateProductToWishList(wishListId, apiVersion, xApiVersion, wishListUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#updateProductToWishList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#updateProductToWishList")
    e.printStackTrace()
}
```

### Parameters
| **wishListId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **wishListUpdateDto** | [**WishListUpdateDto**](WishListUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="wishListExists"></a>
# **wishListExists**
> BooleanEnvelope wishListExists(wishListId, apiVersion, xApiVersion)

Check if a wish list exists

Returns a boolean indicating whether the specified wish list exists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val wishListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BooleanEnvelope = apiInstance.wishListExists(wishListId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#wishListExists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#wishListExists")
    e.printStackTrace()
}
```

### Parameters
| **wishListId** | **java.util.UUID**|  | [optional] |
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

<a id="wishListExistsHeadAsync"></a>
# **wishListExistsHeadAsync**
> EmptyEnvelope wishListExistsHeadAsync(wishListId, apiVersion, xApiVersion)

Check if a wish list exists (HEAD)

HEAD request to check whether the specified wish list exists without returning a response body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WishListsApi()
val wishListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.wishListExistsHeadAsync(wishListId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WishListsApi#wishListExistsHeadAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WishListsApi#wishListExistsHeadAsync")
    e.printStackTrace()
}
```

### Parameters
| **wishListId** | **java.util.UUID**|  | [optional] |
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

