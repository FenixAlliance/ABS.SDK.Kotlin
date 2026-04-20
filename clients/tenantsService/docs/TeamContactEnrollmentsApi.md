# TeamContactEnrollmentsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantTeamContactEnrollment**](TeamContactEnrollmentsApi.md#createTenantTeamContactEnrollment) | **POST** /api/v2/TenantsService/TeamContactEnrollments | Create a new tenant team contact enrollment |
| [**deleteTenantTeamContactEnrollment**](TeamContactEnrollmentsApi.md#deleteTenantTeamContactEnrollment) | **DELETE** /api/v2/TenantsService/TeamContactEnrollments/{tenantTeamContactEnrollmentId} | Delete a tenant team contact enrollment |
| [**getTenantTeamContactEnrollmentById**](TeamContactEnrollmentsApi.md#getTenantTeamContactEnrollmentById) | **GET** /api/v2/TenantsService/TeamContactEnrollments/{tenantTeamContactEnrollmentId} | Retrieve a single tenant team contact enrollment by its ID |
| [**getTenantTeamContactEnrollments**](TeamContactEnrollmentsApi.md#getTenantTeamContactEnrollments) | **GET** /api/v2/TenantsService/TeamContactEnrollments | Retrieve a list of tenant team contact enrollments |
| [**getTenantTeamContactEnrollmentsCount**](TeamContactEnrollmentsApi.md#getTenantTeamContactEnrollmentsCount) | **GET** /api/v2/TenantsService/TeamContactEnrollments/Count | Get the count of tenant team contact enrollments |
| [**updateTenantTeamContactEnrollment**](TeamContactEnrollmentsApi.md#updateTenantTeamContactEnrollment) | **PUT** /api/v2/TenantsService/TeamContactEnrollments/{tenantTeamContactEnrollmentId} | Update a tenant team contact enrollment |


<a id="createTenantTeamContactEnrollment"></a>
# **createTenantTeamContactEnrollment**
> EmptyEnvelope createTenantTeamContactEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamContactEnrollmentCreateDto)

Create a new tenant team contact enrollment

Create a new tenant team contact enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamContactEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamContactEnrollmentCreateDto : TenantTeamContactEnrollmentCreateDto =  // TenantTeamContactEnrollmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantTeamContactEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamContactEnrollmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamContactEnrollmentsApi#createTenantTeamContactEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamContactEnrollmentsApi#createTenantTeamContactEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamContactEnrollmentCreateDto** | [**TenantTeamContactEnrollmentCreateDto**](TenantTeamContactEnrollmentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantTeamContactEnrollment"></a>
# **deleteTenantTeamContactEnrollment**
> EmptyEnvelope deleteTenantTeamContactEnrollment(tenantTeamContactEnrollmentId, tenantId, apiVersion, xApiVersion)

Delete a tenant team contact enrollment

Delete a tenant team contact enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamContactEnrollmentsApi()
val tenantTeamContactEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantTeamContactEnrollment(tenantTeamContactEnrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamContactEnrollmentsApi#deleteTenantTeamContactEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamContactEnrollmentsApi#deleteTenantTeamContactEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamContactEnrollmentId** | **java.util.UUID**|  | |
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

<a id="getTenantTeamContactEnrollmentById"></a>
# **getTenantTeamContactEnrollmentById**
> TenantTeamContactEnrollmentDtoEnvelope getTenantTeamContactEnrollmentById(tenantTeamContactEnrollmentId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant team contact enrollment by its ID

Retrieve a single tenant team contact enrollment by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamContactEnrollmentsApi()
val tenantTeamContactEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamContactEnrollmentDtoEnvelope = apiInstance.getTenantTeamContactEnrollmentById(tenantTeamContactEnrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollmentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollmentById")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamContactEnrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantTeamContactEnrollmentDtoEnvelope**](TenantTeamContactEnrollmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTeamContactEnrollments"></a>
# **getTenantTeamContactEnrollments**
> TenantTeamContactEnrollmentDtoListEnvelope getTenantTeamContactEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant team contact enrollments

Retrieve a list of tenant team contact enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamContactEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamContactEnrollmentDtoListEnvelope = apiInstance.getTenantTeamContactEnrollments(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollments")
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

[**TenantTeamContactEnrollmentDtoListEnvelope**](TenantTeamContactEnrollmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantTeamContactEnrollmentsCount"></a>
# **getTenantTeamContactEnrollmentsCount**
> Int32Envelope getTenantTeamContactEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant team contact enrollments

Get the count of tenant team contact enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamContactEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantTeamContactEnrollmentsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollmentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamContactEnrollmentsApi#getTenantTeamContactEnrollmentsCount")
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

<a id="updateTenantTeamContactEnrollment"></a>
# **updateTenantTeamContactEnrollment**
> EmptyEnvelope updateTenantTeamContactEnrollment(tenantTeamContactEnrollmentId, tenantId, apiVersion, xApiVersion, tenantTeamContactEnrollmentUpdateDto)

Update a tenant team contact enrollment

Update a tenant team contact enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TeamContactEnrollmentsApi()
val tenantTeamContactEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamContactEnrollmentUpdateDto : TenantTeamContactEnrollmentUpdateDto =  // TenantTeamContactEnrollmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantTeamContactEnrollment(tenantTeamContactEnrollmentId, tenantId, apiVersion, xApiVersion, tenantTeamContactEnrollmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TeamContactEnrollmentsApi#updateTenantTeamContactEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TeamContactEnrollmentsApi#updateTenantTeamContactEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantTeamContactEnrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamContactEnrollmentUpdateDto** | [**TenantTeamContactEnrollmentUpdateDto**](TenantTeamContactEnrollmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

