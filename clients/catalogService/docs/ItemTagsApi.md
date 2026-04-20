# ItemTagsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemTagAsync**](ItemTagsApi.md#createItemTagAsync) | **POST** /api/v2/CatalogService/ItemTags | Create a new item tag |
| [**deleteItemTagAsync**](ItemTagsApi.md#deleteItemTagAsync) | **DELETE** /api/v2/CatalogService/ItemTags/{itemTagId} | Delete an item tag |
| [**getItemTagByIdAsync**](ItemTagsApi.md#getItemTagByIdAsync) | **GET** /api/v2/CatalogService/ItemTags/{itemTagId} | Get item tag by ID |
| [**getItemTagsAsync**](ItemTagsApi.md#getItemTagsAsync) | **GET** /api/v2/CatalogService/ItemTags | Get all item tags |
| [**updateItemTagAsync**](ItemTagsApi.md#updateItemTagAsync) | **PUT** /api/v2/CatalogService/ItemTags/{itemTagId} | Update an item tag |


<a id="createItemTagAsync"></a>
# **createItemTagAsync**
> ItemTagDtoEnvelope createItemTagAsync(tenantId, apiVersion, xApiVersion, itemTagCreateDto)

Create a new item tag

Creates a new item tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTagsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemTagCreateDto : ItemTagCreateDto =  // ItemTagCreateDto | 
try {
    val result : ItemTagDtoEnvelope = apiInstance.createItemTagAsync(tenantId, apiVersion, xApiVersion, itemTagCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTagsApi#createItemTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTagsApi#createItemTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemTagCreateDto** | [**ItemTagCreateDto**](ItemTagCreateDto.md)|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemTagAsync"></a>
# **deleteItemTagAsync**
> deleteItemTagAsync(itemTagId, tenantId, apiVersion, xApiVersion)

Delete an item tag

Deletes an item tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTagsApi()
val itemTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemTagAsync(itemTagId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemTagsApi#deleteItemTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTagsApi#deleteItemTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemTagId** | **java.util.UUID**|  | |
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

<a id="getItemTagByIdAsync"></a>
# **getItemTagByIdAsync**
> ItemTagDtoEnvelope getItemTagByIdAsync(itemTagId, apiVersion, xApiVersion)

Get item tag by ID

Retrieves a specific item tag by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTagsApi()
val itemTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTagDtoEnvelope = apiInstance.getItemTagByIdAsync(itemTagId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTagsApi#getItemTagByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTagsApi#getItemTagByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemTagId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemTagsAsync"></a>
# **getItemTagsAsync**
> ItemTagDtoListEnvelope getItemTagsAsync(tenantId, apiVersion, xApiVersion)

Get all item tags

Retrieves all item tags for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTagsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTagDtoListEnvelope = apiInstance.getItemTagsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTagsApi#getItemTagsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTagsApi#getItemTagsAsync")
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

[**ItemTagDtoListEnvelope**](ItemTagDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemTagAsync"></a>
# **updateItemTagAsync**
> updateItemTagAsync(itemTagId, tenantId, apiVersion, xApiVersion, itemTagUpdateDto)

Update an item tag

Updates an existing item tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTagsApi()
val itemTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemTagUpdateDto : ItemTagUpdateDto =  // ItemTagUpdateDto | 
try {
    apiInstance.updateItemTagAsync(itemTagId, tenantId, apiVersion, xApiVersion, itemTagUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemTagsApi#updateItemTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTagsApi#updateItemTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemTagUpdateDto** | [**ItemTagUpdateDto**](ItemTagUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

