# WebComponentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countWebComponentsAsync**](WebComponentsApi.md#countWebComponentsAsync) | **GET** /api/v2/ContentService/WebComponents/Count | Count web components |
| [**createWebComponentAsync**](WebComponentsApi.md#createWebComponentAsync) | **POST** /api/v2/ContentService/WebComponents | Create a web component |
| [**deleteWebComponentAsync**](WebComponentsApi.md#deleteWebComponentAsync) | **DELETE** /api/v2/ContentService/WebComponents/{webComponentId} | Delete a web component |
| [**getWebComponentByIdAsync**](WebComponentsApi.md#getWebComponentByIdAsync) | **GET** /api/v2/ContentService/WebComponents/{webComponentId} | Get web component by ID |
| [**getWebComponentsAsync**](WebComponentsApi.md#getWebComponentsAsync) | **GET** /api/v2/ContentService/WebComponents | Get web components |
| [**updateWebComponentAsync**](WebComponentsApi.md#updateWebComponentAsync) | **PUT** /api/v2/ContentService/WebComponents/{webComponentId} | Update a web component |


<a id="countWebComponentsAsync"></a>
# **countWebComponentsAsync**
> Int32Envelope countWebComponentsAsync(tenantId, apiVersion, xApiVersion, webComponentDtoCollectionQueryParameters)

Count web components

Counts all web components for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webComponentDtoCollectionQueryParameters : WebComponentDtoCollectionQueryParameters =  // WebComponentDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.countWebComponentsAsync(tenantId, apiVersion, xApiVersion, webComponentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebComponentsApi#countWebComponentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebComponentsApi#countWebComponentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webComponentDtoCollectionQueryParameters** | [**WebComponentDtoCollectionQueryParameters**](WebComponentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWebComponentAsync"></a>
# **createWebComponentAsync**
> EmptyEnvelope createWebComponentAsync(tenantId, webComponentCreateDto, apiVersion, xApiVersion)

Create a web component

Creates a new web component for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val webComponentCreateDto : WebComponentCreateDto =  // WebComponentCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createWebComponentAsync(tenantId, webComponentCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebComponentsApi#createWebComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebComponentsApi#createWebComponentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **webComponentCreateDto** | [**WebComponentCreateDto**](WebComponentCreateDto.md)|  | |
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

<a id="deleteWebComponentAsync"></a>
# **deleteWebComponentAsync**
> EmptyEnvelope deleteWebComponentAsync(webComponentId, tenantId, apiVersion, xApiVersion)

Delete a web component

Deletes a web component for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebComponentsApi()
val webComponentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWebComponentAsync(webComponentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebComponentsApi#deleteWebComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebComponentsApi#deleteWebComponentAsync")
    e.printStackTrace()
}
```

### Parameters
| **webComponentId** | **java.util.UUID**|  | |
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

<a id="getWebComponentByIdAsync"></a>
# **getWebComponentByIdAsync**
> WebComponentDtoEnvelope getWebComponentByIdAsync(webComponentId, tenantId, apiVersion, xApiVersion)

Get web component by ID

Retrieves a specific web component by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebComponentsApi()
val webComponentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebComponentDtoEnvelope = apiInstance.getWebComponentByIdAsync(webComponentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebComponentsApi#getWebComponentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebComponentsApi#getWebComponentByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **webComponentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebComponentDtoEnvelope**](WebComponentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebComponentsAsync"></a>
# **getWebComponentsAsync**
> WebComponentDtoListEnvelope getWebComponentsAsync(tenantId, apiVersion, xApiVersion, webComponentDtoCollectionQueryParameters)

Get web components

Retrieves all web components for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebComponentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webComponentDtoCollectionQueryParameters : WebComponentDtoCollectionQueryParameters =  // WebComponentDtoCollectionQueryParameters | 
try {
    val result : WebComponentDtoListEnvelope = apiInstance.getWebComponentsAsync(tenantId, apiVersion, xApiVersion, webComponentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebComponentsApi#getWebComponentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebComponentsApi#getWebComponentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webComponentDtoCollectionQueryParameters** | [**WebComponentDtoCollectionQueryParameters**](WebComponentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**WebComponentDtoListEnvelope**](WebComponentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateWebComponentAsync"></a>
# **updateWebComponentAsync**
> EmptyEnvelope updateWebComponentAsync(webComponentId, tenantId, webComponentUpdateDto, apiVersion, xApiVersion)

Update a web component

Updates an existing web component for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebComponentsApi()
val webComponentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val webComponentUpdateDto : WebComponentUpdateDto =  // WebComponentUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateWebComponentAsync(webComponentId, tenantId, webComponentUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebComponentsApi#updateWebComponentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebComponentsApi#updateWebComponentAsync")
    e.printStackTrace()
}
```

### Parameters
| **webComponentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **webComponentUpdateDto** | [**WebComponentUpdateDto**](WebComponentUpdateDto.md)|  | |
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

