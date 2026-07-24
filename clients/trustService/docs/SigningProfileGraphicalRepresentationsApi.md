# SigningProfileGraphicalRepresentationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSigningProfileGraphicalRepresentationAsync**](SigningProfileGraphicalRepresentationsApi.md#createSigningProfileGraphicalRepresentationAsync) | **POST** /api/v2/TrustService/SigningProfileGraphicalRepresentations | Create a new signature representation |
| [**deleteSigningProfileGraphicalRepresentationAsync**](SigningProfileGraphicalRepresentationsApi.md#deleteSigningProfileGraphicalRepresentationAsync) | **DELETE** /api/v2/TrustService/SigningProfileGraphicalRepresentations/{id} | Delete a signature representation |
| [**getSigningProfileGraphicalRepresentationByIdAsync**](SigningProfileGraphicalRepresentationsApi.md#getSigningProfileGraphicalRepresentationByIdAsync) | **GET** /api/v2/TrustService/SigningProfileGraphicalRepresentations/{id} | Get signature representation by ID |
| [**getSigningProfileGraphicalRepresentationsAsync**](SigningProfileGraphicalRepresentationsApi.md#getSigningProfileGraphicalRepresentationsAsync) | **GET** /api/v2/TrustService/SigningProfileGraphicalRepresentations | Get all signature representations |
| [**getSigningProfileGraphicalRepresentationsCountAsync**](SigningProfileGraphicalRepresentationsApi.md#getSigningProfileGraphicalRepresentationsCountAsync) | **GET** /api/v2/TrustService/SigningProfileGraphicalRepresentations/Count | Get signature representations count |
| [**patchSigningProfileGraphicalRepresentationAsync**](SigningProfileGraphicalRepresentationsApi.md#patchSigningProfileGraphicalRepresentationAsync) | **PATCH** /api/v2/TrustService/SigningProfileGraphicalRepresentations/{id} | Patch a signature representation |
| [**updateSigningProfileGraphicalRepresentationAsync**](SigningProfileGraphicalRepresentationsApi.md#updateSigningProfileGraphicalRepresentationAsync) | **PUT** /api/v2/TrustService/SigningProfileGraphicalRepresentations/{id} | Update a signature representation |


<a id="createSigningProfileGraphicalRepresentationAsync"></a>
# **createSigningProfileGraphicalRepresentationAsync**
> createSigningProfileGraphicalRepresentationAsync(tenantId, apiVersion, xApiVersion, signingProfileGraphicalRepresentationCreateDto)

Create a new signature representation

Creates a new reusable signature representation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfileGraphicalRepresentationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingProfileGraphicalRepresentationCreateDto : SigningProfileGraphicalRepresentationCreateDto =  // SigningProfileGraphicalRepresentationCreateDto | 
try {
    apiInstance.createSigningProfileGraphicalRepresentationAsync(tenantId, apiVersion, xApiVersion, signingProfileGraphicalRepresentationCreateDto)
} catch (e: ClientException) {
    println("4xx response calling SigningProfileGraphicalRepresentationsApi#createSigningProfileGraphicalRepresentationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfileGraphicalRepresentationsApi#createSigningProfileGraphicalRepresentationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingProfileGraphicalRepresentationCreateDto** | [**SigningProfileGraphicalRepresentationCreateDto**](SigningProfileGraphicalRepresentationCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSigningProfileGraphicalRepresentationAsync"></a>
# **deleteSigningProfileGraphicalRepresentationAsync**
> deleteSigningProfileGraphicalRepresentationAsync(id, tenantId, apiVersion, xApiVersion)

Delete a signature representation

Deletes a signature representation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfileGraphicalRepresentationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteSigningProfileGraphicalRepresentationAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SigningProfileGraphicalRepresentationsApi#deleteSigningProfileGraphicalRepresentationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfileGraphicalRepresentationsApi#deleteSigningProfileGraphicalRepresentationAsync")
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

<a id="getSigningProfileGraphicalRepresentationByIdAsync"></a>
# **getSigningProfileGraphicalRepresentationByIdAsync**
> SigningProfileGraphicalRepresentationDto getSigningProfileGraphicalRepresentationByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signature representation by ID

Retrieves a specific signature representation by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfileGraphicalRepresentationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningProfileGraphicalRepresentationDto = apiInstance.getSigningProfileGraphicalRepresentationByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationByIdAsync")
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

[**SigningProfileGraphicalRepresentationDto**](SigningProfileGraphicalRepresentationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningProfileGraphicalRepresentationsAsync"></a>
# **getSigningProfileGraphicalRepresentationsAsync**
> SigningProfileGraphicalRepresentationDtoListEnvelope getSigningProfileGraphicalRepresentationsAsync(tenantId, apiVersion, xApiVersion)

Get all signature representations

Retrieves all reusable signature representations for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfileGraphicalRepresentationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningProfileGraphicalRepresentationDtoListEnvelope = apiInstance.getSigningProfileGraphicalRepresentationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationsAsync")
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

[**SigningProfileGraphicalRepresentationDtoListEnvelope**](SigningProfileGraphicalRepresentationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningProfileGraphicalRepresentationsCountAsync"></a>
# **getSigningProfileGraphicalRepresentationsCountAsync**
> Int32Envelope getSigningProfileGraphicalRepresentationsCountAsync(tenantId, apiVersion, xApiVersion)

Get signature representations count

Returns the count of signature representations for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfileGraphicalRepresentationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSigningProfileGraphicalRepresentationsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfileGraphicalRepresentationsApi#getSigningProfileGraphicalRepresentationsCountAsync")
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

<a id="patchSigningProfileGraphicalRepresentationAsync"></a>
# **patchSigningProfileGraphicalRepresentationAsync**
> EmptyEnvelope patchSigningProfileGraphicalRepresentationAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a signature representation

Patch a signature representation

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfileGraphicalRepresentationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSigningProfileGraphicalRepresentationAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningProfileGraphicalRepresentationsApi#patchSigningProfileGraphicalRepresentationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfileGraphicalRepresentationsApi#patchSigningProfileGraphicalRepresentationAsync")
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

<a id="updateSigningProfileGraphicalRepresentationAsync"></a>
# **updateSigningProfileGraphicalRepresentationAsync**
> updateSigningProfileGraphicalRepresentationAsync(id, tenantId, apiVersion, xApiVersion, signingProfileGraphicalRepresentationUpdateDto)

Update a signature representation

Updates an existing signature representation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfileGraphicalRepresentationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingProfileGraphicalRepresentationUpdateDto : SigningProfileGraphicalRepresentationUpdateDto =  // SigningProfileGraphicalRepresentationUpdateDto | 
try {
    apiInstance.updateSigningProfileGraphicalRepresentationAsync(id, tenantId, apiVersion, xApiVersion, signingProfileGraphicalRepresentationUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling SigningProfileGraphicalRepresentationsApi#updateSigningProfileGraphicalRepresentationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfileGraphicalRepresentationsApi#updateSigningProfileGraphicalRepresentationAsync")
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
| **signingProfileGraphicalRepresentationUpdateDto** | [**SigningProfileGraphicalRepresentationUpdateDto**](SigningProfileGraphicalRepresentationUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

