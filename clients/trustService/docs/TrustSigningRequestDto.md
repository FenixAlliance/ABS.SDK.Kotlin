
# TrustSigningRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **signedDocumentId** | **kotlin.String** |  |  [optional] |
| **signingProfileId** | **kotlin.String** |  |  [optional] |
| **signingCertificateId** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **requestedFormat** | [**inline**](#RequestedFormat) |  |  [optional] |
| **requestedPurpose** | [**inline**](#RequestedPurpose) |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **sourceStorageObjectId** | **kotlin.String** |  |  [optional] |
| **sourceSha256** | **kotlin.String** |  |  [optional] |
| **externalReference** | **kotlin.String** |  |  [optional] |
| **dryRun** | **kotlin.Boolean** |  |  [optional] |


<a id="RequestedFormat"></a>
## Enum: requestedFormat
| Name | Value |
| ---- | ----- |
| requestedFormat | Unknown, XAdES, PAdES, CAdES, SMIME, DetachedXmlDSig, Enveloped, Other |


<a id="RequestedPurpose"></a>
## Enum: requestedPurpose
| Name | Value |
| ---- | ----- |
| requestedPurpose | Unknown, RegulatorySubmission, ContractExecution, EmailSigning, InternalApproval, EvidenceSealing, AgentCredential, Other |



