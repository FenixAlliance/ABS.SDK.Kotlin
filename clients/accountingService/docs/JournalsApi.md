# JournalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countJournalsAsync**](JournalsApi.md#countJournalsAsync) | **GET** /api/v2/AccountingService/Journals/Count | Count journals |
| [**createJournalAsync**](JournalsApi.md#createJournalAsync) | **POST** /api/v2/AccountingService/Journals | Create journal |
| [**createJournalEntryAsync**](JournalsApi.md#createJournalEntryAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/Entries | Create journal entry |
| [**deleteJournalAsync**](JournalsApi.md#deleteJournalAsync) | **DELETE** /api/v2/AccountingService/Journals/{journalId} | Delete journal |
| [**deleteJournalEntryAsync**](JournalsApi.md#deleteJournalEntryAsync) | **DELETE** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Delete journal entry |
| [**getJournalDetailsAsync**](JournalsApi.md#getJournalDetailsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId} | Get journal by ID |
| [**getJournalEntriesAsync**](JournalsApi.md#getJournalEntriesAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries | Get journal entries |
| [**getJournalEntriesCountAsync**](JournalsApi.md#getJournalEntriesCountAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/Count | Count journal entries |
| [**getJournalsAsync**](JournalsApi.md#getJournalsAsync) | **GET** /api/v2/AccountingService/Journals | Get all journals |
| [**updateJournalAsync**](JournalsApi.md#updateJournalAsync) | **PUT** /api/v2/AccountingService/Journals/{journalId} | Update journal |
| [**updateJournalEntryAsync**](JournalsApi.md#updateJournalEntryAsync) | **PUT** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Update journal entry |


<a id="countJournalsAsync"></a>
# **countJournalsAsync**
> Int32Envelope countJournalsAsync(tenantId, apiVersion, xApiVersion)

Count journals

Returns the count of journals for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countJournalsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#countJournalsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#countJournalsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createJournalAsync"></a>
# **createJournalAsync**
> EmptyEnvelope createJournalAsync(tenantId, apiVersion, xApiVersion, journalCreateDto)

Create journal

Creates a new journal for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val journalCreateDto : JournalCreateDto =  // JournalCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJournalAsync(tenantId, apiVersion, xApiVersion, journalCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#createJournalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#createJournalAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **journalCreateDto** | [**JournalCreateDto**](JournalCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createJournalEntryAsync"></a>
# **createJournalEntryAsync**
> EmptyEnvelope createJournalEntryAsync(journalId, tenantId, apiVersion, xApiVersion, journalEntryCreateDto)

Create journal entry

Creates a new journal entry for a given journal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val journalEntryCreateDto : JournalEntryCreateDto =  // JournalEntryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJournalEntryAsync(journalId, tenantId, apiVersion, xApiVersion, journalEntryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#createJournalEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#createJournalEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **journalEntryCreateDto** | [**JournalEntryCreateDto**](JournalEntryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteJournalAsync"></a>
# **deleteJournalAsync**
> EmptyEnvelope deleteJournalAsync(journalId, tenantId, apiVersion, xApiVersion)

Delete journal

Deletes a journal by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJournalAsync(journalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#deleteJournalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#deleteJournalAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="deleteJournalEntryAsync"></a>
# **deleteJournalEntryAsync**
> EmptyEnvelope deleteJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion)

Delete journal entry

Deletes a specific journal entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#deleteJournalEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#deleteJournalEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="getJournalDetailsAsync"></a>
# **getJournalDetailsAsync**
> JournalDtoEnvelope getJournalDetailsAsync(journalId, tenantId, apiVersion, xApiVersion)

Get journal by ID

Retrieves the details of a journal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JournalDtoEnvelope = apiInstance.getJournalDetailsAsync(journalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#getJournalDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#getJournalDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JournalDtoEnvelope**](JournalDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJournalEntriesAsync"></a>
# **getJournalEntriesAsync**
> JournalEntryDtoIReadOnlyListEnvelope getJournalEntriesAsync(journalId, tenantId, apiVersion, xApiVersion)

Get journal entries

Gets entries for the specified journal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JournalEntryDtoIReadOnlyListEnvelope = apiInstance.getJournalEntriesAsync(journalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#getJournalEntriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#getJournalEntriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JournalEntryDtoIReadOnlyListEnvelope**](JournalEntryDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJournalEntriesCountAsync"></a>
# **getJournalEntriesCountAsync**
> Int32Envelope getJournalEntriesCountAsync(journalId, tenantId, apiVersion, xApiVersion)

Count journal entries

Returns the number of entries in the specified journal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getJournalEntriesCountAsync(journalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#getJournalEntriesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#getJournalEntriesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJournalsAsync"></a>
# **getJournalsAsync**
> JournalDtoIReadOnlyListEnvelope getJournalsAsync(tenantId, apiVersion, xApiVersion)

Get all journals

Retrieves all journals for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JournalDtoIReadOnlyListEnvelope = apiInstance.getJournalsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#getJournalsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#getJournalsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JournalDtoIReadOnlyListEnvelope**](JournalDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateJournalAsync"></a>
# **updateJournalAsync**
> EmptyEnvelope updateJournalAsync(journalId, tenantId, apiVersion, xApiVersion, journalUpdateDto)

Update journal

Updates an existing journal.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val journalUpdateDto : JournalUpdateDto =  // JournalUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJournalAsync(journalId, tenantId, apiVersion, xApiVersion, journalUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#updateJournalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#updateJournalAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **journalUpdateDto** | [**JournalUpdateDto**](JournalUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateJournalEntryAsync"></a>
# **updateJournalEntryAsync**
> EmptyEnvelope updateJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion, journalEntryUpdateDto)

Update journal entry

Updates a specific journal entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val journalEntryUpdateDto : JournalEntryUpdateDto =  // JournalEntryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion, journalEntryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#updateJournalEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#updateJournalEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **journalEntryUpdateDto** | [**JournalEntryUpdateDto**](JournalEntryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

