
# AssetRepairDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | [**kotlin.Any**](.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **businessId** | [**kotlin.Any**](.md) |  |  [optional] |
| **businessProfileRecordId** | [**kotlin.Any**](.md) |  |  [optional] |
| **assetId** | [**kotlin.Any**](.md) |  |  [optional] |
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



