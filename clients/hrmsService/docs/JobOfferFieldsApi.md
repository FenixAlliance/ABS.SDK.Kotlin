# JobOfferFieldsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createJobOfferFieldAsync**](JobOfferFieldsApi.md#createJobOfferFieldAsync) | **POST** /api/v2/HrmsService/JobOfferFields | Create a job offer field |
| [**deleteJobOfferFieldAsync**](JobOfferFieldsApi.md#deleteJobOfferFieldAsync) | **DELETE** /api/v2/HrmsService/JobOfferFields/{jobOfferFieldId} | Delete a job offer field |
| [**getJobOfferFieldByIdAsync**](JobOfferFieldsApi.md#getJobOfferFieldByIdAsync) | **GET** /api/v2/HrmsService/JobOfferFields/{jobOfferFieldId} | Get job offer field by ID |
| [**getJobOfferFieldsAsync**](JobOfferFieldsApi.md#getJobOfferFieldsAsync) | **GET** /api/v2/HrmsService/JobOfferFields | Get job offer fields |
| [**getJobOfferFieldsCountAsync**](JobOfferFieldsApi.md#getJobOfferFieldsCountAsync) | **GET** /api/v2/HrmsService/JobOfferFields/Count | Count job offer fields |
| [**patchJobOfferFieldAsync**](JobOfferFieldsApi.md#patchJobOfferFieldAsync) | **PATCH** /api/v2/HrmsService/JobOfferFields/{jobOfferFieldId} | Patch a job offer field |
| [**updateJobOfferFieldAsync**](JobOfferFieldsApi.md#updateJobOfferFieldAsync) | **PUT** /api/v2/HrmsService/JobOfferFields/{jobOfferFieldId} | Update a job offer field |


<a id="createJobOfferFieldAsync"></a>
# **createJobOfferFieldAsync**
> EmptyEnvelope createJobOfferFieldAsync(tenantId, apiVersion, xApiVersion, jobOfferFieldRecordCreateDto)

Create a job offer field

Links a job field to a job offer for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOfferFieldsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobOfferFieldRecordCreateDto : JobOfferFieldRecordCreateDto =  // JobOfferFieldRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJobOfferFieldAsync(tenantId, apiVersion, xApiVersion, jobOfferFieldRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOfferFieldsApi#createJobOfferFieldAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOfferFieldsApi#createJobOfferFieldAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobOfferFieldRecordCreateDto** | [**JobOfferFieldRecordCreateDto**](JobOfferFieldRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteJobOfferFieldAsync"></a>
# **deleteJobOfferFieldAsync**
> EmptyEnvelope deleteJobOfferFieldAsync(jobOfferFieldId, tenantId, apiVersion, xApiVersion)

Delete a job offer field

Removes a job-offer field link record for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOfferFieldsApi()
val jobOfferFieldId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJobOfferFieldAsync(jobOfferFieldId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOfferFieldsApi#deleteJobOfferFieldAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOfferFieldsApi#deleteJobOfferFieldAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobOfferFieldId** | **java.util.UUID**|  | |
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

<a id="getJobOfferFieldByIdAsync"></a>
# **getJobOfferFieldByIdAsync**
> JobOfferFieldRecordDtoEnvelope getJobOfferFieldByIdAsync(jobOfferFieldId, tenantId, apiVersion, xApiVersion)

Get job offer field by ID

Retrieves a specific job-offer field link record by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOfferFieldsApi()
val jobOfferFieldId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobOfferFieldRecordDtoEnvelope = apiInstance.getJobOfferFieldByIdAsync(jobOfferFieldId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOfferFieldsApi#getJobOfferFieldByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOfferFieldsApi#getJobOfferFieldByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobOfferFieldId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JobOfferFieldRecordDtoEnvelope**](JobOfferFieldRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobOfferFieldsAsync"></a>
# **getJobOfferFieldsAsync**
> JobOfferFieldRecordDtoListEnvelope getJobOfferFieldsAsync(tenantId, apiVersion, xApiVersion)

Get job offer fields

Retrieves job-offer field link records for the tenant. Filter with &#x60;$filter&#x3D;JobOfferId eq &#39;...&#39;&#x60; or &#x60;JobFieldId eq &#39;...&#39;&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOfferFieldsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobOfferFieldRecordDtoListEnvelope = apiInstance.getJobOfferFieldsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOfferFieldsApi#getJobOfferFieldsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOfferFieldsApi#getJobOfferFieldsAsync")
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

[**JobOfferFieldRecordDtoListEnvelope**](JobOfferFieldRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobOfferFieldsCountAsync"></a>
# **getJobOfferFieldsCountAsync**
> Int32Envelope getJobOfferFieldsCountAsync(tenantId, apiVersion, xApiVersion)

Count job offer fields

Counts job-offer field link records for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOfferFieldsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getJobOfferFieldsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOfferFieldsApi#getJobOfferFieldsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOfferFieldsApi#getJobOfferFieldsCountAsync")
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

<a id="patchJobOfferFieldAsync"></a>
# **patchJobOfferFieldAsync**
> EmptyEnvelope patchJobOfferFieldAsync(jobOfferFieldId, tenantId, apiVersion, xApiVersion, operation)

Patch a job offer field

Partially updates an existing job-offer field link record for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOfferFieldsApi()
val jobOfferFieldId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchJobOfferFieldAsync(jobOfferFieldId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOfferFieldsApi#patchJobOfferFieldAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOfferFieldsApi#patchJobOfferFieldAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobOfferFieldId** | **java.util.UUID**|  | |
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

<a id="updateJobOfferFieldAsync"></a>
# **updateJobOfferFieldAsync**
> EmptyEnvelope updateJobOfferFieldAsync(jobOfferFieldId, tenantId, apiVersion, xApiVersion, jobOfferFieldRecordUpdateDto)

Update a job offer field

Updates an existing job-offer field link record for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOfferFieldsApi()
val jobOfferFieldId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobOfferFieldRecordUpdateDto : JobOfferFieldRecordUpdateDto =  // JobOfferFieldRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJobOfferFieldAsync(jobOfferFieldId, tenantId, apiVersion, xApiVersion, jobOfferFieldRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOfferFieldsApi#updateJobOfferFieldAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOfferFieldsApi#updateJobOfferFieldAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobOfferFieldId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobOfferFieldRecordUpdateDto** | [**JobOfferFieldRecordUpdateDto**](JobOfferFieldRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

