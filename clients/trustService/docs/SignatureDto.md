
# SignatureDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **validationCode** | **kotlin.String** |  |  [optional] |
| **signatureImage** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **signingProfileId** | **kotlin.String** |  |  [optional] |
| **signingCertificateId** | **kotlin.String** |  |  [optional] |
| **signedDocumentId** | **kotlin.String** |  |  [optional] |
| **signedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **signingStatus** | [**inline**](#SigningStatus) |  |  [optional] |
| **verificationStatus** | [**inline**](#VerificationStatus) |  |  [optional] |
| **signatureFormat** | [**inline**](#SignatureFormat) |  |  [optional] |
| **digestAlgorithm** | **kotlin.String** |  |  [optional] |
| **signatureAlgorithm** | **kotlin.String** |  |  [optional] |
| **canonicalizationAlgorithm** | **kotlin.String** |  |  [optional] |
| **policyIdentifier** | **kotlin.String** |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **digestValue** | **kotlin.String** |  |  [optional] |
| **signatureValueHash** | **kotlin.String** |  |  [optional] |
| **contactName** | **kotlin.String** |  |  [optional] |
| **signingProfileDisplayName** | **kotlin.String** |  |  [optional] |
| **signingCertificateTitle** | **kotlin.String** |  |  [optional] |
| **signedDocumentTitle** | **kotlin.String** |  |  [optional] |


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


<a id="SignatureFormat"></a>
## Enum: signatureFormat
| Name | Value |
| ---- | ----- |
| signatureFormat | Unknown, XAdES, PAdES, CAdES, SMIME, DetachedXmlDSig, Enveloped, Other |



