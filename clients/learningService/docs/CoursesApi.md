# CoursesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCourseAsync**](CoursesApi.md#createCourseAsync) | **POST** /api/v2/LearningService/Courses | Create a new course |
| [**deleteCourseAsync**](CoursesApi.md#deleteCourseAsync) | **DELETE** /api/v2/LearningService/Courses/{courseId} | Delete a course |
| [**getCourseArticlesByCourseWikiAsync**](CoursesApi.md#getCourseArticlesByCourseWikiAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Articles/{wikiId} | Get course articles by course wiki |
| [**getCourseArticlesByCourseWikiCountAsync**](CoursesApi.md#getCourseArticlesByCourseWikiCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Articles/{wikiId}/Count | Get course articles by course wiki count |
| [**getCourseAssignmentsByCourseAsync**](CoursesApi.md#getCourseAssignmentsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Assignments | Get course assignments by course |
| [**getCourseAssignmentsByCourseCountAsync**](CoursesApi.md#getCourseAssignmentsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Assignments/Count | Get course assignments by course count |
| [**getCourseByIdAsync**](CoursesApi.md#getCourseByIdAsync) | **GET** /api/v2/LearningService/Courses/{courseId} | Get course by ID |
| [**getCourseCategoriesByCourseAsync**](CoursesApi.md#getCourseCategoriesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Categories | Get course categories by course |
| [**getCourseCategoriesByCourseCountAsync**](CoursesApi.md#getCourseCategoriesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Categories/Count | Get course categories by course count |
| [**getCourseCohortsByCourseAsync**](CoursesApi.md#getCourseCohortsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Cohorts | Get course cohorts by course |
| [**getCourseCohortsByCourseCountAsync**](CoursesApi.md#getCourseCohortsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Cohorts/Count | Get course cohorts by course count |
| [**getCourseEnrollmentsByCourseAsync**](CoursesApi.md#getCourseEnrollmentsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Enrollments | Get enrollments by course |
| [**getCourseFilesByCourseAsync**](CoursesApi.md#getCourseFilesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Files | Get course files by course |
| [**getCourseFilesByCourseCountAsync**](CoursesApi.md#getCourseFilesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Files/Count | Get course files by course count |
| [**getCourseForumsByCourseAsync**](CoursesApi.md#getCourseForumsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Forums | Get course forums by course |
| [**getCourseForumsByCourseCountAsync**](CoursesApi.md#getCourseForumsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Forums/Count | Get course forums by course count |
| [**getCourseHandoutsByCourseAsync**](CoursesApi.md#getCourseHandoutsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Handouts | Get course handouts by course |
| [**getCourseHandoutsByCourseCountAsync**](CoursesApi.md#getCourseHandoutsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Handouts/Count | Get course handouts by course count |
| [**getCourseLibrariesByCourseAsync**](CoursesApi.md#getCourseLibrariesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Libraries | Get course libraries by course |
| [**getCourseLibrariesByCourseCountAsync**](CoursesApi.md#getCourseLibrariesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Libraries/Count | Get course libraries by course count |
| [**getCoursePagesByCourseAsync**](CoursesApi.md#getCoursePagesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Pages | Get course pages by course |
| [**getCoursePagesByCourseCountAsync**](CoursesApi.md#getCoursePagesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Pages/Count | Get course pages by course count |
| [**getCourseProblemSetsByCourseAsync**](CoursesApi.md#getCourseProblemSetsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/ProblemSets | Get course problem sets by course |
| [**getCourseProblemSetsByCourseCountAsync**](CoursesApi.md#getCourseProblemSetsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/ProblemSets/Count | Get course problem sets by course count |
| [**getCourseSectionsByCourseAsync**](CoursesApi.md#getCourseSectionsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Sections | Get course sections by course |
| [**getCourseSectionsByCourseCountAsync**](CoursesApi.md#getCourseSectionsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Sections/Count | Get course sections by course count |
| [**getCourseUnitComponentsByCourseAsync**](CoursesApi.md#getCourseUnitComponentsByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/UnitComponents | Get course unit components by course |
| [**getCourseUnitComponentsByCourseCountAsync**](CoursesApi.md#getCourseUnitComponentsByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/UnitComponents/Count | Get course unit components by course count |
| [**getCourseUnitsBySectionAsync**](CoursesApi.md#getCourseUnitsBySectionAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Units/{sectionId} | Get course units by section |
| [**getCourseUnitsBySectionCountAsync**](CoursesApi.md#getCourseUnitsBySectionCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Units/{sectionId}/Count | Get course units by section count |
| [**getCourseUpdatesByCourseAsync**](CoursesApi.md#getCourseUpdatesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Updates | Get course updates by course |
| [**getCourseUpdatesByCourseCountAsync**](CoursesApi.md#getCourseUpdatesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Updates/Count | Get course updates by course count |
| [**getCourseWikisByCourseAsync**](CoursesApi.md#getCourseWikisByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Wikis | Get course wikis by course |
| [**getCourseWikisByCourseCountAsync**](CoursesApi.md#getCourseWikisByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Wikis/Count | Get course wikis by course count |
| [**getCoursesAsync**](CoursesApi.md#getCoursesAsync) | **GET** /api/v2/LearningService/Courses | Get courses |
| [**getCoursesCountAsync**](CoursesApi.md#getCoursesCountAsync) | **GET** /api/v2/LearningService/Courses/Count | Get courses count |
| [**getInstructorProfilesByCourseAsync**](CoursesApi.md#getInstructorProfilesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Instructors | Get instructor profiles by course |
| [**getInstructorProfilesByCourseCountAsync**](CoursesApi.md#getInstructorProfilesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Instructors/Count | Get instructor profiles by course count |
| [**getStudentProfilesByCourseAsync**](CoursesApi.md#getStudentProfilesByCourseAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Students | Get student profiles by course |
| [**getStudentProfilesByCourseCountAsync**](CoursesApi.md#getStudentProfilesByCourseCountAsync) | **GET** /api/v2/LearningService/Courses/{courseId}/Students/Count | Get student profiles by course count |
| [**updateCourseAsync**](CoursesApi.md#updateCourseAsync) | **PUT** /api/v2/LearningService/Courses/{courseId} | Update a course |


<a id="createCourseAsync"></a>
# **createCourseAsync**
> createCourseAsync(tenantId, apiVersion, xApiVersion, courseCreateDto)

Create a new course

Creates a new course for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCreateDto : CourseCreateDto =  // CourseCreateDto | 
try {
    apiInstance.createCourseAsync(tenantId, apiVersion, xApiVersion, courseCreateDto)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#createCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#createCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCreateDto** | [**CourseCreateDto**](CourseCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteCourseAsync"></a>
# **deleteCourseAsync**
> deleteCourseAsync(courseId, tenantId, apiVersion, xApiVersion)

Delete a course

Deletes a course for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteCourseAsync(courseId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#deleteCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#deleteCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **java.util.UUID**|  | |
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

<a id="getCourseArticlesByCourseWikiAsync"></a>
# **getCourseArticlesByCourseWikiAsync**
> kotlin.collections.List&lt;CourseArticleDto&gt; getCourseArticlesByCourseWikiAsync(courseId, wikiId, apiVersion, xApiVersion)

Get course articles by course wiki

Retrieves all course articles for a specific course wiki.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val wikiId : kotlin.String = wikiId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseArticleDto> = apiInstance.getCourseArticlesByCourseWikiAsync(courseId, wikiId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseArticlesByCourseWikiAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseArticlesByCourseWikiAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **wikiId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseArticleDto&gt;**](CourseArticleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseArticlesByCourseWikiCountAsync"></a>
# **getCourseArticlesByCourseWikiCountAsync**
> kotlin.Int getCourseArticlesByCourseWikiCountAsync(courseId, wikiId, apiVersion, xApiVersion)

Get course articles by course wiki count

Returns the count of course articles for a specific course wiki.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val wikiId : kotlin.String = wikiId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseArticlesByCourseWikiCountAsync(courseId, wikiId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseArticlesByCourseWikiCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseArticlesByCourseWikiCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **wikiId** | **kotlin.String**|  | |
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

<a id="getCourseAssignmentsByCourseAsync"></a>
# **getCourseAssignmentsByCourseAsync**
> kotlin.collections.List&lt;CourseAssignmentDto&gt; getCourseAssignmentsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course assignments by course

Retrieves all course assignments for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseAssignmentDto> = apiInstance.getCourseAssignmentsByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseAssignmentsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseAssignmentsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseAssignmentDto&gt;**](CourseAssignmentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseAssignmentsByCourseCountAsync"></a>
# **getCourseAssignmentsByCourseCountAsync**
> kotlin.Int getCourseAssignmentsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course assignments by course count

Returns the count of course assignments for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseAssignmentsByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseAssignmentsByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseAssignmentsByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseByIdAsync"></a>
# **getCourseByIdAsync**
> CourseDto getCourseByIdAsync(courseId, tenantId, apiVersion, xApiVersion)

Get course by ID

Retrieves a specific course by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CourseDto = apiInstance.getCourseByIdAsync(courseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CourseDto**](CourseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCategoriesByCourseAsync"></a>
# **getCourseCategoriesByCourseAsync**
> kotlin.collections.List&lt;CourseCategoryDto&gt; getCourseCategoriesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course categories by course

Retrieves all course categories for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseCategoryDto> = apiInstance.getCourseCategoriesByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseCategoriesByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseCategoriesByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseCategoryDto&gt;**](CourseCategoryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCategoriesByCourseCountAsync"></a>
# **getCourseCategoriesByCourseCountAsync**
> kotlin.Int getCourseCategoriesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course categories by course count

Returns the count of course categories for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseCategoriesByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseCategoriesByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseCategoriesByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseCohortsByCourseAsync"></a>
# **getCourseCohortsByCourseAsync**
> kotlin.collections.List&lt;CourseCohortDto&gt; getCourseCohortsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course cohorts by course

Retrieves all course cohorts for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseCohortDto> = apiInstance.getCourseCohortsByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseCohortsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseCohortsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseCohortDto&gt;**](CourseCohortDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseCohortsByCourseCountAsync"></a>
# **getCourseCohortsByCourseCountAsync**
> kotlin.Int getCourseCohortsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course cohorts by course count

Returns the count of course cohorts for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseCohortsByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseCohortsByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseCohortsByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseEnrollmentsByCourseAsync"></a>
# **getCourseEnrollmentsByCourseAsync**
> kotlin.collections.List&lt;CourseEnrollmentDto&gt; getCourseEnrollmentsByCourseAsync(courseId, tenantId, apiVersion, xApiVersion)

Get enrollments by course

Retrieves all enrollments for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseEnrollmentDto> = apiInstance.getCourseEnrollmentsByCourseAsync(courseId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseEnrollmentsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseEnrollmentsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseEnrollmentDto&gt;**](CourseEnrollmentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseFilesByCourseAsync"></a>
# **getCourseFilesByCourseAsync**
> kotlin.collections.List&lt;CourseFileDto&gt; getCourseFilesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course files by course

Retrieves all course files for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseFileDto> = apiInstance.getCourseFilesByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseFilesByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseFilesByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseFileDto&gt;**](CourseFileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseFilesByCourseCountAsync"></a>
# **getCourseFilesByCourseCountAsync**
> kotlin.Int getCourseFilesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course files by course count

Returns the count of course files for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseFilesByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseFilesByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseFilesByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseForumsByCourseAsync"></a>
# **getCourseForumsByCourseAsync**
> kotlin.collections.List&lt;CourseForumDto&gt; getCourseForumsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course forums by course

Retrieves all course forums for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseForumDto> = apiInstance.getCourseForumsByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseForumsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseForumsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseForumDto&gt;**](CourseForumDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseForumsByCourseCountAsync"></a>
# **getCourseForumsByCourseCountAsync**
> kotlin.Int getCourseForumsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course forums by course count

Returns the count of course forums for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseForumsByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseForumsByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseForumsByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseHandoutsByCourseAsync"></a>
# **getCourseHandoutsByCourseAsync**
> kotlin.collections.List&lt;CourseHandoutDto&gt; getCourseHandoutsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course handouts by course

Retrieves all course handouts for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseHandoutDto> = apiInstance.getCourseHandoutsByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseHandoutsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseHandoutsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseHandoutDto&gt;**](CourseHandoutDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseHandoutsByCourseCountAsync"></a>
# **getCourseHandoutsByCourseCountAsync**
> kotlin.Int getCourseHandoutsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course handouts by course count

Returns the count of course handouts for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseHandoutsByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseHandoutsByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseHandoutsByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseLibrariesByCourseAsync"></a>
# **getCourseLibrariesByCourseAsync**
> kotlin.collections.List&lt;CourseLibraryDto&gt; getCourseLibrariesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course libraries by course

Retrieves all course libraries for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseLibraryDto> = apiInstance.getCourseLibrariesByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseLibrariesByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseLibrariesByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseLibraryDto&gt;**](CourseLibraryDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseLibrariesByCourseCountAsync"></a>
# **getCourseLibrariesByCourseCountAsync**
> kotlin.Int getCourseLibrariesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course libraries by course count

Returns the count of course libraries for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseLibrariesByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseLibrariesByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseLibrariesByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCoursePagesByCourseAsync"></a>
# **getCoursePagesByCourseAsync**
> kotlin.collections.List&lt;CoursePageDto&gt; getCoursePagesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course pages by course

Retrieves all course pages for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CoursePageDto> = apiInstance.getCoursePagesByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCoursePagesByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCoursePagesByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CoursePageDto&gt;**](CoursePageDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCoursePagesByCourseCountAsync"></a>
# **getCoursePagesByCourseCountAsync**
> kotlin.Int getCoursePagesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course pages by course count

Returns the count of course pages for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCoursePagesByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCoursePagesByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCoursePagesByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseProblemSetsByCourseAsync"></a>
# **getCourseProblemSetsByCourseAsync**
> kotlin.collections.List&lt;CourseProblemSetDto&gt; getCourseProblemSetsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course problem sets by course

Retrieves all course problem sets for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseProblemSetDto> = apiInstance.getCourseProblemSetsByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseProblemSetsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseProblemSetsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseProblemSetDto&gt;**](CourseProblemSetDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseProblemSetsByCourseCountAsync"></a>
# **getCourseProblemSetsByCourseCountAsync**
> kotlin.Int getCourseProblemSetsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course problem sets by course count

Returns the count of course problem sets for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseProblemSetsByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseProblemSetsByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseProblemSetsByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseSectionsByCourseAsync"></a>
# **getCourseSectionsByCourseAsync**
> kotlin.collections.List&lt;CourseSectionDto&gt; getCourseSectionsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course sections by course

Retrieves all course sections for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseSectionDto> = apiInstance.getCourseSectionsByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseSectionsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseSectionsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseSectionsByCourseCountAsync"></a>
# **getCourseSectionsByCourseCountAsync**
> kotlin.Int getCourseSectionsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course sections by course count

Returns the count of course sections for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseSectionsByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseSectionsByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseSectionsByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseUnitComponentsByCourseAsync"></a>
# **getCourseUnitComponentsByCourseAsync**
> kotlin.collections.List&lt;CourseUnitComponentDto&gt; getCourseUnitComponentsByCourseAsync(courseId, apiVersion, xApiVersion)

Get course unit components by course

Retrieves all course unit components for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseUnitComponentDto> = apiInstance.getCourseUnitComponentsByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseUnitComponentsByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseUnitComponentsByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseUnitComponentDto&gt;**](CourseUnitComponentDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUnitComponentsByCourseCountAsync"></a>
# **getCourseUnitComponentsByCourseCountAsync**
> kotlin.Int getCourseUnitComponentsByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course unit components by course count

Returns the count of course unit components for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseUnitComponentsByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseUnitComponentsByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseUnitComponentsByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseUnitsBySectionAsync"></a>
# **getCourseUnitsBySectionAsync**
> kotlin.collections.List&lt;CourseUnitDto&gt; getCourseUnitsBySectionAsync(courseId, sectionId, apiVersion, xApiVersion)

Get course units by section

Retrieves all course units for a specific course section.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val sectionId : kotlin.String = sectionId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseUnitDto> = apiInstance.getCourseUnitsBySectionAsync(courseId, sectionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseUnitsBySectionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseUnitsBySectionAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **sectionId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseUnitDto&gt;**](CourseUnitDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUnitsBySectionCountAsync"></a>
# **getCourseUnitsBySectionCountAsync**
> kotlin.Int getCourseUnitsBySectionCountAsync(courseId, sectionId, apiVersion, xApiVersion)

Get course units by section count

Returns the count of course units for a specific course section.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val sectionId : kotlin.String = sectionId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseUnitsBySectionCountAsync(courseId, sectionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseUnitsBySectionCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseUnitsBySectionCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **sectionId** | **kotlin.String**|  | |
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

<a id="getCourseUpdatesByCourseAsync"></a>
# **getCourseUpdatesByCourseAsync**
> kotlin.collections.List&lt;CourseNewsDto&gt; getCourseUpdatesByCourseAsync(courseId, apiVersion, xApiVersion)

Get course updates by course

Retrieves all course updates for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseNewsDto> = apiInstance.getCourseUpdatesByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseUpdatesByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseUpdatesByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseNewsDto&gt;**](CourseNewsDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseUpdatesByCourseCountAsync"></a>
# **getCourseUpdatesByCourseCountAsync**
> kotlin.Int getCourseUpdatesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course updates by course count

Returns the count of course updates for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseUpdatesByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseUpdatesByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseUpdatesByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCourseWikisByCourseAsync"></a>
# **getCourseWikisByCourseAsync**
> kotlin.collections.List&lt;CourseWikiDto&gt; getCourseWikisByCourseAsync(courseId, apiVersion, xApiVersion)

Get course wikis by course

Retrieves all course wikis for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseWikiDto> = apiInstance.getCourseWikisByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseWikisByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseWikisByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;CourseWikiDto&gt;**](CourseWikiDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCourseWikisByCourseCountAsync"></a>
# **getCourseWikisByCourseCountAsync**
> kotlin.Int getCourseWikisByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get course wikis by course count

Returns the count of course wikis for a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCourseWikisByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCourseWikisByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCourseWikisByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getCoursesAsync"></a>
# **getCoursesAsync**
> kotlin.collections.List&lt;CourseDto&gt; getCoursesAsync(tenantId, apiVersion, xApiVersion)

Get courses

Retrieves courses. When tenantId is provided, returns tenant-scoped courses; otherwise returns all courses.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<CourseDto> = apiInstance.getCoursesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCoursesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCoursesAsync")
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

[**kotlin.collections.List&lt;CourseDto&gt;**](CourseDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCoursesCountAsync"></a>
# **getCoursesCountAsync**
> kotlin.Int getCoursesCountAsync(tenantId, apiVersion, xApiVersion)

Get courses count

Returns the count of courses. When tenantId is provided, returns tenant-scoped count; otherwise returns global count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getCoursesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getCoursesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getCoursesCountAsync")
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

<a id="getInstructorProfilesByCourseAsync"></a>
# **getInstructorProfilesByCourseAsync**
> kotlin.collections.List&lt;InstructorProfileDto&gt; getInstructorProfilesByCourseAsync(courseId, apiVersion, xApiVersion)

Get instructor profiles by course

Retrieves all instructor profiles teaching a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<InstructorProfileDto> = apiInstance.getInstructorProfilesByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getInstructorProfilesByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getInstructorProfilesByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;InstructorProfileDto&gt;**](InstructorProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getInstructorProfilesByCourseCountAsync"></a>
# **getInstructorProfilesByCourseCountAsync**
> kotlin.Int getInstructorProfilesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get instructor profiles by course count

Returns the count of instructor profiles teaching a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getInstructorProfilesByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getInstructorProfilesByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getInstructorProfilesByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="getStudentProfilesByCourseAsync"></a>
# **getStudentProfilesByCourseAsync**
> kotlin.collections.List&lt;StudentProfileDto&gt; getStudentProfilesByCourseAsync(courseId, apiVersion, xApiVersion)

Get student profiles by course

Retrieves all student profiles enrolled in a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.collections.List<StudentProfileDto> = apiInstance.getStudentProfilesByCourseAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getStudentProfilesByCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getStudentProfilesByCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**kotlin.collections.List&lt;StudentProfileDto&gt;**](StudentProfileDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStudentProfilesByCourseCountAsync"></a>
# **getStudentProfilesByCourseCountAsync**
> kotlin.Int getStudentProfilesByCourseCountAsync(courseId, apiVersion, xApiVersion)

Get student profiles by course count

Returns the count of student profiles enrolled in a specific course.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : kotlin.String = courseId_example // kotlin.String | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : kotlin.Int = apiInstance.getStudentProfilesByCourseCountAsync(courseId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#getStudentProfilesByCourseCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#getStudentProfilesByCourseCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **kotlin.String**|  | |
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

<a id="updateCourseAsync"></a>
# **updateCourseAsync**
> updateCourseAsync(courseId, tenantId, apiVersion, xApiVersion, courseUpdateDto)

Update a course

Updates an existing course for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CoursesApi()
val courseId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseUpdateDto : CourseUpdateDto =  // CourseUpdateDto | 
try {
    apiInstance.updateCourseAsync(courseId, tenantId, apiVersion, xApiVersion, courseUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling CoursesApi#updateCourseAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CoursesApi#updateCourseAsync")
    e.printStackTrace()
}
```

### Parameters
| **courseId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseUpdateDto** | [**CourseUpdateDto**](CourseUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

