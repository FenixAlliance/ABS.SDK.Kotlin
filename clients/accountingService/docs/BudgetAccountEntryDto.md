
# BudgetAccountEntryDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **debit** | **kotlin.Double** |  |  [optional] |
| **credit** | **kotlin.Double** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **accountId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **date** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **debitAccountId** | **kotlin.String** |  |  [optional] |
| **creditAccountId** | **kotlin.String** |  |  [optional] |
| **journalEntryId** | **kotlin.String** |  |  [optional] |
| **debitAccountName** | **kotlin.String** |  |  [optional] |
| **creditAccountName** | **kotlin.String** |  |  [optional] |
| **accountingEntryType** | [**inline**](#AccountingEntryType) |  |  [optional] |
| **debitAmount** | [**Money**](Money.md) |  |  [optional] |
| **creditAmount** | [**Money**](Money.md) |  |  [optional] |
| **budgetId** | **kotlin.String** |  |  [optional] |


<a id="AccountingEntryType"></a>
## Enum: accountingEntryType
| Name | Value |
| ---- | ----- |
| accountingEntryType | None, Debit, Credit |



