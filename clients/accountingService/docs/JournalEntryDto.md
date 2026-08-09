
# JournalEntryDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **journalId** | **kotlin.String** |  |  [optional] |
| **journalName** | **kotlin.String** |  |  [optional] |
| **journalCode** | **kotlin.String** |  |  [optional] |
| **fiscalPeriodId** | **kotlin.String** |  |  [optional] |
| **financialBookId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **entryType** | [**inline**](#EntryType) |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **postingDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **isOpeningBalance** | **kotlin.Boolean** |  |  [optional] |
| **transactionCurrencyId** | **kotlin.String** |  |  [optional] |
| **sourceDocumentType** | **kotlin.String** |  |  [optional] |
| **sourceDocumentId** | **kotlin.String** |  |  [optional] |
| **idempotencyKey** | **kotlin.String** |  |  [optional] |
| **reversalOfJournalEntryId** | **kotlin.String** |  |  [optional] |
| **postedBy** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **forexRatesSnapshot** | **kotlin.String** |  |  [optional] |
| **debitInUsd** | **kotlin.Double** |  |  [optional] |
| **creditInUsd** | **kotlin.Double** |  |  [optional] |
| **accountingEntries** | [**kotlin.collections.List&lt;AccountingEntryDto&gt;**](AccountingEntryDto.md) |  |  [optional] |
| **totalDebit** | **kotlin.Double** |  |  [optional] [readonly] |
| **totalCredit** | **kotlin.Double** |  |  [optional] [readonly] |
| **totalDebitAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalCreditAmount** | [**Money**](Money.md) |  |  [optional] |
| **debitInUsdAmount** | [**Money**](Money.md) |  |  [optional] |
| **creditInUsdAmount** | [**Money**](Money.md) |  |  [optional] |


<a id="EntryType"></a>
## Enum: entryType
| Name | Value |
| ---- | ----- |
| entryType | Simple, Compound, Adjusting, Reversing |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | Draft, Posted, Reversed, Voided |



