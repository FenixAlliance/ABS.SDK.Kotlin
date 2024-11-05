# TaskCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2ProjectsServiceTaskCategoriesGet**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesGet) | **GET** /api/v2/ProjectsService/TaskCategories |  |
| [**apiV2ProjectsServiceTaskCategoriesPost**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesPost) | **POST** /api/v2/ProjectsService/TaskCategories |  |
| [**apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete) | **DELETE** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} |  |
| [**apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet) | **GET** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} |  |
| [**apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut) | **PUT** /api/v2/ProjectsService/TaskCategories/{taskCategoryId} |  |
| [**apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet**](TaskCategoriesApi.md#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet) | **GET** /api/v2/ProjectsService/TaskCategories/{taskCategoryId}/Types |  |


<a id="apiV2ProjectsServiceTaskCategoriesGet"></a>
# **apiV2ProjectsServiceTaskCategoriesGet**
> TaskCategoryDtoListEnvelope apiV2ProjectsServiceTaskCategoriesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaskCategoryDtoListEnvelope = apiInstance.apiV2ProjectsServiceTaskCategoriesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesGet")
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

[**TaskCategoryDtoListEnvelope**](TaskCategoryDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceTaskCategoriesPost"></a>
# **apiV2ProjectsServiceTaskCategoriesPost**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesPost(tenantId, apiVersion, xApiVersion, taskCategoryCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taskCategoryCreateDto : TaskCategoryCreateDto =  // TaskCategoryCreateDto | 
try {
    val result : TaskCategoryDto = apiInstance.apiV2ProjectsServiceTaskCategoriesPost(tenantId, apiVersion, xApiVersion, taskCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taskCategoryCreateDto** | [**TaskCategoryCreateDto**](TaskCategoryCreateDto.md)|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete"></a>
# **apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete(taskCategoryId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val taskCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaskCategoryDto = apiInstance.apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete(taskCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **taskCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet"></a>
# **apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet(taskCategoryId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val taskCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaskCategoryDto = apiInstance.apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet(taskCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdGet")
    e.printStackTrace()
}
```

### Parameters
| **taskCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut"></a>
# **apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut(taskCategoryId, tenantId, apiVersion, xApiVersion, taskCategoryUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val taskCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taskCategoryUpdateDto : TaskCategoryUpdateDto =  // TaskCategoryUpdateDto | 
try {
    val result : TaskCategoryDto = apiInstance.apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut(taskCategoryId, tenantId, apiVersion, xApiVersion, taskCategoryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdPut")
    e.printStackTrace()
}
```

### Parameters
| **taskCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taskCategoryUpdateDto** | [**TaskCategoryUpdateDto**](TaskCategoryUpdateDto.md)|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet"></a>
# **apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet**
> TaskCategoryDto apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet(taskCategoryId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaskCategoriesApi()
val taskCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaskCategoryDto = apiInstance.apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet(taskCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaskCategoriesApi#apiV2ProjectsServiceTaskCategoriesTaskCategoryIdTypesGet")
    e.printStackTrace()
}
```

### Parameters
| **taskCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TaskCategoryDto**](TaskCategoryDto.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

