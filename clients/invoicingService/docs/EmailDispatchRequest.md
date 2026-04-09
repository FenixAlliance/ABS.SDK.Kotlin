
# EmailDispatchRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **title** | **kotlin.String** |  |  |
| **message** | **kotlin.String** |  |  |
| **culture** | **kotlin.String** |  |  |
| **uiCulture** | **kotlin.String** |  |  |
| **recipients** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  |
| **buttonLink** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **buttonText** | **kotlin.String** |  |  [optional] |
| **alertMessage** | **kotlin.String** |  |  [optional] |
| **alertType** | [**inline**](#AlertType) |  |  [optional] |
| **contactIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **tenantIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **userIds** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **templateUrl** | [**java.net.URI**](java.net.URI.md) |  |  [optional] |
| **emailTemplateId** | **kotlin.String** |  |  [optional] |


<a id="AlertType"></a>
## Enum: alertType
| Name | Value |
| ---- | ----- |
| alertType | None, Info, Error, Warning, Success, Action, Alert |



