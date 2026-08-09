# ShiftsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShiftAsync**](ShiftsApi.md#createShiftAsync) | **POST** /api/v2/HrmsService/Shifts | Create a shift |
| [**deleteShiftAsync**](ShiftsApi.md#deleteShiftAsync) | **DELETE** /api/v2/HrmsService/Shifts/{shiftId} | Delete a shift |
| [**getShiftByIdAsync**](ShiftsApi.md#getShiftByIdAsync) | **GET** /api/v2/HrmsService/Shifts/{shiftId} | Get shift by ID |
| [**getShiftsAsync**](ShiftsApi.md#getShiftsAsync) | **GET** /api/v2/HrmsService/Shifts | Get shifts |
| [**getShiftsCountAsync**](ShiftsApi.md#getShiftsCountAsync) | **GET** /api/v2/HrmsService/Shifts/Count | Count shifts |
| [**patchShiftAsync**](ShiftsApi.md#patchShiftAsync) | **PATCH** /api/v2/HrmsService/Shifts/{shiftId} | Patch a shift |
| [**updateShiftAsync**](ShiftsApi.md#updateShiftAsync) | **PUT** /api/v2/HrmsService/Shifts/{shiftId} | Update a shift |


<a id="createShiftAsync"></a>
# **createShiftAsync**
> EmptyEnvelope createShiftAsync(tenantId, apiVersion, xApiVersion, shiftCreateDto)

Create a shift

Creates a new shift for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShiftsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shiftCreateDto : ShiftCreateDto =  // ShiftCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createShiftAsync(tenantId, apiVersion, xApiVersion, shiftCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShiftsApi#createShiftAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShiftsApi#createShiftAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shiftCreateDto** | [**ShiftCreateDto**](ShiftCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShiftAsync"></a>
# **deleteShiftAsync**
> EmptyEnvelope deleteShiftAsync(shiftId, tenantId, apiVersion, xApiVersion)

Delete a shift

Deletes a shift for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShiftsApi()
val shiftId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteShiftAsync(shiftId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShiftsApi#deleteShiftAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShiftsApi#deleteShiftAsync")
    e.printStackTrace()
}
```

### Parameters
| **shiftId** | **java.util.UUID**|  | |
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

<a id="getShiftByIdAsync"></a>
# **getShiftByIdAsync**
> ShiftDtoEnvelope getShiftByIdAsync(shiftId, tenantId, apiVersion, xApiVersion)

Get shift by ID

Retrieves a specific shift by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShiftsApi()
val shiftId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShiftDtoEnvelope = apiInstance.getShiftByIdAsync(shiftId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShiftsApi#getShiftByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShiftsApi#getShiftByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **shiftId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShiftDtoEnvelope**](ShiftDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShiftsAsync"></a>
# **getShiftsAsync**
> ShiftDtoListEnvelope getShiftsAsync(tenantId, apiVersion, xApiVersion, shiftDtoCollectionQueryParameters)

Get shifts

Retrieves shifts for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShiftsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shiftDtoCollectionQueryParameters : ShiftDtoCollectionQueryParameters =  // ShiftDtoCollectionQueryParameters | 
try {
    val result : ShiftDtoListEnvelope = apiInstance.getShiftsAsync(tenantId, apiVersion, xApiVersion, shiftDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShiftsApi#getShiftsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShiftsApi#getShiftsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shiftDtoCollectionQueryParameters** | [**ShiftDtoCollectionQueryParameters**](ShiftDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ShiftDtoListEnvelope**](ShiftDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getShiftsCountAsync"></a>
# **getShiftsCountAsync**
> Int32Envelope getShiftsCountAsync(tenantId, apiVersion, xApiVersion, shiftDtoCollectionQueryParameters)

Count shifts

Counts shifts for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShiftsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shiftDtoCollectionQueryParameters : ShiftDtoCollectionQueryParameters =  // ShiftDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getShiftsCountAsync(tenantId, apiVersion, xApiVersion, shiftDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShiftsApi#getShiftsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShiftsApi#getShiftsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shiftDtoCollectionQueryParameters** | [**ShiftDtoCollectionQueryParameters**](ShiftDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchShiftAsync"></a>
# **patchShiftAsync**
> EmptyEnvelope patchShiftAsync(shiftId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a shift

Partially updates an existing shift for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShiftsApi()
val shiftId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchShiftAsync(shiftId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShiftsApi#patchShiftAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShiftsApi#patchShiftAsync")
    e.printStackTrace()
}
```

### Parameters
| **shiftId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateShiftAsync"></a>
# **updateShiftAsync**
> EmptyEnvelope updateShiftAsync(shiftId, tenantId, apiVersion, xApiVersion, shiftUpdateDto)

Update a shift

Updates an existing shift for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShiftsApi()
val shiftId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shiftUpdateDto : ShiftUpdateDto =  // ShiftUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateShiftAsync(shiftId, tenantId, apiVersion, xApiVersion, shiftUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShiftsApi#updateShiftAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShiftsApi#updateShiftAsync")
    e.printStackTrace()
}
```

### Parameters
| **shiftId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shiftUpdateDto** | [**ShiftUpdateDto**](ShiftUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

