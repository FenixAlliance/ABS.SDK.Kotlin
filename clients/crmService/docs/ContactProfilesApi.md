# ContactProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createContactProfileAsync**](ContactProfilesApi.md#createContactProfileAsync) | **POST** /api/v2/CrmService/ContactProfiles | Create a new contact profile |
| [**deleteContactProfileAsync**](ContactProfilesApi.md#deleteContactProfileAsync) | **DELETE** /api/v2/CrmService/ContactProfiles/{id} | Delete a contact profile |
| [**getContactProfileByIdAsync**](ContactProfilesApi.md#getContactProfileByIdAsync) | **GET** /api/v2/CrmService/ContactProfiles/{id} | Get contact profile by ID |
| [**getContactProfilesAsync**](ContactProfilesApi.md#getContactProfilesAsync) | **GET** /api/v2/CrmService/ContactProfiles | Get all contact profiles |
| [**getContactProfilesCountAsync**](ContactProfilesApi.md#getContactProfilesCountAsync) | **GET** /api/v2/CrmService/ContactProfiles/Count | Get contact profiles count |
| [**getPartnerProfilesCountAsync**](ContactProfilesApi.md#getPartnerProfilesCountAsync) | **GET** /api/v2/CrmService/ContactProfiles/Partners/Count | Get partner profiles count |
| [**getPatientProfilesCountAsync**](ContactProfilesApi.md#getPatientProfilesCountAsync) | **GET** /api/v2/CrmService/ContactProfiles/Patients/Count | Get patient profiles count |
| [**patchContactProfileAsync**](ContactProfilesApi.md#patchContactProfileAsync) | **PATCH** /api/v2/CrmService/ContactProfiles/{id} | Patch a contact profile |
| [**updateContactProfileAsync**](ContactProfilesApi.md#updateContactProfileAsync) | **PUT** /api/v2/CrmService/ContactProfiles/{id} | Update a contact profile |


<a id="createContactProfileAsync"></a>
# **createContactProfileAsync**
> createContactProfileAsync(tenantId, apiVersion, xApiVersion, contactProfileCreateDto)

Create a new contact profile

Creates a new contact profile for the specified tenant. The ContactId must be provided in the request body.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactProfileCreateDto : ContactProfileCreateDto =  // ContactProfileCreateDto | 
try {
    apiInstance.createContactProfileAsync(tenantId, apiVersion, xApiVersion, contactProfileCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#createContactProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#createContactProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactProfileCreateDto** | [**ContactProfileCreateDto**](ContactProfileCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteContactProfileAsync"></a>
# **deleteContactProfileAsync**
> deleteContactProfileAsync(id, tenantId, apiVersion, xApiVersion)

Delete a contact profile

Deletes a contact profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteContactProfileAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#deleteContactProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#deleteContactProfileAsync")
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

<a id="getContactProfileByIdAsync"></a>
# **getContactProfileByIdAsync**
> ContactProfileDto getContactProfileByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get contact profile by ID

Retrieves a specific contact profile by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactProfileDto = apiInstance.getContactProfileByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#getContactProfileByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#getContactProfileByIdAsync")
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

[**ContactProfileDto**](ContactProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactProfilesAsync"></a>
# **getContactProfilesAsync**
> ContactProfileDtoListEnvelope getContactProfilesAsync(tenantId, apiVersion, xApiVersion)

Get all contact profiles

Retrieves all contact profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactProfileDtoListEnvelope = apiInstance.getContactProfilesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#getContactProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#getContactProfilesAsync")
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

[**ContactProfileDtoListEnvelope**](ContactProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactProfilesCountAsync"></a>
# **getContactProfilesCountAsync**
> Int32Envelope getContactProfilesCountAsync(tenantId, apiVersion, xApiVersion)

Get contact profiles count

Returns the count of contact profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getContactProfilesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#getContactProfilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#getContactProfilesCountAsync")
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

<a id="getPartnerProfilesCountAsync"></a>
# **getPartnerProfilesCountAsync**
> Int32Envelope getPartnerProfilesCountAsync(tenantId, apiVersion, xApiVersion)

Get partner profiles count

Returns the count of partner contact profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getPartnerProfilesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#getPartnerProfilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#getPartnerProfilesCountAsync")
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

<a id="getPatientProfilesCountAsync"></a>
# **getPatientProfilesCountAsync**
> Int32Envelope getPatientProfilesCountAsync(tenantId, apiVersion, xApiVersion)

Get patient profiles count

Returns the count of patient contact profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getPatientProfilesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#getPatientProfilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#getPatientProfilesCountAsync")
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

<a id="patchContactProfileAsync"></a>
# **patchContactProfileAsync**
> EmptyEnvelope patchContactProfileAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a contact profile

Patch a contact profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchContactProfileAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#patchContactProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#patchContactProfileAsync")
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

<a id="updateContactProfileAsync"></a>
# **updateContactProfileAsync**
> updateContactProfileAsync(id, tenantId, apiVersion, xApiVersion, contactProfileUpdateDto)

Update a contact profile

Updates an existing contact profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactProfilesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactProfileUpdateDto : ContactProfileUpdateDto =  // ContactProfileUpdateDto | 
try {
    apiInstance.updateContactProfileAsync(id, tenantId, apiVersion, xApiVersion, contactProfileUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactProfilesApi#updateContactProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactProfilesApi#updateContactProfileAsync")
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
| **contactProfileUpdateDto** | [**ContactProfileUpdateDto**](ContactProfileUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

