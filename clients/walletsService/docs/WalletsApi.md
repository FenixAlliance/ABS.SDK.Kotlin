# WalletsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWalletLocationAsync**](WalletsApi.md#createWalletLocationAsync) | **POST** /api/v2/WalletsService/Wallets/{walletId}/Locations | Create Wallet Location |
| [**deleteWalletLocationAsync**](WalletsApi.md#deleteWalletLocationAsync) | **DELETE** /api/v2/WalletsService/Wallets/{walletId}/Locations/{locationId} | Delete Wallet Location |
| [**getIncomingPaymentsAsync**](WalletsApi.md#getIncomingPaymentsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Incoming | Get Incoming Payments |
| [**getIncomingPaymentsCountAsync**](WalletsApi.md#getIncomingPaymentsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Incoming/Count | Get Incoming Payments Count |
| [**getIncomingWalletInvoicesAsync**](WalletsApi.md#getIncomingWalletInvoicesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Incoming | Get Incoming Wallet Invoices |
| [**getIncomingWalletInvoicesCountAsync**](WalletsApi.md#getIncomingWalletInvoicesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Incoming/Count | Get Incoming Wallet Invoices Count |
| [**getOutgoingPaymentsAsync**](WalletsApi.md#getOutgoingPaymentsAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Outgoing | Get Outgoing Payments |
| [**getOutgoingPaymentsCountAsync**](WalletsApi.md#getOutgoingPaymentsCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Payments/Outgoing/Count | Get Outgoing Payments Count |
| [**getOutgoingWalletInvoicesAsync**](WalletsApi.md#getOutgoingWalletInvoicesAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Outgoing | Get Outgoing Wallet Invoices |
| [**getOutgoingWalletInvoicesCountAsync**](WalletsApi.md#getOutgoingWalletInvoicesCountAsync) | **GET** /api/v2/WalletsService/Wallets/{walletId}/Invoices/Outgoing/Count | Get Outgoing Wallet Invoices Count |
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
| [**updateWalletLocationAsync**](WalletsApi.md#updateWalletLocationAsync) | **PUT** /api/v2/WalletsService/Wallets/{walletId}/Locations/{locationId} | Update Wallet Location |


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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

