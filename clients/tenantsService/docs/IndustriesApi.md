# IndustriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantIndustry**](IndustriesApi.md#createTenantIndustry) | **POST** /api/v2/TenantsService/Industries | Create a new tenant industry |
| [**deleteTenantIndustry**](IndustriesApi.md#deleteTenantIndustry) | **DELETE** /api/v2/TenantsService/Industries/{tenantIndustryId} | Delete a tenant industry |
| [**getTenantIndustries**](IndustriesApi.md#getTenantIndustries) | **GET** /api/v2/TenantsService/Industries | Retrieve a list of tenant industries |
| [**getTenantIndustriesCount**](IndustriesApi.md#getTenantIndustriesCount) | **GET** /api/v2/TenantsService/Industries/Count | Get the count of tenant industries |
| [**getTenantIndustryById**](IndustriesApi.md#getTenantIndustryById) | **GET** /api/v2/TenantsService/Industries/{tenantIndustryId} | Retrieve a single tenant industry by its ID |
| [**updateTenantIndustry**](IndustriesApi.md#updateTenantIndustry) | **PUT** /api/v2/TenantsService/Industries/{tenantIndustryId} | Update a tenant industry |


<a id="createTenantIndustry"></a>
# **createTenantIndustry**
> EmptyEnvelope createTenantIndustry(tenantId, apiVersion, xApiVersion, tenantIndustryCreateDto)

Create a new tenant industry

Create a new tenant industry

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IndustriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantIndustryCreateDto : TenantIndustryCreateDto =  // TenantIndustryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantIndustry(tenantId, apiVersion, xApiVersion, tenantIndustryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IndustriesApi#createTenantIndustry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IndustriesApi#createTenantIndustry")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantIndustryCreateDto** | [**TenantIndustryCreateDto**](TenantIndustryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantIndustry"></a>
# **deleteTenantIndustry**
> EmptyEnvelope deleteTenantIndustry(tenantIndustryId, tenantId, apiVersion, xApiVersion)

Delete a tenant industry

Delete a tenant industry

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IndustriesApi()
val tenantIndustryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantIndustry(tenantIndustryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IndustriesApi#deleteTenantIndustry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IndustriesApi#deleteTenantIndustry")
    e.printStackTrace()
}
```

### Parameters
| **tenantIndustryId** | **java.util.UUID**|  | |
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

<a id="getTenantIndustries"></a>
# **getTenantIndustries**
> TenantIndustryDtoListEnvelope getTenantIndustries(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant industries

Retrieve a list of tenant industries

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IndustriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantIndustryDtoListEnvelope = apiInstance.getTenantIndustries(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IndustriesApi#getTenantIndustries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IndustriesApi#getTenantIndustries")
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

[**TenantIndustryDtoListEnvelope**](TenantIndustryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantIndustriesCount"></a>
# **getTenantIndustriesCount**
> Int32Envelope getTenantIndustriesCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant industries

Get the count of tenant industries

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IndustriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantIndustriesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IndustriesApi#getTenantIndustriesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IndustriesApi#getTenantIndustriesCount")
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

<a id="getTenantIndustryById"></a>
# **getTenantIndustryById**
> TenantIndustryDtoEnvelope getTenantIndustryById(tenantIndustryId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant industry by its ID

Retrieve a single tenant industry by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IndustriesApi()
val tenantIndustryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantIndustryDtoEnvelope = apiInstance.getTenantIndustryById(tenantIndustryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IndustriesApi#getTenantIndustryById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IndustriesApi#getTenantIndustryById")
    e.printStackTrace()
}
```

### Parameters
| **tenantIndustryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantIndustryDtoEnvelope**](TenantIndustryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateTenantIndustry"></a>
# **updateTenantIndustry**
> EmptyEnvelope updateTenantIndustry(tenantIndustryId, tenantId, apiVersion, xApiVersion, tenantIndustryUpdateDto)

Update a tenant industry

Update a tenant industry

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IndustriesApi()
val tenantIndustryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantIndustryUpdateDto : TenantIndustryUpdateDto =  // TenantIndustryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantIndustry(tenantIndustryId, tenantId, apiVersion, xApiVersion, tenantIndustryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IndustriesApi#updateTenantIndustry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IndustriesApi#updateTenantIndustry")
    e.printStackTrace()
}
```

### Parameters
| **tenantIndustryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantIndustryUpdateDto** | [**TenantIndustryUpdateDto**](TenantIndustryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

