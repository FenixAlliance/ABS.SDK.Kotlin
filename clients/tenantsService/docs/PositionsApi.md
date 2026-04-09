# PositionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantPosition**](PositionsApi.md#createTenantPosition) | **POST** /api/v2/TenantsService/Positions | Create a new tenant position |
| [**deleteTenantPosition**](PositionsApi.md#deleteTenantPosition) | **DELETE** /api/v2/TenantsService/Positions/{tenantPositionId} | Delete a tenant position |
| [**getTenantPositionById**](PositionsApi.md#getTenantPositionById) | **GET** /api/v2/TenantsService/Positions/{tenantPositionId} | Retrieve a single tenant position by its ID |
| [**getTenantPositions**](PositionsApi.md#getTenantPositions) | **GET** /api/v2/TenantsService/Positions | Retrieve a list of tenant positions |
| [**getTenantPositionsCount**](PositionsApi.md#getTenantPositionsCount) | **GET** /api/v2/TenantsService/Positions/Count | Get the count of tenant positions |
| [**updateTenantPosition**](PositionsApi.md#updateTenantPosition) | **PUT** /api/v2/TenantsService/Positions/{tenantPositionId} | Update a tenant position |


<a id="createTenantPosition"></a>
# **createTenantPosition**
> EmptyEnvelope createTenantPosition(tenantId, apiVersion, xApiVersion, tenantPositionCreateDto)

Create a new tenant position

Create a new tenant position

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PositionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantPositionCreateDto : TenantPositionCreateDto =  // TenantPositionCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantPosition(tenantId, apiVersion, xApiVersion, tenantPositionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PositionsApi#createTenantPosition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PositionsApi#createTenantPosition")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantPositionCreateDto** | [**TenantPositionCreateDto**](TenantPositionCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantPosition"></a>
# **deleteTenantPosition**
> EmptyEnvelope deleteTenantPosition(tenantPositionId, tenantId, apiVersion, xApiVersion)

Delete a tenant position

Delete a tenant position

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PositionsApi()
val tenantPositionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantPosition(tenantPositionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PositionsApi#deleteTenantPosition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PositionsApi#deleteTenantPosition")
    e.printStackTrace()
}
```

### Parameters
| **tenantPositionId** | **java.util.UUID**|  | |
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

<a id="getTenantPositionById"></a>
# **getTenantPositionById**
> TenantPositionDtoEnvelope getTenantPositionById(tenantPositionId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant position by its ID

Retrieve a single tenant position by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PositionsApi()
val tenantPositionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantPositionDtoEnvelope = apiInstance.getTenantPositionById(tenantPositionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PositionsApi#getTenantPositionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PositionsApi#getTenantPositionById")
    e.printStackTrace()
}
```

### Parameters
| **tenantPositionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantPositionDtoEnvelope**](TenantPositionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantPositions"></a>
# **getTenantPositions**
> TenantPositionDtoListEnvelope getTenantPositions(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant positions

Retrieve a list of tenant positions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PositionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantPositionDtoListEnvelope = apiInstance.getTenantPositions(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PositionsApi#getTenantPositions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PositionsApi#getTenantPositions")
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

[**TenantPositionDtoListEnvelope**](TenantPositionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantPositionsCount"></a>
# **getTenantPositionsCount**
> Int32Envelope getTenantPositionsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant positions

Get the count of tenant positions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PositionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantPositionsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PositionsApi#getTenantPositionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PositionsApi#getTenantPositionsCount")
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

<a id="updateTenantPosition"></a>
# **updateTenantPosition**
> EmptyEnvelope updateTenantPosition(tenantPositionId, tenantId, apiVersion, xApiVersion, tenantPositionUpdateDto)

Update a tenant position

Update a tenant position

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PositionsApi()
val tenantPositionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantPositionUpdateDto : TenantPositionUpdateDto =  // TenantPositionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantPosition(tenantPositionId, tenantId, apiVersion, xApiVersion, tenantPositionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PositionsApi#updateTenantPosition")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PositionsApi#updateTenantPosition")
    e.printStackTrace()
}
```

### Parameters
| **tenantPositionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantPositionUpdateDto** | [**TenantPositionUpdateDto**](TenantPositionUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

