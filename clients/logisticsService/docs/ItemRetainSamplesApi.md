# ItemRetainSamplesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemRetainSampleAsync**](ItemRetainSamplesApi.md#createItemRetainSampleAsync) | **POST** /api/v2/LogisticsService/ItemRetainSamples | Create an item retain sample |
| [**deleteItemRetainSampleAsync**](ItemRetainSamplesApi.md#deleteItemRetainSampleAsync) | **DELETE** /api/v2/LogisticsService/ItemRetainSamples/{retainSampleId} | Delete an item retain sample |
| [**getItemRetainSampleByIdAsync**](ItemRetainSamplesApi.md#getItemRetainSampleByIdAsync) | **GET** /api/v2/LogisticsService/ItemRetainSamples/{retainSampleId} | Get item retain sample by ID |
| [**getItemRetainSamplesAsync**](ItemRetainSamplesApi.md#getItemRetainSamplesAsync) | **GET** /api/v2/LogisticsService/ItemRetainSamples | Get all item retain samples |
| [**getItemRetainSamplesCountAsync**](ItemRetainSamplesApi.md#getItemRetainSamplesCountAsync) | **GET** /api/v2/LogisticsService/ItemRetainSamples/Count | Get item retain samples count |
| [**patchItemRetainSampleAsync**](ItemRetainSamplesApi.md#patchItemRetainSampleAsync) | **PATCH** /api/v2/LogisticsService/ItemRetainSamples/{retainSampleId} | Patch an item retain sample |
| [**updateItemRetainSampleAsync**](ItemRetainSamplesApi.md#updateItemRetainSampleAsync) | **PUT** /api/v2/LogisticsService/ItemRetainSamples/{retainSampleId} | Update an item retain sample |


<a id="createItemRetainSampleAsync"></a>
# **createItemRetainSampleAsync**
> EmptyEnvelope createItemRetainSampleAsync(tenantId, apiVersion, xApiVersion, itemRetainSampleCreateDto)

Create an item retain sample

Creates a new item retain sample.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRetainSamplesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemRetainSampleCreateDto : ItemRetainSampleCreateDto =  // ItemRetainSampleCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createItemRetainSampleAsync(tenantId, apiVersion, xApiVersion, itemRetainSampleCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRetainSamplesApi#createItemRetainSampleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRetainSamplesApi#createItemRetainSampleAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemRetainSampleCreateDto** | [**ItemRetainSampleCreateDto**](ItemRetainSampleCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemRetainSampleAsync"></a>
# **deleteItemRetainSampleAsync**
> EmptyEnvelope deleteItemRetainSampleAsync(retainSampleId, tenantId, apiVersion, xApiVersion)

Delete an item retain sample

Deletes an item retain sample.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRetainSamplesApi()
val retainSampleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteItemRetainSampleAsync(retainSampleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRetainSamplesApi#deleteItemRetainSampleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRetainSamplesApi#deleteItemRetainSampleAsync")
    e.printStackTrace()
}
```

### Parameters
| **retainSampleId** | **java.util.UUID**|  | |
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

<a id="getItemRetainSampleByIdAsync"></a>
# **getItemRetainSampleByIdAsync**
> ItemRetainSampleDtoEnvelope getItemRetainSampleByIdAsync(retainSampleId, tenantId, apiVersion, xApiVersion)

Get item retain sample by ID

Retrieves a specific item retain sample.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRetainSamplesApi()
val retainSampleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRetainSampleDtoEnvelope = apiInstance.getItemRetainSampleByIdAsync(retainSampleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRetainSamplesApi#getItemRetainSampleByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRetainSamplesApi#getItemRetainSampleByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **retainSampleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRetainSampleDtoEnvelope**](ItemRetainSampleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemRetainSamplesAsync"></a>
# **getItemRetainSamplesAsync**
> ItemRetainSampleDtoListEnvelope getItemRetainSamplesAsync(tenantId, apiVersion, xApiVersion)

Get all item retain samples

Retrieves all item retain samples for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRetainSamplesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRetainSampleDtoListEnvelope = apiInstance.getItemRetainSamplesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRetainSamplesApi#getItemRetainSamplesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRetainSamplesApi#getItemRetainSamplesAsync")
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

[**ItemRetainSampleDtoListEnvelope**](ItemRetainSampleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemRetainSamplesCountAsync"></a>
# **getItemRetainSamplesCountAsync**
> Int32Envelope getItemRetainSamplesCountAsync(tenantId, apiVersion, xApiVersion)

Get item retain samples count

Returns the count of item retain samples.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRetainSamplesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemRetainSamplesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRetainSamplesApi#getItemRetainSamplesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRetainSamplesApi#getItemRetainSamplesCountAsync")
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

<a id="patchItemRetainSampleAsync"></a>
# **patchItemRetainSampleAsync**
> EmptyEnvelope patchItemRetainSampleAsync(retainSampleId, tenantId, apiVersion, xApiVersion, operation)

Patch an item retain sample

Applies a JSON Patch document to an item retain sample.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRetainSamplesApi()
val retainSampleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemRetainSampleAsync(retainSampleId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRetainSamplesApi#patchItemRetainSampleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRetainSamplesApi#patchItemRetainSampleAsync")
    e.printStackTrace()
}
```

### Parameters
| **retainSampleId** | **java.util.UUID**|  | |
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

<a id="updateItemRetainSampleAsync"></a>
# **updateItemRetainSampleAsync**
> EmptyEnvelope updateItemRetainSampleAsync(retainSampleId, tenantId, apiVersion, xApiVersion, itemRetainSampleUpdateDto)

Update an item retain sample

Updates an existing item retain sample.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRetainSamplesApi()
val retainSampleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemRetainSampleUpdateDto : ItemRetainSampleUpdateDto =  // ItemRetainSampleUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateItemRetainSampleAsync(retainSampleId, tenantId, apiVersion, xApiVersion, itemRetainSampleUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRetainSamplesApi#updateItemRetainSampleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRetainSamplesApi#updateItemRetainSampleAsync")
    e.printStackTrace()
}
```

### Parameters
| **retainSampleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemRetainSampleUpdateDto** | [**ItemRetainSampleUpdateDto**](ItemRetainSampleUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

