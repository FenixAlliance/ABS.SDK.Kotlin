# ReturnPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createReturnPolicyAsync**](ReturnPoliciesApi.md#createReturnPolicyAsync) | **POST** /api/v2/SupportService/ReturnPolicies | Create a new return policy |
| [**deleteReturnPolicyAsync**](ReturnPoliciesApi.md#deleteReturnPolicyAsync) | **DELETE** /api/v2/SupportService/ReturnPolicies/{returnPolicyId} | Delete a return policy |
| [**getReturnPoliciesAsync**](ReturnPoliciesApi.md#getReturnPoliciesAsync) | **GET** /api/v2/SupportService/ReturnPolicies | Retrieve a list of return policies |
| [**getReturnPoliciesCountAsync**](ReturnPoliciesApi.md#getReturnPoliciesCountAsync) | **GET** /api/v2/SupportService/ReturnPolicies/Count | Get the count of return policies |
| [**getReturnPolicyAsync**](ReturnPoliciesApi.md#getReturnPolicyAsync) | **GET** /api/v2/SupportService/ReturnPolicies/{returnPolicyId} | Retrieve a return policy by ID |
| [**patchReturnPolicyAsync**](ReturnPoliciesApi.md#patchReturnPolicyAsync) | **PATCH** /api/v2/SupportService/ReturnPolicies/{returnPolicyId} | Patch a return policy |
| [**updateReturnPolicyAsync**](ReturnPoliciesApi.md#updateReturnPolicyAsync) | **PUT** /api/v2/SupportService/ReturnPolicies/{returnPolicyId} | Update a return policy |


<a id="createReturnPolicyAsync"></a>
# **createReturnPolicyAsync**
> EmptyEnvelope createReturnPolicyAsync(tenantId, apiVersion, xApiVersion, itemReturnPolicyCreateDto)

Create a new return policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemReturnPolicyCreateDto : ItemReturnPolicyCreateDto =  // ItemReturnPolicyCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createReturnPolicyAsync(tenantId, apiVersion, xApiVersion, itemReturnPolicyCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPoliciesApi#createReturnPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPoliciesApi#createReturnPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemReturnPolicyCreateDto** | [**ItemReturnPolicyCreateDto**](ItemReturnPolicyCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteReturnPolicyAsync"></a>
# **deleteReturnPolicyAsync**
> EmptyEnvelope deleteReturnPolicyAsync(returnPolicyId, tenantId, apiVersion, xApiVersion)

Delete a return policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPoliciesApi()
val returnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteReturnPolicyAsync(returnPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPoliciesApi#deleteReturnPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPoliciesApi#deleteReturnPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **returnPolicyId** | **java.util.UUID**|  | |
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

<a id="getReturnPoliciesAsync"></a>
# **getReturnPoliciesAsync**
> ItemReturnPolicyDtoListEnvelope getReturnPoliciesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of return policies

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReturnPolicyDtoListEnvelope = apiInstance.getReturnPoliciesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPoliciesApi#getReturnPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPoliciesApi#getReturnPoliciesAsync")
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

[**ItemReturnPolicyDtoListEnvelope**](ItemReturnPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getReturnPoliciesCountAsync"></a>
# **getReturnPoliciesCountAsync**
> Int32Envelope getReturnPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of return policies

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getReturnPoliciesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPoliciesApi#getReturnPoliciesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPoliciesApi#getReturnPoliciesCountAsync")
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

<a id="getReturnPolicyAsync"></a>
# **getReturnPolicyAsync**
> ItemReturnPolicyDtoEnvelope getReturnPolicyAsync(returnPolicyId, tenantId, apiVersion, xApiVersion)

Retrieve a return policy by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPoliciesApi()
val returnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReturnPolicyDtoEnvelope = apiInstance.getReturnPolicyAsync(returnPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPoliciesApi#getReturnPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPoliciesApi#getReturnPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **returnPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoEnvelope**](ItemReturnPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchReturnPolicyAsync"></a>
# **patchReturnPolicyAsync**
> EmptyEnvelope patchReturnPolicyAsync(returnPolicyId, tenantId, apiVersion, xApiVersion, operation)

Patch a return policy

Partially updates an existing return policy by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPoliciesApi()
val returnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchReturnPolicyAsync(returnPolicyId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPoliciesApi#patchReturnPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPoliciesApi#patchReturnPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **returnPolicyId** | **java.util.UUID**|  | |
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

<a id="updateReturnPolicyAsync"></a>
# **updateReturnPolicyAsync**
> EmptyEnvelope updateReturnPolicyAsync(returnPolicyId, tenantId, apiVersion, xApiVersion, itemReturnPolicyUpdateDto)

Update a return policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ReturnPoliciesApi()
val returnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemReturnPolicyUpdateDto : ItemReturnPolicyUpdateDto =  // ItemReturnPolicyUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateReturnPolicyAsync(returnPolicyId, tenantId, apiVersion, xApiVersion, itemReturnPolicyUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReturnPoliciesApi#updateReturnPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReturnPoliciesApi#updateReturnPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **returnPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemReturnPolicyUpdateDto** | [**ItemReturnPolicyUpdateDto**](ItemReturnPolicyUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

