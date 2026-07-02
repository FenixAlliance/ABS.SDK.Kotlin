# ShipmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShipmentAsync**](ShipmentsApi.md#createShipmentAsync) | **POST** /api/v2/ShipmentsService/Shipments | Create a shipment |
| [**deleteShipmentAsync**](ShipmentsApi.md#deleteShipmentAsync) | **DELETE** /api/v2/ShipmentsService/Shipments/{shipmentId} | Delete a shipment |
| [**getShipmentByIdAsync**](ShipmentsApi.md#getShipmentByIdAsync) | **GET** /api/v2/ShipmentsService/Shipments/{shipmentId} | Get shipment by ID |
| [**getShipmentsAsync**](ShipmentsApi.md#getShipmentsAsync) | **GET** /api/v2/ShipmentsService/Shipments | Get all shipments |
| [**getShipmentsCountAsync**](ShipmentsApi.md#getShipmentsCountAsync) | **GET** /api/v2/ShipmentsService/Shipments/Count | Get shipments count |
| [**patchShipmentAsync**](ShipmentsApi.md#patchShipmentAsync) | **PATCH** /api/v2/ShipmentsService/Shipments/{shipmentId} | Patch a shipment |
| [**updateShipmentAsync**](ShipmentsApi.md#updateShipmentAsync) | **PUT** /api/v2/ShipmentsService/Shipments/{shipmentId} | Update a shipment |


<a id="createShipmentAsync"></a>
# **createShipmentAsync**
> createShipmentAsync(tenantId, apiVersion, xApiVersion, shipmentCreateDto)

Create a shipment

Creates a new shipment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShipmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shipmentCreateDto : ShipmentCreateDto =  // ShipmentCreateDto | 
try {
    apiInstance.createShipmentAsync(tenantId, apiVersion, xApiVersion, shipmentCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#createShipmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#createShipmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shipmentCreateDto** | [**ShipmentCreateDto**](ShipmentCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShipmentAsync"></a>
# **deleteShipmentAsync**
> deleteShipmentAsync(shipmentId, tenantId, apiVersion, xApiVersion)

Delete a shipment

Deletes a shipment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShipmentsApi()
val shipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShipmentAsync(shipmentId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#deleteShipmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#deleteShipmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **shipmentId** | **java.util.UUID**|  | |
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

<a id="getShipmentByIdAsync"></a>
# **getShipmentByIdAsync**
> ShipmentDtoEnvelope getShipmentByIdAsync(shipmentId, tenantId, apiVersion, xApiVersion)

Get shipment by ID

Retrieves a specific shipment by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShipmentsApi()
val shipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShipmentDtoEnvelope = apiInstance.getShipmentByIdAsync(shipmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#getShipmentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#getShipmentByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **shipmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShipmentDtoEnvelope**](ShipmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShipmentsAsync"></a>
# **getShipmentsAsync**
> ShipmentDtoListEnvelope getShipmentsAsync(tenantId, apiVersion, xApiVersion)

Get all shipments

Retrieves all shipments for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShipmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShipmentDtoListEnvelope = apiInstance.getShipmentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#getShipmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#getShipmentsAsync")
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

[**ShipmentDtoListEnvelope**](ShipmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShipmentsCountAsync"></a>
# **getShipmentsCountAsync**
> Int32Envelope getShipmentsCountAsync(tenantId, apiVersion, xApiVersion)

Get shipments count

Returns the count of shipments for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShipmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShipmentsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#getShipmentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#getShipmentsCountAsync")
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

<a id="patchShipmentAsync"></a>
# **patchShipmentAsync**
> EmptyEnvelope patchShipmentAsync(shipmentId, tenantId, apiVersion, xApiVersion, operation)

Patch a shipment

Partially updates an existing shipment using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShipmentsApi()
val shipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchShipmentAsync(shipmentId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#patchShipmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#patchShipmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **shipmentId** | **java.util.UUID**|  | |
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

<a id="updateShipmentAsync"></a>
# **updateShipmentAsync**
> updateShipmentAsync(shipmentId, tenantId, apiVersion, xApiVersion, shipmentUpdateDto)

Update a shipment

Updates an existing shipment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShipmentsApi()
val shipmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shipmentUpdateDto : ShipmentUpdateDto =  // ShipmentUpdateDto | 
try {
    apiInstance.updateShipmentAsync(shipmentId, tenantId, apiVersion, xApiVersion, shipmentUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ShipmentsApi#updateShipmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShipmentsApi#updateShipmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **shipmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shipmentUpdateDto** | [**ShipmentUpdateDto**](ShipmentUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

