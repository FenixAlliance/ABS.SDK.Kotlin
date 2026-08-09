# MeApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getMyAverageScoreAsync**](MeApi.md#getMyAverageScoreAsync) | **GET** /api/v2/LearningService/Me/AverageScore | Get current user&#39;s average score |
| [**getMyCertificatesAsync**](MeApi.md#getMyCertificatesAsync) | **GET** /api/v2/LearningService/Me/Certificates | Get current user&#39;s completion certificates |
| [**getMyCertificatesCountAsync**](MeApi.md#getMyCertificatesCountAsync) | **GET** /api/v2/LearningService/Me/Certificates/Count | Get current user&#39;s certificates count |
| [**getMyEnrollmentsAsync**](MeApi.md#getMyEnrollmentsAsync) | **GET** /api/v2/LearningService/Me/Enrollments | Get current user&#39;s course enrollments |
| [**getMyEnrollmentsCountAsync**](MeApi.md#getMyEnrollmentsCountAsync) | **GET** /api/v2/LearningService/Me/Enrollments/Count | Get current user&#39;s enrollment count |
| [**getMyHoursCompletedAsync**](MeApi.md#getMyHoursCompletedAsync) | **GET** /api/v2/LearningService/Me/HoursCompleted | Get current user&#39;s completed hours |
| [**getMyInstructorCoursesAsync**](MeApi.md#getMyInstructorCoursesAsync) | **GET** /api/v2/LearningService/Me/InstructorCourses | Get current user&#39;s instructor courses |
| [**getMyInstructorCoursesCountAsync**](MeApi.md#getMyInstructorCoursesCountAsync) | **GET** /api/v2/LearningService/Me/InstructorCourses/Count | Get current user&#39;s instructor courses count |
| [**getMyInstructorProfilesAsync**](MeApi.md#getMyInstructorProfilesAsync) | **GET** /api/v2/LearningService/Me/InstructorProfiles | Get current user&#39;s instructor profiles |
| [**getMyInstructorProfilesCountAsync**](MeApi.md#getMyInstructorProfilesCountAsync) | **GET** /api/v2/LearningService/Me/InstructorProfiles/Count | Get current user&#39;s instructor profiles count |
| [**getMyPendingTaskCountAsync**](MeApi.md#getMyPendingTaskCountAsync) | **GET** /api/v2/LearningService/Me/PendingTasks | Get current user&#39;s pending task count |
| [**getMyStudentCoursesAsync**](MeApi.md#getMyStudentCoursesAsync) | **GET** /api/v2/LearningService/Me/Courses | Get current user&#39;s enrolled courses |
| [**getMyStudentCoursesCountAsync**](MeApi.md#getMyStudentCoursesCountAsync) | **GET** /api/v2/LearningService/Me/Courses/Count | Get current user&#39;s enrolled courses count |
| [**getMyStudentProfilesAsync**](MeApi.md#getMyStudentProfilesAsync) | **GET** /api/v2/LearningService/Me/StudentProfiles | Get current user&#39;s student profiles |
| [**getMyStudentProfilesCountAsync**](MeApi.md#getMyStudentProfilesCountAsync) | **GET** /api/v2/LearningService/Me/StudentProfiles/Count | Get current user&#39;s student profiles count |


<a id="getMyAverageScoreAsync"></a>
# **getMyAverageScoreAsync**
> AverageDtoEnvelope getMyAverageScoreAsync(apiVersion, xApiVersion)

Get current user&#39;s average score

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AverageDtoEnvelope = apiInstance.getMyAverageScoreAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyAverageScoreAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyAverageScoreAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**AverageDtoEnvelope**](AverageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMyCertificatesAsync"></a>
# **getMyCertificatesAsync**
> CourseCompletionCertificateDtoIReadOnlyListEnvelope getMyCertificatesAsync(apiVersion, xApiVersion, courseCompletionCertificateDtoCollectionQueryParameters)

Get current user&#39;s completion certificates

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCompletionCertificateDtoCollectionQueryParameters : CourseCompletionCertificateDtoCollectionQueryParameters =  // CourseCompletionCertificateDtoCollectionQueryParameters | 
try {
    val result : CourseCompletionCertificateDtoIReadOnlyListEnvelope = apiInstance.getMyCertificatesAsync(apiVersion, xApiVersion, courseCompletionCertificateDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyCertificatesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyCertificatesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCompletionCertificateDtoCollectionQueryParameters** | [**CourseCompletionCertificateDtoCollectionQueryParameters**](CourseCompletionCertificateDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CourseCompletionCertificateDtoIReadOnlyListEnvelope**](CourseCompletionCertificateDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyCertificatesCountAsync"></a>
# **getMyCertificatesCountAsync**
> kotlin.Int getMyCertificatesCountAsync(apiVersion, xApiVersion, courseCompletionCertificateDtoCollectionQueryParameters)

Get current user&#39;s certificates count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseCompletionCertificateDtoCollectionQueryParameters : CourseCompletionCertificateDtoCollectionQueryParameters =  // CourseCompletionCertificateDtoCollectionQueryParameters | 
try {
    val result : kotlin.Int = apiInstance.getMyCertificatesCountAsync(apiVersion, xApiVersion, courseCompletionCertificateDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyCertificatesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyCertificatesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseCompletionCertificateDtoCollectionQueryParameters** | [**CourseCompletionCertificateDtoCollectionQueryParameters**](CourseCompletionCertificateDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyEnrollmentsAsync"></a>
# **getMyEnrollmentsAsync**
> CourseEnrollmentDtoIReadOnlyListEnvelope getMyEnrollmentsAsync(apiVersion, xApiVersion, courseEnrollmentDtoCollectionQueryParameters)

Get current user&#39;s course enrollments

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseEnrollmentDtoCollectionQueryParameters : CourseEnrollmentDtoCollectionQueryParameters =  // CourseEnrollmentDtoCollectionQueryParameters | 
try {
    val result : CourseEnrollmentDtoIReadOnlyListEnvelope = apiInstance.getMyEnrollmentsAsync(apiVersion, xApiVersion, courseEnrollmentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyEnrollmentsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyEnrollmentsAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseEnrollmentDtoCollectionQueryParameters** | [**CourseEnrollmentDtoCollectionQueryParameters**](CourseEnrollmentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CourseEnrollmentDtoIReadOnlyListEnvelope**](CourseEnrollmentDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyEnrollmentsCountAsync"></a>
# **getMyEnrollmentsCountAsync**
> kotlin.Int getMyEnrollmentsCountAsync(apiVersion, xApiVersion, courseEnrollmentDtoCollectionQueryParameters)

Get current user&#39;s enrollment count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseEnrollmentDtoCollectionQueryParameters : CourseEnrollmentDtoCollectionQueryParameters =  // CourseEnrollmentDtoCollectionQueryParameters | 
try {
    val result : kotlin.Int = apiInstance.getMyEnrollmentsCountAsync(apiVersion, xApiVersion, courseEnrollmentDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyEnrollmentsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyEnrollmentsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseEnrollmentDtoCollectionQueryParameters** | [**CourseEnrollmentDtoCollectionQueryParameters**](CourseEnrollmentDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyHoursCompletedAsync"></a>
# **getMyHoursCompletedAsync**
> CountDtoEnvelope getMyHoursCompletedAsync(apiVersion, xApiVersion)

Get current user&#39;s completed hours

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountDtoEnvelope = apiInstance.getMyHoursCompletedAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyHoursCompletedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyHoursCompletedAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountDtoEnvelope**](CountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMyInstructorCoursesAsync"></a>
# **getMyInstructorCoursesAsync**
> CourseDtoIReadOnlyListEnvelope getMyInstructorCoursesAsync(apiVersion, xApiVersion, courseDtoCollectionQueryParameters)

Get current user&#39;s instructor courses

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseDtoCollectionQueryParameters : CourseDtoCollectionQueryParameters =  // CourseDtoCollectionQueryParameters | 
try {
    val result : CourseDtoIReadOnlyListEnvelope = apiInstance.getMyInstructorCoursesAsync(apiVersion, xApiVersion, courseDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyInstructorCoursesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyInstructorCoursesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseDtoCollectionQueryParameters** | [**CourseDtoCollectionQueryParameters**](CourseDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CourseDtoIReadOnlyListEnvelope**](CourseDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyInstructorCoursesCountAsync"></a>
# **getMyInstructorCoursesCountAsync**
> kotlin.Int getMyInstructorCoursesCountAsync(apiVersion, xApiVersion, courseDtoCollectionQueryParameters)

Get current user&#39;s instructor courses count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseDtoCollectionQueryParameters : CourseDtoCollectionQueryParameters =  // CourseDtoCollectionQueryParameters | 
try {
    val result : kotlin.Int = apiInstance.getMyInstructorCoursesCountAsync(apiVersion, xApiVersion, courseDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyInstructorCoursesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyInstructorCoursesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseDtoCollectionQueryParameters** | [**CourseDtoCollectionQueryParameters**](CourseDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyInstructorProfilesAsync"></a>
# **getMyInstructorProfilesAsync**
> InstructorProfileDtoIReadOnlyListEnvelope getMyInstructorProfilesAsync(apiVersion, xApiVersion, instructorProfileDtoCollectionQueryParameters)

Get current user&#39;s instructor profiles

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val instructorProfileDtoCollectionQueryParameters : InstructorProfileDtoCollectionQueryParameters =  // InstructorProfileDtoCollectionQueryParameters | 
try {
    val result : InstructorProfileDtoIReadOnlyListEnvelope = apiInstance.getMyInstructorProfilesAsync(apiVersion, xApiVersion, instructorProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyInstructorProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyInstructorProfilesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **instructorProfileDtoCollectionQueryParameters** | [**InstructorProfileDtoCollectionQueryParameters**](InstructorProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**InstructorProfileDtoIReadOnlyListEnvelope**](InstructorProfileDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyInstructorProfilesCountAsync"></a>
# **getMyInstructorProfilesCountAsync**
> kotlin.Int getMyInstructorProfilesCountAsync(apiVersion, xApiVersion, instructorProfileDtoCollectionQueryParameters)

Get current user&#39;s instructor profiles count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val instructorProfileDtoCollectionQueryParameters : InstructorProfileDtoCollectionQueryParameters =  // InstructorProfileDtoCollectionQueryParameters | 
try {
    val result : kotlin.Int = apiInstance.getMyInstructorProfilesCountAsync(apiVersion, xApiVersion, instructorProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyInstructorProfilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyInstructorProfilesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **instructorProfileDtoCollectionQueryParameters** | [**InstructorProfileDtoCollectionQueryParameters**](InstructorProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyPendingTaskCountAsync"></a>
# **getMyPendingTaskCountAsync**
> CountDtoEnvelope getMyPendingTaskCountAsync(apiVersion, xApiVersion)

Get current user&#39;s pending task count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CountDtoEnvelope = apiInstance.getMyPendingTaskCountAsync(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyPendingTaskCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyPendingTaskCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CountDtoEnvelope**](CountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMyStudentCoursesAsync"></a>
# **getMyStudentCoursesAsync**
> CourseDtoIReadOnlyListEnvelope getMyStudentCoursesAsync(apiVersion, xApiVersion, courseDtoCollectionQueryParameters)

Get current user&#39;s enrolled courses

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseDtoCollectionQueryParameters : CourseDtoCollectionQueryParameters =  // CourseDtoCollectionQueryParameters | 
try {
    val result : CourseDtoIReadOnlyListEnvelope = apiInstance.getMyStudentCoursesAsync(apiVersion, xApiVersion, courseDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyStudentCoursesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyStudentCoursesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseDtoCollectionQueryParameters** | [**CourseDtoCollectionQueryParameters**](CourseDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**CourseDtoIReadOnlyListEnvelope**](CourseDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyStudentCoursesCountAsync"></a>
# **getMyStudentCoursesCountAsync**
> kotlin.Int getMyStudentCoursesCountAsync(apiVersion, xApiVersion, courseDtoCollectionQueryParameters)

Get current user&#39;s enrolled courses count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val courseDtoCollectionQueryParameters : CourseDtoCollectionQueryParameters =  // CourseDtoCollectionQueryParameters | 
try {
    val result : kotlin.Int = apiInstance.getMyStudentCoursesCountAsync(apiVersion, xApiVersion, courseDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyStudentCoursesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyStudentCoursesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **courseDtoCollectionQueryParameters** | [**CourseDtoCollectionQueryParameters**](CourseDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyStudentProfilesAsync"></a>
# **getMyStudentProfilesAsync**
> StudentProfileDtoIReadOnlyListEnvelope getMyStudentProfilesAsync(apiVersion, xApiVersion, studentProfileDtoCollectionQueryParameters)

Get current user&#39;s student profiles

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val studentProfileDtoCollectionQueryParameters : StudentProfileDtoCollectionQueryParameters =  // StudentProfileDtoCollectionQueryParameters | 
try {
    val result : StudentProfileDtoIReadOnlyListEnvelope = apiInstance.getMyStudentProfilesAsync(apiVersion, xApiVersion, studentProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyStudentProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyStudentProfilesAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **studentProfileDtoCollectionQueryParameters** | [**StudentProfileDtoCollectionQueryParameters**](StudentProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**StudentProfileDtoIReadOnlyListEnvelope**](StudentProfileDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getMyStudentProfilesCountAsync"></a>
# **getMyStudentProfilesCountAsync**
> kotlin.Int getMyStudentProfilesCountAsync(apiVersion, xApiVersion, studentProfileDtoCollectionQueryParameters)

Get current user&#39;s student profiles count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MeApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val studentProfileDtoCollectionQueryParameters : StudentProfileDtoCollectionQueryParameters =  // StudentProfileDtoCollectionQueryParameters | 
try {
    val result : kotlin.Int = apiInstance.getMyStudentProfilesCountAsync(apiVersion, xApiVersion, studentProfileDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MeApi#getMyStudentProfilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MeApi#getMyStudentProfilesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **studentProfileDtoCollectionQueryParameters** | [**StudentProfileDtoCollectionQueryParameters**](StudentProfileDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

**kotlin.Int**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

