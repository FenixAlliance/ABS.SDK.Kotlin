
# RecordSigningParticipantOutcomeDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outcome** | [**inline**](#Outcome) |  |  |
| **outcomeAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **declineReason** | **kotlin.String** |  |  [optional] |
| **externalReference** | **kotlin.String** |  |  [optional] |


<a id="Outcome"></a>
## Enum: outcome
| Name | Value |
| ---- | ----- |
| outcome | Pending, Sent, Viewed, Signed, Approved, Declined, Skipped, Expired, Failed |



