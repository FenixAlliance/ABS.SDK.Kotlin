# CapabilitiesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getCapabilitiesAsync**](CapabilitiesApi.md#getCapabilitiesAsync) | **GET** /api/v2/IntelligenceService/Capabilities | Get the annotated capability catalog |
| [**getCapabilitiesCountAsync**](CapabilitiesApi.md#getCapabilitiesCountAsync) | **GET** /api/v2/IntelligenceService/Capabilities/Count | Get the capability catalog count |
| [**getCapabilityByKeyAsync**](CapabilitiesApi.md#getCapabilityByKeyAsync) | **GET** /api/v2/IntelligenceService/Capabilities/{key} | Get a capability by key |


<a id="getCapabilitiesAsync"></a>
# **getCapabilitiesAsync**
> CapabilityDtoListEnvelope getCapabilitiesAsync(tenantId, surface, apiVersion, xApiVersion)

Get the annotated capability catalog

Retrieves the full governed-capability catalog for the specified tenant, optionally narrowed to a single execution surface. Every capability is returned with an Available flag (and a DeniedReason when not available) so callers render disabled-with-reason instead of hiding; entitlement is computed server-side.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CapabilitiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val surface : kotlin.String = surface_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CapabilityDtoListEnvelope = apiInstance.getCapabilitiesAsync(tenantId, surface, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CapabilitiesApi#getCapabilitiesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CapabilitiesApi#getCapabilitiesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **surface** | **kotlin.String**|  | [optional] [enum: None, Workflow, AI, Mcp, Job, Integration, Webhook, Admin] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CapabilityDtoListEnvelope**](CapabilityDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCapabilitiesCountAsync"></a>
# **getCapabilitiesCountAsync**
> Int32Envelope getCapabilitiesCountAsync(tenantId, surface, apiVersion, xApiVersion)

Get the capability catalog count

Returns the number of governed capabilities in the catalog for the specified tenant — the surface-matching total that mirrors the list route&#39;s returned-set size (entitled or not), honouring the same optional surface narrowing.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CapabilitiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val surface : kotlin.String = surface_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getCapabilitiesCountAsync(tenantId, surface, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CapabilitiesApi#getCapabilitiesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CapabilitiesApi#getCapabilitiesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **surface** | **kotlin.String**|  | [optional] [enum: None, Workflow, AI, Mcp, Job, Integration, Webhook, Admin] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCapabilityByKeyAsync"></a>
# **getCapabilityByKeyAsync**
> CapabilityDtoEnvelope getCapabilityByKeyAsync(key, tenantId, apiVersion, xApiVersion)

Get a capability by key

Retrieves a single governed capability by its stable, dotted key, stamped with the Available / DeniedReason entitlement flag. Returns 404 only when the capability does not exist; an existing capability the actor is not entitled to run is returned annotated as unavailable, not hidden.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CapabilitiesApi()
val key : kotlin.String = key_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CapabilityDtoEnvelope = apiInstance.getCapabilityByKeyAsync(key, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CapabilitiesApi#getCapabilityByKeyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CapabilitiesApi#getCapabilityByKeyAsync")
    e.printStackTrace()
}
```

### Parameters
| **key** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CapabilityDtoEnvelope**](CapabilityDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

