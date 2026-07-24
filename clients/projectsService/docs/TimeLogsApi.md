# TimeLogsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countProjectPeriodTimeLogsAsync**](TimeLogsApi.md#countProjectPeriodTimeLogsAsync) | **GET** /api/v2/ProjectsService/TimeLogs/Count | Get the count of project period time logs |
| [**createProjectTimeLogAsync**](TimeLogsApi.md#createProjectTimeLogAsync) | **POST** /api/v2/ProjectsService/TimeLogs | Create a new project time log |
| [**deleteProjectTimeLogAsync**](TimeLogsApi.md#deleteProjectTimeLogAsync) | **DELETE** /api/v2/ProjectsService/TimeLogs/{timeLogId} | Delete a project time log |
| [**getProjectPeriodTimeLogsAsync**](TimeLogsApi.md#getProjectPeriodTimeLogsAsync) | **GET** /api/v2/ProjectsService/TimeLogs | Retrieve project period time logs |
| [**getProjectTimeLogByIdAsync**](TimeLogsApi.md#getProjectTimeLogByIdAsync) | **GET** /api/v2/ProjectsService/TimeLogs/{timeLogId} | Retrieve a project time log by ID |
| [**getProjectTimeLogsAsync**](TimeLogsApi.md#getProjectTimeLogsAsync) | **GET** /api/v2/ProjectsService/TimeLogs/ForProject/{projectId} | Retrieve time logs for a project |
| [**getProjectTimeLogsByResponsibleContactAsync**](TimeLogsApi.md#getProjectTimeLogsByResponsibleContactAsync) | **GET** /api/v2/ProjectsService/TimeLogs/ByResponsibleContact | Retrieve time logs by responsible contact |
| [**getProjectTimeLogsCreatedByContactAsync**](TimeLogsApi.md#getProjectTimeLogsCreatedByContactAsync) | **GET** /api/v2/ProjectsService/TimeLogs/CreatedByContact | Retrieve time logs created by a contact |
| [**patchProjectTimeLogAsync**](TimeLogsApi.md#patchProjectTimeLogAsync) | **PATCH** /api/v2/ProjectsService/TimeLogs/{timeLogId} | Patch a project time log |
| [**updateProjectTimeLogAsync**](TimeLogsApi.md#updateProjectTimeLogAsync) | **PUT** /api/v2/ProjectsService/TimeLogs/{timeLogId} | Update a project time log |


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

val apiInstance = TimeLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#countProjectPeriodTimeLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#countProjectPeriodTimeLogsAsync")
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

val apiInstance = TimeLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTimeLogCreateDto : ProjectTimeLogCreateDto =  // ProjectTimeLogCreateDto | 
try {
    apiInstance.createProjectTimeLogAsync(tenantId, apiVersion, xApiVersion, projectTimeLogCreateDto)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#createProjectTimeLogAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#createProjectTimeLogAsync")
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

val apiInstance = TimeLogsApi()
val timeLogId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#deleteProjectTimeLogAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#deleteProjectTimeLogAsync")
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

val apiInstance = TimeLogsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectPeriodTimeLogsAsync(tenantId, projectPeriodId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#getProjectPeriodTimeLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#getProjectPeriodTimeLogsAsync")
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

val apiInstance = TimeLogsApi()
val timeLogId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoEnvelope = apiInstance.getProjectTimeLogByIdAsync(timeLogId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#getProjectTimeLogByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#getProjectTimeLogByIdAsync")
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

val apiInstance = TimeLogsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectTimeLogsAsync(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#getProjectTimeLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#getProjectTimeLogsAsync")
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

val apiInstance = TimeLogsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectTimeLogsByResponsibleContactAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#getProjectTimeLogsByResponsibleContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#getProjectTimeLogsByResponsibleContactAsync")
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

val apiInstance = TimeLogsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectTimeLogsCreatedByContactAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#getProjectTimeLogsCreatedByContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#getProjectTimeLogsCreatedByContactAsync")
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

<a id="patchProjectTimeLogAsync"></a>
# **patchProjectTimeLogAsync**
> patchProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, operation)

Patch a project time log

Partially updates an existing project time log entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeLogsApi()
val timeLogId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.patchProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, operation)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#patchProjectTimeLogAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#patchProjectTimeLogAsync")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
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

val apiInstance = TimeLogsApi()
val timeLogId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTimeLogUpdateDto : ProjectTimeLogUpdateDto =  // ProjectTimeLogUpdateDto | 
try {
    apiInstance.updateProjectTimeLogAsync(timeLogId, tenantId, apiVersion, xApiVersion, projectTimeLogUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling TimeLogsApi#updateProjectTimeLogAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogsApi#updateProjectTimeLogAsync")
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

