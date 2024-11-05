
# LicenseKeyRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **tenantId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **orderId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **paymentId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **invoiceId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **enrollmentId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **entitlementId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **seats** | **kotlin.Int** |  |  [optional] |
| **licenseType** | [**inline**](#LicenseType) |  |  [optional] |
| **expirationDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **features** | [**kotlin.collections.List&lt;LicenseFeature&gt;**](LicenseFeature.md) |  |  [optional] |
| **additionalAttributes** | [**kotlin.collections.List&lt;AdditionalAttribute&gt;**](AdditionalAttribute.md) |  |  [optional] |


<a id="LicenseType"></a>
## Enum: licenseType
| Name | Value |
| ---- | ----- |
| licenseType | 1, 2, 3 |



