# LanguagesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countLanguagesAsync**](LanguagesApi.md#countLanguagesAsync) | **GET** /api/v2/GlobeService/Languages/Count | Count languages |
| [**getLanguageByIdAsync**](LanguagesApi.md#getLanguageByIdAsync) | **GET** /api/v2/GlobeService/Languages/{languageId} | Get language by ID |
| [**getLanguagesAsync**](LanguagesApi.md#getLanguagesAsync) | **GET** /api/v2/GlobeService/Languages | Get all languages |


<a id="countLanguagesAsync"></a>
# **countLanguagesAsync**
> Int32Envelope countLanguagesAsync(apiVersion, xApiVersion)

Count languages

Returns the total number of supported languages, with optional OData filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguagesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countLanguagesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguagesApi#countLanguagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguagesApi#countLanguagesAsync")
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

<a id="getLanguageByIdAsync"></a>
# **getLanguageByIdAsync**
> CountryLanguageDtoEnvelope getLanguageByIdAsync(languageId, apiVersion, xApiVersion)

Get language by ID

Retrieves a single language by its unique identifier.

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
    val result : CountryLanguageDtoEnvelope = apiInstance.getLanguageByIdAsync(languageId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguagesApi#getLanguageByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguagesApi#getLanguageByIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLanguagesAsync"></a>
# **getLanguagesAsync**
> CountryLanguageDtoListEnvelope getLanguagesAsync(apiVersion, xApiVersion)

Get all languages

Retrieves the list of all supported languages with optional OData pagination and filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LanguagesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountryLanguageDtoListEnvelope = apiInstance.getLanguagesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LanguagesApi#getLanguagesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LanguagesApi#getLanguagesAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

