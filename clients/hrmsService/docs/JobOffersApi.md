# JobOffersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createJobOfferAsync**](JobOffersApi.md#createJobOfferAsync) | **POST** /api/v2/HrmsService/JobOffers | Create a job offer |
| [**deleteJobOfferAsync**](JobOffersApi.md#deleteJobOfferAsync) | **DELETE** /api/v2/HrmsService/JobOffers/{jobOfferId} | Delete a job offer |
| [**getJobOfferByIdAsync**](JobOffersApi.md#getJobOfferByIdAsync) | **GET** /api/v2/HrmsService/JobOffers/{jobOfferId} | Get job offer by ID |
| [**getJobOffersAsync**](JobOffersApi.md#getJobOffersAsync) | **GET** /api/v2/HrmsService/JobOffers | Get job offers |
| [**getJobOffersCountAsync**](JobOffersApi.md#getJobOffersCountAsync) | **GET** /api/v2/HrmsService/JobOffers/Count | Count job offers |
| [**updateJobOfferAsync**](JobOffersApi.md#updateJobOfferAsync) | **PUT** /api/v2/HrmsService/JobOffers/{jobOfferId} | Update a job offer |


<a id="createJobOfferAsync"></a>
# **createJobOfferAsync**
> EmptyEnvelope createJobOfferAsync(tenantId, apiVersion, xApiVersion, jobOfferCreateDto)

Create a job offer

Creates a new job offer for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOffersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val jobOfferCreateDto : JobOfferCreateDto =  // JobOfferCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createJobOfferAsync(tenantId, apiVersion, xApiVersion, jobOfferCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#createJobOfferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#createJobOfferAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **jobOfferCreateDto** | [**JobOfferCreateDto**](JobOfferCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteJobOfferAsync"></a>
# **deleteJobOfferAsync**
> EmptyEnvelope deleteJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion)

Delete a job offer

Deletes a job offer for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOffersApi()
val jobOfferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#deleteJobOfferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#deleteJobOfferAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobOfferId** | **java.util.UUID**|  | |
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

<a id="getJobOfferByIdAsync"></a>
# **getJobOfferByIdAsync**
> JobOfferDtoEnvelope getJobOfferByIdAsync(jobOfferId, tenantId, apiVersion, xApiVersion)

Get job offer by ID

Retrieves a specific job offer by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOffersApi()
val jobOfferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobOfferDtoEnvelope = apiInstance.getJobOfferByIdAsync(jobOfferId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#getJobOfferByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#getJobOfferByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobOfferId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JobOfferDtoEnvelope**](JobOfferDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobOffersAsync"></a>
# **getJobOffersAsync**
> JobOfferDtoListEnvelope getJobOffersAsync(tenantId, apiVersion, xApiVersion)

Get job offers

Retrieves job offers for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOffersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JobOfferDtoListEnvelope = apiInstance.getJobOffersAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#getJobOffersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#getJobOffersAsync")
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

[**JobOfferDtoListEnvelope**](JobOfferDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJobOffersCountAsync"></a>
# **getJobOffersCountAsync**
> Int32Envelope getJobOffersCountAsync(tenantId, apiVersion, xApiVersion)

Count job offers

Counts job offers for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOffersApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getJobOffersCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#getJobOffersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#getJobOffersCountAsync")
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

<a id="updateJobOfferAsync"></a>
# **updateJobOfferAsync**
> EmptyEnvelope updateJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion, body)

Update a job offer

Updates an existing job offer for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = JobOffersApi()
val jobOfferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EmptyEnvelope = apiInstance.updateJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#updateJobOfferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#updateJobOfferAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobOfferId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

