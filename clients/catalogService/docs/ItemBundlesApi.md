# ItemBundlesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemBundleAsync**](ItemBundlesApi.md#createItemBundleAsync) | **POST** /api/v2/CatalogService/ItemBundles | Create a new item bundle |
| [**deleteItemBundleAsync**](ItemBundlesApi.md#deleteItemBundleAsync) | **DELETE** /api/v2/CatalogService/ItemBundles/{itemBundleId} | Delete an item bundle |
| [**getItemBundleByIdAsync**](ItemBundlesApi.md#getItemBundleByIdAsync) | **GET** /api/v2/CatalogService/ItemBundles/{itemBundleId} | Get item bundle by ID |
| [**getItemBundlesAsync**](ItemBundlesApi.md#getItemBundlesAsync) | **GET** /api/v2/CatalogService/ItemBundles | Get all item bundles |
| [**getItemBundlesCountAsync**](ItemBundlesApi.md#getItemBundlesCountAsync) | **GET** /api/v2/CatalogService/ItemBundles/Count | Get item bundles count |
| [**patchItemBundleAsync**](ItemBundlesApi.md#patchItemBundleAsync) | **PATCH** /api/v2/CatalogService/ItemBundles/{itemBundleId} | Patch an item bundle |
| [**updateItemBundleAsync**](ItemBundlesApi.md#updateItemBundleAsync) | **PUT** /api/v2/CatalogService/ItemBundles/{itemBundleId} | Update an item bundle |


<a id="createItemBundleAsync"></a>
# **createItemBundleAsync**
> ItemBundleDtoEnvelope createItemBundleAsync(tenantId, apiVersion, xApiVersion, itemBundleCreateDto)

Create a new item bundle

Creates a new item bundle for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBundlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemBundleCreateDto : ItemBundleCreateDto =  // ItemBundleCreateDto | 
try {
    val result : ItemBundleDtoEnvelope = apiInstance.createItemBundleAsync(tenantId, apiVersion, xApiVersion, itemBundleCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBundlesApi#createItemBundleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBundlesApi#createItemBundleAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemBundleCreateDto** | [**ItemBundleCreateDto**](ItemBundleCreateDto.md)|  | [optional] |

### Return type

[**ItemBundleDtoEnvelope**](ItemBundleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemBundleAsync"></a>
# **deleteItemBundleAsync**
> deleteItemBundleAsync(itemBundleId, tenantId, apiVersion, xApiVersion)

Delete an item bundle

Deletes an item bundle for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBundlesApi()
val itemBundleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemBundleAsync(itemBundleId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemBundlesApi#deleteItemBundleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBundlesApi#deleteItemBundleAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemBundleId** | **java.util.UUID**|  | |
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

<a id="getItemBundleByIdAsync"></a>
# **getItemBundleByIdAsync**
> ItemBundleDtoEnvelope getItemBundleByIdAsync(itemBundleId, tenantId, apiVersion, xApiVersion)

Get item bundle by ID

Retrieves a specific item bundle by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBundlesApi()
val itemBundleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemBundleDtoEnvelope = apiInstance.getItemBundleByIdAsync(itemBundleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBundlesApi#getItemBundleByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBundlesApi#getItemBundleByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemBundleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemBundleDtoEnvelope**](ItemBundleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemBundlesAsync"></a>
# **getItemBundlesAsync**
> ItemBundleDtoListEnvelope getItemBundlesAsync(tenantId, apiVersion, xApiVersion, itemBundleDtoCollectionQueryParameters)

Get all item bundles

Retrieves all item bundles for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBundlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemBundleDtoCollectionQueryParameters : ItemBundleDtoCollectionQueryParameters =  // ItemBundleDtoCollectionQueryParameters | 
try {
    val result : ItemBundleDtoListEnvelope = apiInstance.getItemBundlesAsync(tenantId, apiVersion, xApiVersion, itemBundleDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBundlesApi#getItemBundlesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBundlesApi#getItemBundlesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemBundleDtoCollectionQueryParameters** | [**ItemBundleDtoCollectionQueryParameters**](ItemBundleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ItemBundleDtoListEnvelope**](ItemBundleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getItemBundlesCountAsync"></a>
# **getItemBundlesCountAsync**
> Int32Envelope getItemBundlesCountAsync(tenantId, apiVersion, xApiVersion, itemBundleDtoCollectionQueryParameters)

Get item bundles count

Returns the count of item bundles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBundlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemBundleDtoCollectionQueryParameters : ItemBundleDtoCollectionQueryParameters =  // ItemBundleDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getItemBundlesCountAsync(tenantId, apiVersion, xApiVersion, itemBundleDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBundlesApi#getItemBundlesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBundlesApi#getItemBundlesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemBundleDtoCollectionQueryParameters** | [**ItemBundleDtoCollectionQueryParameters**](ItemBundleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchItemBundleAsync"></a>
# **patchItemBundleAsync**
> EmptyEnvelope patchItemBundleAsync(itemBundleId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch an item bundle

Partially updates an existing item bundle for the specified tenant using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBundlesApi()
val itemBundleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemBundleAsync(itemBundleId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBundlesApi#patchItemBundleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBundlesApi#patchItemBundleAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemBundleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateItemBundleAsync"></a>
# **updateItemBundleAsync**
> ItemBundleDtoEnvelope updateItemBundleAsync(itemBundleId, tenantId, apiVersion, xApiVersion, itemBundleUpdateDto)

Update an item bundle

Updates an existing item bundle for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemBundlesApi()
val itemBundleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemBundleUpdateDto : ItemBundleUpdateDto =  // ItemBundleUpdateDto | 
try {
    val result : ItemBundleDtoEnvelope = apiInstance.updateItemBundleAsync(itemBundleId, tenantId, apiVersion, xApiVersion, itemBundleUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemBundlesApi#updateItemBundleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemBundlesApi#updateItemBundleAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemBundleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemBundleUpdateDto** | [**ItemBundleUpdateDto**](ItemBundleUpdateDto.md)|  | [optional] |

### Return type

[**ItemBundleDtoEnvelope**](ItemBundleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

