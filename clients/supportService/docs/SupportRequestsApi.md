# SupportRequestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSupportRequestAsync**](SupportRequestsApi.md#createSupportRequestAsync) | **POST** /api/v2/SupportService/SupportRequests | Create a new support request |
| [**deleteSupportRequestAsync**](SupportRequestsApi.md#deleteSupportRequestAsync) | **DELETE** /api/v2/SupportService/SupportRequests/{supportRequestId} | Delete a support request |
| [**getSupportRequestAsync**](SupportRequestsApi.md#getSupportRequestAsync) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId} | Retrieve a support request by ID |
| [**getSupportRequestAttachmentByRequest**](SupportRequestsApi.md#getSupportRequestAttachmentByRequest) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments/{attachmentId} | Retrieve a specific attachment for a support request |
| [**getSupportRequestAttachmentsByRequest**](SupportRequestsApi.md#getSupportRequestAttachmentsByRequest) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments | Retrieve attachments for a support request |
| [**getSupportRequestAttachmentsCountByRequest**](SupportRequestsApi.md#getSupportRequestAttachmentsCountByRequest) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments/Count | Get the count of attachments for a support request |
| [**getSupportRequestTicketsAsync**](SupportRequestsApi.md#getSupportRequestTicketsAsync) | **GET** /api/v2/SupportService/SupportRequests/{supportRequestId}/Tickets | Retrieve tickets for a support request |
| [**getSupportRequestsAsync**](SupportRequestsApi.md#getSupportRequestsAsync) | **GET** /api/v2/SupportService/SupportRequests | Retrieve a list of support requests |
| [**getSupportRequestsCountAsync**](SupportRequestsApi.md#getSupportRequestsCountAsync) | **GET** /api/v2/SupportService/SupportRequests/Count | Get the count of support requests |
| [**relateSupportRequestToAttachmentAsync**](SupportRequestsApi.md#relateSupportRequestToAttachmentAsync) | **POST** /api/v2/SupportService/SupportRequests/{supportRequestId}/Attachments | Add an attachment to a support request |
| [**updateSupportRequestAsync**](SupportRequestsApi.md#updateSupportRequestAsync) | **PUT** /api/v2/SupportService/SupportRequests/{supportRequestId} | Update a support request |


<a id="createSupportRequestAsync"></a>
# **createSupportRequestAsync**
> EmptyEnvelope createSupportRequestAsync(tenantId, apiVersion, xApiVersion, supportRequestCreateDto)

Create a new support request

Creates a new support request for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportRequestCreateDto : SupportRequestCreateDto =  // SupportRequestCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSupportRequestAsync(tenantId, apiVersion, xApiVersion, supportRequestCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#createSupportRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#createSupportRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportRequestCreateDto** | [**SupportRequestCreateDto**](SupportRequestCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSupportRequestAsync"></a>
# **deleteSupportRequestAsync**
> EmptyEnvelope deleteSupportRequestAsync(supportRequestId, tenantId, apiVersion, xApiVersion)

Delete a support request

Deletes a support request by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSupportRequestAsync(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#deleteSupportRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#deleteSupportRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
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

<a id="getSupportRequestAsync"></a>
# **getSupportRequestAsync**
> SupportRequestDtoEnvelope getSupportRequestAsync(supportRequestId, tenantId, apiVersion, xApiVersion)

Retrieve a support request by ID

Retrieves a single support request by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestDtoEnvelope = apiInstance.getSupportRequestAsync(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#getSupportRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#getSupportRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportRequestDtoEnvelope**](SupportRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportRequestAttachmentByRequest"></a>
# **getSupportRequestAttachmentByRequest**
> SupportRequestAttachmentDtoEnvelope getSupportRequestAttachmentByRequest(supportRequestId, attachmentId, tenantId, apiVersion, xApiVersion)

Retrieve a specific attachment for a support request

Retrieves a single attachment by its ID for a specific support request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val attachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestAttachmentDtoEnvelope = apiInstance.getSupportRequestAttachmentByRequest(supportRequestId, attachmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#getSupportRequestAttachmentByRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#getSupportRequestAttachmentByRequest")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **attachmentId** | **java.util.UUID**|  | |
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

<a id="getSupportRequestAttachmentsByRequest"></a>
# **getSupportRequestAttachmentsByRequest**
> SupportRequestAttachmentDtoListEnvelope getSupportRequestAttachmentsByRequest(supportRequestId, tenantId, apiVersion, xApiVersion)

Retrieve attachments for a support request

Retrieves the list of attachments associated with a specific support request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestAttachmentDtoListEnvelope = apiInstance.getSupportRequestAttachmentsByRequest(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#getSupportRequestAttachmentsByRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#getSupportRequestAttachmentsByRequest")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
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

<a id="getSupportRequestAttachmentsCountByRequest"></a>
# **getSupportRequestAttachmentsCountByRequest**
> Int32Envelope getSupportRequestAttachmentsCountByRequest(supportRequestId, tenantId, apiVersion, xApiVersion)

Get the count of attachments for a support request

Returns the total count of attachments for a specific support request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSupportRequestAttachmentsCountByRequest(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#getSupportRequestAttachmentsCountByRequest")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#getSupportRequestAttachmentsCountByRequest")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
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

<a id="getSupportRequestTicketsAsync"></a>
# **getSupportRequestTicketsAsync**
> SupportTicketDtoListEnvelope getSupportRequestTicketsAsync(supportRequestId, tenantId, apiVersion, xApiVersion)

Retrieve tickets for a support request

Retrieves the list of support tickets associated with a specific support request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketDtoListEnvelope = apiInstance.getSupportRequestTicketsAsync(supportRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#getSupportRequestTicketsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#getSupportRequestTicketsAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketDtoListEnvelope**](SupportTicketDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportRequestsAsync"></a>
# **getSupportRequestsAsync**
> SupportRequestDtoListEnvelope getSupportRequestsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support requests

Retrieves a list of support requests for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportRequestDtoListEnvelope = apiInstance.getSupportRequestsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#getSupportRequestsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#getSupportRequestsAsync")
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

[**SupportRequestDtoListEnvelope**](SupportRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportRequestsCountAsync"></a>
# **getSupportRequestsCountAsync**
> Int32Envelope getSupportRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support requests

Returns the total count of support requests for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSupportRequestsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#getSupportRequestsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#getSupportRequestsCountAsync")
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

<a id="relateSupportRequestToAttachmentAsync"></a>
# **relateSupportRequestToAttachmentAsync**
> EmptyEnvelope relateSupportRequestToAttachmentAsync(supportRequestId, tenantId, apiVersion, xApiVersion, supportRequestAttachmentCreateDto)

Add an attachment to a support request

Creates a new attachment and associates it with the specified support request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportRequestAttachmentCreateDto : SupportRequestAttachmentCreateDto =  // SupportRequestAttachmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.relateSupportRequestToAttachmentAsync(supportRequestId, tenantId, apiVersion, xApiVersion, supportRequestAttachmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#relateSupportRequestToAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#relateSupportRequestToAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
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

<a id="updateSupportRequestAsync"></a>
# **updateSupportRequestAsync**
> EmptyEnvelope updateSupportRequestAsync(supportRequestId, tenantId, apiVersion, xApiVersion, supportRequestUpdateDto)

Update a support request

Updates an existing support request by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportRequestsApi()
val supportRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportRequestUpdateDto : SupportRequestUpdateDto =  // SupportRequestUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSupportRequestAsync(supportRequestId, tenantId, apiVersion, xApiVersion, supportRequestUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportRequestsApi#updateSupportRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportRequestsApi#updateSupportRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportRequestUpdateDto** | [**SupportRequestUpdateDto**](SupportRequestUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

