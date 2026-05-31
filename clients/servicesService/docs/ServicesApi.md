# ServicesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createServiceAsync**](ServicesApi.md#createServiceAsync) | **POST** /api/v2/ServicesService/Services | Create a service |
| [**deleteServiceAsync**](ServicesApi.md#deleteServiceAsync) | **DELETE** /api/v2/ServicesService/Services/{serviceId} | Delete a service |
| [**getServiceByIdAsync**](ServicesApi.md#getServiceByIdAsync) | **GET** /api/v2/ServicesService/Services/{serviceId} | Get a service by ID |
| [**getServicesAsync**](ServicesApi.md#getServicesAsync) | **GET** /api/v2/ServicesService/Services | Get all services |
| [**getServicesCountAsync**](ServicesApi.md#getServicesCountAsync) | **GET** /api/v2/ServicesService/Services/Count | Get services count |
| [**updateServiceAsync**](ServicesApi.md#updateServiceAsync) | **PUT** /api/v2/ServicesService/Services/{serviceId} | Update a service |


<a id="createServiceAsync"></a>
# **createServiceAsync**
> Envelope createServiceAsync(tenantId, apiVersion, xApiVersion, serviceCreateDto)

Create a service

Creates a new service for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceCreateDto : ServiceCreateDto =  // ServiceCreateDto | 
try {
    val result : Envelope = apiInstance.createServiceAsync(tenantId, apiVersion, xApiVersion, serviceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServicesApi#createServiceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServicesApi#createServiceAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceCreateDto** | [**ServiceCreateDto**](ServiceCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteServiceAsync"></a>
# **deleteServiceAsync**
> Envelope deleteServiceAsync(serviceId, tenantId, apiVersion, xApiVersion)

Delete a service

Deletes a service by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServicesApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteServiceAsync(serviceId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServicesApi#deleteServiceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServicesApi#deleteServiceAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceId** | **java.util.UUID**|  | |
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

<a id="getServiceByIdAsync"></a>
# **getServiceByIdAsync**
> ServiceDtoEnvelope getServiceByIdAsync(serviceId, tenantId, apiVersion, xApiVersion)

Get a service by ID

Retrieves a service by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServicesApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceDtoEnvelope = apiInstance.getServiceByIdAsync(serviceId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServicesApi#getServiceByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServicesApi#getServiceByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ServiceDtoEnvelope**](ServiceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServicesAsync"></a>
# **getServicesAsync**
> ServiceDtoIReadOnlyListEnvelope getServicesAsync(tenantId, apiVersion, xApiVersion)

Get all services

Retrieves all services for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceDtoIReadOnlyListEnvelope = apiInstance.getServicesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServicesApi#getServicesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServicesApi#getServicesAsync")
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

[**ServiceDtoIReadOnlyListEnvelope**](ServiceDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServicesCountAsync"></a>
# **getServicesCountAsync**
> Int32Envelope getServicesCountAsync(tenantId, apiVersion, xApiVersion)

Get services count

Returns the count of services for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServicesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getServicesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServicesApi#getServicesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServicesApi#getServicesCountAsync")
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

<a id="updateServiceAsync"></a>
# **updateServiceAsync**
> Envelope updateServiceAsync(serviceId, tenantId, apiVersion, xApiVersion, serviceUpdateDto)

Update a service

Updates an existing service.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServicesApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceUpdateDto : ServiceUpdateDto =  // ServiceUpdateDto | 
try {
    val result : Envelope = apiInstance.updateServiceAsync(serviceId, tenantId, apiVersion, xApiVersion, serviceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServicesApi#updateServiceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServicesApi#updateServiceAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceUpdateDto** | [**ServiceUpdateDto**](ServiceUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

