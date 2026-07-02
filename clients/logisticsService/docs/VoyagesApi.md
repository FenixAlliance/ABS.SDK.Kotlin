# VoyagesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelVoyageAsync**](VoyagesApi.md#cancelVoyageAsync) | **POST** /api/v2/LogisticsService/Voyages/{voyageId}/Cancel | Cancel a voyage |
| [**completeVoyageAsync**](VoyagesApi.md#completeVoyageAsync) | **POST** /api/v2/LogisticsService/Voyages/{voyageId}/Complete | Complete a voyage |
| [**createVoyageAsync**](VoyagesApi.md#createVoyageAsync) | **POST** /api/v2/LogisticsService/Voyages | Create a voyage |
| [**createVoyagePortCallAsync**](VoyagesApi.md#createVoyagePortCallAsync) | **POST** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls | Create a port call |
| [**deleteVoyageAsync**](VoyagesApi.md#deleteVoyageAsync) | **DELETE** /api/v2/LogisticsService/Voyages/{voyageId} | Delete a voyage |
| [**deleteVoyagePortCallAsync**](VoyagesApi.md#deleteVoyagePortCallAsync) | **DELETE** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls/{portCallId} | Delete a port call |
| [**getVoyageByIdAsync**](VoyagesApi.md#getVoyageByIdAsync) | **GET** /api/v2/LogisticsService/Voyages/{voyageId} | Get voyage by ID |
| [**getVoyagePortCallsAsync**](VoyagesApi.md#getVoyagePortCallsAsync) | **GET** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls | Get voyage port calls |
| [**getVoyagePortCallsCountAsync**](VoyagesApi.md#getVoyagePortCallsCountAsync) | **GET** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls/Count | Get voyage port calls count |
| [**getVoyagesAsync**](VoyagesApi.md#getVoyagesAsync) | **GET** /api/v2/LogisticsService/Voyages | Get all voyages |
| [**getVoyagesCountAsync**](VoyagesApi.md#getVoyagesCountAsync) | **GET** /api/v2/LogisticsService/Voyages/Count | Get voyages count |
| [**patchVoyageAsync**](VoyagesApi.md#patchVoyageAsync) | **PATCH** /api/v2/LogisticsService/Voyages/{voyageId} | Patch a voyage |
| [**patchVoyagePortCallAsync**](VoyagesApi.md#patchVoyagePortCallAsync) | **PATCH** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls/{portCallId} | Patch a voyage port call |
| [**startVoyageAsync**](VoyagesApi.md#startVoyageAsync) | **POST** /api/v2/LogisticsService/Voyages/{voyageId}/Start | Start a voyage |
| [**updateVoyageAsync**](VoyagesApi.md#updateVoyageAsync) | **PUT** /api/v2/LogisticsService/Voyages/{voyageId} | Update a voyage |
| [**updateVoyagePortCallAsync**](VoyagesApi.md#updateVoyagePortCallAsync) | **PUT** /api/v2/LogisticsService/Voyages/{voyageId}/PortCalls/{portCallId} | Update a port call |


<a id="cancelVoyageAsync"></a>
# **cancelVoyageAsync**
> EmptyEnvelope cancelVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion)

Cancel a voyage

Cancels a voyage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.cancelVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#cancelVoyageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#cancelVoyageAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
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

<a id="completeVoyageAsync"></a>
# **completeVoyageAsync**
> EmptyEnvelope completeVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion)

Complete a voyage

Marks a voyage as completed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.completeVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#completeVoyageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#completeVoyageAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
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

<a id="createVoyageAsync"></a>
# **createVoyageAsync**
> EmptyEnvelope createVoyageAsync(tenantId, apiVersion, xApiVersion, voyageCreateDto)

Create a voyage

Creates a new voyage for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val voyageCreateDto : VoyageCreateDto =  // VoyageCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createVoyageAsync(tenantId, apiVersion, xApiVersion, voyageCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#createVoyageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#createVoyageAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **voyageCreateDto** | [**VoyageCreateDto**](VoyageCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createVoyagePortCallAsync"></a>
# **createVoyagePortCallAsync**
> EmptyEnvelope createVoyagePortCallAsync(voyageId, tenantId, apiVersion, xApiVersion, voyagePortCallCreateDto)

Create a port call

Creates a new port call for a voyage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val voyagePortCallCreateDto : VoyagePortCallCreateDto =  // VoyagePortCallCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createVoyagePortCallAsync(voyageId, tenantId, apiVersion, xApiVersion, voyagePortCallCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#createVoyagePortCallAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#createVoyagePortCallAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **voyagePortCallCreateDto** | [**VoyagePortCallCreateDto**](VoyagePortCallCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteVoyageAsync"></a>
# **deleteVoyageAsync**
> EmptyEnvelope deleteVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion)

Delete a voyage

Deletes a voyage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#deleteVoyageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#deleteVoyageAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
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

<a id="deleteVoyagePortCallAsync"></a>
# **deleteVoyagePortCallAsync**
> EmptyEnvelope deleteVoyagePortCallAsync(voyageId, portCallId, tenantId, apiVersion, xApiVersion)

Delete a port call

Deletes a port call.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portCallId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteVoyagePortCallAsync(voyageId, portCallId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#deleteVoyagePortCallAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#deleteVoyagePortCallAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
| **portCallId** | **java.util.UUID**|  | |
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

<a id="getVoyageByIdAsync"></a>
# **getVoyageByIdAsync**
> VoyageDtoEnvelope getVoyageByIdAsync(voyageId, tenantId, apiVersion, xApiVersion)

Get voyage by ID

Retrieves a specific voyage by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : VoyageDtoEnvelope = apiInstance.getVoyageByIdAsync(voyageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#getVoyageByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#getVoyageByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**VoyageDtoEnvelope**](VoyageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVoyagePortCallsAsync"></a>
# **getVoyagePortCallsAsync**
> VoyagePortCallDtoListEnvelope getVoyagePortCallsAsync(voyageId, tenantId, apiVersion, xApiVersion)

Get voyage port calls

Retrieves all port calls for a specific voyage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : VoyagePortCallDtoListEnvelope = apiInstance.getVoyagePortCallsAsync(voyageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#getVoyagePortCallsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#getVoyagePortCallsAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**VoyagePortCallDtoListEnvelope**](VoyagePortCallDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVoyagePortCallsCountAsync"></a>
# **getVoyagePortCallsCountAsync**
> Int32Envelope getVoyagePortCallsCountAsync(voyageId, tenantId, apiVersion, xApiVersion)

Get voyage port calls count

Returns the count of port calls for a specific voyage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getVoyagePortCallsCountAsync(voyageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#getVoyagePortCallsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#getVoyagePortCallsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
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

<a id="getVoyagesAsync"></a>
# **getVoyagesAsync**
> VoyageDtoListEnvelope getVoyagesAsync(tenantId, apiVersion, xApiVersion)

Get all voyages

Retrieves all voyages for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : VoyageDtoListEnvelope = apiInstance.getVoyagesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#getVoyagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#getVoyagesAsync")
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

[**VoyageDtoListEnvelope**](VoyageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVoyagesCountAsync"></a>
# **getVoyagesCountAsync**
> Int32Envelope getVoyagesCountAsync(tenantId, apiVersion, xApiVersion)

Get voyages count

Returns the count of voyages for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getVoyagesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#getVoyagesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#getVoyagesCountAsync")
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

<a id="patchVoyageAsync"></a>
# **patchVoyageAsync**
> EmptyEnvelope patchVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion, operation)

Patch a voyage

Partially updates an existing voyage using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#patchVoyageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#patchVoyageAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
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

<a id="patchVoyagePortCallAsync"></a>
# **patchVoyagePortCallAsync**
> EmptyEnvelope patchVoyagePortCallAsync(voyageId, portCallId, tenantId, apiVersion, xApiVersion, operation)

Patch a voyage port call

Partially updates an existing voyage port call using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portCallId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchVoyagePortCallAsync(voyageId, portCallId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#patchVoyagePortCallAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#patchVoyagePortCallAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
| **portCallId** | **java.util.UUID**|  | |
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

<a id="startVoyageAsync"></a>
# **startVoyageAsync**
> EmptyEnvelope startVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion)

Start a voyage

Starts a voyage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.startVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#startVoyageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#startVoyageAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
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

<a id="updateVoyageAsync"></a>
# **updateVoyageAsync**
> EmptyEnvelope updateVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion, voyageUpdateDto)

Update a voyage

Updates an existing voyage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val voyageUpdateDto : VoyageUpdateDto =  // VoyageUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateVoyageAsync(voyageId, tenantId, apiVersion, xApiVersion, voyageUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#updateVoyageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#updateVoyageAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **voyageUpdateDto** | [**VoyageUpdateDto**](VoyageUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateVoyagePortCallAsync"></a>
# **updateVoyagePortCallAsync**
> EmptyEnvelope updateVoyagePortCallAsync(voyageId, portCallId, tenantId, apiVersion, xApiVersion, voyagePortCallUpdateDto)

Update a port call

Updates an existing port call.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VoyagesApi()
val voyageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portCallId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val voyagePortCallUpdateDto : VoyagePortCallUpdateDto =  // VoyagePortCallUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateVoyagePortCallAsync(voyageId, portCallId, tenantId, apiVersion, xApiVersion, voyagePortCallUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VoyagesApi#updateVoyagePortCallAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VoyagesApi#updateVoyagePortCallAsync")
    e.printStackTrace()
}
```

### Parameters
| **voyageId** | **java.util.UUID**|  | |
| **portCallId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **voyagePortCallUpdateDto** | [**VoyagePortCallUpdateDto**](VoyagePortCallUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

