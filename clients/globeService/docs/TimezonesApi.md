# TimezonesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**apiV2GlobeServiceTimezonesGet**](TimezonesApi.md#apiV2GlobeServiceTimezonesGet) | **GET** /api/v2/GlobeService/Timezones |  |
| [**apiV2GlobeServiceTimezonesTimeZoneIdGet**](TimezonesApi.md#apiV2GlobeServiceTimezonesTimeZoneIdGet) | **GET** /api/v2/GlobeService/Timezones/{timeZoneId} |  |


<a id="apiV2GlobeServiceTimezonesGet"></a>
# **apiV2GlobeServiceTimezonesGet**
> TimezoneDtoListEnvelope apiV2GlobeServiceTimezonesGet(apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimezonesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TimezoneDtoListEnvelope = apiInstance.apiV2GlobeServiceTimezonesGet(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimezonesApi#apiV2GlobeServiceTimezonesGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimezonesApi#apiV2GlobeServiceTimezonesGet")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TimezoneDtoListEnvelope**](TimezoneDtoListEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="apiV2GlobeServiceTimezonesTimeZoneIdGet"></a>
# **apiV2GlobeServiceTimezonesTimeZoneIdGet**
> TimezoneDtoEnvelope apiV2GlobeServiceTimezonesTimeZoneIdGet(timeZoneId, apiVersion, xApiVersion)



### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimezonesApi()
val timeZoneId : kotlin.String = timeZoneId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TimezoneDtoEnvelope = apiInstance.apiV2GlobeServiceTimezonesTimeZoneIdGet(timeZoneId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimezonesApi#apiV2GlobeServiceTimezonesTimeZoneIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimezonesApi#apiV2GlobeServiceTimezonesTimeZoneIdGet")
    e.printStackTrace()
}
```

### Parameters
| **timeZoneId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TimezoneDtoEnvelope**](TimezoneDtoEnvelope.md)

### Authorization


Configure Bearer:
    ApiClient.apiKey["Authorization"] = ""
    ApiClient.apiKeyPrefix["Authorization"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

