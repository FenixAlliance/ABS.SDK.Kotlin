# MarketingAreasApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMarketingAreaAsync**](MarketingAreasApi.md#createMarketingAreaAsync) | **POST** /api/v2/MarketingService/MarketingAreas | Create a marketing area |
| [**deleteMarketingAreaAsync**](MarketingAreasApi.md#deleteMarketingAreaAsync) | **DELETE** /api/v2/MarketingService/MarketingAreas/{marketingAreaId} | Delete a marketing area |
| [**getMarketingAreaByIdAsync**](MarketingAreasApi.md#getMarketingAreaByIdAsync) | **GET** /api/v2/MarketingService/MarketingAreas/{marketingAreaId} | Get marketing area by ID |
| [**getMarketingAreasAsync**](MarketingAreasApi.md#getMarketingAreasAsync) | **GET** /api/v2/MarketingService/MarketingAreas | Get marketing areas |
| [**getMarketingAreasCountAsync**](MarketingAreasApi.md#getMarketingAreasCountAsync) | **GET** /api/v2/MarketingService/MarketingAreas/Count | Count marketing areas |
| [**updateMarketingAreaAsync**](MarketingAreasApi.md#updateMarketingAreaAsync) | **PUT** /api/v2/MarketingService/MarketingAreas/{marketingAreaId} | Update a marketing area |


<a id="createMarketingAreaAsync"></a>
# **createMarketingAreaAsync**
> EmptyEnvelope createMarketingAreaAsync(tenantId, apiVersion, xApiVersion, marketingAreaCreateDto)

Create a marketing area

Creates a new marketing area for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingAreasApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val marketingAreaCreateDto : MarketingAreaCreateDto =  // MarketingAreaCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createMarketingAreaAsync(tenantId, apiVersion, xApiVersion, marketingAreaCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingAreasApi#createMarketingAreaAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingAreasApi#createMarketingAreaAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **marketingAreaCreateDto** | [**MarketingAreaCreateDto**](MarketingAreaCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteMarketingAreaAsync"></a>
# **deleteMarketingAreaAsync**
> EmptyEnvelope deleteMarketingAreaAsync(marketingAreaId, tenantId, apiVersion, xApiVersion)

Delete a marketing area

Deletes a marketing area for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingAreasApi()
val marketingAreaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteMarketingAreaAsync(marketingAreaId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingAreasApi#deleteMarketingAreaAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingAreasApi#deleteMarketingAreaAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketingAreaId** | **java.util.UUID**|  | |
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

<a id="getMarketingAreaByIdAsync"></a>
# **getMarketingAreaByIdAsync**
> MarketingAreaDtoEnvelope getMarketingAreaByIdAsync(marketingAreaId, tenantId, apiVersion, xApiVersion)

Get marketing area by ID

Retrieves a specific marketing area by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingAreasApi()
val marketingAreaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingAreaDtoEnvelope = apiInstance.getMarketingAreaByIdAsync(marketingAreaId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingAreasApi#getMarketingAreaByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingAreasApi#getMarketingAreaByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketingAreaId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MarketingAreaDtoEnvelope**](MarketingAreaDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingAreasAsync"></a>
# **getMarketingAreasAsync**
> MarketingAreaDtoListEnvelope getMarketingAreasAsync(tenantId, apiVersion, xApiVersion)

Get marketing areas

Retrieves marketing areas for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingAreasApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MarketingAreaDtoListEnvelope = apiInstance.getMarketingAreasAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingAreasApi#getMarketingAreasAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingAreasApi#getMarketingAreasAsync")
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

[**MarketingAreaDtoListEnvelope**](MarketingAreaDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMarketingAreasCountAsync"></a>
# **getMarketingAreasCountAsync**
> Int32Envelope getMarketingAreasCountAsync(tenantId, apiVersion, xApiVersion)

Count marketing areas

Counts marketing areas for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingAreasApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getMarketingAreasCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingAreasApi#getMarketingAreasCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingAreasApi#getMarketingAreasCountAsync")
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

<a id="updateMarketingAreaAsync"></a>
# **updateMarketingAreaAsync**
> EmptyEnvelope updateMarketingAreaAsync(marketingAreaId, tenantId, apiVersion, xApiVersion, marketingAreaUpdateDto)

Update a marketing area

Updates an existing marketing area for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MarketingAreasApi()
val marketingAreaId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val marketingAreaUpdateDto : MarketingAreaUpdateDto =  // MarketingAreaUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateMarketingAreaAsync(marketingAreaId, tenantId, apiVersion, xApiVersion, marketingAreaUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MarketingAreasApi#updateMarketingAreaAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MarketingAreasApi#updateMarketingAreaAsync")
    e.printStackTrace()
}
```

### Parameters
| **marketingAreaId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **marketingAreaUpdateDto** | [**MarketingAreaUpdateDto**](MarketingAreaUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

