
# DealUnitCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] [readonly] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **priceListId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **individualId** | **kotlin.String** |  |  [optional] |
| **paymentTermId** | **kotlin.String** |  |  [optional] |
| **organizationId** | **kotlin.String** |  |  [optional] |
| **receiverTenantId** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **forexRate** | **kotlin.Double** |  |  [optional] |
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



