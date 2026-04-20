# TaskCategoriesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countTenantTaskCategoriesAsync**](TaskCategoriesApi.md#countTenantTaskCategoriesAsync) | **GET** /api/v2/ProjectsService/TaskCategories/Count | Counts task categories |
| [**createTaskCategoryAsync**](TaskCategoriesApi.md#createTaskCategoryAsync) | **POST** /api/v2/ProjectsService/TaskCategories | Creates a new task category |
| [**deleteTaskCategoryAsync**](TaskCategoriesApi.md#deleteTaskCategoryAsync) | **DELETE** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} | Deletes a task category |
| [**getTaskCategoryByIdAsync**](TaskCategoriesApi.md#getTaskCategoryByIdAsync) | **GET** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} | Gets a task category by ID |
| [**getTaskCategoryTaskTypesAsync**](TaskCategoriesApi.md#getTaskCategoryTaskTypesAsync) | **GET** /api/v2/ProjectsService/TaskCategories/{taskCategoryId}/Types | Retrieves task types for a category |
| [**getTenantTaskCategoriesAsync**](TaskCategoriesApi.md#getTenantTaskCategoriesAsync) | **GET** /api/v2/ProjectsService/TaskCategories | Retrieves all task categories |
| [**updateTaskCategoryAsync**](TaskCategoriesApi.md#updateTaskCategoryAsync) | **PUT** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} | Updates a task category |


<a id="countTenantTaskCategoriesAsync"></a>
# **countTenantTaskCategoriesAsync**
> Int32Envelope countTenantTaskCategoriesAsync(tenantId)

Counts task categories

Gets the count of task categories for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.countTenantTaskCategoriesAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#countTenantTaskCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#countTenantTaskCategoriesAsync")
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

<a id="createTaskCategoryAsync"></a>
# **createTaskCategoryAsync**
> TaskCategoryDto createTaskCategoryAsync(tenantId, taskCategoryCreateDto)

Creates a new task category

Creates a new task category for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val taskCategoryCreateDto : TaskCategoryCreateDto =  // TaskCategoryCreateDto | 
try {
    val result : TaskCategoryDto = apiInstance.createTaskCategoryAsync(tenantId, taskCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#createTaskCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#createTaskCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taskCategoryCreateDto** | [**TaskCategoryCreateDto**](TaskCategoryCreateDto.md)|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTaskCategoryAsync"></a>
# **deleteTaskCategoryAsync**
> TaskCategoryDto deleteTaskCategoryAsync(taskCategoryId, tenantId)

Deletes a task category

Deletes the specified task category.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val taskCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TaskCategoryDto = apiInstance.deleteTaskCategoryAsync(taskCategoryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#deleteTaskCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#deleteTaskCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **taskCategoryId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaskCategoryByIdAsync"></a>
# **getTaskCategoryByIdAsync**
> TaskCategoryDto getTaskCategoryByIdAsync(taskCategoryId, tenantId)

Gets a task category by ID

Retrieves the details of a task category using its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val taskCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TaskCategoryDto = apiInstance.getTaskCategoryByIdAsync(taskCategoryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#getTaskCategoryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#getTaskCategoryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **taskCategoryId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaskCategoryTaskTypesAsync"></a>
# **getTaskCategoryTaskTypesAsync**
> TaskCategoryDto getTaskCategoryTaskTypesAsync(taskCategoryId, tenantId)

Retrieves task types for a category

Gets all task types belonging to the specified task category.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val taskCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TaskCategoryDto = apiInstance.getTaskCategoryTaskTypesAsync(taskCategoryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#getTaskCategoryTaskTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#getTaskCategoryTaskTypesAsync")
    e.printStackTrace()
}
```

### Parameters
| **taskCategoryId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTaskCategoriesAsync"></a>
# **getTenantTaskCategoriesAsync**
> TaskCategoryDtoListEnvelope getTenantTaskCategoriesAsync(tenantId)

Retrieves all task categories

Gets all task categories for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : TaskCategoryDtoListEnvelope = apiInstance.getTenantTaskCategoriesAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#getTenantTaskCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#getTenantTaskCategoriesAsync")
    e.printStackTrace()
}
```

### Parameters
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

<a id="updateTaskCategoryAsync"></a>
# **updateTaskCategoryAsync**
> TaskCategoryDto updateTaskCategoryAsync(taskCategoryId, tenantId, taskCategoryUpdateDto)

Updates a task category

Updates the specified task category.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val taskCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val taskCategoryUpdateDto : TaskCategoryUpdateDto =  // TaskCategoryUpdateDto | 
try {
    val result : TaskCategoryDto = apiInstance.updateTaskCategoryAsync(taskCategoryId, tenantId, taskCategoryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#updateTaskCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#updateTaskCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **taskCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taskCategoryUpdateDto** | [**TaskCategoryUpdateDto**](TaskCategoryUpdateDto.md)|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

