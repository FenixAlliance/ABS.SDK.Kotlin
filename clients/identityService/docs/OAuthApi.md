# OAuthApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**checkPasswordSignInAsync**](OAuthApi.md#checkPasswordSignInAsync) | **GET** /api/v2/OAuth/SignIn | Check password sign-in |
| [**get**](OAuthApi.md#get) | **GET** /api/v2/OAuth/WhoAmI | Get current user identity |
| [**getJwKs**](OAuthApi.md#getJwKs) | **GET** /api/v2/OAuth/{applicationId}/Keys | Get JSON Web Key Set |
| [**getOpenIdConfiguration**](OAuthApi.md#getOpenIdConfiguration) | **GET** /api/v2/OAuth/{tenantId}/{applicationId}/.Well-Known/OpenId-Configuration | Get OpenID configuration |
| [**getPermissions**](OAuthApi.md#getPermissions) | **GET** /api/v2/OAuth/Permissions | Get user permissions |
| [**passwordSignInAsync**](OAuthApi.md#passwordSignInAsync) | **POST** /api/v2/OAuth/SignIn | Sign in with password |
| [**token**](OAuthApi.md#token) | **POST** /api/v2/OAuth/Token | Get OAuth token |


<a id="checkPasswordSignInAsync"></a>
# **checkPasswordSignInAsync**
> UserCreateDtoEnvelope checkPasswordSignInAsync(apiVersion, xApiVersion)

Check password sign-in

Verifies sign-in credentials and returns user details without creating a session.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserCreateDtoEnvelope = apiInstance.checkPasswordSignInAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#checkPasswordSignInAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#checkPasswordSignInAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**UserCreateDtoEnvelope**](UserCreateDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="get"></a>
# **get**
> AuthorizationResultEnvelope get(tenantId, apiVersion, xApiVersion)

Get current user identity

Returns the authorization result for the authenticated user, including identity and tenant context.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AuthorizationResultEnvelope = apiInstance.get(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#get")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#get")
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

[**AuthorizationResultEnvelope**](AuthorizationResultEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getJwKs"></a>
# **getJwKs**
> JsonWebKeySetEnvelope getJwKs(applicationId, apiVersion, xApiVersion)

Get JSON Web Key Set

Retrieves the signing keys (JWKS) for a specific application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : JsonWebKeySetEnvelope = apiInstance.getJwKs(applicationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#getJwKs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#getJwKs")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**JsonWebKeySetEnvelope**](JsonWebKeySetEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOpenIdConfiguration"></a>
# **getOpenIdConfiguration**
> OpenIdConfigurationEnvelope getOpenIdConfiguration(tenantId, applicationId, apiVersion, xApiVersion)

Get OpenID configuration

Retrieves the OpenID Connect discovery document for a specific application within a tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OpenIdConfigurationEnvelope = apiInstance.getOpenIdConfiguration(tenantId, applicationId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#getOpenIdConfiguration")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#getOpenIdConfiguration")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **applicationId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OpenIdConfigurationEnvelope**](OpenIdConfigurationEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPermissions"></a>
# **getPermissions**
> StringListEnvelope getPermissions(tenantId, userId, apiVersion, xApiVersion)

Get user permissions

Retrieves the list of permission identifiers for a specific user within a tenant context.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val userId : kotlin.String = userId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : StringListEnvelope = apiInstance.getPermissions(tenantId, userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#getPermissions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#getPermissions")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **userId** | **kotlin.String**|  | [optional] |
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

<a id="passwordSignInAsync"></a>
# **passwordSignInAsync**
> JsonWebTokenEnvelope passwordSignInAsync(apiVersion, xApiVersion, signinModel)

Sign in with password

Authenticates a user using email and password credentials.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val signinModel : SigninModel =  // SigninModel | 
try {
    val result : JsonWebTokenEnvelope = apiInstance.passwordSignInAsync(apiVersion, xApiVersion, signinModel)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#passwordSignInAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#passwordSignInAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **signinModel** | [**SigninModel**](SigninModel.md)|  | [optional] |

### Return type

[**JsonWebTokenEnvelope**](JsonWebTokenEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="token"></a>
# **token**
> JsonWebTokenEnvelope token(apiVersion, xApiVersion, oauthTokenRequest)

Get OAuth token

Generates an OAuth token based on the provided credentials or grant type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val oauthTokenRequest : OAuthTokenRequest =  // OAuthTokenRequest | 
try {
    val result : JsonWebTokenEnvelope = apiInstance.token(apiVersion, xApiVersion, oauthTokenRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApi#token")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApi#token")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **oauthTokenRequest** | [**OAuthTokenRequest**](OAuthTokenRequest.md)|  | [optional] |

### Return type

[**JsonWebTokenEnvelope**](JsonWebTokenEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

