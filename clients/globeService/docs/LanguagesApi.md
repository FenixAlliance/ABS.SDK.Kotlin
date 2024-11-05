# LanguagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2GlobeServiceLanguagesGet**](LanguagesApi.md#apiV2GlobeServiceLanguagesGet) | **GET** /api/v2/GlobeService/Languages |  |
| [**apiV2GlobeServiceLanguagesLanguageIdGet**](LanguagesApi.md#apiV2GlobeServiceLanguagesLanguageIdGet) | **GET** /api/v2/GlobeService/Languages/{languageId} |  |


<a id="apiV2GlobeServiceLanguagesGet"></a>
# **apiV2GlobeServiceLanguagesGet**
> CountryLanguageDtoListEnvelope apiV2GlobeServiceLanguagesGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguagesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryLanguageDtoListEnvelope = apiInstance.apiV2GlobeServiceLanguagesGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguagesApi#apiV2GlobeServiceLanguagesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguagesApi#apiV2GlobeServiceLanguagesGet")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryLanguageDtoListEnvelope**](CountryLanguageDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceLanguagesLanguageIdGet"></a>
# **apiV2GlobeServiceLanguagesLanguageIdGet**
> CountryLanguageDtoEnvelope apiV2GlobeServiceLanguagesLanguageIdGet(languageId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguagesApi()
val languageId : kotlin.String = languageId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryLanguageDtoEnvelope = apiInstance.apiV2GlobeServiceLanguagesLanguageIdGet(languageId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguagesApi#apiV2GlobeServiceLanguagesLanguageIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguagesApi#apiV2GlobeServiceLanguagesLanguageIdGet")
    e.printStackTrace()
}
```

### Parameters
| **languageId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountryLanguageDtoEnvelope**](CountryLanguageDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

