# OptionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createUserOption**](OptionsApi.md#createUserOption) | **POST** /api/v2/Me/Options | Create a new user option |
| [**deleteUserOption**](OptionsApi.md#deleteUserOption) | **DELETE** /api/v2/Me/Options/{optionId} | Delete a user option |
| [**getUserOptionById**](OptionsApi.md#getUserOptionById) | **GET** /api/v2/Me/Options/{optionId} | Retrieve a single user option by its ID |
| [**getUserOptionByKey**](OptionsApi.md#getUserOptionByKey) | **GET** /api/v2/Me/Options/Key/{key} | Retrieve a single user option by its key |
| [**getUserOptions**](OptionsApi.md#getUserOptions) | **GET** /api/v2/Me/Options | Retrieve a list of user options |
| [**getUserOptionsCount**](OptionsApi.md#getUserOptionsCount) | **GET** /api/v2/Me/Options/Count | Get the count of user options |
| [**updateUserOption**](OptionsApi.md#updateUserOption) | **PUT** /api/v2/Me/Options/{optionId} | Update a user option |
| [**upsertUserOption**](OptionsApi.md#upsertUserOption) | **PUT** /api/v2/Me/Options/Upsert/{key} | Create or update a user option by key |


<a id="createUserOption"></a>
# **createUserOption**
> EmptyEnvelope createUserOption(key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new user option

Create a new option for the current user

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
    val result : EmptyEnvelope = apiInstance.createUserOption(key, portalId, apiVersion, xApiVersion, optionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#createUserOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#createUserOption")
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

<a id="deleteUserOption"></a>
# **deleteUserOption**
> EmptyEnvelope deleteUserOption(optionId, apiVersion, xApiVersion)

Delete a user option

Delete a user option

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
    val result : EmptyEnvelope = apiInstance.deleteUserOption(optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#deleteUserOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#deleteUserOption")
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

<a id="getUserOptionById"></a>
# **getUserOptionById**
> OptionDtoEnvelope getUserOptionById(optionId, apiVersion, xApiVersion)

Retrieve a single user option by its ID

Retrieve a single user option by its ID

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
    val result : OptionDtoEnvelope = apiInstance.getUserOptionById(optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getUserOptionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getUserOptionById")
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

<a id="getUserOptionByKey"></a>
# **getUserOptionByKey**
> OptionDtoEnvelope getUserOptionByKey(key, portalId, apiVersion, xApiVersion)

Retrieve a single user option by its key

Retrieve a single user option by its key

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
    val result : OptionDtoEnvelope = apiInstance.getUserOptionByKey(key, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getUserOptionByKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getUserOptionByKey")
    e.printStackTrace()
}
```

### Parameters
| **key** | **kotlin.String**|  | |
| **portalId** | **java.util.UUID**|  | [optional] |
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

<a id="getUserOptions"></a>
# **getUserOptions**
> OptionDtoListEnvelope getUserOptions(portalId, apiVersion, xApiVersion)

Retrieve a list of user options

Retrieve a list of options for the current user

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
    val result : OptionDtoListEnvelope = apiInstance.getUserOptions(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getUserOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getUserOptions")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | [optional] |
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

<a id="getUserOptionsCount"></a>
# **getUserOptionsCount**
> Int32Envelope getUserOptionsCount(portalId, apiVersion, xApiVersion)

Get the count of user options

Get the count of options for the current user

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
    val result : Int32Envelope = apiInstance.getUserOptionsCount(portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getUserOptionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getUserOptionsCount")
    e.printStackTrace()
}
```

### Parameters
| **portalId** | **java.util.UUID**|  | [optional] |
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

<a id="updateUserOption"></a>
# **updateUserOption**
> EmptyEnvelope updateUserOption(optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a user option

Update a user option

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
    val result : EmptyEnvelope = apiInstance.updateUserOption(optionId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#updateUserOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#updateUserOption")
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

<a id="upsertUserOption"></a>
# **upsertUserOption**
> EmptyEnvelope upsertUserOption(key, portalId, apiVersion, xApiVersion, optionUpdateDto)

Create or update a user option by key

Create or update a user option by key

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
    val result : EmptyEnvelope = apiInstance.upsertUserOption(key, portalId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#upsertUserOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#upsertUserOption")
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

