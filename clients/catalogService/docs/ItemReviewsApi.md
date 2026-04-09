# ItemReviewsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createItemReviewAsync**](ItemReviewsApi.md#createItemReviewAsync) | **POST** /api/v2/CatalogService/ItemReviews | Create a new item review |
| [**deleteItemReviewAsync**](ItemReviewsApi.md#deleteItemReviewAsync) | **DELETE** /api/v2/CatalogService/ItemReviews/{itemReviewId} | Delete an item review |
| [**getItemReviewByIdAsync**](ItemReviewsApi.md#getItemReviewByIdAsync) | **GET** /api/v2/CatalogService/ItemReviews/{itemReviewId} | Get item review by ID |
| [**getItemReviewsAsync**](ItemReviewsApi.md#getItemReviewsAsync) | **GET** /api/v2/CatalogService/ItemReviews | Get all item reviews |
| [**updateItemReviewAsync**](ItemReviewsApi.md#updateItemReviewAsync) | **PUT** /api/v2/CatalogService/ItemReviews/{itemReviewId} | Update an item review |


<a id="createItemReviewAsync"></a>
# **createItemReviewAsync**
> ItemReviewDtoEnvelope createItemReviewAsync(tenantId, apiVersion, xApiVersion, itemReviewCreateDto)

Create a new item review

Creates a new item review for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReviewsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemReviewCreateDto : ItemReviewCreateDto =  // ItemReviewCreateDto | 
try {
    val result : ItemReviewDtoEnvelope = apiInstance.createItemReviewAsync(tenantId, apiVersion, xApiVersion, itemReviewCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemReviewsApi#createItemReviewAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReviewsApi#createItemReviewAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemReviewCreateDto** | [**ItemReviewCreateDto**](ItemReviewCreateDto.md)|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteItemReviewAsync"></a>
# **deleteItemReviewAsync**
> deleteItemReviewAsync(itemReviewId, tenantId, apiVersion, xApiVersion)

Delete an item review

Deletes an item review for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReviewsApi()
val itemReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteItemReviewAsync(itemReviewId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemReviewsApi#deleteItemReviewAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReviewsApi#deleteItemReviewAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemReviewId** | **java.util.UUID**|  | |
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

<a id="getItemReviewByIdAsync"></a>
# **getItemReviewByIdAsync**
> ItemReviewDtoEnvelope getItemReviewByIdAsync(itemReviewId, apiVersion, xApiVersion)

Get item review by ID

Retrieves a specific item review by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReviewsApi()
val itemReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReviewDtoEnvelope = apiInstance.getItemReviewByIdAsync(itemReviewId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemReviewsApi#getItemReviewByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReviewsApi#getItemReviewByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemReviewId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getItemReviewsAsync"></a>
# **getItemReviewsAsync**
> ItemReviewDtoListEnvelope getItemReviewsAsync(itemId, apiVersion, xApiVersion)

Get all item reviews

Retrieves all item reviews for the specified item using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReviewsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReviewDtoListEnvelope = apiInstance.getItemReviewsAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemReviewsApi#getItemReviewsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReviewsApi#getItemReviewsAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReviewDtoListEnvelope**](ItemReviewDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateItemReviewAsync"></a>
# **updateItemReviewAsync**
> updateItemReviewAsync(itemReviewId, tenantId, apiVersion, xApiVersion, itemReviewUpdateDto)

Update an item review

Updates an existing item review for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemReviewsApi()
val itemReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemReviewUpdateDto : ItemReviewUpdateDto =  // ItemReviewUpdateDto | 
try {
    apiInstance.updateItemReviewAsync(itemReviewId, tenantId, apiVersion, xApiVersion, itemReviewUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemReviewsApi#updateItemReviewAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemReviewsApi#updateItemReviewAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemReviewId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemReviewUpdateDto** | [**ItemReviewUpdateDto**](ItemReviewUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

