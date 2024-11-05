# ProjectTimeLogsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/ByResponsibleContact |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/CreatedByContact |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/ForProject/{projectId} |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsPost**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsPost) | **POST** /api/v2/TimeTrackerService/ProjectTimeLogs |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete) | **DELETE** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |
| [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut**](ProjectTimeLogsApi.md#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut) | **PUT** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |


<a id="apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet**
> ProjectTimeLogDtoListEnvelope apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet(contactId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTimeLogsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet**
> ProjectTimeLogDtoListEnvelope apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet(contactId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTimeLogsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet**
> ProjectTimeLogDtoListEnvelope apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTimeLogsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceProjectTimeLogsGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsGet**
> ProjectTimeLogDtoListEnvelope apiV2TimeTrackerServiceProjectTimeLogsGet(tenantId, projectPeriodId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTimeLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsGet(tenantId, projectPeriodId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **projectPeriodId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceProjectTimeLogsPost"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsPost**
> apiV2TimeTrackerServiceProjectTimeLogsPost(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTimeLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTimeLogCreateDto : ProjectTimeLogCreateDto =  // ProjectTimeLogCreateDto | 
try {
    apiInstance.apiV2TimeTrackerServiceProjectTimeLogsPost(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectTimeLogCreateDto** | [**ProjectTimeLogCreateDto**](ProjectTimeLogCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete**
> apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete(timeLogId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTimeLogsApi()
val timeLogId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete(timeLogId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **timeLogId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet**
> ProjectTimeLogDtoEnvelope apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet(timeLogId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTimeLogsApi()
val timeLogId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoEnvelope = apiInstance.apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet(timeLogId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet")
    e.printStackTrace()
}
```

### Parameters
| **timeLogId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ProjectTimeLogDtoEnvelope**](ProjectTimeLogDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut"></a>
# **apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut**
> apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTimeLogsApi()
val timeLogId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTimeLogUpdateDto : ProjectTimeLogUpdateDto =  // ProjectTimeLogUpdateDto | 
try {
    apiInstance.apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut")
    e.printStackTrace()
}
```

### Parameters
| **timeLogId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectTimeLogUpdateDto** | [**ProjectTimeLogUpdateDto**](ProjectTimeLogUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

