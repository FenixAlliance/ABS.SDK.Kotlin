# EmailTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEmailTemplateAsync**](EmailTemplatesApi.md#createEmailTemplateAsync) | **POST** /api/v2/MarketingService/EmailTemplates | Create an email template |
| [**deleteEmailTemplateAsync**](EmailTemplatesApi.md#deleteEmailTemplateAsync) | **DELETE** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | Delete an email template |
| [**getEmailTemplateDetailsAsync**](EmailTemplatesApi.md#getEmailTemplateDetailsAsync) | **GET** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | Get email template by ID |
| [**getEmailTemplatesCountAsync**](EmailTemplatesApi.md#getEmailTemplatesCountAsync) | **GET** /api/v2/MarketingService/EmailTemplates/Count | Get email templates count |
| [**getEmailTemplatesODataAsync**](EmailTemplatesApi.md#getEmailTemplatesODataAsync) | **GET** /api/v2/MarketingService/EmailTemplates | Get email templates |
| [**updateEmailTemplateAsync**](EmailTemplatesApi.md#updateEmailTemplateAsync) | **PUT** /api/v2/MarketingService/EmailTemplates/{emailTemplateId} | Update an email template |


<a id="createEmailTemplateAsync"></a>
# **createEmailTemplateAsync**
> EmptyEnvelope createEmailTemplateAsync(tenantId, emailTemplateCreateDto, apiVersion, xApiVersion)

Create an email template

Creates a new email template for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailTemplateCreateDto : EmailTemplateCreateDto =  // EmailTemplateCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createEmailTemplateAsync(tenantId, emailTemplateCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#createEmailTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#createEmailTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **emailTemplateCreateDto** | [**EmailTemplateCreateDto**](EmailTemplateCreateDto.md)|  | |
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

<a id="deleteEmailTemplateAsync"></a>
# **deleteEmailTemplateAsync**
> EmptyEnvelope deleteEmailTemplateAsync(emailTemplateId, tenantId, apiVersion, xApiVersion)

Delete an email template

Deletes an email template by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val emailTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteEmailTemplateAsync(emailTemplateId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#deleteEmailTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#deleteEmailTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailTemplateId** | **java.util.UUID**|  | |
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

<a id="getEmailTemplateDetailsAsync"></a>
# **getEmailTemplateDetailsAsync**
> EmailTemplateDtoEnvelope getEmailTemplateDetailsAsync(emailTemplateId, tenantId, apiVersion, xApiVersion)

Get email template by ID

Retrieves the details of a specific email template by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val emailTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailTemplateDtoEnvelope = apiInstance.getEmailTemplateDetailsAsync(emailTemplateId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#getEmailTemplateDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#getEmailTemplateDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailTemplateId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmailTemplateDtoEnvelope**](EmailTemplateDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmailTemplatesCountAsync"></a>
# **getEmailTemplatesCountAsync**
> Int32Envelope getEmailTemplatesCountAsync(tenantId, apiVersion, xApiVersion)

Get email templates count

Returns the count of email templates for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getEmailTemplatesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#getEmailTemplatesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#getEmailTemplatesCountAsync")
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

<a id="getEmailTemplatesODataAsync"></a>
# **getEmailTemplatesODataAsync**
> EmailTemplateDtoListEnvelope getEmailTemplatesODataAsync(tenantId, apiVersion, xApiVersion)

Get email templates

Retrieves a collection of email templates for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailTemplateDtoListEnvelope = apiInstance.getEmailTemplatesODataAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#getEmailTemplatesODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#getEmailTemplatesODataAsync")
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

[**EmailTemplateDtoListEnvelope**](EmailTemplateDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateEmailTemplateAsync"></a>
# **updateEmailTemplateAsync**
> EmptyEnvelope updateEmailTemplateAsync(emailTemplateId, tenantId, emailTemplateUpdateDto, apiVersion, xApiVersion)

Update an email template

Updates an existing email template by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailTemplatesApi()
val emailTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailTemplateUpdateDto : EmailTemplateUpdateDto =  // EmailTemplateUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateEmailTemplateAsync(emailTemplateId, tenantId, emailTemplateUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailTemplatesApi#updateEmailTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailTemplatesApi#updateEmailTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailTemplateId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **emailTemplateUpdateDto** | [**EmailTemplateUpdateDto**](EmailTemplateUpdateDto.md)|  | |
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

