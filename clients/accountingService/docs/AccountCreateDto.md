
# AccountCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  |
| **currencyId** | **kotlin.String** |  |  |
| **accountCategory** | [**inline**](#AccountCategory) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **group** | **kotlin.Boolean** |  |  [optional] |
| **frozen** | **kotlin.Boolean** |  |  [optional] |
| **code** | **kotlin.String** |  |  [optional] |
| **path** | **kotlin.String** |  |  [optional] |
| **prefix** | **kotlin.String** |  |  [optional] |
| **accountTypeId** | **kotlin.String** |  |  [optional] |
| **parentAccountId** | **kotlin.String** |  |  [optional] |


<a id="AccountCategory"></a>
## Enum: accountCategory
| Name | Value |
| ---- | ----- |
| accountCategory | Assets, Equity, Revenue, Expense, Liabilities |



