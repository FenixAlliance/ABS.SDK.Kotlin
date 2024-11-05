# FilesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFileAsync**](FilesApi.md#createFileAsync) | **POST** /api/v2/StorageService/Files |  |
| [**deleteFileAsync**](FilesApi.md#deleteFileAsync) | **DELETE** /api/v2/StorageService/Files/{fileId} |  |
| [**downloadFileAsync**](FilesApi.md#downloadFileAsync) | **GET** /api/v2/StorageService/Files/{fileId}/Raw |  |
| [**getFileAsync**](FilesApi.md#getFileAsync) | **GET** /api/v2/StorageService/Files/{fileId} |  |
| [**getFilesAsync**](FilesApi.md#getFilesAsync) | **GET** /api/v2/StorageService/Files |  |
| [**updateFileAsync**](FilesApi.md#updateFileAsync) | **PUT** /api/v2/StorageService/Files/{fileId} |  |


<a id="createFileAsync"></a>
# **createFileAsync**
> EmptyEnvelope createFileAsync(tenantId, apiVersion, xApiVersion, id, timestamp, notes, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadId, filePath, file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val timestamp : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
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
try {
    val result : EmptyEnvelope = apiInstance.createFileAsync(tenantId, apiVersion, xApiVersion, id, timestamp, notes, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadId, filePath, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#createFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#createFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| **id** | **java.util.UUID**|  | [optional] |
| **timestamp** | **java.time.OffsetDateTime**|  | [optional] |
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
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="deleteFileAsync"></a>
# **deleteFileAsync**
> FileUploadDtoEnvelope deleteFileAsync(fileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val fileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FileUploadDtoEnvelope = apiInstance.deleteFileAsync(fileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#deleteFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#deleteFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FileUploadDtoEnvelope**](FileUploadDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="downloadFileAsync"></a>
# **downloadFileAsync**
> java.io.File downloadFileAsync(fileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val fileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.downloadFileAsync(fileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#downloadFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#downloadFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFileAsync"></a>
# **getFileAsync**
> FileUploadDtoEnvelope getFileAsync(fileId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val fileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FileUploadDtoEnvelope = apiInstance.getFileAsync(fileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FileUploadDtoEnvelope**](FileUploadDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFilesAsync"></a>
# **getFilesAsync**
> FileUploadDtoEnvelope getFilesAsync(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FileUploadDtoEnvelope = apiInstance.getFilesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFilesAsync")
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

[**FileUploadDtoEnvelope**](FileUploadDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateFileAsync"></a>
# **updateFileAsync**
> FileUploadDtoEnvelope updateFileAsync(fileId, tenantId, apiVersion, xApiVersion, notes, metadata, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadID, filePath, file)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val fileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val notes : kotlin.String = notes_example // kotlin.String | 
val metadata : kotlin.String = metadata_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val author : kotlin.String = author_example // kotlin.String | 
val isFolder : kotlin.Boolean = true // kotlin.Boolean | 
val fileName : kotlin.String = fileName_example // kotlin.String | 
val `abstract` : kotlin.String = `abstract`_example // kotlin.String | 
val keyWords : kotlin.String = keyWords_example // kotlin.String | 
val validResponse : kotlin.Boolean = true // kotlin.Boolean | 
val parentFileUploadID : kotlin.String = parentFileUploadID_example // kotlin.String | 
val filePath : kotlin.String = filePath_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : FileUploadDtoEnvelope = apiInstance.updateFileAsync(fileId, tenantId, apiVersion, xApiVersion, notes, metadata, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadID, filePath, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#updateFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#updateFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| **notes** | **kotlin.String**|  | [optional] |
| **metadata** | **kotlin.String**|  | [optional] |
| **title** | **kotlin.String**|  | [optional] |
| **author** | **kotlin.String**|  | [optional] |
| **isFolder** | **kotlin.Boolean**|  | [optional] |
| **fileName** | **kotlin.String**|  | [optional] |
| **&#x60;abstract&#x60;** | **kotlin.String**|  | [optional] |
| **keyWords** | **kotlin.String**|  | [optional] |
| **validResponse** | **kotlin.Boolean**|  | [optional] |
| **parentFileUploadID** | **kotlin.String**|  | [optional] |
| **filePath** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

[**FileUploadDtoEnvelope**](FileUploadDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

