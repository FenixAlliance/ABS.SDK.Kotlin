# SignedDocumentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSignedDocumentAsync**](SignedDocumentsApi.md#createSignedDocumentAsync) | **POST** /api/v2/TrustService/SignedDocuments | Create a new signed document |
| [**deleteSignedDocumentAsync**](SignedDocumentsApi.md#deleteSignedDocumentAsync) | **DELETE** /api/v2/TrustService/SignedDocuments/{id} | Delete a signed document |
| [**getSignedDocumentByIdAsync**](SignedDocumentsApi.md#getSignedDocumentByIdAsync) | **GET** /api/v2/TrustService/SignedDocuments/{id} | Get signed document by ID |
| [**getSignedDocumentsAsync**](SignedDocumentsApi.md#getSignedDocumentsAsync) | **GET** /api/v2/TrustService/SignedDocuments | Get all signed documents |
| [**getSignedDocumentsCountAsync**](SignedDocumentsApi.md#getSignedDocumentsCountAsync) | **GET** /api/v2/TrustService/SignedDocuments/Count | Get signed documents count |
| [**patchSignedDocumentAsync**](SignedDocumentsApi.md#patchSignedDocumentAsync) | **PATCH** /api/v2/TrustService/SignedDocuments/{id} | Patch a signed document |
| [**prepareAndQuickSignAsync**](SignedDocumentsApi.md#prepareAndQuickSignAsync) | **POST** /api/v2/TrustService/SignedDocuments/prepare-and-quick-sign | Create, freeze, and quick-sign a document in one call |
| [**quickSignSignedDocumentAsync**](SignedDocumentsApi.md#quickSignSignedDocumentAsync) | **POST** /api/v2/TrustService/SignedDocuments/{id}/quick-sign | Quick-sign a frozen document |
| [**updateSignedDocumentAsync**](SignedDocumentsApi.md#updateSignedDocumentAsync) | **PUT** /api/v2/TrustService/SignedDocuments/{id} | Update a signed document |
| [**verifySignedDocumentSignatureAsync**](SignedDocumentsApi.md#verifySignedDocumentSignatureAsync) | **GET** /api/v2/TrustService/SignedDocuments/{id}/verify-signature | Verify a signed document&#39;s signature |


<a id="createSignedDocumentAsync"></a>
# **createSignedDocumentAsync**
> createSignedDocumentAsync(tenantId, apiVersion, xApiVersion, signedDocumentCreateDto)

Create a new signed document

Creates a new signed document for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signedDocumentCreateDto : SignedDocumentCreateDto =  // SignedDocumentCreateDto | 
try {
    apiInstance.createSignedDocumentAsync(tenantId, apiVersion, xApiVersion, signedDocumentCreateDto)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#createSignedDocumentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#createSignedDocumentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signedDocumentCreateDto** | [**SignedDocumentCreateDto**](SignedDocumentCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSignedDocumentAsync"></a>
# **deleteSignedDocumentAsync**
> deleteSignedDocumentAsync(id, tenantId, apiVersion, xApiVersion)

Delete a signed document

Deletes a signed document for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteSignedDocumentAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#deleteSignedDocumentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#deleteSignedDocumentAsync")
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

<a id="getSignedDocumentByIdAsync"></a>
# **getSignedDocumentByIdAsync**
> SignedDocumentDto getSignedDocumentByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signed document by ID

Retrieves a specific signed document by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SignedDocumentDto = apiInstance.getSignedDocumentByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#getSignedDocumentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#getSignedDocumentByIdAsync")
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

[**SignedDocumentDto**](SignedDocumentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSignedDocumentsAsync"></a>
# **getSignedDocumentsAsync**
> SignedDocumentDtoListEnvelope getSignedDocumentsAsync(tenantId, apiVersion, xApiVersion)

Get all signed documents

Retrieves all signed documents for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SignedDocumentDtoListEnvelope = apiInstance.getSignedDocumentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#getSignedDocumentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#getSignedDocumentsAsync")
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

[**SignedDocumentDtoListEnvelope**](SignedDocumentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSignedDocumentsCountAsync"></a>
# **getSignedDocumentsCountAsync**
> Int32Envelope getSignedDocumentsCountAsync(tenantId, apiVersion, xApiVersion)

Get signed documents count

Returns the count of signed documents for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSignedDocumentsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#getSignedDocumentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#getSignedDocumentsCountAsync")
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

<a id="patchSignedDocumentAsync"></a>
# **patchSignedDocumentAsync**
> EmptyEnvelope patchSignedDocumentAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a signed document

Patch a signed document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSignedDocumentAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#patchSignedDocumentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#patchSignedDocumentAsync")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="prepareAndQuickSignAsync"></a>
# **prepareAndQuickSignAsync**
> SignedDocumentDto prepareAndQuickSignAsync(tenantId, apiVersion, xApiVersion, id, file, title, contactId, signingCertificateId, signingProfileId, providerName)

Create, freeze, and quick-sign a document in one call

Server-side single-signer flow: creates a SignedDocument from the uploaded source, stores it, freezes it, signs it with the chosen certificate + provider, and seals it — all in one unit of work. Returns the sealed document. Evidence truth (signed/status/hashes/artifact ids) is server-produced and cannot be supplied by the caller.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val title : kotlin.String = title_example // kotlin.String | 
val contactId : kotlin.String = contactId_example // kotlin.String | 
val signingCertificateId : kotlin.String = signingCertificateId_example // kotlin.String | 
val signingProfileId : kotlin.String = signingProfileId_example // kotlin.String | 
val providerName : kotlin.String = providerName_example // kotlin.String | 
try {
    val result : SignedDocumentDto = apiInstance.prepareAndQuickSignAsync(tenantId, apiVersion, xApiVersion, id, file, title, contactId, signingCertificateId, signingProfileId, providerName)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#prepareAndQuickSignAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#prepareAndQuickSignAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| **id** | **java.util.UUID**|  | [optional] |
| **file** | **java.io.File**|  | [optional] |
| **title** | **kotlin.String**|  | [optional] |
| **contactId** | **kotlin.String**|  | [optional] |
| **signingCertificateId** | **kotlin.String**|  | [optional] |
| **signingProfileId** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **providerName** | **kotlin.String**|  | [optional] |

### Return type

[**SignedDocumentDto**](SignedDocumentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="quickSignSignedDocumentAsync"></a>
# **quickSignSignedDocumentAsync**
> quickSignSignedDocumentAsync(id, tenantId, apiVersion, xApiVersion, quickSignSignedDocumentDto)

Quick-sign a frozen document

Signs a frozen signed document directly with a chosen certificate + provider (no signing-request workflow) and seals it. Returns the sealed document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val quickSignSignedDocumentDto : QuickSignSignedDocumentDto =  // QuickSignSignedDocumentDto | 
try {
    apiInstance.quickSignSignedDocumentAsync(id, tenantId, apiVersion, xApiVersion, quickSignSignedDocumentDto)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#quickSignSignedDocumentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#quickSignSignedDocumentAsync")
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
| **quickSignSignedDocumentDto** | [**QuickSignSignedDocumentDto**](QuickSignSignedDocumentDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSignedDocumentAsync"></a>
# **updateSignedDocumentAsync**
> updateSignedDocumentAsync(id, tenantId, apiVersion, xApiVersion, signedDocumentUpdateDto)

Update a signed document

Updates an existing signed document for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signedDocumentUpdateDto : SignedDocumentUpdateDto =  // SignedDocumentUpdateDto | 
try {
    apiInstance.updateSignedDocumentAsync(id, tenantId, apiVersion, xApiVersion, signedDocumentUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#updateSignedDocumentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#updateSignedDocumentAsync")
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
| **signedDocumentUpdateDto** | [**SignedDocumentUpdateDto**](SignedDocumentUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="verifySignedDocumentSignatureAsync"></a>
# **verifySignedDocumentSignatureAsync**
> SignatureVerificationDto verifySignedDocumentSignatureAsync(id, tenantId, apiVersion, xApiVersion)

Verify a signed document&#39;s signature

Re-verifies the document&#39;s signature against its stored signed artifact (bytes intact + signed by the embedded certificate; certificate trust is a separate concern).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SignatureVerificationDto = apiInstance.verifySignedDocumentSignatureAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentsApi#verifySignedDocumentSignatureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentsApi#verifySignedDocumentSignatureAsync")
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

[**SignatureVerificationDto**](SignatureVerificationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

