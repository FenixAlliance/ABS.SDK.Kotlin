# SigningProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSigningProfileAsync**](SigningProfilesApi.md#createSigningProfileAsync) | **POST** /api/v2/TrustService/SigningProfiles | Create a new signing profile |
| [**deleteSigningProfileAsync**](SigningProfilesApi.md#deleteSigningProfileAsync) | **DELETE** /api/v2/TrustService/SigningProfiles/{id} | Delete a signing profile |
| [**getSigningProfileByIdAsync**](SigningProfilesApi.md#getSigningProfileByIdAsync) | **GET** /api/v2/TrustService/SigningProfiles/{id} | Get signing profile by ID |
| [**getSigningProfilesAsync**](SigningProfilesApi.md#getSigningProfilesAsync) | **GET** /api/v2/TrustService/SigningProfiles | Get all signing profiles |
| [**getSigningProfilesCountAsync**](SigningProfilesApi.md#getSigningProfilesCountAsync) | **GET** /api/v2/TrustService/SigningProfiles/Count | Get signing profiles count |
| [**patchSigningProfileAsync**](SigningProfilesApi.md#patchSigningProfileAsync) | **PATCH** /api/v2/TrustService/SigningProfiles/{id} | Patch a signing profile |
| [**updateSigningProfileAsync**](SigningProfilesApi.md#updateSigningProfileAsync) | **PUT** /api/v2/TrustService/SigningProfiles/{id} | Update a signing profile |


<a id="createSigningProfileAsync"></a>
# **createSigningProfileAsync**
> createSigningProfileAsync(tenantId, apiVersion, xApiVersion, signingProfileCreateDto)

Create a new signing profile

Creates a new signing profile for the specified tenant (supports inline contact creation).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingProfileCreateDto : SigningProfileCreateDto =  // SigningProfileCreateDto | 
try {
    apiInstance.createSigningProfileAsync(tenantId, apiVersion, xApiVersion, signingProfileCreateDto)
} catch (e: ClientException) {
    println("4xx response calling SigningProfilesApi#createSigningProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfilesApi#createSigningProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingProfileCreateDto** | [**SigningProfileCreateDto**](SigningProfileCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSigningProfileAsync"></a>
# **deleteSigningProfileAsync**
> deleteSigningProfileAsync(id, tenantId, apiVersion, xApiVersion)

Delete a signing profile

Deletes a signing profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfilesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteSigningProfileAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SigningProfilesApi#deleteSigningProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfilesApi#deleteSigningProfileAsync")
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

<a id="getSigningProfileByIdAsync"></a>
# **getSigningProfileByIdAsync**
> SigningProfileDto getSigningProfileByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signing profile by ID

Retrieves a specific signing profile by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfilesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SigningProfileDto = apiInstance.getSigningProfileByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningProfilesApi#getSigningProfileByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfilesApi#getSigningProfileByIdAsync")
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

[**SigningProfileDto**](SigningProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSigningProfilesAsync"></a>
# **getSigningProfilesAsync**
> SigningProfileDtoListEnvelope getSigningProfilesAsync(tenantId, apiVersion, xApiVersion, signingProfileDtoCollectionQueryParameters)

Get all signing profiles

Retrieves all signing profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingProfileDtoCollectionQueryParameters : SigningProfileDtoCollectionQueryParameters =  // SigningProfileDtoCollectionQueryParameters | 
try {
    val result : SigningProfileDtoListEnvelope = apiInstance.getSigningProfilesAsync(tenantId, apiVersion, xApiVersion, signingProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningProfilesApi#getSigningProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfilesApi#getSigningProfilesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingProfileDtoCollectionQueryParameters** | [**SigningProfileDtoCollectionQueryParameters**](SigningProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**SigningProfileDtoListEnvelope**](SigningProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSigningProfilesCountAsync"></a>
# **getSigningProfilesCountAsync**
> Int32Envelope getSigningProfilesCountAsync(tenantId, apiVersion, xApiVersion, signingProfileDtoCollectionQueryParameters)

Get signing profiles count

Returns the count of signing profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingProfileDtoCollectionQueryParameters : SigningProfileDtoCollectionQueryParameters =  // SigningProfileDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSigningProfilesCountAsync(tenantId, apiVersion, xApiVersion, signingProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningProfilesApi#getSigningProfilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfilesApi#getSigningProfilesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signingProfileDtoCollectionQueryParameters** | [**SigningProfileDtoCollectionQueryParameters**](SigningProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchSigningProfileAsync"></a>
# **patchSigningProfileAsync**
> EmptyEnvelope patchSigningProfileAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a signing profile

Patch a signing profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfilesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSigningProfileAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningProfilesApi#patchSigningProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfilesApi#patchSigningProfileAsync")
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

<a id="updateSigningProfileAsync"></a>
# **updateSigningProfileAsync**
> updateSigningProfileAsync(id, tenantId, apiVersion, xApiVersion, signingProfileUpdateDto)

Update a signing profile

Updates an existing signing profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningProfilesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signingProfileUpdateDto : SigningProfileUpdateDto =  // SigningProfileUpdateDto | 
try {
    apiInstance.updateSigningProfileAsync(id, tenantId, apiVersion, xApiVersion, signingProfileUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling SigningProfilesApi#updateSigningProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningProfilesApi#updateSigningProfileAsync")
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
| **signingProfileUpdateDto** | [**SigningProfileUpdateDto**](SigningProfileUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

