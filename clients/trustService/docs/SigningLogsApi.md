# SigningLogsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSigningLogByIdAsync**](SigningLogsApi.md#getSigningLogByIdAsync) | **GET** /api/v2/TrustService/SigningLogs/{id} | Get signing log by ID |
| [**getSigningLogsAsync**](SigningLogsApi.md#getSigningLogsAsync) | **GET** /api/v2/TrustService/SigningLogs | Get all signing logs |
| [**getSigningLogsCountAsync**](SigningLogsApi.md#getSigningLogsCountAsync) | **GET** /api/v2/TrustService/SigningLogs/Count | Get signing logs count |


<a id="getSigningLogByIdAsync"></a>
# **getSigningLogByIdAsync**
> SigningLogDto getSigningLogByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signing log by ID

Retrieves a specific signing log by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningLogsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningLogDto = apiInstance.getSigningLogByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningLogsApi#getSigningLogByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningLogsApi#getSigningLogByIdAsync")
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

[**SigningLogDto**](SigningLogDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningLogsAsync"></a>
# **getSigningLogsAsync**
> SigningLogDtoListEnvelope getSigningLogsAsync(tenantId, apiVersion, xApiVersion, signingLogDtoCollectionQueryParameters)

Get all signing logs

Retrieves all signing logs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingLogDtoCollectionQueryParameters : SigningLogDtoCollectionQueryParameters =  // SigningLogDtoCollectionQueryParameters | 
try {
    val result : SigningLogDtoListEnvelope = apiInstance.getSigningLogsAsync(tenantId, apiVersion, xApiVersion, signingLogDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningLogsApi#getSigningLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningLogsApi#getSigningLogsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingLogDtoCollectionQueryParameters** | [**SigningLogDtoCollectionQueryParameters**](SigningLogDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SigningLogDtoListEnvelope**](SigningLogDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSigningLogsCountAsync"></a>
# **getSigningLogsCountAsync**
> Int32Envelope getSigningLogsCountAsync(tenantId, apiVersion, xApiVersion, signingLogDtoCollectionQueryParameters)

Get signing logs count

Returns the count of signing logs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingLogDtoCollectionQueryParameters : SigningLogDtoCollectionQueryParameters =  // SigningLogDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSigningLogsCountAsync(tenantId, apiVersion, xApiVersion, signingLogDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningLogsApi#getSigningLogsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningLogsApi#getSigningLogsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingLogDtoCollectionQueryParameters** | [**SigningLogDtoCollectionQueryParameters**](SigningLogDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

