# SupportTicketTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SupportServiceSupportTicketTypesCountGet**](SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesCountGet) | **GET** /api/v2/SupportService/SupportTicketTypes/Count |  |
| [**apiV2SupportServiceSupportTicketTypesGet**](SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesGet) | **GET** /api/v2/SupportService/SupportTicketTypes |  |
| [**apiV2SupportServiceSupportTicketTypesPost**](SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesPost) | **POST** /api/v2/SupportService/SupportTicketTypes |  |
| [**apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete**](SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete) | **DELETE** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} |  |
| [**apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet**](SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet) | **GET** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} |  |
| [**apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut**](SupportTicketTypesApi.md#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut) | **PUT** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} |  |


<a id="apiV2SupportServiceSupportTicketTypesCountGet"></a>
# **apiV2SupportServiceSupportTicketTypesCountGet**
> Int32Envelope apiV2SupportServiceSupportTicketTypesCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportTicketTypesCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesCountGet")
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

<a id="apiV2SupportServiceSupportTicketTypesGet"></a>
# **apiV2SupportServiceSupportTicketTypesGet**
> SupportTicketTypeDtoListEnvelope apiV2SupportServiceSupportTicketTypesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketTypeDtoListEnvelope = apiInstance.apiV2SupportServiceSupportTicketTypesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesGet")
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

[**SupportTicketTypeDtoListEnvelope**](SupportTicketTypeDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketTypesPost"></a>
# **apiV2SupportServiceSupportTicketTypesPost**
> EmptyEnvelope apiV2SupportServiceSupportTicketTypesPost(supportTicketTypeCreateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val supportTicketTypeCreateDto : SupportTicketTypeCreateDto =  // SupportTicketTypeCreateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketTypesPost(supportTicketTypeCreateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesPost")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketTypeCreateDto** | [**SupportTicketTypeCreateDto**](SupportTicketTypeCreateDto.md)|  | |
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

<a id="apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete"></a>
# **apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete**
> EmptyEnvelope apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete(supportTicketTypeId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val supportTicketTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete(supportTicketTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketTypeId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet"></a>
# **apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet**
> SupportTicketTypeDtoEnvelope apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet(supportTicketTypeId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val supportTicketTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketTypeDtoEnvelope = apiInstance.apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet(supportTicketTypeId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdGet")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketTypeId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketTypeDtoEnvelope**](SupportTicketTypeDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut"></a>
# **apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut**
> EmptyEnvelope apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut(supportTicketTypeId, supportTicketTypeUpdateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val supportTicketTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketTypeUpdateDto : SupportTicketTypeUpdateDto =  // SupportTicketTypeUpdateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut(supportTicketTypeId, supportTicketTypeUpdateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#apiV2SupportServiceSupportTicketTypesSupportTicketTypeIdPut")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketTypeId** | **java.util.UUID**|  | |
| **supportTicketTypeUpdateDto** | [**SupportTicketTypeUpdateDto**](SupportTicketTypeUpdateDto.md)|  | |
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

