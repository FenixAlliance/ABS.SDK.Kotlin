# AccountingPeriodsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAccountingPeriod**](AccountingPeriodsApi.md#createAccountingPeriod) | **POST** /api/v2/AccountingService/AccountingPeriods | Creates a new accounting period |
| [**deleteAccountingPeriod**](AccountingPeriodsApi.md#deleteAccountingPeriod) | **DELETE** /api/v2/AccountingService/AccountingPeriods/{accountingPeriodId} | Deletes an existing accounting period |
| [**getAccountingPeriod**](AccountingPeriodsApi.md#getAccountingPeriod) | **GET** /api/v2/AccountingService/AccountingPeriods/{accountingPeriodId} | Gets the current tenant accounting period |
| [**getAccountingPeriods**](AccountingPeriodsApi.md#getAccountingPeriods) | **GET** /api/v2/AccountingService/AccountingPeriods | Get all accounting periods for a tenant |
| [**getAccountingPeriodsCountAsync**](AccountingPeriodsApi.md#getAccountingPeriodsCountAsync) | **GET** /api/v2/AccountingService/AccountingPeriods/Count | Gets the current tenant accounting periods count |
| [**updateAccountingPeriod**](AccountingPeriodsApi.md#updateAccountingPeriod) | **PUT** /api/v2/AccountingService/AccountingPeriods/{accountingPeriodId} | Updates an existing accounting period |


<a id="createAccountingPeriod"></a>
# **createAccountingPeriod**
> EmptyEnvelope createAccountingPeriod(tenantId, apiVersion, xApiVersion, accountingPeriodCreateDto)

Creates a new accounting period

Creates a new accounting period.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountingPeriodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountingPeriodCreateDto : AccountingPeriodCreateDto =  // AccountingPeriodCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAccountingPeriod(tenantId, apiVersion, xApiVersion, accountingPeriodCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountingPeriodsApi#createAccountingPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountingPeriodsApi#createAccountingPeriod")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountingPeriodCreateDto** | [**AccountingPeriodCreateDto**](AccountingPeriodCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAccountingPeriod"></a>
# **deleteAccountingPeriod**
> EmptyEnvelope deleteAccountingPeriod(accountingPeriodId, tenantId, apiVersion, xApiVersion)

Deletes an existing accounting period

Deletes an existing accounting period.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountingPeriodsApi()
val accountingPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAccountingPeriod(accountingPeriodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountingPeriodsApi#deleteAccountingPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountingPeriodsApi#deleteAccountingPeriod")
    e.printStackTrace()
}
```

### Parameters
| **accountingPeriodId** | **java.util.UUID**|  | |
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

<a id="getAccountingPeriod"></a>
# **getAccountingPeriod**
> AccountingPeriodDtoEnvelope getAccountingPeriod(accountingPeriodId, tenantId, apiVersion, xApiVersion)

Gets the current tenant accounting period

Get the currently acting tenant accounting period.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountingPeriodsApi()
val accountingPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountingPeriodDtoEnvelope = apiInstance.getAccountingPeriod(accountingPeriodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountingPeriodsApi#getAccountingPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountingPeriodsApi#getAccountingPeriod")
    e.printStackTrace()
}
```

### Parameters
| **accountingPeriodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountingPeriodDtoEnvelope**](AccountingPeriodDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountingPeriods"></a>
# **getAccountingPeriods**
> AccountingPeriodDtoListEnvelope getAccountingPeriods(tenantId, apiVersion, xApiVersion)

Get all accounting periods for a tenant

Retrieves all accounting periods for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountingPeriodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountingPeriodDtoListEnvelope = apiInstance.getAccountingPeriods(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountingPeriodsApi#getAccountingPeriods")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountingPeriodsApi#getAccountingPeriods")
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

[**AccountingPeriodDtoListEnvelope**](AccountingPeriodDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountingPeriodsCountAsync"></a>
# **getAccountingPeriodsCountAsync**
> Int32Envelope getAccountingPeriodsCountAsync(tenantId, apiVersion, xApiVersion)

Gets the current tenant accounting periods count

Get the currently acting tenant accounting periods count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountingPeriodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAccountingPeriodsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountingPeriodsApi#getAccountingPeriodsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountingPeriodsApi#getAccountingPeriodsCountAsync")
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

<a id="updateAccountingPeriod"></a>
# **updateAccountingPeriod**
> EmptyEnvelope updateAccountingPeriod(accountingPeriodId, tenantId, apiVersion, xApiVersion, accountingPeriodUpdateDto)

Updates an existing accounting period

Updates an existing accounting period.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountingPeriodsApi()
val accountingPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountingPeriodUpdateDto : AccountingPeriodUpdateDto =  // AccountingPeriodUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAccountingPeriod(accountingPeriodId, tenantId, apiVersion, xApiVersion, accountingPeriodUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountingPeriodsApi#updateAccountingPeriod")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountingPeriodsApi#updateAccountingPeriod")
    e.printStackTrace()
}
```

### Parameters
| **accountingPeriodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountingPeriodUpdateDto** | [**AccountingPeriodUpdateDto**](AccountingPeriodUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

