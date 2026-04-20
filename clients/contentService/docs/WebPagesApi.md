# WebPagesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countWebPagesAsync**](WebPagesApi.md#countWebPagesAsync) | **GET** /api/v2/ContentService/WebPages/Count | Count web pages |
| [**createWebPageAsync**](WebPagesApi.md#createWebPageAsync) | **POST** /api/v2/ContentService/WebPages | Create a web page |
| [**createWebPageCategoryRelationAsync**](WebPagesApi.md#createWebPageCategoryRelationAsync) | **POST** /api/v2/ContentService/WebPages/{webPageId}/Categories | Create a web page category relation |
| [**createWebPageTagRelationAsync**](WebPagesApi.md#createWebPageTagRelationAsync) | **POST** /api/v2/ContentService/WebPages/{webPageId}/Tags | Create a web page tag relation |
| [**deleteWebPageAsync**](WebPagesApi.md#deleteWebPageAsync) | **DELETE** /api/v2/ContentService/WebPages/{webPageId} | Delete a web page |
| [**getCategoriesByWebPageAsync**](WebPagesApi.md#getCategoriesByWebPageAsync) | **GET** /api/v2/ContentService/WebPages/{webPageId}/Categories | Get categories by web page |
| [**getTagsByWebPageAsync**](WebPagesApi.md#getTagsByWebPageAsync) | **GET** /api/v2/ContentService/WebPages/{webPageId}/Tags | Get tags by web page |
| [**getWebPageByIdAsync**](WebPagesApi.md#getWebPageByIdAsync) | **GET** /api/v2/ContentService/WebPages/{webPageId} | Get web page by ID |
| [**getWebPagesAsync**](WebPagesApi.md#getWebPagesAsync) | **GET** /api/v2/ContentService/WebPages | Get web pages |
| [**relateWebPageToCategoryAsync**](WebPagesApi.md#relateWebPageToCategoryAsync) | **POST** /api/v2/ContentService/WebPages/{webPageId}/Categories/{categoryId} | Relate web page to category |
| [**relateWebPageToTagAsync**](WebPagesApi.md#relateWebPageToTagAsync) | **POST** /api/v2/ContentService/WebPages/{webPageId}/Tags/{tagId} | Relate web page to tag |
| [**unrelateWebPageCategoryAsync**](WebPagesApi.md#unrelateWebPageCategoryAsync) | **DELETE** /api/v2/ContentService/WebPages/{webPageId}/Categories/{categoryId} | Unrelate web page from category |
| [**unrelateWebPageTagAsync**](WebPagesApi.md#unrelateWebPageTagAsync) | **DELETE** /api/v2/ContentService/WebPages/{webPageId}/Tags/{tagId} | Unrelate web page from tag |
| [**updateWebPageAsync**](WebPagesApi.md#updateWebPageAsync) | **PUT** /api/v2/ContentService/WebPages/{webPageId} | Update a web page |


<a id="countWebPagesAsync"></a>
# **countWebPagesAsync**
> Int32Envelope countWebPagesAsync(tenantId, apiVersion, xApiVersion)

Count web pages

Counts all web pages for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countWebPagesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#countWebPagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#countWebPagesAsync")
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

<a id="createWebPageAsync"></a>
# **createWebPageAsync**
> createWebPageAsync(tenantId, apiVersion, xApiVersion, webPageCreateDto)

Create a web page

Creates a new web page for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageCreateDto : WebPageCreateDto =  // WebPageCreateDto | 
try {
    apiInstance.createWebPageAsync(tenantId, apiVersion, xApiVersion, webPageCreateDto)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#createWebPageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#createWebPageAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageCreateDto** | [**WebPageCreateDto**](WebPageCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWebPageCategoryRelationAsync"></a>
# **createWebPageCategoryRelationAsync**
> createWebPageCategoryRelationAsync(webPageId, tenantId, apiVersion, xApiVersion, webPageCategoryCreateDto)

Create a web page category relation

Creates a new category and relates it to a web page.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageCategoryCreateDto : WebPageCategoryCreateDto =  // WebPageCategoryCreateDto | 
try {
    apiInstance.createWebPageCategoryRelationAsync(webPageId, tenantId, apiVersion, xApiVersion, webPageCategoryCreateDto)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#createWebPageCategoryRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#createWebPageCategoryRelationAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageCategoryCreateDto** | [**WebPageCategoryCreateDto**](WebPageCategoryCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createWebPageTagRelationAsync"></a>
# **createWebPageTagRelationAsync**
> createWebPageTagRelationAsync(webPageId, tenantId, apiVersion, xApiVersion, webPageTagCreateDto)

Create a web page tag relation

Creates a new tag and relates it to a web page.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageTagCreateDto : WebPageTagCreateDto =  // WebPageTagCreateDto | 
try {
    apiInstance.createWebPageTagRelationAsync(webPageId, tenantId, apiVersion, xApiVersion, webPageTagCreateDto)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#createWebPageTagRelationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#createWebPageTagRelationAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageTagCreateDto** | [**WebPageTagCreateDto**](WebPageTagCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWebPageAsync"></a>
# **deleteWebPageAsync**
> deleteWebPageAsync(webPageId, tenantId, apiVersion, xApiVersion)

Delete a web page

Deletes a web page for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteWebPageAsync(webPageId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#deleteWebPageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#deleteWebPageAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
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

<a id="getCategoriesByWebPageAsync"></a>
# **getCategoriesByWebPageAsync**
> WebPageCategoryDtoListEnvelope getCategoriesByWebPageAsync(webPageId, apiVersion, xApiVersion)

Get categories by web page

Retrieves all categories related to a specific web page.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPageCategoryDtoListEnvelope = apiInstance.getCategoriesByWebPageAsync(webPageId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#getCategoriesByWebPageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#getCategoriesByWebPageAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPageCategoryDtoListEnvelope**](WebPageCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTagsByWebPageAsync"></a>
# **getTagsByWebPageAsync**
> WebPageTagDtoListEnvelope getTagsByWebPageAsync(webPageId, apiVersion, xApiVersion)

Get tags by web page

Retrieves all tags related to a specific web page.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPageTagDtoListEnvelope = apiInstance.getTagsByWebPageAsync(webPageId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#getTagsByWebPageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#getTagsByWebPageAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPageTagDtoListEnvelope**](WebPageTagDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebPageByIdAsync"></a>
# **getWebPageByIdAsync**
> WebPageDtoEnvelope getWebPageByIdAsync(webPageId, tenantId, apiVersion, xApiVersion)

Get web page by ID

Retrieves a specific web page by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPageDtoEnvelope = apiInstance.getWebPageByIdAsync(webPageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#getWebPageByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#getWebPageByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPageDtoEnvelope**](WebPageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebPagesAsync"></a>
# **getWebPagesAsync**
> WebPageDtoListEnvelope getWebPagesAsync(tenantId, apiVersion, xApiVersion)

Get web pages

Retrieves all web pages for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPageDtoListEnvelope = apiInstance.getWebPagesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#getWebPagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#getWebPagesAsync")
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

[**WebPageDtoListEnvelope**](WebPageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateWebPageToCategoryAsync"></a>
# **relateWebPageToCategoryAsync**
> relateWebPageToCategoryAsync(webPageId, categoryId, tenantId, apiVersion, xApiVersion)

Relate web page to category

Relates an existing category to a web page.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.relateWebPageToCategoryAsync(webPageId, categoryId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#relateWebPageToCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#relateWebPageToCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **categoryId** | **java.util.UUID**|  | |
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

<a id="relateWebPageToTagAsync"></a>
# **relateWebPageToTagAsync**
> relateWebPageToTagAsync(webPageId, tagId, tenantId, apiVersion, xApiVersion)

Relate web page to tag

Relates an existing tag to a web page.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.relateWebPageToTagAsync(webPageId, tagId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#relateWebPageToTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#relateWebPageToTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **tagId** | **java.util.UUID**|  | |
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

<a id="unrelateWebPageCategoryAsync"></a>
# **unrelateWebPageCategoryAsync**
> unrelateWebPageCategoryAsync(webPageId, categoryId, tenantId, apiVersion, xApiVersion)

Unrelate web page from category

Removes the relationship between a web page and a category.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val categoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.unrelateWebPageCategoryAsync(webPageId, categoryId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#unrelateWebPageCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#unrelateWebPageCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **categoryId** | **java.util.UUID**|  | |
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

<a id="unrelateWebPageTagAsync"></a>
# **unrelateWebPageTagAsync**
> unrelateWebPageTagAsync(webPageId, tagId, tenantId, apiVersion, xApiVersion)

Unrelate web page from tag

Removes the relationship between a web page and a tag.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.unrelateWebPageTagAsync(webPageId, tagId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#unrelateWebPageTagAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#unrelateWebPageTagAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **tagId** | **java.util.UUID**|  | |
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

<a id="updateWebPageAsync"></a>
# **updateWebPageAsync**
> updateWebPageAsync(webPageId, tenantId, apiVersion, xApiVersion, webPageUpdateDto)

Update a web page

Updates an existing web page for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPagesApi()
val webPageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageUpdateDto : WebPageUpdateDto =  // WebPageUpdateDto | 
try {
    apiInstance.updateWebPageAsync(webPageId, tenantId, apiVersion, xApiVersion, webPageUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling WebPagesApi#updateWebPageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPagesApi#updateWebPageAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageUpdateDto** | [**WebPageUpdateDto**](WebPageUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

