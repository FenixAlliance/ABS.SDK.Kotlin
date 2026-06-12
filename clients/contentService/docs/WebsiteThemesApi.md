# WebsiteThemesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createWebsiteThemeAsync**](WebsiteThemesApi.md#createWebsiteThemeAsync) | **POST** /api/v2/ContentService/WebsiteThemes | Create a new website theme |
| [**deleteWebsiteThemeAsync**](WebsiteThemesApi.md#deleteWebsiteThemeAsync) | **DELETE** /api/v2/ContentService/WebsiteThemes/{id} | Delete a website theme |
| [**getWebsiteThemeByIdAsync**](WebsiteThemesApi.md#getWebsiteThemeByIdAsync) | **GET** /api/v2/ContentService/WebsiteThemes/{id} | Get website theme by ID |
| [**getWebsiteThemesAsync**](WebsiteThemesApi.md#getWebsiteThemesAsync) | **GET** /api/v2/ContentService/WebsiteThemes | Get all website themes |
| [**getWebsiteThemesCountAsync**](WebsiteThemesApi.md#getWebsiteThemesCountAsync) | **GET** /api/v2/ContentService/WebsiteThemes/Count | Get website themes count |
| [**patchWebsiteThemeAsync**](WebsiteThemesApi.md#patchWebsiteThemeAsync) | **PATCH** /api/v2/ContentService/WebsiteThemes/{id} | Patch a website theme |
| [**updateWebsiteThemeAsync**](WebsiteThemesApi.md#updateWebsiteThemeAsync) | **PUT** /api/v2/ContentService/WebsiteThemes/{id} | Update a website theme |


<a id="createWebsiteThemeAsync"></a>
# **createWebsiteThemeAsync**
> createWebsiteThemeAsync(tenantId, apiVersion, xApiVersion, websiteThemeCreateDto)

Create a new website theme

Creates a new website theme for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebsiteThemesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val websiteThemeCreateDto : WebsiteThemeCreateDto =  // WebsiteThemeCreateDto | 
try {
    apiInstance.createWebsiteThemeAsync(tenantId, apiVersion, xApiVersion, websiteThemeCreateDto)
} catch (e: ClientException) {
    println("4xx response calling WebsiteThemesApi#createWebsiteThemeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteThemesApi#createWebsiteThemeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **websiteThemeCreateDto** | [**WebsiteThemeCreateDto**](WebsiteThemeCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWebsiteThemeAsync"></a>
# **deleteWebsiteThemeAsync**
> deleteWebsiteThemeAsync(id, tenantId, apiVersion, xApiVersion)

Delete a website theme

Deletes a website theme for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebsiteThemesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteWebsiteThemeAsync(id, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WebsiteThemesApi#deleteWebsiteThemeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteThemesApi#deleteWebsiteThemeAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="getWebsiteThemeByIdAsync"></a>
# **getWebsiteThemeByIdAsync**
> WebsiteThemeDto getWebsiteThemeByIdAsync(id, tenantId, apiVersion, xApiVersion)

Get website theme by ID

Retrieves a specific website theme by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebsiteThemesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebsiteThemeDto = apiInstance.getWebsiteThemeByIdAsync(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebsiteThemesApi#getWebsiteThemeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteThemesApi#getWebsiteThemeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebsiteThemeDto**](WebsiteThemeDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebsiteThemesAsync"></a>
# **getWebsiteThemesAsync**
> WebsiteThemeDtoListEnvelope getWebsiteThemesAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)

Get all website themes

Retrieves all website themes for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebsiteThemesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val oDataQueryOptions : WebsiteThemeDtoODataQueryOptions =  // WebsiteThemeDtoODataQueryOptions | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebsiteThemeDtoListEnvelope = apiInstance.getWebsiteThemesAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebsiteThemesApi#getWebsiteThemesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteThemesApi#getWebsiteThemesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **oDataQueryOptions** | [**WebsiteThemeDtoODataQueryOptions**](.md)|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebsiteThemeDtoListEnvelope**](WebsiteThemeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebsiteThemesCountAsync"></a>
# **getWebsiteThemesCountAsync**
> Int32Envelope getWebsiteThemesCountAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)

Get website themes count

Returns the count of website themes for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebsiteThemesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val oDataQueryOptions : WebsiteThemeDtoODataQueryOptions =  // WebsiteThemeDtoODataQueryOptions | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getWebsiteThemesCountAsync(tenantId, oDataQueryOptions, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebsiteThemesApi#getWebsiteThemesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteThemesApi#getWebsiteThemesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **oDataQueryOptions** | [**WebsiteThemeDtoODataQueryOptions**](.md)|  | [optional] |
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

<a id="patchWebsiteThemeAsync"></a>
# **patchWebsiteThemeAsync**
> patchWebsiteThemeAsync(id, tenantId, apiVersion, xApiVersion, operation)

Patch a website theme

Partially updates an existing website theme for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebsiteThemesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    apiInstance.patchWebsiteThemeAsync(id, tenantId, apiVersion, xApiVersion, operation)
} catch (e: ClientException) {
    println("4xx response calling WebsiteThemesApi#patchWebsiteThemeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteThemesApi#patchWebsiteThemeAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateWebsiteThemeAsync"></a>
# **updateWebsiteThemeAsync**
> updateWebsiteThemeAsync(id, tenantId, apiVersion, xApiVersion, websiteThemeUpdateDto)

Update a website theme

Updates an existing website theme for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebsiteThemesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val websiteThemeUpdateDto : WebsiteThemeUpdateDto =  // WebsiteThemeUpdateDto | 
try {
    apiInstance.updateWebsiteThemeAsync(id, tenantId, apiVersion, xApiVersion, websiteThemeUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling WebsiteThemesApi#updateWebsiteThemeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebsiteThemesApi#updateWebsiteThemeAsync")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **websiteThemeUpdateDto** | [**WebsiteThemeUpdateDto**](WebsiteThemeUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

