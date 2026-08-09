# LicensesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLicenseAsync**](LicensesApi.md#createLicenseAsync) | **POST** /api/v2/LicensingService/Licenses | Create a new license |
| [**deleteLicenseAsync**](LicensesApi.md#deleteLicenseAsync) | **DELETE** /api/v2/LicensingService/Licenses/{licenseId} | Delete a license |
| [**getLicenseByIdAsync**](LicensesApi.md#getLicenseByIdAsync) | **GET** /api/v2/LicensingService/Licenses/{licenseId} | Get license by ID |
| [**getLicensesAsync**](LicensesApi.md#getLicensesAsync) | **GET** /api/v2/LicensingService/Licenses | Get licenses |
| [**getLicensesCountAsync**](LicensesApi.md#getLicensesCountAsync) | **GET** /api/v2/LicensingService/Licenses/Count | Get licenses count |
| [**updateLicenseAsync**](LicensesApi.md#updateLicenseAsync) | **PUT** /api/v2/LicensingService/Licenses/{licenseId} | Update a license |


<a id="createLicenseAsync"></a>
# **createLicenseAsync**
> createLicenseAsync(tenantId, apiVersion, xApiVersion, licenseCreateDto)

Create a new license

Creates a new license instance for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseCreateDto : LicenseCreateDto =  // LicenseCreateDto | 
try {
    apiInstance.createLicenseAsync(tenantId, apiVersion, xApiVersion, licenseCreateDto)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#createLicenseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#createLicenseAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseCreateDto** | [**LicenseCreateDto**](LicenseCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLicenseAsync"></a>
# **deleteLicenseAsync**
> deleteLicenseAsync(licenseId, tenantId, apiVersion, xApiVersion)

Delete a license

Deletes a license instance for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val licenseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteLicenseAsync(licenseId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#deleteLicenseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#deleteLicenseAsync")
    e.printStackTrace()
}
```

### Parameters
| **licenseId** | **java.util.UUID**|  | |
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

<a id="getLicenseByIdAsync"></a>
# **getLicenseByIdAsync**
> LicenseDto getLicenseByIdAsync(licenseId, tenantId, apiVersion, xApiVersion)

Get license by ID

Retrieves a specific license instance by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val licenseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LicenseDto = apiInstance.getLicenseByIdAsync(licenseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#getLicenseByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#getLicenseByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **licenseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LicenseDto**](LicenseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLicensesAsync"></a>
# **getLicensesAsync**
> LicenseDtoListEnvelope getLicensesAsync(tenantId, apiVersion, xApiVersion, licenseDtoCollectionQueryParameters)

Get licenses

Retrieves the license instances owned by the specified tenant, filtered via OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseDtoCollectionQueryParameters : LicenseDtoCollectionQueryParameters =  // LicenseDtoCollectionQueryParameters | 
try {
    val result : LicenseDtoListEnvelope = apiInstance.getLicensesAsync(tenantId, apiVersion, xApiVersion, licenseDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#getLicensesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#getLicensesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseDtoCollectionQueryParameters** | [**LicenseDtoCollectionQueryParameters**](LicenseDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**LicenseDtoListEnvelope**](LicenseDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getLicensesCountAsync"></a>
# **getLicensesCountAsync**
> Int32Envelope getLicensesCountAsync(tenantId, apiVersion, xApiVersion, licenseDtoCollectionQueryParameters)

Get licenses count

Returns the count of license instances owned by the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseDtoCollectionQueryParameters : LicenseDtoCollectionQueryParameters =  // LicenseDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getLicensesCountAsync(tenantId, apiVersion, xApiVersion, licenseDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#getLicensesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#getLicensesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseDtoCollectionQueryParameters** | [**LicenseDtoCollectionQueryParameters**](LicenseDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateLicenseAsync"></a>
# **updateLicenseAsync**
> updateLicenseAsync(licenseId, tenantId, apiVersion, xApiVersion, licenseUpdateDto)

Update a license

Updates an existing license instance for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val licenseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseUpdateDto : LicenseUpdateDto =  // LicenseUpdateDto | 
try {
    apiInstance.updateLicenseAsync(licenseId, tenantId, apiVersion, xApiVersion, licenseUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#updateLicenseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#updateLicenseAsync")
    e.printStackTrace()
}
```

### Parameters
| **licenseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseUpdateDto** | [**LicenseUpdateDto**](LicenseUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

