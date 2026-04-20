# LogsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getLogsAsync**](LogsApi.md#getLogsAsync) | **GET** /api/v2/SecurityService/Logs | Get tenant logs |
| [**getLogsCountAsync**](LogsApi.md#getLogsCountAsync) | **GET** /api/v2/SecurityService/Logs/Count | Get tenant logs count |


<a id="getLogsAsync"></a>
# **getLogsAsync**
> LogDtoListEnvelope getLogsAsync(tenantId, apiVersion, xApiVersion)

Get tenant logs

Retrieves logs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LogDtoListEnvelope = apiInstance.getLogsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogsApi#getLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogsApi#getLogsAsync")
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

[**LogDtoListEnvelope**](LogDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLogsCountAsync"></a>
# **getLogsCountAsync**
> Int32Envelope getLogsCountAsync(tenantId, apiVersion, xApiVersion)

Get tenant logs count

Retrieves the count of logs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getLogsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LogsApi#getLogsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LogsApi#getLogsCountAsync")
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

