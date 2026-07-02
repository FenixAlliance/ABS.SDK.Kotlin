# ShippingLabelsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShippingLabelAsync**](ShippingLabelsApi.md#createShippingLabelAsync) | **POST** /api/v2/ShipmentsService/ShippingLabels | Create a shipping label |
| [**deleteShippingLabelAsync**](ShippingLabelsApi.md#deleteShippingLabelAsync) | **DELETE** /api/v2/ShipmentsService/ShippingLabels/{labelId} | Delete a shipping label |
| [**getShippingLabelByIdAsync**](ShippingLabelsApi.md#getShippingLabelByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingLabels/{labelId} | Get shipping label by ID |
| [**getShippingLabelsAsync**](ShippingLabelsApi.md#getShippingLabelsAsync) | **GET** /api/v2/ShipmentsService/ShippingLabels | Get all shipping labels |
| [**getShippingLabelsCountAsync**](ShippingLabelsApi.md#getShippingLabelsCountAsync) | **GET** /api/v2/ShipmentsService/ShippingLabels/Count | Get shipping labels count |
| [**patchShippingLabelAsync**](ShippingLabelsApi.md#patchShippingLabelAsync) | **PATCH** /api/v2/ShipmentsService/ShippingLabels/{labelId} | Patch a shipping label |
| [**updateShippingLabelAsync**](ShippingLabelsApi.md#updateShippingLabelAsync) | **PUT** /api/v2/ShipmentsService/ShippingLabels/{labelId} | Update a shipping label |


<a id="createShippingLabelAsync"></a>
# **createShippingLabelAsync**
> createShippingLabelAsync(tenantId, apiVersion, xApiVersion, shippingLabelCreateDto)

Create a shipping label

Creates a new shipping label.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingLabelsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingLabelCreateDto : ShippingLabelCreateDto =  // ShippingLabelCreateDto | 
try {
    apiInstance.createShippingLabelAsync(tenantId, apiVersion, xApiVersion, shippingLabelCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingLabelsApi#createShippingLabelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingLabelsApi#createShippingLabelAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingLabelCreateDto** | [**ShippingLabelCreateDto**](ShippingLabelCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShippingLabelAsync"></a>
# **deleteShippingLabelAsync**
> deleteShippingLabelAsync(labelId, tenantId, apiVersion, xApiVersion)

Delete a shipping label

Deletes a shipping label.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingLabelsApi()
val labelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShippingLabelAsync(labelId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ShippingLabelsApi#deleteShippingLabelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingLabelsApi#deleteShippingLabelAsync")
    e.printStackTrace()
}
```

### Parameters
| **labelId** | **java.util.UUID**|  | |
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

<a id="getShippingLabelByIdAsync"></a>
# **getShippingLabelByIdAsync**
> ShippingLabelDtoEnvelope getShippingLabelByIdAsync(labelId, tenantId, apiVersion, xApiVersion)

Get shipping label by ID

Retrieves a specific shipping label.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingLabelsApi()
val labelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingLabelDtoEnvelope = apiInstance.getShippingLabelByIdAsync(labelId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingLabelsApi#getShippingLabelByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingLabelsApi#getShippingLabelByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **labelId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShippingLabelDtoEnvelope**](ShippingLabelDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingLabelsAsync"></a>
# **getShippingLabelsAsync**
> ShippingLabelDtoListEnvelope getShippingLabelsAsync(tenantId, apiVersion, xApiVersion)

Get all shipping labels

Retrieves all shipping labels for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingLabelsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingLabelDtoListEnvelope = apiInstance.getShippingLabelsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingLabelsApi#getShippingLabelsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingLabelsApi#getShippingLabelsAsync")
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

[**ShippingLabelDtoListEnvelope**](ShippingLabelDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingLabelsCountAsync"></a>
# **getShippingLabelsCountAsync**
> Int32Envelope getShippingLabelsCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping labels count

Returns the count of shipping labels.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingLabelsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShippingLabelsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingLabelsApi#getShippingLabelsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingLabelsApi#getShippingLabelsCountAsync")
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

<a id="patchShippingLabelAsync"></a>
# **patchShippingLabelAsync**
> EmptyEnvelope patchShippingLabelAsync(labelId, tenantId, apiVersion, xApiVersion, operation)

Patch a shipping label

Partially updates an existing shipping label using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingLabelsApi()
val labelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchShippingLabelAsync(labelId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingLabelsApi#patchShippingLabelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingLabelsApi#patchShippingLabelAsync")
    e.printStackTrace()
}
```

### Parameters
| **labelId** | **java.util.UUID**|  | |
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

<a id="updateShippingLabelAsync"></a>
# **updateShippingLabelAsync**
> updateShippingLabelAsync(labelId, tenantId, apiVersion, xApiVersion, shippingLabelUpdateDto)

Update a shipping label

Updates an existing shipping label.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingLabelsApi()
val labelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingLabelUpdateDto : ShippingLabelUpdateDto =  // ShippingLabelUpdateDto | 
try {
    apiInstance.updateShippingLabelAsync(labelId, tenantId, apiVersion, xApiVersion, shippingLabelUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingLabelsApi#updateShippingLabelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingLabelsApi#updateShippingLabelAsync")
    e.printStackTrace()
}
```

### Parameters
| **labelId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingLabelUpdateDto** | [**ShippingLabelUpdateDto**](ShippingLabelUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

