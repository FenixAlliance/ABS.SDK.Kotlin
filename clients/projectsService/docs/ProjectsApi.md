# ProjectsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createProjectAsync**](ProjectsApi.md#createProjectAsync) | **POST** /api/v2/ProjectsService/Projects | Creates a new project |
| [**createProjectPeriodAsync**](ProjectsApi.md#createProjectPeriodAsync) | **POST** /api/v2/ProjectsService/Projects/{projectId}/Periods | Creates a project period |
| [**createProjectTaskAsync**](ProjectsApi.md#createProjectTaskAsync) | **POST** /api/v2/ProjectsService/Projects/{projectId}/Tasks | Creates a project task |
| [**deleteProjectAsync**](ProjectsApi.md#deleteProjectAsync) | **DELETE** /api/v2/ProjectsService/Projects/{projectId} | Deletes a project |
| [**deleteProjectPeriodAsync**](ProjectsApi.md#deleteProjectPeriodAsync) | **DELETE** /api/v2/ProjectsService/Projects/{projectId}/Periods/{projectPeriodId} | Deletes a project period |
| [**deleteProjectTaskAsync**](ProjectsApi.md#deleteProjectTaskAsync) | **DELETE** /api/v2/ProjectsService/Projects/{projectId}/Tasks/{projectTaskId} | Deletes a project task |
| [**getProjectByIdAsync**](ProjectsApi.md#getProjectByIdAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId} | Gets a project by ID |
| [**getProjectPeriodsAsync**](ProjectsApi.md#getProjectPeriodsAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Periods | Retrieves project periods |
| [**getProjectTaskCategoriesAsync**](ProjectsApi.md#getProjectTaskCategoriesAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TaskCategories | Retrieves project task categories |
| [**getProjectTaskCategoriesCountAsync**](ProjectsApi.md#getProjectTaskCategoriesCountAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TaskCategories/Count | Counts project task categories |
| [**getProjectTasksAsync**](ProjectsApi.md#getProjectTasksAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Tasks | Retrieves project tasks |
| [**getProjectTasksCountAsync**](ProjectsApi.md#getProjectTasksCountAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Tasks/Count | Counts project tasks |
| [**getProjectTimeLogsAsync**](ProjectsApi.md#getProjectTimeLogsAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TimeLogs | Retrieves project time logs |
| [**getProjectTimeLogsCountAsync**](ProjectsApi.md#getProjectTimeLogsCountAsync) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TimeLogs/Count | Counts project time logs |
| [**getProjectsByTenantIdAsync**](ProjectsApi.md#getProjectsByTenantIdAsync) | **GET** /api/v2/ProjectsService/Projects | Retrieves all projects |
| [**getProjectsCountByTenantIdAsync**](ProjectsApi.md#getProjectsCountByTenantIdAsync) | **GET** /api/v2/ProjectsService/Projects/Count | Counts projects |
| [**updateProjectAsync**](ProjectsApi.md#updateProjectAsync) | **PUT** /api/v2/ProjectsService/Projects/{projectId} | Updates a project |
| [**updateProjectPeriodAsync**](ProjectsApi.md#updateProjectPeriodAsync) | **PUT** /api/v2/ProjectsService/Projects/{projectId}/Periods/{projectPeriodId} | Updates a project period |
| [**updateProjectTaskAsync**](ProjectsApi.md#updateProjectTaskAsync) | **PUT** /api/v2/ProjectsService/Projects/{projectId}/Tasks/{projectTaskId} | Updates a project task |


<a id="createProjectAsync"></a>
# **createProjectAsync**
> EmptyEnvelope createProjectAsync(tenantId, projectCreateDto)

Creates a new project

Creates a new project for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectCreateDto : ProjectCreateDto =  // ProjectCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createProjectAsync(tenantId, projectCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProjectAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProjectAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectCreateDto** | [**ProjectCreateDto**](ProjectCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createProjectPeriodAsync"></a>
# **createProjectPeriodAsync**
> EmptyEnvelope createProjectPeriodAsync(projectId, tenantId, projectPeriodCreateDto)

Creates a project period

Creates a new period for the specified project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodCreateDto : ProjectPeriodCreateDto =  // ProjectPeriodCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createProjectPeriodAsync(projectId, tenantId, projectPeriodCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProjectPeriodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProjectPeriodAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectPeriodCreateDto** | [**ProjectPeriodCreateDto**](ProjectPeriodCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createProjectTaskAsync"></a>
# **createProjectTaskAsync**
> EmptyEnvelope createProjectTaskAsync(projectId, tenantId, projectTaskCreateDto)

Creates a project task

Creates a new task for the specified project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectTaskCreateDto : ProjectTaskCreateDto =  // ProjectTaskCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createProjectTaskAsync(projectId, tenantId, projectTaskCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#createProjectTaskAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#createProjectTaskAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="deleteProjectAsync"></a>
# **deleteProjectAsync**
> EmptyEnvelope deleteProjectAsync(projectId, tenantId)

Deletes a project

Deletes the specified project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteProjectAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProjectAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProjectAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteProjectPeriodAsync"></a>
# **deleteProjectPeriodAsync**
> EmptyEnvelope deleteProjectPeriodAsync(projectId, projectPeriodId, tenantId)

Deletes a project period

Deletes the specified period from a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteProjectPeriodAsync(projectId, projectPeriodId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProjectPeriodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProjectPeriodAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **projectPeriodId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteProjectTaskAsync"></a>
# **deleteProjectTaskAsync**
> EmptyEnvelope deleteProjectTaskAsync(projectId, projectTaskId, tenantId)

Deletes a project task

Deletes the specified task from a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectTaskId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteProjectTaskAsync(projectId, projectTaskId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#deleteProjectTaskAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#deleteProjectTaskAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **projectTaskId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectByIdAsync"></a>
# **getProjectByIdAsync**
> ProjectDtoEnvelope getProjectByIdAsync(projectId, tenantId)

Gets a project by ID

Retrieves the details of a project using its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ProjectDtoEnvelope = apiInstance.getProjectByIdAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ProjectDtoEnvelope**](ProjectDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectPeriodsAsync"></a>
# **getProjectPeriodsAsync**
> ProjectPeriodDtoListEnvelope getProjectPeriodsAsync(projectId, tenantId)

Retrieves project periods

Gets all periods for a specific project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ProjectPeriodDtoListEnvelope = apiInstance.getProjectPeriodsAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectPeriodsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectPeriodsAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ProjectPeriodDtoListEnvelope**](ProjectPeriodDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTaskCategoriesAsync"></a>
# **getProjectTaskCategoriesAsync**
> TaskCategoryDtoListEnvelope getProjectTaskCategoriesAsync(projectId, tenantId)

Retrieves project task categories

Gets all task categories for a specific project with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TaskCategoryDtoListEnvelope = apiInstance.getProjectTaskCategoriesAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectTaskCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectTaskCategoriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**TaskCategoryDtoListEnvelope**](TaskCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTaskCategoriesCountAsync"></a>
# **getProjectTaskCategoriesCountAsync**
> Int32Envelope getProjectTaskCategoriesCountAsync(projectId, tenantId)

Counts project task categories

Gets the count of task categories for a specific project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getProjectTaskCategoriesCountAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectTaskCategoriesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectTaskCategoriesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTasksAsync"></a>
# **getProjectTasksAsync**
> ProjectTaskDtoListEnvelope getProjectTasksAsync(projectId, tenantId)

Retrieves project tasks

Gets all tasks for a specific project with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ProjectTaskDtoListEnvelope = apiInstance.getProjectTasksAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectTasksAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectTasksAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ProjectTaskDtoListEnvelope**](ProjectTaskDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTasksCountAsync"></a>
# **getProjectTasksCountAsync**
> Int32Envelope getProjectTasksCountAsync(projectId, tenantId)

Counts project tasks

Gets the count of tasks for a specific project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getProjectTasksCountAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectTasksCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectTasksCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTimeLogsAsync"></a>
# **getProjectTimeLogsAsync**
> ProjectTimeLogDtoListEnvelope getProjectTimeLogsAsync(projectId, tenantId)

Retrieves project time logs

Gets all time log entries for a specific project with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.getProjectTimeLogsAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectTimeLogsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectTimeLogsAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ProjectTimeLogDtoListEnvelope**](ProjectTimeLogDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectTimeLogsCountAsync"></a>
# **getProjectTimeLogsCountAsync**
> Int32Envelope getProjectTimeLogsCountAsync(projectId, tenantId)

Counts project time logs

Gets the count of time log entries for a specific project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getProjectTimeLogsCountAsync(projectId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectTimeLogsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectTimeLogsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectsByTenantIdAsync"></a>
# **getProjectsByTenantIdAsync**
> ProjectDtoListEnvelope getProjectsByTenantIdAsync(tenantId)

Retrieves all projects

Gets all projects for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ProjectDtoListEnvelope = apiInstance.getProjectsByTenantIdAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectsByTenantIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectsByTenantIdAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ProjectDtoListEnvelope**](ProjectDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProjectsCountByTenantIdAsync"></a>
# **getProjectsCountByTenantIdAsync**
> Int32Envelope getProjectsCountByTenantIdAsync(tenantId)

Counts projects

Gets the count of projects for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getProjectsCountByTenantIdAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#getProjectsCountByTenantIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#getProjectsCountByTenantIdAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateProjectAsync"></a>
# **updateProjectAsync**
> EmptyEnvelope updateProjectAsync(projectId, tenantId, projectUpdateDto)

Updates a project

Updates the specified project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectUpdateDto : ProjectUpdateDto =  // ProjectUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateProjectAsync(projectId, tenantId, projectUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#updateProjectAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#updateProjectAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectUpdateDto** | [**ProjectUpdateDto**](ProjectUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProjectPeriodAsync"></a>
# **updateProjectPeriodAsync**
> EmptyEnvelope updateProjectPeriodAsync(projectId, projectPeriodId, tenantId, projectPeriodUpdateDto)

Updates a project period

Updates the specified period for a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodUpdateDto : ProjectPeriodUpdateDto =  // ProjectPeriodUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateProjectPeriodAsync(projectId, projectPeriodId, tenantId, projectPeriodUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#updateProjectPeriodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#updateProjectPeriodAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **projectPeriodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectPeriodUpdateDto** | [**ProjectPeriodUpdateDto**](ProjectPeriodUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProjectTaskAsync"></a>
# **updateProjectTaskAsync**
> EmptyEnvelope updateProjectTaskAsync(projectId, projectTaskId, tenantId, projectTaskUpdateDto)

Updates a project task

Updates the specified task in a project.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectTaskId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectTaskUpdateDto : ProjectTaskUpdateDto =  // ProjectTaskUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateProjectTaskAsync(projectId, projectTaskId, tenantId, projectTaskUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#updateProjectTaskAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#updateProjectTaskAsync")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **projectTaskId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

