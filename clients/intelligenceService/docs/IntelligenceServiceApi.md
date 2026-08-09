# IntelligenceServiceApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**invokeAgentSurfaceAsync**](IntelligenceServiceApi.md#invokeAgentSurfaceAsync) | **POST** /api/v2/IntelligenceService/Agents/{agentId}/agui | Run a governed agent over the AG-UI protocol |


<a id="invokeAgentSurfaceAsync"></a>
# **invokeAgentSurfaceAsync**
> invokeAgentSurfaceAsync(agentId)

Run a governed agent over the AG-UI protocol

Streams a governed agent run as AG-UI server-sent events. Feature-flagged on ABP.Cognitive.AgentSurface.Enable; returns 503 when disabled, 401 when unauthorized and 404 when the agent cannot be resolved. An optional ?projectId&#x3D; binds the run to a project (resolved tenant-scoped): the project id + name are surfaced to the model as context so it can call the governed project-storage tools; it is never auto-filled into a tool&#39;s arguments.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = IntelligenceServiceApi()
val agentId : kotlin.String = agentId_example // kotlin.String | 
try {
    apiInstance.invokeAgentSurfaceAsync(agentId)
} catch (e: ClientException) {
    println("4xx response calling IntelligenceServiceApi#invokeAgentSurfaceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IntelligenceServiceApi#invokeAgentSurfaceAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **agentId** | **kotlin.String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

