# SupplierProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSupplierProfileAsync**](SupplierProfilesApi.md#createSupplierProfileAsync) | **POST** /api/v2/LogisticsService/SupplierProfiles | Create a supplier profile |
| [**deleteSupplierProfileAsync**](SupplierProfilesApi.md#deleteSupplierProfileAsync) | **DELETE** /api/v2/LogisticsService/SupplierProfiles/{supplierProfileId} | Delete a supplier profile |
| [**getSupplierProfileByIdAsync**](SupplierProfilesApi.md#getSupplierProfileByIdAsync) | **GET** /api/v2/LogisticsService/SupplierProfiles/{supplierProfileId} | Get supplier profile by ID |
| [**getSupplierProfilesAsync**](SupplierProfilesApi.md#getSupplierProfilesAsync) | **GET** /api/v2/LogisticsService/SupplierProfiles | Get all supplier profiles |
| [**getSupplierProfilesCountAsync**](SupplierProfilesApi.md#getSupplierProfilesCountAsync) | **GET** /api/v2/LogisticsService/SupplierProfiles/Count | Get supplier profiles count |
| [**patchSupplierProfileAsync**](SupplierProfilesApi.md#patchSupplierProfileAsync) | **PATCH** /api/v2/LogisticsService/SupplierProfiles/{supplierProfileId} | Patch a supplier profile |
| [**updateSupplierProfileAsync**](SupplierProfilesApi.md#updateSupplierProfileAsync) | **PUT** /api/v2/LogisticsService/SupplierProfiles/{supplierProfileId} | Update a supplier profile |


<a id="createSupplierProfileAsync"></a>
# **createSupplierProfileAsync**
> EmptyEnvelope createSupplierProfileAsync(tenantId, apiVersion, xApiVersion, supplierProfileCreateDto)

Create a supplier profile

Creates a new supplier profile for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supplierProfileCreateDto : SupplierProfileCreateDto =  // SupplierProfileCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSupplierProfileAsync(tenantId, apiVersion, xApiVersion, supplierProfileCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupplierProfilesApi#createSupplierProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierProfilesApi#createSupplierProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supplierProfileCreateDto** | [**SupplierProfileCreateDto**](SupplierProfileCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSupplierProfileAsync"></a>
# **deleteSupplierProfileAsync**
> EmptyEnvelope deleteSupplierProfileAsync(supplierProfileId, tenantId, apiVersion, xApiVersion)

Delete a supplier profile

Deletes a supplier profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierProfilesApi()
val supplierProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSupplierProfileAsync(supplierProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupplierProfilesApi#deleteSupplierProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierProfilesApi#deleteSupplierProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **supplierProfileId** | **java.util.UUID**|  | |
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

<a id="getSupplierProfileByIdAsync"></a>
# **getSupplierProfileByIdAsync**
> SupplierProfileDtoEnvelope getSupplierProfileByIdAsync(supplierProfileId, tenantId, apiVersion, xApiVersion)

Get supplier profile by ID

Retrieves a specific supplier profile by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierProfilesApi()
val supplierProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupplierProfileDtoEnvelope = apiInstance.getSupplierProfileByIdAsync(supplierProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupplierProfilesApi#getSupplierProfileByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierProfilesApi#getSupplierProfileByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **supplierProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupplierProfileDtoEnvelope**](SupplierProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupplierProfilesAsync"></a>
# **getSupplierProfilesAsync**
> SupplierProfileDtoListEnvelope getSupplierProfilesAsync(tenantId, apiVersion, xApiVersion)

Get all supplier profiles

Retrieves all supplier profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupplierProfileDtoListEnvelope = apiInstance.getSupplierProfilesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupplierProfilesApi#getSupplierProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierProfilesApi#getSupplierProfilesAsync")
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

[**SupplierProfileDtoListEnvelope**](SupplierProfileDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupplierProfilesCountAsync"></a>
# **getSupplierProfilesCountAsync**
> Int32Envelope getSupplierProfilesCountAsync(tenantId, apiVersion, xApiVersion)

Get supplier profiles count

Returns the count of supplier profiles for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSupplierProfilesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupplierProfilesApi#getSupplierProfilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierProfilesApi#getSupplierProfilesCountAsync")
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

<a id="patchSupplierProfileAsync"></a>
# **patchSupplierProfileAsync**
> EmptyEnvelope patchSupplierProfileAsync(supplierProfileId, tenantId, apiVersion, xApiVersion, operation)

Patch a supplier profile

Applies a JSON Patch document to a supplier profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierProfilesApi()
val supplierProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSupplierProfileAsync(supplierProfileId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupplierProfilesApi#patchSupplierProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierProfilesApi#patchSupplierProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **supplierProfileId** | **java.util.UUID**|  | |
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

<a id="updateSupplierProfileAsync"></a>
# **updateSupplierProfileAsync**
> EmptyEnvelope updateSupplierProfileAsync(supplierProfileId, tenantId, apiVersion, xApiVersion, supplierProfileUpdateDto)

Update a supplier profile

Updates an existing supplier profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupplierProfilesApi()
val supplierProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supplierProfileUpdateDto : SupplierProfileUpdateDto =  // SupplierProfileUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSupplierProfileAsync(supplierProfileId, tenantId, apiVersion, xApiVersion, supplierProfileUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupplierProfilesApi#updateSupplierProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupplierProfilesApi#updateSupplierProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **supplierProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supplierProfileUpdateDto** | [**SupplierProfileUpdateDto**](SupplierProfileUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

