
# SocialFeedPostDto

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
| **socialFeedId** | **kotlin.String** |  |  [optional] |
| **facepile** | [**kotlin.collections.List&lt;SocialPostReactionFacepileDto&gt;**](SocialPostReactionFacepileDto.md) |  |  [optional] |
| **attachments** | [**kotlin.collections.List&lt;SocialPostAttachmentRefDto&gt;**](SocialPostAttachmentRefDto.md) |  |  [optional] |
| **myReaction** | [**inline**](#MyReaction) |  |  [optional] |
| **myReactionId** | **kotlin.String** |  |  [optional] |


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


<a id="MyReaction"></a>
## Enum: myReaction
| Name | Value |
| ---- | ----- |
| myReaction | Like, Happy, HaHa, Love, Sad, Angry, Wow, Afraid |



