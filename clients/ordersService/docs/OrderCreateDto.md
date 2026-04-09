
# OrderCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **priceListId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **individualId** | **kotlin.String** |  |  [optional] |
| **paymentTermId** | **kotlin.String** |  |  [optional] |
| **organizationId** | **kotlin.String** |  |  [optional] |
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
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **totalDetail** | **kotlin.Double** |  |  [optional] |
| **totalDetailCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalProfit** | **kotlin.Double** |  |  [optional] |
| **totalProfitCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalDiscountsCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalSurchargesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalShippingCost** | **kotlin.Double** |  |  [optional] |
| **totalShippingCostCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalShippingTax** | **kotlin.Double** |  |  [optional] |
| **totalShippingTaxCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalWithheldTax** | **kotlin.Double** |  |  [optional] |
| **totalWithheldTaxCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalTaxBase** | **kotlin.Double** |  |  [optional] |
| **totalTaxBaseCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalTaxes** | **kotlin.Double** |  |  [optional] |
| **totalTaxesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalGlobalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalGlobalSurchargesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalGlobalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalGlobalDiscountsCurrencyId** | **kotlin.String** |  |  [optional] |
| **total** | **kotlin.Double** |  |  [optional] |
| **totalCurrencyId** | **kotlin.String** |  |  [optional] |
| **costCalculationMethod** | [**inline**](#CostCalculationMethod) |  |  [optional] |
| **taxCalculationMethod** | [**inline**](#TaxCalculationMethod) |  |  [optional] |
| **cartId** | **kotlin.String** |  |  [optional] |
| **quoteId** | **kotlin.String** |  |  [optional] |
| **walletId** | **kotlin.String** |  |  [optional] |
| **parentOrderId** | **kotlin.String** |  |  [optional] |
| **shippingMethodId** | **kotlin.String** |  |  [optional] |
| **billingLocationId** | **kotlin.String** |  |  [optional] |
| **customerNotes** | **kotlin.String** |  |  [optional] |
| **orderStatus** | [**inline**](#OrderStatus) |  |  [optional] |
| **quoteStatus** | [**inline**](#QuoteStatus) |  |  [optional] |
| **freightTerms** | [**inline**](#FreightTerms) |  |  [optional] |
| **receiverTenantId** | **kotlin.String** |  |  [optional] |
| **shippingLocationId** | **kotlin.String** |  |  [optional] |
| **qualifiedIdentifier** | **kotlin.String** |  |  [optional] |
| **totalTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalDiscountsInUsd** | **kotlin.Double** |  |  [optional] |
| **totalSurchargesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalShippingCostInUsd** | **kotlin.Double** |  |  [optional] |
| **totalShippingTaxInUsd** | **kotlin.Double** |  |  [optional] |
| **totalAmountInUsd** | **kotlin.Double** |  |  [optional] |
| **effectiveTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **effectiveFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **orderLines** | [**kotlin.collections.List&lt;OrderLineCreateDto&gt;**](OrderLineCreateDto.md) |  |  [optional] |


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


<a id="OrderStatus"></a>
## Enum: orderStatus
| Name | Value |
| ---- | ----- |
| orderStatus | New, Processing, Accepted, Declined, Shipped, Delivered, OnHold, Failed, Fulfilled, Cancelled |


<a id="QuoteStatus"></a>
## Enum: quoteStatus
| Name | Value |
| ---- | ----- |
| quoteStatus | Draft, New, Accepted, Declined, Expired |


<a id="FreightTerms"></a>
## Enum: freightTerms
| Name | Value |
| ---- | ----- |
| freightTerms | FOB, NoCharge |



