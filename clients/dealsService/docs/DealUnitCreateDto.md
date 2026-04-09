
# DealUnitCreateDto

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
| **dealUnitFlowId** | **kotlin.String** |  |  [optional] |
| **dealUnitFlowStageId** | **kotlin.String** |  |  [optional] |
| **partnerCreated** | **kotlin.Boolean** |  |  [optional] |
| **partnerCollaboration** | **kotlin.Boolean** |  |  [optional] |
| **proposedSolution** | **kotlin.String** |  |  [optional] |
| **currentSituation** | **kotlin.String** |  |  [optional] |
| **customerNeed** | **kotlin.String** |  |  [optional] |
| **wonDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **lostDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **expiryDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **deliveredDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **closedTimestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **expectedCloseDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **dealUnitStatus** | [**inline**](#DealUnitStatus) |  |  [optional] |
| **dealUnitPurchaseProcess** | [**inline**](#DealUnitPurchaseProcess) |  |  [optional] |
| **dealUnitForecastCategory** | [**inline**](#DealUnitForecastCategory) |  |  [optional] |
| **dealUnitAmountsCalculation** | [**inline**](#DealUnitAmountsCalculation) |  |  [optional] |
| **dealUnitLines** | [**kotlin.collections.List&lt;DealUnitLineCreateDto&gt;**](DealUnitLineCreateDto.md) |  |  [optional] |


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


<a id="DealUnitStatus"></a>
## Enum: dealUnitStatus
| Name | Value |
| ---- | ----- |
| dealUnitStatus | Open, Won, Lost, Frozen |


<a id="DealUnitPurchaseProcess"></a>
## Enum: dealUnitPurchaseProcess
| Name | Value |
| ---- | ----- |
| dealUnitPurchaseProcess | None, Individual, Commitee, Unknown |


<a id="DealUnitForecastCategory"></a>
## Enum: dealUnitForecastCategory
| Name | Value |
| ---- | ----- |
| dealUnitForecastCategory | None, Pipeline, BestCase, Commited, Ommited, Won, Lost |


<a id="DealUnitAmountsCalculation"></a>
## Enum: dealUnitAmountsCalculation
| Name | Value |
| ---- | ----- |
| dealUnitAmountsCalculation | UserProvided, SystemCalculated |



