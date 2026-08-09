# KnowledgeArticlesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createKnowledgeArticleAsync**](KnowledgeArticlesApi.md#createKnowledgeArticleAsync) | **POST** /api/v2/SupportService/KnowledgeArticles | Create a knowledge article |
| [**deleteKnowledgeArticleAsync**](KnowledgeArticlesApi.md#deleteKnowledgeArticleAsync) | **DELETE** /api/v2/SupportService/KnowledgeArticles/{knowledgeArticleId} | Delete a knowledge article |
| [**getKnowledgeArticleAsync**](KnowledgeArticlesApi.md#getKnowledgeArticleAsync) | **GET** /api/v2/SupportService/KnowledgeArticles/{knowledgeArticleId} | Retrieve a knowledge article by ID |
| [**getKnowledgeArticlesAsync**](KnowledgeArticlesApi.md#getKnowledgeArticlesAsync) | **GET** /api/v2/SupportService/KnowledgeArticles | Retrieve knowledge articles |
| [**getKnowledgeArticlesCountAsync**](KnowledgeArticlesApi.md#getKnowledgeArticlesCountAsync) | **GET** /api/v2/SupportService/KnowledgeArticles/Count | Get knowledge articles count |
| [**patchKnowledgeArticleAsync**](KnowledgeArticlesApi.md#patchKnowledgeArticleAsync) | **PATCH** /api/v2/SupportService/KnowledgeArticles/{knowledgeArticleId} | Patch a knowledge article |
| [**updateKnowledgeArticleAsync**](KnowledgeArticlesApi.md#updateKnowledgeArticleAsync) | **PUT** /api/v2/SupportService/KnowledgeArticles/{knowledgeArticleId} | Update a knowledge article |


<a id="createKnowledgeArticleAsync"></a>
# **createKnowledgeArticleAsync**
> EmptyEnvelope createKnowledgeArticleAsync(tenantId, apiVersion, xApiVersion, knowledgeArticleCreateDto)

Create a knowledge article

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgeArticlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val knowledgeArticleCreateDto : KnowledgeArticleCreateDto =  // KnowledgeArticleCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createKnowledgeArticleAsync(tenantId, apiVersion, xApiVersion, knowledgeArticleCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeArticlesApi#createKnowledgeArticleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeArticlesApi#createKnowledgeArticleAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeArticleCreateDto** | [**KnowledgeArticleCreateDto**](KnowledgeArticleCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteKnowledgeArticleAsync"></a>
# **deleteKnowledgeArticleAsync**
> EmptyEnvelope deleteKnowledgeArticleAsync(knowledgeArticleId, tenantId, apiVersion, xApiVersion)

Delete a knowledge article

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgeArticlesApi()
val knowledgeArticleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteKnowledgeArticleAsync(knowledgeArticleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeArticlesApi#deleteKnowledgeArticleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeArticlesApi#deleteKnowledgeArticleAsync")
    e.printStackTrace()
}
```

### Parameters
| **knowledgeArticleId** | **java.util.UUID**|  | |
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

<a id="getKnowledgeArticleAsync"></a>
# **getKnowledgeArticleAsync**
> KnowledgeArticleDtoEnvelope getKnowledgeArticleAsync(knowledgeArticleId, tenantId, apiVersion, xApiVersion)

Retrieve a knowledge article by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgeArticlesApi()
val knowledgeArticleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : KnowledgeArticleDtoEnvelope = apiInstance.getKnowledgeArticleAsync(knowledgeArticleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeArticlesApi#getKnowledgeArticleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeArticlesApi#getKnowledgeArticleAsync")
    e.printStackTrace()
}
```

### Parameters
| **knowledgeArticleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**KnowledgeArticleDtoEnvelope**](KnowledgeArticleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getKnowledgeArticlesAsync"></a>
# **getKnowledgeArticlesAsync**
> KnowledgeArticleDtoListEnvelope getKnowledgeArticlesAsync(tenantId, apiVersion, xApiVersion, knowledgeArticleDtoCollectionQueryParameters)

Retrieve knowledge articles

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgeArticlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val knowledgeArticleDtoCollectionQueryParameters : KnowledgeArticleDtoCollectionQueryParameters =  // KnowledgeArticleDtoCollectionQueryParameters | 
try {
    val result : KnowledgeArticleDtoListEnvelope = apiInstance.getKnowledgeArticlesAsync(tenantId, apiVersion, xApiVersion, knowledgeArticleDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeArticlesApi#getKnowledgeArticlesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeArticlesApi#getKnowledgeArticlesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeArticleDtoCollectionQueryParameters** | [**KnowledgeArticleDtoCollectionQueryParameters**](KnowledgeArticleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**KnowledgeArticleDtoListEnvelope**](KnowledgeArticleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getKnowledgeArticlesCountAsync"></a>
# **getKnowledgeArticlesCountAsync**
> Int32Envelope getKnowledgeArticlesCountAsync(tenantId, apiVersion, xApiVersion, knowledgeArticleDtoCollectionQueryParameters)

Get knowledge articles count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgeArticlesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val knowledgeArticleDtoCollectionQueryParameters : KnowledgeArticleDtoCollectionQueryParameters =  // KnowledgeArticleDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getKnowledgeArticlesCountAsync(tenantId, apiVersion, xApiVersion, knowledgeArticleDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeArticlesApi#getKnowledgeArticlesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeArticlesApi#getKnowledgeArticlesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeArticleDtoCollectionQueryParameters** | [**KnowledgeArticleDtoCollectionQueryParameters**](KnowledgeArticleDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchKnowledgeArticleAsync"></a>
# **patchKnowledgeArticleAsync**
> EmptyEnvelope patchKnowledgeArticleAsync(knowledgeArticleId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a knowledge article

Partially updates an existing knowledge article by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgeArticlesApi()
val knowledgeArticleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchKnowledgeArticleAsync(knowledgeArticleId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeArticlesApi#patchKnowledgeArticleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeArticlesApi#patchKnowledgeArticleAsync")
    e.printStackTrace()
}
```

### Parameters
| **knowledgeArticleId** | **java.util.UUID**|  | |
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

<a id="updateKnowledgeArticleAsync"></a>
# **updateKnowledgeArticleAsync**
> EmptyEnvelope updateKnowledgeArticleAsync(knowledgeArticleId, tenantId, apiVersion, xApiVersion, knowledgeArticleUpdateDto)

Update a knowledge article

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = KnowledgeArticlesApi()
val knowledgeArticleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val knowledgeArticleUpdateDto : KnowledgeArticleUpdateDto =  // KnowledgeArticleUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateKnowledgeArticleAsync(knowledgeArticleId, tenantId, apiVersion, xApiVersion, knowledgeArticleUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling KnowledgeArticlesApi#updateKnowledgeArticleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling KnowledgeArticlesApi#updateKnowledgeArticleAsync")
    e.printStackTrace()
}
```

### Parameters
| **knowledgeArticleId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **knowledgeArticleUpdateDto** | [**KnowledgeArticleUpdateDto**](KnowledgeArticleUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

