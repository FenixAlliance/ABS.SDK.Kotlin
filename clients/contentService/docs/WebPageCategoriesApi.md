# WebPageCategoriesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countWebPageCategoriesAsync**](WebPageCategoriesApi.md#countWebPageCategoriesAsync) | **GET** /api/v2/ContentService/WebPageCategories/Count | Count web page categories |
| [**createWebPageCategoryAsync**](WebPageCategoriesApi.md#createWebPageCategoryAsync) | **POST** /api/v2/ContentService/WebPageCategories | Create a web page category |
| [**deleteWebPageCategoryAsync**](WebPageCategoriesApi.md#deleteWebPageCategoryAsync) | **DELETE** /api/v2/ContentService/WebPageCategories/{webPageCategoryId} | Delete a web page category |
| [**getWebPageCategoriesAsync**](WebPageCategoriesApi.md#getWebPageCategoriesAsync) | **GET** /api/v2/ContentService/WebPageCategories | Get web page categories |
| [**getWebPageCategoryByIdAsync**](WebPageCategoriesApi.md#getWebPageCategoryByIdAsync) | **GET** /api/v2/ContentService/WebPageCategories/{webPageCategoryId} | Get web page category by ID |
| [**updateWebPageCategoryAsync**](WebPageCategoriesApi.md#updateWebPageCategoryAsync) | **PUT** /api/v2/ContentService/WebPageCategories/{webPageCategoryId} | Update a web page category |


<a id="countWebPageCategoriesAsync"></a>
# **countWebPageCategoriesAsync**
> Int32Envelope countWebPageCategoriesAsync(tenantId, apiVersion, xApiVersion)

Count web page categories

Counts all web page categories for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countWebPageCategoriesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageCategoriesApi#countWebPageCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageCategoriesApi#countWebPageCategoriesAsync")
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

<a id="createWebPageCategoryAsync"></a>
# **createWebPageCategoryAsync**
> EmptyEnvelope createWebPageCategoryAsync(tenantId, apiVersion, xApiVersion, webPageCategoryCreateDto)

Create a web page category

Creates a new web page category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageCategoryCreateDto : WebPageCategoryCreateDto =  // WebPageCategoryCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createWebPageCategoryAsync(tenantId, apiVersion, xApiVersion, webPageCategoryCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageCategoriesApi#createWebPageCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageCategoriesApi#createWebPageCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageCategoryCreateDto** | [**WebPageCategoryCreateDto**](WebPageCategoryCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteWebPageCategoryAsync"></a>
# **deleteWebPageCategoryAsync**
> EmptyEnvelope deleteWebPageCategoryAsync(webPageCategoryId, tenantId, apiVersion, xApiVersion)

Delete a web page category

Deletes a web page category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageCategoriesApi()
val webPageCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteWebPageCategoryAsync(webPageCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageCategoriesApi#deleteWebPageCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageCategoriesApi#deleteWebPageCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageCategoryId** | **java.util.UUID**|  | |
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

<a id="getWebPageCategoriesAsync"></a>
# **getWebPageCategoriesAsync**
> WebPageCategoryDtoListEnvelope getWebPageCategoriesAsync(tenantId, apiVersion, xApiVersion)

Get web page categories

Retrieves all web page categories for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageCategoriesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPageCategoryDtoListEnvelope = apiInstance.getWebPageCategoriesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageCategoriesApi#getWebPageCategoriesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageCategoriesApi#getWebPageCategoriesAsync")
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

[**WebPageCategoryDtoListEnvelope**](WebPageCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWebPageCategoryByIdAsync"></a>
# **getWebPageCategoryByIdAsync**
> WebPageCategoryDtoEnvelope getWebPageCategoryByIdAsync(webPageCategoryId, tenantId, apiVersion, xApiVersion)

Get web page category by ID

Retrieves a specific web page category by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageCategoriesApi()
val webPageCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPageCategoryDtoEnvelope = apiInstance.getWebPageCategoryByIdAsync(webPageCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageCategoriesApi#getWebPageCategoryByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageCategoriesApi#getWebPageCategoryByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WebPageCategoryDtoEnvelope**](WebPageCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateWebPageCategoryAsync"></a>
# **updateWebPageCategoryAsync**
> EmptyEnvelope updateWebPageCategoryAsync(webPageCategoryId, tenantId, apiVersion, xApiVersion, webPageCategoryUpdateDto)

Update a web page category

Updates an existing web page category for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = WebPageCategoriesApi()
val webPageCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val webPageCategoryUpdateDto : WebPageCategoryUpdateDto =  // WebPageCategoryUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateWebPageCategoryAsync(webPageCategoryId, tenantId, apiVersion, xApiVersion, webPageCategoryUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WebPageCategoriesApi#updateWebPageCategoryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebPageCategoriesApi#updateWebPageCategoryAsync")
    e.printStackTrace()
}
```

### Parameters
| **webPageCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **webPageCategoryUpdateDto** | [**WebPageCategoryUpdateDto**](WebPageCategoryUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

