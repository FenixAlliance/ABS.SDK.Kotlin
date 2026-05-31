# CommissionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCommissionAsync**](CommissionsApi.md#createCommissionAsync) | **POST** /api/v2/AccountingService/Commissions/Commissions | Create a commission |
| [**createPaymentCommissionAsync**](CommissionsApi.md#createPaymentCommissionAsync) | **POST** /api/v2/AccountingService/Commissions/PaymentCommissions | Create a payment commission |
| [**deleteCommissionAsync**](CommissionsApi.md#deleteCommissionAsync) | **DELETE** /api/v2/AccountingService/Commissions/Commissions/{commissionId} | Delete a commission |
| [**deletePaymentCommissionAsync**](CommissionsApi.md#deletePaymentCommissionAsync) | **DELETE** /api/v2/AccountingService/Commissions/PaymentCommissions/{paymentCommissionId} | Delete a payment commission |
| [**getCommissionAsync**](CommissionsApi.md#getCommissionAsync) | **GET** /api/v2/AccountingService/Commissions/Commissions/{commissionId} | Get a commission by id |
| [**getCommissionsAsync**](CommissionsApi.md#getCommissionsAsync) | **GET** /api/v2/AccountingService/Commissions/Commissions | Get all commissions for a tenant |
| [**getCommissionsCountAsync**](CommissionsApi.md#getCommissionsCountAsync) | **GET** /api/v2/AccountingService/Commissions/Commissions/Count | Get the count of commissions for a tenant |
| [**getPaymentCommissionAsync**](CommissionsApi.md#getPaymentCommissionAsync) | **GET** /api/v2/AccountingService/Commissions/PaymentCommissions/{paymentCommissionId} | Get a payment commission by id |
| [**getPaymentCommissionsAsync**](CommissionsApi.md#getPaymentCommissionsAsync) | **GET** /api/v2/AccountingService/Commissions/PaymentCommissions | Get all payment commissions for a tenant |
| [**getPaymentCommissionsCountAsync**](CommissionsApi.md#getPaymentCommissionsCountAsync) | **GET** /api/v2/AccountingService/Commissions/PaymentCommissions/Count | Get the count of payment commissions for a tenant |
| [**updateCommissionAsync**](CommissionsApi.md#updateCommissionAsync) | **PUT** /api/v2/AccountingService/Commissions/Commissions/{commissionId} | Update a commission |
| [**updatePaymentCommissionAsync**](CommissionsApi.md#updatePaymentCommissionAsync) | **PUT** /api/v2/AccountingService/Commissions/PaymentCommissions/{paymentCommissionId} | Update a payment commission |


<a id="createCommissionAsync"></a>
# **createCommissionAsync**
> EmptyEnvelope createCommissionAsync(tenantId, commissionCreateDto, apiVersion, xApiVersion)

Create a commission

Creates a new commission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commissionCreateDto : CommissionCreateDto =  // CommissionCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createCommissionAsync(tenantId, commissionCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#createCommissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#createCommissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **commissionCreateDto** | [**CommissionCreateDto**](CommissionCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createPaymentCommissionAsync"></a>
# **createPaymentCommissionAsync**
> EmptyEnvelope createPaymentCommissionAsync(tenantId, paymentCommissionCreateDto, apiVersion, xApiVersion)

Create a payment commission

Creates a new payment commission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val paymentCommissionCreateDto : PaymentCommissionCreateDto =  // PaymentCommissionCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createPaymentCommissionAsync(tenantId, paymentCommissionCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#createPaymentCommissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#createPaymentCommissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **paymentCommissionCreateDto** | [**PaymentCommissionCreateDto**](PaymentCommissionCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCommissionAsync"></a>
# **deleteCommissionAsync**
> EmptyEnvelope deleteCommissionAsync(commissionId, tenantId, apiVersion, xApiVersion)

Delete a commission

Deletes a commission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val commissionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteCommissionAsync(commissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#deleteCommissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#deleteCommissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **commissionId** | **java.util.UUID**|  | |
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

<a id="deletePaymentCommissionAsync"></a>
# **deletePaymentCommissionAsync**
> EmptyEnvelope deletePaymentCommissionAsync(paymentCommissionId, tenantId, apiVersion, xApiVersion)

Delete a payment commission

Deletes a payment commission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val paymentCommissionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deletePaymentCommissionAsync(paymentCommissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#deletePaymentCommissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#deletePaymentCommissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentCommissionId** | **java.util.UUID**|  | |
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

<a id="getCommissionAsync"></a>
# **getCommissionAsync**
> CommissionDtoEnvelope getCommissionAsync(commissionId, tenantId, apiVersion, xApiVersion)

Get a commission by id

Retrieves a commission by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val commissionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CommissionDtoEnvelope = apiInstance.getCommissionAsync(commissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#getCommissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#getCommissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **commissionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CommissionDtoEnvelope**](CommissionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCommissionsAsync"></a>
# **getCommissionsAsync**
> CommissionDtoListEnvelope getCommissionsAsync(tenantId, apiVersion, xApiVersion)

Get all commissions for a tenant

Retrieves all commissions for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CommissionDtoListEnvelope = apiInstance.getCommissionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#getCommissionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#getCommissionsAsync")
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

[**CommissionDtoListEnvelope**](CommissionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCommissionsCountAsync"></a>
# **getCommissionsCountAsync**
> Int32Envelope getCommissionsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of commissions for a tenant

Retrieves the count of commissions for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getCommissionsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#getCommissionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#getCommissionsCountAsync")
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

<a id="getPaymentCommissionAsync"></a>
# **getPaymentCommissionAsync**
> PaymentCommissionDtoEnvelope getPaymentCommissionAsync(paymentCommissionId, tenantId, apiVersion, xApiVersion)

Get a payment commission by id

Retrieves a payment commission by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val paymentCommissionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentCommissionDtoEnvelope = apiInstance.getPaymentCommissionAsync(paymentCommissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#getPaymentCommissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#getPaymentCommissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentCommissionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentCommissionDtoEnvelope**](PaymentCommissionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentCommissionsAsync"></a>
# **getPaymentCommissionsAsync**
> PaymentCommissionDtoListEnvelope getPaymentCommissionsAsync(tenantId, apiVersion, xApiVersion)

Get all payment commissions for a tenant

Retrieves all payment commissions for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentCommissionDtoListEnvelope = apiInstance.getPaymentCommissionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#getPaymentCommissionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#getPaymentCommissionsAsync")
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

[**PaymentCommissionDtoListEnvelope**](PaymentCommissionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPaymentCommissionsCountAsync"></a>
# **getPaymentCommissionsCountAsync**
> Int32Envelope getPaymentCommissionsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of payment commissions for a tenant

Retrieves the count of payment commissions for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getPaymentCommissionsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#getPaymentCommissionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#getPaymentCommissionsCountAsync")
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

<a id="updateCommissionAsync"></a>
# **updateCommissionAsync**
> EmptyEnvelope updateCommissionAsync(commissionId, tenantId, commissionUpdateDto, apiVersion, xApiVersion)

Update a commission

Updates an existing commission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val commissionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val commissionUpdateDto : CommissionUpdateDto =  // CommissionUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateCommissionAsync(commissionId, tenantId, commissionUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#updateCommissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#updateCommissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **commissionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **commissionUpdateDto** | [**CommissionUpdateDto**](CommissionUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updatePaymentCommissionAsync"></a>
# **updatePaymentCommissionAsync**
> EmptyEnvelope updatePaymentCommissionAsync(paymentCommissionId, tenantId, paymentCommissionUpdateDto, apiVersion, xApiVersion)

Update a payment commission

Updates an existing payment commission.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CommissionsApi()
val paymentCommissionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val paymentCommissionUpdateDto : PaymentCommissionUpdateDto =  // PaymentCommissionUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updatePaymentCommissionAsync(paymentCommissionId, tenantId, paymentCommissionUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommissionsApi#updatePaymentCommissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommissionsApi#updatePaymentCommissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **paymentCommissionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **paymentCommissionUpdateDto** | [**PaymentCommissionUpdateDto**](PaymentCommissionUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

