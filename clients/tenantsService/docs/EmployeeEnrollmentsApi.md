# EmployeeEnrollmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantEmployeeEnrollment**](EmployeeEnrollmentsApi.md#createTenantEmployeeEnrollment) | **POST** /api/v2/TenantsService/EmployeeEnrollments | Create a new tenant employee enrollment |
| [**deleteTenantEmployeeEnrollment**](EmployeeEnrollmentsApi.md#deleteTenantEmployeeEnrollment) | **DELETE** /api/v2/TenantsService/EmployeeEnrollments/{tenantEmployeeEnrollmentId} | Delete a tenant employee enrollment |
| [**getTenantEmployeeEnrollmentById**](EmployeeEnrollmentsApi.md#getTenantEmployeeEnrollmentById) | **GET** /api/v2/TenantsService/EmployeeEnrollments/{tenantEmployeeEnrollmentId} | Retrieve a single tenant employee enrollment by its ID |
| [**getTenantEmployeeEnrollments**](EmployeeEnrollmentsApi.md#getTenantEmployeeEnrollments) | **GET** /api/v2/TenantsService/EmployeeEnrollments | Retrieve a list of tenant employee enrollments |
| [**getTenantEmployeeEnrollmentsCount**](EmployeeEnrollmentsApi.md#getTenantEmployeeEnrollmentsCount) | **GET** /api/v2/TenantsService/EmployeeEnrollments/Count | Get the count of tenant employee enrollments |
| [**updateTenantEmployeeEnrollment**](EmployeeEnrollmentsApi.md#updateTenantEmployeeEnrollment) | **PUT** /api/v2/TenantsService/EmployeeEnrollments/{tenantEmployeeEnrollmentId} | Update a tenant employee enrollment |


<a id="createTenantEmployeeEnrollment"></a>
# **createTenantEmployeeEnrollment**
> EmptyEnvelope createTenantEmployeeEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamEmployeeEnrollmentCreateDto)

Create a new tenant employee enrollment

Create a new tenant employee enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamEmployeeEnrollmentCreateDto : TenantTeamEmployeeEnrollmentCreateDto =  // TenantTeamEmployeeEnrollmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantEmployeeEnrollment(tenantId, apiVersion, xApiVersion, tenantTeamEmployeeEnrollmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeEnrollmentsApi#createTenantEmployeeEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeEnrollmentsApi#createTenantEmployeeEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamEmployeeEnrollmentCreateDto** | [**TenantTeamEmployeeEnrollmentCreateDto**](TenantTeamEmployeeEnrollmentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantEmployeeEnrollment"></a>
# **deleteTenantEmployeeEnrollment**
> EmptyEnvelope deleteTenantEmployeeEnrollment(tenantEmployeeEnrollmentId, tenantId, apiVersion, xApiVersion)

Delete a tenant employee enrollment

Delete a tenant employee enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeEnrollmentsApi()
val tenantEmployeeEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantEmployeeEnrollment(tenantEmployeeEnrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeEnrollmentsApi#deleteTenantEmployeeEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeEnrollmentsApi#deleteTenantEmployeeEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantEmployeeEnrollmentId** | **java.util.UUID**|  | |
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

<a id="getTenantEmployeeEnrollmentById"></a>
# **getTenantEmployeeEnrollmentById**
> TenantTeamEmployeeEnrollmentDtoEnvelope getTenantEmployeeEnrollmentById(tenantEmployeeEnrollmentId, tenantId, apiVersion, xApiVersion)

Retrieve a single tenant employee enrollment by its ID

Retrieve a single tenant employee enrollment by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeEnrollmentsApi()
val tenantEmployeeEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamEmployeeEnrollmentDtoEnvelope = apiInstance.getTenantEmployeeEnrollmentById(tenantEmployeeEnrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollmentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollmentById")
    e.printStackTrace()
}
```

### Parameters
| **tenantEmployeeEnrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantTeamEmployeeEnrollmentDtoEnvelope**](TenantTeamEmployeeEnrollmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantEmployeeEnrollments"></a>
# **getTenantEmployeeEnrollments**
> TenantTeamEmployeeEnrollmentDtoListEnvelope getTenantEmployeeEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant employee enrollments

Retrieve a list of tenant employee enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantTeamEmployeeEnrollmentDtoListEnvelope = apiInstance.getTenantEmployeeEnrollments(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollments")
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

[**TenantTeamEmployeeEnrollmentDtoListEnvelope**](TenantTeamEmployeeEnrollmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantEmployeeEnrollmentsCount"></a>
# **getTenantEmployeeEnrollmentsCount**
> Int32Envelope getTenantEmployeeEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant employee enrollments

Get the count of tenant employee enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeEnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantEmployeeEnrollmentsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollmentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeEnrollmentsApi#getTenantEmployeeEnrollmentsCount")
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

<a id="updateTenantEmployeeEnrollment"></a>
# **updateTenantEmployeeEnrollment**
> EmptyEnvelope updateTenantEmployeeEnrollment(tenantEmployeeEnrollmentId, tenantId, apiVersion, xApiVersion, tenantTeamEmployeeEnrollmentUpdateDto)

Update a tenant employee enrollment

Update a tenant employee enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmployeeEnrollmentsApi()
val tenantEmployeeEnrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantTeamEmployeeEnrollmentUpdateDto : TenantTeamEmployeeEnrollmentUpdateDto =  // TenantTeamEmployeeEnrollmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantEmployeeEnrollment(tenantEmployeeEnrollmentId, tenantId, apiVersion, xApiVersion, tenantTeamEmployeeEnrollmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmployeeEnrollmentsApi#updateTenantEmployeeEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmployeeEnrollmentsApi#updateTenantEmployeeEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantEmployeeEnrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantTeamEmployeeEnrollmentUpdateDto** | [**TenantTeamEmployeeEnrollmentUpdateDto**](TenantTeamEmployeeEnrollmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

