# UserOptionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSystemUserOption**](UserOptionsApi.md#createSystemUserOption) | **POST** /api/v2/SystemService/Users/{userId}/Options | Create a new user option (admin) |
| [**deleteSystemUserOption**](UserOptionsApi.md#deleteSystemUserOption) | **DELETE** /api/v2/SystemService/Users/{userId}/Options/{optionId} | Delete a user option (admin) |
| [**getSystemUserOptionById**](UserOptionsApi.md#getSystemUserOptionById) | **GET** /api/v2/SystemService/Users/{userId}/Options/{optionId} | Retrieve a single user option by its ID (admin) |
| [**getSystemUserOptions**](UserOptionsApi.md#getSystemUserOptions) | **GET** /api/v2/SystemService/Users/{userId}/Options | Retrieve a list of user options (admin) |
| [**getSystemUserOptionsCount**](UserOptionsApi.md#getSystemUserOptionsCount) | **GET** /api/v2/SystemService/Users/{userId}/Options/Count | Get the count of user options (admin) |
| [**patchSystemUserOption**](UserOptionsApi.md#patchSystemUserOption) | **PATCH** /api/v2/SystemService/Users/{userId}/Options/{optionId} | Partially update a user option (admin) |
| [**updateSystemUserOption**](UserOptionsApi.md#updateSystemUserOption) | **PUT** /api/v2/SystemService/Users/{userId}/Options/{optionId} | Update a user option (admin) |


<a id="createSystemUserOption"></a>
# **createSystemUserOption**
> EmptyEnvelope createSystemUserOption(userId, key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new user option (admin)

Admin endpoint to create an option for any user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserOptionsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val key : kotlin.String = key_example // kotlin.String | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionCreateDto : OptionCreateDto =  // OptionCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSystemUserOption(userId, key, portalId, apiVersion, xApiVersion, optionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserOptionsApi#createSystemUserOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserOptionsApi#createSystemUserOption")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
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

<a id="deleteSystemUserOption"></a>
# **deleteSystemUserOption**
> EmptyEnvelope deleteSystemUserOption(userId, optionId, apiVersion, xApiVersion)

Delete a user option (admin)

Admin endpoint to delete an option for any user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserOptionsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSystemUserOption(userId, optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserOptionsApi#deleteSystemUserOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserOptionsApi#deleteSystemUserOption")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
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

<a id="getSystemUserOptionById"></a>
# **getSystemUserOptionById**
> OptionDtoEnvelope getSystemUserOptionById(userId, optionId, apiVersion, xApiVersion)

Retrieve a single user option by its ID (admin)

Admin endpoint to retrieve a single option for any user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserOptionsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoEnvelope = apiInstance.getSystemUserOptionById(userId, optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserOptionsApi#getSystemUserOptionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserOptionsApi#getSystemUserOptionById")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
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

<a id="getSystemUserOptions"></a>
# **getSystemUserOptions**
> OptionDtoListEnvelope getSystemUserOptions(userId, portalId, apiVersion, xApiVersion, optionDtoCollectionQueryParameters)

Retrieve a list of user options (admin)

Admin endpoint to retrieve options for any user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserOptionsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionDtoCollectionQueryParameters : OptionDtoCollectionQueryParameters =  // OptionDtoCollectionQueryParameters | 
try {
    val result : OptionDtoListEnvelope = apiInstance.getSystemUserOptions(userId, portalId, apiVersion, xApiVersion, optionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserOptionsApi#getSystemUserOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserOptionsApi#getSystemUserOptions")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
| **portalId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionDtoCollectionQueryParameters** | [**OptionDtoCollectionQueryParameters**](OptionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**OptionDtoListEnvelope**](OptionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSystemUserOptionsCount"></a>
# **getSystemUserOptionsCount**
> Int32Envelope getSystemUserOptionsCount(userId, portalId, apiVersion, xApiVersion, optionDtoCollectionQueryParameters)

Get the count of user options (admin)

Admin endpoint to get the count of options for any user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserOptionsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionDtoCollectionQueryParameters : OptionDtoCollectionQueryParameters =  // OptionDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSystemUserOptionsCount(userId, portalId, apiVersion, xApiVersion, optionDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserOptionsApi#getSystemUserOptionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserOptionsApi#getSystemUserOptionsCount")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
| **portalId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **optionDtoCollectionQueryParameters** | [**OptionDtoCollectionQueryParameters**](OptionDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchSystemUserOption"></a>
# **patchSystemUserOption**
> EmptyEnvelope patchSystemUserOption(userId, optionId, apiVersion, xApiVersion, patchOperation)

Partially update a user option (admin)

Admin endpoint to partially update an option for any user using a JSON Patch document

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserOptionsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchSystemUserOption(userId, optionId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserOptionsApi#patchSystemUserOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserOptionsApi#patchSystemUserOption")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
| **optionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSystemUserOption"></a>
# **updateSystemUserOption**
> EmptyEnvelope updateSystemUserOption(userId, optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a user option (admin)

Admin endpoint to update an option for any user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UserOptionsApi()
val userId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionUpdateDto : OptionUpdateDto =  // OptionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSystemUserOption(userId, optionId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UserOptionsApi#updateSystemUserOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserOptionsApi#updateSystemUserOption")
    e.printStackTrace()
}
```

### Parameters
| **userId** | **java.util.UUID**|  | |
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

