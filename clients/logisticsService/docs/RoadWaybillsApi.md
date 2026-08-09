# RoadWaybillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addRoadWaybillLineAsync**](RoadWaybillsApi.md#addRoadWaybillLineAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines | Add a line to road waybill |
| [**cancelRoadWaybillAsync**](RoadWaybillsApi.md#cancelRoadWaybillAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Cancel | Cancel a road waybill |
| [**createRoadWaybillAsync**](RoadWaybillsApi.md#createRoadWaybillAsync) | **POST** /api/v2/LogisticsService/RoadWaybills | Create a road waybill |
| [**deleteRoadWaybillAsync**](RoadWaybillsApi.md#deleteRoadWaybillAsync) | **DELETE** /api/v2/LogisticsService/RoadWaybills/{waybillId} | Delete a road waybill |
| [**disputeRoadWaybillAsync**](RoadWaybillsApi.md#disputeRoadWaybillAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Dispute | Dispute a road waybill |
| [**getRoadWaybillByIdAsync**](RoadWaybillsApi.md#getRoadWaybillByIdAsync) | **GET** /api/v2/LogisticsService/RoadWaybills/{waybillId} | Get road waybill by ID |
| [**getRoadWaybillLinesAsync**](RoadWaybillsApi.md#getRoadWaybillLinesAsync) | **GET** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines | Get road waybill lines |
| [**getRoadWaybillLinesCountAsync**](RoadWaybillsApi.md#getRoadWaybillLinesCountAsync) | **GET** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines/Count | Get road waybill lines count |
| [**getRoadWaybillsAsync**](RoadWaybillsApi.md#getRoadWaybillsAsync) | **GET** /api/v2/LogisticsService/RoadWaybills | Get all road waybills |
| [**getRoadWaybillsCountAsync**](RoadWaybillsApi.md#getRoadWaybillsCountAsync) | **GET** /api/v2/LogisticsService/RoadWaybills/Count | Get road waybills count |
| [**issueRoadWaybillAsync**](RoadWaybillsApi.md#issueRoadWaybillAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Issue | Issue a road waybill |
| [**markRoadWaybillDeliveredAsync**](RoadWaybillsApi.md#markRoadWaybillDeliveredAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/MarkDelivered | Mark road waybill delivered |
| [**markRoadWaybillInTransitAsync**](RoadWaybillsApi.md#markRoadWaybillInTransitAsync) | **POST** /api/v2/LogisticsService/RoadWaybills/{waybillId}/MarkInTransit | Mark road waybill in transit |
| [**patchRoadWaybillAsync**](RoadWaybillsApi.md#patchRoadWaybillAsync) | **PATCH** /api/v2/LogisticsService/RoadWaybills/{waybillId} | Patch a road waybill |
| [**patchRoadWaybillLineAsync**](RoadWaybillsApi.md#patchRoadWaybillLineAsync) | **PATCH** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines/{lineId} | Patch a road waybill line |
| [**removeRoadWaybillLineAsync**](RoadWaybillsApi.md#removeRoadWaybillLineAsync) | **DELETE** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines/{lineId} | Remove a road waybill line |
| [**updateRoadWaybillAsync**](RoadWaybillsApi.md#updateRoadWaybillAsync) | **PUT** /api/v2/LogisticsService/RoadWaybills/{waybillId} | Update a road waybill |
| [**updateRoadWaybillLineAsync**](RoadWaybillsApi.md#updateRoadWaybillLineAsync) | **PUT** /api/v2/LogisticsService/RoadWaybills/{waybillId}/Lines/{lineId} | Update a road waybill line |


<a id="addRoadWaybillLineAsync"></a>
# **addRoadWaybillLineAsync**
> EmptyEnvelope addRoadWaybillLineAsync(waybillId, tenantId, apiVersion, xApiVersion, waybillLineCreateDto)

Add a line to road waybill

Adds a new line to a road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineCreateDto : WaybillLineCreateDto =  // WaybillLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.addRoadWaybillLineAsync(waybillId, tenantId, apiVersion, xApiVersion, waybillLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#addRoadWaybillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#addRoadWaybillLineAsync")
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

<a id="cancelRoadWaybillAsync"></a>
# **cancelRoadWaybillAsync**
> EmptyEnvelope cancelRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)

Cancel a road waybill

Cancels a road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.cancelRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#cancelRoadWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#cancelRoadWaybillAsync")
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

<a id="createRoadWaybillAsync"></a>
# **createRoadWaybillAsync**
> EmptyEnvelope createRoadWaybillAsync(tenantId, apiVersion, xApiVersion, roadWaybillCreateDto)

Create a road waybill

Creates a new road waybill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val roadWaybillCreateDto : RoadWaybillCreateDto =  // RoadWaybillCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createRoadWaybillAsync(tenantId, apiVersion, xApiVersion, roadWaybillCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#createRoadWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#createRoadWaybillAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roadWaybillCreateDto** | [**RoadWaybillCreateDto**](RoadWaybillCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteRoadWaybillAsync"></a>
# **deleteRoadWaybillAsync**
> EmptyEnvelope deleteRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)

Delete a road waybill

Deletes a road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#deleteRoadWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#deleteRoadWaybillAsync")
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

<a id="disputeRoadWaybillAsync"></a>
# **disputeRoadWaybillAsync**
> EmptyEnvelope disputeRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)

Dispute a road waybill

Disputes a road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.disputeRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#disputeRoadWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#disputeRoadWaybillAsync")
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

<a id="getRoadWaybillByIdAsync"></a>
# **getRoadWaybillByIdAsync**
> RoadWaybillDtoEnvelope getRoadWaybillByIdAsync(waybillId, tenantId, apiVersion, xApiVersion)

Get road waybill by ID

Retrieves a specific road waybill by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : RoadWaybillDtoEnvelope = apiInstance.getRoadWaybillByIdAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#getRoadWaybillByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#getRoadWaybillByIdAsync")
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

[**RoadWaybillDtoEnvelope**](RoadWaybillDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRoadWaybillLinesAsync"></a>
# **getRoadWaybillLinesAsync**
> WaybillLineDtoListEnvelope getRoadWaybillLinesAsync(waybillId, tenantId, apiVersion, xApiVersion, waybillLineDtoCollectionQueryParameters)

Get road waybill lines

Retrieves all lines for a specific road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineDtoCollectionQueryParameters : WaybillLineDtoCollectionQueryParameters =  // WaybillLineDtoCollectionQueryParameters | 
try {
    val result : WaybillLineDtoListEnvelope = apiInstance.getRoadWaybillLinesAsync(waybillId, tenantId, apiVersion, xApiVersion, waybillLineDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#getRoadWaybillLinesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#getRoadWaybillLinesAsync")
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
| **waybillLineDtoCollectionQueryParameters** | [**WaybillLineDtoCollectionQueryParameters**](WaybillLineDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**WaybillLineDtoListEnvelope**](WaybillLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getRoadWaybillLinesCountAsync"></a>
# **getRoadWaybillLinesCountAsync**
> Int32Envelope getRoadWaybillLinesCountAsync(waybillId, tenantId, apiVersion, xApiVersion, waybillLineDtoCollectionQueryParameters)

Get road waybill lines count

Returns the count of lines for a specific road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineDtoCollectionQueryParameters : WaybillLineDtoCollectionQueryParameters =  // WaybillLineDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getRoadWaybillLinesCountAsync(waybillId, tenantId, apiVersion, xApiVersion, waybillLineDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#getRoadWaybillLinesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#getRoadWaybillLinesCountAsync")
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
| **waybillLineDtoCollectionQueryParameters** | [**WaybillLineDtoCollectionQueryParameters**](WaybillLineDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getRoadWaybillsAsync"></a>
# **getRoadWaybillsAsync**
> RoadWaybillDtoListEnvelope getRoadWaybillsAsync(tenantId, apiVersion, xApiVersion, roadWaybillDtoCollectionQueryParameters)

Get all road waybills

Retrieves all road waybills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val roadWaybillDtoCollectionQueryParameters : RoadWaybillDtoCollectionQueryParameters =  // RoadWaybillDtoCollectionQueryParameters | 
try {
    val result : RoadWaybillDtoListEnvelope = apiInstance.getRoadWaybillsAsync(tenantId, apiVersion, xApiVersion, roadWaybillDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#getRoadWaybillsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#getRoadWaybillsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roadWaybillDtoCollectionQueryParameters** | [**RoadWaybillDtoCollectionQueryParameters**](RoadWaybillDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**RoadWaybillDtoListEnvelope**](RoadWaybillDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getRoadWaybillsCountAsync"></a>
# **getRoadWaybillsCountAsync**
> Int32Envelope getRoadWaybillsCountAsync(tenantId, apiVersion, xApiVersion, roadWaybillDtoCollectionQueryParameters)

Get road waybills count

Returns the count of road waybills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val roadWaybillDtoCollectionQueryParameters : RoadWaybillDtoCollectionQueryParameters =  // RoadWaybillDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getRoadWaybillsCountAsync(tenantId, apiVersion, xApiVersion, roadWaybillDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#getRoadWaybillsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#getRoadWaybillsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roadWaybillDtoCollectionQueryParameters** | [**RoadWaybillDtoCollectionQueryParameters**](RoadWaybillDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="issueRoadWaybillAsync"></a>
# **issueRoadWaybillAsync**
> EmptyEnvelope issueRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)

Issue a road waybill

Issues a road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.issueRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#issueRoadWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#issueRoadWaybillAsync")
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

<a id="markRoadWaybillDeliveredAsync"></a>
# **markRoadWaybillDeliveredAsync**
> EmptyEnvelope markRoadWaybillDeliveredAsync(waybillId, tenantId, apiVersion, xApiVersion)

Mark road waybill delivered

Marks a road waybill as delivered.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markRoadWaybillDeliveredAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#markRoadWaybillDeliveredAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#markRoadWaybillDeliveredAsync")
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

<a id="markRoadWaybillInTransitAsync"></a>
# **markRoadWaybillInTransitAsync**
> EmptyEnvelope markRoadWaybillInTransitAsync(waybillId, tenantId, apiVersion, xApiVersion)

Mark road waybill in transit

Marks a road waybill as in transit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markRoadWaybillInTransitAsync(waybillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#markRoadWaybillInTransitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#markRoadWaybillInTransitAsync")
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

<a id="patchRoadWaybillAsync"></a>
# **patchRoadWaybillAsync**
> EmptyEnvelope patchRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a road waybill

Partially updates an existing road waybill using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#patchRoadWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#patchRoadWaybillAsync")
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
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchRoadWaybillLineAsync"></a>
# **patchRoadWaybillLineAsync**
> EmptyEnvelope patchRoadWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a road waybill line

Partially updates a line on a road waybill using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchRoadWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#patchRoadWaybillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#patchRoadWaybillLineAsync")
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
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="removeRoadWaybillLineAsync"></a>
# **removeRoadWaybillLineAsync**
> EmptyEnvelope removeRoadWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion)

Remove a road waybill line

Removes a line from a road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.removeRoadWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#removeRoadWaybillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#removeRoadWaybillLineAsync")
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

<a id="updateRoadWaybillAsync"></a>
# **updateRoadWaybillAsync**
> EmptyEnvelope updateRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion, roadWaybillUpdateDto)

Update a road waybill

Updates an existing road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val roadWaybillUpdateDto : RoadWaybillUpdateDto =  // RoadWaybillUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateRoadWaybillAsync(waybillId, tenantId, apiVersion, xApiVersion, roadWaybillUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#updateRoadWaybillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#updateRoadWaybillAsync")
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
| **roadWaybillUpdateDto** | [**RoadWaybillUpdateDto**](RoadWaybillUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateRoadWaybillLineAsync"></a>
# **updateRoadWaybillLineAsync**
> EmptyEnvelope updateRoadWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion, waybillLineUpdateDto)

Update a road waybill line

Updates an existing line on a road waybill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoadWaybillsApi()
val waybillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineUpdateDto : WaybillLineUpdateDto =  // WaybillLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateRoadWaybillLineAsync(waybillId, lineId, tenantId, apiVersion, xApiVersion, waybillLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoadWaybillsApi#updateRoadWaybillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoadWaybillsApi#updateRoadWaybillLineAsync")
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

