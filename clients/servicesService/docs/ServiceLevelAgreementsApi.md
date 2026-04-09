# ServiceLevelAgreementsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createServiceLevelAgreementAsync**](ServiceLevelAgreementsApi.md#createServiceLevelAgreementAsync) | **POST** /api/v2/ServicesService/ServiceLevelAgreements | Create a service level agreement |
| [**deleteServiceLevelAgreementAsync**](ServiceLevelAgreementsApi.md#deleteServiceLevelAgreementAsync) | **DELETE** /api/v2/ServicesService/ServiceLevelAgreements/{serviceLevelAgreementId} | Delete a service level agreement |
| [**getServiceLevelAgreementByIdAsync**](ServiceLevelAgreementsApi.md#getServiceLevelAgreementByIdAsync) | **GET** /api/v2/ServicesService/ServiceLevelAgreements/{serviceLevelAgreementId} | Get a service level agreement by ID |
| [**getServiceLevelAgreementsAsync**](ServiceLevelAgreementsApi.md#getServiceLevelAgreementsAsync) | **GET** /api/v2/ServicesService/ServiceLevelAgreements | Get all service level agreements |
| [**getServiceLevelAgreementsCountAsync**](ServiceLevelAgreementsApi.md#getServiceLevelAgreementsCountAsync) | **GET** /api/v2/ServicesService/ServiceLevelAgreements/Count | Get service level agreements count |
| [**updateServiceLevelAgreementAsync**](ServiceLevelAgreementsApi.md#updateServiceLevelAgreementAsync) | **PUT** /api/v2/ServicesService/ServiceLevelAgreements/{serviceLevelAgreementId} | Update a service level agreement |


<a id="createServiceLevelAgreementAsync"></a>
# **createServiceLevelAgreementAsync**
> Envelope createServiceLevelAgreementAsync(tenantId, apiVersion, xApiVersion, serviceLevelAgreementCreateDto)

Create a service level agreement

Creates a new service level agreement for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelAgreementsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceLevelAgreementCreateDto : ServiceLevelAgreementCreateDto =  // ServiceLevelAgreementCreateDto | 
try {
    val result : Envelope = apiInstance.createServiceLevelAgreementAsync(tenantId, apiVersion, xApiVersion, serviceLevelAgreementCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelAgreementsApi#createServiceLevelAgreementAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelAgreementsApi#createServiceLevelAgreementAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceLevelAgreementCreateDto** | [**ServiceLevelAgreementCreateDto**](ServiceLevelAgreementCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteServiceLevelAgreementAsync"></a>
# **deleteServiceLevelAgreementAsync**
> Envelope deleteServiceLevelAgreementAsync(serviceLevelAgreementId, tenantId, apiVersion, xApiVersion)

Delete a service level agreement

Deletes a service level agreement by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelAgreementsApi()
val serviceLevelAgreementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteServiceLevelAgreementAsync(serviceLevelAgreementId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelAgreementsApi#deleteServiceLevelAgreementAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelAgreementsApi#deleteServiceLevelAgreementAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceLevelAgreementId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceLevelAgreementByIdAsync"></a>
# **getServiceLevelAgreementByIdAsync**
> ServiceLevelAgreementDtoEnvelope getServiceLevelAgreementByIdAsync(serviceLevelAgreementId, tenantId, apiVersion, xApiVersion)

Get a service level agreement by ID

Retrieves a service level agreement by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelAgreementsApi()
val serviceLevelAgreementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceLevelAgreementDtoEnvelope = apiInstance.getServiceLevelAgreementByIdAsync(serviceLevelAgreementId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelAgreementsApi#getServiceLevelAgreementByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelAgreementsApi#getServiceLevelAgreementByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceLevelAgreementId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ServiceLevelAgreementDtoEnvelope**](ServiceLevelAgreementDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceLevelAgreementsAsync"></a>
# **getServiceLevelAgreementsAsync**
> ServiceLevelAgreementDtoIReadOnlyListEnvelope getServiceLevelAgreementsAsync(tenantId, apiVersion, xApiVersion)

Get all service level agreements

Retrieves all service level agreements for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelAgreementsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceLevelAgreementDtoIReadOnlyListEnvelope = apiInstance.getServiceLevelAgreementsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelAgreementsApi#getServiceLevelAgreementsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelAgreementsApi#getServiceLevelAgreementsAsync")
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

[**ServiceLevelAgreementDtoIReadOnlyListEnvelope**](ServiceLevelAgreementDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceLevelAgreementsCountAsync"></a>
# **getServiceLevelAgreementsCountAsync**
> Int32Envelope getServiceLevelAgreementsCountAsync(tenantId, apiVersion, xApiVersion)

Get service level agreements count

Returns the count of service level agreements for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelAgreementsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getServiceLevelAgreementsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelAgreementsApi#getServiceLevelAgreementsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelAgreementsApi#getServiceLevelAgreementsCountAsync")
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

<a id="updateServiceLevelAgreementAsync"></a>
# **updateServiceLevelAgreementAsync**
> Envelope updateServiceLevelAgreementAsync(serviceLevelAgreementId, tenantId, apiVersion, xApiVersion, serviceLevelAgreementUpdateDto)

Update a service level agreement

Updates an existing service level agreement.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelAgreementsApi()
val serviceLevelAgreementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceLevelAgreementUpdateDto : ServiceLevelAgreementUpdateDto =  // ServiceLevelAgreementUpdateDto | 
try {
    val result : Envelope = apiInstance.updateServiceLevelAgreementAsync(serviceLevelAgreementId, tenantId, apiVersion, xApiVersion, serviceLevelAgreementUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelAgreementsApi#updateServiceLevelAgreementAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelAgreementsApi#updateServiceLevelAgreementAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceLevelAgreementId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceLevelAgreementUpdateDto** | [**ServiceLevelAgreementUpdateDto**](ServiceLevelAgreementUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

