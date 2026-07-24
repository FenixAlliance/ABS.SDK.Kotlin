# LicenseTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLicenseTypeAsync**](LicenseTypesApi.md#createLicenseTypeAsync) | **POST** /api/v2/LicensingService/LicenseTypes | Create a new license type |
| [**deleteLicenseTypeAsync**](LicenseTypesApi.md#deleteLicenseTypeAsync) | **DELETE** /api/v2/LicensingService/LicenseTypes/{id} | Delete a license type |
| [**getLicenseTypeByIdAsync**](LicenseTypesApi.md#getLicenseTypeByIdAsync) | **GET** /api/v2/LicensingService/LicenseTypes/{id} | Get license type by ID |
| [**getLicenseTypesAsync**](LicenseTypesApi.md#getLicenseTypesAsync) | **GET** /api/v2/LicensingService/LicenseTypes | Get all license types |
| [**getLicenseTypesCountAsync**](LicenseTypesApi.md#getLicenseTypesCountAsync) | **GET** /api/v2/LicensingService/LicenseTypes/Count | Get license types count |
| [**patchLicenseTypeAsync**](LicenseTypesApi.md#patchLicenseTypeAsync) | **PATCH** /api/v2/LicensingService/LicenseTypes/{id} | Patch a license type |
| [**updateLicenseTypeAsync**](LicenseTypesApi.md#updateLicenseTypeAsync) | **PUT** /api/v2/LicensingService/LicenseTypes/{id} | Update a license type |


<a id="createLicenseTypeAsync"></a>
# **createLicenseTypeAsync**
> createLicenseTypeAsync(tenantId, apiVersion, xApiVersion, licenseTypeCreateDto)

Create a new license type

Creates a new license type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseTypeCreateDto : LicenseTypeCreateDto =  // LicenseTypeCreateDto | 
try {
    apiInstance.createLicenseTypeAsync(tenantId, apiVersion, xApiVersion, licenseTypeCreateDto)
} catch (e: ClientException) {
    println("4xx response calling LicenseTypesApi#createLicenseTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseTypesApi#createLicenseTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseTypeCreateDto** | [**LicenseTypeCreateDto**](LicenseTypeCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLicenseTypeAsync"></a>
# **deleteLicenseTypeAsync**
> deleteLicenseTypeAsync(id, tenantId, apiVersion, xApiVersion)

Delete a license type

Deletes a license type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteLicenseTypeAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling LicenseTypesApi#deleteLicenseTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseTypesApi#deleteLicenseTypeAsync")
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

<a id="getLicenseTypeByIdAsync"></a>
# **getLicenseTypeByIdAsync**
> LicenseTypeDto getLicenseTypeByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get license type by ID

Retrieves a specific license type by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LicenseTypeDto = apiInstance.getLicenseTypeByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseTypesApi#getLicenseTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseTypesApi#getLicenseTypeByIdAsync")
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

[**LicenseTypeDto**](LicenseTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLicenseTypesAsync"></a>
# **getLicenseTypesAsync**
> LicenseTypeDtoListEnvelope getLicenseTypesAsync(tenantId, apiVersion, xApiVersion)

Get all license types

Retrieves all license types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LicenseTypeDtoListEnvelope = apiInstance.getLicenseTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseTypesApi#getLicenseTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseTypesApi#getLicenseTypesAsync")
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

[**LicenseTypeDtoListEnvelope**](LicenseTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLicenseTypesCountAsync"></a>
# **getLicenseTypesCountAsync**
> Int32Envelope getLicenseTypesCountAsync(tenantId, apiVersion, xApiVersion)

Get license types count

Returns the count of license types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getLicenseTypesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseTypesApi#getLicenseTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseTypesApi#getLicenseTypesCountAsync")
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

<a id="patchLicenseTypeAsync"></a>
# **patchLicenseTypeAsync**
> EmptyEnvelope patchLicenseTypeAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a license type

Patch a license type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchLicenseTypeAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseTypesApi#patchLicenseTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseTypesApi#patchLicenseTypeAsync")
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

<a id="updateLicenseTypeAsync"></a>
# **updateLicenseTypeAsync**
> updateLicenseTypeAsync(id, tenantId, apiVersion, xApiVersion, licenseTypeUpdateDto)

Update a license type

Updates an existing license type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseTypeUpdateDto : LicenseTypeUpdateDto =  // LicenseTypeUpdateDto | 
try {
    apiInstance.updateLicenseTypeAsync(id, tenantId, apiVersion, xApiVersion, licenseTypeUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling LicenseTypesApi#updateLicenseTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseTypesApi#updateLicenseTypeAsync")
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
| **licenseTypeUpdateDto** | [**LicenseTypeUpdateDto**](LicenseTypeUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

