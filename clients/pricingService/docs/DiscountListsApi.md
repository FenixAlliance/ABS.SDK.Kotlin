# DiscountListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2PricingServiceDiscountListsCountGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsCountGet) | **GET** /api/v2/PricingService/DiscountLists/Count |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDelete**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDelete) | **DELETE** /api/v2/PricingService/DiscountLists/{discountListId} |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/Count |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete) | **DELETE** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut) | **PUT** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost) | **POST** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdGet) | **GET** /api/v2/PricingService/DiscountLists/{discountListId} |  |
| [**apiV2PricingServiceDiscountListsDiscountListIdPut**](DiscountListsApi.md#apiV2PricingServiceDiscountListsDiscountListIdPut) | **PUT** /api/v2/PricingService/DiscountLists/{discountListId} |  |
| [**apiV2PricingServiceDiscountListsGet**](DiscountListsApi.md#apiV2PricingServiceDiscountListsGet) | **GET** /api/v2/PricingService/DiscountLists |  |
| [**apiV2PricingServiceDiscountListsPost**](DiscountListsApi.md#apiV2PricingServiceDiscountListsPost) | **POST** /api/v2/PricingService/DiscountLists |  |
| [**getDiscountListEntry**](DiscountListsApi.md#getDiscountListEntry) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} |  |


<a id="apiV2PricingServiceDiscountListsCountGet"></a>
# **apiV2PricingServiceDiscountListsCountGet**
> Int32Envelope apiV2PricingServiceDiscountListsCountGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2PricingServiceDiscountListsCountGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsCountGet")
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

<a id="apiV2PricingServiceDiscountListsDiscountListIdDelete"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDelete**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdDelete(discountListId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDelete(discountListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
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

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet**
> Int32Envelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet(discountListId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet(discountListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsCountGet")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
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

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete(discountListId, discountListEntryId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountListEntryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete(discountListId, discountListEntryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **discountListEntryId** | **java.util.UUID**|  | |
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

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut(discountListId, discountListEntryId, tenantId, apiVersion, xApiVersion, discountUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountListEntryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val discountUpdateDto : DiscountUpdateDto =  // DiscountUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut(discountListId, discountListEntryId, tenantId, apiVersion, xApiVersion, discountUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsDiscountListEntryIdPut")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **discountListEntryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **discountUpdateDto** | [**DiscountUpdateDto**](DiscountUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet**
> DiscountDtoListEnvelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet(discountListId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DiscountDtoListEnvelope = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet(discountListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsGet")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**DiscountDtoListEnvelope**](DiscountDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost(discountListId, tenantId, apiVersion, xApiVersion, discountCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val discountCreateDto : DiscountCreateDto =  // DiscountCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost(discountListId, tenantId, apiVersion, xApiVersion, discountCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdDiscountsPost")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **discountCreateDto** | [**DiscountCreateDto**](DiscountCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2PricingServiceDiscountListsDiscountListIdGet"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdGet**
> DiscountListDtoEnvelope apiV2PricingServiceDiscountListsDiscountListIdGet(discountListId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DiscountListDtoEnvelope = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdGet(discountListId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdGet")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**DiscountListDtoEnvelope**](DiscountListDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServiceDiscountListsDiscountListIdPut"></a>
# **apiV2PricingServiceDiscountListsDiscountListIdPut**
> EmptyEnvelope apiV2PricingServiceDiscountListsDiscountListIdPut(discountListId, tenantId, apiVersion, xApiVersion, discountListUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val discountListUpdateDto : DiscountListUpdateDto =  // DiscountListUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServiceDiscountListsDiscountListIdPut(discountListId, tenantId, apiVersion, xApiVersion, discountListUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsDiscountListIdPut")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **discountListUpdateDto** | [**DiscountListUpdateDto**](DiscountListUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2PricingServiceDiscountListsGet"></a>
# **apiV2PricingServiceDiscountListsGet**
> DiscountListDtoListEnvelope apiV2PricingServiceDiscountListsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DiscountListDtoListEnvelope = apiInstance.apiV2PricingServiceDiscountListsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsGet")
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

[**DiscountListDtoListEnvelope**](DiscountListDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PricingServiceDiscountListsPost"></a>
# **apiV2PricingServiceDiscountListsPost**
> EmptyEnvelope apiV2PricingServiceDiscountListsPost(tenantId, apiVersion, xApiVersion, discountListCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val discountListCreateDto : DiscountListCreateDto =  // DiscountListCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PricingServiceDiscountListsPost(tenantId, apiVersion, xApiVersion, discountListCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#apiV2PricingServiceDiscountListsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **discountListCreateDto** | [**DiscountListCreateDto**](DiscountListCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getDiscountListEntry"></a>
# **getDiscountListEntry**
> DiscountDtoEnvelope getDiscountListEntry(discountListId, discountListEntryId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountListEntryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DiscountDtoEnvelope = apiInstance.getDiscountListEntry(discountListId, discountListEntryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#getDiscountListEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#getDiscountListEntry")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **discountListEntryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**DiscountDtoEnvelope**](DiscountDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

