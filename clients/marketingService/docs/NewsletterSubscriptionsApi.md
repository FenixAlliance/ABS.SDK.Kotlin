# NewsletterSubscriptionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createNewsletterSubscriptionAsync**](NewsletterSubscriptionsApi.md#createNewsletterSubscriptionAsync) | **POST** /api/v2/MarketingService/NewsletterSubscriptions | Create a newsletter subscription |
| [**deleteNewsletterSubscriptionAsync**](NewsletterSubscriptionsApi.md#deleteNewsletterSubscriptionAsync) | **DELETE** /api/v2/MarketingService/NewsletterSubscriptions/{newsletterSubscriptionId} | Delete a newsletter subscription |
| [**getNewsletterSubscriptionByIdAsync**](NewsletterSubscriptionsApi.md#getNewsletterSubscriptionByIdAsync) | **GET** /api/v2/MarketingService/NewsletterSubscriptions/{newsletterSubscriptionId} | Get newsletter subscription by ID |
| [**getNewsletterSubscriptionsAsync**](NewsletterSubscriptionsApi.md#getNewsletterSubscriptionsAsync) | **GET** /api/v2/MarketingService/NewsletterSubscriptions | Get newsletter subscriptions |
| [**getNewsletterSubscriptionsCountAsync**](NewsletterSubscriptionsApi.md#getNewsletterSubscriptionsCountAsync) | **GET** /api/v2/MarketingService/NewsletterSubscriptions/Count | Get newsletter subscriptions count |
| [**updateNewsletterSubscriptionAsync**](NewsletterSubscriptionsApi.md#updateNewsletterSubscriptionAsync) | **PUT** /api/v2/MarketingService/NewsletterSubscriptions/{newsletterSubscriptionId} | Update a newsletter subscription |


<a id="createNewsletterSubscriptionAsync"></a>
# **createNewsletterSubscriptionAsync**
> EmptyEnvelope createNewsletterSubscriptionAsync(tenantId, newsletterSubscriptionCreateDto, apiVersion, xApiVersion)

Create a newsletter subscription

Creates a new newsletter subscription for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewsletterSubscriptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val newsletterSubscriptionCreateDto : NewsletterSubscriptionCreateDto =  // NewsletterSubscriptionCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createNewsletterSubscriptionAsync(tenantId, newsletterSubscriptionCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewsletterSubscriptionsApi#createNewsletterSubscriptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewsletterSubscriptionsApi#createNewsletterSubscriptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **newsletterSubscriptionCreateDto** | [**NewsletterSubscriptionCreateDto**](NewsletterSubscriptionCreateDto.md)|  | |
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

<a id="deleteNewsletterSubscriptionAsync"></a>
# **deleteNewsletterSubscriptionAsync**
> EmptyEnvelope deleteNewsletterSubscriptionAsync(newsletterSubscriptionId, tenantId, apiVersion, xApiVersion)

Delete a newsletter subscription

Deletes a newsletter subscription by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewsletterSubscriptionsApi()
val newsletterSubscriptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteNewsletterSubscriptionAsync(newsletterSubscriptionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewsletterSubscriptionsApi#deleteNewsletterSubscriptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewsletterSubscriptionsApi#deleteNewsletterSubscriptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **newsletterSubscriptionId** | **java.util.UUID**|  | |
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

<a id="getNewsletterSubscriptionByIdAsync"></a>
# **getNewsletterSubscriptionByIdAsync**
> NewsletterSubscriptionDtoEnvelope getNewsletterSubscriptionByIdAsync(newsletterSubscriptionId, tenantId, apiVersion, xApiVersion)

Get newsletter subscription by ID

Retrieves the details of a specific newsletter subscription by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewsletterSubscriptionsApi()
val newsletterSubscriptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NewsletterSubscriptionDtoEnvelope = apiInstance.getNewsletterSubscriptionByIdAsync(newsletterSubscriptionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewsletterSubscriptionsApi#getNewsletterSubscriptionByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewsletterSubscriptionsApi#getNewsletterSubscriptionByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **newsletterSubscriptionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**NewsletterSubscriptionDtoEnvelope**](NewsletterSubscriptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNewsletterSubscriptionsAsync"></a>
# **getNewsletterSubscriptionsAsync**
> NewsletterSubscriptionDtoListEnvelope getNewsletterSubscriptionsAsync(tenantId, apiVersion, xApiVersion, newsletterSubscriptionDtoCollectionQueryParameters)

Get newsletter subscriptions

Retrieves a collection of newsletter subscriptions for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewsletterSubscriptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val newsletterSubscriptionDtoCollectionQueryParameters : NewsletterSubscriptionDtoCollectionQueryParameters =  // NewsletterSubscriptionDtoCollectionQueryParameters | 
try {
    val result : NewsletterSubscriptionDtoListEnvelope = apiInstance.getNewsletterSubscriptionsAsync(tenantId, apiVersion, xApiVersion, newsletterSubscriptionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewsletterSubscriptionsApi#getNewsletterSubscriptionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewsletterSubscriptionsApi#getNewsletterSubscriptionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **newsletterSubscriptionDtoCollectionQueryParameters** | [**NewsletterSubscriptionDtoCollectionQueryParameters**](NewsletterSubscriptionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**NewsletterSubscriptionDtoListEnvelope**](NewsletterSubscriptionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getNewsletterSubscriptionsCountAsync"></a>
# **getNewsletterSubscriptionsCountAsync**
> Int32Envelope getNewsletterSubscriptionsCountAsync(tenantId, apiVersion, xApiVersion, newsletterSubscriptionDtoCollectionQueryParameters)

Get newsletter subscriptions count

Returns the count of newsletter subscriptions for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewsletterSubscriptionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val newsletterSubscriptionDtoCollectionQueryParameters : NewsletterSubscriptionDtoCollectionQueryParameters =  // NewsletterSubscriptionDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getNewsletterSubscriptionsCountAsync(tenantId, apiVersion, xApiVersion, newsletterSubscriptionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewsletterSubscriptionsApi#getNewsletterSubscriptionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewsletterSubscriptionsApi#getNewsletterSubscriptionsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **newsletterSubscriptionDtoCollectionQueryParameters** | [**NewsletterSubscriptionDtoCollectionQueryParameters**](NewsletterSubscriptionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateNewsletterSubscriptionAsync"></a>
# **updateNewsletterSubscriptionAsync**
> EmptyEnvelope updateNewsletterSubscriptionAsync(newsletterSubscriptionId, tenantId, newsletterSubscriptionUpdateDto, apiVersion, xApiVersion)

Update a newsletter subscription

Updates an existing newsletter subscription by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewsletterSubscriptionsApi()
val newsletterSubscriptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val newsletterSubscriptionUpdateDto : NewsletterSubscriptionUpdateDto =  // NewsletterSubscriptionUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateNewsletterSubscriptionAsync(newsletterSubscriptionId, tenantId, newsletterSubscriptionUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewsletterSubscriptionsApi#updateNewsletterSubscriptionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewsletterSubscriptionsApi#updateNewsletterSubscriptionAsync")
    e.printStackTrace()
}
```

### Parameters
| **newsletterSubscriptionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **newsletterSubscriptionUpdateDto** | [**NewsletterSubscriptionUpdateDto**](NewsletterSubscriptionUpdateDto.md)|  | |
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

