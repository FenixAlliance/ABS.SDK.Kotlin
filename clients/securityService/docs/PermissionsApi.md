# PermissionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**assignPermissionToBusinessApplicationAsync**](PermissionsApi.md#assignPermissionToBusinessApplicationAsync) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Applications/{applicationId} | Assign a permission to a business application |
| [**assignPermissionToEnrollmentAsync**](PermissionsApi.md#assignPermissionToEnrollmentAsync) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments/{enrollmentId} | Assign a permission to an enrollment |
| [**assignRoleToPermissionAsync**](PermissionsApi.md#assignRoleToPermissionAsync) | **POST** /api/v2/SecurityService/Permissions/{securityPermissionId}/Roles/{securityRoleId} | Assign a role to a permission |
| [**createPermissionAsync**](PermissionsApi.md#createPermissionAsync) | **POST** /api/v2/SecurityService/Permissions | Create a new permission |
| [**deletePermissionAsync**](PermissionsApi.md#deletePermissionAsync) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId} | Delete an existing permission |
| [**getApplicationsByPermissionAsync**](PermissionsApi.md#getApplicationsByPermissionAsync) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId}/Applications | Get applications by permission |
| [**getEnrollmentsByPermissionAsync**](PermissionsApi.md#getEnrollmentsByPermissionAsync) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments | Get enrollments by permission |
| [**getPermissionAsync**](PermissionsApi.md#getPermissionAsync) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId} | Get permission by ID |
| [**getPermissionsAsync**](PermissionsApi.md#getPermissionsAsync) | **GET** /api/v2/SecurityService/Permissions | Get all permissions |
| [**getPermissionsByEnrollmentAsync**](PermissionsApi.md#getPermissionsByEnrollmentAsync) | **GET** /api/v2/SecurityService/Permissions/ByEnrollment/{enrollmentId} | Get permissions by enrollment |
| [**getPermissionsCountAsync**](PermissionsApi.md#getPermissionsCountAsync) | **GET** /api/v2/SecurityService/Permissions/Count | Get permissions count |
| [**getRolesByPermissionAsync**](PermissionsApi.md#getRolesByPermissionAsync) | **GET** /api/v2/SecurityService/Permissions/{securityPermissionId}/Roles | Get roles by permission |
| [**revokePermissionFromBusinessApplicationAsync**](PermissionsApi.md#revokePermissionFromBusinessApplicationAsync) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Applications/{applicationId} | Revoke a permission from a business application |
| [**revokePermissionFromEnrollmentAsync**](PermissionsApi.md#revokePermissionFromEnrollmentAsync) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Enrollments/{enrollmentId} | Revoke a permission from an enrollment |
| [**revokeRoleFromPermissionAsync**](PermissionsApi.md#revokeRoleFromPermissionAsync) | **DELETE** /api/v2/SecurityService/Permissions/{securityPermissionId}/Roles/{securityRoleId} | Revoke a role from a permission |
| [**updatePermissionAsync**](PermissionsApi.md#updatePermissionAsync) | **PUT** /api/v2/SecurityService/Permissions/{securityPermissionId} | Update an existing permission |


<a id="assignPermissionToBusinessApplicationAsync"></a>
# **assignPermissionToBusinessApplicationAsync**
> EmptyEnvelope assignPermissionToBusinessApplicationAsync(securityPermissionId, applicationId, tenantId, apiVersion, xApiVersion)

Assign a permission to a business application

Assigns a security permission to a business application.

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
    val result : EmptyEnvelope = apiInstance.assignPermissionToBusinessApplicationAsync(securityPermissionId, applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#assignPermissionToBusinessApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#assignPermissionToBusinessApplicationAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="assignPermissionToEnrollmentAsync"></a>
# **assignPermissionToEnrollmentAsync**
> EmptyEnvelope assignPermissionToEnrollmentAsync(securityPermissionId, enrollmentId, tenantId, apiVersion, xApiVersion)

Assign a permission to an enrollment

Assigns a security permission to a tenant enrollment.

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
    val result : EmptyEnvelope = apiInstance.assignPermissionToEnrollmentAsync(securityPermissionId, enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#assignPermissionToEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#assignPermissionToEnrollmentAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="assignRoleToPermissionAsync"></a>
# **assignRoleToPermissionAsync**
> EmptyEnvelope assignRoleToPermissionAsync(securityPermissionId, securityRoleId, tenantId, apiVersion, xApiVersion)

Assign a role to a permission

Assigns a security role to a security permission.

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
    val result : EmptyEnvelope = apiInstance.assignRoleToPermissionAsync(securityPermissionId, securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#assignRoleToPermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#assignRoleToPermissionAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createPermissionAsync"></a>
# **createPermissionAsync**
> EmptyEnvelope createPermissionAsync(tenantId, securityPermissionCreateDto, apiVersion, xApiVersion)

Create a new permission

Creates a new security permission for the specified tenant.

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
    val result : EmptyEnvelope = apiInstance.createPermissionAsync(tenantId, securityPermissionCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#createPermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#createPermissionAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePermissionAsync"></a>
# **deletePermissionAsync**
> EmptyEnvelope deletePermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)

Delete an existing permission

Deletes an existing security permission for the specified tenant.

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
    val result : EmptyEnvelope = apiInstance.deletePermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#deletePermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#deletePermissionAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getApplicationsByPermissionAsync"></a>
# **getApplicationsByPermissionAsync**
> BusinessApplicationSimpleDtoListEnvelope getApplicationsByPermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)

Get applications by permission

Retrieves all business applications that have a specific permission granted.

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
    val result : BusinessApplicationSimpleDtoListEnvelope = apiInstance.getApplicationsByPermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getApplicationsByPermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getApplicationsByPermissionAsync")
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

[**BusinessApplicationSimpleDtoListEnvelope**](BusinessApplicationSimpleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnrollmentsByPermissionAsync"></a>
# **getEnrollmentsByPermissionAsync**
> TenantEnrollmentDtoListEnvelope getEnrollmentsByPermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)

Get enrollments by permission

Retrieves all tenant enrollments that have a specific permission.

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
    val result : TenantEnrollmentDtoListEnvelope = apiInstance.getEnrollmentsByPermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getEnrollmentsByPermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getEnrollmentsByPermissionAsync")
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

[**TenantEnrollmentDtoListEnvelope**](TenantEnrollmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPermissionAsync"></a>
# **getPermissionAsync**
> SecurityPermissionDtoEnvelope getPermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)

Get permission by ID

Retrieves a specific security permission by its ID.

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
    val result : SecurityPermissionDtoEnvelope = apiInstance.getPermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getPermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getPermissionAsync")
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

[**SecurityPermissionDtoEnvelope**](SecurityPermissionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPermissionsAsync"></a>
# **getPermissionsAsync**
> SecurityPermissionDtoListEnvelope getPermissionsAsync(tenantId, apiVersion, xApiVersion)

Get all permissions

Retrieves all security permissions for the specified tenant.

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
    val result : SecurityPermissionDtoListEnvelope = apiInstance.getPermissionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getPermissionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getPermissionsAsync")
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

[**SecurityPermissionDtoListEnvelope**](SecurityPermissionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPermissionsByEnrollmentAsync"></a>
# **getPermissionsByEnrollmentAsync**
> SecurityPermissionDtoListEnvelope getPermissionsByEnrollmentAsync(enrollmentId, tenantId, apiVersion, xApiVersion)

Get permissions by enrollment

Retrieves all security permissions granted to a specific enrollment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PermissionsApi()
val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityPermissionDtoListEnvelope = apiInstance.getPermissionsByEnrollmentAsync(enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getPermissionsByEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getPermissionsByEnrollmentAsync")
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

[**SecurityPermissionDtoListEnvelope**](SecurityPermissionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPermissionsCountAsync"></a>
# **getPermissionsCountAsync**
> Int32Envelope getPermissionsCountAsync(tenantId, apiVersion, xApiVersion)

Get permissions count

Retrieves the count of security permissions for the specified tenant.

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
    val result : Int32Envelope = apiInstance.getPermissionsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getPermissionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getPermissionsCountAsync")
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

<a id="getRolesByPermissionAsync"></a>
# **getRolesByPermissionAsync**
> SecurityRoleDtoListEnvelope getRolesByPermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)

Get roles by permission

Retrieves all security roles that have a specific permission granted.

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
    val result : SecurityRoleDtoListEnvelope = apiInstance.getRolesByPermissionAsync(securityPermissionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#getRolesByPermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#getRolesByPermissionAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="revokePermissionFromBusinessApplicationAsync"></a>
# **revokePermissionFromBusinessApplicationAsync**
> EmptyEnvelope revokePermissionFromBusinessApplicationAsync(securityPermissionId, applicationId, tenantId, apiVersion, xApiVersion)

Revoke a permission from a business application

Revokes a security permission from a business application.

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
    val result : EmptyEnvelope = apiInstance.revokePermissionFromBusinessApplicationAsync(securityPermissionId, applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#revokePermissionFromBusinessApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#revokePermissionFromBusinessApplicationAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="revokePermissionFromEnrollmentAsync"></a>
# **revokePermissionFromEnrollmentAsync**
> EmptyEnvelope revokePermissionFromEnrollmentAsync(securityPermissionId, enrollmentId, tenantId, apiVersion, xApiVersion)

Revoke a permission from an enrollment

Revokes a security permission from a tenant enrollment.

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
    val result : EmptyEnvelope = apiInstance.revokePermissionFromEnrollmentAsync(securityPermissionId, enrollmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#revokePermissionFromEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#revokePermissionFromEnrollmentAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="revokeRoleFromPermissionAsync"></a>
# **revokeRoleFromPermissionAsync**
> EmptyEnvelope revokeRoleFromPermissionAsync(securityPermissionId, securityRoleId, tenantId, apiVersion, xApiVersion)

Revoke a role from a permission

Revokes a security role from a security permission.

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
    val result : EmptyEnvelope = apiInstance.revokeRoleFromPermissionAsync(securityPermissionId, securityRoleId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#revokeRoleFromPermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#revokeRoleFromPermissionAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updatePermissionAsync"></a>
# **updatePermissionAsync**
> EmptyEnvelope updatePermissionAsync(securityPermissionId, tenantId, securityPermissionUpdateDto, apiVersion, xApiVersion)

Update an existing permission

Updates an existing security permission for the specified tenant.

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
    val result : EmptyEnvelope = apiInstance.updatePermissionAsync(securityPermissionId, tenantId, securityPermissionUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PermissionsApi#updatePermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PermissionsApi#updatePermissionAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

