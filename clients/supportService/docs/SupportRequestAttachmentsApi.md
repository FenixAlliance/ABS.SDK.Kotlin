# SupportRequestAttachmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSupportRequestAttachmentAsync**](SupportRequestAttachmentsApi.md#createSupportRequestAttachmentAsync) | **POST** /api/v2/SupportService/SupportRequestAttachments | Create a new support request attachment |
| [**deleteSupportRequestAttachmentAsync**](SupportRequestAttachmentsApi.md#deleteSupportRequestAttachmentAsync) | **DELETE** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | Delete a support request attachment |
| [**getSupportRequestAttachmentAsync**](SupportRequestAttachmentsApi.md#getSupportRequestAttachmentAsync) | **GET** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | Retrieve a support request attachment by ID |
| [**getSupportRequestAttachmentsAsync**](SupportRequestAttachmentsApi.md#getSupportRequestAttachmentsAsync) | **GET** /api/v2/SupportService/SupportRequestAttachments | Retrieve a list of support request attachments |
| [**getSupportRequestAttachmentsCountAsync**](SupportRequestAttachmentsApi.md#getSupportRequestAttachmentsCountAsync) | **GET** /api/v2/SupportService/SupportRequestAttachments/Count | Get the count of support request attachments |
| [**updateSupportRequestAttachmentAsync**](SupportRequestAttachmentsApi.md#updateSupportRequestAttachmentAsync) | **PUT** /api/v2/SupportService/SupportRequestAttachments/{supportRequestAttachmentId} | Update a support request attachment |


<a id="createSupportRequestAttachmentAsync"></a>
# **createSupportRequestAttachmentAsync**
> EmptyEnvelope createSupportRequestAttachmentAsync(tenantId, apiVersion, xApiVersion, supportRequestAttachmentCreateDto)

Create a new support request attachment

Creates a new support request attachment for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportRequestAttachmentCreateDto : SupportRequestAttachmentCreateDto =  // SupportRequestAttachmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSupportRequestAttachmentAsync(tenantId, apiVersion, xApiVersion, supportRequestAttachmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#createSupportRequestAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#createSupportRequestAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportRequestAttachmentCreateDto** | [**SupportRequestAttachmentCreateDto**](SupportRequestAttachmentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSupportRequestAttachmentAsync"></a>
# **deleteSupportRequestAttachmentAsync**
> EmptyEnvelope deleteSupportRequestAttachmentAsync(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion)

Delete a support request attachment

Deletes a support request attachment by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val supportRequestAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSupportRequestAttachmentAsync(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#deleteSupportRequestAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#deleteSupportRequestAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestAttachmentId** | **java.util.UUID**|  | |
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

<a id="getSupportRequestAttachmentAsync"></a>
# **getSupportRequestAttachmentAsync**
> SupportRequestAttachmentDtoEnvelope getSupportRequestAttachmentAsync(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion)

Retrieve a support request attachment by ID

Retrieves a single support request attachment by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val supportRequestAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestAttachmentDtoEnvelope = apiInstance.getSupportRequestAttachmentAsync(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#getSupportRequestAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#getSupportRequestAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestAttachmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportRequestAttachmentDtoEnvelope**](SupportRequestAttachmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportRequestAttachmentsAsync"></a>
# **getSupportRequestAttachmentsAsync**
> SupportRequestAttachmentDtoListEnvelope getSupportRequestAttachmentsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support request attachments

Retrieves a list of support request attachments for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestAttachmentDtoListEnvelope = apiInstance.getSupportRequestAttachmentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#getSupportRequestAttachmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#getSupportRequestAttachmentsAsync")
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

[**SupportRequestAttachmentDtoListEnvelope**](SupportRequestAttachmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportRequestAttachmentsCountAsync"></a>
# **getSupportRequestAttachmentsCountAsync**
> Int32Envelope getSupportRequestAttachmentsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support request attachments

Returns the total count of support request attachments for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSupportRequestAttachmentsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#getSupportRequestAttachmentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#getSupportRequestAttachmentsCountAsync")
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

<a id="updateSupportRequestAttachmentAsync"></a>
# **updateSupportRequestAttachmentAsync**
> EmptyEnvelope updateSupportRequestAttachmentAsync(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion, supportRequestAttachmentUpdateDto)

Update a support request attachment

Updates an existing support request attachment by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestAttachmentsApi()
val supportRequestAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportRequestAttachmentUpdateDto : SupportRequestAttachmentUpdateDto =  // SupportRequestAttachmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSupportRequestAttachmentAsync(supportRequestAttachmentId, tenantId, apiVersion, xApiVersion, supportRequestAttachmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestAttachmentsApi#updateSupportRequestAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestAttachmentsApi#updateSupportRequestAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestAttachmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportRequestAttachmentUpdateDto** | [**SupportRequestAttachmentUpdateDto**](SupportRequestAttachmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

