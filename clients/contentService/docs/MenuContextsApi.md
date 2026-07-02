# MenuContextsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countMenuContextsAsync**](MenuContextsApi.md#countMenuContextsAsync) | **GET** /api/v2/ContentService/MenuContexts/Count | Count menu contexts |
| [**createMenuContextAsync**](MenuContextsApi.md#createMenuContextAsync) | **POST** /api/v2/ContentService/MenuContexts | Create a menu context |
| [**deleteMenuContextAsync**](MenuContextsApi.md#deleteMenuContextAsync) | **DELETE** /api/v2/ContentService/MenuContexts/{menuContextId} | Delete a menu context |
| [**getMenuContextByIdAsync**](MenuContextsApi.md#getMenuContextByIdAsync) | **GET** /api/v2/ContentService/MenuContexts/{menuContextId} | Get menu context by ID |
| [**getMenuContextsAsync**](MenuContextsApi.md#getMenuContextsAsync) | **GET** /api/v2/ContentService/MenuContexts | Get menu contexts |
| [**updateMenuContextAsync**](MenuContextsApi.md#updateMenuContextAsync) | **PUT** /api/v2/ContentService/MenuContexts/{menuContextId} | Update a menu context |


<a id="countMenuContextsAsync"></a>
# **countMenuContextsAsync**
> Int32Envelope countMenuContextsAsync(tenantId, apiVersion, xApiVersion)

Count menu contexts

Counts all menu contexts for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MenuContextsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countMenuContextsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MenuContextsApi#countMenuContextsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MenuContextsApi#countMenuContextsAsync")
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

<a id="createMenuContextAsync"></a>
# **createMenuContextAsync**
> EmptyEnvelope createMenuContextAsync(tenantId, menuContextCreateDto, apiVersion, xApiVersion)

Create a menu context

Creates a new menu context for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MenuContextsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val menuContextCreateDto : MenuContextCreateDto =  // MenuContextCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createMenuContextAsync(tenantId, menuContextCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MenuContextsApi#createMenuContextAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MenuContextsApi#createMenuContextAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **menuContextCreateDto** | [**MenuContextCreateDto**](MenuContextCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteMenuContextAsync"></a>
# **deleteMenuContextAsync**
> EmptyEnvelope deleteMenuContextAsync(menuContextId, tenantId, apiVersion, xApiVersion)

Delete a menu context

Deletes a menu context for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MenuContextsApi()
val menuContextId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteMenuContextAsync(menuContextId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MenuContextsApi#deleteMenuContextAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MenuContextsApi#deleteMenuContextAsync")
    e.printStackTrace()
}
```

### Parameters
| **menuContextId** | **java.util.UUID**|  | |
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

<a id="getMenuContextByIdAsync"></a>
# **getMenuContextByIdAsync**
> MenuContextDtoEnvelope getMenuContextByIdAsync(menuContextId, tenantId, apiVersion, xApiVersion)

Get menu context by ID

Retrieves a specific menu context by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MenuContextsApi()
val menuContextId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MenuContextDtoEnvelope = apiInstance.getMenuContextByIdAsync(menuContextId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MenuContextsApi#getMenuContextByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MenuContextsApi#getMenuContextByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **menuContextId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MenuContextDtoEnvelope**](MenuContextDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMenuContextsAsync"></a>
# **getMenuContextsAsync**
> MenuContextDtoListEnvelope getMenuContextsAsync(tenantId, apiVersion, xApiVersion)

Get menu contexts

Retrieves all menu contexts for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MenuContextsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MenuContextDtoListEnvelope = apiInstance.getMenuContextsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MenuContextsApi#getMenuContextsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MenuContextsApi#getMenuContextsAsync")
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

[**MenuContextDtoListEnvelope**](MenuContextDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateMenuContextAsync"></a>
# **updateMenuContextAsync**
> EmptyEnvelope updateMenuContextAsync(menuContextId, tenantId, menuContextUpdateDto, apiVersion, xApiVersion)

Update a menu context

Updates an existing menu context for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MenuContextsApi()
val menuContextId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val menuContextUpdateDto : MenuContextUpdateDto =  // MenuContextUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateMenuContextAsync(menuContextId, tenantId, menuContextUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MenuContextsApi#updateMenuContextAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MenuContextsApi#updateMenuContextAsync")
    e.printStackTrace()
}
```

### Parameters
| **menuContextId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **menuContextUpdateDto** | [**MenuContextUpdateDto**](MenuContextUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

