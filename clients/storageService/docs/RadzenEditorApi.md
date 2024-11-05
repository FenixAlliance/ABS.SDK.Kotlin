# RadzenEditorApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2StorageServiceRadzenEditorUploadsIdPost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsIdPost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/{id} |  |
| [**apiV2StorageServiceRadzenEditorUploadsImagePost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsImagePost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Image |  |
| [**apiV2StorageServiceRadzenEditorUploadsMultiplePost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsMultiplePost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Multiple |  |
| [**apiV2StorageServiceRadzenEditorUploadsSinglePost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsSinglePost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Single |  |
| [**apiV2StorageServiceRadzenEditorUploadsSpecificPost**](RadzenEditorApi.md#apiV2StorageServiceRadzenEditorUploadsSpecificPost) | **POST** /api/v2/StorageService/RadzenEditor/Uploads/Specific |  |


<a id="apiV2StorageServiceRadzenEditorUploadsIdPost"></a>
# **apiV2StorageServiceRadzenEditorUploadsIdPost**
> apiV2StorageServiceRadzenEditorUploadsIdPost(id, tenantId, apiVersion, xApiVersion, files)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val id : kotlin.Int = 56 // kotlin.Int | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val files : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | 
try {
    apiInstance.apiV2StorageServiceRadzenEditorUploadsIdPost(id, tenantId, apiVersion, xApiVersion, files)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsIdPost")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.Int**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **files** | **kotlin.collections.List&lt;java.io.File&gt;**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="apiV2StorageServiceRadzenEditorUploadsImagePost"></a>
# **apiV2StorageServiceRadzenEditorUploadsImagePost**
> apiV2StorageServiceRadzenEditorUploadsImagePost(tenantId, apiVersion, xApiVersion, file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.apiV2StorageServiceRadzenEditorUploadsImagePost(tenantId, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsImagePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsImagePost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="apiV2StorageServiceRadzenEditorUploadsMultiplePost"></a>
# **apiV2StorageServiceRadzenEditorUploadsMultiplePost**
> apiV2StorageServiceRadzenEditorUploadsMultiplePost(tenantId, apiVersion, xApiVersion, files)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val files : kotlin.collections.List<java.io.File> = /path/to/file.txt // kotlin.collections.List<java.io.File> | 
try {
    apiInstance.apiV2StorageServiceRadzenEditorUploadsMultiplePost(tenantId, apiVersion, xApiVersion, files)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsMultiplePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsMultiplePost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **files** | **kotlin.collections.List&lt;java.io.File&gt;**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="apiV2StorageServiceRadzenEditorUploadsSinglePost"></a>
# **apiV2StorageServiceRadzenEditorUploadsSinglePost**
> apiV2StorageServiceRadzenEditorUploadsSinglePost(tenantId, apiVersion, xApiVersion, file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.apiV2StorageServiceRadzenEditorUploadsSinglePost(tenantId, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsSinglePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsSinglePost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="apiV2StorageServiceRadzenEditorUploadsSpecificPost"></a>
# **apiV2StorageServiceRadzenEditorUploadsSpecificPost**
> apiV2StorageServiceRadzenEditorUploadsSpecificPost(tenantId, apiVersion, xApiVersion, file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.apiV2StorageServiceRadzenEditorUploadsSpecificPost(tenantId, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsSpecificPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#apiV2StorageServiceRadzenEditorUploadsSpecificPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

