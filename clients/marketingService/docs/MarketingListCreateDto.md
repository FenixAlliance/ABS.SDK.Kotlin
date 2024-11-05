
# MarketingListCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] [readonly] |
| **locked** | **kotlin.Boolean** |  |  [optional] |
| **name** | **kotlin.String** |  |  [optional] |
| **purpose** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **source** | **kotlin.String** |  |  [optional] |
| **cost** | **kotlin.Double** |  |  [optional] |
| **modifiedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **lastUsedOn** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrolmentId** | **kotlin.String** |  |  [optional] |
| **marketingListType** | [**inline**](#MarketingListType) |  |  [optional] |
| **marketingListTarget** | [**inline**](#MarketingListTarget) |  |  [optional] |


<a id="MarketingListType"></a>
## Enum: marketingListType
| Name | Value |
| ---- | ----- |
| marketingListType | 0, 1 |


<a id="MarketingListTarget"></a>
## Enum: marketingListTarget
| Name | Value |
| ---- | ----- |
| marketingListTarget | 0, 1, 2 |



