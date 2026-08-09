# SchedulesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createScheduleAsync**](SchedulesApi.md#createScheduleAsync) | **POST** /api/v2/HrmsService/Schedules | Create a schedule |
| [**deleteScheduleAsync**](SchedulesApi.md#deleteScheduleAsync) | **DELETE** /api/v2/HrmsService/Schedules/{scheduleId} | Delete a schedule |
| [**getScheduleByIdAsync**](SchedulesApi.md#getScheduleByIdAsync) | **GET** /api/v2/HrmsService/Schedules/{scheduleId} | Get schedule by ID |
| [**getSchedulesAsync**](SchedulesApi.md#getSchedulesAsync) | **GET** /api/v2/HrmsService/Schedules | Get schedules |
| [**getSchedulesCountAsync**](SchedulesApi.md#getSchedulesCountAsync) | **GET** /api/v2/HrmsService/Schedules/Count | Count schedules |
| [**patchScheduleAsync**](SchedulesApi.md#patchScheduleAsync) | **PATCH** /api/v2/HrmsService/Schedules/{scheduleId} | Patch a schedule |
| [**updateScheduleAsync**](SchedulesApi.md#updateScheduleAsync) | **PUT** /api/v2/HrmsService/Schedules/{scheduleId} | Update a schedule |


<a id="createScheduleAsync"></a>
# **createScheduleAsync**
> EmptyEnvelope createScheduleAsync(tenantId, apiVersion, xApiVersion, scheduleCreateDto)

Create a schedule

Creates a new schedule for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SchedulesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val scheduleCreateDto : ScheduleCreateDto =  // ScheduleCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createScheduleAsync(tenantId, apiVersion, xApiVersion, scheduleCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#createScheduleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#createScheduleAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleCreateDto** | [**ScheduleCreateDto**](ScheduleCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteScheduleAsync"></a>
# **deleteScheduleAsync**
> EmptyEnvelope deleteScheduleAsync(scheduleId, tenantId, apiVersion, xApiVersion)

Delete a schedule

Deletes a schedule for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SchedulesApi()
val scheduleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteScheduleAsync(scheduleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#deleteScheduleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#deleteScheduleAsync")
    e.printStackTrace()
}
```

### Parameters
| **scheduleId** | **java.util.UUID**|  | |
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

<a id="getScheduleByIdAsync"></a>
# **getScheduleByIdAsync**
> ScheduleDtoEnvelope getScheduleByIdAsync(scheduleId, tenantId, apiVersion, xApiVersion)

Get schedule by ID

Retrieves a specific schedule by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SchedulesApi()
val scheduleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ScheduleDtoEnvelope = apiInstance.getScheduleByIdAsync(scheduleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#getScheduleByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#getScheduleByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **scheduleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ScheduleDtoEnvelope**](ScheduleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSchedulesAsync"></a>
# **getSchedulesAsync**
> ScheduleDtoListEnvelope getSchedulesAsync(tenantId, apiVersion, xApiVersion, scheduleDtoCollectionQueryParameters)

Get schedules

Retrieves schedules for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SchedulesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val scheduleDtoCollectionQueryParameters : ScheduleDtoCollectionQueryParameters =  // ScheduleDtoCollectionQueryParameters | 
try {
    val result : ScheduleDtoListEnvelope = apiInstance.getSchedulesAsync(tenantId, apiVersion, xApiVersion, scheduleDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#getSchedulesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#getSchedulesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleDtoCollectionQueryParameters** | [**ScheduleDtoCollectionQueryParameters**](ScheduleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ScheduleDtoListEnvelope**](ScheduleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSchedulesCountAsync"></a>
# **getSchedulesCountAsync**
> Int32Envelope getSchedulesCountAsync(tenantId, apiVersion, xApiVersion, scheduleDtoCollectionQueryParameters)

Count schedules

Counts schedules for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SchedulesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val scheduleDtoCollectionQueryParameters : ScheduleDtoCollectionQueryParameters =  // ScheduleDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSchedulesCountAsync(tenantId, apiVersion, xApiVersion, scheduleDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#getSchedulesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#getSchedulesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleDtoCollectionQueryParameters** | [**ScheduleDtoCollectionQueryParameters**](ScheduleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchScheduleAsync"></a>
# **patchScheduleAsync**
> EmptyEnvelope patchScheduleAsync(scheduleId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a schedule

Partially updates an existing schedule for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SchedulesApi()
val scheduleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchScheduleAsync(scheduleId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#patchScheduleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#patchScheduleAsync")
    e.printStackTrace()
}
```

### Parameters
| **scheduleId** | **java.util.UUID**|  | |
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

<a id="updateScheduleAsync"></a>
# **updateScheduleAsync**
> EmptyEnvelope updateScheduleAsync(scheduleId, tenantId, apiVersion, xApiVersion, scheduleUpdateDto)

Update a schedule

Updates an existing schedule for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SchedulesApi()
val scheduleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val scheduleUpdateDto : ScheduleUpdateDto =  // ScheduleUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateScheduleAsync(scheduleId, tenantId, apiVersion, xApiVersion, scheduleUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SchedulesApi#updateScheduleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SchedulesApi#updateScheduleAsync")
    e.printStackTrace()
}
```

### Parameters
| **scheduleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **scheduleUpdateDto** | [**ScheduleUpdateDto**](ScheduleUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

