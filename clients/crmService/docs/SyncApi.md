# SyncApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2CrmServiceSyncMePost**](SyncApi.md#apiV2CrmServiceSyncMePost) | **POST** /api/v2/CrmService/Sync/Me |  |
| [**apiV2CrmServiceSyncPost**](SyncApi.md#apiV2CrmServiceSyncPost) | **POST** /api/v2/CrmService/Sync |  |
| [**apiV2CrmServiceSyncTenantPost**](SyncApi.md#apiV2CrmServiceSyncTenantPost) | **POST** /api/v2/CrmService/Sync/Tenant |  |
| [**apiV2CrmServiceSyncUserPost**](SyncApi.md#apiV2CrmServiceSyncUserPost) | **POST** /api/v2/CrmService/Sync/User |  |


<a id="apiV2CrmServiceSyncMePost"></a>
# **apiV2CrmServiceSyncMePost**
> ContactDtoListEnvelope apiV2CrmServiceSyncMePost(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SyncApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoListEnvelope = apiInstance.apiV2CrmServiceSyncMePost(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#apiV2CrmServiceSyncMePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#apiV2CrmServiceSyncMePost")
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

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CrmServiceSyncPost"></a>
# **apiV2CrmServiceSyncPost**
> ContactDtoListEnvelope apiV2CrmServiceSyncPost(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SyncApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoListEnvelope = apiInstance.apiV2CrmServiceSyncPost(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#apiV2CrmServiceSyncPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#apiV2CrmServiceSyncPost")
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

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2CrmServiceSyncTenantPost"></a>
# **apiV2CrmServiceSyncTenantPost**
> EmptyEnvelope apiV2CrmServiceSyncTenantPost(tenantId, relatedTenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SyncApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val relatedTenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2CrmServiceSyncTenantPost(tenantId, relatedTenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#apiV2CrmServiceSyncTenantPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#apiV2CrmServiceSyncTenantPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **relatedTenantId** | **java.util.UUID**|  | |
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

<a id="apiV2CrmServiceSyncUserPost"></a>
# **apiV2CrmServiceSyncUserPost**
> ContactDtoListEnvelope apiV2CrmServiceSyncUserPost(tenantId, relatedUserId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SyncApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val relatedUserId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoListEnvelope = apiInstance.apiV2CrmServiceSyncUserPost(tenantId, relatedUserId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#apiV2CrmServiceSyncUserPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#apiV2CrmServiceSyncUserPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **relatedUserId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

