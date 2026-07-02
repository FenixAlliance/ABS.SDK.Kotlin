# ShippingClassesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShippingClassAsync**](ShippingClassesApi.md#createShippingClassAsync) | **POST** /api/v2/ShipmentsService/ShippingClasses | Create a shipping class |
| [**deleteShippingClassAsync**](ShippingClassesApi.md#deleteShippingClassAsync) | **DELETE** /api/v2/ShipmentsService/ShippingClasses/{classId} | Delete a shipping class |
| [**getShippingClassByIdAsync**](ShippingClassesApi.md#getShippingClassByIdAsync) | **GET** /api/v2/ShipmentsService/ShippingClasses/{classId} | Get shipping class by ID |
| [**getShippingClassesAsync**](ShippingClassesApi.md#getShippingClassesAsync) | **GET** /api/v2/ShipmentsService/ShippingClasses | Get all shipping classes |
| [**getShippingClassesCountAsync**](ShippingClassesApi.md#getShippingClassesCountAsync) | **GET** /api/v2/ShipmentsService/ShippingClasses/Count | Get shipping classes count |
| [**patchShippingClassAsync**](ShippingClassesApi.md#patchShippingClassAsync) | **PATCH** /api/v2/ShipmentsService/ShippingClasses/{classId} | Patch a shipping class |
| [**updateShippingClassAsync**](ShippingClassesApi.md#updateShippingClassAsync) | **PUT** /api/v2/ShipmentsService/ShippingClasses/{classId} | Update a shipping class |


<a id="createShippingClassAsync"></a>
# **createShippingClassAsync**
> createShippingClassAsync(tenantId, apiVersion, xApiVersion, shippingClassCreateDto)

Create a shipping class

Creates a new shipping class.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingClassesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingClassCreateDto : ShippingClassCreateDto =  // ShippingClassCreateDto | 
try {
    apiInstance.createShippingClassAsync(tenantId, apiVersion, xApiVersion, shippingClassCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingClassesApi#createShippingClassAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingClassesApi#createShippingClassAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingClassCreateDto** | [**ShippingClassCreateDto**](ShippingClassCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShippingClassAsync"></a>
# **deleteShippingClassAsync**
> deleteShippingClassAsync(classId, tenantId, apiVersion, xApiVersion)

Delete a shipping class

Deletes a shipping class.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingClassesApi()
val classId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShippingClassAsync(classId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ShippingClassesApi#deleteShippingClassAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingClassesApi#deleteShippingClassAsync")
    e.printStackTrace()
}
```

### Parameters
| **classId** | **java.util.UUID**|  | |
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

<a id="getShippingClassByIdAsync"></a>
# **getShippingClassByIdAsync**
> ShippingClassDtoEnvelope getShippingClassByIdAsync(classId, tenantId, apiVersion, xApiVersion)

Get shipping class by ID

Retrieves a specific shipping class.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingClassesApi()
val classId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingClassDtoEnvelope = apiInstance.getShippingClassByIdAsync(classId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingClassesApi#getShippingClassByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingClassesApi#getShippingClassByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **classId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShippingClassDtoEnvelope**](ShippingClassDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingClassesAsync"></a>
# **getShippingClassesAsync**
> ShippingClassDtoListEnvelope getShippingClassesAsync(tenantId, apiVersion, xApiVersion)

Get all shipping classes

Retrieves all shipping classes for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingClassesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShippingClassDtoListEnvelope = apiInstance.getShippingClassesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingClassesApi#getShippingClassesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingClassesApi#getShippingClassesAsync")
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

[**ShippingClassDtoListEnvelope**](ShippingClassDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShippingClassesCountAsync"></a>
# **getShippingClassesCountAsync**
> Int32Envelope getShippingClassesCountAsync(tenantId, apiVersion, xApiVersion)

Get shipping classes count

Returns the count of shipping classes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingClassesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShippingClassesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingClassesApi#getShippingClassesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingClassesApi#getShippingClassesCountAsync")
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

<a id="patchShippingClassAsync"></a>
# **patchShippingClassAsync**
> EmptyEnvelope patchShippingClassAsync(classId, tenantId, apiVersion, xApiVersion, operation)

Patch a shipping class

Partially updates an existing shipping class using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingClassesApi()
val classId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchShippingClassAsync(classId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ShippingClassesApi#patchShippingClassAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingClassesApi#patchShippingClassAsync")
    e.printStackTrace()
}
```

### Parameters
| **classId** | **java.util.UUID**|  | |
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

<a id="updateShippingClassAsync"></a>
# **updateShippingClassAsync**
> updateShippingClassAsync(classId, tenantId, apiVersion, xApiVersion, shippingClassUpdateDto)

Update a shipping class

Updates an existing shipping class.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ShippingClassesApi()
val classId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shippingClassUpdateDto : ShippingClassUpdateDto =  // ShippingClassUpdateDto | 
try {
    apiInstance.updateShippingClassAsync(classId, tenantId, apiVersion, xApiVersion, shippingClassUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ShippingClassesApi#updateShippingClassAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ShippingClassesApi#updateShippingClassAsync")
    e.printStackTrace()
}
```

### Parameters
| **classId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shippingClassUpdateDto** | [**ShippingClassUpdateDto**](ShippingClassUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

