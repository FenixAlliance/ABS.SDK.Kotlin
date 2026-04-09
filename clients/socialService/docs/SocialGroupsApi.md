# SocialGroupsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countSocialGroupsAsync**](SocialGroupsApi.md#countSocialGroupsAsync) | **GET** /api/v2/SocialService/SocialGroups/Count | Count social groups |
| [**createSocialGroupAsync**](SocialGroupsApi.md#createSocialGroupAsync) | **POST** /api/v2/SocialService/SocialGroups | Create a social group |
| [**deleteSocialGroupAsync**](SocialGroupsApi.md#deleteSocialGroupAsync) | **DELETE** /api/v2/SocialService/SocialGroups/{socialGroupId} | Delete a social group |
| [**getSocialGroupByIdAsync**](SocialGroupsApi.md#getSocialGroupByIdAsync) | **GET** /api/v2/SocialService/SocialGroups/{socialGroupId} | Get social group by ID |
| [**getSocialGroupsAsync**](SocialGroupsApi.md#getSocialGroupsAsync) | **GET** /api/v2/SocialService/SocialGroups | Get social groups |
| [**updateSocialGroupAsync**](SocialGroupsApi.md#updateSocialGroupAsync) | **PUT** /api/v2/SocialService/SocialGroups/{socialGroupId} | Update a social group |


<a id="countSocialGroupsAsync"></a>
# **countSocialGroupsAsync**
> Int32Envelope countSocialGroupsAsync(tenantId, apiVersion, xApiVersion)

Count social groups

Counts all social groups for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countSocialGroupsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialGroupsApi#countSocialGroupsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialGroupsApi#countSocialGroupsAsync")
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

<a id="createSocialGroupAsync"></a>
# **createSocialGroupAsync**
> EmptyEnvelope createSocialGroupAsync(tenantId, apiVersion, xApiVersion, socialGroupCreateDto)

Create a social group

Creates a new social group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialGroupCreateDto : SocialGroupCreateDto =  // SocialGroupCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSocialGroupAsync(tenantId, apiVersion, xApiVersion, socialGroupCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialGroupsApi#createSocialGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialGroupsApi#createSocialGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialGroupCreateDto** | [**SocialGroupCreateDto**](SocialGroupCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSocialGroupAsync"></a>
# **deleteSocialGroupAsync**
> EmptyEnvelope deleteSocialGroupAsync(socialGroupId, tenantId, apiVersion, xApiVersion)

Delete a social group

Deletes a social group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialGroupsApi()
val socialGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSocialGroupAsync(socialGroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialGroupsApi#deleteSocialGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialGroupsApi#deleteSocialGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialGroupId** | **java.util.UUID**|  | |
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

<a id="getSocialGroupByIdAsync"></a>
# **getSocialGroupByIdAsync**
> SocialGroupDtoEnvelope getSocialGroupByIdAsync(socialGroupId, tenantId, apiVersion, xApiVersion)

Get social group by ID

Retrieves a specific social group by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialGroupsApi()
val socialGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialGroupDtoEnvelope = apiInstance.getSocialGroupByIdAsync(socialGroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialGroupsApi#getSocialGroupByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialGroupsApi#getSocialGroupByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SocialGroupDtoEnvelope**](SocialGroupDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSocialGroupsAsync"></a>
# **getSocialGroupsAsync**
> SocialGroupDtoListEnvelope getSocialGroupsAsync(tenantId, apiVersion, xApiVersion)

Get social groups

Retrieves all social groups for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SocialGroupDtoListEnvelope = apiInstance.getSocialGroupsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialGroupsApi#getSocialGroupsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialGroupsApi#getSocialGroupsAsync")
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

[**SocialGroupDtoListEnvelope**](SocialGroupDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateSocialGroupAsync"></a>
# **updateSocialGroupAsync**
> EmptyEnvelope updateSocialGroupAsync(socialGroupId, tenantId, apiVersion, xApiVersion, socialGroupUpdateDto)

Update a social group

Updates an existing social group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SocialGroupsApi()
val socialGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val socialGroupUpdateDto : SocialGroupUpdateDto =  // SocialGroupUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSocialGroupAsync(socialGroupId, tenantId, apiVersion, xApiVersion, socialGroupUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SocialGroupsApi#updateSocialGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SocialGroupsApi#updateSocialGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **socialGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **socialGroupUpdateDto** | [**SocialGroupUpdateDto**](SocialGroupUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

