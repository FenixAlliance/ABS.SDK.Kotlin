
# JournalEntryCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **journalId** | **kotlin.String** |  |  |
| **fiscalPeriodId** | **kotlin.String** |  |  |
| **transactionCurrencyId** | **kotlin.String** |  |  |
| **description** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **sourceDocumentType** | **kotlin.String** |  |  [optional] |
| **sourceDocumentId** | **kotlin.String** |  |  [optional] |
| **idempotencyKey** | **kotlin.String** |  |  [optional] |
| **isOpeningBalance** | **kotlin.Boolean** |  |  [optional] |
| **accountingEntries** | [**kotlin.collections.List&lt;AccountingEntryCreateDto&gt;**](AccountingEntryCreateDto.md) |  |  [optional] |



