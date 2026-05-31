
# WalletWithdrawDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **withdrawStatus** | [**inline**](#WithdrawStatus) |  |  [optional] |
| **walletAccountId** | **kotlin.String** |  |  [optional] |
| **walletWithdrawRequestId** | **kotlin.String** |  |  [optional] |
| **balanceBeforeWithdraw** | **kotlin.Double** |  |  [optional] |
| **balanceAfterWithdraw** | **kotlin.Double** |  |  [optional] |
| **withdrawedAmount** | **kotlin.Double** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |


<a id="WithdrawStatus"></a>
## Enum: withdrawStatus
| Name | Value |
| ---- | ----- |
| withdrawStatus | OnHold, Retained, Processing, OnValidation, Processed |



