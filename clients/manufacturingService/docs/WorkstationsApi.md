# WorkstationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWorkstationAsync**](WorkstationsApi.md#createWorkstationAsync) | **POST** /api/v2/ManufacturingService/Workstations | Create a new workstation |
| [**deleteWorkstationAsync**](WorkstationsApi.md#deleteWorkstationAsync) | **DELETE** /api/v2/ManufacturingService/Workstations/{id} | Delete a workstation |
| [**getWorkstationByIdAsync**](WorkstationsApi.md#getWorkstationByIdAsync) | **GET** /api/v2/ManufacturingService/Workstations/{id} | Get workstation by ID |
| [**getWorkstationsAsync**](WorkstationsApi.md#getWorkstationsAsync) | **GET** /api/v2/ManufacturingService/Workstations | Get all workstations |
| [**getWorkstationsCountAsync**](WorkstationsApi.md#getWorkstationsCountAsync) | **GET** /api/v2/ManufacturingService/Workstations/Count | Get workstations count |
| [**patchWorkstationAsync**](WorkstationsApi.md#patchWorkstationAsync) | **PATCH** /api/v2/ManufacturingService/Workstations/{id} | Patch a workstation |
| [**updateWorkstationAsync**](WorkstationsApi.md#updateWorkstationAsync) | **PUT** /api/v2/ManufacturingService/Workstations/{id} | Update a workstation |


<a id="createWorkstationAsync"></a>
# **createWorkstationAsync**
> createWorkstationAsync(tenantId, apiVersion, xApiVersion, workstationCreateDto)

Create a new workstation

Creates a new workstation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkstationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workstationCreateDto : WorkstationCreateDto =  // WorkstationCreateDto | 
try {
    apiInstance.createWorkstationAsync(tenantId, apiVersion, xApiVersion, workstationCreateDto)
} catch (e: ClientException) {
    println("4xx response calling WorkstationsApi#createWorkstationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkstationsApi#createWorkstationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workstationCreateDto** | [**WorkstationCreateDto**](WorkstationCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWorkstationAsync"></a>
# **deleteWorkstationAsync**
> deleteWorkstationAsync(id, tenantId, apiVersion, xApiVersion)

Delete a workstation

Deletes a workstation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkstationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteWorkstationAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WorkstationsApi#deleteWorkstationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkstationsApi#deleteWorkstationAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkstationByIdAsync"></a>
# **getWorkstationByIdAsync**
> WorkstationDto getWorkstationByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get workstation by ID

Retrieves a specific workstation by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkstationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WorkstationDto = apiInstance.getWorkstationByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkstationsApi#getWorkstationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkstationsApi#getWorkstationByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WorkstationDto**](WorkstationDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkstationsAsync"></a>
# **getWorkstationsAsync**
> WorkstationDtoListEnvelope getWorkstationsAsync(tenantId, apiVersion, xApiVersion)

Get all workstations

Retrieves all workstations for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkstationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WorkstationDtoListEnvelope = apiInstance.getWorkstationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkstationsApi#getWorkstationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkstationsApi#getWorkstationsAsync")
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

[**WorkstationDtoListEnvelope**](WorkstationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWorkstationsCountAsync"></a>
# **getWorkstationsCountAsync**
> Int32Envelope getWorkstationsCountAsync(tenantId, apiVersion, xApiVersion)

Get workstations count

Returns the count of workstations for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkstationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWorkstationsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkstationsApi#getWorkstationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkstationsApi#getWorkstationsCountAsync")
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

<a id="patchWorkstationAsync"></a>
# **patchWorkstationAsync**
> EmptyEnvelope patchWorkstationAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a workstation

Patch a workstation

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkstationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWorkstationAsync(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WorkstationsApi#patchWorkstationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkstationsApi#patchWorkstationAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateWorkstationAsync"></a>
# **updateWorkstationAsync**
> updateWorkstationAsync(id, tenantId, apiVersion, xApiVersion, workstationUpdateDto)

Update a workstation

Updates an existing workstation for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WorkstationsApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val workstationUpdateDto : WorkstationUpdateDto =  // WorkstationUpdateDto | 
try {
    apiInstance.updateWorkstationAsync(id, tenantId, apiVersion, xApiVersion, workstationUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling WorkstationsApi#updateWorkstationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WorkstationsApi#updateWorkstationAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **workstationUpdateDto** | [**WorkstationUpdateDto**](WorkstationUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

