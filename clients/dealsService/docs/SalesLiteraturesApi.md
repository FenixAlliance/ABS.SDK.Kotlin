# SalesLiteraturesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2DealsServiceSalesLiteraturesExtendedGet**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesExtendedGet) | **GET** /api/v2/DealsService/SalesLiteratures/Extended |  |
| [**apiV2DealsServiceSalesLiteraturesGet**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesGet) | **GET** /api/v2/DealsService/SalesLiteratures |  |
| [**apiV2DealsServiceSalesLiteraturesPost**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesPost) | **POST** /api/v2/DealsService/SalesLiteratures |  |
| [**apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete) | **DELETE** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} |  |
| [**apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet) | **GET** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} |  |
| [**apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut**](SalesLiteraturesApi.md#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut) | **PUT** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} |  |


<a id="apiV2DealsServiceSalesLiteraturesExtendedGet"></a>
# **apiV2DealsServiceSalesLiteraturesExtendedGet**
> ExtendedSalesLiteratureDtoListEnvelope apiV2DealsServiceSalesLiteraturesExtendedGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedSalesLiteratureDtoListEnvelope = apiInstance.apiV2DealsServiceSalesLiteraturesExtendedGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesExtendedGet")
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

[**ExtendedSalesLiteratureDtoListEnvelope**](ExtendedSalesLiteratureDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceSalesLiteraturesGet"></a>
# **apiV2DealsServiceSalesLiteraturesGet**
> SalesLiteratureDtoListEnvelope apiV2DealsServiceSalesLiteraturesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SalesLiteratureDtoListEnvelope = apiInstance.apiV2DealsServiceSalesLiteraturesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesGet")
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

[**SalesLiteratureDtoListEnvelope**](SalesLiteratureDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceSalesLiteraturesPost"></a>
# **apiV2DealsServiceSalesLiteraturesPost**
> EmptyEnvelope apiV2DealsServiceSalesLiteraturesPost(tenantId, apiVersion, xApiVersion, salesLiteratureCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val salesLiteratureCreateDto : SalesLiteratureCreateDto =  // SalesLiteratureCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceSalesLiteraturesPost(tenantId, apiVersion, xApiVersion, salesLiteratureCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **salesLiteratureCreateDto** | [**SalesLiteratureCreateDto**](SalesLiteratureCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete"></a>
# **apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete**
> EmptyEnvelope apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete(salesLiteratureId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val salesLiteratureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete(salesLiteratureId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **salesLiteratureId** | **java.util.UUID**|  | |
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

<a id="apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet"></a>
# **apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet**
> SalesLiteratureDtoEnvelope apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet(salesLiteratureId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val salesLiteratureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SalesLiteratureDtoEnvelope = apiInstance.apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet(salesLiteratureId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdGet")
    e.printStackTrace()
}
```

### Parameters
| **salesLiteratureId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SalesLiteratureDtoEnvelope**](SalesLiteratureDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut"></a>
# **apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut**
> EmptyEnvelope apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut(salesLiteratureId, tenantId, apiVersion, xApiVersion, salesLiteratureUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val salesLiteratureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val salesLiteratureUpdateDto : SalesLiteratureUpdateDto =  // SalesLiteratureUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut(salesLiteratureId, tenantId, apiVersion, xApiVersion, salesLiteratureUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#apiV2DealsServiceSalesLiteraturesSalesLiteratureIdPut")
    e.printStackTrace()
}
```

### Parameters
| **salesLiteratureId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **salesLiteratureUpdateDto** | [**SalesLiteratureUpdateDto**](SalesLiteratureUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

