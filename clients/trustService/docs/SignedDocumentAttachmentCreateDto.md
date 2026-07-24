
# SignedDocumentAttachmentCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **signedDocumentId** | **kotlin.String** |  |  |
| **title** | **kotlin.String** |  |  |
| **storageKey** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **fileName** | **kotlin.String** |  |  [optional] |
| **contentType** | **kotlin.String** |  |  [optional] |
| **fileLength** | **kotlin.Long** |  |  [optional] |
| **hash** | **kotlin.String** |  |  [optional] |
| **fileUploadUrl** | **kotlin.String** |  |  [optional] |
| **storageProviderKey** | **kotlin.String** |  |  [optional] |
| **attachmentRole** | [**inline**](#AttachmentRole) |  |  [optional] |


<a id="AttachmentRole"></a>
## Enum: attachmentRole
| Name | Value |
| ---- | ----- |
| attachmentRole | Unknown, Source, SupportingEvidence, AuthorityResponse, HumanReadablePdf, XmlPayload, ValidationReport, Other |



