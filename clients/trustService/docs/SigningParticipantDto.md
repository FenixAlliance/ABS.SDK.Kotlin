
# SigningParticipantDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **signingRequestId** | **kotlin.String** |  |  [optional] |
| **contactId** | **kotlin.String** |  |  [optional] |
| **contactName** | **kotlin.String** |  |  [optional] |
| **role** | [**inline**](#Role) |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **routingOrder** | **kotlin.Int** |  |  [optional] |
| **sentAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **viewedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **signedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **approvedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **declinedAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **declineReason** | **kotlin.String** |  |  [optional] |
| **signatureId** | **kotlin.String** |  |  [optional] |
| **accessTokenExpiresAtUtc** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **externalReference** | **kotlin.String** |  |  [optional] |


<a id="Role"></a>
## Enum: role
| Name | Value |
| ---- | ----- |
| role | Signer, Approver, Viewer, Witness, CarbonCopy, System |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | Pending, Sent, Viewed, Signed, Approved, Declined, Skipped, Expired, Failed |



