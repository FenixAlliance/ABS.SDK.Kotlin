# FinancialBooksApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createFinancialBookAsync**](FinancialBooksApi.md#createFinancialBookAsync) | **POST** /api/v2/AccountingService/FinancialBooks | Creates a new financial book |
| [**deleteFinancialBookAsync**](FinancialBooksApi.md#deleteFinancialBookAsync) | **DELETE** /api/v2/AccountingService/FinancialBooks/{financialBookId} | Deletes an existing financial book |
| [**getFinancialBookDetailsAsync**](FinancialBooksApi.md#getFinancialBookDetailsAsync) | **GET** /api/v2/AccountingService/FinancialBooks/{financialBookId} | Gets the details of a specific financial book |
| [**getFinancialBooksAsync**](FinancialBooksApi.md#getFinancialBooksAsync) | **GET** /api/v2/AccountingService/FinancialBooks | Get all financial books for a tenant |
| [**getFinancialBooksCountAsync**](FinancialBooksApi.md#getFinancialBooksCountAsync) | **GET** /api/v2/AccountingService/FinancialBooks/Count | Get the count of financial books |
| [**updateFinancialBookAsync**](FinancialBooksApi.md#updateFinancialBookAsync) | **PUT** /api/v2/AccountingService/FinancialBooks/{financialBookId} | Updates an existing financial book |


<a id="createFinancialBookAsync"></a>
# **createFinancialBookAsync**
> EmptyEnvelope createFinancialBookAsync(tenantId, financialBookCreateDto, apiVersion, xApiVersion)

Creates a new financial book

Creates a new financial book.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FinancialBooksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val financialBookCreateDto : FinancialBookCreateDto =  // FinancialBookCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createFinancialBookAsync(tenantId, financialBookCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FinancialBooksApi#createFinancialBookAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FinancialBooksApi#createFinancialBookAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **financialBookCreateDto** | [**FinancialBookCreateDto**](FinancialBookCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteFinancialBookAsync"></a>
# **deleteFinancialBookAsync**
> EmptyEnvelope deleteFinancialBookAsync(financialBookId, tenantId, apiVersion, xApiVersion)

Deletes an existing financial book

Deletes an existing financial book.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FinancialBooksApi()
val financialBookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteFinancialBookAsync(financialBookId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FinancialBooksApi#deleteFinancialBookAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FinancialBooksApi#deleteFinancialBookAsync")
    e.printStackTrace()
}
```

### Parameters
| **financialBookId** | **java.util.UUID**|  | |
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

<a id="getFinancialBookDetailsAsync"></a>
# **getFinancialBookDetailsAsync**
> FinancialBookDtoEnvelope getFinancialBookDetailsAsync(financialBookId, tenantId, apiVersion, xApiVersion)

Gets the details of a specific financial book

Gets the details of a specific financial book.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FinancialBooksApi()
val financialBookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FinancialBookDtoEnvelope = apiInstance.getFinancialBookDetailsAsync(financialBookId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FinancialBooksApi#getFinancialBookDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FinancialBooksApi#getFinancialBookDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **financialBookId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FinancialBookDtoEnvelope**](FinancialBookDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFinancialBooksAsync"></a>
# **getFinancialBooksAsync**
> FinancialBookDtoListEnvelope getFinancialBooksAsync(tenantId, apiVersion, xApiVersion)

Get all financial books for a tenant

Retrieves all financial books for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FinancialBooksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FinancialBookDtoListEnvelope = apiInstance.getFinancialBooksAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FinancialBooksApi#getFinancialBooksAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FinancialBooksApi#getFinancialBooksAsync")
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

[**FinancialBookDtoListEnvelope**](FinancialBookDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getFinancialBooksCountAsync"></a>
# **getFinancialBooksCountAsync**
> Int32Envelope getFinancialBooksCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of financial books

Get the count of financial books.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FinancialBooksApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getFinancialBooksCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FinancialBooksApi#getFinancialBooksCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FinancialBooksApi#getFinancialBooksCountAsync")
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

<a id="updateFinancialBookAsync"></a>
# **updateFinancialBookAsync**
> EmptyEnvelope updateFinancialBookAsync(financialBookId, tenantId, financialBookUpdateDto, apiVersion, xApiVersion)

Updates an existing financial book

Updates an existing financial book.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FinancialBooksApi()
val financialBookId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val financialBookUpdateDto : FinancialBookUpdateDto =  // FinancialBookUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateFinancialBookAsync(financialBookId, tenantId, financialBookUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FinancialBooksApi#updateFinancialBookAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FinancialBooksApi#updateFinancialBookAsync")
    e.printStackTrace()
}
```

### Parameters
| **financialBookId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **financialBookUpdateDto** | [**FinancialBookUpdateDto**](FinancialBookUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

