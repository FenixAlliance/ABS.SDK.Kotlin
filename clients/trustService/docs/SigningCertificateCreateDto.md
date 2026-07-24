
# SigningCertificateCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** |  |  |
| **contactId** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **url** | **kotlin.String** |  |  [optional] |
| **csr** | **kotlin.String** |  |  [optional] |
| **publicKey** | **kotlin.String** |  |  [optional] |
| **certificateType** | [**inline**](#CertificateType) |  |  [optional] |
| **securityCertificateId** | **kotlin.String** |  |  [optional] |


<a id="CertificateType"></a>
## Enum: certificateType
| Name | Value |
| ---- | ----- |
| certificateType | AuthSignedCertificate, SelfSignedCertificate, AllianceSignedCertificate |



