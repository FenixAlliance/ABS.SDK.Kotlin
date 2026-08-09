# LeaveApplicationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLeaveApplicationAsync**](LeaveApplicationsApi.md#createLeaveApplicationAsync) | **POST** /api/v2/HrmsService/LeaveApplications | Create a leave application |
| [**deleteLeaveApplicationAsync**](LeaveApplicationsApi.md#deleteLeaveApplicationAsync) | **DELETE** /api/v2/HrmsService/LeaveApplications/{leaveApplicationId} | Delete a leave application |
| [**getLeaveApplicationByIdAsync**](LeaveApplicationsApi.md#getLeaveApplicationByIdAsync) | **GET** /api/v2/HrmsService/LeaveApplications/{leaveApplicationId} | Get leave application by ID |
| [**getLeaveApplicationsAsync**](LeaveApplicationsApi.md#getLeaveApplicationsAsync) | **GET** /api/v2/HrmsService/LeaveApplications | Get leave applications |
| [**getLeaveApplicationsCountAsync**](LeaveApplicationsApi.md#getLeaveApplicationsCountAsync) | **GET** /api/v2/HrmsService/LeaveApplications/Count | Count leave applications |
| [**patchLeaveApplicationAsync**](LeaveApplicationsApi.md#patchLeaveApplicationAsync) | **PATCH** /api/v2/HrmsService/LeaveApplications/{leaveApplicationId} | Patch a leave application |
| [**updateLeaveApplicationAsync**](LeaveApplicationsApi.md#updateLeaveApplicationAsync) | **PUT** /api/v2/HrmsService/LeaveApplications/{leaveApplicationId} | Update a leave application |


<a id="createLeaveApplicationAsync"></a>
# **createLeaveApplicationAsync**
> EmptyEnvelope createLeaveApplicationAsync(tenantId, apiVersion, xApiVersion, leaveApplicationCreateDto)

Create a leave application

Creates a new leave application for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val leaveApplicationCreateDto : LeaveApplicationCreateDto =  // LeaveApplicationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createLeaveApplicationAsync(tenantId, apiVersion, xApiVersion, leaveApplicationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveApplicationsApi#createLeaveApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveApplicationsApi#createLeaveApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leaveApplicationCreateDto** | [**LeaveApplicationCreateDto**](LeaveApplicationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLeaveApplicationAsync"></a>
# **deleteLeaveApplicationAsync**
> EmptyEnvelope deleteLeaveApplicationAsync(leaveApplicationId, tenantId, apiVersion, xApiVersion)

Delete a leave application

Deletes a leave application for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveApplicationsApi()
val leaveApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLeaveApplicationAsync(leaveApplicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveApplicationsApi#deleteLeaveApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveApplicationsApi#deleteLeaveApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **leaveApplicationId** | **java.util.UUID**|  | |
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

<a id="getLeaveApplicationByIdAsync"></a>
# **getLeaveApplicationByIdAsync**
> LeaveApplicationDtoEnvelope getLeaveApplicationByIdAsync(leaveApplicationId, tenantId, apiVersion, xApiVersion)

Get leave application by ID

Retrieves a specific leave application by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveApplicationsApi()
val leaveApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LeaveApplicationDtoEnvelope = apiInstance.getLeaveApplicationByIdAsync(leaveApplicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveApplicationsApi#getLeaveApplicationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveApplicationsApi#getLeaveApplicationByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **leaveApplicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LeaveApplicationDtoEnvelope**](LeaveApplicationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLeaveApplicationsAsync"></a>
# **getLeaveApplicationsAsync**
> LeaveApplicationDtoListEnvelope getLeaveApplicationsAsync(tenantId, apiVersion, xApiVersion, leaveApplicationDtoCollectionQueryParameters)

Get leave applications

Retrieves leave applications for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val leaveApplicationDtoCollectionQueryParameters : LeaveApplicationDtoCollectionQueryParameters =  // LeaveApplicationDtoCollectionQueryParameters | 
try {
    val result : LeaveApplicationDtoListEnvelope = apiInstance.getLeaveApplicationsAsync(tenantId, apiVersion, xApiVersion, leaveApplicationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveApplicationsApi#getLeaveApplicationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveApplicationsApi#getLeaveApplicationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leaveApplicationDtoCollectionQueryParameters** | [**LeaveApplicationDtoCollectionQueryParameters**](LeaveApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**LeaveApplicationDtoListEnvelope**](LeaveApplicationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getLeaveApplicationsCountAsync"></a>
# **getLeaveApplicationsCountAsync**
> Int32Envelope getLeaveApplicationsCountAsync(tenantId, apiVersion, xApiVersion, leaveApplicationDtoCollectionQueryParameters)

Count leave applications

Counts leave applications for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val leaveApplicationDtoCollectionQueryParameters : LeaveApplicationDtoCollectionQueryParameters =  // LeaveApplicationDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getLeaveApplicationsCountAsync(tenantId, apiVersion, xApiVersion, leaveApplicationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveApplicationsApi#getLeaveApplicationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveApplicationsApi#getLeaveApplicationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leaveApplicationDtoCollectionQueryParameters** | [**LeaveApplicationDtoCollectionQueryParameters**](LeaveApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchLeaveApplicationAsync"></a>
# **patchLeaveApplicationAsync**
> EmptyEnvelope patchLeaveApplicationAsync(leaveApplicationId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a leave application

Partially updates an existing leave application for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveApplicationsApi()
val leaveApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchLeaveApplicationAsync(leaveApplicationId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveApplicationsApi#patchLeaveApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveApplicationsApi#patchLeaveApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **leaveApplicationId** | **java.util.UUID**|  | |
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

<a id="updateLeaveApplicationAsync"></a>
# **updateLeaveApplicationAsync**
> EmptyEnvelope updateLeaveApplicationAsync(leaveApplicationId, tenantId, apiVersion, xApiVersion, leaveApplicationUpdateDto)

Update a leave application

Updates an existing leave application for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveApplicationsApi()
val leaveApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val leaveApplicationUpdateDto : LeaveApplicationUpdateDto =  // LeaveApplicationUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateLeaveApplicationAsync(leaveApplicationId, tenantId, apiVersion, xApiVersion, leaveApplicationUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveApplicationsApi#updateLeaveApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveApplicationsApi#updateLeaveApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **leaveApplicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leaveApplicationUpdateDto** | [**LeaveApplicationUpdateDto**](LeaveApplicationUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

