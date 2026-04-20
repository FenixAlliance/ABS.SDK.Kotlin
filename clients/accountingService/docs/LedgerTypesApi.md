# LedgerTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLedgerTypeAsync**](LedgerTypesApi.md#createLedgerTypeAsync) | **POST** /api/v2/AccountingService/LedgerTypes | Creates a new ledger type |
| [**deleteLedgerTypeAsync**](LedgerTypesApi.md#deleteLedgerTypeAsync) | **DELETE** /api/v2/AccountingService/LedgerTypes/{ledgerTypeId} | Deletes a ledger type |
| [**getLedgerTypeDetailsAsync**](LedgerTypesApi.md#getLedgerTypeDetailsAsync) | **GET** /api/v2/AccountingService/LedgerTypes/{ledgerTypeId} | Gets a ledger type by ID |
| [**getLedgerTypesAsync**](LedgerTypesApi.md#getLedgerTypesAsync) | **GET** /api/v2/AccountingService/LedgerTypes | Retrieves all ledger types |
| [**getLedgerTypesCountAsync**](LedgerTypesApi.md#getLedgerTypesCountAsync) | **GET** /api/v2/AccountingService/LedgerTypes/Count | Counts ledger types |
| [**updateLedgerTypeAsync**](LedgerTypesApi.md#updateLedgerTypeAsync) | **PUT** /api/v2/AccountingService/LedgerTypes/{ledgerTypeId} | Updates a ledger type |


<a id="createLedgerTypeAsync"></a>
# **createLedgerTypeAsync**
> EmptyEnvelope createLedgerTypeAsync(tenantId, apiVersion, xApiVersion, ledgerTypeCreateDto)

Creates a new ledger type

Creates a new ledger type for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgerTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val ledgerTypeCreateDto : LedgerTypeCreateDto =  // LedgerTypeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createLedgerTypeAsync(tenantId, apiVersion, xApiVersion, ledgerTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgerTypesApi#createLedgerTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgerTypesApi#createLedgerTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ledgerTypeCreateDto** | [**LedgerTypeCreateDto**](LedgerTypeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLedgerTypeAsync"></a>
# **deleteLedgerTypeAsync**
> EmptyEnvelope deleteLedgerTypeAsync(ledgerTypeId, tenantId, apiVersion, xApiVersion)

Deletes a ledger type

Deletes the specified ledger type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgerTypesApi()
val ledgerTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLedgerTypeAsync(ledgerTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgerTypesApi#deleteLedgerTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgerTypesApi#deleteLedgerTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **ledgerTypeId** | **java.util.UUID**|  | |
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

<a id="getLedgerTypeDetailsAsync"></a>
# **getLedgerTypeDetailsAsync**
> LedgerTypeDtoEnvelope getLedgerTypeDetailsAsync(ledgerTypeId, tenantId, apiVersion, xApiVersion)

Gets a ledger type by ID

Retrieves the details of a ledger type using its unique ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgerTypesApi()
val ledgerTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LedgerTypeDtoEnvelope = apiInstance.getLedgerTypeDetailsAsync(ledgerTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgerTypesApi#getLedgerTypeDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgerTypesApi#getLedgerTypeDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **ledgerTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LedgerTypeDtoEnvelope**](LedgerTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLedgerTypesAsync"></a>
# **getLedgerTypesAsync**
> LedgerTypeDtoIReadOnlyListEnvelope getLedgerTypesAsync(tenantId, apiVersion, xApiVersion)

Retrieves all ledger types

Gets all ledger types for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgerTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LedgerTypeDtoIReadOnlyListEnvelope = apiInstance.getLedgerTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgerTypesApi#getLedgerTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgerTypesApi#getLedgerTypesAsync")
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

[**LedgerTypeDtoIReadOnlyListEnvelope**](LedgerTypeDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLedgerTypesCountAsync"></a>
# **getLedgerTypesCountAsync**
> Int32Envelope getLedgerTypesCountAsync(tenantId, apiVersion, xApiVersion)

Counts ledger types

Gets the count of ledger types for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgerTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getLedgerTypesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgerTypesApi#getLedgerTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgerTypesApi#getLedgerTypesCountAsync")
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

<a id="updateLedgerTypeAsync"></a>
# **updateLedgerTypeAsync**
> EmptyEnvelope updateLedgerTypeAsync(ledgerTypeId, tenantId, apiVersion, xApiVersion, ledgerTypeUpdateDto)

Updates a ledger type

Updates the specified ledger type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgerTypesApi()
val ledgerTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val ledgerTypeUpdateDto : LedgerTypeUpdateDto =  // LedgerTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateLedgerTypeAsync(ledgerTypeId, tenantId, apiVersion, xApiVersion, ledgerTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgerTypesApi#updateLedgerTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgerTypesApi#updateLedgerTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **ledgerTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ledgerTypeUpdateDto** | [**LedgerTypeUpdateDto**](LedgerTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

