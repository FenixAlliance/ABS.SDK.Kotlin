
# OutboxMessageDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **kind** | [**inline**](#Kind) |  |  [optional] |
| **messageType** | **kotlin.String** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **attempts** | **kotlin.Int** |  |  [optional] |
| **maxAttempts** | **kotlin.Int** |  |  [optional] |
| **failureCode** | **kotlin.String** |  |  [optional] |
| **failureReason** | **kotlin.String** |  |  [optional] |
| **idempotencyKey** | **kotlin.String** |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **lockedBy** | **kotlin.String** |  |  [optional] |
| **lockedUntilUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **availableAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **createdAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **lastAttemptAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **processedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **failedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |


<a id="Kind"></a>
## Enum: kind
| Name | Value |
| ---- | ----- |
| kind | Event, Command |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | Pending, Processing, Succeeded, Failed, DeadLettered, Cancelled |



