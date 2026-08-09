# CognitiveAgentConversationAttachmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**uploadCognitiveAgentConversationAttachmentAsync**](CognitiveAgentConversationAttachmentsApi.md#uploadCognitiveAgentConversationAttachmentAsync) | **POST** /api/v2/IntelligenceService/CognitiveAgents/{agentId}/Conversations/{conversationId}/Attachments | Upload an attachment to a cognitive agent conversation |


<a id="uploadCognitiveAgentConversationAttachmentAsync"></a>
# **uploadCognitiveAgentConversationAttachmentAsync**
> ConversationAttachmentUploadResultDtoEnvelope uploadCognitiveAgentConversationAttachmentAsync(agentId, conversationId, tenantId, apiVersion, xApiVersion, file)

Upload an attachment to a cognitive agent conversation

Uploads a file into the acting user&#39;s OWN conversation attachment store, scanned and catalogued through the storage spine. A conversation the caller does not own returns 404. The response carries the new file&#39;s id, name, content type and length; the chat UI passes that id as an AttachmentFileIds entry when it sends the referencing user turn.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CognitiveAgentConversationAttachmentsApi()
val agentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val conversationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : ConversationAttachmentUploadResultDtoEnvelope = apiInstance.uploadCognitiveAgentConversationAttachmentAsync(agentId, conversationId, tenantId, apiVersion, xApiVersion, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CognitiveAgentConversationAttachmentsApi#uploadCognitiveAgentConversationAttachmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CognitiveAgentConversationAttachmentsApi#uploadCognitiveAgentConversationAttachmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **agentId** | **java.util.UUID**|  | |
| **conversationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

[**ConversationAttachmentUploadResultDtoEnvelope**](ConversationAttachmentUploadResultDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

