# AccountGroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAccountGroup**](AccountGroupsApi.md#createAccountGroup) | **POST** /api/v2/AccountingService/AccountGroups | Creates a new account group |
| [**deleteAccountGroup**](AccountGroupsApi.md#deleteAccountGroup) | **DELETE** /api/v2/AccountingService/AccountGroups/{accountGroupId} | Deletes an existing account group |
| [**getAccountGroup**](AccountGroupsApi.md#getAccountGroup) | **GET** /api/v2/AccountingService/AccountGroups/{accountGroupId} | Gets the current tenant account group |
| [**getAccountGroups**](AccountGroupsApi.md#getAccountGroups) | **GET** /api/v2/AccountingService/AccountGroups | Gets the current tenant account groups |
| [**getAccountGroupsCountAsync**](AccountGroupsApi.md#getAccountGroupsCountAsync) | **GET** /api/v2/AccountingService/AccountGroups/Count | Gets the current tenant accounts count |
| [**updateAccountGroup**](AccountGroupsApi.md#updateAccountGroup) | **PUT** /api/v2/AccountingService/AccountGroups/{accountGroupId} | Updates an existing account group |


<a id="createAccountGroup"></a>
# **createAccountGroup**
> AccountGroupDtoEnvelope createAccountGroup(tenantId, apiVersion, xApiVersion, accountGroupCreateDto)

Creates a new account group

Creates a new account group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountGroupCreateDto : AccountGroupCreateDto =  // AccountGroupCreateDto | 
try {
    val result : AccountGroupDtoEnvelope = apiInstance.createAccountGroup(tenantId, apiVersion, xApiVersion, accountGroupCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountGroupsApi#createAccountGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountGroupsApi#createAccountGroup")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountGroupCreateDto** | [**AccountGroupCreateDto**](AccountGroupCreateDto.md)|  | [optional] |

### Return type

[**AccountGroupDtoEnvelope**](AccountGroupDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAccountGroup"></a>
# **deleteAccountGroup**
> deleteAccountGroup(accountGroupId, tenantId, apiVersion, xApiVersion)

Deletes an existing account group

Deletes an existing account group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountGroupsApi()
val accountGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteAccountGroup(accountGroupId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling AccountGroupsApi#deleteAccountGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountGroupsApi#deleteAccountGroup")
    e.printStackTrace()
}
```

### Parameters
| **accountGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountGroup"></a>
# **getAccountGroup**
> AccountGroupDtoEnvelope getAccountGroup(accountGroupId, tenantId, apiVersion, xApiVersion)

Gets the current tenant account group

Get the currently acting tenant account group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountGroupsApi()
val accountGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountGroupDtoEnvelope = apiInstance.getAccountGroup(accountGroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountGroupsApi#getAccountGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountGroupsApi#getAccountGroup")
    e.printStackTrace()
}
```

### Parameters
| **accountGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AccountGroupDtoEnvelope**](AccountGroupDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountGroups"></a>
# **getAccountGroups**
> AccountGroupDtoListEnvelope getAccountGroups(tenantId, apiVersion, xApiVersion)

Gets the current tenant account groups

Get the currently acting tenant account groups.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AccountGroupDtoListEnvelope = apiInstance.getAccountGroups(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountGroupsApi#getAccountGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountGroupsApi#getAccountGroups")
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

[**AccountGroupDtoListEnvelope**](AccountGroupDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAccountGroupsCountAsync"></a>
# **getAccountGroupsCountAsync**
> Int32Envelope getAccountGroupsCountAsync(tenantId, apiVersion, xApiVersion)

Gets the current tenant accounts count

Get the currently acting tenant accounts count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAccountGroupsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountGroupsApi#getAccountGroupsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountGroupsApi#getAccountGroupsCountAsync")
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

<a id="updateAccountGroup"></a>
# **updateAccountGroup**
> AccountGroupDtoEnvelope updateAccountGroup(accountGroupId, tenantId, apiVersion, xApiVersion, accountGroupUpdateDto)

Updates an existing account group

Updates an existing account group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AccountGroupsApi()
val accountGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val accountGroupUpdateDto : AccountGroupUpdateDto =  // AccountGroupUpdateDto | 
try {
    val result : AccountGroupDtoEnvelope = apiInstance.updateAccountGroup(accountGroupId, tenantId, apiVersion, xApiVersion, accountGroupUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AccountGroupsApi#updateAccountGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AccountGroupsApi#updateAccountGroup")
    e.printStackTrace()
}
```

### Parameters
| **accountGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountGroupUpdateDto** | [**AccountGroupUpdateDto**](AccountGroupUpdateDto.md)|  | [optional] |

### Return type

[**AccountGroupDtoEnvelope**](AccountGroupDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

