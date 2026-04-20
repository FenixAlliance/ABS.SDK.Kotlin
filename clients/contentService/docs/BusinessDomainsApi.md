# BusinessDomainsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getBusinessDomainByIdAsync**](BusinessDomainsApi.md#getBusinessDomainByIdAsync) | **GET** /api/v2/ContentService/BusinessDomains/{businessDomainId} | Get business domain by ID |
| [**getBusinessDomainsAsync**](BusinessDomainsApi.md#getBusinessDomainsAsync) | **GET** /api/v2/ContentService/BusinessDomains | Get business domains |
| [**getBusinessDomainsCountAsync**](BusinessDomainsApi.md#getBusinessDomainsCountAsync) | **GET** /api/v2/ContentService/BusinessDomains/Count | Get business domains count |


<a id="getBusinessDomainByIdAsync"></a>
# **getBusinessDomainByIdAsync**
> BusinessDomainDtoEnvelope getBusinessDomainByIdAsync(businessDomainId, tenantId, apiVersion, xApiVersion)

Get business domain by ID

Retrieves a specific business domain.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val businessDomainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessDomainDtoEnvelope = apiInstance.getBusinessDomainByIdAsync(businessDomainId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getBusinessDomainByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getBusinessDomainByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **businessDomainId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BusinessDomainDtoEnvelope**](BusinessDomainDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessDomainsAsync"></a>
# **getBusinessDomainsAsync**
> BusinessDomainDtoListEnvelope getBusinessDomainsAsync(tenantId, apiVersion, xApiVersion)

Get business domains

Retrieves business domains for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessDomainDtoListEnvelope = apiInstance.getBusinessDomainsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getBusinessDomainsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getBusinessDomainsAsync")
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

[**BusinessDomainDtoListEnvelope**](BusinessDomainDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessDomainsCountAsync"></a>
# **getBusinessDomainsCountAsync**
> Int32Envelope getBusinessDomainsCountAsync(tenantId, apiVersion, xApiVersion)

Get business domains count

Retrieves the count of business domains for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBusinessDomainsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getBusinessDomainsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getBusinessDomainsCountAsync")
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

