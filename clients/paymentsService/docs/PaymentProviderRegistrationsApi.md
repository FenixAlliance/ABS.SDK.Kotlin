# PaymentProviderRegistrationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAsync**](PaymentProviderRegistrationsApi.md#createAsync) | **POST** /api/v2/PaymentsService/PaymentProviderRegistrations | Provisions a provider webhook registration |
| [**getAsync**](PaymentProviderRegistrationsApi.md#getAsync) | **GET** /api/v2/PaymentsService/PaymentProviderRegistrations | Lists the tenant&#39;s provider registrations |
| [**getCountAsync**](PaymentProviderRegistrationsApi.md#getCountAsync) | **GET** /api/v2/PaymentsService/PaymentProviderRegistrations/Count | Counts the tenant&#39;s provider registrations |
| [**rotateKeyAsync**](PaymentProviderRegistrationsApi.md#rotateKeyAsync) | **POST** /api/v2/PaymentsService/PaymentProviderRegistrations/{registrationId}/RotateKey | Rotates a registration&#39;s webhook key |


<a id="createAsync"></a>
# **createAsync**
> ProviderWebhookRegistrationCreatedDtoEnvelope createAsync(tenantId, createProviderWebhookRegistrationRequest)

Provisions a provider webhook registration

Stores the BYO signing secret in the tenant options store, creates + activates the registration, and reveals the one-time plaintext webhook key plus its fully-composed inbound URL.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentProviderRegistrationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val createProviderWebhookRegistrationRequest : CreateProviderWebhookRegistrationRequest =  // CreateProviderWebhookRegistrationRequest | 
try {
    val result : ProviderWebhookRegistrationCreatedDtoEnvelope = apiInstance.createAsync(tenantId, createProviderWebhookRegistrationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentProviderRegistrationsApi#createAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentProviderRegistrationsApi#createAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createProviderWebhookRegistrationRequest** | [**CreateProviderWebhookRegistrationRequest**](CreateProviderWebhookRegistrationRequest.md)|  | [optional] |

### Return type

[**ProviderWebhookRegistrationCreatedDtoEnvelope**](ProviderWebhookRegistrationCreatedDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getAsync"></a>
# **getAsync**
> PaymentProviderRegistrationDtoListEnvelope getAsync(tenantId, paymentProviderRegistrationDtoCollectionQueryParameters)

Lists the tenant&#39;s provider registrations

Gets all provider registrations for the current tenant with OData support (no secret is ever returned).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentProviderRegistrationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val paymentProviderRegistrationDtoCollectionQueryParameters : PaymentProviderRegistrationDtoCollectionQueryParameters =  // PaymentProviderRegistrationDtoCollectionQueryParameters | 
try {
    val result : PaymentProviderRegistrationDtoListEnvelope = apiInstance.getAsync(tenantId, paymentProviderRegistrationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentProviderRegistrationsApi#getAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentProviderRegistrationsApi#getAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentProviderRegistrationDtoCollectionQueryParameters** | [**PaymentProviderRegistrationDtoCollectionQueryParameters**](PaymentProviderRegistrationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**PaymentProviderRegistrationDtoListEnvelope**](PaymentProviderRegistrationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getCountAsync"></a>
# **getCountAsync**
> Int32Envelope getCountAsync(tenantId, paymentProviderRegistrationDtoCollectionQueryParameters)

Counts the tenant&#39;s provider registrations

Gets the count of provider registrations for the current tenant (OData sibling of the list).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentProviderRegistrationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val paymentProviderRegistrationDtoCollectionQueryParameters : PaymentProviderRegistrationDtoCollectionQueryParameters =  // PaymentProviderRegistrationDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getCountAsync(tenantId, paymentProviderRegistrationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentProviderRegistrationsApi#getCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentProviderRegistrationsApi#getCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentProviderRegistrationDtoCollectionQueryParameters** | [**PaymentProviderRegistrationDtoCollectionQueryParameters**](PaymentProviderRegistrationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="rotateKeyAsync"></a>
# **rotateKeyAsync**
> ProviderWebhookRegistrationCreatedDtoEnvelope rotateKeyAsync(registrationId, tenantId)

Rotates a registration&#39;s webhook key

Mints a fresh webhook key (invalidating the previous one) and reveals it once, plus its composed URL.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PaymentProviderRegistrationsApi()
val registrationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ProviderWebhookRegistrationCreatedDtoEnvelope = apiInstance.rotateKeyAsync(registrationId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PaymentProviderRegistrationsApi#rotateKeyAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PaymentProviderRegistrationsApi#rotateKeyAsync")
    e.printStackTrace()
}
```

### Parameters
| **registrationId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ProviderWebhookRegistrationCreatedDtoEnvelope**](ProviderWebhookRegistrationCreatedDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

