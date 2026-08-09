# SigningRequestsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addParticipantAsync**](SigningRequestsApi.md#addParticipantAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/participants | Add a participant to a signing request |
| [**createFromDocumentAsync**](SigningRequestsApi.md#createFromDocumentAsync) | **POST** /api/v2/TrustService/SigningRequests/from-document/{signedDocumentId} | Create a signing request from a frozen document |
| [**executeProviderAsync**](SigningRequestsApi.md#executeProviderAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/execute-provider | Run a signing provider to produce + finalize the signed artifact |
| [**expireAsync**](SigningRequestsApi.md#expireAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/expire | Expire a signing request |
| [**finalizeAsync**](SigningRequestsApi.md#finalizeAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/finalize | Finalize a completed request into a signed artifact |
| [**getSigningRequestByIdAsync**](SigningRequestsApi.md#getSigningRequestByIdAsync) | **GET** /api/v2/TrustService/SigningRequests/{id} | Get signing request by ID |
| [**getSigningRequestParticipantsAsync**](SigningRequestsApi.md#getSigningRequestParticipantsAsync) | **GET** /api/v2/TrustService/SigningRequests/{id}/Participants | Get participants of a signing request |
| [**getSigningRequestsAsync**](SigningRequestsApi.md#getSigningRequestsAsync) | **GET** /api/v2/TrustService/SigningRequests | Get all signing requests |
| [**getSigningRequestsCountAsync**](SigningRequestsApi.md#getSigningRequestsCountAsync) | **GET** /api/v2/TrustService/SigningRequests/Count | Get signing requests count |
| [**prepareAndCreateAsync**](SigningRequestsApi.md#prepareAndCreateAsync) | **POST** /api/v2/TrustService/SigningRequests/prepare-and-create | Create, store, freeze a document and open a signing request in one call |
| [**sendAsync**](SigningRequestsApi.md#sendAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/send | Send a signing request |
| [**voidAsync**](SigningRequestsApi.md#voidAsync) | **POST** /api/v2/TrustService/SigningRequests/{id}/void | Void a signing request |


<a id="addParticipantAsync"></a>
# **addParticipantAsync**
> SigningParticipantDto addParticipantAsync(id, tenantId, apiVersion, xApiVersion, createSigningParticipantDto)

Add a participant to a signing request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val createSigningParticipantDto : CreateSigningParticipantDto =  // CreateSigningParticipantDto | 
try {
    val result : SigningParticipantDto = apiInstance.addParticipantAsync(id, tenantId, apiVersion, xApiVersion, createSigningParticipantDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#addParticipantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#addParticipantAsync")
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
| **createSigningParticipantDto** | [**CreateSigningParticipantDto**](CreateSigningParticipantDto.md)|  | [optional] |

### Return type

[**SigningParticipantDto**](SigningParticipantDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createFromDocumentAsync"></a>
# **createFromDocumentAsync**
> SigningRequestDto createFromDocumentAsync(signedDocumentId, tenantId, apiVersion, xApiVersion, createSigningRequestDto)

Create a signing request from a frozen document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val signedDocumentId : kotlin.String = signedDocumentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val createSigningRequestDto : CreateSigningRequestDto =  // CreateSigningRequestDto | 
try {
    val result : SigningRequestDto = apiInstance.createFromDocumentAsync(signedDocumentId, tenantId, apiVersion, xApiVersion, createSigningRequestDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#createFromDocumentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#createFromDocumentAsync")
    e.printStackTrace()
}
```

### Parameters
| **signedDocumentId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createSigningRequestDto** | [**CreateSigningRequestDto**](CreateSigningRequestDto.md)|  | [optional] |

### Return type

[**SigningRequestDto**](SigningRequestDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="executeProviderAsync"></a>
# **executeProviderAsync**
> executeProviderAsync(id, tenantId, apiVersion, xApiVersion, executeSigningRequestDto)

Run a signing provider to produce + finalize the signed artifact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val executeSigningRequestDto : ExecuteSigningRequestDto =  // ExecuteSigningRequestDto | 
try {
    apiInstance.executeProviderAsync(id, tenantId, apiVersion, xApiVersion, executeSigningRequestDto)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#executeProviderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#executeProviderAsync")
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
| **executeSigningRequestDto** | [**ExecuteSigningRequestDto**](ExecuteSigningRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="expireAsync"></a>
# **expireAsync**
> expireAsync(id, tenantId, apiVersion, xApiVersion)

Expire a signing request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.expireAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#expireAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#expireAsync")
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

<a id="finalizeAsync"></a>
# **finalizeAsync**
> finalizeAsync(id, tenantId, apiVersion, xApiVersion, finalizeSigningRequestDto)

Finalize a completed request into a signed artifact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val finalizeSigningRequestDto : FinalizeSigningRequestDto =  // FinalizeSigningRequestDto | 
try {
    apiInstance.finalizeAsync(id, tenantId, apiVersion, xApiVersion, finalizeSigningRequestDto)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#finalizeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#finalizeAsync")
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
| **finalizeSigningRequestDto** | [**FinalizeSigningRequestDto**](FinalizeSigningRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSigningRequestByIdAsync"></a>
# **getSigningRequestByIdAsync**
> SigningRequestDto getSigningRequestByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signing request by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningRequestDto = apiInstance.getSigningRequestByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#getSigningRequestByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#getSigningRequestByIdAsync")
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

[**SigningRequestDto**](SigningRequestDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningRequestParticipantsAsync"></a>
# **getSigningRequestParticipantsAsync**
> SigningParticipantDtoListEnvelope getSigningRequestParticipantsAsync(id, tenantId, apiVersion, xApiVersion)

Get participants of a signing request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningParticipantDtoListEnvelope = apiInstance.getSigningRequestParticipantsAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#getSigningRequestParticipantsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#getSigningRequestParticipantsAsync")
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

[**SigningParticipantDtoListEnvelope**](SigningParticipantDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningRequestsAsync"></a>
# **getSigningRequestsAsync**
> SigningRequestDtoListEnvelope getSigningRequestsAsync(tenantId, apiVersion, xApiVersion, signingRequestDtoCollectionQueryParameters)

Get all signing requests

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingRequestDtoCollectionQueryParameters : SigningRequestDtoCollectionQueryParameters =  // SigningRequestDtoCollectionQueryParameters | 
try {
    val result : SigningRequestDtoListEnvelope = apiInstance.getSigningRequestsAsync(tenantId, apiVersion, xApiVersion, signingRequestDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#getSigningRequestsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#getSigningRequestsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingRequestDtoCollectionQueryParameters** | [**SigningRequestDtoCollectionQueryParameters**](SigningRequestDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SigningRequestDtoListEnvelope**](SigningRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSigningRequestsCountAsync"></a>
# **getSigningRequestsCountAsync**
> Int32Envelope getSigningRequestsCountAsync(tenantId, apiVersion, xApiVersion, signingRequestDtoCollectionQueryParameters)

Get signing requests count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingRequestDtoCollectionQueryParameters : SigningRequestDtoCollectionQueryParameters =  // SigningRequestDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSigningRequestsCountAsync(tenantId, apiVersion, xApiVersion, signingRequestDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#getSigningRequestsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#getSigningRequestsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingRequestDtoCollectionQueryParameters** | [**SigningRequestDtoCollectionQueryParameters**](SigningRequestDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="prepareAndCreateAsync"></a>
# **prepareAndCreateAsync**
> SigningRequestDto prepareAndCreateAsync(tenantId, apiVersion, xApiVersion, file, title, contactId, routingMode, expiresAtUtc, message, correlationId, externalReference, signers)

Create, store, freeze a document and open a signing request in one call

Server-owned flow (T-UX4): creates a SignedDocument from the uploaded source, stores it, freezes it, then creates a signing request over the frozen artifact and attaches its signers — all in one unit of work. Evidence truth (status/hashes/ids/tokens) is server-produced; the caller supplies intent only. The server generates the new document id.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val title : kotlin.String = title_example // kotlin.String | 
val contactId : kotlin.String = contactId_example // kotlin.String | 
val routingMode : kotlin.String = routingMode_example // kotlin.String | 
val expiresAtUtc : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | 
val message : kotlin.String = message_example // kotlin.String | 
val correlationId : kotlin.String = correlationId_example // kotlin.String | 
val externalReference : kotlin.String = externalReference_example // kotlin.String | 
val signers : kotlin.String = signers_example // kotlin.String | 
try {
    val result : SigningRequestDto = apiInstance.prepareAndCreateAsync(tenantId, apiVersion, xApiVersion, file, title, contactId, routingMode, expiresAtUtc, message, correlationId, externalReference, signers)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#prepareAndCreateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#prepareAndCreateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| **file** | **java.io.File**|  | [optional] |
| **title** | **kotlin.String**|  | [optional] |
| **contactId** | **kotlin.String**|  | [optional] |
| **routingMode** | **kotlin.String**|  | [optional] [enum: Parallel, Sequential] |
| **expiresAtUtc** | **java.time.OffsetDateTime**|  | [optional] |
| **message** | **kotlin.String**|  | [optional] |
| **correlationId** | **kotlin.String**|  | [optional] |
| **externalReference** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signers** | **kotlin.String**|  | [optional] |

### Return type

[**SigningRequestDto**](SigningRequestDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="sendAsync"></a>
# **sendAsync**
> sendAsync(id, tenantId, apiVersion, xApiVersion)

Send a signing request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.sendAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#sendAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#sendAsync")
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

<a id="voidAsync"></a>
# **voidAsync**
> voidAsync(id, tenantId, apiVersion, xApiVersion, voidSigningRequestDto)

Void a signing request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningRequestsApi()
val id : kotlin.String = id_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val voidSigningRequestDto : VoidSigningRequestDto =  // VoidSigningRequestDto | 
try {
    apiInstance.voidAsync(id, tenantId, apiVersion, xApiVersion, voidSigningRequestDto)
} catch (e: ClientException) {
    println("4xx response calling SigningRequestsApi#voidAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningRequestsApi#voidAsync")
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
| **voidSigningRequestDto** | [**VoidSigningRequestDto**](VoidSigningRequestDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

