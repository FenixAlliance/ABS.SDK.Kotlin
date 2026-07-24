
# SigningRequestDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **signedDocumentId** | **kotlin.String** |  |  [optional] |
| **signedDocumentTitle** | **kotlin.String** |  |  [optional] |
| **frozenSourceFileUploadId** | **kotlin.String** |  |  [optional] |
| **sourceSha256** | **kotlin.String** |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **routingMode** | [**inline**](#RoutingMode) |  |  [optional] |
| **createdAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **sentAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **expiresAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **voidedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **voidedReason** | **kotlin.String** |  |  [optional] |
| **message** | **kotlin.String** |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **externalReference** | **kotlin.String** |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | Draft, Ready, Sent, InProgress, Completed, Declined, Voided, Expired, Failed |


<a id="RoutingMode"></a>
## Enum: routingMode
| Name | Value |
| ---- | ----- |
| routingMode | Parallel, Sequential |



