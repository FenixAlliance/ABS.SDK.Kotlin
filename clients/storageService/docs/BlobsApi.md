# BlobsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getBlobAsync**](BlobsApi.md#getBlobAsync) | **GET** /api/v2/StorageService/Blobs/Single |  |
| [**getBlobsAsync**](BlobsApi.md#getBlobsAsync) | **GET** /api/v2/StorageService/Blobs |  |


<a id="getBlobAsync"></a>
# **getBlobAsync**
> BlobEnvelope getBlobAsync(tenantId, filePath, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlobsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val filePath : kotlin.String = filePath_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlobEnvelope = apiInstance.getBlobAsync(tenantId, filePath, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlobsApi#getBlobAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlobsApi#getBlobAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **filePath** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlobEnvelope**](BlobEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBlobsAsync"></a>
# **getBlobsAsync**
> BlobEnvelope getBlobsAsync(tenantId, folderPath, browseFilter, filePrefix, recurse, maxResults, includeAttributes, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BlobsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val folderPath : kotlin.String = folderPath_example // kotlin.String | 
val browseFilter : kotlin.String = browseFilter_example // kotlin.String | 
val filePrefix : kotlin.String = filePrefix_example // kotlin.String | 
val recurse : kotlin.Boolean = true // kotlin.Boolean | 
val maxResults : kotlin.Int = 56 // kotlin.Int | 
val includeAttributes : kotlin.Boolean = true // kotlin.Boolean | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BlobEnvelope = apiInstance.getBlobsAsync(tenantId, folderPath, browseFilter, filePrefix, recurse, maxResults, includeAttributes, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BlobsApi#getBlobsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BlobsApi#getBlobsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **folderPath** | **kotlin.String**|  | [optional] |
| **browseFilter** | **kotlin.String**|  | [optional] |
| **filePrefix** | **kotlin.String**|  | [optional] |
| **recurse** | **kotlin.Boolean**|  | [optional] |
| **maxResults** | **kotlin.Int**|  | [optional] |
| **includeAttributes** | **kotlin.Boolean**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BlobEnvelope**](BlobEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

