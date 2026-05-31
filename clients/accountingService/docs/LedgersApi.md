# LedgersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createLedgerAsync**](LedgersApi.md#createLedgerAsync) | **POST** /api/v2/AccountingService/Ledgers | Creates a new ledger |
| [**deleteLedgerAsync**](LedgersApi.md#deleteLedgerAsync) | **DELETE** /api/v2/AccountingService/Ledgers/{ledgerId} | Deletes a ledger |
| [**getLedgerDetailsAsync**](LedgersApi.md#getLedgerDetailsAsync) | **GET** /api/v2/AccountingService/Ledgers/{ledgerId} | Gets a ledger by ID |
| [**getLedgersAsync**](LedgersApi.md#getLedgersAsync) | **GET** /api/v2/AccountingService/Ledgers | Retrieves all ledgers |
| [**getLedgersCountAsync**](LedgersApi.md#getLedgersCountAsync) | **GET** /api/v2/AccountingService/Ledgers/Count | Counts ledgers |
| [**updateLedgerAsync**](LedgersApi.md#updateLedgerAsync) | **PUT** /api/v2/AccountingService/Ledgers/{ledgerId} | Updates a ledger |


<a id="createLedgerAsync"></a>
# **createLedgerAsync**
> EmptyEnvelope createLedgerAsync(tenantId, apiVersion, xApiVersion, createLedgerDto)

Creates a new ledger

Creates a new ledger for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val createLedgerDto : CreateLedgerDto =  // CreateLedgerDto | 
try {
    val result : EmptyEnvelope = apiInstance.createLedgerAsync(tenantId, apiVersion, xApiVersion, createLedgerDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#createLedgerAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#createLedgerAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createLedgerDto** | [**CreateLedgerDto**](CreateLedgerDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLedgerAsync"></a>
# **deleteLedgerAsync**
> EmptyEnvelope deleteLedgerAsync(ledgerId, tenantId, apiVersion, xApiVersion)

Deletes a ledger

Deletes the specified ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgersApi()
val ledgerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLedgerAsync(ledgerId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#deleteLedgerAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#deleteLedgerAsync")
    e.printStackTrace()
}
```

### Parameters
| **ledgerId** | **java.util.UUID**|  | |
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

<a id="getLedgerDetailsAsync"></a>
# **getLedgerDetailsAsync**
> LedgerDtoEnvelope getLedgerDetailsAsync(ledgerId, tenantId, apiVersion, xApiVersion)

Gets a ledger by ID

Retrieves the details of a ledger using its unique ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgersApi()
val ledgerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LedgerDtoEnvelope = apiInstance.getLedgerDetailsAsync(ledgerId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#getLedgerDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#getLedgerDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **ledgerId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LedgerDtoEnvelope**](LedgerDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLedgersAsync"></a>
# **getLedgersAsync**
> LedgerDtoIReadOnlyListEnvelope getLedgersAsync(tenantId, apiVersion, xApiVersion)

Retrieves all ledgers

Gets all ledgers for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LedgerDtoIReadOnlyListEnvelope = apiInstance.getLedgersAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#getLedgersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#getLedgersAsync")
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

[**LedgerDtoIReadOnlyListEnvelope**](LedgerDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLedgersCountAsync"></a>
# **getLedgersCountAsync**
> Int32Envelope getLedgersCountAsync(tenantId, apiVersion, xApiVersion)

Counts ledgers

Gets the count of ledgers for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getLedgersCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#getLedgersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#getLedgersCountAsync")
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

<a id="updateLedgerAsync"></a>
# **updateLedgerAsync**
> EmptyEnvelope updateLedgerAsync(ledgerId, tenantId, apiVersion, xApiVersion, updateLedgerDto)

Updates a ledger

Updates the specified ledger.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LedgersApi()
val ledgerId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val updateLedgerDto : UpdateLedgerDto =  // UpdateLedgerDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateLedgerAsync(ledgerId, tenantId, apiVersion, xApiVersion, updateLedgerDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LedgersApi#updateLedgerAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LedgersApi#updateLedgerAsync")
    e.printStackTrace()
}
```

### Parameters
| **ledgerId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateLedgerDto** | [**UpdateLedgerDto**](UpdateLedgerDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

