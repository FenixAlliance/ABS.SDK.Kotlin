# JobOffersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**closeJobOfferAsync**](JobOffersApi.md#closeJobOfferAsync) | **POST** /api/v2/HrmsService/JobOffers/{jobOfferId}/Close | Close a job offer |
| [**createJobOfferAsync**](JobOffersApi.md#createJobOfferAsync) | **POST** /api/v2/HrmsService/JobOffers | Create a job offer |
| [**deleteJobOfferAsync**](JobOffersApi.md#deleteJobOfferAsync) | **DELETE** /api/v2/HrmsService/JobOffers/{jobOfferId} | Delete a job offer |
| [**fillJobOfferAsync**](JobOffersApi.md#fillJobOfferAsync) | **POST** /api/v2/HrmsService/JobOffers/{jobOfferId}/Fill | Mark a job offer filled |
| [**getJobOfferByIdAsync**](JobOffersApi.md#getJobOfferByIdAsync) | **GET** /api/v2/HrmsService/JobOffers/{jobOfferId} | Get job offer by ID |
| [**getJobOffersAsync**](JobOffersApi.md#getJobOffersAsync) | **GET** /api/v2/HrmsService/JobOffers | Get job offers |
| [**getJobOffersCountAsync**](JobOffersApi.md#getJobOffersCountAsync) | **GET** /api/v2/HrmsService/JobOffers/Count | Count job offers |
| [**getPublicJobOfferByIdAsync**](JobOffersApi.md#getPublicJobOfferByIdAsync) | **GET** /api/v2/HrmsService/JobOffers/Public/{jobOfferId} | Get public job offer by ID |
| [**getPublicJobOffersAsync**](JobOffersApi.md#getPublicJobOffersAsync) | **GET** /api/v2/HrmsService/JobOffers/Public | Get public job offers |
| [**getPublicJobOffersCountAsync**](JobOffersApi.md#getPublicJobOffersCountAsync) | **GET** /api/v2/HrmsService/JobOffers/Public/Count | Count public job offers |
| [**patchJobOfferAsync**](JobOffersApi.md#patchJobOfferAsync) | **PATCH** /api/v2/HrmsService/JobOffers/{jobOfferId} | Patch a job offer |
| [**publishJobOfferAsync**](JobOffersApi.md#publishJobOfferAsync) | **POST** /api/v2/HrmsService/JobOffers/{jobOfferId}/Publish | Publish a job offer |
| [**updateJobOfferAsync**](JobOffersApi.md#updateJobOfferAsync) | **PUT** /api/v2/HrmsService/JobOffers/{jobOfferId} | Update a job offer |


<a id="closeJobOfferAsync"></a>
# **closeJobOfferAsync**
> EmptyEnvelope closeJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion)

Close a job offer

Closes the job offer without a hire and removes it from the public board (raises JobOfferClosed).

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
    val result : EmptyEnvelope = apiInstance.closeJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#closeJobOfferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#closeJobOfferAsync")
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

<a id="fillJobOfferAsync"></a>
# **fillJobOfferAsync**
> EmptyEnvelope fillJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion)

Mark a job offer filled

Marks the offer filled — converted to a hire — and removes it from the public board (raises JobOfferFilled).

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
    val result : EmptyEnvelope = apiInstance.fillJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#fillJobOfferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#fillJobOfferAsync")
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

<a id="getPublicJobOfferByIdAsync"></a>
# **getPublicJobOfferByIdAsync**
> JobOfferDtoEnvelope getPublicJobOfferByIdAsync(jobOfferId, tenantId, apiVersion, xApiVersion)

Get public job offer by ID

Retrieves a published job offer by its identifier for the Talent Portal. Anonymous; optionally scoped to a tenant.

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
    val result : JobOfferDtoEnvelope = apiInstance.getPublicJobOfferByIdAsync(jobOfferId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#getPublicJobOfferByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#getPublicJobOfferByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **jobOfferId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="getPublicJobOffersAsync"></a>
# **getPublicJobOffersAsync**
> JobOfferDtoListEnvelope getPublicJobOffersAsync(tenantId, apiVersion, xApiVersion)

Get public job offers

Retrieves published job offers for the Talent Portal. Anonymous; optionally scoped to a single tenant.

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
    val result : JobOfferDtoListEnvelope = apiInstance.getPublicJobOffersAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#getPublicJobOffersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#getPublicJobOffersAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="getPublicJobOffersCountAsync"></a>
# **getPublicJobOffersCountAsync**
> Int32Envelope getPublicJobOffersCountAsync(tenantId, apiVersion, xApiVersion)

Count public job offers

Counts published job offers for the Talent Portal. Anonymous; optionally scoped to a single tenant.

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
    val result : Int32Envelope = apiInstance.getPublicJobOffersCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#getPublicJobOffersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#getPublicJobOffersCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="patchJobOfferAsync"></a>
# **patchJobOfferAsync**
> EmptyEnvelope patchJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion, operation)

Patch a job offer

Partially updates an existing job offer for the specified tenant.

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
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#patchJobOfferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#patchJobOfferAsync")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="publishJobOfferAsync"></a>
# **publishJobOfferAsync**
> EmptyEnvelope publishJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion)

Publish a job offer

Publishes the job offer to the public Talent Portal (raises JobOfferPublished).

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
    val result : EmptyEnvelope = apiInstance.publishJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling JobOffersApi#publishJobOfferAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling JobOffersApi#publishJobOfferAsync")
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

<a id="updateJobOfferAsync"></a>
# **updateJobOfferAsync**
> EmptyEnvelope updateJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion, jobOfferUpdateDto)

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
val jobOfferUpdateDto : JobOfferUpdateDto =  // JobOfferUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateJobOfferAsync(jobOfferId, tenantId, apiVersion, xApiVersion, jobOfferUpdateDto)
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
| **jobOfferUpdateDto** | [**JobOfferUpdateDto**](JobOfferUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

