
# ExtendedUserDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **fullName** | **kotlin.String** |  |  [optional] [readonly] |
| **qualifiedName** | **kotlin.String** |  |  [optional] |
| **publicName** | **kotlin.String** |  |  [optional] |
| **lastName** | **kotlin.String** |  |  [optional] |
| **firstName** | **kotlin.String** |  |  [optional] |
| **coverUrl** | **kotlin.String** |  |  [optional] |
| **avatarUrl** | **kotlin.String** |  |  [optional] |
| **gitHubUrl** | **kotlin.String** |  |  [optional] |
| **countryId** | **kotlin.String** |  |  [optional] |
| **timezoneId** | **kotlin.String** |  |  [optional] |
| **websiteUrl** | **kotlin.String** |  |  [optional] |
| **twitterUrl** | **kotlin.String** |  |  [optional] |
| **youTubeUrl** | **kotlin.String** |  |  [optional] |
| **linkedInUrl** | **kotlin.String** |  |  [optional] |
| **facebookUrl** | **kotlin.String** |  |  [optional] |
| **instagramUrl** | **kotlin.String** |  |  [optional] |
| **socialProfileId** | **kotlin.String** |  |  [optional] |
| **birthday** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **idProvider** | **kotlin.String** |  |  [optional] |
| **languageId** | **kotlin.String** |  |  [optional] |
| **gender** | [**inline**](#Gender) |  |  [optional] |
| **cityId** | **kotlin.String** |  |  [optional] |
| **stateId** | **kotlin.String** |  |  [optional] |
| **email** | **kotlin.String** |  |  [optional] |
| **about** | **kotlin.String** |  |  [optional] |
| **jobTitle** | **kotlin.String** |  |  [optional] |
| **socialFeedId** | **kotlin.String** |  |  [optional] |
| **currentTenantId** | **kotlin.String** |  |  [optional] |
| **currentEnrollmentId** | **kotlin.String** |  |  [optional] |
| **status** | **kotlin.String** |  |  [optional] |
| **cartId** | **kotlin.String** |  |  [optional] |
| **walletId** | **kotlin.String** |  |  [optional] |
| **userName** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **phoneNumber** | **kotlin.String** |  |  [optional] |
| **publicIdentifier** | **kotlin.String** |  |  [optional] |
| **identityProvider** | **kotlin.String** |  |  [optional] |
| **phoneNumberConfirmed** | **kotlin.Boolean** |  |  [optional] |
| **emailConfirmed** | **kotlin.Boolean** |  |  [optional] |
| **availability** | [**inline**](#Availability) |  |  [optional] |
| **lockoutEnabled** | **kotlin.Boolean** |  |  [optional] |
| **lockoutEnd** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **enrollmentsCount** | **kotlin.Int** |  |  [optional] |
| **siteTheme** | [**inline**](#SiteTheme) |  |  [optional] |
| **cart** | [**CartDto**](CartDto.md) |  |  [optional] |
| **wallet** | [**WalletDto**](WalletDto.md) |  |  [optional] |
| **socialProfile** | [**SocialProfileDto**](SocialProfileDto.md) |  |  [optional] |
| **settings** | [**UserSettingsDto**](UserSettingsDto.md) |  |  [optional] |


<a id="Gender"></a>
## Enum: gender
| Name | Value |
| ---- | ----- |
| gender | 0, 1, 2 |


<a id="Availability"></a>
## Enum: availability
| Name | Value |
| ---- | ----- |
| availability | 0, 1, 2, 3, 4 |


<a id="SiteTheme"></a>
## Enum: siteTheme
| Name | Value |
| ---- | ----- |
| siteTheme | 0, 1, 2 |



