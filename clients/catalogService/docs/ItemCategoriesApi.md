# ItemCategoriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countItemCategoriesAsync**](ItemCategoriesApi.md#countItemCategoriesAsync) | **GET** /api/v2/CatalogService/ItemCategories/Count | Count item categories |
| [**createItemCategoryAsync**](ItemCategoriesApi.md#createItemCategoryAsync) | **POST** /api/v2/CatalogService/ItemCategories | Create a new item category |
| [**deleteItemCategoryAsync**](ItemCategoriesApi.md#deleteItemCategoryAsync) | **DELETE** /api/v2/CatalogService/ItemCategories/{itemCategoryId} | Delete an item category |
| [**getItemCategoriesAsync**](ItemCategoriesApi.md#getItemCategoriesAsync) | **GET** /api/v2/CatalogService/ItemCategories | Get all item categories |
| [**getItemCategoryByIdAsync**](ItemCategoriesApi.md#getItemCategoryByIdAsync) | **GET** /api/v2/CatalogService/ItemCategories/{itemCategoryId} | Get item category by ID |
| [**updateItemCategoryAsync**](ItemCategoriesApi.md#updateItemCategoryAsync) | **PUT** /api/v2/CatalogService/ItemCategories/{itemCategoryId} | Update an item category |


<a id="countItemCategoriesAsync"></a>
# **countItemCategoriesAsync**
> Int32Envelope countItemCategoriesAsync(tenantId, apiVersion, xApiVersion)

Count item categories

Counts all item categories for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countItemCategoriesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemCategoriesApi#countItemCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemCategoriesApi#countItemCategoriesAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createItemCategoryAsync"></a>
# **createItemCategoryAsync**
> ItemCategoryDtoEnvelope createItemCategoryAsync(tenantId, apiVersion, xApiVersion, itemCategoryCreateDto)

Create a new item category

Creates a new item category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemCategoryCreateDto : ItemCategoryCreateDto =  // ItemCategoryCreateDto | 
try {
    val result : ItemCategoryDtoEnvelope = apiInstance.createItemCategoryAsync(tenantId, apiVersion, xApiVersion, itemCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemCategoriesApi#createItemCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemCategoriesApi#createItemCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemCategoryCreateDto** | [**ItemCategoryCreateDto**](ItemCategoryCreateDto.md)|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemCategoryAsync"></a>
# **deleteItemCategoryAsync**
> deleteItemCategoryAsync(itemCategoryId, tenantId, apiVersion, xApiVersion)

Delete an item category

Deletes an item category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemCategoriesApi()
val itemCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemCategoryAsync(itemCategoryId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemCategoriesApi#deleteItemCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemCategoriesApi#deleteItemCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemCategoryId** | **java.util.UUID**|  | |
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

<a id="getItemCategoriesAsync"></a>
# **getItemCategoriesAsync**
> ItemCategoryDtoListEnvelope getItemCategoriesAsync(tenantId, apiVersion, xApiVersion)

Get all item categories

Retrieves all item categories for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemCategoryDtoListEnvelope = apiInstance.getItemCategoriesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemCategoriesApi#getItemCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemCategoriesApi#getItemCategoriesAsync")
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

[**ItemCategoryDtoListEnvelope**](ItemCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemCategoryByIdAsync"></a>
# **getItemCategoryByIdAsync**
> ItemCategoryDtoEnvelope getItemCategoryByIdAsync(itemCategoryId, apiVersion, xApiVersion)

Get item category by ID

Retrieves a specific item category by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemCategoriesApi()
val itemCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemCategoryDtoEnvelope = apiInstance.getItemCategoryByIdAsync(itemCategoryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemCategoriesApi#getItemCategoryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemCategoriesApi#getItemCategoryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemCategoryId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemCategoryAsync"></a>
# **updateItemCategoryAsync**
> updateItemCategoryAsync(itemCategoryId, tenantId, apiVersion, xApiVersion, itemCategoryUpdateDto)

Update an item category

Updates an existing item category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemCategoriesApi()
val itemCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemCategoryUpdateDto : ItemCategoryUpdateDto =  // ItemCategoryUpdateDto | 
try {
    apiInstance.updateItemCategoryAsync(itemCategoryId, tenantId, apiVersion, xApiVersion, itemCategoryUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemCategoriesApi#updateItemCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemCategoriesApi#updateItemCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemCategoryUpdateDto** | [**ItemCategoryUpdateDto**](ItemCategoryUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

