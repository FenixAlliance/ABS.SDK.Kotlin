# SyncApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**syncCurrentHolderToCurrentTenantCrm**](SyncApi.md#syncCurrentHolderToCurrentTenantCrm) | **POST** /api/v2/CrmService/Sync | Sync the current user into the current tenant&#39;s contact list |
| [**syncCurrentHolderToTenantCrm**](SyncApi.md#syncCurrentHolderToTenantCrm) | **POST** /api/v2/CrmService/Sync/Me | Sync the current user into a tenant&#39;s contact list |
| [**syncHolderToTenantCrmAsync**](SyncApi.md#syncHolderToTenantCrmAsync) | **POST** /api/v2/CrmService/Sync/User | Sync a user into a tenant&#39;s contact list |
| [**syncTenantToTenantCrm**](SyncApi.md#syncTenantToTenantCrm) | **POST** /api/v2/CrmService/Sync/Tenant | Sync a tenant into another tenant&#39;s contact list |


<a id="syncCurrentHolderToCurrentTenantCrm"></a>
# **syncCurrentHolderToCurrentTenantCrm**
> Envelope syncCurrentHolderToCurrentTenantCrm(tenantId, apiVersion, xApiVersion)

Sync the current user into the current tenant&#39;s contact list

Synchronizes the currently authenticated user into the current tenant&#39;s CRM contact list.

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
    val result : Envelope = apiInstance.syncCurrentHolderToCurrentTenantCrm(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#syncCurrentHolderToCurrentTenantCrm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#syncCurrentHolderToCurrentTenantCrm")
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

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="syncCurrentHolderToTenantCrm"></a>
# **syncCurrentHolderToTenantCrm**
> Envelope syncCurrentHolderToTenantCrm(tenantId, apiVersion, xApiVersion)

Sync the current user into a tenant&#39;s contact list

Synchronizes the currently authenticated user into the specified tenant&#39;s CRM contact list.

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
    val result : Envelope = apiInstance.syncCurrentHolderToTenantCrm(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#syncCurrentHolderToTenantCrm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#syncCurrentHolderToTenantCrm")
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

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="syncHolderToTenantCrmAsync"></a>
# **syncHolderToTenantCrmAsync**
> Envelope syncHolderToTenantCrmAsync(tenantId, relatedUserId, apiVersion, xApiVersion)

Sync a user into a tenant&#39;s contact list

Synchronizes a specified user into the tenant&#39;s CRM contact list.

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
    val result : Envelope = apiInstance.syncHolderToTenantCrmAsync(tenantId, relatedUserId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#syncHolderToTenantCrmAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#syncHolderToTenantCrmAsync")
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

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="syncTenantToTenantCrm"></a>
# **syncTenantToTenantCrm**
> EmptyEnvelope syncTenantToTenantCrm(tenantId, relatedTenantId, apiVersion, xApiVersion)

Sync a tenant into another tenant&#39;s contact list

Synchronizes a tenant into another tenant&#39;s CRM contact list.

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
    val result : EmptyEnvelope = apiInstance.syncTenantToTenantCrm(tenantId, relatedTenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SyncApi#syncTenantToTenantCrm")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SyncApi#syncTenantToTenantCrm")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

