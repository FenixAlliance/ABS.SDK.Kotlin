# ModulesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAllModules**](ModulesApi.md#getAllModules) | **GET** /api/v2/StudioService/Modules | Get all modules available on this suite server instance. |
| [**getAvailableModules**](ModulesApi.md#getAvailableModules) | **GET** /api/v2/StudioService/Modules/Data | Get all modules available to a tenant user. |


<a id="getAllModules"></a>
# **getAllModules**
> StudioModuleListEnvelope getAllModules(tenantId, apiVersion, xApiVersion)

Get all modules available on this suite server instance.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModulesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : StudioModuleListEnvelope = apiInstance.getAllModules(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModulesApi#getAllModules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModulesApi#getAllModules")
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

[**StudioModuleListEnvelope**](StudioModuleListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAvailableModules"></a>
# **getAvailableModules**
> ModuleListEnvelope getAvailableModules(tenantId, apiVersion, xApiVersion)

Get all modules available to a tenant user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ModulesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ModuleListEnvelope = apiInstance.getAvailableModules(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ModulesApi#getAvailableModules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ModulesApi#getAvailableModules")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ModuleListEnvelope**](ModuleListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

