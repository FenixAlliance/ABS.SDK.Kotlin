# GigsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createGigAsync**](GigsApi.md#createGigAsync) | **POST** /api/v2/HrmsService/Gigs |  |
| [**deleteGigAsync**](GigsApi.md#deleteGigAsync) | **DELETE** /api/v2/HrmsService/Gigs/{gigId} |  |
| [**getGigByIdAsync**](GigsApi.md#getGigByIdAsync) | **GET** /api/v2/HrmsService/Gigs/{gigId} |  |
| [**getGigsAsync**](GigsApi.md#getGigsAsync) | **GET** /api/v2/HrmsService/Gigs |  |
| [**getGigsCountAsync**](GigsApi.md#getGigsCountAsync) | **GET** /api/v2/HrmsService/Gigs/Count |  |
| [**updateGigAsync**](GigsApi.md#updateGigAsync) | **PUT** /api/v2/HrmsService/Gigs/{gigId} |  |


<a id="createGigAsync"></a>
# **createGigAsync**
> createGigAsync(tenantId, apiVersion, xApiVersion, gigCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val gigCreateDto : GigCreateDto =  // GigCreateDto | 
try {
    apiInstance.createGigAsync(tenantId, apiVersion, xApiVersion, gigCreateDto)
} catch (e: ClientException) {
    println("4xx response calling GigsApi#createGigAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigsApi#createGigAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gigCreateDto** | [**GigCreateDto**](GigCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteGigAsync"></a>
# **deleteGigAsync**
> deleteGigAsync(gigId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigsApi()
val gigId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteGigAsync(gigId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling GigsApi#deleteGigAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigsApi#deleteGigAsync")
    e.printStackTrace()
}
```

### Parameters
| **gigId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGigByIdAsync"></a>
# **getGigByIdAsync**
> GigDtoEnvelope getGigByIdAsync(gigId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigsApi()
val gigId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : GigDtoEnvelope = apiInstance.getGigByIdAsync(gigId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigsApi#getGigByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigsApi#getGigByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **gigId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**GigDtoEnvelope**](GigDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGigsAsync"></a>
# **getGigsAsync**
> GigDtoListEnvelope getGigsAsync(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : GigDtoListEnvelope = apiInstance.getGigsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigsApi#getGigsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigsApi#getGigsAsync")
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

[**GigDtoListEnvelope**](GigDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGigsCountAsync"></a>
# **getGigsCountAsync**
> Int32Envelope getGigsCountAsync(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getGigsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigsApi#getGigsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigsApi#getGigsCountAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateGigAsync"></a>
# **updateGigAsync**
> updateGigAsync(gigId, tenantId, apiVersion, xApiVersion, body)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigsApi()
val gigId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    apiInstance.updateGigAsync(gigId, tenantId, apiVersion, xApiVersion, body)
} catch (e: ClientException) {
    println("4xx response calling GigsApi#updateGigAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigsApi#updateGigAsync")
    e.printStackTrace()
}
```

### Parameters
| **gigId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

