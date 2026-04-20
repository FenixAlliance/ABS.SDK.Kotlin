# AccountsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**balanceAccountAsync**](AccountsApi.md#balanceAccountAsync) | **POST** /api/v2/AccountingService/Accounts/{accountId}/Balance | Balance account |
| [**balanceRootAccountAsync**](AccountsApi.md#balanceRootAccountAsync) | **POST** /api/v2/AccountingService/Accounts/Root/Balance | Balance root account |
| [**createAccountAsync**](AccountsApi.md#createAccountAsync) | **POST** /api/v2/AccountingService/Accounts | Get root accounts |
| [**createAccountCreditAsync**](AccountsApi.md#createAccountCreditAsync) | **POST** /api/v2/AccountingService/Accounts/{accountId}/Credits | Create account credit |
| [**createAccountDebitAsync**](AccountsApi.md#createAccountDebitAsync) | **POST** /api/v2/AccountingService/Accounts/{accountId}/Debits | Create account debit |
| [**createAccountEntryAsync**](AccountsApi.md#createAccountEntryAsync) | **POST** /api/v2/AccountingService/Accounts/{accountId}/Entries | Create account entry |
| [**createAccountRelationAsync**](AccountsApi.md#createAccountRelationAsync) | **POST** /api/v2/AccountingService/Accounts/Relations | Create account relation |
| [**createAccountTypeAsync**](AccountsApi.md#createAccountTypeAsync) | **POST** /api/v2/AccountingService/Accounts/Types | Create account type |
| [**deleteAccountAsync**](AccountsApi.md#deleteAccountAsync) | **DELETE** /api/v2/AccountingService/Accounts/{accountId} | Delete an account |
| [**deleteAccountEntryAsync**](AccountsApi.md#deleteAccountEntryAsync) | **DELETE** /api/v2/AccountingService/Accounts/{accountId}/Entries/{entryId} | Delete account entry |
| [**deleteAccountRelationAsync**](AccountsApi.md#deleteAccountRelationAsync) | **DELETE** /api/v2/AccountingService/Accounts/Relations/{accountRelationId} | Delete account relation |
| [**deleteAccountTypeAsync**](AccountsApi.md#deleteAccountTypeAsync) | **DELETE** /api/v2/AccountingService/Accounts/Types/{accountTypeId} | Delete account type |
| [**getAccountAggregateAsync**](AccountsApi.md#getAccountAggregateAsync) | **POST** /api/v2/AccountingService/Accounts/Aggregate | Get account aggregate |
| [**getAccountCreditsAsync**](AccountsApi.md#getAccountCreditsAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Credits | Get account credits |
| [**getAccountCreditsCountAsync**](AccountsApi.md#getAccountCreditsCountAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Credits/Count | Get account credits count |
| [**getAccountDebitsAsync**](AccountsApi.md#getAccountDebitsAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Debits | Get account debits |
| [**getAccountDebitsCountAsync**](AccountsApi.md#getAccountDebitsCountAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Debits/Count | Get account debits count |
| [**getAccountDetailsAsync**](AccountsApi.md#getAccountDetailsAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId} | Get account details |
| [**getAccountEntriesAsync**](AccountsApi.md#getAccountEntriesAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Entries | Get account entries |
| [**getAccountEntryAsync**](AccountsApi.md#getAccountEntryAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Entries/{entryId} | Get account entry |
| [**getAccountRelationsAsync**](AccountsApi.md#getAccountRelationsAsync) | **GET** /api/v2/AccountingService/Accounts/Relations | Get account relations |
| [**getAccountRelationsCountAsync**](AccountsApi.md#getAccountRelationsCountAsync) | **GET** /api/v2/AccountingService/Accounts/Relations/Count | Get account relations count |
| [**getAccountTypesAsync**](AccountsApi.md#getAccountTypesAsync) | **GET** /api/v2/AccountingService/Accounts/Types | Get account types |
| [**getAccountTypesCountAsync**](AccountsApi.md#getAccountTypesCountAsync) | **GET** /api/v2/AccountingService/Accounts/Types/Count | Get account types count |
| [**getAccountsAsync**](AccountsApi.md#getAccountsAsync) | **GET** /api/v2/AccountingService/Accounts | Creates a new account |
| [**getAccountsCountAsync**](AccountsApi.md#getAccountsCountAsync) | **GET** /api/v2/AccountingService/Accounts/Count | Get the number of accounts |
| [**getChildAccountsAsync**](AccountsApi.md#getChildAccountsAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Children | Get child accounts |
| [**getCreditAccountEntriesAsync**](AccountsApi.md#getCreditAccountEntriesAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Entries/Credit | Get credit account entries |
| [**getDebitAccountEntriesAsync**](AccountsApi.md#getDebitAccountEntriesAsync) | **GET** /api/v2/AccountingService/Accounts/{accountId}/Entries/Debit | Get debit account entries |
| [**getRootAccountsAsync**](AccountsApi.md#getRootAccountsAsync) | **GET** /api/v2/AccountingService/Accounts/Root | Get root accounts |
| [**patchAccountAsync**](AccountsApi.md#patchAccountAsync) | **PATCH** /api/v2/AccountingService/Accounts/{accountId} | Patch an account |
| [**updateAccountAsync**](AccountsApi.md#updateAccountAsync) | **PUT** /api/v2/AccountingService/Accounts/{accountId} | Update an account |
| [**updateAccountEntryAsync**](AccountsApi.md#updateAccountEntryAsync) | **PUT** /api/v2/AccountingService/Accounts/{accountId}/Entries/{entryId} | Update account entry |
| [**updateAccountRelationAsync**](AccountsApi.md#updateAccountRelationAsync) | **PUT** /api/v2/AccountingService/Accounts/Relations/{accountRelationId} | Update account relation |
| [**updateAccountTypeAsync**](AccountsApi.md#updateAccountTypeAsync) | **PUT** /api/v2/AccountingService/Accounts/Types/{accountTypeId} | Update account type |


<a id="balanceAccountAsync"></a>
# **balanceAccountAsync**
> AccountDtoEnvelope balanceAccountAsync(accountId, tenantId, apiVersion, xApiVersion)

Balance account

Balance account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountDtoEnvelope = apiInstance.balanceAccountAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#balanceAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#balanceAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountDtoEnvelope**](AccountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="balanceRootAccountAsync"></a>
# **balanceRootAccountAsync**
> AccountDtoListEnvelope balanceRootAccountAsync(tenantId, apiVersion, xApiVersion)

Balance root account

Balance root account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountDtoListEnvelope = apiInstance.balanceRootAccountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#balanceRootAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#balanceRootAccountAsync")
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

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createAccountAsync"></a>
# **createAccountAsync**
> AccountDtoListEnvelope createAccountAsync(tenantId, apiVersion, xApiVersion, accountCreateDto)

Get root accounts

Get root accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountCreateDto : AccountCreateDto =  // AccountCreateDto | 
try {
    val result : AccountDtoListEnvelope = apiInstance.createAccountAsync(tenantId, apiVersion, xApiVersion, accountCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountCreateDto** | [**AccountCreateDto**](AccountCreateDto.md)|  | [optional] |

### Return type

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAccountCreditAsync"></a>
# **createAccountCreditAsync**
> AccountingEntryDtoListEnvelope createAccountCreditAsync(accountId, tenantId, apiVersion, xApiVersion, accountingEntryCreateDto)

Create account credit

Create account credit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountingEntryCreateDto : AccountingEntryCreateDto =  // AccountingEntryCreateDto | 
try {
    val result : AccountingEntryDtoListEnvelope = apiInstance.createAccountCreditAsync(accountId, tenantId, apiVersion, xApiVersion, accountingEntryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createAccountCreditAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createAccountCreditAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountingEntryCreateDto** | [**AccountingEntryCreateDto**](AccountingEntryCreateDto.md)|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAccountDebitAsync"></a>
# **createAccountDebitAsync**
> AccountingEntryDtoListEnvelope createAccountDebitAsync(accountId, tenantId, apiVersion, xApiVersion, accountingEntryCreateDto)

Create account debit

Create account debit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountingEntryCreateDto : AccountingEntryCreateDto =  // AccountingEntryCreateDto | 
try {
    val result : AccountingEntryDtoListEnvelope = apiInstance.createAccountDebitAsync(accountId, tenantId, apiVersion, xApiVersion, accountingEntryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createAccountDebitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createAccountDebitAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountingEntryCreateDto** | [**AccountingEntryCreateDto**](AccountingEntryCreateDto.md)|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAccountEntryAsync"></a>
# **createAccountEntryAsync**
> AccountingEntryDtoEnvelope createAccountEntryAsync(accountId, tenantId, apiVersion, xApiVersion, accountingEntryCreateDto)

Create account entry

Create account entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountingEntryCreateDto : AccountingEntryCreateDto =  // AccountingEntryCreateDto | 
try {
    val result : AccountingEntryDtoEnvelope = apiInstance.createAccountEntryAsync(accountId, tenantId, apiVersion, xApiVersion, accountingEntryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createAccountEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createAccountEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountingEntryCreateDto** | [**AccountingEntryCreateDto**](AccountingEntryCreateDto.md)|  | [optional] |

### Return type

[**AccountingEntryDtoEnvelope**](AccountingEntryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAccountRelationAsync"></a>
# **createAccountRelationAsync**
> EmptyEnvelope createAccountRelationAsync(tenantId, accountId, apiVersion, xApiVersion, accountRelationCreateDto)

Create account relation

Create account relation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountRelationCreateDto : AccountRelationCreateDto =  // AccountRelationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAccountRelationAsync(tenantId, accountId, apiVersion, xApiVersion, accountRelationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createAccountRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createAccountRelationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountRelationCreateDto** | [**AccountRelationCreateDto**](AccountRelationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAccountTypeAsync"></a>
# **createAccountTypeAsync**
> EmptyEnvelope createAccountTypeAsync(tenantId, accountId, apiVersion, xApiVersion, accountTypeCreateDto)

Create account type

Create account type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountTypeCreateDto : AccountTypeCreateDto =  // AccountTypeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAccountTypeAsync(tenantId, accountId, apiVersion, xApiVersion, accountTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#createAccountTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#createAccountTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountTypeCreateDto** | [**AccountTypeCreateDto**](AccountTypeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAccountAsync"></a>
# **deleteAccountAsync**
> EmptyEnvelope deleteAccountAsync(accountId, tenantId, apiVersion, xApiVersion)

Delete an account

Delete an account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAccountAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deleteAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deleteAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
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

<a id="deleteAccountEntryAsync"></a>
# **deleteAccountEntryAsync**
> EmptyEnvelope deleteAccountEntryAsync(accountId, entryId, tenantId, apiVersion, xApiVersion)

Delete account entry

Delete account entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAccountEntryAsync(accountId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deleteAccountEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deleteAccountEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
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

<a id="deleteAccountRelationAsync"></a>
# **deleteAccountRelationAsync**
> EmptyEnvelope deleteAccountRelationAsync(accountRelationId, tenantId, accountId, apiVersion, xApiVersion)

Delete account relation

Delete account relation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountRelationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAccountRelationAsync(accountRelationId, tenantId, accountId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deleteAccountRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deleteAccountRelationAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountRelationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
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

<a id="deleteAccountTypeAsync"></a>
# **deleteAccountTypeAsync**
> EmptyEnvelope deleteAccountTypeAsync(accountTypeId, tenantId, accountId, apiVersion, xApiVersion)

Delete account type

Delete account type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAccountTypeAsync(accountTypeId, tenantId, accountId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#deleteAccountTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#deleteAccountTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
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

<a id="getAccountAggregateAsync"></a>
# **getAccountAggregateAsync**
> AccountingEntryDtoListEnvelope getAccountAggregateAsync(tenantId, currencyId, apiVersion, xApiVersion, accountDto)

Get account aggregate

Get account aggregate.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val currencyId : kotlin.String = currencyId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountDto : kotlin.collections.List<AccountDto> =  // kotlin.collections.List<AccountDto> | 
try {
    val result : AccountingEntryDtoListEnvelope = apiInstance.getAccountAggregateAsync(tenantId, currencyId, apiVersion, xApiVersion, accountDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountAggregateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountAggregateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **currencyId** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountDto** | [**kotlin.collections.List&lt;AccountDto&gt;**](AccountDto.md)|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getAccountCreditsAsync"></a>
# **getAccountCreditsAsync**
> AccountingEntryDtoListEnvelope getAccountCreditsAsync(accountId, tenantId, apiVersion, xApiVersion)

Get account credits

Get account credits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountingEntryDtoListEnvelope = apiInstance.getAccountCreditsAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountCreditsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountCreditsAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountCreditsCountAsync"></a>
# **getAccountCreditsCountAsync**
> Int32Envelope getAccountCreditsCountAsync(accountId, tenantId, apiVersion, xApiVersion)

Get account credits count

Get account credits count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAccountCreditsCountAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountCreditsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountCreditsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
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

<a id="getAccountDebitsAsync"></a>
# **getAccountDebitsAsync**
> AccountingEntryDtoListEnvelope getAccountDebitsAsync(accountId, tenantId, apiVersion, xApiVersion)

Get account debits

Get account debits.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountingEntryDtoListEnvelope = apiInstance.getAccountDebitsAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountDebitsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountDebitsAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountDebitsCountAsync"></a>
# **getAccountDebitsCountAsync**
> Int32Envelope getAccountDebitsCountAsync(accountId, tenantId, apiVersion, xApiVersion)

Get account debits count

Get account debits count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAccountDebitsCountAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountDebitsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountDebitsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
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

<a id="getAccountDetailsAsync"></a>
# **getAccountDetailsAsync**
> AccountDtoEnvelope getAccountDetailsAsync(accountId, tenantId, apiVersion, xApiVersion)

Get account details

Get account details.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountDtoEnvelope = apiInstance.getAccountDetailsAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountDtoEnvelope**](AccountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountEntriesAsync"></a>
# **getAccountEntriesAsync**
> AccountingEntryDtoListEnvelope getAccountEntriesAsync(accountId, tenantId, apiVersion, xApiVersion)

Get account entries

Get account entries.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountingEntryDtoListEnvelope = apiInstance.getAccountEntriesAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountEntriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountEntriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountEntryAsync"></a>
# **getAccountEntryAsync**
> AccountingEntryDtoEnvelope getAccountEntryAsync(accountId, entryId, tenantId, apiVersion, xApiVersion)

Get account entry

Get account entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountingEntryDtoEnvelope = apiInstance.getAccountEntryAsync(accountId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountingEntryDtoEnvelope**](AccountingEntryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountRelationsAsync"></a>
# **getAccountRelationsAsync**
> AccountRelationDtoListEnvelope getAccountRelationsAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account relations

Get account relations.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountRelationDtoListEnvelope = apiInstance.getAccountRelationsAsync(tenantId, accountId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountRelationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountRelationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountRelationDtoListEnvelope**](AccountRelationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountRelationsCountAsync"></a>
# **getAccountRelationsCountAsync**
> Int32Envelope getAccountRelationsCountAsync(tenantId, accountId, apiVersion, xApiVersion)

Get account relations count

Get account relations count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAccountRelationsCountAsync(tenantId, accountId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountRelationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountRelationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
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

<a id="getAccountTypesAsync"></a>
# **getAccountTypesAsync**
> AccountTypeDtoListEnvelope getAccountTypesAsync(tenantId, accountTypeId, apiVersion, xApiVersion)

Get account types

Get account types.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountTypeDtoListEnvelope = apiInstance.getAccountTypesAsync(tenantId, accountTypeId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountTypesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **accountTypeId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountTypeDtoListEnvelope**](AccountTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountTypesCountAsync"></a>
# **getAccountTypesCountAsync**
> Int32Envelope getAccountTypesCountAsync(tenantId, accountTypeId, apiVersion, xApiVersion)

Get account types count

Get account types count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAccountTypesCountAsync(tenantId, accountTypeId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountTypesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **accountTypeId** | **java.util.UUID**|  | |
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

<a id="getAccountsAsync"></a>
# **getAccountsAsync**
> AccountDtoListEnvelope getAccountsAsync(tenantId, apiVersion, xApiVersion)

Creates a new account

Creates a new account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountDtoListEnvelope = apiInstance.getAccountsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountsAsync")
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

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountsCountAsync"></a>
# **getAccountsCountAsync**
> Int32Envelope getAccountsCountAsync(tenantId, apiVersion, xApiVersion)

Get the number of accounts

Get the number of accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAccountsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getAccountsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getAccountsCountAsync")
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

<a id="getChildAccountsAsync"></a>
# **getChildAccountsAsync**
> AccountDtoListEnvelope getChildAccountsAsync(accountId, tenantId, apiVersion, xApiVersion)

Get child accounts

Get child accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountDtoListEnvelope = apiInstance.getChildAccountsAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getChildAccountsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getChildAccountsAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCreditAccountEntriesAsync"></a>
# **getCreditAccountEntriesAsync**
> AccountingEntryDtoListEnvelope getCreditAccountEntriesAsync(accountId, tenantId, apiVersion, xApiVersion)

Get credit account entries

Get credit account entries.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountingEntryDtoListEnvelope = apiInstance.getCreditAccountEntriesAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getCreditAccountEntriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getCreditAccountEntriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDebitAccountEntriesAsync"></a>
# **getDebitAccountEntriesAsync**
> AccountingEntryDtoListEnvelope getDebitAccountEntriesAsync(accountId, tenantId, apiVersion, xApiVersion)

Get debit account entries

Get debit account entries.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountingEntryDtoListEnvelope = apiInstance.getDebitAccountEntriesAsync(accountId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getDebitAccountEntriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getDebitAccountEntriesAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountingEntryDtoListEnvelope**](AccountingEntryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRootAccountsAsync"></a>
# **getRootAccountsAsync**
> AccountDtoListEnvelope getRootAccountsAsync(tenantId, apiVersion, xApiVersion)

Get root accounts

Get root accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountDtoListEnvelope = apiInstance.getRootAccountsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#getRootAccountsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#getRootAccountsAsync")
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

[**AccountDtoListEnvelope**](AccountDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchAccountAsync"></a>
# **patchAccountAsync**
> EmptyEnvelope patchAccountAsync(accountId, tenantId, apiVersion, xApiVersion, operation)

Patch an account

Patch an account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchAccountAsync(accountId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#patchAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#patchAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
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

<a id="updateAccountAsync"></a>
# **updateAccountAsync**
> AccountDtoEnvelope updateAccountAsync(accountId, tenantId, apiVersion, xApiVersion, accountUpdateDto)

Update an account

Update an account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountUpdateDto : AccountUpdateDto =  // AccountUpdateDto | 
try {
    val result : AccountDtoEnvelope = apiInstance.updateAccountAsync(accountId, tenantId, apiVersion, xApiVersion, accountUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updateAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updateAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountUpdateDto** | [**AccountUpdateDto**](AccountUpdateDto.md)|  | [optional] |

### Return type

[**AccountDtoEnvelope**](AccountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAccountEntryAsync"></a>
# **updateAccountEntryAsync**
> EmptyEnvelope updateAccountEntryAsync(accountId, entryId, tenantId, apiVersion, xApiVersion, accountingEntryUpdateDto)

Update account entry

Update account entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountingEntryUpdateDto : AccountingEntryUpdateDto =  // AccountingEntryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAccountEntryAsync(accountId, entryId, tenantId, apiVersion, xApiVersion, accountingEntryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updateAccountEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updateAccountEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountingEntryUpdateDto** | [**AccountingEntryUpdateDto**](AccountingEntryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAccountRelationAsync"></a>
# **updateAccountRelationAsync**
> EmptyEnvelope updateAccountRelationAsync(accountRelationId, tenantId, accountId, apiVersion, xApiVersion, accountRelationUpdateDto)

Update account relation

Update account relation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountRelationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountRelationUpdateDto : AccountRelationUpdateDto =  // AccountRelationUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAccountRelationAsync(accountRelationId, tenantId, accountId, apiVersion, xApiVersion, accountRelationUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updateAccountRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updateAccountRelationAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountRelationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountRelationUpdateDto** | [**AccountRelationUpdateDto**](AccountRelationUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAccountTypeAsync"></a>
# **updateAccountTypeAsync**
> EmptyEnvelope updateAccountTypeAsync(accountTypeId, tenantId, accountId, apiVersion, xApiVersion, accountTypeUpdateDto)

Update account type

Update account type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountsApi()
val accountTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val accountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountTypeUpdateDto : AccountTypeUpdateDto =  // AccountTypeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAccountTypeAsync(accountTypeId, tenantId, accountId, apiVersion, xApiVersion, accountTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountsApi#updateAccountTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountsApi#updateAccountTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **accountTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **accountId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountTypeUpdateDto** | [**AccountTypeUpdateDto**](AccountTypeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

