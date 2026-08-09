# ApplicationPrincipalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**disableApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#disableApplicationPrincipalAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Disable | Disable an application principal |
| [**enableApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#enableApplicationPrincipalAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Enable | Enable an application principal |
| [**getApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#getApplicationPrincipalAsync) | **GET** /api/v2/SecurityService/ApplicationPrincipals/{principalId} | Get application principal by ID |
| [**getApplicationPrincipalsAsync**](ApplicationPrincipalsApi.md#getApplicationPrincipalsAsync) | **GET** /api/v2/SecurityService/ApplicationPrincipals | Get all application principals |
| [**getApplicationPrincipalsCountAsync**](ApplicationPrincipalsApi.md#getApplicationPrincipalsCountAsync) | **GET** /api/v2/SecurityService/ApplicationPrincipals/Count | Get application principals count |
| [**grantPermissionAsync**](ApplicationPrincipalsApi.md#grantPermissionAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Permissions | Grant a permission to an application principal |
| [**provisionApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#provisionApplicationPrincipalAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/Provision | Provision an application principal |
| [**revokePermissionAsync**](ApplicationPrincipalsApi.md#revokePermissionAsync) | **DELETE** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Permissions/{permission} | Revoke a permission from an application principal |
| [**suspendApplicationPrincipalAsync**](ApplicationPrincipalsApi.md#suspendApplicationPrincipalAsync) | **POST** /api/v2/SecurityService/ApplicationPrincipals/{principalId}/Suspend | Suspend an application principal |


<a id="disableApplicationPrincipalAsync"></a>
# **disableApplicationPrincipalAsync**
> EmptyEnvelope disableApplicationPrincipalAsync(principalId, tenantId, apiVersion, xApiVersion)

Disable an application principal

Disables the application principal; dependent unattended execution fails closed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val principalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.disableApplicationPrincipalAsync(principalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#disableApplicationPrincipalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#disableApplicationPrincipalAsync")
    e.printStackTrace()
}
```

### Parameters
| **principalId** | **java.util.UUID**|  | |
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

<a id="enableApplicationPrincipalAsync"></a>
# **enableApplicationPrincipalAsync**
> EmptyEnvelope enableApplicationPrincipalAsync(principalId, tenantId, apiVersion, xApiVersion)

Enable an application principal

Reinstates the application principal to the Active lifecycle state.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val principalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.enableApplicationPrincipalAsync(principalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#enableApplicationPrincipalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#enableApplicationPrincipalAsync")
    e.printStackTrace()
}
```

### Parameters
| **principalId** | **java.util.UUID**|  | |
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

<a id="getApplicationPrincipalAsync"></a>
# **getApplicationPrincipalAsync**
> ApplicationPrincipalDetailDtoEnvelope getApplicationPrincipalAsync(principalId, tenantId, apiVersion, xApiVersion)

Get application principal by ID

Retrieves a specific application principal: owning application, tenant enrollment, lifecycle status, system-locked flag, and its explicit least-privilege permission grants.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val principalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ApplicationPrincipalDetailDtoEnvelope = apiInstance.getApplicationPrincipalAsync(principalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#getApplicationPrincipalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#getApplicationPrincipalAsync")
    e.printStackTrace()
}
```

### Parameters
| **principalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ApplicationPrincipalDetailDtoEnvelope**](ApplicationPrincipalDetailDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getApplicationPrincipalsAsync"></a>
# **getApplicationPrincipalsAsync**
> ApplicationPrincipalDtoListEnvelope getApplicationPrincipalsAsync(tenantId, apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)

Get all application principals

Retrieves the non-human application principals enrolled in the specified tenant (including read-only system-locked platform principals).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val applicationPrincipalDtoCollectionQueryParameters : ApplicationPrincipalDtoCollectionQueryParameters =  // ApplicationPrincipalDtoCollectionQueryParameters | 
try {
    val result : ApplicationPrincipalDtoListEnvelope = apiInstance.getApplicationPrincipalsAsync(tenantId, apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#getApplicationPrincipalsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#getApplicationPrincipalsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **applicationPrincipalDtoCollectionQueryParameters** | [**ApplicationPrincipalDtoCollectionQueryParameters**](ApplicationPrincipalDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ApplicationPrincipalDtoListEnvelope**](ApplicationPrincipalDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getApplicationPrincipalsCountAsync"></a>
# **getApplicationPrincipalsCountAsync**
> Int32Envelope getApplicationPrincipalsCountAsync(tenantId, apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)

Get application principals count

Retrieves the count of application principals enrolled in the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val applicationPrincipalDtoCollectionQueryParameters : ApplicationPrincipalDtoCollectionQueryParameters =  // ApplicationPrincipalDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getApplicationPrincipalsCountAsync(tenantId, apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#getApplicationPrincipalsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#getApplicationPrincipalsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **applicationPrincipalDtoCollectionQueryParameters** | [**ApplicationPrincipalDtoCollectionQueryParameters**](ApplicationPrincipalDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="grantPermissionAsync"></a>
# **grantPermissionAsync**
> EmptyEnvelope grantPermissionAsync(principalId, tenantId, applicationPrincipalPermissionRequestDto, apiVersion, xApiVersion)

Grant a permission to an application principal

Grants a single least-privilege permission to the application principal&#39;s enrollment. Owner/admin/wildcard/_*_manage permissions are rejected; system-locked principals require a platform administrator.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val principalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val applicationPrincipalPermissionRequestDto : ApplicationPrincipalPermissionRequestDto =  // ApplicationPrincipalPermissionRequestDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.grantPermissionAsync(principalId, tenantId, applicationPrincipalPermissionRequestDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#grantPermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#grantPermissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **principalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **applicationPrincipalPermissionRequestDto** | [**ApplicationPrincipalPermissionRequestDto**](ApplicationPrincipalPermissionRequestDto.md)|  | |
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

<a id="provisionApplicationPrincipalAsync"></a>
# **provisionApplicationPrincipalAsync**
> ApplicationPrincipalProvisioningResultDtoEnvelope provisionApplicationPrincipalAsync(tenantId, applicationPrincipalProvisionRequestDto, apiVersion, xApiVersion)

Provision an application principal

Idempotently provisions the application principal (and its own least-privilege enrollment) for a governed business application in the specified tenant. System-locked platform applications require a platform administrator.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val applicationPrincipalProvisionRequestDto : ApplicationPrincipalProvisionRequestDto =  // ApplicationPrincipalProvisionRequestDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ApplicationPrincipalProvisioningResultDtoEnvelope = apiInstance.provisionApplicationPrincipalAsync(tenantId, applicationPrincipalProvisionRequestDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#provisionApplicationPrincipalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#provisionApplicationPrincipalAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **applicationPrincipalProvisionRequestDto** | [**ApplicationPrincipalProvisionRequestDto**](ApplicationPrincipalProvisionRequestDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ApplicationPrincipalProvisioningResultDtoEnvelope**](ApplicationPrincipalProvisioningResultDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="revokePermissionAsync"></a>
# **revokePermissionAsync**
> EmptyEnvelope revokePermissionAsync(principalId, permission, tenantId, apiVersion, xApiVersion)

Revoke a permission from an application principal

Revokes a direct permission grant from the application principal&#39;s enrollment. System-locked principals require a platform administrator.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val principalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val permission : kotlin.String = permission_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.revokePermissionAsync(principalId, permission, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#revokePermissionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#revokePermissionAsync")
    e.printStackTrace()
}
```

### Parameters
| **principalId** | **java.util.UUID**|  | |
| **permission** | **kotlin.String**|  | |
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

<a id="suspendApplicationPrincipalAsync"></a>
# **suspendApplicationPrincipalAsync**
> EmptyEnvelope suspendApplicationPrincipalAsync(principalId, tenantId, apiVersion, xApiVersion)

Suspend an application principal

Temporarily suspends the application principal; its identity is retained but it cannot act until reinstated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val principalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.suspendApplicationPrincipalAsync(principalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#suspendApplicationPrincipalAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#suspendApplicationPrincipalAsync")
    e.printStackTrace()
}
```

### Parameters
| **principalId** | **java.util.UUID**|  | |
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

