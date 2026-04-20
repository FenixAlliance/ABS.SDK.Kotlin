# ServiceCaseTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createServiceCaseTypeAsync**](ServiceCaseTypesApi.md#createServiceCaseTypeAsync) | **POST** /api/v2/ServicesService/ServiceCaseTypes | Create a service case type |
| [**deleteServiceCaseTypeAsync**](ServiceCaseTypesApi.md#deleteServiceCaseTypeAsync) | **DELETE** /api/v2/ServicesService/ServiceCaseTypes/{serviceCaseTypeId} | Delete a service case type |
| [**getServiceCaseTypeByIdAsync**](ServiceCaseTypesApi.md#getServiceCaseTypeByIdAsync) | **GET** /api/v2/ServicesService/ServiceCaseTypes/{serviceCaseTypeId} | Get a service case type by ID |
| [**getServiceCaseTypesAsync**](ServiceCaseTypesApi.md#getServiceCaseTypesAsync) | **GET** /api/v2/ServicesService/ServiceCaseTypes | Get all service case types |
| [**getServiceCaseTypesCountAsync**](ServiceCaseTypesApi.md#getServiceCaseTypesCountAsync) | **GET** /api/v2/ServicesService/ServiceCaseTypes/Count | Get service case types count |
| [**updateServiceCaseTypeAsync**](ServiceCaseTypesApi.md#updateServiceCaseTypeAsync) | **PUT** /api/v2/ServicesService/ServiceCaseTypes/{serviceCaseTypeId} | Update a service case type |


<a id="createServiceCaseTypeAsync"></a>
# **createServiceCaseTypeAsync**
> Envelope createServiceCaseTypeAsync(tenantId, apiVersion, xApiVersion, serviceCaseTypeCreateDto)

Create a service case type

Creates a new service case type for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCaseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceCaseTypeCreateDto : ServiceCaseTypeCreateDto =  // ServiceCaseTypeCreateDto | 
try {
    val result : Envelope = apiInstance.createServiceCaseTypeAsync(tenantId, apiVersion, xApiVersion, serviceCaseTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCaseTypesApi#createServiceCaseTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCaseTypesApi#createServiceCaseTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceCaseTypeCreateDto** | [**ServiceCaseTypeCreateDto**](ServiceCaseTypeCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteServiceCaseTypeAsync"></a>
# **deleteServiceCaseTypeAsync**
> Envelope deleteServiceCaseTypeAsync(serviceCaseTypeId, tenantId, apiVersion, xApiVersion)

Delete a service case type

Deletes a service case type by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCaseTypesApi()
val serviceCaseTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteServiceCaseTypeAsync(serviceCaseTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCaseTypesApi#deleteServiceCaseTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCaseTypesApi#deleteServiceCaseTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceCaseTypeId** | **java.util.UUID**|  | |
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

<a id="getServiceCaseTypeByIdAsync"></a>
# **getServiceCaseTypeByIdAsync**
> ServiceCaseTypeDtoEnvelope getServiceCaseTypeByIdAsync(serviceCaseTypeId, tenantId, apiVersion, xApiVersion)

Get a service case type by ID

Retrieves a service case type by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCaseTypesApi()
val serviceCaseTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceCaseTypeDtoEnvelope = apiInstance.getServiceCaseTypeByIdAsync(serviceCaseTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCaseTypesApi#getServiceCaseTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCaseTypesApi#getServiceCaseTypeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceCaseTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ServiceCaseTypeDtoEnvelope**](ServiceCaseTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceCaseTypesAsync"></a>
# **getServiceCaseTypesAsync**
> ServiceCaseTypeDtoIReadOnlyListEnvelope getServiceCaseTypesAsync(tenantId, apiVersion, xApiVersion)

Get all service case types

Retrieves all service case types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCaseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceCaseTypeDtoIReadOnlyListEnvelope = apiInstance.getServiceCaseTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCaseTypesApi#getServiceCaseTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCaseTypesApi#getServiceCaseTypesAsync")
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

[**ServiceCaseTypeDtoIReadOnlyListEnvelope**](ServiceCaseTypeDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceCaseTypesCountAsync"></a>
# **getServiceCaseTypesCountAsync**
> Int32Envelope getServiceCaseTypesCountAsync(tenantId, apiVersion, xApiVersion)

Get service case types count

Returns the count of service case types for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCaseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getServiceCaseTypesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCaseTypesApi#getServiceCaseTypesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCaseTypesApi#getServiceCaseTypesCountAsync")
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

<a id="updateServiceCaseTypeAsync"></a>
# **updateServiceCaseTypeAsync**
> Envelope updateServiceCaseTypeAsync(serviceCaseTypeId, tenantId, apiVersion, xApiVersion, serviceCaseTypeUpdateDto)

Update a service case type

Updates an existing service case type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCaseTypesApi()
val serviceCaseTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceCaseTypeUpdateDto : ServiceCaseTypeUpdateDto =  // ServiceCaseTypeUpdateDto | 
try {
    val result : Envelope = apiInstance.updateServiceCaseTypeAsync(serviceCaseTypeId, tenantId, apiVersion, xApiVersion, serviceCaseTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCaseTypesApi#updateServiceCaseTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCaseTypesApi#updateServiceCaseTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceCaseTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceCaseTypeUpdateDto** | [**ServiceCaseTypeUpdateDto**](ServiceCaseTypeUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

