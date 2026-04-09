# ResourceApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getMessage**](ResourceApi.md#getMessage) | **GET** /api/v2/IdentityService/Resource/message | Get authenticated resource message |


<a id="getMessage"></a>
# **getMessage**
> getMessage(apiVersion, xApiVersion)

Get authenticated resource message

Returns a message confirming the authenticated user&#39;s identity. Requires the &#39;abs_api&#39; scope.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ResourceApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getMessage(apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ResourceApi#getMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ResourceApi#getMessage")
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

