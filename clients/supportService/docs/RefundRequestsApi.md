# RefundRequestsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createRefundRequestAsync**](RefundRequestsApi.md#createRefundRequestAsync) | **POST** /api/v2/SupportService/RefundRequests | Create a refund request |
| [**deleteRefundRequestAsync**](RefundRequestsApi.md#deleteRefundRequestAsync) | **DELETE** /api/v2/SupportService/RefundRequests/{refundRequestId} | Delete a refund request |
| [**getRefundRequestAsync**](RefundRequestsApi.md#getRefundRequestAsync) | **GET** /api/v2/SupportService/RefundRequests/{refundRequestId} | Retrieve a refund request by ID |
| [**getRefundRequestsAsync**](RefundRequestsApi.md#getRefundRequestsAsync) | **GET** /api/v2/SupportService/RefundRequests | Retrieve refund requests |
| [**getRefundRequestsCountAsync**](RefundRequestsApi.md#getRefundRequestsCountAsync) | **GET** /api/v2/SupportService/RefundRequests/Count | Get refund requests count |
| [**patchRefundRequestAsync**](RefundRequestsApi.md#patchRefundRequestAsync) | **PATCH** /api/v2/SupportService/RefundRequests/{refundRequestId} | Patch a refund request |
| [**updateRefundRequestAsync**](RefundRequestsApi.md#updateRefundRequestAsync) | **PUT** /api/v2/SupportService/RefundRequests/{refundRequestId} | Update a refund request |


<a id="createRefundRequestAsync"></a>
# **createRefundRequestAsync**
> EmptyEnvelope createRefundRequestAsync(tenantId, apiVersion, xApiVersion, refundRequestCreateDto)

Create a refund request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val refundRequestCreateDto : RefundRequestCreateDto =  // RefundRequestCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createRefundRequestAsync(tenantId, apiVersion, xApiVersion, refundRequestCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundRequestsApi#createRefundRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundRequestsApi#createRefundRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refundRequestCreateDto** | [**RefundRequestCreateDto**](RefundRequestCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteRefundRequestAsync"></a>
# **deleteRefundRequestAsync**
> EmptyEnvelope deleteRefundRequestAsync(refundRequestId, tenantId, apiVersion, xApiVersion)

Delete a refund request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundRequestsApi()
val refundRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteRefundRequestAsync(refundRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundRequestsApi#deleteRefundRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundRequestsApi#deleteRefundRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **refundRequestId** | **java.util.UUID**|  | |
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

<a id="getRefundRequestAsync"></a>
# **getRefundRequestAsync**
> RefundRequestDtoEnvelope getRefundRequestAsync(refundRequestId, tenantId, apiVersion, xApiVersion)

Retrieve a refund request by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundRequestsApi()
val refundRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : RefundRequestDtoEnvelope = apiInstance.getRefundRequestAsync(refundRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundRequestsApi#getRefundRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundRequestsApi#getRefundRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **refundRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**RefundRequestDtoEnvelope**](RefundRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRefundRequestsAsync"></a>
# **getRefundRequestsAsync**
> RefundRequestDtoListEnvelope getRefundRequestsAsync(tenantId, apiVersion, xApiVersion, refundRequestDtoCollectionQueryParameters)

Retrieve refund requests

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val refundRequestDtoCollectionQueryParameters : RefundRequestDtoCollectionQueryParameters =  // RefundRequestDtoCollectionQueryParameters | 
try {
    val result : RefundRequestDtoListEnvelope = apiInstance.getRefundRequestsAsync(tenantId, apiVersion, xApiVersion, refundRequestDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundRequestsApi#getRefundRequestsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundRequestsApi#getRefundRequestsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refundRequestDtoCollectionQueryParameters** | [**RefundRequestDtoCollectionQueryParameters**](RefundRequestDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**RefundRequestDtoListEnvelope**](RefundRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getRefundRequestsCountAsync"></a>
# **getRefundRequestsCountAsync**
> Int32Envelope getRefundRequestsCountAsync(tenantId, apiVersion, xApiVersion, refundRequestDtoCollectionQueryParameters)

Get refund requests count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val refundRequestDtoCollectionQueryParameters : RefundRequestDtoCollectionQueryParameters =  // RefundRequestDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getRefundRequestsCountAsync(tenantId, apiVersion, xApiVersion, refundRequestDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundRequestsApi#getRefundRequestsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundRequestsApi#getRefundRequestsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refundRequestDtoCollectionQueryParameters** | [**RefundRequestDtoCollectionQueryParameters**](RefundRequestDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchRefundRequestAsync"></a>
# **patchRefundRequestAsync**
> EmptyEnvelope patchRefundRequestAsync(refundRequestId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a refund request

Partially updates an existing refund request by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundRequestsApi()
val refundRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchRefundRequestAsync(refundRequestId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundRequestsApi#patchRefundRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundRequestsApi#patchRefundRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **refundRequestId** | **java.util.UUID**|  | |
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

<a id="updateRefundRequestAsync"></a>
# **updateRefundRequestAsync**
> EmptyEnvelope updateRefundRequestAsync(refundRequestId, tenantId, apiVersion, xApiVersion, refundRequestUpdateDto)

Update a refund request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundRequestsApi()
val refundRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val refundRequestUpdateDto : RefundRequestUpdateDto =  // RefundRequestUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateRefundRequestAsync(refundRequestId, tenantId, apiVersion, xApiVersion, refundRequestUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundRequestsApi#updateRefundRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundRequestsApi#updateRefundRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **refundRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refundRequestUpdateDto** | [**RefundRequestUpdateDto**](RefundRequestUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

