# SupportTicketTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSupportTicketTypeAsync**](SupportTicketTypesApi.md#createSupportTicketTypeAsync) | **POST** /api/v2/SupportService/SupportTicketTypes | Create a new support ticket type |
| [**deleteSupportTicketTypeAsync**](SupportTicketTypesApi.md#deleteSupportTicketTypeAsync) | **DELETE** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | Delete a support ticket type |
| [**getSupportTicketTypeAsync**](SupportTicketTypesApi.md#getSupportTicketTypeAsync) | **GET** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | Retrieve a support ticket type by ID |
| [**getSupportTicketTypesAsync**](SupportTicketTypesApi.md#getSupportTicketTypesAsync) | **GET** /api/v2/SupportService/SupportTicketTypes | Retrieve a list of support ticket types |
| [**getSupportTicketTypesCountAsync**](SupportTicketTypesApi.md#getSupportTicketTypesCountAsync) | **GET** /api/v2/SupportService/SupportTicketTypes/Count | Get the count of support ticket types |
| [**updateSupportTicketTypeAsync**](SupportTicketTypesApi.md#updateSupportTicketTypeAsync) | **PUT** /api/v2/SupportService/SupportTicketTypes/{supportTicketTypeId} | Update a support ticket type |


<a id="createSupportTicketTypeAsync"></a>
# **createSupportTicketTypeAsync**
> EmptyEnvelope createSupportTicketTypeAsync(tenantId, apiVersion, xApiVersion, supportTicketTypeCreateDto)

Create a new support ticket type

Creates a new support ticket type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportTicketTypeCreateDto : SupportTicketTypeCreateDto =  // SupportTicketTypeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSupportTicketTypeAsync(tenantId, apiVersion, xApiVersion, supportTicketTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#createSupportTicketTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#createSupportTicketTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportTicketTypeCreateDto** | [**SupportTicketTypeCreateDto**](SupportTicketTypeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSupportTicketTypeAsync"></a>
# **deleteSupportTicketTypeAsync**
> EmptyEnvelope deleteSupportTicketTypeAsync(supportTicketTypeId, tenantId, apiVersion, xApiVersion)

Delete a support ticket type

Deletes a support ticket type by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val supportTicketTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSupportTicketTypeAsync(supportTicketTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#deleteSupportTicketTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#deleteSupportTicketTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketTypeId** | **java.util.UUID**|  | |
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

<a id="getSupportTicketTypeAsync"></a>
# **getSupportTicketTypeAsync**
> SupportTicketTypeDtoEnvelope getSupportTicketTypeAsync(supportTicketTypeId, tenantId, apiVersion, xApiVersion)

Retrieve a support ticket type by ID

Retrieves a single support ticket type by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val supportTicketTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketTypeDtoEnvelope = apiInstance.getSupportTicketTypeAsync(supportTicketTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#getSupportTicketTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#getSupportTicketTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportTicketTypeDtoEnvelope**](SupportTicketTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportTicketTypesAsync"></a>
# **getSupportTicketTypesAsync**
> SupportTicketTypeDtoListEnvelope getSupportTicketTypesAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support ticket types

Retrieves a list of support ticket types for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportTicketTypeDtoListEnvelope = apiInstance.getSupportTicketTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#getSupportTicketTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#getSupportTicketTypesAsync")
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

[**SupportTicketTypeDtoListEnvelope**](SupportTicketTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportTicketTypesCountAsync"></a>
# **getSupportTicketTypesCountAsync**
> Int32Envelope getSupportTicketTypesCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support ticket types

Returns the total count of support ticket types for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSupportTicketTypesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#getSupportTicketTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#getSupportTicketTypesCountAsync")
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

<a id="updateSupportTicketTypeAsync"></a>
# **updateSupportTicketTypeAsync**
> EmptyEnvelope updateSupportTicketTypeAsync(supportTicketTypeId, tenantId, apiVersion, xApiVersion, supportTicketTypeUpdateDto)

Update a support ticket type

Updates an existing support ticket type by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportTicketTypesApi()
val supportTicketTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportTicketTypeUpdateDto : SupportTicketTypeUpdateDto =  // SupportTicketTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSupportTicketTypeAsync(supportTicketTypeId, tenantId, apiVersion, xApiVersion, supportTicketTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportTicketTypesApi#updateSupportTicketTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportTicketTypesApi#updateSupportTicketTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportTicketTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportTicketTypeUpdateDto** | [**SupportTicketTypeUpdateDto**](SupportTicketTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

