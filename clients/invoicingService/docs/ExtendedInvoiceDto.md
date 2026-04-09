
# ExtendedInvoiceDto

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
| **taxCalculationMethod** | [**inline**](#TaxCalculationMethod) |  |  [optional] |
| **costCalculationMethod** | [**inline**](#CostCalculationMethod) |  |  [optional] |
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
| **totalTaxBase** | **kotlin.Double** |  |  [optional] |
| **totalTaxBaseCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalTaxes** | **kotlin.Double** |  |  [optional] |
| **totalTaxesCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalShippingCost** | **kotlin.Double** |  |  [optional] |
| **totalShippingCostCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalShippingTax** | **kotlin.Double** |  |  [optional] |
| **totalShippingTaxCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalWithheldTax** | **kotlin.Double** |  |  [optional] |
| **totalWithheldTaxCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalGlobalDiscounts** | **kotlin.Double** |  |  [optional] |
| **totalGlobalDiscountsCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalGlobalSurcharges** | **kotlin.Double** |  |  [optional] |
| **totalGlobalSurchargesCurrencyId** | **kotlin.String** |  |  [optional] |
| **total** | **kotlin.Double** |  |  [optional] |
| **totalCurrencyId** | **kotlin.String** |  |  [optional] |
| **totalDetailInUsd** | **kotlin.Double** |  |  [optional] |
| **totalProfitInUsd** | **kotlin.Double** |  |  [optional] |
| **totalDiscountsInUsd** | **kotlin.Double** |  |  [optional] |
| **totalSurchargesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalTaxBaseInUsd** | **kotlin.Double** |  |  [optional] |
| **totalTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalWithheldTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalShippingCostInUsd** | **kotlin.Double** |  |  [optional] |
| **totalShippingTaxesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalGlobalDiscountsInUsd** | **kotlin.Double** |  |  [optional] |
| **totalGlobalSurchargesInUsd** | **kotlin.Double** |  |  [optional] |
| **totalInUsd** | **kotlin.Double** |  |  [optional] |
| **paid** | **kotlin.Boolean** |  |  [optional] |
| **number** | **kotlin.Long** |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **enumeration** | **kotlin.String** |  |  [optional] |
| **paymentModeId** | **kotlin.String** |  |  [optional] |
| **enumerationRangeId** | **kotlin.String** |  |  [optional] |
| **emisorBillingProfileId** | **kotlin.String** |  |  [optional] |
| **receiverBillingProfileId** | **kotlin.String** |  |  [optional] |
| **emisorWalletAccountId** | **kotlin.String** |  |  [optional] |
| **receiverWalletAccountId** | **kotlin.String** |  |  [optional] |
| **paymentDue** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **invoiceType** | [**inline**](#InvoiceType) |  |  [optional] |
| **documentType** | [**inline**](#DocumentType) |  |  [optional] |
| **invoiceStatus** | [**inline**](#InvoiceStatus) |  |  [optional] |
| **tenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
| **user** | [**SimpleUserDto**](SimpleUserDto.md) |  |  [optional] |
| **receiverTenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
| **individual** | [**SimpleContactDto**](SimpleContactDto.md) |  |  [optional] |
| **organization** | [**SimpleContactDto**](SimpleContactDto.md) |  |  [optional] |
| **enrollment** | [**SimpleTenantEnrollmentDto**](SimpleTenantEnrollmentDto.md) |  |  [optional] |
| **invoiceLines** | [**kotlin.collections.List&lt;InvoiceLineDto&gt;**](InvoiceLineDto.md) |  |  [optional] |


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



