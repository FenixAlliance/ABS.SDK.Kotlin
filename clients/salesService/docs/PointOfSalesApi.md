# PointOfSalesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countPointOfSalesAsync**](PointOfSalesApi.md#countPointOfSalesAsync) | **GET** /api/v2/SalesService/PointOfSales/Count | Get point of sales count |
| [**createPointOfSaleAsync**](PointOfSalesApi.md#createPointOfSaleAsync) | **POST** /api/v2/SalesService/PointOfSales | Create a point of sale |
| [**deletePointOfSaleAsync**](PointOfSalesApi.md#deletePointOfSaleAsync) | **DELETE** /api/v2/SalesService/PointOfSales/{pointOfSaleId} | Delete a point of sale |
| [**getPointOfSaleAsync**](PointOfSalesApi.md#getPointOfSaleAsync) | **GET** /api/v2/SalesService/PointOfSales/{pointOfSaleId} | Get point of sale by ID |
| [**getPointOfSalesAsync**](PointOfSalesApi.md#getPointOfSalesAsync) | **GET** /api/v2/SalesService/PointOfSales | Get point of sales |
| [**patchPointOfSaleAsync**](PointOfSalesApi.md#patchPointOfSaleAsync) | **PATCH** /api/v2/SalesService/PointOfSales/{pointOfSaleId} | Patch a point of sale |
| [**updatePointOfSaleAsync**](PointOfSalesApi.md#updatePointOfSaleAsync) | **PUT** /api/v2/SalesService/PointOfSales/{pointOfSaleId} | Update a point of sale |


<a id="countPointOfSalesAsync"></a>
# **countPointOfSalesAsync**
> Int32Envelope countPointOfSalesAsync(tenantId, pointOfSaleDtoCollectionQueryParameters)

Get point of sales count

Returns the total count of point of sales for the specified tenant with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PointOfSalesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val pointOfSaleDtoCollectionQueryParameters : PointOfSaleDtoCollectionQueryParameters =  // PointOfSaleDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.countPointOfSalesAsync(tenantId, pointOfSaleDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PointOfSalesApi#countPointOfSalesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PointOfSalesApi#countPointOfSalesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pointOfSaleDtoCollectionQueryParameters** | [**PointOfSaleDtoCollectionQueryParameters**](PointOfSaleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createPointOfSaleAsync"></a>
# **createPointOfSaleAsync**
> EmptyEnvelope createPointOfSaleAsync(tenantId, pointOfSaleCreateDto)

Create a point of sale

Creates a new point of sale for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PointOfSalesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val pointOfSaleCreateDto : PointOfSaleCreateDto =  // PointOfSaleCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createPointOfSaleAsync(tenantId, pointOfSaleCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PointOfSalesApi#createPointOfSaleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PointOfSalesApi#createPointOfSaleAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pointOfSaleCreateDto** | [**PointOfSaleCreateDto**](PointOfSaleCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePointOfSaleAsync"></a>
# **deletePointOfSaleAsync**
> EmptyEnvelope deletePointOfSaleAsync(pointOfSaleId, tenantId)

Delete a point of sale

Deletes an existing point of sale by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PointOfSalesApi()
val pointOfSaleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deletePointOfSaleAsync(pointOfSaleId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PointOfSalesApi#deletePointOfSaleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PointOfSalesApi#deletePointOfSaleAsync")
    e.printStackTrace()
}
```

### Parameters
| **pointOfSaleId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPointOfSaleAsync"></a>
# **getPointOfSaleAsync**
> PointOfSaleDtoEnvelope getPointOfSaleAsync(pointOfSaleId, tenantId)

Get point of sale by ID

Retrieves a single point of sale by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PointOfSalesApi()
val pointOfSaleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : PointOfSaleDtoEnvelope = apiInstance.getPointOfSaleAsync(pointOfSaleId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PointOfSalesApi#getPointOfSaleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PointOfSalesApi#getPointOfSaleAsync")
    e.printStackTrace()
}
```

### Parameters
| **pointOfSaleId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**PointOfSaleDtoEnvelope**](PointOfSaleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPointOfSalesAsync"></a>
# **getPointOfSalesAsync**
> PointOfSaleDtoListEnvelope getPointOfSalesAsync(tenantId, pointOfSaleDtoCollectionQueryParameters)

Get point of sales

Retrieves a list of point of sales for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PointOfSalesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val pointOfSaleDtoCollectionQueryParameters : PointOfSaleDtoCollectionQueryParameters =  // PointOfSaleDtoCollectionQueryParameters | 
try {
    val result : PointOfSaleDtoListEnvelope = apiInstance.getPointOfSalesAsync(tenantId, pointOfSaleDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PointOfSalesApi#getPointOfSalesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PointOfSalesApi#getPointOfSalesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pointOfSaleDtoCollectionQueryParameters** | [**PointOfSaleDtoCollectionQueryParameters**](PointOfSaleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**PointOfSaleDtoListEnvelope**](PointOfSaleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchPointOfSaleAsync"></a>
# **patchPointOfSaleAsync**
> EmptyEnvelope patchPointOfSaleAsync(pointOfSaleId, tenantId, patchOperation)

Patch a point of sale

Partially updates an existing point of sale using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PointOfSalesApi()
val pointOfSaleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchPointOfSaleAsync(pointOfSaleId, tenantId, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PointOfSalesApi#patchPointOfSaleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PointOfSalesApi#patchPointOfSaleAsync")
    e.printStackTrace()
}
```

### Parameters
| **pointOfSaleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="updatePointOfSaleAsync"></a>
# **updatePointOfSaleAsync**
> EmptyEnvelope updatePointOfSaleAsync(pointOfSaleId, tenantId, pointOfSaleUpdateDto)

Update a point of sale

Updates an existing point of sale by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PointOfSalesApi()
val pointOfSaleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val pointOfSaleUpdateDto : PointOfSaleUpdateDto =  // PointOfSaleUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updatePointOfSaleAsync(pointOfSaleId, tenantId, pointOfSaleUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PointOfSalesApi#updatePointOfSaleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PointOfSalesApi#updatePointOfSaleAsync")
    e.printStackTrace()
}
```

### Parameters
| **pointOfSaleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pointOfSaleUpdateDto** | [**PointOfSaleUpdateDto**](PointOfSaleUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

