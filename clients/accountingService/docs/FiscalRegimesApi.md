# FiscalRegimesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFiscalRegime**](FiscalRegimesApi.md#createFiscalRegime) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalRegimes | Create a fiscal regime |
| [**deleteFiscalRegime**](FiscalRegimesApi.md#deleteFiscalRegime) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalRegimes/{regimeId} | Delete a fiscal regime |
| [**getFiscalRegime**](FiscalRegimesApi.md#getFiscalRegime) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalRegimes/{regimeId} | Get fiscal regime by ID |
| [**getFiscalRegimes**](FiscalRegimesApi.md#getFiscalRegimes) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/FiscalRegimes | Get fiscal regimes for an authority |
| [**getFiscalRegimesCount**](FiscalRegimesApi.md#getFiscalRegimesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalRegimes/Count | Get fiscal regimes count |
| [**updateFiscalRegime**](FiscalRegimesApi.md#updateFiscalRegime) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalRegimes/{regimeId} | Update a fiscal regime |


<a id="createFiscalRegime"></a>
# **createFiscalRegime**
> EmptyEnvelope createFiscalRegime(tenantId, apiVersion, xApiVersion, fiscalRegimeCreateDto)

Create a fiscal regime

Creates a new fiscal regime for a fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalRegimesApi()
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalRegimeCreateDto : FiscalRegimeCreateDto =  // FiscalRegimeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createFiscalRegime(tenantId, apiVersion, xApiVersion, fiscalRegimeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalRegimesApi#createFiscalRegime")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalRegimesApi#createFiscalRegime")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalRegimeCreateDto** | [**FiscalRegimeCreateDto**](FiscalRegimeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFiscalRegime"></a>
# **deleteFiscalRegime**
> EmptyEnvelope deleteFiscalRegime(regimeId, tenantId, apiVersion, xApiVersion)

Delete a fiscal regime

Deletes a fiscal regime identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalRegimesApi()
val regimeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFiscalRegime(regimeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalRegimesApi#deleteFiscalRegime")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalRegimesApi#deleteFiscalRegime")
    e.printStackTrace()
}
```

### Parameters
| **regimeId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
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

<a id="getFiscalRegime"></a>
# **getFiscalRegime**
> FiscalRegimeDtoEnvelope getFiscalRegime(fiscalAuthorityId, regimeId, tenantId, apiVersion, xApiVersion)

Get fiscal regime by ID

Retrieves a specific fiscal regime by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalRegimesApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val regimeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalRegimeDtoEnvelope = apiInstance.getFiscalRegime(fiscalAuthorityId, regimeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalRegimesApi#getFiscalRegime")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalRegimesApi#getFiscalRegime")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **regimeId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalRegimeDtoEnvelope**](FiscalRegimeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalRegimes"></a>
# **getFiscalRegimes**
> FiscalRegimeDtoListEnvelope getFiscalRegimes(authorityId, fiscalAuthorityId, apiVersion, xApiVersion)

Get fiscal regimes for an authority

Retrieves all fiscal regimes for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalRegimesApi()
val authorityId : kotlin.String = authorityId_example // kotlin.String | 
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalRegimeDtoListEnvelope = apiInstance.getFiscalRegimes(authorityId, fiscalAuthorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalRegimesApi#getFiscalRegimes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalRegimesApi#getFiscalRegimes")
    e.printStackTrace()
}
```

### Parameters
| **authorityId** | **kotlin.String**|  | |
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalRegimeDtoListEnvelope**](FiscalRegimeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalRegimesCount"></a>
# **getFiscalRegimesCount**
> Int32Envelope getFiscalRegimesCount(fiscalAuthorityId, apiVersion, xApiVersion)

Get fiscal regimes count

Returns the total count of fiscal regimes for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalRegimesApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getFiscalRegimesCount(fiscalAuthorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalRegimesApi#getFiscalRegimesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalRegimesApi#getFiscalRegimesCount")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
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

<a id="updateFiscalRegime"></a>
# **updateFiscalRegime**
> EmptyEnvelope updateFiscalRegime(regimeId, tenantId, apiVersion, xApiVersion, fiscalRegimeUpdateDto)

Update a fiscal regime

Updates an existing fiscal regime identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalRegimesApi()
val regimeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalRegimeUpdateDto : FiscalRegimeUpdateDto =  // FiscalRegimeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateFiscalRegime(regimeId, tenantId, apiVersion, xApiVersion, fiscalRegimeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalRegimesApi#updateFiscalRegime")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalRegimesApi#updateFiscalRegime")
    e.printStackTrace()
}
```

### Parameters
| **regimeId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalRegimeUpdateDto** | [**FiscalRegimeUpdateDto**](FiscalRegimeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

