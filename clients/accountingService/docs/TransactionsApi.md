# TransactionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTransaction**](TransactionsApi.md#createTransaction) | **POST** /api/v2/AccountingService/Transactions | Create a transaction |
| [**createTransactionCategory**](TransactionsApi.md#createTransactionCategory) | **POST** /api/v2/AccountingService/Transactions/Categories | Create a transaction category |
| [**deleteTransaction**](TransactionsApi.md#deleteTransaction) | **DELETE** /api/v2/AccountingService/Transactions/{transactionId} | Delete a transaction |
| [**deleteTransactionCategory**](TransactionsApi.md#deleteTransactionCategory) | **DELETE** /api/v2/AccountingService/Transactions/Categories/{categoryId} | Delete a transaction category |
| [**getTransaction**](TransactionsApi.md#getTransaction) | **GET** /api/v2/AccountingService/Transactions/{transactionId} | Get transaction by ID |
| [**getTransactionCategories**](TransactionsApi.md#getTransactionCategories) | **GET** /api/v2/AccountingService/Transactions/Categories | Get all transaction categories |
| [**getTransactionCategoriesCount**](TransactionsApi.md#getTransactionCategoriesCount) | **GET** /api/v2/AccountingService/Transactions/Categories/Count | Get transaction categories count |
| [**getTransactionCategory**](TransactionsApi.md#getTransactionCategory) | **GET** /api/v2/AccountingService/Transactions/Categories/{categoryId} | Get transaction category by ID |
| [**getTransactions**](TransactionsApi.md#getTransactions) | **GET** /api/v2/AccountingService/Transactions | Get all transactions for a tenant |
| [**getTransactionsCount**](TransactionsApi.md#getTransactionsCount) | **GET** /api/v2/AccountingService/Transactions/Count | Get transactions count |
| [**updateTransaction**](TransactionsApi.md#updateTransaction) | **PUT** /api/v2/AccountingService/Transactions/{transactionId} | Update a transaction |
| [**updateTransactionCategory**](TransactionsApi.md#updateTransactionCategory) | **PUT** /api/v2/AccountingService/Transactions/Categories/{categoryId} | Update a transaction category |


<a id="createTransaction"></a>
# **createTransaction**
> TransactionDtoEnvelope createTransaction(tenantId, apiVersion, xApiVersion, transactionCreateDto)

Create a transaction

Creates a new transaction for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val transactionCreateDto : TransactionCreateDto =  // TransactionCreateDto | 
try {
    val result : TransactionDtoEnvelope = apiInstance.createTransaction(tenantId, apiVersion, xApiVersion, transactionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#createTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#createTransaction")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionCreateDto** | [**TransactionCreateDto**](TransactionCreateDto.md)|  | [optional] |

### Return type

[**TransactionDtoEnvelope**](TransactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createTransactionCategory"></a>
# **createTransactionCategory**
> TransactionCategoryDtoEnvelope createTransactionCategory(tenantId, apiVersion, xApiVersion, transactionCategoryCreateDto)

Create a transaction category

Creates a new transaction category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val transactionCategoryCreateDto : TransactionCategoryCreateDto =  // TransactionCategoryCreateDto | 
try {
    val result : TransactionCategoryDtoEnvelope = apiInstance.createTransactionCategory(tenantId, apiVersion, xApiVersion, transactionCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#createTransactionCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#createTransactionCategory")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionCategoryCreateDto** | [**TransactionCategoryCreateDto**](TransactionCategoryCreateDto.md)|  | [optional] |

### Return type

[**TransactionCategoryDtoEnvelope**](TransactionCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTransaction"></a>
# **deleteTransaction**
> TransactionDtoEnvelope deleteTransaction(transactionId, tenantId, apiVersion, xApiVersion)

Delete a transaction

Deletes a transaction by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val transactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TransactionDtoEnvelope = apiInstance.deleteTransaction(transactionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#deleteTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#deleteTransaction")
    e.printStackTrace()
}
```

### Parameters
| **transactionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TransactionDtoEnvelope**](TransactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteTransactionCategory"></a>
# **deleteTransactionCategory**
> TransactionCategoryDtoEnvelope deleteTransactionCategory(categoryId, tenantId, apiVersion, xApiVersion)

Delete a transaction category

Deletes a transaction category by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TransactionCategoryDtoEnvelope = apiInstance.deleteTransactionCategory(categoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#deleteTransactionCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#deleteTransactionCategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TransactionCategoryDtoEnvelope**](TransactionCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTransaction"></a>
# **getTransaction**
> TransactionDtoEnvelope getTransaction(transactionId, tenantId, apiVersion, xApiVersion)

Get transaction by ID

Retrieves a specific transaction by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val transactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TransactionDtoEnvelope = apiInstance.getTransaction(transactionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransaction")
    e.printStackTrace()
}
```

### Parameters
| **transactionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TransactionDtoEnvelope**](TransactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTransactionCategories"></a>
# **getTransactionCategories**
> TransactionCategoryDtoListEnvelope getTransactionCategories(tenantId, apiVersion, xApiVersion)

Get all transaction categories

Retrieves all transaction categories for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TransactionCategoryDtoListEnvelope = apiInstance.getTransactionCategories(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransactionCategories")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransactionCategories")
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

[**TransactionCategoryDtoListEnvelope**](TransactionCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTransactionCategoriesCount"></a>
# **getTransactionCategoriesCount**
> Int32Envelope getTransactionCategoriesCount(tenantId, apiVersion, xApiVersion)

Get transaction categories count

Returns total number of transaction categories for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTransactionCategoriesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransactionCategoriesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransactionCategoriesCount")
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

<a id="getTransactionCategory"></a>
# **getTransactionCategory**
> TransactionCategoryDtoEnvelope getTransactionCategory(categoryId, tenantId, apiVersion, xApiVersion)

Get transaction category by ID

Retrieves a specific transaction category by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TransactionCategoryDtoEnvelope = apiInstance.getTransactionCategory(categoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransactionCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransactionCategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TransactionCategoryDtoEnvelope**](TransactionCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTransactions"></a>
# **getTransactions**
> TransactionDtoListEnvelope getTransactions(tenantId, apiVersion, xApiVersion)

Get all transactions for a tenant

Retrieves all transactions for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TransactionDtoListEnvelope = apiInstance.getTransactions(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransactions")
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

[**TransactionDtoListEnvelope**](TransactionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTransactionsCount"></a>
# **getTransactionsCount**
> Int32Envelope getTransactionsCount(tenantId, apiVersion, xApiVersion)

Get transactions count

Returns total number of transactions for the tenant with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTransactionsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#getTransactionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#getTransactionsCount")
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

<a id="updateTransaction"></a>
# **updateTransaction**
> TransactionDtoEnvelope updateTransaction(transactionId, tenantId, apiVersion, xApiVersion, transactionUpdateDto)

Update a transaction

Updates an existing transaction with the provided data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val transactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val transactionUpdateDto : TransactionUpdateDto =  // TransactionUpdateDto | 
try {
    val result : TransactionDtoEnvelope = apiInstance.updateTransaction(transactionId, tenantId, apiVersion, xApiVersion, transactionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#updateTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#updateTransaction")
    e.printStackTrace()
}
```

### Parameters
| **transactionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionUpdateDto** | [**TransactionUpdateDto**](TransactionUpdateDto.md)|  | [optional] |

### Return type

[**TransactionDtoEnvelope**](TransactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateTransactionCategory"></a>
# **updateTransactionCategory**
> TransactionCategoryDtoEnvelope updateTransactionCategory(categoryId, tenantId, apiVersion, xApiVersion, transactionCategoryUpdateDto)

Update a transaction category

Updates an existing transaction category with the provided data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TransactionsApi()
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val transactionCategoryUpdateDto : TransactionCategoryUpdateDto =  // TransactionCategoryUpdateDto | 
try {
    val result : TransactionCategoryDtoEnvelope = apiInstance.updateTransactionCategory(categoryId, tenantId, apiVersion, xApiVersion, transactionCategoryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TransactionsApi#updateTransactionCategory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TransactionsApi#updateTransactionCategory")
    e.printStackTrace()
}
```

### Parameters
| **categoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionCategoryUpdateDto** | [**TransactionCategoryUpdateDto**](TransactionCategoryUpdateDto.md)|  | [optional] |

### Return type

[**TransactionCategoryDtoEnvelope**](TransactionCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

