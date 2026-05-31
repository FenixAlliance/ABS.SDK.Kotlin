# SubscriptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSubscriptionAsync**](SubscriptionsApi.md#createSubscriptionAsync) | **POST** /api/v2/SubscriptionsService/Subscriptions | Create a subscription |
| [**deleteSubscriptionAsync**](SubscriptionsApi.md#deleteSubscriptionAsync) | **DELETE** /api/v2/SubscriptionsService/Subscriptions/{subscriptionId} | Delete a subscription |
| [**getSubscriptionByIdAsync**](SubscriptionsApi.md#getSubscriptionByIdAsync) | **GET** /api/v2/SubscriptionsService/Subscriptions/{subscriptionId} | Get a subscription by ID |
| [**getSubscriptionsAsync**](SubscriptionsApi.md#getSubscriptionsAsync) | **GET** /api/v2/SubscriptionsService/Subscriptions | Get all subscriptions |
| [**getSubscriptionsCountAsync**](SubscriptionsApi.md#getSubscriptionsCountAsync) | **GET** /api/v2/SubscriptionsService/Subscriptions/Count | Get subscriptions count |
| [**updateSubscriptionAsync**](SubscriptionsApi.md#updateSubscriptionAsync) | **PUT** /api/v2/SubscriptionsService/Subscriptions/{subscriptionId} | Update a subscription |


<a id="createSubscriptionAsync"></a>
# **createSubscriptionAsync**
> Envelope createSubscriptionAsync(tenantId, apiVersion, xApiVersion, subscriptionCreateDto)

Create a subscription

Creates a new subscription for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val subscriptionCreateDto : SubscriptionCreateDto =  // SubscriptionCreateDto | 
try {
    val result : Envelope = apiInstance.createSubscriptionAsync(tenantId, apiVersion, xApiVersion, subscriptionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#createSubscriptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#createSubscriptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subscriptionCreateDto** | [**SubscriptionCreateDto**](SubscriptionCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSubscriptionAsync"></a>
# **deleteSubscriptionAsync**
> Envelope deleteSubscriptionAsync(subscriptionId, tenantId, apiVersion, xApiVersion)

Delete a subscription

Deletes a subscription by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionsApi()
val subscriptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteSubscriptionAsync(subscriptionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#deleteSubscriptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#deleteSubscriptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **subscriptionId** | **java.util.UUID**|  | |
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

<a id="getSubscriptionByIdAsync"></a>
# **getSubscriptionByIdAsync**
> SubscriptionDtoEnvelope getSubscriptionByIdAsync(subscriptionId, tenantId, apiVersion, xApiVersion)

Get a subscription by ID

Retrieves a subscription by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionsApi()
val subscriptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SubscriptionDtoEnvelope = apiInstance.getSubscriptionByIdAsync(subscriptionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#getSubscriptionByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#getSubscriptionByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **subscriptionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SubscriptionDtoEnvelope**](SubscriptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSubscriptionsAsync"></a>
# **getSubscriptionsAsync**
> SubscriptionDtoIReadOnlyListEnvelope getSubscriptionsAsync(tenantId, apiVersion, xApiVersion)

Get all subscriptions

Retrieves all subscriptions for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SubscriptionDtoIReadOnlyListEnvelope = apiInstance.getSubscriptionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#getSubscriptionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#getSubscriptionsAsync")
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

[**SubscriptionDtoIReadOnlyListEnvelope**](SubscriptionDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSubscriptionsCountAsync"></a>
# **getSubscriptionsCountAsync**
> Int32Envelope getSubscriptionsCountAsync(tenantId, apiVersion, xApiVersion)

Get subscriptions count

Returns the count of subscriptions for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSubscriptionsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#getSubscriptionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#getSubscriptionsCountAsync")
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

<a id="updateSubscriptionAsync"></a>
# **updateSubscriptionAsync**
> Envelope updateSubscriptionAsync(subscriptionId, tenantId, apiVersion, xApiVersion, subscriptionUpdateDto)

Update a subscription

Updates an existing subscription.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SubscriptionsApi()
val subscriptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val subscriptionUpdateDto : SubscriptionUpdateDto =  // SubscriptionUpdateDto | 
try {
    val result : Envelope = apiInstance.updateSubscriptionAsync(subscriptionId, tenantId, apiVersion, xApiVersion, subscriptionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SubscriptionsApi#updateSubscriptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SubscriptionsApi#updateSubscriptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **subscriptionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **subscriptionUpdateDto** | [**SubscriptionUpdateDto**](SubscriptionUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

