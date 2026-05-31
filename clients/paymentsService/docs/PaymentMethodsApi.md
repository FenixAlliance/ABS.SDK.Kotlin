# PaymentMethodsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPaymentMethodAsync**](PaymentMethodsApi.md#createPaymentMethodAsync) | **POST** /api/v2/PaymentsService/PaymentMethods | Creates a new payment method |
| [**deletePaymentMethodAsync**](PaymentMethodsApi.md#deletePaymentMethodAsync) | **DELETE** /api/v2/PaymentsService/PaymentMethods/{paymentMethodId} | Deletes a payment method |
| [**getPaymentMethodDetailsAsync**](PaymentMethodsApi.md#getPaymentMethodDetailsAsync) | **GET** /api/v2/PaymentsService/PaymentMethods/{paymentMethodId} | Gets a payment method by ID |
| [**getPaymentMethodsAsync**](PaymentMethodsApi.md#getPaymentMethodsAsync) | **GET** /api/v2/PaymentsService/PaymentMethods | Retrieves all payment methods |
| [**getPaymentMethodsCountAsync**](PaymentMethodsApi.md#getPaymentMethodsCountAsync) | **GET** /api/v2/PaymentsService/PaymentMethods/Count | Counts payment methods |
| [**updatePaymentMethodAsync**](PaymentMethodsApi.md#updatePaymentMethodAsync) | **PUT** /api/v2/PaymentsService/PaymentMethods/{paymentMethodId} | Updates a payment method |


<a id="createPaymentMethodAsync"></a>
# **createPaymentMethodAsync**
> EmptyEnvelope createPaymentMethodAsync(tenantId, apiVersion, xApiVersion, paymentMethodCreateDto)

Creates a new payment method

Creates a new payment method for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentMethodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentMethodCreateDto : PaymentMethodCreateDto =  // PaymentMethodCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPaymentMethodAsync(tenantId, apiVersion, xApiVersion, paymentMethodCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#createPaymentMethodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#createPaymentMethodAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentMethodCreateDto** | [**PaymentMethodCreateDto**](PaymentMethodCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePaymentMethodAsync"></a>
# **deletePaymentMethodAsync**
> EmptyEnvelope deletePaymentMethodAsync(paymentMethodId, tenantId, apiVersion, xApiVersion)

Deletes a payment method

Deletes the specified payment method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentMethodsApi()
val paymentMethodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deletePaymentMethodAsync(paymentMethodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#deletePaymentMethodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#deletePaymentMethodAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentMethodId** | **java.util.UUID**|  | |
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

<a id="getPaymentMethodDetailsAsync"></a>
# **getPaymentMethodDetailsAsync**
> PaymentMethodDtoEnvelope getPaymentMethodDetailsAsync(paymentMethodId, tenantId, apiVersion, xApiVersion)

Gets a payment method by ID

Retrieves the details of a payment method using its unique ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentMethodsApi()
val paymentMethodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentMethodDtoEnvelope = apiInstance.getPaymentMethodDetailsAsync(paymentMethodId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#getPaymentMethodDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#getPaymentMethodDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentMethodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentMethodDtoEnvelope**](PaymentMethodDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentMethodsAsync"></a>
# **getPaymentMethodsAsync**
> PaymentMethodDtoIReadOnlyListEnvelope getPaymentMethodsAsync(tenantId, apiVersion, xApiVersion)

Retrieves all payment methods

Gets all payment methods for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentMethodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentMethodDtoIReadOnlyListEnvelope = apiInstance.getPaymentMethodsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#getPaymentMethodsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#getPaymentMethodsAsync")
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

[**PaymentMethodDtoIReadOnlyListEnvelope**](PaymentMethodDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentMethodsCountAsync"></a>
# **getPaymentMethodsCountAsync**
> Int32Envelope getPaymentMethodsCountAsync(tenantId, apiVersion, xApiVersion)

Counts payment methods

Gets the count of payment methods for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentMethodsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getPaymentMethodsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#getPaymentMethodsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#getPaymentMethodsCountAsync")
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

<a id="updatePaymentMethodAsync"></a>
# **updatePaymentMethodAsync**
> EmptyEnvelope updatePaymentMethodAsync(paymentMethodId, tenantId, apiVersion, xApiVersion, paymentMethodUpdateDto)

Updates a payment method

Updates the specified payment method.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentMethodsApi()
val paymentMethodId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentMethodUpdateDto : PaymentMethodUpdateDto =  // PaymentMethodUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePaymentMethodAsync(paymentMethodId, tenantId, apiVersion, xApiVersion, paymentMethodUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentMethodsApi#updatePaymentMethodAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentMethodsApi#updatePaymentMethodAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentMethodId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentMethodUpdateDto** | [**PaymentMethodUpdateDto**](PaymentMethodUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

