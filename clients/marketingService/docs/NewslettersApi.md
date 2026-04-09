# NewslettersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createNewsletterAsync**](NewslettersApi.md#createNewsletterAsync) | **POST** /api/v2/MarketingService/Newsletters | Create a newsletter |
| [**deleteNewsletterAsync**](NewslettersApi.md#deleteNewsletterAsync) | **DELETE** /api/v2/MarketingService/Newsletters/{newsletterId} | Delete a newsletter |
| [**getNewsletterDetailsAsync**](NewslettersApi.md#getNewsletterDetailsAsync) | **GET** /api/v2/MarketingService/Newsletters/{newsletterId} | Get newsletter by ID |
| [**getNewsletterODataAsync**](NewslettersApi.md#getNewsletterODataAsync) | **GET** /api/v2/MarketingService/Newsletters | Get newsletters |
| [**getNewslettersCountAsync**](NewslettersApi.md#getNewslettersCountAsync) | **GET** /api/v2/MarketingService/Newsletters/Count | Get newsletters count |
| [**updateNewsletterAsync**](NewslettersApi.md#updateNewsletterAsync) | **PUT** /api/v2/MarketingService/Newsletters/{newsletterId} | Update a newsletter |


<a id="createNewsletterAsync"></a>
# **createNewsletterAsync**
> EmptyEnvelope createNewsletterAsync(tenantId, newsletterCreateDto, apiVersion, xApiVersion)

Create a newsletter

Creates a new newsletter for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val newsletterCreateDto : NewsletterCreateDto =  // NewsletterCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createNewsletterAsync(tenantId, newsletterCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#createNewsletterAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#createNewsletterAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **newsletterCreateDto** | [**NewsletterCreateDto**](NewsletterCreateDto.md)|  | |
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

<a id="deleteNewsletterAsync"></a>
# **deleteNewsletterAsync**
> EmptyEnvelope deleteNewsletterAsync(newsletterId, tenantId, apiVersion, xApiVersion)

Delete a newsletter

Deletes a newsletter by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteNewsletterAsync(newsletterId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#deleteNewsletterAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#deleteNewsletterAsync")
    e.printStackTrace()
}
```

### Parameters
| **newsletterId** | **java.util.UUID**|  | |
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

<a id="getNewsletterDetailsAsync"></a>
# **getNewsletterDetailsAsync**
> NewsletterDtoEnvelope getNewsletterDetailsAsync(newsletterId, tenantId, apiVersion, xApiVersion)

Get newsletter by ID

Retrieves the details of a specific newsletter by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NewsletterDtoEnvelope = apiInstance.getNewsletterDetailsAsync(newsletterId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#getNewsletterDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#getNewsletterDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **newsletterId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**NewsletterDtoEnvelope**](NewsletterDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNewsletterODataAsync"></a>
# **getNewsletterODataAsync**
> getNewsletterODataAsync(tenantId, apiVersion, xApiVersion)

Get newsletters

Retrieves a collection of newsletters for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getNewsletterODataAsync(tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#getNewsletterODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#getNewsletterODataAsync")
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getNewslettersCountAsync"></a>
# **getNewslettersCountAsync**
> Int32Envelope getNewslettersCountAsync(tenantId, apiVersion, xApiVersion)

Get newsletters count

Returns the count of newsletters for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getNewslettersCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#getNewslettersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#getNewslettersCountAsync")
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

<a id="updateNewsletterAsync"></a>
# **updateNewsletterAsync**
> EmptyEnvelope updateNewsletterAsync(newsletterId, tenantId, newsletterUpdateDto, apiVersion, xApiVersion)

Update a newsletter

Updates an existing newsletter by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = NewslettersApi()
val newsletterId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val newsletterUpdateDto : NewsletterUpdateDto =  // NewsletterUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateNewsletterAsync(newsletterId, tenantId, newsletterUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NewslettersApi#updateNewsletterAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NewslettersApi#updateNewsletterAsync")
    e.printStackTrace()
}
```

### Parameters
| **newsletterId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **newsletterUpdateDto** | [**NewsletterUpdateDto**](NewsletterUpdateDto.md)|  | |
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

