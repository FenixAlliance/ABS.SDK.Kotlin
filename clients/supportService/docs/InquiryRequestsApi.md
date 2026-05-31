# InquiryRequestsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createInquiryRequestAsync**](InquiryRequestsApi.md#createInquiryRequestAsync) | **POST** /api/v2/SupportService/InquiryRequests | Create an inquiry request |
| [**deleteInquiryRequestAsync**](InquiryRequestsApi.md#deleteInquiryRequestAsync) | **DELETE** /api/v2/SupportService/InquiryRequests/{inquiryRequestId} | Delete an inquiry request |
| [**getInquiryRequestAsync**](InquiryRequestsApi.md#getInquiryRequestAsync) | **GET** /api/v2/SupportService/InquiryRequests/{inquiryRequestId} | Retrieve an inquiry request by ID |
| [**getInquiryRequestsAsync**](InquiryRequestsApi.md#getInquiryRequestsAsync) | **GET** /api/v2/SupportService/InquiryRequests | Retrieve inquiry requests |
| [**getInquiryRequestsCountAsync**](InquiryRequestsApi.md#getInquiryRequestsCountAsync) | **GET** /api/v2/SupportService/InquiryRequests/Count | Get inquiry requests count |
| [**updateInquiryRequestAsync**](InquiryRequestsApi.md#updateInquiryRequestAsync) | **PUT** /api/v2/SupportService/InquiryRequests/{inquiryRequestId} | Update an inquiry request |


<a id="createInquiryRequestAsync"></a>
# **createInquiryRequestAsync**
> EmptyEnvelope createInquiryRequestAsync(tenantId, apiVersion, xApiVersion, inquiryRequestCreateDto)

Create an inquiry request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InquiryRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inquiryRequestCreateDto : InquiryRequestCreateDto =  // InquiryRequestCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createInquiryRequestAsync(tenantId, apiVersion, xApiVersion, inquiryRequestCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InquiryRequestsApi#createInquiryRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InquiryRequestsApi#createInquiryRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inquiryRequestCreateDto** | [**InquiryRequestCreateDto**](InquiryRequestCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteInquiryRequestAsync"></a>
# **deleteInquiryRequestAsync**
> EmptyEnvelope deleteInquiryRequestAsync(inquiryRequestId, tenantId, apiVersion, xApiVersion)

Delete an inquiry request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InquiryRequestsApi()
val inquiryRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteInquiryRequestAsync(inquiryRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InquiryRequestsApi#deleteInquiryRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InquiryRequestsApi#deleteInquiryRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **inquiryRequestId** | **java.util.UUID**|  | |
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

<a id="getInquiryRequestAsync"></a>
# **getInquiryRequestAsync**
> InquiryRequestDtoEnvelope getInquiryRequestAsync(inquiryRequestId, tenantId, apiVersion, xApiVersion)

Retrieve an inquiry request by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InquiryRequestsApi()
val inquiryRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InquiryRequestDtoEnvelope = apiInstance.getInquiryRequestAsync(inquiryRequestId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InquiryRequestsApi#getInquiryRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InquiryRequestsApi#getInquiryRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **inquiryRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**InquiryRequestDtoEnvelope**](InquiryRequestDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInquiryRequestsAsync"></a>
# **getInquiryRequestsAsync**
> InquiryRequestDtoListEnvelope getInquiryRequestsAsync(tenantId, apiVersion, xApiVersion)

Retrieve inquiry requests

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InquiryRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : InquiryRequestDtoListEnvelope = apiInstance.getInquiryRequestsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InquiryRequestsApi#getInquiryRequestsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InquiryRequestsApi#getInquiryRequestsAsync")
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

[**InquiryRequestDtoListEnvelope**](InquiryRequestDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInquiryRequestsCountAsync"></a>
# **getInquiryRequestsCountAsync**
> Int32Envelope getInquiryRequestsCountAsync(tenantId, apiVersion, xApiVersion)

Get inquiry requests count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InquiryRequestsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getInquiryRequestsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InquiryRequestsApi#getInquiryRequestsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InquiryRequestsApi#getInquiryRequestsCountAsync")
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

<a id="updateInquiryRequestAsync"></a>
# **updateInquiryRequestAsync**
> EmptyEnvelope updateInquiryRequestAsync(inquiryRequestId, tenantId, apiVersion, xApiVersion, inquiryRequestUpdateDto)

Update an inquiry request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = InquiryRequestsApi()
val inquiryRequestId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val inquiryRequestUpdateDto : InquiryRequestUpdateDto =  // InquiryRequestUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateInquiryRequestAsync(inquiryRequestId, tenantId, apiVersion, xApiVersion, inquiryRequestUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling InquiryRequestsApi#updateInquiryRequestAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling InquiryRequestsApi#updateInquiryRequestAsync")
    e.printStackTrace()
}
```

### Parameters
| **inquiryRequestId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **inquiryRequestUpdateDto** | [**InquiryRequestUpdateDto**](InquiryRequestUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

