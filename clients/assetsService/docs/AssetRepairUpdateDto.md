
# AssetRepairUpdateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **repairStatus** | [**inline**](#RepairStatus) |  |  [optional] |
| **scheduledDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **completionDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **estimatedCost** | **kotlin.Double** |  |  [optional] |
| **actualCost** | **kotlin.Double** |  |  [optional] |
| **problemDescription** | **kotlin.String** |  |  [optional] |
| **repairDescription** | **kotlin.String** |  |  [optional] |
| **notes** | **kotlin.String** |  |  [optional] |
| **assetMaintenanceTeamId** | **kotlin.String** |  |  [optional] |


<a id="RepairStatus"></a>
## Enum: repairStatus
| Name | Value |
| ---- | ----- |
| repairStatus | Scheduled, InProgress, Completed, Cancelled |



