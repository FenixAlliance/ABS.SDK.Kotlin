# ApplicationPrincipalsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**disableGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#disableGlobalApplicationPrincipal) | **POST** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Disable | Disable an application principal (global) |
| [**enableGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#enableGlobalApplicationPrincipal) | **POST** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Enable | Enable an application principal (global) |
| [**getGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#getGlobalApplicationPrincipal) | **GET** /api/v2/SystemService/ApplicationPrincipals/{principalId} | Get one application principal (any tenant) |
| [**getGlobalApplicationPrincipals**](ApplicationPrincipalsApi.md#getGlobalApplicationPrincipals) | **GET** /api/v2/SystemService/ApplicationPrincipals | List application principals across all tenants |
| [**getGlobalApplicationPrincipalsCount**](ApplicationPrincipalsApi.md#getGlobalApplicationPrincipalsCount) | **GET** /api/v2/SystemService/ApplicationPrincipals/Count | Count application principals across all tenants |
| [**grantGlobalApplicationPrincipalPermission**](ApplicationPrincipalsApi.md#grantGlobalApplicationPrincipalPermission) | **POST** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Permissions | Grant a permission to an application principal (any tenant) |
| [**provisionGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#provisionGlobalApplicationPrincipal) | **POST** /api/v2/SystemService/ApplicationPrincipals/Provision | Provision an application principal (any tenant, incl. system-locked) |
| [**provisionPaymentsConnector**](ApplicationPrincipalsApi.md#provisionPaymentsConnector) | **POST** /api/v2/SystemService/ApplicationPrincipals/PaymentsConnector | Provision the platform payments-connector identity |
| [**revokeGlobalApplicationPrincipalPermission**](ApplicationPrincipalsApi.md#revokeGlobalApplicationPrincipalPermission) | **DELETE** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Permissions/{permission} | Revoke a permission from an application principal (any tenant) |
| [**suspendGlobalApplicationPrincipal**](ApplicationPrincipalsApi.md#suspendGlobalApplicationPrincipal) | **POST** /api/v2/SystemService/ApplicationPrincipals/{principalId}/Suspend | Suspend an application principal (global) |


<a id="disableGlobalApplicationPrincipal"></a>
# **disableGlobalApplicationPrincipal**
> EmptyEnvelope disableGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)

Disable an application principal (global)

Disables the application principal; dependent unattended execution fails closed (applies to system-locked principals here). tenantId scopes the action to a tenant the principal is enrolled in (required). Global-administrator only.

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
    val result : EmptyEnvelope = apiInstance.disableGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#disableGlobalApplicationPrincipal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#disableGlobalApplicationPrincipal")
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

<a id="enableGlobalApplicationPrincipal"></a>
# **enableGlobalApplicationPrincipal**
> EmptyEnvelope enableGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)

Enable an application principal (global)

Reinstates the application principal to the Active lifecycle state (applies to system-locked principals here). tenantId scopes the action to a tenant the principal is enrolled in (required). Global-administrator only.

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
    val result : EmptyEnvelope = apiInstance.enableGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#enableGlobalApplicationPrincipal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#enableGlobalApplicationPrincipal")
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

<a id="getGlobalApplicationPrincipal"></a>
# **getGlobalApplicationPrincipal**
> ApplicationPrincipalDetailDtoEnvelope getGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)

Get one application principal (any tenant)

Returns one application principal&#39;s detail by id: owning application, an enrollment, the system-locked flag, lifecycle status, and that enrollment&#39;s explicit least-privilege grants. Pass tenantId to select the enrollment for a multi-tenant principal; when omitted the principal&#39;s first enrollment is used. Global-administrator only.

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
    val result : ApplicationPrincipalDetailDtoEnvelope = apiInstance.getGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#getGlobalApplicationPrincipal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#getGlobalApplicationPrincipal")
    e.printStackTrace()
}
```

### Parameters
| **principalId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="getGlobalApplicationPrincipals"></a>
# **getGlobalApplicationPrincipals**
> ApplicationPrincipalDtoIReadOnlyListEnvelope getGlobalApplicationPrincipals(apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)

List application principals across all tenants

Lists every non-human application principal enrollment across ALL tenants (payload-safe fields only), including the platform-managed (system-locked) connectors. Use OData to scope — e.g. $filter&#x3D;SystemLocked eq true for the platform connectors or TenantId eq &#39;{guid}&#39; for one tenant — and to page/order. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val applicationPrincipalDtoCollectionQueryParameters : ApplicationPrincipalDtoCollectionQueryParameters =  // ApplicationPrincipalDtoCollectionQueryParameters | 
try {
    val result : ApplicationPrincipalDtoIReadOnlyListEnvelope = apiInstance.getGlobalApplicationPrincipals(apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#getGlobalApplicationPrincipals")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#getGlobalApplicationPrincipals")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **applicationPrincipalDtoCollectionQueryParameters** | [**ApplicationPrincipalDtoCollectionQueryParameters**](ApplicationPrincipalDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ApplicationPrincipalDtoIReadOnlyListEnvelope**](ApplicationPrincipalDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getGlobalApplicationPrincipalsCount"></a>
# **getGlobalApplicationPrincipalsCount**
> Int32Envelope getGlobalApplicationPrincipalsCount(apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)

Count application principals across all tenants

Returns the count of application principal enrollments across ALL tenants under the same OData shaping as the list read (e.g. $filter&#x3D;SystemLocked eq true). Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val applicationPrincipalDtoCollectionQueryParameters : ApplicationPrincipalDtoCollectionQueryParameters =  // ApplicationPrincipalDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getGlobalApplicationPrincipalsCount(apiVersion, xApiVersion, applicationPrincipalDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#getGlobalApplicationPrincipalsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#getGlobalApplicationPrincipalsCount")
    e.printStackTrace()
}
```

### Parameters
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

<a id="grantGlobalApplicationPrincipalPermission"></a>
# **grantGlobalApplicationPrincipalPermission**
> EmptyEnvelope grantGlobalApplicationPrincipalPermission(principalId, tenantId, applicationPrincipalPermissionRequestDto, apiVersion, xApiVersion)

Grant a permission to an application principal (any tenant)

Grants a single least-privilege permission to the application principal&#39;s enrollment in the tenantId tenant (grants are per-tenant, so tenantId is required). Owner/admin/wildcard/_*_manage permissions are rejected even for a global admin (least-privilege by construction). Global-administrator only.

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
    val result : EmptyEnvelope = apiInstance.grantGlobalApplicationPrincipalPermission(principalId, tenantId, applicationPrincipalPermissionRequestDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#grantGlobalApplicationPrincipalPermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#grantGlobalApplicationPrincipalPermission")
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

<a id="provisionGlobalApplicationPrincipal"></a>
# **provisionGlobalApplicationPrincipal**
> ApplicationPrincipalProvisioningResultDtoEnvelope provisionGlobalApplicationPrincipal(applicationPrincipalProvisionRequestDto, tenantId, apiVersion, xApiVersion)

Provision an application principal (any tenant, incl. system-locked)

Idempotently provisions the application principal (and its own least-privilege enrollment) for a governed business application. tenantId selects the target tenant (defaults to the platform/root tenant). Unlike the per-tenant lane, a system-locked platform application is provisionable here. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val applicationPrincipalProvisionRequestDto : ApplicationPrincipalProvisionRequestDto =  // ApplicationPrincipalProvisionRequestDto | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ApplicationPrincipalProvisioningResultDtoEnvelope = apiInstance.provisionGlobalApplicationPrincipal(applicationPrincipalProvisionRequestDto, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#provisionGlobalApplicationPrincipal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#provisionGlobalApplicationPrincipal")
    e.printStackTrace()
}
```

### Parameters
| **applicationPrincipalProvisionRequestDto** | [**ApplicationPrincipalProvisionRequestDto**](ApplicationPrincipalProvisionRequestDto.md)|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="provisionPaymentsConnector"></a>
# **provisionPaymentsConnector**
> ApplicationPrincipalProvisioningResultDtoEnvelope provisionPaymentsConnector(tenantId, apiVersion, xApiVersion)

Provision the platform payments-connector identity

Idempotently stands up the platform payments-connector identity — its well-known business application, its application principal, and its own least-privilege enrollment (payments_create/payments_update/journals_post). tenantId selects the target tenant (defaults to the platform/root tenant). The provisioned connector then appears in this global list and (for its tenant) the per-tenant list. Global-administrator only.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationPrincipalsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ApplicationPrincipalProvisioningResultDtoEnvelope = apiInstance.provisionPaymentsConnector(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#provisionPaymentsConnector")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#provisionPaymentsConnector")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ApplicationPrincipalProvisioningResultDtoEnvelope**](ApplicationPrincipalProvisioningResultDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="revokeGlobalApplicationPrincipalPermission"></a>
# **revokeGlobalApplicationPrincipalPermission**
> EmptyEnvelope revokeGlobalApplicationPrincipalPermission(principalId, permission, tenantId, apiVersion, xApiVersion)

Revoke a permission from an application principal (any tenant)

Revokes a direct permission grant from the application principal&#39;s enrollment in the tenantId tenant (required). Idempotent. Global-administrator only.

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
    val result : EmptyEnvelope = apiInstance.revokeGlobalApplicationPrincipalPermission(principalId, permission, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#revokeGlobalApplicationPrincipalPermission")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#revokeGlobalApplicationPrincipalPermission")
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

<a id="suspendGlobalApplicationPrincipal"></a>
# **suspendGlobalApplicationPrincipal**
> EmptyEnvelope suspendGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)

Suspend an application principal (global)

Temporarily suspends the application principal; its identity is retained but it cannot act until reinstated (applies to system-locked principals here). tenantId scopes the action to a tenant the principal is enrolled in (required). Global-administrator only.

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
    val result : EmptyEnvelope = apiInstance.suspendGlobalApplicationPrincipal(principalId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationPrincipalsApi#suspendGlobalApplicationPrincipal")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationPrincipalsApi#suspendGlobalApplicationPrincipal")
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

