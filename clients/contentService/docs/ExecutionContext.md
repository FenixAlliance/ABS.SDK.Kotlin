
# ExecutionContext

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **isAuthenticated** | **kotlin.Boolean** |  |  [optional] |
| **currentCartId** | **kotlin.String** |  |  [optional] [readonly] |
| **currentUserId** | **kotlin.String** |  |  [optional] [readonly] |
| **currentTenantId** | **kotlin.String** |  |  [optional] [readonly] |
| **currentPortalId** | **kotlin.String** |  |  [optional] [readonly] |
| **currentEnrollmentId** | **kotlin.String** |  |  [optional] [readonly] |
| **currencyId** | **kotlin.String** |  |  [optional] [readonly] |
| **pageSize** | **kotlin.Int** |  |  [optional] |
| **dateFormat** | **kotlin.String** |  |  [optional] |
| **currencyFormat** | **kotlin.String** |  |  [optional] |
| **dateTimeFormat** | **kotlin.String** |  |  [optional] |
| **toDateDataSummaries** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **fromDateDataSummaries** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **authorization** | [**AuthResult**](AuthResult.md) |  |  [optional] |
| **user** | [**ExtendedUserDto**](ExtendedUserDto.md) |  |  [optional] |
| **currentTenant** | [**ExtendedTenantDto**](ExtendedTenantDto.md) |  |  [optional] |
| **currentEnrollment** | [**TenantEnrollmentDto**](TenantEnrollmentDto.md) |  |  [optional] |
| **selectedTenantMappings** | [**CrmContext**](CrmContext.md) |  |  [optional] |
| **portalOwnerMappings** | [**CrmContext**](CrmContext.md) |  |  [optional] |
| **rootTenantMappings** | [**CrmContext**](CrmContext.md) |  |  [optional] |
| **cart** | [**CartDto**](CartDto.md) |  |  [optional] |
| **currency** | [**CurrencyDto**](CurrencyDto.md) |  |  [optional] |
| **forexRates** | [**ForexRatesDto**](ForexRatesDto.md) |  |  [optional] |
| **exchangeRate** | [**Money**](Money.md) |  |  [optional] |
| **country** | [**CountryDto**](CountryDto.md) |  |  [optional] |
| **rootTenant** | [**TenantDto**](TenantDto.md) |  |  [optional] |
| **currentPortal** | [**WebPortalDto**](WebPortalDto.md) |  |  [optional] |
| **tenants** | [**kotlin.collections.List&lt;ExtendedTenantDto&gt;**](ExtendedTenantDto.md) |  |  [optional] |
| **enrollments** | [**kotlin.collections.List&lt;ExtendedTenantEnrollmentDto&gt;**](ExtendedTenantEnrollmentDto.md) |  |  [optional] |
| **availablePortals** | [**kotlin.collections.List&lt;WebPortalDto&gt;**](WebPortalDto.md) |  |  [optional] |
| **invitations** | [**kotlin.collections.List&lt;ExtendedInviteDto&gt;**](ExtendedInviteDto.md) |  |  [optional] |
| **grantedPermissions** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **accessibleFeatures** | [**kotlin.collections.List&lt;SuiteLicenseFeatureDto&gt;**](SuiteLicenseFeatureDto.md) |  |  [optional] |
| **cultureName** | **kotlin.String** |  |  [optional] [readonly] |
| **timezoneId** | **kotlin.String** |  |  [optional] |



