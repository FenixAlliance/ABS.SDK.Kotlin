# ItemAttributeOptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemAttributeOptionAsync**](ItemAttributeOptionsApi.md#createItemAttributeOptionAsync) | **POST** /api/v2/CatalogService/ItemAttributeOptions | Create a new item attribute option |
| [**deleteItemAttributeOptionAsync**](ItemAttributeOptionsApi.md#deleteItemAttributeOptionAsync) | **DELETE** /api/v2/CatalogService/ItemAttributeOptions/{itemAttributeOptionId} | Delete an item attribute option |
| [**getItemAttributeOptionByIdAsync**](ItemAttributeOptionsApi.md#getItemAttributeOptionByIdAsync) | **GET** /api/v2/CatalogService/ItemAttributeOptions/{itemAttributeOptionId} | Get item attribute option by ID |
| [**getItemAttributeOptionsAsync**](ItemAttributeOptionsApi.md#getItemAttributeOptionsAsync) | **GET** /api/v2/CatalogService/ItemAttributeOptions | Get all item attribute options |
| [**getItemAttributeOptionsCountAsync**](ItemAttributeOptionsApi.md#getItemAttributeOptionsCountAsync) | **GET** /api/v2/CatalogService/ItemAttributeOptions/Count | Get item attribute options count |
| [**updateItemAttributeOptionAsync**](ItemAttributeOptionsApi.md#updateItemAttributeOptionAsync) | **PUT** /api/v2/CatalogService/ItemAttributeOptions/{itemAttributeOptionId} | Update an item attribute option |


<a id="createItemAttributeOptionAsync"></a>
# **createItemAttributeOptionAsync**
> ItemAttributeOptionDtoEnvelope createItemAttributeOptionAsync(tenantId, apiVersion, xApiVersion, itemAttributeOptionCreateDto)

Create a new item attribute option

Creates a new item attribute option for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributeOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttributeOptionCreateDto : ItemAttributeOptionCreateDto =  // ItemAttributeOptionCreateDto | 
try {
    val result : ItemAttributeOptionDtoEnvelope = apiInstance.createItemAttributeOptionAsync(tenantId, apiVersion, xApiVersion, itemAttributeOptionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributeOptionsApi#createItemAttributeOptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributeOptionsApi#createItemAttributeOptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttributeOptionCreateDto** | [**ItemAttributeOptionCreateDto**](ItemAttributeOptionCreateDto.md)|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemAttributeOptionAsync"></a>
# **deleteItemAttributeOptionAsync**
> deleteItemAttributeOptionAsync(itemAttributeOptionId, tenantId, apiVersion, xApiVersion)

Delete an item attribute option

Deletes an item attribute option for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributeOptionsApi()
val itemAttributeOptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemAttributeOptionAsync(itemAttributeOptionId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributeOptionsApi#deleteItemAttributeOptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributeOptionsApi#deleteItemAttributeOptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttributeOptionId** | **java.util.UUID**|  | |
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

<a id="getItemAttributeOptionByIdAsync"></a>
# **getItemAttributeOptionByIdAsync**
> ItemAttributeOptionDtoEnvelope getItemAttributeOptionByIdAsync(itemAttributeOptionId, tenantId, apiVersion, xApiVersion)

Get item attribute option by ID

Retrieves a specific item attribute option by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributeOptionsApi()
val itemAttributeOptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttributeOptionDtoEnvelope = apiInstance.getItemAttributeOptionByIdAsync(itemAttributeOptionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributeOptionsApi#getItemAttributeOptionByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributeOptionsApi#getItemAttributeOptionByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttributeOptionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemAttributeOptionsAsync"></a>
# **getItemAttributeOptionsAsync**
> ItemAttributeOptionDtoListEnvelope getItemAttributeOptionsAsync(tenantId, apiVersion, xApiVersion)

Get all item attribute options

Retrieves all item attribute options for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributeOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttributeOptionDtoListEnvelope = apiInstance.getItemAttributeOptionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributeOptionsApi#getItemAttributeOptionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributeOptionsApi#getItemAttributeOptionsAsync")
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

[**ItemAttributeOptionDtoListEnvelope**](ItemAttributeOptionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemAttributeOptionsCountAsync"></a>
# **getItemAttributeOptionsCountAsync**
> Int32Envelope getItemAttributeOptionsCountAsync(tenantId, apiVersion, xApiVersion)

Get item attribute options count

Returns the count of item attribute options for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributeOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemAttributeOptionsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributeOptionsApi#getItemAttributeOptionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributeOptionsApi#getItemAttributeOptionsCountAsync")
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

<a id="updateItemAttributeOptionAsync"></a>
# **updateItemAttributeOptionAsync**
> ItemAttributeOptionDtoEnvelope updateItemAttributeOptionAsync(itemAttributeOptionId, tenantId, apiVersion, xApiVersion, itemAttributeOptionUpdateDto)

Update an item attribute option

Updates an existing item attribute option for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemAttributeOptionsApi()
val itemAttributeOptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttributeOptionUpdateDto : ItemAttributeOptionUpdateDto =  // ItemAttributeOptionUpdateDto | 
try {
    val result : ItemAttributeOptionDtoEnvelope = apiInstance.updateItemAttributeOptionAsync(itemAttributeOptionId, tenantId, apiVersion, xApiVersion, itemAttributeOptionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemAttributeOptionsApi#updateItemAttributeOptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemAttributeOptionsApi#updateItemAttributeOptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemAttributeOptionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttributeOptionUpdateDto** | [**ItemAttributeOptionUpdateDto**](ItemAttributeOptionUpdateDto.md)|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

