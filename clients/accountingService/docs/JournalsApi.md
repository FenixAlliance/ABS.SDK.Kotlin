# JournalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**aggregateJournalEntryCreditsAsync**](JournalsApi.md#aggregateJournalEntryCreditsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/Aggregate/Credits | Aggregate journal entry credits |
| [**aggregateJournalEntryDebitsAsync**](JournalsApi.md#aggregateJournalEntryDebitsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/Aggregate/Debits | Aggregate journal entry debits |
| [**countJournalsAsync**](JournalsApi.md#countJournalsAsync) | **GET** /api/v2/AccountingService/Journals/Count | Count journals |
| [**createJournalAsync**](JournalsApi.md#createJournalAsync) | **POST** /api/v2/AccountingService/Journals | Create journal |
| [**createJournalEntryAsync**](JournalsApi.md#createJournalEntryAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/Entries | Create journal entry |
| [**deleteJournalAsync**](JournalsApi.md#deleteJournalAsync) | **DELETE** /api/v2/AccountingService/Journals/{journalId} | Delete journal |
| [**deleteJournalEntryAsync**](JournalsApi.md#deleteJournalEntryAsync) | **DELETE** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Delete journal entry |
| [**getJournalDetailsAsync**](JournalsApi.md#getJournalDetailsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId} | Get journal by ID |
| [**getJournalEntriesAsync**](JournalsApi.md#getJournalEntriesAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries | Get journal entries |
| [**getJournalEntriesCountAsync**](JournalsApi.md#getJournalEntriesCountAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/Count | Count journal entries |
| [**getJournalEntryDetailsAsync**](JournalsApi.md#getJournalEntryDetailsAsync) | **GET** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Get journal entry by ID |
| [**getJournalsAsync**](JournalsApi.md#getJournalsAsync) | **GET** /api/v2/AccountingService/Journals | Get all journals |
| [**patchJournalAsync**](JournalsApi.md#patchJournalAsync) | **PATCH** /api/v2/AccountingService/Journals/{journalId} | Patch a journal |
| [**patchJournalEntryAsync**](JournalsApi.md#patchJournalEntryAsync) | **PATCH** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Patch a journal entry |
| [**postJournalEntryAsync**](JournalsApi.md#postJournalEntryAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId}/Post | Post a draft journal entry |
| [**reverseJournalEntryAsync**](JournalsApi.md#reverseJournalEntryAsync) | **POST** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId}/Reverse | Reverse a posted journal entry |
| [**updateJournalAsync**](JournalsApi.md#updateJournalAsync) | **PUT** /api/v2/AccountingService/Journals/{journalId} | Update journal |
| [**updateJournalEntryAsync**](JournalsApi.md#updateJournalEntryAsync) | **PUT** /api/v2/AccountingService/Journals/{journalId}/Entries/{entryId} | Update journal entry |


<a id="aggregateJournalEntryCreditsAsync"></a>
# **aggregateJournalEntryCreditsAsync**
> MoneyEnvelope aggregateJournalEntryCreditsAsync(journalId, tenantId, currencyId, apiVersion, xApiVersion)

Aggregate journal entry credits

Returns the sum of all credit amounts for entries in the specified journal, normalized to the target currency.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.aggregateJournalEntryCreditsAsync(journalId, tenantId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#aggregateJournalEntryCreditsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#aggregateJournalEntryCreditsAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **currencyId** | **kotlin.String**|  | [optional] [default to &quot;USD.USA&quot;] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="aggregateJournalEntryDebitsAsync"></a>
# **aggregateJournalEntryDebitsAsync**
> MoneyEnvelope aggregateJournalEntryDebitsAsync(journalId, tenantId, currencyId, apiVersion, xApiVersion)

Aggregate journal entry debits

Returns the sum of all debit amounts for entries in the specified journal, normalized to the target currency.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalsApi()
val journalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.aggregateJournalEntryDebitsAsync(journalId, tenantId, currencyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#aggregateJournalEntryDebitsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#aggregateJournalEntryDebitsAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **currencyId** | **kotlin.String**|  | [optional] [default to &quot;USD.USA&quot;] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

<a id="getJournalEntryDetailsAsync"></a>
# **getJournalEntryDetailsAsync**
> JournalEntryDtoEnvelope getJournalEntryDetailsAsync(journalId, entryId, tenantId, apiVersion, xApiVersion)

Get journal entry by ID

Retrieves a single journal entry WITH its hydrated posting lines — each line&#39;s account, direction, description and currency facets (transaction / functional / account / USD).

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
    val result : JournalEntryDtoEnvelope = apiInstance.getJournalEntryDetailsAsync(journalId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#getJournalEntryDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#getJournalEntryDetailsAsync")
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

[**JournalEntryDtoEnvelope**](JournalEntryDtoEnvelope.md)

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

<a id="patchJournalAsync"></a>
# **patchJournalAsync**
> EmptyEnvelope patchJournalAsync(journalId, tenantId, apiVersion, xApiVersion, operation)

Patch a journal

Partially updates a journal.

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
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchJournalAsync(journalId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#patchJournalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#patchJournalAsync")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchJournalEntryAsync"></a>
# **patchJournalEntryAsync**
> EmptyEnvelope patchJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion, operation)

Patch a journal entry

Partially updates a journal entry.

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
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#patchJournalEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#patchJournalEntryAsync")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="postJournalEntryAsync"></a>
# **postJournalEntryAsync**
> EmptyEnvelope postJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion)

Post a draft journal entry

Posts a DRAFT journal entry into its own open fiscal period. Enforces the balanced-entry invariant and the open-period gate, then seals the entry (immutable — correct via reversal, never edit/delete). An unbalanced draft or a closed period is rejected. Requires the journals_post permission.

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
    val result : EmptyEnvelope = apiInstance.postJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#postJournalEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#postJournalEntryAsync")
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

<a id="reverseJournalEntryAsync"></a>
# **reverseJournalEntryAsync**
> EmptyEnvelope reverseJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion, reverseJournalEntryRequest)

Reverse a posted journal entry

Reverses a POSTED journal entry by writing a balanced compensating counter-entry into the supplied open fiscal period and marking the original Reversed — one atomic operation (append-only audit trail). Requires the journals_reverse permission.

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
val reverseJournalEntryRequest : ReverseJournalEntryRequest =  // ReverseJournalEntryRequest | 
try {
    val result : EmptyEnvelope = apiInstance.reverseJournalEntryAsync(journalId, entryId, tenantId, apiVersion, xApiVersion, reverseJournalEntryRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalsApi#reverseJournalEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalsApi#reverseJournalEntryAsync")
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
| **reverseJournalEntryRequest** | [**ReverseJournalEntryRequest**](ReverseJournalEntryRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
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

