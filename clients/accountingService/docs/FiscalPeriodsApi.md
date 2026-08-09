# FiscalPeriodsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**closeFiscalPeriod**](FiscalPeriodsApi.md#closeFiscalPeriod) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods/{fiscalPeriodId}/Close | Close a fiscal period |
| [**createFiscalPeriod**](FiscalPeriodsApi.md#createFiscalPeriod) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods | Create a fiscal period |
| [**deleteFiscalPeriod**](FiscalPeriodsApi.md#deleteFiscalPeriod) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods/{fiscalPeriodId} | Delete a fiscal period |
| [**getFiscalPeriod**](FiscalPeriodsApi.md#getFiscalPeriod) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalYears/{fiscalYearId}/FiscalPeriods/{fiscalPeriodId} | Get fiscal period by ID |
| [**getFiscalPeriods**](FiscalPeriodsApi.md#getFiscalPeriods) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{authorityId}/FiscalYears/{fiscalYearId}/FiscalPeriods | Get fiscal periods for a fiscal year |
| [**getFiscalPeriodsCount**](FiscalPeriodsApi.md#getFiscalPeriodsCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalYears/{fiscalYearId}/FiscalPeriods/Count | Get fiscal periods count |
| [**openFiscalPeriod**](FiscalPeriodsApi.md#openFiscalPeriod) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods/{fiscalPeriodId}/Open | Open a fiscal period |
| [**patchFiscalPeriodAsync**](FiscalPeriodsApi.md#patchFiscalPeriodAsync) | **PATCH** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods/{fiscalPeriodId} | Patch a fiscal period |
| [**updateFiscalPeriod**](FiscalPeriodsApi.md#updateFiscalPeriod) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalPeriods/{fiscalPeriodId} | Update a fiscal period |


<a id="closeFiscalPeriod"></a>
# **closeFiscalPeriod**
> EmptyEnvelope closeFiscalPeriod(fiscalPeriodId, tenantId, apiVersion, xApiVersion)

Close a fiscal period

Closes a fiscal period so no further journal entries can post into it. Rejects closing a locked (hard-sealed) period.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val fiscalPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.closeFiscalPeriod(fiscalPeriodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#closeFiscalPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#closeFiscalPeriod")
    e.printStackTrace()
}
```

### Parameters
| **fiscalPeriodId** | **java.util.UUID**|  | |
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

<a id="createFiscalPeriod"></a>
# **createFiscalPeriod**
> EmptyEnvelope createFiscalPeriod(tenantId, apiVersion, xApiVersion, fiscalPeriodCreateDto)

Create a fiscal period

Creates a new fiscal period associated with a fiscal year.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalPeriodCreateDto : FiscalPeriodCreateDto =  // FiscalPeriodCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createFiscalPeriod(tenantId, apiVersion, xApiVersion, fiscalPeriodCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#createFiscalPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#createFiscalPeriod")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalPeriodCreateDto** | [**FiscalPeriodCreateDto**](FiscalPeriodCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFiscalPeriod"></a>
# **deleteFiscalPeriod**
> EmptyEnvelope deleteFiscalPeriod(fiscalPeriodId, tenantId, apiVersion, xApiVersion)

Delete a fiscal period

Deletes a fiscal period identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val fiscalPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFiscalPeriod(fiscalPeriodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#deleteFiscalPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#deleteFiscalPeriod")
    e.printStackTrace()
}
```

### Parameters
| **fiscalPeriodId** | **java.util.UUID**|  | |
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

<a id="getFiscalPeriod"></a>
# **getFiscalPeriod**
> FiscalPeriodDtoEnvelope getFiscalPeriod(fiscalAuthorityId, fiscalYearId, fiscalPeriodId, tenantId, apiVersion, xApiVersion)

Get fiscal period by ID

Retrieves a specific fiscal period by its unique identifier within a fiscal year.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalPeriodDtoEnvelope = apiInstance.getFiscalPeriod(fiscalAuthorityId, fiscalYearId, fiscalPeriodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#getFiscalPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#getFiscalPeriod")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **fiscalYearId** | **java.util.UUID**|  | |
| **fiscalPeriodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalPeriodDtoEnvelope**](FiscalPeriodDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalPeriods"></a>
# **getFiscalPeriods**
> FiscalPeriodDtoListEnvelope getFiscalPeriods(fiscalYearId, authorityId, tenantId, fiscalAuthorityId, apiVersion, xApiVersion, fiscalPeriodDtoCollectionQueryParameters)

Get fiscal periods for a fiscal year

Retrieves all fiscal periods for the specified fiscal year within a fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val authorityId : kotlin.String = authorityId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalPeriodDtoCollectionQueryParameters : FiscalPeriodDtoCollectionQueryParameters =  // FiscalPeriodDtoCollectionQueryParameters | 
try {
    val result : FiscalPeriodDtoListEnvelope = apiInstance.getFiscalPeriods(fiscalYearId, authorityId, tenantId, fiscalAuthorityId, apiVersion, xApiVersion, fiscalPeriodDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#getFiscalPeriods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#getFiscalPeriods")
    e.printStackTrace()
}
```

### Parameters
| **fiscalYearId** | **java.util.UUID**|  | |
| **authorityId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalPeriodDtoCollectionQueryParameters** | [**FiscalPeriodDtoCollectionQueryParameters**](FiscalPeriodDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**FiscalPeriodDtoListEnvelope**](FiscalPeriodDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getFiscalPeriodsCount"></a>
# **getFiscalPeriodsCount**
> Int32Envelope getFiscalPeriodsCount(fiscalAuthorityId, fiscalYearId, tenantId, apiVersion, xApiVersion, fiscalPeriodDtoCollectionQueryParameters)

Get fiscal periods count

Returns the total count of fiscal periods for the specified fiscal year.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalPeriodDtoCollectionQueryParameters : FiscalPeriodDtoCollectionQueryParameters =  // FiscalPeriodDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getFiscalPeriodsCount(fiscalAuthorityId, fiscalYearId, tenantId, apiVersion, xApiVersion, fiscalPeriodDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#getFiscalPeriodsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#getFiscalPeriodsCount")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **fiscalYearId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalPeriodDtoCollectionQueryParameters** | [**FiscalPeriodDtoCollectionQueryParameters**](FiscalPeriodDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="openFiscalPeriod"></a>
# **openFiscalPeriod**
> EmptyEnvelope openFiscalPeriod(fiscalPeriodId, tenantId, apiVersion, xApiVersion)

Open a fiscal period

Opens a closed fiscal period so journal entries can post into it. Rejects reopening a locked or an already-open period.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val fiscalPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.openFiscalPeriod(fiscalPeriodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#openFiscalPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#openFiscalPeriod")
    e.printStackTrace()
}
```

### Parameters
| **fiscalPeriodId** | **java.util.UUID**|  | |
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

<a id="patchFiscalPeriodAsync"></a>
# **patchFiscalPeriodAsync**
> EmptyEnvelope patchFiscalPeriodAsync(fiscalPeriodId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a fiscal period

Partially updates a fiscal period.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val fiscalPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchFiscalPeriodAsync(fiscalPeriodId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#patchFiscalPeriodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#patchFiscalPeriodAsync")
    e.printStackTrace()
}
```

### Parameters
| **fiscalPeriodId** | **java.util.UUID**|  | |
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

<a id="updateFiscalPeriod"></a>
# **updateFiscalPeriod**
> EmptyEnvelope updateFiscalPeriod(fiscalPeriodId, tenantId, apiVersion, xApiVersion, fiscalPeriodUpdateDto)

Update a fiscal period

Updates an existing fiscal period identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalPeriodsApi()
val fiscalPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalPeriodUpdateDto : FiscalPeriodUpdateDto =  // FiscalPeriodUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateFiscalPeriod(fiscalPeriodId, tenantId, apiVersion, xApiVersion, fiscalPeriodUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalPeriodsApi#updateFiscalPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalPeriodsApi#updateFiscalPeriod")
    e.printStackTrace()
}
```

### Parameters
| **fiscalPeriodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalPeriodUpdateDto** | [**FiscalPeriodUpdateDto**](FiscalPeriodUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

