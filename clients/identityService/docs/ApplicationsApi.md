# ApplicationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getApplication**](ApplicationsApi.md#getApplication) | **GET** /api/v2/Applications/{appId} | Get application by ID |
| [**getGrantedEnrollmentPermissions**](ApplicationsApi.md#getGrantedEnrollmentPermissions) | **GET** /api/v2/Applications/{appId}/GrantedRoles/{securityRoleId}/GrantedPermissions | Get granted permissions for an application role |
| [**getGrantedTenantPermissions**](ApplicationsApi.md#getGrantedTenantPermissions) | **GET** /api/v2/Applications/{appId}/GrantedPermissions | Get granted tenant permissions for an application |
| [**getGrantedTenantRoles**](ApplicationsApi.md#getGrantedTenantRoles) | **GET** /api/v2/Applications/{appId}/GrantedRoles | Get granted tenant roles for an application |
| [**getRequiredPermissions**](ApplicationsApi.md#getRequiredPermissions) | **GET** /api/v2/Applications/{appId}/RequiredPermissions | Get required permissions for an application |


<a id="getApplication"></a>
# **getApplication**
> getApplication(appId, apiVersion, xApiVersion)

Get application by ID

Retrieves an application by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getApplication(appId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getApplication")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getApplication")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getGrantedEnrollmentPermissions"></a>
# **getGrantedEnrollmentPermissions**
> getGrantedEnrollmentPermissions(appId, securityRoleId, enrollmentId, apiVersion, xApiVersion)

Get granted permissions for an application role

Retrieves the list of permissions granted through a specific security role for the specified application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val securityRoleId : kotlin.String = securityRoleId_example // kotlin.String | 
val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getGrantedEnrollmentPermissions(appId, securityRoleId, enrollmentId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getGrantedEnrollmentPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getGrantedEnrollmentPermissions")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**|  | |
| **securityRoleId** | **kotlin.String**|  | |
| **enrollmentId** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getGrantedTenantPermissions"></a>
# **getGrantedTenantPermissions**
> getGrantedTenantPermissions(appId, tenantId, apiVersion, xApiVersion)

Get granted tenant permissions for an application

Retrieves the list of permissions granted to the specified application within a tenant context.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val tenantId : kotlin.String = tenantId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getGrantedTenantPermissions(appId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getGrantedTenantPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getGrantedTenantPermissions")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**|  | |
| **tenantId** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getGrantedTenantRoles"></a>
# **getGrantedTenantRoles**
> getGrantedTenantRoles(appId, tenantId, apiVersion, xApiVersion)

Get granted tenant roles for an application

Retrieves the list of security roles granted to the specified application within a tenant context.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val tenantId : kotlin.String = tenantId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getGrantedTenantRoles(appId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getGrantedTenantRoles")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getGrantedTenantRoles")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**|  | |
| **tenantId** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="getRequiredPermissions"></a>
# **getRequiredPermissions**
> getRequiredPermissions(appId, apiVersion, xApiVersion)

Get required permissions for an application

Retrieves the list of permissions required by the specified application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val appId : kotlin.String = appId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getRequiredPermissions(appId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getRequiredPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getRequiredPermissions")
    e.printStackTrace()
}
```

### Parameters
| **appId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

