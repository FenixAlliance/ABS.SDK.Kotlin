# AvatarsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAvatar**](AvatarsApi.md#getAvatar) | **GET** /api/v2/StorageService/Avatars/{socialProfileId} | Get the avatar for a given social profile. |
| [**getContactAvatar**](AvatarsApi.md#getContactAvatar) | **GET** /api/v2/StorageService/Avatars/Contact/{contactId} | Get the avatar for a given contact. |
| [**getCurrentUserAvatar**](AvatarsApi.md#getCurrentUserAvatar) | **GET** /api/v2/StorageService/Avatars/User | Get the avatar for the current user. |
| [**getTenantAvatar**](AvatarsApi.md#getTenantAvatar) | **GET** /api/v2/StorageService/Avatars/Tenant/{tenantId} | Get the avatar for a given tenant. |
| [**getUserAvatar**](AvatarsApi.md#getUserAvatar) | **GET** /api/v2/StorageService/Avatars/User/{userId} | Get the avatar for a given user. |
| [**updateContactAvatar**](AvatarsApi.md#updateContactAvatar) | **POST** /api/v2/StorageService/Avatars/Contacts/{contactId} | Update the avatar for a given contact. |
| [**updateTenantAvatar**](AvatarsApi.md#updateTenantAvatar) | **POST** /api/v2/StorageService/Avatars/Tenant/{tenantId} | Update the avatar for a given tenant. |
| [**updateUserAvatar**](AvatarsApi.md#updateUserAvatar) | **POST** /api/v2/StorageService/Avatars/User | Update the avatar for the current user. |


<a id="getAvatar"></a>
# **getAvatar**
> EmptyEnvelope getAvatar(socialProfileId, apiVersion, xApiVersion)

Get the avatar for a given social profile.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val socialProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getAvatar(socialProfileId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#getAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#getAvatar")
    e.printStackTrace()
}
```

### Parameters
| **socialProfileId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getContactAvatar"></a>
# **getContactAvatar**
> EmptyEnvelope getContactAvatar(contactId, apiVersion, xApiVersion)

Get the avatar for a given contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getContactAvatar(contactId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#getContactAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#getContactAvatar")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCurrentUserAvatar"></a>
# **getCurrentUserAvatar**
> EmptyEnvelope getCurrentUserAvatar(apiVersion, xApiVersion)

Get the avatar for the current user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getCurrentUserAvatar(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#getCurrentUserAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#getCurrentUserAvatar")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTenantAvatar"></a>
# **getTenantAvatar**
> EmptyEnvelope getTenantAvatar(tenantId, apiVersion, xApiVersion)

Get the avatar for a given tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getTenantAvatar(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#getTenantAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#getTenantAvatar")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUserAvatar"></a>
# **getUserAvatar**
> EmptyEnvelope getUserAvatar(userId, apiVersion, xApiVersion)

Get the avatar for a given user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getUserAvatar(userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#getUserAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#getUserAvatar")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateContactAvatar"></a>
# **updateContactAvatar**
> EmptyEnvelope updateContactAvatar(contactId, tenantId, apiVersion, xApiVersion, avatar)

Update the avatar for a given contact.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val avatar : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : EmptyEnvelope = apiInstance.updateContactAvatar(contactId, tenantId, apiVersion, xApiVersion, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#updateContactAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#updateContactAvatar")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
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
 - **Accept**: application/json

<a id="updateTenantAvatar"></a>
# **updateTenantAvatar**
> EmptyEnvelope updateTenantAvatar(tenantId, apiVersion, xApiVersion, avatar)

Update the avatar for a given tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val avatar : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : EmptyEnvelope = apiInstance.updateTenantAvatar(tenantId, apiVersion, xApiVersion, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#updateTenantAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#updateTenantAvatar")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="updateUserAvatar"></a>
# **updateUserAvatar**
> EmptyEnvelope updateUserAvatar(apiVersion, xApiVersion, avatar)

Update the avatar for the current user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AvatarsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val avatar : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : EmptyEnvelope = apiInstance.updateUserAvatar(apiVersion, xApiVersion, avatar)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AvatarsApi#updateUserAvatar")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AvatarsApi#updateUserAvatar")
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
 - **Accept**: application/json

