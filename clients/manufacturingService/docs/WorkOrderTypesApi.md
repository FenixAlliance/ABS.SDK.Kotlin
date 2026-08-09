# WorkOrderTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWorkOrderTypeAsync**](WorkOrderTypesApi.md#createWorkOrderTypeAsync) | **POST** /api/v2/ManufacturingService/WorkOrderTypes | Create a new work order type |
| [**deleteWorkOrderTypeAsync**](WorkOrderTypesApi.md#deleteWorkOrderTypeAsync) | **DELETE** /api/v2/ManufacturingService/WorkOrderTypes/{id} | Delete a work order type |
| [**getWorkOrderTypeByIdAsync**](WorkOrderTypesApi.md#getWorkOrderTypeByIdAsync) | **GET** /api/v2/ManufacturingService/WorkOrderTypes/{id} | Get work order type by ID |
| [**getWorkOrderTypesAsync**](WorkOrderTypesApi.md#getWorkOrderTypesAsync) | **GET** /api/v2/ManufacturingService/WorkOrderTypes | Get all work order types |
| [**getWorkOrderTypesCountAsync**](WorkOrderTypesApi.md#getWorkOrderTypesCountAsync) | **GET** /api/v2/ManufacturingService/WorkOrderTypes/Count | Get work order types count |
| [**patchWorkOrderTypeAsync**](WorkOrderTypesApi.md#patchWorkOrderTypeAsync) | **PATCH** /api/v2/ManufacturingService/WorkOrderTypes/{id} | Patch a work order type |
| [**updateWorkOrderTypeAsync**](WorkOrderTypesApi.md#updateWorkOrderTypeAsync) | **PUT** /api/v2/ManufacturingService/WorkOrderTypes/{id} | Update a work order type |


<a id="createWorkOrderTypeAsync"></a>
# **createWorkOrderTypeAsync**
> createWorkOrderTypeAsync(tenantId, apiVersion, xApiVersion, workOrderTypeCreateDto)

Create a new work order type

Creates a new work order type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrderTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workOrderTypeCreateDto : WorkOrderTypeCreateDto =  // WorkOrderTypeCreateDto | 
try {
    apiInstance.createWorkOrderTypeAsync(tenantId, apiVersion, xApiVersion, workOrderTypeCreateDto)
} catch (e: ClientException) {
    println("4xx response calling WorkOrderTypesApi#createWorkOrderTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrderTypesApi#createWorkOrderTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workOrderTypeCreateDto** | [**WorkOrderTypeCreateDto**](WorkOrderTypeCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWorkOrderTypeAsync"></a>
# **deleteWorkOrderTypeAsync**
> deleteWorkOrderTypeAsync(id, tenantId, apiVersion, xApiVersion)

Delete a work order type

Deletes a work order type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrderTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteWorkOrderTypeAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WorkOrderTypesApi#deleteWorkOrderTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrderTypesApi#deleteWorkOrderTypeAsync")
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

<a id="getWorkOrderTypeByIdAsync"></a>
# **getWorkOrderTypeByIdAsync**
> WorkOrderTypeDto getWorkOrderTypeByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get work order type by ID

Retrieves a specific work order type by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrderTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WorkOrderTypeDto = apiInstance.getWorkOrderTypeByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkOrderTypesApi#getWorkOrderTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrderTypesApi#getWorkOrderTypeByIdAsync")
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

[**WorkOrderTypeDto**](WorkOrderTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkOrderTypesAsync"></a>
# **getWorkOrderTypesAsync**
> WorkOrderTypeDtoListEnvelope getWorkOrderTypesAsync(tenantId, apiVersion, xApiVersion, workOrderTypeDtoCollectionQueryParameters)

Get all work order types

Retrieves all work order types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrderTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workOrderTypeDtoCollectionQueryParameters : WorkOrderTypeDtoCollectionQueryParameters =  // WorkOrderTypeDtoCollectionQueryParameters | 
try {
    val result : WorkOrderTypeDtoListEnvelope = apiInstance.getWorkOrderTypesAsync(tenantId, apiVersion, xApiVersion, workOrderTypeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkOrderTypesApi#getWorkOrderTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrderTypesApi#getWorkOrderTypesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workOrderTypeDtoCollectionQueryParameters** | [**WorkOrderTypeDtoCollectionQueryParameters**](WorkOrderTypeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**WorkOrderTypeDtoListEnvelope**](WorkOrderTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getWorkOrderTypesCountAsync"></a>
# **getWorkOrderTypesCountAsync**
> Int32Envelope getWorkOrderTypesCountAsync(tenantId, apiVersion, xApiVersion, workOrderTypeDtoCollectionQueryParameters)

Get work order types count

Returns the count of work order types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrderTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workOrderTypeDtoCollectionQueryParameters : WorkOrderTypeDtoCollectionQueryParameters =  // WorkOrderTypeDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getWorkOrderTypesCountAsync(tenantId, apiVersion, xApiVersion, workOrderTypeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkOrderTypesApi#getWorkOrderTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrderTypesApi#getWorkOrderTypesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workOrderTypeDtoCollectionQueryParameters** | [**WorkOrderTypeDtoCollectionQueryParameters**](WorkOrderTypeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchWorkOrderTypeAsync"></a>
# **patchWorkOrderTypeAsync**
> EmptyEnvelope patchWorkOrderTypeAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a work order type

Patch a work order type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrderTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWorkOrderTypeAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkOrderTypesApi#patchWorkOrderTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrderTypesApi#patchWorkOrderTypeAsync")
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

<a id="updateWorkOrderTypeAsync"></a>
# **updateWorkOrderTypeAsync**
> updateWorkOrderTypeAsync(id, tenantId, apiVersion, xApiVersion, workOrderTypeUpdateDto)

Update a work order type

Updates an existing work order type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkOrderTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workOrderTypeUpdateDto : WorkOrderTypeUpdateDto =  // WorkOrderTypeUpdateDto | 
try {
    apiInstance.updateWorkOrderTypeAsync(id, tenantId, apiVersion, xApiVersion, workOrderTypeUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling WorkOrderTypesApi#updateWorkOrderTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkOrderTypesApi#updateWorkOrderTypeAsync")
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
| **workOrderTypeUpdateDto** | [**WorkOrderTypeUpdateDto**](WorkOrderTypeUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

