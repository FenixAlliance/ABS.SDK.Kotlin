# MarketingListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2MarketingServiceMarketingListsCountGet**](MarketingListsApi.md#apiV2MarketingServiceMarketingListsCountGet) | **GET** /api/v2/MarketingService/MarketingLists/Count |  |
| [**apiV2MarketingServiceMarketingListsGet**](MarketingListsApi.md#apiV2MarketingServiceMarketingListsGet) | **GET** /api/v2/MarketingService/MarketingLists |  |
| [**apiV2MarketingServiceMarketingListsMarketinglistIdDelete**](MarketingListsApi.md#apiV2MarketingServiceMarketingListsMarketinglistIdDelete) | **DELETE** /api/v2/MarketingService/MarketingLists/{marketinglistId} |  |
| [**apiV2MarketingServiceMarketingListsMarketinglistIdGet**](MarketingListsApi.md#apiV2MarketingServiceMarketingListsMarketinglistIdGet) | **GET** /api/v2/MarketingService/MarketingLists/{marketinglistId} |  |
| [**apiV2MarketingServiceMarketingListsMarketinglistIdPut**](MarketingListsApi.md#apiV2MarketingServiceMarketingListsMarketinglistIdPut) | **PUT** /api/v2/MarketingService/MarketingLists/{marketinglistId} |  |
| [**apiV2MarketingServiceMarketingListsPost**](MarketingListsApi.md#apiV2MarketingServiceMarketingListsPost) | **POST** /api/v2/MarketingService/MarketingLists |  |


<a id="apiV2MarketingServiceMarketingListsCountGet"></a>
# **apiV2MarketingServiceMarketingListsCountGet**
> Int32Envelope apiV2MarketingServiceMarketingListsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2MarketingServiceMarketingListsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsCountGet")
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

<a id="apiV2MarketingServiceMarketingListsGet"></a>
# **apiV2MarketingServiceMarketingListsGet**
> MarketingListDtoListEnvelope apiV2MarketingServiceMarketingListsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingListDtoListEnvelope = apiInstance.apiV2MarketingServiceMarketingListsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsGet")
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

[**MarketingListDtoListEnvelope**](MarketingListDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceMarketingListsMarketinglistIdDelete"></a>
# **apiV2MarketingServiceMarketingListsMarketinglistIdDelete**
> EmptyEnvelope apiV2MarketingServiceMarketingListsMarketinglistIdDelete(marketinglistId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val marketinglistId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceMarketingListsMarketinglistIdDelete(marketinglistId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsMarketinglistIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsMarketinglistIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **marketinglistId** | **java.util.UUID**|  | |
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

<a id="apiV2MarketingServiceMarketingListsMarketinglistIdGet"></a>
# **apiV2MarketingServiceMarketingListsMarketinglistIdGet**
> MarketingListDtoEnvelope apiV2MarketingServiceMarketingListsMarketinglistIdGet(marketinglistId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val marketinglistId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingListDtoEnvelope = apiInstance.apiV2MarketingServiceMarketingListsMarketinglistIdGet(marketinglistId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsMarketinglistIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsMarketinglistIdGet")
    e.printStackTrace()
}
```

### Parameters
| **marketinglistId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MarketingListDtoEnvelope**](MarketingListDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2MarketingServiceMarketingListsMarketinglistIdPut"></a>
# **apiV2MarketingServiceMarketingListsMarketinglistIdPut**
> EmptyEnvelope apiV2MarketingServiceMarketingListsMarketinglistIdPut(marketinglistId, tenantId, marketingListUpdateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val marketinglistId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingListUpdateDto : MarketingListUpdateDto =  // MarketingListUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceMarketingListsMarketinglistIdPut(marketinglistId, tenantId, marketingListUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsMarketinglistIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsMarketinglistIdPut")
    e.printStackTrace()
}
```

### Parameters
| **marketinglistId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **marketingListUpdateDto** | [**MarketingListUpdateDto**](MarketingListUpdateDto.md)|  | |
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2MarketingServiceMarketingListsPost"></a>
# **apiV2MarketingServiceMarketingListsPost**
> EmptyEnvelope apiV2MarketingServiceMarketingListsPost(tenantId, marketingListCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingListCreateDto : MarketingListCreateDto =  // MarketingListCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2MarketingServiceMarketingListsPost(tenantId, marketingListCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#apiV2MarketingServiceMarketingListsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **marketingListCreateDto** | [**MarketingListCreateDto**](MarketingListCreateDto.md)|  | |
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

 - **Content-Type**: application/json
 - **Accept**: application/json

