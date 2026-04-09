# ItemQuestionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemQuestionAsync**](ItemQuestionsApi.md#createItemQuestionAsync) | **POST** /api/v2/CatalogService/ItemQuestions | Create a new item question |
| [**deleteItemQuestionAsync**](ItemQuestionsApi.md#deleteItemQuestionAsync) | **DELETE** /api/v2/CatalogService/ItemQuestions/{itemQuestionId} | Delete an item question |
| [**getItemQuestionByIdAsync**](ItemQuestionsApi.md#getItemQuestionByIdAsync) | **GET** /api/v2/CatalogService/ItemQuestions/{itemQuestionId} | Get item question by ID |
| [**getItemQuestionsAsync**](ItemQuestionsApi.md#getItemQuestionsAsync) | **GET** /api/v2/CatalogService/ItemQuestions | Get all item questions |
| [**updateItemQuestionAsync**](ItemQuestionsApi.md#updateItemQuestionAsync) | **PUT** /api/v2/CatalogService/ItemQuestions/{itemQuestionId} | Update an item question |


<a id="createItemQuestionAsync"></a>
# **createItemQuestionAsync**
> ItemQuestionDtoEnvelope createItemQuestionAsync(tenantId, apiVersion, xApiVersion, itemQuestionCreateDto)

Create a new item question

Creates a new item question for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemQuestionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemQuestionCreateDto : ItemQuestionCreateDto =  // ItemQuestionCreateDto | 
try {
    val result : ItemQuestionDtoEnvelope = apiInstance.createItemQuestionAsync(tenantId, apiVersion, xApiVersion, itemQuestionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemQuestionsApi#createItemQuestionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemQuestionsApi#createItemQuestionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemQuestionCreateDto** | [**ItemQuestionCreateDto**](ItemQuestionCreateDto.md)|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemQuestionAsync"></a>
# **deleteItemQuestionAsync**
> deleteItemQuestionAsync(itemQuestionId, tenantId, apiVersion, xApiVersion)

Delete an item question

Deletes an item question for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemQuestionsApi()
val itemQuestionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemQuestionAsync(itemQuestionId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemQuestionsApi#deleteItemQuestionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemQuestionsApi#deleteItemQuestionAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemQuestionId** | **java.util.UUID**|  | |
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

<a id="getItemQuestionByIdAsync"></a>
# **getItemQuestionByIdAsync**
> ItemQuestionDtoEnvelope getItemQuestionByIdAsync(itemQuestionId, apiVersion, xApiVersion)

Get item question by ID

Retrieves a specific item question by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemQuestionsApi()
val itemQuestionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemQuestionDtoEnvelope = apiInstance.getItemQuestionByIdAsync(itemQuestionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemQuestionsApi#getItemQuestionByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemQuestionsApi#getItemQuestionByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemQuestionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemQuestionsAsync"></a>
# **getItemQuestionsAsync**
> ItemQuestionDtoListEnvelope getItemQuestionsAsync(tenantId, apiVersion, xApiVersion)

Get all item questions

Retrieves all item questions for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemQuestionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemQuestionDtoListEnvelope = apiInstance.getItemQuestionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemQuestionsApi#getItemQuestionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemQuestionsApi#getItemQuestionsAsync")
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

[**ItemQuestionDtoListEnvelope**](ItemQuestionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemQuestionAsync"></a>
# **updateItemQuestionAsync**
> updateItemQuestionAsync(itemQuestionId, tenantId, apiVersion, xApiVersion, itemQuestionUpdateDto)

Update an item question

Updates an existing item question for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemQuestionsApi()
val itemQuestionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemQuestionUpdateDto : ItemQuestionUpdateDto =  // ItemQuestionUpdateDto | 
try {
    apiInstance.updateItemQuestionAsync(itemQuestionId, tenantId, apiVersion, xApiVersion, itemQuestionUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemQuestionsApi#updateItemQuestionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemQuestionsApi#updateItemQuestionAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemQuestionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemQuestionUpdateDto** | [**ItemQuestionUpdateDto**](ItemQuestionUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

