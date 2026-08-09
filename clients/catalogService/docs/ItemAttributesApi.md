# ItemAttributesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countItemAttributesAsync**](ItemAttributesApi.md#countItemAttributesAsync) | **GET** /api/v2/CatalogService/ItemAttributes/Count | Count item attributes |
| [**createItemAttributeAsync**](ItemAttributesApi.md#createItemAttributeAsync) | **POST** /api/v2/CatalogService/ItemAttributes | Create a new item attribute |
| [**deleteItemAttributeAsync**](ItemAttributesApi.md#deleteItemAttributeAsync) | **DELETE** /api/v2/CatalogService/ItemAttributes/{itemAttributeId} | Delete an item attribute |
| [**getItemAttributeByIdAsync**](ItemAttributesApi.md#getItemAttributeByIdAsync) | **GET** /api/v2/CatalogService/ItemAttributes/{itemAttributeId} | Get item attribute by ID |
| [**getItemAttributesAsync**](ItemAttributesApi.md#getItemAttributesAsync) | **GET** /api/v2/CatalogService/ItemAttributes | Get all item attributes |
| [**patchItemAttributeAsync**](ItemAttributesApi.md#patchItemAttributeAsync) | **PATCH** /api/v2/CatalogService/ItemAttributes/{itemAttributeId} | Patch an item attribute |
| [**updateItemAttributeAsync**](ItemAttributesApi.md#updateItemAttributeAsync) | **PUT** /api/v2/CatalogService/ItemAttributes/{itemAttributeId} | Update an item attribute |


<a id="countItemAttributesAsync"></a>
# **countItemAttributesAsync**
> Int32Envelope countItemAttributesAsync(tenantId, apiVersion, xApiVersion, itemAttributeDtoCollectionQueryParameters)

Count item attributes

Counts all item attributes for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttributeDtoCollectionQueryParameters : ItemAttributeDtoCollectionQueryParameters =  // ItemAttributeDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.countItemAttributesAsync(tenantId, apiVersion, xApiVersion, itemAttributeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributesApi#countItemAttributesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributesApi#countItemAttributesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttributeDtoCollectionQueryParameters** | [**ItemAttributeDtoCollectionQueryParameters**](ItemAttributeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createItemAttributeAsync"></a>
# **createItemAttributeAsync**
> ItemAttributeDtoEnvelope createItemAttributeAsync(tenantId, apiVersion, xApiVersion, itemAttributeCreateDto)

Create a new item attribute

Creates a new item attribute for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttributeCreateDto : ItemAttributeCreateDto =  // ItemAttributeCreateDto | 
try {
    val result : ItemAttributeDtoEnvelope = apiInstance.createItemAttributeAsync(tenantId, apiVersion, xApiVersion, itemAttributeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributesApi#createItemAttributeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributesApi#createItemAttributeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttributeCreateDto** | [**ItemAttributeCreateDto**](ItemAttributeCreateDto.md)|  | [optional] |

### Return type

[**ItemAttributeDtoEnvelope**](ItemAttributeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemAttributeAsync"></a>
# **deleteItemAttributeAsync**
> deleteItemAttributeAsync(itemAttributeId, tenantId, apiVersion, xApiVersion)

Delete an item attribute

Deletes an item attribute for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributesApi()
val itemAttributeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemAttributeAsync(itemAttributeId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributesApi#deleteItemAttributeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributesApi#deleteItemAttributeAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttributeId** | **java.util.UUID**|  | |
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

<a id="getItemAttributeByIdAsync"></a>
# **getItemAttributeByIdAsync**
> ItemAttributeDtoEnvelope getItemAttributeByIdAsync(itemAttributeId, tenantId, apiVersion, xApiVersion)

Get item attribute by ID

Retrieves a specific item attribute by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributesApi()
val itemAttributeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttributeDtoEnvelope = apiInstance.getItemAttributeByIdAsync(itemAttributeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributesApi#getItemAttributeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributesApi#getItemAttributeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttributeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttributeDtoEnvelope**](ItemAttributeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemAttributesAsync"></a>
# **getItemAttributesAsync**
> ItemAttributeDtoListEnvelope getItemAttributesAsync(tenantId, apiVersion, xApiVersion, itemAttributeDtoCollectionQueryParameters)

Get all item attributes

Retrieves all item attributes for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttributeDtoCollectionQueryParameters : ItemAttributeDtoCollectionQueryParameters =  // ItemAttributeDtoCollectionQueryParameters | 
try {
    val result : ItemAttributeDtoListEnvelope = apiInstance.getItemAttributesAsync(tenantId, apiVersion, xApiVersion, itemAttributeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributesApi#getItemAttributesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributesApi#getItemAttributesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttributeDtoCollectionQueryParameters** | [**ItemAttributeDtoCollectionQueryParameters**](ItemAttributeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ItemAttributeDtoListEnvelope**](ItemAttributeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchItemAttributeAsync"></a>
# **patchItemAttributeAsync**
> patchItemAttributeAsync(itemAttributeId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch an item attribute

Partially updates an existing item attribute for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributesApi()
val itemAttributeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    apiInstance.patchItemAttributeAsync(itemAttributeId, tenantId, apiVersion, xApiVersion, patchOperation)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributesApi#patchItemAttributeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributesApi#patchItemAttributeAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttributeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateItemAttributeAsync"></a>
# **updateItemAttributeAsync**
> updateItemAttributeAsync(itemAttributeId, tenantId, apiVersion, xApiVersion, itemAttributeUpdateDto)

Update an item attribute

Updates an existing item attribute for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributesApi()
val itemAttributeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttributeUpdateDto : ItemAttributeUpdateDto =  // ItemAttributeUpdateDto | 
try {
    apiInstance.updateItemAttributeAsync(itemAttributeId, tenantId, apiVersion, xApiVersion, itemAttributeUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributesApi#updateItemAttributeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributesApi#updateItemAttributeAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttributeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttributeUpdateDto** | [**ItemAttributeUpdateDto**](ItemAttributeUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

