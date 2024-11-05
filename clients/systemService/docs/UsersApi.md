# UsersApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2SystemServiceUsersCountGet**](UsersApi.md#apiV2SystemServiceUsersCountGet) | **GET** /api/v2/SystemService/Users/Count |  |
| [**apiV2SystemServiceUsersExtendedCountGet**](UsersApi.md#apiV2SystemServiceUsersExtendedCountGet) | **GET** /api/v2/SystemService/Users/Extended/Count |  |
| [**apiV2SystemServiceUsersExtendedGet**](UsersApi.md#apiV2SystemServiceUsersExtendedGet) | **GET** /api/v2/SystemService/Users/Extended |  |
| [**apiV2SystemServiceUsersGet**](UsersApi.md#apiV2SystemServiceUsersGet) | **GET** /api/v2/SystemService/Users |  |
| [**apiV2SystemServiceUsersPost**](UsersApi.md#apiV2SystemServiceUsersPost) | **POST** /api/v2/SystemService/Users |  |
| [**apiV2SystemServiceUsersUserIdDelete**](UsersApi.md#apiV2SystemServiceUsersUserIdDelete) | **DELETE** /api/v2/SystemService/Users/{userId} |  |
| [**apiV2SystemServiceUsersUserIdExtendedGet**](UsersApi.md#apiV2SystemServiceUsersUserIdExtendedGet) | **GET** /api/v2/SystemService/Users/{userId}/Extended |  |
| [**apiV2SystemServiceUsersUserIdPut**](UsersApi.md#apiV2SystemServiceUsersUserIdPut) | **PUT** /api/v2/SystemService/Users/{userId} |  |
| [**getUserAsync**](UsersApi.md#getUserAsync) | **GET** /api/v2/SystemService/Users/{userId} |  |


<a id="apiV2SystemServiceUsersCountGet"></a>
# **apiV2SystemServiceUsersCountGet**
> Int32Envelope apiV2SystemServiceUsersCountGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SystemServiceUsersCountGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2SystemServiceUsersCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2SystemServiceUsersCountGet")
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
 - **Accept**: application/json

<a id="apiV2SystemServiceUsersExtendedCountGet"></a>
# **apiV2SystemServiceUsersExtendedCountGet**
> Int32Envelope apiV2SystemServiceUsersExtendedCountGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.apiV2SystemServiceUsersExtendedCountGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2SystemServiceUsersExtendedCountGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2SystemServiceUsersExtendedCountGet")
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
 - **Accept**: application/json

<a id="apiV2SystemServiceUsersExtendedGet"></a>
# **apiV2SystemServiceUsersExtendedGet**
> ExtendedUserDtoListEnvelope apiV2SystemServiceUsersExtendedGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExtendedUserDtoListEnvelope = apiInstance.apiV2SystemServiceUsersExtendedGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2SystemServiceUsersExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2SystemServiceUsersExtendedGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SystemServiceUsersGet"></a>
# **apiV2SystemServiceUsersGet**
> UserDtoListEnvelope apiV2SystemServiceUsersGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UserDtoListEnvelope = apiInstance.apiV2SystemServiceUsersGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2SystemServiceUsersGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2SystemServiceUsersGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SystemServiceUsersPost"></a>
# **apiV2SystemServiceUsersPost**
> EmptyEnvelope apiV2SystemServiceUsersPost(apiVersion, xApiVersion, accountHolderCreateDto)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountHolderCreateDto : AccountHolderCreateDto =  // AccountHolderCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SystemServiceUsersPost(apiVersion, xApiVersion, accountHolderCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2SystemServiceUsersPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2SystemServiceUsersPost")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountHolderCreateDto** | [**AccountHolderCreateDto**](AccountHolderCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="apiV2SystemServiceUsersUserIdDelete"></a>
# **apiV2SystemServiceUsersUserIdDelete**
> EmptyEnvelope apiV2SystemServiceUsersUserIdDelete(userId, apiVersion, xApiVersion)



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
    val result : EmptyEnvelope = apiInstance.apiV2SystemServiceUsersUserIdDelete(userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2SystemServiceUsersUserIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2SystemServiceUsersUserIdDelete")
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

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SystemServiceUsersUserIdExtendedGet"></a>
# **apiV2SystemServiceUsersUserIdExtendedGet**
> ExtendedUserDtoEnvelope apiV2SystemServiceUsersUserIdExtendedGet(userId, apiVersion, xApiVersion)



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
    val result : ExtendedUserDtoEnvelope = apiInstance.apiV2SystemServiceUsersUserIdExtendedGet(userId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2SystemServiceUsersUserIdExtendedGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2SystemServiceUsersUserIdExtendedGet")
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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2SystemServiceUsersUserIdPut"></a>
# **apiV2SystemServiceUsersUserIdPut**
> EmptyEnvelope apiV2SystemServiceUsersUserIdPut(userId, apiVersion, xApiVersion, body)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UsersApi()
val userId : kotlin.String = userId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EmptyEnvelope = apiInstance.apiV2SystemServiceUsersUserIdPut(userId, apiVersion, xApiVersion, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#apiV2SystemServiceUsersUserIdPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#apiV2SystemServiceUsersUserIdPut")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getUserAsync"></a>
# **getUserAsync**
> UserDtoEnvelope getUserAsync(userId, apiVersion, xApiVersion)



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


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

