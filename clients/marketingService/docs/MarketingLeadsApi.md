# MarketingLeadsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMarketingLeadAsync**](MarketingLeadsApi.md#createMarketingLeadAsync) | **POST** /api/v2/MarketingService/MarketingLeads | Create a marketing lead |
| [**deleteMarketingLeadAsync**](MarketingLeadsApi.md#deleteMarketingLeadAsync) | **DELETE** /api/v2/MarketingService/MarketingLeads/{marketingLeadId} | Delete a marketing lead |
| [**getMarketingLeadDetailsAsync**](MarketingLeadsApi.md#getMarketingLeadDetailsAsync) | **GET** /api/v2/MarketingService/MarketingLeads/{marketingLeadId} | Get marketing lead by ID |
| [**getMarketingLeadsCountAsync**](MarketingLeadsApi.md#getMarketingLeadsCountAsync) | **GET** /api/v2/MarketingService/MarketingLeads/Count | Get marketing leads count |
| [**getMarketingLeadsODataAsync**](MarketingLeadsApi.md#getMarketingLeadsODataAsync) | **GET** /api/v2/MarketingService/MarketingLeads | Get marketing leads |
| [**patchMarketingLeadAsync**](MarketingLeadsApi.md#patchMarketingLeadAsync) | **PATCH** /api/v2/MarketingService/MarketingLeads/{marketingLeadId} | Patch a marketing lead |
| [**updateMarketingLeadAsync**](MarketingLeadsApi.md#updateMarketingLeadAsync) | **PUT** /api/v2/MarketingService/MarketingLeads/{marketingLeadId} | Update a marketing lead |


<a id="createMarketingLeadAsync"></a>
# **createMarketingLeadAsync**
> EmptyEnvelope createMarketingLeadAsync(tenantId, marketingLeadCreateDto, apiVersion, xApiVersion)

Create a marketing lead

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingLeadsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingLeadCreateDto : MarketingLeadCreateDto =  // MarketingLeadCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createMarketingLeadAsync(tenantId, marketingLeadCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingLeadsApi#createMarketingLeadAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingLeadsApi#createMarketingLeadAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **marketingLeadCreateDto** | [**MarketingLeadCreateDto**](MarketingLeadCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteMarketingLeadAsync"></a>
# **deleteMarketingLeadAsync**
> EmptyEnvelope deleteMarketingLeadAsync(marketingLeadId, tenantId, apiVersion, xApiVersion)

Delete a marketing lead

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingLeadsApi()
val marketingLeadId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteMarketingLeadAsync(marketingLeadId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingLeadsApi#deleteMarketingLeadAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingLeadsApi#deleteMarketingLeadAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketingLeadId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingLeadDetailsAsync"></a>
# **getMarketingLeadDetailsAsync**
> MarketingLeadDtoEnvelope getMarketingLeadDetailsAsync(marketingLeadId, tenantId, apiVersion, xApiVersion)

Get marketing lead by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingLeadsApi()
val marketingLeadId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingLeadDtoEnvelope = apiInstance.getMarketingLeadDetailsAsync(marketingLeadId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingLeadsApi#getMarketingLeadDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingLeadsApi#getMarketingLeadDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketingLeadId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MarketingLeadDtoEnvelope**](MarketingLeadDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingLeadsCountAsync"></a>
# **getMarketingLeadsCountAsync**
> Int32Envelope getMarketingLeadsCountAsync(tenantId, apiVersion, xApiVersion)

Get marketing leads count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingLeadsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getMarketingLeadsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingLeadsApi#getMarketingLeadsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingLeadsApi#getMarketingLeadsCountAsync")
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

<a id="getMarketingLeadsODataAsync"></a>
# **getMarketingLeadsODataAsync**
> MarketingLeadDtoListEnvelope getMarketingLeadsODataAsync(tenantId, apiVersion, xApiVersion)

Get marketing leads

Retrieves a collection of marketing leads for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingLeadsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingLeadDtoListEnvelope = apiInstance.getMarketingLeadsODataAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingLeadsApi#getMarketingLeadsODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingLeadsApi#getMarketingLeadsODataAsync")
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

[**MarketingLeadDtoListEnvelope**](MarketingLeadDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchMarketingLeadAsync"></a>
# **patchMarketingLeadAsync**
> EmptyEnvelope patchMarketingLeadAsync(marketingLeadId, tenantId, apiVersion, xApiVersion, operation)

Patch a marketing lead

Partially updates a marketing lead by its ID using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingLeadsApi()
val marketingLeadId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchMarketingLeadAsync(marketingLeadId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingLeadsApi#patchMarketingLeadAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingLeadsApi#patchMarketingLeadAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketingLeadId** | **java.util.UUID**|  | |
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

<a id="updateMarketingLeadAsync"></a>
# **updateMarketingLeadAsync**
> EmptyEnvelope updateMarketingLeadAsync(marketingLeadId, tenantId, marketingLeadUpdateDto, apiVersion, xApiVersion)

Update a marketing lead

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingLeadsApi()
val marketingLeadId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingLeadUpdateDto : MarketingLeadUpdateDto =  // MarketingLeadUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateMarketingLeadAsync(marketingLeadId, tenantId, marketingLeadUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingLeadsApi#updateMarketingLeadAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingLeadsApi#updateMarketingLeadAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketingLeadId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **marketingLeadUpdateDto** | [**MarketingLeadUpdateDto**](MarketingLeadUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

