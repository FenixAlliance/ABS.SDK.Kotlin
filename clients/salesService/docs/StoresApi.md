# StoresApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countStoresAsync**](StoresApi.md#countStoresAsync) | **GET** /api/v2/SalesService/Stores/Count | Get stores count |
| [**createStoreAsync**](StoresApi.md#createStoreAsync) | **POST** /api/v2/SalesService/Stores | Create a store |
| [**deleteStoreAsync**](StoresApi.md#deleteStoreAsync) | **DELETE** /api/v2/SalesService/Stores/{storeId} | Delete a store |
| [**getStoreAsync**](StoresApi.md#getStoreAsync) | **GET** /api/v2/SalesService/Stores/{storeId} | Get store by ID |
| [**getStoresAsync**](StoresApi.md#getStoresAsync) | **GET** /api/v2/SalesService/Stores | Get stores |
| [**updateStoreAsync**](StoresApi.md#updateStoreAsync) | **PUT** /api/v2/SalesService/Stores/{storeId} | Update a store |


<a id="countStoresAsync"></a>
# **countStoresAsync**
> Int32Envelope countStoresAsync(tenantId)

Get stores count

Returns the total count of stores for the specified tenant with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StoresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.countStoresAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoresApi#countStoresAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoresApi#countStoresAsync")
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

<a id="createStoreAsync"></a>
# **createStoreAsync**
> EmptyEnvelope createStoreAsync(tenantId, storeCreateDto)

Create a store

Creates a new store for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StoresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val storeCreateDto : StoreCreateDto =  // StoreCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createStoreAsync(tenantId, storeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoresApi#createStoreAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoresApi#createStoreAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeCreateDto** | [**StoreCreateDto**](StoreCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteStoreAsync"></a>
# **deleteStoreAsync**
> EmptyEnvelope deleteStoreAsync(storeId, tenantId)

Delete a store

Deletes an existing store by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StoresApi()
val storeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteStoreAsync(storeId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoresApi#deleteStoreAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoresApi#deleteStoreAsync")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **java.util.UUID**|  | |
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

<a id="getStoreAsync"></a>
# **getStoreAsync**
> StoreDtoEnvelope getStoreAsync(storeId, tenantId)

Get store by ID

Retrieves a single store by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StoresApi()
val storeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : StoreDtoEnvelope = apiInstance.getStoreAsync(storeId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoresApi#getStoreAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoresApi#getStoreAsync")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**StoreDtoEnvelope**](StoreDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStoresAsync"></a>
# **getStoresAsync**
> StoreDtoListEnvelope getStoresAsync(tenantId)

Get stores

Retrieves a list of stores for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StoresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : StoreDtoListEnvelope = apiInstance.getStoresAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoresApi#getStoresAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoresApi#getStoresAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**StoreDtoListEnvelope**](StoreDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateStoreAsync"></a>
# **updateStoreAsync**
> EmptyEnvelope updateStoreAsync(storeId, tenantId, storeUpdateDto)

Update a store

Updates an existing store by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = StoresApi()
val storeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val storeUpdateDto : StoreUpdateDto =  // StoreUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateStoreAsync(storeId, tenantId, storeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StoresApi#updateStoreAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StoresApi#updateStoreAsync")
    e.printStackTrace()
}
```

### Parameters
| **storeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **storeUpdateDto** | [**StoreUpdateDto**](StoreUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

