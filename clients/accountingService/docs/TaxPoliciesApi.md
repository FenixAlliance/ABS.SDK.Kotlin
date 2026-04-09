# TaxPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAppliedTaxPolicyRecord**](TaxPoliciesApi.md#createAppliedTaxPolicyRecord) | **POST** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords | Create an applied tax policy record |
| [**createItemTaxPolicyRecord**](TaxPoliciesApi.md#createItemTaxPolicyRecord) | **POST** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords | Create an item tax policy record |
| [**createTaxPolicy**](TaxPoliciesApi.md#createTaxPolicy) | **POST** /api/v2/AccountingService/TaxPolicies | Create a tax policy |
| [**deleteAppliedTaxPolicyRecord**](TaxPoliciesApi.md#deleteAppliedTaxPolicyRecord) | **DELETE** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords/{appliedTaxPolicyRecordId} | Delete an applied tax policy record |
| [**deleteItemTaxPolicyRecord**](TaxPoliciesApi.md#deleteItemTaxPolicyRecord) | **DELETE** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords/{itemTaxPolicyRecordId} | Delete an item tax policy record |
| [**deleteTaxPolicy**](TaxPoliciesApi.md#deleteTaxPolicy) | **DELETE** /api/v2/AccountingService/TaxPolicies/{id} | Delete a tax policy |
| [**getAppliedTaxPolicyRecord**](TaxPoliciesApi.md#getAppliedTaxPolicyRecord) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords/{appliedTaxPolicyRecordId} | Get applied tax policy record by ID |
| [**getAppliedTaxPolicyRecords**](TaxPoliciesApi.md#getAppliedTaxPolicyRecords) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords | Get applied tax policy records |
| [**getAppliedTaxPolicyRecordsCount**](TaxPoliciesApi.md#getAppliedTaxPolicyRecordsCount) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords/Count | Get applied tax policy records count |
| [**getItemTaxPolicyRecord**](TaxPoliciesApi.md#getItemTaxPolicyRecord) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords/{itemTaxPolicyRecordId} | Get item tax policy record by ID |
| [**getItemTaxPolicyRecords**](TaxPoliciesApi.md#getItemTaxPolicyRecords) | **GET** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords | Get item tax policy records |
| [**getTaxPolicies**](TaxPoliciesApi.md#getTaxPolicies) | **GET** /api/v2/AccountingService/TaxPolicies | Get all tax policies for a tenant |
| [**getTaxPoliciesByAuthority**](TaxPoliciesApi.md#getTaxPoliciesByAuthority) | **GET** /api/v2/AccountingService/TaxPolicies/ByAuthority/{authorityId} | Get tax policies by fiscal authority |
| [**getTaxPoliciesCount**](TaxPoliciesApi.md#getTaxPoliciesCount) | **GET** /api/v2/AccountingService/TaxPolicies/Count | Get tax policies count |
| [**getTaxPolicy**](TaxPoliciesApi.md#getTaxPolicy) | **GET** /api/v2/AccountingService/TaxPolicies/{id} | Get tax policy by ID |
| [**updateAppliedTaxPolicyRecord**](TaxPoliciesApi.md#updateAppliedTaxPolicyRecord) | **PUT** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/AppliedTaxPolicyRecords/{appliedTaxPolicyRecordId} | Update an applied tax policy record |
| [**updateItemTaxPolicyRecord**](TaxPoliciesApi.md#updateItemTaxPolicyRecord) | **PUT** /api/v2/AccountingService/TaxPolicies/{taxPolicyId}/ItemTaxPolicyRecords/{itemTaxPolicyRecordId} | Update an item tax policy record |
| [**updateTaxPolicy**](TaxPoliciesApi.md#updateTaxPolicy) | **PUT** /api/v2/AccountingService/TaxPolicies/{id} | Update a tax policy |


<a id="createAppliedTaxPolicyRecord"></a>
# **createAppliedTaxPolicyRecord**
> EmptyEnvelope createAppliedTaxPolicyRecord(taxPolicyId, tenantId, apiVersion, xApiVersion, appliedTaxPolicyRecordCreateDto)

Create an applied tax policy record

Creates a new applied tax policy record for the specified tax policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val appliedTaxPolicyRecordCreateDto : AppliedTaxPolicyRecordCreateDto =  // AppliedTaxPolicyRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAppliedTaxPolicyRecord(taxPolicyId, tenantId, apiVersion, xApiVersion, appliedTaxPolicyRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#createAppliedTaxPolicyRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#createAppliedTaxPolicyRecord")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appliedTaxPolicyRecordCreateDto** | [**AppliedTaxPolicyRecordCreateDto**](AppliedTaxPolicyRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createItemTaxPolicyRecord"></a>
# **createItemTaxPolicyRecord**
> EmptyEnvelope createItemTaxPolicyRecord(taxPolicyId, tenantId, apiVersion, xApiVersion, itemTaxPolicyRecordCreateDto)

Create an item tax policy record

Creates a new item tax policy record for the specified tax policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemTaxPolicyRecordCreateDto : ItemTaxPolicyRecordCreateDto =  // ItemTaxPolicyRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createItemTaxPolicyRecord(taxPolicyId, tenantId, apiVersion, xApiVersion, itemTaxPolicyRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#createItemTaxPolicyRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#createItemTaxPolicyRecord")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemTaxPolicyRecordCreateDto** | [**ItemTaxPolicyRecordCreateDto**](ItemTaxPolicyRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTaxPolicy"></a>
# **createTaxPolicy**
> EmptyEnvelope createTaxPolicy(tenantId, apiVersion, xApiVersion, taxPolicyCreateDto)

Create a tax policy

Creates a new tax policy for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taxPolicyCreateDto : TaxPolicyCreateDto =  // TaxPolicyCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTaxPolicy(tenantId, apiVersion, xApiVersion, taxPolicyCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#createTaxPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#createTaxPolicy")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taxPolicyCreateDto** | [**TaxPolicyCreateDto**](TaxPolicyCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAppliedTaxPolicyRecord"></a>
# **deleteAppliedTaxPolicyRecord**
> EmptyEnvelope deleteAppliedTaxPolicyRecord(taxPolicyId, appliedTaxPolicyRecordId, tenantId, apiVersion, xApiVersion)

Delete an applied tax policy record

Deletes an applied tax policy record identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appliedTaxPolicyRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAppliedTaxPolicyRecord(taxPolicyId, appliedTaxPolicyRecordId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#deleteAppliedTaxPolicyRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#deleteAppliedTaxPolicyRecord")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **appliedTaxPolicyRecordId** | **java.util.UUID**|  | |
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

<a id="deleteItemTaxPolicyRecord"></a>
# **deleteItemTaxPolicyRecord**
> EmptyEnvelope deleteItemTaxPolicyRecord(taxPolicyId, itemTaxPolicyRecordId, tenantId, apiVersion, xApiVersion)

Delete an item tax policy record

Deletes an item tax policy record identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTaxPolicyRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemTaxPolicyRecord(taxPolicyId, itemTaxPolicyRecordId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#deleteItemTaxPolicyRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#deleteItemTaxPolicyRecord")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **itemTaxPolicyRecordId** | **java.util.UUID**|  | |
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

<a id="deleteTaxPolicy"></a>
# **deleteTaxPolicy**
> EmptyEnvelope deleteTaxPolicy(id, tenantId, apiVersion, xApiVersion)

Delete a tax policy

Deletes a tax policy identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTaxPolicy(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#deleteTaxPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#deleteTaxPolicy")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="getAppliedTaxPolicyRecord"></a>
# **getAppliedTaxPolicyRecord**
> AppliedTaxPolicyRecordDtoEnvelope getAppliedTaxPolicyRecord(taxPolicyId, appliedTaxPolicyRecordId, tenantId, apiVersion, xApiVersion)

Get applied tax policy record by ID

Retrieves a specific applied tax policy record by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appliedTaxPolicyRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AppliedTaxPolicyRecordDtoEnvelope = apiInstance.getAppliedTaxPolicyRecord(taxPolicyId, appliedTaxPolicyRecordId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getAppliedTaxPolicyRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getAppliedTaxPolicyRecord")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **appliedTaxPolicyRecordId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AppliedTaxPolicyRecordDtoEnvelope**](AppliedTaxPolicyRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAppliedTaxPolicyRecords"></a>
# **getAppliedTaxPolicyRecords**
> AppliedTaxPolicyRecordDtoListEnvelope getAppliedTaxPolicyRecords(taxPolicyId, tenantId, apiVersion, xApiVersion)

Get applied tax policy records

Retrieves all applied tax policy records for the specified tax policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AppliedTaxPolicyRecordDtoListEnvelope = apiInstance.getAppliedTaxPolicyRecords(taxPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getAppliedTaxPolicyRecords")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getAppliedTaxPolicyRecords")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AppliedTaxPolicyRecordDtoListEnvelope**](AppliedTaxPolicyRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAppliedTaxPolicyRecordsCount"></a>
# **getAppliedTaxPolicyRecordsCount**
> Int32Envelope getAppliedTaxPolicyRecordsCount(taxPolicyId, tenantId, apiVersion, xApiVersion)

Get applied tax policy records count

Returns the total count of applied tax policy records for the specified tax policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAppliedTaxPolicyRecordsCount(taxPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getAppliedTaxPolicyRecordsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getAppliedTaxPolicyRecordsCount")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
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

<a id="getItemTaxPolicyRecord"></a>
# **getItemTaxPolicyRecord**
> ItemTaxPolicyRecordDtoEnvelope getItemTaxPolicyRecord(taxPolicyId, itemTaxPolicyRecordId, tenantId, apiVersion, xApiVersion)

Get item tax policy record by ID

Retrieves a specific item tax policy record by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTaxPolicyRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTaxPolicyRecordDtoEnvelope = apiInstance.getItemTaxPolicyRecord(taxPolicyId, itemTaxPolicyRecordId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getItemTaxPolicyRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getItemTaxPolicyRecord")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **itemTaxPolicyRecordId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTaxPolicyRecordDtoEnvelope**](ItemTaxPolicyRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemTaxPolicyRecords"></a>
# **getItemTaxPolicyRecords**
> ItemTaxPolicyRecordDtoListEnvelope getItemTaxPolicyRecords(taxPolicyId, tenantId, apiVersion, xApiVersion)

Get item tax policy records

Retrieves all item tax policy records for the specified tax policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTaxPolicyRecordDtoListEnvelope = apiInstance.getItemTaxPolicyRecords(taxPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getItemTaxPolicyRecords")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getItemTaxPolicyRecords")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTaxPolicyRecordDtoListEnvelope**](ItemTaxPolicyRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaxPolicies"></a>
# **getTaxPolicies**
> TaxPolicyDtoListEnvelope getTaxPolicies(tenantId, apiVersion, xApiVersion)

Get all tax policies for a tenant

Retrieves all tax policies for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaxPolicyDtoListEnvelope = apiInstance.getTaxPolicies(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getTaxPolicies")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getTaxPolicies")
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

[**TaxPolicyDtoListEnvelope**](TaxPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaxPoliciesByAuthority"></a>
# **getTaxPoliciesByAuthority**
> TaxPolicyDtoListEnvelope getTaxPoliciesByAuthority(authorityId, tenantId, apiVersion, xApiVersion)

Get tax policies by fiscal authority

Retrieves all tax policies associated with the specified fiscal authority.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val authorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaxPolicyDtoListEnvelope = apiInstance.getTaxPoliciesByAuthority(authorityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getTaxPoliciesByAuthority")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getTaxPoliciesByAuthority")
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

[**TaxPolicyDtoListEnvelope**](TaxPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaxPoliciesCount"></a>
# **getTaxPoliciesCount**
> Int32Envelope getTaxPoliciesCount(tenantId, apiVersion, xApiVersion)

Get tax policies count

Returns the count of tax policies for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTaxPoliciesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getTaxPoliciesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getTaxPoliciesCount")
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

<a id="getTaxPolicy"></a>
# **getTaxPolicy**
> TaxPolicyDtoEnvelope getTaxPolicy(id, tenantId, apiVersion, xApiVersion)

Get tax policy by ID

Retrieves a specific tax policy by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaxPolicyDtoEnvelope = apiInstance.getTaxPolicy(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#getTaxPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#getTaxPolicy")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TaxPolicyDtoEnvelope**](TaxPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateAppliedTaxPolicyRecord"></a>
# **updateAppliedTaxPolicyRecord**
> EmptyEnvelope updateAppliedTaxPolicyRecord(taxPolicyId, appliedTaxPolicyRecordId, tenantId, apiVersion, xApiVersion, appliedTaxPolicyRecordUpdateDto)

Update an applied tax policy record

Updates an existing applied tax policy record identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appliedTaxPolicyRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val appliedTaxPolicyRecordUpdateDto : AppliedTaxPolicyRecordUpdateDto =  // AppliedTaxPolicyRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAppliedTaxPolicyRecord(taxPolicyId, appliedTaxPolicyRecordId, tenantId, apiVersion, xApiVersion, appliedTaxPolicyRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#updateAppliedTaxPolicyRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#updateAppliedTaxPolicyRecord")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **appliedTaxPolicyRecordId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appliedTaxPolicyRecordUpdateDto** | [**AppliedTaxPolicyRecordUpdateDto**](AppliedTaxPolicyRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateItemTaxPolicyRecord"></a>
# **updateItemTaxPolicyRecord**
> EmptyEnvelope updateItemTaxPolicyRecord(taxPolicyId, itemTaxPolicyRecordId, tenantId, apiVersion, xApiVersion, itemTaxPolicyRecordUpdateDto)

Update an item tax policy record

Updates an existing item tax policy record identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTaxPolicyRecordId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemTaxPolicyRecordUpdateDto : ItemTaxPolicyRecordUpdateDto =  // ItemTaxPolicyRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemTaxPolicyRecord(taxPolicyId, itemTaxPolicyRecordId, tenantId, apiVersion, xApiVersion, itemTaxPolicyRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#updateItemTaxPolicyRecord")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#updateItemTaxPolicyRecord")
    e.printStackTrace()
}
```

### Parameters
| **taxPolicyId** | **java.util.UUID**|  | |
| **itemTaxPolicyRecordId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemTaxPolicyRecordUpdateDto** | [**ItemTaxPolicyRecordUpdateDto**](ItemTaxPolicyRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateTaxPolicy"></a>
# **updateTaxPolicy**
> EmptyEnvelope updateTaxPolicy(id, tenantId, apiVersion, xApiVersion, taxPolicyUpdateDto)

Update a tax policy

Updates an existing tax policy identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxPoliciesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taxPolicyUpdateDto : TaxPolicyUpdateDto =  // TaxPolicyUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTaxPolicy(id, tenantId, apiVersion, xApiVersion, taxPolicyUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxPoliciesApi#updateTaxPolicy")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxPoliciesApi#updateTaxPolicy")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taxPolicyUpdateDto** | [**TaxPolicyUpdateDto**](TaxPolicyUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

