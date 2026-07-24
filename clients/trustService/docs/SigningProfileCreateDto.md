
# SigningProfileCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **contact** | [**ContactCreateDto**](ContactCreateDto.md) |  |  [optional] |
| **about** | **kotlin.String** |  |  [optional] |
| **avatarUrl** | **kotlin.String** |  |  [optional] |
| **&#x60;data&#x60;** | **kotlin.String** |  |  [optional] |
| **dataLabel** | **kotlin.String** |  |  [optional] |
| **data1** | **kotlin.String** |  |  [optional] |
| **data1Label** | **kotlin.String** |  |  [optional] |
| **data2** | **kotlin.String** |  |  [optional] |
| **data2Label** | **kotlin.String** |  |  [optional] |
| **data3** | **kotlin.String** |  |  [optional] |
| **data3Label** | **kotlin.String** |  |  [optional] |
| **data4** | **kotlin.String** |  |  [optional] |
| **data4Label** | **kotlin.String** |  |  [optional] |
| **data5** | **kotlin.String** |  |  [optional] |
| **data5Label** | **kotlin.String** |  |  [optional] |
| **data6** | **kotlin.String** |  |  [optional] |
| **data6Label** | **kotlin.String** |  |  [optional] |
| **data7** | **kotlin.String** |  |  [optional] |
| **data7Label** | **kotlin.String** |  |  [optional] |
| **data8** | **kotlin.String** |  |  [optional] |
| **data8Label** | **kotlin.String** |  |  [optional] |
| **data9** | **kotlin.String** |  |  [optional] |
| **data9Label** | **kotlin.String** |  |  [optional] |
| **signatureFormat** | [**inline**](#SignatureFormat) |  |  [optional] |
| **signaturePurpose** | [**inline**](#SignaturePurpose) |  |  [optional] |
| **digestAlgorithm** | **kotlin.String** |  |  [optional] |
| **signatureAlgorithm** | **kotlin.String** |  |  [optional] |
| **canonicalizationAlgorithm** | **kotlin.String** |  |  [optional] |
| **policyIdentifier** | **kotlin.String** |  |  [optional] |
| **policyUri** | **kotlin.String** |  |  [optional] |
| **authorityProfile** | **kotlin.String** |  |  [optional] |
| **isActive** | **kotlin.Boolean** |  |  [optional] |
| **defaultForDocumentType** | **kotlin.String** |  |  [optional] |


<a id="SignatureFormat"></a>
## Enum: signatureFormat
| Name | Value |
| ---- | ----- |
| signatureFormat | Unknown, XAdES, PAdES, CAdES, SMIME, DetachedXmlDSig, Enveloped, Other |


<a id="SignaturePurpose"></a>
## Enum: signaturePurpose
| Name | Value |
| ---- | ----- |
| signaturePurpose | Unknown, RegulatorySubmission, ContractExecution, EmailSigning, InternalApproval, EvidenceSealing, AgentCredential, Other |



