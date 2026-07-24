# ContactSourcesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createContactSourceAsync**](ContactSourcesApi.md#createContactSourceAsync) | **POST** /api/v2/CrmService/ContactSources | Create a new contact source |
| [**deleteContactSourceAsync**](ContactSourcesApi.md#deleteContactSourceAsync) | **DELETE** /api/v2/CrmService/ContactSources/{id} | Delete a contact source |
| [**getContactSourceByIdAsync**](ContactSourcesApi.md#getContactSourceByIdAsync) | **GET** /api/v2/CrmService/ContactSources/{id} | Get contact source by ID |
| [**getContactSourcesAsync**](ContactSourcesApi.md#getContactSourcesAsync) | **GET** /api/v2/CrmService/ContactSources | Get all contact sources |
| [**getContactSourcesCountAsync**](ContactSourcesApi.md#getContactSourcesCountAsync) | **GET** /api/v2/CrmService/ContactSources/Count | Get contact sources count |
| [**patchContactSourceAsync**](ContactSourcesApi.md#patchContactSourceAsync) | **PATCH** /api/v2/CrmService/ContactSources/{id} | Patch a contact source |
| [**updateContactSourceAsync**](ContactSourcesApi.md#updateContactSourceAsync) | **PUT** /api/v2/CrmService/ContactSources/{id} | Update a contact source |


<a id="createContactSourceAsync"></a>
# **createContactSourceAsync**
> createContactSourceAsync(tenantId, apiVersion, xApiVersion, contactSourceCreateDto)

Create a new contact source

Creates a new contact source for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactSourcesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactSourceCreateDto : ContactSourceCreateDto =  // ContactSourceCreateDto | 
try {
    apiInstance.createContactSourceAsync(tenantId, apiVersion, xApiVersion, contactSourceCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactSourcesApi#createContactSourceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactSourcesApi#createContactSourceAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactSourceCreateDto** | [**ContactSourceCreateDto**](ContactSourceCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteContactSourceAsync"></a>
# **deleteContactSourceAsync**
> deleteContactSourceAsync(id, tenantId, apiVersion, xApiVersion)

Delete a contact source

Deletes a contact source for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactSourcesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteContactSourceAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ContactSourcesApi#deleteContactSourceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactSourcesApi#deleteContactSourceAsync")
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

<a id="getContactSourceByIdAsync"></a>
# **getContactSourceByIdAsync**
> ContactSourceDto getContactSourceByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get contact source by ID

Retrieves a specific contact source by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactSourcesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactSourceDto = apiInstance.getContactSourceByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactSourcesApi#getContactSourceByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactSourcesApi#getContactSourceByIdAsync")
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

[**ContactSourceDto**](ContactSourceDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactSourcesAsync"></a>
# **getContactSourcesAsync**
> ContactSourceDtoListEnvelope getContactSourcesAsync(tenantId, apiVersion, xApiVersion)

Get all contact sources

Retrieves all contact sources for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactSourcesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactSourceDtoListEnvelope = apiInstance.getContactSourcesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactSourcesApi#getContactSourcesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactSourcesApi#getContactSourcesAsync")
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

[**ContactSourceDtoListEnvelope**](ContactSourceDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactSourcesCountAsync"></a>
# **getContactSourcesCountAsync**
> Int32Envelope getContactSourcesCountAsync(tenantId, apiVersion, xApiVersion)

Get contact sources count

Returns the count of contact sources for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactSourcesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getContactSourcesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactSourcesApi#getContactSourcesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactSourcesApi#getContactSourcesCountAsync")
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

<a id="patchContactSourceAsync"></a>
# **patchContactSourceAsync**
> EmptyEnvelope patchContactSourceAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a contact source

Patch a contact source

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactSourcesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchContactSourceAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactSourcesApi#patchContactSourceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactSourcesApi#patchContactSourceAsync")
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

<a id="updateContactSourceAsync"></a>
# **updateContactSourceAsync**
> updateContactSourceAsync(id, tenantId, apiVersion, xApiVersion, contactSourceUpdateDto)

Update a contact source

Updates an existing contact source for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactSourcesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactSourceUpdateDto : ContactSourceUpdateDto =  // ContactSourceUpdateDto | 
try {
    apiInstance.updateContactSourceAsync(id, tenantId, apiVersion, xApiVersion, contactSourceUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactSourcesApi#updateContactSourceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactSourcesApi#updateContactSourceAsync")
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
| **contactSourceUpdateDto** | [**ContactSourceUpdateDto**](ContactSourceUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

