# JobApplicationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeJobApplicationStatusAsync**](JobApplicationsApi.md#changeJobApplicationStatusAsync) | **POST** /api/v2/HrmsService/JobApplications/{jobApplicationId}/Status | Change job application status |
| [**createJobApplicationAsync**](JobApplicationsApi.md#createJobApplicationAsync) | **POST** /api/v2/HrmsService/JobApplications | Create a job application |
| [**deleteJobApplicationAsync**](JobApplicationsApi.md#deleteJobApplicationAsync) | **DELETE** /api/v2/HrmsService/JobApplications/{jobApplicationId} | Delete a job application |
| [**getJobApplicationByIdAsync**](JobApplicationsApi.md#getJobApplicationByIdAsync) | **GET** /api/v2/HrmsService/JobApplications/{jobApplicationId} | Get job application by ID |
| [**getJobApplicationsAsync**](JobApplicationsApi.md#getJobApplicationsAsync) | **GET** /api/v2/HrmsService/JobApplications | Get job applications |
| [**getJobApplicationsCountAsync**](JobApplicationsApi.md#getJobApplicationsCountAsync) | **GET** /api/v2/HrmsService/JobApplications/Count | Count job applications |
| [**patchJobApplicationAsync**](JobApplicationsApi.md#patchJobApplicationAsync) | **PATCH** /api/v2/HrmsService/JobApplications/{jobApplicationId} | Patch a job application |
| [**updateJobApplicationAsync**](JobApplicationsApi.md#updateJobApplicationAsync) | **PUT** /api/v2/HrmsService/JobApplications/{jobApplicationId} | Update a job application |


<a id="changeJobApplicationStatusAsync"></a>
# **changeJobApplicationStatusAsync**
> EmptyEnvelope changeJobApplicationStatusAsync(jobApplicationId, tenantId, status, apiVersion, xApiVersion)

Change job application status

Transitions the application to a new funnel status (e.g. UnderReview, Interviewing, Offered, Hired, Rejected). Raises JobApplicationStatusChanged; terminal statuses are immutable.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicationsApi()
val jobApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val status : kotlin.String = status_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.changeJobApplicationStatusAsync(jobApplicationId, tenantId, status, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicationsApi#changeJobApplicationStatusAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicationsApi#changeJobApplicationStatusAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **status** | **kotlin.String**|  | [enum: Submitted, UnderReview, Interviewing, Offered, Hired, Rejected, Withdrawn] |
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

<a id="createJobApplicationAsync"></a>
# **createJobApplicationAsync**
> EmptyEnvelope createJobApplicationAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationCreateDto)

Create a job application

Records a candidate&#39;s application against one of the tenant&#39;s job offers. The targeted job offer must belong to the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobOfferApplicationCreateDto : JobOfferApplicationCreateDto =  // JobOfferApplicationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJobApplicationAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicationsApi#createJobApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicationsApi#createJobApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobOfferApplicationCreateDto** | [**JobOfferApplicationCreateDto**](JobOfferApplicationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteJobApplicationAsync"></a>
# **deleteJobApplicationAsync**
> EmptyEnvelope deleteJobApplicationAsync(jobApplicationId, tenantId, apiVersion, xApiVersion)

Delete a job application

Removes an application submitted against one of the tenant&#39;s job offers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicationsApi()
val jobApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJobApplicationAsync(jobApplicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicationsApi#deleteJobApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicationsApi#deleteJobApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicationId** | **java.util.UUID**|  | |
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

<a id="getJobApplicationByIdAsync"></a>
# **getJobApplicationByIdAsync**
> JobOfferApplicationDtoEnvelope getJobApplicationByIdAsync(jobApplicationId, tenantId, apiVersion, xApiVersion)

Get job application by ID

Retrieves a specific application submitted against one of the tenant&#39;s job offers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicationsApi()
val jobApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobOfferApplicationDtoEnvelope = apiInstance.getJobApplicationByIdAsync(jobApplicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicationsApi#getJobApplicationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicationsApi#getJobApplicationByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JobOfferApplicationDtoEnvelope**](JobOfferApplicationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobApplicationsAsync"></a>
# **getJobApplicationsAsync**
> JobOfferApplicationDtoListEnvelope getJobApplicationsAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationDtoCollectionQueryParameters)

Get job applications

Retrieves applications submitted against the tenant&#39;s job offers. Filter with &#x60;$filter&#x3D;JobOfferId eq &#39;...&#39;&#x60; or &#x60;JobApplicantProfileId eq &#39;...&#39;&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobOfferApplicationDtoCollectionQueryParameters : JobOfferApplicationDtoCollectionQueryParameters =  // JobOfferApplicationDtoCollectionQueryParameters | 
try {
    val result : JobOfferApplicationDtoListEnvelope = apiInstance.getJobApplicationsAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicationsApi#getJobApplicationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicationsApi#getJobApplicationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobOfferApplicationDtoCollectionQueryParameters** | [**JobOfferApplicationDtoCollectionQueryParameters**](JobOfferApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**JobOfferApplicationDtoListEnvelope**](JobOfferApplicationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getJobApplicationsCountAsync"></a>
# **getJobApplicationsCountAsync**
> Int32Envelope getJobApplicationsCountAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationDtoCollectionQueryParameters)

Count job applications

Counts applications submitted against the tenant&#39;s job offers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobOfferApplicationDtoCollectionQueryParameters : JobOfferApplicationDtoCollectionQueryParameters =  // JobOfferApplicationDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getJobApplicationsCountAsync(tenantId, apiVersion, xApiVersion, jobOfferApplicationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicationsApi#getJobApplicationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicationsApi#getJobApplicationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobOfferApplicationDtoCollectionQueryParameters** | [**JobOfferApplicationDtoCollectionQueryParameters**](JobOfferApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchJobApplicationAsync"></a>
# **patchJobApplicationAsync**
> EmptyEnvelope patchJobApplicationAsync(jobApplicationId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a job application

Partially updates an existing application submitted against one of the tenant&#39;s job offers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicationsApi()
val jobApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchJobApplicationAsync(jobApplicationId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicationsApi#patchJobApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicationsApi#patchJobApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateJobApplicationAsync"></a>
# **updateJobApplicationAsync**
> EmptyEnvelope updateJobApplicationAsync(jobApplicationId, tenantId, apiVersion, xApiVersion, jobOfferApplicationUpdateDto)

Update a job application

Updates an existing application submitted against one of the tenant&#39;s job offers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicationsApi()
val jobApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobOfferApplicationUpdateDto : JobOfferApplicationUpdateDto =  // JobOfferApplicationUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJobApplicationAsync(jobApplicationId, tenantId, apiVersion, xApiVersion, jobOfferApplicationUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicationsApi#updateJobApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicationsApi#updateJobApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobOfferApplicationUpdateDto** | [**JobOfferApplicationUpdateDto**](JobOfferApplicationUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

