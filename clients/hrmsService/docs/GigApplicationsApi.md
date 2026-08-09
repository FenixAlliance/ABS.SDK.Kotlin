# GigApplicationsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**acceptGigApplicationAsync**](GigApplicationsApi.md#acceptGigApplicationAsync) | **POST** /api/v2/HrmsService/GigApplications/{gigApplicationId}/Accept | Accept a gig application |
| [**createGigApplicationAsync**](GigApplicationsApi.md#createGigApplicationAsync) | **POST** /api/v2/HrmsService/GigApplications | Create a gig application |
| [**deleteGigApplicationAsync**](GigApplicationsApi.md#deleteGigApplicationAsync) | **DELETE** /api/v2/HrmsService/GigApplications/{gigApplicationId} | Delete a gig application |
| [**getGigApplicationByIdAsync**](GigApplicationsApi.md#getGigApplicationByIdAsync) | **GET** /api/v2/HrmsService/GigApplications/{gigApplicationId} | Get gig application by ID |
| [**getGigApplicationsAsync**](GigApplicationsApi.md#getGigApplicationsAsync) | **GET** /api/v2/HrmsService/GigApplications | Get gig applications |
| [**getGigApplicationsCountAsync**](GigApplicationsApi.md#getGigApplicationsCountAsync) | **GET** /api/v2/HrmsService/GigApplications/Count | Count gig applications |
| [**patchGigApplicationAsync**](GigApplicationsApi.md#patchGigApplicationAsync) | **PATCH** /api/v2/HrmsService/GigApplications/{gigApplicationId} | Patch a gig application |
| [**updateGigApplicationAsync**](GigApplicationsApi.md#updateGigApplicationAsync) | **PUT** /api/v2/HrmsService/GigApplications/{gigApplicationId} | Update a gig application |


<a id="acceptGigApplicationAsync"></a>
# **acceptGigApplicationAsync**
> EmptyEnvelope acceptGigApplicationAsync(gigApplicationId, tenantId, apiVersion, xApiVersion)

Accept a gig application

Accepts the candidate&#39;s gig proposal, forming an engagement (raises GigApplicationAccepted). A proposal cannot be accepted twice.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigApplicationsApi()
val gigApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.acceptGigApplicationAsync(gigApplicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigApplicationsApi#acceptGigApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigApplicationsApi#acceptGigApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **gigApplicationId** | **java.util.UUID**|  | |
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

<a id="createGigApplicationAsync"></a>
# **createGigApplicationAsync**
> EmptyEnvelope createGigApplicationAsync(tenantId, apiVersion, xApiVersion, gigApplicationCreateDto)

Create a gig application

Records a candidate&#39;s proposal against one of the tenant&#39;s gigs. The targeted gig must belong to the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val gigApplicationCreateDto : GigApplicationCreateDto =  // GigApplicationCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createGigApplicationAsync(tenantId, apiVersion, xApiVersion, gigApplicationCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigApplicationsApi#createGigApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigApplicationsApi#createGigApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gigApplicationCreateDto** | [**GigApplicationCreateDto**](GigApplicationCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteGigApplicationAsync"></a>
# **deleteGigApplicationAsync**
> EmptyEnvelope deleteGigApplicationAsync(gigApplicationId, tenantId, apiVersion, xApiVersion)

Delete a gig application

Removes a proposal submitted against one of the tenant&#39;s gigs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigApplicationsApi()
val gigApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteGigApplicationAsync(gigApplicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigApplicationsApi#deleteGigApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigApplicationsApi#deleteGigApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **gigApplicationId** | **java.util.UUID**|  | |
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

<a id="getGigApplicationByIdAsync"></a>
# **getGigApplicationByIdAsync**
> GigApplicationDtoEnvelope getGigApplicationByIdAsync(gigApplicationId, tenantId, apiVersion, xApiVersion)

Get gig application by ID

Retrieves a specific proposal submitted against one of the tenant&#39;s gigs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigApplicationsApi()
val gigApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : GigApplicationDtoEnvelope = apiInstance.getGigApplicationByIdAsync(gigApplicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigApplicationsApi#getGigApplicationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigApplicationsApi#getGigApplicationByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **gigApplicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**GigApplicationDtoEnvelope**](GigApplicationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGigApplicationsAsync"></a>
# **getGigApplicationsAsync**
> GigApplicationDtoListEnvelope getGigApplicationsAsync(tenantId, apiVersion, xApiVersion, gigApplicationDtoCollectionQueryParameters)

Get gig applications

Retrieves proposals submitted against the tenant&#39;s gigs. Filter with &#x60;$filter&#x3D;GigId eq &#39;...&#39;&#x60; or &#x60;JobApplicantProfileId eq &#39;...&#39;&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val gigApplicationDtoCollectionQueryParameters : GigApplicationDtoCollectionQueryParameters =  // GigApplicationDtoCollectionQueryParameters | 
try {
    val result : GigApplicationDtoListEnvelope = apiInstance.getGigApplicationsAsync(tenantId, apiVersion, xApiVersion, gigApplicationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigApplicationsApi#getGigApplicationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigApplicationsApi#getGigApplicationsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gigApplicationDtoCollectionQueryParameters** | [**GigApplicationDtoCollectionQueryParameters**](GigApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**GigApplicationDtoListEnvelope**](GigApplicationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getGigApplicationsCountAsync"></a>
# **getGigApplicationsCountAsync**
> Int32Envelope getGigApplicationsCountAsync(tenantId, apiVersion, xApiVersion, gigApplicationDtoCollectionQueryParameters)

Count gig applications

Counts proposals submitted against the tenant&#39;s gigs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val gigApplicationDtoCollectionQueryParameters : GigApplicationDtoCollectionQueryParameters =  // GigApplicationDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getGigApplicationsCountAsync(tenantId, apiVersion, xApiVersion, gigApplicationDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigApplicationsApi#getGigApplicationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigApplicationsApi#getGigApplicationsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gigApplicationDtoCollectionQueryParameters** | [**GigApplicationDtoCollectionQueryParameters**](GigApplicationDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchGigApplicationAsync"></a>
# **patchGigApplicationAsync**
> EmptyEnvelope patchGigApplicationAsync(gigApplicationId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch a gig application

Partially updates an existing proposal submitted against one of the tenant&#39;s gigs.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigApplicationsApi()
val gigApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchGigApplicationAsync(gigApplicationId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigApplicationsApi#patchGigApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigApplicationsApi#patchGigApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **gigApplicationId** | **java.util.UUID**|  | |
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

<a id="updateGigApplicationAsync"></a>
# **updateGigApplicationAsync**
> EmptyEnvelope updateGigApplicationAsync(gigApplicationId, tenantId, apiVersion, xApiVersion, gigApplicationUpdateDto)

Update a gig application

Updates an existing proposal submitted against one of the tenant&#39;s gigs (e.g. accept it).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GigApplicationsApi()
val gigApplicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val gigApplicationUpdateDto : GigApplicationUpdateDto =  // GigApplicationUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateGigApplicationAsync(gigApplicationId, tenantId, apiVersion, xApiVersion, gigApplicationUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GigApplicationsApi#updateGigApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GigApplicationsApi#updateGigApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **gigApplicationId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **gigApplicationUpdateDto** | [**GigApplicationUpdateDto**](GigApplicationUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

