# OptionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createContactOption**](OptionsApi.md#createContactOption) | **POST** /api/v2/CrmService/Contacts/{contactId}/Options | Create a new contact option |
| [**deleteContactOption**](OptionsApi.md#deleteContactOption) | **DELETE** /api/v2/CrmService/Contacts/{contactId}/Options/{optionId} | Delete a contact option |
| [**getContactOptionById**](OptionsApi.md#getContactOptionById) | **GET** /api/v2/CrmService/Contacts/{contactId}/Options/{optionId} | Retrieve a single contact option by its ID |
| [**getContactOptionByKey**](OptionsApi.md#getContactOptionByKey) | **GET** /api/v2/CrmService/Contacts/{contactId}/Options/Key/{key} | Retrieve a single contact option by its key |
| [**getContactOptions**](OptionsApi.md#getContactOptions) | **GET** /api/v2/CrmService/Contacts/{contactId}/Options | Retrieve a list of contact options |
| [**getContactOptionsCount**](OptionsApi.md#getContactOptionsCount) | **GET** /api/v2/CrmService/Contacts/{contactId}/Options/Count | Get the count of contact options |
| [**updateContactOption**](OptionsApi.md#updateContactOption) | **PUT** /api/v2/CrmService/Contacts/{contactId}/Options/{optionId} | Update a contact option |
| [**upsertContactOption**](OptionsApi.md#upsertContactOption) | **PUT** /api/v2/CrmService/Contacts/{contactId}/Options/Upsert/{key} | Create or update a contact option by key |


<a id="createContactOption"></a>
# **createContactOption**
> EmptyEnvelope createContactOption(contactId, tenantId, key, portalId, apiVersion, xApiVersion, optionCreateDto)

Create a new contact option

Create a new option for a contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val key : kotlin.String = key_example // kotlin.String | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionCreateDto : OptionCreateDto =  // OptionCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createContactOption(contactId, tenantId, key, portalId, apiVersion, xApiVersion, optionCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#createContactOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#createContactOption")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="deleteContactOption"></a>
# **deleteContactOption**
> EmptyEnvelope deleteContactOption(contactId, optionId, tenantId, apiVersion, xApiVersion)

Delete a contact option

Delete a contact option

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteContactOption(contactId, optionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#deleteContactOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#deleteContactOption")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **optionId** | **java.util.UUID**|  | |
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

<a id="getContactOptionById"></a>
# **getContactOptionById**
> OptionDtoEnvelope getContactOptionById(contactId, optionId, tenantId, apiVersion, xApiVersion)

Retrieve a single contact option by its ID

Retrieve a single contact option by its ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoEnvelope = apiInstance.getContactOptionById(contactId, optionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getContactOptionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getContactOptionById")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **optionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="getContactOptionByKey"></a>
# **getContactOptionByKey**
> OptionDtoEnvelope getContactOptionByKey(contactId, key, tenantId, portalId, apiVersion, xApiVersion)

Retrieve a single contact option by its key

Retrieve a single contact option by its key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val key : kotlin.String = key_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoEnvelope = apiInstance.getContactOptionByKey(contactId, key, tenantId, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getContactOptionByKey")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getContactOptionByKey")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **key** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="getContactOptions"></a>
# **getContactOptions**
> OptionDtoListEnvelope getContactOptions(contactId, tenantId, portalId, apiVersion, xApiVersion)

Retrieve a list of contact options

Retrieve a list of options for a contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : OptionDtoListEnvelope = apiInstance.getContactOptions(contactId, tenantId, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getContactOptions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getContactOptions")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="getContactOptionsCount"></a>
# **getContactOptionsCount**
> Int32Envelope getContactOptionsCount(contactId, tenantId, portalId, apiVersion, xApiVersion)

Get the count of contact options

Get the count of options for a contact

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getContactOptionsCount(contactId, tenantId, portalId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#getContactOptionsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#getContactOptionsCount")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="updateContactOption"></a>
# **updateContactOption**
> EmptyEnvelope updateContactOption(contactId, optionId, tenantId, apiVersion, xApiVersion, optionUpdateDto)

Update a contact option

Update a contact option

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val optionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionUpdateDto : OptionUpdateDto =  // OptionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateContactOption(contactId, optionId, tenantId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#updateContactOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#updateContactOption")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **optionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="upsertContactOption"></a>
# **upsertContactOption**
> EmptyEnvelope upsertContactOption(contactId, key, tenantId, portalId, apiVersion, xApiVersion, optionUpdateDto)

Create or update a contact option by key

Create or update a contact option by key

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = OptionsApi()
val contactId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val key : kotlin.String = key_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val portalId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val optionUpdateDto : OptionUpdateDto =  // OptionUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.upsertContactOption(contactId, key, tenantId, portalId, apiVersion, xApiVersion, optionUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OptionsApi#upsertContactOption")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OptionsApi#upsertContactOption")
    e.printStackTrace()
}
```

### Parameters
| **contactId** | **java.util.UUID**|  | |
| **key** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

