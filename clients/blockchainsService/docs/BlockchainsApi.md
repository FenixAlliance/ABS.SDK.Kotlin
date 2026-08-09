# BlockchainsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBlockchainAsync**](BlockchainsApi.md#createBlockchainAsync) | **POST** /api/v2/BlockchainsService/Blockchains | Create a new blockchain |
| [**createBlockchainBlockAsync**](BlockchainsApi.md#createBlockchainBlockAsync) | **POST** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks | Add a block to a blockchain |
| [**deleteBlockchainAsync**](BlockchainsApi.md#deleteBlockchainAsync) | **DELETE** /api/v2/BlockchainsService/Blockchains/{id} | Delete a blockchain |
| [**deleteBlockchainBlockAsync**](BlockchainsApi.md#deleteBlockchainBlockAsync) | **DELETE** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/{blockId} | Delete a blockchain block |
| [**getBlockchainBlockByIdAsync**](BlockchainsApi.md#getBlockchainBlockByIdAsync) | **GET** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/{blockId} | Get a specific block |
| [**getBlockchainBlocksAsync**](BlockchainsApi.md#getBlockchainBlocksAsync) | **GET** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks | Get blocks for a blockchain |
| [**getBlockchainBlocksCountAsync**](BlockchainsApi.md#getBlockchainBlocksCountAsync) | **GET** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/Count | Get block count for a blockchain |
| [**getBlockchainByIdAsync**](BlockchainsApi.md#getBlockchainByIdAsync) | **GET** /api/v2/BlockchainsService/Blockchains/{id} | Get blockchain by ID |
| [**getBlockchainsAsync**](BlockchainsApi.md#getBlockchainsAsync) | **GET** /api/v2/BlockchainsService/Blockchains | Get all blockchains |
| [**getBlockchainsCountAsync**](BlockchainsApi.md#getBlockchainsCountAsync) | **GET** /api/v2/BlockchainsService/Blockchains/Count | Get blockchains count |
| [**patchBlockchainAsync**](BlockchainsApi.md#patchBlockchainAsync) | **PATCH** /api/v2/BlockchainsService/Blockchains/{id} | Patch a blockchain |
| [**patchBlockchainBlockAsync**](BlockchainsApi.md#patchBlockchainBlockAsync) | **PATCH** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/{blockId} | Patch a blockchain block |
| [**updateBlockchainAsync**](BlockchainsApi.md#updateBlockchainAsync) | **PUT** /api/v2/BlockchainsService/Blockchains/{id} | Update a blockchain |
| [**updateBlockchainBlockAsync**](BlockchainsApi.md#updateBlockchainBlockAsync) | **PUT** /api/v2/BlockchainsService/Blockchains/{blockchainId}/Blocks/{blockId} | Update a blockchain block |


<a id="createBlockchainAsync"></a>
# **createBlockchainAsync**
> createBlockchainAsync(tenantId, apiVersion, xApiVersion, blockchainCreateDto)

Create a new blockchain

Creates a new blockchain for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blockchainCreateDto : BlockchainCreateDto =  // BlockchainCreateDto | 
try {
    apiInstance.createBlockchainAsync(tenantId, apiVersion, xApiVersion, blockchainCreateDto)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#createBlockchainAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#createBlockchainAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blockchainCreateDto** | [**BlockchainCreateDto**](BlockchainCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createBlockchainBlockAsync"></a>
# **createBlockchainBlockAsync**
> createBlockchainBlockAsync(blockchainId, tenantId, apiVersion, xApiVersion, blockchainBlockCreateDto)

Add a block to a blockchain

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val blockchainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blockchainBlockCreateDto : BlockchainBlockCreateDto =  // BlockchainBlockCreateDto | 
try {
    apiInstance.createBlockchainBlockAsync(blockchainId, tenantId, apiVersion, xApiVersion, blockchainBlockCreateDto)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#createBlockchainBlockAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#createBlockchainBlockAsync")
    e.printStackTrace()
}
```

### Parameters
| **blockchainId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blockchainBlockCreateDto** | [**BlockchainBlockCreateDto**](BlockchainBlockCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="deleteBlockchainAsync"></a>
# **deleteBlockchainAsync**
> deleteBlockchainAsync(id, tenantId, apiVersion, xApiVersion)

Delete a blockchain

Deletes a blockchain for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteBlockchainAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#deleteBlockchainAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#deleteBlockchainAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="deleteBlockchainBlockAsync"></a>
# **deleteBlockchainBlockAsync**
> deleteBlockchainBlockAsync(blockchainId, blockId, tenantId, apiVersion, xApiVersion)

Delete a blockchain block

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val blockchainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteBlockchainBlockAsync(blockchainId, blockId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#deleteBlockchainBlockAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#deleteBlockchainBlockAsync")
    e.printStackTrace()
}
```

### Parameters
| **blockchainId** | **java.util.UUID**|  | |
| **blockId** | **java.util.UUID**|  | |
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
 - **Accept**: Not defined

<a id="getBlockchainBlockByIdAsync"></a>
# **getBlockchainBlockByIdAsync**
> BlockchainBlockDto getBlockchainBlockByIdAsync(blockchainId, blockId, tenantId, apiVersion, xApiVersion)

Get a specific block

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val blockchainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlockchainBlockDto = apiInstance.getBlockchainBlockByIdAsync(blockchainId, blockId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#getBlockchainBlockByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#getBlockchainBlockByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **blockchainId** | **java.util.UUID**|  | |
| **blockId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlockchainBlockDto**](BlockchainBlockDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlockchainBlocksAsync"></a>
# **getBlockchainBlocksAsync**
> BlockchainBlockDtoListEnvelope getBlockchainBlocksAsync(blockchainId, tenantId, apiVersion, xApiVersion, blockchainBlockDtoCollectionQueryParameters)

Get blocks for a blockchain

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val blockchainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blockchainBlockDtoCollectionQueryParameters : BlockchainBlockDtoCollectionQueryParameters =  // BlockchainBlockDtoCollectionQueryParameters | 
try {
    val result : BlockchainBlockDtoListEnvelope = apiInstance.getBlockchainBlocksAsync(blockchainId, tenantId, apiVersion, xApiVersion, blockchainBlockDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#getBlockchainBlocksAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#getBlockchainBlocksAsync")
    e.printStackTrace()
}
```

### Parameters
| **blockchainId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blockchainBlockDtoCollectionQueryParameters** | [**BlockchainBlockDtoCollectionQueryParameters**](BlockchainBlockDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**BlockchainBlockDtoListEnvelope**](BlockchainBlockDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBlockchainBlocksCountAsync"></a>
# **getBlockchainBlocksCountAsync**
> Int32Envelope getBlockchainBlocksCountAsync(blockchainId, tenantId, apiVersion, xApiVersion, blockchainBlockDtoCollectionQueryParameters)

Get block count for a blockchain

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val blockchainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blockchainBlockDtoCollectionQueryParameters : BlockchainBlockDtoCollectionQueryParameters =  // BlockchainBlockDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getBlockchainBlocksCountAsync(blockchainId, tenantId, apiVersion, xApiVersion, blockchainBlockDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#getBlockchainBlocksCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#getBlockchainBlocksCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **blockchainId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blockchainBlockDtoCollectionQueryParameters** | [**BlockchainBlockDtoCollectionQueryParameters**](BlockchainBlockDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBlockchainByIdAsync"></a>
# **getBlockchainByIdAsync**
> BlockchainDto getBlockchainByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get blockchain by ID

Retrieves a specific blockchain by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlockchainDto = apiInstance.getBlockchainByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#getBlockchainByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#getBlockchainByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlockchainDto**](BlockchainDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlockchainsAsync"></a>
# **getBlockchainsAsync**
> BlockchainDtoListEnvelope getBlockchainsAsync(tenantId, apiVersion, xApiVersion, blockchainDtoCollectionQueryParameters)

Get all blockchains

Retrieves all blockchains for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blockchainDtoCollectionQueryParameters : BlockchainDtoCollectionQueryParameters =  // BlockchainDtoCollectionQueryParameters | 
try {
    val result : BlockchainDtoListEnvelope = apiInstance.getBlockchainsAsync(tenantId, apiVersion, xApiVersion, blockchainDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#getBlockchainsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#getBlockchainsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blockchainDtoCollectionQueryParameters** | [**BlockchainDtoCollectionQueryParameters**](BlockchainDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**BlockchainDtoListEnvelope**](BlockchainDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBlockchainsCountAsync"></a>
# **getBlockchainsCountAsync**
> Int32Envelope getBlockchainsCountAsync(tenantId, apiVersion, xApiVersion, blockchainDtoCollectionQueryParameters)

Get blockchains count

Returns the count of blockchains for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blockchainDtoCollectionQueryParameters : BlockchainDtoCollectionQueryParameters =  // BlockchainDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getBlockchainsCountAsync(tenantId, apiVersion, xApiVersion, blockchainDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#getBlockchainsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#getBlockchainsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blockchainDtoCollectionQueryParameters** | [**BlockchainDtoCollectionQueryParameters**](BlockchainDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchBlockchainAsync"></a>
# **patchBlockchainAsync**
> EmptyEnvelope patchBlockchainAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a blockchain

Patch a blockchain

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchBlockchainAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#patchBlockchainAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#patchBlockchainAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="patchBlockchainBlockAsync"></a>
# **patchBlockchainBlockAsync**
> EmptyEnvelope patchBlockchainBlockAsync(blockchainId, blockId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a blockchain block

Patch a blockchain block

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val blockchainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchBlockchainBlockAsync(blockchainId, blockId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#patchBlockchainBlockAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#patchBlockchainBlockAsync")
    e.printStackTrace()
}
```

### Parameters
| **blockchainId** | **java.util.UUID**|  | |
| **blockId** | **java.util.UUID**|  | |
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

<a id="updateBlockchainAsync"></a>
# **updateBlockchainAsync**
> updateBlockchainAsync(id, tenantId, apiVersion, xApiVersion, blockchainUpdateDto)

Update a blockchain

Updates an existing blockchain for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blockchainUpdateDto : BlockchainUpdateDto =  // BlockchainUpdateDto | 
try {
    apiInstance.updateBlockchainAsync(id, tenantId, apiVersion, xApiVersion, blockchainUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#updateBlockchainAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#updateBlockchainAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blockchainUpdateDto** | [**BlockchainUpdateDto**](BlockchainUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBlockchainBlockAsync"></a>
# **updateBlockchainBlockAsync**
> updateBlockchainBlockAsync(blockchainId, blockId, tenantId, apiVersion, xApiVersion, blockchainBlockUpdateDto)

Update a blockchain block

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlockchainsApi()
val blockchainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val blockId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val blockchainBlockUpdateDto : BlockchainBlockUpdateDto =  // BlockchainBlockUpdateDto | 
try {
    apiInstance.updateBlockchainBlockAsync(blockchainId, blockId, tenantId, apiVersion, xApiVersion, blockchainBlockUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling BlockchainsApi#updateBlockchainBlockAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlockchainsApi#updateBlockchainBlockAsync")
    e.printStackTrace()
}
```

### Parameters
| **blockchainId** | **java.util.UUID**|  | |
| **blockId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **blockchainBlockUpdateDto** | [**BlockchainBlockUpdateDto**](BlockchainBlockUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

