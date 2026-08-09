# LocalizationStringsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countLocalizationStringsAsync**](LocalizationStringsApi.md#countLocalizationStringsAsync) | **GET** /api/v2/ContentService/LocalizationStrings/Count | Count localization strings |
| [**createLocalizationStringAsync**](LocalizationStringsApi.md#createLocalizationStringAsync) | **POST** /api/v2/ContentService/LocalizationStrings | Create a localization string |
| [**deleteLocalizationStringAsync**](LocalizationStringsApi.md#deleteLocalizationStringAsync) | **DELETE** /api/v2/ContentService/LocalizationStrings/{localizationStringId} | Delete a localization string |
| [**getLocalizationStringByIdAsync**](LocalizationStringsApi.md#getLocalizationStringByIdAsync) | **GET** /api/v2/ContentService/LocalizationStrings/{localizationStringId} | Get localization string by ID |
| [**getLocalizationStringsAsync**](LocalizationStringsApi.md#getLocalizationStringsAsync) | **GET** /api/v2/ContentService/LocalizationStrings | Get localization strings |
| [**updateLocalizationStringAsync**](LocalizationStringsApi.md#updateLocalizationStringAsync) | **PUT** /api/v2/ContentService/LocalizationStrings/{localizationStringId} | Update a localization string |


<a id="countLocalizationStringsAsync"></a>
# **countLocalizationStringsAsync**
> Int32Envelope countLocalizationStringsAsync(tenantId, apiVersion, xApiVersion, localizationStringDtoCollectionQueryParameters)

Count localization strings

Counts all localization strings for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocalizationStringsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val localizationStringDtoCollectionQueryParameters : LocalizationStringDtoCollectionQueryParameters =  // LocalizationStringDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.countLocalizationStringsAsync(tenantId, apiVersion, xApiVersion, localizationStringDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizationStringsApi#countLocalizationStringsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizationStringsApi#countLocalizationStringsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **localizationStringDtoCollectionQueryParameters** | [**LocalizationStringDtoCollectionQueryParameters**](LocalizationStringDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createLocalizationStringAsync"></a>
# **createLocalizationStringAsync**
> EmptyEnvelope createLocalizationStringAsync(tenantId, localizationStringCreateDto, apiVersion, xApiVersion)

Create a localization string

Creates a new localization string for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocalizationStringsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val localizationStringCreateDto : LocalizationStringCreateDto =  // LocalizationStringCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createLocalizationStringAsync(tenantId, localizationStringCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizationStringsApi#createLocalizationStringAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizationStringsApi#createLocalizationStringAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **localizationStringCreateDto** | [**LocalizationStringCreateDto**](LocalizationStringCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLocalizationStringAsync"></a>
# **deleteLocalizationStringAsync**
> EmptyEnvelope deleteLocalizationStringAsync(localizationStringId, tenantId, apiVersion, xApiVersion)

Delete a localization string

Deletes a localization string for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocalizationStringsApi()
val localizationStringId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLocalizationStringAsync(localizationStringId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizationStringsApi#deleteLocalizationStringAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizationStringsApi#deleteLocalizationStringAsync")
    e.printStackTrace()
}
```

### Parameters
| **localizationStringId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLocalizationStringByIdAsync"></a>
# **getLocalizationStringByIdAsync**
> LocalizationStringDtoEnvelope getLocalizationStringByIdAsync(localizationStringId, tenantId, apiVersion, xApiVersion)

Get localization string by ID

Retrieves a specific localization string by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocalizationStringsApi()
val localizationStringId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : LocalizationStringDtoEnvelope = apiInstance.getLocalizationStringByIdAsync(localizationStringId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizationStringsApi#getLocalizationStringByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizationStringsApi#getLocalizationStringByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **localizationStringId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**LocalizationStringDtoEnvelope**](LocalizationStringDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLocalizationStringsAsync"></a>
# **getLocalizationStringsAsync**
> LocalizationStringDtoListEnvelope getLocalizationStringsAsync(tenantId, apiVersion, xApiVersion, localizationStringDtoCollectionQueryParameters)

Get localization strings

Retrieves all localization strings for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocalizationStringsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val localizationStringDtoCollectionQueryParameters : LocalizationStringDtoCollectionQueryParameters =  // LocalizationStringDtoCollectionQueryParameters | 
try {
    val result : LocalizationStringDtoListEnvelope = apiInstance.getLocalizationStringsAsync(tenantId, apiVersion, xApiVersion, localizationStringDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizationStringsApi#getLocalizationStringsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizationStringsApi#getLocalizationStringsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **localizationStringDtoCollectionQueryParameters** | [**LocalizationStringDtoCollectionQueryParameters**](LocalizationStringDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**LocalizationStringDtoListEnvelope**](LocalizationStringDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateLocalizationStringAsync"></a>
# **updateLocalizationStringAsync**
> EmptyEnvelope updateLocalizationStringAsync(localizationStringId, tenantId, localizationStringUpdateDto, apiVersion, xApiVersion)

Update a localization string

Updates an existing localization string for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LocalizationStringsApi()
val localizationStringId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val localizationStringUpdateDto : LocalizationStringUpdateDto =  // LocalizationStringUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateLocalizationStringAsync(localizationStringId, tenantId, localizationStringUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LocalizationStringsApi#updateLocalizationStringAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LocalizationStringsApi#updateLocalizationStringAsync")
    e.printStackTrace()
}
```

### Parameters
| **localizationStringId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **localizationStringUpdateDto** | [**LocalizationStringUpdateDto**](LocalizationStringUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

