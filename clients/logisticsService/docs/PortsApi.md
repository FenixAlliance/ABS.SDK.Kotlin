# PortsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPortAsync**](PortsApi.md#createPortAsync) | **POST** /api/v2/LogisticsService/Ports | Create a port |
| [**deletePortAsync**](PortsApi.md#deletePortAsync) | **DELETE** /api/v2/LogisticsService/Ports/{portId} | Delete a port |
| [**getPortByIdAsync**](PortsApi.md#getPortByIdAsync) | **GET** /api/v2/LogisticsService/Ports/{portId} | Get port by ID |
| [**getPortsAsync**](PortsApi.md#getPortsAsync) | **GET** /api/v2/LogisticsService/Ports | Get all ports |
| [**getPortsCountAsync**](PortsApi.md#getPortsCountAsync) | **GET** /api/v2/LogisticsService/Ports/Count | Get ports count |
| [**patchPortAsync**](PortsApi.md#patchPortAsync) | **PATCH** /api/v2/LogisticsService/Ports/{portId} | Patch a port |
| [**updatePortAsync**](PortsApi.md#updatePortAsync) | **PUT** /api/v2/LogisticsService/Ports/{portId} | Update a port |


<a id="createPortAsync"></a>
# **createPortAsync**
> EmptyEnvelope createPortAsync(tenantId, apiVersion, xApiVersion, portCreateDto)

Create a port

Creates a new port for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val portCreateDto : PortCreateDto =  // PortCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPortAsync(tenantId, apiVersion, xApiVersion, portCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortsApi#createPortAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortsApi#createPortAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **portCreateDto** | [**PortCreateDto**](PortCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePortAsync"></a>
# **deletePortAsync**
> EmptyEnvelope deletePortAsync(portId, tenantId, apiVersion, xApiVersion)

Delete a port

Deletes a port.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortsApi()
val portId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deletePortAsync(portId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortsApi#deletePortAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortsApi#deletePortAsync")
    e.printStackTrace()
}
```

### Parameters
| **portId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="getPortByIdAsync"></a>
# **getPortByIdAsync**
> PortDtoEnvelope getPortByIdAsync(portId, tenantId, apiVersion, xApiVersion)

Get port by ID

Retrieves a specific port by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortsApi()
val portId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PortDtoEnvelope = apiInstance.getPortByIdAsync(portId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortsApi#getPortByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortsApi#getPortByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **portId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PortDtoEnvelope**](PortDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPortsAsync"></a>
# **getPortsAsync**
> PortDtoListEnvelope getPortsAsync(tenantId, apiVersion, xApiVersion)

Get all ports

Retrieves all ports for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PortDtoListEnvelope = apiInstance.getPortsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortsApi#getPortsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortsApi#getPortsAsync")
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

[**PortDtoListEnvelope**](PortDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPortsCountAsync"></a>
# **getPortsCountAsync**
> Int32Envelope getPortsCountAsync(tenantId, apiVersion, xApiVersion)

Get ports count

Returns the count of ports for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getPortsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortsApi#getPortsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortsApi#getPortsCountAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchPortAsync"></a>
# **patchPortAsync**
> EmptyEnvelope patchPortAsync(portId, tenantId, apiVersion, xApiVersion, operation)

Patch a port

Partially updates an existing port using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortsApi()
val portId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchPortAsync(portId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortsApi#patchPortAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortsApi#patchPortAsync")
    e.printStackTrace()
}
```

### Parameters
| **portId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="updatePortAsync"></a>
# **updatePortAsync**
> EmptyEnvelope updatePortAsync(portId, tenantId, apiVersion, xApiVersion, portUpdateDto)

Update a port

Updates an existing port.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PortsApi()
val portId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val portUpdateDto : PortUpdateDto =  // PortUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePortAsync(portId, tenantId, apiVersion, xApiVersion, portUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PortsApi#updatePortAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PortsApi#updatePortAsync")
    e.printStackTrace()
}
```

### Parameters
| **portId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **portUpdateDto** | [**PortUpdateDto**](PortUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

