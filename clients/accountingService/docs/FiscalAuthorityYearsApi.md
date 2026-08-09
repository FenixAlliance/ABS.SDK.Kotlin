# FiscalAuthorityYearsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFiscalYear**](FiscalAuthorityYearsApi.md#createFiscalYear) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalYears | Create a fiscal year |
| [**deleteFiscalYear**](FiscalAuthorityYearsApi.md#deleteFiscalYear) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalYears/{fiscalYearId} | Delete a fiscal year |
| [**getFiscalYear**](FiscalAuthorityYearsApi.md#getFiscalYear) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalYears/{fiscalYearId} | Get fiscal year by ID for an authority |
| [**getFiscalYears**](FiscalAuthorityYearsApi.md#getFiscalYears) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/FiscalYears | Get fiscal years for an authority |
| [**getFiscalYearsCount**](FiscalAuthorityYearsApi.md#getFiscalYearsCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalYears/Count | Get fiscal years count for an authority |
| [**patchFiscalAuthorityYearAsync**](FiscalAuthorityYearsApi.md#patchFiscalAuthorityYearAsync) | **PATCH** /api/v2/AccountingService/Fiscals/Authorities/FiscalYears/{fiscalYearId} | Patch a fiscal authority year |
| [**updateFiscalYear**](FiscalAuthorityYearsApi.md#updateFiscalYear) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalYears/{fiscalYearId} | Update a fiscal year |


<a id="createFiscalYear"></a>
# **createFiscalYear**
> EmptyEnvelope createFiscalYear(tenantId, apiVersion, xApiVersion, fiscalYearCreateDto)

Create a fiscal year

Creates a new fiscal year associated with a fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthorityYearsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalYearCreateDto : FiscalYearCreateDto =  // FiscalYearCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createFiscalYear(tenantId, apiVersion, xApiVersion, fiscalYearCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthorityYearsApi#createFiscalYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthorityYearsApi#createFiscalYear")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalYearCreateDto** | [**FiscalYearCreateDto**](FiscalYearCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFiscalYear"></a>
# **deleteFiscalYear**
> EmptyEnvelope deleteFiscalYear(fiscalYearId, tenantId, apiVersion, xApiVersion)

Delete a fiscal year

Deletes a fiscal year identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthorityYearsApi()
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFiscalYear(fiscalYearId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthorityYearsApi#deleteFiscalYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthorityYearsApi#deleteFiscalYear")
    e.printStackTrace()
}
```

### Parameters
| **fiscalYearId** | **java.util.UUID**|  | |
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

<a id="getFiscalYear"></a>
# **getFiscalYear**
> FiscalYearDtoEnvelope getFiscalYear(fiscalAuthorityId, fiscalYearId, tenantId, apiVersion, xApiVersion)

Get fiscal year by ID for an authority

Retrieves a specific fiscal year by its unique identifier within a fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthorityYearsApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalYearDtoEnvelope = apiInstance.getFiscalYear(fiscalAuthorityId, fiscalYearId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthorityYearsApi#getFiscalYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthorityYearsApi#getFiscalYear")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **fiscalYearId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalYearDtoEnvelope**](FiscalYearDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalYears"></a>
# **getFiscalYears**
> FiscalYearDtoListEnvelope getFiscalYears(authorityId, tenantId, fiscalAuthorityId, apiVersion, xApiVersion, fiscalYearDtoCollectionQueryParameters)

Get fiscal years for an authority

Retrieves all fiscal years associated with the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthorityYearsApi()
val authorityId : kotlin.String = authorityId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalYearDtoCollectionQueryParameters : FiscalYearDtoCollectionQueryParameters =  // FiscalYearDtoCollectionQueryParameters | 
try {
    val result : FiscalYearDtoListEnvelope = apiInstance.getFiscalYears(authorityId, tenantId, fiscalAuthorityId, apiVersion, xApiVersion, fiscalYearDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthorityYearsApi#getFiscalYears")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthorityYearsApi#getFiscalYears")
    e.printStackTrace()
}
```

### Parameters
| **authorityId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalYearDtoCollectionQueryParameters** | [**FiscalYearDtoCollectionQueryParameters**](FiscalYearDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**FiscalYearDtoListEnvelope**](FiscalYearDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getFiscalYearsCount"></a>
# **getFiscalYearsCount**
> Int32Envelope getFiscalYearsCount(fiscalAuthorityId, tenantId, apiVersion, xApiVersion, fiscalYearDtoCollectionQueryParameters)

Get fiscal years count for an authority

Returns the total count of fiscal years for the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthorityYearsApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalYearDtoCollectionQueryParameters : FiscalYearDtoCollectionQueryParameters =  // FiscalYearDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getFiscalYearsCount(fiscalAuthorityId, tenantId, apiVersion, xApiVersion, fiscalYearDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthorityYearsApi#getFiscalYearsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthorityYearsApi#getFiscalYearsCount")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalYearDtoCollectionQueryParameters** | [**FiscalYearDtoCollectionQueryParameters**](FiscalYearDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchFiscalAuthorityYearAsync"></a>
# **patchFiscalAuthorityYearAsync**
> EmptyEnvelope patchFiscalAuthorityYearAsync(fiscalYearId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a fiscal authority year

Partially updates a fiscal authority year.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthorityYearsApi()
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchFiscalAuthorityYearAsync(fiscalYearId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthorityYearsApi#patchFiscalAuthorityYearAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthorityYearsApi#patchFiscalAuthorityYearAsync")
    e.printStackTrace()
}
```

### Parameters
| **fiscalYearId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateFiscalYear"></a>
# **updateFiscalYear**
> EmptyEnvelope updateFiscalYear(fiscalYearId, tenantId, apiVersion, xApiVersion, fiscalYearUpdateDto)

Update a fiscal year

Updates an existing fiscal year identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalAuthorityYearsApi()
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalYearUpdateDto : FiscalYearUpdateDto =  // FiscalYearUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateFiscalYear(fiscalYearId, tenantId, apiVersion, xApiVersion, fiscalYearUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalAuthorityYearsApi#updateFiscalYear")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalAuthorityYearsApi#updateFiscalYear")
    e.printStackTrace()
}
```

### Parameters
| **fiscalYearId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalYearUpdateDto** | [**FiscalYearUpdateDto**](FiscalYearUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

