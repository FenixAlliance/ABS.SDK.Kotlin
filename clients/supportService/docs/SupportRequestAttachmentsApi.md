# SupportRequestAttachmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SupportServiceSupportRequestAttachmentsCountGet**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsCountGet) | **GET** /api/v2/SupportService/SupportRequestAttachments/Count |  |
| [**apiV2SupportServiceSupportRequestAttachmentsGet**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsGet) | **GET** /api/v2/SupportService/SupportRequestAttachments |  |
| [**apiV2SupportServiceSupportRequestAttachmentsPost**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsPost) | **POST** /api/v2/SupportService/SupportRequestAttachments |  |
| [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete) | **DELETE** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} |  |
| [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet) | **GET** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} |  |
| [**apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut**](SupportRequestAttachmentsApi.md#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut) | **PUT** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} |  |


<a id="apiV2SupportServiceSupportRequestAttachmentsCountGet"></a>
# **apiV2SupportServiceSupportRequestAttachmentsCountGet**
> Int32Envelope apiV2SupportServiceSupportRequestAttachmentsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportRequestAttachmentsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsCountGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="apiV2SupportServiceSupportRequestAttachmentsGet"></a>
# **apiV2SupportServiceSupportRequestAttachmentsGet**
> SupportRequestAttachmentDtoListEnvelope apiV2SupportServiceSupportRequestAttachmentsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestAttachmentDtoListEnvelope = apiInstance.apiV2SupportServiceSupportRequestAttachmentsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsGet")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportRequestAttachmentDtoListEnvelope**](SupportRequestAttachmentDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportRequestAttachmentsPost"></a>
# **apiV2SupportServiceSupportRequestAttachmentsPost**
> EmptyEnvelope apiV2SupportServiceSupportRequestAttachmentsPost(supportRequestAttachmentCreateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val supportRequestAttachmentCreateDto : SupportRequestAttachmentCreateDto =  // SupportRequestAttachmentCreateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestAttachmentsPost(supportRequestAttachmentCreateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsPost")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestAttachmentCreateDto** | [**SupportRequestAttachmentCreateDto**](SupportRequestAttachmentCreateDto.md)|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete"></a>
# **apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete**
> EmptyEnvelope apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val supportRequestAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestAttachmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet"></a>
# **apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet**
> SupportRequestAttachmentDtoEnvelope apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet(supportRequestAttachmentId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val supportRequestAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestAttachmentDtoEnvelope = apiInstance.apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet(supportRequestAttachmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdGet")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestAttachmentId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportRequestAttachmentDtoEnvelope**](SupportRequestAttachmentDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut"></a>
# **apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut**
> EmptyEnvelope apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut(supportRequestAttachmentId, supportRequestAttachmentUpdateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val supportRequestAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportRequestAttachmentUpdateDto : SupportRequestAttachmentUpdateDto =  // SupportRequestAttachmentUpdateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut(supportRequestAttachmentId, supportRequestAttachmentUpdateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#apiV2SupportServiceSupportRequestAttachmentsSupportRequestAttachmentIdPut")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestAttachmentId** | **java.util.UUID**|  | |
| **supportRequestAttachmentUpdateDto** | [**SupportRequestAttachmentUpdateDto**](SupportRequestAttachmentUpdateDto.md)|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

