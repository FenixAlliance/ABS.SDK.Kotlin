# SubscriptionPlansApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSubscriptionPlanAsync**](SubscriptionPlansApi.md#createSubscriptionPlanAsync) | **POST** /api/v2/SubscriptionsService/SubscriptionPlans | Create a subscription plan |
| [**deleteSubscriptionPlanAsync**](SubscriptionPlansApi.md#deleteSubscriptionPlanAsync) | **DELETE** /api/v2/SubscriptionsService/SubscriptionPlans/{planId} | Delete a subscription plan |
| [**getSubscriptionPlanByIdAsync**](SubscriptionPlansApi.md#getSubscriptionPlanByIdAsync) | **GET** /api/v2/SubscriptionsService/SubscriptionPlans/{planId} | Get a subscription plan by ID |
| [**getSubscriptionPlansAsync**](SubscriptionPlansApi.md#getSubscriptionPlansAsync) | **GET** /api/v2/SubscriptionsService/SubscriptionPlans | Get all subscription plans |
| [**getSubscriptionPlansCountAsync**](SubscriptionPlansApi.md#getSubscriptionPlansCountAsync) | **GET** /api/v2/SubscriptionsService/SubscriptionPlans/Count | Get subscription plans count |
| [**updateSubscriptionPlanAsync**](SubscriptionPlansApi.md#updateSubscriptionPlanAsync) | **PUT** /api/v2/SubscriptionsService/SubscriptionPlans/{planId} | Update a subscription plan |


<a id="createSubscriptionPlanAsync"></a>
# **createSubscriptionPlanAsync**
> Envelope createSubscriptionPlanAsync(tenantId, apiVersion, xApiVersion, subscriptionPlanCreateDto)

Create a subscription plan

Creates a new subscription plan for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionPlansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val subscriptionPlanCreateDto : SubscriptionPlanCreateDto =  // SubscriptionPlanCreateDto | 
try {
    val result : Envelope = apiInstance.createSubscriptionPlanAsync(tenantId, apiVersion, xApiVersion, subscriptionPlanCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionPlansApi#createSubscriptionPlanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionPlansApi#createSubscriptionPlanAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subscriptionPlanCreateDto** | [**SubscriptionPlanCreateDto**](SubscriptionPlanCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSubscriptionPlanAsync"></a>
# **deleteSubscriptionPlanAsync**
> Envelope deleteSubscriptionPlanAsync(planId, tenantId, apiVersion, xApiVersion)

Delete a subscription plan

Deletes a subscription plan by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionPlansApi()
val planId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteSubscriptionPlanAsync(planId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionPlansApi#deleteSubscriptionPlanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionPlansApi#deleteSubscriptionPlanAsync")
    e.printStackTrace()
}
```

### Parameters
| **planId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSubscriptionPlanByIdAsync"></a>
# **getSubscriptionPlanByIdAsync**
> SubscriptionPlanDtoEnvelope getSubscriptionPlanByIdAsync(planId, tenantId, apiVersion, xApiVersion)

Get a subscription plan by ID

Retrieves a subscription plan by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionPlansApi()
val planId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SubscriptionPlanDtoEnvelope = apiInstance.getSubscriptionPlanByIdAsync(planId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionPlansApi#getSubscriptionPlanByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionPlansApi#getSubscriptionPlanByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **planId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SubscriptionPlanDtoEnvelope**](SubscriptionPlanDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSubscriptionPlansAsync"></a>
# **getSubscriptionPlansAsync**
> SubscriptionPlanDtoIReadOnlyListEnvelope getSubscriptionPlansAsync(tenantId, apiVersion, xApiVersion)

Get all subscription plans

Retrieves all subscription plans for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionPlansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SubscriptionPlanDtoIReadOnlyListEnvelope = apiInstance.getSubscriptionPlansAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionPlansApi#getSubscriptionPlansAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionPlansApi#getSubscriptionPlansAsync")
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

[**SubscriptionPlanDtoIReadOnlyListEnvelope**](SubscriptionPlanDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSubscriptionPlansCountAsync"></a>
# **getSubscriptionPlansCountAsync**
> Int32Envelope getSubscriptionPlansCountAsync(tenantId, apiVersion, xApiVersion)

Get subscription plans count

Returns the count of subscription plans for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionPlansApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSubscriptionPlansCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionPlansApi#getSubscriptionPlansCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionPlansApi#getSubscriptionPlansCountAsync")
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

<a id="updateSubscriptionPlanAsync"></a>
# **updateSubscriptionPlanAsync**
> Envelope updateSubscriptionPlanAsync(planId, tenantId, apiVersion, xApiVersion, subscriptionPlanUpdateDto)

Update a subscription plan

Updates an existing subscription plan.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionPlansApi()
val planId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val subscriptionPlanUpdateDto : SubscriptionPlanUpdateDto =  // SubscriptionPlanUpdateDto | 
try {
    val result : Envelope = apiInstance.updateSubscriptionPlanAsync(planId, tenantId, apiVersion, xApiVersion, subscriptionPlanUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionPlansApi#updateSubscriptionPlanAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionPlansApi#updateSubscriptionPlanAsync")
    e.printStackTrace()
}
```

### Parameters
| **planId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subscriptionPlanUpdateDto** | [**SubscriptionPlanUpdateDto**](SubscriptionPlanUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

