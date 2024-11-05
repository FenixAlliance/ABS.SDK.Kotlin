# TaskTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsServiceTaskTypesPost**](TaskTypesApi.md#apiV2ProjectsServiceTaskTypesPost) | **POST** /api/v2/ProjectsService/TaskTypes |  |
| [**apiV2ProjectsServiceTaskTypesTaskTypeIdDelete**](TaskTypesApi.md#apiV2ProjectsServiceTaskTypesTaskTypeIdDelete) | **DELETE** /api/v2/ProjectsService/TaskTypes/{taskTypeId} |  |
| [**apiV2ProjectsServiceTaskTypesTaskTypeIdGet**](TaskTypesApi.md#apiV2ProjectsServiceTaskTypesTaskTypeIdGet) | **GET** /api/v2/ProjectsService/TaskTypes/{taskTypeId} |  |
| [**apiV2ProjectsServiceTaskTypesTaskTypeIdPut**](TaskTypesApi.md#apiV2ProjectsServiceTaskTypesTaskTypeIdPut) | **PUT** /api/v2/ProjectsService/TaskTypes/{taskTypeId} |  |


<a id="apiV2ProjectsServiceTaskTypesPost"></a>
# **apiV2ProjectsServiceTaskTypesPost**
> TaskTypeDto apiV2ProjectsServiceTaskTypesPost(tenantId, apiVersion, xApiVersion, taskTypeCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taskTypeCreateDto : TaskTypeCreateDto =  // TaskTypeCreateDto | 
try {
    val result : TaskTypeDto = apiInstance.apiV2ProjectsServiceTaskTypesPost(tenantId, apiVersion, xApiVersion, taskTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskTypesApi#apiV2ProjectsServiceTaskTypesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskTypesApi#apiV2ProjectsServiceTaskTypesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taskTypeCreateDto** | [**TaskTypeCreateDto**](TaskTypeCreateDto.md)|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceTaskTypesTaskTypeIdDelete"></a>
# **apiV2ProjectsServiceTaskTypesTaskTypeIdDelete**
> TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdDelete(taskTypeId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskTypesApi()
val taskTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaskTypeDto = apiInstance.apiV2ProjectsServiceTaskTypesTaskTypeIdDelete(taskTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **taskTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceTaskTypesTaskTypeIdGet"></a>
# **apiV2ProjectsServiceTaskTypesTaskTypeIdGet**
> TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdGet(taskTypeId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskTypesApi()
val taskTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaskTypeDto = apiInstance.apiV2ProjectsServiceTaskTypesTaskTypeIdGet(taskTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdGet")
    e.printStackTrace()
}
```

### Parameters
| **taskTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceTaskTypesTaskTypeIdPut"></a>
# **apiV2ProjectsServiceTaskTypesTaskTypeIdPut**
> TaskTypeDto apiV2ProjectsServiceTaskTypesTaskTypeIdPut(taskTypeId, tenantId, apiVersion, xApiVersion, taskTypeUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskTypesApi()
val taskTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taskTypeUpdateDto : TaskTypeUpdateDto =  // TaskTypeUpdateDto | 
try {
    val result : TaskTypeDto = apiInstance.apiV2ProjectsServiceTaskTypesTaskTypeIdPut(taskTypeId, tenantId, apiVersion, xApiVersion, taskTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskTypesApi#apiV2ProjectsServiceTaskTypesTaskTypeIdPut")
    e.printStackTrace()
}
```

### Parameters
| **taskTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taskTypeUpdateDto** | [**TaskTypeUpdateDto**](TaskTypeUpdateDto.md)|  | [optional] |

### Return type

[**TaskTypeDto**](TaskTypeDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

