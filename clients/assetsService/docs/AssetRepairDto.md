
# AssetRepairDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **assetId** | **kotlin.String** |  |  [optional] |
| **assetName** | **kotlin.String** |  |  [optional] |
| **repairStatus** | [**inline**](#RepairStatus) |  |  [optional] |
| **scheduledDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **reportedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **estimatedCost** | **kotlin.Double** |  |  [optional] |
| **actualCost** | **kotlin.Double** |  |  [optional] |
| **problemDescription** | **kotlin.String** |  |  [optional] |
| **repairDescription** | **kotlin.String** |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **assetMaintenanceTeamId** | **kotlin.String** |  |  [optional] |
| **assetMaintenanceTeamName** | **kotlin.String** |  |  [optional] |


<a id="RepairStatus"></a>
## Enum: repairStatus
| Name | Value |
| ---- | ----- |
| repairStatus | Scheduled, InProgress, Completed, Cancelled |



