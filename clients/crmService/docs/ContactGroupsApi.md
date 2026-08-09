# ContactGroupsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createContactGroupAsync**](ContactGroupsApi.md#createContactGroupAsync) | **POST** /api/v2/CrmService/ContactGroups | Create a new contact group |
| [**deleteContactGroupAsync**](ContactGroupsApi.md#deleteContactGroupAsync) | **DELETE** /api/v2/CrmService/ContactGroups/{id} | Delete a contact group |
| [**getContactGroupByIdAsync**](ContactGroupsApi.md#getContactGroupByIdAsync) | **GET** /api/v2/CrmService/ContactGroups/{id} | Get contact group by ID |
| [**getContactGroupsAsync**](ContactGroupsApi.md#getContactGroupsAsync) | **GET** /api/v2/CrmService/ContactGroups | Get all contact groups |
| [**getContactGroupsCountAsync**](ContactGroupsApi.md#getContactGroupsCountAsync) | **GET** /api/v2/CrmService/ContactGroups/Count | Get contact groups count |
| [**patchContactGroupAsync**](ContactGroupsApi.md#patchContactGroupAsync) | **PATCH** /api/v2/CrmService/ContactGroups/{id} | Patch a contact group |
| [**updateContactGroupAsync**](ContactGroupsApi.md#updateContactGroupAsync) | **PUT** /api/v2/CrmService/ContactGroups/{id} | Update a contact group |


<a id="createContactGroupAsync"></a>
# **createContactGroupAsync**
> createContactGroupAsync(tenantId, apiVersion, xApiVersion, contactsGroupCreateDto)

Create a new contact group

Creates a new contact group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactsGroupCreateDto : ContactsGroupCreateDto =  // ContactsGroupCreateDto | 
try {
    apiInstance.createContactGroupAsync(tenantId, apiVersion, xApiVersion, contactsGroupCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#createContactGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#createContactGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactsGroupCreateDto** | [**ContactsGroupCreateDto**](ContactsGroupCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteContactGroupAsync"></a>
# **deleteContactGroupAsync**
> deleteContactGroupAsync(id, tenantId, apiVersion, xApiVersion)

Delete a contact group

Deletes a contact group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactGroupsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteContactGroupAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#deleteContactGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#deleteContactGroupAsync")
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

<a id="getContactGroupByIdAsync"></a>
# **getContactGroupByIdAsync**
> ContactsGroupDto getContactGroupByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get contact group by ID

Retrieves a specific contact group by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactGroupsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactsGroupDto = apiInstance.getContactGroupByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#getContactGroupByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#getContactGroupByIdAsync")
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

[**ContactsGroupDto**](ContactsGroupDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactGroupsAsync"></a>
# **getContactGroupsAsync**
> ContactsGroupDtoListEnvelope getContactGroupsAsync(tenantId, apiVersion, xApiVersion, contactsGroupDtoCollectionQueryParameters)

Get all contact groups

Retrieves all contact groups for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactsGroupDtoCollectionQueryParameters : ContactsGroupDtoCollectionQueryParameters =  // ContactsGroupDtoCollectionQueryParameters | 
try {
    val result : ContactsGroupDtoListEnvelope = apiInstance.getContactGroupsAsync(tenantId, apiVersion, xApiVersion, contactsGroupDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#getContactGroupsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#getContactGroupsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactsGroupDtoCollectionQueryParameters** | [**ContactsGroupDtoCollectionQueryParameters**](ContactsGroupDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactsGroupDtoListEnvelope**](ContactsGroupDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getContactGroupsCountAsync"></a>
# **getContactGroupsCountAsync**
> Int32Envelope getContactGroupsCountAsync(tenantId, apiVersion, xApiVersion, contactsGroupDtoCollectionQueryParameters)

Get contact groups count

Returns the count of contact groups for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactsGroupDtoCollectionQueryParameters : ContactsGroupDtoCollectionQueryParameters =  // ContactsGroupDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getContactGroupsCountAsync(tenantId, apiVersion, xApiVersion, contactsGroupDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#getContactGroupsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#getContactGroupsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactsGroupDtoCollectionQueryParameters** | [**ContactsGroupDtoCollectionQueryParameters**](ContactsGroupDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchContactGroupAsync"></a>
# **patchContactGroupAsync**
> EmptyEnvelope patchContactGroupAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a contact group

Patch a contact group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactGroupsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchContactGroupAsync(id, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#patchContactGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#patchContactGroupAsync")
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
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateContactGroupAsync"></a>
# **updateContactGroupAsync**
> updateContactGroupAsync(id, tenantId, apiVersion, xApiVersion, contactsGroupUpdateDto)

Update a contact group

Updates an existing contact group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactGroupsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactsGroupUpdateDto : ContactsGroupUpdateDto =  // ContactsGroupUpdateDto | 
try {
    apiInstance.updateContactGroupAsync(id, tenantId, apiVersion, xApiVersion, contactsGroupUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactGroupsApi#updateContactGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactGroupsApi#updateContactGroupAsync")
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
| **contactsGroupUpdateDto** | [**ContactsGroupUpdateDto**](ContactsGroupUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

