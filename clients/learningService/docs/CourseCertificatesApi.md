# CourseCertificatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseCertificateAsync**](CourseCertificatesApi.md#createCourseCertificateAsync) | **POST** /api/v2/LearningService/CourseCertificates | Create a course certificate |
| [**createCourseCertificateTemplateAsync**](CourseCertificatesApi.md#createCourseCertificateTemplateAsync) | **POST** /api/v2/LearningService/CourseCertificates/Template | Create a certificate template |
| [**deleteCourseCertificateAsync**](CourseCertificatesApi.md#deleteCourseCertificateAsync) | **DELETE** /api/v2/LearningService/CourseCertificates/{courseCertificateId} | Delete a course certificate |
| [**deleteCourseCertificateTemplateAsync**](CourseCertificatesApi.md#deleteCourseCertificateTemplateAsync) | **DELETE** /api/v2/LearningService/CourseCertificates/Template/{courseCertificateTemplateId} | Delete a certificate template |
| [**getCourseCertificateAsync**](CourseCertificatesApi.md#getCourseCertificateAsync) | **GET** /api/v2/LearningService/CourseCertificates/{courseCertificateId} | Get course certificate by ID |
| [**getCourseCertificateTemplateAsync**](CourseCertificatesApi.md#getCourseCertificateTemplateAsync) | **GET** /api/v2/LearningService/CourseCertificates/Template/{courseCertificateTemplateId} | Get certificate template by ID |
| [**getCourseCertificateTemplatesAsync**](CourseCertificatesApi.md#getCourseCertificateTemplatesAsync) | **GET** /api/v2/LearningService/CourseCertificates/Template | Get all certificate templates |
| [**getCourseCertificatesAsync**](CourseCertificatesApi.md#getCourseCertificatesAsync) | **GET** /api/v2/LearningService/CourseCertificates | Get all course certificates |
| [**getCourseCertificatesCountAsync**](CourseCertificatesApi.md#getCourseCertificatesCountAsync) | **GET** /api/v2/LearningService/CourseCertificates/Count | Get course certificates count |
| [**updateCourseCertificateAsync**](CourseCertificatesApi.md#updateCourseCertificateAsync) | **PUT** /api/v2/LearningService/CourseCertificates/{courseCertificateId} | Update a course certificate |


<a id="createCourseCertificateAsync"></a>
# **createCourseCertificateAsync**
> createCourseCertificateAsync(tenantId, apiVersion, xApiVersion, courseCompletionCertificateCreateDto)

Create a course certificate

Creates a new course certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCompletionCertificateCreateDto : CourseCompletionCertificateCreateDto =  // CourseCompletionCertificateCreateDto | 
try {
    apiInstance.createCourseCertificateAsync(tenantId, apiVersion, xApiVersion, courseCompletionCertificateCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#createCourseCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#createCourseCertificateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCompletionCertificateCreateDto** | [**CourseCompletionCertificateCreateDto**](CourseCompletionCertificateCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createCourseCertificateTemplateAsync"></a>
# **createCourseCertificateTemplateAsync**
> createCourseCertificateTemplateAsync(tenantId, apiVersion, xApiVersion, courseCertificateTemplateCreateDto)

Create a certificate template

Creates a new course certificate template for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCertificateTemplateCreateDto : CourseCertificateTemplateCreateDto =  // CourseCertificateTemplateCreateDto | 
try {
    apiInstance.createCourseCertificateTemplateAsync(tenantId, apiVersion, xApiVersion, courseCertificateTemplateCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#createCourseCertificateTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#createCourseCertificateTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCertificateTemplateCreateDto** | [**CourseCertificateTemplateCreateDto**](CourseCertificateTemplateCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseCertificateAsync"></a>
# **deleteCourseCertificateAsync**
> deleteCourseCertificateAsync(courseCertificateId, tenantId, apiVersion, xApiVersion)

Delete a course certificate

Deletes a course certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val courseCertificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseCertificateAsync(courseCertificateId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#deleteCourseCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#deleteCourseCertificateAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseCertificateId** | **java.util.UUID**|  | |
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

<a id="deleteCourseCertificateTemplateAsync"></a>
# **deleteCourseCertificateTemplateAsync**
> deleteCourseCertificateTemplateAsync(courseCertificateTemplateId, tenantId, apiVersion, xApiVersion)

Delete a certificate template

Deletes a course certificate template for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val courseCertificateTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseCertificateTemplateAsync(courseCertificateTemplateId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#deleteCourseCertificateTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#deleteCourseCertificateTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseCertificateTemplateId** | **java.util.UUID**|  | |
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

<a id="getCourseCertificateAsync"></a>
# **getCourseCertificateAsync**
> CourseCompletionCertificateDto getCourseCertificateAsync(courseCertificateId, tenantId, apiVersion, xApiVersion)

Get course certificate by ID

Retrieves a specific course certificate by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val courseCertificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseCompletionCertificateDto = apiInstance.getCourseCertificateAsync(courseCertificateId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#getCourseCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#getCourseCertificateAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseCertificateId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseCompletionCertificateDto**](CourseCompletionCertificateDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCertificateTemplateAsync"></a>
# **getCourseCertificateTemplateAsync**
> CourseCertificateTemplateDto getCourseCertificateTemplateAsync(courseCertificateTemplateId, tenantId, apiVersion, xApiVersion)

Get certificate template by ID

Retrieves a specific course certificate template by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val courseCertificateTemplateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseCertificateTemplateDto = apiInstance.getCourseCertificateTemplateAsync(courseCertificateTemplateId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#getCourseCertificateTemplateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#getCourseCertificateTemplateAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseCertificateTemplateId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseCertificateTemplateDto**](CourseCertificateTemplateDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCertificateTemplatesAsync"></a>
# **getCourseCertificateTemplatesAsync**
> kotlin.collections.List&lt;CourseCertificateTemplateDto&gt; getCourseCertificateTemplatesAsync(tenantId, apiVersion, xApiVersion)

Get all certificate templates

Retrieves all course certificate templates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseCertificateTemplateDto> = apiInstance.getCourseCertificateTemplatesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#getCourseCertificateTemplatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#getCourseCertificateTemplatesAsync")
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

[**kotlin.collections.List&lt;CourseCertificateTemplateDto&gt;**](CourseCertificateTemplateDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCertificatesAsync"></a>
# **getCourseCertificatesAsync**
> kotlin.collections.List&lt;CourseCompletionCertificateDto&gt; getCourseCertificatesAsync(tenantId, apiVersion, xApiVersion)

Get all course certificates

Retrieves all course certificates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseCompletionCertificateDto> = apiInstance.getCourseCertificatesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#getCourseCertificatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#getCourseCertificatesAsync")
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

[**kotlin.collections.List&lt;CourseCompletionCertificateDto&gt;**](CourseCompletionCertificateDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCertificatesCountAsync"></a>
# **getCourseCertificatesCountAsync**
> kotlin.Int getCourseCertificatesCountAsync(tenantId, apiVersion, xApiVersion)

Get course certificates count

Returns the count of course certificates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseCertificatesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#getCourseCertificatesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#getCourseCertificatesCountAsync")
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

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateCourseCertificateAsync"></a>
# **updateCourseCertificateAsync**
> updateCourseCertificateAsync(courseCertificateId, tenantId, apiVersion, xApiVersion, courseCompletionCertificateUpdateDto)

Update a course certificate

Updates an existing course certificate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseCertificatesApi()
val courseCertificateId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCompletionCertificateUpdateDto : CourseCompletionCertificateUpdateDto =  // CourseCompletionCertificateUpdateDto | 
try {
    apiInstance.updateCourseCertificateAsync(courseCertificateId, tenantId, apiVersion, xApiVersion, courseCompletionCertificateUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseCertificatesApi#updateCourseCertificateAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseCertificatesApi#updateCourseCertificateAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseCertificateId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCompletionCertificateUpdateDto** | [**CourseCompletionCertificateUpdateDto**](CourseCompletionCertificateUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

