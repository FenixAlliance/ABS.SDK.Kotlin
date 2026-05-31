# TimezonesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countTimezonesAsync**](TimezonesApi.md#countTimezonesAsync) | **GET** /api/v2/GlobeService/Timezones/Count | Count timezones |
| [**getTimeZoneByIdAsync**](TimezonesApi.md#getTimeZoneByIdAsync) | **GET** /api/v2/GlobeService/Timezones/{timeZoneId} | Get timezone by ID |
| [**getTimeZonesAsync**](TimezonesApi.md#getTimeZonesAsync) | **GET** /api/v2/GlobeService/Timezones | Get all timezones |


<a id="countTimezonesAsync"></a>
# **countTimezonesAsync**
> Int32Envelope countTimezonesAsync(apiVersion, xApiVersion)

Count timezones

Returns the total number of supported timezones, with optional OData filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimezonesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countTimezonesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimezonesApi#countTimezonesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimezonesApi#countTimezonesAsync")
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

<a id="getTimeZoneByIdAsync"></a>
# **getTimeZoneByIdAsync**
> TimezoneDtoEnvelope getTimeZoneByIdAsync(timeZoneId, apiVersion, xApiVersion)

Get timezone by ID

Retrieves a single timezone by its unique identifier.

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
    val result : TimezoneDtoEnvelope = apiInstance.getTimeZoneByIdAsync(timeZoneId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimezonesApi#getTimeZoneByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimezonesApi#getTimeZoneByIdAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTimeZonesAsync"></a>
# **getTimeZonesAsync**
> TimezoneDtoListEnvelope getTimeZonesAsync(apiVersion, xApiVersion)

Get all timezones

Retrieves the list of all supported timezones with optional OData pagination and filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TimezonesApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TimezoneDtoListEnvelope = apiInstance.getTimeZonesAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TimezonesApi#getTimeZonesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TimezonesApi#getTimeZonesAsync")
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

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

