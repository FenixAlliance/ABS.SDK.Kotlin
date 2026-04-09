
# InvoiceCreateDto

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
| **paid** | **kotlin.Boolean** |  |  [optional] |
| **number** | **kotlin.Int** |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **enumeration** | **kotlin.String** |  |  [optional] |
| **paymentModeId** | **kotlin.String** |  |  [optional] |
| **enumerationRangeId** | **kotlin.String** |  |  [optional] |
| **emisorBillingProfileId** | **kotlin.String** |  |  [optional] |
| **receiverBillingProfileId** | **kotlin.String** |  |  [optional] |
| **emisorWalletAccountId** | **kotlin.String** |  |  [optional] |
| **receiverWalletAccountId** | **kotlin.String** |  |  [optional] |
| **customerNotes** | **kotlin.String** |  |  [optional] |
| **invoiceType** | [**inline**](#InvoiceType) |  |  [optional] |
| **documentType** | [**inline**](#DocumentType) |  |  [optional] |
| **invoiceStatus** | [**inline**](#InvoiceStatus) |  |  [optional] |
| **paymentDue** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **validFrom** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **validTo** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **invoiceLines** | [**kotlin.collections.List&lt;InvoiceLineCreateDto&gt;**](InvoiceLineCreateDto.md) |  |  [optional] |
| **invoiceReferences** | [**kotlin.collections.List&lt;InvoiceReferenceCreateDto&gt;**](InvoiceReferenceCreateDto.md) |  |  [optional] |
| **invoiceAdjustments** | [**kotlin.collections.List&lt;InvoiceAdjustmentCreateDto&gt;**](InvoiceAdjustmentCreateDto.md) |  |  [optional] |


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


<a id="InvoiceType"></a>
## Enum: invoiceType
| Name | Value |
| ---- | ----- |
| invoiceType | PurchaseInvoice, SalesInvoice, CreditNote, DebitNote |


<a id="DocumentType"></a>
## Enum: documentType
| Name | Value |
| ---- | ----- |
| documentType | Standard, DebitNote, CreditNote |


<a id="InvoiceStatus"></a>
## Enum: invoiceStatus
| Name | Value |
| ---- | ----- |
| invoiceStatus | Draft, Closed, Signed, Expired, Paid |



