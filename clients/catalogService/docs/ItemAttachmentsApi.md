# ItemAttachmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemAttachmentAsync**](ItemAttachmentsApi.md#createItemAttachmentAsync) | **POST** /api/v2/CatalogService/ItemAttachments | Create a new item attachment |
| [**deleteItemAttachmentAsync**](ItemAttachmentsApi.md#deleteItemAttachmentAsync) | **DELETE** /api/v2/CatalogService/ItemAttachments/{itemAttachmentId} | Delete an item attachment |
| [**getItemAttachmentByIdAsync**](ItemAttachmentsApi.md#getItemAttachmentByIdAsync) | **GET** /api/v2/CatalogService/ItemAttachments/{itemAttachmentId} | Get item attachment by ID |
| [**getItemAttachmentsAsync**](ItemAttachmentsApi.md#getItemAttachmentsAsync) | **GET** /api/v2/CatalogService/ItemAttachments | Get all item attachments |
| [**updateItemAttachmentAsync**](ItemAttachmentsApi.md#updateItemAttachmentAsync) | **PUT** /api/v2/CatalogService/ItemAttachments/{itemAttachmentId} | Update an item attachment |


<a id="createItemAttachmentAsync"></a>
# **createItemAttachmentAsync**
> ItemAttachmentDtoEnvelope createItemAttachmentAsync(tenantId, apiVersion, xApiVersion, itemAttachmentCreateDto)

Create a new item attachment

Creates a new item attachment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttachmentCreateDto : ItemAttachmentCreateDto =  // ItemAttachmentCreateDto | 
try {
    val result : ItemAttachmentDtoEnvelope = apiInstance.createItemAttachmentAsync(tenantId, apiVersion, xApiVersion, itemAttachmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttachmentsApi#createItemAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttachmentsApi#createItemAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttachmentCreateDto** | [**ItemAttachmentCreateDto**](ItemAttachmentCreateDto.md)|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemAttachmentAsync"></a>
# **deleteItemAttachmentAsync**
> EmptyEnvelope deleteItemAttachmentAsync(itemAttachmentId, tenantId, apiVersion, xApiVersion)

Delete an item attachment

Deletes an item attachment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttachmentsApi()
val itemAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemAttachmentAsync(itemAttachmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttachmentsApi#deleteItemAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttachmentsApi#deleteItemAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttachmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="getItemAttachmentByIdAsync"></a>
# **getItemAttachmentByIdAsync**
> ItemAttachmentDtoEnvelope getItemAttachmentByIdAsync(itemAttachmentId, apiVersion, xApiVersion)

Get item attachment by ID

Retrieves a specific item attachment by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttachmentsApi()
val itemAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttachmentDtoEnvelope = apiInstance.getItemAttachmentByIdAsync(itemAttachmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttachmentsApi#getItemAttachmentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttachmentsApi#getItemAttachmentByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttachmentId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemAttachmentsAsync"></a>
# **getItemAttachmentsAsync**
> ItemAttachmentDtoListEnvelope getItemAttachmentsAsync(tenantId, apiVersion, xApiVersion)

Get all item attachments

Retrieves all item attachments for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttachmentDtoListEnvelope = apiInstance.getItemAttachmentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttachmentsApi#getItemAttachmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttachmentsApi#getItemAttachmentsAsync")
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

[**ItemAttachmentDtoListEnvelope**](ItemAttachmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemAttachmentAsync"></a>
# **updateItemAttachmentAsync**
> EmptyEnvelope updateItemAttachmentAsync(itemAttachmentId, tenantId, apiVersion, xApiVersion, itemAttachmentUpdateDto)

Update an item attachment

Updates an existing item attachment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttachmentsApi()
val itemAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttachmentUpdateDto : ItemAttachmentUpdateDto =  // ItemAttachmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemAttachmentAsync(itemAttachmentId, tenantId, apiVersion, xApiVersion, itemAttachmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttachmentsApi#updateItemAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttachmentsApi#updateItemAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttachmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttachmentUpdateDto** | [**ItemAttachmentUpdateDto**](ItemAttachmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

