# EmailsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminPreviewBasicEmailTemplate**](EmailsApi.md#adminPreviewBasicEmailTemplate) | **POST** /api/v2/SystemService/Emails/Preview | Preview a rendered basic email template. |
| [**adminSendBasicEmail**](EmailsApi.md#adminSendBasicEmail) | **POST** /api/v2/SystemService/Emails/SendBasic | Send a basic transactional email to recipients. |


<a id="adminPreviewBasicEmailTemplate"></a>
# **adminPreviewBasicEmailTemplate**
> adminPreviewBasicEmailTemplate(apiVersion, xApiVersion, objectEmailDispatchRequest)

Preview a rendered basic email template.

This action is only available for global administrators (business_owner role).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val objectEmailDispatchRequest : ObjectEmailDispatchRequest =  // ObjectEmailDispatchRequest | 
try {
    apiInstance.adminPreviewBasicEmailTemplate(apiVersion, xApiVersion, objectEmailDispatchRequest)
} catch (e: ClientException) {
    println("4xx response calling EmailsApi#adminPreviewBasicEmailTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailsApi#adminPreviewBasicEmailTemplate")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **objectEmailDispatchRequest** | [**ObjectEmailDispatchRequest**](ObjectEmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="adminSendBasicEmail"></a>
# **adminSendBasicEmail**
> TenantDtoListEnvelope adminSendBasicEmail(apiVersion, xApiVersion, objectEmailDispatchRequest)

Send a basic transactional email to recipients.

This action is only available for global administrators (business_owner role).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val objectEmailDispatchRequest : ObjectEmailDispatchRequest =  // ObjectEmailDispatchRequest | 
try {
    val result : TenantDtoListEnvelope = apiInstance.adminSendBasicEmail(apiVersion, xApiVersion, objectEmailDispatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailsApi#adminSendBasicEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailsApi#adminSendBasicEmail")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **objectEmailDispatchRequest** | [**ObjectEmailDispatchRequest**](ObjectEmailDispatchRequest.md)|  | [optional] |

### Return type

[**TenantDtoListEnvelope**](TenantDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

