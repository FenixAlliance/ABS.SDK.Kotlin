# JournalTypesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createJournalTypeAsync**](JournalTypesApi.md#createJournalTypeAsync) | **POST** /api/v2/AccountingService/JournalTypes | Creates a new journal type |
| [**deleteJournalTypeAsync**](JournalTypesApi.md#deleteJournalTypeAsync) | **DELETE** /api/v2/AccountingService/JournalTypes/{journalTypeId} | Deletes a journal type |
| [**getJournalTypeDetailsAsync**](JournalTypesApi.md#getJournalTypeDetailsAsync) | **GET** /api/v2/AccountingService/JournalTypes/{journalTypeId} | Retrieves a journal type by ID |
| [**getJournalTypesAsync**](JournalTypesApi.md#getJournalTypesAsync) | **GET** /api/v2/AccountingService/JournalTypes | Retrieves all journal types |
| [**getJournalTypesCountAsync**](JournalTypesApi.md#getJournalTypesCountAsync) | **GET** /api/v2/AccountingService/JournalTypes/Count | Counts journal types |
| [**updateJournalTypeAsync**](JournalTypesApi.md#updateJournalTypeAsync) | **PUT** /api/v2/AccountingService/JournalTypes/{journalTypeId} | Updates an existing journal type |


<a id="createJournalTypeAsync"></a>
# **createJournalTypeAsync**
> EmptyEnvelope createJournalTypeAsync(tenantId, apiVersion, xApiVersion, journalTypeCreateDto)

Creates a new journal type

Adds a new journal type to the tenant&#39;s catalog.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val journalTypeCreateDto : JournalTypeCreateDto =  // JournalTypeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJournalTypeAsync(tenantId, apiVersion, xApiVersion, journalTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalTypesApi#createJournalTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalTypesApi#createJournalTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **journalTypeCreateDto** | [**JournalTypeCreateDto**](JournalTypeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteJournalTypeAsync"></a>
# **deleteJournalTypeAsync**
> EmptyEnvelope deleteJournalTypeAsync(journalTypeId, tenantId, apiVersion, xApiVersion)

Deletes a journal type

Removes a journal type from the tenant&#39;s configuration.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalTypesApi()
val journalTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJournalTypeAsync(journalTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalTypesApi#deleteJournalTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalTypesApi#deleteJournalTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalTypeId** | **java.util.UUID**|  | |
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

<a id="getJournalTypeDetailsAsync"></a>
# **getJournalTypeDetailsAsync**
> JournalTypeDtoEnvelope getJournalTypeDetailsAsync(journalTypeId, tenantId, apiVersion, xApiVersion)

Retrieves a journal type by ID

Fetches the journal type matching the specified ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalTypesApi()
val journalTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JournalTypeDtoEnvelope = apiInstance.getJournalTypeDetailsAsync(journalTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalTypesApi#getJournalTypeDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalTypesApi#getJournalTypeDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JournalTypeDtoEnvelope**](JournalTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJournalTypesAsync"></a>
# **getJournalTypesAsync**
> JournalTypeDtoIReadOnlyListEnvelope getJournalTypesAsync(tenantId, apiVersion, xApiVersion)

Retrieves all journal types

Fetches all journal types for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JournalTypeDtoIReadOnlyListEnvelope = apiInstance.getJournalTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalTypesApi#getJournalTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalTypesApi#getJournalTypesAsync")
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

[**JournalTypeDtoIReadOnlyListEnvelope**](JournalTypeDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJournalTypesCountAsync"></a>
# **getJournalTypesCountAsync**
> Int32Envelope getJournalTypesCountAsync(tenantId, apiVersion, xApiVersion)

Counts journal types

Returns the total number of journal types available for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getJournalTypesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalTypesApi#getJournalTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalTypesApi#getJournalTypesCountAsync")
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

<a id="updateJournalTypeAsync"></a>
# **updateJournalTypeAsync**
> EmptyEnvelope updateJournalTypeAsync(journalTypeId, tenantId, apiVersion, xApiVersion, journalTypeUpdateDto)

Updates an existing journal type

Modifies the details of a specific journal type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JournalTypesApi()
val journalTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val journalTypeUpdateDto : JournalTypeUpdateDto =  // JournalTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJournalTypeAsync(journalTypeId, tenantId, apiVersion, xApiVersion, journalTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JournalTypesApi#updateJournalTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JournalTypesApi#updateJournalTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **journalTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **journalTypeUpdateDto** | [**JournalTypeUpdateDto**](JournalTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

