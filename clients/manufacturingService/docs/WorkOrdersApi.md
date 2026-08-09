# WorkOrdersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWorkOrderAsync**](WorkOrdersApi.md#createWorkOrderAsync) | **POST** /api/v2/ManufacturingService/WorkOrders | Create a new work order |
| [**deleteWorkOrderAsync**](WorkOrdersApi.md#deleteWorkOrderAsync) | **DELETE** /api/v2/ManufacturingService/WorkOrders/{id} | Delete a work order |
| [**getWorkOrderByIdAsync**](WorkOrdersApi.md#getWorkOrderByIdAsync) | **GET** /api/v2/ManufacturingService/WorkOrders/{id} | Get work order by ID |
| [**getWorkOrdersAsync**](WorkOrdersApi.md#getWorkOrdersAsync) | **GET** /api/v2/ManufacturingService/WorkOrders | Get all work orders |
| [**getWorkOrdersCountAsync**](WorkOrdersApi.md#getWorkOrdersCountAsync) | **GET** /api/v2/ManufacturingService/WorkOrders/Count | Get work orders count |
| [**patchWorkOrderAsync**](WorkOrdersApi.md#patchWorkOrderAsync) | **PATCH** /api/v2/ManufacturingService/WorkOrders/{id} | Patch a work order |
| [**updateWorkOrderAsync**](WorkOrdersApi.md#updateWorkOrderAsync) | **PUT** /api/v2/ManufacturingService/WorkOrders/{id} | Update a work order |


<a id="createWorkOrderAsync"></a>
# **createWorkOrderAsync**
> createWorkOrderAsync(tenantId, apiVersion, xApiVersion, workOrderCreateDto)

Create a new work order

Creates a new work order for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workOrderCreateDto : WorkOrderCreateDto =  // WorkOrderCreateDto | 
try {
    apiInstance.createWorkOrderAsync(tenantId, apiVersion, xApiVersion, workOrderCreateDto)
} catch (e: ClientException) {
    println("4xx response calling WorkOrdersApi#createWorkOrderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrdersApi#createWorkOrderAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workOrderCreateDto** | [**WorkOrderCreateDto**](WorkOrderCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWorkOrderAsync"></a>
# **deleteWorkOrderAsync**
> deleteWorkOrderAsync(id, tenantId, apiVersion, xApiVersion)

Delete a work order

Deletes a work order for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteWorkOrderAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WorkOrdersApi#deleteWorkOrderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrdersApi#deleteWorkOrderAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="getWorkOrderByIdAsync"></a>
# **getWorkOrderByIdAsync**
> WorkOrderDto getWorkOrderByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get work order by ID

Retrieves a specific work order by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WorkOrderDto = apiInstance.getWorkOrderByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkOrdersApi#getWorkOrderByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrdersApi#getWorkOrderByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WorkOrderDto**](WorkOrderDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkOrdersAsync"></a>
# **getWorkOrdersAsync**
> WorkOrderDtoListEnvelope getWorkOrdersAsync(tenantId, apiVersion, xApiVersion, workOrderDtoCollectionQueryParameters)

Get all work orders

Retrieves all work orders for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workOrderDtoCollectionQueryParameters : WorkOrderDtoCollectionQueryParameters =  // WorkOrderDtoCollectionQueryParameters | 
try {
    val result : WorkOrderDtoListEnvelope = apiInstance.getWorkOrdersAsync(tenantId, apiVersion, xApiVersion, workOrderDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkOrdersApi#getWorkOrdersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrdersApi#getWorkOrdersAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workOrderDtoCollectionQueryParameters** | [**WorkOrderDtoCollectionQueryParameters**](WorkOrderDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**WorkOrderDtoListEnvelope**](WorkOrderDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getWorkOrdersCountAsync"></a>
# **getWorkOrdersCountAsync**
> Int32Envelope getWorkOrdersCountAsync(tenantId, apiVersion, xApiVersion, workOrderDtoCollectionQueryParameters)

Get work orders count

Returns the count of work orders for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrdersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workOrderDtoCollectionQueryParameters : WorkOrderDtoCollectionQueryParameters =  // WorkOrderDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getWorkOrdersCountAsync(tenantId, apiVersion, xApiVersion, workOrderDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkOrdersApi#getWorkOrdersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrdersApi#getWorkOrdersCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workOrderDtoCollectionQueryParameters** | [**WorkOrderDtoCollectionQueryParameters**](WorkOrderDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchWorkOrderAsync"></a>
# **patchWorkOrderAsync**
> EmptyEnvelope patchWorkOrderAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a work order

Patch a work order

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWorkOrderAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkOrdersApi#patchWorkOrderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrdersApi#patchWorkOrderAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateWorkOrderAsync"></a>
# **updateWorkOrderAsync**
> updateWorkOrderAsync(id, tenantId, apiVersion, xApiVersion, workOrderUpdateDto)

Update a work order

Updates an existing work order for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrdersApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workOrderUpdateDto : WorkOrderUpdateDto =  // WorkOrderUpdateDto | 
try {
    apiInstance.updateWorkOrderAsync(id, tenantId, apiVersion, xApiVersion, workOrderUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling WorkOrdersApi#updateWorkOrderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrdersApi#updateWorkOrderAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workOrderUpdateDto** | [**WorkOrderUpdateDto**](WorkOrderUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

