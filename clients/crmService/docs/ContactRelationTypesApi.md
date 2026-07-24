# ContactRelationTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createContactRelationTypeAsync**](ContactRelationTypesApi.md#createContactRelationTypeAsync) | **POST** /api/v2/CrmService/ContactRelationTypes | Create a new contact relation type |
| [**deleteContactRelationTypeAsync**](ContactRelationTypesApi.md#deleteContactRelationTypeAsync) | **DELETE** /api/v2/CrmService/ContactRelationTypes/{id} | Delete a contact relation type |
| [**getContactRelationTypeByIdAsync**](ContactRelationTypesApi.md#getContactRelationTypeByIdAsync) | **GET** /api/v2/CrmService/ContactRelationTypes/{id} | Get contact relation type by ID |
| [**getContactRelationTypesAsync**](ContactRelationTypesApi.md#getContactRelationTypesAsync) | **GET** /api/v2/CrmService/ContactRelationTypes | Get all contact relation types |
| [**getContactRelationTypesCountAsync**](ContactRelationTypesApi.md#getContactRelationTypesCountAsync) | **GET** /api/v2/CrmService/ContactRelationTypes/Count | Get contact relation types count |
| [**patchContactRelationTypeAsync**](ContactRelationTypesApi.md#patchContactRelationTypeAsync) | **PATCH** /api/v2/CrmService/ContactRelationTypes/{id} | Patch a contact relation type |
| [**updateContactRelationTypeAsync**](ContactRelationTypesApi.md#updateContactRelationTypeAsync) | **PUT** /api/v2/CrmService/ContactRelationTypes/{id} | Update a contact relation type |


<a id="createContactRelationTypeAsync"></a>
# **createContactRelationTypeAsync**
> createContactRelationTypeAsync(tenantId, apiVersion, xApiVersion, contactRelationTypeCreateDto)

Create a new contact relation type

Creates a new contact relation type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactRelationTypeCreateDto : ContactRelationTypeCreateDto =  // ContactRelationTypeCreateDto | 
try {
    apiInstance.createContactRelationTypeAsync(tenantId, apiVersion, xApiVersion, contactRelationTypeCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationTypesApi#createContactRelationTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationTypesApi#createContactRelationTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactRelationTypeCreateDto** | [**ContactRelationTypeCreateDto**](ContactRelationTypeCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteContactRelationTypeAsync"></a>
# **deleteContactRelationTypeAsync**
> deleteContactRelationTypeAsync(id, tenantId, apiVersion, xApiVersion)

Delete a contact relation type

Deletes a contact relation type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteContactRelationTypeAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationTypesApi#deleteContactRelationTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationTypesApi#deleteContactRelationTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="getContactRelationTypeByIdAsync"></a>
# **getContactRelationTypeByIdAsync**
> ContactRelationTypeDto getContactRelationTypeByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get contact relation type by ID

Retrieves a specific contact relation type by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactRelationTypeDto = apiInstance.getContactRelationTypeByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationTypesApi#getContactRelationTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationTypesApi#getContactRelationTypeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactRelationTypeDto**](ContactRelationTypeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactRelationTypesAsync"></a>
# **getContactRelationTypesAsync**
> ContactRelationTypeDtoListEnvelope getContactRelationTypesAsync(tenantId, apiVersion, xApiVersion)

Get all contact relation types

Retrieves all contact relation types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactRelationTypeDtoListEnvelope = apiInstance.getContactRelationTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationTypesApi#getContactRelationTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationTypesApi#getContactRelationTypesAsync")
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

[**ContactRelationTypeDtoListEnvelope**](ContactRelationTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactRelationTypesCountAsync"></a>
# **getContactRelationTypesCountAsync**
> Int32Envelope getContactRelationTypesCountAsync(tenantId, apiVersion, xApiVersion)

Get contact relation types count

Returns the count of contact relation types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getContactRelationTypesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationTypesApi#getContactRelationTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationTypesApi#getContactRelationTypesCountAsync")
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

<a id="patchContactRelationTypeAsync"></a>
# **patchContactRelationTypeAsync**
> EmptyEnvelope patchContactRelationTypeAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a contact relation type

Patch a contact relation type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchContactRelationTypeAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationTypesApi#patchContactRelationTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationTypesApi#patchContactRelationTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateContactRelationTypeAsync"></a>
# **updateContactRelationTypeAsync**
> updateContactRelationTypeAsync(id, tenantId, apiVersion, xApiVersion, contactRelationTypeUpdateDto)

Update a contact relation type

Updates an existing contact relation type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationTypesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactRelationTypeUpdateDto : ContactRelationTypeUpdateDto =  // ContactRelationTypeUpdateDto | 
try {
    apiInstance.updateContactRelationTypeAsync(id, tenantId, apiVersion, xApiVersion, contactRelationTypeUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationTypesApi#updateContactRelationTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationTypesApi#updateContactRelationTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactRelationTypeUpdateDto** | [**ContactRelationTypeUpdateDto**](ContactRelationTypeUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

