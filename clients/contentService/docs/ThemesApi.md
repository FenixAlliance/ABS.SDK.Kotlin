# ThemesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getLatestCurrencyRatesModelAsync**](ThemesApi.md#getLatestCurrencyRatesModelAsync) | **GET** /api/v2/ContentService/Themes/Update | Update base web content themes |


<a id="getLatestCurrencyRatesModelAsync"></a>
# **getLatestCurrencyRatesModelAsync**
> getLatestCurrencyRatesModelAsync(apiVersion, xApiVersion)

Update base web content themes

Triggers an update of the base web content themes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ThemesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.getLatestCurrencyRatesModelAsync(apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ThemesApi#getLatestCurrencyRatesModelAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ThemesApi#getLatestCurrencyRatesModelAsync")
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
 - **Accept**: application/json

