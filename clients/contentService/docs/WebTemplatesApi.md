# WebTemplatesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countWebTemplatesAsync**](WebTemplatesApi.md#countWebTemplatesAsync) | **GET** /api/v2/ContentService/WebTemplates/Count | Count web templates |
| [**createWebTemplateAsync**](WebTemplatesApi.md#createWebTemplateAsync) | **POST** /api/v2/ContentService/WebTemplates | Create a web template |
| [**deleteWebTemplateAsync**](WebTemplatesApi.md#deleteWebTemplateAsync) | **DELETE** /api/v2/ContentService/WebTemplates/{webTemplateId} | Delete a web template |
| [**getWebTemplateByIdAsync**](WebTemplatesApi.md#getWebTemplateByIdAsync) | **GET** /api/v2/ContentService/WebTemplates/{webTemplateId} | Get web template by ID |
| [**getWebTemplatesAsync**](WebTemplatesApi.md#getWebTemplatesAsync) | **GET** /api/v2/ContentService/WebTemplates | Get web templates |
| [**updateWebTemplateAsync**](WebTemplatesApi.md#updateWebTemplateAsync) | **PUT** /api/v2/ContentService/WebTemplates/{webTemplateId} | Update a web template |


<a id="countWebTemplatesAsync"></a>
# **countWebTemplatesAsync**
> Int32Envelope countWebTemplatesAsync(tenantId, apiVersion, xApiVersion)

Count web templates

Counts all web templates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countWebTemplatesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebTemplatesApi#countWebTemplatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebTemplatesApi#countWebTemplatesAsync")
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

<a id="createWebTemplateAsync"></a>
# **createWebTemplateAsync**
> createWebTemplateAsync(tenantId, apiVersion, xApiVersion, webTemplateCreateDto)

Create a web template

Creates a new web template for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webTemplateCreateDto : WebTemplateCreateDto =  // WebTemplateCreateDto | 
try {
    apiInstance.createWebTemplateAsync(tenantId, apiVersion, xApiVersion, webTemplateCreateDto)
} catch (e: ClientException) {
    println("4xx response calling WebTemplatesApi#createWebTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebTemplatesApi#createWebTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webTemplateCreateDto** | [**WebTemplateCreateDto**](WebTemplateCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWebTemplateAsync"></a>
# **deleteWebTemplateAsync**
> deleteWebTemplateAsync(webTemplateId, tenantId, apiVersion, xApiVersion)

Delete a web template

Deletes a web template for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebTemplatesApi()
val webTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteWebTemplateAsync(webTemplateId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WebTemplatesApi#deleteWebTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebTemplatesApi#deleteWebTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **webTemplateId** | **java.util.UUID**|  | |
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

<a id="getWebTemplateByIdAsync"></a>
# **getWebTemplateByIdAsync**
> WebTemplateDtoEnvelope getWebTemplateByIdAsync(webTemplateId, tenantId, apiVersion, xApiVersion)

Get web template by ID

Retrieves a specific web template by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebTemplatesApi()
val webTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebTemplateDtoEnvelope = apiInstance.getWebTemplateByIdAsync(webTemplateId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebTemplatesApi#getWebTemplateByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebTemplatesApi#getWebTemplateByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **webTemplateId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebTemplateDtoEnvelope**](WebTemplateDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebTemplatesAsync"></a>
# **getWebTemplatesAsync**
> WebTemplateDtoListEnvelope getWebTemplatesAsync(tenantId, apiVersion, xApiVersion)

Get web templates

Retrieves all web templates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebTemplatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebTemplateDtoListEnvelope = apiInstance.getWebTemplatesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebTemplatesApi#getWebTemplatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebTemplatesApi#getWebTemplatesAsync")
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

[**WebTemplateDtoListEnvelope**](WebTemplateDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateWebTemplateAsync"></a>
# **updateWebTemplateAsync**
> updateWebTemplateAsync(webTemplateId, tenantId, apiVersion, xApiVersion, webTemplateUpdateDto)

Update a web template

Updates an existing web template for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebTemplatesApi()
val webTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webTemplateUpdateDto : WebTemplateUpdateDto =  // WebTemplateUpdateDto | 
try {
    apiInstance.updateWebTemplateAsync(webTemplateId, tenantId, apiVersion, xApiVersion, webTemplateUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling WebTemplatesApi#updateWebTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebTemplatesApi#updateWebTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **webTemplateId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webTemplateUpdateDto** | [**WebTemplateUpdateDto**](WebTemplateUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

