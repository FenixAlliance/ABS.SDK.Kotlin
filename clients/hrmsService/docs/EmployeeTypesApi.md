# EmployeeTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEmployeeTypeAsync**](EmployeeTypesApi.md#createEmployeeTypeAsync) | **POST** /api/v2/HrmsService/EmployeeTypes | Create an employee type |
| [**deleteEmployeeTypeAsync**](EmployeeTypesApi.md#deleteEmployeeTypeAsync) | **DELETE** /api/v2/HrmsService/EmployeeTypes/{employeeTypeId} | Delete an employee type |
| [**getEmployeeTypeByIdAsync**](EmployeeTypesApi.md#getEmployeeTypeByIdAsync) | **GET** /api/v2/HrmsService/EmployeeTypes/{employeeTypeId} | Get employee type by ID |
| [**getEmployeeTypesAsync**](EmployeeTypesApi.md#getEmployeeTypesAsync) | **GET** /api/v2/HrmsService/EmployeeTypes | Get employee types |
| [**getEmployeeTypesCountAsync**](EmployeeTypesApi.md#getEmployeeTypesCountAsync) | **GET** /api/v2/HrmsService/EmployeeTypes/Count | Count employee types |
| [**patchEmployeeTypeAsync**](EmployeeTypesApi.md#patchEmployeeTypeAsync) | **PATCH** /api/v2/HrmsService/EmployeeTypes/{employeeTypeId} | Patch an employee type |
| [**updateEmployeeTypeAsync**](EmployeeTypesApi.md#updateEmployeeTypeAsync) | **PUT** /api/v2/HrmsService/EmployeeTypes/{employeeTypeId} | Update an employee type |


<a id="createEmployeeTypeAsync"></a>
# **createEmployeeTypeAsync**
> EmptyEnvelope createEmployeeTypeAsync(tenantId, apiVersion, xApiVersion, employeeTypeCreateDto)

Create an employee type

Creates a new employee type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val employeeTypeCreateDto : EmployeeTypeCreateDto =  // EmployeeTypeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createEmployeeTypeAsync(tenantId, apiVersion, xApiVersion, employeeTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeTypesApi#createEmployeeTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeTypesApi#createEmployeeTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeTypeCreateDto** | [**EmployeeTypeCreateDto**](EmployeeTypeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteEmployeeTypeAsync"></a>
# **deleteEmployeeTypeAsync**
> EmptyEnvelope deleteEmployeeTypeAsync(employeeTypeId, tenantId, apiVersion, xApiVersion)

Delete an employee type

Deletes an employee type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeTypesApi()
val employeeTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteEmployeeTypeAsync(employeeTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeTypesApi#deleteEmployeeTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeTypesApi#deleteEmployeeTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **employeeTypeId** | **java.util.UUID**|  | |
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

<a id="getEmployeeTypeByIdAsync"></a>
# **getEmployeeTypeByIdAsync**
> EmployeeTypeDtoEnvelope getEmployeeTypeByIdAsync(employeeTypeId, tenantId, apiVersion, xApiVersion)

Get employee type by ID

Retrieves a specific employee type by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeTypesApi()
val employeeTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmployeeTypeDtoEnvelope = apiInstance.getEmployeeTypeByIdAsync(employeeTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeTypesApi#getEmployeeTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeTypesApi#getEmployeeTypeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **employeeTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmployeeTypeDtoEnvelope**](EmployeeTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmployeeTypesAsync"></a>
# **getEmployeeTypesAsync**
> EmployeeTypeDtoListEnvelope getEmployeeTypesAsync(tenantId, apiVersion, xApiVersion, employeeTypeDtoCollectionQueryParameters)

Get employee types

Retrieves employee types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val employeeTypeDtoCollectionQueryParameters : EmployeeTypeDtoCollectionQueryParameters =  // EmployeeTypeDtoCollectionQueryParameters | 
try {
    val result : EmployeeTypeDtoListEnvelope = apiInstance.getEmployeeTypesAsync(tenantId, apiVersion, xApiVersion, employeeTypeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeTypesApi#getEmployeeTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeTypesApi#getEmployeeTypesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeTypeDtoCollectionQueryParameters** | [**EmployeeTypeDtoCollectionQueryParameters**](EmployeeTypeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**EmployeeTypeDtoListEnvelope**](EmployeeTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getEmployeeTypesCountAsync"></a>
# **getEmployeeTypesCountAsync**
> Int32Envelope getEmployeeTypesCountAsync(tenantId, apiVersion, xApiVersion, employeeTypeDtoCollectionQueryParameters)

Count employee types

Counts employee types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val employeeTypeDtoCollectionQueryParameters : EmployeeTypeDtoCollectionQueryParameters =  // EmployeeTypeDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getEmployeeTypesCountAsync(tenantId, apiVersion, xApiVersion, employeeTypeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeTypesApi#getEmployeeTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeTypesApi#getEmployeeTypesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeTypeDtoCollectionQueryParameters** | [**EmployeeTypeDtoCollectionQueryParameters**](EmployeeTypeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchEmployeeTypeAsync"></a>
# **patchEmployeeTypeAsync**
> EmptyEnvelope patchEmployeeTypeAsync(employeeTypeId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch an employee type

Partially updates an existing employee type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeTypesApi()
val employeeTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchEmployeeTypeAsync(employeeTypeId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeTypesApi#patchEmployeeTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeTypesApi#patchEmployeeTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **employeeTypeId** | **java.util.UUID**|  | |
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

<a id="updateEmployeeTypeAsync"></a>
# **updateEmployeeTypeAsync**
> EmptyEnvelope updateEmployeeTypeAsync(employeeTypeId, tenantId, apiVersion, xApiVersion, employeeTypeUpdateDto)

Update an employee type

Updates an existing employee type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeTypesApi()
val employeeTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val employeeTypeUpdateDto : EmployeeTypeUpdateDto =  // EmployeeTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateEmployeeTypeAsync(employeeTypeId, tenantId, apiVersion, xApiVersion, employeeTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeTypesApi#updateEmployeeTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeTypesApi#updateEmployeeTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **employeeTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **employeeTypeUpdateDto** | [**EmployeeTypeUpdateDto**](EmployeeTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

