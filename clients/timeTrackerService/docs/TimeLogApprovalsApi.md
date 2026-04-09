# TimeLogApprovalsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**requestProjectHoursApprovalAsync**](TimeLogApprovalsApi.md#requestProjectHoursApprovalAsync) | **POST** /api/v2/TimeTrackerService/TimeLogApprovals | Request project hours approval |
| [**updateProjectHoursApprovalApproverAsync**](TimeLogApprovalsApi.md#updateProjectHoursApprovalApproverAsync) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Approver | Update approval approver |
| [**updateProjectHoursApprovalStatusAsync**](TimeLogApprovalsApi.md#updateProjectHoursApprovalStatusAsync) | **PUT** /api/v2/TimeTrackerService/TimeLogApprovals/{approvalId}/Status | Update approval status |


<a id="requestProjectHoursApprovalAsync"></a>
# **requestProjectHoursApprovalAsync**
> requestProjectHoursApprovalAsync(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto)

Request project hours approval

Creates a new project hours approval request.

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
    apiInstance.requestProjectHoursApprovalAsync(tenantId, apiVersion, xApiVersion, projectHoursApprovalCreateDto)
} catch (e: ClientException) {
    println("4xx response calling TimeLogApprovalsApi#requestProjectHoursApprovalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogApprovalsApi#requestProjectHoursApprovalAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProjectHoursApprovalApproverAsync"></a>
# **updateProjectHoursApprovalApproverAsync**
> updateProjectHoursApprovalApproverAsync(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto)

Update approval approver

Updates the approver of an existing project hours approval.

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
    apiInstance.updateProjectHoursApprovalApproverAsync(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalApproverUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling TimeLogApprovalsApi#updateProjectHoursApprovalApproverAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogApprovalsApi#updateProjectHoursApprovalApproverAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProjectHoursApprovalStatusAsync"></a>
# **updateProjectHoursApprovalStatusAsync**
> updateProjectHoursApprovalStatusAsync(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto)

Update approval status

Updates the status of an existing project hours approval.

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
    apiInstance.updateProjectHoursApprovalStatusAsync(approvalId, tenantId, apiVersion, xApiVersion, projectHoursApprovalStatusUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling TimeLogApprovalsApi#updateProjectHoursApprovalStatusAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeLogApprovalsApi#updateProjectHoursApprovalStatusAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

