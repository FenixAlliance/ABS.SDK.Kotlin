# JobTitlesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createJobTitleAsync**](JobTitlesApi.md#createJobTitleAsync) | **POST** /api/v2/HrmsService/JobTitles | Create a job title |
| [**deleteJobTitleAsync**](JobTitlesApi.md#deleteJobTitleAsync) | **DELETE** /api/v2/HrmsService/JobTitles/{jobTitleId} | Delete a job title |
| [**getJobTitleByIdAsync**](JobTitlesApi.md#getJobTitleByIdAsync) | **GET** /api/v2/HrmsService/JobTitles/{jobTitleId} | Get job title by ID |
| [**getJobTitlesAsync**](JobTitlesApi.md#getJobTitlesAsync) | **GET** /api/v2/HrmsService/JobTitles | Get job titles |
| [**getJobTitlesCountAsync**](JobTitlesApi.md#getJobTitlesCountAsync) | **GET** /api/v2/HrmsService/JobTitles/Count | Count job titles |
| [**patchJobTitleAsync**](JobTitlesApi.md#patchJobTitleAsync) | **PATCH** /api/v2/HrmsService/JobTitles/{jobTitleId} | Patch a job title |
| [**updateJobTitleAsync**](JobTitlesApi.md#updateJobTitleAsync) | **PUT** /api/v2/HrmsService/JobTitles/{jobTitleId} | Update a job title |


<a id="createJobTitleAsync"></a>
# **createJobTitleAsync**
> EmptyEnvelope createJobTitleAsync(tenantId, apiVersion, xApiVersion, jobTitleCreateDto)

Create a job title

Creates a new job title for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobTitlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobTitleCreateDto : JobTitleCreateDto =  // JobTitleCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJobTitleAsync(tenantId, apiVersion, xApiVersion, jobTitleCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobTitlesApi#createJobTitleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobTitlesApi#createJobTitleAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobTitleCreateDto** | [**JobTitleCreateDto**](JobTitleCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteJobTitleAsync"></a>
# **deleteJobTitleAsync**
> EmptyEnvelope deleteJobTitleAsync(jobTitleId, tenantId, apiVersion, xApiVersion)

Delete a job title

Deletes a job title for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobTitlesApi()
val jobTitleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJobTitleAsync(jobTitleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobTitlesApi#deleteJobTitleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobTitlesApi#deleteJobTitleAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobTitleId** | **java.util.UUID**|  | |
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

<a id="getJobTitleByIdAsync"></a>
# **getJobTitleByIdAsync**
> JobTitleDtoEnvelope getJobTitleByIdAsync(jobTitleId, tenantId, apiVersion, xApiVersion)

Get job title by ID

Retrieves a specific job title by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobTitlesApi()
val jobTitleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobTitleDtoEnvelope = apiInstance.getJobTitleByIdAsync(jobTitleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobTitlesApi#getJobTitleByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobTitlesApi#getJobTitleByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobTitleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JobTitleDtoEnvelope**](JobTitleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobTitlesAsync"></a>
# **getJobTitlesAsync**
> JobTitleDtoListEnvelope getJobTitlesAsync(tenantId, apiVersion, xApiVersion)

Get job titles

Retrieves job titles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobTitlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobTitleDtoListEnvelope = apiInstance.getJobTitlesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobTitlesApi#getJobTitlesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobTitlesApi#getJobTitlesAsync")
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

[**JobTitleDtoListEnvelope**](JobTitleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobTitlesCountAsync"></a>
# **getJobTitlesCountAsync**
> Int32Envelope getJobTitlesCountAsync(tenantId, apiVersion, xApiVersion)

Count job titles

Counts job titles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobTitlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getJobTitlesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobTitlesApi#getJobTitlesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobTitlesApi#getJobTitlesCountAsync")
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

<a id="patchJobTitleAsync"></a>
# **patchJobTitleAsync**
> EmptyEnvelope patchJobTitleAsync(jobTitleId, tenantId, apiVersion, xApiVersion, operation)

Patch a job title

Partially updates an existing job title for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobTitlesApi()
val jobTitleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchJobTitleAsync(jobTitleId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobTitlesApi#patchJobTitleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobTitlesApi#patchJobTitleAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobTitleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateJobTitleAsync"></a>
# **updateJobTitleAsync**
> EmptyEnvelope updateJobTitleAsync(jobTitleId, tenantId, apiVersion, xApiVersion, jobTitleUpdateDto)

Update a job title

Updates an existing job title for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobTitlesApi()
val jobTitleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobTitleUpdateDto : JobTitleUpdateDto =  // JobTitleUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJobTitleAsync(jobTitleId, tenantId, apiVersion, xApiVersion, jobTitleUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobTitlesApi#updateJobTitleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobTitlesApi#updateJobTitleAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobTitleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobTitleUpdateDto** | [**JobTitleUpdateDto**](JobTitleUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

