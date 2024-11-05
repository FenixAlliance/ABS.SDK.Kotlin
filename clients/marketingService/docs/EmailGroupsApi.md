# EmailGroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceEmailGroupsCountGet**](EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsCountGet) | **GET** /api/v2/MarketingService/EmailGroups/Count |  |
| [**apiV2MarketingServiceEmailGroupsEmailgroupIdDelete**](EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsEmailgroupIdDelete) | **DELETE** /api/v2/MarketingService/EmailGroups/{emailgroupId} |  |
| [**apiV2MarketingServiceEmailGroupsEmailgroupIdGet**](EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsEmailgroupIdGet) | **GET** /api/v2/MarketingService/EmailGroups/{emailgroupId} |  |
| [**apiV2MarketingServiceEmailGroupsEmailgroupIdPut**](EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsEmailgroupIdPut) | **PUT** /api/v2/MarketingService/EmailGroups/{emailgroupId} |  |
| [**apiV2MarketingServiceEmailGroupsGet**](EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsGet) | **GET** /api/v2/MarketingService/EmailGroups |  |
| [**apiV2MarketingServiceEmailGroupsPost**](EmailGroupsApi.md#apiV2MarketingServiceEmailGroupsPost) | **POST** /api/v2/MarketingService/EmailGroups |  |


<a id="apiV2MarketingServiceEmailGroupsCountGet"></a>
# **apiV2MarketingServiceEmailGroupsCountGet**
> Int32Envelope apiV2MarketingServiceEmailGroupsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2MarketingServiceEmailGroupsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsCountGet")
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

<a id="apiV2MarketingServiceEmailGroupsEmailgroupIdDelete"></a>
# **apiV2MarketingServiceEmailGroupsEmailgroupIdDelete**
> EmptyEnvelope apiV2MarketingServiceEmailGroupsEmailgroupIdDelete(emailgroupId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val emailgroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailGroupsEmailgroupIdDelete(emailgroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsEmailgroupIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsEmailgroupIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **emailgroupId** | **java.util.UUID**|  | |
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

<a id="apiV2MarketingServiceEmailGroupsEmailgroupIdGet"></a>
# **apiV2MarketingServiceEmailGroupsEmailgroupIdGet**
> EmailGroupDtoEnvelope apiV2MarketingServiceEmailGroupsEmailgroupIdGet(emailgroupId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val emailgroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailGroupDtoEnvelope = apiInstance.apiV2MarketingServiceEmailGroupsEmailgroupIdGet(emailgroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsEmailgroupIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsEmailgroupIdGet")
    e.printStackTrace()
}
```

### Parameters
| **emailgroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmailGroupDtoEnvelope**](EmailGroupDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailGroupsEmailgroupIdPut"></a>
# **apiV2MarketingServiceEmailGroupsEmailgroupIdPut**
> EmptyEnvelope apiV2MarketingServiceEmailGroupsEmailgroupIdPut(emailgroupId, tenantId, emailGroupUpdateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val emailgroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailGroupUpdateDto : EmailGroupUpdateDto =  // EmailGroupUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailGroupsEmailgroupIdPut(emailgroupId, tenantId, emailGroupUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsEmailgroupIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsEmailgroupIdPut")
    e.printStackTrace()
}
```

### Parameters
| **emailgroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **emailGroupUpdateDto** | [**EmailGroupUpdateDto**](EmailGroupUpdateDto.md)|  | |
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

<a id="apiV2MarketingServiceEmailGroupsGet"></a>
# **apiV2MarketingServiceEmailGroupsGet**
> EmailGroupDtoListEnvelope apiV2MarketingServiceEmailGroupsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailGroupDtoListEnvelope = apiInstance.apiV2MarketingServiceEmailGroupsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsGet")
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

[**EmailGroupDtoListEnvelope**](EmailGroupDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceEmailGroupsPost"></a>
# **apiV2MarketingServiceEmailGroupsPost**
> EmptyEnvelope apiV2MarketingServiceEmailGroupsPost(tenantId, emailGroupCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailGroupCreateDto : EmailGroupCreateDto =  // EmailGroupCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceEmailGroupsPost(tenantId, emailGroupCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#apiV2MarketingServiceEmailGroupsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **emailGroupCreateDto** | [**EmailGroupCreateDto**](EmailGroupCreateDto.md)|  | |
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

