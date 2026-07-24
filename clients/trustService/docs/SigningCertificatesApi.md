# SigningCertificatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSigningCertificateAsync**](SigningCertificatesApi.md#createSigningCertificateAsync) | **POST** /api/v2/TrustService/SigningCertificates | Create a new signing certificate |
| [**deleteSigningCertificateAsync**](SigningCertificatesApi.md#deleteSigningCertificateAsync) | **DELETE** /api/v2/TrustService/SigningCertificates/{id} | Delete a signing certificate |
| [**getSigningCertificateByIdAsync**](SigningCertificatesApi.md#getSigningCertificateByIdAsync) | **GET** /api/v2/TrustService/SigningCertificates/{id} | Get signing certificate by ID |
| [**getSigningCertificatesAsync**](SigningCertificatesApi.md#getSigningCertificatesAsync) | **GET** /api/v2/TrustService/SigningCertificates | Get all signing certificates |
| [**getSigningCertificatesCountAsync**](SigningCertificatesApi.md#getSigningCertificatesCountAsync) | **GET** /api/v2/TrustService/SigningCertificates/Count | Get signing certificates count |
| [**importSigningCertificateAsync**](SigningCertificatesApi.md#importSigningCertificateAsync) | **POST** /api/v2/TrustService/SigningCertificates/Import | Import a PFX/P12 signing certificate into custody |
| [**patchSigningCertificateAsync**](SigningCertificatesApi.md#patchSigningCertificateAsync) | **PATCH** /api/v2/TrustService/SigningCertificates/{id} | Patch a signing certificate |
| [**updateSigningCertificateAsync**](SigningCertificatesApi.md#updateSigningCertificateAsync) | **PUT** /api/v2/TrustService/SigningCertificates/{id} | Update a signing certificate |


<a id="createSigningCertificateAsync"></a>
# **createSigningCertificateAsync**
> createSigningCertificateAsync(tenantId, apiVersion, xApiVersion, signingCertificateCreateDto)

Create a new signing certificate

Creates a new signing certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingCertificateCreateDto : SigningCertificateCreateDto =  // SigningCertificateCreateDto | 
try {
    apiInstance.createSigningCertificateAsync(tenantId, apiVersion, xApiVersion, signingCertificateCreateDto)
} catch (e: ClientException) {
    println("4xx response calling SigningCertificatesApi#createSigningCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCertificatesApi#createSigningCertificateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingCertificateCreateDto** | [**SigningCertificateCreateDto**](SigningCertificateCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSigningCertificateAsync"></a>
# **deleteSigningCertificateAsync**
> deleteSigningCertificateAsync(id, tenantId, apiVersion, xApiVersion)

Delete a signing certificate

Deletes a signing certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteSigningCertificateAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SigningCertificatesApi#deleteSigningCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCertificatesApi#deleteSigningCertificateAsync")
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

<a id="getSigningCertificateByIdAsync"></a>
# **getSigningCertificateByIdAsync**
> SigningCertificateDto getSigningCertificateByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signing certificate by ID

Retrieves a specific signing certificate by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningCertificateDto = apiInstance.getSigningCertificateByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningCertificatesApi#getSigningCertificateByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCertificatesApi#getSigningCertificateByIdAsync")
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

[**SigningCertificateDto**](SigningCertificateDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningCertificatesAsync"></a>
# **getSigningCertificatesAsync**
> SigningCertificateDtoListEnvelope getSigningCertificatesAsync(tenantId, apiVersion, xApiVersion)

Get all signing certificates

Retrieves all signing certificates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningCertificateDtoListEnvelope = apiInstance.getSigningCertificatesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningCertificatesApi#getSigningCertificatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCertificatesApi#getSigningCertificatesAsync")
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

[**SigningCertificateDtoListEnvelope**](SigningCertificateDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningCertificatesCountAsync"></a>
# **getSigningCertificatesCountAsync**
> Int32Envelope getSigningCertificatesCountAsync(tenantId, apiVersion, xApiVersion)

Get signing certificates count

Returns the count of signing certificates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSigningCertificatesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningCertificatesApi#getSigningCertificatesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCertificatesApi#getSigningCertificatesCountAsync")
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

<a id="importSigningCertificateAsync"></a>
# **importSigningCertificateAsync**
> importSigningCertificateAsync(tenantId, apiVersion, xApiVersion, id, file, password, title, contactId)

Import a PFX/P12 signing certificate into custody

Parses the uploaded PFX/P12, imports the private material into the configured signing custody, and creates the certificate metadata record. The PFX and password are used only for the request — never returned or stored.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
val password : kotlin.String = password_example // kotlin.String | 
val title : kotlin.String = title_example // kotlin.String | 
val contactId : kotlin.String = contactId_example // kotlin.String | 
try {
    apiInstance.importSigningCertificateAsync(tenantId, apiVersion, xApiVersion, id, file, password, title, contactId)
} catch (e: ClientException) {
    println("4xx response calling SigningCertificatesApi#importSigningCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCertificatesApi#importSigningCertificateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| **id** | **java.util.UUID**|  | [optional] |
| **file** | **java.io.File**|  | [optional] |
| **password** | **kotlin.String**|  | [optional] |
| **title** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactId** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="patchSigningCertificateAsync"></a>
# **patchSigningCertificateAsync**
> EmptyEnvelope patchSigningCertificateAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a signing certificate

Patch a signing certificate

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSigningCertificateAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningCertificatesApi#patchSigningCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCertificatesApi#patchSigningCertificateAsync")
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

<a id="updateSigningCertificateAsync"></a>
# **updateSigningCertificateAsync**
> updateSigningCertificateAsync(id, tenantId, apiVersion, xApiVersion, signingCertificateUpdateDto)

Update a signing certificate

Updates an existing signing certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingCertificateUpdateDto : SigningCertificateUpdateDto =  // SigningCertificateUpdateDto | 
try {
    apiInstance.updateSigningCertificateAsync(id, tenantId, apiVersion, xApiVersion, signingCertificateUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling SigningCertificatesApi#updateSigningCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningCertificatesApi#updateSigningCertificateAsync")
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
| **signingCertificateUpdateDto** | [**SigningCertificateUpdateDto**](SigningCertificateUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

