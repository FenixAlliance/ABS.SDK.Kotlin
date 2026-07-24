
# AccountingEntryCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **journalEntryId** | **kotlin.String** |  |  |
| **accountId** | **kotlin.String** |  |  |
| **direction** | [**inline**](#Direction) |  |  |
| **transactionCurrencyId** | **kotlin.String** |  |  |
| **description** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **transactionAmount** | **kotlin.Double** |  |  [optional] |


<a id="Direction"></a>
## Enum: direction
| Name | Value |
| ---- | ----- |
| direction | Debit, Credit |



