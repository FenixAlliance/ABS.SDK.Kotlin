# FiscalYearsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFiscalYearAsync**](FiscalYearsApi.md#createFiscalYearAsync) | **POST** /api/v2/AccountingService/FiscalYears | Create fiscal year |
| [**deleteFiscalYearAsync**](FiscalYearsApi.md#deleteFiscalYearAsync) | **DELETE** /api/v2/AccountingService/FiscalYears/{fiscalYearId} | Delete fiscal year |
| [**getFiscalYearDetailsAsync**](FiscalYearsApi.md#getFiscalYearDetailsAsync) | **GET** /api/v2/AccountingService/FiscalYears/{fiscalYearId} | Get fiscal year by ID |
| [**getFiscalYearsAsync**](FiscalYearsApi.md#getFiscalYearsAsync) | **GET** /api/v2/AccountingService/FiscalYears | Get all fiscal years |
| [**getFiscalYearsCountAsync**](FiscalYearsApi.md#getFiscalYearsCountAsync) | **GET** /api/v2/AccountingService/FiscalYears/Count | Count fiscal years |
| [**updateFiscalYearAsync**](FiscalYearsApi.md#updateFiscalYearAsync) | **PUT** /api/v2/AccountingService/FiscalYears/{fiscalYearId} | Update fiscal year |


<a id="createFiscalYearAsync"></a>
# **createFiscalYearAsync**
> EmptyEnvelope createFiscalYearAsync(tenantId, apiVersion, xApiVersion, fiscalYearCreateDto)

Create fiscal year

Creates a new fiscal year entry for a tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalYearsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalYearCreateDto : FiscalYearCreateDto =  // FiscalYearCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createFiscalYearAsync(tenantId, apiVersion, xApiVersion, fiscalYearCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalYearsApi#createFiscalYearAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalYearsApi#createFiscalYearAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalYearCreateDto** | [**FiscalYearCreateDto**](FiscalYearCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFiscalYearAsync"></a>
# **deleteFiscalYearAsync**
> EmptyEnvelope deleteFiscalYearAsync(fiscalYearId, tenantId, apiVersion, xApiVersion)

Delete fiscal year

Deletes a fiscal year identified by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalYearsApi()
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFiscalYearAsync(fiscalYearId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalYearsApi#deleteFiscalYearAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalYearsApi#deleteFiscalYearAsync")
    e.printStackTrace()
}
```

### Parameters
| **fiscalYearId** | **java.util.UUID**|  | |
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

<a id="getFiscalYearDetailsAsync"></a>
# **getFiscalYearDetailsAsync**
> FiscalYearDtoEnvelope getFiscalYearDetailsAsync(fiscalYearId, tenantId, apiVersion, xApiVersion)

Get fiscal year by ID

Gets details for a specific fiscal year.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalYearsApi()
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalYearDtoEnvelope = apiInstance.getFiscalYearDetailsAsync(fiscalYearId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalYearsApi#getFiscalYearDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalYearsApi#getFiscalYearDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **fiscalYearId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FiscalYearDtoEnvelope**](FiscalYearDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalYearsAsync"></a>
# **getFiscalYearsAsync**
> FiscalYearDtoIReadOnlyListEnvelope getFiscalYearsAsync(tenantId, apiVersion, xApiVersion)

Get all fiscal years

Retrieves a list of fiscal years for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalYearsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FiscalYearDtoIReadOnlyListEnvelope = apiInstance.getFiscalYearsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalYearsApi#getFiscalYearsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalYearsApi#getFiscalYearsAsync")
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

[**FiscalYearDtoIReadOnlyListEnvelope**](FiscalYearDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFiscalYearsCountAsync"></a>
# **getFiscalYearsCountAsync**
> Int32Envelope getFiscalYearsCountAsync(tenantId, apiVersion, xApiVersion)

Count fiscal years

Returns the number of fiscal years for a tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalYearsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getFiscalYearsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalYearsApi#getFiscalYearsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalYearsApi#getFiscalYearsCountAsync")
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

<a id="updateFiscalYearAsync"></a>
# **updateFiscalYearAsync**
> EmptyEnvelope updateFiscalYearAsync(fiscalYearId, tenantId, apiVersion, xApiVersion, fiscalYearUpdateDto)

Update fiscal year

Updates an existing fiscal year identified by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FiscalYearsApi()
val fiscalYearId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val fiscalYearUpdateDto : FiscalYearUpdateDto =  // FiscalYearUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateFiscalYearAsync(fiscalYearId, tenantId, apiVersion, xApiVersion, fiscalYearUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FiscalYearsApi#updateFiscalYearAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FiscalYearsApi#updateFiscalYearAsync")
    e.printStackTrace()
}
```

### Parameters
| **fiscalYearId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fiscalYearUpdateDto** | [**FiscalYearUpdateDto**](FiscalYearUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

