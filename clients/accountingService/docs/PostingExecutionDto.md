
# PostingExecutionDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **postingIntentId** | **kotlin.String** |  |  [optional] |
| **postingIdempotencyKey** | **kotlin.String** |  |  [optional] |
| **intentType** | **kotlin.String** |  |  [optional] |
| **postingOperation** | **kotlin.String** |  |  [optional] |
| **sourceDocumentType** | **kotlin.String** |  |  [optional] |
| **sourceDocumentId** | **kotlin.String** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **failureKind** | [**inline**](#FailureKind) |  |  [optional] |
| **failureCode** | **kotlin.String** |  |  [optional] |
| **retryable** | **kotlin.Boolean** |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **causationId** | **kotlin.String** |  |  [optional] |
| **receivedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **processingStartedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **bookResults** | [**kotlin.collections.List&lt;PostingBookResultDto&gt;**](PostingBookResultDto.md) |  |  [optional] |
| **failureClass** | [**inline**](#FailureClass) |  |  [optional] [readonly] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | Received, Processing, Posted, Duplicate, PendingMapping, PendingPeriod, PendingRate, Rejected |


<a id="FailureKind"></a>
## Enum: failureKind
| Name | Value |
| ---- | ----- |
| failureKind | UnknownOperation, UnknownRole, AmbiguousPolicy, MissingAccountMapping, MissingFinancialBook, MissingJournal, ClosedPeriod, MissingFxRate, InvalidFxEvidence, UnbalancedPlan, DuplicateIntent, DuplicateBookPosting, InvalidPartyReference, InvalidCustodyContext, PolicyConfigurationError |


<a id="FailureClass"></a>
## Enum: failureClass
| Name | Value |
| ---- | ----- |
| failureClass | Retryable, OperatorActionRequired, ConfigurationError, ProducerError |



