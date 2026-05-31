# DeliveryNotesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDeliveryNoteAsync**](DeliveryNotesApi.md#createDeliveryNoteAsync) | **POST** /api/v2/LogisticsService/DeliveryNotes | Create a delivery note |
| [**deleteDeliveryNoteAsync**](DeliveryNotesApi.md#deleteDeliveryNoteAsync) | **DELETE** /api/v2/LogisticsService/DeliveryNotes/{deliveryNoteId} | Delete a delivery note |
| [**getDeliveryNoteByIdAsync**](DeliveryNotesApi.md#getDeliveryNoteByIdAsync) | **GET** /api/v2/LogisticsService/DeliveryNotes/{deliveryNoteId} | Get delivery note by ID |
| [**getDeliveryNotesAsync**](DeliveryNotesApi.md#getDeliveryNotesAsync) | **GET** /api/v2/LogisticsService/DeliveryNotes | Get all delivery notes |
| [**getDeliveryNotesCountAsync**](DeliveryNotesApi.md#getDeliveryNotesCountAsync) | **GET** /api/v2/LogisticsService/DeliveryNotes/Count | Get delivery notes count |
| [**updateDeliveryNoteAsync**](DeliveryNotesApi.md#updateDeliveryNoteAsync) | **PUT** /api/v2/LogisticsService/DeliveryNotes/{deliveryNoteId} | Update a delivery note |


<a id="createDeliveryNoteAsync"></a>
# **createDeliveryNoteAsync**
> EmptyEnvelope createDeliveryNoteAsync(tenantId, apiVersion, xApiVersion, deliveryNoteCreateDto)

Create a delivery note

Creates a new delivery note.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DeliveryNotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val deliveryNoteCreateDto : DeliveryNoteCreateDto =  // DeliveryNoteCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createDeliveryNoteAsync(tenantId, apiVersion, xApiVersion, deliveryNoteCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeliveryNotesApi#createDeliveryNoteAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeliveryNotesApi#createDeliveryNoteAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deliveryNoteCreateDto** | [**DeliveryNoteCreateDto**](DeliveryNoteCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteDeliveryNoteAsync"></a>
# **deleteDeliveryNoteAsync**
> EmptyEnvelope deleteDeliveryNoteAsync(deliveryNoteId, tenantId, apiVersion, xApiVersion)

Delete a delivery note

Deletes a delivery note.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DeliveryNotesApi()
val deliveryNoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteDeliveryNoteAsync(deliveryNoteId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeliveryNotesApi#deleteDeliveryNoteAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeliveryNotesApi#deleteDeliveryNoteAsync")
    e.printStackTrace()
}
```

### Parameters
| **deliveryNoteId** | **java.util.UUID**|  | |
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

<a id="getDeliveryNoteByIdAsync"></a>
# **getDeliveryNoteByIdAsync**
> DeliveryNoteDtoEnvelope getDeliveryNoteByIdAsync(deliveryNoteId, tenantId, apiVersion, xApiVersion)

Get delivery note by ID

Retrieves a specific delivery note.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DeliveryNotesApi()
val deliveryNoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DeliveryNoteDtoEnvelope = apiInstance.getDeliveryNoteByIdAsync(deliveryNoteId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeliveryNotesApi#getDeliveryNoteByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeliveryNotesApi#getDeliveryNoteByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **deliveryNoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**DeliveryNoteDtoEnvelope**](DeliveryNoteDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeliveryNotesAsync"></a>
# **getDeliveryNotesAsync**
> DeliveryNoteDtoListEnvelope getDeliveryNotesAsync(tenantId, apiVersion, xApiVersion)

Get all delivery notes

Retrieves all delivery notes for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DeliveryNotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : DeliveryNoteDtoListEnvelope = apiInstance.getDeliveryNotesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeliveryNotesApi#getDeliveryNotesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeliveryNotesApi#getDeliveryNotesAsync")
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

[**DeliveryNoteDtoListEnvelope**](DeliveryNoteDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDeliveryNotesCountAsync"></a>
# **getDeliveryNotesCountAsync**
> Int32Envelope getDeliveryNotesCountAsync(tenantId, apiVersion, xApiVersion)

Get delivery notes count

Returns the count of delivery notes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DeliveryNotesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getDeliveryNotesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeliveryNotesApi#getDeliveryNotesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeliveryNotesApi#getDeliveryNotesCountAsync")
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

<a id="updateDeliveryNoteAsync"></a>
# **updateDeliveryNoteAsync**
> EmptyEnvelope updateDeliveryNoteAsync(deliveryNoteId, tenantId, apiVersion, xApiVersion, deliveryNoteUpdateDto)

Update a delivery note

Updates an existing delivery note.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DeliveryNotesApi()
val deliveryNoteId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val deliveryNoteUpdateDto : DeliveryNoteUpdateDto =  // DeliveryNoteUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateDeliveryNoteAsync(deliveryNoteId, tenantId, apiVersion, xApiVersion, deliveryNoteUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeliveryNotesApi#updateDeliveryNoteAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeliveryNotesApi#updateDeliveryNoteAsync")
    e.printStackTrace()
}
```

### Parameters
| **deliveryNoteId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **deliveryNoteUpdateDto** | [**DeliveryNoteUpdateDto**](DeliveryNoteUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

