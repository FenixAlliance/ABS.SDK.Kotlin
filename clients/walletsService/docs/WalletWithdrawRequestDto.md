
# WalletWithdrawRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **requestedWithdrawAmount** | **kotlin.Double** |  |  [optional] |
| **requestedWithdrawAmountInUSD** | **kotlin.Double** |  |  [optional] |
| **walletWithdrawRequestStatus** | [**inline**](#WalletWithdrawRequestStatus) |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **businessId** | **kotlin.String** |  |  [optional] |
| **walletAccountId** | **kotlin.String** |  |  [optional] |
| **bankAccountId** | **kotlin.String** |  |  [optional] |


<a id="WalletWithdrawRequestStatus"></a>
## Enum: walletWithdrawRequestStatus
| Name | Value |
| ---- | ----- |
| walletWithdrawRequestStatus | Pending, Processed, Cancelled, OnHold, Denied |



