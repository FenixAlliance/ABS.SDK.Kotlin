
# SocialPostDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **title** | **kotlin.String** |  |  [optional] |
| **message** | **kotlin.String** |  |  [optional] |
| **socialProfileId** | **kotlin.String** |  |  [optional] |
| **socialProfileName** | **kotlin.String** |  |  [optional] |
| **socialProfileAvatarUrl** | **kotlin.String** |  |  [optional] |
| **commentsCount** | **kotlin.Int** |  |  [optional] |
| **reactionsCount** | **kotlin.Int** |  |  [optional] |
| **socialProfileType** | [**inline**](#SocialProfileType) |  |  [optional] |
| **bodyHtml** | **kotlin.String** |  |  [optional] |
| **bodyFormat** | [**inline**](#BodyFormat) |  |  [optional] |
| **backgroundStyle** | **kotlin.String** |  |  [optional] |


<a id="SocialProfileType"></a>
## Enum: socialProfileType
| Name | Value |
| ---- | ----- |
| socialProfileType | User, Tenant, Contact |


<a id="BodyFormat"></a>
## Enum: bodyFormat
| Name | Value |
| ---- | ----- |
| bodyFormat | PlainText, Html |



