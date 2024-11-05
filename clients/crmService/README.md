# org.openapitools.client - Kotlin client library for CrmService

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 2.0.1.4089
- Package version: 
- Generator version: 7.9.0
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen
For more information, please visit [https://fenixalliance.com.co/Support](https://fenixalliance.com.co/Support)

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a id="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://localhost*

| Class | Method | HTTP request | Description |
| ------------ | ------------- | ------------- | ------------- |
| *ContactsApi* | [**createContactAsync**](docs/ContactsApi.md#createcontactasync) | **POST** /api/v2/CrmService/Contacts | Create a new contact |
| *ContactsApi* | [**deleteContactAsync**](docs/ContactsApi.md#deletecontactasync) | **DELETE** /api/v2/CrmService/Contacts/{contactId} | Delete a contact |
| *ContactsApi* | [**getBusinessOwnedIndividualAsync**](docs/ContactsApi.md#getbusinessownedindividualasync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId} | Get a Contact of type Individual by ID |
| *ContactsApi* | [**getBusinessOwnedIndividualsAsync**](docs/ContactsApi.md#getbusinessownedindividualsasync) | **GET** /api/v2/CrmService/Contacts/Individuals | Get all contacts of type individual |
| *ContactsApi* | [**getBusinessOwnedIndividualsCountAsync**](docs/ContactsApi.md#getbusinessownedindividualscountasync) | **GET** /api/v2/CrmService/Contacts/Individuals/Count | Get all contacts of type individual count |
| *ContactsApi* | [**getBusinessOwnedOrganizationAsync**](docs/ContactsApi.md#getbusinessownedorganizationasync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId} | Get a Contact of type Organization by ID |
| *ContactsApi* | [**getBusinessOwnedOrganizationsAsync**](docs/ContactsApi.md#getbusinessownedorganizationsasync) | **GET** /api/v2/CrmService/Contacts/Organizations | Get all contacts of type organization |
| *ContactsApi* | [**getBusinessOwnedOrganizationsCountAsync**](docs/ContactsApi.md#getbusinessownedorganizationscountasync) | **GET** /api/v2/CrmService/Contacts/Organizations/Count | Get all contacts of type organization count |
| *ContactsApi* | [**getContactAsync**](docs/ContactsApi.md#getcontactasync) | **GET** /api/v2/CrmService/Contacts/{contactId} | Get a contact by ID |
| *ContactsApi* | [**getContactAvatarAsync**](docs/ContactsApi.md#getcontactavatarasync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Avatar | Get a contact's avatar |
| *ContactsApi* | [**getContactCartAsync**](docs/ContactsApi.md#getcontactcartasync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Cart | Get a contact's cart |
| *ContactsApi* | [**getContactProfilesAsync**](docs/ContactsApi.md#getcontactprofilesasync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Profiles | Get a contact's social profiles |
| *ContactsApi* | [**getContactSocialProfileAsync**](docs/ContactsApi.md#getcontactsocialprofileasync) | **GET** /api/v2/CrmService/Contacts/{contactId}/SocialProfile | Get a contact's social profile |
| *ContactsApi* | [**getContactWalletAsync**](docs/ContactsApi.md#getcontactwalletasync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Wallet | Get a contact's wallet |
| *ContactsApi* | [**getContactsAsync**](docs/ContactsApi.md#getcontactsasync) | **GET** /api/v2/CrmService/Contacts | Get all business owned contacts |
| *ContactsApi* | [**getContactsCountAsync**](docs/ContactsApi.md#getcontactscountasync) | **GET** /api/v2/CrmService/Contacts/Count | Get all business owned contacts count |
| *ContactsApi* | [**getExtendedBusinessOwnedIndividualsAsync**](docs/ContactsApi.md#getextendedbusinessownedindividualsasync) | **GET** /api/v2/CrmService/Contacts/Individuals/Extended | Get all contacts of type individual |
| *ContactsApi* | [**getExtendedBusinessOwnedOrganizationsAsync**](docs/ContactsApi.md#getextendedbusinessownedorganizationsasync) | **GET** /api/v2/CrmService/Contacts/Organizations/Extended | Get all contacts of type organization |
| *ContactsApi* | [**getExtendedContactAsync**](docs/ContactsApi.md#getextendedcontactasync) | **GET** /api/v2/CrmService/Contacts/{contactId}/Extended | Get a contact by ID |
| *ContactsApi* | [**getExtendedContactsAsync**](docs/ContactsApi.md#getextendedcontactsasync) | **GET** /api/v2/CrmService/Contacts/Extended | Get all business owned contacts |
| *ContactsApi* | [**getIndividualRelatedIndividualsAsync**](docs/ContactsApi.md#getindividualrelatedindividualsasync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId}/Individuals | Get individual related individuals |
| *ContactsApi* | [**getIndividualRelatedOrganizationsAsync**](docs/ContactsApi.md#getindividualrelatedorganizationsasync) | **GET** /api/v2/CrmService/Contacts/Individuals/{contactId}/Organizations | Get individual related organizations |
| *ContactsApi* | [**getOrganizationRelatedIndividualsAsync**](docs/ContactsApi.md#getorganizationrelatedindividualsasync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId}/Individuals | Get organization related individuals |
| *ContactsApi* | [**getOrganizationRelatedOrganizationsAsync**](docs/ContactsApi.md#getorganizationrelatedorganizationsasync) | **GET** /api/v2/CrmService/Contacts/Organizations/{contactId}/Organizations | Get organization related organizations |
| *ContactsApi* | [**patchContactAsync**](docs/ContactsApi.md#patchcontactasync) | **PATCH** /api/v2/CrmService/Contacts/{contactId} | Patch a contact |
| *ContactsApi* | [**updateContactAsync**](docs/ContactsApi.md#updatecontactasync) | **PUT** /api/v2/CrmService/Contacts/{contactId} | Update a contact |
| *ContactsApi* | [**updateContactAvatarAsync**](docs/ContactsApi.md#updatecontactavatarasync) | **POST** /api/v2/CrmService/Contacts/{contactId}/Avatar | Update a contact's avatar |
| *ContactsApi* | [**upsertTenantOntoAnotherTenantContactListAsync**](docs/ContactsApi.md#upserttenantontoanothertenantcontactlistasync) | **POST** /api/v2/CrmService/Contacts/Organizations/Upsert | Upsert a tenant onto another tenant's contact list |
| *ContactsApi* | [**upsertUserOntoAnotherTenantContactListAsync**](docs/ContactsApi.md#upsertuserontoanothertenantcontactlistasync) | **POST** /api/v2/CrmService/Contacts/Individuals/Upsert | Upsert a user onto a tenant's contact list |
| *SyncApi* | [**apiV2CrmServiceSyncMePost**](docs/SyncApi.md#apiv2crmservicesyncmepost) | **POST** /api/v2/CrmService/Sync/Me |  |
| *SyncApi* | [**apiV2CrmServiceSyncPost**](docs/SyncApi.md#apiv2crmservicesyncpost) | **POST** /api/v2/CrmService/Sync |  |
| *SyncApi* | [**apiV2CrmServiceSyncTenantPost**](docs/SyncApi.md#apiv2crmservicesynctenantpost) | **POST** /api/v2/CrmService/Sync/Tenant |  |
| *SyncApi* | [**apiV2CrmServiceSyncUserPost**](docs/SyncApi.md#apiv2crmservicesyncuserpost) | **POST** /api/v2/CrmService/Sync/User |  |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.CartDto](docs/CartDto.md)
 - [org.openapitools.client.models.CartDtoEnvelope](docs/CartDtoEnvelope.md)
 - [org.openapitools.client.models.ContactCreateDto](docs/ContactCreateDto.md)
 - [org.openapitools.client.models.ContactDto](docs/ContactDto.md)
 - [org.openapitools.client.models.ContactDtoEnvelope](docs/ContactDtoEnvelope.md)
 - [org.openapitools.client.models.ContactDtoListEnvelope](docs/ContactDtoListEnvelope.md)
 - [org.openapitools.client.models.ContactProfileDto](docs/ContactProfileDto.md)
 - [org.openapitools.client.models.ContactProfileDtoListEnvelope](docs/ContactProfileDtoListEnvelope.md)
 - [org.openapitools.client.models.ContactUpdateDto](docs/ContactUpdateDto.md)
 - [org.openapitools.client.models.EmptyEnvelope](docs/EmptyEnvelope.md)
 - [org.openapitools.client.models.ErrorEnvelope](docs/ErrorEnvelope.md)
 - [org.openapitools.client.models.ExtendedContactDto](docs/ExtendedContactDto.md)
 - [org.openapitools.client.models.ExtendedContactDtoEnvelope](docs/ExtendedContactDtoEnvelope.md)
 - [org.openapitools.client.models.ExtendedContactDtoListEnvelope](docs/ExtendedContactDtoListEnvelope.md)
 - [org.openapitools.client.models.Operation](docs/Operation.md)
 - [org.openapitools.client.models.SimpleContactDto](docs/SimpleContactDto.md)
 - [org.openapitools.client.models.SocialProfileDto](docs/SocialProfileDto.md)
 - [org.openapitools.client.models.SocialProfileDtoEnvelope](docs/SocialProfileDtoEnvelope.md)
 - [org.openapitools.client.models.UpdateContactAvatarAsyncRequest](docs/UpdateContactAvatarAsyncRequest.md)
 - [org.openapitools.client.models.WalletDto](docs/WalletDto.md)
 - [org.openapitools.client.models.WalletDtoEnvelope](docs/WalletDtoEnvelope.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Bearer"></a>
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header



## Author

support@fenix-alliance.com