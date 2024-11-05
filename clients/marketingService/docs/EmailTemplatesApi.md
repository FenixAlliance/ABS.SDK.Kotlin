# EmailTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceEmailTemplatesCountGet**](EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesCountGet) | **GET** /api/v2/MarketingService/EmailTemplates/Count |  |
| [**apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete**](EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete) | **DELETE** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} |  |
| [**apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet**](EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet) | **GET** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} |  |
| [**apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut**](EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut) | **PUT** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} |  |
| [**apiV2MarketingServiceEmailTemplatesGet**](EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesGet) | **GET** /api/v2/MarketingService/EmailTemplates |  |
| [**apiV2MarketingServiceEmailTemplatesPost**](EmailTemplatesApi.md#apiV2MarketingServiceEmailTemplatesPost) | **POST** /api/v2/MarketingService/EmailTemplates |  |


<a id="apiV2MarketingServiceEmailTemplatesCountGet"></a>
# **apiV2MarketingServiceEmailTemplatesCountGet**
> Int32Envelope apiV2MarketingServiceEmailTemplatesCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2MarketingServiceEmailTemplatesCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesCountGet")
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

<a id="apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete"></a>
# **apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete**
> EmptyEnvelope apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete(emailTemplateId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val emailTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete(emailTemplateId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesEmailTemplateIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **emailTemplateId** | **java.util.UUID**|  | |
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

<a id="apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet"></a>
# **apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet**
> EmailTemplateDtoEnvelope apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet(emailTemplateId, tenantId, emailTemplatesId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val emailTemplateId : kotlin.String = emailTemplateId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailTemplatesId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailTemplateDtoEnvelope = apiInstance.apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet(emailTemplateId, tenantId, emailTemplatesId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesEmailTemplateIdGet")
    e.printStackTrace()
}
```

### Parameters
| **emailTemplateId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **emailTemplatesId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmailTemplateDtoEnvelope**](EmailTemplateDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut"></a>
# **apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut**
> EmptyEnvelope apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut(emailTemplateId, tenantId, emailTemplateUpdateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val emailTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailTemplateUpdateDto : EmailTemplateUpdateDto =  // EmailTemplateUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut(emailTemplateId, tenantId, emailTemplateUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesEmailTemplateIdPut")
    e.printStackTrace()
}
```

### Parameters
| **emailTemplateId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **emailTemplateUpdateDto** | [**EmailTemplateUpdateDto**](EmailTemplateUpdateDto.md)|  | |
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

<a id="apiV2MarketingServiceEmailTemplatesGet"></a>
# **apiV2MarketingServiceEmailTemplatesGet**
> EmailTemplateDtoListEnvelope apiV2MarketingServiceEmailTemplatesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailTemplateDtoListEnvelope = apiInstance.apiV2MarketingServiceEmailTemplatesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesGet")
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

[**EmailTemplateDtoListEnvelope**](EmailTemplateDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailTemplatesPost"></a>
# **apiV2MarketingServiceEmailTemplatesPost**
> EmptyEnvelope apiV2MarketingServiceEmailTemplatesPost(tenantId, emailTemplateCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailTemplateCreateDto : EmailTemplateCreateDto =  // EmailTemplateCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailTemplatesPost(tenantId, emailTemplateCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#apiV2MarketingServiceEmailTemplatesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **emailTemplateCreateDto** | [**EmailTemplateCreateDto**](EmailTemplateCreateDto.md)|  | |
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

