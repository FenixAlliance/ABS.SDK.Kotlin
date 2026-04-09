
# InvoiceLineDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **itemId** | **kotlin.String** |  |  [optional] |
| **itemTitle** | **kotlin.String** |  |  [optional] |
| **itemShortDescription** | **kotlin.String** |  |  [optional] |
| **itemPrimaryImageUrl** | **kotlin.String** |  |  [optional] |
| **shippingPolicyId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **quantity** | **kotlin.Double** |  |  [optional] |
| **free** | **kotlin.Boolean** |  |  [optional] |
| **freeReason** | **kotlin.String** |  |  [optional] |
| **freeReasonCode** | **kotlin.String** |  |  [optional] |
| **&#x60;data&#x60;** | **kotlin.String** |  |  [optional] |
| **dataLabel** | **kotlin.String** |  |  [optional] |
| **data1** | **kotlin.String** |  |  [optional] |
| **data1Label** | **kotlin.String** |  |  [optional] |
| **data2** | **kotlin.String** |  |  [optional] |
| **data2Label** | **kotlin.String** |  |  [optional] |
| **data3** | **kotlin.String** |  |  [optional] |
| **data3Label** | **kotlin.String** |  |  [optional] |
| **data4** | **kotlin.String** |  |  [optional] |
| **data4Label** | **kotlin.String** |  |  [optional] |
| **data5** | **kotlin.String** |  |  [optional] |
| **data5Label** | **kotlin.String** |  |  [optional] |
| **data6** | **kotlin.String** |  |  [optional] |
| **data6Label** | **kotlin.String** |  |  [optional] |
| **data7** | **kotlin.String** |  |  [optional] |
| **data7Label** | **kotlin.String** |  |  [optional] |
| **data8** | **kotlin.String** |  |  [optional] |
| **data8Label** | **kotlin.String** |  |  [optional] |
| **data9** | **kotlin.String** |  |  [optional] |
| **data9Label** | **kotlin.String** |  |  [optional] |
| **itemPriceId** | **kotlin.String** |  |  [optional] |
| **priceListItemId** | **kotlin.String** |  |  [optional] |
| **unitId** | **kotlin.String** |  |  [optional] |
| **unitGroupId** | **kotlin.String** |  |  [optional] |
| **taxCalculationMethod** | [**inline**](#TaxCalculationMethod) |  |  [optional] |
| **costCalculationMethod** | [**inline**](#CostCalculationMethod) |  |  [optional] |
| **forexRates** | [**ForexRates**](ForexRates.md) |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **totalDetailInUsd** | **kotlin.Double** |  |  [optional] |
| **totalProfitInUsd** | **kotlin.Double** |  |  [optional] |
| **totalDiscountsInUsd** | **kotlin.Double** |  |  [optional] |
| **totalSurchargesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalTaxBaseInUsd** | **kotlin.Double** |  |  [optional] |
| **totalTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalWithheldTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalShippingCostInUsd** | **kotlin.Double** |  |  [optional] |
| **totalShippingTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalWarrantyCostInUsd** | **kotlin.Double** |  |  [optional] |
| **totalReturnCostInUsd** | **kotlin.Double** |  |  [optional] |
| **totalRefundCostInUsd** | **kotlin.Double** |  |  [optional] |
| **totalInUsd** | **kotlin.Double** |  |  [optional] |
| **totalGlobalDiscountsInUsd** | **kotlin.Double** |  |  [optional] |
| **totalGlobalSurchargesInUsd** | **kotlin.Double** |  |  [optional] |
| **customGlobalSurchargesAmount** | **kotlin.Double** |  |  [optional] |
| **customGlobalDiscountsAmount** | **kotlin.Double** |  |  [optional] |
| **returnPolicyId** | **kotlin.String** |  |  [optional] |
| **refundPolicyId** | **kotlin.String** |  |  [optional] |
| **warrantyPolicyId** | **kotlin.String** |  |  [optional] |
| **shipmentPolicyId** | **kotlin.String** |  |  [optional] |
| **shippingLocationId** | **kotlin.String** |  |  [optional] |
| **locationId** | **kotlin.String** |  |  [optional] |
| **quoteItemRecordId** | **kotlin.String** |  |  [optional] |
| **businessProfileRecordId** | **kotlin.String** |  |  [optional] |
| **parentBillingItemRecordId** | **kotlin.String** |  |  [optional] |
| **currency** | [**CurrencyId**](CurrencyId.md) |  |  [optional] |
| **totalDetail** | **kotlin.Double** |  |  [optional] |
| **totalDetailCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalDetailAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalProfit** | **kotlin.Double** |  |  [optional] |
| **totalProfitCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalProfitAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalDiscountsCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalDiscountsAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalSurchargesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalSurchargesAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalTaxBase** | **kotlin.Double** |  |  [optional] |
| **totalTaxBaseCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalTaxBaseAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalTaxes** | **kotlin.Double** |  |  [optional] |
| **totalTaxesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalTaxesAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalShippingCost** | **kotlin.Double** |  |  [optional] |
| **totalShippingCostCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalShippingCostAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalShippingTax** | **kotlin.Double** |  |  [optional] |
| **totalShippingTaxCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalShippingTaxAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalWithheldTax** | **kotlin.Double** |  |  [optional] |
| **totalWithheldTaxCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalWithheldTaxAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalGlobalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalGlobalDiscountsCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalGlobalDiscountsAmount** | [**Money**](Money.md) |  |  [optional] |
| **totalGlobalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalGlobalSurchargesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalGlobalSurchargesAmount** | [**Money**](Money.md) |  |  [optional] |
| **total** | **kotlin.Double** |  |  [optional] |
| **totalCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalAmount** | [**Money**](Money.md) |  |  [optional] |
| **invoiceId** | **kotlin.String** |  |  [optional] |


<a id="TaxCalculationMethod"></a>
## Enum: taxCalculationMethod
| Name | Value |
| ---- | ----- |
| taxCalculationMethod | Included, Excluded |


<a id="CostCalculationMethod"></a>
## Enum: costCalculationMethod
| Name | Value |
| ---- | ----- |
| costCalculationMethod | Automatic, Custom |



