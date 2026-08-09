
# SocialPostCommentDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **message** | **kotlin.String** |  |  [optional] |
| **parentCommentId** | **kotlin.String** |  |  [optional] |
| **socialProfileId** | **kotlin.String** |  |  [optional] |
| **socialFeedPostId** | **kotlin.String** |  |  [optional] |
| **socialProfileName** | **kotlin.String** |  |  [optional] |
| **socialProfileAvatarUrl** | **kotlin.String** |  |  [optional] |
| **socialProfileType** | [**inline**](#SocialProfileType) |  |  [optional] |
| **bodyHtml** | **kotlin.String** |  |  [optional] |
| **bodyFormat** | [**inline**](#BodyFormat) |  |  [optional] |
| **replyCount** | **kotlin.Int** |  |  [optional] |
| **reactionsCount** | **kotlin.Int** |  |  [optional] |
| **socialPostId** | **kotlin.String** |  |  [optional] |
| **facepile** | [**kotlin.collections.List&lt;SocialPostReactionFacepileDto&gt;**](SocialPostReactionFacepileDto.md) |  |  [optional] |
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



