# WebPageTagsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countWebPageTagsAsync**](WebPageTagsApi.md#countWebPageTagsAsync) | **GET** /api/v2/ContentService/WebPageTags/Count | Count web page tags |
| [**createWebPageTagAsync**](WebPageTagsApi.md#createWebPageTagAsync) | **POST** /api/v2/ContentService/WebPageTags | Create a web page tag |
| [**deleteWebPageTagAsync**](WebPageTagsApi.md#deleteWebPageTagAsync) | **DELETE** /api/v2/ContentService/WebPageTags/{webPageTagId} | Delete a web page tag |
| [**getWebPageTagByIdAsync**](WebPageTagsApi.md#getWebPageTagByIdAsync) | **GET** /api/v2/ContentService/WebPageTags/{webPageTagId} | Get web page tag by ID |
| [**getWebPageTagsAsync**](WebPageTagsApi.md#getWebPageTagsAsync) | **GET** /api/v2/ContentService/WebPageTags | Get web page tags |
| [**patchWebPageTagAsync**](WebPageTagsApi.md#patchWebPageTagAsync) | **PATCH** /api/v2/ContentService/WebPageTags/{webPageTagId} | Patch a web page tag |
| [**updateWebPageTagAsync**](WebPageTagsApi.md#updateWebPageTagAsync) | **PUT** /api/v2/ContentService/WebPageTags/{webPageTagId} | Update a web page tag |


<a id="countWebPageTagsAsync"></a>
# **countWebPageTagsAsync**
> Int32Envelope countWebPageTagsAsync(tenantId, apiVersion, xApiVersion, webPageTagDtoCollectionQueryParameters)

Count web page tags

Counts all web page tags for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageTagsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageTagDtoCollectionQueryParameters : WebPageTagDtoCollectionQueryParameters =  // WebPageTagDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.countWebPageTagsAsync(tenantId, apiVersion, xApiVersion, webPageTagDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageTagsApi#countWebPageTagsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageTagsApi#countWebPageTagsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageTagDtoCollectionQueryParameters** | [**WebPageTagDtoCollectionQueryParameters**](WebPageTagDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWebPageTagAsync"></a>
# **createWebPageTagAsync**
> EmptyEnvelope createWebPageTagAsync(tenantId, apiVersion, xApiVersion, webPageTagCreateDto)

Create a web page tag

Creates a new web page tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageTagsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageTagCreateDto : WebPageTagCreateDto =  // WebPageTagCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWebPageTagAsync(tenantId, apiVersion, xApiVersion, webPageTagCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageTagsApi#createWebPageTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageTagsApi#createWebPageTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageTagCreateDto** | [**WebPageTagCreateDto**](WebPageTagCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWebPageTagAsync"></a>
# **deleteWebPageTagAsync**
> EmptyEnvelope deleteWebPageTagAsync(webPageTagId, tenantId, apiVersion, xApiVersion)

Delete a web page tag

Deletes a web page tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageTagsApi()
val webPageTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWebPageTagAsync(webPageTagId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageTagsApi#deleteWebPageTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageTagsApi#deleteWebPageTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageTagId** | **java.util.UUID**|  | |
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

<a id="getWebPageTagByIdAsync"></a>
# **getWebPageTagByIdAsync**
> WebPageTagDtoEnvelope getWebPageTagByIdAsync(webPageTagId, tenantId, apiVersion, xApiVersion)

Get web page tag by ID

Retrieves a specific web page tag by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageTagsApi()
val webPageTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPageTagDtoEnvelope = apiInstance.getWebPageTagByIdAsync(webPageTagId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageTagsApi#getWebPageTagByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageTagsApi#getWebPageTagByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPageTagDtoEnvelope**](WebPageTagDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebPageTagsAsync"></a>
# **getWebPageTagsAsync**
> WebPageTagDtoListEnvelope getWebPageTagsAsync(tenantId, apiVersion, xApiVersion, webPageTagDtoCollectionQueryParameters)

Get web page tags

Retrieves all web page tags for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageTagsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageTagDtoCollectionQueryParameters : WebPageTagDtoCollectionQueryParameters =  // WebPageTagDtoCollectionQueryParameters | 
try {
    val result : WebPageTagDtoListEnvelope = apiInstance.getWebPageTagsAsync(tenantId, apiVersion, xApiVersion, webPageTagDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageTagsApi#getWebPageTagsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageTagsApi#getWebPageTagsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageTagDtoCollectionQueryParameters** | [**WebPageTagDtoCollectionQueryParameters**](WebPageTagDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**WebPageTagDtoListEnvelope**](WebPageTagDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchWebPageTagAsync"></a>
# **patchWebPageTagAsync**
> EmptyEnvelope patchWebPageTagAsync(webPageTagId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a web page tag

Partially updates an existing web page tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageTagsApi()
val webPageTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchWebPageTagAsync(webPageTagId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageTagsApi#patchWebPageTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageTagsApi#patchWebPageTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
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

<a id="updateWebPageTagAsync"></a>
# **updateWebPageTagAsync**
> EmptyEnvelope updateWebPageTagAsync(webPageTagId, tenantId, apiVersion, xApiVersion, webPageTagUpdateDto)

Update a web page tag

Updates an existing web page tag for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageTagsApi()
val webPageTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageTagUpdateDto : WebPageTagUpdateDto =  // WebPageTagUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWebPageTagAsync(webPageTagId, tenantId, apiVersion, xApiVersion, webPageTagUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageTagsApi#updateWebPageTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageTagsApi#updateWebPageTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageTagUpdateDto** | [**WebPageTagUpdateDto**](WebPageTagUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

