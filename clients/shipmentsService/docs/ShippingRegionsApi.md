# ShippingRegionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShippingRegionAsync**](ShippingRegionsApi.md#createShippingRegionAsync) | **POST** /api/v2/ShipmentsService/ShippingRegions | Create a shipping region |
| [**deleteShippingRegionAsync**](ShippingRegionsApi.md#deleteShippingRegionAsync) | **DELETE** /api/v2/ShipmentsService/ShippingRegions/{regionId} | Delete a shipping region |
| [**getShippingRegionByIdAsync**](ShippingRegionsApi.md#getShippingRegionByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingRegions/{regionId} | Get shipping region by ID |
| [**getShippingRegionsAsync**](ShippingRegionsApi.md#getShippingRegionsAsync) | **GET** /api/v2/ShipmentsService/ShippingRegions | Get all shipping regions |
| [**getShippingRegionsCountAsync**](ShippingRegionsApi.md#getShippingRegionsCountAsync) | **GET** /api/v2/ShipmentsService/ShippingRegions/Count | Get shipping regions count |
| [**patchShippingRegionAsync**](ShippingRegionsApi.md#patchShippingRegionAsync) | **PATCH** /api/v2/ShipmentsService/ShippingRegions/{regionId} | Patch a shipping region |
| [**updateShippingRegionAsync**](ShippingRegionsApi.md#updateShippingRegionAsync) | **PUT** /api/v2/ShipmentsService/ShippingRegions/{regionId} | Update a shipping region |


<a id="createShippingRegionAsync"></a>
# **createShippingRegionAsync**
> createShippingRegionAsync(tenantId, apiVersion, xApiVersion, shippingRegionCreateDto)

Create a shipping region

Creates a new shipping region.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingRegionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingRegionCreateDto : ShippingRegionCreateDto =  // ShippingRegionCreateDto | 
try {
    apiInstance.createShippingRegionAsync(tenantId, apiVersion, xApiVersion, shippingRegionCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingRegionsApi#createShippingRegionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingRegionsApi#createShippingRegionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingRegionCreateDto** | [**ShippingRegionCreateDto**](ShippingRegionCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShippingRegionAsync"></a>
# **deleteShippingRegionAsync**
> deleteShippingRegionAsync(regionId, tenantId, apiVersion, xApiVersion)

Delete a shipping region

Deletes a shipping region.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingRegionsApi()
val regionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShippingRegionAsync(regionId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ShippingRegionsApi#deleteShippingRegionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingRegionsApi#deleteShippingRegionAsync")
    e.printStackTrace()
}
```

### Parameters
| **regionId** | **java.util.UUID**|  | |
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

<a id="getShippingRegionByIdAsync"></a>
# **getShippingRegionByIdAsync**
> ShippingRegionDtoEnvelope getShippingRegionByIdAsync(regionId, tenantId, apiVersion, xApiVersion)

Get shipping region by ID

Retrieves a specific shipping region.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingRegionsApi()
val regionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingRegionDtoEnvelope = apiInstance.getShippingRegionByIdAsync(regionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingRegionsApi#getShippingRegionByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingRegionsApi#getShippingRegionByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **regionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShippingRegionDtoEnvelope**](ShippingRegionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingRegionsAsync"></a>
# **getShippingRegionsAsync**
> ShippingRegionDtoListEnvelope getShippingRegionsAsync(tenantId, apiVersion, xApiVersion)

Get all shipping regions

Retrieves all shipping regions for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingRegionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingRegionDtoListEnvelope = apiInstance.getShippingRegionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingRegionsApi#getShippingRegionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingRegionsApi#getShippingRegionsAsync")
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

[**ShippingRegionDtoListEnvelope**](ShippingRegionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingRegionsCountAsync"></a>
# **getShippingRegionsCountAsync**
> Int32Envelope getShippingRegionsCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping regions count

Returns the count of shipping regions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingRegionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShippingRegionsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingRegionsApi#getShippingRegionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingRegionsApi#getShippingRegionsCountAsync")
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

<a id="patchShippingRegionAsync"></a>
# **patchShippingRegionAsync**
> EmptyEnvelope patchShippingRegionAsync(regionId, tenantId, apiVersion, xApiVersion, operation)

Patch a shipping region

Partially updates an existing shipping region using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingRegionsApi()
val regionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchShippingRegionAsync(regionId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingRegionsApi#patchShippingRegionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingRegionsApi#patchShippingRegionAsync")
    e.printStackTrace()
}
```

### Parameters
| **regionId** | **java.util.UUID**|  | |
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

<a id="updateShippingRegionAsync"></a>
# **updateShippingRegionAsync**
> updateShippingRegionAsync(regionId, tenantId, apiVersion, xApiVersion, shippingRegionUpdateDto)

Update a shipping region

Updates an existing shipping region.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingRegionsApi()
val regionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingRegionUpdateDto : ShippingRegionUpdateDto =  // ShippingRegionUpdateDto | 
try {
    apiInstance.updateShippingRegionAsync(regionId, tenantId, apiVersion, xApiVersion, shippingRegionUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingRegionsApi#updateShippingRegionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingRegionsApi#updateShippingRegionAsync")
    e.printStackTrace()
}
```

### Parameters
| **regionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingRegionUpdateDto** | [**ShippingRegionUpdateDto**](ShippingRegionUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

