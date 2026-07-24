
# FileUploadDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **author** | **kotlin.String** |  |  [optional] |
| **isFolder** | **kotlin.Boolean** |  |  [optional] |
| **hash** | **kotlin.String** |  |  [optional] |
| **fileUrl** | **kotlin.String** |  |  [optional] |
| **filePath** | **kotlin.String** |  |  [optional] |
| **storageKey** | **kotlin.String** |  |  [optional] |
| **storageProviderKey** | **kotlin.String** |  |  [optional] |
| **fileName** | **kotlin.String** |  |  [optional] |
| **&#x60;abstract&#x60;** | **kotlin.String** |  |  [optional] |
| **keyWords** | **kotlin.String** |  |  [optional] |
| **metadata** | **kotlin.String** |  |  [optional] |
| **fileLength** | **kotlin.Long** |  |  [optional] |
| **contentType** | **kotlin.String** |  |  [optional] |
| **parentFileId** | **kotlin.String** |  |  [optional] |
| **validResponse** | **kotlin.Boolean** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **socialProfileId** | **kotlin.String** |  |  [optional] |
| **folderPath** | **kotlin.String** |  |  [optional] |
| **scanStatus** | [**inline**](#ScanStatus) |  |  [optional] |
| **thumbnailStatus** | [**inline**](#ThumbnailStatus) |  |  [optional] |
| **hasThumbnail** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **thumbnailStorageKey** | **kotlin.String** |  |  [optional] |
| **thumbnailContentType** | **kotlin.String** |  |  [optional] |
| **thumbnailWidth** | **kotlin.Int** |  |  [optional] |
| **thumbnailHeight** | **kotlin.Int** |  |  [optional] |
| **publicAccessType** | [**inline**](#PublicAccessType) |  |  [optional] |


<a id="ScanStatus"></a>
## Enum: scanStatus
| Name | Value |
| ---- | ----- |
| scanStatus | NotRequired, Pending, Clean, Infected, Failed, Quarantined |


<a id="ThumbnailStatus"></a>
## Enum: thumbnailStatus
| Name | Value |
| ---- | ----- |
| thumbnailStatus | NotRequired, Pending, Ready, Failed, Unsupported |


<a id="PublicAccessType"></a>
## Enum: publicAccessType
| Name | Value |
| ---- | ----- |
| publicAccessType | false, Container, Blob, Unknown |



