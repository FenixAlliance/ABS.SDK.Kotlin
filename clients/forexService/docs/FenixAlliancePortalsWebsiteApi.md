# FenixAlliancePortalsWebsiteApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**accountLogoutPost**](FenixAlliancePortalsWebsiteApi.md#accountLogoutPost) | **POST** /Account/Logout |  |
| [**accountManageDownloadPersonalDataPost**](FenixAlliancePortalsWebsiteApi.md#accountManageDownloadPersonalDataPost) | **POST** /Account/Manage/DownloadPersonalData |  |
| [**accountManageLinkExternalLoginPost**](FenixAlliancePortalsWebsiteApi.md#accountManageLinkExternalLoginPost) | **POST** /Account/Manage/LinkExternalLogin |  |
| [**accountPerformExternalLoginPost**](FenixAlliancePortalsWebsiteApi.md#accountPerformExternalLoginPost) | **POST** /Account/PerformExternalLogin |  |
| [**forgotPasswordPost**](FenixAlliancePortalsWebsiteApi.md#forgotPasswordPost) | **POST** /forgotPassword |  |
| [**healthGet**](FenixAlliancePortalsWebsiteApi.md#healthGet) | **GET** /health |  |
| [**helloGet**](FenixAlliancePortalsWebsiteApi.md#helloGet) | **GET** /hello |  |
| [**loginPost**](FenixAlliancePortalsWebsiteApi.md#loginPost) | **POST** /login |  |
| [**manage2faPost**](FenixAlliancePortalsWebsiteApi.md#manage2faPost) | **POST** /manage/2fa |  |
| [**manageInfoGet**](FenixAlliancePortalsWebsiteApi.md#manageInfoGet) | **GET** /manage/info |  |
| [**manageInfoPost**](FenixAlliancePortalsWebsiteApi.md#manageInfoPost) | **POST** /manage/info |  |
| [**mapIdentityApiConfirmEmail**](FenixAlliancePortalsWebsiteApi.md#mapIdentityApiConfirmEmail) | **GET** /confirmEmail |  |
| [**refreshPost**](FenixAlliancePortalsWebsiteApi.md#refreshPost) | **POST** /refresh |  |
| [**registerPost**](FenixAlliancePortalsWebsiteApi.md#registerPost) | **POST** /register |  |
| [**resendConfirmationEmailPost**](FenixAlliancePortalsWebsiteApi.md#resendConfirmationEmailPost) | **POST** /resendConfirmationEmail |  |
| [**resetPasswordPost**](FenixAlliancePortalsWebsiteApi.md#resetPasswordPost) | **POST** /resetPassword |  |
| [**versionGet**](FenixAlliancePortalsWebsiteApi.md#versionGet) | **GET** /version |  |


<a id="accountLogoutPost"></a>
# **accountLogoutPost**
> accountLogoutPost(returnUrl)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val returnUrl : kotlin.String = returnUrl_example // kotlin.String | 
try {
    apiInstance.accountLogoutPost(returnUrl)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#accountLogoutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#accountLogoutPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnUrl** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="accountManageDownloadPersonalDataPost"></a>
# **accountManageDownloadPersonalDataPost**
> accountManageDownloadPersonalDataPost()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
try {
    apiInstance.accountManageDownloadPersonalDataPost()
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#accountManageDownloadPersonalDataPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#accountManageDownloadPersonalDataPost")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="accountManageLinkExternalLoginPost"></a>
# **accountManageLinkExternalLoginPost**
> accountManageLinkExternalLoginPost(provider)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val provider : kotlin.String = provider_example // kotlin.String | 
try {
    apiInstance.accountManageLinkExternalLoginPost(provider)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#accountManageLinkExternalLoginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#accountManageLinkExternalLoginPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **provider** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="accountPerformExternalLoginPost"></a>
# **accountPerformExternalLoginPost**
> accountPerformExternalLoginPost(provider, returnUrl)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val provider : kotlin.String = provider_example // kotlin.String | 
val returnUrl : kotlin.String = returnUrl_example // kotlin.String | 
try {
    apiInstance.accountPerformExternalLoginPost(provider, returnUrl)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#accountPerformExternalLoginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#accountPerformExternalLoginPost")
    e.printStackTrace()
}
```

### Parameters
| **provider** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **returnUrl** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="forgotPasswordPost"></a>
# **forgotPasswordPost**
> forgotPasswordPost(forgotPasswordRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val forgotPasswordRequest : ForgotPasswordRequest =  // ForgotPasswordRequest | 
try {
    apiInstance.forgotPasswordPost(forgotPasswordRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#forgotPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#forgotPasswordPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **forgotPasswordRequest** | [**ForgotPasswordRequest**](ForgotPasswordRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

<a id="healthGet"></a>
# **healthGet**
> healthGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
try {
    apiInstance.healthGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#healthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#healthGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="helloGet"></a>
# **helloGet**
> helloGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
try {
    apiInstance.helloGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#helloGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#helloGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="loginPost"></a>
# **loginPost**
> AccessTokenResponse loginPost(loginRequest, useCookies, useSessionCookies)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val loginRequest : LoginRequest =  // LoginRequest | 
val useCookies : kotlin.Boolean = true // kotlin.Boolean | 
val useSessionCookies : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : AccessTokenResponse = apiInstance.loginPost(loginRequest, useCookies, useSessionCookies)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#loginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#loginPost")
    e.printStackTrace()
}
```

### Parameters
| **loginRequest** | [**LoginRequest**](LoginRequest.md)|  | |
| **useCookies** | **kotlin.Boolean**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **useSessionCookies** | **kotlin.Boolean**|  | [optional] |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="manage2faPost"></a>
# **manage2faPost**
> TwoFactorResponse manage2faPost(twoFactorRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val twoFactorRequest : TwoFactorRequest =  // TwoFactorRequest | 
try {
    val result : TwoFactorResponse = apiInstance.manage2faPost(twoFactorRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#manage2faPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#manage2faPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **twoFactorRequest** | [**TwoFactorRequest**](TwoFactorRequest.md)|  | |

### Return type

[**TwoFactorResponse**](TwoFactorResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="manageInfoGet"></a>
# **manageInfoGet**
> InfoResponse manageInfoGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
try {
    val result : InfoResponse = apiInstance.manageInfoGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#manageInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#manageInfoGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a id="manageInfoPost"></a>
# **manageInfoPost**
> InfoResponse manageInfoPost(infoRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val infoRequest : InfoRequest =  // InfoRequest | 
try {
    val result : InfoResponse = apiInstance.manageInfoPost(infoRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#manageInfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#manageInfoPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **infoRequest** | [**InfoRequest**](InfoRequest.md)|  | |

### Return type

[**InfoResponse**](InfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a id="mapIdentityApiConfirmEmail"></a>
# **mapIdentityApiConfirmEmail**
> mapIdentityApiConfirmEmail(userId, code, changedEmail)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
val changedEmail : kotlin.String = changedEmail_example // kotlin.String | 
try {
    apiInstance.mapIdentityApiConfirmEmail(userId, code, changedEmail)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#mapIdentityApiConfirmEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#mapIdentityApiConfirmEmail")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
| **code** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changedEmail** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="refreshPost"></a>
# **refreshPost**
> AccessTokenResponse refreshPost(refreshRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val refreshRequest : RefreshRequest =  // RefreshRequest | 
try {
    val result : AccessTokenResponse = apiInstance.refreshPost(refreshRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#refreshPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#refreshPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)|  | |

### Return type

[**AccessTokenResponse**](AccessTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="registerPost"></a>
# **registerPost**
> registerPost(registerRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val registerRequest : RegisterRequest =  // RegisterRequest | 
try {
    apiInstance.registerPost(registerRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#registerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#registerPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **registerRequest** | [**RegisterRequest**](RegisterRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

<a id="resendConfirmationEmailPost"></a>
# **resendConfirmationEmailPost**
> resendConfirmationEmailPost(resendConfirmationEmailRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val resendConfirmationEmailRequest : ResendConfirmationEmailRequest =  // ResendConfirmationEmailRequest | 
try {
    apiInstance.resendConfirmationEmailPost(resendConfirmationEmailRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#resendConfirmationEmailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#resendConfirmationEmailPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resendConfirmationEmailRequest** | [**ResendConfirmationEmailRequest**](ResendConfirmationEmailRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a id="resetPasswordPost"></a>
# **resetPasswordPost**
> resetPasswordPost(resetPasswordRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
val resetPasswordRequest : ResetPasswordRequest =  // ResetPasswordRequest | 
try {
    apiInstance.resetPasswordPost(resetPasswordRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#resetPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#resetPasswordPost")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **resetPasswordRequest** | [**ResetPasswordRequest**](ResetPasswordRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/problem+json

<a id="versionGet"></a>
# **versionGet**
> versionGet()



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAlliancePortalsWebsiteApi()
try {
    apiInstance.versionGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAlliancePortalsWebsiteApi#versionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAlliancePortalsWebsiteApi#versionGet")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

