# TerritoriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantTerritory**](TerritoriesApi.md#createTenantTerritory) | **POST** /api/v2/TenantsService/Territories | Create a new tenant territory |
| [**deleteTenantTerritory**](TerritoriesApi.md#deleteTenantTerritory) | **DELETE** /api/v2/TenantsService/Territories/{tenantTerritoryId} | Delete a tenant territory |
| [**getTenantTerritories**](TerritoriesApi.md#getTenantTerritories) | **GET** /api/v2/TenantsService/Territories | Retrieve a list of tenant territories |
| [**getTenantTerritoriesCount**](TerritoriesApi.md#getTenantTerritoriesCount) | **GET** /api/v2/TenantsService/Territories/Count | Get the count of tenant territories |
| [**getTenantTerritoryById**](TerritoriesApi.md#getTenantTerritoryById) | **GET** /api/v2/TenantsService/Territories/{tenantTerritoryId} | Retrieve a single tenant territory by its ID |
| [**updateTenantTerritory**](TerritoriesApi.md#updateTenantTerritory) | **PUT** /api/v2/TenantsService/Territories/{tenantTerritoryId} | Update a tenant territory |


<a id="createTenantTerritory"></a>
# **createTenantTerritory**
> EmptyEnvelope createTenantTerritory(tenantId, apiVersion, xApiVersion, tenantTerritoryCreateDto)

Create a new tenant territory

Create a new tenant territory

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TerritoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTerritoryCreateDto : TenantTerritoryCreateDto =  // TenantTerritoryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantTerritory(tenantId, apiVersion, xApiVersion, tenantTerritoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerritoriesApi#createTenantTerritory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerritoriesApi#createTenantTerritory")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTerritoryCreateDto** | [**TenantTerritoryCreateDto**](TenantTerritoryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantTerritory"></a>
# **deleteTenantTerritory**
> EmptyEnvelope deleteTenantTerritory(tenantTerritoryId, tenantId, apiVersion, xApiVersion)

Delete a tenant territory

Delete a tenant territory

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TerritoriesApi()
val tenantTerritoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantTerritory(tenantTerritoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerritoriesApi#deleteTenantTerritory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerritoriesApi#deleteTenantTerritory")
    e.printStackTrace()
}
```

### Parameters
| **tenantTerritoryId** | **java.util.UUID**|  | |
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

<a id="getTenantTerritories"></a>
# **getTenantTerritories**
> TenantTerritoryDtoListEnvelope getTenantTerritories(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant territories

Retrieve a list of tenant territories

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TerritoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTerritoryDtoListEnvelope = apiInstance.getTenantTerritories(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerritoriesApi#getTenantTerritories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerritoriesApi#getTenantTerritories")
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

[**TenantTerritoryDtoListEnvelope**](TenantTerritoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTerritoriesCount"></a>
# **getTenantTerritoriesCount**
> Int32Envelope getTenantTerritoriesCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant territories

Get the count of tenant territories

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TerritoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantTerritoriesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerritoriesApi#getTenantTerritoriesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerritoriesApi#getTenantTerritoriesCount")
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

<a id="getTenantTerritoryById"></a>
# **getTenantTerritoryById**
> TenantTerritoryDtoEnvelope getTenantTerritoryById(tenantTerritoryId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant territory by its ID

Retrieve a single tenant territory by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TerritoriesApi()
val tenantTerritoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTerritoryDtoEnvelope = apiInstance.getTenantTerritoryById(tenantTerritoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerritoriesApi#getTenantTerritoryById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerritoriesApi#getTenantTerritoryById")
    e.printStackTrace()
}
```

### Parameters
| **tenantTerritoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantTerritoryDtoEnvelope**](TenantTerritoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateTenantTerritory"></a>
# **updateTenantTerritory**
> EmptyEnvelope updateTenantTerritory(tenantTerritoryId, tenantId, apiVersion, xApiVersion, tenantTerritoryUpdateDto)

Update a tenant territory

Update a tenant territory

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TerritoriesApi()
val tenantTerritoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTerritoryUpdateDto : TenantTerritoryUpdateDto =  // TenantTerritoryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantTerritory(tenantTerritoryId, tenantId, apiVersion, xApiVersion, tenantTerritoryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TerritoriesApi#updateTenantTerritory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TerritoriesApi#updateTenantTerritory")
    e.printStackTrace()
}
```

### Parameters
| **tenantTerritoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTerritoryUpdateDto** | [**TenantTerritoryUpdateDto**](TenantTerritoryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

