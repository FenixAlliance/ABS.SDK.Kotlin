# VesselsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createVesselAsync**](VesselsApi.md#createVesselAsync) | **POST** /api/v2/LogisticsService/Vessels | Create a vessel |
| [**deleteVesselAsync**](VesselsApi.md#deleteVesselAsync) | **DELETE** /api/v2/LogisticsService/Vessels/{vesselId} | Delete a vessel |
| [**getVesselByIdAsync**](VesselsApi.md#getVesselByIdAsync) | **GET** /api/v2/LogisticsService/Vessels/{vesselId} | Get vessel by ID |
| [**getVesselsAsync**](VesselsApi.md#getVesselsAsync) | **GET** /api/v2/LogisticsService/Vessels | Get all vessels |
| [**getVesselsCountAsync**](VesselsApi.md#getVesselsCountAsync) | **GET** /api/v2/LogisticsService/Vessels/Count | Get vessels count |
| [**patchVesselAsync**](VesselsApi.md#patchVesselAsync) | **PATCH** /api/v2/LogisticsService/Vessels/{vesselId} | Patch a vessel |
| [**updateVesselAsync**](VesselsApi.md#updateVesselAsync) | **PUT** /api/v2/LogisticsService/Vessels/{vesselId} | Update a vessel |


<a id="createVesselAsync"></a>
# **createVesselAsync**
> EmptyEnvelope createVesselAsync(tenantId, apiVersion, xApiVersion, vesselCreateDto)

Create a vessel

Creates a new vessel for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VesselsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val vesselCreateDto : VesselCreateDto =  // VesselCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createVesselAsync(tenantId, apiVersion, xApiVersion, vesselCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VesselsApi#createVesselAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VesselsApi#createVesselAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **vesselCreateDto** | [**VesselCreateDto**](VesselCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteVesselAsync"></a>
# **deleteVesselAsync**
> EmptyEnvelope deleteVesselAsync(vesselId, tenantId, apiVersion, xApiVersion)

Delete a vessel

Deletes a vessel.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VesselsApi()
val vesselId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteVesselAsync(vesselId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VesselsApi#deleteVesselAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VesselsApi#deleteVesselAsync")
    e.printStackTrace()
}
```

### Parameters
| **vesselId** | **java.util.UUID**|  | |
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

<a id="getVesselByIdAsync"></a>
# **getVesselByIdAsync**
> VesselDtoEnvelope getVesselByIdAsync(vesselId, tenantId, apiVersion, xApiVersion)

Get vessel by ID

Retrieves a specific vessel by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VesselsApi()
val vesselId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : VesselDtoEnvelope = apiInstance.getVesselByIdAsync(vesselId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VesselsApi#getVesselByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VesselsApi#getVesselByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **vesselId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**VesselDtoEnvelope**](VesselDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVesselsAsync"></a>
# **getVesselsAsync**
> VesselDtoListEnvelope getVesselsAsync(tenantId, apiVersion, xApiVersion)

Get all vessels

Retrieves all vessels for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VesselsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : VesselDtoListEnvelope = apiInstance.getVesselsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VesselsApi#getVesselsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VesselsApi#getVesselsAsync")
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

[**VesselDtoListEnvelope**](VesselDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getVesselsCountAsync"></a>
# **getVesselsCountAsync**
> Int32Envelope getVesselsCountAsync(tenantId, apiVersion, xApiVersion)

Get vessels count

Returns the count of vessels for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VesselsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getVesselsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VesselsApi#getVesselsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VesselsApi#getVesselsCountAsync")
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

<a id="patchVesselAsync"></a>
# **patchVesselAsync**
> EmptyEnvelope patchVesselAsync(vesselId, tenantId, apiVersion, xApiVersion, operation)

Patch a vessel

Partially updates an existing vessel using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VesselsApi()
val vesselId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchVesselAsync(vesselId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VesselsApi#patchVesselAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VesselsApi#patchVesselAsync")
    e.printStackTrace()
}
```

### Parameters
| **vesselId** | **java.util.UUID**|  | |
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

<a id="updateVesselAsync"></a>
# **updateVesselAsync**
> EmptyEnvelope updateVesselAsync(vesselId, tenantId, apiVersion, xApiVersion, vesselUpdateDto)

Update a vessel

Updates an existing vessel.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = VesselsApi()
val vesselId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val vesselUpdateDto : VesselUpdateDto =  // VesselUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateVesselAsync(vesselId, tenantId, apiVersion, xApiVersion, vesselUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling VesselsApi#updateVesselAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling VesselsApi#updateVesselAsync")
    e.printStackTrace()
}
```

### Parameters
| **vesselId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **vesselUpdateDto** | [**VesselUpdateDto**](VesselUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

