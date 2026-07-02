# RequiredSkillsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createRequiredSkillAsync**](RequiredSkillsApi.md#createRequiredSkillAsync) | **POST** /api/v2/HrmsService/RequiredSkills | Create a required skill |
| [**deleteRequiredSkillAsync**](RequiredSkillsApi.md#deleteRequiredSkillAsync) | **DELETE** /api/v2/HrmsService/RequiredSkills/{requiredSkillId} | Delete a required skill |
| [**getRequiredSkillByIdAsync**](RequiredSkillsApi.md#getRequiredSkillByIdAsync) | **GET** /api/v2/HrmsService/RequiredSkills/{requiredSkillId} | Get required skill by ID |
| [**getRequiredSkillsAsync**](RequiredSkillsApi.md#getRequiredSkillsAsync) | **GET** /api/v2/HrmsService/RequiredSkills | Get required skills |
| [**getRequiredSkillsCountAsync**](RequiredSkillsApi.md#getRequiredSkillsCountAsync) | **GET** /api/v2/HrmsService/RequiredSkills/Count | Count required skills |
| [**patchRequiredSkillAsync**](RequiredSkillsApi.md#patchRequiredSkillAsync) | **PATCH** /api/v2/HrmsService/RequiredSkills/{requiredSkillId} | Patch a required skill |
| [**updateRequiredSkillAsync**](RequiredSkillsApi.md#updateRequiredSkillAsync) | **PUT** /api/v2/HrmsService/RequiredSkills/{requiredSkillId} | Update a required skill |


<a id="createRequiredSkillAsync"></a>
# **createRequiredSkillAsync**
> EmptyEnvelope createRequiredSkillAsync(tenantId, apiVersion, xApiVersion, requiredSkillRecordCreateDto)

Create a required skill

Creates a new required-skill record for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RequiredSkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val requiredSkillRecordCreateDto : RequiredSkillRecordCreateDto =  // RequiredSkillRecordCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createRequiredSkillAsync(tenantId, apiVersion, xApiVersion, requiredSkillRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequiredSkillsApi#createRequiredSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequiredSkillsApi#createRequiredSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requiredSkillRecordCreateDto** | [**RequiredSkillRecordCreateDto**](RequiredSkillRecordCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteRequiredSkillAsync"></a>
# **deleteRequiredSkillAsync**
> EmptyEnvelope deleteRequiredSkillAsync(requiredSkillId, tenantId, apiVersion, xApiVersion)

Delete a required skill

Deletes a required-skill record for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RequiredSkillsApi()
val requiredSkillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteRequiredSkillAsync(requiredSkillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequiredSkillsApi#deleteRequiredSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequiredSkillsApi#deleteRequiredSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **requiredSkillId** | **java.util.UUID**|  | |
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

<a id="getRequiredSkillByIdAsync"></a>
# **getRequiredSkillByIdAsync**
> RequiredSkillRecordDtoEnvelope getRequiredSkillByIdAsync(requiredSkillId, tenantId, apiVersion, xApiVersion)

Get required skill by ID

Retrieves a specific required-skill record by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RequiredSkillsApi()
val requiredSkillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : RequiredSkillRecordDtoEnvelope = apiInstance.getRequiredSkillByIdAsync(requiredSkillId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequiredSkillsApi#getRequiredSkillByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequiredSkillsApi#getRequiredSkillByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **requiredSkillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**RequiredSkillRecordDtoEnvelope**](RequiredSkillRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRequiredSkillsAsync"></a>
# **getRequiredSkillsAsync**
> RequiredSkillRecordDtoListEnvelope getRequiredSkillsAsync(tenantId, apiVersion, xApiVersion)

Get required skills

Retrieves required-skill records for the specified tenant. Filter by &#x60;$filter&#x3D;JobOfferId eq &#39;...&#39;&#x60; or &#x60;EmployerProfileId eq &#39;...&#39;&#x60;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RequiredSkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : RequiredSkillRecordDtoListEnvelope = apiInstance.getRequiredSkillsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequiredSkillsApi#getRequiredSkillsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequiredSkillsApi#getRequiredSkillsAsync")
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

[**RequiredSkillRecordDtoListEnvelope**](RequiredSkillRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRequiredSkillsCountAsync"></a>
# **getRequiredSkillsCountAsync**
> Int32Envelope getRequiredSkillsCountAsync(tenantId, apiVersion, xApiVersion)

Count required skills

Counts required-skill records for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RequiredSkillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getRequiredSkillsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequiredSkillsApi#getRequiredSkillsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequiredSkillsApi#getRequiredSkillsCountAsync")
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

<a id="patchRequiredSkillAsync"></a>
# **patchRequiredSkillAsync**
> EmptyEnvelope patchRequiredSkillAsync(requiredSkillId, tenantId, apiVersion, xApiVersion, operation)

Patch a required skill

Partially updates an existing required-skill record for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RequiredSkillsApi()
val requiredSkillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchRequiredSkillAsync(requiredSkillId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequiredSkillsApi#patchRequiredSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequiredSkillsApi#patchRequiredSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **requiredSkillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateRequiredSkillAsync"></a>
# **updateRequiredSkillAsync**
> EmptyEnvelope updateRequiredSkillAsync(requiredSkillId, tenantId, apiVersion, xApiVersion, requiredSkillRecordUpdateDto)

Update a required skill

Updates an existing required-skill record for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RequiredSkillsApi()
val requiredSkillId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val requiredSkillRecordUpdateDto : RequiredSkillRecordUpdateDto =  // RequiredSkillRecordUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateRequiredSkillAsync(requiredSkillId, tenantId, apiVersion, xApiVersion, requiredSkillRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RequiredSkillsApi#updateRequiredSkillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RequiredSkillsApi#updateRequiredSkillAsync")
    e.printStackTrace()
}
```

### Parameters
| **requiredSkillId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **requiredSkillRecordUpdateDto** | [**RequiredSkillRecordUpdateDto**](RequiredSkillRecordUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

