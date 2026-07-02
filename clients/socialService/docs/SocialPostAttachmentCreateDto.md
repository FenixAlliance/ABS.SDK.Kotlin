
# SocialPostAttachmentCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **author** | **kotlin.String** |  |  [optional] |
| **isFolder** | **kotlin.Boolean** |  |  [optional] |
| **fileName** | **kotlin.String** |  |  [optional] |
| **&#x60;abstract&#x60;** | **kotlin.String** |  |  [optional] |
| **keyWords** | **kotlin.String** |  |  [optional] |
| **validResponse** | **kotlin.Boolean** |  |  [optional] |
| **parentFileUploadId** | **kotlin.String** |  |  [optional] |
| **filePath** | **kotlin.String** |  |  [optional] |
| **publicAccessType** | [**inline**](#PublicAccessType) |  |  [optional] |
| **socialPostId** | **kotlin.String** |  |  [optional] |


<a id="PublicAccessType"></a>
## Enum: publicAccessType
| Name | Value |
| ---- | ----- |
| publicAccessType | false, Container, Blob, Unknown |



