# OptionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSystemOption**](OptionsApi.md#createSystemOption) | **POST** /api/v2/SystemService/Options | Create a new system option |
| [**deleteSystemOption**](OptionsApi.md#deleteSystemOption) | **DELETE** /api/v2/SystemService/Options/{optionId} | Delete a system option |
| [**getSystemOptionById**](OptionsApi.md#getSystemOptionById) | **GET** /api/v2/SystemService/Options/{optionId} | Retrieve a single system option by its ID |
| [**getSystemOptionByKey**](OptionsApi.md#getSystemOptionByKey) | **GET** /api/v2/SystemService/Options/Key/{key} | Retrieve a single system option by its key |
| [**getSystemOptions**](OptionsApi.md#getSystemOptions) | **GET** /api/v2/SystemService/Options | Retrieve a list of system options |
| [**getSystemOptionsCount**](OptionsApi.md#getSystemOptionsCount) | **GET** /api/v2/SystemService/Options/Count | Get the count of system options |
| [**updateSystemOption**](OptionsApi.md#updateSystemOption) | **PUT** /api/v2/SystemService/Options/{optionId} | Update a system option |
| [**upsertSystemOption**](OptionsApi.md#upsertSystemOption) | **PUT** /api/v2/SystemService/Options/Upsert/{key} | Create or update a system option by key |


<a id="createSystemOption"></a>
# **createSystemOption**
> EmptyEnvelope createSystemOption(key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new system option

Create a new system option

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val key : kotlin.String = key_example // kotlin.String | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionCreateDto : OptionCreateDto =  // OptionCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSystemOption(key, portalId, apiVersion, xApiVersion, optionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#createSystemOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#createSystemOption")
    e.printStackTrace()
}
```

### Parameters
| **key** | **kotlin.String**|  | |
| **portalId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionCreateDto** | [**OptionCreateDto**](OptionCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSystemOption"></a>
# **deleteSystemOption**
> EmptyEnvelope deleteSystemOption(optionId, apiVersion, xApiVersion)

Delete a system option

Delete a system option

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSystemOption(optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#deleteSystemOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#deleteSystemOption")
    e.printStackTrace()
}
```

### Parameters
| **optionId** | **java.util.UUID**|  | |
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

<a id="getSystemOptionById"></a>
# **getSystemOptionById**
> OptionDtoEnvelope getSystemOptionById(optionId, apiVersion, xApiVersion)

Retrieve a single system option by its ID

Retrieve a single system option by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoEnvelope = apiInstance.getSystemOptionById(optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getSystemOptionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getSystemOptionById")
    e.printStackTrace()
}
```

### Parameters
| **optionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OptionDtoEnvelope**](OptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemOptionByKey"></a>
# **getSystemOptionByKey**
> OptionDtoEnvelope getSystemOptionByKey(key, portalId, apiVersion, xApiVersion)

Retrieve a single system option by its key

Retrieve a single system option by its key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val key : kotlin.String = key_example // kotlin.String | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoEnvelope = apiInstance.getSystemOptionByKey(key, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getSystemOptionByKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getSystemOptionByKey")
    e.printStackTrace()
}
```

### Parameters
| **key** | **kotlin.String**|  | |
| **portalId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OptionDtoEnvelope**](OptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemOptions"></a>
# **getSystemOptions**
> OptionDtoListEnvelope getSystemOptions(portalId, apiVersion, xApiVersion)

Retrieve a list of system options

Retrieve a list of system options for a portal

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoListEnvelope = apiInstance.getSystemOptions(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getSystemOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getSystemOptions")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**OptionDtoListEnvelope**](OptionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSystemOptionsCount"></a>
# **getSystemOptionsCount**
> Int32Envelope getSystemOptionsCount(portalId, apiVersion, xApiVersion)

Get the count of system options

Get the count of system options for a portal

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSystemOptionsCount(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getSystemOptionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getSystemOptionsCount")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | |
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

<a id="updateSystemOption"></a>
# **updateSystemOption**
> EmptyEnvelope updateSystemOption(optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a system option

Update a system option

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionUpdateDto : OptionUpdateDto =  // OptionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSystemOption(optionId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#updateSystemOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#updateSystemOption")
    e.printStackTrace()
}
```

### Parameters
| **optionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionUpdateDto** | [**OptionUpdateDto**](OptionUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="upsertSystemOption"></a>
# **upsertSystemOption**
> EmptyEnvelope upsertSystemOption(key, portalId, apiVersion, xApiVersion, optionUpdateDto)

Create or update a system option by key

Create or update a system option by key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val key : kotlin.String = key_example // kotlin.String | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionUpdateDto : OptionUpdateDto =  // OptionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.upsertSystemOption(key, portalId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#upsertSystemOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#upsertSystemOption")
    e.printStackTrace()
}
```

### Parameters
| **key** | **kotlin.String**|  | |
| **portalId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionUpdateDto** | [**OptionUpdateDto**](OptionUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

