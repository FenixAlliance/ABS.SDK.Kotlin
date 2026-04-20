# CourseSectionsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseSectionAsync**](CourseSectionsApi.md#createCourseSectionAsync) | **POST** /api/v2/LearningService/CourseSections | Create a new course section |
| [**deleteCourseSectionAsync**](CourseSectionsApi.md#deleteCourseSectionAsync) | **DELETE** /api/v2/LearningService/CourseSections/{sectionId} | Delete a course section |
| [**getCourseSectionByIdAsync**](CourseSectionsApi.md#getCourseSectionByIdAsync) | **GET** /api/v2/LearningService/CourseSections/{sectionId} | Get course section by ID |
| [**getCourseSectionsAsync**](CourseSectionsApi.md#getCourseSectionsAsync) | **GET** /api/v2/LearningService/CourseSections | Get all course sections |
| [**getCourseSectionsCountAsync**](CourseSectionsApi.md#getCourseSectionsCountAsync) | **GET** /api/v2/LearningService/CourseSections/Count | Get course sections count |
| [**updateCourseSectionAsync**](CourseSectionsApi.md#updateCourseSectionAsync) | **PUT** /api/v2/LearningService/CourseSections/{sectionId} | Update a course section |


<a id="createCourseSectionAsync"></a>
# **createCourseSectionAsync**
> createCourseSectionAsync(tenantId, apiVersion, xApiVersion, courseSectionCreateDto)

Create a new course section

Creates a new course section for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseSectionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseSectionCreateDto : CourseSectionCreateDto =  // CourseSectionCreateDto | 
try {
    apiInstance.createCourseSectionAsync(tenantId, apiVersion, xApiVersion, courseSectionCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseSectionsApi#createCourseSectionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseSectionsApi#createCourseSectionAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseSectionCreateDto** | [**CourseSectionCreateDto**](CourseSectionCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseSectionAsync"></a>
# **deleteCourseSectionAsync**
> deleteCourseSectionAsync(sectionId, tenantId, apiVersion, xApiVersion)

Delete a course section

Deletes a course section for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseSectionsApi()
val sectionId : kotlin.String = sectionId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseSectionAsync(sectionId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CourseSectionsApi#deleteCourseSectionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseSectionsApi#deleteCourseSectionAsync")
    e.printStackTrace()
}
```

### Parameters
| **sectionId** | **kotlin.String**|  | |
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

<a id="getCourseSectionByIdAsync"></a>
# **getCourseSectionByIdAsync**
> CourseSectionDto getCourseSectionByIdAsync(sectionId, apiVersion, xApiVersion)

Get course section by ID

Retrieves a specific course section by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseSectionsApi()
val sectionId : kotlin.String = sectionId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseSectionDto = apiInstance.getCourseSectionByIdAsync(sectionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseSectionsApi#getCourseSectionByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseSectionsApi#getCourseSectionByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **sectionId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseSectionDto**](CourseSectionDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseSectionsAsync"></a>
# **getCourseSectionsAsync**
> kotlin.collections.List&lt;CourseSectionDto&gt; getCourseSectionsAsync(tenantId, apiVersion, xApiVersion)

Get all course sections

Retrieves all course sections for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseSectionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseSectionDto> = apiInstance.getCourseSectionsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseSectionsApi#getCourseSectionsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseSectionsApi#getCourseSectionsAsync")
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

[**kotlin.collections.List&lt;CourseSectionDto&gt;**](CourseSectionDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseSectionsCountAsync"></a>
# **getCourseSectionsCountAsync**
> kotlin.Int getCourseSectionsCountAsync(tenantId, apiVersion, xApiVersion)

Get course sections count

Returns the count of course sections for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseSectionsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseSectionsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CourseSectionsApi#getCourseSectionsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseSectionsApi#getCourseSectionsCountAsync")
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

<a id="updateCourseSectionAsync"></a>
# **updateCourseSectionAsync**
> updateCourseSectionAsync(sectionId, tenantId, apiVersion, xApiVersion, courseSectionUpdateDto)

Update a course section

Updates an existing course section for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CourseSectionsApi()
val sectionId : kotlin.String = sectionId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseSectionUpdateDto : CourseSectionUpdateDto =  // CourseSectionUpdateDto | 
try {
    apiInstance.updateCourseSectionAsync(sectionId, tenantId, apiVersion, xApiVersion, courseSectionUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CourseSectionsApi#updateCourseSectionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CourseSectionsApi#updateCourseSectionAsync")
    e.printStackTrace()
}
```

### Parameters
| **sectionId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseSectionUpdateDto** | [**CourseSectionUpdateDto**](CourseSectionUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

