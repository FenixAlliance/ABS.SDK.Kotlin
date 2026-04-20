# AssetsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAsset**](AssetsApi.md#createAsset) | **POST** /api/v2/AssetsService/Assets | Creates a new asset |
| [**createAssetAssetCategory**](AssetsApi.md#createAssetAssetCategory) | **POST** /api/v2/AssetsService/Assets/Categories | Creates a new asset category |
| [**createAssetDepreciationRecord**](AssetsApi.md#createAssetDepreciationRecord) | **POST** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords | Creates a new depreciation record for an asset |
| [**createAssetRepair**](AssetsApi.md#createAssetRepair) | **POST** /api/v2/AssetsService/Assets/{assetId}/Repairs | Creates a new repair for an asset |
| [**createAssetTransfer**](AssetsApi.md#createAssetTransfer) | **POST** /api/v2/AssetsService/Assets/{assetId}/Transfers | Creates a new transfer for an asset |
| [**createAssetValueAmend**](AssetsApi.md#createAssetValueAmend) | **POST** /api/v2/AssetsService/Assets/{assetId}/ValueAmends | Creates a new value amendment for an asset |
| [**deleteAsset**](AssetsApi.md#deleteAsset) | **DELETE** /api/v2/AssetsService/Assets/{assetId} | Deletes an existing asset |
| [**deleteAssetAssetCategory**](AssetsApi.md#deleteAssetAssetCategory) | **DELETE** /api/v2/AssetsService/Assets/Categories/{categoryId} | Deletes an existing asset category |
| [**deleteAssetDepreciationRecord**](AssetsApi.md#deleteAssetDepreciationRecord) | **DELETE** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords/{recordId} | Deletes a depreciation record for an asset |
| [**deleteAssetRepair**](AssetsApi.md#deleteAssetRepair) | **DELETE** /api/v2/AssetsService/Assets/{assetId}/Repairs/{repairId} | Deletes a repair for an asset |
| [**deleteAssetTransfer**](AssetsApi.md#deleteAssetTransfer) | **DELETE** /api/v2/AssetsService/Assets/{assetId}/Transfers/{transferId} | Deletes a transfer for an asset |
| [**deleteAssetValueAmend**](AssetsApi.md#deleteAssetValueAmend) | **DELETE** /api/v2/AssetsService/Assets/{assetId}/ValueAmends/{amendId} | Deletes a value amendment for an asset |
| [**getAsset**](AssetsApi.md#getAsset) | **GET** /api/v2/AssetsService/Assets/{assetId} | Gets a specific asset by ID |
| [**getAssetAssetCategories**](AssetsApi.md#getAssetAssetCategories) | **GET** /api/v2/AssetsService/Assets/Categories | Gets all asset categories |
| [**getAssetAssetCategoriesCount**](AssetsApi.md#getAssetAssetCategoriesCount) | **GET** /api/v2/AssetsService/Assets/Categories/count | Gets the count of asset categories |
| [**getAssetAssetCategory**](AssetsApi.md#getAssetAssetCategory) | **GET** /api/v2/AssetsService/Assets/Categories/{categoryId} | Gets a specific asset category |
| [**getAssetDepreciationRecord**](AssetsApi.md#getAssetDepreciationRecord) | **GET** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords/{recordId} | Gets a specific depreciation record for an asset |
| [**getAssetDepreciationRecords**](AssetsApi.md#getAssetDepreciationRecords) | **GET** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords | Gets depreciation records for a specific asset |
| [**getAssetDepreciationRecordsCount**](AssetsApi.md#getAssetDepreciationRecordsCount) | **GET** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords/Count | Gets count of depreciation records for a specific asset |
| [**getAssetRepair**](AssetsApi.md#getAssetRepair) | **GET** /api/v2/AssetsService/Assets/{assetId}/Repairs/{repairId} | Gets a specific repair for an asset |
| [**getAssetRepairs**](AssetsApi.md#getAssetRepairs) | **GET** /api/v2/AssetsService/Assets/{assetId}/Repairs | Gets repairs for a specific asset |
| [**getAssetRepairsCount**](AssetsApi.md#getAssetRepairsCount) | **GET** /api/v2/AssetsService/Assets/{assetId}/Repairs/Count | Gets count of repairs for a specific asset |
| [**getAssetTransfer**](AssetsApi.md#getAssetTransfer) | **GET** /api/v2/AssetsService/Assets/{assetId}/Transfers/{transferId} | Gets a specific transfer for an asset |
| [**getAssetTransfers**](AssetsApi.md#getAssetTransfers) | **GET** /api/v2/AssetsService/Assets/{assetId}/Transfers | Gets transfers for a specific asset |
| [**getAssetTransfersCount**](AssetsApi.md#getAssetTransfersCount) | **GET** /api/v2/AssetsService/Assets/{assetId}/Transfers/Count | Gets count of transfers for a specific asset |
| [**getAssetValueAmend**](AssetsApi.md#getAssetValueAmend) | **GET** /api/v2/AssetsService/Assets/{assetId}/ValueAmends/{amendId} | Gets a specific value amendment for an asset |
| [**getAssetValueAmends**](AssetsApi.md#getAssetValueAmends) | **GET** /api/v2/AssetsService/Assets/{assetId}/ValueAmends | Gets value amendments for a specific asset |
| [**getAssetValueAmendsCount**](AssetsApi.md#getAssetValueAmendsCount) | **GET** /api/v2/AssetsService/Assets/{assetId}/ValueAmends/Count | Gets count of value amendments for a specific asset |
| [**getAssets**](AssetsApi.md#getAssets) | **GET** /api/v2/AssetsService/Assets | Gets all assets for the current tenant |
| [**getAssetsCount**](AssetsApi.md#getAssetsCount) | **GET** /api/v2/AssetsService/Assets/count | Gets the count of assets |
| [**updateAsset**](AssetsApi.md#updateAsset) | **PUT** /api/v2/AssetsService/Assets/{assetId} | Updates an existing asset |
| [**updateAssetAssetCategory**](AssetsApi.md#updateAssetAssetCategory) | **PUT** /api/v2/AssetsService/Assets/Categories/{categoryId} | Updates an existing asset category |
| [**updateAssetDepreciationRecord**](AssetsApi.md#updateAssetDepreciationRecord) | **PUT** /api/v2/AssetsService/Assets/{assetId}/DepreciationRecords/{recordId} | Updates a depreciation record for an asset |
| [**updateAssetRepair**](AssetsApi.md#updateAssetRepair) | **PUT** /api/v2/AssetsService/Assets/{assetId}/Repairs/{repairId} | Updates a repair for an asset |
| [**updateAssetTransfer**](AssetsApi.md#updateAssetTransfer) | **PUT** /api/v2/AssetsService/Assets/{assetId}/Transfers/{transferId} | Updates a transfer for an asset |
| [**updateAssetValueAmend**](AssetsApi.md#updateAssetValueAmend) | **PUT** /api/v2/AssetsService/Assets/{assetId}/ValueAmends/{amendId} | Updates a value amendment for an asset |


<a id="createAsset"></a>
# **createAsset**
> AssetDtoEnvelope createAsset(tenantId, assetCreateDto)

Creates a new asset

Creates a new asset for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetCreateDto : AssetCreateDto =  // AssetCreateDto | 
try {
    val result : AssetDtoEnvelope = apiInstance.createAsset(tenantId, assetCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#createAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#createAsset")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetCreateDto** | [**AssetCreateDto**](AssetCreateDto.md)|  | [optional] |

### Return type

[**AssetDtoEnvelope**](AssetDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAssetAssetCategory"></a>
# **createAssetAssetCategory**
> AssetCategoryDtoEnvelope createAssetAssetCategory(tenantId, assetCategoryCreateDto)

Creates a new asset category

Creates a new asset category for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetCategoryCreateDto : AssetCategoryCreateDto =  // AssetCategoryCreateDto | 
try {
    val result : AssetCategoryDtoEnvelope = apiInstance.createAssetAssetCategory(tenantId, assetCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#createAssetAssetCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#createAssetAssetCategory")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetCategoryCreateDto** | [**AssetCategoryCreateDto**](AssetCategoryCreateDto.md)|  | [optional] |

### Return type

[**AssetCategoryDtoEnvelope**](AssetCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAssetDepreciationRecord"></a>
# **createAssetDepreciationRecord**
> EmptyEnvelope createAssetDepreciationRecord(assetId, tenantId, assetDepreciationRecordCreateDto)

Creates a new depreciation record for an asset

Creates a new depreciation record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetDepreciationRecordCreateDto : AssetDepreciationRecordCreateDto =  // AssetDepreciationRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAssetDepreciationRecord(assetId, tenantId, assetDepreciationRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#createAssetDepreciationRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#createAssetDepreciationRecord")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetDepreciationRecordCreateDto** | [**AssetDepreciationRecordCreateDto**](AssetDepreciationRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAssetRepair"></a>
# **createAssetRepair**
> EmptyEnvelope createAssetRepair(assetId, tenantId, assetRepairCreateDto)

Creates a new repair for an asset

Creates a new repair record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetRepairCreateDto : AssetRepairCreateDto =  // AssetRepairCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAssetRepair(assetId, tenantId, assetRepairCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#createAssetRepair")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#createAssetRepair")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetRepairCreateDto** | [**AssetRepairCreateDto**](AssetRepairCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAssetTransfer"></a>
# **createAssetTransfer**
> EmptyEnvelope createAssetTransfer(assetId, tenantId, assetTransferCreateDto)

Creates a new transfer for an asset

Creates a new transfer record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetTransferCreateDto : AssetTransferCreateDto =  // AssetTransferCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAssetTransfer(assetId, tenantId, assetTransferCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#createAssetTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#createAssetTransfer")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="createAssetValueAmend"></a>
# **createAssetValueAmend**
> EmptyEnvelope createAssetValueAmend(assetId, tenantId, assetValueAmendCreateDto)

Creates a new value amendment for an asset

Creates a new value amendment record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetValueAmendCreateDto : AssetValueAmendCreateDto =  // AssetValueAmendCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAssetValueAmend(assetId, tenantId, assetValueAmendCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#createAssetValueAmend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#createAssetValueAmend")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetValueAmendCreateDto** | [**AssetValueAmendCreateDto**](AssetValueAmendCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAsset"></a>
# **deleteAsset**
> deleteAsset(assetId, tenantId)

Deletes an existing asset

Deletes an existing asset for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteAsset(assetId, tenantId)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deleteAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deleteAsset")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="deleteAssetAssetCategory"></a>
# **deleteAssetAssetCategory**
> deleteAssetAssetCategory(categoryId, tenantId)

Deletes an existing asset category

Deletes an existing asset category for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteAssetAssetCategory(categoryId, tenantId)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deleteAssetAssetCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deleteAssetAssetCategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **java.util.UUID**|  | |
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

<a id="deleteAssetDepreciationRecord"></a>
# **deleteAssetDepreciationRecord**
> EmptyEnvelope deleteAssetDepreciationRecord(assetId, recordId, tenantId)

Deletes a depreciation record for an asset

Deletes a depreciation record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAssetDepreciationRecord(assetId, recordId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deleteAssetDepreciationRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deleteAssetDepreciationRecord")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **recordId** | **java.util.UUID**|  | |
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

<a id="deleteAssetRepair"></a>
# **deleteAssetRepair**
> EmptyEnvelope deleteAssetRepair(assetId, repairId, tenantId)

Deletes a repair for an asset

Deletes a repair record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val repairId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAssetRepair(assetId, repairId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deleteAssetRepair")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deleteAssetRepair")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **repairId** | **java.util.UUID**|  | |
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

<a id="deleteAssetTransfer"></a>
# **deleteAssetTransfer**
> EmptyEnvelope deleteAssetTransfer(assetId, transferId, tenantId)

Deletes a transfer for an asset

Deletes a transfer record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAssetTransfer(assetId, transferId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deleteAssetTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deleteAssetTransfer")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="deleteAssetValueAmend"></a>
# **deleteAssetValueAmend**
> EmptyEnvelope deleteAssetValueAmend(assetId, amendId, tenantId)

Deletes a value amendment for an asset

Deletes a value amendment record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val amendId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAssetValueAmend(assetId, amendId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#deleteAssetValueAmend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#deleteAssetValueAmend")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **amendId** | **java.util.UUID**|  | |
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

<a id="getAsset"></a>
# **getAsset**
> AssetDtoEnvelope getAsset(assetId, tenantId)

Gets a specific asset by ID

Retrieves a specific asset for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetDtoEnvelope = apiInstance.getAsset(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAsset")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetDtoEnvelope**](AssetDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetAssetCategories"></a>
# **getAssetAssetCategories**
> AssetCategoryDtoListEnvelope getAssetAssetCategories(tenantId)

Gets all asset categories

Retrieves all asset categories for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetCategoryDtoListEnvelope = apiInstance.getAssetAssetCategories(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetAssetCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetAssetCategories")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetCategoryDtoListEnvelope**](AssetCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetAssetCategoriesCount"></a>
# **getAssetAssetCategoriesCount**
> Int32Envelope getAssetAssetCategoriesCount(tenantId)

Gets the count of asset categories

Returns the total number of asset categories for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetAssetCategoriesCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetAssetCategoriesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetAssetCategoriesCount")
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

<a id="getAssetAssetCategory"></a>
# **getAssetAssetCategory**
> AssetCategoryDtoEnvelope getAssetAssetCategory(categoryId, tenantId)

Gets a specific asset category

Retrieves a specific asset category for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetCategoryDtoEnvelope = apiInstance.getAssetAssetCategory(categoryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetAssetCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetAssetCategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetCategoryDtoEnvelope**](AssetCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetDepreciationRecord"></a>
# **getAssetDepreciationRecord**
> AssetDepreciationRecordDtoEnvelope getAssetDepreciationRecord(assetId, recordId, tenantId)

Gets a specific depreciation record for an asset

Retrieves a specific depreciation record by ID for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetDepreciationRecordDtoEnvelope = apiInstance.getAssetDepreciationRecord(assetId, recordId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetDepreciationRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetDepreciationRecord")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **recordId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetDepreciationRecordDtoEnvelope**](AssetDepreciationRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetDepreciationRecords"></a>
# **getAssetDepreciationRecords**
> AssetDepreciationRecordDtoListEnvelope getAssetDepreciationRecords(assetId, tenantId)

Gets depreciation records for a specific asset

Retrieves all depreciation records for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetDepreciationRecordDtoListEnvelope = apiInstance.getAssetDepreciationRecords(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetDepreciationRecords")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetDepreciationRecords")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetDepreciationRecordDtoListEnvelope**](AssetDepreciationRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetDepreciationRecordsCount"></a>
# **getAssetDepreciationRecordsCount**
> Int32Envelope getAssetDepreciationRecordsCount(assetId, tenantId)

Gets count of depreciation records for a specific asset

Returns the total number of depreciation records for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetDepreciationRecordsCount(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetDepreciationRecordsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetDepreciationRecordsCount")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="getAssetRepair"></a>
# **getAssetRepair**
> AssetRepairDtoEnvelope getAssetRepair(assetId, repairId, tenantId)

Gets a specific repair for an asset

Retrieves a specific repair record by ID for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val repairId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetRepairDtoEnvelope = apiInstance.getAssetRepair(assetId, repairId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetRepair")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetRepair")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **repairId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetRepairDtoEnvelope**](AssetRepairDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetRepairs"></a>
# **getAssetRepairs**
> AssetRepairDtoListEnvelope getAssetRepairs(assetId, tenantId)

Gets repairs for a specific asset

Retrieves all repair records for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetRepairDtoListEnvelope = apiInstance.getAssetRepairs(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetRepairs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetRepairs")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetRepairDtoListEnvelope**](AssetRepairDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetRepairsCount"></a>
# **getAssetRepairsCount**
> Int32Envelope getAssetRepairsCount(assetId, tenantId)

Gets count of repairs for a specific asset

Returns the total number of repair records for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetRepairsCount(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetRepairsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetRepairsCount")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="getAssetTransfer"></a>
# **getAssetTransfer**
> AssetTransferDtoEnvelope getAssetTransfer(assetId, transferId, tenantId)

Gets a specific transfer for an asset

Retrieves a specific transfer record by ID for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetTransferDtoEnvelope = apiInstance.getAssetTransfer(assetId, transferId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetTransfer")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="getAssetTransfers"></a>
# **getAssetTransfers**
> AssetTransferDtoListEnvelope getAssetTransfers(assetId, tenantId)

Gets transfers for a specific asset

Retrieves all transfer records for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetTransferDtoListEnvelope = apiInstance.getAssetTransfers(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetTransfers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetTransfers")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="getAssetTransfersCount"></a>
# **getAssetTransfersCount**
> Int32Envelope getAssetTransfersCount(assetId, tenantId)

Gets count of transfers for a specific asset

Returns the total number of transfer records for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetTransfersCount(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetTransfersCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetTransfersCount")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="getAssetValueAmend"></a>
# **getAssetValueAmend**
> AssetValueAmendDtoEnvelope getAssetValueAmend(assetId, amendId, tenantId)

Gets a specific value amendment for an asset

Retrieves a specific value amendment record by ID for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val amendId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetValueAmendDtoEnvelope = apiInstance.getAssetValueAmend(assetId, amendId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetValueAmend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetValueAmend")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **amendId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetValueAmendDtoEnvelope**](AssetValueAmendDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetValueAmends"></a>
# **getAssetValueAmends**
> AssetValueAmendDtoListEnvelope getAssetValueAmends(assetId, tenantId)

Gets value amendments for a specific asset

Retrieves all value amendment records for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetValueAmendDtoListEnvelope = apiInstance.getAssetValueAmends(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetValueAmends")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetValueAmends")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetValueAmendDtoListEnvelope**](AssetValueAmendDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetValueAmendsCount"></a>
# **getAssetValueAmendsCount**
> Int32Envelope getAssetValueAmendsCount(assetId, tenantId)

Gets count of value amendments for a specific asset

Returns the total number of value amendment records for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetValueAmendsCount(assetId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetValueAmendsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetValueAmendsCount")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="getAssets"></a>
# **getAssets**
> AssetDtoListEnvelope getAssets(tenantId)

Gets all assets for the current tenant

Retrieves all assets for the authenticated tenant with optional filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetDtoListEnvelope = apiInstance.getAssets(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssets")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**AssetDtoListEnvelope**](AssetDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAssetsCount"></a>
# **getAssetsCount**
> Int32Envelope getAssetsCount(tenantId)

Gets the count of assets

Returns the total number of assets for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetsCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetsCount")
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

<a id="updateAsset"></a>
# **updateAsset**
> AssetDtoEnvelope updateAsset(assetId, tenantId, assetUpdateDto)

Updates an existing asset

Updates an existing asset for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetUpdateDto : AssetUpdateDto =  // AssetUpdateDto | 
try {
    val result : AssetDtoEnvelope = apiInstance.updateAsset(assetId, tenantId, assetUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#updateAsset")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#updateAsset")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetUpdateDto** | [**AssetUpdateDto**](AssetUpdateDto.md)|  | [optional] |

### Return type

[**AssetDtoEnvelope**](AssetDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAssetAssetCategory"></a>
# **updateAssetAssetCategory**
> AssetCategoryDtoEnvelope updateAssetAssetCategory(categoryId, tenantId, assetCategoryUpdateDto)

Updates an existing asset category

Updates an existing asset category for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetCategoryUpdateDto : AssetCategoryUpdateDto =  // AssetCategoryUpdateDto | 
try {
    val result : AssetCategoryDtoEnvelope = apiInstance.updateAssetAssetCategory(categoryId, tenantId, assetCategoryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#updateAssetAssetCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#updateAssetAssetCategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetCategoryUpdateDto** | [**AssetCategoryUpdateDto**](AssetCategoryUpdateDto.md)|  | [optional] |

### Return type

[**AssetCategoryDtoEnvelope**](AssetCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAssetDepreciationRecord"></a>
# **updateAssetDepreciationRecord**
> EmptyEnvelope updateAssetDepreciationRecord(assetId, recordId, tenantId, assetDepreciationRecordUpdateDto)

Updates a depreciation record for an asset

Updates an existing depreciation record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val recordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetDepreciationRecordUpdateDto : AssetDepreciationRecordUpdateDto =  // AssetDepreciationRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAssetDepreciationRecord(assetId, recordId, tenantId, assetDepreciationRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#updateAssetDepreciationRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#updateAssetDepreciationRecord")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **recordId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetDepreciationRecordUpdateDto** | [**AssetDepreciationRecordUpdateDto**](AssetDepreciationRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAssetRepair"></a>
# **updateAssetRepair**
> EmptyEnvelope updateAssetRepair(assetId, repairId, tenantId, assetRepairUpdateDto)

Updates a repair for an asset

Updates an existing repair record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val repairId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetRepairUpdateDto : AssetRepairUpdateDto =  // AssetRepairUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAssetRepair(assetId, repairId, tenantId, assetRepairUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#updateAssetRepair")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#updateAssetRepair")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **repairId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetRepairUpdateDto** | [**AssetRepairUpdateDto**](AssetRepairUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAssetTransfer"></a>
# **updateAssetTransfer**
> EmptyEnvelope updateAssetTransfer(assetId, transferId, tenantId, assetTransferUpdateDto)

Updates a transfer for an asset

Updates an existing transfer record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetTransferUpdateDto : AssetTransferUpdateDto =  // AssetTransferUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAssetTransfer(assetId, transferId, tenantId, assetTransferUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#updateAssetTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#updateAssetTransfer")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
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

<a id="updateAssetValueAmend"></a>
# **updateAssetValueAmend**
> EmptyEnvelope updateAssetValueAmend(assetId, amendId, tenantId, assetValueAmendUpdateDto)

Updates a value amendment for an asset

Updates an existing value amendment record for the specified asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val assetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val amendId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetValueAmendUpdateDto : AssetValueAmendUpdateDto =  // AssetValueAmendUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAssetValueAmend(assetId, amendId, tenantId, assetValueAmendUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#updateAssetValueAmend")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#updateAssetValueAmend")
    e.printStackTrace()
}
```

### Parameters
| **assetId** | **java.util.UUID**|  | |
| **amendId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assetValueAmendUpdateDto** | [**AssetValueAmendUpdateDto**](AssetValueAmendUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

