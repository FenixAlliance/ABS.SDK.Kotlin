
# ExecutionProvenance

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **initiation** | [**inline**](#Initiation) |  |  [optional] |
| **onBehalfOfActorId** | [**kotlin.Any**](.md) |  |  [optional] |
| **onBehalfOfActorKind** | [**inline**](#OnBehalfOfActorKind) |  |  [optional] |
| **causationId** | [**java.util.UUID**](java.util.UUID.md) |  |  [optional] |
| **originatingWorkflowInstanceId** | **kotlin.String** |  |  [optional] |
| **eventDepth** | **kotlin.Int** |  |  [optional] |


<a id="Initiation"></a>
## Enum: initiation
| Name | Value |
| ---- | ----- |
| initiation | Unknown, Http, Workflow, ScheduledJob, Event, AiTool, Mcp, Integration, System, Manual |


<a id="OnBehalfOfActorKind"></a>
## Enum: onBehalfOfActorKind
| Name | Value |
| ---- | ----- |
| onBehalfOfActorKind | Human, Agent, Application, Service, System |



