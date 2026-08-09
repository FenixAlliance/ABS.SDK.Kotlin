
# UserOrderSummaryDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **orderType** | [**inline**](#OrderType) |  |  [optional] |
| **orderStatus** | [**inline**](#OrderStatus) |  |  [optional] |


<a id="OrderType"></a>
## Enum: orderType
| Name | Value |
| ---- | ----- |
| orderType | SalesOrder, PurchaseOrder |


<a id="OrderStatus"></a>
## Enum: orderStatus
| Name | Value |
| ---- | ----- |
| orderStatus | New, Processing, Accepted, Declined, Shipped, Delivered, OnHold, Failed, Fulfilled, Cancelled |



