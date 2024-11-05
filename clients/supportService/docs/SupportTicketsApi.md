# SupportTicketsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SupportServiceSupportTicketsCountGet**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsCountGet) | **GET** /api/v2/SupportService/SupportTickets/Count |  |
| [**apiV2SupportServiceSupportTicketsGet**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsGet) | **GET** /api/v2/SupportService/SupportTickets |  |
| [**apiV2SupportServiceSupportTicketsPost**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsPost) | **POST** /api/v2/SupportService/SupportTickets |  |
| [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations |  |
| [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost) | **POST** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations |  |
| [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete) | **DELETE** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId} |  |
| [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId} |  |
| [**apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId}/Messages |  |
| [**apiV2SupportServiceSupportTicketsSupportTicketIdDelete**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdDelete) | **DELETE** /api/v2/SupportService/SupportTickets/{supportTicketId} |  |
| [**apiV2SupportServiceSupportTicketsSupportTicketIdGet**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdGet) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId} |  |
| [**apiV2SupportServiceSupportTicketsSupportTicketIdPut**](SupportTicketsApi.md#apiV2SupportServiceSupportTicketsSupportTicketIdPut) | **PUT** /api/v2/SupportService/SupportTickets/{supportTicketId} |  |


<a id="apiV2SupportServiceSupportTicketsCountGet"></a>
# **apiV2SupportServiceSupportTicketsCountGet**
> Int32Envelope apiV2SupportServiceSupportTicketsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportTicketsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsCountGet")
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

<a id="apiV2SupportServiceSupportTicketsGet"></a>
# **apiV2SupportServiceSupportTicketsGet**
> SupportTicketDtoListEnvelope apiV2SupportServiceSupportTicketsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketDtoListEnvelope = apiInstance.apiV2SupportServiceSupportTicketsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsGet")
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

[**SupportTicketDtoListEnvelope**](SupportTicketDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketsPost"></a>
# **apiV2SupportServiceSupportTicketsPost**
> EmptyEnvelope apiV2SupportServiceSupportTicketsPost(supportTicketCreateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketCreateDto : SupportTicketCreateDto =  // SupportTicketCreateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsPost(supportTicketCreateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsPost")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketCreateDto** | [**SupportTicketCreateDto**](SupportTicketCreateDto.md)|  | |
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

<a id="apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet"></a>
# **apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet**
> SupportTicketConversationDtoListEnvelope apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet(supportTicketId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketConversationDtoListEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet(supportTicketId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsGet")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketConversationDtoListEnvelope**](SupportTicketConversationDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost"></a>
# **apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost**
> EmptyEnvelope apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost(supportTicketId, supportTicketConversationCreateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketConversationCreateDto : SupportTicketConversationCreateDto =  // SupportTicketConversationCreateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost(supportTicketId, supportTicketConversationCreateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsPost")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **supportTicketConversationCreateDto** | [**SupportTicketConversationCreateDto**](SupportTicketConversationCreateDto.md)|  | |
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

<a id="apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete"></a>
# **apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete**
> EmptyEnvelope apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete(supportTicketId, supportTicketConversationId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete(supportTicketId, supportTicketConversationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **supportTicketConversationId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet"></a>
# **apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet**
> SupportTicketConversationDtoEnvelope apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet(supportTicketId, supportTicketConversationId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketConversationDtoEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet(supportTicketId, supportTicketConversationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdGet")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **supportTicketConversationId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketConversationDtoEnvelope**](SupportTicketConversationDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet"></a>
# **apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet**
> PrivateMessageDtoListEnvelope apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet(supportTicketConversationId, supportTicketId, pageNumber, pageSize, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketId : kotlin.String = supportTicketId_example // kotlin.String | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PrivateMessageDtoListEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet(supportTicketConversationId, supportTicketId, pageNumber, pageSize, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdConversationsSupportTicketConversationIdMessagesGet")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketConversationId** | **java.util.UUID**|  | |
| **supportTicketId** | **kotlin.String**|  | |
| **pageNumber** | **kotlin.Int**|  | [optional] |
| **pageSize** | **kotlin.Int**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PrivateMessageDtoListEnvelope**](PrivateMessageDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketsSupportTicketIdDelete"></a>
# **apiV2SupportServiceSupportTicketsSupportTicketIdDelete**
> EmptyEnvelope apiV2SupportServiceSupportTicketsSupportTicketIdDelete(supportTicketId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdDelete(supportTicketId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportTicketsSupportTicketIdGet"></a>
# **apiV2SupportServiceSupportTicketsSupportTicketIdGet**
> SupportTicketDtoEnvelope apiV2SupportServiceSupportTicketsSupportTicketIdGet(supportTicketId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketDtoEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdGet(supportTicketId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdGet")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketDtoEnvelope**](SupportTicketDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketsSupportTicketIdPut"></a>
# **apiV2SupportServiceSupportTicketsSupportTicketIdPut**
> EmptyEnvelope apiV2SupportServiceSupportTicketsSupportTicketIdPut(supportTicketId, supportTicketUpdateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketUpdateDto : SupportTicketUpdateDto =  // SupportTicketUpdateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketsSupportTicketIdPut(supportTicketId, supportTicketUpdateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#apiV2SupportServiceSupportTicketsSupportTicketIdPut")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **supportTicketUpdateDto** | [**SupportTicketUpdateDto**](SupportTicketUpdateDto.md)|  | |
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

