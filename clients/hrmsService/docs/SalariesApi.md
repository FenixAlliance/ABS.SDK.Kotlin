# SalariesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSalaryAsync**](SalariesApi.md#createSalaryAsync) | **POST** /api/v2/HrmsService/Salaries | Create a salary |
| [**deleteSalaryAsync**](SalariesApi.md#deleteSalaryAsync) | **DELETE** /api/v2/HrmsService/Salaries/{salaryId} | Delete a salary |
| [**getSalariesAsync**](SalariesApi.md#getSalariesAsync) | **GET** /api/v2/HrmsService/Salaries | Get salaries |
| [**getSalariesCountAsync**](SalariesApi.md#getSalariesCountAsync) | **GET** /api/v2/HrmsService/Salaries/Count | Count salaries |
| [**getSalaryByIdAsync**](SalariesApi.md#getSalaryByIdAsync) | **GET** /api/v2/HrmsService/Salaries/{salaryId} | Get salary by ID |
| [**patchSalaryAsync**](SalariesApi.md#patchSalaryAsync) | **PATCH** /api/v2/HrmsService/Salaries/{salaryId} | Patch a salary |
| [**updateSalaryAsync**](SalariesApi.md#updateSalaryAsync) | **PUT** /api/v2/HrmsService/Salaries/{salaryId} | Update a salary |


<a id="createSalaryAsync"></a>
# **createSalaryAsync**
> EmptyEnvelope createSalaryAsync(tenantId, apiVersion, xApiVersion, salaryCreateDto)

Create a salary

Creates a new salary for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalariesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val salaryCreateDto : SalaryCreateDto =  // SalaryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSalaryAsync(tenantId, apiVersion, xApiVersion, salaryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalariesApi#createSalaryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalariesApi#createSalaryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **salaryCreateDto** | [**SalaryCreateDto**](SalaryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSalaryAsync"></a>
# **deleteSalaryAsync**
> EmptyEnvelope deleteSalaryAsync(salaryId, tenantId, apiVersion, xApiVersion)

Delete a salary

Deletes a salary for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalariesApi()
val salaryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSalaryAsync(salaryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalariesApi#deleteSalaryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalariesApi#deleteSalaryAsync")
    e.printStackTrace()
}
```

### Parameters
| **salaryId** | **java.util.UUID**|  | |
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

<a id="getSalariesAsync"></a>
# **getSalariesAsync**
> SalaryDtoListEnvelope getSalariesAsync(tenantId, apiVersion, xApiVersion)

Get salaries

Retrieves salaries for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalariesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SalaryDtoListEnvelope = apiInstance.getSalariesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalariesApi#getSalariesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalariesApi#getSalariesAsync")
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

[**SalaryDtoListEnvelope**](SalaryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSalariesCountAsync"></a>
# **getSalariesCountAsync**
> Int32Envelope getSalariesCountAsync(tenantId, apiVersion, xApiVersion)

Count salaries

Counts salaries for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalariesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSalariesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalariesApi#getSalariesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalariesApi#getSalariesCountAsync")
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

<a id="getSalaryByIdAsync"></a>
# **getSalaryByIdAsync**
> SalaryDtoEnvelope getSalaryByIdAsync(salaryId, tenantId, apiVersion, xApiVersion)

Get salary by ID

Retrieves a specific salary by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalariesApi()
val salaryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SalaryDtoEnvelope = apiInstance.getSalaryByIdAsync(salaryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalariesApi#getSalaryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalariesApi#getSalaryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **salaryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SalaryDtoEnvelope**](SalaryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchSalaryAsync"></a>
# **patchSalaryAsync**
> EmptyEnvelope patchSalaryAsync(salaryId, tenantId, apiVersion, xApiVersion, operation)

Patch a salary

Partially updates an existing salary for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalariesApi()
val salaryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSalaryAsync(salaryId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalariesApi#patchSalaryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalariesApi#patchSalaryAsync")
    e.printStackTrace()
}
```

### Parameters
| **salaryId** | **java.util.UUID**|  | |
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

<a id="updateSalaryAsync"></a>
# **updateSalaryAsync**
> EmptyEnvelope updateSalaryAsync(salaryId, tenantId, apiVersion, xApiVersion, salaryUpdateDto)

Update a salary

Updates an existing salary for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalariesApi()
val salaryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val salaryUpdateDto : SalaryUpdateDto =  // SalaryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSalaryAsync(salaryId, tenantId, apiVersion, xApiVersion, salaryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalariesApi#updateSalaryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalariesApi#updateSalaryAsync")
    e.printStackTrace()
}
```

### Parameters
| **salaryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **salaryUpdateDto** | [**SalaryUpdateDto**](SalaryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

