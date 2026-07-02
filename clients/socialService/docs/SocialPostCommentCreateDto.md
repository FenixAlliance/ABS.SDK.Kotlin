
# SocialPostCommentCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **message** | **kotlin.String** |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **bodyHtml** | **kotlin.String** |  |  [optional] |
| **bodyFormat** | [**inline**](#BodyFormat) |  |  [optional] |
| **parentCommentId** | **kotlin.String** |  |  [optional] |
| **socialProfileId** | **kotlin.String** |  |  [optional] |
| **socialFeedPostId** | **kotlin.String** |  |  [optional] |
| **socialPostId** | **kotlin.String** |  |  [optional] |


<a id="BodyFormat"></a>
## Enum: bodyFormat
| Name | Value |
| ---- | ----- |
| bodyFormat | PlainText, Html |



