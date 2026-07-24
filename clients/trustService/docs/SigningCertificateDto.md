
# SigningCertificateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **url** | **kotlin.String** |  |  [optional] |
| **csr** | **kotlin.String** |  |  [optional] |
| **publicKey** | **kotlin.String** |  |  [optional] |
| **signature** | **kotlin.String** |  |  [optional] |
| **fileLengthInBits** | **kotlin.Long** |  |  [optional] |
| **certificateType** | [**inline**](#CertificateType) |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **securityCertificateId** | **kotlin.String** |  |  [optional] |
| **certificateStatus** | [**inline**](#CertificateStatus) |  |  [optional] |
| **thumbprint** | **kotlin.String** |  |  [optional] |
| **subjectName** | **kotlin.String** |  |  [optional] |
| **issuerName** | **kotlin.String** |  |  [optional] |
| **serialNumber** | **kotlin.String** |  |  [optional] |
| **notBeforeUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **notAfterUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **contactName** | **kotlin.String** |  |  [optional] |


<a id="CertificateType"></a>
## Enum: certificateType
| Name | Value |
| ---- | ----- |
| certificateType | AuthSignedCertificate, SelfSignedCertificate, AllianceSignedCertificate |


<a id="CertificateStatus"></a>
## Enum: certificateStatus
| Name | Value |
| ---- | ----- |
| certificateStatus | Unknown, Active, Expiring, Expired, Revoked, Disabled |



