
# AccountingEntryDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **journalEntryId** | **kotlin.String** |  |  [optional] |
| **accountId** | **kotlin.String** |  |  [optional] |
| **accountName** | **kotlin.String** |  |  [optional] |
| **direction** | [**inline**](#Direction) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **transactionAmount** | **kotlin.Double** |  |  [optional] |
| **transactionCurrencyId** | **kotlin.String** |  |  [optional] |
| **functionalAmount** | **kotlin.Double** |  |  [optional] |
| **functionalCurrencyId** | **kotlin.String** |  |  [optional] |
| **accountAmount** | **kotlin.Double** |  |  [optional] |
| **accountCurrencyId** | **kotlin.String** |  |  [optional] |
| **reportingAmountInUsd** | **kotlin.Double** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **forexRatesSnapshot** | **kotlin.String** |  |  [optional] |
| **costCentreId** | **kotlin.String** |  |  [optional] |
| **projectId** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **debit** | **kotlin.Double** |  |  [optional] [readonly] |
| **credit** | **kotlin.Double** |  |  [optional] [readonly] |
| **amount** | [**Money**](Money.md) |  |  [optional] |
| **amountInUsd** | [**Money**](Money.md) |  |  [optional] |


<a id="Direction"></a>
## Enum: direction
| Name | Value |
| ---- | ----- |
| direction | Debit, Credit |



