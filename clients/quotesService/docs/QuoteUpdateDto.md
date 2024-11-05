
# QuoteUpdateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **priceListId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **individualId** | **kotlin.String** |  |  [optional] |
| **paymentTermId** | **kotlin.String** |  |  [optional] |
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
| **billingLocationId** | **kotlin.String** |  |  [optional] |
| **shippingLocationId** | **kotlin.String** |  |  [optional] |
| **shippingMethodId** | **kotlin.String** |  |  [optional] |
| **cartId** | **kotlin.String** |  |  [optional] |
| **total** | **kotlin.Double** |  |  [optional] |
| **totalTaxes** | **kotlin.Double** |  |  [optional] |
| **quoteStatus** | [**inline**](#QuoteStatus) |  |  [optional] |
| **freightTerms** | [**inline**](#FreightTerms) |  |  [optional] |
| **costCalculationMethod** | [**inline**](#CostCalculationMethod) |  |  [optional] |
| **effectiveTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **effectiveFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **customTaxAmount** | **kotlin.Double** |  |  [optional] |
| **customTotalAmount** | **kotlin.Double** |  |  [optional] |
| **customDetailAmount** | **kotlin.Double** |  |  [optional] |
| **customProfitAmount** | **kotlin.Double** |  |  [optional] |
| **customDiscountsAmount** | **kotlin.Double** |  |  [optional] |
| **customSurchargesAmount** | **kotlin.Double** |  |  [optional] |
| **customShippingCostAmount** | **kotlin.Double** |  |  [optional] |
| **customShippingTaxAmount** | **kotlin.Double** |  |  [optional] |
| **customWithholdingTaxAmount** | **kotlin.Double** |  |  [optional] |


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



