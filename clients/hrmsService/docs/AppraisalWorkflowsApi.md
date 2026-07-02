# AppraisalWorkflowsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAppraisalWorkflowAsync**](AppraisalWorkflowsApi.md#createAppraisalWorkflowAsync) | **POST** /api/v2/HrmsService/AppraisalWorkflows | Create an appraisal workflow |
| [**deleteAppraisalWorkflowAsync**](AppraisalWorkflowsApi.md#deleteAppraisalWorkflowAsync) | **DELETE** /api/v2/HrmsService/AppraisalWorkflows/{workflowId} | Delete an appraisal workflow |
| [**getAppraisalWorkflowByIdAsync**](AppraisalWorkflowsApi.md#getAppraisalWorkflowByIdAsync) | **GET** /api/v2/HrmsService/AppraisalWorkflows/{workflowId} | Get appraisal workflow by ID |
| [**getAppraisalWorkflowsAsync**](AppraisalWorkflowsApi.md#getAppraisalWorkflowsAsync) | **GET** /api/v2/HrmsService/AppraisalWorkflows | Get appraisal workflows |
| [**getAppraisalWorkflowsCountAsync**](AppraisalWorkflowsApi.md#getAppraisalWorkflowsCountAsync) | **GET** /api/v2/HrmsService/AppraisalWorkflows/Count | Count appraisal workflows |
| [**updateAppraisalWorkflowAsync**](AppraisalWorkflowsApi.md#updateAppraisalWorkflowAsync) | **PUT** /api/v2/HrmsService/AppraisalWorkflows/{workflowId} | Update an appraisal workflow |


<a id="createAppraisalWorkflowAsync"></a>
# **createAppraisalWorkflowAsync**
> EmptyEnvelope createAppraisalWorkflowAsync(tenantId, apiVersion, xApiVersion, appraisalWorkflowCreateDto)

Create an appraisal workflow

Creates a new appraisal workflow for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalWorkflowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val appraisalWorkflowCreateDto : AppraisalWorkflowCreateDto =  // AppraisalWorkflowCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAppraisalWorkflowAsync(tenantId, apiVersion, xApiVersion, appraisalWorkflowCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalWorkflowsApi#createAppraisalWorkflowAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalWorkflowsApi#createAppraisalWorkflowAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appraisalWorkflowCreateDto** | [**AppraisalWorkflowCreateDto**](AppraisalWorkflowCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAppraisalWorkflowAsync"></a>
# **deleteAppraisalWorkflowAsync**
> EmptyEnvelope deleteAppraisalWorkflowAsync(workflowId, tenantId, apiVersion, xApiVersion)

Delete an appraisal workflow

Deletes an appraisal workflow for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalWorkflowsApi()
val workflowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAppraisalWorkflowAsync(workflowId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalWorkflowsApi#deleteAppraisalWorkflowAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalWorkflowsApi#deleteAppraisalWorkflowAsync")
    e.printStackTrace()
}
```

### Parameters
| **workflowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAppraisalWorkflowByIdAsync"></a>
# **getAppraisalWorkflowByIdAsync**
> AppraisalWorkflowDtoEnvelope getAppraisalWorkflowByIdAsync(workflowId, tenantId, apiVersion, xApiVersion)

Get appraisal workflow by ID

Retrieves a specific appraisal workflow by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalWorkflowsApi()
val workflowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AppraisalWorkflowDtoEnvelope = apiInstance.getAppraisalWorkflowByIdAsync(workflowId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalWorkflowsApi#getAppraisalWorkflowByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalWorkflowsApi#getAppraisalWorkflowByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **workflowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AppraisalWorkflowDtoEnvelope**](AppraisalWorkflowDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAppraisalWorkflowsAsync"></a>
# **getAppraisalWorkflowsAsync**
> AppraisalWorkflowDtoListEnvelope getAppraisalWorkflowsAsync(tenantId, apiVersion, xApiVersion)

Get appraisal workflows

Retrieves appraisal workflows for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalWorkflowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AppraisalWorkflowDtoListEnvelope = apiInstance.getAppraisalWorkflowsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalWorkflowsApi#getAppraisalWorkflowsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalWorkflowsApi#getAppraisalWorkflowsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AppraisalWorkflowDtoListEnvelope**](AppraisalWorkflowDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAppraisalWorkflowsCountAsync"></a>
# **getAppraisalWorkflowsCountAsync**
> Int32Envelope getAppraisalWorkflowsCountAsync(tenantId, apiVersion, xApiVersion)

Count appraisal workflows

Counts appraisal workflows for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalWorkflowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAppraisalWorkflowsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalWorkflowsApi#getAppraisalWorkflowsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalWorkflowsApi#getAppraisalWorkflowsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateAppraisalWorkflowAsync"></a>
# **updateAppraisalWorkflowAsync**
> EmptyEnvelope updateAppraisalWorkflowAsync(workflowId, tenantId, apiVersion, xApiVersion, appraisalWorkflowUpdateDto)

Update an appraisal workflow

Updates an existing appraisal workflow for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalWorkflowsApi()
val workflowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val appraisalWorkflowUpdateDto : AppraisalWorkflowUpdateDto =  // AppraisalWorkflowUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAppraisalWorkflowAsync(workflowId, tenantId, apiVersion, xApiVersion, appraisalWorkflowUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalWorkflowsApi#updateAppraisalWorkflowAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalWorkflowsApi#updateAppraisalWorkflowAsync")
    e.printStackTrace()
}
```

### Parameters
| **workflowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appraisalWorkflowUpdateDto** | [**AppraisalWorkflowUpdateDto**](AppraisalWorkflowUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

