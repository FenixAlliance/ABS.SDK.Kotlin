
# ShiftDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
| **start** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **end** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **isBreak** | **kotlin.Boolean** |  |  [optional] |
| **occustOnMonday** | **kotlin.Boolean** |  |  [optional] |
| **occustOnTuesday** | **kotlin.Boolean** |  |  [optional] |
| **occustOnWednesday** | **kotlin.Boolean** |  |  [optional] |
| **occustOnThursday** | **kotlin.Boolean** |  |  [optional] |
| **occustOnFriday** | **kotlin.Boolean** |  |  [optional] |
| **occustOnSaturday** | **kotlin.Boolean** |  |  [optional] |
| **occustOnSunday** | **kotlin.Boolean** |  |  [optional] |
| **repeatEvery** | **kotlin.Int** |  |  [optional] |
| **repetitionCriteria** | [**inline**](#RepetitionCriteria) |  |  [optional] |
| **recurrenceStart** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **recurrenceEnd** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **dayOfTheWeek** | [**inline**](#DayOfTheWeek) |  |  [optional] |
| **scheduleId** | **kotlin.String** |  |  [optional] |
| **parentTimeIntervalId** | **kotlin.String** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **employeeProfileId** | **kotlin.String** |  |  [optional] |


<a id="RepetitionCriteria"></a>
## Enum: repetitionCriteria
| Name | Value |
| ---- | ----- |
| repetitionCriteria | NotRepeat, WorkWeek, Day, Month, Year |


<a id="DayOfTheWeek"></a>
## Enum: dayOfTheWeek
| Name | Value |
| ---- | ----- |
| dayOfTheWeek | All, Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday |



