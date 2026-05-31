
# ShippingMethodCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **cost** | **kotlin.Double** |  |  [optional] |
| **taxable** | **kotlin.Boolean** |  |  [optional] |
| **taxIncluded** | **kotlin.Boolean** |  |  [optional] |
| **currencyID** | **kotlin.String** |  |  [optional] |
| **shippingClassCalculationType** | [**inline**](#ShippingClassCalculationType) |  |  [optional] |


<a id="ShippingClassCalculationType"></a>
## Enum: shippingClassCalculationType
| Name | Value |
| ---- | ----- |
| shippingClassCalculationType | PerClass, PerOrder |



