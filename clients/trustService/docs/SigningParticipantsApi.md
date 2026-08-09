# SigningParticipantsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSigningParticipantByIdAsync**](SigningParticipantsApi.md#getSigningParticipantByIdAsync) | **GET** /api/v2/TrustService/SigningParticipants/{id} | Get signing participant by ID |
| [**getSigningParticipantsAsync**](SigningParticipantsApi.md#getSigningParticipantsAsync) | **GET** /api/v2/TrustService/SigningParticipants | Get all signing participants |
| [**getSigningParticipantsCountAsync**](SigningParticipantsApi.md#getSigningParticipantsCountAsync) | **GET** /api/v2/TrustService/SigningParticipants/Count | Get signing participants count |
| [**markViewedAsync**](SigningParticipantsApi.md#markViewedAsync) | **POST** /api/v2/TrustService/SigningParticipants/{id}/viewed | Mark a participant as having viewed the request |
| [**recordOutcomeAsync**](SigningParticipantsApi.md#recordOutcomeAsync) | **POST** /api/v2/TrustService/SigningParticipants/{id}/outcome | Record a manual/external participant outcome |


<a id="getSigningParticipantByIdAsync"></a>
# **getSigningParticipantByIdAsync**
> SigningParticipantDto getSigningParticipantByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signing participant by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningParticipantsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningParticipantDto = apiInstance.getSigningParticipantByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningParticipantsApi#getSigningParticipantByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningParticipantsApi#getSigningParticipantByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SigningParticipantDto**](SigningParticipantDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningParticipantsAsync"></a>
# **getSigningParticipantsAsync**
> SigningParticipantDtoListEnvelope getSigningParticipantsAsync(tenantId, apiVersion, xApiVersion, signingParticipantDtoCollectionQueryParameters)

Get all signing participants

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningParticipantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingParticipantDtoCollectionQueryParameters : SigningParticipantDtoCollectionQueryParameters =  // SigningParticipantDtoCollectionQueryParameters | 
try {
    val result : SigningParticipantDtoListEnvelope = apiInstance.getSigningParticipantsAsync(tenantId, apiVersion, xApiVersion, signingParticipantDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningParticipantsApi#getSigningParticipantsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningParticipantsApi#getSigningParticipantsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingParticipantDtoCollectionQueryParameters** | [**SigningParticipantDtoCollectionQueryParameters**](SigningParticipantDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SigningParticipantDtoListEnvelope**](SigningParticipantDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSigningParticipantsCountAsync"></a>
# **getSigningParticipantsCountAsync**
> Int32Envelope getSigningParticipantsCountAsync(tenantId, apiVersion, xApiVersion, signingParticipantDtoCollectionQueryParameters)

Get signing participants count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningParticipantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingParticipantDtoCollectionQueryParameters : SigningParticipantDtoCollectionQueryParameters =  // SigningParticipantDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSigningParticipantsCountAsync(tenantId, apiVersion, xApiVersion, signingParticipantDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningParticipantsApi#getSigningParticipantsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningParticipantsApi#getSigningParticipantsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingParticipantDtoCollectionQueryParameters** | [**SigningParticipantDtoCollectionQueryParameters**](SigningParticipantDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="markViewedAsync"></a>
# **markViewedAsync**
> markViewedAsync(id, tenantId, apiVersion, xApiVersion)

Mark a participant as having viewed the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningParticipantsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.markViewedAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SigningParticipantsApi#markViewedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningParticipantsApi#markViewedAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="recordOutcomeAsync"></a>
# **recordOutcomeAsync**
> recordOutcomeAsync(id, tenantId, apiVersion, xApiVersion, recordSigningParticipantOutcomeDto)

Record a manual/external participant outcome

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningParticipantsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val recordSigningParticipantOutcomeDto : RecordSigningParticipantOutcomeDto =  // RecordSigningParticipantOutcomeDto | 
try {
    apiInstance.recordOutcomeAsync(id, tenantId, apiVersion, xApiVersion, recordSigningParticipantOutcomeDto)
} catch (e: ClientException) {
    println("4xx response calling SigningParticipantsApi#recordOutcomeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningParticipantsApi#recordOutcomeAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **recordSigningParticipantOutcomeDto** | [**RecordSigningParticipantOutcomeDto**](RecordSigningParticipantOutcomeDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

