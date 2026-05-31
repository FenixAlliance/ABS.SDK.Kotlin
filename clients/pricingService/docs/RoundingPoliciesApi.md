# RoundingPoliciesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createRoundingPolicyAsync**](RoundingPoliciesApi.md#createRoundingPolicyAsync) | **POST** /api/v2/PricingService/RoundingPolicies | Creates a rounding policy |
| [**deleteRoundingPolicyAsync**](RoundingPoliciesApi.md#deleteRoundingPolicyAsync) | **DELETE** /api/v2/PricingService/RoundingPolicies/{roundingPolicyId} | Deletes a rounding policy |
| [**getRoundingPoliciesAsync**](RoundingPoliciesApi.md#getRoundingPoliciesAsync) | **GET** /api/v2/PricingService/RoundingPolicies | Gets all rounding policies |
| [**getRoundingPoliciesCountAsync**](RoundingPoliciesApi.md#getRoundingPoliciesCountAsync) | **GET** /api/v2/PricingService/RoundingPolicies/Count | Counts rounding policies |
| [**getRoundingPolicyByIdAsync**](RoundingPoliciesApi.md#getRoundingPolicyByIdAsync) | **GET** /api/v2/PricingService/RoundingPolicies/{roundingPolicyId} | Gets a rounding policy by ID |
| [**updateRoundingPolicyAsync**](RoundingPoliciesApi.md#updateRoundingPolicyAsync) | **PUT** /api/v2/PricingService/RoundingPolicies/{roundingPolicyId} | Updates a rounding policy |


<a id="createRoundingPolicyAsync"></a>
# **createRoundingPolicyAsync**
> EmptyEnvelope createRoundingPolicyAsync(tenantId, roundingPolicyCreateDto, apiVersion, xApiVersion)

Creates a rounding policy

Creates a new rounding policy for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoundingPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val roundingPolicyCreateDto : RoundingPolicyCreateDto =  // RoundingPolicyCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createRoundingPolicyAsync(tenantId, roundingPolicyCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoundingPoliciesApi#createRoundingPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoundingPoliciesApi#createRoundingPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **roundingPolicyCreateDto** | [**RoundingPolicyCreateDto**](RoundingPolicyCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteRoundingPolicyAsync"></a>
# **deleteRoundingPolicyAsync**
> EmptyEnvelope deleteRoundingPolicyAsync(roundingPolicyId, tenantId, apiVersion, xApiVersion)

Deletes a rounding policy

Deletes the specified rounding policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoundingPoliciesApi()
val roundingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteRoundingPolicyAsync(roundingPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoundingPoliciesApi#deleteRoundingPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoundingPoliciesApi#deleteRoundingPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **roundingPolicyId** | **java.util.UUID**|  | |
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

<a id="getRoundingPoliciesAsync"></a>
# **getRoundingPoliciesAsync**
> RoundingPolicyDtoListEnvelope getRoundingPoliciesAsync(tenantId, apiVersion, xApiVersion)

Gets all rounding policies

Retrieves all rounding policies for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoundingPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : RoundingPolicyDtoListEnvelope = apiInstance.getRoundingPoliciesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoundingPoliciesApi#getRoundingPoliciesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoundingPoliciesApi#getRoundingPoliciesAsync")
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

[**RoundingPolicyDtoListEnvelope**](RoundingPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRoundingPoliciesCountAsync"></a>
# **getRoundingPoliciesCountAsync**
> Int32Envelope getRoundingPoliciesCountAsync(tenantId, apiVersion, xApiVersion)

Counts rounding policies

Gets the count of rounding policies for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoundingPoliciesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getRoundingPoliciesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoundingPoliciesApi#getRoundingPoliciesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoundingPoliciesApi#getRoundingPoliciesCountAsync")
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

<a id="getRoundingPolicyByIdAsync"></a>
# **getRoundingPolicyByIdAsync**
> RoundingPolicyDtoEnvelope getRoundingPolicyByIdAsync(roundingPolicyId, tenantId, apiVersion, xApiVersion)

Gets a rounding policy by ID

Retrieves the details of a rounding policy using its unique ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoundingPoliciesApi()
val roundingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : RoundingPolicyDtoEnvelope = apiInstance.getRoundingPolicyByIdAsync(roundingPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoundingPoliciesApi#getRoundingPolicyByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoundingPoliciesApi#getRoundingPolicyByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **roundingPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**RoundingPolicyDtoEnvelope**](RoundingPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateRoundingPolicyAsync"></a>
# **updateRoundingPolicyAsync**
> EmptyEnvelope updateRoundingPolicyAsync(roundingPolicyId, tenantId, roundingPolicyUpdateDto, apiVersion, xApiVersion)

Updates a rounding policy

Updates the specified rounding policy.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RoundingPoliciesApi()
val roundingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val roundingPolicyUpdateDto : RoundingPolicyUpdateDto =  // RoundingPolicyUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateRoundingPolicyAsync(roundingPolicyId, tenantId, roundingPolicyUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RoundingPoliciesApi#updateRoundingPolicyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RoundingPoliciesApi#updateRoundingPolicyAsync")
    e.printStackTrace()
}
```

### Parameters
| **roundingPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **roundingPolicyUpdateDto** | [**RoundingPolicyUpdateDto**](RoundingPolicyUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

