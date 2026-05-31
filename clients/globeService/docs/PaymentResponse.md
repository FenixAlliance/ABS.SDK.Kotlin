
# PaymentResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **test** | **kotlin.Boolean** |  |  [optional] |
| **ip** | **kotlin.String** |  |  [optional] |
| **bank** | **kotlin.String** |  |  [optional] |
| **status** | **kotlin.String** |  |  [optional] |
| **errors** | [**kotlin.Any**](.md) |  |  [optional] |
| **response** | **kotlin.String** |  |  [optional] |
| **authCode** | **kotlin.String** |  |  [optional] |
| **paymentID** | **kotlin.String** |  |  [optional] |
| **franchise** | **kotlin.String** |  |  [optional] |
| **signature** | **kotlin.String** |  |  [optional] |
| **paymentStatus** | [**inline**](#PaymentStatus) |  |  [optional] |


<a id="PaymentStatus"></a>
## Enum: paymentStatus
| Name | Value |
| ---- | ----- |
| paymentStatus | Unset, Accepted, Rejected, OnHold, Failed, Reversed, Retained, Initialized, Expired, Abandoned, Cancelled, AcceptedRetained |



