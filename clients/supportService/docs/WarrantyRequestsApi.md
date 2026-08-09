# WarrantyRequestsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWarrantyRequestAsync**](WarrantyRequestsApi.md#createWarrantyRequestAsync) | **POST** /api/v2/SupportService/WarrantyRequests | Create a warranty request |
| [**deleteWarrantyRequestAsync**](WarrantyRequestsApi.md#deleteWarrantyRequestAsync) | **DELETE** /api/v2/SupportService/WarrantyRequests/{warrantyRequestId} | Delete a warranty request |
| [**getWarrantyRequestAsync**](WarrantyRequestsApi.md#getWarrantyRequestAsync) | **GET** /api/v2/SupportService/WarrantyRequests/{warrantyRequestId} | Retrieve a warranty request by ID |
| [**getWarrantyRequestsAsync**](WarrantyRequestsApi.md#getWarrantyRequestsAsync) | **GET** /api/v2/SupportService/WarrantyRequests | Retrieve warranty requests |
| [**getWarrantyRequestsCountAsync**](WarrantyRequestsApi.md#getWarrantyRequestsCountAsync) | **GET** /api/v2/SupportService/WarrantyRequests/Count | Get warranty requests count |
| [**patchWarrantyRequestAsync**](WarrantyRequestsApi.md#patchWarrantyRequestAsync) | **PATCH** /api/v2/SupportService/WarrantyRequests/{warrantyRequestId} | Patch a warranty request |
| [**updateWarrantyRequestAsync**](WarrantyRequestsApi.md#updateWarrantyRequestAsync) | **PUT** /api/v2/SupportService/WarrantyRequests/{warrantyRequestId} | Update a warranty request |


<a id="createWarrantyRequestAsync"></a>
# **createWarrantyRequestAsync**
> EmptyEnvelope createWarrantyRequestAsync(tenantId, apiVersion, xApiVersion, warrantyRequestCreateDto)

Create a warranty request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val warrantyRequestCreateDto : WarrantyRequestCreateDto =  // WarrantyRequestCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWarrantyRequestAsync(tenantId, apiVersion, xApiVersion, warrantyRequestCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyRequestsApi#createWarrantyRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyRequestsApi#createWarrantyRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **warrantyRequestCreateDto** | [**WarrantyRequestCreateDto**](WarrantyRequestCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWarrantyRequestAsync"></a>
# **deleteWarrantyRequestAsync**
> EmptyEnvelope deleteWarrantyRequestAsync(warrantyRequestId, tenantId, apiVersion, xApiVersion)

Delete a warranty request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyRequestsApi()
val warrantyRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWarrantyRequestAsync(warrantyRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyRequestsApi#deleteWarrantyRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyRequestsApi#deleteWarrantyRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **warrantyRequestId** | **java.util.UUID**|  | |
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

<a id="getWarrantyRequestAsync"></a>
# **getWarrantyRequestAsync**
> WarrantyRequestDtoEnvelope getWarrantyRequestAsync(warrantyRequestId, tenantId, apiVersion, xApiVersion)

Retrieve a warranty request by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyRequestsApi()
val warrantyRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WarrantyRequestDtoEnvelope = apiInstance.getWarrantyRequestAsync(warrantyRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyRequestsApi#getWarrantyRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyRequestsApi#getWarrantyRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **warrantyRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WarrantyRequestDtoEnvelope**](WarrantyRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWarrantyRequestsAsync"></a>
# **getWarrantyRequestsAsync**
> WarrantyRequestDtoListEnvelope getWarrantyRequestsAsync(tenantId, apiVersion, xApiVersion, warrantyRequestDtoCollectionQueryParameters)

Retrieve warranty requests

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val warrantyRequestDtoCollectionQueryParameters : WarrantyRequestDtoCollectionQueryParameters =  // WarrantyRequestDtoCollectionQueryParameters | 
try {
    val result : WarrantyRequestDtoListEnvelope = apiInstance.getWarrantyRequestsAsync(tenantId, apiVersion, xApiVersion, warrantyRequestDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyRequestsApi#getWarrantyRequestsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyRequestsApi#getWarrantyRequestsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **warrantyRequestDtoCollectionQueryParameters** | [**WarrantyRequestDtoCollectionQueryParameters**](WarrantyRequestDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**WarrantyRequestDtoListEnvelope**](WarrantyRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getWarrantyRequestsCountAsync"></a>
# **getWarrantyRequestsCountAsync**
> Int32Envelope getWarrantyRequestsCountAsync(tenantId, apiVersion, xApiVersion, warrantyRequestDtoCollectionQueryParameters)

Get warranty requests count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val warrantyRequestDtoCollectionQueryParameters : WarrantyRequestDtoCollectionQueryParameters =  // WarrantyRequestDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getWarrantyRequestsCountAsync(tenantId, apiVersion, xApiVersion, warrantyRequestDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyRequestsApi#getWarrantyRequestsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyRequestsApi#getWarrantyRequestsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **warrantyRequestDtoCollectionQueryParameters** | [**WarrantyRequestDtoCollectionQueryParameters**](WarrantyRequestDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchWarrantyRequestAsync"></a>
# **patchWarrantyRequestAsync**
> EmptyEnvelope patchWarrantyRequestAsync(warrantyRequestId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a warranty request

Partially updates an existing warranty request by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyRequestsApi()
val warrantyRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWarrantyRequestAsync(warrantyRequestId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyRequestsApi#patchWarrantyRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyRequestsApi#patchWarrantyRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **warrantyRequestId** | **java.util.UUID**|  | |
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

<a id="updateWarrantyRequestAsync"></a>
# **updateWarrantyRequestAsync**
> EmptyEnvelope updateWarrantyRequestAsync(warrantyRequestId, tenantId, apiVersion, xApiVersion, warrantyRequestUpdateDto)

Update a warranty request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyRequestsApi()
val warrantyRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val warrantyRequestUpdateDto : WarrantyRequestUpdateDto =  // WarrantyRequestUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWarrantyRequestAsync(warrantyRequestId, tenantId, apiVersion, xApiVersion, warrantyRequestUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyRequestsApi#updateWarrantyRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyRequestsApi#updateWarrantyRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **warrantyRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **warrantyRequestUpdateDto** | [**WarrantyRequestUpdateDto**](WarrantyRequestUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

