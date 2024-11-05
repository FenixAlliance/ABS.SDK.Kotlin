# org.openapitools.client - Kotlin client library for TimeTrackerService

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 2.0.1.4089
- Package version: 
- Generator version: 7.9.0
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen
For more information, please visit [https://fenixalliance.com.co/Support](https://fenixalliance.com.co/Support)

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *ProjectTimeLogsApi* | [**apiV2TimeTrackerServiceProjectTimeLogsByResponsibleContactGet**](docs/ProjectTimeLogsApi.md#apiv2timetrackerserviceprojecttimelogsbyresponsiblecontactget) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/ByResponsibleContact |  |
| *ProjectTimeLogsApi* | [**apiV2TimeTrackerServiceProjectTimeLogsCreatedByContactGet**](docs/ProjectTimeLogsApi.md#apiv2timetrackerserviceprojecttimelogscreatedbycontactget) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/CreatedByContact |  |
| *ProjectTimeLogsApi* | [**apiV2TimeTrackerServiceProjectTimeLogsForProjectProjectIdGet**](docs/ProjectTimeLogsApi.md#apiv2timetrackerserviceprojecttimelogsforprojectprojectidget) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/ForProject/{projectId} |  |
| *ProjectTimeLogsApi* | [**apiV2TimeTrackerServiceProjectTimeLogsGet**](docs/ProjectTimeLogsApi.md#apiv2timetrackerserviceprojecttimelogsget) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs |  |
| *ProjectTimeLogsApi* | [**apiV2TimeTrackerServiceProjectTimeLogsPost**](docs/ProjectTimeLogsApi.md#apiv2timetrackerserviceprojecttimelogspost) | **POST** /api/v2/TimeTrackerService/ProjectTimeLogs |  |
| *ProjectTimeLogsApi* | [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdDelete**](docs/ProjectTimeLogsApi.md#apiv2timetrackerserviceprojecttimelogstimelogiddelete) | **DELETE** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |
| *ProjectTimeLogsApi* | [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdGet**](docs/ProjectTimeLogsApi.md#apiv2timetrackerserviceprojecttimelogstimelogidget) | **GET** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |
| *ProjectTimeLogsApi* | [**apiV2TimeTrackerServiceProjectTimeLogsTimeLogIdPut**](docs/ProjectTimeLogsApi.md#apiv2timetrackerserviceprojecttimelogstimelogidput) | **PUT** /api/v2/TimeTrackerService/ProjectTimeLogs/{timeLogId} |  |
| *TimeLogApprovalsApi* | [**apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut**](docs/TimeLogApprovalsApi.md#apiv2timetrackerservicetimelogapprovalsapprovalidapproverput) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Approver |  |
| *TimeLogApprovalsApi* | [**apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut**](docs/TimeLogApprovalsApi.md#apiv2timetrackerservicetimelogapprovalsapprovalidstatusput) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Status |  |
| *TimeLogApprovalsApi* | [**apiV2TimeTrackerServiceTimeLogApprovalsPost**](docs/TimeLogApprovalsApi.md#apiv2timetrackerservicetimelogapprovalspost) | **POST** /api/v2/TimeTrackerService/TimeLogApprovals |  |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.ErrorEnvelope](docs/ErrorEnvelope.md)
 - [org.openapitools.client.models.ProjectHoursApprovalApproverUpdateDto](docs/ProjectHoursApprovalApproverUpdateDto.md)
 - [org.openapitools.client.models.ProjectHoursApprovalCreateDto](docs/ProjectHoursApprovalCreateDto.md)
 - [org.openapitools.client.models.ProjectHoursApprovalStatusUpdateDto](docs/ProjectHoursApprovalStatusUpdateDto.md)
 - [org.openapitools.client.models.ProjectTimeLogCreateDto](docs/ProjectTimeLogCreateDto.md)
 - [org.openapitools.client.models.ProjectTimeLogDto](docs/ProjectTimeLogDto.md)
 - [org.openapitools.client.models.ProjectTimeLogDtoEnvelope](docs/ProjectTimeLogDtoEnvelope.md)
 - [org.openapitools.client.models.ProjectTimeLogDtoListEnvelope](docs/ProjectTimeLogDtoListEnvelope.md)
 - [org.openapitools.client.models.ProjectTimeLogUpdateDto](docs/ProjectTimeLogUpdateDto.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header



## Author

support@fenix-alliance.com