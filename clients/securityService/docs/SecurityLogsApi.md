# SecurityLogsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSecurityLogsAsync**](SecurityLogsApi.md#getSecurityLogsAsync) | **GET** /api/v2/SecurityService/SecurityLogs | Get business security logs |
| [**getSecurityLogsCountAsync**](SecurityLogsApi.md#getSecurityLogsCountAsync) | **GET** /api/v2/SecurityService/SecurityLogs/Count | Get business security logs count |


<a id="getSecurityLogsAsync"></a>
# **getSecurityLogsAsync**
> BusinessSecurityLogDtoListEnvelope getSecurityLogsAsync(tenantId, apiVersion, xApiVersion)

Get business security logs

Retrieves security logs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessSecurityLogDtoListEnvelope = apiInstance.getSecurityLogsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityLogsApi#getSecurityLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityLogsApi#getSecurityLogsAsync")
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

[**BusinessSecurityLogDtoListEnvelope**](BusinessSecurityLogDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSecurityLogsCountAsync"></a>
# **getSecurityLogsCountAsync**
> Int32Envelope getSecurityLogsCountAsync(tenantId, apiVersion, xApiVersion)

Get business security logs count

Retrieves the count of security logs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSecurityLogsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityLogsApi#getSecurityLogsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityLogsApi#getSecurityLogsCountAsync")
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

