
# SignedDocumentCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** |  |  |
| **contactId** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **url** | **kotlin.String** |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **contentType** | **kotlin.String** |  |  [optional] |
| **documentStandard** | [**inline**](#DocumentStandard) |  |  [optional] |
| **trustDocumentType** | [**inline**](#TrustDocumentType) |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **externalReference** | **kotlin.String** |  |  [optional] |


<a id="DocumentStandard"></a>
## Enum: documentStandard
| Name | Value |
| ---- | ----- |
| documentStandard | None, Ubl, Pdf, Xml, Email, Json, Other |


<a id="TrustDocumentType"></a>
## Enum: trustDocumentType
| Name | Value |
| ---- | ----- |
| trustDocumentType | Unknown, Invoice, CreditNote, DebitNote, Contract, Certificate, Email, AuthorityResponse, Other |



