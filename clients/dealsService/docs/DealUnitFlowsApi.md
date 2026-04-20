# DealUnitFlowsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDealUnitFlowAsync**](DealUnitFlowsApi.md#createDealUnitFlowAsync) | **POST** /api/v2/DealsService/DealUnitFlows | Create a deal unit flow |
| [**createDealUnitFlowStageAsync**](DealUnitFlowsApi.md#createDealUnitFlowStageAsync) | **POST** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages | Create a deal unit flow stage |
| [**deleteDealUnitFlowAsync**](DealUnitFlowsApi.md#deleteDealUnitFlowAsync) | **DELETE** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} | Delete a deal unit flow |
| [**deleteDealUnitFlowStageAsync**](DealUnitFlowsApi.md#deleteDealUnitFlowStageAsync) | **DELETE** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} | Delete a deal unit flow stage |
| [**getDealUnitFlowAsync**](DealUnitFlowsApi.md#getDealUnitFlowAsync) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} | Get deal unit flow by ID |
| [**getDealUnitFlowStageAsync**](DealUnitFlowsApi.md#getDealUnitFlowStageAsync) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} | Get a deal unit flow stage by ID |
| [**getDealUnitFlowStagesAsync**](DealUnitFlowsApi.md#getDealUnitFlowStagesAsync) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages | Get stages for a deal unit flow |
| [**getDealUnitFlowStagesCountAsync**](DealUnitFlowsApi.md#getDealUnitFlowStagesCountAsync) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/Count | Get stages count for a deal unit flow |
| [**getDealUnitFlowsAsync**](DealUnitFlowsApi.md#getDealUnitFlowsAsync) | **GET** /api/v2/DealsService/DealUnitFlows | Get deal unit flows |
| [**getDealUnitFlowsCountAsync**](DealUnitFlowsApi.md#getDealUnitFlowsCountAsync) | **GET** /api/v2/DealsService/DealUnitFlows/Count | Get deal unit flows count |
| [**updateDealUnitFlowAsync**](DealUnitFlowsApi.md#updateDealUnitFlowAsync) | **PUT** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} | Update a deal unit flow |
| [**updateDealUnitFlowStageAsync**](DealUnitFlowsApi.md#updateDealUnitFlowStageAsync) | **PUT** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} | Update a deal unit flow stage |


<a id="createDealUnitFlowAsync"></a>
# **createDealUnitFlowAsync**
> EmptyEnvelope createDealUnitFlowAsync(tenantId, dealUnitFlowCreateDto)

Create a deal unit flow

Creates a new deal unit flow for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowCreateDto : DealUnitFlowCreateDto =  // DealUnitFlowCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createDealUnitFlowAsync(tenantId, dealUnitFlowCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#createDealUnitFlowAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#createDealUnitFlowAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitFlowCreateDto** | [**DealUnitFlowCreateDto**](DealUnitFlowCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createDealUnitFlowStageAsync"></a>
# **createDealUnitFlowStageAsync**
> EmptyEnvelope createDealUnitFlowStageAsync(dealUnitFlowId, tenantId, dealUnitFlowStageCreateDto)

Create a deal unit flow stage

Creates a new stage within a specific deal unit flow.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowStageCreateDto : DealUnitFlowStageCreateDto =  // DealUnitFlowStageCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createDealUnitFlowStageAsync(dealUnitFlowId, tenantId, dealUnitFlowStageCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#createDealUnitFlowStageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#createDealUnitFlowStageAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitFlowStageCreateDto** | [**DealUnitFlowStageCreateDto**](DealUnitFlowStageCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteDealUnitFlowAsync"></a>
# **deleteDealUnitFlowAsync**
> EmptyEnvelope deleteDealUnitFlowAsync(dealUnitFlowId, tenantId)

Delete a deal unit flow

Deletes an existing deal unit flow by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteDealUnitFlowAsync(dealUnitFlowId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#deleteDealUnitFlowAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#deleteDealUnitFlowAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
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

<a id="deleteDealUnitFlowStageAsync"></a>
# **deleteDealUnitFlowStageAsync**
> EmptyEnvelope deleteDealUnitFlowStageAsync(dealUnitFlowId, dealUnitFlowStageId, tenantId)

Delete a deal unit flow stage

Deletes an existing stage from a specific deal unit flow.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteDealUnitFlowStageAsync(dealUnitFlowId, dealUnitFlowStageId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#deleteDealUnitFlowStageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#deleteDealUnitFlowStageAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **dealUnitFlowStageId** | **java.util.UUID**|  | |
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

<a id="getDealUnitFlowAsync"></a>
# **getDealUnitFlowAsync**
> DealUnitFlowDtoEnvelope getDealUnitFlowAsync(dealUnitFlowId, tenantId)

Get deal unit flow by ID

Retrieves a single deal unit flow by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitFlowDtoEnvelope = apiInstance.getDealUnitFlowAsync(dealUnitFlowId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#getDealUnitFlowAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#getDealUnitFlowAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitFlowDtoEnvelope**](DealUnitFlowDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitFlowStageAsync"></a>
# **getDealUnitFlowStageAsync**
> DealUnitFlowStageDtoEnvelope getDealUnitFlowStageAsync(dealUnitFlowId, dealUnitFlowStageId, tenantId)

Get a deal unit flow stage by ID

Retrieves a single stage for a specific deal unit flow by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitFlowStageDtoEnvelope = apiInstance.getDealUnitFlowStageAsync(dealUnitFlowId, dealUnitFlowStageId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#getDealUnitFlowStageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#getDealUnitFlowStageAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **dealUnitFlowStageId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitFlowStageDtoEnvelope**](DealUnitFlowStageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitFlowStagesAsync"></a>
# **getDealUnitFlowStagesAsync**
> DealUnitFlowStageDtoListEnvelope getDealUnitFlowStagesAsync(dealUnitFlowId, tenantId)

Get stages for a deal unit flow

Retrieves a list of stages for a specific deal unit flow with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitFlowStageDtoListEnvelope = apiInstance.getDealUnitFlowStagesAsync(dealUnitFlowId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#getDealUnitFlowStagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#getDealUnitFlowStagesAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitFlowStageDtoListEnvelope**](DealUnitFlowStageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitFlowStagesCountAsync"></a>
# **getDealUnitFlowStagesCountAsync**
> Int32Envelope getDealUnitFlowStagesCountAsync(dealUnitFlowId, tenantId)

Get stages count for a deal unit flow

Returns the total count of stages for a specific deal unit flow with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getDealUnitFlowStagesCountAsync(dealUnitFlowId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#getDealUnitFlowStagesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#getDealUnitFlowStagesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
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

<a id="getDealUnitFlowsAsync"></a>
# **getDealUnitFlowsAsync**
> DealUnitFlowDtoListEnvelope getDealUnitFlowsAsync(tenantId)

Get deal unit flows

Retrieves a list of deal unit flows for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitFlowDtoListEnvelope = apiInstance.getDealUnitFlowsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#getDealUnitFlowsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#getDealUnitFlowsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitFlowDtoListEnvelope**](DealUnitFlowDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitFlowsCountAsync"></a>
# **getDealUnitFlowsCountAsync**
> Int32Envelope getDealUnitFlowsCountAsync(tenantId)

Get deal unit flows count

Returns the total count of deal unit flows for the specified tenant with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getDealUnitFlowsCountAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#getDealUnitFlowsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#getDealUnitFlowsCountAsync")
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

<a id="updateDealUnitFlowAsync"></a>
# **updateDealUnitFlowAsync**
> EmptyEnvelope updateDealUnitFlowAsync(dealUnitFlowId, tenantId, dealUnitFlowUpdateDto)

Update a deal unit flow

Updates an existing deal unit flow by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowUpdateDto : DealUnitFlowUpdateDto =  // DealUnitFlowUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateDealUnitFlowAsync(dealUnitFlowId, tenantId, dealUnitFlowUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#updateDealUnitFlowAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#updateDealUnitFlowAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitFlowUpdateDto** | [**DealUnitFlowUpdateDto**](DealUnitFlowUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateDealUnitFlowStageAsync"></a>
# **updateDealUnitFlowStageAsync**
> EmptyEnvelope updateDealUnitFlowStageAsync(dealUnitFlowId, dealUnitFlowStageId, tenantId, dealUnitFlowStageUpdateDto)

Update a deal unit flow stage

Updates an existing stage within a specific deal unit flow.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowStageUpdateDto : DealUnitFlowStageUpdateDto =  // DealUnitFlowStageUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateDealUnitFlowStageAsync(dealUnitFlowId, dealUnitFlowStageId, tenantId, dealUnitFlowStageUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#updateDealUnitFlowStageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#updateDealUnitFlowStageAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **dealUnitFlowStageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitFlowStageUpdateDto** | [**DealUnitFlowStageUpdateDto**](DealUnitFlowStageUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

