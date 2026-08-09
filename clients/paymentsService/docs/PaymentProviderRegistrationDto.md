
# PaymentProviderRegistrationDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **createdAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **lastModifiedUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **providerCode** | **kotlin.String** |  |  [optional] |
| **credentialSetReference** | **kotlin.String** |  |  [optional] |
| **hasCredential** | **kotlin.Boolean** |  |  [optional] |
| **credentialMode** | [**inline**](#CredentialMode) |  |  [optional] |
| **externalAccountId** | **kotlin.String** |  |  [optional] |
| **enabledCapabilities** | [**inline**](#EnabledCapabilities) |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |


<a id="CredentialMode"></a>
## Enum: credentialMode
| Name | Value |
| ---- | ----- |
| credentialMode | TenantManaged, PlatformManaged, ExternalReference |


<a id="EnabledCapabilities"></a>
## Enum: enabledCapabilities
| Name | Value |
| ---- | ----- |
| enabledCapabilities | None, Collection, Authorization, Capture, Refund, Void, SplitPayment, Transfer, Payout, RecipientOnboarding, BalanceInquiry |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | Draft, Active, Disabled, Suspended |



