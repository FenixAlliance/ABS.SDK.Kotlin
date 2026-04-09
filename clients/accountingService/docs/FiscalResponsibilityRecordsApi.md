# FiscalResponsibilityRecordsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFiscalResponsibilityRecord**](FiscalResponsibilityRecordsApi.md#createFiscalResponsibilityRecord) | **POST** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilityRecords | Create a fiscal responsibility record |
| [**deleteFiscalResponsibilityRecord**](FiscalResponsibilityRecordsApi.md#deleteFiscalResponsibilityRecord) | **DELETE** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilityRecords/{fiscalResponsibilityRecordId} | Delete a fiscal responsibility record |
| [**getFiscalResponsibilityRecord**](FiscalResponsibilityRecordsApi.md#getFiscalResponsibilityRecord) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/{fiscalResponsibilityId}/FiscalResponsibilityRecords/{fiscalResponsibilityRecordId} | Get fiscal responsibility record by ID |
| [**getFiscalResponsibilityRecords**](FiscalResponsibilityRecordsApi.md#getFiscalResponsibilityRecords) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/{fiscalResponsibilityId}/FiscalResponsibilityRecords | Get fiscal responsibility records |
| [**getFiscalResponsibilityRecordsCount**](FiscalResponsibilityRecordsApi.md#getFiscalResponsibilityRecordsCount) | **GET** /api/v2/AccountingService/Fiscals/Authorities/{fiscalAuthorityId}/FiscalResponsibilities/{fiscalResponsibilityId}/FiscalResponsibilityRecords/Count | Get fiscal responsibility records count |
| [**updateFiscalResponsibilityRecord**](FiscalResponsibilityRecordsApi.md#updateFiscalResponsibilityRecord) | **PUT** /api/v2/AccountingService/Fiscals/Authorities/FiscalResponsibilityRecords/{fiscalResponsibilityRecordId} | Update a fiscal responsibility record |


<a id="createFiscalResponsibilityRecord"></a>
# **createFiscalResponsibilityRecord**
> EmptyEnvelope createFiscalResponsibilityRecord(tenantId, apiVersion, xApiVersion, fiscalResponsibilityRecordCreateDto)

Create a fiscal responsibility record

Creates a new fiscal responsibility record for a fiscal responsibility.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilityRecordsApi()
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalResponsibilityRecordCreateDto : FiscalResponsibilityRecordCreateDto =  // FiscalResponsibilityRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createFiscalResponsibilityRecord(tenantId, apiVersion, xApiVersion, fiscalResponsibilityRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilityRecordsApi#createFiscalResponsibilityRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilityRecordsApi#createFiscalResponsibilityRecord")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalResponsibilityRecordCreateDto** | [**FiscalResponsibilityRecordCreateDto**](FiscalResponsibilityRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFiscalResponsibilityRecord"></a>
# **deleteFiscalResponsibilityRecord**
> EmptyEnvelope deleteFiscalResponsibilityRecord(fiscalResponsibilityRecordId, tenantId, apiVersion, xApiVersion)

Delete a fiscal responsibility record

Deletes a fiscal responsibility record identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilityRecordsApi()
val fiscalResponsibilityRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFiscalResponsibilityRecord(fiscalResponsibilityRecordId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilityRecordsApi#deleteFiscalResponsibilityRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilityRecordsApi#deleteFiscalResponsibilityRecord")
    e.printStackTrace()
}
```

### Parameters
| **fiscalResponsibilityRecordId** | **java.util.UUID**|  | |
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

<a id="getFiscalResponsibilityRecord"></a>
# **getFiscalResponsibilityRecord**
> FiscalResponsibilityRecordDtoEnvelope getFiscalResponsibilityRecord(fiscalAuthorityId, fiscalResponsibilityId, fiscalResponsibilityRecordId, tenantId, apiVersion, xApiVersion)

Get fiscal responsibility record by ID

Retrieves a specific fiscal responsibility record by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilityRecordsApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalResponsibilityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalResponsibilityRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalResponsibilityRecordDtoEnvelope = apiInstance.getFiscalResponsibilityRecord(fiscalAuthorityId, fiscalResponsibilityId, fiscalResponsibilityRecordId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecord")
    e.printStackTrace()
}
```

### Parameters
| **fiscalAuthorityId** | **java.util.UUID**|  | |
| **fiscalResponsibilityId** | **java.util.UUID**|  | |
| **fiscalResponsibilityRecordId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalResponsibilityRecordDtoEnvelope**](FiscalResponsibilityRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalResponsibilityRecords"></a>
# **getFiscalResponsibilityRecords**
> FiscalResponsibilityRecordDtoListEnvelope getFiscalResponsibilityRecords(fiscalAuthorityId, fiscalResponsibilityId, tenantId, apiVersion, xApiVersion)

Get fiscal responsibility records

Retrieves all fiscal responsibility records for the specified fiscal responsibility.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilityRecordsApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalResponsibilityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalResponsibilityRecordDtoListEnvelope = apiInstance.getFiscalResponsibilityRecords(fiscalAuthorityId, fiscalResponsibilityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecords")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecords")
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

[**FiscalResponsibilityRecordDtoListEnvelope**](FiscalResponsibilityRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalResponsibilityRecordsCount"></a>
# **getFiscalResponsibilityRecordsCount**
> Int32Envelope getFiscalResponsibilityRecordsCount(fiscalAuthorityId, fiscalResponsibilityId, tenantId, apiVersion, xApiVersion)

Get fiscal responsibility records count

Returns the total count of fiscal responsibility records for the specified fiscal responsibility.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilityRecordsApi()
val fiscalAuthorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val fiscalResponsibilityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getFiscalResponsibilityRecordsCount(fiscalAuthorityId, fiscalResponsibilityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecordsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilityRecordsApi#getFiscalResponsibilityRecordsCount")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateFiscalResponsibilityRecord"></a>
# **updateFiscalResponsibilityRecord**
> EmptyEnvelope updateFiscalResponsibilityRecord(fiscalResponsibilityRecordId, tenantId, apiVersion, xApiVersion, fiscalResponsibilityRecordUpdateDto)

Update a fiscal responsibility record

Updates an existing fiscal responsibility record identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalResponsibilityRecordsApi()
val fiscalResponsibilityRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : kotlin.Any = Object // kotlin.Any | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalResponsibilityRecordUpdateDto : FiscalResponsibilityRecordUpdateDto =  // FiscalResponsibilityRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateFiscalResponsibilityRecord(fiscalResponsibilityRecordId, tenantId, apiVersion, xApiVersion, fiscalResponsibilityRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalResponsibilityRecordsApi#updateFiscalResponsibilityRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalResponsibilityRecordsApi#updateFiscalResponsibilityRecord")
    e.printStackTrace()
}
```

### Parameters
| **fiscalResponsibilityRecordId** | **java.util.UUID**|  | |
| **tenantId** | [**kotlin.Any**](.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalResponsibilityRecordUpdateDto** | [**FiscalResponsibilityRecordUpdateDto**](FiscalResponsibilityRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

