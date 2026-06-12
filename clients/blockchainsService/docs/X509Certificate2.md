
# X509Certificate2

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **handle** | [**kotlin.Any**](.md) |  |  [optional] |
| **issuer** | **kotlin.String** |  |  [optional] [readonly] |
| **subject** | **kotlin.String** |  |  [optional] [readonly] |
| **serialNumberBytes** | [**ByteReadOnlyMemory**](ByteReadOnlyMemory.md) |  |  [optional] |
| **archived** | **kotlin.Boolean** |  |  [optional] |
| **extensions** | [**kotlin.collections.List&lt;X509Extension&gt;**](X509Extension.md) |  |  [optional] [readonly] |
| **friendlyName** | **kotlin.String** |  |  [optional] |
| **hasPrivateKey** | **kotlin.Boolean** |  |  [optional] [readonly] |
| **privateKey** | [**AsymmetricAlgorithm**](AsymmetricAlgorithm.md) |  |  [optional] |
| **issuerName** | [**X500DistinguishedName**](X500DistinguishedName.md) |  |  [optional] |
| **notAfter** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] [readonly] |
| **notBefore** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] [readonly] |
| **publicKey** | [**PublicKey**](PublicKey.md) |  |  [optional] |
| **rawData** | **kotlin.ByteArray** |  |  [optional] [readonly] |
| **rawDataMemory** | [**ByteReadOnlyMemory**](ByteReadOnlyMemory.md) |  |  [optional] |
| **serialNumber** | **kotlin.String** |  |  [optional] [readonly] |
| **signatureAlgorithm** | [**Oid**](Oid.md) |  |  [optional] |
| **subjectName** | [**X500DistinguishedName**](X500DistinguishedName.md) |  |  [optional] |
| **thumbprint** | **kotlin.String** |  |  [optional] [readonly] |
| **version** | **kotlin.Int** |  |  [optional] [readonly] |



