# ItemRestocksApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemRestockAsync**](ItemRestocksApi.md#createItemRestockAsync) | **POST** /api/v2/LogisticsService/ItemRestocks | Create an item restock |
| [**createItemRestockEntryAsync**](ItemRestocksApi.md#createItemRestockEntryAsync) | **POST** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries | Create a restock entry |
| [**deleteItemRestockAsync**](ItemRestocksApi.md#deleteItemRestockAsync) | **DELETE** /api/v2/LogisticsService/ItemRestocks/{restockId} | Delete an item restock |
| [**deleteItemRestockEntryAsync**](ItemRestocksApi.md#deleteItemRestockEntryAsync) | **DELETE** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/{entryId} | Delete a restock entry |
| [**getItemRestockByIdAsync**](ItemRestocksApi.md#getItemRestockByIdAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/{restockId} | Get item restock by ID |
| [**getItemRestockEntriesAsync**](ItemRestocksApi.md#getItemRestockEntriesAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries | Get restock entries |
| [**getItemRestockEntriesCountAsync**](ItemRestocksApi.md#getItemRestockEntriesCountAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/Count | Get restock entries count |
| [**getItemRestockEntryByIdAsync**](ItemRestocksApi.md#getItemRestockEntryByIdAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/{entryId} | Get restock entry by ID |
| [**getItemRestocksAsync**](ItemRestocksApi.md#getItemRestocksAsync) | **GET** /api/v2/LogisticsService/ItemRestocks | Get all item restocks |
| [**getItemRestocksCountAsync**](ItemRestocksApi.md#getItemRestocksCountAsync) | **GET** /api/v2/LogisticsService/ItemRestocks/Count | Get item restocks count |
| [**patchItemRestockAsync**](ItemRestocksApi.md#patchItemRestockAsync) | **PATCH** /api/v2/LogisticsService/ItemRestocks/{restockId} | Patch an item restock |
| [**patchItemRestockEntryAsync**](ItemRestocksApi.md#patchItemRestockEntryAsync) | **PATCH** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/{entryId} | Patch a restock entry |
| [**updateItemRestockAsync**](ItemRestocksApi.md#updateItemRestockAsync) | **PUT** /api/v2/LogisticsService/ItemRestocks/{restockId} | Update an item restock |
| [**updateItemRestockEntryAsync**](ItemRestocksApi.md#updateItemRestockEntryAsync) | **PUT** /api/v2/LogisticsService/ItemRestocks/{restockId}/Entries/{entryId} | Update a restock entry |


<a id="createItemRestockAsync"></a>
# **createItemRestockAsync**
> EmptyEnvelope createItemRestockAsync(tenantId, apiVersion, xApiVersion, itemRestockCreateDto)

Create an item restock

Creates a new item restock.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemRestockCreateDto : ItemRestockCreateDto =  // ItemRestockCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createItemRestockAsync(tenantId, apiVersion, xApiVersion, itemRestockCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#createItemRestockAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#createItemRestockAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemRestockCreateDto** | [**ItemRestockCreateDto**](ItemRestockCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createItemRestockEntryAsync"></a>
# **createItemRestockEntryAsync**
> EmptyEnvelope createItemRestockEntryAsync(restockId, tenantId, apiVersion, xApiVersion, itemRestockEntryCreateDto)

Create a restock entry

Creates a new restock entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemRestockEntryCreateDto : ItemRestockEntryCreateDto =  // ItemRestockEntryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createItemRestockEntryAsync(restockId, tenantId, apiVersion, xApiVersion, itemRestockEntryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#createItemRestockEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#createItemRestockEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemRestockEntryCreateDto** | [**ItemRestockEntryCreateDto**](ItemRestockEntryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemRestockAsync"></a>
# **deleteItemRestockAsync**
> EmptyEnvelope deleteItemRestockAsync(restockId, tenantId, apiVersion, xApiVersion)

Delete an item restock

Deletes an item restock.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemRestockAsync(restockId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#deleteItemRestockAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#deleteItemRestockAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
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

<a id="deleteItemRestockEntryAsync"></a>
# **deleteItemRestockEntryAsync**
> EmptyEnvelope deleteItemRestockEntryAsync(restockId, entryId, tenantId, apiVersion, xApiVersion)

Delete a restock entry

Deletes a restock entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemRestockEntryAsync(restockId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#deleteItemRestockEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#deleteItemRestockEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
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

<a id="getItemRestockByIdAsync"></a>
# **getItemRestockByIdAsync**
> ItemRestockDtoEnvelope getItemRestockByIdAsync(restockId, tenantId, apiVersion, xApiVersion)

Get item restock by ID

Retrieves a specific item restock.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRestockDtoEnvelope = apiInstance.getItemRestockByIdAsync(restockId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#getItemRestockByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#getItemRestockByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRestockDtoEnvelope**](ItemRestockDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemRestockEntriesAsync"></a>
# **getItemRestockEntriesAsync**
> ItemRestockEntryDtoListEnvelope getItemRestockEntriesAsync(restockId, tenantId, apiVersion, xApiVersion)

Get restock entries

Retrieves all entries for the specified restock.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRestockEntryDtoListEnvelope = apiInstance.getItemRestockEntriesAsync(restockId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#getItemRestockEntriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#getItemRestockEntriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRestockEntryDtoListEnvelope**](ItemRestockEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemRestockEntriesCountAsync"></a>
# **getItemRestockEntriesCountAsync**
> Int32Envelope getItemRestockEntriesCountAsync(restockId, tenantId, apiVersion, xApiVersion)

Get restock entries count

Returns the count of restock entries.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemRestockEntriesCountAsync(restockId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#getItemRestockEntriesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#getItemRestockEntriesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
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

<a id="getItemRestockEntryByIdAsync"></a>
# **getItemRestockEntryByIdAsync**
> ItemRestockEntryDtoEnvelope getItemRestockEntryByIdAsync(restockId, entryId, tenantId, apiVersion, xApiVersion)

Get restock entry by ID

Retrieves a specific restock entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRestockEntryDtoEnvelope = apiInstance.getItemRestockEntryByIdAsync(restockId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#getItemRestockEntryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#getItemRestockEntryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRestockEntryDtoEnvelope**](ItemRestockEntryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemRestocksAsync"></a>
# **getItemRestocksAsync**
> ItemRestockDtoListEnvelope getItemRestocksAsync(tenantId, apiVersion, xApiVersion)

Get all item restocks

Retrieves all item restocks for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRestockDtoListEnvelope = apiInstance.getItemRestocksAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#getItemRestocksAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#getItemRestocksAsync")
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

[**ItemRestockDtoListEnvelope**](ItemRestockDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemRestocksCountAsync"></a>
# **getItemRestocksCountAsync**
> Int32Envelope getItemRestocksCountAsync(tenantId, apiVersion, xApiVersion)

Get item restocks count

Returns the count of item restocks.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemRestocksCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#getItemRestocksCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#getItemRestocksCountAsync")
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

<a id="patchItemRestockAsync"></a>
# **patchItemRestockAsync**
> EmptyEnvelope patchItemRestockAsync(restockId, tenantId, apiVersion, xApiVersion, operation)

Patch an item restock

Applies a JSON Patch document to an item restock.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemRestockAsync(restockId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#patchItemRestockAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#patchItemRestockAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
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

<a id="patchItemRestockEntryAsync"></a>
# **patchItemRestockEntryAsync**
> EmptyEnvelope patchItemRestockEntryAsync(restockId, entryId, tenantId, apiVersion, xApiVersion, operation)

Patch a restock entry

Applies a JSON Patch document to a restock entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemRestockEntryAsync(restockId, entryId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#patchItemRestockEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#patchItemRestockEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
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

<a id="updateItemRestockAsync"></a>
# **updateItemRestockAsync**
> EmptyEnvelope updateItemRestockAsync(restockId, tenantId, apiVersion, xApiVersion, itemRestockUpdateDto)

Update an item restock

Updates an existing item restock.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemRestockUpdateDto : ItemRestockUpdateDto =  // ItemRestockUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemRestockAsync(restockId, tenantId, apiVersion, xApiVersion, itemRestockUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#updateItemRestockAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#updateItemRestockAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemRestockUpdateDto** | [**ItemRestockUpdateDto**](ItemRestockUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateItemRestockEntryAsync"></a>
# **updateItemRestockEntryAsync**
> EmptyEnvelope updateItemRestockEntryAsync(restockId, entryId, tenantId, apiVersion, xApiVersion, itemRestockEntryUpdateDto)

Update a restock entry

Updates an existing restock entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRestocksApi()
val restockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemRestockEntryUpdateDto : ItemRestockEntryUpdateDto =  // ItemRestockEntryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemRestockEntryAsync(restockId, entryId, tenantId, apiVersion, xApiVersion, itemRestockEntryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRestocksApi#updateItemRestockEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRestocksApi#updateItemRestockEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **restockId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemRestockEntryUpdateDto** | [**ItemRestockEntryUpdateDto**](ItemRestockEntryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

