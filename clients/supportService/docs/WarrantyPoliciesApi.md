# WarrantyPoliciesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWarrantyPolicyAsync**](WarrantyPoliciesApi.md#createWarrantyPolicyAsync) | **POST** /api/v2/SupportService/WarrantyPolicies | Create a new warranty policy |
| [**deleteWarrantyPolicyAsync**](WarrantyPoliciesApi.md#deleteWarrantyPolicyAsync) | **DELETE** /api/v2/SupportService/WarrantyPolicies/{warrantyPolicyId} | Delete a warranty policy |
| [**getWarrantyPoliciesAsync**](WarrantyPoliciesApi.md#getWarrantyPoliciesAsync) | **GET** /api/v2/SupportService/WarrantyPolicies | Retrieve a list of warranty policies |
| [**getWarrantyPoliciesCountAsync**](WarrantyPoliciesApi.md#getWarrantyPoliciesCountAsync) | **GET** /api/v2/SupportService/WarrantyPolicies/Count | Get the count of warranty policies |
| [**getWarrantyPolicyAsync**](WarrantyPoliciesApi.md#getWarrantyPolicyAsync) | **GET** /api/v2/SupportService/WarrantyPolicies/{warrantyPolicyId} | Retrieve a warranty policy by ID |
| [**patchWarrantyPolicyAsync**](WarrantyPoliciesApi.md#patchWarrantyPolicyAsync) | **PATCH** /api/v2/SupportService/WarrantyPolicies/{warrantyPolicyId} | Patch a warranty policy |
| [**updateWarrantyPolicyAsync**](WarrantyPoliciesApi.md#updateWarrantyPolicyAsync) | **PUT** /api/v2/SupportService/WarrantyPolicies/{warrantyPolicyId} | Update a warranty policy |


<a id="createWarrantyPolicyAsync"></a>
# **createWarrantyPolicyAsync**
> EmptyEnvelope createWarrantyPolicyAsync(tenantId, apiVersion, xApiVersion, itemWarrantyPolicyCreateDto)

Create a new warranty policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemWarrantyPolicyCreateDto : ItemWarrantyPolicyCreateDto =  // ItemWarrantyPolicyCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWarrantyPolicyAsync(tenantId, apiVersion, xApiVersion, itemWarrantyPolicyCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyPoliciesApi#createWarrantyPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyPoliciesApi#createWarrantyPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemWarrantyPolicyCreateDto** | [**ItemWarrantyPolicyCreateDto**](ItemWarrantyPolicyCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWarrantyPolicyAsync"></a>
# **deleteWarrantyPolicyAsync**
> EmptyEnvelope deleteWarrantyPolicyAsync(warrantyPolicyId, tenantId, apiVersion, xApiVersion)

Delete a warranty policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyPoliciesApi()
val warrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWarrantyPolicyAsync(warrantyPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyPoliciesApi#deleteWarrantyPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyPoliciesApi#deleteWarrantyPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **warrantyPolicyId** | **java.util.UUID**|  | |
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

<a id="getWarrantyPoliciesAsync"></a>
# **getWarrantyPoliciesAsync**
> ItemWarrantyPolicyDtoListEnvelope getWarrantyPoliciesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of warranty policies

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemWarrantyPolicyDtoListEnvelope = apiInstance.getWarrantyPoliciesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyPoliciesApi#getWarrantyPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyPoliciesApi#getWarrantyPoliciesAsync")
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

[**ItemWarrantyPolicyDtoListEnvelope**](ItemWarrantyPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWarrantyPoliciesCountAsync"></a>
# **getWarrantyPoliciesCountAsync**
> Int32Envelope getWarrantyPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of warranty policies

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWarrantyPoliciesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyPoliciesApi#getWarrantyPoliciesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyPoliciesApi#getWarrantyPoliciesCountAsync")
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

<a id="getWarrantyPolicyAsync"></a>
# **getWarrantyPolicyAsync**
> ItemWarrantyPolicyDtoEnvelope getWarrantyPolicyAsync(warrantyPolicyId, tenantId, apiVersion, xApiVersion)

Retrieve a warranty policy by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyPoliciesApi()
val warrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemWarrantyPolicyDtoEnvelope = apiInstance.getWarrantyPolicyAsync(warrantyPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyPoliciesApi#getWarrantyPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyPoliciesApi#getWarrantyPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **warrantyPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="patchWarrantyPolicyAsync"></a>
# **patchWarrantyPolicyAsync**
> EmptyEnvelope patchWarrantyPolicyAsync(warrantyPolicyId, tenantId, apiVersion, xApiVersion, operation)

Patch a warranty policy

Partially updates an existing warranty policy by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyPoliciesApi()
val warrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWarrantyPolicyAsync(warrantyPolicyId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyPoliciesApi#patchWarrantyPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyPoliciesApi#patchWarrantyPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **warrantyPolicyId** | **java.util.UUID**|  | |
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

<a id="updateWarrantyPolicyAsync"></a>
# **updateWarrantyPolicyAsync**
> EmptyEnvelope updateWarrantyPolicyAsync(warrantyPolicyId, tenantId, apiVersion, xApiVersion, itemWarrantyPolicyUpdateDto)

Update a warranty policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarrantyPoliciesApi()
val warrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemWarrantyPolicyUpdateDto : ItemWarrantyPolicyUpdateDto =  // ItemWarrantyPolicyUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWarrantyPolicyAsync(warrantyPolicyId, tenantId, apiVersion, xApiVersion, itemWarrantyPolicyUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarrantyPoliciesApi#updateWarrantyPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarrantyPoliciesApi#updateWarrantyPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **warrantyPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemWarrantyPolicyUpdateDto** | [**ItemWarrantyPolicyUpdateDto**](ItemWarrantyPolicyUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

