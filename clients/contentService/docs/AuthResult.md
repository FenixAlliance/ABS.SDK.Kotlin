
# AuthResult

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | [**kotlin.Any**](.md) |  |  [optional] |
| **tenantId** | [**kotlin.Any**](.md) |  |  [optional] |
| **portalId** | [**kotlin.Any**](.md) |  |  [optional] |
| **applicationId** | [**kotlin.Any**](.md) |  |  [optional] |
| **enrollmentId** | [**kotlin.Any**](.md) |  |  [optional] |
| **correlationId** | **kotlin.String** |  |  [optional] |
| **scopes** | **kotlin.collections.List&lt;kotlin.String&gt;** |  |  [optional] |
| **error** | **kotlin.String** |  |  [optional] |
| **runAs** | [**inline**](#RunAs) |  |  [optional] |
| **principalKind** | [**inline**](#PrincipalKind) |  |  [optional] |
| **provenance** | [**ExecutionProvenance**](ExecutionProvenance.md) |  |  [optional] |


<a id="RunAs"></a>
## Enum: runAs
| Name | Value |
| ---- | ----- |
| runAs | Invoker, Application, System, Service |


<a id="PrincipalKind"></a>
## Enum: principalKind
| Name | Value |
| ---- | ----- |
| principalKind | Human, Agent, Application, Service, System |



