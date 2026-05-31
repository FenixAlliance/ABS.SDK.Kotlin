# MarketingListsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMarketingListAsync**](MarketingListsApi.md#createMarketingListAsync) | **POST** /api/v2/MarketingService/MarketingLists | Create a marketing list |
| [**deleteMarketingListAsync**](MarketingListsApi.md#deleteMarketingListAsync) | **DELETE** /api/v2/MarketingService/MarketingLists/{marketinglistId} | Delete a marketing list |
| [**getMarketingListDetailsAsync**](MarketingListsApi.md#getMarketingListDetailsAsync) | **GET** /api/v2/MarketingService/MarketingLists/{marketinglistId} | Get marketing list by ID |
| [**getMarketingListODataAsync**](MarketingListsApi.md#getMarketingListODataAsync) | **GET** /api/v2/MarketingService/MarketingLists | Get marketing lists |
| [**getMarketingListsCountAsync**](MarketingListsApi.md#getMarketingListsCountAsync) | **GET** /api/v2/MarketingService/MarketingLists/Count | Get marketing lists count |
| [**updateMarketingListAsync**](MarketingListsApi.md#updateMarketingListAsync) | **PUT** /api/v2/MarketingService/MarketingLists/{marketinglistId} | Update a marketing list |


<a id="createMarketingListAsync"></a>
# **createMarketingListAsync**
> EmptyEnvelope createMarketingListAsync(tenantId, marketingListCreateDto, apiVersion, xApiVersion)

Create a marketing list

Creates a new marketing list for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingListCreateDto : MarketingListCreateDto =  // MarketingListCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createMarketingListAsync(tenantId, marketingListCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#createMarketingListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#createMarketingListAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **marketingListCreateDto** | [**MarketingListCreateDto**](MarketingListCreateDto.md)|  | |
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

<a id="deleteMarketingListAsync"></a>
# **deleteMarketingListAsync**
> EmptyEnvelope deleteMarketingListAsync(marketinglistId, tenantId, apiVersion, xApiVersion)

Delete a marketing list

Deletes a marketing list by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val marketinglistId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteMarketingListAsync(marketinglistId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#deleteMarketingListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#deleteMarketingListAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketinglistId** | **java.util.UUID**|  | |
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

<a id="getMarketingListDetailsAsync"></a>
# **getMarketingListDetailsAsync**
> MarketingListDtoEnvelope getMarketingListDetailsAsync(marketinglistId, tenantId, apiVersion, xApiVersion)

Get marketing list by ID

Retrieves the details of a specific marketing list by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val marketinglistId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingListDtoEnvelope = apiInstance.getMarketingListDetailsAsync(marketinglistId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#getMarketingListDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#getMarketingListDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketinglistId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MarketingListDtoEnvelope**](MarketingListDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingListODataAsync"></a>
# **getMarketingListODataAsync**
> MarketingListDtoListEnvelope getMarketingListODataAsync(tenantId, apiVersion, xApiVersion)

Get marketing lists

Retrieves a collection of marketing lists for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingListDtoListEnvelope = apiInstance.getMarketingListODataAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#getMarketingListODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#getMarketingListODataAsync")
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

[**MarketingListDtoListEnvelope**](MarketingListDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingListsCountAsync"></a>
# **getMarketingListsCountAsync**
> Int32Envelope getMarketingListsCountAsync(tenantId, apiVersion, xApiVersion)

Get marketing lists count

Returns the count of marketing lists for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getMarketingListsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#getMarketingListsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#getMarketingListsCountAsync")
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

<a id="updateMarketingListAsync"></a>
# **updateMarketingListAsync**
> EmptyEnvelope updateMarketingListAsync(marketinglistId, tenantId, marketingListUpdateDto, apiVersion, xApiVersion)

Update a marketing list

Updates an existing marketing list by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingListsApi()
val marketinglistId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val marketingListUpdateDto : MarketingListUpdateDto =  // MarketingListUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateMarketingListAsync(marketinglistId, tenantId, marketingListUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingListsApi#updateMarketingListAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingListsApi#updateMarketingListAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketinglistId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **marketingListUpdateDto** | [**MarketingListUpdateDto**](MarketingListUpdateDto.md)|  | |
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

