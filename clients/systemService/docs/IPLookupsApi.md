# IPLookupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteSystemIPLookup**](IPLookupsApi.md#deleteSystemIPLookup) | **DELETE** /api/v2/SystemService/IPLookups/{ipLookupId} | Delete a system IP lookup |
| [**getSystemIPLookupById**](IPLookupsApi.md#getSystemIPLookupById) | **GET** /api/v2/SystemService/IPLookups/{ipLookupId} | Retrieve a single system IP lookup by its ID |
| [**getSystemIPLookups**](IPLookupsApi.md#getSystemIPLookups) | **GET** /api/v2/SystemService/IPLookups | Retrieve a list of system IP lookups |
| [**getSystemIPLookupsCount**](IPLookupsApi.md#getSystemIPLookupsCount) | **GET** /api/v2/SystemService/IPLookups/Count | Get the count of system IP lookups |


<a id="deleteSystemIPLookup"></a>
# **deleteSystemIPLookup**
> EmptyEnvelope deleteSystemIPLookup(ipLookupId, apiVersion, xApiVersion)

Delete a system IP lookup

Delete a system IP lookup by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IPLookupsApi()
val ipLookupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSystemIPLookup(ipLookupId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IPLookupsApi#deleteSystemIPLookup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IPLookupsApi#deleteSystemIPLookup")
    e.printStackTrace()
}
```

### Parameters
| **ipLookupId** | **java.util.UUID**|  | |
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

<a id="getSystemIPLookupById"></a>
# **getSystemIPLookupById**
> IPLookupDtoEnvelope getSystemIPLookupById(ipLookupId, apiVersion, xApiVersion)

Retrieve a single system IP lookup by its ID

Retrieve a single system IP lookup by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IPLookupsApi()
val ipLookupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : IPLookupDtoEnvelope = apiInstance.getSystemIPLookupById(ipLookupId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IPLookupsApi#getSystemIPLookupById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IPLookupsApi#getSystemIPLookupById")
    e.printStackTrace()
}
```

### Parameters
| **ipLookupId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**IPLookupDtoEnvelope**](IPLookupDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemIPLookups"></a>
# **getSystemIPLookups**
> IPLookupDtoListEnvelope getSystemIPLookups(apiVersion, xApiVersion)

Retrieve a list of system IP lookups

Retrieve a list of all IP lookups in the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IPLookupsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : IPLookupDtoListEnvelope = apiInstance.getSystemIPLookups(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IPLookupsApi#getSystemIPLookups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IPLookupsApi#getSystemIPLookups")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**IPLookupDtoListEnvelope**](IPLookupDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemIPLookupsCount"></a>
# **getSystemIPLookupsCount**
> Int32Envelope getSystemIPLookupsCount(apiVersion, xApiVersion)

Get the count of system IP lookups

Get the count of all IP lookups in the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IPLookupsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSystemIPLookupsCount(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IPLookupsApi#getSystemIPLookupsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IPLookupsApi#getSystemIPLookupsCount")
    e.printStackTrace()
}
```

### Parameters
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

