# ShippingMethodsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShippingMethodAsync**](ShippingMethodsApi.md#createShippingMethodAsync) | **POST** /api/v2/ShipmentsService/ShippingMethods | Create a shipping method |
| [**deleteShippingMethodAsync**](ShippingMethodsApi.md#deleteShippingMethodAsync) | **DELETE** /api/v2/ShipmentsService/ShippingMethods/{methodId} | Delete a shipping method |
| [**getShippingMethodByIdAsync**](ShippingMethodsApi.md#getShippingMethodByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingMethods/{methodId} | Get shipping method by ID |
| [**getShippingMethodsAsync**](ShippingMethodsApi.md#getShippingMethodsAsync) | **GET** /api/v2/ShipmentsService/ShippingMethods | Get all shipping methods |
| [**getShippingMethodsCountAsync**](ShippingMethodsApi.md#getShippingMethodsCountAsync) | **GET** /api/v2/ShipmentsService/ShippingMethods/Count | Get shipping methods count |
| [**patchShippingMethodAsync**](ShippingMethodsApi.md#patchShippingMethodAsync) | **PATCH** /api/v2/ShipmentsService/ShippingMethods/{methodId} | Patch a shipping method |
| [**updateShippingMethodAsync**](ShippingMethodsApi.md#updateShippingMethodAsync) | **PUT** /api/v2/ShipmentsService/ShippingMethods/{methodId} | Update a shipping method |


<a id="createShippingMethodAsync"></a>
# **createShippingMethodAsync**
> createShippingMethodAsync(tenantId, apiVersion, xApiVersion, shippingMethodCreateDto)

Create a shipping method

Creates a new shipping method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingMethodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingMethodCreateDto : ShippingMethodCreateDto =  // ShippingMethodCreateDto | 
try {
    apiInstance.createShippingMethodAsync(tenantId, apiVersion, xApiVersion, shippingMethodCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsApi#createShippingMethodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsApi#createShippingMethodAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingMethodCreateDto** | [**ShippingMethodCreateDto**](ShippingMethodCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShippingMethodAsync"></a>
# **deleteShippingMethodAsync**
> deleteShippingMethodAsync(methodId, tenantId, apiVersion, xApiVersion)

Delete a shipping method

Deletes a shipping method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingMethodsApi()
val methodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShippingMethodAsync(methodId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsApi#deleteShippingMethodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsApi#deleteShippingMethodAsync")
    e.printStackTrace()
}
```

### Parameters
| **methodId** | **java.util.UUID**|  | |
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

<a id="getShippingMethodByIdAsync"></a>
# **getShippingMethodByIdAsync**
> ShippingMethodDtoEnvelope getShippingMethodByIdAsync(methodId, tenantId, apiVersion, xApiVersion)

Get shipping method by ID

Retrieves a specific shipping method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingMethodsApi()
val methodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingMethodDtoEnvelope = apiInstance.getShippingMethodByIdAsync(methodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsApi#getShippingMethodByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsApi#getShippingMethodByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **methodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShippingMethodDtoEnvelope**](ShippingMethodDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingMethodsAsync"></a>
# **getShippingMethodsAsync**
> ShippingMethodDtoListEnvelope getShippingMethodsAsync(tenantId, apiVersion, xApiVersion)

Get all shipping methods

Retrieves all shipping methods for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingMethodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingMethodDtoListEnvelope = apiInstance.getShippingMethodsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsApi#getShippingMethodsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsApi#getShippingMethodsAsync")
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

[**ShippingMethodDtoListEnvelope**](ShippingMethodDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingMethodsCountAsync"></a>
# **getShippingMethodsCountAsync**
> Int32Envelope getShippingMethodsCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping methods count

Returns the count of shipping methods.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingMethodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShippingMethodsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsApi#getShippingMethodsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsApi#getShippingMethodsCountAsync")
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

<a id="patchShippingMethodAsync"></a>
# **patchShippingMethodAsync**
> EmptyEnvelope patchShippingMethodAsync(methodId, tenantId, apiVersion, xApiVersion, operation)

Patch a shipping method

Partially updates an existing shipping method using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingMethodsApi()
val methodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchShippingMethodAsync(methodId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsApi#patchShippingMethodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsApi#patchShippingMethodAsync")
    e.printStackTrace()
}
```

### Parameters
| **methodId** | **java.util.UUID**|  | |
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

<a id="updateShippingMethodAsync"></a>
# **updateShippingMethodAsync**
> updateShippingMethodAsync(methodId, tenantId, apiVersion, xApiVersion, shippingMethodUpdateDto)

Update a shipping method

Updates an existing shipping method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingMethodsApi()
val methodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingMethodUpdateDto : ShippingMethodUpdateDto =  // ShippingMethodUpdateDto | 
try {
    apiInstance.updateShippingMethodAsync(methodId, tenantId, apiVersion, xApiVersion, shippingMethodUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingMethodsApi#updateShippingMethodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingMethodsApi#updateShippingMethodAsync")
    e.printStackTrace()
}
```

### Parameters
| **methodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingMethodUpdateDto** | [**ShippingMethodUpdateDto**](ShippingMethodUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

