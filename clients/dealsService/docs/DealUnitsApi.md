# DealUnitsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2DealsServiceDealUnitsCountGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsCountGet) | **GET** /api/v2/DealsService/DealUnits/Count |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdCalculatePut**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdCalculatePut) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Calculate |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdDelete**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdDelete) | **DELETE** /api/v2/DealsService/DealUnits/{dealUnitId} |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdExtendedGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdExtendedGet) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Extended |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/Count |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId}/Calculate |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete) | **DELETE** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesGet) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdLinesPost**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdLinesPost) | **POST** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines |  |
| [**apiV2DealsServiceDealUnitsDealUnitIdPut**](DealUnitsApi.md#apiV2DealsServiceDealUnitsDealUnitIdPut) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId} |  |
| [**apiV2DealsServiceDealUnitsExtendedGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsExtendedGet) | **GET** /api/v2/DealsService/DealUnits/Extended |  |
| [**apiV2DealsServiceDealUnitsGet**](DealUnitsApi.md#apiV2DealsServiceDealUnitsGet) | **GET** /api/v2/DealsService/DealUnits |  |
| [**apiV2DealsServiceDealUnitsPost**](DealUnitsApi.md#apiV2DealsServiceDealUnitsPost) | **POST** /api/v2/DealsService/DealUnits |  |
| [**getDealUnitAsync**](DealUnitsApi.md#getDealUnitAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId} |  |


<a id="apiV2DealsServiceDealUnitsCountGet"></a>
# **apiV2DealsServiceDealUnitsCountGet**
> Int32Envelope apiV2DealsServiceDealUnitsCountGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2DealsServiceDealUnitsCountGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsCountGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdCalculatePut"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdCalculatePut**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdCalculatePut(dealUnitId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdCalculatePut(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdCalculatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdCalculatePut")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdDelete"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdDelete**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdDelete(dealUnitId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdDelete(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdExtendedGet"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdExtendedGet**
> ExtendedDealUnitDtoEnvelope apiV2DealsServiceDealUnitsDealUnitIdExtendedGet(dealUnitId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedDealUnitDtoEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdExtendedGet(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdExtendedGet")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedDealUnitDtoEnvelope**](ExtendedDealUnitDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet**
> Int32Envelope apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet(dealUnitId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesCountGet")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut(dealUnitId, dealUnitLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut(dealUnitId, dealUnitLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdCalculatePut")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **dealUnitLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete(dealUnitId, dealUnitLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete(dealUnitId, dealUnitLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **dealUnitLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet**
> DealUnitLineDtoEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet(dealUnitId, dealUnitLineId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitLineDtoEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet(dealUnitId, dealUnitLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdGet")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **dealUnitLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitLineDtoEnvelope**](DealUnitLineDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut(dealUnitId, dealUnitLineId, tenantId, dealUnitLineUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineUpdateDto : DealUnitLineUpdateDto =  // DealUnitLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut(dealUnitId, dealUnitLineId, tenantId, dealUnitLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesDealUnitLineIdPut")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **dealUnitLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitLineUpdateDto** | [**DealUnitLineUpdateDto**](DealUnitLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesGet"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesGet**
> DealUnitLineDtoListEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesGet(dealUnitId, tenantId, itemId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitLineDtoListEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesGet(dealUnitId, tenantId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesGet")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **java.util.UUID**|  | [optional] |

### Return type

[**DealUnitLineDtoListEnvelope**](DealUnitLineDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdLinesPost"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdLinesPost**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdLinesPost(dealUnitId, tenantId, dealUnitLineCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineCreateDto : DealUnitLineCreateDto =  // DealUnitLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdLinesPost(dealUnitId, tenantId, dealUnitLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdLinesPost")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitLineCreateDto** | [**DealUnitLineCreateDto**](DealUnitLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsDealUnitIdPut"></a>
# **apiV2DealsServiceDealUnitsDealUnitIdPut**
> EmptyEnvelope apiV2DealsServiceDealUnitsDealUnitIdPut(dealUnitId, tenantId, dealUnitUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitUpdateDto : DealUnitUpdateDto =  // DealUnitUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitsDealUnitIdPut(dealUnitId, tenantId, dealUnitUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsDealUnitIdPut")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitUpdateDto** | [**DealUnitUpdateDto**](DealUnitUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsExtendedGet"></a>
# **apiV2DealsServiceDealUnitsExtendedGet**
> ExtendedDealUnitDtoListEnvelope apiV2DealsServiceDealUnitsExtendedGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedDealUnitDtoListEnvelope = apiInstance.apiV2DealsServiceDealUnitsExtendedGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsExtendedGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedDealUnitDtoListEnvelope**](ExtendedDealUnitDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsGet"></a>
# **apiV2DealsServiceDealUnitsGet**
> DealUnitDtoListEnvelope apiV2DealsServiceDealUnitsGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitDtoListEnvelope = apiInstance.apiV2DealsServiceDealUnitsGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsGet")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitDtoListEnvelope**](DealUnitDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceDealUnitsPost"></a>
# **apiV2DealsServiceDealUnitsPost**
> EmptyEnvelope apiV2DealsServiceDealUnitsPost(tenantId, dealUnitCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitCreateDto : DealUnitCreateDto =  // DealUnitCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceDealUnitsPost(tenantId, dealUnitCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#apiV2DealsServiceDealUnitsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitCreateDto** | [**DealUnitCreateDto**](DealUnitCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getDealUnitAsync"></a>
# **getDealUnitAsync**
> DealUnitDtoEnvelope getDealUnitAsync(dealUnitId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitDtoEnvelope = apiInstance.getDealUnitAsync(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getDealUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getDealUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitDtoEnvelope**](DealUnitDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

