# PayrollPeriodsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPayrollPeriodAsync**](PayrollPeriodsApi.md#createPayrollPeriodAsync) | **POST** /api/v2/HrmsService/PayrollPeriods | Create a payroll period |
| [**deletePayrollPeriodAsync**](PayrollPeriodsApi.md#deletePayrollPeriodAsync) | **DELETE** /api/v2/HrmsService/PayrollPeriods/{periodId} | Delete a payroll period |
| [**getPayrollPeriodByIdAsync**](PayrollPeriodsApi.md#getPayrollPeriodByIdAsync) | **GET** /api/v2/HrmsService/PayrollPeriods/{periodId} | Get payroll period by ID |
| [**getPayrollPeriodsAsync**](PayrollPeriodsApi.md#getPayrollPeriodsAsync) | **GET** /api/v2/HrmsService/PayrollPeriods | Get payroll periods |
| [**getPayrollPeriodsCountAsync**](PayrollPeriodsApi.md#getPayrollPeriodsCountAsync) | **GET** /api/v2/HrmsService/PayrollPeriods/Count | Count payroll periods |
| [**updatePayrollPeriodAsync**](PayrollPeriodsApi.md#updatePayrollPeriodAsync) | **PUT** /api/v2/HrmsService/PayrollPeriods/{periodId} | Update a payroll period |


<a id="createPayrollPeriodAsync"></a>
# **createPayrollPeriodAsync**
> EmptyEnvelope createPayrollPeriodAsync(tenantId, apiVersion, xApiVersion, payrollPeriodCreateDto)

Create a payroll period

Creates a new payroll period for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollPeriodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val payrollPeriodCreateDto : PayrollPeriodCreateDto =  // PayrollPeriodCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPayrollPeriodAsync(tenantId, apiVersion, xApiVersion, payrollPeriodCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollPeriodsApi#createPayrollPeriodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollPeriodsApi#createPayrollPeriodAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **payrollPeriodCreateDto** | [**PayrollPeriodCreateDto**](PayrollPeriodCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePayrollPeriodAsync"></a>
# **deletePayrollPeriodAsync**
> EmptyEnvelope deletePayrollPeriodAsync(periodId, tenantId, apiVersion, xApiVersion)

Delete a payroll period

Deletes a payroll period for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollPeriodsApi()
val periodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deletePayrollPeriodAsync(periodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollPeriodsApi#deletePayrollPeriodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollPeriodsApi#deletePayrollPeriodAsync")
    e.printStackTrace()
}
```

### Parameters
| **periodId** | **java.util.UUID**|  | |
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

<a id="getPayrollPeriodByIdAsync"></a>
# **getPayrollPeriodByIdAsync**
> PayrollPeriodDtoEnvelope getPayrollPeriodByIdAsync(periodId, tenantId, apiVersion, xApiVersion)

Get payroll period by ID

Retrieves a specific payroll period by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollPeriodsApi()
val periodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PayrollPeriodDtoEnvelope = apiInstance.getPayrollPeriodByIdAsync(periodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollPeriodsApi#getPayrollPeriodByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollPeriodsApi#getPayrollPeriodByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **periodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PayrollPeriodDtoEnvelope**](PayrollPeriodDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPayrollPeriodsAsync"></a>
# **getPayrollPeriodsAsync**
> PayrollPeriodDtoListEnvelope getPayrollPeriodsAsync(tenantId, apiVersion, xApiVersion, payrollPeriodDtoCollectionQueryParameters)

Get payroll periods

Retrieves payroll periods for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollPeriodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val payrollPeriodDtoCollectionQueryParameters : PayrollPeriodDtoCollectionQueryParameters =  // PayrollPeriodDtoCollectionQueryParameters | 
try {
    val result : PayrollPeriodDtoListEnvelope = apiInstance.getPayrollPeriodsAsync(tenantId, apiVersion, xApiVersion, payrollPeriodDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollPeriodsApi#getPayrollPeriodsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollPeriodsApi#getPayrollPeriodsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **payrollPeriodDtoCollectionQueryParameters** | [**PayrollPeriodDtoCollectionQueryParameters**](PayrollPeriodDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**PayrollPeriodDtoListEnvelope**](PayrollPeriodDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getPayrollPeriodsCountAsync"></a>
# **getPayrollPeriodsCountAsync**
> Int32Envelope getPayrollPeriodsCountAsync(tenantId, apiVersion, xApiVersion, payrollPeriodDtoCollectionQueryParameters)

Count payroll periods

Counts payroll periods for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollPeriodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val payrollPeriodDtoCollectionQueryParameters : PayrollPeriodDtoCollectionQueryParameters =  // PayrollPeriodDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getPayrollPeriodsCountAsync(tenantId, apiVersion, xApiVersion, payrollPeriodDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollPeriodsApi#getPayrollPeriodsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollPeriodsApi#getPayrollPeriodsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **payrollPeriodDtoCollectionQueryParameters** | [**PayrollPeriodDtoCollectionQueryParameters**](PayrollPeriodDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updatePayrollPeriodAsync"></a>
# **updatePayrollPeriodAsync**
> EmptyEnvelope updatePayrollPeriodAsync(periodId, tenantId, apiVersion, xApiVersion, payrollPeriodUpdateDto)

Update a payroll period

Updates an existing payroll period for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PayrollPeriodsApi()
val periodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val payrollPeriodUpdateDto : PayrollPeriodUpdateDto =  // PayrollPeriodUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePayrollPeriodAsync(periodId, tenantId, apiVersion, xApiVersion, payrollPeriodUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PayrollPeriodsApi#updatePayrollPeriodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PayrollPeriodsApi#updatePayrollPeriodAsync")
    e.printStackTrace()
}
```

### Parameters
| **periodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **payrollPeriodUpdateDto** | [**PayrollPeriodUpdateDto**](PayrollPeriodUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

