# UnitsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantUnit**](UnitsApi.md#createTenantUnit) | **POST** /api/v2/TenantsService/Units | Create a new tenant unit |
| [**deleteTenantUnit**](UnitsApi.md#deleteTenantUnit) | **DELETE** /api/v2/TenantsService/Units/{tenantUnitId} | Delete a tenant unit |
| [**getTenantUnitById**](UnitsApi.md#getTenantUnitById) | **GET** /api/v2/TenantsService/Units/{tenantUnitId} | Retrieve a single tenant unit by its ID |
| [**getTenantUnits**](UnitsApi.md#getTenantUnits) | **GET** /api/v2/TenantsService/Units | Retrieve a list of tenant units |
| [**getTenantUnitsCount**](UnitsApi.md#getTenantUnitsCount) | **GET** /api/v2/TenantsService/Units/Count | Get the count of tenant units |
| [**updateTenantUnit**](UnitsApi.md#updateTenantUnit) | **PUT** /api/v2/TenantsService/Units/{tenantUnitId} | Update a tenant unit |


<a id="createTenantUnit"></a>
# **createTenantUnit**
> EmptyEnvelope createTenantUnit(tenantId, apiVersion, xApiVersion, tenantUnitCreateDto)

Create a new tenant unit

Create a new tenant unit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantUnitCreateDto : TenantUnitCreateDto =  // TenantUnitCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantUnit(tenantId, apiVersion, xApiVersion, tenantUnitCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitsApi#createTenantUnit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitsApi#createTenantUnit")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantUnitCreateDto** | [**TenantUnitCreateDto**](TenantUnitCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantUnit"></a>
# **deleteTenantUnit**
> EmptyEnvelope deleteTenantUnit(tenantUnitId, tenantId, apiVersion, xApiVersion)

Delete a tenant unit

Delete a tenant unit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitsApi()
val tenantUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantUnit(tenantUnitId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitsApi#deleteTenantUnit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitsApi#deleteTenantUnit")
    e.printStackTrace()
}
```

### Parameters
| **tenantUnitId** | **java.util.UUID**|  | |
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

<a id="getTenantUnitById"></a>
# **getTenantUnitById**
> TenantUnitDtoEnvelope getTenantUnitById(tenantUnitId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant unit by its ID

Retrieve a single tenant unit by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitsApi()
val tenantUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantUnitDtoEnvelope = apiInstance.getTenantUnitById(tenantUnitId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitsApi#getTenantUnitById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitsApi#getTenantUnitById")
    e.printStackTrace()
}
```

### Parameters
| **tenantUnitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantUnitDtoEnvelope**](TenantUnitDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantUnits"></a>
# **getTenantUnits**
> TenantUnitDtoListEnvelope getTenantUnits(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant units

Retrieve a list of tenant units

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantUnitDtoListEnvelope = apiInstance.getTenantUnits(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitsApi#getTenantUnits")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitsApi#getTenantUnits")
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

[**TenantUnitDtoListEnvelope**](TenantUnitDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantUnitsCount"></a>
# **getTenantUnitsCount**
> Int32Envelope getTenantUnitsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant units

Get the count of tenant units

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantUnitsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitsApi#getTenantUnitsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitsApi#getTenantUnitsCount")
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

<a id="updateTenantUnit"></a>
# **updateTenantUnit**
> EmptyEnvelope updateTenantUnit(tenantUnitId, tenantId, apiVersion, xApiVersion, tenantUnitUpdateDto)

Update a tenant unit

Update a tenant unit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitsApi()
val tenantUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantUnitUpdateDto : TenantUnitUpdateDto =  // TenantUnitUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantUnit(tenantUnitId, tenantId, apiVersion, xApiVersion, tenantUnitUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitsApi#updateTenantUnit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitsApi#updateTenantUnit")
    e.printStackTrace()
}
```

### Parameters
| **tenantUnitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantUnitUpdateDto** | [**TenantUnitUpdateDto**](TenantUnitUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

