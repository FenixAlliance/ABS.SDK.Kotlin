# ItemTaxPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countItemTaxPoliciesAsync**](ItemTaxPoliciesApi.md#countItemTaxPoliciesAsync) | **GET** /api/v2/CatalogService/ItemTaxPolicies/Count | Count item tax policies |
| [**getItemTaxPoliciesAsync**](ItemTaxPoliciesApi.md#getItemTaxPoliciesAsync) | **GET** /api/v2/CatalogService/ItemTaxPolicies | Get item tax policies |
| [**getItemTaxPolicyByIdAsync**](ItemTaxPoliciesApi.md#getItemTaxPolicyByIdAsync) | **GET** /api/v2/CatalogService/ItemTaxPolicies/{itemTaxPolicyId} | Get item tax policy by ID |
| [**relateItemToTaxPolicyAsync**](ItemTaxPoliciesApi.md#relateItemToTaxPolicyAsync) | **POST** /api/v2/CatalogService/ItemTaxPolicies | Relate item to tax policy |
| [**removeTaxPolicyFromItemAsync**](ItemTaxPoliciesApi.md#removeTaxPolicyFromItemAsync) | **DELETE** /api/v2/CatalogService/ItemTaxPolicies/{itemTaxPolicyId} | Remove tax policy from item |


<a id="countItemTaxPoliciesAsync"></a>
# **countItemTaxPoliciesAsync**
> Int32Envelope countItemTaxPoliciesAsync(itemId, apiVersion, xApiVersion)

Count item tax policies

Counts all tax policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTaxPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countItemTaxPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTaxPoliciesApi#countItemTaxPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTaxPoliciesApi#countItemTaxPoliciesAsync")
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

<a id="getItemTaxPoliciesAsync"></a>
# **getItemTaxPoliciesAsync**
> ItemTaxPolicyDtoListEnvelope getItemTaxPoliciesAsync(itemId, apiVersion, xApiVersion)

Get item tax policies

Retrieves all tax policies for a specific item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTaxPoliciesApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTaxPolicyDtoListEnvelope = apiInstance.getItemTaxPoliciesAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTaxPoliciesApi#getItemTaxPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTaxPoliciesApi#getItemTaxPoliciesAsync")
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

[**ItemTaxPolicyDtoListEnvelope**](ItemTaxPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemTaxPolicyByIdAsync"></a>
# **getItemTaxPolicyByIdAsync**
> ItemTaxPolicyDtoEnvelope getItemTaxPolicyByIdAsync(itemTaxPolicyId, itemId, apiVersion, xApiVersion)

Get item tax policy by ID

Retrieves a specific tax policy for an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTaxPoliciesApi()
val itemTaxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTaxPolicyDtoEnvelope = apiInstance.getItemTaxPolicyByIdAsync(itemTaxPolicyId, itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemTaxPoliciesApi#getItemTaxPolicyByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTaxPoliciesApi#getItemTaxPolicyByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemTaxPolicyId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoEnvelope**](ItemTaxPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateItemToTaxPolicyAsync"></a>
# **relateItemToTaxPolicyAsync**
> relateItemToTaxPolicyAsync(tenantId, itemId, taxPolicyId, apiVersion, xApiVersion)

Relate item to tax policy

Relates an item to an existing tax policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTaxPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val taxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.relateItemToTaxPolicyAsync(tenantId, itemId, taxPolicyId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemTaxPoliciesApi#relateItemToTaxPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTaxPoliciesApi#relateItemToTaxPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **itemId** | **java.util.UUID**|  | |
| **taxPolicyId** | **java.util.UUID**|  | |
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

<a id="removeTaxPolicyFromItemAsync"></a>
# **removeTaxPolicyFromItemAsync**
> removeTaxPolicyFromItemAsync(itemTaxPolicyId, tenantId, itemId, apiVersion, xApiVersion)

Remove tax policy from item

Removes a tax policy from an item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemTaxPoliciesApi()
val itemTaxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.removeTaxPolicyFromItemAsync(itemTaxPolicyId, tenantId, itemId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemTaxPoliciesApi#removeTaxPolicyFromItemAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemTaxPoliciesApi#removeTaxPolicyFromItemAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemTaxPolicyId** | **java.util.UUID**|  | |
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

