
# ShipmentDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **trackingCode** | **kotlin.String** |  |  [optional] |
| **isInternational** | **kotlin.Boolean** |  |  [optional] |
| **shipped** | **kotlin.Boolean** |  |  [optional] |
| **delivered** | **kotlin.Boolean** |  |  [optional] |
| **shipmentTimestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **deliveryTimestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **expectedShippingDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **expectedDeliveryDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **shippingTerms** | [**inline**](#ShippingTerms) |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |


<a id="ShippingTerms"></a>
## Enum: shippingTerms
| Name | Value |
| ---- | ----- |
| shippingTerms | NC, EXW, FCA, FOB, FAS, CFR, CIF, CPT, CIP, DDP, DAP, DPU |



