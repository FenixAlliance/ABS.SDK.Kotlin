
# ReceiptDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **paymentId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **closed** | **kotlin.Boolean** |  |  [optional] |
| **accountHolderId** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **receiptType** | [**inline**](#ReceiptType) |  |  [optional] |
| **orderId** | **kotlin.String** |  |  [optional] |
| **invoiceId** | **kotlin.String** |  |  [optional] |


<a id="ReceiptType"></a>
## Enum: receiptType
| Name | Value |
| ---- | ----- |
| receiptType | PaymentReceipt, PurchaseReceipt |



