# SigningEngineApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getProvidersAsync**](SigningEngineApi.md#getProvidersAsync) | **GET** /api/v2/TrustService/SigningEngine/Providers | List signing providers |
| [**getProvidersCountAsync**](SigningEngineApi.md#getProvidersCountAsync) | **GET** /api/v2/TrustService/SigningEngine/Providers/Count | Count signing providers |
| [**previewAsync**](SigningEngineApi.md#previewAsync) | **POST** /api/v2/TrustService/SigningEngine/Preview | Preview signing readiness |


<a id="getProvidersAsync"></a>
# **getProvidersAsync**
> TrustSigningProviderDescriptorDtoListEnvelope getProvidersAsync(tenantId, apiVersion, xApiVersion)

List signing providers

Returns the registered alpha signing providers (Noop / Manual / External). OData-queryable.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningEngineApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TrustSigningProviderDescriptorDtoListEnvelope = apiInstance.getProvidersAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningEngineApi#getProvidersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningEngineApi#getProvidersAsync")
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

[**TrustSigningProviderDescriptorDtoListEnvelope**](TrustSigningProviderDescriptorDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProvidersCountAsync"></a>
# **getProvidersCountAsync**
> Int32Envelope getProvidersCountAsync(tenantId, apiVersion, xApiVersion)

Count signing providers

Returns the count of registered alpha signing providers. OData-queryable.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningEngineApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getProvidersCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningEngineApi#getProvidersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningEngineApi#getProvidersCountAsync")
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

<a id="previewAsync"></a>
# **previewAsync**
> TrustSigningReadinessDtoEnvelope previewAsync(tenantId, apiVersion, xApiVersion, trustSigningRequestDto)

Preview signing readiness

Side-effect-free: validates a signing request and reports whether it can proceed and with what policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SigningEngineApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val trustSigningRequestDto : TrustSigningRequestDto =  // TrustSigningRequestDto | 
try {
    val result : TrustSigningReadinessDtoEnvelope = apiInstance.previewAsync(tenantId, apiVersion, xApiVersion, trustSigningRequestDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SigningEngineApi#previewAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SigningEngineApi#previewAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **trustSigningRequestDto** | [**TrustSigningRequestDto**](TrustSigningRequestDto.md)|  | [optional] |

### Return type

[**TrustSigningReadinessDtoEnvelope**](TrustSigningReadinessDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

