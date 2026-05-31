# BankProfilesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getBankProfiles**](BankProfilesApi.md#getBankProfiles) | **GET** /api/v2/AccountingService/BankProfiles | Get all bank profiles for a tenant |
| [**getBankProfilesCount**](BankProfilesApi.md#getBankProfilesCount) | **GET** /api/v2/AccountingService/BankProfiles/Count | Get bank profiles count |


<a id="getBankProfiles"></a>
# **getBankProfiles**
> BankProfileDtoListEnvelope getBankProfiles(tenantId, apiVersion, xApiVersion)

Get all bank profiles for a tenant

Retrieves all bank profiles for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankProfileDtoListEnvelope = apiInstance.getBankProfiles(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankProfilesApi#getBankProfiles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankProfilesApi#getBankProfiles")
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

[**BankProfileDtoListEnvelope**](BankProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBankProfilesCount"></a>
# **getBankProfilesCount**
> Int32Envelope getBankProfilesCount(tenantId, apiVersion, xApiVersion)

Get bank profiles count

Returns the count of bank profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBankProfilesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankProfilesApi#getBankProfilesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankProfilesApi#getBankProfilesCount")
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

