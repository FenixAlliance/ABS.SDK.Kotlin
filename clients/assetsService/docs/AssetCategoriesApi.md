# AssetCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAssetCategory**](AssetCategoriesApi.md#createAssetCategory) | **POST** /api/v2/AssetsService/AssetCategories | Creates a new asset category |
| [**deleteAssetCategory**](AssetCategoriesApi.md#deleteAssetCategory) | **DELETE** /api/v2/AssetsService/AssetCategories/{categoryId} | Deletes an asset category |
| [**getAssetCategories**](AssetCategoriesApi.md#getAssetCategories) | **GET** /api/v2/AssetsService/AssetCategories | Gets all asset categories for the current tenant |
| [**getAssetCategoriesCount**](AssetCategoriesApi.md#getAssetCategoriesCount) | **GET** /api/v2/AssetsService/AssetCategories/count | Gets the count of asset categories |
| [**getAssetCategory**](AssetCategoriesApi.md#getAssetCategory) | **GET** /api/v2/AssetsService/AssetCategories/{categoryId} | Gets a specific asset category |
| [**updateAssetCategory**](AssetCategoriesApi.md#updateAssetCategory) | **PUT** /api/v2/AssetsService/AssetCategories/{categoryId} | Updates an existing asset category |


<a id="createAssetCategory"></a>
# **createAssetCategory**
> AssetCategoryDtoEnvelope createAssetCategory(tenantId, assetCategoryCreateDto)

Creates a new asset category

Creates a new asset category for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetCategoryCreateDto : AssetCategoryCreateDto =  // AssetCategoryCreateDto | 
try {
    val result : AssetCategoryDtoEnvelope = apiInstance.createAssetCategory(tenantId, assetCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetCategoriesApi#createAssetCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetCategoriesApi#createAssetCategory")
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

<a id="deleteAssetCategory"></a>
# **deleteAssetCategory**
> deleteAssetCategory(categoryId, tenantId)

Deletes an asset category

Deletes an asset category for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetCategoriesApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    apiInstance.deleteAssetCategory(categoryId, tenantId)
} catch (e: ClientException) {
    println("4xx response calling AssetCategoriesApi#deleteAssetCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetCategoriesApi#deleteAssetCategory")
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

<a id="getAssetCategories"></a>
# **getAssetCategories**
> AssetCategoryDtoListEnvelope getAssetCategories(tenantId)

Gets all asset categories for the current tenant

Retrieves all asset categories for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetCategoryDtoListEnvelope = apiInstance.getAssetCategories(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetCategoriesApi#getAssetCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetCategoriesApi#getAssetCategories")
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

<a id="getAssetCategoriesCount"></a>
# **getAssetCategoriesCount**
> Int32Envelope getAssetCategoriesCount(tenantId)

Gets the count of asset categories

Returns the total number of asset categories for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getAssetCategoriesCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetCategoriesApi#getAssetCategoriesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetCategoriesApi#getAssetCategoriesCount")
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

<a id="getAssetCategory"></a>
# **getAssetCategory**
> AssetCategoryDtoEnvelope getAssetCategory(categoryId, tenantId)

Gets a specific asset category

Retrieves a specific asset category by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetCategoriesApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : AssetCategoryDtoEnvelope = apiInstance.getAssetCategory(categoryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetCategoriesApi#getAssetCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetCategoriesApi#getAssetCategory")
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

<a id="updateAssetCategory"></a>
# **updateAssetCategory**
> EmptyEnvelope updateAssetCategory(categoryId, tenantId, assetCategoryUpdateDto)

Updates an existing asset category

Updates an existing asset category for the authenticated tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetCategoriesApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val assetCategoryUpdateDto : AssetCategoryUpdateDto =  // AssetCategoryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAssetCategory(categoryId, tenantId, assetCategoryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetCategoriesApi#updateAssetCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetCategoriesApi#updateAssetCategory")
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

