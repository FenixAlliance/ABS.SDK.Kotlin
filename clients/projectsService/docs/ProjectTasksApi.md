# ProjectTasksApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createProjectTaskAsync**](ProjectTasksApi.md#createProjectTaskAsync) | **POST** /api/v2/ProjectsService/ProjectTasks | Create a project task |
| [**deleteProjectTaskAsync**](ProjectTasksApi.md#deleteProjectTaskAsync) | **DELETE** /api/v2/ProjectsService/ProjectTasks/{projectTaskId} | Delete a project task |
| [**getProjectTaskByIdAsync**](ProjectTasksApi.md#getProjectTaskByIdAsync) | **GET** /api/v2/ProjectsService/ProjectTasks/{projectTaskId} | Get project task by ID |
| [**getProjectTasksAsync**](ProjectTasksApi.md#getProjectTasksAsync) | **GET** /api/v2/ProjectsService/ProjectTasks | Get all project tasks |
| [**getProjectTasksCountAsync**](ProjectTasksApi.md#getProjectTasksCountAsync) | **GET** /api/v2/ProjectsService/ProjectTasks/Count | Get project tasks count |
| [**patchProjectTaskAsync**](ProjectTasksApi.md#patchProjectTaskAsync) | **PATCH** /api/v2/ProjectsService/ProjectTasks/{projectTaskId} | Patch a project task |
| [**updateProjectTaskAsync**](ProjectTasksApi.md#updateProjectTaskAsync) | **PUT** /api/v2/ProjectsService/ProjectTasks/{projectTaskId} | Update a project task |


<a id="createProjectTaskAsync"></a>
# **createProjectTaskAsync**
> EmptyEnvelope createProjectTaskAsync(tenantId, apiVersion, xApiVersion, projectTaskCreateDto)

Create a project task

Creates a new project task.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTasksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTaskCreateDto : ProjectTaskCreateDto =  // ProjectTaskCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createProjectTaskAsync(tenantId, apiVersion, xApiVersion, projectTaskCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTasksApi#createProjectTaskAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTasksApi#createProjectTaskAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectTaskCreateDto** | [**ProjectTaskCreateDto**](ProjectTaskCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteProjectTaskAsync"></a>
# **deleteProjectTaskAsync**
> EmptyEnvelope deleteProjectTaskAsync(projectTaskId, tenantId, apiVersion, xApiVersion)

Delete a project task

Deletes a project task.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTasksApi()
val projectTaskId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteProjectTaskAsync(projectTaskId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTasksApi#deleteProjectTaskAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTasksApi#deleteProjectTaskAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectTaskId** | **java.util.UUID**|  | |
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

<a id="getProjectTaskByIdAsync"></a>
# **getProjectTaskByIdAsync**
> ProjectTaskDtoEnvelope getProjectTaskByIdAsync(projectTaskId, tenantId, apiVersion, xApiVersion)

Get project task by ID

Retrieves a specific project task.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTasksApi()
val projectTaskId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTaskDtoEnvelope = apiInstance.getProjectTaskByIdAsync(projectTaskId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTasksApi#getProjectTaskByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTasksApi#getProjectTaskByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectTaskId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ProjectTaskDtoEnvelope**](ProjectTaskDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTasksAsync"></a>
# **getProjectTasksAsync**
> ProjectTaskDtoListEnvelope getProjectTasksAsync(tenantId, apiVersion, xApiVersion, projectTaskDtoCollectionQueryParameters)

Get all project tasks

Retrieves all project tasks for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTasksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTaskDtoCollectionQueryParameters : ProjectTaskDtoCollectionQueryParameters =  // ProjectTaskDtoCollectionQueryParameters | 
try {
    val result : ProjectTaskDtoListEnvelope = apiInstance.getProjectTasksAsync(tenantId, apiVersion, xApiVersion, projectTaskDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTasksApi#getProjectTasksAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTasksApi#getProjectTasksAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectTaskDtoCollectionQueryParameters** | [**ProjectTaskDtoCollectionQueryParameters**](ProjectTaskDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ProjectTaskDtoListEnvelope**](ProjectTaskDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getProjectTasksCountAsync"></a>
# **getProjectTasksCountAsync**
> Int32Envelope getProjectTasksCountAsync(tenantId, apiVersion, xApiVersion, projectTaskDtoCollectionQueryParameters)

Get project tasks count

Returns the count of project tasks for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTasksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTaskDtoCollectionQueryParameters : ProjectTaskDtoCollectionQueryParameters =  // ProjectTaskDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getProjectTasksCountAsync(tenantId, apiVersion, xApiVersion, projectTaskDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTasksApi#getProjectTasksCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTasksApi#getProjectTasksCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectTaskDtoCollectionQueryParameters** | [**ProjectTaskDtoCollectionQueryParameters**](ProjectTaskDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchProjectTaskAsync"></a>
# **patchProjectTaskAsync**
> EmptyEnvelope patchProjectTaskAsync(projectTaskId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a project task

Partially updates an existing project task.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTasksApi()
val projectTaskId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchProjectTaskAsync(projectTaskId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTasksApi#patchProjectTaskAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTasksApi#patchProjectTaskAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectTaskId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProjectTaskAsync"></a>
# **updateProjectTaskAsync**
> EmptyEnvelope updateProjectTaskAsync(projectTaskId, tenantId, apiVersion, xApiVersion, projectTaskUpdateDto)

Update a project task

Updates an existing project task.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectTasksApi()
val projectTaskId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTaskUpdateDto : ProjectTaskUpdateDto =  // ProjectTaskUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateProjectTaskAsync(projectTaskId, tenantId, apiVersion, xApiVersion, projectTaskUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectTasksApi#updateProjectTaskAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectTasksApi#updateProjectTaskAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectTaskId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectTaskUpdateDto** | [**ProjectTaskUpdateDto**](ProjectTaskUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

