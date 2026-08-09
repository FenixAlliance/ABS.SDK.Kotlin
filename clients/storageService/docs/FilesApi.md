# FilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFileAsync**](FilesApi.md#createFileAsync) | **POST** /api/v2/StorageService/Files |  |
| [**deleteFileAsync**](FilesApi.md#deleteFileAsync) | **DELETE** /api/v2/StorageService/Files/{fileId} |  |
| [**downloadFileAsync**](FilesApi.md#downloadFileAsync) | **GET** /api/v2/StorageService/Files/{fileId}/Raw |  |
| [**getFileAsync**](FilesApi.md#getFileAsync) | **GET** /api/v2/StorageService/Files/{fileId} |  |
| [**getFileThumbnailAsync**](FilesApi.md#getFileThumbnailAsync) | **GET** /api/v2/StorageService/Files/{fileId}/Thumbnail |  |
| [**getFilesAsync**](FilesApi.md#getFilesAsync) | **GET** /api/v2/StorageService/Files |  |
| [**getFilesCountAsync**](FilesApi.md#getFilesCountAsync) | **GET** /api/v2/StorageService/Files/Count |  |
| [**updateFileAsync**](FilesApi.md#updateFileAsync) | **PUT** /api/v2/StorageService/Files/{fileId} |  |


<a id="createFileAsync"></a>
# **createFileAsync**
> EmptyEnvelope createFileAsync(tenantId, apiVersion, xApiVersion, file, notes, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadId, filePath, publicAccessType, purpose, socialProfileIdValue, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders, id, timestamp)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
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
val publicAccessType : kotlin.String = publicAccessType_example // kotlin.String | 
val purpose : kotlin.String = purpose_example // kotlin.String | 
val socialProfileIdValue : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appFileContent : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | 
val appFileSha256 : kotlin.String = appFileSha256_example // kotlin.String | 
val appFileCreatedAtUtc : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val appFileUserIdValue : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appFileTenantIdValue : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appFileEnrollmentIdValue : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appFileSource : kotlin.String = appFileSource_example // kotlin.String | 
val appFileLength : kotlin.Long = 789 // kotlin.Long | 
val appFileName : kotlin.String = appFileName_example // kotlin.String | 
val appFileFileName : kotlin.String = appFileFileName_example // kotlin.String | 
val appFileLastModified : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val appFileSize : kotlin.Long = 789 // kotlin.Long | 
val appFileContentType : kotlin.String = appFileContentType_example // kotlin.String | 
val appFileContentDisposition : kotlin.String = appFileContentDisposition_example // kotlin.String | 
val appFileHeaders : kotlin.collections.Map<kotlin.String, kotlin.String> =  // kotlin.collections.Map<kotlin.String, kotlin.String> | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val timestamp : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
try {
    val result : EmptyEnvelope = apiInstance.createFileAsync(tenantId, apiVersion, xApiVersion, file, notes, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadId, filePath, publicAccessType, purpose, socialProfileIdValue, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders, id, timestamp)
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
| **file** | **java.io.File**|  | [optional] |
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
| **publicAccessType** | **kotlin.String**|  | [optional] [enum: false, Container, Blob, Unknown] |
| **purpose** | **kotlin.String**|  | [optional] [enum: Unknown, IdentityAvatar, IdentityBanner, ProfileAsset, EngagementInline, EngagementAttachment, MessageAttachment, SocialPost, RecordAttachment, AiGenerated, SystemArtifact, Temporary] |
| **socialProfileIdValue** | **java.util.UUID**|  | [optional] |
| **appFileContent** | **kotlin.ByteArray**|  | [optional] |
| **appFileSha256** | **kotlin.String**|  | [optional] |
| **appFileCreatedAtUtc** | **java.time.OffsetDateTime**|  | [optional] |
| **appFileUserIdValue** | **java.util.UUID**|  | [optional] |
| **appFileTenantIdValue** | **java.util.UUID**|  | [optional] |
| **appFileEnrollmentIdValue** | **java.util.UUID**|  | [optional] |
| **appFileSource** | **kotlin.String**|  | [optional] [enum: Unknown, HttpUpload, Integration, InternalProcess, ApiClient, WorkflowEngine] |
| **appFileLength** | **kotlin.Long**|  | [optional] |
| **appFileName** | **kotlin.String**|  | [optional] |
| **appFileFileName** | **kotlin.String**|  | [optional] |
| **appFileLastModified** | **java.time.OffsetDateTime**|  | [optional] |
| **appFileSize** | **kotlin.Long**|  | [optional] |
| **appFileContentType** | **kotlin.String**|  | [optional] |
| **appFileContentDisposition** | **kotlin.String**|  | [optional] |
| **appFileHeaders** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.collections.Map.md)|  | [optional] |
| **id** | **java.util.UUID**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timestamp** | **java.time.OffsetDateTime**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="deleteFileAsync"></a>
# **deleteFileAsync**
> EmptyEnvelope deleteFileAsync(fileId, tenantId, apiVersion, xApiVersion)



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
    val result : EmptyEnvelope = apiInstance.deleteFileAsync(fileId, tenantId, apiVersion, xApiVersion)
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

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

No authorization required

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFileThumbnailAsync"></a>
# **getFileThumbnailAsync**
> java.io.File getFileThumbnailAsync(fileId, tenantId, apiVersion, xApiVersion)



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
    val result : java.io.File = apiInstance.getFileThumbnailAsync(fileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFileThumbnailAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFileThumbnailAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFilesAsync"></a>
# **getFilesAsync**
> FileUploadDtoEnvelope getFilesAsync(tenantId, apiVersion, xApiVersion, top, skip, count, filter, orderBy, search, select, expand, isEmpty)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val top : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Boolean = true // kotlin.Boolean | 
val filter : kotlin.String = filter_example // kotlin.String | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | 
val select : kotlin.String = select_example // kotlin.String | 
val expand : kotlin.String = expand_example // kotlin.String | 
val isEmpty : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : FileUploadDtoEnvelope = apiInstance.getFilesAsync(tenantId, apiVersion, xApiVersion, top, skip, count, filter, orderBy, search, select, expand, isEmpty)
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
| **xApiVersion** | **kotlin.String**|  | [optional] |
| **top** | **kotlin.Int**|  | [optional] |
| **skip** | **kotlin.Int**|  | [optional] |
| **count** | **kotlin.Boolean**|  | [optional] |
| **filter** | **kotlin.String**|  | [optional] |
| **orderBy** | **kotlin.String**|  | [optional] |
| **search** | **kotlin.String**|  | [optional] |
| **select** | **kotlin.String**|  | [optional] |
| **expand** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isEmpty** | **kotlin.Boolean**|  | [optional] |

### Return type

[**FileUploadDtoEnvelope**](FileUploadDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="getFilesCountAsync"></a>
# **getFilesCountAsync**
> kotlin.Long getFilesCountAsync(tenantId, apiVersion, xApiVersion, top, skip, count, filter, orderBy, search, select, expand, isEmpty)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val top : kotlin.Int = 56 // kotlin.Int | 
val skip : kotlin.Int = 56 // kotlin.Int | 
val count : kotlin.Boolean = true // kotlin.Boolean | 
val filter : kotlin.String = filter_example // kotlin.String | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | 
val search : kotlin.String = search_example // kotlin.String | 
val select : kotlin.String = select_example // kotlin.String | 
val expand : kotlin.String = expand_example // kotlin.String | 
val isEmpty : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : kotlin.Long = apiInstance.getFilesCountAsync(tenantId, apiVersion, xApiVersion, top, skip, count, filter, orderBy, search, select, expand, isEmpty)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FilesApi#getFilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FilesApi#getFilesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| **top** | **kotlin.Int**|  | [optional] |
| **skip** | **kotlin.Int**|  | [optional] |
| **count** | **kotlin.Boolean**|  | [optional] |
| **filter** | **kotlin.String**|  | [optional] |
| **orderBy** | **kotlin.String**|  | [optional] |
| **search** | **kotlin.String**|  | [optional] |
| **select** | **kotlin.String**|  | [optional] |
| **expand** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **isEmpty** | **kotlin.Boolean**|  | [optional] |

### Return type

**kotlin.Long**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="updateFileAsync"></a>
# **updateFileAsync**
> EmptyEnvelope updateFileAsync(fileId, tenantId, apiVersion, xApiVersion, file, notes, metadata, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadID, filePath, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders)



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
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
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
val appFileContent : kotlin.ByteArray = BYTE_ARRAY_DATA_HERE // kotlin.ByteArray | 
val appFileSha256 : kotlin.String = appFileSha256_example // kotlin.String | 
val appFileCreatedAtUtc : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val appFileUserIdValue : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appFileTenantIdValue : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appFileEnrollmentIdValue : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val appFileSource : kotlin.String = appFileSource_example // kotlin.String | 
val appFileLength : kotlin.Long = 789 // kotlin.Long | 
val appFileName : kotlin.String = appFileName_example // kotlin.String | 
val appFileFileName : kotlin.String = appFileFileName_example // kotlin.String | 
val appFileLastModified : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val appFileSize : kotlin.Long = 789 // kotlin.Long | 
val appFileContentType : kotlin.String = appFileContentType_example // kotlin.String | 
val appFileContentDisposition : kotlin.String = appFileContentDisposition_example // kotlin.String | 
val appFileHeaders : kotlin.collections.Map<kotlin.String, kotlin.String> =  // kotlin.collections.Map<kotlin.String, kotlin.String> | 
try {
    val result : EmptyEnvelope = apiInstance.updateFileAsync(fileId, tenantId, apiVersion, xApiVersion, file, notes, metadata, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadID, filePath, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders)
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
| **file** | **java.io.File**|  | [optional] |
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
| **appFileContent** | **kotlin.ByteArray**|  | [optional] |
| **appFileSha256** | **kotlin.String**|  | [optional] |
| **appFileCreatedAtUtc** | **java.time.OffsetDateTime**|  | [optional] |
| **appFileUserIdValue** | **java.util.UUID**|  | [optional] |
| **appFileTenantIdValue** | **java.util.UUID**|  | [optional] |
| **appFileEnrollmentIdValue** | **java.util.UUID**|  | [optional] |
| **appFileSource** | **kotlin.String**|  | [optional] [enum: Unknown, HttpUpload, Integration, InternalProcess, ApiClient, WorkflowEngine] |
| **appFileLength** | **kotlin.Long**|  | [optional] |
| **appFileName** | **kotlin.String**|  | [optional] |
| **appFileFileName** | **kotlin.String**|  | [optional] |
| **appFileLastModified** | **java.time.OffsetDateTime**|  | [optional] |
| **appFileSize** | **kotlin.Long**|  | [optional] |
| **appFileContentType** | **kotlin.String**|  | [optional] |
| **appFileContentDisposition** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appFileHeaders** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;**](kotlin.collections.Map.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

