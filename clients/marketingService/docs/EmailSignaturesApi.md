# EmailSignaturesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceEmailSignaturesCountGet**](EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesCountGet) | **GET** /api/v2/MarketingService/EmailSignatures/Count |  |
| [**apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete**](EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete) | **DELETE** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} |  |
| [**apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet**](EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet) | **GET** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} |  |
| [**apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut**](EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut) | **PUT** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} |  |
| [**apiV2MarketingServiceEmailSignaturesGet**](EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesGet) | **GET** /api/v2/MarketingService/EmailSignatures |  |
| [**apiV2MarketingServiceEmailSignaturesPost**](EmailSignaturesApi.md#apiV2MarketingServiceEmailSignaturesPost) | **POST** /api/v2/MarketingService/EmailSignatures |  |


<a id="apiV2MarketingServiceEmailSignaturesCountGet"></a>
# **apiV2MarketingServiceEmailSignaturesCountGet**
> Int32Envelope apiV2MarketingServiceEmailSignaturesCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2MarketingServiceEmailSignaturesCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesCountGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete"></a>
# **apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete**
> EmptyEnvelope apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete(emailsignatureId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val emailsignatureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete(emailsignatureId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesEmailsignatureIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **emailsignatureId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet"></a>
# **apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet**
> EmailSignatureDtoEnvelope apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet(emailsignatureId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val emailsignatureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailSignatureDtoEnvelope = apiInstance.apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet(emailsignatureId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesEmailsignatureIdGet")
    e.printStackTrace()
}
```

### Parameters
| **emailsignatureId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmailSignatureDtoEnvelope**](EmailSignatureDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut"></a>
# **apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut**
> EmptyEnvelope apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut(emailsignatureId, tenantId, emailSignatureUpdateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val emailsignatureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailSignatureUpdateDto : EmailSignatureUpdateDto =  // EmailSignatureUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut(emailsignatureId, tenantId, emailSignatureUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesEmailsignatureIdPut")
    e.printStackTrace()
}
```

### Parameters
| **emailsignatureId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **emailSignatureUpdateDto** | [**EmailSignatureUpdateDto**](EmailSignatureUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailSignaturesGet"></a>
# **apiV2MarketingServiceEmailSignaturesGet**
> EmailSignatureDtoListEnvelope apiV2MarketingServiceEmailSignaturesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailSignatureDtoListEnvelope = apiInstance.apiV2MarketingServiceEmailSignaturesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesGet")
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

[**EmailSignatureDtoListEnvelope**](EmailSignatureDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailSignaturesPost"></a>
# **apiV2MarketingServiceEmailSignaturesPost**
> EmptyEnvelope apiV2MarketingServiceEmailSignaturesPost(tenantId, emailSignatureCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailSignatureCreateDto : EmailSignatureCreateDto =  // EmailSignatureCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailSignaturesPost(tenantId, emailSignatureCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#apiV2MarketingServiceEmailSignaturesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **emailSignatureCreateDto** | [**EmailSignatureCreateDto**](EmailSignatureCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

