# TenantsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**assignLicenseAsync**](TenantsApi.md#assignLicenseAsync) | **POST** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/Licenses/{licenseId} | Assign a license to a specific enrollment |
| [**createTenantAsync**](TenantsApi.md#createTenantAsync) | **POST** /api/v2/TenantsService/Tenants | Create a new business tenant |
| [**deSelectTenantAsync**](TenantsApi.md#deSelectTenantAsync) | **POST** /api/v2/TenantsService/Tenants/Deselect | Deselect the user&#39;s default tenant |
| [**deleteTenantAsync**](TenantsApi.md#deleteTenantAsync) | **DELETE** /api/v2/TenantsService/Tenants | Delete a tenant |
| [**getAccessibleFeaturesAsync**](TenantsApi.md#getAccessibleFeaturesAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/Features | Get the list of features accessible to a specific enrollment |
| [**getCurrentTenantAsync**](TenantsApi.md#getCurrentTenantAsync) | **GET** /api/v2/TenantsService/Tenants/Current | Get the user&#39;s current default tenant |
| [**getEnrollmentLicenseByIdAsync**](TenantsApi.md#getEnrollmentLicenseByIdAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/Licenses/{licenseId} | Get a specific license for an enrollment |
| [**getEnrollmentLicensesAsync**](TenantsApi.md#getEnrollmentLicensesAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/Licenses | Get the list of licenses available to a specific enrollment |
| [**getEnrollmentPermissionsAsync**](TenantsApi.md#getEnrollmentPermissionsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/Permissions | Get a specific tenant enrollment&#39;s permissions list |
| [**getExtendedTenantAsync**](TenantsApi.md#getExtendedTenantAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Extended | Get an extended tenant&#39;s business profile |
| [**getExtendedTenantEnrollmentAsync**](TenantsApi.md#getExtendedTenantEnrollmentAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/Extended | Get a specific tenant enrollment |
| [**getRootTenantAsync**](TenantsApi.md#getRootTenantAsync) | **GET** /api/v2/TenantsService/Tenants/Root | Get the root tenant of the platform |
| [**getTenantAsync**](TenantsApi.md#getTenantAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId} | Get a specific tenant by ID |
| [**getTenantAvatarAsync**](TenantsApi.md#getTenantAvatarAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Avatar | Get a tenant&#39;s avatar |
| [**getTenantCartAsync**](TenantsApi.md#getTenantCartAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Cart | Get a tenant&#39;s default cart |
| [**getTenantEnrollmentAsync**](TenantsApi.md#getTenantEnrollmentAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId} | Get a specific tenant enrollment |
| [**getTenantEnrollmentsAsync**](TenantsApi.md#getTenantEnrollmentsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments | Get the list of user enrollments for a tenant |
| [**getTenantInvitationsAsync**](TenantsApi.md#getTenantInvitationsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Invitations | Get the list of invitations issued by a tenant |
| [**getTenantLicensesAsync**](TenantsApi.md#getTenantLicensesAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Licenses | Get the list of licenses available to a tenant |
| [**getTenantNotificationsAsync**](TenantsApi.md#getTenantNotificationsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Notifications | Get the list of notifications for a tenant |
| [**getTenantNotificationsCountAsync**](TenantsApi.md#getTenantNotificationsCountAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Notifications/Count | Get the count of notifications for a tenant |
| [**getTenantPendingInvitationsAsync**](TenantsApi.md#getTenantPendingInvitationsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Invitations/Pending | Get the list of invitations issued by a tenant that are pending |
| [**getTenantRedeemedInvitationsAsync**](TenantsApi.md#getTenantRedeemedInvitationsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Invitations/Redeemed | Get the list of invitations issued by a tenant that have been redeemed |
| [**getTenantRevokedInvitationsAsync**](TenantsApi.md#getTenantRevokedInvitationsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Invitations/Revoked | Get the list of invitations issued by a tenant that have been revoked |
| [**getTenantSocialProfileAsync**](TenantsApi.md#getTenantSocialProfileAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/SocialProfile | Get a tenant&#39;s social profile |
| [**getTenantUsersAsync**](TenantsApi.md#getTenantUsersAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Users | Get the list of users enrolled in a tenant |
| [**getTenantWalletAsync**](TenantsApi.md#getTenantWalletAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Wallet | Get a tenant&#39;s billing profile (A.K.A. Wallet Account) |
| [**getTenantWebPortalsAsync**](TenantsApi.md#getTenantWebPortalsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/WebPortals | Get the list of web portals for a tenant |
| [**patchTenantAsync**](TenantsApi.md#patchTenantAsync) | **PATCH** /api/v2/TenantsService/Tenants/{tenantId} | Patch a tenant&#39;s profile |
| [**revokeLicenseAsync**](TenantsApi.md#revokeLicenseAsync) | **DELETE** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/Licenses/{licenseId} | Revoke a license from a specific enrollment |
| [**selectTenantAsync**](TenantsApi.md#selectTenantAsync) | **POST** /api/v2/TenantsService/Tenants/{tenantId}/Select | Select a business tenant as the user&#39;s default tenant |
| [**updateAvatarAsync**](TenantsApi.md#updateAvatarAsync) | **POST** /api/v2/TenantsService/Tenants/{tenantId}/Avatar | Update a tenant&#39;s avatar |
| [**updateTenantAsync**](TenantsApi.md#updateTenantAsync) | **PUT** /api/v2/TenantsService/Tenants/{tenantId} | Update a tenant&#39;s profile |
| [**validateEnrollmentFeatureAccess**](TenantsApi.md#validateEnrollmentFeatureAccess) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/HasAccess | Validate the access to a specific feature for a specific enrollment |
| [**validateEnrollmentPermissionsAsync**](TenantsApi.md#validateEnrollmentPermissionsAsync) | **GET** /api/v2/TenantsService/Tenants/{tenantId}/Enrollments/{enrollmentId}/Permissions/Validate | Validate the existence of a list of roles and permissions for a specific enrollment |


<a id="assignLicenseAsync"></a>
# **assignLicenseAsync**
> SuiteLicenseDtoListEnvelope assignLicenseAsync(tenantId, enrollmentId, licenseId, apiVersion, xApiVersion)

Assign a license to a specific enrollment

Assign a license to a specific enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val licenseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SuiteLicenseDtoListEnvelope = apiInstance.assignLicenseAsync(tenantId, enrollmentId, licenseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#assignLicenseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#assignLicenseAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **licenseId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SuiteLicenseDtoListEnvelope**](SuiteLicenseDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createTenantAsync"></a>
# **createTenantAsync**
> EmptyEnvelope createTenantAsync(apiVersion, xApiVersion, tenantCreateDto)

Create a new business tenant

Create a new business tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantCreateDto : TenantCreateDto =  // TenantCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTenantAsync(apiVersion, xApiVersion, tenantCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#createTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#createTenantAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantCreateDto** | [**TenantCreateDto**](TenantCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deSelectTenantAsync"></a>
# **deSelectTenantAsync**
> EmptyEnvelope deSelectTenantAsync(apiVersion, xApiVersion)

Deselect the user&#39;s default tenant

Deselect the user&#39;s default tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deSelectTenantAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#deSelectTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#deSelectTenantAsync")
    e.printStackTrace()
}
```

### Parameters
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

<a id="deleteTenantAsync"></a>
# **deleteTenantAsync**
> EmptyEnvelope deleteTenantAsync(tenantId, apiVersion, xApiVersion)

Delete a tenant

Delete a business tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTenantAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#deleteTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#deleteTenantAsync")
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccessibleFeaturesAsync"></a>
# **getAccessibleFeaturesAsync**
> SuiteLicenseFeatureDtoListEnvelope getAccessibleFeaturesAsync(tenantId, enrollmentId, apiVersion, xApiVersion)

Get the list of features accessible to a specific enrollment

Get the list of features accessible to a specific enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SuiteLicenseFeatureDtoListEnvelope = apiInstance.getAccessibleFeaturesAsync(tenantId, enrollmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getAccessibleFeaturesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getAccessibleFeaturesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SuiteLicenseFeatureDtoListEnvelope**](SuiteLicenseFeatureDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurrentTenantAsync"></a>
# **getCurrentTenantAsync**
> TenantDtoEnvelope getCurrentTenantAsync(tenantId, apiVersion, xApiVersion)

Get the user&#39;s current default tenant

Get the user&#39;s current default tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDtoEnvelope = apiInstance.getCurrentTenantAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getCurrentTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getCurrentTenantAsync")
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

[**TenantDtoEnvelope**](TenantDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnrollmentLicenseByIdAsync"></a>
# **getEnrollmentLicenseByIdAsync**
> SuiteLicenseDtoListEnvelope getEnrollmentLicenseByIdAsync(tenantId, enrollmentId, licenseId, apiVersion, xApiVersion)

Get a specific license for an enrollment

Get a specific license for an enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val licenseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SuiteLicenseDtoListEnvelope = apiInstance.getEnrollmentLicenseByIdAsync(tenantId, enrollmentId, licenseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getEnrollmentLicenseByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getEnrollmentLicenseByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **licenseId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SuiteLicenseDtoListEnvelope**](SuiteLicenseDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnrollmentLicensesAsync"></a>
# **getEnrollmentLicensesAsync**
> SuiteLicenseAssignmentDtoListEnvelope getEnrollmentLicensesAsync(tenantId, enrollmentId, apiVersion, xApiVersion)

Get the list of licenses available to a specific enrollment

Get the list of licenses available to a specific enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SuiteLicenseAssignmentDtoListEnvelope = apiInstance.getEnrollmentLicensesAsync(tenantId, enrollmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getEnrollmentLicensesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getEnrollmentLicensesAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SuiteLicenseAssignmentDtoListEnvelope**](SuiteLicenseAssignmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEnrollmentPermissionsAsync"></a>
# **getEnrollmentPermissionsAsync**
> StringListEnvelope getEnrollmentPermissionsAsync(tenantId, enrollmentId, apiVersion, xApiVersion)

Get a specific tenant enrollment&#39;s permissions list

Get a specific tenant enrollment&#39;s permissions list

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : StringListEnvelope = apiInstance.getEnrollmentPermissionsAsync(tenantId, enrollmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getEnrollmentPermissionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getEnrollmentPermissionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**StringListEnvelope**](StringListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedTenantAsync"></a>
# **getExtendedTenantAsync**
> ExtendedTenantDtoEnvelope getExtendedTenantAsync(tenantId, apiVersion, xApiVersion)

Get an extended tenant&#39;s business profile

Get an extended tenant&#39;s business profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedTenantDtoEnvelope = apiInstance.getExtendedTenantAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getExtendedTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getExtendedTenantAsync")
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

[**ExtendedTenantDtoEnvelope**](ExtendedTenantDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedTenantEnrollmentAsync"></a>
# **getExtendedTenantEnrollmentAsync**
> ExtendedTenantEnrollmentDtoEnvelope getExtendedTenantEnrollmentAsync(tenantId, enrollmentId, apiVersion, xApiVersion)

Get a specific tenant enrollment

Get a specific tenant enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedTenantEnrollmentDtoEnvelope = apiInstance.getExtendedTenantEnrollmentAsync(tenantId, enrollmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getExtendedTenantEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getExtendedTenantEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedTenantEnrollmentDtoEnvelope**](ExtendedTenantEnrollmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRootTenantAsync"></a>
# **getRootTenantAsync**
> TenantDtoEnvelope getRootTenantAsync(apiVersion, xApiVersion)

Get the root tenant of the platform

Get the root tenant of the platform

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDtoEnvelope = apiInstance.getRootTenantAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getRootTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getRootTenantAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantDtoEnvelope**](TenantDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantAsync"></a>
# **getTenantAsync**
> TenantDtoEnvelope getTenantAsync(tenantId, apiVersion, xApiVersion)

Get a specific tenant by ID

Get a specific tenant by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDtoEnvelope = apiInstance.getTenantAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantAsync")
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

[**TenantDtoEnvelope**](TenantDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantAvatarAsync"></a>
# **getTenantAvatarAsync**
> EmptyEnvelope getTenantAvatarAsync(tenantId, apiVersion, xApiVersion)

Get a tenant&#39;s avatar

Get a tenant&#39;s avatar

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getTenantAvatarAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantAvatarAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantAvatarAsync")
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantCartAsync"></a>
# **getTenantCartAsync**
> CartDtoEnvelope getTenantCartAsync(tenantId, apiVersion, xApiVersion)

Get a tenant&#39;s default cart

Get a tenant&#39;s default cart

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CartDtoEnvelope = apiInstance.getTenantCartAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantCartAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantCartAsync")
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

[**CartDtoEnvelope**](CartDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantEnrollmentAsync"></a>
# **getTenantEnrollmentAsync**
> TenantEnrollmentDtoEnvelope getTenantEnrollmentAsync(tenantId, enrollmentId, apiVersion, xApiVersion)

Get a specific tenant enrollment

Get a specific tenant enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrollmentDtoEnvelope = apiInstance.getTenantEnrollmentAsync(tenantId, enrollmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
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

<a id="getTenantEnrollmentsAsync"></a>
# **getTenantEnrollmentsAsync**
> TenantEnrollmentDtoListEnvelope getTenantEnrollmentsAsync(tenantId, apiVersion, xApiVersion)

Get the list of user enrollments for a tenant

Get the list of user enrollments for a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrollmentDtoListEnvelope = apiInstance.getTenantEnrollmentsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantEnrollmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantEnrollmentsAsync")
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

<a id="getTenantInvitationsAsync"></a>
# **getTenantInvitationsAsync**
> TenantInvitationDtoListEnvelope getTenantInvitationsAsync(tenantId, apiVersion, xApiVersion)

Get the list of invitations issued by a tenant

Get the list of invitations issued by a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantInvitationDtoListEnvelope = apiInstance.getTenantInvitationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantInvitationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantInvitationsAsync")
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

[**TenantInvitationDtoListEnvelope**](TenantInvitationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantLicensesAsync"></a>
# **getTenantLicensesAsync**
> SuiteLicenseDtoListEnvelope getTenantLicensesAsync(tenantId, apiVersion, xApiVersion)

Get the list of licenses available to a tenant

Get the list of licenses available to a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SuiteLicenseDtoListEnvelope = apiInstance.getTenantLicensesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantLicensesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantLicensesAsync")
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

[**SuiteLicenseDtoListEnvelope**](SuiteLicenseDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantNotificationsAsync"></a>
# **getTenantNotificationsAsync**
> NotificationDtoListEnvelope getTenantNotificationsAsync(tenantId, apiVersion, xApiVersion)

Get the list of notifications for a tenant

Get the list of notifications for a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NotificationDtoListEnvelope = apiInstance.getTenantNotificationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantNotificationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantNotificationsAsync")
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

[**NotificationDtoListEnvelope**](NotificationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantNotificationsCountAsync"></a>
# **getTenantNotificationsCountAsync**
> Int32Envelope getTenantNotificationsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of notifications for a tenant

Get the count of notifications for a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTenantNotificationsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantNotificationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantNotificationsCountAsync")
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

<a id="getTenantPendingInvitationsAsync"></a>
# **getTenantPendingInvitationsAsync**
> TenantInvitationDtoListEnvelope getTenantPendingInvitationsAsync(tenantId, apiVersion, xApiVersion)

Get the list of invitations issued by a tenant that are pending

Get the list of invitations issued by a tenant that are pending

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantInvitationDtoListEnvelope = apiInstance.getTenantPendingInvitationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantPendingInvitationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantPendingInvitationsAsync")
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

[**TenantInvitationDtoListEnvelope**](TenantInvitationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantRedeemedInvitationsAsync"></a>
# **getTenantRedeemedInvitationsAsync**
> TenantInvitationDtoListEnvelope getTenantRedeemedInvitationsAsync(tenantId, apiVersion, xApiVersion)

Get the list of invitations issued by a tenant that have been redeemed

Get the list of invitations issued by a tenant that have been redeemed

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantInvitationDtoListEnvelope = apiInstance.getTenantRedeemedInvitationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantRedeemedInvitationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantRedeemedInvitationsAsync")
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

[**TenantInvitationDtoListEnvelope**](TenantInvitationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantRevokedInvitationsAsync"></a>
# **getTenantRevokedInvitationsAsync**
> TenantInvitationDtoListEnvelope getTenantRevokedInvitationsAsync(tenantId, apiVersion, xApiVersion)

Get the list of invitations issued by a tenant that have been revoked

Get the list of invitations issued by a tenant that have been revoked

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantInvitationDtoListEnvelope = apiInstance.getTenantRevokedInvitationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantRevokedInvitationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantRevokedInvitationsAsync")
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

[**TenantInvitationDtoListEnvelope**](TenantInvitationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantSocialProfileAsync"></a>
# **getTenantSocialProfileAsync**
> SocialProfileDtoEnvelope getTenantSocialProfileAsync(tenantId, apiVersion, xApiVersion)

Get a tenant&#39;s social profile

Get a tenant&#39;s social profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialProfileDtoEnvelope = apiInstance.getTenantSocialProfileAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantSocialProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantSocialProfileAsync")
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

[**SocialProfileDtoEnvelope**](SocialProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantUsersAsync"></a>
# **getTenantUsersAsync**
> UserDtoListEnvelope getTenantUsersAsync(tenantId, apiVersion, xApiVersion)

Get the list of users enrolled in a tenant

Get the list of users enrolled in a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserDtoListEnvelope = apiInstance.getTenantUsersAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantUsersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantUsersAsync")
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

[**UserDtoListEnvelope**](UserDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantWalletAsync"></a>
# **getTenantWalletAsync**
> WalletDtoEnvelope getTenantWalletAsync(tenantId, apiVersion, xApiVersion)

Get a tenant&#39;s billing profile (A.K.A. Wallet Account)

Get a tenant&#39;s billing profile (A.K.A. Wallet Account)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WalletDtoEnvelope = apiInstance.getTenantWalletAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantWalletAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantWalletAsync")
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

[**WalletDtoEnvelope**](WalletDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantWebPortalsAsync"></a>
# **getTenantWebPortalsAsync**
> WebPortalDtoListEnvelope getTenantWebPortalsAsync(tenantId, apiVersion, xApiVersion)

Get the list of web portals for a tenant

Get the list of web portals for a tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WebPortalDtoListEnvelope = apiInstance.getTenantWebPortalsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#getTenantWebPortalsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#getTenantWebPortalsAsync")
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

[**WebPortalDtoListEnvelope**](WebPortalDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchTenantAsync"></a>
# **patchTenantAsync**
> EmptyEnvelope patchTenantAsync(tenantId, apiVersion, xApiVersion, operation)

Patch a tenant&#39;s profile

Patch a tenant&#39;s profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchTenantAsync(tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#patchTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#patchTenantAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="revokeLicenseAsync"></a>
# **revokeLicenseAsync**
> SuiteLicenseDtoListEnvelope revokeLicenseAsync(tenantId, enrollmentId, licenseId, apiVersion, xApiVersion)

Revoke a license from a specific enrollment

Revoke a license from a specific enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val licenseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SuiteLicenseDtoListEnvelope = apiInstance.revokeLicenseAsync(tenantId, enrollmentId, licenseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#revokeLicenseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#revokeLicenseAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **licenseId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SuiteLicenseDtoListEnvelope**](SuiteLicenseDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="selectTenantAsync"></a>
# **selectTenantAsync**
> EmptyEnvelope selectTenantAsync(tenantId, apiVersion, xApiVersion)

Select a business tenant as the user&#39;s default tenant

Select a business tenant as the user&#39;s default tenant

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.selectTenantAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#selectTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#selectTenantAsync")
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateAvatarAsync"></a>
# **updateAvatarAsync**
> EmptyEnvelope updateAvatarAsync(tenantId, apiVersion, xApiVersion, avatar)

Update a tenant&#39;s avatar

Update a tenant&#39;s avatar

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val avatar : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : EmptyEnvelope = apiInstance.updateAvatarAsync(tenantId, apiVersion, xApiVersion, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#updateAvatarAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#updateAvatarAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **avatar** | **java.io.File**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="updateTenantAsync"></a>
# **updateTenantAsync**
> EmptyEnvelope updateTenantAsync(tenantId, apiVersion, xApiVersion, tenantUpdateDto)

Update a tenant&#39;s profile

Update a tenant&#39;s profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val tenantUpdateDto : TenantUpdateDto =  // TenantUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantAsync(tenantId, apiVersion, xApiVersion, tenantUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#updateTenantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#updateTenantAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantUpdateDto** | [**TenantUpdateDto**](TenantUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="validateEnrollmentFeatureAccess"></a>
# **validateEnrollmentFeatureAccess**
> BooleanEnvelope validateEnrollmentFeatureAccess(tenantId, enrollmentId, feature, apiVersion, xApiVersion)

Validate the access to a specific feature for a specific enrollment

Validate the access to a specific feature for a specific enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val feature : kotlin.String = feature_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BooleanEnvelope = apiInstance.validateEnrollmentFeatureAccess(tenantId, enrollmentId, feature, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#validateEnrollmentFeatureAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#validateEnrollmentFeatureAccess")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **feature** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="validateEnrollmentPermissionsAsync"></a>
# **validateEnrollmentPermissionsAsync**
> BooleanEnvelope validateEnrollmentPermissionsAsync(tenantId, enrollmentId, roles, permissions, apiVersion, xApiVersion)

Validate the existence of a list of roles and permissions for a specific enrollment

Validate the existence of a list of roles and permissions for a specific enrollment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TenantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val roles : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val permissions : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BooleanEnvelope = apiInstance.validateEnrollmentPermissionsAsync(tenantId, enrollmentId, roles, permissions, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TenantsApi#validateEnrollmentPermissionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TenantsApi#validateEnrollmentPermissionsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **enrollmentId** | **java.util.UUID**|  | |
| **roles** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional] |
| **permissions** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BooleanEnvelope**](BooleanEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

