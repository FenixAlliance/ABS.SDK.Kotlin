# ShippingCouriersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShippingCourierAsync**](ShippingCouriersApi.md#createShippingCourierAsync) | **POST** /api/v2/ShipmentsService/ShippingCouriers | Create a shipping courier |
| [**deleteShippingCourierAsync**](ShippingCouriersApi.md#deleteShippingCourierAsync) | **DELETE** /api/v2/ShipmentsService/ShippingCouriers/{courierId} | Delete a shipping courier |
| [**getShippingCourierByIdAsync**](ShippingCouriersApi.md#getShippingCourierByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingCouriers/{courierId} | Get shipping courier by ID |
| [**getShippingCouriersAsync**](ShippingCouriersApi.md#getShippingCouriersAsync) | **GET** /api/v2/ShipmentsService/ShippingCouriers | Get all shipping couriers |
| [**getShippingCouriersCountAsync**](ShippingCouriersApi.md#getShippingCouriersCountAsync) | **GET** /api/v2/ShipmentsService/ShippingCouriers/Count | Get shipping couriers count |
| [**patchShippingCourierAsync**](ShippingCouriersApi.md#patchShippingCourierAsync) | **PATCH** /api/v2/ShipmentsService/ShippingCouriers/{courierId} | Patch a shipping courier |
| [**updateShippingCourierAsync**](ShippingCouriersApi.md#updateShippingCourierAsync) | **PUT** /api/v2/ShipmentsService/ShippingCouriers/{courierId} | Update a shipping courier |


<a id="createShippingCourierAsync"></a>
# **createShippingCourierAsync**
> createShippingCourierAsync(tenantId, apiVersion, xApiVersion, shippingCourierCreateDto)

Create a shipping courier

Creates a new shipping courier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingCouriersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingCourierCreateDto : ShippingCourierCreateDto =  // ShippingCourierCreateDto | 
try {
    apiInstance.createShippingCourierAsync(tenantId, apiVersion, xApiVersion, shippingCourierCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingCouriersApi#createShippingCourierAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingCouriersApi#createShippingCourierAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingCourierCreateDto** | [**ShippingCourierCreateDto**](ShippingCourierCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShippingCourierAsync"></a>
# **deleteShippingCourierAsync**
> deleteShippingCourierAsync(courierId, tenantId, apiVersion, xApiVersion)

Delete a shipping courier

Deletes a shipping courier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingCouriersApi()
val courierId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShippingCourierAsync(courierId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ShippingCouriersApi#deleteShippingCourierAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingCouriersApi#deleteShippingCourierAsync")
    e.printStackTrace()
}
```

### Parameters
| **courierId** | **java.util.UUID**|  | |
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

<a id="getShippingCourierByIdAsync"></a>
# **getShippingCourierByIdAsync**
> ShippingCourierDtoEnvelope getShippingCourierByIdAsync(courierId, tenantId, apiVersion, xApiVersion)

Get shipping courier by ID

Retrieves a specific shipping courier by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingCouriersApi()
val courierId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingCourierDtoEnvelope = apiInstance.getShippingCourierByIdAsync(courierId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingCouriersApi#getShippingCourierByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingCouriersApi#getShippingCourierByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **courierId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShippingCourierDtoEnvelope**](ShippingCourierDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingCouriersAsync"></a>
# **getShippingCouriersAsync**
> ShippingCourierDtoListEnvelope getShippingCouriersAsync(tenantId, apiVersion, xApiVersion)

Get all shipping couriers

Retrieves all shipping couriers for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingCouriersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingCourierDtoListEnvelope = apiInstance.getShippingCouriersAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingCouriersApi#getShippingCouriersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingCouriersApi#getShippingCouriersAsync")
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

[**ShippingCourierDtoListEnvelope**](ShippingCourierDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingCouriersCountAsync"></a>
# **getShippingCouriersCountAsync**
> Int32Envelope getShippingCouriersCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping couriers count

Returns the count of shipping couriers for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingCouriersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShippingCouriersCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingCouriersApi#getShippingCouriersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingCouriersApi#getShippingCouriersCountAsync")
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

<a id="patchShippingCourierAsync"></a>
# **patchShippingCourierAsync**
> EmptyEnvelope patchShippingCourierAsync(courierId, tenantId, apiVersion, xApiVersion, operation)

Patch a shipping courier

Partially updates an existing shipping courier using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingCouriersApi()
val courierId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchShippingCourierAsync(courierId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingCouriersApi#patchShippingCourierAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingCouriersApi#patchShippingCourierAsync")
    e.printStackTrace()
}
```

### Parameters
| **courierId** | **java.util.UUID**|  | |
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

<a id="updateShippingCourierAsync"></a>
# **updateShippingCourierAsync**
> updateShippingCourierAsync(courierId, tenantId, apiVersion, xApiVersion, shippingCourierUpdateDto)

Update a shipping courier

Updates an existing shipping courier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingCouriersApi()
val courierId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingCourierUpdateDto : ShippingCourierUpdateDto =  // ShippingCourierUpdateDto | 
try {
    apiInstance.updateShippingCourierAsync(courierId, tenantId, apiVersion, xApiVersion, shippingCourierUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingCouriersApi#updateShippingCourierAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingCouriersApi#updateShippingCourierAsync")
    e.printStackTrace()
}
```

### Parameters
| **courierId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingCourierUpdateDto** | [**ShippingCourierUpdateDto**](ShippingCourierUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

