# TrainingProgramsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTrainingProgramAsync**](TrainingProgramsApi.md#createTrainingProgramAsync) | **POST** /api/v2/HrmsService/TrainingPrograms | Create a training program |
| [**deleteTrainingProgramAsync**](TrainingProgramsApi.md#deleteTrainingProgramAsync) | **DELETE** /api/v2/HrmsService/TrainingPrograms/{programId} | Delete a training program |
| [**getTrainingProgramByIdAsync**](TrainingProgramsApi.md#getTrainingProgramByIdAsync) | **GET** /api/v2/HrmsService/TrainingPrograms/{programId} | Get training program by ID |
| [**getTrainingProgramsAsync**](TrainingProgramsApi.md#getTrainingProgramsAsync) | **GET** /api/v2/HrmsService/TrainingPrograms | Get training programs |
| [**getTrainingProgramsCountAsync**](TrainingProgramsApi.md#getTrainingProgramsCountAsync) | **GET** /api/v2/HrmsService/TrainingPrograms/Count | Count training programs |
| [**updateTrainingProgramAsync**](TrainingProgramsApi.md#updateTrainingProgramAsync) | **PUT** /api/v2/HrmsService/TrainingPrograms/{programId} | Update a training program |


<a id="createTrainingProgramAsync"></a>
# **createTrainingProgramAsync**
> EmptyEnvelope createTrainingProgramAsync(tenantId, apiVersion, xApiVersion, trainingProgramCreateDto)

Create a training program

Creates a new training program for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trainingProgramCreateDto : TrainingProgramCreateDto =  // TrainingProgramCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTrainingProgramAsync(tenantId, apiVersion, xApiVersion, trainingProgramCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramsApi#createTrainingProgramAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramsApi#createTrainingProgramAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trainingProgramCreateDto** | [**TrainingProgramCreateDto**](TrainingProgramCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTrainingProgramAsync"></a>
# **deleteTrainingProgramAsync**
> EmptyEnvelope deleteTrainingProgramAsync(programId, tenantId, apiVersion, xApiVersion)

Delete a training program

Deletes a training program for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramsApi()
val programId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTrainingProgramAsync(programId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramsApi#deleteTrainingProgramAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramsApi#deleteTrainingProgramAsync")
    e.printStackTrace()
}
```

### Parameters
| **programId** | **java.util.UUID**|  | |
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

<a id="getTrainingProgramByIdAsync"></a>
# **getTrainingProgramByIdAsync**
> TrainingProgramDtoEnvelope getTrainingProgramByIdAsync(programId, tenantId, apiVersion, xApiVersion)

Get training program by ID

Retrieves a specific training program by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramsApi()
val programId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrainingProgramDtoEnvelope = apiInstance.getTrainingProgramByIdAsync(programId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramsApi#getTrainingProgramByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramsApi#getTrainingProgramByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **programId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TrainingProgramDtoEnvelope**](TrainingProgramDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTrainingProgramsAsync"></a>
# **getTrainingProgramsAsync**
> TrainingProgramDtoListEnvelope getTrainingProgramsAsync(tenantId, apiVersion, xApiVersion, trainingProgramDtoCollectionQueryParameters)

Get training programs

Retrieves training programs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trainingProgramDtoCollectionQueryParameters : TrainingProgramDtoCollectionQueryParameters =  // TrainingProgramDtoCollectionQueryParameters | 
try {
    val result : TrainingProgramDtoListEnvelope = apiInstance.getTrainingProgramsAsync(tenantId, apiVersion, xApiVersion, trainingProgramDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramsApi#getTrainingProgramsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramsApi#getTrainingProgramsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trainingProgramDtoCollectionQueryParameters** | [**TrainingProgramDtoCollectionQueryParameters**](TrainingProgramDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**TrainingProgramDtoListEnvelope**](TrainingProgramDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getTrainingProgramsCountAsync"></a>
# **getTrainingProgramsCountAsync**
> Int32Envelope getTrainingProgramsCountAsync(tenantId, apiVersion, xApiVersion, trainingProgramDtoCollectionQueryParameters)

Count training programs

Counts training programs for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trainingProgramDtoCollectionQueryParameters : TrainingProgramDtoCollectionQueryParameters =  // TrainingProgramDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getTrainingProgramsCountAsync(tenantId, apiVersion, xApiVersion, trainingProgramDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramsApi#getTrainingProgramsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramsApi#getTrainingProgramsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trainingProgramDtoCollectionQueryParameters** | [**TrainingProgramDtoCollectionQueryParameters**](TrainingProgramDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateTrainingProgramAsync"></a>
# **updateTrainingProgramAsync**
> EmptyEnvelope updateTrainingProgramAsync(programId, tenantId, apiVersion, xApiVersion, trainingProgramUpdateDto)

Update a training program

Updates an existing training program for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrainingProgramsApi()
val programId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trainingProgramUpdateDto : TrainingProgramUpdateDto =  // TrainingProgramUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTrainingProgramAsync(programId, tenantId, apiVersion, xApiVersion, trainingProgramUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrainingProgramsApi#updateTrainingProgramAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrainingProgramsApi#updateTrainingProgramAsync")
    e.printStackTrace()
}
```

### Parameters
| **programId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trainingProgramUpdateDto** | [**TrainingProgramUpdateDto**](TrainingProgramUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

