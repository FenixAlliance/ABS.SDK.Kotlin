# ServiceCasesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createServiceCaseAsync**](ServiceCasesApi.md#createServiceCaseAsync) | **POST** /api/v2/ServicesService/ServiceCases | Create a service case |
| [**deleteServiceCaseAsync**](ServiceCasesApi.md#deleteServiceCaseAsync) | **DELETE** /api/v2/ServicesService/ServiceCases/{serviceCaseId} | Delete a service case |
| [**getServiceCaseByIdAsync**](ServiceCasesApi.md#getServiceCaseByIdAsync) | **GET** /api/v2/ServicesService/ServiceCases/{serviceCaseId} | Get a service case by ID |
| [**getServiceCasesAsync**](ServiceCasesApi.md#getServiceCasesAsync) | **GET** /api/v2/ServicesService/ServiceCases | Get all service cases |
| [**getServiceCasesCountAsync**](ServiceCasesApi.md#getServiceCasesCountAsync) | **GET** /api/v2/ServicesService/ServiceCases/Count | Get service cases count |
| [**updateServiceCaseAsync**](ServiceCasesApi.md#updateServiceCaseAsync) | **PUT** /api/v2/ServicesService/ServiceCases/{serviceCaseId} | Update a service case |


<a id="createServiceCaseAsync"></a>
# **createServiceCaseAsync**
> Envelope createServiceCaseAsync(tenantId, apiVersion, xApiVersion, serviceCaseCreateDto)

Create a service case

Creates a new service case for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCasesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceCaseCreateDto : ServiceCaseCreateDto =  // ServiceCaseCreateDto | 
try {
    val result : Envelope = apiInstance.createServiceCaseAsync(tenantId, apiVersion, xApiVersion, serviceCaseCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCasesApi#createServiceCaseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCasesApi#createServiceCaseAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceCaseCreateDto** | [**ServiceCaseCreateDto**](ServiceCaseCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteServiceCaseAsync"></a>
# **deleteServiceCaseAsync**
> Envelope deleteServiceCaseAsync(serviceCaseId, tenantId, apiVersion, xApiVersion)

Delete a service case

Deletes a service case by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCasesApi()
val serviceCaseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteServiceCaseAsync(serviceCaseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCasesApi#deleteServiceCaseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCasesApi#deleteServiceCaseAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceCaseId** | **java.util.UUID**|  | |
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

<a id="getServiceCaseByIdAsync"></a>
# **getServiceCaseByIdAsync**
> ServiceCaseDtoEnvelope getServiceCaseByIdAsync(serviceCaseId, tenantId, apiVersion, xApiVersion)

Get a service case by ID

Retrieves a service case by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCasesApi()
val serviceCaseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceCaseDtoEnvelope = apiInstance.getServiceCaseByIdAsync(serviceCaseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCasesApi#getServiceCaseByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCasesApi#getServiceCaseByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceCaseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ServiceCaseDtoEnvelope**](ServiceCaseDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceCasesAsync"></a>
# **getServiceCasesAsync**
> ServiceCaseDtoIReadOnlyListEnvelope getServiceCasesAsync(tenantId, apiVersion, xApiVersion)

Get all service cases

Retrieves all service cases for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCasesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ServiceCaseDtoIReadOnlyListEnvelope = apiInstance.getServiceCasesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCasesApi#getServiceCasesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCasesApi#getServiceCasesAsync")
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

[**ServiceCaseDtoIReadOnlyListEnvelope**](ServiceCaseDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getServiceCasesCountAsync"></a>
# **getServiceCasesCountAsync**
> Int32Envelope getServiceCasesCountAsync(tenantId, apiVersion, xApiVersion)

Get service cases count

Returns the count of service cases for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCasesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getServiceCasesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCasesApi#getServiceCasesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCasesApi#getServiceCasesCountAsync")
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

<a id="updateServiceCaseAsync"></a>
# **updateServiceCaseAsync**
> Envelope updateServiceCaseAsync(serviceCaseId, tenantId, apiVersion, xApiVersion, serviceCaseUpdateDto)

Update a service case

Updates an existing service case.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ServiceCasesApi()
val serviceCaseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val serviceCaseUpdateDto : ServiceCaseUpdateDto =  // ServiceCaseUpdateDto | 
try {
    val result : Envelope = apiInstance.updateServiceCaseAsync(serviceCaseId, tenantId, apiVersion, xApiVersion, serviceCaseUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ServiceCasesApi#updateServiceCaseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ServiceCasesApi#updateServiceCaseAsync")
    e.printStackTrace()
}
```

### Parameters
| **serviceCaseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **serviceCaseUpdateDto** | [**ServiceCaseUpdateDto**](ServiceCaseUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

