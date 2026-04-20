# BankingApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBank**](BankingApi.md#createBank) | **POST** /api/v2/AccountingService/Banking | Creates a new bank |
| [**createBankAccount**](BankingApi.md#createBankAccount) | **POST** /api/v2/AccountingService/Banking/{bankId}/Accounts | Creates a new bank account |
| [**createBankGuarantee**](BankingApi.md#createBankGuarantee) | **POST** /api/v2/AccountingService/Banking/{bankId}/Guarantees | Creates a new bank guarantee |
| [**createBankTransaction**](BankingApi.md#createBankTransaction) | **POST** /api/v2/AccountingService/Banking/{bankId}/Transactions | Creates a new bank transaction |
| [**deleteBank**](BankingApi.md#deleteBank) | **DELETE** /api/v2/AccountingService/Banking/{bankId} | Deletes a bank |
| [**deleteBankAccount**](BankingApi.md#deleteBankAccount) | **DELETE** /api/v2/AccountingService/Banking/{bankId}/Accounts/{accountId} | Deletes a bank account |
| [**deleteBankGuarantee**](BankingApi.md#deleteBankGuarantee) | **DELETE** /api/v2/AccountingService/Banking/{bankId}/Guarantees/{guaranteeId} | Deletes a bank guarantee |
| [**deleteBankTransaction**](BankingApi.md#deleteBankTransaction) | **DELETE** /api/v2/AccountingService/Banking/{bankId}/Transactions/{transactionId} | Deletes a bank transaction |
| [**getBank**](BankingApi.md#getBank) | **GET** /api/v2/AccountingService/Banking/{bankId} | Gets the current tenant bank |
| [**getBankAccount**](BankingApi.md#getBankAccount) | **GET** /api/v2/AccountingService/Banking/{bankId}/Accounts/{accountId} | Gets the current tenant bank account |
| [**getBankAccounts**](BankingApi.md#getBankAccounts) | **GET** /api/v2/AccountingService/Banking/{bankId}/Accounts | Gets the current tenant bank accounts |
| [**getBankAccountsCount**](BankingApi.md#getBankAccountsCount) | **GET** /api/v2/AccountingService/Banking/{bankId}/Accounts/Count | Gets the current tenant bank accounts count |
| [**getBankGuarantee**](BankingApi.md#getBankGuarantee) | **GET** /api/v2/AccountingService/Banking/{bankId}/Guarantees/{guaranteeId} | Gets the current tenant bank guarantee |
| [**getBankGuarantees**](BankingApi.md#getBankGuarantees) | **GET** /api/v2/AccountingService/Banking/{bankId}/Guarantees | Gets the current tenant bank guarantees |
| [**getBankGuaranteesCount**](BankingApi.md#getBankGuaranteesCount) | **GET** /api/v2/AccountingService/Banking/{bankId}/Guarantees/Count | Gets the current tenant bank guarantees count |
| [**getBankTransaction**](BankingApi.md#getBankTransaction) | **GET** /api/v2/AccountingService/Banking/{bankId}/Transactions/{transactionId} | Gets the current tenant bank transaction |
| [**getBankTransactions**](BankingApi.md#getBankTransactions) | **GET** /api/v2/AccountingService/Banking/{bankId}/Transactions | Gets the current tenant bank transactions |
| [**getBankTransactionsCount**](BankingApi.md#getBankTransactionsCount) | **GET** /api/v2/AccountingService/Banking/{bankId}/Transactions/Count | Gets the current tenant bank transactions count |
| [**getBanks**](BankingApi.md#getBanks) | **GET** /api/v2/AccountingService/Banking | Gets the current tenant banks |
| [**getBanksCount**](BankingApi.md#getBanksCount) | **GET** /api/v2/AccountingService/Banking/Count | Gets the current tenant banks count |
| [**updateBank**](BankingApi.md#updateBank) | **PUT** /api/v2/AccountingService/Banking/{bankId} | Updates a bank |
| [**updateBankAccount**](BankingApi.md#updateBankAccount) | **PUT** /api/v2/AccountingService/Banking/{bankId}/Accounts/{accountId} | Updates a bank account |
| [**updateBankGuarantee**](BankingApi.md#updateBankGuarantee) | **PUT** /api/v2/AccountingService/Banking/{bankId}/Guarantees/{guaranteeId} | Updates a bank guarantee |
| [**updateBankTransaction**](BankingApi.md#updateBankTransaction) | **PUT** /api/v2/AccountingService/Banking/{bankId}/Transactions/{transactionId} | Updates a bank transaction |


<a id="createBank"></a>
# **createBank**
> BankDtoEnvelope createBank(tenantId, apiVersion, xApiVersion, bankCreateDto)

Creates a new bank

Create a new bank.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankCreateDto : BankCreateDto =  // BankCreateDto | 
try {
    val result : BankDtoEnvelope = apiInstance.createBank(tenantId, apiVersion, xApiVersion, bankCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#createBank")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#createBank")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankCreateDto** | [**BankCreateDto**](BankCreateDto.md)|  | [optional] |

### Return type

[**BankDtoEnvelope**](BankDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createBankAccount"></a>
# **createBankAccount**
> BankAccountDtoEnvelope createBankAccount(bankId, tenantId, apiVersion, xApiVersion, bankAccountCreateDto)

Creates a new bank account

Create a new bank account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankAccountCreateDto : BankAccountCreateDto =  // BankAccountCreateDto | 
try {
    val result : BankAccountDtoEnvelope = apiInstance.createBankAccount(bankId, tenantId, apiVersion, xApiVersion, bankAccountCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#createBankAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#createBankAccount")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankAccountCreateDto** | [**BankAccountCreateDto**](BankAccountCreateDto.md)|  | [optional] |

### Return type

[**BankAccountDtoEnvelope**](BankAccountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createBankGuarantee"></a>
# **createBankGuarantee**
> BankGuaranteeDtoEnvelope createBankGuarantee(bankId, tenantId, apiVersion, xApiVersion, bankGuaranteeCreateDto)

Creates a new bank guarantee

Create a new bank guarantee.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankGuaranteeCreateDto : BankGuaranteeCreateDto =  // BankGuaranteeCreateDto | 
try {
    val result : BankGuaranteeDtoEnvelope = apiInstance.createBankGuarantee(bankId, tenantId, apiVersion, xApiVersion, bankGuaranteeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#createBankGuarantee")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#createBankGuarantee")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankGuaranteeCreateDto** | [**BankGuaranteeCreateDto**](BankGuaranteeCreateDto.md)|  | [optional] |

### Return type

[**BankGuaranteeDtoEnvelope**](BankGuaranteeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createBankTransaction"></a>
# **createBankTransaction**
> BankTransactionDtoEnvelope createBankTransaction(bankId, tenantId, apiVersion, xApiVersion, bankTransactionCreateDto)

Creates a new bank transaction

Create a new bank transaction.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankTransactionCreateDto : BankTransactionCreateDto =  // BankTransactionCreateDto | 
try {
    val result : BankTransactionDtoEnvelope = apiInstance.createBankTransaction(bankId, tenantId, apiVersion, xApiVersion, bankTransactionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#createBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#createBankTransaction")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankTransactionCreateDto** | [**BankTransactionCreateDto**](BankTransactionCreateDto.md)|  | [optional] |

### Return type

[**BankTransactionDtoEnvelope**](BankTransactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteBank"></a>
# **deleteBank**
> deleteBank(bankId, tenantId, apiVersion, xApiVersion)

Deletes a bank

Delete a bank.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteBank(bankId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#deleteBank")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#deleteBank")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteBankAccount"></a>
# **deleteBankAccount**
> deleteBankAccount(bankId, accountId, tenantId, apiVersion, xApiVersion)

Deletes a bank account

Delete a bank account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteBankAccount(bankId, accountId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#deleteBankAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#deleteBankAccount")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteBankGuarantee"></a>
# **deleteBankGuarantee**
> deleteBankGuarantee(bankId, guaranteeId, tenantId, apiVersion, xApiVersion)

Deletes a bank guarantee

Delete a bank guarantee.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val guaranteeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteBankGuarantee(bankId, guaranteeId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#deleteBankGuarantee")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#deleteBankGuarantee")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **guaranteeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteBankTransaction"></a>
# **deleteBankTransaction**
> deleteBankTransaction(bankId, transactionId, tenantId, apiVersion, xApiVersion)

Deletes a bank transaction

Delete a bank transaction.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val transactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteBankTransaction(bankId, transactionId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#deleteBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#deleteBankTransaction")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **transactionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBank"></a>
# **getBank**
> BankDtoEnvelope getBank(bankId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank

Get the currently acting tenant bank.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankDtoEnvelope = apiInstance.getBank(bankId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBank")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBank")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BankDtoEnvelope**](BankDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBankAccount"></a>
# **getBankAccount**
> BankAccountDtoEnvelope getBankAccount(bankId, accountId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank account

Get the currently acting tenant bank account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankAccountDtoEnvelope = apiInstance.getBankAccount(bankId, accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankAccount")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BankAccountDtoEnvelope**](BankAccountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBankAccounts"></a>
# **getBankAccounts**
> BankAccountDtoListEnvelope getBankAccounts(bankId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank accounts

Get the currently acting tenant bank accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankAccountDtoListEnvelope = apiInstance.getBankAccounts(bankId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankAccounts")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankAccounts")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BankAccountDtoListEnvelope**](BankAccountDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBankAccountsCount"></a>
# **getBankAccountsCount**
> Int32Envelope getBankAccountsCount(bankId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank accounts count

Get the currently acting tenant bank accounts count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBankAccountsCount(bankId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankAccountsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankAccountsCount")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
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

<a id="getBankGuarantee"></a>
# **getBankGuarantee**
> BankGuaranteeDtoEnvelope getBankGuarantee(bankId, guaranteeId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank guarantee

Get the currently acting tenant bank guarantee.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val guaranteeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankGuaranteeDtoEnvelope = apiInstance.getBankGuarantee(bankId, guaranteeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankGuarantee")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankGuarantee")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **guaranteeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BankGuaranteeDtoEnvelope**](BankGuaranteeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBankGuarantees"></a>
# **getBankGuarantees**
> BankGuaranteeDtoListEnvelope getBankGuarantees(bankId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank guarantees

Get the currently acting tenant bank guarantees.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankGuaranteeDtoListEnvelope = apiInstance.getBankGuarantees(bankId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankGuarantees")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankGuarantees")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BankGuaranteeDtoListEnvelope**](BankGuaranteeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBankGuaranteesCount"></a>
# **getBankGuaranteesCount**
> Int32Envelope getBankGuaranteesCount(bankId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank guarantees count

Get the currently acting tenant bank guarantees count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBankGuaranteesCount(bankId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankGuaranteesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankGuaranteesCount")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
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

<a id="getBankTransaction"></a>
# **getBankTransaction**
> BankTransactionDtoEnvelope getBankTransaction(bankId, transactionId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank transaction

Get the currently acting tenant bank transaction.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val transactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankTransactionDtoEnvelope = apiInstance.getBankTransaction(bankId, transactionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankTransaction")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **transactionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BankTransactionDtoEnvelope**](BankTransactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBankTransactions"></a>
# **getBankTransactions**
> BankTransactionDtoListEnvelope getBankTransactions(bankId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank transactions

Get the currently acting tenant bank transactions.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankTransactionDtoListEnvelope = apiInstance.getBankTransactions(bankId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankTransactions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankTransactions")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BankTransactionDtoListEnvelope**](BankTransactionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBankTransactionsCount"></a>
# **getBankTransactionsCount**
> Int32Envelope getBankTransactionsCount(bankId, tenantId, apiVersion, xApiVersion)

Gets the current tenant bank transactions count

Get the currently acting tenant bank transactions count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBankTransactionsCount(bankId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBankTransactionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBankTransactionsCount")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
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

<a id="getBanks"></a>
# **getBanks**
> BankDtoListEnvelope getBanks(tenantId, apiVersion, xApiVersion)

Gets the current tenant banks

Get the currently acting tenant banks.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankDtoListEnvelope = apiInstance.getBanks(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBanks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBanks")
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

[**BankDtoListEnvelope**](BankDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBanksCount"></a>
# **getBanksCount**
> Int32Envelope getBanksCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant banks count

Get the currently acting tenant banks count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBanksCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#getBanksCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#getBanksCount")
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

<a id="updateBank"></a>
# **updateBank**
> BankDtoEnvelope updateBank(bankId, tenantId, apiVersion, xApiVersion, bankUpdateDto)

Updates a bank

Update a bank.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankUpdateDto : BankUpdateDto =  // BankUpdateDto | 
try {
    val result : BankDtoEnvelope = apiInstance.updateBank(bankId, tenantId, apiVersion, xApiVersion, bankUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#updateBank")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#updateBank")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankUpdateDto** | [**BankUpdateDto**](BankUpdateDto.md)|  | [optional] |

### Return type

[**BankDtoEnvelope**](BankDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBankAccount"></a>
# **updateBankAccount**
> BankAccountDtoEnvelope updateBankAccount(bankId, accountId, tenantId, apiVersion, xApiVersion, bankAccountUpdateDto)

Updates a bank account

Update a bank account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankAccountUpdateDto : BankAccountUpdateDto =  // BankAccountUpdateDto | 
try {
    val result : BankAccountDtoEnvelope = apiInstance.updateBankAccount(bankId, accountId, tenantId, apiVersion, xApiVersion, bankAccountUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#updateBankAccount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#updateBankAccount")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankAccountUpdateDto** | [**BankAccountUpdateDto**](BankAccountUpdateDto.md)|  | [optional] |

### Return type

[**BankAccountDtoEnvelope**](BankAccountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBankGuarantee"></a>
# **updateBankGuarantee**
> BankGuaranteeDtoEnvelope updateBankGuarantee(bankId, guaranteeId, tenantId, apiVersion, xApiVersion, bankGuaranteeUpdateDto)

Updates a bank guarantee

Update a bank guarantee.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val guaranteeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankGuaranteeUpdateDto : BankGuaranteeUpdateDto =  // BankGuaranteeUpdateDto | 
try {
    val result : BankGuaranteeDtoEnvelope = apiInstance.updateBankGuarantee(bankId, guaranteeId, tenantId, apiVersion, xApiVersion, bankGuaranteeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#updateBankGuarantee")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#updateBankGuarantee")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **guaranteeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankGuaranteeUpdateDto** | [**BankGuaranteeUpdateDto**](BankGuaranteeUpdateDto.md)|  | [optional] |

### Return type

[**BankGuaranteeDtoEnvelope**](BankGuaranteeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBankTransaction"></a>
# **updateBankTransaction**
> BankTransactionDtoEnvelope updateBankTransaction(bankId, transactionId, tenantId, apiVersion, xApiVersion, bankTransactionUpdateDto)

Updates a bank transaction

Update a bank transaction.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BankingApi()
val bankId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val transactionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankTransactionUpdateDto : BankTransactionUpdateDto =  // BankTransactionUpdateDto | 
try {
    val result : BankTransactionDtoEnvelope = apiInstance.updateBankTransaction(bankId, transactionId, tenantId, apiVersion, xApiVersion, bankTransactionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BankingApi#updateBankTransaction")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BankingApi#updateBankTransaction")
    e.printStackTrace()
}
```

### Parameters
| **bankId** | **java.util.UUID**|  | |
| **transactionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankTransactionUpdateDto** | [**BankTransactionUpdateDto**](BankTransactionUpdateDto.md)|  | [optional] |

### Return type

[**BankTransactionDtoEnvelope**](BankTransactionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

