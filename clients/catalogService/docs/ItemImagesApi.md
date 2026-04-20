# ItemImagesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemImageAsync**](ItemImagesApi.md#createItemImageAsync) | **POST** /api/v2/CatalogService/ItemImages | Create a new item image |
| [**deleteItemImageAsync**](ItemImagesApi.md#deleteItemImageAsync) | **DELETE** /api/v2/CatalogService/ItemImages/{itemImageId} | Delete an item image |
| [**getItemImageByIdAsync**](ItemImagesApi.md#getItemImageByIdAsync) | **GET** /api/v2/CatalogService/ItemImages/{itemImageId} | Get item image by ID |
| [**getItemImagesAsync**](ItemImagesApi.md#getItemImagesAsync) | **GET** /api/v2/CatalogService/ItemImages | Get all item images |
| [**updateItemImageAsync**](ItemImagesApi.md#updateItemImageAsync) | **PUT** /api/v2/CatalogService/ItemImages/{itemImageId} | Update an item image |


<a id="createItemImageAsync"></a>
# **createItemImageAsync**
> ItemImageDtoEnvelope createItemImageAsync(tenantId, apiVersion, xApiVersion, itemImageCreateDto)

Create a new item image

Creates a new item image for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemImagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemImageCreateDto : ItemImageCreateDto =  // ItemImageCreateDto | 
try {
    val result : ItemImageDtoEnvelope = apiInstance.createItemImageAsync(tenantId, apiVersion, xApiVersion, itemImageCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemImagesApi#createItemImageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemImagesApi#createItemImageAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemImageCreateDto** | [**ItemImageCreateDto**](ItemImageCreateDto.md)|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemImageAsync"></a>
# **deleteItemImageAsync**
> deleteItemImageAsync(itemImageId, tenantId, apiVersion, xApiVersion)

Delete an item image

Deletes an item image for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemImagesApi()
val itemImageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemImageAsync(itemImageId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemImagesApi#deleteItemImageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemImagesApi#deleteItemImageAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemImageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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
 - **Accept**: application/json

<a id="getItemImageByIdAsync"></a>
# **getItemImageByIdAsync**
> ItemImageDtoEnvelope getItemImageByIdAsync(itemImageId, apiVersion, xApiVersion)

Get item image by ID

Retrieves a specific item image by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemImagesApi()
val itemImageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemImageDtoEnvelope = apiInstance.getItemImageByIdAsync(itemImageId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemImagesApi#getItemImageByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemImagesApi#getItemImageByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemImageId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemImagesAsync"></a>
# **getItemImagesAsync**
> ItemImageDtoListEnvelope getItemImagesAsync(tenantId, apiVersion, xApiVersion)

Get all item images

Retrieves all item images for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemImagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemImageDtoListEnvelope = apiInstance.getItemImagesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemImagesApi#getItemImagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemImagesApi#getItemImagesAsync")
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

[**ItemImageDtoListEnvelope**](ItemImageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemImageAsync"></a>
# **updateItemImageAsync**
> updateItemImageAsync(itemImageId, tenantId, apiVersion, xApiVersion, itemImageUpdateDto)

Update an item image

Updates an existing item image for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemImagesApi()
val itemImageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemImageUpdateDto : ItemImageUpdateDto =  // ItemImageUpdateDto | 
try {
    apiInstance.updateItemImageAsync(itemImageId, tenantId, apiVersion, xApiVersion, itemImageUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemImagesApi#updateItemImageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemImagesApi#updateItemImageAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemImageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemImageUpdateDto** | [**ItemImageUpdateDto**](ItemImageUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

