
# OrderUpdateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tenantId** | **kotlin.String** |  |  [optional] |
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
| **totalDetail** | **kotlin.Double** |  |  [optional] |
| **totalDetailCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalProfit** | **kotlin.Double** |  |  [optional] |
| **totalProfitCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalDiscountsCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalSurchargesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalShippingTax** | **kotlin.Double** |  |  [optional] |
| **totalShippingTaxCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalShippingCost** | **kotlin.Double** |  |  [optional] |
| **totalShippingCostCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalGlobalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalGlobalDiscountsCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalGlobalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalGlobalSurchargesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalWithheldTax** | **kotlin.Double** |  |  [optional] |
| **totalWithheldTaxCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalTaxBase** | **kotlin.Double** |  |  [optional] |
| **totalTaxBaseCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalTaxes** | **kotlin.Double** |  |  [optional] |
| **totalTaxesCurrencyId** | **kotlin.String** |  |  [optional] |
| **total** | **kotlin.Double** |  |  [optional] |
| **totalCurrencyId** | **kotlin.String** |  |  [optional] |
| **costCalculationMethod** | [**inline**](#CostCalculationMethod) |  |  [optional] |
| **taxCalculationMethod** | [**inline**](#TaxCalculationMethod) |  |  [optional] |
| **cartId** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **individualId** | **kotlin.String** |  |  [optional] |
| **organizationId** | **kotlin.String** |  |  [optional] |
| **totalAmountInUsd** | **kotlin.Double** |  |  [optional] |
| **totalTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **receiverTenantId** | **kotlin.String** |  |  [optional] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **priceListId** | **kotlin.String** |  |  [optional] |
| **paymentTermId** | **kotlin.String** |  |  [optional] |
| **quoteStatus** | **kotlin.String** |  |  [optional] |
| **effectiveTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **effectiveFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |


<a id="CostCalculationMethod"></a>
## Enum: costCalculationMethod
| Name | Value |
| ---- | ----- |
| costCalculationMethod | Automatic, Custom |


<a id="TaxCalculationMethod"></a>
## Enum: taxCalculationMethod
| Name | Value |
| ---- | ----- |
| taxCalculationMethod | Included, Excluded |



