# FiscalResponsibilitiesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFiscalResponsibility**](FiscalResponsibilitiesApi.md#createFiscalResponsibility) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilities | Create a fiscal responsibility |
| [**deleteFiscalResponsibility**](FiscalResponsibilitiesApi.md#deleteFiscalResponsibility) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilities/{fiscalResponsibilityId} | Delete a fiscal responsibility |
| [**getFiscalResponsibilities**](FiscalResponsibilitiesApi.md#getFiscalResponsibilities) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/FiscalResponsibilities | Get fiscal responsibilities for an authority |
| [**getFiscalResponsibilitiesCount**](FiscalResponsibilitiesApi.md#getFiscalResponsibilitiesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/Count | Get fiscal responsibilities count |
| [**getFiscalResponsibility**](FiscalResponsibilitiesApi.md#getFiscalResponsibility) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/{fiscalResponsibilityId} | Get fiscal responsibility by ID |
| [**updateFiscalResponsibility**](FiscalResponsibilitiesApi.md#updateFiscalResponsibility) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilities/{fiscalResponsibilityId} | Update a fiscal responsibility |


<a id="createFiscalResponsibility"></a>
# **createFiscalResponsibility**
> EmptyEnvelope createFiscalResponsibility(tenantId, apiVersion, xApiVersion, fiscalResponsibilityCreateDto)

Create a fiscal responsibility

Creates a new fiscal responsibility for a fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilitiesApi()
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalResponsibilityCreateDto : FiscalResponsibilityCreateDto =  // FiscalResponsibilityCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createFiscalResponsibility(tenantId, apiVersion, xApiVersion, fiscalResponsibilityCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilitiesApi#createFiscalResponsibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilitiesApi#createFiscalResponsibility")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalResponsibilityCreateDto** | [**FiscalResponsibilityCreateDto**](FiscalResponsibilityCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFiscalResponsibility"></a>
# **deleteFiscalResponsibility**
> EmptyEnvelope deleteFiscalResponsibility(fiscalResponsibilityId, tenantId, apiVersion, xApiVersion)

Delete a fiscal responsibility

Deletes a fiscal responsibility identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilitiesApi()
val fiscalResponsibilityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFiscalResponsibility(fiscalResponsibilityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilitiesApi#deleteFiscalResponsibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilitiesApi#deleteFiscalResponsibility")
    e.printStackTrace()
}
```

### Parameters
| **fiscalResponsibilityId** | **java.util.UUID**|  | |
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

<a id="getFiscalResponsibilities"></a>
# **getFiscalResponsibilities**
> FiscalResponsibilityDtoListEnvelope getFiscalResponsibilities(authorityId, fiscalAuthorityId, apiVersion, xApiVersion)

Get fiscal responsibilities for an authority

Retrieves all fiscal responsibilities for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilitiesApi()
val authorityId : kotlin.String = authorityId_example // kotlin.String | 
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalResponsibilityDtoListEnvelope = apiInstance.getFiscalResponsibilities(authorityId, fiscalAuthorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilitiesApi#getFiscalResponsibilities")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilitiesApi#getFiscalResponsibilities")
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

[**FiscalResponsibilityDtoListEnvelope**](FiscalResponsibilityDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalResponsibilitiesCount"></a>
# **getFiscalResponsibilitiesCount**
> Int32Envelope getFiscalResponsibilitiesCount(fiscalAuthorityId, apiVersion, xApiVersion)

Get fiscal responsibilities count

Returns the total count of fiscal responsibilities for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilitiesApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getFiscalResponsibilitiesCount(fiscalAuthorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilitiesApi#getFiscalResponsibilitiesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilitiesApi#getFiscalResponsibilitiesCount")
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

<a id="getFiscalResponsibility"></a>
# **getFiscalResponsibility**
> FiscalResponsibilityDtoEnvelope getFiscalResponsibility(fiscalAuthorityId, fiscalResponsibilityId, tenantId, apiVersion, xApiVersion)

Get fiscal responsibility by ID

Retrieves a specific fiscal responsibility by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilitiesApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalResponsibilityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalResponsibilityDtoEnvelope = apiInstance.getFiscalResponsibility(fiscalAuthorityId, fiscalResponsibilityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilitiesApi#getFiscalResponsibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilitiesApi#getFiscalResponsibility")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **fiscalResponsibilityId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalResponsibilityDtoEnvelope**](FiscalResponsibilityDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateFiscalResponsibility"></a>
# **updateFiscalResponsibility**
> EmptyEnvelope updateFiscalResponsibility(fiscalResponsibilityId, tenantId, apiVersion, xApiVersion, fiscalResponsibilityUpdateDto)

Update a fiscal responsibility

Updates an existing fiscal responsibility identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilitiesApi()
val fiscalResponsibilityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalResponsibilityUpdateDto : FiscalResponsibilityUpdateDto =  // FiscalResponsibilityUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateFiscalResponsibility(fiscalResponsibilityId, tenantId, apiVersion, xApiVersion, fiscalResponsibilityUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilitiesApi#updateFiscalResponsibility")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilitiesApi#updateFiscalResponsibility")
    e.printStackTrace()
}
```

### Parameters
| **fiscalResponsibilityId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalResponsibilityUpdateDto** | [**FiscalResponsibilityUpdateDto**](FiscalResponsibilityUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

