
# AccountingEntryCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | **kotlin.String** |  |  |
| **currencyId** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **date** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **amount** | **kotlin.Double** |  |  [optional] |
| **debitAccountId** | **kotlin.String** |  |  [optional] |
| **creditAccountId** | **kotlin.String** |  |  [optional] |
| **journalEntryId** | **kotlin.String** |  |  [optional] |
| **accountingEntryType** | [**inline**](#AccountingEntryType) |  |  [optional] |


<a id="AccountingEntryType"></a>
## Enum: accountingEntryType
| Name | Value |
| ---- | ----- |
| accountingEntryType | None, Debit, Credit |



