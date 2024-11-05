
# DealUnitDto

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
| **ordered** | **kotlin.Boolean** |  |  [optional] |
| **dealUnitFeedId** | **kotlin.String** |  |  [optional] |
| **dealUnitFlowId** | **kotlin.String** |  |  [optional] |
| **dealUnitFlowStageId** | **kotlin.String** |  |  [optional] |
| **billingLocationId** | **kotlin.String** |  |  [optional] |
| **shippingLocationId** | **kotlin.String** |  |  [optional] |
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
| **linesCount** | **kotlin.Int** |  |  [optional] |
| **customTotalAmount** | **kotlin.Double** |  |  [optional] |
| **customDetailAmount** | **kotlin.Double** |  |  [optional] |
| **customProfitAmount** | **kotlin.Double** |  |  [optional] |
| **customShippingCostAmount** | **kotlin.Double** |  |  [optional] |
| **customWithholdingTaxAmount** | **kotlin.Double** |  |  [optional] |
| **customSurchargesAmount** | **kotlin.Double** |  |  [optional] |
| **customDiscountsAmount** | **kotlin.Double** |  |  [optional] |
| **customShippingTaxAmount** | **kotlin.Double** |  |  [optional] |


<a id="DealUnitStatus"></a>
## Enum: dealUnitStatus
| Name | Value |
| ---- | ----- |
| dealUnitStatus | 0, 1, 2, 3 |


<a id="DealUnitPurchaseProcess"></a>
## Enum: dealUnitPurchaseProcess
| Name | Value |
| ---- | ----- |
| dealUnitPurchaseProcess | 0, 1, 2, 3 |


<a id="DealUnitForecastCategory"></a>
## Enum: dealUnitForecastCategory
| Name | Value |
| ---- | ----- |
| dealUnitForecastCategory | 0, 1, 2, 3, 4, 5, 6 |


<a id="DealUnitAmountsCalculation"></a>
## Enum: dealUnitAmountsCalculation
| Name | Value |
| ---- | ----- |
| dealUnitAmountsCalculation | 0, 1 |



