# ProductionPlansApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createProductionPlanAsync**](ProductionPlansApi.md#createProductionPlanAsync) | **POST** /api/v2/ManufacturingService/ProductionPlans | Create a new production plan |
| [**deleteProductionPlanAsync**](ProductionPlansApi.md#deleteProductionPlanAsync) | **DELETE** /api/v2/ManufacturingService/ProductionPlans/{id} | Delete a production plan |
| [**getProductionPlanByIdAsync**](ProductionPlansApi.md#getProductionPlanByIdAsync) | **GET** /api/v2/ManufacturingService/ProductionPlans/{id} | Get production plan by ID |
| [**getProductionPlansAsync**](ProductionPlansApi.md#getProductionPlansAsync) | **GET** /api/v2/ManufacturingService/ProductionPlans | Get all production plans |
| [**getProductionPlansCountAsync**](ProductionPlansApi.md#getProductionPlansCountAsync) | **GET** /api/v2/ManufacturingService/ProductionPlans/Count | Get production plans count |
| [**patchProductionPlanAsync**](ProductionPlansApi.md#patchProductionPlanAsync) | **PATCH** /api/v2/ManufacturingService/ProductionPlans/{id} | Patch a production plan |
| [**updateProductionPlanAsync**](ProductionPlansApi.md#updateProductionPlanAsync) | **PUT** /api/v2/ManufacturingService/ProductionPlans/{id} | Update a production plan |


<a id="createProductionPlanAsync"></a>
# **createProductionPlanAsync**
> createProductionPlanAsync(tenantId, apiVersion, xApiVersion, productionPlanCreateDto)

Create a new production plan

Creates a new production plan for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductionPlansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val productionPlanCreateDto : ProductionPlanCreateDto =  // ProductionPlanCreateDto | 
try {
    apiInstance.createProductionPlanAsync(tenantId, apiVersion, xApiVersion, productionPlanCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ProductionPlansApi#createProductionPlanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionPlansApi#createProductionPlanAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productionPlanCreateDto** | [**ProductionPlanCreateDto**](ProductionPlanCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteProductionPlanAsync"></a>
# **deleteProductionPlanAsync**
> deleteProductionPlanAsync(id, tenantId, apiVersion, xApiVersion)

Delete a production plan

Deletes a production plan for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductionPlansApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteProductionPlanAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ProductionPlansApi#deleteProductionPlanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionPlansApi#deleteProductionPlanAsync")
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

<a id="getProductionPlanByIdAsync"></a>
# **getProductionPlanByIdAsync**
> ProductionPlanDto getProductionPlanByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get production plan by ID

Retrieves a specific production plan by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductionPlansApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ProductionPlanDto = apiInstance.getProductionPlanByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionPlansApi#getProductionPlanByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionPlansApi#getProductionPlanByIdAsync")
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

[**ProductionPlanDto**](ProductionPlanDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProductionPlansAsync"></a>
# **getProductionPlansAsync**
> ProductionPlanDtoListEnvelope getProductionPlansAsync(tenantId, apiVersion, xApiVersion, productionPlanDtoCollectionQueryParameters)

Get all production plans

Retrieves all production plans for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductionPlansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val productionPlanDtoCollectionQueryParameters : ProductionPlanDtoCollectionQueryParameters =  // ProductionPlanDtoCollectionQueryParameters | 
try {
    val result : ProductionPlanDtoListEnvelope = apiInstance.getProductionPlansAsync(tenantId, apiVersion, xApiVersion, productionPlanDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionPlansApi#getProductionPlansAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionPlansApi#getProductionPlansAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productionPlanDtoCollectionQueryParameters** | [**ProductionPlanDtoCollectionQueryParameters**](ProductionPlanDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ProductionPlanDtoListEnvelope**](ProductionPlanDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getProductionPlansCountAsync"></a>
# **getProductionPlansCountAsync**
> Int32Envelope getProductionPlansCountAsync(tenantId, apiVersion, xApiVersion, productionPlanDtoCollectionQueryParameters)

Get production plans count

Returns the count of production plans for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductionPlansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val productionPlanDtoCollectionQueryParameters : ProductionPlanDtoCollectionQueryParameters =  // ProductionPlanDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getProductionPlansCountAsync(tenantId, apiVersion, xApiVersion, productionPlanDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionPlansApi#getProductionPlansCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionPlansApi#getProductionPlansCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productionPlanDtoCollectionQueryParameters** | [**ProductionPlanDtoCollectionQueryParameters**](ProductionPlanDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchProductionPlanAsync"></a>
# **patchProductionPlanAsync**
> EmptyEnvelope patchProductionPlanAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a production plan

Patch a production plan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductionPlansApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchProductionPlanAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ProductionPlansApi#patchProductionPlanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionPlansApi#patchProductionPlanAsync")
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

<a id="updateProductionPlanAsync"></a>
# **updateProductionPlanAsync**
> updateProductionPlanAsync(id, tenantId, apiVersion, xApiVersion, productionPlanUpdateDto)

Update a production plan

Updates an existing production plan for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ProductionPlansApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val productionPlanUpdateDto : ProductionPlanUpdateDto =  // ProductionPlanUpdateDto | 
try {
    apiInstance.updateProductionPlanAsync(id, tenantId, apiVersion, xApiVersion, productionPlanUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ProductionPlansApi#updateProductionPlanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ProductionPlansApi#updateProductionPlanAsync")
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
| **productionPlanUpdateDto** | [**ProductionPlanUpdateDto**](ProductionPlanUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

