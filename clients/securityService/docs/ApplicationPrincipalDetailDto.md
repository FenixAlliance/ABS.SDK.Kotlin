
# ApplicationPrincipalDetailDto

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **kotlin.String** |  |  [optional] |
| **timestamp** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **displayName** | **kotlin.String** |  |  [optional] |
| **principalKind** | [**inline**](#PrincipalKind) |  |  [optional] |
| **principalStatus** | [**inline**](#PrincipalStatus) |  |  [optional] |
| **businessApplicationId** | **kotlin.String** |  |  [optional] |
| **businessApplicationName** | **kotlin.String** |  |  [optional] |
| **businessApplicationNamespace** | **kotlin.String** |  |  [optional] |
| **businessApplicationDisabled** | **kotlin.Boolean** |  |  [optional] |
| **systemLocked** | **kotlin.Boolean** |  |  [optional] |
| **tenantId** | **kotlin.String** |  |  [optional] |
| **enrollmentId** | **kotlin.String** |  |  [optional] |
| **enrollmentDisabled** | **kotlin.Boolean** |  |  [optional] |
| **grantedPermissions** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |


<a id="PrincipalKind"></a>
## Enum: principalKind
| Name | Value |
| ---- | ----- |
| principalKind | Human, Agent, Application, Service, System |


<a id="PrincipalStatus"></a>
## Enum: principalStatus
| Name | Value |
| ---- | ----- |
| principalStatus | Active, Suspended, Disabled |



