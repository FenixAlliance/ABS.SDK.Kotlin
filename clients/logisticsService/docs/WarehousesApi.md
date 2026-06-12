# WarehousesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWarehouseAsync**](WarehousesApi.md#createWarehouseAsync) | **POST** /api/v2/LogisticsService/Warehouses | Create a warehouse |
| [**deleteWarehouseAsync**](WarehousesApi.md#deleteWarehouseAsync) | **DELETE** /api/v2/LogisticsService/Warehouses/{warehouseId} | Delete a warehouse |
| [**getWarehouseByIdAsync**](WarehousesApi.md#getWarehouseByIdAsync) | **GET** /api/v2/LogisticsService/Warehouses/{warehouseId} | Get warehouse by ID |
| [**getWarehousesAsync**](WarehousesApi.md#getWarehousesAsync) | **GET** /api/v2/LogisticsService/Warehouses | Get all warehouses |
| [**getWarehousesCountAsync**](WarehousesApi.md#getWarehousesCountAsync) | **GET** /api/v2/LogisticsService/Warehouses/Count | Get warehouses count |
| [**patchWarehouseAsync**](WarehousesApi.md#patchWarehouseAsync) | **PATCH** /api/v2/LogisticsService/Warehouses/{warehouseId} | Patch a warehouse |
| [**updateWarehouseAsync**](WarehousesApi.md#updateWarehouseAsync) | **PUT** /api/v2/LogisticsService/Warehouses/{warehouseId} | Update a warehouse |


<a id="createWarehouseAsync"></a>
# **createWarehouseAsync**
> EmptyEnvelope createWarehouseAsync(tenantId, apiVersion, xApiVersion, warehouseCreateDto)

Create a warehouse

Creates a new warehouse.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarehousesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val warehouseCreateDto : WarehouseCreateDto =  // WarehouseCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWarehouseAsync(tenantId, apiVersion, xApiVersion, warehouseCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#createWarehouseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#createWarehouseAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **warehouseCreateDto** | [**WarehouseCreateDto**](WarehouseCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWarehouseAsync"></a>
# **deleteWarehouseAsync**
> EmptyEnvelope deleteWarehouseAsync(warehouseId, tenantId, apiVersion, xApiVersion)

Delete a warehouse

Deletes a warehouse.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarehousesApi()
val warehouseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWarehouseAsync(warehouseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#deleteWarehouseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#deleteWarehouseAsync")
    e.printStackTrace()
}
```

### Parameters
| **warehouseId** | **java.util.UUID**|  | |
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

<a id="getWarehouseByIdAsync"></a>
# **getWarehouseByIdAsync**
> WarehouseDtoEnvelope getWarehouseByIdAsync(warehouseId, tenantId, apiVersion, xApiVersion)

Get warehouse by ID

Retrieves a specific warehouse.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarehousesApi()
val warehouseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WarehouseDtoEnvelope = apiInstance.getWarehouseByIdAsync(warehouseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#getWarehouseByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#getWarehouseByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **warehouseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WarehouseDtoEnvelope**](WarehouseDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWarehousesAsync"></a>
# **getWarehousesAsync**
> WarehouseDtoListEnvelope getWarehousesAsync(tenantId, apiVersion, xApiVersion)

Get all warehouses

Retrieves all warehouses for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarehousesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WarehouseDtoListEnvelope = apiInstance.getWarehousesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#getWarehousesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#getWarehousesAsync")
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

[**WarehouseDtoListEnvelope**](WarehouseDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWarehousesCountAsync"></a>
# **getWarehousesCountAsync**
> Int32Envelope getWarehousesCountAsync(tenantId, apiVersion, xApiVersion)

Get warehouses count

Returns the count of warehouses.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarehousesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWarehousesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#getWarehousesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#getWarehousesCountAsync")
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

<a id="patchWarehouseAsync"></a>
# **patchWarehouseAsync**
> EmptyEnvelope patchWarehouseAsync(warehouseId, tenantId, apiVersion, xApiVersion, operation)

Patch a warehouse

Partially updates an existing warehouse using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarehousesApi()
val warehouseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWarehouseAsync(warehouseId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#patchWarehouseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#patchWarehouseAsync")
    e.printStackTrace()
}
```

### Parameters
| **warehouseId** | **java.util.UUID**|  | |
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

<a id="updateWarehouseAsync"></a>
# **updateWarehouseAsync**
> EmptyEnvelope updateWarehouseAsync(warehouseId, tenantId, apiVersion, xApiVersion, warehouseUpdateDto)

Update a warehouse

Updates an existing warehouse.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WarehousesApi()
val warehouseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val warehouseUpdateDto : WarehouseUpdateDto =  // WarehouseUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWarehouseAsync(warehouseId, tenantId, apiVersion, xApiVersion, warehouseUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#updateWarehouseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#updateWarehouseAsync")
    e.printStackTrace()
}
```

### Parameters
| **warehouseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **warehouseUpdateDto** | [**WarehouseUpdateDto**](WarehouseUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

