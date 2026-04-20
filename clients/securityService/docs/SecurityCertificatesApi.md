# SecurityCertificatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSecurityCertificatesAsync**](SecurityCertificatesApi.md#getSecurityCertificatesAsync) | **GET** /api/v2/SecurityService/SecurityCertificates | Get security certificates |
| [**getSecurityCertificatesCountAsync**](SecurityCertificatesApi.md#getSecurityCertificatesCountAsync) | **GET** /api/v2/SecurityService/SecurityCertificates/Count | Get security certificates count |


<a id="getSecurityCertificatesAsync"></a>
# **getSecurityCertificatesAsync**
> SecurityCertificateDtoListEnvelope getSecurityCertificatesAsync(tenantId, apiVersion, xApiVersion)

Get security certificates

Retrieves security certificates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityCertificateDtoListEnvelope = apiInstance.getSecurityCertificatesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityCertificatesApi#getSecurityCertificatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityCertificatesApi#getSecurityCertificatesAsync")
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

[**SecurityCertificateDtoListEnvelope**](SecurityCertificateDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSecurityCertificatesCountAsync"></a>
# **getSecurityCertificatesCountAsync**
> Int32Envelope getSecurityCertificatesCountAsync(tenantId, apiVersion, xApiVersion)

Get security certificates count

Retrieves the count of security certificates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SecurityCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSecurityCertificatesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityCertificatesApi#getSecurityCertificatesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityCertificatesApi#getSecurityCertificatesCountAsync")
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

