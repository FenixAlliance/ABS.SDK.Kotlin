
# SignedDocumentAttachmentDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **signedDocumentId** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **fileName** | **kotlin.String** |  |  [optional] |
| **contentType** | **kotlin.String** |  |  [optional] |
| **fileLength** | **kotlin.Long** |  |  [optional] |
| **hash** | **kotlin.String** |  |  [optional] |
| **fileUploadUrl** | **kotlin.String** |  |  [optional] |
| **storageKey** | **kotlin.String** |  |  [optional] |
| **storageProviderKey** | **kotlin.String** |  |  [optional] |
| **scanStatus** | [**inline**](#ScanStatus) |  |  [optional] |
| **mutability** | [**inline**](#Mutability) |  |  [optional] |
| **attachmentRole** | [**inline**](#AttachmentRole) |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **signedDocumentTitle** | **kotlin.String** |  |  [optional] |


<a id="ScanStatus"></a>
## Enum: scanStatus
| Name | Value |
| ---- | ----- |
| scanStatus | NotRequired, Pending, Clean, Infected, Failed, Quarantined |


<a id="Mutability"></a>
## Enum: mutability
| Name | Value |
| ---- | ----- |
| mutability | Editable, Managed, SealedEvidence |


<a id="AttachmentRole"></a>
## Enum: attachmentRole
| Name | Value |
| ---- | ----- |
| attachmentRole | Unknown, Source, SupportingEvidence, AuthorityResponse, HumanReadablePdf, XmlPayload, ValidationReport, Other |



