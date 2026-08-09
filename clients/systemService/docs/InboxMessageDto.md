
# InboxMessageDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **sourceSystem** | **kotlin.String** |  |  [optional] |
| **sourceRegistrationId** | **kotlin.String** |  |  [optional] |
| **externalMessageId** | **kotlin.String** |  |  [optional] |
| **deduplicationKey** | **kotlin.String** |  |  [optional] |
| **deduplicationSignature** | **kotlin.String** |  |  [optional] |
| **payloadDigest** | **kotlin.String** |  |  [optional] |
| **deliveryCount** | **kotlin.Int** |  |  [optional] |
| **lastDuplicateReceivedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **messageType** | **kotlin.String** |  |  [optional] |
| **version** | **kotlin.String** |  |  [optional] |
| **contentType** | **kotlin.String** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **attempts** | **kotlin.Int** |  |  [optional] |
| **maxAttempts** | **kotlin.Int** |  |  [optional] |
| **verificationStatus** | [**inline**](#VerificationStatus) |  |  [optional] |
| **verificationProfile** | **kotlin.String** |  |  [optional] |
| **verificationAlgorithm** | **kotlin.String** |  |  [optional] |
| **verifiedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **generation** | **kotlin.Int** |  |  [optional] |
| **replayCount** | **kotlin.Int** |  |  [optional] |
| **originalInboxMessageId** | **kotlin.String** |  |  [optional] |
| **failureCode** | **kotlin.String** |  |  [optional] |
| **failureReason** | **kotlin.String** |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **causationId** | **kotlin.String** |  |  [optional] |
| **lockedBy** | **kotlin.String** |  |  [optional] |
| **lockedUntilUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **availableAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **receivedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **createdAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **lastAttemptAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **processedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **failedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | Received, AuthenticityPending, Accepted, Processing, Succeeded, RetryScheduled, Rejected, Quarantined, DeadLettered, Cancelled |


<a id="VerificationStatus"></a>
## Enum: verificationStatus
| Name | Value |
| ---- | ----- |
| verificationStatus | Unverified, Verified, Failed, Untrusted, NotRequired |



