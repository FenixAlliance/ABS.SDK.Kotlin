# ItemTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countItemTypesAsync**](ItemTypesApi.md#countItemTypesAsync) | **GET** /api/v2/CatalogService/ItemTypes/Count | Count item types |
| [**createItemTypeAsync**](ItemTypesApi.md#createItemTypeAsync) | **POST** /api/v2/CatalogService/ItemTypes | Create a new item type |
| [**deleteItemTypeAsync**](ItemTypesApi.md#deleteItemTypeAsync) | **DELETE** /api/v2/CatalogService/ItemTypes/{itemTypeID} | Delete an item type |
| [**getItemTypeByIdAsync**](ItemTypesApi.md#getItemTypeByIdAsync) | **GET** /api/v2/CatalogService/ItemTypes/{itemTypeID} | Get item type by ID |
| [**getItemTypesAsync**](ItemTypesApi.md#getItemTypesAsync) | **GET** /api/v2/CatalogService/ItemTypes | Get all item types |
| [**updateItemTypeAsync**](ItemTypesApi.md#updateItemTypeAsync) | **PUT** /api/v2/CatalogService/ItemTypes/{itemTypeID} | Update an item type |


<a id="countItemTypesAsync"></a>
# **countItemTypesAsync**
> Int32Envelope countItemTypesAsync(tenantId, apiVersion, xApiVersion)

Count item types

Counts all item types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countItemTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTypesApi#countItemTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTypesApi#countItemTypesAsync")
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

<a id="createItemTypeAsync"></a>
# **createItemTypeAsync**
> ItemTypeDtoEnvelope createItemTypeAsync(tenantId, apiVersion, xApiVersion, itemTypeCreateDto)

Create a new item type

Creates a new item type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemTypeCreateDto : ItemTypeCreateDto =  // ItemTypeCreateDto | 
try {
    val result : ItemTypeDtoEnvelope = apiInstance.createItemTypeAsync(tenantId, apiVersion, xApiVersion, itemTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTypesApi#createItemTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTypesApi#createItemTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemTypeCreateDto** | [**ItemTypeCreateDto**](ItemTypeCreateDto.md)|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemTypeAsync"></a>
# **deleteItemTypeAsync**
> ItemTypeDtoEnvelope deleteItemTypeAsync(itemTypeID, tenantId, apiVersion, xApiVersion)

Delete an item type

Deletes an item type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTypesApi()
val itemTypeID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTypeDtoEnvelope = apiInstance.deleteItemTypeAsync(itemTypeID, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTypesApi#deleteItemTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTypesApi#deleteItemTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemTypeID** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemTypeByIdAsync"></a>
# **getItemTypeByIdAsync**
> ItemTypeDtoEnvelope getItemTypeByIdAsync(itemTypeID, apiVersion, xApiVersion)

Get item type by ID

Retrieves a specific item type by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTypesApi()
val itemTypeID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTypeDtoEnvelope = apiInstance.getItemTypeByIdAsync(itemTypeID, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTypesApi#getItemTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTypesApi#getItemTypeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemTypeID** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemTypesAsync"></a>
# **getItemTypesAsync**
> ItemTypeDtoListEnvelope getItemTypesAsync(tenantId, apiVersion, xApiVersion)

Get all item types

Retrieves all item types for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTypeDtoListEnvelope = apiInstance.getItemTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTypesApi#getItemTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTypesApi#getItemTypesAsync")
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

[**ItemTypeDtoListEnvelope**](ItemTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemTypeAsync"></a>
# **updateItemTypeAsync**
> updateItemTypeAsync(itemTypeID, tenantId, apiVersion, xApiVersion, itemTypeUpdateDto)

Update an item type

Updates an existing item type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTypesApi()
val itemTypeID : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemTypeUpdateDto : ItemTypeUpdateDto =  // ItemTypeUpdateDto | 
try {
    apiInstance.updateItemTypeAsync(itemTypeID, tenantId, apiVersion, xApiVersion, itemTypeUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemTypesApi#updateItemTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTypesApi#updateItemTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemTypeID** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemTypeUpdateDto** | [**ItemTypeUpdateDto**](ItemTypeUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

