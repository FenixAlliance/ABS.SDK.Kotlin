# RefundPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createRefundPolicyAsync**](RefundPoliciesApi.md#createRefundPolicyAsync) | **POST** /api/v2/SupportService/RefundPolicies | Create a new refund policy |
| [**deleteRefundPolicyAsync**](RefundPoliciesApi.md#deleteRefundPolicyAsync) | **DELETE** /api/v2/SupportService/RefundPolicies/{refundPolicyId} | Delete a refund policy |
| [**getRefundPoliciesAsync**](RefundPoliciesApi.md#getRefundPoliciesAsync) | **GET** /api/v2/SupportService/RefundPolicies | Retrieve a list of refund policies |
| [**getRefundPoliciesCountAsync**](RefundPoliciesApi.md#getRefundPoliciesCountAsync) | **GET** /api/v2/SupportService/RefundPolicies/Count | Get the count of refund policies |
| [**getRefundPolicyAsync**](RefundPoliciesApi.md#getRefundPolicyAsync) | **GET** /api/v2/SupportService/RefundPolicies/{refundPolicyId} | Retrieve a refund policy by ID |
| [**updateRefundPolicyAsync**](RefundPoliciesApi.md#updateRefundPolicyAsync) | **PUT** /api/v2/SupportService/RefundPolicies/{refundPolicyId} | Update a refund policy |


<a id="createRefundPolicyAsync"></a>
# **createRefundPolicyAsync**
> EmptyEnvelope createRefundPolicyAsync(tenantId, apiVersion, xApiVersion, itemRefundPolicyCreateDto)

Create a new refund policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemRefundPolicyCreateDto : ItemRefundPolicyCreateDto =  // ItemRefundPolicyCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createRefundPolicyAsync(tenantId, apiVersion, xApiVersion, itemRefundPolicyCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundPoliciesApi#createRefundPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundPoliciesApi#createRefundPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemRefundPolicyCreateDto** | [**ItemRefundPolicyCreateDto**](ItemRefundPolicyCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteRefundPolicyAsync"></a>
# **deleteRefundPolicyAsync**
> EmptyEnvelope deleteRefundPolicyAsync(refundPolicyId, tenantId, apiVersion, xApiVersion)

Delete a refund policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundPoliciesApi()
val refundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteRefundPolicyAsync(refundPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundPoliciesApi#deleteRefundPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundPoliciesApi#deleteRefundPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **refundPolicyId** | **java.util.UUID**|  | |
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

<a id="getRefundPoliciesAsync"></a>
# **getRefundPoliciesAsync**
> ItemRefundPolicyDtoListEnvelope getRefundPoliciesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of refund policies

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRefundPolicyDtoListEnvelope = apiInstance.getRefundPoliciesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundPoliciesApi#getRefundPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundPoliciesApi#getRefundPoliciesAsync")
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

[**ItemRefundPolicyDtoListEnvelope**](ItemRefundPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRefundPoliciesCountAsync"></a>
# **getRefundPoliciesCountAsync**
> Int32Envelope getRefundPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of refund policies

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getRefundPoliciesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundPoliciesApi#getRefundPoliciesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundPoliciesApi#getRefundPoliciesCountAsync")
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

<a id="getRefundPolicyAsync"></a>
# **getRefundPolicyAsync**
> ItemRefundPolicyDtoEnvelope getRefundPolicyAsync(refundPolicyId, tenantId, apiVersion, xApiVersion)

Retrieve a refund policy by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundPoliciesApi()
val refundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRefundPolicyDtoEnvelope = apiInstance.getRefundPolicyAsync(refundPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundPoliciesApi#getRefundPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundPoliciesApi#getRefundPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **refundPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="updateRefundPolicyAsync"></a>
# **updateRefundPolicyAsync**
> EmptyEnvelope updateRefundPolicyAsync(refundPolicyId, tenantId, apiVersion, xApiVersion, itemRefundPolicyUpdateDto)

Update a refund policy

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RefundPoliciesApi()
val refundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemRefundPolicyUpdateDto : ItemRefundPolicyUpdateDto =  // ItemRefundPolicyUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateRefundPolicyAsync(refundPolicyId, tenantId, apiVersion, xApiVersion, itemRefundPolicyUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RefundPoliciesApi#updateRefundPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RefundPoliciesApi#updateRefundPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **refundPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemRefundPolicyUpdateDto** | [**ItemRefundPolicyUpdateDto**](ItemRefundPolicyUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

