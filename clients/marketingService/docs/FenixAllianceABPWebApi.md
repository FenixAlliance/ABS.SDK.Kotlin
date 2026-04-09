# FenixAllianceABPWebApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**forgotPasswordPost**](FenixAllianceABPWebApi.md#forgotPasswordPost) | **POST** /forgotPassword |  |
| [**healthGet**](FenixAllianceABPWebApi.md#healthGet) | **GET** /health |  |
| [**helloGet**](FenixAllianceABPWebApi.md#helloGet) | **GET** /hello |  |
| [**loginPost**](FenixAllianceABPWebApi.md#loginPost) | **POST** /login |  |
| [**manage2faPost**](FenixAllianceABPWebApi.md#manage2faPost) | **POST** /manage/2fa |  |
| [**manageInfoGet**](FenixAllianceABPWebApi.md#manageInfoGet) | **GET** /manage/info |  |
| [**manageInfoPost**](FenixAllianceABPWebApi.md#manageInfoPost) | **POST** /manage/info |  |
| [**mapIdentityApiConfirmEmail**](FenixAllianceABPWebApi.md#mapIdentityApiConfirmEmail) | **GET** /confirmEmail |  |
| [**refreshPost**](FenixAllianceABPWebApi.md#refreshPost) | **POST** /refresh |  |
| [**registerPost**](FenixAllianceABPWebApi.md#registerPost) | **POST** /register |  |
| [**resendConfirmationEmailPost**](FenixAllianceABPWebApi.md#resendConfirmationEmailPost) | **POST** /resendConfirmationEmail |  |
| [**resetPasswordPost**](FenixAllianceABPWebApi.md#resetPasswordPost) | **POST** /resetPassword |  |
| [**versionGet**](FenixAllianceABPWebApi.md#versionGet) | **GET** /version |  |


<a id="forgotPasswordPost"></a>
# **forgotPasswordPost**
> forgotPasswordPost(forgotPasswordRequest)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = FenixAllianceABPWebApi()
val forgotPasswordRequest : ForgotPasswordRequest =  // ForgotPasswordRequest | 
try {
    apiInstance.forgotPasswordPost(forgotPasswordRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#forgotPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#forgotPasswordPost")
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

val apiInstance = FenixAllianceABPWebApi()
try {
    apiInstance.healthGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#healthGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#healthGet")
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

val apiInstance = FenixAllianceABPWebApi()
try {
    apiInstance.helloGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#helloGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#helloGet")
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

val apiInstance = FenixAllianceABPWebApi()
val loginRequest : LoginRequest =  // LoginRequest | 
val useCookies : kotlin.Boolean = true // kotlin.Boolean | 
val useSessionCookies : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : AccessTokenResponse = apiInstance.loginPost(loginRequest, useCookies, useSessionCookies)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#loginPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#loginPost")
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

val apiInstance = FenixAllianceABPWebApi()
val twoFactorRequest : TwoFactorRequest =  // TwoFactorRequest | 
try {
    val result : TwoFactorResponse = apiInstance.manage2faPost(twoFactorRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#manage2faPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#manage2faPost")
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

val apiInstance = FenixAllianceABPWebApi()
try {
    val result : InfoResponse = apiInstance.manageInfoGet()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#manageInfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#manageInfoGet")
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

val apiInstance = FenixAllianceABPWebApi()
val infoRequest : InfoRequest =  // InfoRequest | 
try {
    val result : InfoResponse = apiInstance.manageInfoPost(infoRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#manageInfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#manageInfoPost")
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

val apiInstance = FenixAllianceABPWebApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val code : kotlin.String = code_example // kotlin.String | 
val changedEmail : kotlin.String = changedEmail_example // kotlin.String | 
try {
    apiInstance.mapIdentityApiConfirmEmail(userId, code, changedEmail)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#mapIdentityApiConfirmEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#mapIdentityApiConfirmEmail")
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

val apiInstance = FenixAllianceABPWebApi()
val refreshRequest : RefreshRequest =  // RefreshRequest | 
try {
    val result : AccessTokenResponse = apiInstance.refreshPost(refreshRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#refreshPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#refreshPost")
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

val apiInstance = FenixAllianceABPWebApi()
val registerRequest : RegisterRequest =  // RegisterRequest | 
try {
    apiInstance.registerPost(registerRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#registerPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#registerPost")
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

val apiInstance = FenixAllianceABPWebApi()
val resendConfirmationEmailRequest : ResendConfirmationEmailRequest =  // ResendConfirmationEmailRequest | 
try {
    apiInstance.resendConfirmationEmailPost(resendConfirmationEmailRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#resendConfirmationEmailPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#resendConfirmationEmailPost")
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

val apiInstance = FenixAllianceABPWebApi()
val resetPasswordRequest : ResetPasswordRequest =  // ResetPasswordRequest | 
try {
    apiInstance.resetPasswordPost(resetPasswordRequest)
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#resetPasswordPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#resetPasswordPost")
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

val apiInstance = FenixAllianceABPWebApi()
try {
    apiInstance.versionGet()
} catch (e: ClientException) {
    println("4xx response calling FenixAllianceABPWebApi#versionGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling FenixAllianceABPWebApi#versionGet")
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

