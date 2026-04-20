# ItemReturnPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countItemReturnPoliciesAsync**](ItemReturnPoliciesApi.md#countItemReturnPoliciesAsync) | **GET** /api/v2/CatalogService/ItemReturnPolicies/Count | Count item return policies |
| [**getItemReturnPoliciesAsync**](ItemReturnPoliciesApi.md#getItemReturnPoliciesAsync) | **GET** /api/v2/CatalogService/ItemReturnPolicies | Get item return policies |
| [**getItemReturnPolicyByIdAsync**](ItemReturnPoliciesApi.md#getItemReturnPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemReturnPolicies/{itemReturnPolicyId} | Get item return policy by ID |
| [**relateItemToReturnPolicyAsync**](ItemReturnPoliciesApi.md#relateItemToReturnPolicyAsync) | **POST** /api/v2/CatalogService/ItemReturnPolicies | Relate item to return policy |
| [**removeReturnPolicyFromItemAsync**](ItemReturnPoliciesApi.md#removeReturnPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemReturnPolicies/{itemReturnPolicyId} | Remove return policy from item |


<a id="countItemReturnPoliciesAsync"></a>
# **countItemReturnPoliciesAsync**
> Int32Envelope countItemReturnPoliciesAsync(itemId, apiVersion, xApiVersion)

Count item return policies

Counts all return policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReturnPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countItemReturnPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemReturnPoliciesApi#countItemReturnPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReturnPoliciesApi#countItemReturnPoliciesAsync")
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

<a id="getItemReturnPoliciesAsync"></a>
# **getItemReturnPoliciesAsync**
> ItemReturnPolicyDtoListEnvelope getItemReturnPoliciesAsync(itemId, apiVersion, xApiVersion)

Get item return policies

Retrieves all return policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReturnPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReturnPolicyDtoListEnvelope = apiInstance.getItemReturnPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemReturnPoliciesApi#getItemReturnPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReturnPoliciesApi#getItemReturnPoliciesAsync")
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

[**ItemReturnPolicyDtoListEnvelope**](ItemReturnPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemReturnPolicyByIdAsync"></a>
# **getItemReturnPolicyByIdAsync**
> ItemReturnPolicyDtoEnvelope getItemReturnPolicyByIdAsync(itemReturnPolicyId, itemId, apiVersion, xApiVersion)

Get item return policy by ID

Retrieves a specific return policy for an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReturnPoliciesApi()
val itemReturnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReturnPolicyDtoEnvelope = apiInstance.getItemReturnPolicyByIdAsync(itemReturnPolicyId, itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemReturnPoliciesApi#getItemReturnPolicyByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReturnPoliciesApi#getItemReturnPolicyByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemReturnPolicyId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | [optional] |
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

<a id="relateItemToReturnPolicyAsync"></a>
# **relateItemToReturnPolicyAsync**
> relateItemToReturnPolicyAsync(tenantId, itemId, returnPolicyId, apiVersion, xApiVersion)

Relate item to return policy

Relates an item to an existing return policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReturnPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val returnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.relateItemToReturnPolicyAsync(tenantId, itemId, returnPolicyId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemReturnPoliciesApi#relateItemToReturnPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReturnPoliciesApi#relateItemToReturnPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | |
| **returnPolicyId** | **java.util.UUID**|  | |
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

<a id="removeReturnPolicyFromItemAsync"></a>
# **removeReturnPolicyFromItemAsync**
> removeReturnPolicyFromItemAsync(itemReturnPolicyId, tenantId, itemId, apiVersion, xApiVersion)

Remove return policy from item

Removes a return policy from an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReturnPoliciesApi()
val itemReturnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.removeReturnPolicyFromItemAsync(itemReturnPolicyId, tenantId, itemId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemReturnPoliciesApi#removeReturnPolicyFromItemAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReturnPoliciesApi#removeReturnPolicyFromItemAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemReturnPolicyId** | **java.util.UUID**|  | |
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

