# SignedDocumentArtifactsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**freezeAsync**](SignedDocumentArtifactsApi.md#freezeAsync) | **POST** /api/v2/TrustService/SignedDocumentArtifacts/{signedDocumentId}/freeze | Freeze the source for signature |
| [**getReferenceAsync**](SignedDocumentArtifactsApi.md#getReferenceAsync) | **GET** /api/v2/TrustService/SignedDocumentArtifacts/reference/{fileUploadId} | Get an artifact reference |
| [**setPrimaryAuthoringFileAsync**](SignedDocumentArtifactsApi.md#setPrimaryAuthoringFileAsync) | **PUT** /api/v2/TrustService/SignedDocumentArtifacts/{signedDocumentId}/primary-file/{fileUploadId} | Set the primary authoring file |
| [**verifyAsync**](SignedDocumentArtifactsApi.md#verifyAsync) | **GET** /api/v2/TrustService/SignedDocumentArtifacts/reference/{fileUploadId}/verify | Verify an artifact hash |


<a id="freezeAsync"></a>
# **freezeAsync**
> TrustArtifactReferenceDtoEnvelope freezeAsync(signedDocumentId, tenantId, apiVersion, xApiVersion)

Freeze the source for signature

Copies the primary authoring artifact into a new Sealed frozen-source artifact, hashes it, and binds it to the document (LockState &#x3D; FrozenForSignature).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentArtifactsApi()
val signedDocumentId : kotlin.String = signedDocumentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrustArtifactReferenceDtoEnvelope = apiInstance.freezeAsync(signedDocumentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentArtifactsApi#freezeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentArtifactsApi#freezeAsync")
    e.printStackTrace()
}
```

### Parameters
| **signedDocumentId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TrustArtifactReferenceDtoEnvelope**](TrustArtifactReferenceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReferenceAsync"></a>
# **getReferenceAsync**
> TrustArtifactReferenceDtoEnvelope getReferenceAsync(fileUploadId, tenantId, apiVersion, xApiVersion)

Get an artifact reference

Resolves a stored artifact&#39;s reference (FileUpload id + key + hash + media hints).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentArtifactsApi()
val fileUploadId : kotlin.String = fileUploadId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrustArtifactReferenceDtoEnvelope = apiInstance.getReferenceAsync(fileUploadId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentArtifactsApi#getReferenceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentArtifactsApi#getReferenceAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileUploadId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TrustArtifactReferenceDtoEnvelope**](TrustArtifactReferenceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="setPrimaryAuthoringFileAsync"></a>
# **setPrimaryAuthoringFileAsync**
> setPrimaryAuthoringFileAsync(signedDocumentId, fileUploadId, tenantId, apiVersion, xApiVersion)

Set the primary authoring file

Links an existing scan-gated FileUpload as the document&#39;s mutable authoring artifact (only while editable).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentArtifactsApi()
val signedDocumentId : kotlin.String = signedDocumentId_example // kotlin.String | 
val fileUploadId : kotlin.String = fileUploadId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.setPrimaryAuthoringFileAsync(signedDocumentId, fileUploadId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentArtifactsApi#setPrimaryAuthoringFileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentArtifactsApi#setPrimaryAuthoringFileAsync")
    e.printStackTrace()
}
```

### Parameters
| **signedDocumentId** | **kotlin.String**|  | |
| **fileUploadId** | **kotlin.String**|  | |
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

<a id="verifyAsync"></a>
# **verifyAsync**
> BooleanEnvelope verifyAsync(fileUploadId, tenantId, apiVersion, xApiVersion)

Verify an artifact hash

Re-reads the artifact bytes and verifies them against the recorded SHA-256. Returns true on match.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignedDocumentArtifactsApi()
val fileUploadId : kotlin.String = fileUploadId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BooleanEnvelope = apiInstance.verifyAsync(fileUploadId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignedDocumentArtifactsApi#verifyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignedDocumentArtifactsApi#verifyAsync")
    e.printStackTrace()
}
```

### Parameters
| **fileUploadId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

