# ItemGoogleCategoriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAllItemGoogleCategoriesAsync**](ItemGoogleCategoriesApi.md#getAllItemGoogleCategoriesAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/All | Get all Google item categories (all) |
| [**getChildrenItemGoogleCategoriesByIdAsync**](ItemGoogleCategoriesApi.md#getChildrenItemGoogleCategoriesByIdAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/{itemCategoryId}/Children | Get children Google item categories by ID |
| [**getItemGoogleCategoriesAsync**](ItemGoogleCategoriesApi.md#getItemGoogleCategoriesAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories | Get all Google item categories |
| [**getItemGoogleCategoriesCountAsync**](ItemGoogleCategoriesApi.md#getItemGoogleCategoriesCountAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/Count | Get Google item categories count |
| [**getItemGoogleCategoriesTreeAsync**](ItemGoogleCategoriesApi.md#getItemGoogleCategoriesTreeAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/tree | Get Google item categories tree |
| [**getItemGoogleCategoryByIdAsync**](ItemGoogleCategoriesApi.md#getItemGoogleCategoryByIdAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/{itemCategoryId} | Get Google item category by ID |
| [**getRootItemGoogleCategoriesAsync**](ItemGoogleCategoriesApi.md#getRootItemGoogleCategoriesAsync) | **GET** /api/v2/CatalogService/ItemGoogleCategories/Primary | Get root Google item categories |
| [**mapItemGoogleCategoriesTreeAsync**](ItemGoogleCategoriesApi.md#mapItemGoogleCategoriesTreeAsync) | **POST** /api/v2/CatalogService/ItemGoogleCategories/tree | Map Google item categories tree |


<a id="getAllItemGoogleCategoriesAsync"></a>
# **getAllItemGoogleCategoriesAsync**
> ItemGoogleCategoryDtoListEnvelope getAllItemGoogleCategoriesAsync(apiVersion, xApiVersion)

Get all Google item categories (all)

Retrieves all Google item categories (all) without OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemGoogleCategoriesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoListEnvelope = apiInstance.getAllItemGoogleCategoriesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemGoogleCategoriesApi#getAllItemGoogleCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemGoogleCategoriesApi#getAllItemGoogleCategoriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getChildrenItemGoogleCategoriesByIdAsync"></a>
# **getChildrenItemGoogleCategoriesByIdAsync**
> ItemGoogleCategoryDtoListEnvelope getChildrenItemGoogleCategoriesByIdAsync(itemCategoryId, apiVersion, xApiVersion)

Get children Google item categories by ID

Retrieves children Google item categories for a given ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemGoogleCategoriesApi()
val itemCategoryId : kotlin.String = itemCategoryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoListEnvelope = apiInstance.getChildrenItemGoogleCategoriesByIdAsync(itemCategoryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemGoogleCategoriesApi#getChildrenItemGoogleCategoriesByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemGoogleCategoriesApi#getChildrenItemGoogleCategoriesByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemCategoryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemGoogleCategoriesAsync"></a>
# **getItemGoogleCategoriesAsync**
> ItemGoogleCategoryDtoListEnvelope getItemGoogleCategoriesAsync(apiVersion, xApiVersion)

Get all Google item categories

Retrieves all Google item categories using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemGoogleCategoriesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoListEnvelope = apiInstance.getItemGoogleCategoriesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemGoogleCategoriesApi#getItemGoogleCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemGoogleCategoriesApi#getItemGoogleCategoriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemGoogleCategoriesCountAsync"></a>
# **getItemGoogleCategoriesCountAsync**
> Int32Envelope getItemGoogleCategoriesCountAsync(apiVersion, xApiVersion)

Get Google item categories count

Retrieves the count of Google item categories using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemGoogleCategoriesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemGoogleCategoriesCountAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemGoogleCategoriesApi#getItemGoogleCategoriesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemGoogleCategoriesApi#getItemGoogleCategoriesCountAsync")
    e.printStackTrace()
}
```

### Parameters
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

<a id="getItemGoogleCategoriesTreeAsync"></a>
# **getItemGoogleCategoriesTreeAsync**
> ItemGoogleCategoryDtoListEnvelope getItemGoogleCategoriesTreeAsync(apiVersion, xApiVersion)

Get Google item categories tree

Retrieves the Google item categories tree.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemGoogleCategoriesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoListEnvelope = apiInstance.getItemGoogleCategoriesTreeAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemGoogleCategoriesApi#getItemGoogleCategoriesTreeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemGoogleCategoriesApi#getItemGoogleCategoriesTreeAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemGoogleCategoryByIdAsync"></a>
# **getItemGoogleCategoryByIdAsync**
> ItemGoogleCategoryDtoEnvelope getItemGoogleCategoryByIdAsync(itemCategoryId, apiVersion, xApiVersion)

Get Google item category by ID

Retrieves a specific Google item category by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemGoogleCategoriesApi()
val itemCategoryId : kotlin.String = itemCategoryId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoEnvelope = apiInstance.getItemGoogleCategoryByIdAsync(itemCategoryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemGoogleCategoriesApi#getItemGoogleCategoryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemGoogleCategoriesApi#getItemGoogleCategoryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemCategoryId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoEnvelope**](ItemGoogleCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRootItemGoogleCategoriesAsync"></a>
# **getRootItemGoogleCategoriesAsync**
> ItemGoogleCategoryDtoListEnvelope getRootItemGoogleCategoriesAsync(apiVersion, xApiVersion)

Get root Google item categories

Retrieves root Google item categories.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemGoogleCategoriesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoListEnvelope = apiInstance.getRootItemGoogleCategoriesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemGoogleCategoriesApi#getRootItemGoogleCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemGoogleCategoriesApi#getRootItemGoogleCategoriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="mapItemGoogleCategoriesTreeAsync"></a>
# **mapItemGoogleCategoriesTreeAsync**
> ItemGoogleCategoryDtoListEnvelope mapItemGoogleCategoriesTreeAsync(tenantId, apiVersion, xApiVersion)

Map Google item categories tree

Maps the Google item categories tree.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemGoogleCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoListEnvelope = apiInstance.mapItemGoogleCategoriesTreeAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemGoogleCategoriesApi#mapItemGoogleCategoriesTreeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemGoogleCategoriesApi#mapItemGoogleCategoriesTreeAsync")
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

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

