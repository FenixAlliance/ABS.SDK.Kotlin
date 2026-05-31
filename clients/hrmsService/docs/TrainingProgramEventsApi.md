# TrainingProgramEventsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTrainingProgramEventAsync**](TrainingProgramEventsApi.md#createTrainingProgramEventAsync) | **POST** /api/v2/HrmsService/TrainingProgramEvents | Create a training program event |
| [**deleteTrainingProgramEventAsync**](TrainingProgramEventsApi.md#deleteTrainingProgramEventAsync) | **DELETE** /api/v2/HrmsService/TrainingProgramEvents/{eventId} | Delete a training program event |
| [**getTrainingProgramEventByIdAsync**](TrainingProgramEventsApi.md#getTrainingProgramEventByIdAsync) | **GET** /api/v2/HrmsService/TrainingProgramEvents/{eventId} | Get training program event by ID |
| [**getTrainingProgramEventsAsync**](TrainingProgramEventsApi.md#getTrainingProgramEventsAsync) | **GET** /api/v2/HrmsService/TrainingProgramEvents | Get training program events |
| [**getTrainingProgramEventsCountAsync**](TrainingProgramEventsApi.md#getTrainingProgramEventsCountAsync) | **GET** /api/v2/HrmsService/TrainingProgramEvents/Count | Count training program events |
| [**updateTrainingProgramEventAsync**](TrainingProgramEventsApi.md#updateTrainingProgramEventAsync) | **PUT** /api/v2/HrmsService/TrainingProgramEvents/{eventId} | Update a training program event |


<a id="createTrainingProgramEventAsync"></a>
# **createTrainingProgramEventAsync**
> EmptyEnvelope createTrainingProgramEventAsync(tenantId, apiVersion, xApiVersion, trainingProgramEventCreateDto)

Create a training program event

Creates a new training program event for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramEventsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trainingProgramEventCreateDto : TrainingProgramEventCreateDto =  // TrainingProgramEventCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTrainingProgramEventAsync(tenantId, apiVersion, xApiVersion, trainingProgramEventCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramEventsApi#createTrainingProgramEventAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramEventsApi#createTrainingProgramEventAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trainingProgramEventCreateDto** | [**TrainingProgramEventCreateDto**](TrainingProgramEventCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTrainingProgramEventAsync"></a>
# **deleteTrainingProgramEventAsync**
> EmptyEnvelope deleteTrainingProgramEventAsync(eventId, tenantId, apiVersion, xApiVersion)

Delete a training program event

Deletes a training program event for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramEventsApi()
val eventId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTrainingProgramEventAsync(eventId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramEventsApi#deleteTrainingProgramEventAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramEventsApi#deleteTrainingProgramEventAsync")
    e.printStackTrace()
}
```

### Parameters
| **eventId** | **java.util.UUID**|  | |
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

<a id="getTrainingProgramEventByIdAsync"></a>
# **getTrainingProgramEventByIdAsync**
> TrainingProgramEventDtoEnvelope getTrainingProgramEventByIdAsync(eventId, tenantId, apiVersion, xApiVersion)

Get training program event by ID

Retrieves a specific training program event by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramEventsApi()
val eventId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrainingProgramEventDtoEnvelope = apiInstance.getTrainingProgramEventByIdAsync(eventId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramEventsApi#getTrainingProgramEventByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramEventsApi#getTrainingProgramEventByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **eventId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TrainingProgramEventDtoEnvelope**](TrainingProgramEventDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTrainingProgramEventsAsync"></a>
# **getTrainingProgramEventsAsync**
> TrainingProgramEventDtoListEnvelope getTrainingProgramEventsAsync(tenantId, apiVersion, xApiVersion)

Get training program events

Retrieves training program events for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramEventsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrainingProgramEventDtoListEnvelope = apiInstance.getTrainingProgramEventsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramEventsApi#getTrainingProgramEventsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramEventsApi#getTrainingProgramEventsAsync")
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

[**TrainingProgramEventDtoListEnvelope**](TrainingProgramEventDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTrainingProgramEventsCountAsync"></a>
# **getTrainingProgramEventsCountAsync**
> Int32Envelope getTrainingProgramEventsCountAsync(tenantId, apiVersion, xApiVersion)

Count training program events

Counts training program events for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramEventsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTrainingProgramEventsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramEventsApi#getTrainingProgramEventsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramEventsApi#getTrainingProgramEventsCountAsync")
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

<a id="updateTrainingProgramEventAsync"></a>
# **updateTrainingProgramEventAsync**
> EmptyEnvelope updateTrainingProgramEventAsync(eventId, tenantId, apiVersion, xApiVersion, trainingProgramEventUpdateDto)

Update a training program event

Updates an existing training program event for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramEventsApi()
val eventId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trainingProgramEventUpdateDto : TrainingProgramEventUpdateDto =  // TrainingProgramEventUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTrainingProgramEventAsync(eventId, tenantId, apiVersion, xApiVersion, trainingProgramEventUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramEventsApi#updateTrainingProgramEventAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramEventsApi#updateTrainingProgramEventAsync")
    e.printStackTrace()
}
```

### Parameters
| **eventId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trainingProgramEventUpdateDto** | [**TrainingProgramEventUpdateDto**](TrainingProgramEventUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

