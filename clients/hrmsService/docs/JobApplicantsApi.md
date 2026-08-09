# JobApplicantsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createJobApplicantAsync**](JobApplicantsApi.md#createJobApplicantAsync) | **POST** /api/v2/HrmsService/JobApplicants | Create a job applicant |
| [**deleteJobApplicantAsync**](JobApplicantsApi.md#deleteJobApplicantAsync) | **DELETE** /api/v2/HrmsService/JobApplicants/{jobApplicantId} | Delete a job applicant |
| [**getJobApplicantByIdAsync**](JobApplicantsApi.md#getJobApplicantByIdAsync) | **GET** /api/v2/HrmsService/JobApplicants/{jobApplicantId} | Get job applicant by ID |
| [**getJobApplicantsAsync**](JobApplicantsApi.md#getJobApplicantsAsync) | **GET** /api/v2/HrmsService/JobApplicants | Get job applicants |
| [**getJobApplicantsCountAsync**](JobApplicantsApi.md#getJobApplicantsCountAsync) | **GET** /api/v2/HrmsService/JobApplicants/Count | Count job applicants |
| [**patchJobApplicantAsync**](JobApplicantsApi.md#patchJobApplicantAsync) | **PATCH** /api/v2/HrmsService/JobApplicants/{jobApplicantId} | Patch a job applicant |
| [**updateJobApplicantAsync**](JobApplicantsApi.md#updateJobApplicantAsync) | **PUT** /api/v2/HrmsService/JobApplicants/{jobApplicantId} | Update a job applicant |


<a id="createJobApplicantAsync"></a>
# **createJobApplicantAsync**
> EmptyEnvelope createJobApplicantAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileCreateDto)

Create a job applicant

Creates a new job applicant (candidate) profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobApplicantProfileCreateDto : JobApplicantProfileCreateDto =  // JobApplicantProfileCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJobApplicantAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicantsApi#createJobApplicantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicantsApi#createJobApplicantAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobApplicantProfileCreateDto** | [**JobApplicantProfileCreateDto**](JobApplicantProfileCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteJobApplicantAsync"></a>
# **deleteJobApplicantAsync**
> EmptyEnvelope deleteJobApplicantAsync(jobApplicantId, tenantId, apiVersion, xApiVersion)

Delete a job applicant

Deletes a job applicant (candidate) profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicantsApi()
val jobApplicantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJobApplicantAsync(jobApplicantId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicantsApi#deleteJobApplicantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicantsApi#deleteJobApplicantAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicantId** | **java.util.UUID**|  | |
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

<a id="getJobApplicantByIdAsync"></a>
# **getJobApplicantByIdAsync**
> JobApplicantProfileDtoEnvelope getJobApplicantByIdAsync(jobApplicantId, tenantId, apiVersion, xApiVersion)

Get job applicant by ID

Retrieves a specific job applicant (candidate) profile by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicantsApi()
val jobApplicantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobApplicantProfileDtoEnvelope = apiInstance.getJobApplicantByIdAsync(jobApplicantId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicantsApi#getJobApplicantByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicantsApi#getJobApplicantByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicantId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JobApplicantProfileDtoEnvelope**](JobApplicantProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobApplicantsAsync"></a>
# **getJobApplicantsAsync**
> JobApplicantProfileDtoListEnvelope getJobApplicantsAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileDtoCollectionQueryParameters)

Get job applicants

Retrieves job applicant (candidate) profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobApplicantProfileDtoCollectionQueryParameters : JobApplicantProfileDtoCollectionQueryParameters =  // JobApplicantProfileDtoCollectionQueryParameters | 
try {
    val result : JobApplicantProfileDtoListEnvelope = apiInstance.getJobApplicantsAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicantsApi#getJobApplicantsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicantsApi#getJobApplicantsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobApplicantProfileDtoCollectionQueryParameters** | [**JobApplicantProfileDtoCollectionQueryParameters**](JobApplicantProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**JobApplicantProfileDtoListEnvelope**](JobApplicantProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getJobApplicantsCountAsync"></a>
# **getJobApplicantsCountAsync**
> Int32Envelope getJobApplicantsCountAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileDtoCollectionQueryParameters)

Count job applicants

Counts job applicant profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobApplicantProfileDtoCollectionQueryParameters : JobApplicantProfileDtoCollectionQueryParameters =  // JobApplicantProfileDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getJobApplicantsCountAsync(tenantId, apiVersion, xApiVersion, jobApplicantProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicantsApi#getJobApplicantsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicantsApi#getJobApplicantsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobApplicantProfileDtoCollectionQueryParameters** | [**JobApplicantProfileDtoCollectionQueryParameters**](JobApplicantProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchJobApplicantAsync"></a>
# **patchJobApplicantAsync**
> EmptyEnvelope patchJobApplicantAsync(jobApplicantId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a job applicant

Partially updates an existing job applicant (candidate) profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicantsApi()
val jobApplicantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchJobApplicantAsync(jobApplicantId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicantsApi#patchJobApplicantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicantsApi#patchJobApplicantAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicantId** | **java.util.UUID**|  | |
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

<a id="updateJobApplicantAsync"></a>
# **updateJobApplicantAsync**
> EmptyEnvelope updateJobApplicantAsync(jobApplicantId, tenantId, apiVersion, xApiVersion, jobApplicantProfileUpdateDto)

Update a job applicant

Updates an existing job applicant (candidate) profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobApplicantsApi()
val jobApplicantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobApplicantProfileUpdateDto : JobApplicantProfileUpdateDto =  // JobApplicantProfileUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJobApplicantAsync(jobApplicantId, tenantId, apiVersion, xApiVersion, jobApplicantProfileUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobApplicantsApi#updateJobApplicantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobApplicantsApi#updateJobApplicantAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobApplicantId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobApplicantProfileUpdateDto** | [**JobApplicantProfileUpdateDto**](JobApplicantProfileUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

