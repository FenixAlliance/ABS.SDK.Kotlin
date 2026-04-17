
# BankGuaranteeCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **margin** | **kotlin.Double** |  |  [optional] |
| **charges** | **kotlin.Double** |  |  [optional] |
| **beneficiaryName** | **kotlin.String** |  |  [optional] |
| **guaranteeNumber** | **kotlin.String** |  |  [optional] |
| **guaranteeConditions** | **kotlin.String** |  |  [optional] |
| **fixedDepositNumber** | **kotlin.Double** |  |  [optional] |
| **startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **validityInDays** | **kotlin.Int** |  |  [optional] |
| **bankGuaranteeType** | [**inline**](#BankGuaranteeType) |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **projectId** | **kotlin.String** |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **bankProfileId** | **kotlin.String** |  |  [optional] |
| **bankAccountId** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |


<a id="BankGuaranteeType"></a>
## Enum: bankGuaranteeType
| Name | Value |
| ---- | ----- |
| bankGuaranteeType | Receiving, Providing |



