# ContactRelationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createContactRelationAsync**](ContactRelationsApi.md#createContactRelationAsync) | **POST** /api/v2/CrmService/ContactRelations | Create a new contact relation |
| [**deleteContactRelationAsync**](ContactRelationsApi.md#deleteContactRelationAsync) | **DELETE** /api/v2/CrmService/ContactRelations/{id} | Delete a contact relation |
| [**getContactRelationByIdAsync**](ContactRelationsApi.md#getContactRelationByIdAsync) | **GET** /api/v2/CrmService/ContactRelations/{id} | Get contact relation by ID |
| [**getContactRelationsAsync**](ContactRelationsApi.md#getContactRelationsAsync) | **GET** /api/v2/CrmService/ContactRelations | Get all contact relations |
| [**getContactRelationsCountAsync**](ContactRelationsApi.md#getContactRelationsCountAsync) | **GET** /api/v2/CrmService/ContactRelations/Count | Get contact relations count |
| [**patchContactRelationAsync**](ContactRelationsApi.md#patchContactRelationAsync) | **PATCH** /api/v2/CrmService/ContactRelations/{id} | Patch a contact relation |
| [**updateContactRelationAsync**](ContactRelationsApi.md#updateContactRelationAsync) | **PUT** /api/v2/CrmService/ContactRelations/{id} | Update a contact relation |


<a id="createContactRelationAsync"></a>
# **createContactRelationAsync**
> createContactRelationAsync(tenantId, apiVersion, xApiVersion, contactRelationCreateDto)

Create a new contact relation

Creates a new contact relation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactRelationCreateDto : ContactRelationCreateDto =  // ContactRelationCreateDto | 
try {
    apiInstance.createContactRelationAsync(tenantId, apiVersion, xApiVersion, contactRelationCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationsApi#createContactRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationsApi#createContactRelationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactRelationCreateDto** | [**ContactRelationCreateDto**](ContactRelationCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteContactRelationAsync"></a>
# **deleteContactRelationAsync**
> deleteContactRelationAsync(id, tenantId, apiVersion, xApiVersion)

Delete a contact relation

Deletes a contact relation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteContactRelationAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationsApi#deleteContactRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationsApi#deleteContactRelationAsync")
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

<a id="getContactRelationByIdAsync"></a>
# **getContactRelationByIdAsync**
> ContactRelationDto getContactRelationByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get contact relation by ID

Retrieves a specific contact relation by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactRelationDto = apiInstance.getContactRelationByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationsApi#getContactRelationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationsApi#getContactRelationByIdAsync")
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

[**ContactRelationDto**](ContactRelationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactRelationsAsync"></a>
# **getContactRelationsAsync**
> ContactRelationDtoListEnvelope getContactRelationsAsync(tenantId, apiVersion, xApiVersion)

Get all contact relations

Retrieves all contact relations for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactRelationDtoListEnvelope = apiInstance.getContactRelationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationsApi#getContactRelationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationsApi#getContactRelationsAsync")
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

[**ContactRelationDtoListEnvelope**](ContactRelationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactRelationsCountAsync"></a>
# **getContactRelationsCountAsync**
> Int32Envelope getContactRelationsCountAsync(tenantId, apiVersion, xApiVersion)

Get contact relations count

Returns the count of contact relations for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getContactRelationsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationsApi#getContactRelationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationsApi#getContactRelationsCountAsync")
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

<a id="patchContactRelationAsync"></a>
# **patchContactRelationAsync**
> EmptyEnvelope patchContactRelationAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a contact relation

Patch a contact relation

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchContactRelationAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationsApi#patchContactRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationsApi#patchContactRelationAsync")
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

<a id="updateContactRelationAsync"></a>
# **updateContactRelationAsync**
> updateContactRelationAsync(id, tenantId, apiVersion, xApiVersion, contactRelationUpdateDto)

Update a contact relation

Updates an existing contact relation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactRelationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactRelationUpdateDto : ContactRelationUpdateDto =  // ContactRelationUpdateDto | 
try {
    apiInstance.updateContactRelationAsync(id, tenantId, apiVersion, xApiVersion, contactRelationUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactRelationsApi#updateContactRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactRelationsApi#updateContactRelationAsync")
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
| **contactRelationUpdateDto** | [**ContactRelationUpdateDto**](ContactRelationUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

