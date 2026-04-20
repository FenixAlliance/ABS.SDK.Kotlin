# ProjectTimeLogsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countProjectPeriodTimeLogsAsync**](ProjectTimeLogsApi.md#countProjectPeriodTimeLogsAsync) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/Count | Get the count of project period time logs |
| [**createProjectTimeLogAsync**](ProjectTimeLogsApi.md#createProjectTimeLogAsync) | **POST** /api/v2/TimeTrackerService/ProjectTimeLogs | Create a new project time log |
| [**deleteProjectTimeLogAsync**](ProjectTimeLogsApi.md#deleteProjectTimeLogAsync) | **DELETE** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} | Delete a project time log |
| [**getProjectPeriodTimeLogsAsync**](ProjectTimeLogsApi.md#getProjectPeriodTimeLogsAsync) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs | Retrieve project period time logs |
| [**getProjectTimeLogByIdAsync**](ProjectTimeLogsApi.md#getProjectTimeLogByIdAsync) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} | Retrieve a project time log by ID |
| [**getProjectTimeLogsAsync**](ProjectTimeLogsApi.md#getProjectTimeLogsAsync) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/ForProject/{projectId} | Retrieve time logs for a project |
| [**getProjectTimeLogsByResponsibleContactAsync**](ProjectTimeLogsApi.md#getProjectTimeLogsByResponsibleContactAsync) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/ByResponsibleContact | Retrieve time logs by responsible contact |
| [**getProjectTimeLogsCreatedByContactAsync**](ProjectTimeLogsApi.md#getProjectTimeLogsCreatedByContactAsync) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/CreatedByContact | Retrieve time logs created by a contact |
| [**updateProjectTimeLogAsync**](ProjectTimeLogsApi.md#updateProjectTimeLogAsync) | **PUT** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} | Update a project time log |


<a id="countProjectPeriodTimeLogsAsync"></a>
# **countProjectPeriodTimeLogsAsync**
> Int32Envelope countProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion)

Get the count of project period time logs

Returns the total count of time logs for a specific project period with OData query support.

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
    val result : Int32Envelope = apiInstance.countProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#countProjectPeriodTimeLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#countProjectPeriodTimeLogsAsync")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createProjectTimeLogAsync"></a>
# **createProjectTimeLogAsync**
> createProjectTimeLogAsync(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto)

Create a new project time log

Creates a new project time log entry.

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
    apiInstance.createProjectTimeLogAsync(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#createProjectTimeLogAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#createProjectTimeLogAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteProjectTimeLogAsync"></a>
# **deleteProjectTimeLogAsync**
> deleteProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion)

Delete a project time log

Deletes a project time log entry.

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
    apiInstance.deleteProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#deleteProjectTimeLogAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#deleteProjectTimeLogAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectPeriodTimeLogsAsync"></a>
# **getProjectPeriodTimeLogsAsync**
> ProjectTimeLogDtoListEnvelope getProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion)

Retrieve project period time logs

Retrieves a list of time logs for a specific project period with OData query support.

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
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#getProjectPeriodTimeLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#getProjectPeriodTimeLogsAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTimeLogByIdAsync"></a>
# **getProjectTimeLogByIdAsync**
> ProjectTimeLogDtoEnvelope getProjectTimeLogByIdAsync(timeLogId, tenantId, apiVersion, xApiVersion)

Retrieve a project time log by ID

Retrieves a single project time log by its unique identifier.

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
    val result : ProjectTimeLogDtoEnvelope = apiInstance.getProjectTimeLogByIdAsync(timeLogId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#getProjectTimeLogByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#getProjectTimeLogByIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTimeLogsAsync"></a>
# **getProjectTimeLogsAsync**
> ProjectTimeLogDtoListEnvelope getProjectTimeLogsAsync(projectId, tenantId, apiVersion, xApiVersion)

Retrieve time logs for a project

Retrieves all time logs associated with the specified project.

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
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectTimeLogsAsync(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#getProjectTimeLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#getProjectTimeLogsAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTimeLogsByResponsibleContactAsync"></a>
# **getProjectTimeLogsByResponsibleContactAsync**
> ProjectTimeLogDtoListEnvelope getProjectTimeLogsByResponsibleContactAsync(contactId, tenantId, apiVersion, xApiVersion)

Retrieve time logs by responsible contact

Retrieves time logs where the specified contact is the responsible party.

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
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectTimeLogsByResponsibleContactAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#getProjectTimeLogsByResponsibleContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#getProjectTimeLogsByResponsibleContactAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTimeLogsCreatedByContactAsync"></a>
# **getProjectTimeLogsCreatedByContactAsync**
> ProjectTimeLogDtoListEnvelope getProjectTimeLogsCreatedByContactAsync(contactId, tenantId, apiVersion, xApiVersion)

Retrieve time logs created by a contact

Retrieves time logs that were created by the specified contact.

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
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectTimeLogsCreatedByContactAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#getProjectTimeLogsCreatedByContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#getProjectTimeLogsCreatedByContactAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateProjectTimeLogAsync"></a>
# **updateProjectTimeLogAsync**
> updateProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto)

Update a project time log

Updates an existing project time log entry.

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
    apiInstance.updateProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ProjectTimeLogsApi#updateProjectTimeLogAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTimeLogsApi#updateProjectTimeLogAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

