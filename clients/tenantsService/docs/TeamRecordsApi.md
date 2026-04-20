# TeamRecordsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantTeamRecord**](TeamRecordsApi.md#createTenantTeamRecord) | **POST** /api/v2/TenantsService/TeamRecords | Create a new tenant team record |
| [**deleteTenantTeamRecord**](TeamRecordsApi.md#deleteTenantTeamRecord) | **DELETE** /api/v2/TenantsService/TeamRecords/{tenantTeamRecordId} | Delete a tenant team record |
| [**getTenantTeamRecordById**](TeamRecordsApi.md#getTenantTeamRecordById) | **GET** /api/v2/TenantsService/TeamRecords/{tenantTeamRecordId} | Retrieve a single tenant team record by its ID |
| [**getTenantTeamRecords**](TeamRecordsApi.md#getTenantTeamRecords) | **GET** /api/v2/TenantsService/TeamRecords | Retrieve a list of tenant team records |
| [**getTenantTeamRecordsCount**](TeamRecordsApi.md#getTenantTeamRecordsCount) | **GET** /api/v2/TenantsService/TeamRecords/Count | Get the count of tenant team records |
| [**updateTenantTeamRecord**](TeamRecordsApi.md#updateTenantTeamRecord) | **PUT** /api/v2/TenantsService/TeamRecords/{tenantTeamRecordId} | Update a tenant team record |


<a id="createTenantTeamRecord"></a>
# **createTenantTeamRecord**
> EmptyEnvelope createTenantTeamRecord(tenantId, apiVersion, xApiVersion, tenantTeamRecordCreateDto)

Create a new tenant team record

Create a new tenant team record

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamRecordsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamRecordCreateDto : TenantTeamRecordCreateDto =  // TenantTeamRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantTeamRecord(tenantId, apiVersion, xApiVersion, tenantTeamRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamRecordsApi#createTenantTeamRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamRecordsApi#createTenantTeamRecord")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamRecordCreateDto** | [**TenantTeamRecordCreateDto**](TenantTeamRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantTeamRecord"></a>
# **deleteTenantTeamRecord**
> EmptyEnvelope deleteTenantTeamRecord(tenantTeamRecordId, tenantId, apiVersion, xApiVersion)

Delete a tenant team record

Delete a tenant team record

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamRecordsApi()
val tenantTeamRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantTeamRecord(tenantTeamRecordId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamRecordsApi#deleteTenantTeamRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamRecordsApi#deleteTenantTeamRecord")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamRecordId** | **java.util.UUID**|  | |
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

<a id="getTenantTeamRecordById"></a>
# **getTenantTeamRecordById**
> TenantTeamRecordDtoEnvelope getTenantTeamRecordById(tenantTeamRecordId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant team record by its ID

Retrieve a single tenant team record by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamRecordsApi()
val tenantTeamRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamRecordDtoEnvelope = apiInstance.getTenantTeamRecordById(tenantTeamRecordId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamRecordsApi#getTenantTeamRecordById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamRecordsApi#getTenantTeamRecordById")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamRecordId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantTeamRecordDtoEnvelope**](TenantTeamRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTeamRecords"></a>
# **getTenantTeamRecords**
> TenantTeamRecordDtoListEnvelope getTenantTeamRecords(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant team records

Retrieve a list of tenant team records

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamRecordsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamRecordDtoListEnvelope = apiInstance.getTenantTeamRecords(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamRecordsApi#getTenantTeamRecords")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamRecordsApi#getTenantTeamRecords")
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

[**TenantTeamRecordDtoListEnvelope**](TenantTeamRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTeamRecordsCount"></a>
# **getTenantTeamRecordsCount**
> Int32Envelope getTenantTeamRecordsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant team records

Get the count of tenant team records

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamRecordsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantTeamRecordsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamRecordsApi#getTenantTeamRecordsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamRecordsApi#getTenantTeamRecordsCount")
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

<a id="updateTenantTeamRecord"></a>
# **updateTenantTeamRecord**
> EmptyEnvelope updateTenantTeamRecord(tenantTeamRecordId, tenantId, apiVersion, xApiVersion, tenantTeamRecordUpdateDto)

Update a tenant team record

Update a tenant team record

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamRecordsApi()
val tenantTeamRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamRecordUpdateDto : TenantTeamRecordUpdateDto =  // TenantTeamRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantTeamRecord(tenantTeamRecordId, tenantId, apiVersion, xApiVersion, tenantTeamRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamRecordsApi#updateTenantTeamRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamRecordsApi#updateTenantTeamRecord")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamRecordId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamRecordUpdateDto** | [**TenantTeamRecordUpdateDto**](TenantTeamRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

