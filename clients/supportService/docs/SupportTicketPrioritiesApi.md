# SupportTicketPrioritiesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSupportTicketPriorityAsync**](SupportTicketPrioritiesApi.md#createSupportTicketPriorityAsync) | **POST** /api/v2/SupportService/SupportTicketPriorities | Create a new support ticket priority |
| [**deleteSupportTicketPriorityAsync**](SupportTicketPrioritiesApi.md#deleteSupportTicketPriorityAsync) | **DELETE** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | Delete a support ticket priority |
| [**getSupportTicketPrioritiesAsync**](SupportTicketPrioritiesApi.md#getSupportTicketPrioritiesAsync) | **GET** /api/v2/SupportService/SupportTicketPriorities | Retrieve a list of support ticket priorities |
| [**getSupportTicketPrioritiesCountAsync**](SupportTicketPrioritiesApi.md#getSupportTicketPrioritiesCountAsync) | **GET** /api/v2/SupportService/SupportTicketPriorities/Count | Get the count of support ticket priorities |
| [**getSupportTicketPriorityAsync**](SupportTicketPrioritiesApi.md#getSupportTicketPriorityAsync) | **GET** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | Retrieve a support ticket priority by ID |
| [**updateSupportTicketPriorityAsync**](SupportTicketPrioritiesApi.md#updateSupportTicketPriorityAsync) | **PUT** /api/v2/SupportService/SupportTicketPriorities/{supportTicketPriorityId} | Update a support ticket priority |


<a id="createSupportTicketPriorityAsync"></a>
# **createSupportTicketPriorityAsync**
> EmptyEnvelope createSupportTicketPriorityAsync(tenantId, apiVersion, xApiVersion, supportTicketPriorityCreateDto)

Create a new support ticket priority

Creates a new support ticket priority for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportTicketPriorityCreateDto : SupportTicketPriorityCreateDto =  // SupportTicketPriorityCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSupportTicketPriorityAsync(tenantId, apiVersion, xApiVersion, supportTicketPriorityCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#createSupportTicketPriorityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#createSupportTicketPriorityAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportTicketPriorityCreateDto** | [**SupportTicketPriorityCreateDto**](SupportTicketPriorityCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSupportTicketPriorityAsync"></a>
# **deleteSupportTicketPriorityAsync**
> EmptyEnvelope deleteSupportTicketPriorityAsync(supportTicketPriorityId, tenantId, apiVersion, xApiVersion)

Delete a support ticket priority

Deletes a support ticket priority by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val supportTicketPriorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSupportTicketPriorityAsync(supportTicketPriorityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#deleteSupportTicketPriorityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#deleteSupportTicketPriorityAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketPriorityId** | **java.util.UUID**|  | |
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

<a id="getSupportTicketPrioritiesAsync"></a>
# **getSupportTicketPrioritiesAsync**
> SupportTicketPriorityDtoListEnvelope getSupportTicketPrioritiesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support ticket priorities

Retrieves a list of support ticket priorities for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketPriorityDtoListEnvelope = apiInstance.getSupportTicketPrioritiesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#getSupportTicketPrioritiesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#getSupportTicketPrioritiesAsync")
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

[**SupportTicketPriorityDtoListEnvelope**](SupportTicketPriorityDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportTicketPrioritiesCountAsync"></a>
# **getSupportTicketPrioritiesCountAsync**
> Int32Envelope getSupportTicketPrioritiesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support ticket priorities

Returns the total count of support ticket priorities for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSupportTicketPrioritiesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#getSupportTicketPrioritiesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#getSupportTicketPrioritiesCountAsync")
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

<a id="getSupportTicketPriorityAsync"></a>
# **getSupportTicketPriorityAsync**
> SupportTicketPriorityDtoEnvelope getSupportTicketPriorityAsync(supportTicketPriorityId, tenantId, apiVersion, xApiVersion)

Retrieve a support ticket priority by ID

Retrieves a single support ticket priority by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val supportTicketPriorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketPriorityDtoEnvelope = apiInstance.getSupportTicketPriorityAsync(supportTicketPriorityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#getSupportTicketPriorityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#getSupportTicketPriorityAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketPriorityId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketPriorityDtoEnvelope**](SupportTicketPriorityDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateSupportTicketPriorityAsync"></a>
# **updateSupportTicketPriorityAsync**
> EmptyEnvelope updateSupportTicketPriorityAsync(supportTicketPriorityId, tenantId, apiVersion, xApiVersion, supportTicketPriorityUpdateDto)

Update a support ticket priority

Updates an existing support ticket priority by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketPrioritiesApi()
val supportTicketPriorityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportTicketPriorityUpdateDto : SupportTicketPriorityUpdateDto =  // SupportTicketPriorityUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSupportTicketPriorityAsync(supportTicketPriorityId, tenantId, apiVersion, xApiVersion, supportTicketPriorityUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketPrioritiesApi#updateSupportTicketPriorityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketPrioritiesApi#updateSupportTicketPriorityAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketPriorityId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportTicketPriorityUpdateDto** | [**SupportTicketPriorityUpdateDto**](SupportTicketPriorityUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

