# GigsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createGigAsync**](GigsApi.md#createGigAsync) | **POST** /api/v2/HrmsService/Gigs | Create a gig |
| [**deleteGigAsync**](GigsApi.md#deleteGigAsync) | **DELETE** /api/v2/HrmsService/Gigs/{gigId} | Delete a gig |
| [**getGigByIdAsync**](GigsApi.md#getGigByIdAsync) | **GET** /api/v2/HrmsService/Gigs/{gigId} | Get gig by ID |
| [**getGigsAsync**](GigsApi.md#getGigsAsync) | **GET** /api/v2/HrmsService/Gigs | Get gigs |
| [**getGigsCountAsync**](GigsApi.md#getGigsCountAsync) | **GET** /api/v2/HrmsService/Gigs/Count | Count gigs |
| [**updateGigAsync**](GigsApi.md#updateGigAsync) | **PUT** /api/v2/HrmsService/Gigs/{gigId} | Update a gig |


<a id="createGigAsync"></a>
# **createGigAsync**
> EmptyEnvelope createGigAsync(tenantId, apiVersion, xApiVersion, gigCreateDto)

Create a gig

Creates a new gig for the specified tenant.

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
    val result : EmptyEnvelope = apiInstance.createGigAsync(tenantId, apiVersion, xApiVersion, gigCreateDto)
    println(result)
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteGigAsync"></a>
# **deleteGigAsync**
> EmptyEnvelope deleteGigAsync(gigId, tenantId, apiVersion, xApiVersion)

Delete a gig

Deletes a gig for the specified tenant.

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
    val result : EmptyEnvelope = apiInstance.deleteGigAsync(gigId, tenantId, apiVersion, xApiVersion)
    println(result)
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGigByIdAsync"></a>
# **getGigByIdAsync**
> GigDtoEnvelope getGigByIdAsync(gigId, tenantId, apiVersion, xApiVersion)

Get gig by ID

Retrieves a specific gig by its identifier.

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGigsAsync"></a>
# **getGigsAsync**
> GigDtoListEnvelope getGigsAsync(tenantId, apiVersion, xApiVersion)

Get gigs

Retrieves gigs for the specified tenant.

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGigsCountAsync"></a>
# **getGigsCountAsync**
> Int32Envelope getGigsCountAsync(tenantId, apiVersion, xApiVersion)

Count gigs

Counts gigs for the specified tenant.

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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateGigAsync"></a>
# **updateGigAsync**
> EmptyEnvelope updateGigAsync(gigId, tenantId, apiVersion, xApiVersion, gigUpdateDto)

Update a gig

Updates an existing gig for the specified tenant.

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
val gigUpdateDto : GigUpdateDto =  // GigUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateGigAsync(gigId, tenantId, apiVersion, xApiVersion, gigUpdateDto)
    println(result)
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
| **gigUpdateDto** | [**GigUpdateDto**](GigUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

