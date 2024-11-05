# PaymentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2PaymentsServicePaymentsGet**](PaymentsApi.md#apiV2PaymentsServicePaymentsGet) | **GET** /api/v2/PaymentsService/Payments |  |
| [**apiV2PaymentsServicePaymentsPaymentIdDelete**](PaymentsApi.md#apiV2PaymentsServicePaymentsPaymentIdDelete) | **DELETE** /api/v2/PaymentsService/Payments/{paymentId} |  |
| [**apiV2PaymentsServicePaymentsPaymentIdDetailsGet**](PaymentsApi.md#apiV2PaymentsServicePaymentsPaymentIdDetailsGet) | **GET** /api/v2/PaymentsService/Payments/{paymentId}/Details |  |
| [**apiV2PaymentsServicePaymentsPaymentIdGet**](PaymentsApi.md#apiV2PaymentsServicePaymentsPaymentIdGet) | **GET** /api/v2/PaymentsService/Payments/{paymentId} |  |
| [**apiV2PaymentsServicePaymentsPaymentIdPut**](PaymentsApi.md#apiV2PaymentsServicePaymentsPaymentIdPut) | **PUT** /api/v2/PaymentsService/Payments/{paymentId} |  |
| [**apiV2PaymentsServicePaymentsPost**](PaymentsApi.md#apiV2PaymentsServicePaymentsPost) | **POST** /api/v2/PaymentsService/Payments |  |


<a id="apiV2PaymentsServicePaymentsGet"></a>
# **apiV2PaymentsServicePaymentsGet**
> PaymentDtoListEnvelope apiV2PaymentsServicePaymentsGet(tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.apiV2PaymentsServicePaymentsGet(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#apiV2PaymentsServicePaymentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#apiV2PaymentsServicePaymentsGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PaymentsServicePaymentsPaymentIdDelete"></a>
# **apiV2PaymentsServicePaymentsPaymentIdDelete**
> EmptyEnvelope apiV2PaymentsServicePaymentsPaymentIdDelete(paymentId, tenantId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val paymentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PaymentsServicePaymentsPaymentIdDelete(paymentId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPaymentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPaymentIdDelete")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PaymentsServicePaymentsPaymentIdDetailsGet"></a>
# **apiV2PaymentsServicePaymentsPaymentIdDetailsGet**
> PaymentDtoListEnvelope apiV2PaymentsServicePaymentsPaymentIdDetailsGet(paymentId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val paymentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.apiV2PaymentsServicePaymentsPaymentIdDetailsGet(paymentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPaymentIdDetailsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPaymentIdDetailsGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PaymentsServicePaymentsPaymentIdGet"></a>
# **apiV2PaymentsServicePaymentsPaymentIdGet**
> PaymentDtoListEnvelope apiV2PaymentsServicePaymentsPaymentIdGet(paymentId)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val paymentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PaymentDtoListEnvelope = apiInstance.apiV2PaymentsServicePaymentsPaymentIdGet(paymentId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPaymentIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPaymentIdGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2PaymentsServicePaymentsPaymentIdPut"></a>
# **apiV2PaymentsServicePaymentsPaymentIdPut**
> EmptyEnvelope apiV2PaymentsServicePaymentsPaymentIdPut(paymentId, tenantId, paymentUpdateDto)



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
    val result : EmptyEnvelope = apiInstance.apiV2PaymentsServicePaymentsPaymentIdPut(paymentId, tenantId, paymentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPaymentIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPaymentIdPut")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2PaymentsServicePaymentsPost"></a>
# **apiV2PaymentsServicePaymentsPost**
> EmptyEnvelope apiV2PaymentsServicePaymentsPost(tenantId, paymentCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val paymentCreateDto : PaymentCreateDto =  // PaymentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2PaymentsServicePaymentsPost(tenantId, paymentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentsApi#apiV2PaymentsServicePaymentsPost")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

