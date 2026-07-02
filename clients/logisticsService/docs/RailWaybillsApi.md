# RailWaybillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addRailWaybillLineAsync**](RailWaybillsApi.md#addRailWaybillLineAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines | Add a line to rail waybill |
| [**cancelRailWaybillAsync**](RailWaybillsApi.md#cancelRailWaybillAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/Cancel | Cancel a rail waybill |
| [**createRailWaybillAsync**](RailWaybillsApi.md#createRailWaybillAsync) | **POST** /api/v2/LogisticsService/RailWaybills | Create a rail waybill |
| [**deleteRailWaybillAsync**](RailWaybillsApi.md#deleteRailWaybillAsync) | **DELETE** /api/v2/LogisticsService/RailWaybills/{waybillId} | Delete a rail waybill |
| [**getRailWaybillByIdAsync**](RailWaybillsApi.md#getRailWaybillByIdAsync) | **GET** /api/v2/LogisticsService/RailWaybills/{waybillId} | Get rail waybill by ID |
| [**getRailWaybillLinesAsync**](RailWaybillsApi.md#getRailWaybillLinesAsync) | **GET** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines | Get rail waybill lines |
| [**getRailWaybillLinesCountAsync**](RailWaybillsApi.md#getRailWaybillLinesCountAsync) | **GET** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines/Count | Get rail waybill lines count |
| [**getRailWaybillsAsync**](RailWaybillsApi.md#getRailWaybillsAsync) | **GET** /api/v2/LogisticsService/RailWaybills | Get all rail waybills |
| [**getRailWaybillsCountAsync**](RailWaybillsApi.md#getRailWaybillsCountAsync) | **GET** /api/v2/LogisticsService/RailWaybills/Count | Get rail waybills count |
| [**issueRailWaybillAsync**](RailWaybillsApi.md#issueRailWaybillAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/Issue | Issue a rail waybill |
| [**markRailWaybillDeliveredAsync**](RailWaybillsApi.md#markRailWaybillDeliveredAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/MarkDelivered | Mark rail waybill delivered |
| [**markRailWaybillInTransitAsync**](RailWaybillsApi.md#markRailWaybillInTransitAsync) | **POST** /api/v2/LogisticsService/RailWaybills/{waybillId}/MarkInTransit | Mark rail waybill in transit |
| [**patchRailWaybillAsync**](RailWaybillsApi.md#patchRailWaybillAsync) | **PATCH** /api/v2/LogisticsService/RailWaybills/{waybillId} | Patch a rail waybill |
| [**patchRailWaybillLineAsync**](RailWaybillsApi.md#patchRailWaybillLineAsync) | **PATCH** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines/{lineId} | Patch a rail waybill line |
| [**removeRailWaybillLineAsync**](RailWaybillsApi.md#removeRailWaybillLineAsync) | **DELETE** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines/{lineId} | Remove a rail waybill line |
| [**updateRailWaybillAsync**](RailWaybillsApi.md#updateRailWaybillAsync) | **PUT** /api/v2/LogisticsService/RailWaybills/{waybillId} | Update a rail waybill |
| [**updateRailWaybillLineAsync**](RailWaybillsApi.md#updateRailWaybillLineAsync) | **PUT** /api/v2/LogisticsService/RailWaybills/{waybillId}/Lines/{lineId} | Update a rail waybill line |


<a id="addRailWaybillLineAsync"></a>
# **addRailWaybillLineAsync**
> EmptyEnvelope addRailWaybillLineAsync(waybillId, tenantId, apiVersion, xApiVersion, waybillLineCreateDto)

Add a line to rail waybill

Adds a new line to a rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineCreateDto : WaybillLineCreateDto =  // WaybillLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.addRailWaybillLineAsync(waybillId, tenantId, apiVersion, xApiVersion, waybillLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#addRailWaybillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#addRailWaybillLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **waybillLineCreateDto** | [**WaybillLineCreateDto**](WaybillLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="cancelRailWaybillAsync"></a>
# **cancelRailWaybillAsync**
> EmptyEnvelope cancelRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)

Cancel a rail waybill

Cancels a rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.cancelRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#cancelRailWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#cancelRailWaybillAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
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

<a id="createRailWaybillAsync"></a>
# **createRailWaybillAsync**
> EmptyEnvelope createRailWaybillAsync(tenantId, apiVersion, xApiVersion, railWaybillCreateDto)

Create a rail waybill

Creates a new rail waybill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val railWaybillCreateDto : RailWaybillCreateDto =  // RailWaybillCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createRailWaybillAsync(tenantId, apiVersion, xApiVersion, railWaybillCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#createRailWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#createRailWaybillAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **railWaybillCreateDto** | [**RailWaybillCreateDto**](RailWaybillCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteRailWaybillAsync"></a>
# **deleteRailWaybillAsync**
> EmptyEnvelope deleteRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)

Delete a rail waybill

Deletes a rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#deleteRailWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#deleteRailWaybillAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
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

<a id="getRailWaybillByIdAsync"></a>
# **getRailWaybillByIdAsync**
> RailWaybillDtoEnvelope getRailWaybillByIdAsync(waybillId, tenantId, apiVersion, xApiVersion)

Get rail waybill by ID

Retrieves a specific rail waybill by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : RailWaybillDtoEnvelope = apiInstance.getRailWaybillByIdAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#getRailWaybillByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#getRailWaybillByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**RailWaybillDtoEnvelope**](RailWaybillDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRailWaybillLinesAsync"></a>
# **getRailWaybillLinesAsync**
> WaybillLineDtoListEnvelope getRailWaybillLinesAsync(waybillId, tenantId, apiVersion, xApiVersion)

Get rail waybill lines

Retrieves all lines for a specific rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WaybillLineDtoListEnvelope = apiInstance.getRailWaybillLinesAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#getRailWaybillLinesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#getRailWaybillLinesAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WaybillLineDtoListEnvelope**](WaybillLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRailWaybillLinesCountAsync"></a>
# **getRailWaybillLinesCountAsync**
> Int32Envelope getRailWaybillLinesCountAsync(waybillId, tenantId, apiVersion, xApiVersion)

Get rail waybill lines count

Returns the count of lines for a specific rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getRailWaybillLinesCountAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#getRailWaybillLinesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#getRailWaybillLinesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
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

<a id="getRailWaybillsAsync"></a>
# **getRailWaybillsAsync**
> RailWaybillDtoListEnvelope getRailWaybillsAsync(tenantId, apiVersion, xApiVersion)

Get all rail waybills

Retrieves all rail waybills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : RailWaybillDtoListEnvelope = apiInstance.getRailWaybillsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#getRailWaybillsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#getRailWaybillsAsync")
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

[**RailWaybillDtoListEnvelope**](RailWaybillDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRailWaybillsCountAsync"></a>
# **getRailWaybillsCountAsync**
> Int32Envelope getRailWaybillsCountAsync(tenantId, apiVersion, xApiVersion)

Get rail waybills count

Returns the count of rail waybills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getRailWaybillsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#getRailWaybillsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#getRailWaybillsCountAsync")
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

<a id="issueRailWaybillAsync"></a>
# **issueRailWaybillAsync**
> EmptyEnvelope issueRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)

Issue a rail waybill

Issues a rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.issueRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#issueRailWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#issueRailWaybillAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
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

<a id="markRailWaybillDeliveredAsync"></a>
# **markRailWaybillDeliveredAsync**
> EmptyEnvelope markRailWaybillDeliveredAsync(waybillId, tenantId, apiVersion, xApiVersion)

Mark rail waybill delivered

Marks a rail waybill as delivered.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markRailWaybillDeliveredAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#markRailWaybillDeliveredAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#markRailWaybillDeliveredAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
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

<a id="markRailWaybillInTransitAsync"></a>
# **markRailWaybillInTransitAsync**
> EmptyEnvelope markRailWaybillInTransitAsync(waybillId, tenantId, apiVersion, xApiVersion)

Mark rail waybill in transit

Marks a rail waybill as in transit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markRailWaybillInTransitAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#markRailWaybillInTransitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#markRailWaybillInTransitAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
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

<a id="patchRailWaybillAsync"></a>
# **patchRailWaybillAsync**
> EmptyEnvelope patchRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion, operation)

Patch a rail waybill

Partially updates an existing rail waybill using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#patchRailWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#patchRailWaybillAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
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

<a id="patchRailWaybillLineAsync"></a>
# **patchRailWaybillLineAsync**
> EmptyEnvelope patchRailWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion, operation)

Patch a rail waybill line

Partially updates a line on a rail waybill using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchRailWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#patchRailWaybillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#patchRailWaybillLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
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

<a id="removeRailWaybillLineAsync"></a>
# **removeRailWaybillLineAsync**
> EmptyEnvelope removeRailWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion)

Remove a rail waybill line

Removes a line from a rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.removeRailWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#removeRailWaybillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#removeRailWaybillLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
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

<a id="updateRailWaybillAsync"></a>
# **updateRailWaybillAsync**
> EmptyEnvelope updateRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion, railWaybillUpdateDto)

Update a rail waybill

Updates an existing rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val railWaybillUpdateDto : RailWaybillUpdateDto =  // RailWaybillUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateRailWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion, railWaybillUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#updateRailWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#updateRailWaybillAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **railWaybillUpdateDto** | [**RailWaybillUpdateDto**](RailWaybillUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateRailWaybillLineAsync"></a>
# **updateRailWaybillLineAsync**
> EmptyEnvelope updateRailWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion, waybillLineUpdateDto)

Update a rail waybill line

Updates an existing line on a rail waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RailWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineUpdateDto : WaybillLineUpdateDto =  // WaybillLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateRailWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion, waybillLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RailWaybillsApi#updateRailWaybillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RailWaybillsApi#updateRailWaybillLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **waybillId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **waybillLineUpdateDto** | [**WaybillLineUpdateDto**](WaybillLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

