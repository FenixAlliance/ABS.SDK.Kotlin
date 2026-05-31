# SegmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantSegment**](SegmentsApi.md#createTenantSegment) | **POST** /api/v2/TenantsService/Segments | Create a new tenant segment |
| [**deleteTenantSegment**](SegmentsApi.md#deleteTenantSegment) | **DELETE** /api/v2/TenantsService/Segments/{tenantSegmentId} | Delete a tenant segment |
| [**getTenantSegmentById**](SegmentsApi.md#getTenantSegmentById) | **GET** /api/v2/TenantsService/Segments/{tenantSegmentId} | Retrieve a single tenant segment by its ID |
| [**getTenantSegments**](SegmentsApi.md#getTenantSegments) | **GET** /api/v2/TenantsService/Segments | Retrieve a list of tenant segments |
| [**getTenantSegmentsCount**](SegmentsApi.md#getTenantSegmentsCount) | **GET** /api/v2/TenantsService/Segments/Count | Get the count of tenant segments |
| [**updateTenantSegment**](SegmentsApi.md#updateTenantSegment) | **PUT** /api/v2/TenantsService/Segments/{tenantSegmentId} | Update a tenant segment |


<a id="createTenantSegment"></a>
# **createTenantSegment**
> EmptyEnvelope createTenantSegment(tenantId, apiVersion, xApiVersion, tenantSegmentCreateDto)

Create a new tenant segment

Create a new tenant segment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantSegmentCreateDto : TenantSegmentCreateDto =  // TenantSegmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantSegment(tenantId, apiVersion, xApiVersion, tenantSegmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#createTenantSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#createTenantSegment")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantSegmentCreateDto** | [**TenantSegmentCreateDto**](TenantSegmentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantSegment"></a>
# **deleteTenantSegment**
> EmptyEnvelope deleteTenantSegment(tenantSegmentId, tenantId, apiVersion, xApiVersion)

Delete a tenant segment

Delete a tenant segment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val tenantSegmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantSegment(tenantSegmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#deleteTenantSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#deleteTenantSegment")
    e.printStackTrace()
}
```

### Parameters
| **tenantSegmentId** | **java.util.UUID**|  | |
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

<a id="getTenantSegmentById"></a>
# **getTenantSegmentById**
> TenantSegmentDtoEnvelope getTenantSegmentById(tenantSegmentId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant segment by its ID

Retrieve a single tenant segment by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val tenantSegmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantSegmentDtoEnvelope = apiInstance.getTenantSegmentById(tenantSegmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getTenantSegmentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getTenantSegmentById")
    e.printStackTrace()
}
```

### Parameters
| **tenantSegmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantSegmentDtoEnvelope**](TenantSegmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantSegments"></a>
# **getTenantSegments**
> TenantSegmentDtoListEnvelope getTenantSegments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant segments

Retrieve a list of tenant segments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantSegmentDtoListEnvelope = apiInstance.getTenantSegments(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getTenantSegments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getTenantSegments")
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

[**TenantSegmentDtoListEnvelope**](TenantSegmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantSegmentsCount"></a>
# **getTenantSegmentsCount**
> Int32Envelope getTenantSegmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant segments

Get the count of tenant segments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantSegmentsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#getTenantSegmentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#getTenantSegmentsCount")
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

<a id="updateTenantSegment"></a>
# **updateTenantSegment**
> EmptyEnvelope updateTenantSegment(tenantSegmentId, tenantId, apiVersion, xApiVersion, tenantSegmentUpdateDto)

Update a tenant segment

Update a tenant segment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SegmentsApi()
val tenantSegmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantSegmentUpdateDto : TenantSegmentUpdateDto =  // TenantSegmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantSegment(tenantSegmentId, tenantId, apiVersion, xApiVersion, tenantSegmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SegmentsApi#updateTenantSegment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SegmentsApi#updateTenantSegment")
    e.printStackTrace()
}
```

### Parameters
| **tenantSegmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantSegmentUpdateDto** | [**TenantSegmentUpdateDto**](TenantSegmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

