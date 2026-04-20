# EmailSignaturesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEmailSignatureAsync**](EmailSignaturesApi.md#createEmailSignatureAsync) | **POST** /api/v2/MarketingService/EmailSignatures | Create an email signature |
| [**deleteEmailSignatureAsync**](EmailSignaturesApi.md#deleteEmailSignatureAsync) | **DELETE** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | Delete an email signature |
| [**getEmailSignatureDetailsAsync**](EmailSignaturesApi.md#getEmailSignatureDetailsAsync) | **GET** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | Get email signature by ID |
| [**getEmailSignaturesCountAsync**](EmailSignaturesApi.md#getEmailSignaturesCountAsync) | **GET** /api/v2/MarketingService/EmailSignatures/Count | Get email signatures count |
| [**getEmailSignaturesODataAsync**](EmailSignaturesApi.md#getEmailSignaturesODataAsync) | **GET** /api/v2/MarketingService/EmailSignatures | Get email signatures |
| [**updateEmailSignatureAsync**](EmailSignaturesApi.md#updateEmailSignatureAsync) | **PUT** /api/v2/MarketingService/EmailSignatures/{emailsignatureId} | Update an email signature |


<a id="createEmailSignatureAsync"></a>
# **createEmailSignatureAsync**
> EmptyEnvelope createEmailSignatureAsync(tenantId, emailSignatureCreateDto, apiVersion, xApiVersion)

Create an email signature

Creates a new email signature for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailSignatureCreateDto : EmailSignatureCreateDto =  // EmailSignatureCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createEmailSignatureAsync(tenantId, emailSignatureCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#createEmailSignatureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#createEmailSignatureAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **emailSignatureCreateDto** | [**EmailSignatureCreateDto**](EmailSignatureCreateDto.md)|  | |
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

<a id="deleteEmailSignatureAsync"></a>
# **deleteEmailSignatureAsync**
> EmptyEnvelope deleteEmailSignatureAsync(emailsignatureId, tenantId, apiVersion, xApiVersion)

Delete an email signature

Deletes an email signature by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val emailsignatureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteEmailSignatureAsync(emailsignatureId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#deleteEmailSignatureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#deleteEmailSignatureAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailsignatureId** | **java.util.UUID**|  | |
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

<a id="getEmailSignatureDetailsAsync"></a>
# **getEmailSignatureDetailsAsync**
> EmailSignatureDtoEnvelope getEmailSignatureDetailsAsync(emailsignatureId, tenantId, apiVersion, xApiVersion)

Get email signature by ID

Retrieves the details of a specific email signature by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val emailsignatureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailSignatureDtoEnvelope = apiInstance.getEmailSignatureDetailsAsync(emailsignatureId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#getEmailSignatureDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#getEmailSignatureDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailsignatureId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmailSignatureDtoEnvelope**](EmailSignatureDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmailSignaturesCountAsync"></a>
# **getEmailSignaturesCountAsync**
> Int32Envelope getEmailSignaturesCountAsync(tenantId, apiVersion, xApiVersion)

Get email signatures count

Returns the count of email signatures for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getEmailSignaturesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#getEmailSignaturesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#getEmailSignaturesCountAsync")
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

<a id="getEmailSignaturesODataAsync"></a>
# **getEmailSignaturesODataAsync**
> EmailSignatureDtoListEnvelope getEmailSignaturesODataAsync(tenantId, apiVersion, xApiVersion)

Get email signatures

Retrieves a collection of email signatures for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailSignatureDtoListEnvelope = apiInstance.getEmailSignaturesODataAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#getEmailSignaturesODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#getEmailSignaturesODataAsync")
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

[**EmailSignatureDtoListEnvelope**](EmailSignatureDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateEmailSignatureAsync"></a>
# **updateEmailSignatureAsync**
> EmptyEnvelope updateEmailSignatureAsync(emailsignatureId, tenantId, emailSignatureUpdateDto, apiVersion, xApiVersion)

Update an email signature

Updates an existing email signature by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailSignaturesApi()
val emailsignatureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailSignatureUpdateDto : EmailSignatureUpdateDto =  // EmailSignatureUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateEmailSignatureAsync(emailsignatureId, tenantId, emailSignatureUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailSignaturesApi#updateEmailSignatureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailSignaturesApi#updateEmailSignatureAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailsignatureId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **emailSignatureUpdateDto** | [**EmailSignatureUpdateDto**](EmailSignatureUpdateDto.md)|  | |
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

