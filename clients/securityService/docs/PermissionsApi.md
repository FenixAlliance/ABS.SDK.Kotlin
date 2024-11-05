# PermissionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SecurityServicePermissionsGet**](PermissionsApi.md#apiV2SecurityServicePermissionsGet) | **GET** /api/v2/SecurityService/Permissions |  |
| [**apiV2SecurityServicePermissionsPost**](PermissionsApi.md#apiV2SecurityServicePermissionsPost) | **POST** /api/v2/SecurityService/Permissions |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Applications/{applicationId} |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Applications/{applicationId} |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdDelete**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdDelete) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId} |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments/{enrollmentId} |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments/{enrollmentId} |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdGet**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdGet) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId} |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdPut**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdPut) | **PUT** /api/v2/SecurityService/Permissions/{securityPermissionId} |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Roles/{securityRoleId} |  |
| [**apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost**](PermissionsApi.md#apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Roles/{securityRoleId} |  |


<a id="apiV2SecurityServicePermissionsGet"></a>
# **apiV2SecurityServicePermissionsGet**
> SecurityRoleDtoListEnvelope apiV2SecurityServicePermissionsGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityRoleDtoListEnvelope = apiInstance.apiV2SecurityServicePermissionsGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsGet")
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

[**SecurityRoleDtoListEnvelope**](SecurityRoleDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsPost"></a>
# **apiV2SecurityServicePermissionsPost**
> EmptyEnvelope apiV2SecurityServicePermissionsPost(tenantId, securityPermissionCreateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val securityPermissionCreateDto : SecurityPermissionCreateDto =  // SecurityPermissionCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsPost(tenantId, securityPermissionCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **securityPermissionCreateDto** | [**SecurityPermissionCreateDto**](SecurityPermissionCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete**
> EmptyEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete(securityPermissionId, applicationId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete(securityPermissionId, applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost**
> EmptyEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost(securityPermissionId, applicationId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost(securityPermissionId, applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdApplicationsApplicationIdPost")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdDelete"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdDelete**
> EmptyEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdDelete(securityPermissionId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdDelete(securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete**
> EmptyEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete(securityPermissionId, enrollmentId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete(securityPermissionId, enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **enrollmentId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost**
> EmptyEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost(securityPermissionId, enrollmentId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost(securityPermissionId, enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsEnrollmentIdPost")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **enrollmentId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet**
> TenantEnrolmentDtoListEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet(securityPermissionId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrolmentDtoListEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet(securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdEnrollmentsGet")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantEnrolmentDtoListEnvelope**](TenantEnrolmentDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdGet"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdGet**
> SecurityRoleDtoListEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdGet(securityPermissionId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityRoleDtoListEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdGet(securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdGet")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SecurityRoleDtoListEnvelope**](SecurityRoleDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdPut"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdPut**
> EmptyEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdPut(securityPermissionId, tenantId, securityPermissionUpdateDto, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val securityPermissionUpdateDto : SecurityPermissionUpdateDto =  // SecurityPermissionUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdPut(securityPermissionId, tenantId, securityPermissionUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdPut")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **securityPermissionUpdateDto** | [**SecurityPermissionUpdateDto**](SecurityPermissionUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete**
> EmptyEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete(securityPermissionId, securityRoleId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete(securityPermissionId, securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **securityRoleId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost"></a>
# **apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost**
> EmptyEnvelope apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost(securityPermissionId, securityRoleId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost(securityPermissionId, securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#apiV2SecurityServicePermissionsSecurityPermissionIdRolesSecurityRoleIdPost")
    e.printStackTrace()
}
```

### Parameters
| **securityPermissionId** | **kotlin.String**|  | |
| **securityRoleId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

