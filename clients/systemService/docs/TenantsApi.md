# TenantsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenant**](TenantsApi.md#createTenant) | **POST** /api/v2/SystemService/Tenants | Create a new tenant. |
| [**deleteTenant**](TenantsApi.md#deleteTenant) | **DELETE** /api/v2/SystemService/Tenants/{tenantId} | Delete a specific tenant by ID. |
| [**getAllExtendedTenants**](TenantsApi.md#getAllExtendedTenants) | **GET** /api/v2/SystemService/Tenants/Extended | Get all extended tenants available on this suite server instance. |
| [**getAllTenants**](TenantsApi.md#getAllTenants) | **GET** /api/v2/SystemService/Tenants | Get all tenants available on this suite server instance. |
| [**getExtendedTenantsCount**](TenantsApi.md#getExtendedTenantsCount) | **GET** /api/v2/SystemService/Tenants/Extended/Count | Get the total count of extended tenants available on this suite server instance. |
| [**getTenant**](TenantsApi.md#getTenant) | **GET** /api/v2/SystemService/Tenants/{tenantId} | Get a specific tenant by ID. |
| [**getTenantsCount**](TenantsApi.md#getTenantsCount) | **GET** /api/v2/SystemService/Tenants/Count | Get the total count of tenants available on this suite server instance. |
| [**updateTenant**](TenantsApi.md#updateTenant) | **PUT** /api/v2/SystemService/Tenants/{tenantId} | Update a specific tenant by ID. |


<a id="createTenant"></a>
# **createTenant**
> TenantDtoEnvelope createTenant(apiVersion, xApiVersion, tenantCreateDto)

Create a new tenant.

This action is only available for global administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantCreateDto : TenantCreateDto =  // TenantCreateDto | 
try {
    val result : TenantDtoEnvelope = apiInstance.createTenant(apiVersion, xApiVersion, tenantCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#createTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#createTenant")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantCreateDto** | [**TenantCreateDto**](TenantCreateDto.md)|  | [optional] |

### Return type

[**TenantDtoEnvelope**](TenantDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenant"></a>
# **deleteTenant**
> EmptyEnvelope deleteTenant(tenantId, apiVersion, xApiVersion)

Delete a specific tenant by ID.

This action is only available for global administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenant(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#deleteTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#deleteTenant")
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAllExtendedTenants"></a>
# **getAllExtendedTenants**
> ExtendedTenantDtoListEnvelope getAllExtendedTenants(apiVersion, xApiVersion)

Get all extended tenants available on this suite server instance.

This action is only available for global administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedTenantDtoListEnvelope = apiInstance.getAllExtendedTenants(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getAllExtendedTenants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getAllExtendedTenants")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedTenantDtoListEnvelope**](ExtendedTenantDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAllTenants"></a>
# **getAllTenants**
> TenantDtoListEnvelope getAllTenants(apiVersion, xApiVersion)

Get all tenants available on this suite server instance.

This action is only available for global administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDtoListEnvelope = apiInstance.getAllTenants(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getAllTenants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getAllTenants")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantDtoListEnvelope**](TenantDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedTenantsCount"></a>
# **getExtendedTenantsCount**
> Int32Envelope getExtendedTenantsCount(apiVersion, xApiVersion)

Get the total count of extended tenants available on this suite server instance.

This action is only available for global administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getExtendedTenantsCount(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getExtendedTenantsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getExtendedTenantsCount")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenant"></a>
# **getTenant**
> TenantDtoEnvelope getTenant(tenantId, apiVersion, xApiVersion)

Get a specific tenant by ID.

This action is only available for global administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDtoEnvelope = apiInstance.getTenant(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenant")
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

[**TenantDtoEnvelope**](TenantDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantsCount"></a>
# **getTenantsCount**
> Int32Envelope getTenantsCount(apiVersion, xApiVersion)

Get the total count of tenants available on this suite server instance.

This action is only available for global administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantsCount(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantsCount")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateTenant"></a>
# **updateTenant**
> TenantDtoEnvelope updateTenant(tenantId, apiVersion, xApiVersion, tenantUpdateDto)

Update a specific tenant by ID.

This action is only available for global administrators.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantUpdateDto : TenantUpdateDto =  // TenantUpdateDto | 
try {
    val result : TenantDtoEnvelope = apiInstance.updateTenant(tenantId, apiVersion, xApiVersion, tenantUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#updateTenant")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#updateTenant")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantUpdateDto** | [**TenantUpdateDto**](TenantUpdateDto.md)|  | [optional] |

### Return type

[**TenantDtoEnvelope**](TenantDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

