# WebContentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countWebContentsAsync**](WebContentsApi.md#countWebContentsAsync) | **GET** /api/v2/ContentService/WebContents/Count | Count web contents |
| [**createWebContentAsync**](WebContentsApi.md#createWebContentAsync) | **POST** /api/v2/ContentService/WebContents | Create a web content |
| [**deleteWebContentAsync**](WebContentsApi.md#deleteWebContentAsync) | **DELETE** /api/v2/ContentService/WebContents/{webContentId} | Delete a web content |
| [**getWebContentByIdAsync**](WebContentsApi.md#getWebContentByIdAsync) | **GET** /api/v2/ContentService/WebContents/{webContentId} | Get web content by ID |
| [**getWebContentsAsync**](WebContentsApi.md#getWebContentsAsync) | **GET** /api/v2/ContentService/WebContents | Get web contents |
| [**updateWebContentAsync**](WebContentsApi.md#updateWebContentAsync) | **PUT** /api/v2/ContentService/WebContents/{webContentId} | Update a web content |


<a id="countWebContentsAsync"></a>
# **countWebContentsAsync**
> Int32Envelope countWebContentsAsync(tenantId, apiVersion, xApiVersion)

Count web contents

Counts all web contents for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebContentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countWebContentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebContentsApi#countWebContentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebContentsApi#countWebContentsAsync")
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

<a id="createWebContentAsync"></a>
# **createWebContentAsync**
> EmptyEnvelope createWebContentAsync(tenantId, apiVersion, xApiVersion, webContentCreateDto)

Create a web content

Creates a new web content for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebContentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webContentCreateDto : WebContentCreateDto =  // WebContentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWebContentAsync(tenantId, apiVersion, xApiVersion, webContentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebContentsApi#createWebContentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebContentsApi#createWebContentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webContentCreateDto** | [**WebContentCreateDto**](WebContentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWebContentAsync"></a>
# **deleteWebContentAsync**
> EmptyEnvelope deleteWebContentAsync(webContentId, tenantId, apiVersion, xApiVersion)

Delete a web content

Deletes a web content for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebContentsApi()
val webContentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWebContentAsync(webContentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebContentsApi#deleteWebContentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebContentsApi#deleteWebContentAsync")
    e.printStackTrace()
}
```

### Parameters
| **webContentId** | **java.util.UUID**|  | |
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

<a id="getWebContentByIdAsync"></a>
# **getWebContentByIdAsync**
> WebContentDtoEnvelope getWebContentByIdAsync(webContentId, tenantId, apiVersion, xApiVersion)

Get web content by ID

Retrieves a specific web content by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebContentsApi()
val webContentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebContentDtoEnvelope = apiInstance.getWebContentByIdAsync(webContentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebContentsApi#getWebContentByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebContentsApi#getWebContentByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **webContentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebContentDtoEnvelope**](WebContentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebContentsAsync"></a>
# **getWebContentsAsync**
> WebContentDtoListEnvelope getWebContentsAsync(tenantId, apiVersion, xApiVersion)

Get web contents

Retrieves all web contents for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebContentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebContentDtoListEnvelope = apiInstance.getWebContentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebContentsApi#getWebContentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebContentsApi#getWebContentsAsync")
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

[**WebContentDtoListEnvelope**](WebContentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateWebContentAsync"></a>
# **updateWebContentAsync**
> EmptyEnvelope updateWebContentAsync(webContentId, tenantId, apiVersion, xApiVersion, webContentUpdateDto)

Update a web content

Updates an existing web content for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebContentsApi()
val webContentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webContentUpdateDto : WebContentUpdateDto =  // WebContentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWebContentAsync(webContentId, tenantId, apiVersion, xApiVersion, webContentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebContentsApi#updateWebContentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebContentsApi#updateWebContentAsync")
    e.printStackTrace()
}
```

### Parameters
| **webContentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webContentUpdateDto** | [**WebContentUpdateDto**](WebContentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

