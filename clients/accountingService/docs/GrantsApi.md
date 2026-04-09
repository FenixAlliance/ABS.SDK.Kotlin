# GrantsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createGrantAsync**](GrantsApi.md#createGrantAsync) | **POST** /api/v2/AccountingService/Grants | Create grant |
| [**deleteGrantAsync**](GrantsApi.md#deleteGrantAsync) | **DELETE** /api/v2/AccountingService/Grants/{grantId} | Delete grant |
| [**getGrantDetailsAsync**](GrantsApi.md#getGrantDetailsAsync) | **GET** /api/v2/AccountingService/Grants/{grantId} | Get grant by ID |
| [**getGrantsAsync**](GrantsApi.md#getGrantsAsync) | **GET** /api/v2/AccountingService/Grants | Get all grants |
| [**getGrantsCountAsync**](GrantsApi.md#getGrantsCountAsync) | **GET** /api/v2/AccountingService/Grants/Count | Count grants |
| [**updateGrantAsync**](GrantsApi.md#updateGrantAsync) | **PUT** /api/v2/AccountingService/Grants/{grantId} | Update grant |


<a id="createGrantAsync"></a>
# **createGrantAsync**
> EmptyEnvelope createGrantAsync(tenantId, apiVersion, xApiVersion, grantCreateDto)

Create grant

Creates a new grant entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GrantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val grantCreateDto : GrantCreateDto =  // GrantCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createGrantAsync(tenantId, apiVersion, xApiVersion, grantCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantsApi#createGrantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantsApi#createGrantAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grantCreateDto** | [**GrantCreateDto**](GrantCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteGrantAsync"></a>
# **deleteGrantAsync**
> EmptyEnvelope deleteGrantAsync(grantId, tenantId, apiVersion, xApiVersion)

Delete grant

Deletes a grant identified by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GrantsApi()
val grantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteGrantAsync(grantId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantsApi#deleteGrantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantsApi#deleteGrantAsync")
    e.printStackTrace()
}
```

### Parameters
| **grantId** | **java.util.UUID**|  | |
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

<a id="getGrantDetailsAsync"></a>
# **getGrantDetailsAsync**
> GrantDtoEnvelope getGrantDetailsAsync(grantId, tenantId, apiVersion, xApiVersion)

Get grant by ID

Gets detailed information for a specific grant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GrantsApi()
val grantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : GrantDtoEnvelope = apiInstance.getGrantDetailsAsync(grantId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantsApi#getGrantDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantsApi#getGrantDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **grantId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**GrantDtoEnvelope**](GrantDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGrantsAsync"></a>
# **getGrantsAsync**
> GrantDtoIReadOnlyListEnvelope getGrantsAsync(tenantId, apiVersion, xApiVersion)

Get all grants

Retrieves a list of grants associated with the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GrantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : GrantDtoIReadOnlyListEnvelope = apiInstance.getGrantsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantsApi#getGrantsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantsApi#getGrantsAsync")
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

[**GrantDtoIReadOnlyListEnvelope**](GrantDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getGrantsCountAsync"></a>
# **getGrantsCountAsync**
> Int32Envelope getGrantsCountAsync(tenantId, apiVersion, xApiVersion)

Count grants

Returns the number of grants for the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GrantsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getGrantsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantsApi#getGrantsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantsApi#getGrantsCountAsync")
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

<a id="updateGrantAsync"></a>
# **updateGrantAsync**
> EmptyEnvelope updateGrantAsync(grantId, tenantId, apiVersion, xApiVersion, grantUpdateDto)

Update grant

Updates an existing grant identified by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = GrantsApi()
val grantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val grantUpdateDto : GrantUpdateDto =  // GrantUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateGrantAsync(grantId, tenantId, apiVersion, xApiVersion, grantUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GrantsApi#updateGrantAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GrantsApi#updateGrantAsync")
    e.printStackTrace()
}
```

### Parameters
| **grantId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **grantUpdateDto** | [**GrantUpdateDto**](GrantUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

