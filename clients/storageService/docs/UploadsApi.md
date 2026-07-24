# UploadsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**saveFileAsync**](UploadsApi.md#saveFileAsync) | **POST** /api/v2/StorageService/Uploads | Upload a file |


<a id="saveFileAsync"></a>
# **saveFileAsync**
> EmptyEnvelope saveFileAsync(tenantId, apiVersion, xApiVersion, file, notes, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadId, filePath, publicAccessType, purpose, socialProfileIdValue, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders, id, timestamp)

Upload a file

Uploads a file to tenant or user storage, scanned and catalogued through the storage spine.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UploadsApi()
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
    val result : EmptyEnvelope = apiInstance.saveFileAsync(tenantId, apiVersion, xApiVersion, file, notes, title, author, isFolder, fileName, `abstract`, keyWords, validResponse, parentFileUploadId, filePath, publicAccessType, purpose, socialProfileIdValue, appFileContent, appFileSha256, appFileCreatedAtUtc, appFileUserIdValue, appFileTenantIdValue, appFileEnrollmentIdValue, appFileSource, appFileLength, appFileName, appFileFileName, appFileLastModified, appFileSize, appFileContentType, appFileContentDisposition, appFileHeaders, id, timestamp)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UploadsApi#saveFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UploadsApi#saveFileAsync")
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

