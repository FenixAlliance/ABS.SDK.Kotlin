# AssetTransfersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAssetTransferAsync**](AssetTransfersApi.md#createAssetTransferAsync) | **POST** /api/v2/AssetsService/AssetTransfers | Creates a new asset transfer |
| [**deleteAssetTransferAsync**](AssetTransfersApi.md#deleteAssetTransferAsync) | **DELETE** /api/v2/AssetsService/AssetTransfers/{transferId} | Deletes an asset transfer |
| [**getAssetTransferAsync**](AssetTransfersApi.md#getAssetTransferAsync) | **GET** /api/v2/AssetsService/AssetTransfers/{transferId} | Gets a single asset transfer by ID |
| [**getAssetTransfersAsync**](AssetTransfersApi.md#getAssetTransfersAsync) | **GET** /api/v2/AssetsService/AssetTransfers | Gets a list of asset transfers |
| [**getAssetTransfersCountAsync**](AssetTransfersApi.md#getAssetTransfersCountAsync) | **GET** /api/v2/AssetsService/AssetTransfers/Count | Gets the count of asset transfers |
| [**updateAssetTransferAsync**](AssetTransfersApi.md#updateAssetTransferAsync) | **PUT** /api/v2/AssetsService/AssetTransfers/{transferId} | Updates an existing asset transfer |


<a id="createAssetTransferAsync"></a>
# **createAssetTransferAsync**
> EmptyEnvelope createAssetTransferAsync(tenantId, assetTransferCreateDto)

Creates a new asset transfer

Creates a new asset transfer for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTransfersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetTransferCreateDto : AssetTransferCreateDto =  // AssetTransferCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAssetTransferAsync(tenantId, assetTransferCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTransfersApi#createAssetTransferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTransfersApi#createAssetTransferAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetTransferCreateDto** | [**AssetTransferCreateDto**](AssetTransferCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAssetTransferAsync"></a>
# **deleteAssetTransferAsync**
> EmptyEnvelope deleteAssetTransferAsync(transferId, tenantId)

Deletes an asset transfer

Deletes an asset transfer for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTransfersApi()
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAssetTransferAsync(transferId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTransfersApi#deleteAssetTransferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTransfersApi#deleteAssetTransferAsync")
    e.printStackTrace()
}
```

### Parameters
| **transferId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetTransferAsync"></a>
# **getAssetTransferAsync**
> AssetTransferDtoEnvelope getAssetTransferAsync(transferId, tenantId)

Gets a single asset transfer by ID

Retrieves a specific asset transfer by its ID for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTransfersApi()
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetTransferDtoEnvelope = apiInstance.getAssetTransferAsync(transferId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTransfersApi#getAssetTransferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTransfersApi#getAssetTransferAsync")
    e.printStackTrace()
}
```

### Parameters
| **transferId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetTransferDtoEnvelope**](AssetTransferDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetTransfersAsync"></a>
# **getAssetTransfersAsync**
> AssetTransferDtoListEnvelope getAssetTransfersAsync(tenantId)

Gets a list of asset transfers

Retrieves all asset transfers for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTransfersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetTransferDtoListEnvelope = apiInstance.getAssetTransfersAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTransfersApi#getAssetTransfersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTransfersApi#getAssetTransfersAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetTransferDtoListEnvelope**](AssetTransferDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetTransfersCountAsync"></a>
# **getAssetTransfersCountAsync**
> Int32Envelope getAssetTransfersCountAsync(tenantId)

Gets the count of asset transfers

Returns the total number of asset transfers for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTransfersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetTransfersCountAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTransfersApi#getAssetTransfersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTransfersApi#getAssetTransfersCountAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateAssetTransferAsync"></a>
# **updateAssetTransferAsync**
> EmptyEnvelope updateAssetTransferAsync(transferId, tenantId, assetTransferUpdateDto)

Updates an existing asset transfer

Updates an existing asset transfer for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTransfersApi()
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetTransferUpdateDto : AssetTransferUpdateDto =  // AssetTransferUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAssetTransferAsync(transferId, tenantId, assetTransferUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTransfersApi#updateAssetTransferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTransfersApi#updateAssetTransferAsync")
    e.printStackTrace()
}
```

### Parameters
| **transferId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetTransferUpdateDto** | [**AssetTransferUpdateDto**](AssetTransferUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

