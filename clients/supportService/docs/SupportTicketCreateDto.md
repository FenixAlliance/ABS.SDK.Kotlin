
# SupportTicketCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **supportTicketStatus** | [**inline**](#SupportTicketStatus) |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **supportTicketTypeId** | **kotlin.String** |  |  [optional] |
| **supportEntitlementId** | **kotlin.String** |  |  [optional] |
| **supportPriorityId** | **kotlin.String** |  |  [optional] |


<a id="SupportTicketStatus"></a>
## Enum: supportTicketStatus
| Name | Value |
| ---- | ----- |
| supportTicketStatus | New, OpenAndWaitingForAgent, OpenAndWaitingForCustomer, Closed |



