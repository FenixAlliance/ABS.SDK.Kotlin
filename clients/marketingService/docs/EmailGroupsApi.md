# EmailGroupsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createEmailGroupAsync**](EmailGroupsApi.md#createEmailGroupAsync) | **POST** /api/v2/MarketingService/EmailGroups | Create an email group |
| [**deleteEmailGroupAsync**](EmailGroupsApi.md#deleteEmailGroupAsync) | **DELETE** /api/v2/MarketingService/EmailGroups/{emailgroupId} | Delete an email group |
| [**getEmailGroupDetailsAsync**](EmailGroupsApi.md#getEmailGroupDetailsAsync) | **GET** /api/v2/MarketingService/EmailGroups/{emailgroupId} | Get email group by ID |
| [**getEmailGroupsCountAsync**](EmailGroupsApi.md#getEmailGroupsCountAsync) | **GET** /api/v2/MarketingService/EmailGroups/Count | Get email groups count |
| [**getEmailGroupsODataAsync**](EmailGroupsApi.md#getEmailGroupsODataAsync) | **GET** /api/v2/MarketingService/EmailGroups | Get email groups |
| [**updateEmailGroupAsync**](EmailGroupsApi.md#updateEmailGroupAsync) | **PUT** /api/v2/MarketingService/EmailGroups/{emailgroupId} | Update an email group |


<a id="createEmailGroupAsync"></a>
# **createEmailGroupAsync**
> EmptyEnvelope createEmailGroupAsync(tenantId, emailGroupCreateDto, apiVersion, xApiVersion)

Create an email group

Creates a new email group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailGroupCreateDto : EmailGroupCreateDto =  // EmailGroupCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createEmailGroupAsync(tenantId, emailGroupCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#createEmailGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#createEmailGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **emailGroupCreateDto** | [**EmailGroupCreateDto**](EmailGroupCreateDto.md)|  | |
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

<a id="deleteEmailGroupAsync"></a>
# **deleteEmailGroupAsync**
> EmptyEnvelope deleteEmailGroupAsync(emailgroupId, tenantId, apiVersion, xApiVersion)

Delete an email group

Deletes an email group by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val emailgroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteEmailGroupAsync(emailgroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#deleteEmailGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#deleteEmailGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailgroupId** | **java.util.UUID**|  | |
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

<a id="getEmailGroupDetailsAsync"></a>
# **getEmailGroupDetailsAsync**
> EmailGroupDtoEnvelope getEmailGroupDetailsAsync(emailgroupId, tenantId, apiVersion, xApiVersion)

Get email group by ID

Retrieves the details of a specific email group by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val emailgroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailGroupDtoEnvelope = apiInstance.getEmailGroupDetailsAsync(emailgroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#getEmailGroupDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#getEmailGroupDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailgroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmailGroupDtoEnvelope**](EmailGroupDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getEmailGroupsCountAsync"></a>
# **getEmailGroupsCountAsync**
> Int32Envelope getEmailGroupsCountAsync(tenantId, apiVersion, xApiVersion)

Get email groups count

Returns the count of email groups for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getEmailGroupsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#getEmailGroupsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#getEmailGroupsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
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

<a id="getEmailGroupsODataAsync"></a>
# **getEmailGroupsODataAsync**
> EmailGroupDtoListEnvelope getEmailGroupsODataAsync(tenantId, apiVersion, xApiVersion)

Get email groups

Retrieves a collection of email groups for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmailGroupDtoListEnvelope = apiInstance.getEmailGroupsODataAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#getEmailGroupsODataAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#getEmailGroupsODataAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmailGroupDtoListEnvelope**](EmailGroupDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateEmailGroupAsync"></a>
# **updateEmailGroupAsync**
> EmptyEnvelope updateEmailGroupAsync(emailgroupId, tenantId, emailGroupUpdateDto, apiVersion, xApiVersion)

Update an email group

Updates an existing email group by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = EmailGroupsApi()
val emailgroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val emailGroupUpdateDto : EmailGroupUpdateDto =  // EmailGroupUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateEmailGroupAsync(emailgroupId, tenantId, emailGroupUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling EmailGroupsApi#updateEmailGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling EmailGroupsApi#updateEmailGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **emailgroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **emailGroupUpdateDto** | [**EmailGroupUpdateDto**](EmailGroupUpdateDto.md)|  | |
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

