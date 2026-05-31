
# TrainingProgramEventCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** |  |  |
| **start** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **end** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **trainingProgramId** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **description** | **kotlin.String** |  |  [optional] |
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



