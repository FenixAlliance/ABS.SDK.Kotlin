# LicensingCertificatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLicensingCertificateAsync**](LicensingCertificatesApi.md#createLicensingCertificateAsync) | **POST** /api/v2/LicensingService/LicensingCertificates | Create a new licensing certificate |
| [**deleteLicensingCertificateAsync**](LicensingCertificatesApi.md#deleteLicensingCertificateAsync) | **DELETE** /api/v2/LicensingService/LicensingCertificates/{id} | Delete a licensing certificate |
| [**getLicensingCertificateByIdAsync**](LicensingCertificatesApi.md#getLicensingCertificateByIdAsync) | **GET** /api/v2/LicensingService/LicensingCertificates/{id} | Get licensing certificate by ID |
| [**getLicensingCertificatesAsync**](LicensingCertificatesApi.md#getLicensingCertificatesAsync) | **GET** /api/v2/LicensingService/LicensingCertificates | Get all licensing certificates |
| [**getLicensingCertificatesCountAsync**](LicensingCertificatesApi.md#getLicensingCertificatesCountAsync) | **GET** /api/v2/LicensingService/LicensingCertificates/Count | Get licensing certificates count |
| [**patchLicensingCertificateAsync**](LicensingCertificatesApi.md#patchLicensingCertificateAsync) | **PATCH** /api/v2/LicensingService/LicensingCertificates/{id} | Patch a licensing certificate |
| [**updateLicensingCertificateAsync**](LicensingCertificatesApi.md#updateLicensingCertificateAsync) | **PUT** /api/v2/LicensingService/LicensingCertificates/{id} | Update a licensing certificate |


<a id="createLicensingCertificateAsync"></a>
# **createLicensingCertificateAsync**
> createLicensingCertificateAsync(tenantId, apiVersion, xApiVersion, licensingCertificateCreateDto)

Create a new licensing certificate

Creates a new licensing certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensingCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licensingCertificateCreateDto : LicensingCertificateCreateDto =  // LicensingCertificateCreateDto | 
try {
    apiInstance.createLicensingCertificateAsync(tenantId, apiVersion, xApiVersion, licensingCertificateCreateDto)
} catch (e: ClientException) {
    println("4xx response calling LicensingCertificatesApi#createLicensingCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensingCertificatesApi#createLicensingCertificateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licensingCertificateCreateDto** | [**LicensingCertificateCreateDto**](LicensingCertificateCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLicensingCertificateAsync"></a>
# **deleteLicensingCertificateAsync**
> deleteLicensingCertificateAsync(id, tenantId, apiVersion, xApiVersion)

Delete a licensing certificate

Deletes a licensing certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensingCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteLicensingCertificateAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling LicensingCertificatesApi#deleteLicensingCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensingCertificatesApi#deleteLicensingCertificateAsync")
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

<a id="getLicensingCertificateByIdAsync"></a>
# **getLicensingCertificateByIdAsync**
> LicensingCertificateDto getLicensingCertificateByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get licensing certificate by ID

Retrieves a specific licensing certificate by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensingCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LicensingCertificateDto = apiInstance.getLicensingCertificateByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensingCertificatesApi#getLicensingCertificateByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensingCertificatesApi#getLicensingCertificateByIdAsync")
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

[**LicensingCertificateDto**](LicensingCertificateDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLicensingCertificatesAsync"></a>
# **getLicensingCertificatesAsync**
> LicensingCertificateDtoListEnvelope getLicensingCertificatesAsync(tenantId, apiVersion, xApiVersion, licensingCertificateDtoCollectionQueryParameters)

Get all licensing certificates

Retrieves all licensing certificates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensingCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licensingCertificateDtoCollectionQueryParameters : LicensingCertificateDtoCollectionQueryParameters =  // LicensingCertificateDtoCollectionQueryParameters | 
try {
    val result : LicensingCertificateDtoListEnvelope = apiInstance.getLicensingCertificatesAsync(tenantId, apiVersion, xApiVersion, licensingCertificateDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensingCertificatesApi#getLicensingCertificatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensingCertificatesApi#getLicensingCertificatesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licensingCertificateDtoCollectionQueryParameters** | [**LicensingCertificateDtoCollectionQueryParameters**](LicensingCertificateDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**LicensingCertificateDtoListEnvelope**](LicensingCertificateDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getLicensingCertificatesCountAsync"></a>
# **getLicensingCertificatesCountAsync**
> Int32Envelope getLicensingCertificatesCountAsync(tenantId, apiVersion, xApiVersion, licensingCertificateDtoCollectionQueryParameters)

Get licensing certificates count

Returns the count of licensing certificates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensingCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licensingCertificateDtoCollectionQueryParameters : LicensingCertificateDtoCollectionQueryParameters =  // LicensingCertificateDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getLicensingCertificatesCountAsync(tenantId, apiVersion, xApiVersion, licensingCertificateDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensingCertificatesApi#getLicensingCertificatesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensingCertificatesApi#getLicensingCertificatesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licensingCertificateDtoCollectionQueryParameters** | [**LicensingCertificateDtoCollectionQueryParameters**](LicensingCertificateDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchLicensingCertificateAsync"></a>
# **patchLicensingCertificateAsync**
> EmptyEnvelope patchLicensingCertificateAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a licensing certificate

Patch a licensing certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensingCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchLicensingCertificateAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensingCertificatesApi#patchLicensingCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensingCertificatesApi#patchLicensingCertificateAsync")
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

<a id="updateLicensingCertificateAsync"></a>
# **updateLicensingCertificateAsync**
> updateLicensingCertificateAsync(id, tenantId, apiVersion, xApiVersion, licensingCertificateUpdateDto)

Update a licensing certificate

Updates an existing licensing certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensingCertificatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licensingCertificateUpdateDto : LicensingCertificateUpdateDto =  // LicensingCertificateUpdateDto | 
try {
    apiInstance.updateLicensingCertificateAsync(id, tenantId, apiVersion, xApiVersion, licensingCertificateUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling LicensingCertificatesApi#updateLicensingCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensingCertificatesApi#updateLicensingCertificateAsync")
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
| **licensingCertificateUpdateDto** | [**LicensingCertificateUpdateDto**](LicensingCertificateUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

