# TypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantType**](TypesApi.md#createTenantType) | **POST** /api/v2/TenantsService/Types | Create a new tenant type |
| [**deleteTenantType**](TypesApi.md#deleteTenantType) | **DELETE** /api/v2/TenantsService/Types/{tenantTypeId} | Delete a tenant type |
| [**getTenantTypeById**](TypesApi.md#getTenantTypeById) | **GET** /api/v2/TenantsService/Types/{tenantTypeId} | Retrieve a single tenant type by its ID |
| [**getTenantTypes**](TypesApi.md#getTenantTypes) | **GET** /api/v2/TenantsService/Types | Retrieve a list of tenant types |
| [**getTenantTypesCount**](TypesApi.md#getTenantTypesCount) | **GET** /api/v2/TenantsService/Types/Count | Get the count of tenant types |
| [**updateTenantType**](TypesApi.md#updateTenantType) | **PUT** /api/v2/TenantsService/Types/{tenantTypeId} | Update a tenant type |


<a id="createTenantType"></a>
# **createTenantType**
> EmptyEnvelope createTenantType(tenantId, apiVersion, xApiVersion, tenantTypeCreateDto)

Create a new tenant type

Create a new tenant type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTypeCreateDto : TenantTypeCreateDto =  // TenantTypeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantType(tenantId, apiVersion, xApiVersion, tenantTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TypesApi#createTenantType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TypesApi#createTenantType")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTypeCreateDto** | [**TenantTypeCreateDto**](TenantTypeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantType"></a>
# **deleteTenantType**
> EmptyEnvelope deleteTenantType(tenantTypeId, tenantId, apiVersion, xApiVersion)

Delete a tenant type

Delete a tenant type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TypesApi()
val tenantTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantType(tenantTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TypesApi#deleteTenantType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TypesApi#deleteTenantType")
    e.printStackTrace()
}
```

### Parameters
| **tenantTypeId** | **java.util.UUID**|  | |
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

<a id="getTenantTypeById"></a>
# **getTenantTypeById**
> TenantTypeDtoEnvelope getTenantTypeById(tenantTypeId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant type by its ID

Retrieve a single tenant type by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TypesApi()
val tenantTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTypeDtoEnvelope = apiInstance.getTenantTypeById(tenantTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TypesApi#getTenantTypeById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TypesApi#getTenantTypeById")
    e.printStackTrace()
}
```

### Parameters
| **tenantTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantTypeDtoEnvelope**](TenantTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTypes"></a>
# **getTenantTypes**
> TenantTypeDtoListEnvelope getTenantTypes(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant types

Retrieve a list of tenant types

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTypeDtoListEnvelope = apiInstance.getTenantTypes(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TypesApi#getTenantTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TypesApi#getTenantTypes")
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

[**TenantTypeDtoListEnvelope**](TenantTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTypesCount"></a>
# **getTenantTypesCount**
> Int32Envelope getTenantTypesCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant types

Get the count of tenant types

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantTypesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TypesApi#getTenantTypesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TypesApi#getTenantTypesCount")
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

<a id="updateTenantType"></a>
# **updateTenantType**
> EmptyEnvelope updateTenantType(tenantTypeId, tenantId, apiVersion, xApiVersion, tenantTypeUpdateDto)

Update a tenant type

Update a tenant type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TypesApi()
val tenantTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTypeUpdateDto : TenantTypeUpdateDto =  // TenantTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantType(tenantTypeId, tenantId, apiVersion, xApiVersion, tenantTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TypesApi#updateTenantType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TypesApi#updateTenantType")
    e.printStackTrace()
}
```

### Parameters
| **tenantTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTypeUpdateDto** | [**TenantTypeUpdateDto**](TenantTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

