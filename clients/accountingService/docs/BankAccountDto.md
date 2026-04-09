
# BankAccountDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **group** | **kotlin.Boolean** |  |  [optional] |
| **frozen** | **kotlin.Boolean** |  |  [optional] |
| **name** | **kotlin.String** |  |  [optional] |
| **code** | **kotlin.String** |  |  [optional] |
| **path** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **prefix** | **kotlin.String** |  |  [optional] |
| **balance** | **kotlin.Double** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **accountType** | **kotlin.String** |  |  [optional] |
| **accountTypeId** | **kotlin.String** |  |  [optional] |
| **debitsBalance** | **kotlin.Double** |  |  [optional] |
| **creditsBalance** | **kotlin.Double** |  |  [optional] |
| **parentAccountId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **childrenAccountsCount** | **kotlin.Int** |  |  [optional] |
| **accountCategory** | [**inline**](#AccountCategory) |  |  [optional] |
| **balanceAmount** | [**Money**](Money.md) |  |  [optional] |
| **creditsBalanceAmount** | [**Money**](Money.md) |  |  [optional] |
| **debitsBalanceAmount** | [**Money**](Money.md) |  |  [optional] |
| **iban** | **kotlin.String** |  |  [optional] |
| **swift** | **kotlin.String** |  |  [optional] |
| **branchCode** | **kotlin.String** |  |  [optional] |
| **bankAccountNumber** | **kotlin.String** |  |  [optional] |
| **qualifiedName** | **kotlin.String** |  |  [optional] |
| **bankId** | **kotlin.String** |  |  [optional] |
| **bankProfileId** | **kotlin.String** |  |  [optional] |


<a id="AccountCategory"></a>
## Enum: accountCategory
| Name | Value |
| ---- | ----- |
| accountCategory | Assets, Equity, Revenue, Expense, Liabilities |



