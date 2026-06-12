# WalletsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWalletBankAccountAsync**](WalletsApi.md#createWalletBankAccountAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts | Create Wallet Bank Account |
| [**createWalletLocationAsync**](WalletsApi.md#createWalletLocationAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Locations | Create Wallet Location |
| [**createWalletPaymentAsync**](WalletsApi.md#createWalletPaymentAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Payments | Create Wallet Payment |
| [**createWalletTokenAsync**](WalletsApi.md#createWalletTokenAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Tokens | Create Wallet Token |
| [**createWalletWithdrawRequestAsync**](WalletsApi.md#createWalletWithdrawRequestAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Withdraws | Create Wallet Withdraw Request |
| [**deleteWalletBankAccountAsync**](WalletsApi.md#deleteWalletBankAccountAsync) | **DELETE** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/{bankAccountId} | Delete Wallet Bank Account |
| [**deleteWalletLocationAsync**](WalletsApi.md#deleteWalletLocationAsync) | **DELETE** /api/v2/WalletsService/Wallets/{walletId}/Locations/{locationId} | Delete Wallet Location |
| [**deleteWalletTokenAsync**](WalletsApi.md#deleteWalletTokenAsync) | **DELETE** /api/v2/WalletsService/Wallets/{walletId}/Tokens/{tokenId} | Delete Wallet Token |
| [**getIncomingPaymentsAsync**](WalletsApi.md#getIncomingPaymentsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Incoming | Get Incoming Payments |
| [**getIncomingPaymentsCountAsync**](WalletsApi.md#getIncomingPaymentsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Incoming/Count | Get Incoming Payments Count |
| [**getIncomingWalletInvoicesAsync**](WalletsApi.md#getIncomingWalletInvoicesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Incoming | Get Incoming Wallet Invoices |
| [**getIncomingWalletInvoicesCountAsync**](WalletsApi.md#getIncomingWalletInvoicesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Incoming/Count | Get Incoming Wallet Invoices Count |
| [**getOutgoingPaymentsAsync**](WalletsApi.md#getOutgoingPaymentsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Outgoing | Get Outgoing Payments |
| [**getOutgoingPaymentsCountAsync**](WalletsApi.md#getOutgoingPaymentsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Outgoing/Count | Get Outgoing Payments Count |
| [**getOutgoingWalletInvoicesAsync**](WalletsApi.md#getOutgoingWalletInvoicesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Outgoing | Get Outgoing Wallet Invoices |
| [**getOutgoingWalletInvoicesCountAsync**](WalletsApi.md#getOutgoingWalletInvoicesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Outgoing/Count | Get Outgoing Wallet Invoices Count |
| [**getWalletBankAccountAsync**](WalletsApi.md#getWalletBankAccountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/{bankAccountId} | Get Wallet Bank Account |
| [**getWalletBankAccountsAsync**](WalletsApi.md#getWalletBankAccountsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts | Get Wallet Bank Accounts |
| [**getWalletBankAccountsCountAsync**](WalletsApi.md#getWalletBankAccountsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/Count | Get Wallet Bank Accounts Count |
| [**getWalletChargebacksAsync**](WalletsApi.md#getWalletChargebacksAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Chargebacks | Get Wallet Chargebacks |
| [**getWalletChargebacksCountAsync**](WalletsApi.md#getWalletChargebacksCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Chargebacks/Count | Get Wallet Chargebacks Count |
| [**getWalletDetailsAsync**](WalletsApi.md#getWalletDetailsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId} | Get Wallet Details |
| [**getWalletExtendedOrdersAsync**](WalletsApi.md#getWalletExtendedOrdersAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Orders/Extended | Get Wallet Extended Orders |
| [**getWalletInvoicesAsync**](WalletsApi.md#getWalletInvoicesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices | Get Wallet Invoices |
| [**getWalletInvoicesCountAsync**](WalletsApi.md#getWalletInvoicesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Count | Get Wallet Invoices Count |
| [**getWalletLocationAsync**](WalletsApi.md#getWalletLocationAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Locations/{locationId} | Get Wallet Location |
| [**getWalletLocationsAsync**](WalletsApi.md#getWalletLocationsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Locations | Get Wallet Locations |
| [**getWalletLocationsCountAsync**](WalletsApi.md#getWalletLocationsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Locations/Count | Get Wallet Locations Count |
| [**getWalletOrdersAsync**](WalletsApi.md#getWalletOrdersAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Orders | Get Wallet Orders |
| [**getWalletOrdersCountAsync**](WalletsApi.md#getWalletOrdersCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Orders/Count | Get Wallet Orders Count |
| [**getWalletPaymentsAsync**](WalletsApi.md#getWalletPaymentsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments | Get Wallet Payments |
| [**getWalletPaymentsCountAsync**](WalletsApi.md#getWalletPaymentsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Count | Get Wallet Payments Count |
| [**getWalletQuotesAsync**](WalletsApi.md#getWalletQuotesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Quotes | Get Wallet Quotes |
| [**getWalletQuotesCountAsync**](WalletsApi.md#getWalletQuotesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Quotes/Count | Get Wallet Quotes Count |
| [**getWalletRefundsAsync**](WalletsApi.md#getWalletRefundsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Refunds | Get Wallet Refunds |
| [**getWalletRefundsCountAsync**](WalletsApi.md#getWalletRefundsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Refunds/Count | Get Wallet Refunds Count |
| [**getWalletTokenAsync**](WalletsApi.md#getWalletTokenAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Tokens/{tokenId} | Get Wallet Token |
| [**getWalletTokensAsync**](WalletsApi.md#getWalletTokensAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Tokens | Get Wallet Tokens |
| [**getWalletTokensCountAsync**](WalletsApi.md#getWalletTokensCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Tokens/Count | Get Wallet Tokens Count |
| [**getWalletWithdrawRequestsAsync**](WalletsApi.md#getWalletWithdrawRequestsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/WithdrawRequests | Get Wallet Withdraw Requests |
| [**getWalletWithdrawRequestsCountAsync**](WalletsApi.md#getWalletWithdrawRequestsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/WithdrawRequests/Count | Get Wallet Withdraw Requests Count |
| [**getWalletWithdrawsAsync**](WalletsApi.md#getWalletWithdrawsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Withdraws | Get Wallet Withdraws |
| [**getWalletWithdrawsCountAsync**](WalletsApi.md#getWalletWithdrawsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Withdraws/Count | Get Wallet Withdraws Count |
| [**patchWalletBankAccountAsync**](WalletsApi.md#patchWalletBankAccountAsync) | **PATCH** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/{bankAccountId} | Patch Wallet Bank Account |
| [**patchWalletTokenAsync**](WalletsApi.md#patchWalletTokenAsync) | **PATCH** /api/v2/WalletsService/Wallets/{walletId}/Tokens/{tokenId} | Patch Wallet Token |
| [**updateWalletBankAccountAsync**](WalletsApi.md#updateWalletBankAccountAsync) | **PUT** /api/v2/WalletsService/Wallets/{walletId}/BankAccounts/{bankAccountId} | Update Wallet Bank Account |
| [**updateWalletLocationAsync**](WalletsApi.md#updateWalletLocationAsync) | **PUT** /api/v2/WalletsService/Wallets/{walletId}/Locations/{locationId} | Update Wallet Location |
| [**updateWalletTokenAsync**](WalletsApi.md#updateWalletTokenAsync) | **PUT** /api/v2/WalletsService/Wallets/{walletId}/Tokens/{tokenId} | Update Wallet Token |


<a id="createWalletBankAccountAsync"></a>
# **createWalletBankAccountAsync**
> EmptyEnvelope createWalletBankAccountAsync(walletId, apiVersion, xApiVersion, bankAccountCreateDto)

Create Wallet Bank Account

Create a new bank account for a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankAccountCreateDto : BankAccountCreateDto =  // BankAccountCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWalletBankAccountAsync(walletId, apiVersion, xApiVersion, bankAccountCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#createWalletBankAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#createWalletBankAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankAccountCreateDto** | [**BankAccountCreateDto**](BankAccountCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWalletLocationAsync"></a>
# **createWalletLocationAsync**
> EmptyEnvelope createWalletLocationAsync(walletId, apiVersion, xApiVersion, locationCreateDto)

Create Wallet Location

Create a new location for a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val locationCreateDto : LocationCreateDto =  // LocationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWalletLocationAsync(walletId, apiVersion, xApiVersion, locationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#createWalletLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#createWalletLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationCreateDto** | [**LocationCreateDto**](LocationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWalletPaymentAsync"></a>
# **createWalletPaymentAsync**
> EmptyEnvelope createWalletPaymentAsync(walletId, apiVersion, xApiVersion, paymentCreateDto)

Create Wallet Payment

Create a new payment for a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentCreateDto : PaymentCreateDto =  // PaymentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWalletPaymentAsync(walletId, apiVersion, xApiVersion, paymentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#createWalletPaymentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#createWalletPaymentAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentCreateDto** | [**PaymentCreateDto**](PaymentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWalletTokenAsync"></a>
# **createWalletTokenAsync**
> EmptyEnvelope createWalletTokenAsync(walletId, apiVersion, xApiVersion, paymentTokenCreateDto)

Create Wallet Token

Create a new payment token for a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentTokenCreateDto : PaymentTokenCreateDto =  // PaymentTokenCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWalletTokenAsync(walletId, apiVersion, xApiVersion, paymentTokenCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#createWalletTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#createWalletTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentTokenCreateDto** | [**PaymentTokenCreateDto**](PaymentTokenCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWalletWithdrawRequestAsync"></a>
# **createWalletWithdrawRequestAsync**
> EmptyEnvelope createWalletWithdrawRequestAsync(walletId, apiVersion, xApiVersion, walletWithdrawRequestCreateDto)

Create Wallet Withdraw Request

Create a new withdraw request for a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val walletWithdrawRequestCreateDto : WalletWithdrawRequestCreateDto =  // WalletWithdrawRequestCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWalletWithdrawRequestAsync(walletId, apiVersion, xApiVersion, walletWithdrawRequestCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#createWalletWithdrawRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#createWalletWithdrawRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **walletWithdrawRequestCreateDto** | [**WalletWithdrawRequestCreateDto**](WalletWithdrawRequestCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWalletBankAccountAsync"></a>
# **deleteWalletBankAccountAsync**
> EmptyEnvelope deleteWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion)

Delete Wallet Bank Account

Delete a specific bank account of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val bankAccountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#deleteWalletBankAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#deleteWalletBankAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **bankAccountId** | **java.util.UUID**|  | |
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

<a id="deleteWalletLocationAsync"></a>
# **deleteWalletLocationAsync**
> EmptyEnvelope deleteWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion)

Delete Wallet Location

Delete a specific location of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#deleteWalletLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#deleteWalletLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **locationId** | **java.util.UUID**|  | |
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

<a id="deleteWalletTokenAsync"></a>
# **deleteWalletTokenAsync**
> EmptyEnvelope deleteWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion)

Delete Wallet Token

Delete a specific payment token of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tokenId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#deleteWalletTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#deleteWalletTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **tokenId** | **java.util.UUID**|  | |
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

<a id="getIncomingPaymentsAsync"></a>
# **getIncomingPaymentsAsync**
> PaymentDtoListEnvelope getIncomingPaymentsAsync(walletId, apiVersion, xApiVersion)

Get Incoming Payments

Get incoming payments of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.getIncomingPaymentsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getIncomingPaymentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getIncomingPaymentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIncomingPaymentsCountAsync"></a>
# **getIncomingPaymentsCountAsync**
> Int32Envelope getIncomingPaymentsCountAsync(walletId, apiVersion, xApiVersion)

Get Incoming Payments Count

Get incoming payments count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getIncomingPaymentsCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getIncomingPaymentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getIncomingPaymentsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getIncomingWalletInvoicesAsync"></a>
# **getIncomingWalletInvoicesAsync**
> InvoiceDtoListEnvelope getIncomingWalletInvoicesAsync(walletId, apiVersion, xApiVersion)

Get Incoming Wallet Invoices

Get incoming invoices of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InvoiceDtoListEnvelope = apiInstance.getIncomingWalletInvoicesAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getIncomingWalletInvoicesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getIncomingWalletInvoicesAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**InvoiceDtoListEnvelope**](InvoiceDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getIncomingWalletInvoicesCountAsync"></a>
# **getIncomingWalletInvoicesCountAsync**
> Int32Envelope getIncomingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)

Get Incoming Wallet Invoices Count

Get incoming invoices count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getIncomingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getIncomingWalletInvoicesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getIncomingWalletInvoicesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getOutgoingPaymentsAsync"></a>
# **getOutgoingPaymentsAsync**
> PaymentDtoListEnvelope getOutgoingPaymentsAsync(walletId, apiVersion, xApiVersion)

Get Outgoing Payments

Get outgoing payments of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.getOutgoingPaymentsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getOutgoingPaymentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getOutgoingPaymentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutgoingPaymentsCountAsync"></a>
# **getOutgoingPaymentsCountAsync**
> Int32Envelope getOutgoingPaymentsCountAsync(walletId, apiVersion, xApiVersion)

Get Outgoing Payments Count

Get outgoing payments count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getOutgoingPaymentsCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getOutgoingPaymentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getOutgoingPaymentsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getOutgoingWalletInvoicesAsync"></a>
# **getOutgoingWalletInvoicesAsync**
> InvoiceDtoListEnvelope getOutgoingWalletInvoicesAsync(walletId, apiVersion, xApiVersion)

Get Outgoing Wallet Invoices

Get outgoing invoices of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InvoiceDtoListEnvelope = apiInstance.getOutgoingWalletInvoicesAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getOutgoingWalletInvoicesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getOutgoingWalletInvoicesAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**InvoiceDtoListEnvelope**](InvoiceDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutgoingWalletInvoicesCountAsync"></a>
# **getOutgoingWalletInvoicesCountAsync**
> Int32Envelope getOutgoingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)

Get Outgoing Wallet Invoices Count

Get outgoing invoices count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getOutgoingWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getOutgoingWalletInvoicesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getOutgoingWalletInvoicesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletBankAccountAsync"></a>
# **getWalletBankAccountAsync**
> BankAccountDtoEnvelope getWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion)

Get Wallet Bank Account

Get a specific bank account of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val bankAccountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankAccountDtoEnvelope = apiInstance.getWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletBankAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletBankAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **bankAccountId** | **java.util.UUID**|  | |
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

<a id="getWalletBankAccountsAsync"></a>
# **getWalletBankAccountsAsync**
> BankAccountDtoListEnvelope getWalletBankAccountsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Bank Accounts

Get bank accounts of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BankAccountDtoListEnvelope = apiInstance.getWalletBankAccountsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletBankAccountsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletBankAccountsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletBankAccountsCountAsync"></a>
# **getWalletBankAccountsCountAsync**
> Int32Envelope getWalletBankAccountsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Bank Accounts Count

Get bank accounts count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletBankAccountsCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletBankAccountsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletBankAccountsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletChargebacksAsync"></a>
# **getWalletChargebacksAsync**
> PaymentChargebackDtoListEnvelope getWalletChargebacksAsync(walletId, apiVersion, xApiVersion)

Get Wallet Chargebacks

Get chargebacks of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentChargebackDtoListEnvelope = apiInstance.getWalletChargebacksAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletChargebacksAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletChargebacksAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentChargebackDtoListEnvelope**](PaymentChargebackDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletChargebacksCountAsync"></a>
# **getWalletChargebacksCountAsync**
> Int32Envelope getWalletChargebacksCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Chargebacks Count

Get chargebacks count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletChargebacksCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletChargebacksCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletChargebacksCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletDetailsAsync"></a>
# **getWalletDetailsAsync**
> WalletDtoEnvelope getWalletDetailsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Details

Get details of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WalletDtoEnvelope = apiInstance.getWalletDetailsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WalletDtoEnvelope**](WalletDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletExtendedOrdersAsync"></a>
# **getWalletExtendedOrdersAsync**
> ExtendedOrderDtoListEnvelope getWalletExtendedOrdersAsync(walletId, apiVersion, xApiVersion)

Get Wallet Extended Orders

Get extended orders of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedOrderDtoListEnvelope = apiInstance.getWalletExtendedOrdersAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletExtendedOrdersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletExtendedOrdersAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedOrderDtoListEnvelope**](ExtendedOrderDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletInvoicesAsync"></a>
# **getWalletInvoicesAsync**
> InvoiceDtoListEnvelope getWalletInvoicesAsync(walletId, apiVersion, xApiVersion)

Get Wallet Invoices

Get invoices of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InvoiceDtoListEnvelope = apiInstance.getWalletInvoicesAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletInvoicesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletInvoicesAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**InvoiceDtoListEnvelope**](InvoiceDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletInvoicesCountAsync"></a>
# **getWalletInvoicesCountAsync**
> Int32Envelope getWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Invoices Count

Get invoices count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletInvoicesCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletInvoicesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletInvoicesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletLocationAsync"></a>
# **getWalletLocationAsync**
> LocationDtoEnvelope getWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion)

Get Wallet Location

Get a specific location of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LocationDtoEnvelope = apiInstance.getWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **locationId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LocationDtoEnvelope**](LocationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletLocationsAsync"></a>
# **getWalletLocationsAsync**
> LocationDtoListEnvelope getWalletLocationsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Locations

Get locations of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LocationDtoListEnvelope = apiInstance.getWalletLocationsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletLocationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletLocationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LocationDtoListEnvelope**](LocationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletLocationsCountAsync"></a>
# **getWalletLocationsCountAsync**
> Int32Envelope getWalletLocationsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Locations Count

Get locations count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletLocationsCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletLocationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletLocationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletOrdersAsync"></a>
# **getWalletOrdersAsync**
> OrderDtoListEnvelope getWalletOrdersAsync(walletId, apiVersion, xApiVersion)

Get Wallet Orders

Get orders of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OrderDtoListEnvelope = apiInstance.getWalletOrdersAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletOrdersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletOrdersAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OrderDtoListEnvelope**](OrderDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletOrdersCountAsync"></a>
# **getWalletOrdersCountAsync**
> Int32Envelope getWalletOrdersCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Orders Count

Get orders count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletOrdersCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletOrdersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletOrdersCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletPaymentsAsync"></a>
# **getWalletPaymentsAsync**
> PaymentDtoListEnvelope getWalletPaymentsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Payments

Get payments of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.getWalletPaymentsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletPaymentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletPaymentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletPaymentsCountAsync"></a>
# **getWalletPaymentsCountAsync**
> Int32Envelope getWalletPaymentsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Payments Count

Get payments count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletPaymentsCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletPaymentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletPaymentsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletQuotesAsync"></a>
# **getWalletQuotesAsync**
> QuoteDtoListEnvelope getWalletQuotesAsync(walletId, apiVersion, xApiVersion)

Get Wallet Quotes

Get quotes of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : QuoteDtoListEnvelope = apiInstance.getWalletQuotesAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletQuotesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletQuotesAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**QuoteDtoListEnvelope**](QuoteDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletQuotesCountAsync"></a>
# **getWalletQuotesCountAsync**
> Int32Envelope getWalletQuotesCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Quotes Count

Get quotes count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletQuotesCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletQuotesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletQuotesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletRefundsAsync"></a>
# **getWalletRefundsAsync**
> PaymentRefundDtoListEnvelope getWalletRefundsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Refunds

Get refunds of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentRefundDtoListEnvelope = apiInstance.getWalletRefundsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletRefundsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletRefundsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentRefundDtoListEnvelope**](PaymentRefundDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletRefundsCountAsync"></a>
# **getWalletRefundsCountAsync**
> Int32Envelope getWalletRefundsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Refunds Count

Get refunds count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletRefundsCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletRefundsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletRefundsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletTokenAsync"></a>
# **getWalletTokenAsync**
> PaymentTokenDtoEnvelope getWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion)

Get Wallet Token

Get a specific payment token of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tokenId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentTokenDtoEnvelope = apiInstance.getWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **tokenId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentTokenDtoEnvelope**](PaymentTokenDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletTokensAsync"></a>
# **getWalletTokensAsync**
> PaymentTokenDtoListEnvelope getWalletTokensAsync(walletId, apiVersion, xApiVersion)

Get Wallet Tokens

Get payment tokens of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentTokenDtoListEnvelope = apiInstance.getWalletTokensAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletTokensAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletTokensAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentTokenDtoListEnvelope**](PaymentTokenDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletTokensCountAsync"></a>
# **getWalletTokensCountAsync**
> Int32Envelope getWalletTokensCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Tokens Count

Get payment tokens count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletTokensCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletTokensCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletTokensCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletWithdrawRequestsAsync"></a>
# **getWalletWithdrawRequestsAsync**
> WalletWithdrawRequestDtoListEnvelope getWalletWithdrawRequestsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Withdraw Requests

Get withdraw requests of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WalletWithdrawRequestDtoListEnvelope = apiInstance.getWalletWithdrawRequestsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletWithdrawRequestsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletWithdrawRequestsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WalletWithdrawRequestDtoListEnvelope**](WalletWithdrawRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletWithdrawRequestsCountAsync"></a>
# **getWalletWithdrawRequestsCountAsync**
> Int32Envelope getWalletWithdrawRequestsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Withdraw Requests Count

Get withdraw requests count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletWithdrawRequestsCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletWithdrawRequestsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletWithdrawRequestsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="getWalletWithdrawsAsync"></a>
# **getWalletWithdrawsAsync**
> WalletWithdrawDtoListEnvelope getWalletWithdrawsAsync(walletId, apiVersion, xApiVersion)

Get Wallet Withdraws

Get withdraws of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WalletWithdrawDtoListEnvelope = apiInstance.getWalletWithdrawsAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletWithdrawsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletWithdrawsAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WalletWithdrawDtoListEnvelope**](WalletWithdrawDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWalletWithdrawsCountAsync"></a>
# **getWalletWithdrawsCountAsync**
> Int32Envelope getWalletWithdrawsCountAsync(walletId, apiVersion, xApiVersion)

Get Wallet Withdraws Count

Get withdraws count of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWalletWithdrawsCountAsync(walletId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#getWalletWithdrawsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#getWalletWithdrawsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
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

<a id="patchWalletBankAccountAsync"></a>
# **patchWalletBankAccountAsync**
> EmptyEnvelope patchWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion, operation)

Patch Wallet Bank Account

Partially update a specific bank account of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val bankAccountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#patchWalletBankAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#patchWalletBankAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **bankAccountId** | **java.util.UUID**|  | |
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

<a id="patchWalletTokenAsync"></a>
# **patchWalletTokenAsync**
> EmptyEnvelope patchWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion, operation)

Patch Wallet Token

Partially update a specific payment token of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tokenId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#patchWalletTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#patchWalletTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **tokenId** | **java.util.UUID**|  | |
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

<a id="updateWalletBankAccountAsync"></a>
# **updateWalletBankAccountAsync**
> EmptyEnvelope updateWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion, bankAccountUpdateDto)

Update Wallet Bank Account

Update a specific bank account of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val bankAccountId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val bankAccountUpdateDto : BankAccountUpdateDto =  // BankAccountUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWalletBankAccountAsync(walletId, bankAccountId, apiVersion, xApiVersion, bankAccountUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#updateWalletBankAccountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#updateWalletBankAccountAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **bankAccountId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bankAccountUpdateDto** | [**BankAccountUpdateDto**](BankAccountUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateWalletLocationAsync"></a>
# **updateWalletLocationAsync**
> EmptyEnvelope updateWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion, locationUpdateDto)

Update Wallet Location

Update a specific location of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val locationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val locationUpdateDto : LocationUpdateDto =  // LocationUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWalletLocationAsync(walletId, locationId, apiVersion, xApiVersion, locationUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#updateWalletLocationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#updateWalletLocationAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **locationId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **locationUpdateDto** | [**LocationUpdateDto**](LocationUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateWalletTokenAsync"></a>
# **updateWalletTokenAsync**
> EmptyEnvelope updateWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion, paymentTokenUpdateDto)

Update Wallet Token

Update a specific payment token of a specific wallet by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WalletsApi()
val walletId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tokenId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentTokenUpdateDto : PaymentTokenUpdateDto =  // PaymentTokenUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWalletTokenAsync(walletId, tokenId, apiVersion, xApiVersion, paymentTokenUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WalletsApi#updateWalletTokenAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WalletsApi#updateWalletTokenAsync")
    e.printStackTrace()
}
```

### Parameters
| **walletId** | **java.util.UUID**|  | |
| **tokenId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentTokenUpdateDto** | [**PaymentTokenUpdateDto**](PaymentTokenUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

