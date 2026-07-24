
# SignedDocumentDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **signed** | **kotlin.Boolean** |  |  [optional] |
| **url** | **kotlin.String** |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **contentType** | **kotlin.String** |  |  [optional] |
| **fileLengthInBits** | **kotlin.Long** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **documentStandard** | [**inline**](#DocumentStandard) |  |  [optional] |
| **trustDocumentType** | [**inline**](#TrustDocumentType) |  |  [optional] |
| **signingStatus** | [**inline**](#SigningStatus) |  |  [optional] |
| **verificationStatus** | [**inline**](#VerificationStatus) |  |  [optional] |
| **signedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **externalReference** | **kotlin.String** |  |  [optional] |
| **sourceStorageObjectId** | **kotlin.String** |  |  [optional] |
| **sourceSha256** | **kotlin.String** |  |  [optional] |
| **signedStorageObjectId** | **kotlin.String** |  |  [optional] |
| **signedSha256** | **kotlin.String** |  |  [optional] |
| **evidenceStorageObjectId** | **kotlin.String** |  |  [optional] |
| **evidenceSha256** | **kotlin.String** |  |  [optional] |
| **primaryFileUploadId** | **kotlin.String** |  |  [optional] |
| **frozenSourceFileUploadId** | **kotlin.String** |  |  [optional] |
| **signedFileUploadId** | **kotlin.String** |  |  [optional] |
| **evidenceFileUploadId** | **kotlin.String** |  |  [optional] |
| **lockState** | [**inline**](#LockState) |  |  [optional] |
| **graphicalRepresentationFileUploadId** | **kotlin.String** |  |  [optional] |
| **graphicalRepresentationStorageObjectId** | **kotlin.String** |  |  [optional] |
| **graphicalRepresentationSha256** | **kotlin.String** |  |  [optional] |
| **graphicalRepresentationContentType** | **kotlin.String** |  |  [optional] |
| **graphicalRepresentationGeneratedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **contactName** | **kotlin.String** |  |  [optional] |


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


<a id="SigningStatus"></a>
## Enum: signingStatus
| Name | Value |
| ---- | ----- |
| signingStatus | Unknown, Draft, Signed, Failed, Revoked |


<a id="VerificationStatus"></a>
## Enum: verificationStatus
| Name | Value |
| ---- | ----- |
| verificationStatus | Unknown, NotVerified, Valid, Invalid, Expired |


<a id="LockState"></a>
## Enum: lockState
| Name | Value |
| ---- | ----- |
| lockState | Draft, Editable, FrozenForSignature, SigningInProgress, Sealed, Voided, Superseded |



