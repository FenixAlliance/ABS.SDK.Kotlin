# TaskTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTaskTypeAsync**](TaskTypesApi.md#createTaskTypeAsync) | **POST** /api/v2/ProjectsService/TaskTypes | Creates a new task type |
| [**deleteTaskTypeAsync**](TaskTypesApi.md#deleteTaskTypeAsync) | **DELETE** /api/v2/ProjectsService/TaskTypes/{taskTypeId} | Deletes a task type |
| [**getTaskTypeByIdAsync**](TaskTypesApi.md#getTaskTypeByIdAsync) | **GET** /api/v2/ProjectsService/TaskTypes/{taskTypeId} | Gets a task type by ID |
| [**updateTaskTypeAsync**](TaskTypesApi.md#updateTaskTypeAsync) | **PUT** /api/v2/ProjectsService/TaskTypes/{taskTypeId} | Updates a task type |


<a id="createTaskTypeAsync"></a>
# **createTaskTypeAsync**
> TaskTypeDto createTaskTypeAsync(tenantId, taskTypeCreateDto)

Creates a new task type

Creates a new task type for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val taskTypeCreateDto : TaskTypeCreateDto =  // TaskTypeCreateDto | 
try {
    val result : TaskTypeDto = apiInstance.createTaskTypeAsync(tenantId, taskTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskTypesApi#createTaskTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskTypesApi#createTaskTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taskTypeCreateDto** | [**TaskTypeCreateDto**](TaskTypeCreateDto.md)|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTaskTypeAsync"></a>
# **deleteTaskTypeAsync**
> TaskTypeDto deleteTaskTypeAsync(taskTypeId, tenantId)

Deletes a task type

Deletes the specified task type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskTypesApi()
val taskTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TaskTypeDto = apiInstance.deleteTaskTypeAsync(taskTypeId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskTypesApi#deleteTaskTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskTypesApi#deleteTaskTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **taskTypeId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaskTypeByIdAsync"></a>
# **getTaskTypeByIdAsync**
> TaskTypeDto getTaskTypeByIdAsync(taskTypeId, tenantId)

Gets a task type by ID

Retrieves the details of a task type using its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskTypesApi()
val taskTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TaskTypeDto = apiInstance.getTaskTypeByIdAsync(taskTypeId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskTypesApi#getTaskTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskTypesApi#getTaskTypeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **taskTypeId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateTaskTypeAsync"></a>
# **updateTaskTypeAsync**
> TaskTypeDto updateTaskTypeAsync(taskTypeId, tenantId, taskTypeUpdateDto)

Updates a task type

Updates the specified task type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskTypesApi()
val taskTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val taskTypeUpdateDto : TaskTypeUpdateDto =  // TaskTypeUpdateDto | 
try {
    val result : TaskTypeDto = apiInstance.updateTaskTypeAsync(taskTypeId, tenantId, taskTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskTypesApi#updateTaskTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskTypesApi#updateTaskTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **taskTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taskTypeUpdateDto** | [**TaskTypeUpdateDto**](TaskTypeUpdateDto.md)|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

