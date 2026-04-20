# EmployersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEmployerAsync**](EmployersApi.md#createEmployerAsync) | **POST** /api/v2/HrmsService/Employers | Create an employer |
| [**deleteEmployerAsync**](EmployersApi.md#deleteEmployerAsync) | **DELETE** /api/v2/HrmsService/Employers/{employerId} | Delete an employer |
| [**getEmployerByIdAsync**](EmployersApi.md#getEmployerByIdAsync) | **GET** /api/v2/HrmsService/Employers/{employerId} | Get employer by ID |
| [**getEmployersAsync**](EmployersApi.md#getEmployersAsync) | **GET** /api/v2/HrmsService/Employers | Get employers |
| [**getEmployersCountAsync**](EmployersApi.md#getEmployersCountAsync) | **GET** /api/v2/HrmsService/Employers/Count | Count employers |
| [**updateEmployerAsync**](EmployersApi.md#updateEmployerAsync) | **PUT** /api/v2/HrmsService/Employers/{employerId} | Update an employer |


<a id="createEmployerAsync"></a>
# **createEmployerAsync**
> EmptyEnvelope createEmployerAsync(tenantId, apiVersion, xApiVersion, employerProfileCreateDto)

Create an employer

Creates a new employer for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val employerProfileCreateDto : EmployerProfileCreateDto =  // EmployerProfileCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createEmployerAsync(tenantId, apiVersion, xApiVersion, employerProfileCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployersApi#createEmployerAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployersApi#createEmployerAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employerProfileCreateDto** | [**EmployerProfileCreateDto**](EmployerProfileCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteEmployerAsync"></a>
# **deleteEmployerAsync**
> EmptyEnvelope deleteEmployerAsync(employerId, tenantId, apiVersion, xApiVersion)

Delete an employer

Deletes an employer for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployersApi()
val employerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteEmployerAsync(employerId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployersApi#deleteEmployerAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployersApi#deleteEmployerAsync")
    e.printStackTrace()
}
```

### Parameters
| **employerId** | **java.util.UUID**|  | |
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

<a id="getEmployerByIdAsync"></a>
# **getEmployerByIdAsync**
> EmployerProfileDtoEnvelope getEmployerByIdAsync(employerId, tenantId, apiVersion, xApiVersion)

Get employer by ID

Retrieves a specific employer by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployersApi()
val employerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmployerProfileDtoEnvelope = apiInstance.getEmployerByIdAsync(employerId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployersApi#getEmployerByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployersApi#getEmployerByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **employerId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmployerProfileDtoEnvelope**](EmployerProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmployersAsync"></a>
# **getEmployersAsync**
> EmployerProfileDtoListEnvelope getEmployersAsync(tenantId, apiVersion, xApiVersion)

Get employers

Retrieves employers for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmployerProfileDtoListEnvelope = apiInstance.getEmployersAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployersApi#getEmployersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployersApi#getEmployersAsync")
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

[**EmployerProfileDtoListEnvelope**](EmployerProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmployersCountAsync"></a>
# **getEmployersCountAsync**
> Int32Envelope getEmployersCountAsync(tenantId, apiVersion, xApiVersion)

Count employers

Counts employers for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getEmployersCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployersApi#getEmployersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployersApi#getEmployersCountAsync")
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

<a id="updateEmployerAsync"></a>
# **updateEmployerAsync**
> EmptyEnvelope updateEmployerAsync(employerId, tenantId, apiVersion, xApiVersion, body)

Update an employer

Updates an existing employer for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployersApi()
val employerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EmptyEnvelope = apiInstance.updateEmployerAsync(employerId, tenantId, apiVersion, xApiVersion, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployersApi#updateEmployerAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployersApi#updateEmployerAsync")
    e.printStackTrace()
}
```

### Parameters
| **employerId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

