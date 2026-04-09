# UsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adminPreviewUserEmailTemplate**](UsersApi.md#adminPreviewUserEmailTemplate) | **POST** /api/v2/SystemService/Users/{userId}/Emails/Preview | Preview the rendered email for a user. |
| [**adminSendUserEmail**](UsersApi.md#adminSendUserEmail) | **POST** /api/v2/SystemService/Users/{userId}/Emails/Send | Send an email to a user. |
| [**createAccountHolderAsync**](UsersApi.md#createAccountHolderAsync) | **POST** /api/v2/SystemService/Users | Create a new user |
| [**deleteAccountHolderAsync**](UsersApi.md#deleteAccountHolderAsync) | **DELETE** /api/v2/SystemService/Users/{userId} | Delete a user |
| [**getExtendedAccountHolderAsync**](UsersApi.md#getExtendedAccountHolderAsync) | **GET** /api/v2/SystemService/Users/{userId}/Extended | Retrieve an extended user by ID |
| [**getExtendedUsersAsync**](UsersApi.md#getExtendedUsersAsync) | **GET** /api/v2/SystemService/Users/Extended | Retrieve a list of extended users |
| [**getExtendedUsersCountAsync**](UsersApi.md#getExtendedUsersCountAsync) | **GET** /api/v2/SystemService/Users/Extended/Count | Get the count of extended users |
| [**getUserAsync**](UsersApi.md#getUserAsync) | **GET** /api/v2/SystemService/Users/{userId} | Retrieve a user by ID |
| [**getUsersAsync**](UsersApi.md#getUsersAsync) | **GET** /api/v2/SystemService/Users | Retrieve a list of users |
| [**getUsersCountAsync**](UsersApi.md#getUsersCountAsync) | **GET** /api/v2/SystemService/Users/Count | Get the count of users |
| [**updateAccountHolderAsync**](UsersApi.md#updateAccountHolderAsync) | **PUT** /api/v2/SystemService/Users/{userId} | Update a user |


<a id="adminPreviewUserEmailTemplate"></a>
# **adminPreviewUserEmailTemplate**
> adminPreviewUserEmailTemplate(userId, apiVersion, xApiVersion, emailDispatchRequest)

Preview the rendered email for a user.

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    apiInstance.adminPreviewUserEmailTemplate(userId, apiVersion, xApiVersion, emailDispatchRequest)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#adminPreviewUserEmailTemplate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#adminPreviewUserEmailTemplate")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="adminSendUserEmail"></a>
# **adminSendUserEmail**
> EmptyEnvelope adminSendUserEmail(userId, apiVersion, xApiVersion, emailDispatchRequest)

Send an email to a user.

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val emailDispatchRequest : EmailDispatchRequest =  // EmailDispatchRequest | 
try {
    val result : EmptyEnvelope = apiInstance.adminSendUserEmail(userId, apiVersion, xApiVersion, emailDispatchRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#adminSendUserEmail")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#adminSendUserEmail")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **emailDispatchRequest** | [**EmailDispatchRequest**](EmailDispatchRequest.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createAccountHolderAsync"></a>
# **createAccountHolderAsync**
> EmptyEnvelope createAccountHolderAsync(apiVersion, xApiVersion, userCreateDto)

Create a new user

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val userCreateDto : UserCreateDto =  // UserCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAccountHolderAsync(apiVersion, xApiVersion, userCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#createAccountHolderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#createAccountHolderAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **userCreateDto** | [**UserCreateDto**](UserCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAccountHolderAsync"></a>
# **deleteAccountHolderAsync**
> EmptyEnvelope deleteAccountHolderAsync(userId, apiVersion, xApiVersion)

Delete a user

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAccountHolderAsync(userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#deleteAccountHolderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#deleteAccountHolderAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedAccountHolderAsync"></a>
# **getExtendedAccountHolderAsync**
> ExtendedUserDtoEnvelope getExtendedAccountHolderAsync(userId, apiVersion, xApiVersion)

Retrieve an extended user by ID

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedUserDtoEnvelope = apiInstance.getExtendedAccountHolderAsync(userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getExtendedAccountHolderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getExtendedAccountHolderAsync")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
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
 - **Accept**: application/json

<a id="getExtendedUsersAsync"></a>
# **getExtendedUsersAsync**
> ExtendedUserDtoListEnvelope getExtendedUsersAsync(apiVersion, xApiVersion)

Retrieve a list of extended users

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedUserDtoListEnvelope = apiInstance.getExtendedUsersAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getExtendedUsersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getExtendedUsersAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExtendedUserDtoListEnvelope**](ExtendedUserDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedUsersCountAsync"></a>
# **getExtendedUsersCountAsync**
> Int32Envelope getExtendedUsersCountAsync(apiVersion, xApiVersion)

Get the count of extended users

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getExtendedUsersCountAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getExtendedUsersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getExtendedUsersCountAsync")
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
 - **Accept**: application/json

<a id="getUserAsync"></a>
# **getUserAsync**
> UserDtoEnvelope getUserAsync(userId, apiVersion, xApiVersion)

Retrieve a user by ID

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserDtoEnvelope = apiInstance.getUserAsync(userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUserAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUserAsync")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
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
 - **Accept**: application/json

<a id="getUsersAsync"></a>
# **getUsersAsync**
> UserDtoListEnvelope getUsersAsync(apiVersion, xApiVersion)

Retrieve a list of users

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserDtoListEnvelope = apiInstance.getUsersAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUsersAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUsersAsync")
    e.printStackTrace()
}
```

### Parameters
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

<a id="getUsersCountAsync"></a>
# **getUsersCountAsync**
> Int32Envelope getUsersCountAsync(apiVersion, xApiVersion)

Get the count of users

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getUsersCountAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#getUsersCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#getUsersCountAsync")
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
 - **Accept**: application/json

<a id="updateAccountHolderAsync"></a>
# **updateAccountHolderAsync**
> EmptyEnvelope updateAccountHolderAsync(userId, apiVersion, xApiVersion, userUpdateDto)

Update a user

This action is only available for users with the &#39;business_owner&#39; role (global administrators).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val userUpdateDto : UserUpdateDto =  // UserUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAccountHolderAsync(userId, apiVersion, xApiVersion, userUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#updateAccountHolderAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#updateAccountHolderAsync")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
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
 - **Accept**: application/json

