# ShippingZonesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShippingZoneAsync**](ShippingZonesApi.md#createShippingZoneAsync) | **POST** /api/v2/ShipmentsService/ShippingZones | Create a shipping zone |
| [**deleteShippingZoneAsync**](ShippingZonesApi.md#deleteShippingZoneAsync) | **DELETE** /api/v2/ShipmentsService/ShippingZones/{zoneId} | Delete a shipping zone |
| [**getShippingZoneByIdAsync**](ShippingZonesApi.md#getShippingZoneByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingZones/{zoneId} | Get shipping zone by ID |
| [**getShippingZonesAsync**](ShippingZonesApi.md#getShippingZonesAsync) | **GET** /api/v2/ShipmentsService/ShippingZones | Get all shipping zones |
| [**getShippingZonesCountAsync**](ShippingZonesApi.md#getShippingZonesCountAsync) | **GET** /api/v2/ShipmentsService/ShippingZones/Count | Get shipping zones count |
| [**updateShippingZoneAsync**](ShippingZonesApi.md#updateShippingZoneAsync) | **PUT** /api/v2/ShipmentsService/ShippingZones/{zoneId} | Update a shipping zone |


<a id="createShippingZoneAsync"></a>
# **createShippingZoneAsync**
> createShippingZoneAsync(tenantId, apiVersion, xApiVersion, shippingZoneCreateDto)

Create a shipping zone

Creates a new shipping zone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingZonesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingZoneCreateDto : ShippingZoneCreateDto =  // ShippingZoneCreateDto | 
try {
    apiInstance.createShippingZoneAsync(tenantId, apiVersion, xApiVersion, shippingZoneCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingZonesApi#createShippingZoneAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingZonesApi#createShippingZoneAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingZoneCreateDto** | [**ShippingZoneCreateDto**](ShippingZoneCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShippingZoneAsync"></a>
# **deleteShippingZoneAsync**
> deleteShippingZoneAsync(zoneId, tenantId, apiVersion, xApiVersion)

Delete a shipping zone

Deletes a shipping zone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingZonesApi()
val zoneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShippingZoneAsync(zoneId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ShippingZonesApi#deleteShippingZoneAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingZonesApi#deleteShippingZoneAsync")
    e.printStackTrace()
}
```

### Parameters
| **zoneId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingZoneByIdAsync"></a>
# **getShippingZoneByIdAsync**
> ShippingZoneDtoEnvelope getShippingZoneByIdAsync(zoneId, tenantId, apiVersion, xApiVersion)

Get shipping zone by ID

Retrieves a specific shipping zone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingZonesApi()
val zoneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingZoneDtoEnvelope = apiInstance.getShippingZoneByIdAsync(zoneId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingZonesApi#getShippingZoneByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingZonesApi#getShippingZoneByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **zoneId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShippingZoneDtoEnvelope**](ShippingZoneDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingZonesAsync"></a>
# **getShippingZonesAsync**
> ShippingZoneDtoListEnvelope getShippingZonesAsync(tenantId, apiVersion, xApiVersion)

Get all shipping zones

Retrieves all shipping zones for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingZonesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingZoneDtoListEnvelope = apiInstance.getShippingZonesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingZonesApi#getShippingZonesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingZonesApi#getShippingZonesAsync")
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

[**ShippingZoneDtoListEnvelope**](ShippingZoneDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingZonesCountAsync"></a>
# **getShippingZonesCountAsync**
> Int32Envelope getShippingZonesCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping zones count

Returns the count of shipping zones.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingZonesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShippingZonesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingZonesApi#getShippingZonesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingZonesApi#getShippingZonesCountAsync")
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

<a id="updateShippingZoneAsync"></a>
# **updateShippingZoneAsync**
> updateShippingZoneAsync(zoneId, tenantId, apiVersion, xApiVersion, shippingZoneUpdateDto)

Update a shipping zone

Updates an existing shipping zone.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingZonesApi()
val zoneId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingZoneUpdateDto : ShippingZoneUpdateDto =  // ShippingZoneUpdateDto | 
try {
    apiInstance.updateShippingZoneAsync(zoneId, tenantId, apiVersion, xApiVersion, shippingZoneUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingZonesApi#updateShippingZoneAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingZonesApi#updateShippingZoneAsync")
    e.printStackTrace()
}
```

### Parameters
| **zoneId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingZoneUpdateDto** | [**ShippingZoneUpdateDto**](ShippingZoneUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

