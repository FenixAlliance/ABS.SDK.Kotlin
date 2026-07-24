# RadzenEditorApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**radzenUploadImage**](RadzenEditorApi.md#radzenUploadImage) | **POST** /api/v2/fs/radzen/tenants/{tenantId}/upload/image | Upload an editor image to tenant storage. |
| [**radzenUploadImageScoped**](RadzenEditorApi.md#radzenUploadImageScoped) | **POST** /api/v2/fs/radzen/tenants/{tenantId}/{recordType}/{recordId}/upload/image | Upload an editor image scoped to a record. |
| [**radzenUploadSingle**](RadzenEditorApi.md#radzenUploadSingle) | **POST** /api/v2/fs/radzen/tenants/{tenantId}/upload/single | Upload a single editor file to tenant storage. |
| [**radzenUploadSingleScoped**](RadzenEditorApi.md#radzenUploadSingleScoped) | **POST** /api/v2/fs/radzen/tenants/{tenantId}/{recordType}/{recordId}/upload/single | Upload a single editor file scoped to a record. |
| [**radzenUploadStream**](RadzenEditorApi.md#radzenUploadStream) | **PUT** /api/v2/fs/radzen/tenants/{tenantId}/upload/stream | Chunked editor upload (not implemented). |
| [**radzenUploadStreamScoped**](RadzenEditorApi.md#radzenUploadStreamScoped) | **PUT** /api/v2/fs/radzen/tenants/{tenantId}/{recordType}/{recordId}/upload/stream | Chunked editor upload scoped to a record (not implemented). |
| [**radzenUploadUserImage**](RadzenEditorApi.md#radzenUploadUserImage) | **POST** /api/v2/fs/radzen/users/upload/image | Upload an editor image to user storage. |
| [**radzenUploadUserImageScoped**](RadzenEditorApi.md#radzenUploadUserImageScoped) | **POST** /api/v2/fs/radzen/users/{recordType}/{recordId}/upload/image | Upload a user editor image scoped to a record. |


<a id="radzenUploadImage"></a>
# **radzenUploadImage**
> radzenUploadImage(tenantId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, file)

Upload an editor image to tenant storage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val visibility : kotlin.String = visibility_example // kotlin.String | 
val socialProfileId : kotlin.String = socialProfileId_example // kotlin.String | 
val purpose : kotlin.String = purpose_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.radzenUploadImage(tenantId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#radzenUploadImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#radzenUploadImage")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **visibility** | **kotlin.String**|  | [optional] |
| **socialProfileId** | **kotlin.String**|  | [optional] |
| **purpose** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="radzenUploadImageScoped"></a>
# **radzenUploadImageScoped**
> radzenUploadImageScoped(tenantId, recordType, recordId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, file)

Upload an editor image scoped to a record.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val recordType : kotlin.String = recordType_example // kotlin.String | 
val recordId : kotlin.String = recordId_example // kotlin.String | 
val visibility : kotlin.String = visibility_example // kotlin.String | 
val socialProfileId : kotlin.String = socialProfileId_example // kotlin.String | 
val purpose : kotlin.String = purpose_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.radzenUploadImageScoped(tenantId, recordType, recordId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#radzenUploadImageScoped")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#radzenUploadImageScoped")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **recordType** | **kotlin.String**|  | |
| **recordId** | **kotlin.String**|  | |
| **visibility** | **kotlin.String**|  | [optional] |
| **socialProfileId** | **kotlin.String**|  | [optional] |
| **purpose** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="radzenUploadSingle"></a>
# **radzenUploadSingle**
> radzenUploadSingle(tenantId, apiVersion, xApiVersion, file)

Upload a single editor file to tenant storage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.radzenUploadSingle(tenantId, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#radzenUploadSingle")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#radzenUploadSingle")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="radzenUploadSingleScoped"></a>
# **radzenUploadSingleScoped**
> radzenUploadSingleScoped(tenantId, recordType, recordId, apiVersion, xApiVersion, file)

Upload a single editor file scoped to a record.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val recordType : kotlin.String = recordType_example // kotlin.String | 
val recordId : kotlin.String = recordId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.radzenUploadSingleScoped(tenantId, recordType, recordId, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#radzenUploadSingleScoped")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#radzenUploadSingleScoped")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **recordType** | **kotlin.String**|  | |
| **recordId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="radzenUploadStream"></a>
# **radzenUploadStream**
> radzenUploadStream(tenantId, apiVersion, xApiVersion)

Chunked editor upload (not implemented).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : kotlin.String = tenantId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.radzenUploadStream(tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#radzenUploadStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#radzenUploadStream")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **kotlin.String**|  | |
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
 - **Accept**: Not defined

<a id="radzenUploadStreamScoped"></a>
# **radzenUploadStreamScoped**
> radzenUploadStreamScoped(tenantId, recordType, recordId, apiVersion, xApiVersion)

Chunked editor upload scoped to a record (not implemented).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val tenantId : kotlin.String = tenantId_example // kotlin.String | 
val recordType : kotlin.String = recordType_example // kotlin.String | 
val recordId : kotlin.String = recordId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.radzenUploadStreamScoped(tenantId, recordType, recordId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#radzenUploadStreamScoped")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#radzenUploadStreamScoped")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **kotlin.String**|  | |
| **recordType** | **kotlin.String**|  | |
| **recordId** | **kotlin.String**|  | |
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
 - **Accept**: Not defined

<a id="radzenUploadUserImage"></a>
# **radzenUploadUserImage**
> radzenUploadUserImage(visibility, socialProfileId, purpose, apiVersion, xApiVersion, file)

Upload an editor image to user storage.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val visibility : kotlin.String = visibility_example // kotlin.String | 
val socialProfileId : kotlin.String = socialProfileId_example // kotlin.String | 
val purpose : kotlin.String = purpose_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.radzenUploadUserImage(visibility, socialProfileId, purpose, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#radzenUploadUserImage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#radzenUploadUserImage")
    e.printStackTrace()
}
```

### Parameters
| **visibility** | **kotlin.String**|  | [optional] |
| **socialProfileId** | **kotlin.String**|  | [optional] |
| **purpose** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a id="radzenUploadUserImageScoped"></a>
# **radzenUploadUserImageScoped**
> radzenUploadUserImageScoped(recordType, recordId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, file)

Upload a user editor image scoped to a record.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = RadzenEditorApi()
val recordType : kotlin.String = recordType_example // kotlin.String | 
val recordId : kotlin.String = recordId_example // kotlin.String | 
val visibility : kotlin.String = visibility_example // kotlin.String | 
val socialProfileId : kotlin.String = socialProfileId_example // kotlin.String | 
val purpose : kotlin.String = purpose_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val file : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    apiInstance.radzenUploadUserImageScoped(recordType, recordId, visibility, socialProfileId, purpose, apiVersion, xApiVersion, file)
} catch (e: ClientException) {
    println("4xx response calling RadzenEditorApi#radzenUploadUserImageScoped")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RadzenEditorApi#radzenUploadUserImageScoped")
    e.printStackTrace()
}
```

### Parameters
| **recordType** | **kotlin.String**|  | |
| **recordId** | **kotlin.String**|  | |
| **visibility** | **kotlin.String**|  | [optional] |
| **socialProfileId** | **kotlin.String**|  | [optional] |
| **purpose** | **kotlin.String**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

