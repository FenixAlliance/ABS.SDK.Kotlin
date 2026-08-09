# ProofsOfDeliveryApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addProofOfDeliveryLineAsync**](ProofsOfDeliveryApi.md#addProofOfDeliveryLineAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines | Add a line to proof of delivery |
| [**attachDeliveryNoteAsync**](ProofsOfDeliveryApi.md#attachDeliveryNoteAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/DeliveryNotes/{noteId} | Attach a delivery note |
| [**createProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#createProofOfDeliveryAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery | Create a proof of delivery |
| [**deleteProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#deleteProofOfDeliveryAsync) | **DELETE** /api/v2/LogisticsService/ProofsOfDelivery/{podId} | Delete a proof of delivery |
| [**detachDeliveryNoteAsync**](ProofsOfDeliveryApi.md#detachDeliveryNoteAsync) | **DELETE** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/DeliveryNotes/{noteId} | Detach a delivery note |
| [**disputeProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#disputeProofOfDeliveryAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Dispute | Dispute a proof of delivery |
| [**getProofOfDeliveryByIdAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryByIdAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId} | Get proof of delivery by ID |
| [**getProofOfDeliveryDeliveryNotesAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryDeliveryNotesAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/DeliveryNotes | Get attached delivery notes |
| [**getProofOfDeliveryDeliveryNotesCountAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryDeliveryNotesCountAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/DeliveryNotes/Count | Get delivery notes count |
| [**getProofOfDeliveryLinesAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryLinesAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines | Get proof of delivery lines |
| [**getProofOfDeliveryLinesCountAsync**](ProofsOfDeliveryApi.md#getProofOfDeliveryLinesCountAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines/Count | Get proof of delivery lines count |
| [**getProofsOfDeliveryAsync**](ProofsOfDeliveryApi.md#getProofsOfDeliveryAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery | Get all proofs of delivery |
| [**getProofsOfDeliveryCountAsync**](ProofsOfDeliveryApi.md#getProofsOfDeliveryCountAsync) | **GET** /api/v2/LogisticsService/ProofsOfDelivery/Count | Get proofs of delivery count |
| [**patchProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#patchProofOfDeliveryAsync) | **PATCH** /api/v2/LogisticsService/ProofsOfDelivery/{podId} | Patch a proof of delivery |
| [**patchProofOfDeliveryLineAsync**](ProofsOfDeliveryApi.md#patchProofOfDeliveryLineAsync) | **PATCH** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines/{lineId} | Patch a proof of delivery line |
| [**rejectProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#rejectProofOfDeliveryAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Reject | Reject a proof of delivery |
| [**removeProofOfDeliveryLineAsync**](ProofsOfDeliveryApi.md#removeProofOfDeliveryLineAsync) | **DELETE** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines/{lineId} | Remove a proof of delivery line |
| [**signProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#signProofOfDeliveryAsync) | **POST** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Sign | Sign a proof of delivery |
| [**updateProofOfDeliveryAsync**](ProofsOfDeliveryApi.md#updateProofOfDeliveryAsync) | **PUT** /api/v2/LogisticsService/ProofsOfDelivery/{podId} | Update a proof of delivery |
| [**updateProofOfDeliveryLineAsync**](ProofsOfDeliveryApi.md#updateProofOfDeliveryLineAsync) | **PUT** /api/v2/LogisticsService/ProofsOfDelivery/{podId}/Lines/{lineId} | Update a proof of delivery line |


<a id="addProofOfDeliveryLineAsync"></a>
# **addProofOfDeliveryLineAsync**
> EmptyEnvelope addProofOfDeliveryLineAsync(podId, tenantId, apiVersion, xApiVersion, proofOfDeliveryLineCreateDto)

Add a line to proof of delivery

Adds a new line to a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val proofOfDeliveryLineCreateDto : ProofOfDeliveryLineCreateDto =  // ProofOfDeliveryLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.addProofOfDeliveryLineAsync(podId, tenantId, apiVersion, xApiVersion, proofOfDeliveryLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#addProofOfDeliveryLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#addProofOfDeliveryLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **proofOfDeliveryLineCreateDto** | [**ProofOfDeliveryLineCreateDto**](ProofOfDeliveryLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="attachDeliveryNoteAsync"></a>
# **attachDeliveryNoteAsync**
> EmptyEnvelope attachDeliveryNoteAsync(podId, noteId, tenantId, apiVersion, xApiVersion)

Attach a delivery note

Attaches a delivery note to a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val noteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.attachDeliveryNoteAsync(podId, noteId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#attachDeliveryNoteAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#attachDeliveryNoteAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **noteId** | **java.util.UUID**|  | |
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

<a id="createProofOfDeliveryAsync"></a>
# **createProofOfDeliveryAsync**
> EmptyEnvelope createProofOfDeliveryAsync(tenantId, apiVersion, xApiVersion, proofOfDeliveryCreateDto)

Create a proof of delivery

Creates a new proof of delivery for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val proofOfDeliveryCreateDto : ProofOfDeliveryCreateDto =  // ProofOfDeliveryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createProofOfDeliveryAsync(tenantId, apiVersion, xApiVersion, proofOfDeliveryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#createProofOfDeliveryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#createProofOfDeliveryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **proofOfDeliveryCreateDto** | [**ProofOfDeliveryCreateDto**](ProofOfDeliveryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteProofOfDeliveryAsync"></a>
# **deleteProofOfDeliveryAsync**
> EmptyEnvelope deleteProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion)

Delete a proof of delivery

Deletes a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#deleteProofOfDeliveryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#deleteProofOfDeliveryAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
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

<a id="detachDeliveryNoteAsync"></a>
# **detachDeliveryNoteAsync**
> EmptyEnvelope detachDeliveryNoteAsync(podId, noteId, tenantId, apiVersion, xApiVersion)

Detach a delivery note

Detaches a delivery note from a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val noteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.detachDeliveryNoteAsync(podId, noteId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#detachDeliveryNoteAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#detachDeliveryNoteAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **noteId** | **java.util.UUID**|  | |
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

<a id="disputeProofOfDeliveryAsync"></a>
# **disputeProofOfDeliveryAsync**
> EmptyEnvelope disputeProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, disputeProofOfDeliveryRequest)

Dispute a proof of delivery

Disputes a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val disputeProofOfDeliveryRequest : DisputeProofOfDeliveryRequest =  // DisputeProofOfDeliveryRequest | 
try {
    val result : EmptyEnvelope = apiInstance.disputeProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, disputeProofOfDeliveryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#disputeProofOfDeliveryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#disputeProofOfDeliveryAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **disputeProofOfDeliveryRequest** | [**DisputeProofOfDeliveryRequest**](DisputeProofOfDeliveryRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getProofOfDeliveryByIdAsync"></a>
# **getProofOfDeliveryByIdAsync**
> ProofOfDeliveryDtoEnvelope getProofOfDeliveryByIdAsync(podId, tenantId, apiVersion, xApiVersion)

Get proof of delivery by ID

Retrieves a specific proof of delivery by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProofOfDeliveryDtoEnvelope = apiInstance.getProofOfDeliveryByIdAsync(podId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#getProofOfDeliveryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#getProofOfDeliveryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ProofOfDeliveryDtoEnvelope**](ProofOfDeliveryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProofOfDeliveryDeliveryNotesAsync"></a>
# **getProofOfDeliveryDeliveryNotesAsync**
> DeliveryNoteDtoListEnvelope getProofOfDeliveryDeliveryNotesAsync(podId, tenantId, apiVersion, xApiVersion)

Get attached delivery notes

Retrieves all delivery notes attached to a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DeliveryNoteDtoListEnvelope = apiInstance.getProofOfDeliveryDeliveryNotesAsync(podId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#getProofOfDeliveryDeliveryNotesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#getProofOfDeliveryDeliveryNotesAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**DeliveryNoteDtoListEnvelope**](DeliveryNoteDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProofOfDeliveryDeliveryNotesCountAsync"></a>
# **getProofOfDeliveryDeliveryNotesCountAsync**
> Int32Envelope getProofOfDeliveryDeliveryNotesCountAsync(podId, tenantId, apiVersion, xApiVersion)

Get delivery notes count

Returns the count of delivery notes attached to a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getProofOfDeliveryDeliveryNotesCountAsync(podId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#getProofOfDeliveryDeliveryNotesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#getProofOfDeliveryDeliveryNotesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
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

<a id="getProofOfDeliveryLinesAsync"></a>
# **getProofOfDeliveryLinesAsync**
> ProofOfDeliveryLineDtoListEnvelope getProofOfDeliveryLinesAsync(podId, tenantId, apiVersion, xApiVersion, proofOfDeliveryLineDtoCollectionQueryParameters)

Get proof of delivery lines

Retrieves all lines for a specific proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val proofOfDeliveryLineDtoCollectionQueryParameters : ProofOfDeliveryLineDtoCollectionQueryParameters =  // ProofOfDeliveryLineDtoCollectionQueryParameters | 
try {
    val result : ProofOfDeliveryLineDtoListEnvelope = apiInstance.getProofOfDeliveryLinesAsync(podId, tenantId, apiVersion, xApiVersion, proofOfDeliveryLineDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#getProofOfDeliveryLinesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#getProofOfDeliveryLinesAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **proofOfDeliveryLineDtoCollectionQueryParameters** | [**ProofOfDeliveryLineDtoCollectionQueryParameters**](ProofOfDeliveryLineDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ProofOfDeliveryLineDtoListEnvelope**](ProofOfDeliveryLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getProofOfDeliveryLinesCountAsync"></a>
# **getProofOfDeliveryLinesCountAsync**
> Int32Envelope getProofOfDeliveryLinesCountAsync(podId, tenantId, apiVersion, xApiVersion, proofOfDeliveryLineDtoCollectionQueryParameters)

Get proof of delivery lines count

Returns the count of lines for a specific proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val proofOfDeliveryLineDtoCollectionQueryParameters : ProofOfDeliveryLineDtoCollectionQueryParameters =  // ProofOfDeliveryLineDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getProofOfDeliveryLinesCountAsync(podId, tenantId, apiVersion, xApiVersion, proofOfDeliveryLineDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#getProofOfDeliveryLinesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#getProofOfDeliveryLinesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **proofOfDeliveryLineDtoCollectionQueryParameters** | [**ProofOfDeliveryLineDtoCollectionQueryParameters**](ProofOfDeliveryLineDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getProofsOfDeliveryAsync"></a>
# **getProofsOfDeliveryAsync**
> ProofOfDeliveryDtoListEnvelope getProofsOfDeliveryAsync(tenantId, apiVersion, xApiVersion, proofOfDeliveryDtoCollectionQueryParameters)

Get all proofs of delivery

Retrieves all proofs of delivery for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val proofOfDeliveryDtoCollectionQueryParameters : ProofOfDeliveryDtoCollectionQueryParameters =  // ProofOfDeliveryDtoCollectionQueryParameters | 
try {
    val result : ProofOfDeliveryDtoListEnvelope = apiInstance.getProofsOfDeliveryAsync(tenantId, apiVersion, xApiVersion, proofOfDeliveryDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#getProofsOfDeliveryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#getProofsOfDeliveryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **proofOfDeliveryDtoCollectionQueryParameters** | [**ProofOfDeliveryDtoCollectionQueryParameters**](ProofOfDeliveryDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ProofOfDeliveryDtoListEnvelope**](ProofOfDeliveryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getProofsOfDeliveryCountAsync"></a>
# **getProofsOfDeliveryCountAsync**
> Int32Envelope getProofsOfDeliveryCountAsync(tenantId, apiVersion, xApiVersion, proofOfDeliveryDtoCollectionQueryParameters)

Get proofs of delivery count

Returns the count of proofs of delivery for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val proofOfDeliveryDtoCollectionQueryParameters : ProofOfDeliveryDtoCollectionQueryParameters =  // ProofOfDeliveryDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getProofsOfDeliveryCountAsync(tenantId, apiVersion, xApiVersion, proofOfDeliveryDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#getProofsOfDeliveryCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#getProofsOfDeliveryCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **proofOfDeliveryDtoCollectionQueryParameters** | [**ProofOfDeliveryDtoCollectionQueryParameters**](ProofOfDeliveryDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchProofOfDeliveryAsync"></a>
# **patchProofOfDeliveryAsync**
> EmptyEnvelope patchProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a proof of delivery

Partially updates an existing proof of delivery using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#patchProofOfDeliveryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#patchProofOfDeliveryAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
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

<a id="patchProofOfDeliveryLineAsync"></a>
# **patchProofOfDeliveryLineAsync**
> EmptyEnvelope patchProofOfDeliveryLineAsync(podId, lineId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a proof of delivery line

Partially updates an existing proof of delivery line using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchProofOfDeliveryLineAsync(podId, lineId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#patchProofOfDeliveryLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#patchProofOfDeliveryLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
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

<a id="rejectProofOfDeliveryAsync"></a>
# **rejectProofOfDeliveryAsync**
> EmptyEnvelope rejectProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, rejectProofOfDeliveryRequest)

Reject a proof of delivery

Rejects a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val rejectProofOfDeliveryRequest : RejectProofOfDeliveryRequest =  // RejectProofOfDeliveryRequest | 
try {
    val result : EmptyEnvelope = apiInstance.rejectProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, rejectProofOfDeliveryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#rejectProofOfDeliveryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#rejectProofOfDeliveryAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **rejectProofOfDeliveryRequest** | [**RejectProofOfDeliveryRequest**](RejectProofOfDeliveryRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="removeProofOfDeliveryLineAsync"></a>
# **removeProofOfDeliveryLineAsync**
> EmptyEnvelope removeProofOfDeliveryLineAsync(podId, lineId, tenantId, apiVersion, xApiVersion)

Remove a proof of delivery line

Removes a line from a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.removeProofOfDeliveryLineAsync(podId, lineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#removeProofOfDeliveryLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#removeProofOfDeliveryLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
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

<a id="signProofOfDeliveryAsync"></a>
# **signProofOfDeliveryAsync**
> EmptyEnvelope signProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, signProofOfDeliveryRequest)

Sign a proof of delivery

Signs a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signProofOfDeliveryRequest : SignProofOfDeliveryRequest =  // SignProofOfDeliveryRequest | 
try {
    val result : EmptyEnvelope = apiInstance.signProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, signProofOfDeliveryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#signProofOfDeliveryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#signProofOfDeliveryAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signProofOfDeliveryRequest** | [**SignProofOfDeliveryRequest**](SignProofOfDeliveryRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProofOfDeliveryAsync"></a>
# **updateProofOfDeliveryAsync**
> EmptyEnvelope updateProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, proofOfDeliveryUpdateDto)

Update a proof of delivery

Updates an existing proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val proofOfDeliveryUpdateDto : ProofOfDeliveryUpdateDto =  // ProofOfDeliveryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateProofOfDeliveryAsync(podId, tenantId, apiVersion, xApiVersion, proofOfDeliveryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#updateProofOfDeliveryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#updateProofOfDeliveryAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **proofOfDeliveryUpdateDto** | [**ProofOfDeliveryUpdateDto**](ProofOfDeliveryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProofOfDeliveryLineAsync"></a>
# **updateProofOfDeliveryLineAsync**
> EmptyEnvelope updateProofOfDeliveryLineAsync(podId, lineId, tenantId, apiVersion, xApiVersion, proofOfDeliveryLineUpdateDto)

Update a proof of delivery line

Updates an existing line on a proof of delivery.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProofsOfDeliveryApi()
val podId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val proofOfDeliveryLineUpdateDto : ProofOfDeliveryLineUpdateDto =  // ProofOfDeliveryLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateProofOfDeliveryLineAsync(podId, lineId, tenantId, apiVersion, xApiVersion, proofOfDeliveryLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProofsOfDeliveryApi#updateProofOfDeliveryLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProofsOfDeliveryApi#updateProofOfDeliveryLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **podId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **proofOfDeliveryLineUpdateDto** | [**ProofOfDeliveryLineUpdateDto**](ProofOfDeliveryLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

