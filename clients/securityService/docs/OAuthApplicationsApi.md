# OAuthApplicationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createOAuthApplicationAsync**](OAuthApplicationsApi.md#createOAuthApplicationAsync) | **POST** /api/v2/SecurityService/OAuthApplications | Create a new OAuth application |
| [**deleteOAuthApplicationAsync**](OAuthApplicationsApi.md#deleteOAuthApplicationAsync) | **DELETE** /api/v2/SecurityService/OAuthApplications/{applicationId} | Delete an OAuth application |
| [**getOAuthApplicationByIdAsync**](OAuthApplicationsApi.md#getOAuthApplicationByIdAsync) | **GET** /api/v2/SecurityService/OAuthApplications/{applicationId} | Get OAuth application by ID |
| [**getOAuthApplicationsAsync**](OAuthApplicationsApi.md#getOAuthApplicationsAsync) | **GET** /api/v2/SecurityService/OAuthApplications | Get all OAuth applications |
| [**getOAuthApplicationsCountAsync**](OAuthApplicationsApi.md#getOAuthApplicationsCountAsync) | **GET** /api/v2/SecurityService/OAuthApplications/Count | Get OAuth applications count |
| [**getOAuthAuthorizationByIdAsync**](OAuthApplicationsApi.md#getOAuthAuthorizationByIdAsync) | **GET** /api/v2/SecurityService/OAuthApplications/Authorizations/{authorizationId} | Get OAuth authorization by ID |
| [**getOAuthAuthorizationsAsync**](OAuthApplicationsApi.md#getOAuthAuthorizationsAsync) | **GET** /api/v2/SecurityService/OAuthApplications/Authorizations | Get all OAuth authorizations |
| [**getOAuthAuthorizationsCountAsync**](OAuthApplicationsApi.md#getOAuthAuthorizationsCountAsync) | **GET** /api/v2/SecurityService/OAuthApplications/Authorizations/Count | Get OAuth authorizations count |
| [**updateOAuthApplicationAsync**](OAuthApplicationsApi.md#updateOAuthApplicationAsync) | **PUT** /api/v2/SecurityService/OAuthApplications/{applicationId} | Update an existing OAuth application |


<a id="createOAuthApplicationAsync"></a>
# **createOAuthApplicationAsync**
> EmptyEnvelope createOAuthApplicationAsync(tenantId, oauthApplicationCreateDto, apiVersion, xApiVersion)

Create a new OAuth application

Creates a new OAuth application for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val oauthApplicationCreateDto : OAuthApplicationCreateDto =  // OAuthApplicationCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createOAuthApplicationAsync(tenantId, oauthApplicationCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#createOAuthApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#createOAuthApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **oauthApplicationCreateDto** | [**OAuthApplicationCreateDto**](OAuthApplicationCreateDto.md)|  | |
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

<a id="deleteOAuthApplicationAsync"></a>
# **deleteOAuthApplicationAsync**
> EmptyEnvelope deleteOAuthApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)

Delete an OAuth application

Deletes an existing OAuth application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteOAuthApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#deleteOAuthApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#deleteOAuthApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
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

<a id="getOAuthApplicationByIdAsync"></a>
# **getOAuthApplicationByIdAsync**
> OAuthApplicationDtoEnvelope getOAuthApplicationByIdAsync(applicationId, tenantId, apiVersion, xApiVersion)

Get OAuth application by ID

Retrieves a specific OAuth application by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OAuthApplicationDtoEnvelope = apiInstance.getOAuthApplicationByIdAsync(applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#getOAuthApplicationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#getOAuthApplicationByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OAuthApplicationDtoEnvelope**](OAuthApplicationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOAuthApplicationsAsync"></a>
# **getOAuthApplicationsAsync**
> OAuthApplicationDtoListEnvelope getOAuthApplicationsAsync(tenantId, apiVersion, xApiVersion)

Get all OAuth applications

Retrieves all OAuth applications for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OAuthApplicationDtoListEnvelope = apiInstance.getOAuthApplicationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#getOAuthApplicationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#getOAuthApplicationsAsync")
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

[**OAuthApplicationDtoListEnvelope**](OAuthApplicationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOAuthApplicationsCountAsync"></a>
# **getOAuthApplicationsCountAsync**
> Int32Envelope getOAuthApplicationsCountAsync(tenantId, apiVersion, xApiVersion)

Get OAuth applications count

Retrieves the count of OAuth applications for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getOAuthApplicationsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#getOAuthApplicationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#getOAuthApplicationsCountAsync")
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

<a id="getOAuthAuthorizationByIdAsync"></a>
# **getOAuthAuthorizationByIdAsync**
> OAuthAuthorizationDtoEnvelope getOAuthAuthorizationByIdAsync(authorizationId, tenantId, apiVersion, xApiVersion)

Get OAuth authorization by ID

Retrieves a specific OAuth authorization by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val authorizationId : kotlin.String = authorizationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OAuthAuthorizationDtoEnvelope = apiInstance.getOAuthAuthorizationByIdAsync(authorizationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#getOAuthAuthorizationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#getOAuthAuthorizationByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **authorizationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OAuthAuthorizationDtoEnvelope**](OAuthAuthorizationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOAuthAuthorizationsAsync"></a>
# **getOAuthAuthorizationsAsync**
> OAuthAuthorizationDtoListEnvelope getOAuthAuthorizationsAsync(tenantId, userId, apiVersion, xApiVersion)

Get all OAuth authorizations

Retrieves all OAuth authorizations for the specified user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val userId : kotlin.String = userId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OAuthAuthorizationDtoListEnvelope = apiInstance.getOAuthAuthorizationsAsync(tenantId, userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#getOAuthAuthorizationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#getOAuthAuthorizationsAsync")
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

[**OAuthAuthorizationDtoListEnvelope**](OAuthAuthorizationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOAuthAuthorizationsCountAsync"></a>
# **getOAuthAuthorizationsCountAsync**
> Int32Envelope getOAuthAuthorizationsCountAsync(tenantId, userId, apiVersion, xApiVersion)

Get OAuth authorizations count

Retrieves the count of OAuth authorizations for the specified user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val userId : kotlin.String = userId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getOAuthAuthorizationsCountAsync(tenantId, userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#getOAuthAuthorizationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#getOAuthAuthorizationsCountAsync")
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

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateOAuthApplicationAsync"></a>
# **updateOAuthApplicationAsync**
> EmptyEnvelope updateOAuthApplicationAsync(applicationId, tenantId, oauthApplicationUpdateDto, apiVersion, xApiVersion)

Update an existing OAuth application

Updates an existing OAuth application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OAuthApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val oauthApplicationUpdateDto : OAuthApplicationUpdateDto =  // OAuthApplicationUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateOAuthApplicationAsync(applicationId, tenantId, oauthApplicationUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OAuthApplicationsApi#updateOAuthApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OAuthApplicationsApi#updateOAuthApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **oauthApplicationUpdateDto** | [**OAuthApplicationUpdateDto**](OAuthApplicationUpdateDto.md)|  | |
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

