
# JobOfferApplicationDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **status** | [**inline**](#Status) |  |  [optional] |
| **start** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **end** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **salaryExpectation** | **kotlin.Double** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **curriculumId** | **kotlin.String** |  |  [optional] |
| **curriculumCoverId** | **kotlin.String** |  |  [optional] |
| **jobOfferId** | **kotlin.String** |  |  [optional] |
| **partnerProfileId** | **kotlin.String** |  |  [optional] |
| **jobApplicantProfileId** | **kotlin.String** |  |  [optional] |


<a id="Status"></a>
## Enum: status
| Name | Value |
| ---- | ----- |
| status | Submitted, UnderReview, Interviewing, Offered, Hired, Rejected, Withdrawn |



