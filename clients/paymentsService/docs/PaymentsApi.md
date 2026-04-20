# PaymentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPaymentAsync**](PaymentsApi.md#createPaymentAsync) | **POST** /api/v2/PaymentsService/Payments | Creates a new payment |
| [**deletePaymentAsync**](PaymentsApi.md#deletePaymentAsync) | **DELETE** /api/v2/PaymentsService/Payments/{paymentId} | Deletes a payment |
| [**getPaymentAsync**](PaymentsApi.md#getPaymentAsync) | **GET** /api/v2/PaymentsService/Payments/{paymentId}/Details | Gets a payment by ID (deprecated) |
| [**getPaymentAsyncV2**](PaymentsApi.md#getPaymentAsyncV2) | **GET** /api/v2/PaymentsService/Payments/{paymentId} | Gets a payment by ID |
| [**getPaymentsAsync**](PaymentsApi.md#getPaymentsAsync) | **GET** /api/v2/PaymentsService/Payments | Retrieves all payments |
| [**updatePaymentAsync**](PaymentsApi.md#updatePaymentAsync) | **PUT** /api/v2/PaymentsService/Payments/{paymentId} | Updates a payment |


<a id="createPaymentAsync"></a>
# **createPaymentAsync**
> EmptyEnvelope createPaymentAsync(tenantId, paymentCreateDto)

Creates a new payment

Creates a new payment for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val paymentCreateDto : PaymentCreateDto =  // PaymentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPaymentAsync(tenantId, paymentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#createPaymentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#createPaymentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
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

<a id="deletePaymentAsync"></a>
# **deletePaymentAsync**
> EmptyEnvelope deletePaymentAsync(paymentId, tenantId)

Deletes a payment

Deletes the specified payment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val paymentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deletePaymentAsync(paymentId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#deletePaymentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#deletePaymentAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentAsync"></a>
# **getPaymentAsync**
> PaymentDtoListEnvelope getPaymentAsync(paymentId)

Gets a payment by ID (deprecated)

Retrieves a payment using the deprecated /Details route. Use GET {paymentId} instead.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val paymentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.getPaymentAsync(paymentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#getPaymentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#getPaymentAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentId** | **java.util.UUID**|  | |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentAsyncV2"></a>
# **getPaymentAsyncV2**
> PaymentDtoListEnvelope getPaymentAsyncV2(paymentId)

Gets a payment by ID

Retrieves the details of a payment using its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val paymentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.getPaymentAsyncV2(paymentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#getPaymentAsyncV2")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#getPaymentAsyncV2")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentId** | **java.util.UUID**|  | |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentsAsync"></a>
# **getPaymentsAsync**
> PaymentDtoListEnvelope getPaymentsAsync(tenantId)

Retrieves all payments

Gets all payments for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.getPaymentsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#getPaymentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#getPaymentsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**PaymentDtoListEnvelope**](PaymentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updatePaymentAsync"></a>
# **updatePaymentAsync**
> EmptyEnvelope updatePaymentAsync(paymentId, tenantId, paymentUpdateDto)

Updates a payment

Updates the specified payment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val paymentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val paymentUpdateDto : PaymentUpdateDto =  // PaymentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePaymentAsync(paymentId, tenantId, paymentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#updatePaymentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#updatePaymentAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentUpdateDto** | [**PaymentUpdateDto**](PaymentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

