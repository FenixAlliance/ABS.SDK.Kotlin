# AiProvidersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAiProvidersAsync**](AiProvidersApi.md#getAiProvidersAsync) | **GET** /api/v2/IntelligenceService/AiProviders | Get the available AI providers |


<a id="getAiProvidersAsync"></a>
# **getAiProvidersAsync**
> AiProviderDtoListEnvelope getAiProvidersAsync(apiVersion, xApiVersion)

Get the available AI providers

Returns every AI provider key this instance has a registered adapter for. The set is a property of the deployment, so it is not tenant-scoped; what varies per tenant is the credential for a provider, which is never returned here.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AiProvidersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AiProviderDtoListEnvelope = apiInstance.getAiProvidersAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AiProvidersApi#getAiProvidersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AiProvidersApi#getAiProvidersAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AiProviderDtoListEnvelope**](AiProviderDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

