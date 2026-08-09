# LeaveTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLeaveTypeAsync**](LeaveTypesApi.md#createLeaveTypeAsync) | **POST** /api/v2/HrmsService/LeaveTypes | Create a leave type |
| [**deleteLeaveTypeAsync**](LeaveTypesApi.md#deleteLeaveTypeAsync) | **DELETE** /api/v2/HrmsService/LeaveTypes/{leaveTypeId} | Delete a leave type |
| [**getLeaveTypeByIdAsync**](LeaveTypesApi.md#getLeaveTypeByIdAsync) | **GET** /api/v2/HrmsService/LeaveTypes/{leaveTypeId} | Get leave type by ID |
| [**getLeaveTypesAsync**](LeaveTypesApi.md#getLeaveTypesAsync) | **GET** /api/v2/HrmsService/LeaveTypes | Get leave types |
| [**getLeaveTypesCountAsync**](LeaveTypesApi.md#getLeaveTypesCountAsync) | **GET** /api/v2/HrmsService/LeaveTypes/Count | Count leave types |
| [**updateLeaveTypeAsync**](LeaveTypesApi.md#updateLeaveTypeAsync) | **PUT** /api/v2/HrmsService/LeaveTypes/{leaveTypeId} | Update a leave type |


<a id="createLeaveTypeAsync"></a>
# **createLeaveTypeAsync**
> EmptyEnvelope createLeaveTypeAsync(tenantId, apiVersion, xApiVersion, leaveTypeCreateDto)

Create a leave type

Creates a new leave type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val leaveTypeCreateDto : LeaveTypeCreateDto =  // LeaveTypeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createLeaveTypeAsync(tenantId, apiVersion, xApiVersion, leaveTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveTypesApi#createLeaveTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveTypesApi#createLeaveTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leaveTypeCreateDto** | [**LeaveTypeCreateDto**](LeaveTypeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLeaveTypeAsync"></a>
# **deleteLeaveTypeAsync**
> EmptyEnvelope deleteLeaveTypeAsync(leaveTypeId, tenantId, apiVersion, xApiVersion)

Delete a leave type

Deletes a leave type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveTypesApi()
val leaveTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLeaveTypeAsync(leaveTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveTypesApi#deleteLeaveTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveTypesApi#deleteLeaveTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **leaveTypeId** | **java.util.UUID**|  | |
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

<a id="getLeaveTypeByIdAsync"></a>
# **getLeaveTypeByIdAsync**
> LeaveTypeDtoEnvelope getLeaveTypeByIdAsync(leaveTypeId, tenantId, apiVersion, xApiVersion)

Get leave type by ID

Retrieves a specific leave type by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveTypesApi()
val leaveTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LeaveTypeDtoEnvelope = apiInstance.getLeaveTypeByIdAsync(leaveTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveTypesApi#getLeaveTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveTypesApi#getLeaveTypeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **leaveTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LeaveTypeDtoEnvelope**](LeaveTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLeaveTypesAsync"></a>
# **getLeaveTypesAsync**
> LeaveTypeDtoListEnvelope getLeaveTypesAsync(tenantId, apiVersion, xApiVersion, leaveTypeDtoCollectionQueryParameters)

Get leave types

Retrieves leave types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val leaveTypeDtoCollectionQueryParameters : LeaveTypeDtoCollectionQueryParameters =  // LeaveTypeDtoCollectionQueryParameters | 
try {
    val result : LeaveTypeDtoListEnvelope = apiInstance.getLeaveTypesAsync(tenantId, apiVersion, xApiVersion, leaveTypeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveTypesApi#getLeaveTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveTypesApi#getLeaveTypesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leaveTypeDtoCollectionQueryParameters** | [**LeaveTypeDtoCollectionQueryParameters**](LeaveTypeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**LeaveTypeDtoListEnvelope**](LeaveTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getLeaveTypesCountAsync"></a>
# **getLeaveTypesCountAsync**
> Int32Envelope getLeaveTypesCountAsync(tenantId, apiVersion, xApiVersion, leaveTypeDtoCollectionQueryParameters)

Count leave types

Counts leave types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val leaveTypeDtoCollectionQueryParameters : LeaveTypeDtoCollectionQueryParameters =  // LeaveTypeDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getLeaveTypesCountAsync(tenantId, apiVersion, xApiVersion, leaveTypeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveTypesApi#getLeaveTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveTypesApi#getLeaveTypesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leaveTypeDtoCollectionQueryParameters** | [**LeaveTypeDtoCollectionQueryParameters**](LeaveTypeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateLeaveTypeAsync"></a>
# **updateLeaveTypeAsync**
> EmptyEnvelope updateLeaveTypeAsync(leaveTypeId, tenantId, apiVersion, xApiVersion, leaveTypeUpdateDto)

Update a leave type

Updates an existing leave type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LeaveTypesApi()
val leaveTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val leaveTypeUpdateDto : LeaveTypeUpdateDto =  // LeaveTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateLeaveTypeAsync(leaveTypeId, tenantId, apiVersion, xApiVersion, leaveTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LeaveTypesApi#updateLeaveTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LeaveTypesApi#updateLeaveTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **leaveTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **leaveTypeUpdateDto** | [**LeaveTypeUpdateDto**](LeaveTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

