# LicensesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiLicensingLicensesGeneratePost**](LicensesApi.md#apiLicensingLicensesGeneratePost) | **POST** /api/Licensing/Licenses/Generate |  |
| [**apiLicensingLicensesValidateAttributesGet**](LicensesApi.md#apiLicensingLicensesValidateAttributesGet) | **GET** /api/Licensing/Licenses/Validate/Attributes |  |
| [**apiLicensingLicensesValidateErrorsGet**](LicensesApi.md#apiLicensingLicensesValidateErrorsGet) | **GET** /api/Licensing/Licenses/Validate/Errors |  |
| [**apiLicensingLicensesValidateGet**](LicensesApi.md#apiLicensingLicensesValidateGet) | **GET** /api/Licensing/Licenses/Validate |  |


<a id="apiLicensingLicensesGeneratePost"></a>
# **apiLicensingLicensesGeneratePost**
> StringEnvelope apiLicensingLicensesGeneratePost(tenantId, apiVersion, xApiVersion, licenseKeyRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseKeyRequest : LicenseKeyRequest =  // LicenseKeyRequest | 
try {
    val result : StringEnvelope = apiInstance.apiLicensingLicensesGeneratePost(tenantId, apiVersion, xApiVersion, licenseKeyRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#apiLicensingLicensesGeneratePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#apiLicensingLicensesGeneratePost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseKeyRequest** | [**LicenseKeyRequest**](LicenseKeyRequest.md)|  | [optional] |

### Return type

[**StringEnvelope**](StringEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiLicensingLicensesValidateAttributesGet"></a>
# **apiLicensingLicensesValidateAttributesGet**
> LicenseAttributesListEnvelope apiLicensingLicensesValidateAttributesGet(tenantId, apiVersion, xApiVersion, licenseKey)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseKey : LicenseKey =  // LicenseKey | 
try {
    val result : LicenseAttributesListEnvelope = apiInstance.apiLicensingLicensesValidateAttributesGet(tenantId, apiVersion, xApiVersion, licenseKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#apiLicensingLicensesValidateAttributesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#apiLicensingLicensesValidateAttributesGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseKey** | [**LicenseKey**](LicenseKey.md)|  | [optional] |

### Return type

[**LicenseAttributesListEnvelope**](LicenseAttributesListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiLicensingLicensesValidateErrorsGet"></a>
# **apiLicensingLicensesValidateErrorsGet**
> LicenseValidationErrorListEnvelope apiLicensingLicensesValidateErrorsGet(tenantId, apiVersion, xApiVersion, licenseKey)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseKey : LicenseKey =  // LicenseKey | 
try {
    val result : LicenseValidationErrorListEnvelope = apiInstance.apiLicensingLicensesValidateErrorsGet(tenantId, apiVersion, xApiVersion, licenseKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#apiLicensingLicensesValidateErrorsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#apiLicensingLicensesValidateErrorsGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseKey** | [**LicenseKey**](LicenseKey.md)|  | [optional] |

### Return type

[**LicenseValidationErrorListEnvelope**](LicenseValidationErrorListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiLicensingLicensesValidateGet"></a>
# **apiLicensingLicensesValidateGet**
> BooleanEnvelope apiLicensingLicensesValidateGet(tenantId, apiVersion, xApiVersion, licenseKey)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LicensesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val licenseKey : LicenseKey =  // LicenseKey | 
try {
    val result : BooleanEnvelope = apiInstance.apiLicensingLicensesValidateGet(tenantId, apiVersion, xApiVersion, licenseKey)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LicensesApi#apiLicensingLicensesValidateGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LicensesApi#apiLicensingLicensesValidateGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **licenseKey** | [**LicenseKey**](LicenseKey.md)|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

