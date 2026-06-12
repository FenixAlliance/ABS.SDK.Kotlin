# ApplicationsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBusinessApplicationAsync**](ApplicationsApi.md#createBusinessApplicationAsync) | **POST** /api/v2/SecurityService/Applications | Create a new business application |
| [**deleteBusinessApplicationAsync**](ApplicationsApi.md#deleteBusinessApplicationAsync) | **DELETE** /api/v2/SecurityService/Applications/{applicationId} | Delete a business application |
| [**getBusinessApplicationByIdAsync**](ApplicationsApi.md#getBusinessApplicationByIdAsync) | **GET** /api/v2/SecurityService/Applications/{applicationId} | Get business application by ID |
| [**getBusinessApplicationsAsync**](ApplicationsApi.md#getBusinessApplicationsAsync) | **GET** /api/v2/SecurityService/Applications | Get all business applications |
| [**getBusinessApplicationsCountAsync**](ApplicationsApi.md#getBusinessApplicationsCountAsync) | **GET** /api/v2/SecurityService/Applications/Count | Get business applications count |
| [**getPermissionsByApplicationAsync**](ApplicationsApi.md#getPermissionsByApplicationAsync) | **GET** /api/v2/SecurityService/Applications/{applicationId}/Permissions | Get permissions by application |
| [**getRolesByApplicationAsync**](ApplicationsApi.md#getRolesByApplicationAsync) | **GET** /api/v2/SecurityService/Applications/{applicationId}/Roles | Get roles by application |
| [**patchBusinessApplicationAsync**](ApplicationsApi.md#patchBusinessApplicationAsync) | **PATCH** /api/v2/SecurityService/Applications/{applicationId} | Patch an existing business application |
| [**updateBusinessApplicationAsync**](ApplicationsApi.md#updateBusinessApplicationAsync) | **PUT** /api/v2/SecurityService/Applications/{applicationId} | Update an existing business application |


<a id="createBusinessApplicationAsync"></a>
# **createBusinessApplicationAsync**
> EmptyEnvelope createBusinessApplicationAsync(tenantId, businessApplicationCreateDto, apiVersion, xApiVersion)

Create a new business application

Creates a new business application for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val businessApplicationCreateDto : BusinessApplicationCreateDto =  // BusinessApplicationCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createBusinessApplicationAsync(tenantId, businessApplicationCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#createBusinessApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#createBusinessApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **businessApplicationCreateDto** | [**BusinessApplicationCreateDto**](BusinessApplicationCreateDto.md)|  | |
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

<a id="deleteBusinessApplicationAsync"></a>
# **deleteBusinessApplicationAsync**
> EmptyEnvelope deleteBusinessApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)

Delete a business application

Deletes an existing business application for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBusinessApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#deleteBusinessApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#deleteBusinessApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
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

<a id="getBusinessApplicationByIdAsync"></a>
# **getBusinessApplicationByIdAsync**
> BusinessApplicationDtoEnvelope getBusinessApplicationByIdAsync(applicationId, tenantId, apiVersion, xApiVersion)

Get business application by ID

Retrieves a specific business application by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessApplicationDtoEnvelope = apiInstance.getBusinessApplicationByIdAsync(applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getBusinessApplicationByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getBusinessApplicationByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BusinessApplicationDtoEnvelope**](BusinessApplicationDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessApplicationsAsync"></a>
# **getBusinessApplicationsAsync**
> BusinessApplicationDtoListEnvelope getBusinessApplicationsAsync(tenantId, apiVersion, xApiVersion)

Get all business applications

Retrieves all business applications for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessApplicationDtoListEnvelope = apiInstance.getBusinessApplicationsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getBusinessApplicationsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getBusinessApplicationsAsync")
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

[**BusinessApplicationDtoListEnvelope**](BusinessApplicationDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessApplicationsCountAsync"></a>
# **getBusinessApplicationsCountAsync**
> Int32Envelope getBusinessApplicationsCountAsync(tenantId, apiVersion, xApiVersion)

Get business applications count

Retrieves the count of business applications for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBusinessApplicationsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getBusinessApplicationsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getBusinessApplicationsCountAsync")
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

<a id="getPermissionsByApplicationAsync"></a>
# **getPermissionsByApplicationAsync**
> SecurityPermissionDtoListEnvelope getPermissionsByApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)

Get permissions by application

Retrieves all security permissions granted to a specific business application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityPermissionDtoListEnvelope = apiInstance.getPermissionsByApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getPermissionsByApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getPermissionsByApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SecurityPermissionDtoListEnvelope**](SecurityPermissionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getRolesByApplicationAsync"></a>
# **getRolesByApplicationAsync**
> SecurityRoleDtoListEnvelope getRolesByApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)

Get roles by application

Retrieves all security roles granted to a specific business application.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SecurityRoleDtoListEnvelope = apiInstance.getRolesByApplicationAsync(applicationId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#getRolesByApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#getRolesByApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SecurityRoleDtoListEnvelope**](SecurityRoleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchBusinessApplicationAsync"></a>
# **patchBusinessApplicationAsync**
> EmptyEnvelope patchBusinessApplicationAsync(applicationId, tenantId, operation, apiVersion, xApiVersion)

Patch an existing business application

Partially updates an existing business application using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.patchBusinessApplicationAsync(applicationId, tenantId, operation, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#patchBusinessApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#patchBusinessApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | |
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

<a id="updateBusinessApplicationAsync"></a>
# **updateBusinessApplicationAsync**
> EmptyEnvelope updateBusinessApplicationAsync(applicationId, tenantId, businessApplicationUpdateDto, apiVersion, xApiVersion)

Update an existing business application

Updates an existing business application for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ApplicationsApi()
val applicationId : kotlin.String = applicationId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val businessApplicationUpdateDto : BusinessApplicationUpdateDto =  // BusinessApplicationUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateBusinessApplicationAsync(applicationId, tenantId, businessApplicationUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ApplicationsApi#updateBusinessApplicationAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ApplicationsApi#updateBusinessApplicationAsync")
    e.printStackTrace()
}
```

### Parameters
| **applicationId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **businessApplicationUpdateDto** | [**BusinessApplicationUpdateDto**](BusinessApplicationUpdateDto.md)|  | |
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

