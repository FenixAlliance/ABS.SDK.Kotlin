# SupportRequestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SupportServiceSupportRequestsCountGet**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsCountGet) | **GET** /api/v2/SupportService/SupportRequests/Count |  |
| [**apiV2SupportServiceSupportRequestsGet**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsGet) | **GET** /api/v2/SupportService/SupportRequests |  |
| [**apiV2SupportServiceSupportRequestsPost**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsPost) | **POST** /api/v2/SupportService/SupportRequests |  |
| [**apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments/{attachmentId} |  |
| [**apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments/Count |  |
| [**apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments |  |
| [**apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost) | **POST** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments |  |
| [**apiV2SupportServiceSupportRequestsSupportRequestIdDelete**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdDelete) | **DELETE** /api/v2/SupportService/SupportRequests/{supportRequestId} |  |
| [**apiV2SupportServiceSupportRequestsSupportRequestIdGet**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId} |  |
| [**apiV2SupportServiceSupportRequestsSupportRequestIdPut**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdPut) | **PUT** /api/v2/SupportService/SupportRequests/{supportRequestId} |  |
| [**apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet**](SupportRequestsApi.md#apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Tickets |  |


<a id="apiV2SupportServiceSupportRequestsCountGet"></a>
# **apiV2SupportServiceSupportRequestsCountGet**
> Int32Envelope apiV2SupportServiceSupportRequestsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportRequestsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsCountGet")
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

<a id="apiV2SupportServiceSupportRequestsGet"></a>
# **apiV2SupportServiceSupportRequestsGet**
> SupportRequestDtoListEnvelope apiV2SupportServiceSupportRequestsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestDtoListEnvelope = apiInstance.apiV2SupportServiceSupportRequestsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsGet")
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

[**SupportRequestDtoListEnvelope**](SupportRequestDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportRequestsPost"></a>
# **apiV2SupportServiceSupportRequestsPost**
> EmptyEnvelope apiV2SupportServiceSupportRequestsPost(supportRequestCreateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestCreateDto : SupportRequestCreateDto =  // SupportRequestCreateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestsPost(supportRequestCreateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsPost")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestCreateDto** | [**SupportRequestCreateDto**](SupportRequestCreateDto.md)|  | |
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

<a id="apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet"></a>
# **apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet**
> SupportRequestAttachmentDtoEnvelope apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet(supportRequestId, attachmentId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val attachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestAttachmentDtoEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet(supportRequestId, attachmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsAttachmentIdGet")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **attachmentId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet"></a>
# **apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet**
> Int32Envelope apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet(supportRequestId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsCountGet")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet"></a>
# **apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet**
> SupportRequestAttachmentDtoListEnvelope apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet(supportRequestId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestAttachmentDtoListEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsGet")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost"></a>
# **apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost**
> EmptyEnvelope apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost(supportRequestId, supportRequestAttachmentCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportRequestAttachmentCreateDto : SupportRequestAttachmentCreateDto =  // SupportRequestAttachmentCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost(supportRequestId, supportRequestAttachmentCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdAttachmentsPost")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **supportRequestAttachmentCreateDto** | [**SupportRequestAttachmentCreateDto**](SupportRequestAttachmentCreateDto.md)|  | |
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

<a id="apiV2SupportServiceSupportRequestsSupportRequestIdDelete"></a>
# **apiV2SupportServiceSupportRequestsSupportRequestIdDelete**
> EmptyEnvelope apiV2SupportServiceSupportRequestsSupportRequestIdDelete(supportRequestId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdDelete(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportRequestsSupportRequestIdGet"></a>
# **apiV2SupportServiceSupportRequestsSupportRequestIdGet**
> SupportRequestDtoEnvelope apiV2SupportServiceSupportRequestsSupportRequestIdGet(supportRequestId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestDtoEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdGet(supportRequestId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdGet")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportRequestDtoEnvelope**](SupportRequestDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportRequestsSupportRequestIdPut"></a>
# **apiV2SupportServiceSupportRequestsSupportRequestIdPut**
> EmptyEnvelope apiV2SupportServiceSupportRequestsSupportRequestIdPut(supportRequestId, supportRequestUpdateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportRequestUpdateDto : SupportRequestUpdateDto =  // SupportRequestUpdateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdPut(supportRequestId, supportRequestUpdateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdPut")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **supportRequestUpdateDto** | [**SupportRequestUpdateDto**](SupportRequestUpdateDto.md)|  | |
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

<a id="apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet"></a>
# **apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet**
> SupportTicketDtoListEnvelope apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet(supportRequestId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketDtoListEnvelope = apiInstance.apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#apiV2SupportServiceSupportRequestsSupportRequestIdTicketsGet")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketDtoListEnvelope**](SupportTicketDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

