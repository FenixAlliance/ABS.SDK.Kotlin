# LicenseFeaturesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLicenseFeatureAsync**](LicenseFeaturesApi.md#createLicenseFeatureAsync) | **POST** /api/v2/LicensingService/LicenseFeatures | Create a new license feature |
| [**deleteLicenseFeatureAsync**](LicenseFeaturesApi.md#deleteLicenseFeatureAsync) | **DELETE** /api/v2/LicensingService/LicenseFeatures/{id} | Delete a license feature |
| [**getLicenseFeatureByIdAsync**](LicenseFeaturesApi.md#getLicenseFeatureByIdAsync) | **GET** /api/v2/LicensingService/LicenseFeatures/{id} | Get license feature by ID |
| [**getLicenseFeaturesAsync**](LicenseFeaturesApi.md#getLicenseFeaturesAsync) | **GET** /api/v2/LicensingService/LicenseFeatures | Get all license features |
| [**getLicenseFeaturesCountAsync**](LicenseFeaturesApi.md#getLicenseFeaturesCountAsync) | **GET** /api/v2/LicensingService/LicenseFeatures/Count | Get license features count |
| [**patchLicenseFeatureAsync**](LicenseFeaturesApi.md#patchLicenseFeatureAsync) | **PATCH** /api/v2/LicensingService/LicenseFeatures/{id} | Patch a license feature |
| [**updateLicenseFeatureAsync**](LicenseFeaturesApi.md#updateLicenseFeatureAsync) | **PUT** /api/v2/LicensingService/LicenseFeatures/{id} | Update a license feature |


<a id="createLicenseFeatureAsync"></a>
# **createLicenseFeatureAsync**
> createLicenseFeatureAsync(tenantId, apiVersion, xApiVersion, licenseFeatureCreateDto)

Create a new license feature

Creates a new license feature for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseFeaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseFeatureCreateDto : LicenseFeatureCreateDto =  // LicenseFeatureCreateDto | 
try {
    apiInstance.createLicenseFeatureAsync(tenantId, apiVersion, xApiVersion, licenseFeatureCreateDto)
} catch (e: ClientException) {
    println("4xx response calling LicenseFeaturesApi#createLicenseFeatureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseFeaturesApi#createLicenseFeatureAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseFeatureCreateDto** | [**LicenseFeatureCreateDto**](LicenseFeatureCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLicenseFeatureAsync"></a>
# **deleteLicenseFeatureAsync**
> deleteLicenseFeatureAsync(id, tenantId, apiVersion, xApiVersion)

Delete a license feature

Deletes a license feature for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseFeaturesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteLicenseFeatureAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling LicenseFeaturesApi#deleteLicenseFeatureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseFeaturesApi#deleteLicenseFeatureAsync")
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

<a id="getLicenseFeatureByIdAsync"></a>
# **getLicenseFeatureByIdAsync**
> LicenseFeatureDto getLicenseFeatureByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get license feature by ID

Retrieves a specific license feature by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseFeaturesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LicenseFeatureDto = apiInstance.getLicenseFeatureByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseFeaturesApi#getLicenseFeatureByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseFeaturesApi#getLicenseFeatureByIdAsync")
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

[**LicenseFeatureDto**](LicenseFeatureDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLicenseFeaturesAsync"></a>
# **getLicenseFeaturesAsync**
> LicenseFeatureDtoListEnvelope getLicenseFeaturesAsync(tenantId, apiVersion, xApiVersion)

Get all license features

Retrieves all license features for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseFeaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LicenseFeatureDtoListEnvelope = apiInstance.getLicenseFeaturesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseFeaturesApi#getLicenseFeaturesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseFeaturesApi#getLicenseFeaturesAsync")
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

[**LicenseFeatureDtoListEnvelope**](LicenseFeatureDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLicenseFeaturesCountAsync"></a>
# **getLicenseFeaturesCountAsync**
> Int32Envelope getLicenseFeaturesCountAsync(tenantId, apiVersion, xApiVersion)

Get license features count

Returns the count of license features for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseFeaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getLicenseFeaturesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseFeaturesApi#getLicenseFeaturesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseFeaturesApi#getLicenseFeaturesCountAsync")
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

<a id="patchLicenseFeatureAsync"></a>
# **patchLicenseFeatureAsync**
> EmptyEnvelope patchLicenseFeatureAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a license feature

Patch a license feature for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseFeaturesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchLicenseFeatureAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicenseFeaturesApi#patchLicenseFeatureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseFeaturesApi#patchLicenseFeatureAsync")
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

<a id="updateLicenseFeatureAsync"></a>
# **updateLicenseFeatureAsync**
> updateLicenseFeatureAsync(id, tenantId, apiVersion, xApiVersion, licenseFeatureUpdateDto)

Update a license feature

Updates an existing license feature for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicenseFeaturesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseFeatureUpdateDto : LicenseFeatureUpdateDto =  // LicenseFeatureUpdateDto | 
try {
    apiInstance.updateLicenseFeatureAsync(id, tenantId, apiVersion, xApiVersion, licenseFeatureUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling LicenseFeaturesApi#updateLicenseFeatureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicenseFeaturesApi#updateLicenseFeatureAsync")
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
| **licenseFeatureUpdateDto** | [**LicenseFeatureUpdateDto**](LicenseFeatureUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

