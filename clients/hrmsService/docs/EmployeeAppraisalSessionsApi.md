# EmployeeAppraisalSessionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEmployeeAppraisalSessionAsync**](EmployeeAppraisalSessionsApi.md#createEmployeeAppraisalSessionAsync) | **POST** /api/v2/HrmsService/EmployeeAppraisalSessions | Create an employee appraisal session |
| [**deleteEmployeeAppraisalSessionAsync**](EmployeeAppraisalSessionsApi.md#deleteEmployeeAppraisalSessionAsync) | **DELETE** /api/v2/HrmsService/EmployeeAppraisalSessions/{sessionId} | Delete an employee appraisal session |
| [**getEmployeeAppraisalSessionByIdAsync**](EmployeeAppraisalSessionsApi.md#getEmployeeAppraisalSessionByIdAsync) | **GET** /api/v2/HrmsService/EmployeeAppraisalSessions/{sessionId} | Get employee appraisal session by ID |
| [**getEmployeeAppraisalSessionsAsync**](EmployeeAppraisalSessionsApi.md#getEmployeeAppraisalSessionsAsync) | **GET** /api/v2/HrmsService/EmployeeAppraisalSessions | Get employee appraisal sessions |
| [**getEmployeeAppraisalSessionsCountAsync**](EmployeeAppraisalSessionsApi.md#getEmployeeAppraisalSessionsCountAsync) | **GET** /api/v2/HrmsService/EmployeeAppraisalSessions/Count | Count employee appraisal sessions |
| [**updateEmployeeAppraisalSessionAsync**](EmployeeAppraisalSessionsApi.md#updateEmployeeAppraisalSessionAsync) | **PUT** /api/v2/HrmsService/EmployeeAppraisalSessions/{sessionId} | Update an employee appraisal session |


<a id="createEmployeeAppraisalSessionAsync"></a>
# **createEmployeeAppraisalSessionAsync**
> EmptyEnvelope createEmployeeAppraisalSessionAsync(tenantId, apiVersion, xApiVersion, employeeAppraisalSessionCreateDto)

Create an employee appraisal session

Creates a new employee appraisal session for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeAppraisalSessionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val employeeAppraisalSessionCreateDto : EmployeeAppraisalSessionCreateDto =  // EmployeeAppraisalSessionCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createEmployeeAppraisalSessionAsync(tenantId, apiVersion, xApiVersion, employeeAppraisalSessionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeAppraisalSessionsApi#createEmployeeAppraisalSessionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeAppraisalSessionsApi#createEmployeeAppraisalSessionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeAppraisalSessionCreateDto** | [**EmployeeAppraisalSessionCreateDto**](EmployeeAppraisalSessionCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteEmployeeAppraisalSessionAsync"></a>
# **deleteEmployeeAppraisalSessionAsync**
> EmptyEnvelope deleteEmployeeAppraisalSessionAsync(sessionId, tenantId, apiVersion, xApiVersion)

Delete an employee appraisal session

Deletes an employee appraisal session for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeAppraisalSessionsApi()
val sessionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteEmployeeAppraisalSessionAsync(sessionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeAppraisalSessionsApi#deleteEmployeeAppraisalSessionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeAppraisalSessionsApi#deleteEmployeeAppraisalSessionAsync")
    e.printStackTrace()
}
```

### Parameters
| **sessionId** | **java.util.UUID**|  | |
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

<a id="getEmployeeAppraisalSessionByIdAsync"></a>
# **getEmployeeAppraisalSessionByIdAsync**
> EmployeeAppraisalSessionDtoEnvelope getEmployeeAppraisalSessionByIdAsync(sessionId, tenantId, apiVersion, xApiVersion)

Get employee appraisal session by ID

Retrieves a specific employee appraisal session by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeAppraisalSessionsApi()
val sessionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmployeeAppraisalSessionDtoEnvelope = apiInstance.getEmployeeAppraisalSessionByIdAsync(sessionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **sessionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmployeeAppraisalSessionDtoEnvelope**](EmployeeAppraisalSessionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmployeeAppraisalSessionsAsync"></a>
# **getEmployeeAppraisalSessionsAsync**
> EmployeeAppraisalSessionDtoListEnvelope getEmployeeAppraisalSessionsAsync(tenantId, apiVersion, xApiVersion)

Get employee appraisal sessions

Retrieves employee appraisal sessions for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeAppraisalSessionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmployeeAppraisalSessionDtoListEnvelope = apiInstance.getEmployeeAppraisalSessionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionsAsync")
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

[**EmployeeAppraisalSessionDtoListEnvelope**](EmployeeAppraisalSessionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmployeeAppraisalSessionsCountAsync"></a>
# **getEmployeeAppraisalSessionsCountAsync**
> Int32Envelope getEmployeeAppraisalSessionsCountAsync(tenantId, apiVersion, xApiVersion)

Count employee appraisal sessions

Counts employee appraisal sessions for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeAppraisalSessionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getEmployeeAppraisalSessionsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeAppraisalSessionsApi#getEmployeeAppraisalSessionsCountAsync")
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

<a id="updateEmployeeAppraisalSessionAsync"></a>
# **updateEmployeeAppraisalSessionAsync**
> EmptyEnvelope updateEmployeeAppraisalSessionAsync(sessionId, tenantId, apiVersion, xApiVersion, employeeAppraisalSessionUpdateDto)

Update an employee appraisal session

Updates an existing employee appraisal session for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeAppraisalSessionsApi()
val sessionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val employeeAppraisalSessionUpdateDto : EmployeeAppraisalSessionUpdateDto =  // EmployeeAppraisalSessionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateEmployeeAppraisalSessionAsync(sessionId, tenantId, apiVersion, xApiVersion, employeeAppraisalSessionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeAppraisalSessionsApi#updateEmployeeAppraisalSessionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeAppraisalSessionsApi#updateEmployeeAppraisalSessionAsync")
    e.printStackTrace()
}
```

### Parameters
| **sessionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeAppraisalSessionUpdateDto** | [**EmployeeAppraisalSessionUpdateDto**](EmployeeAppraisalSessionUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

