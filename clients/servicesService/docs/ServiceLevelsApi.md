# ServiceLevelsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countAllServiceLevelsAsync**](ServiceLevelsApi.md#countAllServiceLevelsAsync) | **GET** /api/v2/ServicesService/ServiceLevels/Count | Get all service levels count |
| [**createServiceLevelAsync**](ServiceLevelsApi.md#createServiceLevelAsync) | **POST** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels | Create a service level |
| [**deleteServiceLevelAsync**](ServiceLevelsApi.md#deleteServiceLevelAsync) | **DELETE** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels/{serviceLevelId} | Delete a service level |
| [**getAllServiceLevelsAsync**](ServiceLevelsApi.md#getAllServiceLevelsAsync) | **GET** /api/v2/ServicesService/ServiceLevels | Get all service levels |
| [**getServiceLevelByIdAsync**](ServiceLevelsApi.md#getServiceLevelByIdAsync) | **GET** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels/{serviceLevelId} | Get a service level by ID |
| [**getServiceLevelsAsync**](ServiceLevelsApi.md#getServiceLevelsAsync) | **GET** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels | Get all service levels |
| [**getServiceLevelsCountAsync**](ServiceLevelsApi.md#getServiceLevelsCountAsync) | **GET** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels/Count | Get service levels count |
| [**updateServiceLevelAsync**](ServiceLevelsApi.md#updateServiceLevelAsync) | **PUT** /api/v2/ServicesService/Services/{serviceId}/ServiceLevels/{serviceLevelId} | Update a service level |


<a id="countAllServiceLevelsAsync"></a>
# **countAllServiceLevelsAsync**
> Int32Envelope countAllServiceLevelsAsync(tenantId, apiVersion, xApiVersion)

Get all service levels count

Returns the count of all service levels for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countAllServiceLevelsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelsApi#countAllServiceLevelsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelsApi#countAllServiceLevelsAsync")
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

<a id="createServiceLevelAsync"></a>
# **createServiceLevelAsync**
> Envelope createServiceLevelAsync(serviceId, tenantId, apiVersion, xApiVersion, serviceLevelCreateDto)

Create a service level

Creates a new service level for the specified service.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelsApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceLevelCreateDto : ServiceLevelCreateDto =  // ServiceLevelCreateDto | 
try {
    val result : Envelope = apiInstance.createServiceLevelAsync(serviceId, tenantId, apiVersion, xApiVersion, serviceLevelCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelsApi#createServiceLevelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelsApi#createServiceLevelAsync")
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
| **serviceLevelCreateDto** | [**ServiceLevelCreateDto**](ServiceLevelCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteServiceLevelAsync"></a>
# **deleteServiceLevelAsync**
> Envelope deleteServiceLevelAsync(serviceId, serviceLevelId, tenantId, apiVersion, xApiVersion)

Delete a service level

Deletes a service level by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelsApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceLevelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteServiceLevelAsync(serviceId, serviceLevelId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelsApi#deleteServiceLevelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelsApi#deleteServiceLevelAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceId** | **java.util.UUID**|  | |
| **serviceLevelId** | **java.util.UUID**|  | |
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

<a id="getAllServiceLevelsAsync"></a>
# **getAllServiceLevelsAsync**
> ServiceLevelDtoIReadOnlyListEnvelope getAllServiceLevelsAsync(tenantId, apiVersion, xApiVersion)

Get all service levels

Retrieves all service levels for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceLevelDtoIReadOnlyListEnvelope = apiInstance.getAllServiceLevelsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelsApi#getAllServiceLevelsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelsApi#getAllServiceLevelsAsync")
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

[**ServiceLevelDtoIReadOnlyListEnvelope**](ServiceLevelDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceLevelByIdAsync"></a>
# **getServiceLevelByIdAsync**
> ServiceLevelDtoEnvelope getServiceLevelByIdAsync(serviceId, serviceLevelId, tenantId, apiVersion, xApiVersion)

Get a service level by ID

Retrieves a service level by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelsApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceLevelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceLevelDtoEnvelope = apiInstance.getServiceLevelByIdAsync(serviceId, serviceLevelId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelsApi#getServiceLevelByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelsApi#getServiceLevelByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceId** | **java.util.UUID**|  | |
| **serviceLevelId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ServiceLevelDtoEnvelope**](ServiceLevelDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceLevelsAsync"></a>
# **getServiceLevelsAsync**
> ServiceLevelDtoIReadOnlyListEnvelope getServiceLevelsAsync(serviceId, tenantId, apiVersion, xApiVersion)

Get all service levels

Retrieves all service levels for the specified service.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelsApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceLevelDtoIReadOnlyListEnvelope = apiInstance.getServiceLevelsAsync(serviceId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelsApi#getServiceLevelsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelsApi#getServiceLevelsAsync")
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

[**ServiceLevelDtoIReadOnlyListEnvelope**](ServiceLevelDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceLevelsCountAsync"></a>
# **getServiceLevelsCountAsync**
> Int32Envelope getServiceLevelsCountAsync(serviceId, tenantId, apiVersion, xApiVersion)

Get service levels count

Returns the count of service levels for the specified service.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelsApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getServiceLevelsCountAsync(serviceId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelsApi#getServiceLevelsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelsApi#getServiceLevelsCountAsync")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateServiceLevelAsync"></a>
# **updateServiceLevelAsync**
> Envelope updateServiceLevelAsync(serviceId, serviceLevelId, tenantId, apiVersion, xApiVersion, serviceLevelUpdateDto)

Update a service level

Updates an existing service level.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceLevelsApi()
val serviceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val serviceLevelId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceLevelUpdateDto : ServiceLevelUpdateDto =  // ServiceLevelUpdateDto | 
try {
    val result : Envelope = apiInstance.updateServiceLevelAsync(serviceId, serviceLevelId, tenantId, apiVersion, xApiVersion, serviceLevelUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceLevelsApi#updateServiceLevelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceLevelsApi#updateServiceLevelAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceId** | **java.util.UUID**|  | |
| **serviceLevelId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceLevelUpdateDto** | [**ServiceLevelUpdateDto**](ServiceLevelUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

