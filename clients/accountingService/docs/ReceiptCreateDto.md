
# ReceiptCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **priceListId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
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
| **currencyId** | **kotlin.String** |  |  [optional] |
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
| **paymentId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
| **totalAmount** | **kotlin.Double** |  |  [optional] |
| **totalAmountInUSD** | **kotlin.Double** |  |  [optional] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **accountHolderId** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **receiptType** | [**inline**](#ReceiptType) |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **invoiceId** | **kotlin.String** |  |  [optional] |


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


<a id="ReceiptType"></a>
## Enum: receiptType
| Name | Value |
| ---- | ----- |
| receiptType | PaymentReceipt, PurchaseReceipt |



