# ItemPickListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemPickListAsync**](ItemPickListsApi.md#createItemPickListAsync) | **POST** /api/v2/LogisticsService/ItemPickLists | Create an item pick list |
| [**createItemPickListEntryAsync**](ItemPickListsApi.md#createItemPickListEntryAsync) | **POST** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries | Create a pick list entry |
| [**deleteItemPickListAsync**](ItemPickListsApi.md#deleteItemPickListAsync) | **DELETE** /api/v2/LogisticsService/ItemPickLists/{pickListId} | Delete an item pick list |
| [**deleteItemPickListEntryAsync**](ItemPickListsApi.md#deleteItemPickListEntryAsync) | **DELETE** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/{entryId} | Delete a pick list entry |
| [**getItemPickListByIdAsync**](ItemPickListsApi.md#getItemPickListByIdAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/{pickListId} | Get item pick list by ID |
| [**getItemPickListEntriesAsync**](ItemPickListsApi.md#getItemPickListEntriesAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries | Get pick list entries |
| [**getItemPickListEntriesCountAsync**](ItemPickListsApi.md#getItemPickListEntriesCountAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/Count | Get pick list entries count |
| [**getItemPickListEntryByIdAsync**](ItemPickListsApi.md#getItemPickListEntryByIdAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/{entryId} | Get pick list entry by ID |
| [**getItemPickListsAsync**](ItemPickListsApi.md#getItemPickListsAsync) | **GET** /api/v2/LogisticsService/ItemPickLists | Get all item pick lists |
| [**getItemPickListsCountAsync**](ItemPickListsApi.md#getItemPickListsCountAsync) | **GET** /api/v2/LogisticsService/ItemPickLists/Count | Get item pick lists count |
| [**patchItemPickListAsync**](ItemPickListsApi.md#patchItemPickListAsync) | **PATCH** /api/v2/LogisticsService/ItemPickLists/{pickListId} | Patch an item pick list |
| [**patchItemPickListEntryAsync**](ItemPickListsApi.md#patchItemPickListEntryAsync) | **PATCH** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/{entryId} | Patch a pick list entry |
| [**updateItemPickListAsync**](ItemPickListsApi.md#updateItemPickListAsync) | **PUT** /api/v2/LogisticsService/ItemPickLists/{pickListId} | Update an item pick list |
| [**updateItemPickListEntryAsync**](ItemPickListsApi.md#updateItemPickListEntryAsync) | **PUT** /api/v2/LogisticsService/ItemPickLists/{pickListId}/Entries/{entryId} | Update a pick list entry |


<a id="createItemPickListAsync"></a>
# **createItemPickListAsync**
> EmptyEnvelope createItemPickListAsync(tenantId, apiVersion, xApiVersion, itemPickListCreateDto)

Create an item pick list

Creates a new item pick list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPickListCreateDto : ItemPickListCreateDto =  // ItemPickListCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createItemPickListAsync(tenantId, apiVersion, xApiVersion, itemPickListCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#createItemPickListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#createItemPickListAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPickListCreateDto** | [**ItemPickListCreateDto**](ItemPickListCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createItemPickListEntryAsync"></a>
# **createItemPickListEntryAsync**
> EmptyEnvelope createItemPickListEntryAsync(pickListId, tenantId, apiVersion, xApiVersion, itemPickListEntryCreateDto)

Create a pick list entry

Creates a new pick list entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPickListEntryCreateDto : ItemPickListEntryCreateDto =  // ItemPickListEntryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createItemPickListEntryAsync(pickListId, tenantId, apiVersion, xApiVersion, itemPickListEntryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#createItemPickListEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#createItemPickListEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPickListEntryCreateDto** | [**ItemPickListEntryCreateDto**](ItemPickListEntryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemPickListAsync"></a>
# **deleteItemPickListAsync**
> EmptyEnvelope deleteItemPickListAsync(pickListId, tenantId, apiVersion, xApiVersion)

Delete an item pick list

Deletes an item pick list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemPickListAsync(pickListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#deleteItemPickListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#deleteItemPickListAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
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

<a id="deleteItemPickListEntryAsync"></a>
# **deleteItemPickListEntryAsync**
> EmptyEnvelope deleteItemPickListEntryAsync(pickListId, entryId, tenantId, apiVersion, xApiVersion)

Delete a pick list entry

Deletes a pick list entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemPickListEntryAsync(pickListId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#deleteItemPickListEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#deleteItemPickListEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
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

<a id="getItemPickListByIdAsync"></a>
# **getItemPickListByIdAsync**
> ItemPickListDtoEnvelope getItemPickListByIdAsync(pickListId, tenantId, apiVersion, xApiVersion)

Get item pick list by ID

Retrieves a specific item pick list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPickListDtoEnvelope = apiInstance.getItemPickListByIdAsync(pickListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#getItemPickListByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#getItemPickListByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemPickListDtoEnvelope**](ItemPickListDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemPickListEntriesAsync"></a>
# **getItemPickListEntriesAsync**
> ItemPickListEntryDtoListEnvelope getItemPickListEntriesAsync(pickListId, tenantId, apiVersion, xApiVersion)

Get pick list entries

Retrieves all entries for the specified pick list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPickListEntryDtoListEnvelope = apiInstance.getItemPickListEntriesAsync(pickListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#getItemPickListEntriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#getItemPickListEntriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemPickListEntryDtoListEnvelope**](ItemPickListEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemPickListEntriesCountAsync"></a>
# **getItemPickListEntriesCountAsync**
> Int32Envelope getItemPickListEntriesCountAsync(pickListId, tenantId, apiVersion, xApiVersion)

Get pick list entries count

Returns the count of pick list entries.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemPickListEntriesCountAsync(pickListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#getItemPickListEntriesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#getItemPickListEntriesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
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

<a id="getItemPickListEntryByIdAsync"></a>
# **getItemPickListEntryByIdAsync**
> ItemPickListEntryDtoEnvelope getItemPickListEntryByIdAsync(pickListId, entryId, tenantId, apiVersion, xApiVersion)

Get pick list entry by ID

Retrieves a specific pick list entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPickListEntryDtoEnvelope = apiInstance.getItemPickListEntryByIdAsync(pickListId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#getItemPickListEntryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#getItemPickListEntryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemPickListEntryDtoEnvelope**](ItemPickListEntryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemPickListsAsync"></a>
# **getItemPickListsAsync**
> ItemPickListDtoListEnvelope getItemPickListsAsync(tenantId, apiVersion, xApiVersion)

Get all item pick lists

Retrieves all item pick lists for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemPickListDtoListEnvelope = apiInstance.getItemPickListsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#getItemPickListsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#getItemPickListsAsync")
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

[**ItemPickListDtoListEnvelope**](ItemPickListDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemPickListsCountAsync"></a>
# **getItemPickListsCountAsync**
> Int32Envelope getItemPickListsCountAsync(tenantId, apiVersion, xApiVersion)

Get item pick lists count

Returns the count of item pick lists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemPickListsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#getItemPickListsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#getItemPickListsCountAsync")
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

<a id="patchItemPickListAsync"></a>
# **patchItemPickListAsync**
> EmptyEnvelope patchItemPickListAsync(pickListId, tenantId, apiVersion, xApiVersion, operation)

Patch an item pick list

Applies a JSON Patch document to an item pick list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemPickListAsync(pickListId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#patchItemPickListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#patchItemPickListAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
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

<a id="patchItemPickListEntryAsync"></a>
# **patchItemPickListEntryAsync**
> EmptyEnvelope patchItemPickListEntryAsync(pickListId, entryId, tenantId, apiVersion, xApiVersion, operation)

Patch a pick list entry

Applies a JSON Patch document to a pick list entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemPickListEntryAsync(pickListId, entryId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#patchItemPickListEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#patchItemPickListEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
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

<a id="updateItemPickListAsync"></a>
# **updateItemPickListAsync**
> EmptyEnvelope updateItemPickListAsync(pickListId, tenantId, apiVersion, xApiVersion, itemPickListUpdateDto)

Update an item pick list

Updates an existing item pick list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPickListUpdateDto : ItemPickListUpdateDto =  // ItemPickListUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemPickListAsync(pickListId, tenantId, apiVersion, xApiVersion, itemPickListUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#updateItemPickListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#updateItemPickListAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPickListUpdateDto** | [**ItemPickListUpdateDto**](ItemPickListUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateItemPickListEntryAsync"></a>
# **updateItemPickListEntryAsync**
> EmptyEnvelope updateItemPickListEntryAsync(pickListId, entryId, tenantId, apiVersion, xApiVersion, itemPickListEntryUpdateDto)

Update a pick list entry

Updates an existing pick list entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemPickListsApi()
val pickListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemPickListEntryUpdateDto : ItemPickListEntryUpdateDto =  // ItemPickListEntryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemPickListEntryAsync(pickListId, entryId, tenantId, apiVersion, xApiVersion, itemPickListEntryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemPickListsApi#updateItemPickListEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemPickListsApi#updateItemPickListEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **pickListId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemPickListEntryUpdateDto** | [**ItemPickListEntryUpdateDto**](ItemPickListEntryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

