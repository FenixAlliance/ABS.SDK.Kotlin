# ServiceQueuesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createServiceQueueAsync**](ServiceQueuesApi.md#createServiceQueueAsync) | **POST** /api/v2/ServicesService/ServiceQueues | Create a service queue |
| [**deleteServiceQueueAsync**](ServiceQueuesApi.md#deleteServiceQueueAsync) | **DELETE** /api/v2/ServicesService/ServiceQueues/{serviceQueueId} | Delete a service queue |
| [**getServiceQueueByIdAsync**](ServiceQueuesApi.md#getServiceQueueByIdAsync) | **GET** /api/v2/ServicesService/ServiceQueues/{serviceQueueId} | Get a service queue by ID |
| [**getServiceQueuesAsync**](ServiceQueuesApi.md#getServiceQueuesAsync) | **GET** /api/v2/ServicesService/ServiceQueues | Get all service queues |
| [**getServiceQueuesCountAsync**](ServiceQueuesApi.md#getServiceQueuesCountAsync) | **GET** /api/v2/ServicesService/ServiceQueues/Count | Get service queues count |
| [**updateServiceQueueAsync**](ServiceQueuesApi.md#updateServiceQueueAsync) | **PUT** /api/v2/ServicesService/ServiceQueues/{serviceQueueId} | Update a service queue |


<a id="createServiceQueueAsync"></a>
# **createServiceQueueAsync**
> Envelope createServiceQueueAsync(tenantId, apiVersion, xApiVersion, serviceQueueCreateDto)

Create a service queue

Creates a new service queue for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceQueuesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceQueueCreateDto : ServiceQueueCreateDto =  // ServiceQueueCreateDto | 
try {
    val result : Envelope = apiInstance.createServiceQueueAsync(tenantId, apiVersion, xApiVersion, serviceQueueCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceQueuesApi#createServiceQueueAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceQueuesApi#createServiceQueueAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceQueueCreateDto** | [**ServiceQueueCreateDto**](ServiceQueueCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteServiceQueueAsync"></a>
# **deleteServiceQueueAsync**
> Envelope deleteServiceQueueAsync(serviceQueueId, tenantId, apiVersion, xApiVersion)

Delete a service queue

Deletes a service queue by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceQueuesApi()
val serviceQueueId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteServiceQueueAsync(serviceQueueId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceQueuesApi#deleteServiceQueueAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceQueuesApi#deleteServiceQueueAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceQueueId** | **java.util.UUID**|  | |
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

<a id="getServiceQueueByIdAsync"></a>
# **getServiceQueueByIdAsync**
> ServiceQueueDtoEnvelope getServiceQueueByIdAsync(serviceQueueId, tenantId, apiVersion, xApiVersion)

Get a service queue by ID

Retrieves a service queue by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceQueuesApi()
val serviceQueueId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceQueueDtoEnvelope = apiInstance.getServiceQueueByIdAsync(serviceQueueId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceQueuesApi#getServiceQueueByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceQueuesApi#getServiceQueueByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceQueueId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ServiceQueueDtoEnvelope**](ServiceQueueDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceQueuesAsync"></a>
# **getServiceQueuesAsync**
> ServiceQueueDtoIReadOnlyListEnvelope getServiceQueuesAsync(tenantId, apiVersion, xApiVersion)

Get all service queues

Retrieves all service queues for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceQueuesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceQueueDtoIReadOnlyListEnvelope = apiInstance.getServiceQueuesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceQueuesApi#getServiceQueuesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceQueuesApi#getServiceQueuesAsync")
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

[**ServiceQueueDtoIReadOnlyListEnvelope**](ServiceQueueDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceQueuesCountAsync"></a>
# **getServiceQueuesCountAsync**
> Int32Envelope getServiceQueuesCountAsync(tenantId, apiVersion, xApiVersion)

Get service queues count

Returns the count of service queues for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceQueuesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getServiceQueuesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceQueuesApi#getServiceQueuesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceQueuesApi#getServiceQueuesCountAsync")
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

<a id="updateServiceQueueAsync"></a>
# **updateServiceQueueAsync**
> Envelope updateServiceQueueAsync(serviceQueueId, tenantId, apiVersion, xApiVersion, serviceQueueUpdateDto)

Update a service queue

Updates an existing service queue.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceQueuesApi()
val serviceQueueId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceQueueUpdateDto : ServiceQueueUpdateDto =  // ServiceQueueUpdateDto | 
try {
    val result : Envelope = apiInstance.updateServiceQueueAsync(serviceQueueId, tenantId, apiVersion, xApiVersion, serviceQueueUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceQueuesApi#updateServiceQueueAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceQueuesApi#updateServiceQueueAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceQueueId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceQueueUpdateDto** | [**ServiceQueueUpdateDto**](ServiceQueueUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

