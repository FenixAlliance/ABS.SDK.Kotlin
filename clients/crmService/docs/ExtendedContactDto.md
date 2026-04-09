
# ExtendedContactDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **qualifiedName** | **kotlin.String** |  |  [optional] [readonly] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **type** | [**inline**](#Type) |  |  [optional] |
| **email** | **kotlin.String** |  |  [optional] |
| **phone** | **kotlin.String** |  |  [optional] |
| **publicName** | **kotlin.String** |  |  [optional] |
| **firstName** | **kotlin.String** |  |  [optional] |
| **lastName** | **kotlin.String** |  |  [optional] |
| **jobTitle** | **kotlin.String** |  |  [optional] |
| **coverUrl** | **kotlin.String** |  |  [optional] |
| **avatarUrl** | **kotlin.String** |  |  [optional] |
| **countryId** | **kotlin.String** |  |  [optional] |
| **timezoneId** | **kotlin.String** |  |  [optional] |
| **languageId** | **kotlin.String** |  |  [optional] |
| **socialProfileId** | **kotlin.String** |  |  [optional] |
| **webUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **gitHubUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **twitchUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **redditUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **tikTokUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **websiteUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **twitterUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **facebookUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **youTubeUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **linkedInUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **instagramUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **githubUsername** | **kotlin.String** |  |  [optional] |
| **duns** | **kotlin.String** |  |  [optional] |
| **taxId** | **kotlin.String** |  |  [optional] |
| **about** | **kotlin.String** |  |  [optional] |
| **street** | **kotlin.String** |  |  [optional] |
| **cartId** | **kotlin.String** |  |  [optional] |
| **cityId** | **kotlin.String** |  |  [optional] |
| **zipCode** | **kotlin.String** |  |  [optional] |
| **stateId** | **kotlin.String** |  |  [optional] |
| **walletId** | **kotlin.String** |  |  [optional] |
| **faxNumber** | **kotlin.String** |  |  [optional] |
| **postalCode** | **kotlin.String** |  |  [optional] |
| **currencyId** | **kotlin.String** |  |  [optional] |
| **streetLine1** | **kotlin.String** |  |  [optional] |
| **streetLine2** | **kotlin.String** |  |  [optional] |
| **territoryId** | **kotlin.String** |  |  [optional] |
| **mobilePhone** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **annualRevenue** | **kotlin.String** |  |  [optional] |
| **relatedUserId** | **kotlin.String** |  |  [optional] |
| **businessPhone** | **kotlin.String** |  |  [optional] |
| **ownerContactId** | **kotlin.String** |  |  [optional] |
| **relatedTenantId** | **kotlin.String** |  |  [optional] |
| **activityFeedId** | **kotlin.String** |  |  [optional] |
| **parentContactId** | **kotlin.String** |  |  [optional] |
| **identityProvider** | **kotlin.String** |  |  [optional] |
| **partnerProfileId** | **kotlin.String** |  |  [optional] |
| **primaryContactId** | **kotlin.String** |  |  [optional] |
| **activeDirectoryId** | **kotlin.String** |  |  [optional] |
| **identityProviderAccessToken** | **kotlin.String** |  |  [optional] |
| **birthday** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **cart** | [**CartDto**](CartDto.md) |  |  [optional] |
| **wallet** | [**WalletDto**](WalletDto.md) |  |  [optional] |
| **socialProfile** | [**SocialProfileDto**](SocialProfileDto.md) |  |  [optional] |
| **parentContact** | [**SimpleContactDto**](SimpleContactDto.md) |  |  [optional] |
| **primaryContact** | [**SimpleContactDto**](SimpleContactDto.md) |  |  [optional] |


<a id="Type"></a>
## Enum: type
| Name | Value |
| ---- | ----- |
| type | Individual, Organization |



