# ItemFamiliesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemFamilyAsync**](ItemFamiliesApi.md#createItemFamilyAsync) | **POST** /api/v2/CatalogService/ItemFamilies | Create a new item family |
| [**deleteItemFamilyAsync**](ItemFamiliesApi.md#deleteItemFamilyAsync) | **DELETE** /api/v2/CatalogService/ItemFamilies/{itemFamilyId} | Delete an item family |
| [**getItemFamiliesAsync**](ItemFamiliesApi.md#getItemFamiliesAsync) | **GET** /api/v2/CatalogService/ItemFamilies | Get all item families |
| [**getItemFamiliesCountAsync**](ItemFamiliesApi.md#getItemFamiliesCountAsync) | **GET** /api/v2/CatalogService/ItemFamilies/Count | Get item families count |
| [**getItemFamilyByIdAsync**](ItemFamiliesApi.md#getItemFamilyByIdAsync) | **GET** /api/v2/CatalogService/ItemFamilies/{itemFamilyId} | Get item family by ID |
| [**patchItemFamilyAsync**](ItemFamiliesApi.md#patchItemFamilyAsync) | **PATCH** /api/v2/CatalogService/ItemFamilies/{itemFamilyId} | Patch an item family |
| [**updateItemFamilyAsync**](ItemFamiliesApi.md#updateItemFamilyAsync) | **PUT** /api/v2/CatalogService/ItemFamilies/{itemFamilyId} | Update an item family |


<a id="createItemFamilyAsync"></a>
# **createItemFamilyAsync**
> ItemFamilyDtoEnvelope createItemFamilyAsync(tenantId, apiVersion, xApiVersion, itemFamilyCreateDto)

Create a new item family

Creates a new item family for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFamiliesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemFamilyCreateDto : ItemFamilyCreateDto =  // ItemFamilyCreateDto | 
try {
    val result : ItemFamilyDtoEnvelope = apiInstance.createItemFamilyAsync(tenantId, apiVersion, xApiVersion, itemFamilyCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemFamiliesApi#createItemFamilyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFamiliesApi#createItemFamilyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemFamilyCreateDto** | [**ItemFamilyCreateDto**](ItemFamilyCreateDto.md)|  | [optional] |

### Return type

[**ItemFamilyDtoEnvelope**](ItemFamilyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemFamilyAsync"></a>
# **deleteItemFamilyAsync**
> deleteItemFamilyAsync(itemFamilyId, tenantId, apiVersion, xApiVersion)

Delete an item family

Deletes an item family for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFamiliesApi()
val itemFamilyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemFamilyAsync(itemFamilyId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemFamiliesApi#deleteItemFamilyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFamiliesApi#deleteItemFamilyAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemFamilyId** | **java.util.UUID**|  | |
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

<a id="getItemFamiliesAsync"></a>
# **getItemFamiliesAsync**
> ItemFamilyDtoListEnvelope getItemFamiliesAsync(tenantId, apiVersion, xApiVersion)

Get all item families

Retrieves all item families for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFamiliesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemFamilyDtoListEnvelope = apiInstance.getItemFamiliesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemFamiliesApi#getItemFamiliesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFamiliesApi#getItemFamiliesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemFamilyDtoListEnvelope**](ItemFamilyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemFamiliesCountAsync"></a>
# **getItemFamiliesCountAsync**
> Int32Envelope getItemFamiliesCountAsync(tenantId, apiVersion, xApiVersion)

Get item families count

Returns the count of item families for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFamiliesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemFamiliesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemFamiliesApi#getItemFamiliesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFamiliesApi#getItemFamiliesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="getItemFamilyByIdAsync"></a>
# **getItemFamilyByIdAsync**
> ItemFamilyDtoEnvelope getItemFamilyByIdAsync(itemFamilyId, tenantId, apiVersion, xApiVersion)

Get item family by ID

Retrieves a specific item family by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFamiliesApi()
val itemFamilyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemFamilyDtoEnvelope = apiInstance.getItemFamilyByIdAsync(itemFamilyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemFamiliesApi#getItemFamilyByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFamiliesApi#getItemFamilyByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemFamilyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemFamilyDtoEnvelope**](ItemFamilyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchItemFamilyAsync"></a>
# **patchItemFamilyAsync**
> EmptyEnvelope patchItemFamilyAsync(itemFamilyId, tenantId, apiVersion, xApiVersion, operation)

Patch an item family

Partially updates an existing item family for the specified tenant using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFamiliesApi()
val itemFamilyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemFamilyAsync(itemFamilyId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemFamiliesApi#patchItemFamilyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFamiliesApi#patchItemFamilyAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemFamilyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateItemFamilyAsync"></a>
# **updateItemFamilyAsync**
> ItemFamilyDtoEnvelope updateItemFamilyAsync(itemFamilyId, tenantId, apiVersion, xApiVersion, itemFamilyUpdateDto)

Update an item family

Updates an existing item family for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemFamiliesApi()
val itemFamilyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemFamilyUpdateDto : ItemFamilyUpdateDto =  // ItemFamilyUpdateDto | 
try {
    val result : ItemFamilyDtoEnvelope = apiInstance.updateItemFamilyAsync(itemFamilyId, tenantId, apiVersion, xApiVersion, itemFamilyUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemFamiliesApi#updateItemFamilyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemFamiliesApi#updateItemFamilyAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemFamilyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemFamilyUpdateDto** | [**ItemFamilyUpdateDto**](ItemFamilyUpdateDto.md)|  | [optional] |

### Return type

[**ItemFamilyDtoEnvelope**](ItemFamilyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

