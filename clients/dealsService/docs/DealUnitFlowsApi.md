# DealUnitFlowsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2DealsServiceDealUnitFlowsCountGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsCountGet) | **GET** /api/v2/DealsService/DealUnitFlows/Count |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete) | **DELETE** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut) | **PUT** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/Count |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete) | **DELETE** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut) | **PUT** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages/{dealUnitFlowStageId} |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet) | **GET** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages |  |
| [**apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost) | **POST** /api/v2/DealsService/DealUnitFlows/{dealUnitFlowId}/Stages |  |
| [**apiV2DealsServiceDealUnitFlowsGet**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsGet) | **GET** /api/v2/DealsService/DealUnitFlows |  |
| [**apiV2DealsServiceDealUnitFlowsPost**](DealUnitFlowsApi.md#apiV2DealsServiceDealUnitFlowsPost) | **POST** /api/v2/DealsService/DealUnitFlows |  |


<a id="apiV2DealsServiceDealUnitFlowsCountGet"></a>
# **apiV2DealsServiceDealUnitFlowsCountGet**
> Int32Envelope apiV2DealsServiceDealUnitFlowsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2DealsServiceDealUnitFlowsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsCountGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete(dealUnitFlowId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete(dealUnitFlowId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet**
> DealUnitFlowDtoEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DealUnitFlowDtoEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdGet")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**DealUnitFlowDtoEnvelope**](DealUnitFlowDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut(dealUnitFlowId, tenantId, apiVersion, xApiVersion, dealUnitFlowUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val dealUnitFlowUpdateDto : DealUnitFlowUpdateDto =  // DealUnitFlowUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut(dealUnitFlowId, tenantId, apiVersion, xApiVersion, dealUnitFlowUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdPut")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitFlowUpdateDto** | [**DealUnitFlowUpdateDto**](DealUnitFlowUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet**
> Int32Envelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesCountGet")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **dealUnitFlowStageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet**
> DealUnitFlowStageDtoEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DealUnitFlowStageDtoEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdGet")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **dealUnitFlowStageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**DealUnitFlowStageDtoEnvelope**](DealUnitFlowStageDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion, dealUnitFlowStageUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitFlowStageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val dealUnitFlowStageUpdateDto : DealUnitFlowStageUpdateDto =  // DealUnitFlowStageUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut(dealUnitFlowId, dealUnitFlowStageId, tenantId, apiVersion, xApiVersion, dealUnitFlowStageUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesDealUnitFlowStageIdPut")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **dealUnitFlowStageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitFlowStageUpdateDto** | [**DealUnitFlowStageUpdateDto**](DealUnitFlowStageUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet**
> DealUnitFlowStageDtoListEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DealUnitFlowStageDtoListEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet(dealUnitFlowId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesGet")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**DealUnitFlowStageDtoListEnvelope**](DealUnitFlowStageDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost"></a>
# **apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost(dealUnitFlowId, tenantId, apiVersion, xApiVersion, dealUnitFlowStageCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val dealUnitFlowId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val dealUnitFlowStageCreateDto : DealUnitFlowStageCreateDto =  // DealUnitFlowStageCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost(dealUnitFlowId, tenantId, apiVersion, xApiVersion, dealUnitFlowStageCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsDealUnitFlowIdStagesPost")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitFlowId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitFlowStageCreateDto** | [**DealUnitFlowStageCreateDto**](DealUnitFlowStageCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsGet"></a>
# **apiV2DealsServiceDealUnitFlowsGet**
> DealUnitFlowDtoListEnvelope apiV2DealsServiceDealUnitFlowsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DealUnitFlowDtoListEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsGet")
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

[**DealUnitFlowDtoListEnvelope**](DealUnitFlowDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitFlowsPost"></a>
# **apiV2DealsServiceDealUnitFlowsPost**
> EmptyEnvelope apiV2DealsServiceDealUnitFlowsPost(tenantId, apiVersion, xApiVersion, dealUnitFlowCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitFlowsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val dealUnitFlowCreateDto : DealUnitFlowCreateDto =  // DealUnitFlowCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitFlowsPost(tenantId, apiVersion, xApiVersion, dealUnitFlowCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitFlowsApi#apiV2DealsServiceDealUnitFlowsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitFlowCreateDto** | [**DealUnitFlowCreateDto**](DealUnitFlowCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

