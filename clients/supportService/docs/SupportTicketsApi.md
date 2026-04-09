# SupportTicketsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSupportTicketAsync**](SupportTicketsApi.md#createSupportTicketAsync) | **POST** /api/v2/SupportService/SupportTickets | Create a new support ticket |
| [**deleteSupportTicketAsync**](SupportTicketsApi.md#deleteSupportTicketAsync) | **DELETE** /api/v2/SupportService/SupportTickets/{supportTicketId} | Delete a support ticket |
| [**deleteSupportTicketConversationAsync**](SupportTicketsApi.md#deleteSupportTicketConversationAsync) | **DELETE** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId} | Delete a conversation from a support ticket |
| [**getSupportTicketAsync**](SupportTicketsApi.md#getSupportTicketAsync) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId} | Retrieve a support ticket by ID |
| [**getSupportTicketConversationAsync**](SupportTicketsApi.md#getSupportTicketConversationAsync) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId} | Retrieve a specific conversation for a support ticket |
| [**getSupportTicketConversationMessagesAsync**](SupportTicketsApi.md#getSupportTicketConversationMessagesAsync) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations/{supportTicketConversationId}/Messages | Retrieve messages for a support ticket conversation |
| [**getSupportTicketConversationsAsync**](SupportTicketsApi.md#getSupportTicketConversationsAsync) | **GET** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations | Retrieve conversations for a support ticket |
| [**getSupportTicketsAsync**](SupportTicketsApi.md#getSupportTicketsAsync) | **GET** /api/v2/SupportService/SupportTickets | Retrieve a list of support tickets |
| [**getSupportTicketsCountAsync**](SupportTicketsApi.md#getSupportTicketsCountAsync) | **GET** /api/v2/SupportService/SupportTickets/Count | Get the count of support tickets |
| [**relateSupportTicketToConversationAsync**](SupportTicketsApi.md#relateSupportTicketToConversationAsync) | **POST** /api/v2/SupportService/SupportTickets/{supportTicketId}/Conversations | Create a conversation for a support ticket |
| [**updateSupportTicketAsync**](SupportTicketsApi.md#updateSupportTicketAsync) | **PUT** /api/v2/SupportService/SupportTickets/{supportTicketId} | Update a support ticket |


<a id="createSupportTicketAsync"></a>
# **createSupportTicketAsync**
> EmptyEnvelope createSupportTicketAsync(tenantId, apiVersion, xApiVersion, supportTicketCreateDto)

Create a new support ticket

Creates a new support ticket for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportTicketCreateDto : SupportTicketCreateDto =  // SupportTicketCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSupportTicketAsync(tenantId, apiVersion, xApiVersion, supportTicketCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#createSupportTicketAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#createSupportTicketAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportTicketCreateDto** | [**SupportTicketCreateDto**](SupportTicketCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSupportTicketAsync"></a>
# **deleteSupportTicketAsync**
> EmptyEnvelope deleteSupportTicketAsync(supportTicketId, tenantId, apiVersion, xApiVersion)

Delete a support ticket

Deletes a support ticket by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSupportTicketAsync(supportTicketId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#deleteSupportTicketAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#deleteSupportTicketAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
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

<a id="deleteSupportTicketConversationAsync"></a>
# **deleteSupportTicketConversationAsync**
> EmptyEnvelope deleteSupportTicketConversationAsync(supportTicketId, supportTicketConversationId, tenantId, apiVersion, xApiVersion)

Delete a conversation from a support ticket

Deletes a specific conversation from a support ticket.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSupportTicketConversationAsync(supportTicketId, supportTicketConversationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#deleteSupportTicketConversationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#deleteSupportTicketConversationAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **supportTicketConversationId** | **java.util.UUID**|  | |
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

<a id="getSupportTicketAsync"></a>
# **getSupportTicketAsync**
> SupportTicketDtoEnvelope getSupportTicketAsync(supportTicketId, tenantId, apiVersion, xApiVersion)

Retrieve a support ticket by ID

Retrieves a single support ticket by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketDtoEnvelope = apiInstance.getSupportTicketAsync(supportTicketId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#getSupportTicketAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#getSupportTicketAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketDtoEnvelope**](SupportTicketDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportTicketConversationAsync"></a>
# **getSupportTicketConversationAsync**
> SupportTicketConversationDtoEnvelope getSupportTicketConversationAsync(supportTicketId, supportTicketConversationId, tenantId, apiVersion, xApiVersion)

Retrieve a specific conversation for a support ticket

Retrieves a single conversation by its ID for a specific support ticket.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketConversationDtoEnvelope = apiInstance.getSupportTicketConversationAsync(supportTicketId, supportTicketConversationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#getSupportTicketConversationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#getSupportTicketConversationAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **supportTicketConversationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketConversationDtoEnvelope**](SupportTicketConversationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportTicketConversationMessagesAsync"></a>
# **getSupportTicketConversationMessagesAsync**
> PrivateMessageDtoListEnvelope getSupportTicketConversationMessagesAsync(supportTicketId, supportTicketConversationId, tenantId, pageNumber, pageSize, apiVersion, xApiVersion)

Retrieve messages for a support ticket conversation

Retrieves the list of messages within a specific conversation of a support ticket.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val supportTicketConversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val pageNumber : kotlin.Int = 56 // kotlin.Int | 
val pageSize : kotlin.Int = 56 // kotlin.Int | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PrivateMessageDtoListEnvelope = apiInstance.getSupportTicketConversationMessagesAsync(supportTicketId, supportTicketConversationId, tenantId, pageNumber, pageSize, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#getSupportTicketConversationMessagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#getSupportTicketConversationMessagesAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **supportTicketConversationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **pageNumber** | **kotlin.Int**|  | [optional] |
| **pageSize** | **kotlin.Int**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PrivateMessageDtoListEnvelope**](PrivateMessageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportTicketConversationsAsync"></a>
# **getSupportTicketConversationsAsync**
> SupportTicketConversationDtoListEnvelope getSupportTicketConversationsAsync(supportTicketId, tenantId, apiVersion, xApiVersion)

Retrieve conversations for a support ticket

Retrieves the list of conversations associated with a specific support ticket.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketConversationDtoListEnvelope = apiInstance.getSupportTicketConversationsAsync(supportTicketId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#getSupportTicketConversationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#getSupportTicketConversationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketConversationDtoListEnvelope**](SupportTicketConversationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportTicketsAsync"></a>
# **getSupportTicketsAsync**
> SupportTicketDtoListEnvelope getSupportTicketsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support tickets

Retrieves a list of support tickets for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketDtoListEnvelope = apiInstance.getSupportTicketsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#getSupportTicketsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#getSupportTicketsAsync")
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

[**SupportTicketDtoListEnvelope**](SupportTicketDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportTicketsCountAsync"></a>
# **getSupportTicketsCountAsync**
> Int32Envelope getSupportTicketsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support tickets

Returns the total count of support tickets for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSupportTicketsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#getSupportTicketsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#getSupportTicketsCountAsync")
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

<a id="relateSupportTicketToConversationAsync"></a>
# **relateSupportTicketToConversationAsync**
> EmptyEnvelope relateSupportTicketToConversationAsync(supportTicketId, tenantId, apiVersion, xApiVersion, supportTicketConversationCreateDto)

Create a conversation for a support ticket

Creates a new conversation and associates it with the specified support ticket.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportTicketConversationCreateDto : SupportTicketConversationCreateDto =  // SupportTicketConversationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.relateSupportTicketToConversationAsync(supportTicketId, tenantId, apiVersion, xApiVersion, supportTicketConversationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#relateSupportTicketToConversationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#relateSupportTicketToConversationAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportTicketConversationCreateDto** | [**SupportTicketConversationCreateDto**](SupportTicketConversationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSupportTicketAsync"></a>
# **updateSupportTicketAsync**
> EmptyEnvelope updateSupportTicketAsync(supportTicketId, tenantId, apiVersion, xApiVersion, supportTicketUpdateDto)

Update a support ticket

Updates an existing support ticket by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketsApi()
val supportTicketId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportTicketUpdateDto : SupportTicketUpdateDto =  // SupportTicketUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSupportTicketAsync(supportTicketId, tenantId, apiVersion, xApiVersion, supportTicketUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketsApi#updateSupportTicketAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketsApi#updateSupportTicketAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportTicketUpdateDto** | [**SupportTicketUpdateDto**](SupportTicketUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

