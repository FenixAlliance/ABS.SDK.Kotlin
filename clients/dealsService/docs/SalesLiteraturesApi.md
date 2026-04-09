# SalesLiteraturesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countSalesLiteraturesAsync**](SalesLiteraturesApi.md#countSalesLiteraturesAsync) | **GET** /api/v2/DealsService/SalesLiteratures/Count | Get sales literatures count |
| [**createSalesLiteratureAsync**](SalesLiteraturesApi.md#createSalesLiteratureAsync) | **POST** /api/v2/DealsService/SalesLiteratures | Create a sales literature |
| [**deleteSalesLiteratureAsync**](SalesLiteraturesApi.md#deleteSalesLiteratureAsync) | **DELETE** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} | Delete a sales literature |
| [**getExtendedSalesLiteraturesAsync**](SalesLiteraturesApi.md#getExtendedSalesLiteraturesAsync) | **GET** /api/v2/DealsService/SalesLiteratures/Extended | Get extended sales literatures |
| [**getSalesLiteratureAsync**](SalesLiteraturesApi.md#getSalesLiteratureAsync) | **GET** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} | Get sales literature by ID |
| [**getSalesLiteraturesAsync**](SalesLiteraturesApi.md#getSalesLiteraturesAsync) | **GET** /api/v2/DealsService/SalesLiteratures | Get sales literatures |
| [**updateSalesLiteratureAsync**](SalesLiteraturesApi.md#updateSalesLiteratureAsync) | **PUT** /api/v2/DealsService/SalesLiteratures/{salesLiteratureId} | Update a sales literature |


<a id="countSalesLiteraturesAsync"></a>
# **countSalesLiteraturesAsync**
> Int32Envelope countSalesLiteraturesAsync(tenantId)

Get sales literatures count

Returns the total count of sales literatures for the specified tenant with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.countSalesLiteraturesAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#countSalesLiteraturesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#countSalesLiteraturesAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createSalesLiteratureAsync"></a>
# **createSalesLiteratureAsync**
> EmptyEnvelope createSalesLiteratureAsync(tenantId, salesLiteratureCreateDto)

Create a sales literature

Creates a new sales literature for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val salesLiteratureCreateDto : SalesLiteratureCreateDto =  // SalesLiteratureCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSalesLiteratureAsync(tenantId, salesLiteratureCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#createSalesLiteratureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#createSalesLiteratureAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **salesLiteratureCreateDto** | [**SalesLiteratureCreateDto**](SalesLiteratureCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSalesLiteratureAsync"></a>
# **deleteSalesLiteratureAsync**
> EmptyEnvelope deleteSalesLiteratureAsync(salesLiteratureId, tenantId)

Delete a sales literature

Deletes an existing sales literature by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val salesLiteratureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSalesLiteratureAsync(salesLiteratureId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#deleteSalesLiteratureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#deleteSalesLiteratureAsync")
    e.printStackTrace()
}
```

### Parameters
| **salesLiteratureId** | **java.util.UUID**|  | |
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

<a id="getExtendedSalesLiteraturesAsync"></a>
# **getExtendedSalesLiteraturesAsync**
> ExtendedSalesLiteratureDtoListEnvelope getExtendedSalesLiteraturesAsync(tenantId)

Get extended sales literatures

Retrieves a list of sales literatures with extended details for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedSalesLiteratureDtoListEnvelope = apiInstance.getExtendedSalesLiteraturesAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#getExtendedSalesLiteraturesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#getExtendedSalesLiteraturesAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedSalesLiteratureDtoListEnvelope**](ExtendedSalesLiteratureDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSalesLiteratureAsync"></a>
# **getSalesLiteratureAsync**
> SalesLiteratureDtoEnvelope getSalesLiteratureAsync(salesLiteratureId, tenantId)

Get sales literature by ID

Retrieves a single sales literature by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val salesLiteratureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SalesLiteratureDtoEnvelope = apiInstance.getSalesLiteratureAsync(salesLiteratureId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#getSalesLiteratureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#getSalesLiteratureAsync")
    e.printStackTrace()
}
```

### Parameters
| **salesLiteratureId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**SalesLiteratureDtoEnvelope**](SalesLiteratureDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSalesLiteraturesAsync"></a>
# **getSalesLiteraturesAsync**
> SalesLiteratureDtoListEnvelope getSalesLiteraturesAsync(tenantId)

Get sales literatures

Retrieves a list of sales literatures for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : SalesLiteratureDtoListEnvelope = apiInstance.getSalesLiteraturesAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#getSalesLiteraturesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#getSalesLiteraturesAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**SalesLiteratureDtoListEnvelope**](SalesLiteratureDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateSalesLiteratureAsync"></a>
# **updateSalesLiteratureAsync**
> EmptyEnvelope updateSalesLiteratureAsync(salesLiteratureId, tenantId, salesLiteratureUpdateDto)

Update a sales literature

Updates an existing sales literature by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SalesLiteraturesApi()
val salesLiteratureId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val salesLiteratureUpdateDto : SalesLiteratureUpdateDto =  // SalesLiteratureUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSalesLiteratureAsync(salesLiteratureId, tenantId, salesLiteratureUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SalesLiteraturesApi#updateSalesLiteratureAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SalesLiteraturesApi#updateSalesLiteratureAsync")
    e.printStackTrace()
}
```

### Parameters
| **salesLiteratureId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **salesLiteratureUpdateDto** | [**SalesLiteratureUpdateDto**](SalesLiteratureUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

