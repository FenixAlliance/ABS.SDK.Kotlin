# LocationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLocationAsync**](LocationsApi.md#createLocationAsync) | **POST** /api/v2/LocationsService/Locations | Create Location |
| [**createWalletLocationAsync**](LocationsApi.md#createWalletLocationAsync) | **POST** /api/v2/LocationsService/Locations/wallet/{walletId} | Create Wallet Location |
| [**deleteLocationAsync**](LocationsApi.md#deleteLocationAsync) | **DELETE** /api/v2/LocationsService/Locations/{locationId} | Delete Location |
| [**deleteWalletLocationAsync**](LocationsApi.md#deleteWalletLocationAsync) | **DELETE** /api/v2/LocationsService/Locations/wallet/{walletId}/{locationId} | Delete Wallet Location |
| [**getLocationAsync**](LocationsApi.md#getLocationAsync) | **GET** /api/v2/LocationsService/Locations/{locationId} | Get Location |
| [**getLocationsAsync**](LocationsApi.md#getLocationsAsync) | **GET** /api/v2/LocationsService/Locations | Get Locations |
| [**getLocationsCountAsync**](LocationsApi.md#getLocationsCountAsync) | **GET** /api/v2/LocationsService/Locations/count | Get Locations Count |
| [**getWalletLocationAsync**](LocationsApi.md#getWalletLocationAsync) | **GET** /api/v2/LocationsService/Locations/wallet/{walletId}/{locationId} | Get Wallet Location |
| [**getWalletLocationsAsync**](LocationsApi.md#getWalletLocationsAsync) | **GET** /api/v2/LocationsService/Locations/wallet/{walletId} | Get Wallet Locations |
| [**getWalletLocationsCountAsync**](LocationsApi.md#getWalletLocationsCountAsync) | **GET** /api/v2/LocationsService/Locations/wallet/{walletId}/count | Get Wallet Locations Count |
| [**updateLocationAsync**](LocationsApi.md#updateLocationAsync) | **PUT** /api/v2/LocationsService/Locations/{locationId} | Update Location |
| [**updateWalletLocationAsync**](LocationsApi.md#updateWalletLocationAsync) | **PUT** /api/v2/LocationsService/Locations/wallet/{walletId}/{locationId} | Update Wallet Location |


<a id="createLocationAsync"></a>
# **createLocationAsync**
> EmptyEnvelope createLocationAsync(tenantId, locationCreateDto)

Create Location

Create a new location.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationCreateDto : LocationCreateDto =  // LocationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createLocationAsync(tenantId, locationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#createLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#createLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationCreateDto** | [**LocationCreateDto**](LocationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWalletLocationAsync"></a>
# **createWalletLocationAsync**
> EmptyEnvelope createWalletLocationAsync(walletId, locationCreateDto)

Create Wallet Location

Create a new location for a specific wallet.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationCreateDto : LocationCreateDto =  // LocationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWalletLocationAsync(walletId, locationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#createWalletLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#createWalletLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationCreateDto** | [**LocationCreateDto**](LocationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLocationAsync"></a>
# **deleteLocationAsync**
> EmptyEnvelope deleteLocationAsync(locationId, tenantId)

Delete Location

Delete a specific location by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLocationAsync(locationId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#deleteLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#deleteLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **locationId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteWalletLocationAsync"></a>
# **deleteWalletLocationAsync**
> EmptyEnvelope deleteWalletLocationAsync(walletId, locationId)

Delete Wallet Location

Delete a specific location of a wallet.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWalletLocationAsync(walletId, locationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#deleteWalletLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#deleteWalletLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLocationAsync"></a>
# **getLocationAsync**
> LocationDtoEnvelope getLocationAsync(locationId, tenantId)

Get Location

Get details of a specific location by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : LocationDtoEnvelope = apiInstance.getLocationAsync(locationId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#getLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#getLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **locationId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**LocationDtoEnvelope**](LocationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLocationsAsync"></a>
# **getLocationsAsync**
> LocationDtoIReadOnlyListEnvelope getLocationsAsync(tenantId)

Get Locations

Get all locations with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : LocationDtoIReadOnlyListEnvelope = apiInstance.getLocationsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#getLocationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#getLocationsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**LocationDtoIReadOnlyListEnvelope**](LocationDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLocationsCountAsync"></a>
# **getLocationsCountAsync**
> Int32Envelope getLocationsCountAsync(tenantId)

Get Locations Count

Get the count of locations with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getLocationsCountAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#getLocationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#getLocationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletLocationAsync"></a>
# **getWalletLocationAsync**
> LocationDtoEnvelope getWalletLocationAsync(walletId, locationId)

Get Wallet Location

Get a specific location of a wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : LocationDtoEnvelope = apiInstance.getWalletLocationAsync(walletId, locationId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#getWalletLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#getWalletLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationId** | **java.util.UUID**|  | |

### Return type

[**LocationDtoEnvelope**](LocationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletLocationsAsync"></a>
# **getWalletLocationsAsync**
> LocationDtoIReadOnlyListEnvelope getWalletLocationsAsync(walletId)

Get Wallet Locations

Get locations for a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : LocationDtoIReadOnlyListEnvelope = apiInstance.getWalletLocationsAsync(walletId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#getWalletLocationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#getWalletLocationsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **walletId** | **java.util.UUID**|  | |

### Return type

[**LocationDtoIReadOnlyListEnvelope**](LocationDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletLocationsCountAsync"></a>
# **getWalletLocationsCountAsync**
> Int32Envelope getWalletLocationsCountAsync(walletId)

Get Wallet Locations Count

Get the count of locations for a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getWalletLocationsCountAsync(walletId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#getWalletLocationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#getWalletLocationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **walletId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateLocationAsync"></a>
# **updateLocationAsync**
> EmptyEnvelope updateLocationAsync(locationId, tenantId, locationUpdateDto)

Update Location

Update a specific location by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationUpdateDto : LocationUpdateDto =  // LocationUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateLocationAsync(locationId, tenantId, locationUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#updateLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#updateLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **locationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationUpdateDto** | [**LocationUpdateDto**](LocationUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateWalletLocationAsync"></a>
# **updateWalletLocationAsync**
> EmptyEnvelope updateWalletLocationAsync(walletId, locationId, locationUpdateDto)

Update Wallet Location

Update a specific location of a wallet.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocationsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationUpdateDto : LocationUpdateDto =  // LocationUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWalletLocationAsync(walletId, locationId, locationUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocationsApi#updateWalletLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocationsApi#updateWalletLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **locationId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationUpdateDto** | [**LocationUpdateDto**](LocationUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

