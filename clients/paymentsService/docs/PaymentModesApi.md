# PaymentModesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPaymentModeAsync**](PaymentModesApi.md#createPaymentModeAsync) | **POST** /api/v2/PaymentsService/PaymentModes | Creates a new payment mode |
| [**deletePaymentModeAsync**](PaymentModesApi.md#deletePaymentModeAsync) | **DELETE** /api/v2/PaymentsService/PaymentModes/{paymentModeId} | Deletes a payment mode |
| [**getPaymentModeDetailsAsync**](PaymentModesApi.md#getPaymentModeDetailsAsync) | **GET** /api/v2/PaymentsService/PaymentModes/{paymentModeId} | Gets a payment mode by ID |
| [**getPaymentModesAsync**](PaymentModesApi.md#getPaymentModesAsync) | **GET** /api/v2/PaymentsService/PaymentModes | Retrieves all payment modes |
| [**getPaymentModesCountAsync**](PaymentModesApi.md#getPaymentModesCountAsync) | **GET** /api/v2/PaymentsService/PaymentModes/Count | Counts payment modes |
| [**updatePaymentModeAsync**](PaymentModesApi.md#updatePaymentModeAsync) | **PUT** /api/v2/PaymentsService/PaymentModes/{paymentModeId} | Updates a payment mode |


<a id="createPaymentModeAsync"></a>
# **createPaymentModeAsync**
> EmptyEnvelope createPaymentModeAsync(tenantId, apiVersion, xApiVersion, paymentModeCreateDto)

Creates a new payment mode

Creates a new payment mode for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentModesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentModeCreateDto : PaymentModeCreateDto =  // PaymentModeCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPaymentModeAsync(tenantId, apiVersion, xApiVersion, paymentModeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentModesApi#createPaymentModeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentModesApi#createPaymentModeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentModeCreateDto** | [**PaymentModeCreateDto**](PaymentModeCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePaymentModeAsync"></a>
# **deletePaymentModeAsync**
> EmptyEnvelope deletePaymentModeAsync(paymentModeId, tenantId, apiVersion, xApiVersion)

Deletes a payment mode

Deletes the specified payment mode.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentModesApi()
val paymentModeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deletePaymentModeAsync(paymentModeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentModesApi#deletePaymentModeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentModesApi#deletePaymentModeAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentModeId** | **java.util.UUID**|  | |
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

<a id="getPaymentModeDetailsAsync"></a>
# **getPaymentModeDetailsAsync**
> PaymentModeDtoEnvelope getPaymentModeDetailsAsync(paymentModeId, tenantId, apiVersion, xApiVersion)

Gets a payment mode by ID

Retrieves the details of a payment mode using its unique ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentModesApi()
val paymentModeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentModeDtoEnvelope = apiInstance.getPaymentModeDetailsAsync(paymentModeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentModesApi#getPaymentModeDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentModesApi#getPaymentModeDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentModeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentModeDtoEnvelope**](PaymentModeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentModesAsync"></a>
# **getPaymentModesAsync**
> PaymentModeDtoIReadOnlyListEnvelope getPaymentModesAsync(tenantId, apiVersion, xApiVersion)

Retrieves all payment modes

Gets all payment modes for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentModesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentModeDtoIReadOnlyListEnvelope = apiInstance.getPaymentModesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentModesApi#getPaymentModesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentModesApi#getPaymentModesAsync")
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

[**PaymentModeDtoIReadOnlyListEnvelope**](PaymentModeDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentModesCountAsync"></a>
# **getPaymentModesCountAsync**
> Int32Envelope getPaymentModesCountAsync(tenantId, apiVersion, xApiVersion)

Counts payment modes

Gets the count of payment modes for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentModesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getPaymentModesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentModesApi#getPaymentModesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentModesApi#getPaymentModesCountAsync")
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

<a id="updatePaymentModeAsync"></a>
# **updatePaymentModeAsync**
> EmptyEnvelope updatePaymentModeAsync(paymentModeId, tenantId, apiVersion, xApiVersion, paymentModeUpdateDto)

Updates a payment mode

Updates the specified payment mode.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentModesApi()
val paymentModeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val paymentModeUpdateDto : PaymentModeUpdateDto =  // PaymentModeUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePaymentModeAsync(paymentModeId, tenantId, apiVersion, xApiVersion, paymentModeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentModesApi#updatePaymentModeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentModesApi#updatePaymentModeAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentModeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentModeUpdateDto** | [**PaymentModeUpdateDto**](PaymentModeUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

