# SignedDocumentAttachmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSignedDocumentAttachmentAsync**](SignedDocumentAttachmentsApi.md#createSignedDocumentAttachmentAsync) | **POST** /api/v2/TrustService/SignedDocumentAttachments | Create a new signed document attachment |
| [**deleteSignedDocumentAttachmentAsync**](SignedDocumentAttachmentsApi.md#deleteSignedDocumentAttachmentAsync) | **DELETE** /api/v2/TrustService/SignedDocumentAttachments/{id} | Delete a signed document attachment |
| [**getSignedDocumentAttachmentByIdAsync**](SignedDocumentAttachmentsApi.md#getSignedDocumentAttachmentByIdAsync) | **GET** /api/v2/TrustService/SignedDocumentAttachments/{id} | Get signed document attachment by ID |
| [**getSignedDocumentAttachmentsAsync**](SignedDocumentAttachmentsApi.md#getSignedDocumentAttachmentsAsync) | **GET** /api/v2/TrustService/SignedDocumentAttachments | Get all signed document attachments |
| [**getSignedDocumentAttachmentsCountAsync**](SignedDocumentAttachmentsApi.md#getSignedDocumentAttachmentsCountAsync) | **GET** /api/v2/TrustService/SignedDocumentAttachments/Count | Get signed document attachments count |
| [**patchSignedDocumentAttachmentAsync**](SignedDocumentAttachmentsApi.md#patchSignedDocumentAttachmentAsync) | **PATCH** /api/v2/TrustService/SignedDocumentAttachments/{id} | Patch a signed document attachment |
| [**updateSignedDocumentAttachmentAsync**](SignedDocumentAttachmentsApi.md#updateSignedDocumentAttachmentAsync) | **PUT** /api/v2/TrustService/SignedDocumentAttachments/{id} | Update a signed document attachment |


<a id="createSignedDocumentAttachmentAsync"></a>
# **createSignedDocumentAttachmentAsync**
> createSignedDocumentAttachmentAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentCreateDto)

Create a new signed document attachment

Links an already-stored file to a SignedDocument (metadata + Storage pointer; no bytes).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signedDocumentAttachmentCreateDto : SignedDocumentAttachmentCreateDto =  // SignedDocumentAttachmentCreateDto | 
try {
    apiInstance.createSignedDocumentAttachmentAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentCreateDto)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentAttachmentsApi#createSignedDocumentAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentAttachmentsApi#createSignedDocumentAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signedDocumentAttachmentCreateDto** | [**SignedDocumentAttachmentCreateDto**](SignedDocumentAttachmentCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSignedDocumentAttachmentAsync"></a>
# **deleteSignedDocumentAttachmentAsync**
> deleteSignedDocumentAttachmentAsync(id, tenantId, apiVersion, xApiVersion)

Delete a signed document attachment

Deletes a signed document attachment link for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentAttachmentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteSignedDocumentAttachmentAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentAttachmentsApi#deleteSignedDocumentAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentAttachmentsApi#deleteSignedDocumentAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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
 - **Accept**: application/json

<a id="getSignedDocumentAttachmentByIdAsync"></a>
# **getSignedDocumentAttachmentByIdAsync**
> SignedDocumentAttachmentDto getSignedDocumentAttachmentByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signed document attachment by ID

Retrieves a specific signed document attachment by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentAttachmentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SignedDocumentAttachmentDto = apiInstance.getSignedDocumentAttachmentByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SignedDocumentAttachmentDto**](SignedDocumentAttachmentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSignedDocumentAttachmentsAsync"></a>
# **getSignedDocumentAttachmentsAsync**
> SignedDocumentAttachmentDtoListEnvelope getSignedDocumentAttachmentsAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentDtoCollectionQueryParameters)

Get all signed document attachments

Retrieves all signed document attachments for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signedDocumentAttachmentDtoCollectionQueryParameters : SignedDocumentAttachmentDtoCollectionQueryParameters =  // SignedDocumentAttachmentDtoCollectionQueryParameters | 
try {
    val result : SignedDocumentAttachmentDtoListEnvelope = apiInstance.getSignedDocumentAttachmentsAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signedDocumentAttachmentDtoCollectionQueryParameters** | [**SignedDocumentAttachmentDtoCollectionQueryParameters**](SignedDocumentAttachmentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SignedDocumentAttachmentDtoListEnvelope**](SignedDocumentAttachmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSignedDocumentAttachmentsCountAsync"></a>
# **getSignedDocumentAttachmentsCountAsync**
> Int32Envelope getSignedDocumentAttachmentsCountAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentDtoCollectionQueryParameters)

Get signed document attachments count

Returns the count of signed document attachments for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signedDocumentAttachmentDtoCollectionQueryParameters : SignedDocumentAttachmentDtoCollectionQueryParameters =  // SignedDocumentAttachmentDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSignedDocumentAttachmentsCountAsync(tenantId, apiVersion, xApiVersion, signedDocumentAttachmentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentAttachmentsApi#getSignedDocumentAttachmentsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signedDocumentAttachmentDtoCollectionQueryParameters** | [**SignedDocumentAttachmentDtoCollectionQueryParameters**](SignedDocumentAttachmentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchSignedDocumentAttachmentAsync"></a>
# **patchSignedDocumentAttachmentAsync**
> EmptyEnvelope patchSignedDocumentAttachmentAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a signed document attachment

Patch a signed document attachment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentAttachmentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSignedDocumentAttachmentAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentAttachmentsApi#patchSignedDocumentAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentAttachmentsApi#patchSignedDocumentAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="updateSignedDocumentAttachmentAsync"></a>
# **updateSignedDocumentAttachmentAsync**
> updateSignedDocumentAttachmentAsync(id, tenantId, apiVersion, xApiVersion, signedDocumentAttachmentUpdateDto)

Update a signed document attachment

Updates signed document attachment metadata for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentAttachmentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signedDocumentAttachmentUpdateDto : SignedDocumentAttachmentUpdateDto =  // SignedDocumentAttachmentUpdateDto | 
try {
    apiInstance.updateSignedDocumentAttachmentAsync(id, tenantId, apiVersion, xApiVersion, signedDocumentAttachmentUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentAttachmentsApi#updateSignedDocumentAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentAttachmentsApi#updateSignedDocumentAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signedDocumentAttachmentUpdateDto** | [**SignedDocumentAttachmentUpdateDto**](SignedDocumentAttachmentUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

