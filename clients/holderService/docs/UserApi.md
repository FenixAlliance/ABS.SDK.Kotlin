# UserApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countCurrentUserFollowersAsync**](UserApi.md#countCurrentUserFollowersAsync) | **GET** /api/v2/Me/Followers/Count | Count the social profiles that follow the current user |
| [**countCurrentUserFollowsAsync**](UserApi.md#countCurrentUserFollowsAsync) | **GET** /api/v2/Me/Follows/Count | Count the social profiles that the current user follows |
| [**countCurrentUserNotificationsAsync**](UserApi.md#countCurrentUserNotificationsAsync) | **GET** /api/v2/Me/Notifications/Count | Count the notifications for the current user |
| [**countCurrentUserTenantsAsync**](UserApi.md#countCurrentUserTenantsAsync) | **GET** /api/v2/Me/Businesses/Count | Count the tenants that the current user is enrolled in |
| [**getCurrentUserAddressesAsync**](UserApi.md#getCurrentUserAddressesAsync) | **GET** /api/v2/Me/Addresses | Get the list of addresses for the current user |
| [**getCurrentUserAsync**](UserApi.md#getCurrentUserAsync) | **GET** /api/v2/Me | Gets the current user |
| [**getCurrentUserAvatarAsync**](UserApi.md#getCurrentUserAvatarAsync) | **GET** /api/v2/Me/Avatar | Get the current user&#39;s avatar |
| [**getCurrentUserCartAsync**](UserApi.md#getCurrentUserCartAsync) | **GET** /api/v2/Me/Cart | Get the current user&#39;s cart |
| [**getCurrentUserEnrollmentsAsync**](UserApi.md#getCurrentUserEnrollmentsAsync) | **GET** /api/v2/Me/Enrollments | Get the list of enrollments for the current user |
| [**getCurrentUserEnrollmentsExtendedAsync**](UserApi.md#getCurrentUserEnrollmentsExtendedAsync) | **GET** /api/v2/Me/Enrollments/Extended | Get the list of enrollments for the current user |
| [**getCurrentUserFollowersAsync**](UserApi.md#getCurrentUserFollowersAsync) | **GET** /api/v2/Me/Followers | Get the social profiles that follow the current user |
| [**getCurrentUserFollowsAsync**](UserApi.md#getCurrentUserFollowsAsync) | **GET** /api/v2/Me/Follows | Get the social profiles that the current user follows |
| [**getCurrentUserInvitationAsync**](UserApi.md#getCurrentUserInvitationAsync) | **GET** /api/v2/Me/Invitations | Get the list of tenant enrollment invitations for the current user |
| [**getCurrentUserNotificationsAsync**](UserApi.md#getCurrentUserNotificationsAsync) | **GET** /api/v2/Me/Notifications | Get the list of notifications for the current user |
| [**getCurrentUserSettingsAsync**](UserApi.md#getCurrentUserSettingsAsync) | **GET** /api/v2/Me/Settings | Get the settings for the current user |
| [**getCurrentUserSocialProfileAsync**](UserApi.md#getCurrentUserSocialProfileAsync) | **GET** /api/v2/Me/SocialProfile | Get the current user&#39;s social profile |
| [**getCurrentUserTenantsAsync**](UserApi.md#getCurrentUserTenantsAsync) | **GET** /api/v2/Me/Businesses | Get the tenants that the current user is enrolled in |
| [**getCurrentUserTenantsExtendedAsync**](UserApi.md#getCurrentUserTenantsExtendedAsync) | **GET** /api/v2/Me/Businesses/Extended | Get the tenants that the current user is enrolled in |
| [**getCurrentUserWalletAsync**](UserApi.md#getCurrentUserWalletAsync) | **GET** /api/v2/Me/Wallet | Get the current user&#39;s billing profile |
| [**getExtendedCurrentUserAsync**](UserApi.md#getExtendedCurrentUserAsync) | **GET** /api/v2/Me/Extended | Get the current user&#39;s extended profile |
| [**getTenantEnrollmentAsync**](UserApi.md#getTenantEnrollmentAsync) | **GET** /api/v2/Me/Enrollments/{enrollmentId} | Get a single TenantEnrollment by its ID |
| [**patchCurrentUserAsync**](UserApi.md#patchCurrentUserAsync) | **PATCH** /api/v2/Me | Partially update the current user&#39;s profile |
| [**updateAvatarAsync**](UserApi.md#updateAvatarAsync) | **POST** /api/v2/Me/Avatar | Update the current user&#39;s avatar |
| [**updateCurrentUserAsync**](UserApi.md#updateCurrentUserAsync) | **PUT** /api/v2/Me | Update the current user&#39;s profile |
| [**updateCurrentUserSettingsAsync**](UserApi.md#updateCurrentUserSettingsAsync) | **PUT** /api/v2/Me/Settings | Update the settings for the current user |


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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrentUserFollowersAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#countCurrentUserFollowersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#countCurrentUserFollowersAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrentUserFollowsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#countCurrentUserFollowsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#countCurrentUserFollowsAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrentUserNotificationsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#countCurrentUserNotificationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#countCurrentUserNotificationsAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countCurrentUserTenantsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#countCurrentUserTenantsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#countCurrentUserTenantsAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AddressDtoListEnvelope = apiInstance.getCurrentUserAddressesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserAddressesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserAddressesAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserDtoEnvelope = apiInstance.getCurrentUserAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : java.io.File = apiInstance.getCurrentUserAvatarAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserAvatarAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserAvatarAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CartDtoEnvelope = apiInstance.getCurrentUserCartAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserCartAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserCartAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserEnrollmentsAsync"></a>
# **getCurrentUserEnrollmentsAsync**
> TenantEnrolmentDtoListEnvelope getCurrentUserEnrollmentsAsync(apiVersion, xApiVersion)

Get the list of enrollments for the current user

Get the list of enrollments for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantEnrolmentDtoListEnvelope = apiInstance.getCurrentUserEnrollmentsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserEnrollmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserEnrollmentsAsync")
    e.printStackTrace()
}
```

### Parameters
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
 - **Accept**: application/json, multipart/form-data

<a id="getCurrentUserEnrollmentsExtendedAsync"></a>
# **getCurrentUserEnrollmentsExtendedAsync**
> ExtendedTenantEnrolmentDtoListEnvelope getCurrentUserEnrollmentsExtendedAsync(apiVersion, xApiVersion)

Get the list of enrollments for the current user

Get the list of enrollments for the current user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedTenantEnrolmentDtoListEnvelope = apiInstance.getCurrentUserEnrollmentsExtendedAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserEnrollmentsExtendedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserEnrollmentsExtendedAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedTenantEnrolmentDtoListEnvelope**](ExtendedTenantEnrolmentDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FollowRecordDtoListEnvelope = apiInstance.getCurrentUserFollowersAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserFollowersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserFollowersAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : FollowRecordDtoListEnvelope = apiInstance.getCurrentUserFollowsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserFollowsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserFollowsAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantInvitationDtoListEnvelope = apiInstance.getCurrentUserInvitationAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserInvitationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserInvitationAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : NotificationDtoListEnvelope = apiInstance.getCurrentUserNotificationsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserNotificationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserNotificationsAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserSettingsDtoEnvelope = apiInstance.getCurrentUserSettingsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserSettingsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserSettingsAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialProfileDtoEnvelope = apiInstance.getCurrentUserSocialProfileAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserSocialProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserSocialProfileAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TenantDtoListEnvelope = apiInstance.getCurrentUserTenantsAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserTenantsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserTenantsAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedTenantDtoListEnvelope = apiInstance.getCurrentUserTenantsExtendedAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserTenantsExtendedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserTenantsExtendedAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WalletDtoEnvelope = apiInstance.getCurrentUserWalletAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getCurrentUserWalletAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getCurrentUserWalletAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedUserDtoEnvelope = apiInstance.getExtendedCurrentUserAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getExtendedCurrentUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getExtendedCurrentUserAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, multipart/form-data

<a id="getTenantEnrollmentAsync"></a>
# **getTenantEnrollmentAsync**
> TenantEnrolmentDtoEnvelope getTenantEnrollmentAsync(enrollmentId, apiVersion, xApiVersion, body)

Get a single TenantEnrollment by its ID

Get a single TenantEnrollment by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserApi()
val enrollmentId : kotlin.String = enrollmentId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : TenantEnrolmentDtoEnvelope = apiInstance.getTenantEnrollmentAsync(enrollmentId, apiVersion, xApiVersion, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getTenantEnrollmentAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getTenantEnrollmentAsync")
    e.printStackTrace()
}
```

### Parameters
| **enrollmentId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**TenantEnrolmentDtoEnvelope**](TenantEnrolmentDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchCurrentUserAsync(apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#patchCurrentUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#patchCurrentUserAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val avatar : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : EmptyEnvelope = apiInstance.updateAvatarAsync(apiVersion, xApiVersion, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateAvatarAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateAvatarAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val userUpdateDto : UserUpdateDto =  // UserUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateCurrentUserAsync(apiVersion, xApiVersion, userUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateCurrentUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateCurrentUserAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

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

val apiInstance = UserApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val userSettingsUpdateDto : UserSettingsUpdateDto =  // UserSettingsUpdateDto | 
try {
    val result : UserSettingsDtoEnvelope = apiInstance.updateCurrentUserSettingsAsync(apiVersion, xApiVersion, userSettingsUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserApi#updateCurrentUserSettingsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#updateCurrentUserSettingsAsync")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, multipart/form-data

