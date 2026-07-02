# TimeIntervalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTimeIntervalAsync**](TimeIntervalsApi.md#createTimeIntervalAsync) | **POST** /api/v2/HrmsService/TimeIntervals | Create a time interval |
| [**deleteTimeIntervalAsync**](TimeIntervalsApi.md#deleteTimeIntervalAsync) | **DELETE** /api/v2/HrmsService/TimeIntervals/{timeIntervalId} | Delete a time interval |
| [**getTimeIntervalByIdAsync**](TimeIntervalsApi.md#getTimeIntervalByIdAsync) | **GET** /api/v2/HrmsService/TimeIntervals/{timeIntervalId} | Get time interval by ID |
| [**getTimeIntervalsAsync**](TimeIntervalsApi.md#getTimeIntervalsAsync) | **GET** /api/v2/HrmsService/TimeIntervals | Get time intervals |
| [**getTimeIntervalsCountAsync**](TimeIntervalsApi.md#getTimeIntervalsCountAsync) | **GET** /api/v2/HrmsService/TimeIntervals/Count | Count time intervals |
| [**patchTimeIntervalAsync**](TimeIntervalsApi.md#patchTimeIntervalAsync) | **PATCH** /api/v2/HrmsService/TimeIntervals/{timeIntervalId} | Patch a time interval |
| [**updateTimeIntervalAsync**](TimeIntervalsApi.md#updateTimeIntervalAsync) | **PUT** /api/v2/HrmsService/TimeIntervals/{timeIntervalId} | Update a time interval |


<a id="createTimeIntervalAsync"></a>
# **createTimeIntervalAsync**
> EmptyEnvelope createTimeIntervalAsync(tenantId, apiVersion, xApiVersion, timeIntervalCreateDto)

Create a time interval

Creates a new time interval for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeIntervalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val timeIntervalCreateDto : TimeIntervalCreateDto =  // TimeIntervalCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTimeIntervalAsync(tenantId, apiVersion, xApiVersion, timeIntervalCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeIntervalsApi#createTimeIntervalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeIntervalsApi#createTimeIntervalAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timeIntervalCreateDto** | [**TimeIntervalCreateDto**](TimeIntervalCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTimeIntervalAsync"></a>
# **deleteTimeIntervalAsync**
> EmptyEnvelope deleteTimeIntervalAsync(timeIntervalId, tenantId, apiVersion, xApiVersion)

Delete a time interval

Deletes a time interval for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeIntervalsApi()
val timeIntervalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTimeIntervalAsync(timeIntervalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeIntervalsApi#deleteTimeIntervalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeIntervalsApi#deleteTimeIntervalAsync")
    e.printStackTrace()
}
```

### Parameters
| **timeIntervalId** | **java.util.UUID**|  | |
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

<a id="getTimeIntervalByIdAsync"></a>
# **getTimeIntervalByIdAsync**
> TimeIntervalDtoEnvelope getTimeIntervalByIdAsync(timeIntervalId, tenantId, apiVersion, xApiVersion)

Get time interval by ID

Retrieves a specific time interval by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeIntervalsApi()
val timeIntervalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TimeIntervalDtoEnvelope = apiInstance.getTimeIntervalByIdAsync(timeIntervalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeIntervalsApi#getTimeIntervalByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeIntervalsApi#getTimeIntervalByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **timeIntervalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TimeIntervalDtoEnvelope**](TimeIntervalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTimeIntervalsAsync"></a>
# **getTimeIntervalsAsync**
> TimeIntervalDtoListEnvelope getTimeIntervalsAsync(tenantId, apiVersion, xApiVersion)

Get time intervals

Retrieves time intervals for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeIntervalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TimeIntervalDtoListEnvelope = apiInstance.getTimeIntervalsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeIntervalsApi#getTimeIntervalsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeIntervalsApi#getTimeIntervalsAsync")
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

[**TimeIntervalDtoListEnvelope**](TimeIntervalDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTimeIntervalsCountAsync"></a>
# **getTimeIntervalsCountAsync**
> Int32Envelope getTimeIntervalsCountAsync(tenantId, apiVersion, xApiVersion)

Count time intervals

Counts time intervals for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeIntervalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTimeIntervalsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeIntervalsApi#getTimeIntervalsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeIntervalsApi#getTimeIntervalsCountAsync")
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

<a id="patchTimeIntervalAsync"></a>
# **patchTimeIntervalAsync**
> EmptyEnvelope patchTimeIntervalAsync(timeIntervalId, tenantId, apiVersion, xApiVersion, operation)

Patch a time interval

Partially updates an existing time interval for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeIntervalsApi()
val timeIntervalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchTimeIntervalAsync(timeIntervalId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeIntervalsApi#patchTimeIntervalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeIntervalsApi#patchTimeIntervalAsync")
    e.printStackTrace()
}
```

### Parameters
| **timeIntervalId** | **java.util.UUID**|  | |
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

<a id="updateTimeIntervalAsync"></a>
# **updateTimeIntervalAsync**
> EmptyEnvelope updateTimeIntervalAsync(timeIntervalId, tenantId, apiVersion, xApiVersion, timeIntervalUpdateDto)

Update a time interval

Updates an existing time interval for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimeIntervalsApi()
val timeIntervalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val timeIntervalUpdateDto : TimeIntervalUpdateDto =  // TimeIntervalUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTimeIntervalAsync(timeIntervalId, tenantId, apiVersion, xApiVersion, timeIntervalUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimeIntervalsApi#updateTimeIntervalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimeIntervalsApi#updateTimeIntervalAsync")
    e.printStackTrace()
}
```

### Parameters
| **timeIntervalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **timeIntervalUpdateDto** | [**TimeIntervalUpdateDto**](TimeIntervalUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

