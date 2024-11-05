# org.openapitools.client - Kotlin client library for SystemService

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
| *AntiforgeryApi* | [**apiV2SystemServiceAntiforgeryGetAndStoreTokensGet**](docs/AntiforgeryApi.md#apiv2systemserviceantiforgerygetandstoretokensget) | **GET** /api/v2/SystemService/Antiforgery/GetAndStoreTokens |  |
| *AntiforgeryApi* | [**apiV2SystemServiceAntiforgeryIsRequestValidGet**](docs/AntiforgeryApi.md#apiv2systemserviceantiforgeryisrequestvalidget) | **GET** /api/v2/SystemService/Antiforgery/IsRequestValid |  |
| *LicensesApi* | [**apiLicensingLicensesGeneratePost**](docs/LicensesApi.md#apilicensinglicensesgeneratepost) | **POST** /api/Licensing/Licenses/Generate |  |
| *LicensesApi* | [**apiLicensingLicensesValidateAttributesGet**](docs/LicensesApi.md#apilicensinglicensesvalidateattributesget) | **GET** /api/Licensing/Licenses/Validate/Attributes |  |
| *LicensesApi* | [**apiLicensingLicensesValidateErrorsGet**](docs/LicensesApi.md#apilicensinglicensesvalidateerrorsget) | **GET** /api/Licensing/Licenses/Validate/Errors |  |
| *LicensesApi* | [**apiLicensingLicensesValidateGet**](docs/LicensesApi.md#apilicensinglicensesvalidateget) | **GET** /api/Licensing/Licenses/Validate |  |
| *LicensingApi* | [**apiV2SystemServiceLicensingLicensesGet**](docs/LicensingApi.md#apiv2systemservicelicensinglicensesget) | **GET** /api/v2/SystemService/Licensing/Licenses |  |
| *LicensingApi* | [**apiV2SystemServiceLicensingLicensesLicenseIdAssignmentsGet**](docs/LicensingApi.md#apiv2systemservicelicensinglicenseslicenseidassignmentsget) | **GET** /api/v2/SystemService/Licensing/Licenses/{licenseId}/Assignments |  |
| *LicensingApi* | [**apiV2SystemServiceLicensingLicensesLicenseIdAttributesGet**](docs/LicensingApi.md#apiv2systemservicelicensinglicenseslicenseidattributesget) | **GET** /api/v2/SystemService/Licensing/Licenses/{licenseId}/Attributes |  |
| *LicensingApi* | [**apiV2SystemServiceLicensingLicensesLicenseIdFeaturesGet**](docs/LicensingApi.md#apiv2systemservicelicensinglicenseslicenseidfeaturesget) | **GET** /api/v2/SystemService/Licensing/Licenses/{licenseId}/Features |  |
| *LicensingApi* | [**apiV2SystemServiceLicensingLicensesLicenseIdGet**](docs/LicensingApi.md#apiv2systemservicelicensinglicenseslicenseidget) | **GET** /api/v2/SystemService/Licensing/Licenses/{licenseId} |  |
| *LicensingApi* | [**apiV2SystemServiceLicensingLicensesLicenseIdQuotaGet**](docs/LicensingApi.md#apiv2systemservicelicensinglicenseslicenseidquotaget) | **GET** /api/v2/SystemService/Licensing/Licenses/{licenseId}/Quota |  |
| *LicensingApi* | [**apiV2SystemServiceLicensingLicensesRedeemPost**](docs/LicensingApi.md#apiv2systemservicelicensinglicensesredeempost) | **POST** /api/v2/SystemService/Licensing/Licenses/Redeem |  |
| *LicensingApi* | [**apiV2SystemServiceLicensingLicensesValidatePost**](docs/LicensingApi.md#apiv2systemservicelicensinglicensesvalidatepost) | **POST** /api/v2/SystemService/Licensing/Licenses/Validate |  |
| *MigrationsApi* | [**apiV2SystemServiceMigrationsGet**](docs/MigrationsApi.md#apiv2systemservicemigrationsget) | **GET** /api/v2/SystemService/Migrations |  |
| *MigrationsApi* | [**apiV2SystemServiceMigrationsMigratePost**](docs/MigrationsApi.md#apiv2systemservicemigrationsmigratepost) | **POST** /api/v2/SystemService/Migrations/Migrate |  |
| *ModulesApi* | [**getAllModules**](docs/ModulesApi.md#getallmodules) | **GET** /api/v2/StudioService/Modules | Get all modules available on this suite server instance. |
| *ModulesApi* | [**getAvailableModules**](docs/ModulesApi.md#getavailablemodules) | **GET** /api/v2/StudioService/Modules/Data | Get all modules available to a tenant user. |
| *TenantsApi* | [**createTenant**](docs/TenantsApi.md#createtenant) | **POST** /api/v2/SystemService/Tenants | Create a new tenant. |
| *TenantsApi* | [**deleteTenant**](docs/TenantsApi.md#deletetenant) | **DELETE** /api/v2/SystemService/Tenants/{tenantId} | Delete a specific tenant by ID. |
| *TenantsApi* | [**getAllExtendedTenants**](docs/TenantsApi.md#getallextendedtenants) | **GET** /api/v2/SystemService/Tenants/Extended | Get all extended tenants available on this suite server instance. |
| *TenantsApi* | [**getAllTenants**](docs/TenantsApi.md#getalltenants) | **GET** /api/v2/SystemService/Tenants | Get all tenants available on this suite server instance. |
| *TenantsApi* | [**getExtendedTenantsCount**](docs/TenantsApi.md#getextendedtenantscount) | **GET** /api/v2/SystemService/Tenants/Extended/Count | Get the total count of extended tenants available on this suite server instance. |
| *TenantsApi* | [**getTenant**](docs/TenantsApi.md#gettenant) | **GET** /api/v2/SystemService/Tenants/{tenantId} | Get a specific tenant by ID. |
| *TenantsApi* | [**getTenantsCount**](docs/TenantsApi.md#gettenantscount) | **GET** /api/v2/SystemService/Tenants/Count | Get the total count of tenants available on this suite server instance. |
| *TenantsApi* | [**updateTenant**](docs/TenantsApi.md#updatetenant) | **PUT** /api/v2/SystemService/Tenants/{tenantId} | Update a specific tenant by ID. |
| *UsersApi* | [**apiV2SystemServiceUsersCountGet**](docs/UsersApi.md#apiv2systemserviceuserscountget) | **GET** /api/v2/SystemService/Users/Count |  |
| *UsersApi* | [**apiV2SystemServiceUsersExtendedCountGet**](docs/UsersApi.md#apiv2systemserviceusersextendedcountget) | **GET** /api/v2/SystemService/Users/Extended/Count |  |
| *UsersApi* | [**apiV2SystemServiceUsersExtendedGet**](docs/UsersApi.md#apiv2systemserviceusersextendedget) | **GET** /api/v2/SystemService/Users/Extended |  |
| *UsersApi* | [**apiV2SystemServiceUsersGet**](docs/UsersApi.md#apiv2systemserviceusersget) | **GET** /api/v2/SystemService/Users |  |
| *UsersApi* | [**apiV2SystemServiceUsersPost**](docs/UsersApi.md#apiv2systemserviceuserspost) | **POST** /api/v2/SystemService/Users |  |
| *UsersApi* | [**apiV2SystemServiceUsersUserIdDelete**](docs/UsersApi.md#apiv2systemserviceusersuseriddelete) | **DELETE** /api/v2/SystemService/Users/{userId} |  |
| *UsersApi* | [**apiV2SystemServiceUsersUserIdExtendedGet**](docs/UsersApi.md#apiv2systemserviceusersuseridextendedget) | **GET** /api/v2/SystemService/Users/{userId}/Extended |  |
| *UsersApi* | [**apiV2SystemServiceUsersUserIdPut**](docs/UsersApi.md#apiv2systemserviceusersuseridput) | **PUT** /api/v2/SystemService/Users/{userId} |  |
| *UsersApi* | [**getUserAsync**](docs/UsersApi.md#getuserasync) | **GET** /api/v2/SystemService/Users/{userId} |  |


<a id="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AccountHolderCreateDto](docs/AccountHolderCreateDto.md)
 - [org.openapitools.client.models.AdditionalAttribute](docs/AdditionalAttribute.md)
 - [org.openapitools.client.models.BooleanEnvelope](docs/BooleanEnvelope.md)
 - [org.openapitools.client.models.CartDto](docs/CartDto.md)
 - [org.openapitools.client.models.EmptyEnvelope](docs/EmptyEnvelope.md)
 - [org.openapitools.client.models.ErrorEnvelope](docs/ErrorEnvelope.md)
 - [org.openapitools.client.models.ExtendedTenantDto](docs/ExtendedTenantDto.md)
 - [org.openapitools.client.models.ExtendedTenantDtoListEnvelope](docs/ExtendedTenantDtoListEnvelope.md)
 - [org.openapitools.client.models.ExtendedUserDto](docs/ExtendedUserDto.md)
 - [org.openapitools.client.models.ExtendedUserDtoEnvelope](docs/ExtendedUserDtoEnvelope.md)
 - [org.openapitools.client.models.ExtendedUserDtoListEnvelope](docs/ExtendedUserDtoListEnvelope.md)
 - [org.openapitools.client.models.GeneralValidationFailure](docs/GeneralValidationFailure.md)
 - [org.openapitools.client.models.GeneralValidationFailureListEnvelope](docs/GeneralValidationFailureListEnvelope.md)
 - [org.openapitools.client.models.ISwaggerContact](docs/ISwaggerContact.md)
 - [org.openapitools.client.models.ISwaggerEndpoint](docs/ISwaggerEndpoint.md)
 - [org.openapitools.client.models.ISwaggerLicense](docs/ISwaggerLicense.md)
 - [org.openapitools.client.models.ISwaggerSpec](docs/ISwaggerSpec.md)
 - [org.openapitools.client.models.Int32Envelope](docs/Int32Envelope.md)
 - [org.openapitools.client.models.LicenseAttributesListEnvelope](docs/LicenseAttributesListEnvelope.md)
 - [org.openapitools.client.models.LicenseFeature](docs/LicenseFeature.md)
 - [org.openapitools.client.models.LicenseKey](docs/LicenseKey.md)
 - [org.openapitools.client.models.LicenseKeyRequest](docs/LicenseKeyRequest.md)
 - [org.openapitools.client.models.LicenseValidationError](docs/LicenseValidationError.md)
 - [org.openapitools.client.models.LicenseValidationErrorListEnvelope](docs/LicenseValidationErrorListEnvelope.md)
 - [org.openapitools.client.models.LicenseValidationRequest](docs/LicenseValidationRequest.md)
 - [org.openapitools.client.models.Module](docs/Module.md)
 - [org.openapitools.client.models.ModuleListEnvelope](docs/ModuleListEnvelope.md)
 - [org.openapitools.client.models.SocialProfileDto](docs/SocialProfileDto.md)
 - [org.openapitools.client.models.StringEnvelope](docs/StringEnvelope.md)
 - [org.openapitools.client.models.StringListEnvelope](docs/StringListEnvelope.md)
 - [org.openapitools.client.models.StudioModule](docs/StudioModule.md)
 - [org.openapitools.client.models.StudioModuleListEnvelope](docs/StudioModuleListEnvelope.md)
 - [org.openapitools.client.models.SuiteLicenseAssignmentDto](docs/SuiteLicenseAssignmentDto.md)
 - [org.openapitools.client.models.SuiteLicenseAssignmentDtoListEnvelope](docs/SuiteLicenseAssignmentDtoListEnvelope.md)
 - [org.openapitools.client.models.SuiteLicenseDto](docs/SuiteLicenseDto.md)
 - [org.openapitools.client.models.SuiteLicenseDtoEnvelope](docs/SuiteLicenseDtoEnvelope.md)
 - [org.openapitools.client.models.SuiteLicenseDtoListEnvelope](docs/SuiteLicenseDtoListEnvelope.md)
 - [org.openapitools.client.models.TenantCreateDto](docs/TenantCreateDto.md)
 - [org.openapitools.client.models.TenantDto](docs/TenantDto.md)
 - [org.openapitools.client.models.TenantDtoEnvelope](docs/TenantDtoEnvelope.md)
 - [org.openapitools.client.models.TenantDtoListEnvelope](docs/TenantDtoListEnvelope.md)
 - [org.openapitools.client.models.TenantUpdateDto](docs/TenantUpdateDto.md)
 - [org.openapitools.client.models.UserDto](docs/UserDto.md)
 - [org.openapitools.client.models.UserDtoEnvelope](docs/UserDtoEnvelope.md)
 - [org.openapitools.client.models.UserDtoListEnvelope](docs/UserDtoListEnvelope.md)
 - [org.openapitools.client.models.UserSettingsDto](docs/UserSettingsDto.md)
 - [org.openapitools.client.models.WalletDto](docs/WalletDto.md)


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