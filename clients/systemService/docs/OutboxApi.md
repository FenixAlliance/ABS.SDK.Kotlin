# OutboxApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelOutboxMessage**](OutboxApi.md#cancelOutboxMessage) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/Cancel | Cancel an outbox message |
| [**deadLetterOutboxMessage**](OutboxApi.md#deadLetterOutboxMessage) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/DeadLetter | Manually dead-letter an outbox message |
| [**expediteOutboxMessage**](OutboxApi.md#expediteOutboxMessage) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/Expedite | Expedite a failed (retry-eligible) outbox message |
| [**getOutboxCorrelationChain**](OutboxApi.md#getOutboxCorrelationChain) | **GET** /api/v2/SystemService/Outbox/Correlations/{correlationId} | Get an outbox correlation chain |
| [**getOutboxHealth**](OutboxApi.md#getOutboxHealth) | **GET** /api/v2/SystemService/Outbox/Health | Get durable-outbox relay health |
| [**getOutboxMessage**](OutboxApi.md#getOutboxMessage) | **GET** /api/v2/SystemService/Outbox/Messages/{id} | Get one outbox message |
| [**getOutboxMessages**](OutboxApi.md#getOutboxMessages) | **GET** /api/v2/SystemService/Outbox/Messages | List outbox messages |
| [**getOutboxMessagesCount**](OutboxApi.md#getOutboxMessagesCount) | **GET** /api/v2/SystemService/Outbox/Messages/Count | Count outbox messages |
| [**releaseOutboxMessageLease**](OutboxApi.md#releaseOutboxMessageLease) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/ReleaseLease | Release a stuck outbox lease |
| [**replayOutboxMessage**](OutboxApi.md#replayOutboxMessage) | **POST** /api/v2/SystemService/Outbox/Messages/{id}/Replay | Replay a dead-lettered or failed outbox message |


<a id="cancelOutboxMessage"></a>
# **cancelOutboxMessage**
> EmptyEnvelope cancelOutboxMessage(id, apiVersion, xApiVersion, outboxAdminReasonDto)

Cancel an outbox message

Stops a Pending or Failed message by operator decision, moving it to the terminal Cancelled state (deliberately distinct from DeadLettered so the dead-letter gauge stays honest). The reason is audit-critical. An in-flight (Processing) or already-terminal message is rejected. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val outboxAdminReasonDto : OutboxAdminReasonDto =  // OutboxAdminReasonDto | 
try {
    val result : EmptyEnvelope = apiInstance.cancelOutboxMessage(id, apiVersion, xApiVersion, outboxAdminReasonDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#cancelOutboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#cancelOutboxMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outboxAdminReasonDto** | [**OutboxAdminReasonDto**](OutboxAdminReasonDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deadLetterOutboxMessage"></a>
# **deadLetterOutboxMessage**
> EmptyEnvelope deadLetterOutboxMessage(id, apiVersion, xApiVersion, outboxAdminReasonDto)

Manually dead-letter an outbox message

Manually moves a Processing or Failed message to the terminal DeadLettered state. The reason is audit-critical. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val outboxAdminReasonDto : OutboxAdminReasonDto =  // OutboxAdminReasonDto | 
try {
    val result : EmptyEnvelope = apiInstance.deadLetterOutboxMessage(id, apiVersion, xApiVersion, outboxAdminReasonDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#deadLetterOutboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#deadLetterOutboxMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outboxAdminReasonDto** | [**OutboxAdminReasonDto**](OutboxAdminReasonDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="expediteOutboxMessage"></a>
# **expediteOutboxMessage**
> EmptyEnvelope expediteOutboxMessage(id, apiVersion, xApiVersion)

Expedite a failed (retry-eligible) outbox message

Pulls a Failed message&#39;s scheduled instant forward to now so the relay claims it on the next poll, bypassing the remaining backoff. Same row, retry budget untouched (the lighter-touch counterpart to Replay, which also clears the recorded error). Only a Failed message can be expedited. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.expediteOutboxMessage(id, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#expediteOutboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#expediteOutboxMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutboxCorrelationChain"></a>
# **getOutboxCorrelationChain**
> OutboxMessageDtoIReadOnlyListEnvelope getOutboxCorrelationChain(correlationId, apiVersion, xApiVersion)

Get an outbox correlation chain

Returns every outbox message that shares a correlation id — one logical unit of async work end-to-end (e.g. a command and the events its handler in turn staged) — oldest-created first. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val correlationId : kotlin.String = correlationId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OutboxMessageDtoIReadOnlyListEnvelope = apiInstance.getOutboxCorrelationChain(correlationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#getOutboxCorrelationChain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#getOutboxCorrelationChain")
    e.printStackTrace()
}
```

### Parameters
| **correlationId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OutboxMessageDtoIReadOnlyListEnvelope**](OutboxMessageDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutboxHealth"></a>
# **getOutboxHealth**
> OutboxHealthDtoEnvelope getOutboxHealth(apiVersion, xApiVersion)

Get durable-outbox relay health

Returns a single snapshot of the durable-outbox relay: whether it is enabled, the per-status counts (pending/processing/failed/dead-lettered), the age of the oldest pending message, and the last successful dispatch instant. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OutboxHealthDtoEnvelope = apiInstance.getOutboxHealth(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#getOutboxHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#getOutboxHealth")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OutboxHealthDtoEnvelope**](OutboxHealthDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutboxMessage"></a>
# **getOutboxMessage**
> OutboxMessageDtoEnvelope getOutboxMessage(id, apiVersion, xApiVersion)

Get one outbox message

Returns one outbox message&#39;s payload-safe detail by id — its lifecycle status, the two classification axes (kind + message type), the attempt/ceiling budget, the recorded failure, the idempotency + correlation lineage, and the timestamps. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OutboxMessageDtoEnvelope = apiInstance.getOutboxMessage(id, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#getOutboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#getOutboxMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OutboxMessageDtoEnvelope**](OutboxMessageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutboxMessages"></a>
# **getOutboxMessages**
> OutboxMessageDtoIReadOnlyListEnvelope getOutboxMessages(apiVersion, xApiVersion, outboxMessageDtoCollectionQueryParameters)

List outbox messages

Lists durable-outbox messages (payload-safe fields only). Use OData to scope to a state — e.g. $filter&#x3D;Status eq &#39;DeadLettered&#39; for the dead-letter set or Status eq &#39;Failed&#39; for retry-eligible rows — and to page/order. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val outboxMessageDtoCollectionQueryParameters : OutboxMessageDtoCollectionQueryParameters =  // OutboxMessageDtoCollectionQueryParameters | 
try {
    val result : OutboxMessageDtoIReadOnlyListEnvelope = apiInstance.getOutboxMessages(apiVersion, xApiVersion, outboxMessageDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#getOutboxMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#getOutboxMessages")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outboxMessageDtoCollectionQueryParameters** | [**OutboxMessageDtoCollectionQueryParameters**](OutboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**OutboxMessageDtoIReadOnlyListEnvelope**](OutboxMessageDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getOutboxMessagesCount"></a>
# **getOutboxMessagesCount**
> Int32Envelope getOutboxMessagesCount(apiVersion, xApiVersion, outboxMessageDtoCollectionQueryParameters)

Count outbox messages

Returns the count of durable-outbox messages under the same OData shaping as the list read (e.g. $filter&#x3D;Status eq &#39;DeadLettered&#39;). Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val outboxMessageDtoCollectionQueryParameters : OutboxMessageDtoCollectionQueryParameters =  // OutboxMessageDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getOutboxMessagesCount(apiVersion, xApiVersion, outboxMessageDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#getOutboxMessagesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#getOutboxMessagesCount")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outboxMessageDtoCollectionQueryParameters** | [**OutboxMessageDtoCollectionQueryParameters**](OutboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="releaseOutboxMessageLease"></a>
# **releaseOutboxMessageLease**
> EmptyEnvelope releaseOutboxMessageLease(id, apiVersion, xApiVersion)

Release a stuck outbox lease

Force-releases the lease on a message wedged in Processing (a crashed/hung relay) and returns it to the claimable Pending state, due now, so the next poll re-drives it. The in-flight attempt is NOT counted — a crash is not a business failure. The relay auto-reclaims a crashed row once its lease expires; this manual lever forces the release immediately. Only a Processing message can have its lease released. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.releaseOutboxMessageLease(id, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#releaseOutboxMessageLease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#releaseOutboxMessageLease")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="replayOutboxMessage"></a>
# **replayOutboxMessage**
> EmptyEnvelope replayOutboxMessage(id, apiVersion, xApiVersion)

Replay a dead-lettered or failed outbox message

Requeues a DeadLettered or Failed message back to Pending so the relay re-drives it immediately (clearing the lease and recorded error, and bypassing the remaining backoff). The attempt budget is preserved — a replay grants one more pass, not a fresh budget. Replaying a message that is already Pending/Processing or is Succeeded/Cancelled is rejected. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OutboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.replayOutboxMessage(id, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutboxApi#replayOutboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutboxApi#replayOutboxMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

