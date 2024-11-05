# TimeLogApprovalsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut**](TimeLogApprovalsApi.md#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Approver |  |
| [**apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut**](TimeLogApprovalsApi.md#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Status |  |
| [**apiV2TimeTrackerServiceTimeLogApprovalsPost**](TimeLogApprovalsApi.md#apiV2TimeTrackerServiceTimeLogApprovalsPost) | **POST** /api/v2/TimeTrackerService/TimeLogApprovals |  |


<a id="apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut"></a>
# **apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut**
> apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeLogApprovalsApi()
val approvalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectHoursApprovalApproverUpdateDto : ProjectHoursApprovalApproverUpdateDto =  // ProjectHoursApprovalApproverUpdateDto | 
try {
    apiInstance.apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdApproverPut")
    e.printStackTrace()
}
```

### Parameters
| **approvalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectHoursApprovalApproverUpdateDto** | [**ProjectHoursApprovalApproverUpdateDto**](ProjectHoursApprovalApproverUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut"></a>
# **apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut**
> apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeLogApprovalsApi()
val approvalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectHoursApprovalStatusUpdateDto : ProjectHoursApprovalStatusUpdateDto =  // ProjectHoursApprovalStatusUpdateDto | 
try {
    apiInstance.apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsApprovalIdStatusPut")
    e.printStackTrace()
}
```

### Parameters
| **approvalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectHoursApprovalStatusUpdateDto** | [**ProjectHoursApprovalStatusUpdateDto**](ProjectHoursApprovalStatusUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2TimeTrackerServiceTimeLogApprovalsPost"></a>
# **apiV2TimeTrackerServiceTimeLogApprovalsPost**
> apiV2TimeTrackerServiceTimeLogApprovalsPost(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeLogApprovalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val projectHoursApprovalCreateDto : ProjectHoursApprovalCreateDto =  // ProjectHoursApprovalCreateDto | 
try {
    apiInstance.apiV2TimeTrackerServiceTimeLogApprovalsPost(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto)
} catch (e: ClientException) {
    println("4xx response calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogApprovalsApi#apiV2TimeTrackerServiceTimeLogApprovalsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **projectHoursApprovalCreateDto** | [**ProjectHoursApprovalCreateDto**](ProjectHoursApprovalCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

