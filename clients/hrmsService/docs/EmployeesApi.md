# EmployeesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEmployeeAsync**](EmployeesApi.md#createEmployeeAsync) | **POST** /api/v2/HrmsService/Employees |  |
| [**deleteEmployeeAsync**](EmployeesApi.md#deleteEmployeeAsync) | **DELETE** /api/v2/HrmsService/Employees/{employeeId} |  |
| [**getEmployeeByIdAsync**](EmployeesApi.md#getEmployeeByIdAsync) | **GET** /api/v2/HrmsService/Employees/{employeeId} |  |
| [**getEmployeesAsync**](EmployeesApi.md#getEmployeesAsync) | **GET** /api/v2/HrmsService/Employees |  |
| [**getEmployeesCountAsync**](EmployeesApi.md#getEmployeesCountAsync) | **GET** /api/v2/HrmsService/Employees/Count |  |
| [**updateEmployeeAsync**](EmployeesApi.md#updateEmployeeAsync) | **PUT** /api/v2/HrmsService/Employees/{employeeId} |  |


<a id="createEmployeeAsync"></a>
# **createEmployeeAsync**
> EmptyEnvelope createEmployeeAsync(tenantId, apiVersion, xApiVersion, employeeProfileCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val employeeProfileCreateDto : EmployeeProfileCreateDto =  // EmployeeProfileCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createEmployeeAsync(tenantId, apiVersion, xApiVersion, employeeProfileCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#createEmployeeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#createEmployeeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeProfileCreateDto** | [**EmployeeProfileCreateDto**](EmployeeProfileCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteEmployeeAsync"></a>
# **deleteEmployeeAsync**
> EmptyEnvelope deleteEmployeeAsync(employeeId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeesApi()
val employeeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteEmployeeAsync(employeeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#deleteEmployeeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#deleteEmployeeAsync")
    e.printStackTrace()
}
```

### Parameters
| **employeeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmployeeByIdAsync"></a>
# **getEmployeeByIdAsync**
> EmployeeProfileDtoEnvelope getEmployeeByIdAsync(employeeId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeesApi()
val employeeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmployeeProfileDtoEnvelope = apiInstance.getEmployeeByIdAsync(employeeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#getEmployeeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#getEmployeeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **employeeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmployeeProfileDtoEnvelope**](EmployeeProfileDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmployeesAsync"></a>
# **getEmployeesAsync**
> EmployeeProfileDtoListEnvelope getEmployeesAsync(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmployeeProfileDtoListEnvelope = apiInstance.getEmployeesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#getEmployeesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#getEmployeesAsync")
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

[**EmployeeProfileDtoListEnvelope**](EmployeeProfileDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmployeesCountAsync"></a>
# **getEmployeesCountAsync**
> Int32Envelope getEmployeesCountAsync(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getEmployeesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#getEmployeesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#getEmployeesCountAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateEmployeeAsync"></a>
# **updateEmployeeAsync**
> EmptyEnvelope updateEmployeeAsync(employeeId, tenantId, apiVersion, xApiVersion, body)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeesApi()
val employeeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EmptyEnvelope = apiInstance.updateEmployeeAsync(employeeId, tenantId, apiVersion, xApiVersion, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeesApi#updateEmployeeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeesApi#updateEmployeeAsync")
    e.printStackTrace()
}
```

### Parameters
| **employeeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

