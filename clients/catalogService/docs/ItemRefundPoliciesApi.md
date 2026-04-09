# ItemRefundPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countItemRefundPoliciesAsync**](ItemRefundPoliciesApi.md#countItemRefundPoliciesAsync) | **GET** /api/v2/CatalogService/ItemRefundPolicies/Count | Count item refund policies |
| [**getItemRefundPoliciesAsync**](ItemRefundPoliciesApi.md#getItemRefundPoliciesAsync) | **GET** /api/v2/CatalogService/ItemRefundPolicies | Get item refund policies |
| [**getItemRefundPolicyByIdAsync**](ItemRefundPoliciesApi.md#getItemRefundPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemRefundPolicies/{itemRefundPolicyId} | Get item refund policy by ID |
| [**relateItemToRefundPolicyAsync**](ItemRefundPoliciesApi.md#relateItemToRefundPolicyAsync) | **POST** /api/v2/CatalogService/ItemRefundPolicies | Relate item to refund policy |
| [**removeRefundPolicyFromItemAsync**](ItemRefundPoliciesApi.md#removeRefundPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemRefundPolicies/{itemRefundPolicyId} | Remove refund policy from item |


<a id="countItemRefundPoliciesAsync"></a>
# **countItemRefundPoliciesAsync**
> Int32Envelope countItemRefundPoliciesAsync(itemId, apiVersion, xApiVersion)

Count item refund policies

Counts all refund policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRefundPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countItemRefundPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRefundPoliciesApi#countItemRefundPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRefundPoliciesApi#countItemRefundPoliciesAsync")
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

<a id="getItemRefundPoliciesAsync"></a>
# **getItemRefundPoliciesAsync**
> ItemRefundPolicyDtoListEnvelope getItemRefundPoliciesAsync(itemId, apiVersion, xApiVersion)

Get item refund policies

Retrieves all refund policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRefundPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRefundPolicyDtoListEnvelope = apiInstance.getItemRefundPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRefundPoliciesApi#getItemRefundPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRefundPoliciesApi#getItemRefundPoliciesAsync")
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

[**ItemRefundPolicyDtoListEnvelope**](ItemRefundPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemRefundPolicyByIdAsync"></a>
# **getItemRefundPolicyByIdAsync**
> ItemRefundPolicyDtoEnvelope getItemRefundPolicyByIdAsync(itemRefundPolicyId, itemId, apiVersion, xApiVersion)

Get item refund policy by ID

Retrieves a specific refund policy for an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRefundPoliciesApi()
val itemRefundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRefundPolicyDtoEnvelope = apiInstance.getItemRefundPolicyByIdAsync(itemRefundPolicyId, itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemRefundPoliciesApi#getItemRefundPolicyByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRefundPoliciesApi#getItemRefundPolicyByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemRefundPolicyId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoEnvelope**](ItemRefundPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateItemToRefundPolicyAsync"></a>
# **relateItemToRefundPolicyAsync**
> relateItemToRefundPolicyAsync(tenantId, itemId, refundPolicyId, apiVersion, xApiVersion)

Relate item to refund policy

Relates an item to an existing refund policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRefundPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val refundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.relateItemToRefundPolicyAsync(tenantId, itemId, refundPolicyId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemRefundPoliciesApi#relateItemToRefundPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRefundPoliciesApi#relateItemToRefundPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | |
| **refundPolicyId** | **java.util.UUID**|  | |
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

<a id="removeRefundPolicyFromItemAsync"></a>
# **removeRefundPolicyFromItemAsync**
> removeRefundPolicyFromItemAsync(itemRefundPolicyId, tenantId, itemId, apiVersion, xApiVersion)

Remove refund policy from item

Removes a refund policy from an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemRefundPoliciesApi()
val itemRefundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.removeRefundPolicyFromItemAsync(itemRefundPolicyId, tenantId, itemId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemRefundPoliciesApi#removeRefundPolicyFromItemAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemRefundPoliciesApi#removeRefundPolicyFromItemAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemRefundPolicyId** | **java.util.UUID**|  | |
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

