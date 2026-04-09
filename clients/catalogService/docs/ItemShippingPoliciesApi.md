# ItemShippingPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countItemShippingPoliciesAsync**](ItemShippingPoliciesApi.md#countItemShippingPoliciesAsync) | **GET** /api/v2/CatalogService/ItemShippingPolicies/Count | Count item shipping policies |
| [**getItemShippingPoliciesAsync**](ItemShippingPoliciesApi.md#getItemShippingPoliciesAsync) | **GET** /api/v2/CatalogService/ItemShippingPolicies | Get item shipping policies |
| [**getItemShippingPolicyByIdAsync**](ItemShippingPoliciesApi.md#getItemShippingPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemShippingPolicies/{itemShippingPolicyId} | Get item shipping policy by ID |
| [**relateItemToShippingPolicyAsync**](ItemShippingPoliciesApi.md#relateItemToShippingPolicyAsync) | **POST** /api/v2/CatalogService/ItemShippingPolicies | Relate item to shipping policy |
| [**removeShippingPolicyFromItemAsync**](ItemShippingPoliciesApi.md#removeShippingPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemShippingPolicies/{itemShippingPolicyId} | Remove shipping policy from item |


<a id="countItemShippingPoliciesAsync"></a>
# **countItemShippingPoliciesAsync**
> Int32Envelope countItemShippingPoliciesAsync(itemId, apiVersion, xApiVersion)

Count item shipping policies

Counts all shipping policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countItemShippingPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#countItemShippingPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#countItemShippingPoliciesAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | [optional] |
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

<a id="getItemShippingPoliciesAsync"></a>
# **getItemShippingPoliciesAsync**
> ItemShippingPolicyDtoListEnvelope getItemShippingPoliciesAsync(itemId, apiVersion, xApiVersion)

Get item shipping policies

Retrieves all shipping policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemShippingPolicyDtoListEnvelope = apiInstance.getItemShippingPoliciesAsync(itemId, apiVersion, xApiVersion)
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
| **itemId** | **java.util.UUID**|  | [optional] |
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

<a id="getItemShippingPolicyByIdAsync"></a>
# **getItemShippingPolicyByIdAsync**
> ItemShippingPolicyDtoEnvelope getItemShippingPolicyByIdAsync(itemShippingPolicyId, itemId, apiVersion, xApiVersion)

Get item shipping policy by ID

Retrieves a specific shipping policy for an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val itemShippingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemShippingPolicyDtoEnvelope = apiInstance.getItemShippingPolicyByIdAsync(itemShippingPolicyId, itemId, apiVersion, xApiVersion)
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
| **itemShippingPolicyId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | [optional] |
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

<a id="relateItemToShippingPolicyAsync"></a>
# **relateItemToShippingPolicyAsync**
> relateItemToShippingPolicyAsync(tenantId, itemId, shippingPolicyId, apiVersion, xApiVersion)

Relate item to shipping policy

Relates an item to an existing shipping policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val shippingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.relateItemToShippingPolicyAsync(tenantId, itemId, shippingPolicyId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#relateItemToShippingPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#relateItemToShippingPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | |
| **shippingPolicyId** | **java.util.UUID**|  | |
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

<a id="removeShippingPolicyFromItemAsync"></a>
# **removeShippingPolicyFromItemAsync**
> removeShippingPolicyFromItemAsync(itemShippingPolicyId, tenantId, itemId, apiVersion, xApiVersion)

Remove shipping policy from item

Removes a shipping policy from an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemShippingPoliciesApi()
val itemShippingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.removeShippingPolicyFromItemAsync(itemShippingPolicyId, tenantId, itemId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemShippingPoliciesApi#removeShippingPolicyFromItemAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemShippingPoliciesApi#removeShippingPolicyFromItemAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemShippingPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | |
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

