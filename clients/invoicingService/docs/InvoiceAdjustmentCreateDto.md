
# InvoiceAdjustmentCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] [readonly] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] [readonly] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **invoiceId** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **surchargePercent** | **kotlin.Double** |  |  [optional] |
| **surchargeAmount** | **kotlin.Double** |  |  [optional] |
| **discountPercent** | **kotlin.Double** |  |  [optional] |
| **discountAmount** | **kotlin.Double** |  |  [optional] |
| **totalSurcharge** | **kotlin.Double** |  |  [optional] |
| **totalDiscount** | **kotlin.Double** |  |  [optional] |
| **type** | [**inline**](#Type) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | 0, 1 |


