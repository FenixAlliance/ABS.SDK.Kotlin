# AppraisalStagesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAppraisalStageAsync**](AppraisalStagesApi.md#createAppraisalStageAsync) | **POST** /api/v2/HrmsService/AppraisalStages | Create an appraisal stage |
| [**deleteAppraisalStageAsync**](AppraisalStagesApi.md#deleteAppraisalStageAsync) | **DELETE** /api/v2/HrmsService/AppraisalStages/{stageId} | Delete an appraisal stage |
| [**getAppraisalStageByIdAsync**](AppraisalStagesApi.md#getAppraisalStageByIdAsync) | **GET** /api/v2/HrmsService/AppraisalStages/{stageId} | Get appraisal stage by ID |
| [**getAppraisalStagesAsync**](AppraisalStagesApi.md#getAppraisalStagesAsync) | **GET** /api/v2/HrmsService/AppraisalStages | Get appraisal stages |
| [**getAppraisalStagesCountAsync**](AppraisalStagesApi.md#getAppraisalStagesCountAsync) | **GET** /api/v2/HrmsService/AppraisalStages/Count | Count appraisal stages |
| [**updateAppraisalStageAsync**](AppraisalStagesApi.md#updateAppraisalStageAsync) | **PUT** /api/v2/HrmsService/AppraisalStages/{stageId} | Update an appraisal stage |


<a id="createAppraisalStageAsync"></a>
# **createAppraisalStageAsync**
> EmptyEnvelope createAppraisalStageAsync(tenantId, apiVersion, xApiVersion, appraisalStageCreateDto)

Create an appraisal stage

Creates a new appraisal stage for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalStagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val appraisalStageCreateDto : AppraisalStageCreateDto =  // AppraisalStageCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAppraisalStageAsync(tenantId, apiVersion, xApiVersion, appraisalStageCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalStagesApi#createAppraisalStageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalStagesApi#createAppraisalStageAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appraisalStageCreateDto** | [**AppraisalStageCreateDto**](AppraisalStageCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAppraisalStageAsync"></a>
# **deleteAppraisalStageAsync**
> EmptyEnvelope deleteAppraisalStageAsync(stageId, tenantId, apiVersion, xApiVersion)

Delete an appraisal stage

Deletes an appraisal stage for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalStagesApi()
val stageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAppraisalStageAsync(stageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalStagesApi#deleteAppraisalStageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalStagesApi#deleteAppraisalStageAsync")
    e.printStackTrace()
}
```

### Parameters
| **stageId** | **java.util.UUID**|  | |
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

<a id="getAppraisalStageByIdAsync"></a>
# **getAppraisalStageByIdAsync**
> AppraisalStageDtoEnvelope getAppraisalStageByIdAsync(stageId, tenantId, apiVersion, xApiVersion)

Get appraisal stage by ID

Retrieves a specific appraisal stage by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalStagesApi()
val stageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AppraisalStageDtoEnvelope = apiInstance.getAppraisalStageByIdAsync(stageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalStagesApi#getAppraisalStageByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalStagesApi#getAppraisalStageByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **stageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AppraisalStageDtoEnvelope**](AppraisalStageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAppraisalStagesAsync"></a>
# **getAppraisalStagesAsync**
> AppraisalStageDtoListEnvelope getAppraisalStagesAsync(tenantId, apiVersion, xApiVersion)

Get appraisal stages

Retrieves appraisal stages for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalStagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AppraisalStageDtoListEnvelope = apiInstance.getAppraisalStagesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalStagesApi#getAppraisalStagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalStagesApi#getAppraisalStagesAsync")
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

[**AppraisalStageDtoListEnvelope**](AppraisalStageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAppraisalStagesCountAsync"></a>
# **getAppraisalStagesCountAsync**
> Int32Envelope getAppraisalStagesCountAsync(tenantId, apiVersion, xApiVersion)

Count appraisal stages

Counts appraisal stages for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalStagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAppraisalStagesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalStagesApi#getAppraisalStagesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalStagesApi#getAppraisalStagesCountAsync")
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

<a id="updateAppraisalStageAsync"></a>
# **updateAppraisalStageAsync**
> EmptyEnvelope updateAppraisalStageAsync(stageId, tenantId, apiVersion, xApiVersion, appraisalStageUpdateDto)

Update an appraisal stage

Updates an existing appraisal stage for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AppraisalStagesApi()
val stageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val appraisalStageUpdateDto : AppraisalStageUpdateDto =  // AppraisalStageUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAppraisalStageAsync(stageId, tenantId, apiVersion, xApiVersion, appraisalStageUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AppraisalStagesApi#updateAppraisalStageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AppraisalStagesApi#updateAppraisalStageAsync")
    e.printStackTrace()
}
```

### Parameters
| **stageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **appraisalStageUpdateDto** | [**AppraisalStageUpdateDto**](AppraisalStageUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

