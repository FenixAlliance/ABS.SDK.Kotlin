# PaymentTermsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPaymentTermAsync**](PaymentTermsApi.md#createPaymentTermAsync) | **POST** /api/v2/PaymentsService/PaymentTerms | Creates a new payment term |
| [**deletePaymentTermAsync**](PaymentTermsApi.md#deletePaymentTermAsync) | **DELETE** /api/v2/PaymentsService/PaymentTerms/{paymentTermId} | Deletes a payment term |
| [**getPaymentTermDetailsAsync**](PaymentTermsApi.md#getPaymentTermDetailsAsync) | **GET** /api/v2/PaymentsService/PaymentTerms/{paymentTermId} | Gets a payment term by ID |
| [**getPaymentTermsAsync**](PaymentTermsApi.md#getPaymentTermsAsync) | **GET** /api/v2/PaymentsService/PaymentTerms | Retrieves all payment terms |
| [**getPaymentTermsCountAsync**](PaymentTermsApi.md#getPaymentTermsCountAsync) | **GET** /api/v2/PaymentsService/PaymentTerms/Count | Counts payment terms |
| [**updatePaymentTermAsync**](PaymentTermsApi.md#updatePaymentTermAsync) | **PUT** /api/v2/PaymentsService/PaymentTerms/{paymentTermId} | Updates a payment term |


<a id="createPaymentTermAsync"></a>
# **createPaymentTermAsync**
> EmptyEnvelope createPaymentTermAsync(tenantId, apiVersion, xApiVersion, paymentTermCreateDto)

Creates a new payment term

Creates a new payment term for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentTermsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentTermCreateDto : PaymentTermCreateDto =  // PaymentTermCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPaymentTermAsync(tenantId, apiVersion, xApiVersion, paymentTermCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#createPaymentTermAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#createPaymentTermAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentTermCreateDto** | [**PaymentTermCreateDto**](PaymentTermCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePaymentTermAsync"></a>
# **deletePaymentTermAsync**
> EmptyEnvelope deletePaymentTermAsync(paymentTermId, tenantId, apiVersion, xApiVersion)

Deletes a payment term

Deletes the specified payment term.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentTermsApi()
val paymentTermId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deletePaymentTermAsync(paymentTermId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#deletePaymentTermAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#deletePaymentTermAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentTermId** | **java.util.UUID**|  | |
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

<a id="getPaymentTermDetailsAsync"></a>
# **getPaymentTermDetailsAsync**
> PaymentTermDtoEnvelope getPaymentTermDetailsAsync(paymentTermId, tenantId, apiVersion, xApiVersion)

Gets a payment term by ID

Retrieves the details of a payment term using its unique ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentTermsApi()
val paymentTermId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentTermDtoEnvelope = apiInstance.getPaymentTermDetailsAsync(paymentTermId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#getPaymentTermDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#getPaymentTermDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentTermId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentTermDtoEnvelope**](PaymentTermDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentTermsAsync"></a>
# **getPaymentTermsAsync**
> PaymentTermDtoIReadOnlyListEnvelope getPaymentTermsAsync(tenantId, apiVersion, xApiVersion)

Retrieves all payment terms

Gets all payment terms for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentTermsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentTermDtoIReadOnlyListEnvelope = apiInstance.getPaymentTermsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#getPaymentTermsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#getPaymentTermsAsync")
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

[**PaymentTermDtoIReadOnlyListEnvelope**](PaymentTermDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentTermsCountAsync"></a>
# **getPaymentTermsCountAsync**
> Int32Envelope getPaymentTermsCountAsync(tenantId, apiVersion, xApiVersion)

Counts payment terms

Gets the count of payment terms for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentTermsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getPaymentTermsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#getPaymentTermsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#getPaymentTermsCountAsync")
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

<a id="updatePaymentTermAsync"></a>
# **updatePaymentTermAsync**
> EmptyEnvelope updatePaymentTermAsync(paymentTermId, tenantId, apiVersion, xApiVersion, paymentTermUpdateDto)

Updates a payment term

Updates the specified payment term.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentTermsApi()
val paymentTermId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentTermUpdateDto : PaymentTermUpdateDto =  // PaymentTermUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePaymentTermAsync(paymentTermId, tenantId, apiVersion, xApiVersion, paymentTermUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentTermsApi#updatePaymentTermAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentTermsApi#updatePaymentTermAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentTermId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentTermUpdateDto** | [**PaymentTermUpdateDto**](PaymentTermUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

