# PayrollsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPayrollAsync**](PayrollsApi.md#createPayrollAsync) | **POST** /api/v2/HrmsService/Payrolls | Create a payroll |
| [**deletePayrollAsync**](PayrollsApi.md#deletePayrollAsync) | **DELETE** /api/v2/HrmsService/Payrolls/{payrollId} | Delete a payroll |
| [**getPayrollByIdAsync**](PayrollsApi.md#getPayrollByIdAsync) | **GET** /api/v2/HrmsService/Payrolls/{payrollId} | Get payroll by ID |
| [**getPayrollsAsync**](PayrollsApi.md#getPayrollsAsync) | **GET** /api/v2/HrmsService/Payrolls | Get payrolls |
| [**getPayrollsCountAsync**](PayrollsApi.md#getPayrollsCountAsync) | **GET** /api/v2/HrmsService/Payrolls/Count | Count payrolls |
| [**patchPayrollAsync**](PayrollsApi.md#patchPayrollAsync) | **PATCH** /api/v2/HrmsService/Payrolls/{payrollId} | Patch a payroll |
| [**updatePayrollAsync**](PayrollsApi.md#updatePayrollAsync) | **PUT** /api/v2/HrmsService/Payrolls/{payrollId} | Update a payroll |


<a id="createPayrollAsync"></a>
# **createPayrollAsync**
> EmptyEnvelope createPayrollAsync(tenantId, apiVersion, xApiVersion, payrollCreateDto)

Create a payroll

Creates a new payroll for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val payrollCreateDto : PayrollCreateDto =  // PayrollCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPayrollAsync(tenantId, apiVersion, xApiVersion, payrollCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollsApi#createPayrollAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollsApi#createPayrollAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **payrollCreateDto** | [**PayrollCreateDto**](PayrollCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePayrollAsync"></a>
# **deletePayrollAsync**
> EmptyEnvelope deletePayrollAsync(payrollId, tenantId, apiVersion, xApiVersion)

Delete a payroll

Deletes a payroll for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollsApi()
val payrollId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deletePayrollAsync(payrollId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollsApi#deletePayrollAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollsApi#deletePayrollAsync")
    e.printStackTrace()
}
```

### Parameters
| **payrollId** | **java.util.UUID**|  | |
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

<a id="getPayrollByIdAsync"></a>
# **getPayrollByIdAsync**
> PayrollDtoEnvelope getPayrollByIdAsync(payrollId, tenantId, apiVersion, xApiVersion)

Get payroll by ID

Retrieves a specific payroll by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollsApi()
val payrollId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PayrollDtoEnvelope = apiInstance.getPayrollByIdAsync(payrollId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollsApi#getPayrollByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollsApi#getPayrollByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **payrollId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PayrollDtoEnvelope**](PayrollDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPayrollsAsync"></a>
# **getPayrollsAsync**
> PayrollDtoListEnvelope getPayrollsAsync(tenantId, apiVersion, xApiVersion)

Get payrolls

Retrieves payrolls for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PayrollDtoListEnvelope = apiInstance.getPayrollsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollsApi#getPayrollsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollsApi#getPayrollsAsync")
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

[**PayrollDtoListEnvelope**](PayrollDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPayrollsCountAsync"></a>
# **getPayrollsCountAsync**
> Int32Envelope getPayrollsCountAsync(tenantId, apiVersion, xApiVersion)

Count payrolls

Counts payrolls for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getPayrollsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollsApi#getPayrollsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollsApi#getPayrollsCountAsync")
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

<a id="patchPayrollAsync"></a>
# **patchPayrollAsync**
> EmptyEnvelope patchPayrollAsync(payrollId, tenantId, apiVersion, xApiVersion, operation)

Patch a payroll

Partially updates an existing payroll for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollsApi()
val payrollId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchPayrollAsync(payrollId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollsApi#patchPayrollAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollsApi#patchPayrollAsync")
    e.printStackTrace()
}
```

### Parameters
| **payrollId** | **java.util.UUID**|  | |
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

<a id="updatePayrollAsync"></a>
# **updatePayrollAsync**
> EmptyEnvelope updatePayrollAsync(payrollId, tenantId, apiVersion, xApiVersion, payrollUpdateDto)

Update a payroll

Updates an existing payroll for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollsApi()
val payrollId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val payrollUpdateDto : PayrollUpdateDto =  // PayrollUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePayrollAsync(payrollId, tenantId, apiVersion, xApiVersion, payrollUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollsApi#updatePayrollAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollsApi#updatePayrollAsync")
    e.printStackTrace()
}
```

### Parameters
| **payrollId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **payrollUpdateDto** | [**PayrollUpdateDto**](PayrollUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

