# UsersApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countCurrentUserFollowersAsync**](UsersApi.md#countCurrentUserFollowersAsync) | **GET** /api/v2/Me/Followers/Count | Count the social profiles that follow the current user |
| [**countCurrentUserFollowsAsync**](UsersApi.md#countCurrentUserFollowsAsync) | **GET** /api/v2/Me/Follows/Count | Count the social profiles that the current user follows |
| [**countCurrentUserNotificationsAsync**](UsersApi.md#countCurrentUserNotificationsAsync) | **GET** /api/v2/Me/Notifications/Count | Count the notifications for the current user |
| [**countCurrentUserTenantsAsync**](UsersApi.md#countCurrentUserTenantsAsync) | **GET** /api/v2/Me/Tenants/Count | Count the tenants that the current user is enrolled in |
| [**getCurrentUserAddressesAsync**](UsersApi.md#getCurrentUserAddressesAsync) | **GET** /api/v2/Me/Addresses | Get the list of addresses for the current user |
| [**getCurrentUserAsync**](UsersApi.md#getCurrentUserAsync) | **GET** /api/v2/Me | Gets the current user |
| [**getCurrentUserAvatarAsync**](UsersApi.md#getCurrentUserAvatarAsync) | **GET** /api/v2/Me/Avatar | Get the current user&#39;s avatar |
| [**getCurrentUserCartAsync**](UsersApi.md#getCurrentUserCartAsync) | **GET** /api/v2/Me/Cart | Get the current user&#39;s cart |
| [**getCurrentUserEnrollmentsAsync**](UsersApi.md#getCurrentUserEnrollmentsAsync) | **GET** /api/v2/Me/Enrollments | Get the list of enrollments for the current user |
| [**getCurrentUserEnrollmentsExtendedAsync**](UsersApi.md#getCurrentUserEnrollmentsExtendedAsync) | **GET** /api/v2/Me/Enrollments/Extended | Get the list of enrollments for the current user |
| [**getCurrentUserFollowersAsync**](UsersApi.md#getCurrentUserFollowersAsync) | **GET** /api/v2/Me/Followers | Get the social profiles that follow the current user |
| [**getCurrentUserFollowsAsync**](UsersApi.md#getCurrentUserFollowsAsync) | **GET** /api/v2/Me/Follows | Get the social profiles that the current user follows |
| [**getCurrentUserInvitationAsync**](UsersApi.md#getCurrentUserInvitationAsync) | **GET** /api/v2/Me/Invitations | Get the list of tenant enrollment invitations for the current user |
| [**getCurrentUserNotificationsAsync**](UsersApi.md#getCurrentUserNotificationsAsync) | **GET** /api/v2/Me/Notifications | Get the list of notifications for the current user |
| [**getCurrentUserSettingsAsync**](UsersApi.md#getCurrentUserSettingsAsync) | **GET** /api/v2/Me/Settings | Get the settings for the current user |
| [**getCurrentUserSocialProfileAsync**](UsersApi.md#getCurrentUserSocialProfileAsync) | **GET** /api/v2/Me/SocialProfile | Get the current user&#39;s social profile |
| [**getCurrentUserTenantsAsync**](UsersApi.md#getCurrentUserTenantsAsync) | **GET** /api/v2/Me/Tenants | Get the tenants that the current user is enrolled in |
| [**getCurrentUserTenantsExtendedAsync**](UsersApi.md#getCurrentUserTenantsExtendedAsync) | **GET** /api/v2/Me/Tenants/Extended | Get the tenants that the current user is enrolled in |
| [**getCurrentUserWalletAsync**](UsersApi.md#getCurrentUserWalletAsync) | **GET** /api/v2/Me/Wallet | Get the current user&#39;s billing profile |
| [**getEnrollmentAsync**](UsersApi.md#getEnrollmentAsync) | **GET** /api/v2/Me/Enrollments/{enrollmentId} | Get a single TenantEnrollment by its ID |
| [**getExtendedCurrentUserAsync**](UsersApi.md#getExtendedCurrentUserAsync) | **GET** /api/v2/Me/Extended | Get the current user&#39;s extended profile |
| [**patchCurrentUserAsync**](UsersApi.md#patchCurrentUserAsync) | **PATCH** /api/v2/Me | Partially update the current user&#39;s profile |
| [**updateAvatarAsync**](UsersApi.md#updateAvatarAsync) | **POST** /api/v2/Me/Avatar | Update the current user&#39;s avatar |
| [**updateCurrentUserAsync**](UsersApi.md#updateCurrentUserAsync) | **PUT** /api/v2/Me | Update the current user&#39;s profile |
| [**updateCurrentUserSettingsAsync**](UsersApi.md#updateCurrentUserSettingsAsync) | **PUT** /api/v2/Me/Settings | Update the settings for the current user |


<a id="countCurrentUserFollowersAsync"></a>
# **countCurrentUserFollowersAsync**
> Int32Envelope countCurrentUserFollowersAsync(apiVersion, xApiVersion)

Count the social profiles that follow the current user

Count the social profiles that follow the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrentUserFollowersAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#countCurrentUserFollowersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#countCurrentUserFollowersAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="countCurrentUserFollowsAsync"></a>
# **countCurrentUserFollowsAsync**
> Int32Envelope countCurrentUserFollowsAsync(apiVersion, xApiVersion)

Count the social profiles that the current user follows

Count the social profiles that the current user follows

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrentUserFollowsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#countCurrentUserFollowsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#countCurrentUserFollowsAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="countCurrentUserNotificationsAsync"></a>
# **countCurrentUserNotificationsAsync**
> Int32Envelope countCurrentUserNotificationsAsync(apiVersion, xApiVersion)

Count the notifications for the current user

Count the notifications for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrentUserNotificationsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#countCurrentUserNotificationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#countCurrentUserNotificationsAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="countCurrentUserTenantsAsync"></a>
# **countCurrentUserTenantsAsync**
> Int32Envelope countCurrentUserTenantsAsync(apiVersion, xApiVersion)

Count the tenants that the current user is enrolled in

Count the tenants that the current user is enrolled in

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrentUserTenantsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#countCurrentUserTenantsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#countCurrentUserTenantsAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserAddressesAsync"></a>
# **getCurrentUserAddressesAsync**
> AddressDtoListEnvelope getCurrentUserAddressesAsync(apiVersion, xApiVersion)

Get the list of addresses for the current user

Get the list of addresses for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AddressDtoListEnvelope = apiInstance.getCurrentUserAddressesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserAddressesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserAddressesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AddressDtoListEnvelope**](AddressDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserAsync"></a>
# **getCurrentUserAsync**
> UserDtoEnvelope getCurrentUserAsync(apiVersion, xApiVersion)

Gets the current user

Get the currently acting user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserDtoEnvelope = apiInstance.getCurrentUserAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**UserDtoEnvelope**](UserDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserAvatarAsync"></a>
# **getCurrentUserAvatarAsync**
> java.io.File getCurrentUserAvatarAsync(apiVersion, xApiVersion)

Get the current user&#39;s avatar

Get the current user&#39;s avatar

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getCurrentUserAvatarAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserAvatarAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserAvatarAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**java.io.File**](java.io.File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserCartAsync"></a>
# **getCurrentUserCartAsync**
> CartDtoEnvelope getCurrentUserCartAsync(apiVersion, xApiVersion)

Get the current user&#39;s cart

Get the current user&#39;s cart

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CartDtoEnvelope = apiInstance.getCurrentUserCartAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserCartAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserCartAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserEnrollmentsAsync"></a>
# **getCurrentUserEnrollmentsAsync**
> TenantEnrollmentDtoListEnvelope getCurrentUserEnrollmentsAsync(apiVersion, xApiVersion)

Get the list of enrollments for the current user

Get the list of enrollments for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrollmentDtoListEnvelope = apiInstance.getCurrentUserEnrollmentsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserEnrollmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserEnrollmentsAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserEnrollmentsExtendedAsync"></a>
# **getCurrentUserEnrollmentsExtendedAsync**
> ExtendedTenantEnrollmentDtoListEnvelope getCurrentUserEnrollmentsExtendedAsync(apiVersion, xApiVersion)

Get the list of enrollments for the current user

Get the list of enrollments for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedTenantEnrollmentDtoListEnvelope = apiInstance.getCurrentUserEnrollmentsExtendedAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserEnrollmentsExtendedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserEnrollmentsExtendedAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedTenantEnrollmentDtoListEnvelope**](ExtendedTenantEnrollmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserFollowersAsync"></a>
# **getCurrentUserFollowersAsync**
> FollowRecordDtoListEnvelope getCurrentUserFollowersAsync(apiVersion, xApiVersion)

Get the social profiles that follow the current user

Get the social profiles that follow the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FollowRecordDtoListEnvelope = apiInstance.getCurrentUserFollowersAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserFollowersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserFollowersAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FollowRecordDtoListEnvelope**](FollowRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserFollowsAsync"></a>
# **getCurrentUserFollowsAsync**
> FollowRecordDtoListEnvelope getCurrentUserFollowsAsync(apiVersion, xApiVersion)

Get the social profiles that the current user follows

Get the social profiles that the current user follows

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FollowRecordDtoListEnvelope = apiInstance.getCurrentUserFollowsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserFollowsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserFollowsAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**FollowRecordDtoListEnvelope**](FollowRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserInvitationAsync"></a>
# **getCurrentUserInvitationAsync**
> TenantInvitationDtoListEnvelope getCurrentUserInvitationAsync(apiVersion, xApiVersion)

Get the list of tenant enrollment invitations for the current user

Get the list of tenant enrollment invitations for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantInvitationDtoListEnvelope = apiInstance.getCurrentUserInvitationAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserInvitationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserInvitationAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserNotificationsAsync"></a>
# **getCurrentUserNotificationsAsync**
> NotificationDtoListEnvelope getCurrentUserNotificationsAsync(apiVersion, xApiVersion)

Get the list of notifications for the current user

Get the list of notifications for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NotificationDtoListEnvelope = apiInstance.getCurrentUserNotificationsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserNotificationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserNotificationsAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserSettingsAsync"></a>
# **getCurrentUserSettingsAsync**
> UserSettingsDtoEnvelope getCurrentUserSettingsAsync(apiVersion, xApiVersion)

Get the settings for the current user

Get the settings for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserSettingsDtoEnvelope = apiInstance.getCurrentUserSettingsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserSettingsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserSettingsAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**UserSettingsDtoEnvelope**](UserSettingsDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserSocialProfileAsync"></a>
# **getCurrentUserSocialProfileAsync**
> SocialProfileDtoEnvelope getCurrentUserSocialProfileAsync(apiVersion, xApiVersion)

Get the current user&#39;s social profile

Get the current user&#39;s social profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialProfileDtoEnvelope = apiInstance.getCurrentUserSocialProfileAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserSocialProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserSocialProfileAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserTenantsAsync"></a>
# **getCurrentUserTenantsAsync**
> TenantDtoListEnvelope getCurrentUserTenantsAsync(apiVersion, xApiVersion)

Get the tenants that the current user is enrolled in

Get the tenants that the current user is enrolled in

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDtoListEnvelope = apiInstance.getCurrentUserTenantsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserTenantsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserTenantsAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TenantDtoListEnvelope**](TenantDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserTenantsExtendedAsync"></a>
# **getCurrentUserTenantsExtendedAsync**
> ExtendedTenantDtoListEnvelope getCurrentUserTenantsExtendedAsync(apiVersion, xApiVersion)

Get the tenants that the current user is enrolled in

Get the tenants that the current user is enrolled in

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedTenantDtoListEnvelope = apiInstance.getCurrentUserTenantsExtendedAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserTenantsExtendedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserTenantsExtendedAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedTenantDtoListEnvelope**](ExtendedTenantDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserWalletAsync"></a>
# **getCurrentUserWalletAsync**
> WalletDtoEnvelope getCurrentUserWalletAsync(apiVersion, xApiVersion)

Get the current user&#39;s billing profile

Get the current user&#39;s billing profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WalletDtoEnvelope = apiInstance.getCurrentUserWalletAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getCurrentUserWalletAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getCurrentUserWalletAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getEnrollmentAsync"></a>
# **getEnrollmentAsync**
> TenantEnrollmentDtoEnvelope getEnrollmentAsync(enrollmentId, apiVersion, xApiVersion)

Get a single TenantEnrollment by its ID

Get a single TenantEnrollment by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val enrollmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrollmentDtoEnvelope = apiInstance.getEnrollmentAsync(enrollmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getExtendedCurrentUserAsync"></a>
# **getExtendedCurrentUserAsync**
> ExtendedUserDtoEnvelope getExtendedCurrentUserAsync(apiVersion, xApiVersion)

Get the current user&#39;s extended profile

Get the current user&#39;s extended profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedUserDtoEnvelope = apiInstance.getExtendedCurrentUserAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getExtendedCurrentUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getExtendedCurrentUserAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedUserDtoEnvelope**](ExtendedUserDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="patchCurrentUserAsync"></a>
# **patchCurrentUserAsync**
> EmptyEnvelope patchCurrentUserAsync(apiVersion, xApiVersion, operation)

Partially update the current user&#39;s profile

Partially update the current user&#39;s profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchCurrentUserAsync(apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#patchCurrentUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#patchCurrentUserAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="updateAvatarAsync"></a>
# **updateAvatarAsync**
> EmptyEnvelope updateAvatarAsync(apiVersion, xApiVersion, avatar)

Update the current user&#39;s avatar

Update the current user&#39;s avatar

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val avatar : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : EmptyEnvelope = apiInstance.updateAvatarAsync(apiVersion, xApiVersion, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateAvatarAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateAvatarAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="updateCurrentUserAsync"></a>
# **updateCurrentUserAsync**
> EmptyEnvelope updateCurrentUserAsync(apiVersion, xApiVersion, userUpdateDto)

Update the current user&#39;s profile

Update the current user&#39;s profile

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val userUpdateDto : UserUpdateDto =  // UserUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateCurrentUserAsync(apiVersion, xApiVersion, userUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateCurrentUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateCurrentUserAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userUpdateDto** | [**UserUpdateDto**](UserUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/form-data

<a id="updateCurrentUserSettingsAsync"></a>
# **updateCurrentUserSettingsAsync**
> UserSettingsDtoEnvelope updateCurrentUserSettingsAsync(apiVersion, xApiVersion, userSettingsUpdateDto)

Update the settings for the current user

Update the settings for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val userSettingsUpdateDto : UserSettingsUpdateDto =  // UserSettingsUpdateDto | 
try {
    val result : UserSettingsDtoEnvelope = apiInstance.updateCurrentUserSettingsAsync(apiVersion, xApiVersion, userSettingsUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateCurrentUserSettingsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateCurrentUserSettingsAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userSettingsUpdateDto** | [**UserSettingsUpdateDto**](UserSettingsUpdateDto.md)|  | [optional] |

### Return type

[**UserSettingsDtoEnvelope**](UserSettingsDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/form-data

