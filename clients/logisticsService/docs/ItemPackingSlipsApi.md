# ItemPackingSlipsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemPackingSlipAsync**](ItemPackingSlipsApi.md#createItemPackingSlipAsync) | **POST** /api/v2/LogisticsService/ItemPackingSlips | Create an item packing slip |
| [**createItemPackingSlipEntryAsync**](ItemPackingSlipsApi.md#createItemPackingSlipEntryAsync) | **POST** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries | Create a packing slip entry |
| [**deleteItemPackingSlipAsync**](ItemPackingSlipsApi.md#deleteItemPackingSlipAsync) | **DELETE** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId} | Delete an item packing slip |
| [**deleteItemPackingSlipEntryAsync**](ItemPackingSlipsApi.md#deleteItemPackingSlipEntryAsync) | **DELETE** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/{entryId} | Delete a packing slip entry |
| [**getItemPackingSlipByIdAsync**](ItemPackingSlipsApi.md#getItemPackingSlipByIdAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId} | Get item packing slip by ID |
| [**getItemPackingSlipEntriesAsync**](ItemPackingSlipsApi.md#getItemPackingSlipEntriesAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries | Get packing slip entries |
| [**getItemPackingSlipEntriesCountAsync**](ItemPackingSlipsApi.md#getItemPackingSlipEntriesCountAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/Count | Get packing slip entries count |
| [**getItemPackingSlipEntryByIdAsync**](ItemPackingSlipsApi.md#getItemPackingSlipEntryByIdAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/{entryId} | Get packing slip entry by ID |
| [**getItemPackingSlipsAsync**](ItemPackingSlipsApi.md#getItemPackingSlipsAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips | Get all item packing slips |
| [**getItemPackingSlipsCountAsync**](ItemPackingSlipsApi.md#getItemPackingSlipsCountAsync) | **GET** /api/v2/LogisticsService/ItemPackingSlips/Count | Get item packing slips count |
| [**patchItemPackingSlipAsync**](ItemPackingSlipsApi.md#patchItemPackingSlipAsync) | **PATCH** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId} | Patch an item packing slip |
| [**patchItemPackingSlipEntryAsync**](ItemPackingSlipsApi.md#patchItemPackingSlipEntryAsync) | **PATCH** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/{entryId} | Patch a packing slip entry |
| [**updateItemPackingSlipAsync**](ItemPackingSlipsApi.md#updateItemPackingSlipAsync) | **PUT** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId} | Update an item packing slip |
| [**updateItemPackingSlipEntryAsync**](ItemPackingSlipsApi.md#updateItemPackingSlipEntryAsync) | **PUT** /api/v2/LogisticsService/ItemPackingSlips/{packingSlipId}/Entries/{entryId} | Update a packing slip entry |


<a id="createItemPackingSlipAsync"></a>
# **createItemPackingSlipAsync**
> EmptyEnvelope createItemPackingSlipAsync(tenantId, apiVersion, xApiVersion, itemPackingSlipCreateDto)

Create an item packing slip

Creates a new item packing slip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPackingSlipCreateDto : ItemPackingSlipCreateDto =  // ItemPackingSlipCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createItemPackingSlipAsync(tenantId, apiVersion, xApiVersion, itemPackingSlipCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#createItemPackingSlipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#createItemPackingSlipAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPackingSlipCreateDto** | [**ItemPackingSlipCreateDto**](ItemPackingSlipCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createItemPackingSlipEntryAsync"></a>
# **createItemPackingSlipEntryAsync**
> EmptyEnvelope createItemPackingSlipEntryAsync(packingSlipId, tenantId, apiVersion, xApiVersion, itemPackingSlipEntryCreateDto)

Create a packing slip entry

Creates a new packing slip entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPackingSlipEntryCreateDto : ItemPackingSlipEntryCreateDto =  // ItemPackingSlipEntryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createItemPackingSlipEntryAsync(packingSlipId, tenantId, apiVersion, xApiVersion, itemPackingSlipEntryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#createItemPackingSlipEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#createItemPackingSlipEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPackingSlipEntryCreateDto** | [**ItemPackingSlipEntryCreateDto**](ItemPackingSlipEntryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemPackingSlipAsync"></a>
# **deleteItemPackingSlipAsync**
> EmptyEnvelope deleteItemPackingSlipAsync(packingSlipId, tenantId, apiVersion, xApiVersion)

Delete an item packing slip

Deletes an item packing slip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemPackingSlipAsync(packingSlipId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#deleteItemPackingSlipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#deleteItemPackingSlipAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
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

<a id="deleteItemPackingSlipEntryAsync"></a>
# **deleteItemPackingSlipEntryAsync**
> EmptyEnvelope deleteItemPackingSlipEntryAsync(packingSlipId, entryId, tenantId, apiVersion, xApiVersion)

Delete a packing slip entry

Deletes a packing slip entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemPackingSlipEntryAsync(packingSlipId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#deleteItemPackingSlipEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#deleteItemPackingSlipEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
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

<a id="getItemPackingSlipByIdAsync"></a>
# **getItemPackingSlipByIdAsync**
> ItemPackingSlipDtoEnvelope getItemPackingSlipByIdAsync(packingSlipId, tenantId, apiVersion, xApiVersion)

Get item packing slip by ID

Retrieves a specific item packing slip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPackingSlipDtoEnvelope = apiInstance.getItemPackingSlipByIdAsync(packingSlipId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#getItemPackingSlipByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#getItemPackingSlipByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemPackingSlipDtoEnvelope**](ItemPackingSlipDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemPackingSlipEntriesAsync"></a>
# **getItemPackingSlipEntriesAsync**
> ItemPackingSlipEntryDtoListEnvelope getItemPackingSlipEntriesAsync(packingSlipId, tenantId, apiVersion, xApiVersion, itemPackingSlipEntryDtoCollectionQueryParameters)

Get packing slip entries

Retrieves all entries for the specified packing slip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPackingSlipEntryDtoCollectionQueryParameters : ItemPackingSlipEntryDtoCollectionQueryParameters =  // ItemPackingSlipEntryDtoCollectionQueryParameters | 
try {
    val result : ItemPackingSlipEntryDtoListEnvelope = apiInstance.getItemPackingSlipEntriesAsync(packingSlipId, tenantId, apiVersion, xApiVersion, itemPackingSlipEntryDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#getItemPackingSlipEntriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#getItemPackingSlipEntriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPackingSlipEntryDtoCollectionQueryParameters** | [**ItemPackingSlipEntryDtoCollectionQueryParameters**](ItemPackingSlipEntryDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ItemPackingSlipEntryDtoListEnvelope**](ItemPackingSlipEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getItemPackingSlipEntriesCountAsync"></a>
# **getItemPackingSlipEntriesCountAsync**
> Int32Envelope getItemPackingSlipEntriesCountAsync(packingSlipId, tenantId, apiVersion, xApiVersion, itemPackingSlipEntryDtoCollectionQueryParameters)

Get packing slip entries count

Returns the count of packing slip entries.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPackingSlipEntryDtoCollectionQueryParameters : ItemPackingSlipEntryDtoCollectionQueryParameters =  // ItemPackingSlipEntryDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getItemPackingSlipEntriesCountAsync(packingSlipId, tenantId, apiVersion, xApiVersion, itemPackingSlipEntryDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#getItemPackingSlipEntriesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#getItemPackingSlipEntriesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPackingSlipEntryDtoCollectionQueryParameters** | [**ItemPackingSlipEntryDtoCollectionQueryParameters**](ItemPackingSlipEntryDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getItemPackingSlipEntryByIdAsync"></a>
# **getItemPackingSlipEntryByIdAsync**
> ItemPackingSlipEntryDtoEnvelope getItemPackingSlipEntryByIdAsync(packingSlipId, entryId, tenantId, apiVersion, xApiVersion)

Get packing slip entry by ID

Retrieves a specific packing slip entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPackingSlipEntryDtoEnvelope = apiInstance.getItemPackingSlipEntryByIdAsync(packingSlipId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#getItemPackingSlipEntryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#getItemPackingSlipEntryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemPackingSlipEntryDtoEnvelope**](ItemPackingSlipEntryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemPackingSlipsAsync"></a>
# **getItemPackingSlipsAsync**
> ItemPackingSlipDtoListEnvelope getItemPackingSlipsAsync(tenantId, apiVersion, xApiVersion, itemPackingSlipDtoCollectionQueryParameters)

Get all item packing slips

Retrieves all item packing slips for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPackingSlipDtoCollectionQueryParameters : ItemPackingSlipDtoCollectionQueryParameters =  // ItemPackingSlipDtoCollectionQueryParameters | 
try {
    val result : ItemPackingSlipDtoListEnvelope = apiInstance.getItemPackingSlipsAsync(tenantId, apiVersion, xApiVersion, itemPackingSlipDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#getItemPackingSlipsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#getItemPackingSlipsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPackingSlipDtoCollectionQueryParameters** | [**ItemPackingSlipDtoCollectionQueryParameters**](ItemPackingSlipDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ItemPackingSlipDtoListEnvelope**](ItemPackingSlipDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getItemPackingSlipsCountAsync"></a>
# **getItemPackingSlipsCountAsync**
> Int32Envelope getItemPackingSlipsCountAsync(tenantId, apiVersion, xApiVersion, itemPackingSlipDtoCollectionQueryParameters)

Get item packing slips count

Returns the count of item packing slips.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPackingSlipDtoCollectionQueryParameters : ItemPackingSlipDtoCollectionQueryParameters =  // ItemPackingSlipDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getItemPackingSlipsCountAsync(tenantId, apiVersion, xApiVersion, itemPackingSlipDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#getItemPackingSlipsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#getItemPackingSlipsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPackingSlipDtoCollectionQueryParameters** | [**ItemPackingSlipDtoCollectionQueryParameters**](ItemPackingSlipDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchItemPackingSlipAsync"></a>
# **patchItemPackingSlipAsync**
> EmptyEnvelope patchItemPackingSlipAsync(packingSlipId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch an item packing slip

Applies a JSON Patch document to an item packing slip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemPackingSlipAsync(packingSlipId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#patchItemPackingSlipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#patchItemPackingSlipAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
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

<a id="patchItemPackingSlipEntryAsync"></a>
# **patchItemPackingSlipEntryAsync**
> EmptyEnvelope patchItemPackingSlipEntryAsync(packingSlipId, entryId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a packing slip entry

Applies a JSON Patch document to a packing slip entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemPackingSlipEntryAsync(packingSlipId, entryId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#patchItemPackingSlipEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#patchItemPackingSlipEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
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

<a id="updateItemPackingSlipAsync"></a>
# **updateItemPackingSlipAsync**
> EmptyEnvelope updateItemPackingSlipAsync(packingSlipId, tenantId, apiVersion, xApiVersion, itemPackingSlipUpdateDto)

Update an item packing slip

Updates an existing item packing slip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPackingSlipUpdateDto : ItemPackingSlipUpdateDto =  // ItemPackingSlipUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemPackingSlipAsync(packingSlipId, tenantId, apiVersion, xApiVersion, itemPackingSlipUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#updateItemPackingSlipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#updateItemPackingSlipAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPackingSlipUpdateDto** | [**ItemPackingSlipUpdateDto**](ItemPackingSlipUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateItemPackingSlipEntryAsync"></a>
# **updateItemPackingSlipEntryAsync**
> EmptyEnvelope updateItemPackingSlipEntryAsync(packingSlipId, entryId, tenantId, apiVersion, xApiVersion, itemPackingSlipEntryUpdateDto)

Update a packing slip entry

Updates an existing packing slip entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPackingSlipsApi()
val packingSlipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPackingSlipEntryUpdateDto : ItemPackingSlipEntryUpdateDto =  // ItemPackingSlipEntryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemPackingSlipEntryAsync(packingSlipId, entryId, tenantId, apiVersion, xApiVersion, itemPackingSlipEntryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPackingSlipsApi#updateItemPackingSlipEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPackingSlipsApi#updateItemPackingSlipEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **packingSlipId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPackingSlipEntryUpdateDto** | [**ItemPackingSlipEntryUpdateDto**](ItemPackingSlipEntryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

