# TruckDriversApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**activateTruckDriverAsync**](TruckDriversApi.md#activateTruckDriverAsync) | **POST** /api/v2/LogisticsService/TruckDrivers/{driverId}/Activate | Activate a truck driver |
| [**createTruckDriverAsync**](TruckDriversApi.md#createTruckDriverAsync) | **POST** /api/v2/LogisticsService/TruckDrivers | Create a truck driver |
| [**deactivateTruckDriverAsync**](TruckDriversApi.md#deactivateTruckDriverAsync) | **POST** /api/v2/LogisticsService/TruckDrivers/{driverId}/Deactivate | Deactivate a truck driver |
| [**deleteTruckDriverAsync**](TruckDriversApi.md#deleteTruckDriverAsync) | **DELETE** /api/v2/LogisticsService/TruckDrivers/{driverId} | Delete a truck driver |
| [**getTruckDriverByIdAsync**](TruckDriversApi.md#getTruckDriverByIdAsync) | **GET** /api/v2/LogisticsService/TruckDrivers/{driverId} | Get truck driver by ID |
| [**getTruckDriversAsync**](TruckDriversApi.md#getTruckDriversAsync) | **GET** /api/v2/LogisticsService/TruckDrivers | Get all truck drivers |
| [**getTruckDriversCountAsync**](TruckDriversApi.md#getTruckDriversCountAsync) | **GET** /api/v2/LogisticsService/TruckDrivers/Count | Get truck drivers count |
| [**patchTruckDriverAsync**](TruckDriversApi.md#patchTruckDriverAsync) | **PATCH** /api/v2/LogisticsService/TruckDrivers/{driverId} | Patch a truck driver |
| [**updateTruckDriverAsync**](TruckDriversApi.md#updateTruckDriverAsync) | **PUT** /api/v2/LogisticsService/TruckDrivers/{driverId} | Update a truck driver |


<a id="activateTruckDriverAsync"></a>
# **activateTruckDriverAsync**
> EmptyEnvelope activateTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion)

Activate a truck driver

Activates a truck driver.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val driverId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.activateTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#activateTruckDriverAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#activateTruckDriverAsync")
    e.printStackTrace()
}
```

### Parameters
| **driverId** | **java.util.UUID**|  | |
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

<a id="createTruckDriverAsync"></a>
# **createTruckDriverAsync**
> EmptyEnvelope createTruckDriverAsync(tenantId, apiVersion, xApiVersion, truckDriverCreateDto)

Create a truck driver

Creates a new truck driver for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val truckDriverCreateDto : TruckDriverCreateDto =  // TruckDriverCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTruckDriverAsync(tenantId, apiVersion, xApiVersion, truckDriverCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#createTruckDriverAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#createTruckDriverAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **truckDriverCreateDto** | [**TruckDriverCreateDto**](TruckDriverCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deactivateTruckDriverAsync"></a>
# **deactivateTruckDriverAsync**
> EmptyEnvelope deactivateTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion)

Deactivate a truck driver

Deactivates a truck driver.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val driverId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deactivateTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#deactivateTruckDriverAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#deactivateTruckDriverAsync")
    e.printStackTrace()
}
```

### Parameters
| **driverId** | **java.util.UUID**|  | |
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

<a id="deleteTruckDriverAsync"></a>
# **deleteTruckDriverAsync**
> EmptyEnvelope deleteTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion)

Delete a truck driver

Deletes a truck driver.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val driverId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#deleteTruckDriverAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#deleteTruckDriverAsync")
    e.printStackTrace()
}
```

### Parameters
| **driverId** | **java.util.UUID**|  | |
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

<a id="getTruckDriverByIdAsync"></a>
# **getTruckDriverByIdAsync**
> TruckDriverDtoEnvelope getTruckDriverByIdAsync(driverId, tenantId, apiVersion, xApiVersion)

Get truck driver by ID

Retrieves a specific truck driver by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val driverId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TruckDriverDtoEnvelope = apiInstance.getTruckDriverByIdAsync(driverId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#getTruckDriverByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#getTruckDriverByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **driverId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TruckDriverDtoEnvelope**](TruckDriverDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTruckDriversAsync"></a>
# **getTruckDriversAsync**
> TruckDriverDtoListEnvelope getTruckDriversAsync(tenantId, apiVersion, xApiVersion)

Get all truck drivers

Retrieves all truck drivers for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TruckDriverDtoListEnvelope = apiInstance.getTruckDriversAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#getTruckDriversAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#getTruckDriversAsync")
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

[**TruckDriverDtoListEnvelope**](TruckDriverDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTruckDriversCountAsync"></a>
# **getTruckDriversCountAsync**
> Int32Envelope getTruckDriversCountAsync(tenantId, apiVersion, xApiVersion)

Get truck drivers count

Returns the count of truck drivers for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTruckDriversCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#getTruckDriversCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#getTruckDriversCountAsync")
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

<a id="patchTruckDriverAsync"></a>
# **patchTruckDriverAsync**
> EmptyEnvelope patchTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion, operation)

Patch a truck driver

Partially updates an existing truck driver using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val driverId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#patchTruckDriverAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#patchTruckDriverAsync")
    e.printStackTrace()
}
```

### Parameters
| **driverId** | **java.util.UUID**|  | |
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

<a id="updateTruckDriverAsync"></a>
# **updateTruckDriverAsync**
> EmptyEnvelope updateTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion, truckDriverUpdateDto)

Update a truck driver

Updates an existing truck driver.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TruckDriversApi()
val driverId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val truckDriverUpdateDto : TruckDriverUpdateDto =  // TruckDriverUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTruckDriverAsync(driverId, tenantId, apiVersion, xApiVersion, truckDriverUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TruckDriversApi#updateTruckDriverAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TruckDriversApi#updateTruckDriverAsync")
    e.printStackTrace()
}
```

### Parameters
| **driverId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **truckDriverUpdateDto** | [**TruckDriverUpdateDto**](TruckDriverUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

