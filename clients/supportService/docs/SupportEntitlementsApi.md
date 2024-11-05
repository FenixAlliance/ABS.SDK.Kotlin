# SupportEntitlementsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SupportServiceSupportEntitlementsCountGet**](SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsCountGet) | **GET** /api/v2/SupportService/SupportEntitlements/Count |  |
| [**apiV2SupportServiceSupportEntitlementsGet**](SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsGet) | **GET** /api/v2/SupportService/SupportEntitlements |  |
| [**apiV2SupportServiceSupportEntitlementsPost**](SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsPost) | **POST** /api/v2/SupportService/SupportEntitlements |  |
| [**apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete**](SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete) | **DELETE** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} |  |
| [**apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet**](SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet) | **GET** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} |  |
| [**apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut**](SupportEntitlementsApi.md#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut) | **PUT** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} |  |


<a id="apiV2SupportServiceSupportEntitlementsCountGet"></a>
# **apiV2SupportServiceSupportEntitlementsCountGet**
> Int32Envelope apiV2SupportServiceSupportEntitlementsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SupportServiceSupportEntitlementsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsCountGet")
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

<a id="apiV2SupportServiceSupportEntitlementsGet"></a>
# **apiV2SupportServiceSupportEntitlementsGet**
> SupportEntitlementDtoListEnvelope apiV2SupportServiceSupportEntitlementsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportEntitlementDtoListEnvelope = apiInstance.apiV2SupportServiceSupportEntitlementsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsGet")
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

[**SupportEntitlementDtoListEnvelope**](SupportEntitlementDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportEntitlementsPost"></a>
# **apiV2SupportServiceSupportEntitlementsPost**
> EmptyEnvelope apiV2SupportServiceSupportEntitlementsPost(supportEntitlementCreateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val supportEntitlementCreateDto : SupportEntitlementCreateDto =  // SupportEntitlementCreateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportEntitlementsPost(supportEntitlementCreateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsPost")
    e.printStackTrace()
}
```

### Parameters
| **supportEntitlementCreateDto** | [**SupportEntitlementCreateDto**](SupportEntitlementCreateDto.md)|  | |
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

<a id="apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete"></a>
# **apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete**
> EmptyEnvelope apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete(supportEntitlementId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val supportEntitlementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete(supportEntitlementId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **supportEntitlementId** | **java.util.UUID**|  | |
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

<a id="apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet"></a>
# **apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet**
> SupportEntitlementDtoEnvelope apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet(supportEntitlementId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val supportEntitlementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportEntitlementDtoEnvelope = apiInstance.apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet(supportEntitlementId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdGet")
    e.printStackTrace()
}
```

### Parameters
| **supportEntitlementId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportEntitlementDtoEnvelope**](SupportEntitlementDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut"></a>
# **apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut**
> EmptyEnvelope apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut(supportEntitlementId, supportEntitlementUpdateDto, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val supportEntitlementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportEntitlementUpdateDto : SupportEntitlementUpdateDto =  // SupportEntitlementUpdateDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut(supportEntitlementId, supportEntitlementUpdateDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#apiV2SupportServiceSupportEntitlementsSupportEntitlementIdPut")
    e.printStackTrace()
}
```

### Parameters
| **supportEntitlementId** | **java.util.UUID**|  | |
| **supportEntitlementUpdateDto** | [**SupportEntitlementUpdateDto**](SupportEntitlementUpdateDto.md)|  | |
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

