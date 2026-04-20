# ItemWarrantyPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countItemWarrantyPoliciesAsync**](ItemWarrantyPoliciesApi.md#countItemWarrantyPoliciesAsync) | **GET** /api/v2/CatalogService/ItemWarrantyPolicies/Count | Count item warranty policies |
| [**getItemWarrantyPoliciesAsync**](ItemWarrantyPoliciesApi.md#getItemWarrantyPoliciesAsync) | **GET** /api/v2/CatalogService/ItemWarrantyPolicies | Get item warranty policies |
| [**getItemWarrantyPolicyByIdAsync**](ItemWarrantyPoliciesApi.md#getItemWarrantyPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemWarrantyPolicies/{itemWarrantyPolicyId} | Get item warranty policy by ID |
| [**relateItemToWarrantyPolicyAsync**](ItemWarrantyPoliciesApi.md#relateItemToWarrantyPolicyAsync) | **POST** /api/v2/CatalogService/ItemWarrantyPolicies | Relate item to warranty policy |
| [**removeWarrantyPolicyFromItemAsync**](ItemWarrantyPoliciesApi.md#removeWarrantyPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemWarrantyPolicies/{itemWarrantyPolicyId} | Remove warranty policy from item |


<a id="countItemWarrantyPoliciesAsync"></a>
# **countItemWarrantyPoliciesAsync**
> Int32Envelope countItemWarrantyPoliciesAsync(itemId, apiVersion, xApiVersion)

Count item warranty policies

Counts all warranty policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemWarrantyPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countItemWarrantyPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemWarrantyPoliciesApi#countItemWarrantyPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemWarrantyPoliciesApi#countItemWarrantyPoliciesAsync")
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

<a id="getItemWarrantyPoliciesAsync"></a>
# **getItemWarrantyPoliciesAsync**
> ItemWarrantyPolicyDtoListEnvelope getItemWarrantyPoliciesAsync(itemId, apiVersion, xApiVersion)

Get item warranty policies

Retrieves all warranty policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemWarrantyPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemWarrantyPolicyDtoListEnvelope = apiInstance.getItemWarrantyPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemWarrantyPoliciesApi#getItemWarrantyPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemWarrantyPoliciesApi#getItemWarrantyPoliciesAsync")
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

[**ItemWarrantyPolicyDtoListEnvelope**](ItemWarrantyPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemWarrantyPolicyByIdAsync"></a>
# **getItemWarrantyPolicyByIdAsync**
> ItemWarrantyPolicyDtoEnvelope getItemWarrantyPolicyByIdAsync(itemWarrantyPolicyId, itemId, apiVersion, xApiVersion)

Get item warranty policy by ID

Retrieves a specific warranty policy for an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemWarrantyPoliciesApi()
val itemWarrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemWarrantyPolicyDtoEnvelope = apiInstance.getItemWarrantyPolicyByIdAsync(itemWarrantyPolicyId, itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemWarrantyPoliciesApi#getItemWarrantyPolicyByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemWarrantyPoliciesApi#getItemWarrantyPolicyByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemWarrantyPolicyId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoEnvelope**](ItemWarrantyPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateItemToWarrantyPolicyAsync"></a>
# **relateItemToWarrantyPolicyAsync**
> relateItemToWarrantyPolicyAsync(tenantId, itemId, warrantyPolicyId, apiVersion, xApiVersion)

Relate item to warranty policy

Relates an item to an existing warranty policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemWarrantyPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val warrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.relateItemToWarrantyPolicyAsync(tenantId, itemId, warrantyPolicyId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemWarrantyPoliciesApi#relateItemToWarrantyPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemWarrantyPoliciesApi#relateItemToWarrantyPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | |
| **warrantyPolicyId** | **java.util.UUID**|  | |
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

<a id="removeWarrantyPolicyFromItemAsync"></a>
# **removeWarrantyPolicyFromItemAsync**
> removeWarrantyPolicyFromItemAsync(itemWarrantyPolicyId, tenantId, itemId, apiVersion, xApiVersion)

Remove warranty policy from item

Removes a warranty policy from an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemWarrantyPoliciesApi()
val itemWarrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.removeWarrantyPolicyFromItemAsync(itemWarrantyPolicyId, tenantId, itemId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemWarrantyPoliciesApi#removeWarrantyPolicyFromItemAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemWarrantyPoliciesApi#removeWarrantyPolicyFromItemAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemWarrantyPolicyId** | **java.util.UUID**|  | |
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

