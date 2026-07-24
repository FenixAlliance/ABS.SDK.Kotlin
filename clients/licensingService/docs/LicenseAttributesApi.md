# LicenseAttributesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLicenseAttributeAsync**](LicenseAttributesApi.md#createLicenseAttributeAsync) | **POST** /api/v2/LicensingService/LicenseAttributes | Create a new license attribute |
| [**deleteLicenseAttributeAsync**](LicenseAttributesApi.md#deleteLicenseAttributeAsync) | **DELETE** /api/v2/LicensingService/LicenseAttributes/{id} | Delete a license attribute |
| [**getLicenseAttributeByIdAsync**](LicenseAttributesApi.md#getLicenseAttributeByIdAsync) | **GET** /api/v2/LicensingService/LicenseAttributes/{id} | Get license attribute by ID |
| [**getLicenseAttributesAsync**](LicenseAttributesApi.md#getLicenseAttributesAsync) | **GET** /api/v2/LicensingService/LicenseAttributes | Get all license attributes |
| [**getLicenseAttributesCountAsync**](LicenseAttributesApi.md#getLicenseAttributesCountAsync) | **GET** /api/v2/LicensingService/LicenseAttributes/Count | Get license attributes count |
| [**patchLicenseAttributeAsync**](LicenseAttributesApi.md#patchLicenseAttributeAsync) | **PATCH** /api/v2/LicensingService/LicenseAttributes/{id} | Patch a license attribute |
| [**updateLicenseAttributeAsync**](LicenseAttributesApi.md#updateLicenseAttributeAsync) | **PUT** /api/v2/LicensingService/LicenseAttributes/{id} | Update a license attribute |


<a id="createLicenseAttributeAsync"></a>
# **createLicenseAttributeAsync**
> createLicenseAttributeAsync(tenantId, apiVersion, xApiVersion, licenseAttributeCreateDto)

Create a new license attribute

Creates a new license attribute for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseAttributesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseAttributeCreateDto : LicenseAttributeCreateDto =  // LicenseAttributeCreateDto | 
try {
    apiInstance.createLicenseAttributeAsync(tenantId, apiVersion, xApiVersion, licenseAttributeCreateDto)
} catch (e: ClientException) {
    println("4xx response calling LicenseAttributesApi#createLicenseAttributeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseAttributesApi#createLicenseAttributeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseAttributeCreateDto** | [**LicenseAttributeCreateDto**](LicenseAttributeCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLicenseAttributeAsync"></a>
# **deleteLicenseAttributeAsync**
> deleteLicenseAttributeAsync(id, tenantId, apiVersion, xApiVersion)

Delete a license attribute

Deletes a license attribute for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseAttributesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteLicenseAttributeAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling LicenseAttributesApi#deleteLicenseAttributeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseAttributesApi#deleteLicenseAttributeAsync")
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

<a id="getLicenseAttributeByIdAsync"></a>
# **getLicenseAttributeByIdAsync**
> LicenseAttributeDto getLicenseAttributeByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get license attribute by ID

Retrieves a specific license attribute by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseAttributesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LicenseAttributeDto = apiInstance.getLicenseAttributeByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseAttributesApi#getLicenseAttributeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseAttributesApi#getLicenseAttributeByIdAsync")
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

[**LicenseAttributeDto**](LicenseAttributeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLicenseAttributesAsync"></a>
# **getLicenseAttributesAsync**
> LicenseAttributeDtoListEnvelope getLicenseAttributesAsync(tenantId, apiVersion, xApiVersion)

Get all license attributes

Retrieves all license attributes for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseAttributesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LicenseAttributeDtoListEnvelope = apiInstance.getLicenseAttributesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseAttributesApi#getLicenseAttributesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseAttributesApi#getLicenseAttributesAsync")
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

[**LicenseAttributeDtoListEnvelope**](LicenseAttributeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLicenseAttributesCountAsync"></a>
# **getLicenseAttributesCountAsync**
> Int32Envelope getLicenseAttributesCountAsync(tenantId, apiVersion, xApiVersion)

Get license attributes count

Returns the count of license attributes for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseAttributesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getLicenseAttributesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseAttributesApi#getLicenseAttributesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseAttributesApi#getLicenseAttributesCountAsync")
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

<a id="patchLicenseAttributeAsync"></a>
# **patchLicenseAttributeAsync**
> EmptyEnvelope patchLicenseAttributeAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a license attribute

Patch a license attribute for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseAttributesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchLicenseAttributeAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseAttributesApi#patchLicenseAttributeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseAttributesApi#patchLicenseAttributeAsync")
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

<a id="updateLicenseAttributeAsync"></a>
# **updateLicenseAttributeAsync**
> updateLicenseAttributeAsync(id, tenantId, apiVersion, xApiVersion, licenseAttributeUpdateDto)

Update a license attribute

Updates an existing license attribute for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseAttributesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseAttributeUpdateDto : LicenseAttributeUpdateDto =  // LicenseAttributeUpdateDto | 
try {
    apiInstance.updateLicenseAttributeAsync(id, tenantId, apiVersion, xApiVersion, licenseAttributeUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling LicenseAttributesApi#updateLicenseAttributeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseAttributesApi#updateLicenseAttributeAsync")
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
| **licenseAttributeUpdateDto** | [**LicenseAttributeUpdateDto**](LicenseAttributeUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

