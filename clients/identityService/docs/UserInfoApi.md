# UserInfoApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**connectUserinfoGet**](UserInfoApi.md#connectUserinfoGet) | **GET** /connect/userinfo |  |
| [**connectUserinfoPost**](UserInfoApi.md#connectUserinfoPost) | **POST** /connect/userinfo |  |


<a id="connectUserinfoGet"></a>
# **connectUserinfoGet**
> connectUserinfoGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserInfoApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.connectUserinfoGet(apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling UserInfoApi#connectUserinfoGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserInfoApi#connectUserinfoGet")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a id="connectUserinfoPost"></a>
# **connectUserinfoPost**
> connectUserinfoPost(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserInfoApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.connectUserinfoPost(apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling UserInfoApi#connectUserinfoPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserInfoApi#connectUserinfoPost")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

