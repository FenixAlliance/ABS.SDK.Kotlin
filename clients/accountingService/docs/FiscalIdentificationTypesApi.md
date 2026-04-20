# FiscalIdentificationTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFiscalIdentificationType**](FiscalIdentificationTypesApi.md#createFiscalIdentificationType) | **POST** /api/v2/AccountingService/Fiscals/Authorities/IdentificationTypes | Create a fiscal identification type |
| [**deleteFiscalIdentificationType**](FiscalIdentificationTypesApi.md#deleteFiscalIdentificationType) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/IdentificationTypes/{identificationTypeId} | Delete a fiscal identification type |
| [**getFiscalIdentificationType**](FiscalIdentificationTypesApi.md#getFiscalIdentificationType) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/IdentificationTypes/{identificationTypeId} | Get fiscal identification type by ID |
| [**getFiscalIdentificationTypes**](FiscalIdentificationTypesApi.md#getFiscalIdentificationTypes) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/IdentificationTypes | Get fiscal identification types for an authority |
| [**getFiscalIdentificationTypesCount**](FiscalIdentificationTypesApi.md#getFiscalIdentificationTypesCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/IdentificationTypes/Count | Get fiscal identification types count |
| [**updateFiscalIdentificationType**](FiscalIdentificationTypesApi.md#updateFiscalIdentificationType) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/IdentificationTypes/{identificationTypeId} | Update a fiscal identification type |


<a id="createFiscalIdentificationType"></a>
# **createFiscalIdentificationType**
> EmptyEnvelope createFiscalIdentificationType(tenantId, apiVersion, xApiVersion, fiscalIdentificationTypeCreateDto)

Create a fiscal identification type

Creates a new fiscal identification type for a fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalIdentificationTypesApi()
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalIdentificationTypeCreateDto : FiscalIdentificationTypeCreateDto =  // FiscalIdentificationTypeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createFiscalIdentificationType(tenantId, apiVersion, xApiVersion, fiscalIdentificationTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalIdentificationTypesApi#createFiscalIdentificationType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalIdentificationTypesApi#createFiscalIdentificationType")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalIdentificationTypeCreateDto** | [**FiscalIdentificationTypeCreateDto**](FiscalIdentificationTypeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFiscalIdentificationType"></a>
# **deleteFiscalIdentificationType**
> EmptyEnvelope deleteFiscalIdentificationType(identificationTypeId, tenantId, apiVersion, xApiVersion)

Delete a fiscal identification type

Deletes a fiscal identification type identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalIdentificationTypesApi()
val identificationTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFiscalIdentificationType(identificationTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalIdentificationTypesApi#deleteFiscalIdentificationType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalIdentificationTypesApi#deleteFiscalIdentificationType")
    e.printStackTrace()
}
```

### Parameters
| **identificationTypeId** | **java.util.UUID**|  | |
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

<a id="getFiscalIdentificationType"></a>
# **getFiscalIdentificationType**
> FiscalIdentificationTypeDtoEnvelope getFiscalIdentificationType(fiscalAuthorityId, identificationTypeId, tenantId, apiVersion, xApiVersion)

Get fiscal identification type by ID

Retrieves a specific fiscal identification type by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalIdentificationTypesApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val identificationTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalIdentificationTypeDtoEnvelope = apiInstance.getFiscalIdentificationType(fiscalAuthorityId, identificationTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalIdentificationTypesApi#getFiscalIdentificationType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalIdentificationTypesApi#getFiscalIdentificationType")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **identificationTypeId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalIdentificationTypeDtoEnvelope**](FiscalIdentificationTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalIdentificationTypes"></a>
# **getFiscalIdentificationTypes**
> FiscalIdentificationTypeDtoListEnvelope getFiscalIdentificationTypes(authorityId, apiVersion, xApiVersion)

Get fiscal identification types for an authority

Retrieves all fiscal identification types for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalIdentificationTypesApi()
val authorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalIdentificationTypeDtoListEnvelope = apiInstance.getFiscalIdentificationTypes(authorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalIdentificationTypesApi#getFiscalIdentificationTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalIdentificationTypesApi#getFiscalIdentificationTypes")
    e.printStackTrace()
}
```

### Parameters
| **authorityId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalIdentificationTypeDtoListEnvelope**](FiscalIdentificationTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalIdentificationTypesCount"></a>
# **getFiscalIdentificationTypesCount**
> Int32Envelope getFiscalIdentificationTypesCount(authorityId, apiVersion, xApiVersion)

Get fiscal identification types count

Returns the total count of fiscal identification types for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalIdentificationTypesApi()
val authorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getFiscalIdentificationTypesCount(authorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalIdentificationTypesApi#getFiscalIdentificationTypesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalIdentificationTypesApi#getFiscalIdentificationTypesCount")
    e.printStackTrace()
}
```

### Parameters
| **authorityId** | **java.util.UUID**|  | |
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

<a id="updateFiscalIdentificationType"></a>
# **updateFiscalIdentificationType**
> EmptyEnvelope updateFiscalIdentificationType(identificationTypeId, tenantId, apiVersion, xApiVersion, fiscalIdentificationTypeUpdateDto)

Update a fiscal identification type

Updates an existing fiscal identification type identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalIdentificationTypesApi()
val identificationTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalIdentificationTypeUpdateDto : FiscalIdentificationTypeUpdateDto =  // FiscalIdentificationTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateFiscalIdentificationType(identificationTypeId, tenantId, apiVersion, xApiVersion, fiscalIdentificationTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalIdentificationTypesApi#updateFiscalIdentificationType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalIdentificationTypesApi#updateFiscalIdentificationType")
    e.printStackTrace()
}
```

### Parameters
| **identificationTypeId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalIdentificationTypeUpdateDto** | [**FiscalIdentificationTypeUpdateDto**](FiscalIdentificationTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

