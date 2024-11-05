# ProjectsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsServiceProjectsCountGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsCountGet) | **GET** /api/v2/ProjectsService/Projects/Count |  |
| [**apiV2ProjectsServiceProjectsGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsGet) | **GET** /api/v2/ProjectsService/Projects |  |
| [**apiV2ProjectsServiceProjectsPost**](ProjectsApi.md#apiV2ProjectsServiceProjectsPost) | **POST** /api/v2/ProjectsService/Projects |  |
| [**apiV2ProjectsServiceProjectsProjectIdDelete**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdDelete) | **DELETE** /api/v2/ProjectsService/Projects/{projectId} |  |
| [**apiV2ProjectsServiceProjectsProjectIdGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdGet) | **GET** /api/v2/ProjectsService/Projects/{projectId} |  |
| [**apiV2ProjectsServiceProjectsProjectIdPeriodsGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdPeriodsGet) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Periods |  |
| [**apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdDelete**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdDelete) | **DELETE** /api/v2/ProjectsService/Projects/{projectId}/Periods/{projectPeriodId} |  |
| [**apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdPut**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdPut) | **PUT** /api/v2/ProjectsService/Projects/{projectId}/Periods/{projectPeriodId} |  |
| [**apiV2ProjectsServiceProjectsProjectIdPut**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdPut) | **PUT** /api/v2/ProjectsService/Projects/{projectId} |  |
| [**apiV2ProjectsServiceProjectsProjectIdTaskCategoriesCountGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTaskCategoriesCountGet) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TaskCategories/Count |  |
| [**apiV2ProjectsServiceProjectsProjectIdTaskCategoriesGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTaskCategoriesGet) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TaskCategories |  |
| [**apiV2ProjectsServiceProjectsProjectIdTasksCountGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTasksCountGet) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Tasks/Count |  |
| [**apiV2ProjectsServiceProjectsProjectIdTasksGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTasksGet) | **GET** /api/v2/ProjectsService/Projects/{projectId}/Tasks |  |
| [**apiV2ProjectsServiceProjectsProjectIdTasksPost**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTasksPost) | **POST** /api/v2/ProjectsService/Projects/{projectId}/Tasks |  |
| [**apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdDelete**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdDelete) | **DELETE** /api/v2/ProjectsService/Projects/{projectId}/Tasks/{projectTaskId} |  |
| [**apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdPut**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdPut) | **PUT** /api/v2/ProjectsService/Projects/{projectId}/Tasks/{projectTaskId} |  |
| [**apiV2ProjectsServiceProjectsProjectIdTimeLogsCountGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTimeLogsCountGet) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TimeLogs/Count |  |
| [**apiV2ProjectsServiceProjectsProjectIdTimeLogsGet**](ProjectsApi.md#apiV2ProjectsServiceProjectsProjectIdTimeLogsGet) | **GET** /api/v2/ProjectsService/Projects/{projectId}/TimeLogs |  |


<a id="apiV2ProjectsServiceProjectsCountGet"></a>
# **apiV2ProjectsServiceProjectsCountGet**
> Int32Envelope apiV2ProjectsServiceProjectsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2ProjectsServiceProjectsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsCountGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsGet"></a>
# **apiV2ProjectsServiceProjectsGet**
> ProjectDtoListEnvelope apiV2ProjectsServiceProjectsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectDtoListEnvelope = apiInstance.apiV2ProjectsServiceProjectsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsGet")
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

[**ProjectDtoListEnvelope**](ProjectDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsPost"></a>
# **apiV2ProjectsServiceProjectsPost**
> EmptyEnvelope apiV2ProjectsServiceProjectsPost(tenantId, apiVersion, xApiVersion, projectCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectCreateDto : ProjectCreateDto =  // ProjectCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsPost(tenantId, apiVersion, xApiVersion, projectCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectCreateDto** | [**ProjectCreateDto**](ProjectCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdDelete"></a>
# **apiV2ProjectsServiceProjectsProjectIdDelete**
> EmptyEnvelope apiV2ProjectsServiceProjectsProjectIdDelete(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdDelete(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdDelete")
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdGet"></a>
# **apiV2ProjectsServiceProjectsProjectIdGet**
> ProjectDtoEnvelope apiV2ProjectsServiceProjectsProjectIdGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectDtoEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdGet(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdGet")
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

[**ProjectDtoEnvelope**](ProjectDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdPeriodsGet"></a>
# **apiV2ProjectsServiceProjectsProjectIdPeriodsGet**
> EmptyEnvelope apiV2ProjectsServiceProjectsProjectIdPeriodsGet(projectId, tenantId, apiVersion, xApiVersion, projectPeriodCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectPeriodCreateDto : ProjectPeriodCreateDto =  // ProjectPeriodCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdPeriodsGet(projectId, tenantId, apiVersion, xApiVersion, projectPeriodCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdPeriodsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdPeriodsGet")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectPeriodCreateDto** | [**ProjectPeriodCreateDto**](ProjectPeriodCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdDelete"></a>
# **apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdDelete**
> EmptyEnvelope apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdDelete(projectId, projectPeriodId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdDelete(projectId, projectPeriodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **projectPeriodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdPut"></a>
# **apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdPut**
> EmptyEnvelope apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdPut(projectId, projectPeriodId, tenantId, apiVersion, xApiVersion, projectPeriodUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectPeriodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectPeriodUpdateDto : ProjectPeriodUpdateDto =  // ProjectPeriodUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdPut(projectId, projectPeriodId, tenantId, apiVersion, xApiVersion, projectPeriodUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdPeriodsProjectPeriodIdPut")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **projectPeriodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectPeriodUpdateDto** | [**ProjectPeriodUpdateDto**](ProjectPeriodUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdPut"></a>
# **apiV2ProjectsServiceProjectsProjectIdPut**
> EmptyEnvelope apiV2ProjectsServiceProjectsProjectIdPut(projectId, tenantId, apiVersion, xApiVersion, projectUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectUpdateDto : ProjectUpdateDto =  // ProjectUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdPut(projectId, tenantId, apiVersion, xApiVersion, projectUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdPut")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectUpdateDto** | [**ProjectUpdateDto**](ProjectUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTaskCategoriesCountGet"></a>
# **apiV2ProjectsServiceProjectsProjectIdTaskCategoriesCountGet**
> Int32Envelope apiV2ProjectsServiceProjectsProjectIdTaskCategoriesCountGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTaskCategoriesCountGet(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTaskCategoriesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTaskCategoriesCountGet")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTaskCategoriesGet"></a>
# **apiV2ProjectsServiceProjectsProjectIdTaskCategoriesGet**
> TaskCategoryDtoListEnvelope apiV2ProjectsServiceProjectsProjectIdTaskCategoriesGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaskCategoryDtoListEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTaskCategoriesGet(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTaskCategoriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTaskCategoriesGet")
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

[**TaskCategoryDtoListEnvelope**](TaskCategoryDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTasksCountGet"></a>
# **apiV2ProjectsServiceProjectsProjectIdTasksCountGet**
> Int32Envelope apiV2ProjectsServiceProjectsProjectIdTasksCountGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTasksCountGet(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksCountGet")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTasksGet"></a>
# **apiV2ProjectsServiceProjectsProjectIdTasksGet**
> ProjectTaskDtoListEnvelope apiV2ProjectsServiceProjectsProjectIdTasksGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTaskDtoListEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTasksGet(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksGet")
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

[**ProjectTaskDtoListEnvelope**](ProjectTaskDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTasksPost"></a>
# **apiV2ProjectsServiceProjectsProjectIdTasksPost**
> EmptyEnvelope apiV2ProjectsServiceProjectsProjectIdTasksPost(projectId, tenantId, apiVersion, xApiVersion, projectTaskCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTaskCreateDto : ProjectTaskCreateDto =  // ProjectTaskCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTasksPost(projectId, tenantId, apiVersion, xApiVersion, projectTaskCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksPost")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectTaskCreateDto** | [**ProjectTaskCreateDto**](ProjectTaskCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdDelete"></a>
# **apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdDelete**
> EmptyEnvelope apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdDelete(projectId, projectTaskId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectTaskId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdDelete(projectId, projectTaskId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
| **projectTaskId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdPut"></a>
# **apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdPut**
> EmptyEnvelope apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdPut(projectId, projectTaskId, tenantId, apiVersion, xApiVersion, projectTaskUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val projectTaskId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectTaskUpdateDto : ProjectTaskUpdateDto =  // ProjectTaskUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdPut(projectId, projectTaskId, tenantId, apiVersion, xApiVersion, projectTaskUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTasksProjectTaskIdPut")
    e.printStackTrace()
}
```

### Parameters
| **projectId** | **java.util.UUID**|  | |
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTimeLogsCountGet"></a>
# **apiV2ProjectsServiceProjectsProjectIdTimeLogsCountGet**
> Int32Envelope apiV2ProjectsServiceProjectsProjectIdTimeLogsCountGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTimeLogsCountGet(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTimeLogsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTimeLogsCountGet")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceProjectsProjectIdTimeLogsGet"></a>
# **apiV2ProjectsServiceProjectsProjectIdTimeLogsGet**
> ProjectTimeLogDtoListEnvelope apiV2ProjectsServiceProjectsProjectIdTimeLogsGet(projectId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProjectsApi()
val projectId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProjectTimeLogDtoListEnvelope = apiInstance.apiV2ProjectsServiceProjectsProjectIdTimeLogsGet(projectId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTimeLogsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProjectsApi#apiV2ProjectsServiceProjectsProjectIdTimeLogsGet")
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

