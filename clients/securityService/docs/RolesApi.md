# RolesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SecurityServiceRolesGet**](RolesApi.md#apiV2SecurityServiceRolesGet) | **GET** /api/v2/SecurityService/Roles |  |
| [**apiV2SecurityServiceRolesPost**](RolesApi.md#apiV2SecurityServiceRolesPost) | **POST** /api/v2/SecurityService/Roles |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Applications/{applicationId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Applications/{applicationId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdDelete**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdDelete) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments/{enrollmentId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments/{enrollmentId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdGet**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdGet) | **GET** /api/v2/SecurityService/Roles/{securityRoleId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions/{securityPermissionId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions/{securityPermissionId} |  |
| [**apiV2SecurityServiceRolesSecurityRoleIdPut**](RolesApi.md#apiV2SecurityServiceRolesSecurityRoleIdPut) | **PUT** /api/v2/SecurityService/Roles/{securityRoleId} |  |


<a id="apiV2SecurityServiceRolesGet"></a>
# **apiV2SecurityServiceRolesGet**
> SecurityRoleDtoListEnvelope apiV2SecurityServiceRolesGet(tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityRoleDtoListEnvelope = apiInstance.apiV2SecurityServiceRolesGet(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesGet")
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

<a id="apiV2SecurityServiceRolesPost"></a>
# **apiV2SecurityServiceRolesPost**
> EmptyEnvelope apiV2SecurityServiceRolesPost(tenantId, apiVersion, xApiVersion, securityRoleCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val securityRoleCreateDto : SecurityRoleCreateDto =  // SecurityRoleCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesPost(tenantId, apiVersion, xApiVersion, securityRoleCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesPost")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityRoleCreateDto** | [**SecurityRoleCreateDto**](SecurityRoleCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val applicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
| **applicationId** | **java.util.UUID**|  | |
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val applicationId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdApplicationsApplicationIdPost")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
| **applicationId** | **java.util.UUID**|  | |
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdDelete"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdDelete**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdDelete(securityRoleId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdDelete(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdDelete")
    e.printStackTrace()
}
```

### Parameters
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsEnrollmentIdPost")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet**
> TenantEnrolmentDtoListEnvelope apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet(securityRoleId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrolmentDtoListEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdEnrollmentsGet")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdGet"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdGet**
> SecurityRoleDtoListEnvelope apiV2SecurityServiceRolesSecurityRoleIdGet(securityRoleId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityRoleDtoListEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdGet(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdGet")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet**
> SecurityPermissionDtoListEnvelope apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet(securityRoleId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityPermissionDtoListEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsGet")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SecurityPermissionDtoListEnvelope**](SecurityPermissionDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdDelete")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val securityPermissionId : kotlin.String = securityPermissionId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPermissionsSecurityPermissionIdPost")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
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

<a id="apiV2SecurityServiceRolesSecurityRoleIdPut"></a>
# **apiV2SecurityServiceRolesSecurityRoleIdPut**
> EmptyEnvelope apiV2SecurityServiceRolesSecurityRoleIdPut(securityRoleId, tenantId, apiVersion, xApiVersion, securityRoleUpdateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val securityRoleUpdateDto : SecurityRoleUpdateDto =  // SecurityRoleUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SecurityServiceRolesSecurityRoleIdPut(securityRoleId, tenantId, apiVersion, xApiVersion, securityRoleUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#apiV2SecurityServiceRolesSecurityRoleIdPut")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **securityRoleUpdateDto** | [**SecurityRoleUpdateDto**](SecurityRoleUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

