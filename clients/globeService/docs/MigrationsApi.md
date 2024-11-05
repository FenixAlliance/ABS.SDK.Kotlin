# MigrationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2GlobalSystemMigratePost**](MigrationsApi.md#apiV2GlobalSystemMigratePost) | **POST** /api/v2/Global/System/Migrate |  |


<a id="apiV2GlobalSystemMigratePost"></a>
# **apiV2GlobalSystemMigratePost**
> PaymentResponse apiV2GlobalSystemMigratePost(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MigrationsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PaymentResponse = apiInstance.apiV2GlobalSystemMigratePost(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MigrationsApi#apiV2GlobalSystemMigratePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MigrationsApi#apiV2GlobalSystemMigratePost")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PaymentResponse**](PaymentResponse.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

