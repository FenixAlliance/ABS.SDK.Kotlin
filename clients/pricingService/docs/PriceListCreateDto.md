
# PriceListCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **context** | [**inline**](#Context) |  |  [optional] |
| **startDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **endDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **unitId** | **kotlin.String** |  |  [optional] |
| **unitGroupId** | **kotlin.String** |  |  [optional] |
| **partnerVisible** | **kotlin.Boolean** |  |  [optional] |
| **unitOfMeasureDependant** | **kotlin.Boolean** |  |  [optional] |


<a id="Context"></a>
## Enum: context
| Name | Value |
| ---- | ----- |
| context | Sales, Purchase, Cost |



