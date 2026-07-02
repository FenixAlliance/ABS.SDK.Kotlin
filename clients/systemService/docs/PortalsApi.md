# PortalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSystemPortal**](PortalsApi.md#createSystemPortal) | **POST** /api/v2/SystemService/Portals | Create a new system portal |
| [**deleteSystemPortal**](PortalsApi.md#deleteSystemPortal) | **DELETE** /api/v2/SystemService/Portals/{portalId} | Delete a system portal |
| [**getSystemPortalById**](PortalsApi.md#getSystemPortalById) | **GET** /api/v2/SystemService/Portals/{portalId} | Retrieve a single system portal by its ID |
| [**getSystemPortals**](PortalsApi.md#getSystemPortals) | **GET** /api/v2/SystemService/Portals | Retrieve a list of system portals |
| [**getSystemPortalsCount**](PortalsApi.md#getSystemPortalsCount) | **GET** /api/v2/SystemService/Portals/Count | Get the count of system portals |
| [**patchSystemPortal**](PortalsApi.md#patchSystemPortal) | **PATCH** /api/v2/SystemService/Portals/{portalId} | Partially update a system portal |
| [**updateSystemPortal**](PortalsApi.md#updateSystemPortal) | **PUT** /api/v2/SystemService/Portals/{portalId} | Update a system portal |


<a id="createSystemPortal"></a>
# **createSystemPortal**
> EmptyEnvelope createSystemPortal(apiVersion, xApiVersion, webPortalCreateDto)

Create a new system portal

Create a new web portal in the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPortalCreateDto : WebPortalCreateDto =  // WebPortalCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSystemPortal(apiVersion, xApiVersion, webPortalCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#createSystemPortal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#createSystemPortal")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPortalCreateDto** | [**WebPortalCreateDto**](WebPortalCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSystemPortal"></a>
# **deleteSystemPortal**
> EmptyEnvelope deleteSystemPortal(portalId, apiVersion, xApiVersion)

Delete a system portal

Delete a web portal from the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSystemPortal(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#deleteSystemPortal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#deleteSystemPortal")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
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

<a id="getSystemPortalById"></a>
# **getSystemPortalById**
> WebPortalDtoEnvelope getSystemPortalById(portalId, apiVersion, xApiVersion)

Retrieve a single system portal by its ID

Retrieve a single system portal by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoEnvelope = apiInstance.getSystemPortalById(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getSystemPortalById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getSystemPortalById")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPortalDtoEnvelope**](WebPortalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemPortals"></a>
# **getSystemPortals**
> WebPortalDtoListEnvelope getSystemPortals(apiVersion, xApiVersion)

Retrieve a list of system portals

Retrieve a list of all web portals in the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoListEnvelope = apiInstance.getSystemPortals(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getSystemPortals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getSystemPortals")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPortalDtoListEnvelope**](WebPortalDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemPortalsCount"></a>
# **getSystemPortalsCount**
> Int32Envelope getSystemPortalsCount(apiVersion, xApiVersion)

Get the count of system portals

Get the count of all web portals in the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSystemPortalsCount(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#getSystemPortalsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#getSystemPortalsCount")
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

<a id="patchSystemPortal"></a>
# **patchSystemPortal**
> EmptyEnvelope patchSystemPortal(portalId, apiVersion, xApiVersion, operation)

Partially update a system portal

Partially update an existing web portal in the system using a JSON Patch document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSystemPortal(portalId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#patchSystemPortal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#patchSystemPortal")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSystemPortal"></a>
# **updateSystemPortal**
> EmptyEnvelope updateSystemPortal(portalId, apiVersion, xApiVersion, webPortalUpdateDto)

Update a system portal

Update an existing web portal in the system

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortalsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPortalUpdateDto : WebPortalUpdateDto =  // WebPortalUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSystemPortal(portalId, apiVersion, xApiVersion, webPortalUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortalsApi#updateSystemPortal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortalsApi#updateSystemPortal")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPortalUpdateDto** | [**WebPortalUpdateDto**](WebPortalUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

