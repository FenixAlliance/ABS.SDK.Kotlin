
# SupportTicketDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **supportTicketStatus** | [**inline**](#SupportTicketStatus) |  |  [optional] |
| **userId** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **supportTicketTypeId** | **kotlin.String** |  |  [optional] |
| **supportEntitlementId** | **kotlin.String** |  |  [optional] |
| **supportPriorityId** | **kotlin.String** |  |  [optional] |


<a id="SupportTicketStatus"></a>
## Enum: supportTicketStatus
| Name | Value |
| ---- | ----- |
| supportTicketStatus | New, OpenAndWaitingForAgent, OpenAndWaitingForCustomer, Closed |



