# ItemShippingPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemShippingPolicyAsync**](ItemShippingPoliciesApi.md#createItemShippingPolicyAsync) | **POST** /api/v2/ShipmentsService/ItemShippingPolicies | Create an item shipping policy |
| [**deleteItemShippingPolicyAsync**](ItemShippingPoliciesApi.md#deleteItemShippingPolicyAsync) | **DELETE** /api/v2/ShipmentsService/ItemShippingPolicies/{policyId} | Delete an item shipping policy |
| [**getItemShippingPoliciesAsync**](ItemShippingPoliciesApi.md#getItemShippingPoliciesAsync) | **GET** /api/v2/ShipmentsService/ItemShippingPolicies | Get all item shipping policies |
| [**getItemShippingPoliciesCountAsync**](ItemShippingPoliciesApi.md#getItemShippingPoliciesCountAsync) | **GET** /api/v2/ShipmentsService/ItemShippingPolicies/Count | Get item shipping policies count |
| [**getItemShippingPolicyByIdAsync**](ItemShippingPoliciesApi.md#getItemShippingPolicyByIdAsync) | **GET** /api/v2/ShipmentsService/ItemShippingPolicies/{policyId} | Get item shipping policy by ID |
| [**patchItemShippingPolicyAsync**](ItemShippingPoliciesApi.md#patchItemShippingPolicyAsync) | **PATCH** /api/v2/ShipmentsService/ItemShippingPolicies/{policyId} | Patch an item shipping policy |
| [**updateItemShippingPolicyAsync**](ItemShippingPoliciesApi.md#updateItemShippingPolicyAsync) | **PUT** /api/v2/ShipmentsService/ItemShippingPolicies/{policyId} | Update an item shipping policy |


<a id="createItemShippingPolicyAsync"></a>
# **createItemShippingPolicyAsync**
> createItemShippingPolicyAsync(tenantId, apiVersion, xApiVersion, itemShippingPolicyCreateDto)

Create an item shipping policy

Creates a new item shipping policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemShippingPolicyCreateDto : ItemShippingPolicyCreateDto =  // ItemShippingPolicyCreateDto | 
try {
    apiInstance.createItemShippingPolicyAsync(tenantId, apiVersion, xApiVersion, itemShippingPolicyCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#createItemShippingPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#createItemShippingPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemShippingPolicyCreateDto** | [**ItemShippingPolicyCreateDto**](ItemShippingPolicyCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemShippingPolicyAsync"></a>
# **deleteItemShippingPolicyAsync**
> deleteItemShippingPolicyAsync(policyId, tenantId, apiVersion, xApiVersion)

Delete an item shipping policy

Deletes an item shipping policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val policyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemShippingPolicyAsync(policyId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#deleteItemShippingPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#deleteItemShippingPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **policyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemShippingPoliciesAsync"></a>
# **getItemShippingPoliciesAsync**
> ItemShippingPolicyDtoListEnvelope getItemShippingPoliciesAsync(tenantId, apiVersion, xApiVersion)

Get all item shipping policies

Retrieves all item shipping policies for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemShippingPolicyDtoListEnvelope = apiInstance.getItemShippingPoliciesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#getItemShippingPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#getItemShippingPoliciesAsync")
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

[**ItemShippingPolicyDtoListEnvelope**](ItemShippingPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemShippingPoliciesCountAsync"></a>
# **getItemShippingPoliciesCountAsync**
> Int32Envelope getItemShippingPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Get item shipping policies count

Returns the count of item shipping policies.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getItemShippingPoliciesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#getItemShippingPoliciesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#getItemShippingPoliciesCountAsync")
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

<a id="getItemShippingPolicyByIdAsync"></a>
# **getItemShippingPolicyByIdAsync**
> ItemShippingPolicyDtoEnvelope getItemShippingPolicyByIdAsync(policyId, tenantId, apiVersion, xApiVersion)

Get item shipping policy by ID

Retrieves a specific item shipping policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val policyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemShippingPolicyDtoEnvelope = apiInstance.getItemShippingPolicyByIdAsync(policyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#getItemShippingPolicyByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#getItemShippingPolicyByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **policyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoEnvelope**](ItemShippingPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchItemShippingPolicyAsync"></a>
# **patchItemShippingPolicyAsync**
> EmptyEnvelope patchItemShippingPolicyAsync(policyId, tenantId, apiVersion, xApiVersion, operation)

Patch an item shipping policy

Partially updates an existing item shipping policy using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val policyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchItemShippingPolicyAsync(policyId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#patchItemShippingPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#patchItemShippingPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **policyId** | **java.util.UUID**|  | |
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

<a id="updateItemShippingPolicyAsync"></a>
# **updateItemShippingPolicyAsync**
> updateItemShippingPolicyAsync(policyId, tenantId, apiVersion, xApiVersion, itemShippingPolicyUpdateDto)

Update an item shipping policy

Updates an existing item shipping policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val policyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemShippingPolicyUpdateDto : ItemShippingPolicyUpdateDto =  // ItemShippingPolicyUpdateDto | 
try {
    apiInstance.updateItemShippingPolicyAsync(policyId, tenantId, apiVersion, xApiVersion, itemShippingPolicyUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#updateItemShippingPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#updateItemShippingPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **policyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemShippingPolicyUpdateDto** | [**ItemShippingPolicyUpdateDto**](ItemShippingPolicyUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

