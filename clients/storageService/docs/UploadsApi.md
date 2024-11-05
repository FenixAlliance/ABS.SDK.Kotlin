# UploadsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2StorageServiceUploadsPost**](UploadsApi.md#apiV2StorageServiceUploadsPost) | **POST** /api/v2/StorageService/Uploads |  |


<a id="apiV2StorageServiceUploadsPost"></a>
# **apiV2StorageServiceUploadsPost**
> EmptyEnvelope apiV2StorageServiceUploadsPost(tenantId, apiVersion, xApiVersion, notes, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadId, filePath, file, iD, timestamp)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UploadsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val notes : kotlin.String = notes_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val author : kotlin.String = author_example // kotlin.String | 
val isFolder : kotlin.Boolean = true // kotlin.Boolean | 
val fileName : kotlin.String = fileName_example // kotlin.String | 
val `abstract` : kotlin.String = `abstract`_example // kotlin.String | 
val keyWords : kotlin.String = keyWords_example // kotlin.String | 
val validResponse : kotlin.Boolean = true // kotlin.Boolean | 
val parentFileUploadId : kotlin.String = parentFileUploadId_example // kotlin.String | 
val filePath : kotlin.String = filePath_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val iD : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val timestamp : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2StorageServiceUploadsPost(tenantId, apiVersion, xApiVersion, notes, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadId, filePath, file, iD, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#apiV2StorageServiceUploadsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#apiV2StorageServiceUploadsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| **notes** | **kotlin.String**|  | [optional] |
| **title** | **kotlin.String**|  | [optional] |
| **author** | **kotlin.String**|  | [optional] |
| **isFolder** | **kotlin.Boolean**|  | [optional] |
| **fileName** | **kotlin.String**|  | [optional] |
| **&#x60;abstract&#x60;** | **kotlin.String**|  | [optional] |
| **keyWords** | **kotlin.String**|  | [optional] |
| **validResponse** | **kotlin.Boolean**|  | [optional] |
| **parentFileUploadId** | **kotlin.String**|  | [optional] |
| **filePath** | **kotlin.String**|  | [optional] |
| **file** | **java.io.File**|  | [optional] |
| **iD** | **java.util.UUID**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestamp** | **java.time.OffsetDateTime**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

