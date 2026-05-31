# TenantOptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSystemTenantOption**](TenantOptionsApi.md#createSystemTenantOption) | **POST** /api/v2/SystemService/Tenants/{tenantId}/Options | Create a new tenant option (admin) |
| [**deleteSystemTenantOption**](TenantOptionsApi.md#deleteSystemTenantOption) | **DELETE** /api/v2/SystemService/Tenants/{tenantId}/Options/{optionId} | Delete a tenant option (admin) |
| [**getSystemTenantOptionById**](TenantOptionsApi.md#getSystemTenantOptionById) | **GET** /api/v2/SystemService/Tenants/{tenantId}/Options/{optionId} | Retrieve a single tenant option by its ID (admin) |
| [**getSystemTenantOptions**](TenantOptionsApi.md#getSystemTenantOptions) | **GET** /api/v2/SystemService/Tenants/{tenantId}/Options | Retrieve a list of tenant options (admin) |
| [**getSystemTenantOptionsCount**](TenantOptionsApi.md#getSystemTenantOptionsCount) | **GET** /api/v2/SystemService/Tenants/{tenantId}/Options/Count | Get the count of tenant options (admin) |
| [**updateSystemTenantOption**](TenantOptionsApi.md#updateSystemTenantOption) | **PUT** /api/v2/SystemService/Tenants/{tenantId}/Options/{optionId} | Update a tenant option (admin) |


<a id="createSystemTenantOption"></a>
# **createSystemTenantOption**
> EmptyEnvelope createSystemTenantOption(tenantId, key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new tenant option (admin)

Admin endpoint to create an option for any tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val key : kotlin.String = key_example // kotlin.String | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionCreateDto : OptionCreateDto =  // OptionCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSystemTenantOption(tenantId, key, portalId, apiVersion, xApiVersion, optionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantOptionsApi#createSystemTenantOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantOptionsApi#createSystemTenantOption")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **key** | **kotlin.String**|  | |
| **portalId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionCreateDto** | [**OptionCreateDto**](OptionCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSystemTenantOption"></a>
# **deleteSystemTenantOption**
> EmptyEnvelope deleteSystemTenantOption(tenantId, optionId, apiVersion, xApiVersion)

Delete a tenant option (admin)

Admin endpoint to delete an option for any tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSystemTenantOption(tenantId, optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantOptionsApi#deleteSystemTenantOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantOptionsApi#deleteSystemTenantOption")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **optionId** | **java.util.UUID**|  | |
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

<a id="getSystemTenantOptionById"></a>
# **getSystemTenantOptionById**
> OptionDtoEnvelope getSystemTenantOptionById(tenantId, optionId, apiVersion, xApiVersion)

Retrieve a single tenant option by its ID (admin)

Admin endpoint to retrieve a single option for any tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoEnvelope = apiInstance.getSystemTenantOptionById(tenantId, optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantOptionsApi#getSystemTenantOptionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantOptionsApi#getSystemTenantOptionById")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **optionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OptionDtoEnvelope**](OptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemTenantOptions"></a>
# **getSystemTenantOptions**
> OptionDtoListEnvelope getSystemTenantOptions(tenantId, portalId, apiVersion, xApiVersion)

Retrieve a list of tenant options (admin)

Admin endpoint to retrieve options for any tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoListEnvelope = apiInstance.getSystemTenantOptions(tenantId, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantOptionsApi#getSystemTenantOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantOptionsApi#getSystemTenantOptions")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **portalId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OptionDtoListEnvelope**](OptionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemTenantOptionsCount"></a>
# **getSystemTenantOptionsCount**
> Int32Envelope getSystemTenantOptionsCount(tenantId, portalId, apiVersion, xApiVersion)

Get the count of tenant options (admin)

Admin endpoint to get the count of options for any tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSystemTenantOptionsCount(tenantId, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantOptionsApi#getSystemTenantOptionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantOptionsApi#getSystemTenantOptionsCount")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **portalId** | **java.util.UUID**|  | [optional] |
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

<a id="updateSystemTenantOption"></a>
# **updateSystemTenantOption**
> EmptyEnvelope updateSystemTenantOption(tenantId, optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a tenant option (admin)

Admin endpoint to update an option for any tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantOptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionUpdateDto : OptionUpdateDto =  // OptionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSystemTenantOption(tenantId, optionId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantOptionsApi#updateSystemTenantOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantOptionsApi#updateSystemTenantOption")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **optionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionUpdateDto** | [**OptionUpdateDto**](OptionUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

