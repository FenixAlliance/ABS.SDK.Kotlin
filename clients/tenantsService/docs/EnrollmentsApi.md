# EnrollmentsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTenantEnrollment**](EnrollmentsApi.md#createTenantEnrollment) | **POST** /api/v2/TenantsService/Enrollments | Create a new tenant enrollment |
| [**deleteTenantEnrollment**](EnrollmentsApi.md#deleteTenantEnrollment) | **DELETE** /api/v2/TenantsService/Enrollments/{enrollmentId} | Delete a tenant enrollment |
| [**getExtendedTenantEnrollments**](EnrollmentsApi.md#getExtendedTenantEnrollments) | **GET** /api/v2/TenantsService/Enrollments/Extended | Retrieve a list of tenant enrollments |
| [**getExtendedTenantEnrollmentsCount**](EnrollmentsApi.md#getExtendedTenantEnrollmentsCount) | **GET** /api/v2/TenantsService/Enrollments/Extended/Count | Get the count of tenant enrollments |
| [**getTenantEnrollmentById**](EnrollmentsApi.md#getTenantEnrollmentById) | **GET** /api/v2/TenantsService/Enrollments/{enrollmentId} | Retrieve a single tenant enrollment by its ID |
| [**getTenantEnrollments**](EnrollmentsApi.md#getTenantEnrollments) | **GET** /api/v2/TenantsService/Enrollments | Retrieve a list of tenant enrollments |
| [**getTenantEnrollmentsCount**](EnrollmentsApi.md#getTenantEnrollmentsCount) | **GET** /api/v2/TenantsService/Enrollments/Count | Get the count of tenant enrollments |
| [**updateTenantEnrollment**](EnrollmentsApi.md#updateTenantEnrollment) | **PUT** /api/v2/TenantsService/Enrollments/{enrollmentId} | Update a tenant enrollment |


<a id="createTenantEnrollment"></a>
# **createTenantEnrollment**
> EmptyEnvelope createTenantEnrollment(tenantId, apiVersion, xApiVersion, tenantEnrollmentCreateDto)

Create a new tenant enrollment

Create a new tenant enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantEnrollmentCreateDto : TenantEnrollmentCreateDto =  // TenantEnrollmentCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantEnrollment(tenantId, apiVersion, xApiVersion, tenantEnrollmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnrollmentsApi#createTenantEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnrollmentsApi#createTenantEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantEnrollmentCreateDto** | [**TenantEnrollmentCreateDto**](TenantEnrollmentCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTenantEnrollment"></a>
# **deleteTenantEnrollment**
> EmptyEnvelope deleteTenantEnrollment(enrollmentId, tenantId, apiVersion, xApiVersion)

Delete a tenant enrollment

Delete a tenant enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnrollmentsApi()
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantEnrollment(enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnrollmentsApi#deleteTenantEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnrollmentsApi#deleteTenantEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **enrollmentId** | **java.util.UUID**|  | |
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

<a id="getExtendedTenantEnrollments"></a>
# **getExtendedTenantEnrollments**
> TenantEnrollmentDtoListEnvelope getExtendedTenantEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant enrollments

Retrieve a list of tenant enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrollmentDtoListEnvelope = apiInstance.getExtendedTenantEnrollments(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnrollmentsApi#getExtendedTenantEnrollments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnrollmentsApi#getExtendedTenantEnrollments")
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

[**TenantEnrollmentDtoListEnvelope**](TenantEnrollmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedTenantEnrollmentsCount"></a>
# **getExtendedTenantEnrollmentsCount**
> Int32Envelope getExtendedTenantEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant enrollments

Get the count of tenant enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getExtendedTenantEnrollmentsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnrollmentsApi#getExtendedTenantEnrollmentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnrollmentsApi#getExtendedTenantEnrollmentsCount")
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

<a id="getTenantEnrollmentById"></a>
# **getTenantEnrollmentById**
> TenantEnrollmentDtoEnvelope getTenantEnrollmentById(enrollmentId, tenantId, userId, apiVersion, xApiVersion)

Retrieve a single tenant enrollment by its ID

Retrieve a single tenant enrollment by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnrollmentsApi()
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrollmentDtoEnvelope = apiInstance.getTenantEnrollmentById(enrollmentId, tenantId, userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnrollmentsApi#getTenantEnrollmentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnrollmentsApi#getTenantEnrollmentById")
    e.printStackTrace()
}
```

### Parameters
| **enrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **userId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantEnrollmentDtoEnvelope**](TenantEnrollmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantEnrollments"></a>
# **getTenantEnrollments**
> TenantEnrollmentDtoListEnvelope getTenantEnrollments(tenantId, apiVersion, xApiVersion)

Retrieve a list of tenant enrollments

Retrieve a list of tenant enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrollmentDtoListEnvelope = apiInstance.getTenantEnrollments(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnrollmentsApi#getTenantEnrollments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnrollmentsApi#getTenantEnrollments")
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

[**TenantEnrollmentDtoListEnvelope**](TenantEnrollmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantEnrollmentsCount"></a>
# **getTenantEnrollmentsCount**
> Int32Envelope getTenantEnrollmentsCount(tenantId, apiVersion, xApiVersion)

Get the count of tenant enrollments

Get the count of tenant enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnrollmentsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantEnrollmentsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnrollmentsApi#getTenantEnrollmentsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnrollmentsApi#getTenantEnrollmentsCount")
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

<a id="updateTenantEnrollment"></a>
# **updateTenantEnrollment**
> EmptyEnvelope updateTenantEnrollment(enrollmentId, tenantId, apiVersion, xApiVersion, tenantEnrollmentUpdateDto)

Update a tenant enrollment

Update a tenant enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EnrollmentsApi()
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantEnrollmentUpdateDto : TenantEnrollmentUpdateDto =  // TenantEnrollmentUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantEnrollment(enrollmentId, tenantId, apiVersion, xApiVersion, tenantEnrollmentUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EnrollmentsApi#updateTenantEnrollment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EnrollmentsApi#updateTenantEnrollment")
    e.printStackTrace()
}
```

### Parameters
| **enrollmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantEnrollmentUpdateDto** | [**TenantEnrollmentUpdateDto**](TenantEnrollmentUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

