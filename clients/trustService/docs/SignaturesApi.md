# SignaturesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getSignatureByIdAsync**](SignaturesApi.md#getSignatureByIdAsync) | **GET** /api/v2/TrustService/Signatures/{id} | Get signature by ID |
| [**getSignaturesAsync**](SignaturesApi.md#getSignaturesAsync) | **GET** /api/v2/TrustService/Signatures | Get all signatures |
| [**getSignaturesCountAsync**](SignaturesApi.md#getSignaturesCountAsync) | **GET** /api/v2/TrustService/Signatures/Count | Get signatures count |


<a id="getSignatureByIdAsync"></a>
# **getSignatureByIdAsync**
> SignatureDto getSignatureByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get signature by ID

Retrieves a specific signature by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignaturesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SignatureDto = apiInstance.getSignatureByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignaturesApi#getSignatureByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignaturesApi#getSignatureByIdAsync")
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

[**SignatureDto**](SignatureDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSignaturesAsync"></a>
# **getSignaturesAsync**
> SignatureDtoListEnvelope getSignaturesAsync(tenantId, apiVersion, xApiVersion)

Get all signatures

Retrieves all signatures for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SignatureDtoListEnvelope = apiInstance.getSignaturesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignaturesApi#getSignaturesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignaturesApi#getSignaturesAsync")
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

[**SignatureDtoListEnvelope**](SignatureDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSignaturesCountAsync"></a>
# **getSignaturesCountAsync**
> Int32Envelope getSignaturesCountAsync(tenantId, apiVersion, xApiVersion)

Get signatures count

Returns the count of signatures for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SignaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSignaturesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SignaturesApi#getSignaturesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SignaturesApi#getSignaturesCountAsync")
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

