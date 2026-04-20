# AssetTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAssetType**](AssetTypesApi.md#createAssetType) | **POST** /api/v2/AssetsService/AssetTypes | Creates a new asset type |
| [**deleteAssetType**](AssetTypesApi.md#deleteAssetType) | **DELETE** /api/v2/AssetsService/AssetTypes/{typeId} | Deletes an asset type |
| [**getAssetType**](AssetTypesApi.md#getAssetType) | **GET** /api/v2/AssetsService/AssetTypes/{typeId} | Gets a specific asset type |
| [**getAssetTypes**](AssetTypesApi.md#getAssetTypes) | **GET** /api/v2/AssetsService/AssetTypes | Gets all asset types for the current tenant |
| [**getAssetTypesCount**](AssetTypesApi.md#getAssetTypesCount) | **GET** /api/v2/AssetsService/AssetTypes/count | Gets the count of asset types |
| [**updateAssetType**](AssetTypesApi.md#updateAssetType) | **PUT** /api/v2/AssetsService/AssetTypes/{typeId} | Updates an existing asset type |


<a id="createAssetType"></a>
# **createAssetType**
> AssetTypeDtoEnvelope createAssetType(tenantId, assetTypeCreateDto)

Creates a new asset type

Creates a new asset type for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetTypeCreateDto : AssetTypeCreateDto =  // AssetTypeCreateDto | 
try {
    val result : AssetTypeDtoEnvelope = apiInstance.createAssetType(tenantId, assetTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTypesApi#createAssetType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTypesApi#createAssetType")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetTypeCreateDto** | [**AssetTypeCreateDto**](AssetTypeCreateDto.md)|  | [optional] |

### Return type

[**AssetTypeDtoEnvelope**](AssetTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAssetType"></a>
# **deleteAssetType**
> deleteAssetType(typeId, tenantId)

Deletes an asset type

Deletes an asset type for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTypesApi()
val typeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteAssetType(typeId, tenantId)
} catch (e: ClientException) {
    println("4xx response calling AssetTypesApi#deleteAssetType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTypesApi#deleteAssetType")
    e.printStackTrace()
}
```

### Parameters
| **typeId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetType"></a>
# **getAssetType**
> AssetTypeDtoEnvelope getAssetType(typeId, tenantId)

Gets a specific asset type

Retrieves a specific asset type by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTypesApi()
val typeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetTypeDtoEnvelope = apiInstance.getAssetType(typeId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTypesApi#getAssetType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTypesApi#getAssetType")
    e.printStackTrace()
}
```

### Parameters
| **typeId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetTypeDtoEnvelope**](AssetTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetTypes"></a>
# **getAssetTypes**
> AssetTypeDtoListEnvelope getAssetTypes(tenantId)

Gets all asset types for the current tenant

Retrieves all asset types for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetTypeDtoListEnvelope = apiInstance.getAssetTypes(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTypesApi#getAssetTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTypesApi#getAssetTypes")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetTypeDtoListEnvelope**](AssetTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetTypesCount"></a>
# **getAssetTypesCount**
> Int32Envelope getAssetTypesCount(tenantId)

Gets the count of asset types

Returns the total number of asset types for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetTypesCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTypesApi#getAssetTypesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTypesApi#getAssetTypesCount")
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

<a id="updateAssetType"></a>
# **updateAssetType**
> EmptyEnvelope updateAssetType(typeId, tenantId, assetTypeUpdateDto)

Updates an existing asset type

Updates an existing asset type for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetTypesApi()
val typeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetTypeUpdateDto : AssetTypeUpdateDto =  // AssetTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAssetType(typeId, tenantId, assetTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetTypesApi#updateAssetType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetTypesApi#updateAssetType")
    e.printStackTrace()
}
```

### Parameters
| **typeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetTypeUpdateDto** | [**AssetTypeUpdateDto**](AssetTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

