# SizesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantSize**](SizesApi.md#createTenantSize) | **POST** /api/v2/TenantsService/Sizes | Create a new tenant size |
| [**deleteTenantSize**](SizesApi.md#deleteTenantSize) | **DELETE** /api/v2/TenantsService/Sizes/{tenantSizeId} | Delete a tenant size |
| [**getTenantSizeById**](SizesApi.md#getTenantSizeById) | **GET** /api/v2/TenantsService/Sizes/{tenantSizeId} | Retrieve a single tenant size by its ID |
| [**getTenantSizes**](SizesApi.md#getTenantSizes) | **GET** /api/v2/TenantsService/Sizes | Retrieve a list of tenant sizes |
| [**getTenantSizesCount**](SizesApi.md#getTenantSizesCount) | **GET** /api/v2/TenantsService/Sizes/Count | Get the count of tenant sizes |
| [**updateTenantSize**](SizesApi.md#updateTenantSize) | **PUT** /api/v2/TenantsService/Sizes/{tenantSizeId} | Update a tenant size |


<a id="createTenantSize"></a>
# **createTenantSize**
> EmptyEnvelope createTenantSize(tenantId, apiVersion, xApiVersion, tenantSizeCreateDto)

Create a new tenant size

Create a new tenant size

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SizesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantSizeCreateDto : TenantSizeCreateDto =  // TenantSizeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantSize(tenantId, apiVersion, xApiVersion, tenantSizeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SizesApi#createTenantSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SizesApi#createTenantSize")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantSizeCreateDto** | [**TenantSizeCreateDto**](TenantSizeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantSize"></a>
# **deleteTenantSize**
> EmptyEnvelope deleteTenantSize(tenantSizeId, tenantId, apiVersion, xApiVersion)

Delete a tenant size

Delete a tenant size

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SizesApi()
val tenantSizeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantSize(tenantSizeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SizesApi#deleteTenantSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SizesApi#deleteTenantSize")
    e.printStackTrace()
}
```

### Parameters
| **tenantSizeId** | **java.util.UUID**|  | |
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

<a id="getTenantSizeById"></a>
# **getTenantSizeById**
> TenantSizeDtoEnvelope getTenantSizeById(tenantSizeId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant size by its ID

Retrieve a single tenant size by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SizesApi()
val tenantSizeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantSizeDtoEnvelope = apiInstance.getTenantSizeById(tenantSizeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SizesApi#getTenantSizeById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SizesApi#getTenantSizeById")
    e.printStackTrace()
}
```

### Parameters
| **tenantSizeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantSizeDtoEnvelope**](TenantSizeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantSizes"></a>
# **getTenantSizes**
> TenantSizeDtoListEnvelope getTenantSizes(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant sizes

Retrieve a list of tenant sizes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SizesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantSizeDtoListEnvelope = apiInstance.getTenantSizes(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SizesApi#getTenantSizes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SizesApi#getTenantSizes")
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

[**TenantSizeDtoListEnvelope**](TenantSizeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantSizesCount"></a>
# **getTenantSizesCount**
> Int32Envelope getTenantSizesCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant sizes

Get the count of tenant sizes

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SizesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantSizesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SizesApi#getTenantSizesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SizesApi#getTenantSizesCount")
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

<a id="updateTenantSize"></a>
# **updateTenantSize**
> EmptyEnvelope updateTenantSize(tenantSizeId, tenantId, apiVersion, xApiVersion, tenantSizeUpdateDto)

Update a tenant size

Update a tenant size

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SizesApi()
val tenantSizeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantSizeUpdateDto : TenantSizeUpdateDto =  // TenantSizeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantSize(tenantSizeId, tenantId, apiVersion, xApiVersion, tenantSizeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SizesApi#updateTenantSize")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SizesApi#updateTenantSize")
    e.printStackTrace()
}
```

### Parameters
| **tenantSizeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantSizeUpdateDto** | [**TenantSizeUpdateDto**](TenantSizeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

