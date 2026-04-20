# RolesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**assignPermissionToRoleAsync**](RolesApi.md#assignPermissionToRoleAsync) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions/{securityPermissionId} | Assign a permission to a role |
| [**assignRoleToBusinessApplicationAsync**](RolesApi.md#assignRoleToBusinessApplicationAsync) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Applications/{applicationId} | Assign a role to a business application |
| [**assignRoleToEnrollmentAsync**](RolesApi.md#assignRoleToEnrollmentAsync) | **POST** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments/{enrollmentId} | Assign a role to an enrollment |
| [**createRoleAsync**](RolesApi.md#createRoleAsync) | **POST** /api/v2/SecurityService/Roles | Create a new role |
| [**deleteRoleAsync**](RolesApi.md#deleteRoleAsync) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId} | Delete an existing role |
| [**getApplicationsByRoleAsync**](RolesApi.md#getApplicationsByRoleAsync) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Applications | Get applications by role |
| [**getEnrollmentsByRoleAsync**](RolesApi.md#getEnrollmentsByRoleAsync) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments | Get enrollments by role |
| [**getRoleAsync**](RolesApi.md#getRoleAsync) | **GET** /api/v2/SecurityService/Roles/{securityRoleId} | Get role by ID |
| [**getRolePermissionsAsync**](RolesApi.md#getRolePermissionsAsync) | **GET** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions | Get permissions by role |
| [**getRolesAsync**](RolesApi.md#getRolesAsync) | **GET** /api/v2/SecurityService/Roles | Get all roles |
| [**getRolesByEnrollmentAsync**](RolesApi.md#getRolesByEnrollmentAsync) | **GET** /api/v2/SecurityService/Roles/ByEnrollment/{enrollmentId} | Get roles by enrollment |
| [**getRolesCountAsync**](RolesApi.md#getRolesCountAsync) | **GET** /api/v2/SecurityService/Roles/Count | Get roles count |
| [**revokePermissionFromRoleAsync**](RolesApi.md#revokePermissionFromRoleAsync) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Permissions/{securityPermissionId} | Revoke a permission from a role |
| [**revokeRoleFromBusinessApplicationAsync**](RolesApi.md#revokeRoleFromBusinessApplicationAsync) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Applications/{applicationId} | Revoke a role from a business application |
| [**revokeRoleFromEnrollmentAsync**](RolesApi.md#revokeRoleFromEnrollmentAsync) | **DELETE** /api/v2/SecurityService/Roles/{securityRoleId}/Enrollments/{enrollmentId} | Revoke a role from an enrollment |
| [**updateRoleAsync**](RolesApi.md#updateRoleAsync) | **PUT** /api/v2/SecurityService/Roles/{securityRoleId} | Update an existing role |


<a id="assignPermissionToRoleAsync"></a>
# **assignPermissionToRoleAsync**
> EmptyEnvelope assignPermissionToRoleAsync(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)

Assign a permission to a role

Assigns a security permission to a security role.

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
    val result : EmptyEnvelope = apiInstance.assignPermissionToRoleAsync(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#assignPermissionToRoleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#assignPermissionToRoleAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="assignRoleToBusinessApplicationAsync"></a>
# **assignRoleToBusinessApplicationAsync**
> EmptyEnvelope assignRoleToBusinessApplicationAsync(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)

Assign a role to a business application

Assigns a security role to a business application.

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
    val result : EmptyEnvelope = apiInstance.assignRoleToBusinessApplicationAsync(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#assignRoleToBusinessApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#assignRoleToBusinessApplicationAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="assignRoleToEnrollmentAsync"></a>
# **assignRoleToEnrollmentAsync**
> EmptyEnvelope assignRoleToEnrollmentAsync(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)

Assign a role to an enrollment

Assigns a security role to a tenant enrollment.

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
    val result : EmptyEnvelope = apiInstance.assignRoleToEnrollmentAsync(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#assignRoleToEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#assignRoleToEnrollmentAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createRoleAsync"></a>
# **createRoleAsync**
> EmptyEnvelope createRoleAsync(tenantId, securityRoleCreateDto, apiVersion, xApiVersion)

Create a new role

Creates a new security role for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val securityRoleCreateDto : SecurityRoleCreateDto =  // SecurityRoleCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createRoleAsync(tenantId, securityRoleCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#createRoleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#createRoleAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **securityRoleCreateDto** | [**SecurityRoleCreateDto**](SecurityRoleCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteRoleAsync"></a>
# **deleteRoleAsync**
> EmptyEnvelope deleteRoleAsync(securityRoleId, tenantId, apiVersion, xApiVersion)

Delete an existing role

Deletes an existing security role for the specified tenant.

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
    val result : EmptyEnvelope = apiInstance.deleteRoleAsync(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#deleteRoleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#deleteRoleAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getApplicationsByRoleAsync"></a>
# **getApplicationsByRoleAsync**
> BusinessApplicationSimpleDtoListEnvelope getApplicationsByRoleAsync(securityRoleId, tenantId, apiVersion, xApiVersion)

Get applications by role

Retrieves all business applications that have a specific role granted.

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
    val result : BusinessApplicationSimpleDtoListEnvelope = apiInstance.getApplicationsByRoleAsync(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#getApplicationsByRoleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#getApplicationsByRoleAsync")
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

[**BusinessApplicationSimpleDtoListEnvelope**](BusinessApplicationSimpleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnrollmentsByRoleAsync"></a>
# **getEnrollmentsByRoleAsync**
> TenantEnrollmentDtoListEnvelope getEnrollmentsByRoleAsync(securityRoleId, tenantId, apiVersion, xApiVersion)

Get enrollments by role

Retrieves all tenant enrollments that have a specific role.

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
    val result : TenantEnrollmentDtoListEnvelope = apiInstance.getEnrollmentsByRoleAsync(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#getEnrollmentsByRoleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#getEnrollmentsByRoleAsync")
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

[**TenantEnrollmentDtoListEnvelope**](TenantEnrollmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRoleAsync"></a>
# **getRoleAsync**
> SecurityRoleDtoEnvelope getRoleAsync(securityRoleId, tenantId, apiVersion, xApiVersion)

Get role by ID

Retrieves a specific security role by its ID.

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
    val result : SecurityRoleDtoEnvelope = apiInstance.getRoleAsync(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#getRoleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#getRoleAsync")
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

[**SecurityRoleDtoEnvelope**](SecurityRoleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRolePermissionsAsync"></a>
# **getRolePermissionsAsync**
> SecurityPermissionDtoListEnvelope getRolePermissionsAsync(securityRoleId, tenantId, apiVersion, xApiVersion)

Get permissions by role

Retrieves all security permissions assigned to a specific role.

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
    val result : SecurityPermissionDtoListEnvelope = apiInstance.getRolePermissionsAsync(securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#getRolePermissionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#getRolePermissionsAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRolesAsync"></a>
# **getRolesAsync**
> SecurityRoleDtoListEnvelope getRolesAsync(tenantId, apiVersion, xApiVersion)

Get all roles

Retrieves all security roles for the specified tenant.

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
    val result : SecurityRoleDtoListEnvelope = apiInstance.getRolesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#getRolesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#getRolesAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRolesByEnrollmentAsync"></a>
# **getRolesByEnrollmentAsync**
> SecurityRoleDtoListEnvelope getRolesByEnrollmentAsync(enrollmentId, tenantId, apiVersion, xApiVersion)

Get roles by enrollment

Retrieves all security roles granted to a specific enrollment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityRoleDtoListEnvelope = apiInstance.getRolesByEnrollmentAsync(enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#getRolesByEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#getRolesByEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **enrollmentId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SecurityRoleDtoListEnvelope**](SecurityRoleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRolesCountAsync"></a>
# **getRolesCountAsync**
> Int32Envelope getRolesCountAsync(tenantId, apiVersion, xApiVersion)

Get roles count

Retrieves the count of security roles for the specified tenant.

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
    val result : Int32Envelope = apiInstance.getRolesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#getRolesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#getRolesCountAsync")
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

<a id="revokePermissionFromRoleAsync"></a>
# **revokePermissionFromRoleAsync**
> EmptyEnvelope revokePermissionFromRoleAsync(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)

Revoke a permission from a role

Revokes a security permission from a security role.

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
    val result : EmptyEnvelope = apiInstance.revokePermissionFromRoleAsync(securityRoleId, securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#revokePermissionFromRoleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#revokePermissionFromRoleAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="revokeRoleFromBusinessApplicationAsync"></a>
# **revokeRoleFromBusinessApplicationAsync**
> EmptyEnvelope revokeRoleFromBusinessApplicationAsync(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)

Revoke a role from a business application

Revokes a security role from a business application.

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
    val result : EmptyEnvelope = apiInstance.revokeRoleFromBusinessApplicationAsync(securityRoleId, applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#revokeRoleFromBusinessApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#revokeRoleFromBusinessApplicationAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="revokeRoleFromEnrollmentAsync"></a>
# **revokeRoleFromEnrollmentAsync**
> EmptyEnvelope revokeRoleFromEnrollmentAsync(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)

Revoke a role from an enrollment

Revokes a security role from a tenant enrollment.

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
    val result : EmptyEnvelope = apiInstance.revokeRoleFromEnrollmentAsync(securityRoleId, enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#revokeRoleFromEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#revokeRoleFromEnrollmentAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateRoleAsync"></a>
# **updateRoleAsync**
> EmptyEnvelope updateRoleAsync(securityRoleId, tenantId, securityRoleUpdateDto, apiVersion, xApiVersion)

Update an existing role

Updates an existing security role for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RolesApi()
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val securityRoleUpdateDto : SecurityRoleUpdateDto =  // SecurityRoleUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateRoleAsync(securityRoleId, tenantId, securityRoleUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RolesApi#updateRoleAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RolesApi#updateRoleAsync")
    e.printStackTrace()
}
```

### Parameters
| **securityRoleId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **securityRoleUpdateDto** | [**SecurityRoleUpdateDto**](SecurityRoleUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

