# ContactsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createContactAsync**](ContactsApi.md#createContactAsync) | **POST** /api/v2/CrmService/Contacts | Create a new contact |
| [**createContactEmailAsync**](ContactsApi.md#createContactEmailAsync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Emails/Addresses | Add an email address to a contact |
| [**createProfileForContactAsync**](ContactsApi.md#createProfileForContactAsync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Profiles | Create a contact profile |
| [**deleteContactAsync**](ContactsApi.md#deleteContactAsync) | **DELETE** /api/v2/CrmService/Contacts/{contactId} | Delete a contact |
| [**deleteContactEmailAsync**](ContactsApi.md#deleteContactEmailAsync) | **DELETE** /api/v2/CrmService/Contacts/{contactId}/Emails/{emailId} | Delete a contact email address |
| [**deleteProfileForContactAsync**](ContactsApi.md#deleteProfileForContactAsync) | **DELETE** /api/v2/CrmService/Contacts/{contactId}/Profiles/{profileId} | Delete a contact profile |
| [**getBusinessOwnedIndividualAsync**](ContactsApi.md#getBusinessOwnedIndividualAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId} | Get a Contact of type Individual by ID |
| [**getBusinessOwnedIndividualsAsync**](ContactsApi.md#getBusinessOwnedIndividualsAsync) | **GET** /api/v2/CrmService/Contacts/Individuals | Get all contacts of type individual |
| [**getBusinessOwnedIndividualsCountAsync**](ContactsApi.md#getBusinessOwnedIndividualsCountAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/Count | Get all contacts of type individual count |
| [**getBusinessOwnedOrganizationAsync**](ContactsApi.md#getBusinessOwnedOrganizationAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId} | Get a Contact of type Organization by ID |
| [**getBusinessOwnedOrganizationsAsync**](ContactsApi.md#getBusinessOwnedOrganizationsAsync) | **GET** /api/v2/CrmService/Contacts/Organizations | Get all contacts of type organization |
| [**getBusinessOwnedOrganizationsCountAsync**](ContactsApi.md#getBusinessOwnedOrganizationsCountAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/Count | Get all contacts of type organization count |
| [**getContactAsync**](ContactsApi.md#getContactAsync) | **GET** /api/v2/CrmService/Contacts/{contactId} | Get a contact by ID |
| [**getContactAvatarAsync**](ContactsApi.md#getContactAvatarAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Avatar | Get a contact&#39;s avatar |
| [**getContactCartAsync**](ContactsApi.md#getContactCartAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Cart | Get a contact&#39;s cart |
| [**getContactEmailsAsync**](ContactsApi.md#getContactEmailsAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Emails | Get a contact&#39;s email addresses |
| [**getContactEmailsCountAsync**](ContactsApi.md#getContactEmailsCountAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Emails/Count | Get contact email addresses count |
| [**getContactSocialProfileAsync**](ContactsApi.md#getContactSocialProfileAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/SocialProfile | Get a contact&#39;s social profile |
| [**getContactWalletAsync**](ContactsApi.md#getContactWalletAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Wallet | Get a contact&#39;s wallet |
| [**getContactsAsync**](ContactsApi.md#getContactsAsync) | **GET** /api/v2/CrmService/Contacts | Get all business owned contacts |
| [**getContactsCountAsync**](ContactsApi.md#getContactsCountAsync) | **GET** /api/v2/CrmService/Contacts/Count | Get all business owned contacts count |
| [**getExtendedBusinessOwnedIndividualsAsync**](ContactsApi.md#getExtendedBusinessOwnedIndividualsAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/Extended | Get all contacts of type individual |
| [**getExtendedBusinessOwnedOrganizationsAsync**](ContactsApi.md#getExtendedBusinessOwnedOrganizationsAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/Extended | Get all contacts of type organization |
| [**getExtendedContactAsync**](ContactsApi.md#getExtendedContactAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Extended | Get a contact by ID |
| [**getExtendedContactsAsync**](ContactsApi.md#getExtendedContactsAsync) | **GET** /api/v2/CrmService/Contacts/Extended | Get all business owned contacts |
| [**getIndividualRelatedIndividualsAsync**](ContactsApi.md#getIndividualRelatedIndividualsAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId}/Individuals | Get individual related individuals |
| [**getIndividualRelatedOrganizationsAsync**](ContactsApi.md#getIndividualRelatedOrganizationsAsync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId}/Organizations | Get individual related organizations |
| [**getOrganizationRelatedIndividualsAsync**](ContactsApi.md#getOrganizationRelatedIndividualsAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId}/Individuals | Get organization related individuals |
| [**getOrganizationRelatedOrganizationsAsync**](ContactsApi.md#getOrganizationRelatedOrganizationsAsync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId}/Organizations | Get organization related organizations |
| [**getProfilesForContactAsync**](ContactsApi.md#getProfilesForContactAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Profiles | Get a contact&#39;s social profiles |
| [**getProfilesForContactCountAsync**](ContactsApi.md#getProfilesForContactCountAsync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Profiles/Count | Get contact profiles count |
| [**patchContactAsync**](ContactsApi.md#patchContactAsync) | **PATCH** /api/v2/CrmService/Contacts/{contactId} | Patch a contact |
| [**patchContactEmailAsync**](ContactsApi.md#patchContactEmailAsync) | **PATCH** /api/v2/CrmService/Contacts/{contactId}/Emails/{emailId} | Patch a contact email address |
| [**previewContactEmailTemplate**](ContactsApi.md#previewContactEmailTemplate) | **POST** /api/v2/CrmService/Contacts/{contactId}/Emails/Preview | Preview the rendered email for a contact. |
| [**sendContactEmail**](ContactsApi.md#sendContactEmail) | **POST** /api/v2/CrmService/Contacts/{contactId}/Emails/Send | Send an email to a contact. |
| [**updateContactAsync**](ContactsApi.md#updateContactAsync) | **PUT** /api/v2/CrmService/Contacts/{contactId} | Update a contact |
| [**updateContactAvatarAsync**](ContactsApi.md#updateContactAvatarAsync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Avatar | Update a contact&#39;s avatar |
| [**updateContactEmailAsync**](ContactsApi.md#updateContactEmailAsync) | **PUT** /api/v2/CrmService/Contacts/{contactId}/Emails/{emailId} | Update a contact email address |
| [**updateProfileForContactAsync**](ContactsApi.md#updateProfileForContactAsync) | **PUT** /api/v2/CrmService/Contacts/{contactId}/Profiles/{profileId} | Update a contact profile |
| [**upsertTenantOntoAnotherTenantContactListAsync**](ContactsApi.md#upsertTenantOntoAnotherTenantContactListAsync) | **POST** /api/v2/CrmService/Contacts/Organizations/Upsert | Upsert a tenant onto another tenant&#39;s contact list |
| [**upsertUserOntoAnotherTenantContactListAsync**](ContactsApi.md#upsertUserOntoAnotherTenantContactListAsync) | **POST** /api/v2/CrmService/Contacts/Individuals/Upsert | Upsert a user onto a tenant&#39;s contact list |
| [**verifyContactEmailAsync**](ContactsApi.md#verifyContactEmailAsync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Emails/{emailId}/Verify | Verify a contact email address |


<a id="createContactAsync"></a>
# **createContactAsync**
> EmptyEnvelope createContactAsync(tenantId, apiVersion, xApiVersion, contactCreateDto)

Create a new contact

Create a new contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactCreateDto : ContactCreateDto =  // ContactCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createContactAsync(tenantId, apiVersion, xApiVersion, contactCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#createContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#createContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactCreateDto** | [**ContactCreateDto**](ContactCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createContactEmailAsync"></a>
# **createContactEmailAsync**
> createContactEmailAsync(contactId, tenantId, apiVersion, xApiVersion, contactEmailCreateDto)

Add an email address to a contact

Creates a new email address for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactEmailCreateDto : ContactEmailCreateDto =  // ContactEmailCreateDto | 
try {
    apiInstance.createContactEmailAsync(contactId, tenantId, apiVersion, xApiVersion, contactEmailCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#createContactEmailAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#createContactEmailAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactEmailCreateDto** | [**ContactEmailCreateDto**](ContactEmailCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createProfileForContactAsync"></a>
# **createProfileForContactAsync**
> createProfileForContactAsync(contactId, tenantId, apiVersion, xApiVersion, contactProfileCreateDto)

Create a contact profile

Creates a new profile for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactProfileCreateDto : ContactProfileCreateDto =  // ContactProfileCreateDto | 
try {
    apiInstance.createProfileForContactAsync(contactId, tenantId, apiVersion, xApiVersion, contactProfileCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#createProfileForContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#createProfileForContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="deleteContactAsync"></a>
# **deleteContactAsync**
> EmptyEnvelope deleteContactAsync(contactId, tenantId, apiVersion, xApiVersion)

Delete a contact

Delete a contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteContactAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#deleteContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#deleteContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="deleteContactEmailAsync"></a>
# **deleteContactEmailAsync**
> deleteContactEmailAsync(contactId, emailId, tenantId, apiVersion, xApiVersion)

Delete a contact email address

Deletes an email address from the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteContactEmailAsync(contactId, emailId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#deleteContactEmailAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#deleteContactEmailAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **emailId** | **java.util.UUID**|  | |
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

<a id="deleteProfileForContactAsync"></a>
# **deleteProfileForContactAsync**
> deleteProfileForContactAsync(contactId, profileId, tenantId, apiVersion, xApiVersion)

Delete a contact profile

Deletes a profile for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val profileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteProfileForContactAsync(contactId, profileId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#deleteProfileForContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#deleteProfileForContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **profileId** | **java.util.UUID**|  | |
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

<a id="getBusinessOwnedIndividualAsync"></a>
# **getBusinessOwnedIndividualAsync**
> ContactDtoEnvelope getBusinessOwnedIndividualAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a Contact of type Individual by ID

Get a Contact of type Individual by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoEnvelope = apiInstance.getBusinessOwnedIndividualAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getBusinessOwnedIndividualAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getBusinessOwnedIndividualAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessOwnedIndividualsAsync"></a>
# **getBusinessOwnedIndividualsAsync**
> ContactDtoListEnvelope getBusinessOwnedIndividualsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all contacts of type individual

Get all contacts of type individual

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactDtoCollectionQueryParameters : ContactDtoCollectionQueryParameters =  // ContactDtoCollectionQueryParameters | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getBusinessOwnedIndividualsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getBusinessOwnedIndividualsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getBusinessOwnedIndividualsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBusinessOwnedIndividualsCountAsync"></a>
# **getBusinessOwnedIndividualsCountAsync**
> ContactDtoListEnvelope getBusinessOwnedIndividualsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all contacts of type individual count

Get all contacts of type individual count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactDtoCollectionQueryParameters : ContactDtoCollectionQueryParameters =  // ContactDtoCollectionQueryParameters | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getBusinessOwnedIndividualsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getBusinessOwnedIndividualsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getBusinessOwnedIndividualsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBusinessOwnedOrganizationAsync"></a>
# **getBusinessOwnedOrganizationAsync**
> ContactDtoEnvelope getBusinessOwnedOrganizationAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a Contact of type Organization by ID

Get a Contact of type Organization by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoEnvelope = apiInstance.getBusinessOwnedOrganizationAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getBusinessOwnedOrganizationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getBusinessOwnedOrganizationAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessOwnedOrganizationsAsync"></a>
# **getBusinessOwnedOrganizationsAsync**
> kotlin.collections.List&lt;ContactDto&gt; getBusinessOwnedOrganizationsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all contacts of type organization

Get all contacts of type organization

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactDtoCollectionQueryParameters : ContactDtoCollectionQueryParameters =  // ContactDtoCollectionQueryParameters | 
try {
    val result : kotlin.collections.List<ContactDto> = apiInstance.getBusinessOwnedOrganizationsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getBusinessOwnedOrganizationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getBusinessOwnedOrganizationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**kotlin.collections.List&lt;ContactDto&gt;**](ContactDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBusinessOwnedOrganizationsCountAsync"></a>
# **getBusinessOwnedOrganizationsCountAsync**
> ContactDtoListEnvelope getBusinessOwnedOrganizationsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all contacts of type organization count

Get all contacts of type organization count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactDtoCollectionQueryParameters : ContactDtoCollectionQueryParameters =  // ContactDtoCollectionQueryParameters | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getBusinessOwnedOrganizationsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getBusinessOwnedOrganizationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getBusinessOwnedOrganizationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getContactAsync"></a>
# **getContactAsync**
> ContactDtoEnvelope getContactAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a contact by ID

Get a contact by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoEnvelope = apiInstance.getContactAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactAvatarAsync"></a>
# **getContactAvatarAsync**
> EmptyEnvelope getContactAvatarAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a contact&#39;s avatar

Get a contact&#39;s avatar

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getContactAvatarAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactAvatarAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactAvatarAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="getContactCartAsync"></a>
# **getContactCartAsync**
> CartDtoEnvelope getContactCartAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a contact&#39;s cart

Get a contact&#39;s cart

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CartDtoEnvelope = apiInstance.getContactCartAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactCartAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactCartAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactEmailsAsync"></a>
# **getContactEmailsAsync**
> ContactEmailDtoListEnvelope getContactEmailsAsync(contactId, tenantId, apiVersion, xApiVersion, contactEmailDtoCollectionQueryParameters)

Get a contact&#39;s email addresses

Get all email addresses for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactEmailDtoCollectionQueryParameters : ContactEmailDtoCollectionQueryParameters =  // ContactEmailDtoCollectionQueryParameters | 
try {
    val result : ContactEmailDtoListEnvelope = apiInstance.getContactEmailsAsync(contactId, tenantId, apiVersion, xApiVersion, contactEmailDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactEmailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactEmailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactEmailDtoCollectionQueryParameters** | [**ContactEmailDtoCollectionQueryParameters**](ContactEmailDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactEmailDtoListEnvelope**](ContactEmailDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getContactEmailsCountAsync"></a>
# **getContactEmailsCountAsync**
> Int32Envelope getContactEmailsCountAsync(contactId, tenantId, apiVersion, xApiVersion, contactEmailDtoCollectionQueryParameters)

Get contact email addresses count

Returns the count of email addresses for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactEmailDtoCollectionQueryParameters : ContactEmailDtoCollectionQueryParameters =  // ContactEmailDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getContactEmailsCountAsync(contactId, tenantId, apiVersion, xApiVersion, contactEmailDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactEmailsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactEmailsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactEmailDtoCollectionQueryParameters** | [**ContactEmailDtoCollectionQueryParameters**](ContactEmailDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getContactSocialProfileAsync"></a>
# **getContactSocialProfileAsync**
> SocialProfileDtoEnvelope getContactSocialProfileAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a contact&#39;s social profile

Get a contact&#39;s social profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialProfileDtoEnvelope = apiInstance.getContactSocialProfileAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactSocialProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactSocialProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialProfileDtoEnvelope**](SocialProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactWalletAsync"></a>
# **getContactWalletAsync**
> WalletDtoEnvelope getContactWalletAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a contact&#39;s wallet

Get a contact&#39;s wallet

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WalletDtoEnvelope = apiInstance.getContactWalletAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactWalletAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactWalletAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WalletDtoEnvelope**](WalletDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactsAsync"></a>
# **getContactsAsync**
> ContactDtoListEnvelope getContactsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all business owned contacts

Get all business owned contacts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactDtoCollectionQueryParameters : ContactDtoCollectionQueryParameters =  // ContactDtoCollectionQueryParameters | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getContactsAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getContactsCountAsync"></a>
# **getContactsCountAsync**
> ContactDtoListEnvelope getContactsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)

Get all business owned contacts count

Get all business owned contacts count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactDtoCollectionQueryParameters : ContactDtoCollectionQueryParameters =  // ContactDtoCollectionQueryParameters | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getContactsCountAsync(tenantId, apiVersion, xApiVersion, contactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getContactsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getContactsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactDtoCollectionQueryParameters** | [**ContactDtoCollectionQueryParameters**](ContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getExtendedBusinessOwnedIndividualsAsync"></a>
# **getExtendedBusinessOwnedIndividualsAsync**
> ExtendedContactDtoListEnvelope getExtendedBusinessOwnedIndividualsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)

Get all contacts of type individual

Get all contacts of type individual

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val extendedContactDtoCollectionQueryParameters : ExtendedContactDtoCollectionQueryParameters =  // ExtendedContactDtoCollectionQueryParameters | 
try {
    val result : ExtendedContactDtoListEnvelope = apiInstance.getExtendedBusinessOwnedIndividualsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getExtendedBusinessOwnedIndividualsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getExtendedBusinessOwnedIndividualsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **extendedContactDtoCollectionQueryParameters** | [**ExtendedContactDtoCollectionQueryParameters**](ExtendedContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExtendedContactDtoListEnvelope**](ExtendedContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getExtendedBusinessOwnedOrganizationsAsync"></a>
# **getExtendedBusinessOwnedOrganizationsAsync**
> ExtendedContactDtoListEnvelope getExtendedBusinessOwnedOrganizationsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)

Get all contacts of type organization

Get all contacts of type organization

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val extendedContactDtoCollectionQueryParameters : ExtendedContactDtoCollectionQueryParameters =  // ExtendedContactDtoCollectionQueryParameters | 
try {
    val result : ExtendedContactDtoListEnvelope = apiInstance.getExtendedBusinessOwnedOrganizationsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getExtendedBusinessOwnedOrganizationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getExtendedBusinessOwnedOrganizationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **extendedContactDtoCollectionQueryParameters** | [**ExtendedContactDtoCollectionQueryParameters**](ExtendedContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExtendedContactDtoListEnvelope**](ExtendedContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getExtendedContactAsync"></a>
# **getExtendedContactAsync**
> ExtendedContactDtoEnvelope getExtendedContactAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a contact by ID

Get a contact by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedContactDtoEnvelope = apiInstance.getExtendedContactAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getExtendedContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getExtendedContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedContactDtoEnvelope**](ExtendedContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedContactsAsync"></a>
# **getExtendedContactsAsync**
> ExtendedContactDtoListEnvelope getExtendedContactsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)

Get all business owned contacts

Get all business owned contacts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val extendedContactDtoCollectionQueryParameters : ExtendedContactDtoCollectionQueryParameters =  // ExtendedContactDtoCollectionQueryParameters | 
try {
    val result : ExtendedContactDtoListEnvelope = apiInstance.getExtendedContactsAsync(tenantId, apiVersion, xApiVersion, extendedContactDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getExtendedContactsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getExtendedContactsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **extendedContactDtoCollectionQueryParameters** | [**ExtendedContactDtoCollectionQueryParameters**](ExtendedContactDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExtendedContactDtoListEnvelope**](ExtendedContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getIndividualRelatedIndividualsAsync"></a>
# **getIndividualRelatedIndividualsAsync**
> ContactDtoListEnvelope getIndividualRelatedIndividualsAsync(contactId, tenantId, apiVersion, xApiVersion)

Get individual related individuals

Get individual related individuals

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getIndividualRelatedIndividualsAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getIndividualRelatedIndividualsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getIndividualRelatedIndividualsAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIndividualRelatedOrganizationsAsync"></a>
# **getIndividualRelatedOrganizationsAsync**
> ContactDtoListEnvelope getIndividualRelatedOrganizationsAsync(contactId, tenantId, apiVersion, xApiVersion)

Get individual related organizations

Get individual related organizations

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getIndividualRelatedOrganizationsAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getIndividualRelatedOrganizationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getIndividualRelatedOrganizationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrganizationRelatedIndividualsAsync"></a>
# **getOrganizationRelatedIndividualsAsync**
> ContactDtoListEnvelope getOrganizationRelatedIndividualsAsync(contactId, tenantId, apiVersion, xApiVersion)

Get organization related individuals

Get organization related individuals

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getOrganizationRelatedIndividualsAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getOrganizationRelatedIndividualsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getOrganizationRelatedIndividualsAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOrganizationRelatedOrganizationsAsync"></a>
# **getOrganizationRelatedOrganizationsAsync**
> ContactDtoListEnvelope getOrganizationRelatedOrganizationsAsync(contactId, tenantId, apiVersion, xApiVersion)

Get organization related organizations

Get organization related organizations

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoListEnvelope = apiInstance.getOrganizationRelatedOrganizationsAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getOrganizationRelatedOrganizationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getOrganizationRelatedOrganizationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoListEnvelope**](ContactDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProfilesForContactAsync"></a>
# **getProfilesForContactAsync**
> ContactProfileDtoListEnvelope getProfilesForContactAsync(contactId, tenantId, apiVersion, xApiVersion)

Get a contact&#39;s social profiles

Get a contact&#39;s social profiles

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactProfileDtoListEnvelope = apiInstance.getProfilesForContactAsync(contactId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getProfilesForContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getProfilesForContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="getProfilesForContactCountAsync"></a>
# **getProfilesForContactCountAsync**
> Int32Envelope getProfilesForContactCountAsync(contactId, tenantId, apiVersion, xApiVersion, contactProfileDtoCollectionQueryParameters)

Get contact profiles count

Returns the count of profiles for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactProfileDtoCollectionQueryParameters : ContactProfileDtoCollectionQueryParameters =  // ContactProfileDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getProfilesForContactCountAsync(contactId, tenantId, apiVersion, xApiVersion, contactProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#getProfilesForContactCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#getProfilesForContactCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactProfileDtoCollectionQueryParameters** | [**ContactProfileDtoCollectionQueryParameters**](ContactProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchContactAsync"></a>
# **patchContactAsync**
> EmptyEnvelope patchContactAsync(contactId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a contact

Patch a contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchContactAsync(contactId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#patchContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#patchContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="patchContactEmailAsync"></a>
# **patchContactEmailAsync**
> patchContactEmailAsync(contactId, emailId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a contact email address

Partially updates an existing email address for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    apiInstance.patchContactEmailAsync(contactId, emailId, tenantId, apiVersion, xApiVersion, patchOperation)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#patchContactEmailAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#patchContactEmailAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **emailId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="previewContactEmailTemplate"></a>
# **previewContactEmailTemplate**
> previewContactEmailTemplate(contactId, apiVersion, xApiVersion, emailDispatchRequest)

Preview the rendered email for a contact.

This action is only available for global administrators (business_owner role).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    apiInstance.previewContactEmailTemplate(contactId, apiVersion, xApiVersion, emailDispatchRequest)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#previewContactEmailTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#previewContactEmailTemplate")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="sendContactEmail"></a>
# **sendContactEmail**
> sendContactEmail(contactId, apiVersion, xApiVersion, emailDispatchRequest)

Send an email to a contact.

This action is only available for global administrators (business_owner role).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    apiInstance.sendContactEmail(contactId, apiVersion, xApiVersion, emailDispatchRequest)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#sendContactEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#sendContactEmail")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="updateContactAsync"></a>
# **updateContactAsync**
> EmptyEnvelope updateContactAsync(contactId, tenantId, apiVersion, xApiVersion, contactUpdateDto)

Update a contact

Update a contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactUpdateDto : ContactUpdateDto =  // ContactUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateContactAsync(contactId, tenantId, apiVersion, xApiVersion, contactUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#updateContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#updateContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactUpdateDto** | [**ContactUpdateDto**](ContactUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateContactAvatarAsync"></a>
# **updateContactAvatarAsync**
> EmptyEnvelope updateContactAvatarAsync(contactId, tenantId, apiVersion, xApiVersion, avatar)

Update a contact&#39;s avatar

Update a contact&#39;s avatar

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val avatar : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : EmptyEnvelope = apiInstance.updateContactAvatarAsync(contactId, tenantId, apiVersion, xApiVersion, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#updateContactAvatarAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#updateContactAvatarAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **avatar** | **java.io.File**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="updateContactEmailAsync"></a>
# **updateContactEmailAsync**
> updateContactEmailAsync(contactId, emailId, tenantId, apiVersion, xApiVersion, contactEmailUpdateDto)

Update a contact email address

Updates an existing email address for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactEmailUpdateDto : ContactEmailUpdateDto =  // ContactEmailUpdateDto | 
try {
    apiInstance.updateContactEmailAsync(contactId, emailId, tenantId, apiVersion, xApiVersion, contactEmailUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#updateContactEmailAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#updateContactEmailAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **emailId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **contactEmailUpdateDto** | [**ContactEmailUpdateDto**](ContactEmailUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateProfileForContactAsync"></a>
# **updateProfileForContactAsync**
> updateProfileForContactAsync(contactId, profileId, tenantId, apiVersion, xApiVersion, contactProfileUpdateDto)

Update a contact profile

Updates an existing profile for the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val profileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val contactProfileUpdateDto : ContactProfileUpdateDto =  // ContactProfileUpdateDto | 
try {
    apiInstance.updateProfileForContactAsync(contactId, profileId, tenantId, apiVersion, xApiVersion, contactProfileUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#updateProfileForContactAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#updateProfileForContactAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **profileId** | **java.util.UUID**|  | |
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

<a id="upsertTenantOntoAnotherTenantContactListAsync"></a>
# **upsertTenantOntoAnotherTenantContactListAsync**
> ContactDtoEnvelope upsertTenantOntoAnotherTenantContactListAsync(tenantId, relatedTenantId, apiVersion, xApiVersion)

Upsert a tenant onto another tenant&#39;s contact list

Upsert a tenant onto another tenant&#39;s contact list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val relatedTenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoEnvelope = apiInstance.upsertTenantOntoAnotherTenantContactListAsync(tenantId, relatedTenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#upsertTenantOntoAnotherTenantContactListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#upsertTenantOntoAnotherTenantContactListAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **relatedTenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="upsertUserOntoAnotherTenantContactListAsync"></a>
# **upsertUserOntoAnotherTenantContactListAsync**
> ContactDtoEnvelope upsertUserOntoAnotherTenantContactListAsync(tenantId, relatedUserId, apiVersion, xApiVersion)

Upsert a user onto a tenant&#39;s contact list

Upsert a user onto a tenant&#39;s contact list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val relatedUserId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ContactDtoEnvelope = apiInstance.upsertUserOntoAnotherTenantContactListAsync(tenantId, relatedUserId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#upsertUserOntoAnotherTenantContactListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#upsertUserOntoAnotherTenantContactListAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **relatedUserId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ContactDtoEnvelope**](ContactDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="verifyContactEmailAsync"></a>
# **verifyContactEmailAsync**
> verifyContactEmailAsync(contactId, emailId, tenantId, apiVersion, xApiVersion)

Verify a contact email address

Marks an email address as verified on the specified contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.verifyContactEmailAsync(contactId, emailId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ContactsApi#verifyContactEmailAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactsApi#verifyContactEmailAsync")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **emailId** | **java.util.UUID**|  | |
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

