
# SigningProfileGraphicalRepresentationCreateDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **signingProfileId** | **kotlin.String** |  |  |
| **kind** | [**inline**](#Kind) |  |  |
| **id** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **displayName** | **kotlin.String** |  |  [optional] |
| **fileUploadId** | **kotlin.String** |  |  [optional] |
| **sha256** | **kotlin.String** |  |  [optional] |
| **vectorDataJson** | **kotlin.String** |  |  [optional] |
| **textValue** | **kotlin.String** |  |  [optional] |
| **fontFamily** | **kotlin.String** |  |  [optional] |
| **isDefault** | **kotlin.Boolean** |  |  [optional] |
| **isActive** | **kotlin.Boolean** |  |  [optional] |


<a id="Kind"></a>
## Enum: kind
| Name | Value |
| ---- | ----- |
| kind | Drawn, UploadedImage, Typed, Initials, Seal, Stamp |



