# FiscalAuthoritiesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFiscalAuthority**](FiscalAuthoritiesApi.md#createFiscalAuthority) | **POST** /api/v2/AccountingService/Fiscals/Authorities | Create a fiscal authority |
| [**deleteFiscalAuthority**](FiscalAuthoritiesApi.md#deleteFiscalAuthority) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/{authorityId} | Delete a fiscal authority |
| [**getFiscalAuthorities**](FiscalAuthoritiesApi.md#getFiscalAuthorities) | **GET** /api/v2/AccountingService/Fiscals/Authorities | Get fiscal authorities |
| [**getFiscalAuthoritiesCount**](FiscalAuthoritiesApi.md#getFiscalAuthoritiesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/Count | Get fiscal authorities count |
| [**getFiscalAuthority**](FiscalAuthoritiesApi.md#getFiscalAuthority) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId} | Get fiscal authority by ID |
| [**updateFiscalAuthority**](FiscalAuthoritiesApi.md#updateFiscalAuthority) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/{authorityId} | Update a fiscal authority |


<a id="createFiscalAuthority"></a>
# **createFiscalAuthority**
> EmptyEnvelope createFiscalAuthority(tenantId, apiVersion, xApiVersion, fiscalAuthorityCreateDto)

Create a fiscal authority

Creates a new fiscal authority for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthoritiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalAuthorityCreateDto : FiscalAuthorityCreateDto =  // FiscalAuthorityCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createFiscalAuthority(tenantId, apiVersion, xApiVersion, fiscalAuthorityCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthoritiesApi#createFiscalAuthority")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthoritiesApi#createFiscalAuthority")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalAuthorityCreateDto** | [**FiscalAuthorityCreateDto**](FiscalAuthorityCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFiscalAuthority"></a>
# **deleteFiscalAuthority**
> EmptyEnvelope deleteFiscalAuthority(authorityId, tenantId, apiVersion, xApiVersion)

Delete a fiscal authority

Deletes a fiscal authority identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthoritiesApi()
val authorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFiscalAuthority(authorityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthoritiesApi#deleteFiscalAuthority")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthoritiesApi#deleteFiscalAuthority")
    e.printStackTrace()
}
```

### Parameters
| **authorityId** | **java.util.UUID**|  | |
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

<a id="getFiscalAuthorities"></a>
# **getFiscalAuthorities**
> FiscalAuthorityDtoListEnvelope getFiscalAuthorities(tenantId, apiVersion, xApiVersion)

Get fiscal authorities

Retrieves all fiscal authorities for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthoritiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalAuthorityDtoListEnvelope = apiInstance.getFiscalAuthorities(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthoritiesApi#getFiscalAuthorities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthoritiesApi#getFiscalAuthorities")
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

[**FiscalAuthorityDtoListEnvelope**](FiscalAuthorityDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalAuthoritiesCount"></a>
# **getFiscalAuthoritiesCount**
> Int32Envelope getFiscalAuthoritiesCount(tenantId, apiVersion, xApiVersion)

Get fiscal authorities count

Returns the total count of fiscal authorities for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthoritiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getFiscalAuthoritiesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthoritiesApi#getFiscalAuthoritiesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthoritiesApi#getFiscalAuthoritiesCount")
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

<a id="getFiscalAuthority"></a>
# **getFiscalAuthority**
> FiscalAuthorityDtoEnvelope getFiscalAuthority(authorityId, tenantId, apiVersion, xApiVersion)

Get fiscal authority by ID

Retrieves a specific fiscal authority by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthoritiesApi()
val authorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalAuthorityDtoEnvelope = apiInstance.getFiscalAuthority(authorityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthoritiesApi#getFiscalAuthority")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthoritiesApi#getFiscalAuthority")
    e.printStackTrace()
}
```

### Parameters
| **authorityId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalAuthorityDtoEnvelope**](FiscalAuthorityDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateFiscalAuthority"></a>
# **updateFiscalAuthority**
> EmptyEnvelope updateFiscalAuthority(authorityId, tenantId, apiVersion, xApiVersion, fiscalAuthorityUpdateDto)

Update a fiscal authority

Updates an existing fiscal authority identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthoritiesApi()
val authorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalAuthorityUpdateDto : FiscalAuthorityUpdateDto =  // FiscalAuthorityUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateFiscalAuthority(authorityId, tenantId, apiVersion, xApiVersion, fiscalAuthorityUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthoritiesApi#updateFiscalAuthority")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthoritiesApi#updateFiscalAuthority")
    e.printStackTrace()
}
```

### Parameters
| **authorityId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalAuthorityUpdateDto** | [**FiscalAuthorityUpdateDto**](FiscalAuthorityUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

