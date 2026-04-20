# CheckerApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**isAuthenticated**](CheckerApi.md#isAuthenticated) | **GET** /api/v2/Auth/Checker/IsAuthenticated | Check if user is authenticated |


<a id="isAuthenticated"></a>
# **isAuthenticated**
> kotlin.Boolean isAuthenticated(apiVersion, xApiVersion)

Check if user is authenticated

Returns whether the current user is authenticated.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CheckerApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Boolean = apiInstance.isAuthenticated(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CheckerApi#isAuthenticated")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CheckerApi#isAuthenticated")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.Boolean**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

