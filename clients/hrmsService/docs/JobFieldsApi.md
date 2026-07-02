# JobFieldsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createJobFieldAsync**](JobFieldsApi.md#createJobFieldAsync) | **POST** /api/v2/HrmsService/JobFields | Create a job field |
| [**deleteJobFieldAsync**](JobFieldsApi.md#deleteJobFieldAsync) | **DELETE** /api/v2/HrmsService/JobFields/{jobFieldId} | Delete a job field |
| [**getJobFieldByIdAsync**](JobFieldsApi.md#getJobFieldByIdAsync) | **GET** /api/v2/HrmsService/JobFields/{jobFieldId} | Get job field by ID |
| [**getJobFieldsAsync**](JobFieldsApi.md#getJobFieldsAsync) | **GET** /api/v2/HrmsService/JobFields | Get job fields |
| [**getJobFieldsCountAsync**](JobFieldsApi.md#getJobFieldsCountAsync) | **GET** /api/v2/HrmsService/JobFields/Count | Count job fields |
| [**patchJobFieldAsync**](JobFieldsApi.md#patchJobFieldAsync) | **PATCH** /api/v2/HrmsService/JobFields/{jobFieldId} | Patch a job field |
| [**updateJobFieldAsync**](JobFieldsApi.md#updateJobFieldAsync) | **PUT** /api/v2/HrmsService/JobFields/{jobFieldId} | Update a job field |


<a id="createJobFieldAsync"></a>
# **createJobFieldAsync**
> EmptyEnvelope createJobFieldAsync(tenantId, apiVersion, xApiVersion, jobFieldCreateDto)

Create a job field

Creates a new job field (role domain) for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobFieldsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobFieldCreateDto : JobFieldCreateDto =  // JobFieldCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJobFieldAsync(tenantId, apiVersion, xApiVersion, jobFieldCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobFieldsApi#createJobFieldAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobFieldsApi#createJobFieldAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobFieldCreateDto** | [**JobFieldCreateDto**](JobFieldCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteJobFieldAsync"></a>
# **deleteJobFieldAsync**
> EmptyEnvelope deleteJobFieldAsync(jobFieldId, tenantId, apiVersion, xApiVersion)

Delete a job field

Deletes a job field for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobFieldsApi()
val jobFieldId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJobFieldAsync(jobFieldId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobFieldsApi#deleteJobFieldAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobFieldsApi#deleteJobFieldAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobFieldId** | **java.util.UUID**|  | |
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

<a id="getJobFieldByIdAsync"></a>
# **getJobFieldByIdAsync**
> JobFieldDtoEnvelope getJobFieldByIdAsync(jobFieldId, tenantId, apiVersion, xApiVersion)

Get job field by ID

Retrieves a specific job field by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobFieldsApi()
val jobFieldId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobFieldDtoEnvelope = apiInstance.getJobFieldByIdAsync(jobFieldId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobFieldsApi#getJobFieldByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobFieldsApi#getJobFieldByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobFieldId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JobFieldDtoEnvelope**](JobFieldDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobFieldsAsync"></a>
# **getJobFieldsAsync**
> JobFieldDtoListEnvelope getJobFieldsAsync(tenantId, apiVersion, xApiVersion)

Get job fields

Retrieves job field (role domain) taxonomy entries for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobFieldsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobFieldDtoListEnvelope = apiInstance.getJobFieldsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobFieldsApi#getJobFieldsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobFieldsApi#getJobFieldsAsync")
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

[**JobFieldDtoListEnvelope**](JobFieldDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobFieldsCountAsync"></a>
# **getJobFieldsCountAsync**
> Int32Envelope getJobFieldsCountAsync(tenantId, apiVersion, xApiVersion)

Count job fields

Counts job field taxonomy entries for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobFieldsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getJobFieldsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobFieldsApi#getJobFieldsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobFieldsApi#getJobFieldsCountAsync")
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

<a id="patchJobFieldAsync"></a>
# **patchJobFieldAsync**
> EmptyEnvelope patchJobFieldAsync(jobFieldId, tenantId, apiVersion, xApiVersion, operation)

Patch a job field

Partially updates an existing job field for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobFieldsApi()
val jobFieldId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchJobFieldAsync(jobFieldId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobFieldsApi#patchJobFieldAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobFieldsApi#patchJobFieldAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobFieldId** | **java.util.UUID**|  | |
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

<a id="updateJobFieldAsync"></a>
# **updateJobFieldAsync**
> EmptyEnvelope updateJobFieldAsync(jobFieldId, tenantId, apiVersion, xApiVersion, jobFieldUpdateDto)

Update a job field

Updates an existing job field for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobFieldsApi()
val jobFieldId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobFieldUpdateDto : JobFieldUpdateDto =  // JobFieldUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJobFieldAsync(jobFieldId, tenantId, apiVersion, xApiVersion, jobFieldUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobFieldsApi#updateJobFieldAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobFieldsApi#updateJobFieldAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobFieldId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobFieldUpdateDto** | [**JobFieldUpdateDto**](JobFieldUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

