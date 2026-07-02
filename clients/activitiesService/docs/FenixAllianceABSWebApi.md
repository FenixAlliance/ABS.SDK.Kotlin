# FenixAllianceABSWebApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**accountLogoutPost**](FenixAllianceABSWebApi.md#accountLogoutPost) | **POST** /Account/Logout |  |
| [**accountManageDownloadPersonalDataPost**](FenixAllianceABSWebApi.md#accountManageDownloadPersonalDataPost) | **POST** /Account/Manage/DownloadPersonalData |  |
| [**accountManageLinkExternalLoginPost**](FenixAllianceABSWebApi.md#accountManageLinkExternalLoginPost) | **POST** /Account/Manage/LinkExternalLogin |  |
| [**accountPerformExternalLoginPost**](FenixAllianceABSWebApi.md#accountPerformExternalLoginPost) | **POST** /Account/PerformExternalLogin |  |
| [**forgotPasswordPost**](FenixAllianceABSWebApi.md#forgotPasswordPost) | **POST** /forgotPassword |  |
| [**healthGet**](FenixAllianceABSWebApi.md#healthGet) | **GET** /health |  |
| [**helloGet**](FenixAllianceABSWebApi.md#helloGet) | **GET** /hello |  |
| [**loginPost**](FenixAllianceABSWebApi.md#loginPost) | **POST** /login |  |
| [**manage2faPost**](FenixAllianceABSWebApi.md#manage2faPost) | **POST** /manage/2fa |  |
| [**manageInfoGet**](FenixAllianceABSWebApi.md#manageInfoGet) | **GET** /manage/info |  |
| [**manageInfoPost**](FenixAllianceABSWebApi.md#manageInfoPost) | **POST** /manage/info |  |
| [**mapIdentityApiConfirmEmail**](FenixAllianceABSWebApi.md#mapIdentityApiConfirmEmail) | **GET** /confirmEmail |  |
| [**refreshPost**](FenixAllianceABSWebApi.md#refreshPost) | **POST** /refresh |  |
| [**registerPost**](FenixAllianceABSWebApi.md#registerPost) | **POST** /register |  |
| [**resendConfirmationEmailPost**](FenixAllianceABSWebApi.md#resendConfirmationEmailPost) | **POST** /resendConfirmationEmail |  |
| [**resetPasswordPost**](FenixAllianceABSWebApi.md#resetPasswordPost) | **POST** /resetPassword |  |
| [**versionGet**](FenixAllianceABSWebApi.md#versionGet) | **GET** /version |  |


<a id="accountLogoutPost"></a>
# **accountLogoutPost**
> accountLogoutPost(returnUrl)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAllianceABSWebApi()
val returnUrl : kotlin.String = returnUrl_example // kotlin.String | 
try {
    apiInstance.accountLogoutPost(returnUrl)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#accountLogoutPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#accountLogoutPost")
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

val apiInstance = FenixAllianceABSWebApi()
try {
    apiInstance.accountManageDownloadPersonalDataPost()
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#accountManageDownloadPersonalDataPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#accountManageDownloadPersonalDataPost")
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

val apiInstance = FenixAllianceABSWebApi()
val provider : kotlin.String = provider_example // kotlin.String | 
try {
    apiInstance.accountManageLinkExternalLoginPost(provider)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#accountManageLinkExternalLoginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#accountManageLinkExternalLoginPost")
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

val apiInstance = FenixAllianceABSWebApi()
val provider : kotlin.String = provider_example // kotlin.String | 
val returnUrl : kotlin.String = returnUrl_example // kotlin.String | 
try {
    apiInstance.accountPerformExternalLoginPost(provider, returnUrl)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#accountPerformExternalLoginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#accountPerformExternalLoginPost")
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

val apiInstance = FenixAllianceABSWebApi()
val forgotPasswordRequest : ForgotPasswordRequest =  // ForgotPasswordRequest | 
try {
    apiInstance.forgotPasswordPost(forgotPasswordRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#forgotPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#forgotPasswordPost")
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

val apiInstance = FenixAllianceABSWebApi()
try {
    apiInstance.healthGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#healthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#healthGet")
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

val apiInstance = FenixAllianceABSWebApi()
try {
    apiInstance.helloGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#helloGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#helloGet")
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

val apiInstance = FenixAllianceABSWebApi()
val loginRequest : LoginRequest =  // LoginRequest | 
val useCookies : kotlin.Boolean = true // kotlin.Boolean | 
val useSessionCookies : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : AccessTokenResponse = apiInstance.loginPost(loginRequest, useCookies, useSessionCookies)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#loginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#loginPost")
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

val apiInstance = FenixAllianceABSWebApi()
val twoFactorRequest : TwoFactorRequest =  // TwoFactorRequest | 
try {
    val result : TwoFactorResponse = apiInstance.manage2faPost(twoFactorRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#manage2faPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#manage2faPost")
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

val apiInstance = FenixAllianceABSWebApi()
try {
    val result : InfoResponse = apiInstance.manageInfoGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#manageInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#manageInfoGet")
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

val apiInstance = FenixAllianceABSWebApi()
val infoRequest : InfoRequest =  // InfoRequest | 
try {
    val result : InfoResponse = apiInstance.manageInfoPost(infoRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#manageInfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#manageInfoPost")
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

val apiInstance = FenixAllianceABSWebApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
val changedEmail : kotlin.String = changedEmail_example // kotlin.String | 
try {
    apiInstance.mapIdentityApiConfirmEmail(userId, code, changedEmail)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#mapIdentityApiConfirmEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#mapIdentityApiConfirmEmail")
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

val apiInstance = FenixAllianceABSWebApi()
val refreshRequest : RefreshRequest =  // RefreshRequest | 
try {
    val result : AccessTokenResponse = apiInstance.refreshPost(refreshRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#refreshPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#refreshPost")
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

val apiInstance = FenixAllianceABSWebApi()
val registerRequest : RegisterRequest =  // RegisterRequest | 
try {
    apiInstance.registerPost(registerRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#registerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#registerPost")
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

val apiInstance = FenixAllianceABSWebApi()
val resendConfirmationEmailRequest : ResendConfirmationEmailRequest =  // ResendConfirmationEmailRequest | 
try {
    apiInstance.resendConfirmationEmailPost(resendConfirmationEmailRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#resendConfirmationEmailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#resendConfirmationEmailPost")
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

val apiInstance = FenixAllianceABSWebApi()
val resetPasswordRequest : ResetPasswordRequest =  // ResetPasswordRequest | 
try {
    apiInstance.resetPasswordPost(resetPasswordRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#resetPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#resetPasswordPost")
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

val apiInstance = FenixAllianceABSWebApi()
try {
    apiInstance.versionGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABSWebApi#versionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABSWebApi#versionGet")
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

