# SupportTicketPrioritiesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SupportServiceSupportTicketPrioritiesCountGet**](SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesCountGet) | **GET** /api/v2/SupportService/SupportTicketPriorities/Count |  |
| [**apiV2SupportServiceSupportTicketPrioritiesGet**](SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesGet) | **GET** /api/v2/SupportService/SupportTicketPriorities |  |
| [**apiV2SupportServiceSupportTicketPrioritiesPost**](SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesPost) | **POST** /api/v2/SupportService/SupportTicketPriorities |  |
| [**apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete**](SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete) | **DELETE** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} |  |
| [**apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet**](SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet) | **GET** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} |  |
| [**apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut**](SupportTicketPrioritiesApi.md#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut) | **PUT** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} |  |


<a id="apiV2SupportServiceSupportTicketPrioritiesCountGet"></a>
# **apiV2SupportServiceSupportTicketPrioritiesCountGet**
> Int32Envelope apiV2SupportServiceSupportTicketPrioritiesCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportTicketPrioritiesCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesCountGet")
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

<a id="apiV2SupportServiceSupportTicketPrioritiesGet"></a>
# **apiV2SupportServiceSupportTicketPrioritiesGet**
> SupportTicketPriorityDtoListEnvelope apiV2SupportServiceSupportTicketPrioritiesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketPriorityDtoListEnvelope = apiInstance.apiV2SupportServiceSupportTicketPrioritiesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesGet")
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

[**SupportTicketPriorityDtoListEnvelope**](SupportTicketPriorityDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketPrioritiesPost"></a>
# **apiV2SupportServiceSupportTicketPrioritiesPost**
> EmptyEnvelope apiV2SupportServiceSupportTicketPrioritiesPost(supportTicketPriorityCreateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val supportTicketPriorityCreateDto : SupportTicketPriorityCreateDto =  // SupportTicketPriorityCreateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketPrioritiesPost(supportTicketPriorityCreateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesPost")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketPriorityCreateDto** | [**SupportTicketPriorityCreateDto**](SupportTicketPriorityCreateDto.md)|  | |
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

<a id="apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete"></a>
# **apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete**
> EmptyEnvelope apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete(supportTicketPriorityId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val supportTicketPriorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete(supportTicketPriorityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketPriorityId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet"></a>
# **apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet**
> SupportTicketPriorityDtoEnvelope apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet(supportTicketPriorityId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val supportTicketPriorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketPriorityDtoEnvelope = apiInstance.apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet(supportTicketPriorityId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdGet")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketPriorityId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketPriorityDtoEnvelope**](SupportTicketPriorityDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut"></a>
# **apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut**
> EmptyEnvelope apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut(supportTicketPriorityId, supportTicketPriorityUpdateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val supportTicketPriorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketPriorityUpdateDto : SupportTicketPriorityUpdateDto =  // SupportTicketPriorityUpdateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut(supportTicketPriorityId, supportTicketPriorityUpdateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#apiV2SupportServiceSupportTicketPrioritiesSupportTicketPriorityIdPut")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketPriorityId** | **java.util.UUID**|  | |
| **supportTicketPriorityUpdateDto** | [**SupportTicketPriorityUpdateDto**](SupportTicketPriorityUpdateDto.md)|  | |
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

