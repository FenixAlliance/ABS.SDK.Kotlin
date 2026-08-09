# InboxApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**cancelInboxMessageRetry**](InboxApi.md#cancelInboxMessageRetry) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/CancelRetry | Cancel a scheduled inbox retry |
| [**deadLetterInboxMessage**](InboxApi.md#deadLetterInboxMessage) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/DeadLetter | Manually dead-letter an inbox message |
| [**expediteInboxMessage**](InboxApi.md#expediteInboxMessage) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/Expedite | Expedite a retry-scheduled inbox message |
| [**getDuplicateInboxMessages**](InboxApi.md#getDuplicateInboxMessages) | **GET** /api/v2/SystemService/Inbox/Duplicates | List duplicate-bearing inbox messages |
| [**getDuplicateInboxMessagesCount**](InboxApi.md#getDuplicateInboxMessagesCount) | **GET** /api/v2/SystemService/Inbox/Duplicates/Count | Count duplicate-bearing inbox messages |
| [**getInboxCorrelationChain**](InboxApi.md#getInboxCorrelationChain) | **GET** /api/v2/SystemService/Inbox/Correlations/{correlationId} | Get an inbox correlation chain |
| [**getInboxHealth**](InboxApi.md#getInboxHealth) | **GET** /api/v2/SystemService/Inbox/Health | Get durable-inbox processor health |
| [**getInboxMessage**](InboxApi.md#getInboxMessage) | **GET** /api/v2/SystemService/Inbox/Messages/{id} | Get one inbox message |
| [**getInboxMessages**](InboxApi.md#getInboxMessages) | **GET** /api/v2/SystemService/Inbox/Messages | List inbox messages |
| [**getInboxMessagesCount**](InboxApi.md#getInboxMessagesCount) | **GET** /api/v2/SystemService/Inbox/Messages/Count | Count inbox messages |
| [**quarantineInboxMessage**](InboxApi.md#quarantineInboxMessage) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/Quarantine | Manually quarantine an inbox message |
| [**releaseInboxMessageLease**](InboxApi.md#releaseInboxMessageLease) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/ReleaseLease | Release a stuck inbox lease |
| [**replayInboxMessage**](InboxApi.md#replayInboxMessage) | **POST** /api/v2/SystemService/Inbox/Messages/{id}/Replay | Replay a terminal inbox message as a new generation |


<a id="cancelInboxMessageRetry"></a>
# **cancelInboxMessageRetry**
> EmptyEnvelope cancelInboxMessageRetry(id, apiVersion, xApiVersion, inboxAdminReasonDto)

Cancel a scheduled inbox retry

Stops a RetryScheduled message from retrying by operator decision, moving it to the terminal Cancelled state (deliberately distinct from DeadLettered so the dead-letter gauge stays honest). The reason is audit-critical. Only a RetryScheduled message can be cancelled. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inboxAdminReasonDto : InboxAdminReasonDto =  // InboxAdminReasonDto | 
try {
    val result : EmptyEnvelope = apiInstance.cancelInboxMessageRetry(id, apiVersion, xApiVersion, inboxAdminReasonDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#cancelInboxMessageRetry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#cancelInboxMessageRetry")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inboxAdminReasonDto** | [**InboxAdminReasonDto**](InboxAdminReasonDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deadLetterInboxMessage"></a>
# **deadLetterInboxMessage**
> EmptyEnvelope deadLetterInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)

Manually dead-letter an inbox message

Manually moves a non-terminal message to the terminal DeadLettered state. The reason is audit-critical. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inboxAdminReasonDto : InboxAdminReasonDto =  // InboxAdminReasonDto | 
try {
    val result : EmptyEnvelope = apiInstance.deadLetterInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#deadLetterInboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#deadLetterInboxMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inboxAdminReasonDto** | [**InboxAdminReasonDto**](InboxAdminReasonDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="expediteInboxMessage"></a>
# **expediteInboxMessage**
> EmptyEnvelope expediteInboxMessage(id, apiVersion, xApiVersion)

Expedite a retry-scheduled inbox message

Pulls a RetryScheduled message&#39;s scheduled instant forward to now so the processor claims it on the next poll, bypassing the remaining backoff. Same row, retry budget untouched. Only a RetryScheduled message can be expedited. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.expediteInboxMessage(id, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#expediteInboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#expediteInboxMessage")
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

<a id="getDuplicateInboxMessages"></a>
# **getDuplicateInboxMessages**
> InboxMessageDtoIReadOnlyListEnvelope getDuplicateInboxMessages(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)

List duplicate-bearing inbox messages

Lists inbox messages that have observed a re-delivery (DeliveryCount &gt; 1) — durable evidence that a source is re-sending, surfaced with DeliveryCount / LastDuplicateReceivedAtUtc. Further OData filtering/paging applies. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inboxMessageDtoCollectionQueryParameters : InboxMessageDtoCollectionQueryParameters =  // InboxMessageDtoCollectionQueryParameters | 
try {
    val result : InboxMessageDtoIReadOnlyListEnvelope = apiInstance.getDuplicateInboxMessages(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getDuplicateInboxMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getDuplicateInboxMessages")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inboxMessageDtoCollectionQueryParameters** | [**InboxMessageDtoCollectionQueryParameters**](InboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**InboxMessageDtoIReadOnlyListEnvelope**](InboxMessageDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getDuplicateInboxMessagesCount"></a>
# **getDuplicateInboxMessagesCount**
> Int32Envelope getDuplicateInboxMessagesCount(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)

Count duplicate-bearing inbox messages

Returns the count of duplicate-bearing inbox messages under the same OData shaping as the duplicates list. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inboxMessageDtoCollectionQueryParameters : InboxMessageDtoCollectionQueryParameters =  // InboxMessageDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getDuplicateInboxMessagesCount(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getDuplicateInboxMessagesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getDuplicateInboxMessagesCount")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inboxMessageDtoCollectionQueryParameters** | [**InboxMessageDtoCollectionQueryParameters**](InboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getInboxCorrelationChain"></a>
# **getInboxCorrelationChain**
> InboxMessageDtoIReadOnlyListEnvelope getInboxCorrelationChain(correlationId, apiVersion, xApiVersion)

Get an inbox correlation chain

Returns every inbox message that shares a correlation id — one logical inbound interaction end-to-end, including its replay generations — oldest-received first. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val correlationId : kotlin.String = correlationId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InboxMessageDtoIReadOnlyListEnvelope = apiInstance.getInboxCorrelationChain(correlationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxCorrelationChain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxCorrelationChain")
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

[**InboxMessageDtoIReadOnlyListEnvelope**](InboxMessageDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInboxHealth"></a>
# **getInboxHealth**
> InboxHealthDtoEnvelope getInboxHealth(apiVersion, xApiVersion)

Get durable-inbox processor health

Returns a single snapshot of the durable-inbox processor: whether it is enabled, the per-status counts (received/accepted/processing/retry-scheduled/rejected/quarantined/dead-lettered/cancelled), the age of the oldest accepted message, and the last successful processing instant. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InboxHealthDtoEnvelope = apiInstance.getInboxHealth(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxHealth")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxHealth")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**InboxHealthDtoEnvelope**](InboxHealthDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInboxMessage"></a>
# **getInboxMessage**
> InboxMessageDtoEnvelope getInboxMessage(id, apiVersion, xApiVersion)

Get one inbox message

Returns one inbox message&#39;s payload-safe detail by id — both lifecycle axes (processing status + independent verification status), the dedup lineage, attempt/generation counters, the recorded failure, and the timestamps. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InboxMessageDtoEnvelope = apiInstance.getInboxMessage(id, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxMessage")
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

[**InboxMessageDtoEnvelope**](InboxMessageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInboxMessages"></a>
# **getInboxMessages**
> InboxMessageDtoIReadOnlyListEnvelope getInboxMessages(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)

List inbox messages

Lists durable-inbox messages (payload-safe fields only). Use OData to scope by any projected field — e.g. $filter&#x3D;Status eq &#39;Quarantined&#39; for the quarantine review, Status eq &#39;DeadLettered&#39; for terminal failures, VerificationStatus eq &#39;Failed&#39; for forged/untrusted callbacks, SourceSystem eq &#39;stripe&#39;, or a ReceivedAtUtc range — and to page/order. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inboxMessageDtoCollectionQueryParameters : InboxMessageDtoCollectionQueryParameters =  // InboxMessageDtoCollectionQueryParameters | 
try {
    val result : InboxMessageDtoIReadOnlyListEnvelope = apiInstance.getInboxMessages(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxMessages")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxMessages")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inboxMessageDtoCollectionQueryParameters** | [**InboxMessageDtoCollectionQueryParameters**](InboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**InboxMessageDtoIReadOnlyListEnvelope**](InboxMessageDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getInboxMessagesCount"></a>
# **getInboxMessagesCount**
> Int32Envelope getInboxMessagesCount(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)

Count inbox messages

Returns the count of durable-inbox messages under the same OData shaping as the list read (e.g. $filter&#x3D;Status eq &#39;Quarantined&#39;). Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inboxMessageDtoCollectionQueryParameters : InboxMessageDtoCollectionQueryParameters =  // InboxMessageDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getInboxMessagesCount(apiVersion, xApiVersion, inboxMessageDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#getInboxMessagesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#getInboxMessagesCount")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inboxMessageDtoCollectionQueryParameters** | [**InboxMessageDtoCollectionQueryParameters**](InboxMessageDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="quarantineInboxMessage"></a>
# **quarantineInboxMessage**
> EmptyEnvelope quarantineInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)

Manually quarantine an inbox message

Manually holds a non-terminal message for review in the terminal Quarantined state (e.g. an operator judges it suspicious). The reason is audit-critical. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inboxAdminReasonDto : InboxAdminReasonDto =  // InboxAdminReasonDto | 
try {
    val result : EmptyEnvelope = apiInstance.quarantineInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#quarantineInboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#quarantineInboxMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inboxAdminReasonDto** | [**InboxAdminReasonDto**](InboxAdminReasonDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="releaseInboxMessageLease"></a>
# **releaseInboxMessageLease**
> EmptyEnvelope releaseInboxMessageLease(id, apiVersion, xApiVersion)

Release a stuck inbox lease

Force-releases the lease on a message wedged in Processing (a crashed/hung processor) and returns it to the claimable Accepted state, due now, so the next poll re-drives it. The in-flight attempt is NOT counted — a crash is not a business failure. Only a Processing message can have its lease released. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.releaseInboxMessageLease(id, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#releaseInboxMessageLease")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#releaseInboxMessageLease")
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

<a id="replayInboxMessage"></a>
# **replayInboxMessage**
> InboxReplayResultDtoEnvelope replayInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)

Replay a terminal inbox message as a new generation

Replays a terminal message as a NEW processing generation over its immutable received evidence — the inbox&#39;s recovery lever (distinct from the outbox&#39;s same-row requeue). A selected replay-generation row is resolved back to its lineage root before replaying, so numbering stays global and collision-free; the new row is claimable at once with a fresh retry budget, and the root&#39;s evidence and budget are never mutated. Legal only from a terminal state whose authenticity passed. Returns the new generation&#39;s identity. The reason is audit-critical. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InboxApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inboxAdminReasonDto : InboxAdminReasonDto =  // InboxAdminReasonDto | 
try {
    val result : InboxReplayResultDtoEnvelope = apiInstance.replayInboxMessage(id, apiVersion, xApiVersion, inboxAdminReasonDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InboxApi#replayInboxMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InboxApi#replayInboxMessage")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inboxAdminReasonDto** | [**InboxAdminReasonDto**](InboxAdminReasonDto.md)|  | [optional] |

### Return type

[**InboxReplayResultDtoEnvelope**](InboxReplayResultDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

