
# QuoteDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **type** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **priceListId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **individualId** | **kotlin.String** |  |  [optional] |
| **organizationId** | **kotlin.String** |  |  [optional] |
| **receiverTenantId** | **kotlin.String** |  |  [optional] |
| **firstName** | **kotlin.String** |  |  [optional] |
| **lastName** | **kotlin.String** |  |  [optional] |
| **companyName** | **kotlin.String** |  |  [optional] |
| **billingEmail** | **kotlin.String** |  |  [optional] |
| **addressLine1** | **kotlin.String** |  |  [optional] |
| **addressLine2** | **kotlin.String** |  |  [optional] |
| **postalCode** | **kotlin.String** |  |  [optional] |
| **countryId** | **kotlin.String** |  |  [optional] |
| **stateId** | **kotlin.String** |  |  [optional] |
| **cityId** | **kotlin.String** |  |  [optional] |
| **customerNotes** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **total** | **kotlin.Double** |  |  [optional] |
| **totalTaxes** | **kotlin.Double** |  |  [optional] |
| **totalTaxBase** | **kotlin.Double** |  |  [optional] |
| **totalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalGlobalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalGlobalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalAmountInUsd** | **kotlin.Double** |  |  [optional] |
| **totalProfitInUsd** | **kotlin.Double** |  |  [optional] |
| **totalTaxBaseInUsd** | **kotlin.Double** |  |  [optional] |
| **totalDiscountsInUsd** | **kotlin.Double** |  |  [optional] |
| **totalSurchargesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalDetailAmountInUsd** | **kotlin.Double** |  |  [optional] |
| **totalGlobalDiscountsInUsd** | **kotlin.Double** |  |  [optional] |
| **totalGlobalSurchargesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalWithholdingTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalShippingCostInUsd** | **kotlin.Double** |  |  [optional] |
| **totalShippingTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **currency** | [**Currency**](Currency.md) |  |  [optional] |
| **totalInUsd** | [**Money**](Money.md) |  |  [optional] |
| **totalTaxAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
| **totalTaxBaseAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
| **totalDiscountsAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
| **totalSurchargesAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
| **totalGlobalDiscountsAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
| **totalGlobalSurchargesAmountInUsd** | [**Money**](Money.md) |  |  [optional] |
| **totalAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalTaxAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalTaxBaseAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalDiscountsAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalSurchargesAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalGlobalDiscountsAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalGlobalSurchargesAmount** | [**Money**](Money.md) |  |  [optional] |
| **cartId** | **kotlin.String** |  |  [optional] |
| **effectiveTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **effectiveFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **quoteStatus** | [**inline**](#QuoteStatus) |  |  [optional] |
| **freightTerms** | [**inline**](#FreightTerms) |  |  [optional] |
| **costCalculationMethod** | [**inline**](#CostCalculationMethod) |  |  [optional] |
| **customDiscountsAmount** | **kotlin.Double** |  |  [optional] |


<a id="QuoteStatus"></a>
## Enum: quoteStatus
| Name | Value |
| ---- | ----- |
| quoteStatus | 0, 1, 2, 3, 4 |


<a id="FreightTerms"></a>
## Enum: freightTerms
| Name | Value |
| ---- | ----- |
| freightTerms | 0, 1 |


<a id="CostCalculationMethod"></a>
## Enum: costCalculationMethod
| Name | Value |
| ---- | ----- |
| costCalculationMethod | 0, 1 |


