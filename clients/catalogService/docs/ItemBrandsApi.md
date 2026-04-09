# ItemBrandsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemBrandAsync**](ItemBrandsApi.md#createItemBrandAsync) | **POST** /api/v2/CatalogService/ItemBrands | Create a new item brand |
| [**deleteItemBrandAsync**](ItemBrandsApi.md#deleteItemBrandAsync) | **DELETE** /api/v2/CatalogService/ItemBrands/{itemBrandId} | Delete an item brand |
| [**getItemBrandByIdAsync**](ItemBrandsApi.md#getItemBrandByIdAsync) | **GET** /api/v2/CatalogService/ItemBrands/{itemBrandId} | Get item brand by ID |
| [**getItemBrandsAsync**](ItemBrandsApi.md#getItemBrandsAsync) | **GET** /api/v2/CatalogService/ItemBrands | Get all item brands |
| [**updateItemBrandAsync**](ItemBrandsApi.md#updateItemBrandAsync) | **PUT** /api/v2/CatalogService/ItemBrands/{itemBrandId} | Update an item brand |


<a id="createItemBrandAsync"></a>
# **createItemBrandAsync**
> ItemBrandDtoEnvelope createItemBrandAsync(tenantId, apiVersion, xApiVersion, itemBrandCreateDto)

Create a new item brand

Creates a new item brand for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBrandsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemBrandCreateDto : ItemBrandCreateDto =  // ItemBrandCreateDto | 
try {
    val result : ItemBrandDtoEnvelope = apiInstance.createItemBrandAsync(tenantId, apiVersion, xApiVersion, itemBrandCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBrandsApi#createItemBrandAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBrandsApi#createItemBrandAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemBrandCreateDto** | [**ItemBrandCreateDto**](ItemBrandCreateDto.md)|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemBrandAsync"></a>
# **deleteItemBrandAsync**
> deleteItemBrandAsync(itemBrandId, tenantId, apiVersion, xApiVersion)

Delete an item brand

Deletes an item brand for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBrandsApi()
val itemBrandId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemBrandAsync(itemBrandId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemBrandsApi#deleteItemBrandAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBrandsApi#deleteItemBrandAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemBrandId** | **java.util.UUID**|  | |
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

<a id="getItemBrandByIdAsync"></a>
# **getItemBrandByIdAsync**
> ItemBrandDtoEnvelope getItemBrandByIdAsync(itemBrandId, apiVersion, xApiVersion)

Get item brand by ID

Retrieves a specific item brand by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBrandsApi()
val itemBrandId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemBrandDtoEnvelope = apiInstance.getItemBrandByIdAsync(itemBrandId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBrandsApi#getItemBrandByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBrandsApi#getItemBrandByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemBrandId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemBrandsAsync"></a>
# **getItemBrandsAsync**
> ItemBrandDtoListEnvelope getItemBrandsAsync(tenantId, apiVersion, xApiVersion)

Get all item brands

Retrieves all item brands for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBrandsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemBrandDtoListEnvelope = apiInstance.getItemBrandsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBrandsApi#getItemBrandsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBrandsApi#getItemBrandsAsync")
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

[**ItemBrandDtoListEnvelope**](ItemBrandDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemBrandAsync"></a>
# **updateItemBrandAsync**
> ItemBrandDtoEnvelope updateItemBrandAsync(itemBrandId, tenantId, apiVersion, xApiVersion, itemBrandUpdateDto)

Update an item brand

Updates an existing item brand for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBrandsApi()
val itemBrandId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemBrandUpdateDto : ItemBrandUpdateDto =  // ItemBrandUpdateDto | 
try {
    val result : ItemBrandDtoEnvelope = apiInstance.updateItemBrandAsync(itemBrandId, tenantId, apiVersion, xApiVersion, itemBrandUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBrandsApi#updateItemBrandAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBrandsApi#updateItemBrandAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemBrandId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemBrandUpdateDto** | [**ItemBrandUpdateDto**](ItemBrandUpdateDto.md)|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

