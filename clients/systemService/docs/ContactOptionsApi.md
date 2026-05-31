# ContactOptionsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSystemContactOption**](ContactOptionsApi.md#createSystemContactOption) | **POST** /api/v2/SystemService/Contacts/{contactId}/Options | Create a new contact option (admin) |
| [**deleteSystemContactOption**](ContactOptionsApi.md#deleteSystemContactOption) | **DELETE** /api/v2/SystemService/Contacts/{contactId}/Options/{optionId} | Delete a contact option (admin) |
| [**getSystemContactOptionById**](ContactOptionsApi.md#getSystemContactOptionById) | **GET** /api/v2/SystemService/Contacts/{contactId}/Options/{optionId} | Retrieve a single contact option by its ID (admin) |
| [**getSystemContactOptions**](ContactOptionsApi.md#getSystemContactOptions) | **GET** /api/v2/SystemService/Contacts/{contactId}/Options | Retrieve a list of contact options (admin) |
| [**getSystemContactOptionsCount**](ContactOptionsApi.md#getSystemContactOptionsCount) | **GET** /api/v2/SystemService/Contacts/{contactId}/Options/Count | Get the count of contact options (admin) |
| [**updateSystemContactOption**](ContactOptionsApi.md#updateSystemContactOption) | **PUT** /api/v2/SystemService/Contacts/{contactId}/Options/{optionId} | Update a contact option (admin) |


<a id="createSystemContactOption"></a>
# **createSystemContactOption**
> EmptyEnvelope createSystemContactOption(contactId, key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new contact option (admin)

Admin endpoint to create an option for any contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactOptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val key : kotlin.String = key_example // kotlin.String | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionCreateDto : OptionCreateDto =  // OptionCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSystemContactOption(contactId, key, portalId, apiVersion, xApiVersion, optionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactOptionsApi#createSystemContactOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactOptionsApi#createSystemContactOption")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="deleteSystemContactOption"></a>
# **deleteSystemContactOption**
> EmptyEnvelope deleteSystemContactOption(contactId, optionId, apiVersion, xApiVersion)

Delete a contact option (admin)

Admin endpoint to delete an option for any contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactOptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSystemContactOption(contactId, optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactOptionsApi#deleteSystemContactOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactOptionsApi#deleteSystemContactOption")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="getSystemContactOptionById"></a>
# **getSystemContactOptionById**
> OptionDtoEnvelope getSystemContactOptionById(contactId, optionId, apiVersion, xApiVersion)

Retrieve a single contact option by its ID (admin)

Admin endpoint to retrieve a single option for any contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactOptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoEnvelope = apiInstance.getSystemContactOptionById(contactId, optionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactOptionsApi#getSystemContactOptionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactOptionsApi#getSystemContactOptionById")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="getSystemContactOptions"></a>
# **getSystemContactOptions**
> OptionDtoListEnvelope getSystemContactOptions(contactId, portalId, apiVersion, xApiVersion)

Retrieve a list of contact options (admin)

Admin endpoint to retrieve options for any contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactOptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoListEnvelope = apiInstance.getSystemContactOptions(contactId, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactOptionsApi#getSystemContactOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactOptionsApi#getSystemContactOptions")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="getSystemContactOptionsCount"></a>
# **getSystemContactOptionsCount**
> Int32Envelope getSystemContactOptionsCount(contactId, portalId, apiVersion, xApiVersion)

Get the count of contact options (admin)

Admin endpoint to get the count of options for any contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactOptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSystemContactOptionsCount(contactId, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactOptionsApi#getSystemContactOptionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactOptionsApi#getSystemContactOptionsCount")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

<a id="updateSystemContactOption"></a>
# **updateSystemContactOption**
> EmptyEnvelope updateSystemContactOption(contactId, optionId, apiVersion, xApiVersion, optionUpdateDto)

Update a contact option (admin)

Admin endpoint to update an option for any contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ContactOptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionUpdateDto : OptionUpdateDto =  // OptionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSystemContactOption(contactId, optionId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContactOptionsApi#updateSystemContactOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContactOptionsApi#updateSystemContactOption")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
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

