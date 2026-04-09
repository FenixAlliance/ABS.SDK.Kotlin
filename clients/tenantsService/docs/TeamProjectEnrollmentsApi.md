# TeamProjectEnrollmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantTeamProjectEnrollment**](TeamProjectEnrollmentsApi.md#createTenantTeamProjectEnrollment) | **POST** /api/v2/TenantsService/TeamProjectEnrollments | Create a new tenant team project enrollment |
| [**deleteTenantTeamProjectEnrollment**](TeamProjectEnrollmentsApi.md#deleteTenantTeamProjectEnrollment) | **DELETE** /api/v2/TenantsService/TeamProjectEnrollments/{tenantTeamProjectEnrollmentId} | Delete a tenant team project enrollment |
| [**getTenantTeamProjectEnrollmentById**](TeamProjectEnrollmentsApi.md#getTenantTeamProjectEnrollmentById) | **GET** /api/v2/TenantsService/TeamProjectEnrollments/{tenantTeamProjectEnrollmentId} | Retrieve a single tenant team project enrollment by its ID |
| [**getTenantTeamProjectEnrollments**](TeamProjectEnrollmentsApi.md#getTenantTeamProjectEnrollments) | **GET** /api/v2/TenantsService/TeamProjectEnrollments | Retrieve a list of tenant team project enrollments |
| [**getTenantTeamProjectEnrollmentsCount**](TeamProjectEnrollmentsApi.md#getTenantTeamProjectEnrollmentsCount) | **GET** /api/v2/TenantsService/TeamProjectEnrollments/Count | Get the count of tenant team project enrollments |
| [**updateTenantTeamProjectEnrollment**](TeamProjectEnrollmentsApi.md#updateTenantTeamProjectEnrollment) | **PUT** /api/v2/TenantsService/TeamProjectEnrollments/{tenantTeamProjectEnrollmentId} | Update a tenant team project enrollment |


<a id="createTenantTeamProjectEnrollment"></a>
# **createTenantTeamProjectEnrollment**
> EmptyEnvelope createTenantTeamProjectEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamProjectEnrollmentCreateDto)

Create a new tenant team project enrollment

Create a new tenant team project enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamProjectEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamProjectEnrollmentCreateDto : TenantTeamProjectEnrollmentCreateDto =  // TenantTeamProjectEnrollmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantTeamProjectEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamProjectEnrollmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamProjectEnrollmentsApi#createTenantTeamProjectEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamProjectEnrollmentsApi#createTenantTeamProjectEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamProjectEnrollmentCreateDto** | [**TenantTeamProjectEnrollmentCreateDto**](TenantTeamProjectEnrollmentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantTeamProjectEnrollment"></a>
# **deleteTenantTeamProjectEnrollment**
> EmptyEnvelope deleteTenantTeamProjectEnrollment(tenantTeamProjectEnrollmentId, tenantId, apiVersion, xApiVersion)

Delete a tenant team project enrollment

Delete a tenant team project enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamProjectEnrollmentsApi()
val tenantTeamProjectEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantTeamProjectEnrollment(tenantTeamProjectEnrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamProjectEnrollmentsApi#deleteTenantTeamProjectEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamProjectEnrollmentsApi#deleteTenantTeamProjectEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamProjectEnrollmentId** | **java.util.UUID**|  | |
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

<a id="getTenantTeamProjectEnrollmentById"></a>
# **getTenantTeamProjectEnrollmentById**
> TenantTeamProjectEnrollmentDtoEnvelope getTenantTeamProjectEnrollmentById(tenantTeamProjectEnrollmentId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant team project enrollment by its ID

Retrieve a single tenant team project enrollment by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamProjectEnrollmentsApi()
val tenantTeamProjectEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamProjectEnrollmentDtoEnvelope = apiInstance.getTenantTeamProjectEnrollmentById(tenantTeamProjectEnrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollmentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollmentById")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamProjectEnrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantTeamProjectEnrollmentDtoEnvelope**](TenantTeamProjectEnrollmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTeamProjectEnrollments"></a>
# **getTenantTeamProjectEnrollments**
> TenantTeamProjectEnrollmentDtoListEnvelope getTenantTeamProjectEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant team project enrollments

Retrieve a list of tenant team project enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamProjectEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamProjectEnrollmentDtoListEnvelope = apiInstance.getTenantTeamProjectEnrollments(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollments")
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

[**TenantTeamProjectEnrollmentDtoListEnvelope**](TenantTeamProjectEnrollmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTeamProjectEnrollmentsCount"></a>
# **getTenantTeamProjectEnrollmentsCount**
> Int32Envelope getTenantTeamProjectEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant team project enrollments

Get the count of tenant team project enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamProjectEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantTeamProjectEnrollmentsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollmentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamProjectEnrollmentsApi#getTenantTeamProjectEnrollmentsCount")
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

<a id="updateTenantTeamProjectEnrollment"></a>
# **updateTenantTeamProjectEnrollment**
> EmptyEnvelope updateTenantTeamProjectEnrollment(tenantTeamProjectEnrollmentId, tenantId, apiVersion, xApiVersion, tenantTeamProjectEnrollmentUpdateDto)

Update a tenant team project enrollment

Update a tenant team project enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamProjectEnrollmentsApi()
val tenantTeamProjectEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamProjectEnrollmentUpdateDto : TenantTeamProjectEnrollmentUpdateDto =  // TenantTeamProjectEnrollmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantTeamProjectEnrollment(tenantTeamProjectEnrollmentId, tenantId, apiVersion, xApiVersion, tenantTeamProjectEnrollmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamProjectEnrollmentsApi#updateTenantTeamProjectEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamProjectEnrollmentsApi#updateTenantTeamProjectEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamProjectEnrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamProjectEnrollmentUpdateDto** | [**TenantTeamProjectEnrollmentUpdateDto**](TenantTeamProjectEnrollmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

