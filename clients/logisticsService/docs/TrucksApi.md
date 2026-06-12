# TrucksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**arriveTripAsync**](TrucksApi.md#arriveTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Arrive | Arrive a trip |
| [**cancelTripAsync**](TrucksApi.md#cancelTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Cancel | Cancel a trip |
| [**createTruckAsync**](TrucksApi.md#createTruckAsync) | **POST** /api/v2/LogisticsService/Trucks | Create a truck |
| [**createTruckTripAsync**](TrucksApi.md#createTruckTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips | Create a truck trip |
| [**deleteTruckAsync**](TrucksApi.md#deleteTruckAsync) | **DELETE** /api/v2/LogisticsService/Trucks/{truckId} | Delete a truck |
| [**deleteTruckTripAsync**](TrucksApi.md#deleteTruckTripAsync) | **DELETE** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId} | Delete a truck trip |
| [**deliverTripAsync**](TrucksApi.md#deliverTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Deliver | Deliver a trip |
| [**departTripAsync**](TrucksApi.md#departTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Depart | Depart a trip |
| [**dispatchTripAsync**](TrucksApi.md#dispatchTripAsync) | **POST** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId}/Dispatch | Dispatch a trip |
| [**getTruckByIdAsync**](TrucksApi.md#getTruckByIdAsync) | **GET** /api/v2/LogisticsService/Trucks/{truckId} | Get truck by ID |
| [**getTruckTripsAsync**](TrucksApi.md#getTruckTripsAsync) | **GET** /api/v2/LogisticsService/Trucks/{truckId}/Trips | Get truck trips |
| [**getTruckTripsCountAsync**](TrucksApi.md#getTruckTripsCountAsync) | **GET** /api/v2/LogisticsService/Trucks/{truckId}/Trips/Count | Get truck trips count |
| [**getTrucksAsync**](TrucksApi.md#getTrucksAsync) | **GET** /api/v2/LogisticsService/Trucks | Get all trucks |
| [**getTrucksCountAsync**](TrucksApi.md#getTrucksCountAsync) | **GET** /api/v2/LogisticsService/Trucks/Count | Get trucks count |
| [**patchTruckAsync**](TrucksApi.md#patchTruckAsync) | **PATCH** /api/v2/LogisticsService/Trucks/{truckId} | Patch a truck |
| [**patchTruckTripAsync**](TrucksApi.md#patchTruckTripAsync) | **PATCH** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId} | Patch a truck trip |
| [**updateTruckAsync**](TrucksApi.md#updateTruckAsync) | **PUT** /api/v2/LogisticsService/Trucks/{truckId} | Update a truck |
| [**updateTruckTripAsync**](TrucksApi.md#updateTruckTripAsync) | **PUT** /api/v2/LogisticsService/Trucks/{truckId}/Trips/{tripId} | Update a truck trip |


<a id="arriveTripAsync"></a>
# **arriveTripAsync**
> EmptyEnvelope arriveTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)

Arrive a trip

Marks a truck trip as arrived.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tripId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.arriveTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#arriveTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#arriveTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tripId** | **java.util.UUID**|  | |
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

<a id="cancelTripAsync"></a>
# **cancelTripAsync**
> EmptyEnvelope cancelTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)

Cancel a trip

Cancels a truck trip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tripId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.cancelTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#cancelTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#cancelTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tripId** | **java.util.UUID**|  | |
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

<a id="createTruckAsync"></a>
# **createTruckAsync**
> EmptyEnvelope createTruckAsync(tenantId, apiVersion, xApiVersion, truckCreateDto)

Create a truck

Creates a new truck for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val truckCreateDto : TruckCreateDto =  // TruckCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTruckAsync(tenantId, apiVersion, xApiVersion, truckCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#createTruckAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#createTruckAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **truckCreateDto** | [**TruckCreateDto**](TruckCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTruckTripAsync"></a>
# **createTruckTripAsync**
> EmptyEnvelope createTruckTripAsync(truckId, tenantId, apiVersion, xApiVersion, truckTripCreateDto)

Create a truck trip

Creates a new trip for a truck.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val truckTripCreateDto : TruckTripCreateDto =  // TruckTripCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTruckTripAsync(truckId, tenantId, apiVersion, xApiVersion, truckTripCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#createTruckTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#createTruckTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **truckTripCreateDto** | [**TruckTripCreateDto**](TruckTripCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTruckAsync"></a>
# **deleteTruckAsync**
> EmptyEnvelope deleteTruckAsync(truckId, tenantId, apiVersion, xApiVersion)

Delete a truck

Deletes a truck.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTruckAsync(truckId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#deleteTruckAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#deleteTruckAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
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

<a id="deleteTruckTripAsync"></a>
# **deleteTruckTripAsync**
> EmptyEnvelope deleteTruckTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)

Delete a truck trip

Deletes a truck trip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tripId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTruckTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#deleteTruckTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#deleteTruckTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tripId** | **java.util.UUID**|  | |
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

<a id="deliverTripAsync"></a>
# **deliverTripAsync**
> EmptyEnvelope deliverTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)

Deliver a trip

Marks a truck trip as delivered.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tripId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deliverTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#deliverTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#deliverTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tripId** | **java.util.UUID**|  | |
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

<a id="departTripAsync"></a>
# **departTripAsync**
> EmptyEnvelope departTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)

Depart a trip

Marks a truck trip as departed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tripId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.departTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#departTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#departTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tripId** | **java.util.UUID**|  | |
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

<a id="dispatchTripAsync"></a>
# **dispatchTripAsync**
> EmptyEnvelope dispatchTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)

Dispatch a trip

Dispatches a truck trip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tripId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.dispatchTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#dispatchTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#dispatchTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tripId** | **java.util.UUID**|  | |
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

<a id="getTruckByIdAsync"></a>
# **getTruckByIdAsync**
> TruckDtoEnvelope getTruckByIdAsync(truckId, tenantId, apiVersion, xApiVersion)

Get truck by ID

Retrieves a specific truck by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TruckDtoEnvelope = apiInstance.getTruckByIdAsync(truckId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#getTruckByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#getTruckByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TruckDtoEnvelope**](TruckDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTruckTripsAsync"></a>
# **getTruckTripsAsync**
> TruckTripDtoListEnvelope getTruckTripsAsync(truckId, tenantId, apiVersion, xApiVersion)

Get truck trips

Retrieves all trips for a specific truck.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TruckTripDtoListEnvelope = apiInstance.getTruckTripsAsync(truckId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#getTruckTripsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#getTruckTripsAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TruckTripDtoListEnvelope**](TruckTripDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTruckTripsCountAsync"></a>
# **getTruckTripsCountAsync**
> Int32Envelope getTruckTripsCountAsync(truckId, tenantId, apiVersion, xApiVersion)

Get truck trips count

Returns the count of trips for a specific truck.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTruckTripsCountAsync(truckId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#getTruckTripsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#getTruckTripsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
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

<a id="getTrucksAsync"></a>
# **getTrucksAsync**
> TruckDtoListEnvelope getTrucksAsync(tenantId, apiVersion, xApiVersion)

Get all trucks

Retrieves all trucks for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TruckDtoListEnvelope = apiInstance.getTrucksAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#getTrucksAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#getTrucksAsync")
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

[**TruckDtoListEnvelope**](TruckDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTrucksCountAsync"></a>
# **getTrucksCountAsync**
> Int32Envelope getTrucksCountAsync(tenantId, apiVersion, xApiVersion)

Get trucks count

Returns the count of trucks for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTrucksCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#getTrucksCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#getTrucksCountAsync")
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

<a id="patchTruckAsync"></a>
# **patchTruckAsync**
> EmptyEnvelope patchTruckAsync(truckId, tenantId, apiVersion, xApiVersion, operation)

Patch a truck

Partially updates an existing truck using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchTruckAsync(truckId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#patchTruckAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#patchTruckAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
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

<a id="patchTruckTripAsync"></a>
# **patchTruckTripAsync**
> EmptyEnvelope patchTruckTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion, operation)

Patch a truck trip

Partially updates an existing truck trip using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tripId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchTruckTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#patchTruckTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#patchTruckTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tripId** | **java.util.UUID**|  | |
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

<a id="updateTruckAsync"></a>
# **updateTruckAsync**
> EmptyEnvelope updateTruckAsync(truckId, tenantId, apiVersion, xApiVersion, truckUpdateDto)

Update a truck

Updates an existing truck.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val truckUpdateDto : TruckUpdateDto =  // TruckUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTruckAsync(truckId, tenantId, apiVersion, xApiVersion, truckUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#updateTruckAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#updateTruckAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **truckUpdateDto** | [**TruckUpdateDto**](TruckUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateTruckTripAsync"></a>
# **updateTruckTripAsync**
> EmptyEnvelope updateTruckTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion, truckTripUpdateDto)

Update a truck trip

Updates an existing truck trip.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TrucksApi()
val truckId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tripId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val truckTripUpdateDto : TruckTripUpdateDto =  // TruckTripUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTruckTripAsync(truckId, tripId, tenantId, apiVersion, xApiVersion, truckTripUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TrucksApi#updateTruckTripAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TrucksApi#updateTruckTripAsync")
    e.printStackTrace()
}
```

### Parameters
| **truckId** | **java.util.UUID**|  | |
| **tripId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **truckTripUpdateDto** | [**TruckTripUpdateDto**](TruckTripUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

