
# ShipmentCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **trackingCode** | **kotlin.String** |  |  [optional] |
| **isInternational** | **kotlin.Boolean** |  |  [optional] |
| **expectedShippingDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **expectedDeliveryDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **shippingTerms** | [**inline**](#ShippingTerms) |  |  [optional] |
| **orderID** | **kotlin.String** |  |  [optional] |


<a id="ShippingTerms"></a>
## Enum: shippingTerms
| Name | Value |
| ---- | ----- |
| shippingTerms | NC, EXW, FCA, FOB, FAS, CFR, CIF, CPT, CIP, DDP, DAP, DPU |



