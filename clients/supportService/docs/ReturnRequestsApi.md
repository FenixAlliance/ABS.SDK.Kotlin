# ReturnRequestsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createReturnRequestAsync**](ReturnRequestsApi.md#createReturnRequestAsync) | **POST** /api/v2/SupportService/ReturnRequests | Create a return request |
| [**deleteReturnRequestAsync**](ReturnRequestsApi.md#deleteReturnRequestAsync) | **DELETE** /api/v2/SupportService/ReturnRequests/{returnRequestId} | Delete a return request |
| [**getReturnRequestAsync**](ReturnRequestsApi.md#getReturnRequestAsync) | **GET** /api/v2/SupportService/ReturnRequests/{returnRequestId} | Retrieve a return request by ID |
| [**getReturnRequestsAsync**](ReturnRequestsApi.md#getReturnRequestsAsync) | **GET** /api/v2/SupportService/ReturnRequests | Retrieve return requests |
| [**getReturnRequestsCountAsync**](ReturnRequestsApi.md#getReturnRequestsCountAsync) | **GET** /api/v2/SupportService/ReturnRequests/Count | Get return requests count |
| [**patchReturnRequestAsync**](ReturnRequestsApi.md#patchReturnRequestAsync) | **PATCH** /api/v2/SupportService/ReturnRequests/{returnRequestId} | Patch a return request |
| [**updateReturnRequestAsync**](ReturnRequestsApi.md#updateReturnRequestAsync) | **PUT** /api/v2/SupportService/ReturnRequests/{returnRequestId} | Update a return request |


<a id="createReturnRequestAsync"></a>
# **createReturnRequestAsync**
> EmptyEnvelope createReturnRequestAsync(tenantId, apiVersion, xApiVersion, returnRequestCreateDto)

Create a return request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val returnRequestCreateDto : ReturnRequestCreateDto =  // ReturnRequestCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createReturnRequestAsync(tenantId, apiVersion, xApiVersion, returnRequestCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnRequestsApi#createReturnRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnRequestsApi#createReturnRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnRequestCreateDto** | [**ReturnRequestCreateDto**](ReturnRequestCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteReturnRequestAsync"></a>
# **deleteReturnRequestAsync**
> EmptyEnvelope deleteReturnRequestAsync(returnRequestId, tenantId, apiVersion, xApiVersion)

Delete a return request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnRequestsApi()
val returnRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteReturnRequestAsync(returnRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnRequestsApi#deleteReturnRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnRequestsApi#deleteReturnRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **returnRequestId** | **java.util.UUID**|  | |
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

<a id="getReturnRequestAsync"></a>
# **getReturnRequestAsync**
> ReturnRequestDtoEnvelope getReturnRequestAsync(returnRequestId, tenantId, apiVersion, xApiVersion)

Retrieve a return request by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnRequestsApi()
val returnRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ReturnRequestDtoEnvelope = apiInstance.getReturnRequestAsync(returnRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnRequestsApi#getReturnRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnRequestsApi#getReturnRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **returnRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ReturnRequestDtoEnvelope**](ReturnRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReturnRequestsAsync"></a>
# **getReturnRequestsAsync**
> ReturnRequestDtoListEnvelope getReturnRequestsAsync(tenantId, apiVersion, xApiVersion)

Retrieve return requests

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ReturnRequestDtoListEnvelope = apiInstance.getReturnRequestsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnRequestsApi#getReturnRequestsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnRequestsApi#getReturnRequestsAsync")
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

[**ReturnRequestDtoListEnvelope**](ReturnRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReturnRequestsCountAsync"></a>
# **getReturnRequestsCountAsync**
> Int32Envelope getReturnRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get return requests count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getReturnRequestsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnRequestsApi#getReturnRequestsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnRequestsApi#getReturnRequestsCountAsync")
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

<a id="patchReturnRequestAsync"></a>
# **patchReturnRequestAsync**
> EmptyEnvelope patchReturnRequestAsync(returnRequestId, tenantId, apiVersion, xApiVersion, operation)

Patch a return request

Partially updates an existing return request by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnRequestsApi()
val returnRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchReturnRequestAsync(returnRequestId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnRequestsApi#patchReturnRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnRequestsApi#patchReturnRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **returnRequestId** | **java.util.UUID**|  | |
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

<a id="updateReturnRequestAsync"></a>
# **updateReturnRequestAsync**
> EmptyEnvelope updateReturnRequestAsync(returnRequestId, tenantId, apiVersion, xApiVersion, returnRequestUpdateDto)

Update a return request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnRequestsApi()
val returnRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val returnRequestUpdateDto : ReturnRequestUpdateDto =  // ReturnRequestUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateReturnRequestAsync(returnRequestId, tenantId, apiVersion, xApiVersion, returnRequestUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnRequestsApi#updateReturnRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnRequestsApi#updateReturnRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **returnRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnRequestUpdateDto** | [**ReturnRequestUpdateDto**](ReturnRequestUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

