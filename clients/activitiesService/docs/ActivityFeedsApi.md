# ActivityFeedsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countActivityTypesAsync**](ActivityFeedsApi.md#countActivityTypesAsync) | **GET** /api/v2/ActivitiesService/ActivityTypes/Count | Count Activity Types |
| [**createActivityAsync**](ActivityFeedsApi.md#createActivityAsync) | **POST** /api/v2/ActivitiesService/ActivityFeeds/{activityFeedId}/Activities | Create an activity |
| [**createActivityTypeAsync**](ActivityFeedsApi.md#createActivityTypeAsync) | **POST** /api/v2/ActivitiesService/ActivityTypes | Create Activity Type |
| [**deleteActivityAsync**](ActivityFeedsApi.md#deleteActivityAsync) | **DELETE** /api/v2/ActivitiesService/ActivityFeeds/{activityFeedId}/Activities/{activityId} | Delete an activity |
| [**deleteActivityTypeAsync**](ActivityFeedsApi.md#deleteActivityTypeAsync) | **DELETE** /api/v2/ActivitiesService/ActivityTypes/{activityTypeId} | Delete Activity Type |
| [**getActivitiesAsync**](ActivityFeedsApi.md#getActivitiesAsync) | **GET** /api/v2/ActivitiesService/ActivityFeeds/{activityFeedId}/Activities | Get activities |
| [**getActivitiesCountAsync**](ActivityFeedsApi.md#getActivitiesCountAsync) | **GET** /api/v2/ActivitiesService/ActivityFeeds/{activityFeedId}/Activities/Count | Count activities |
| [**getActivityAsync**](ActivityFeedsApi.md#getActivityAsync) | **GET** /api/v2/ActivitiesService/ActivityFeeds/{activityFeedId}/Activities/{activityId} | Get activity by ID |
| [**getActivityFeedAsync**](ActivityFeedsApi.md#getActivityFeedAsync) | **GET** /api/v2/ActivitiesService/ActivityFeeds/{activityFeedId} | Get activity feed by ID |
| [**getActivityFeedsAsync**](ActivityFeedsApi.md#getActivityFeedsAsync) | **GET** /api/v2/ActivitiesService/ActivityFeeds | Get activity feeds |
| [**getActivityFeedsCountAsync**](ActivityFeedsApi.md#getActivityFeedsCountAsync) | **GET** /api/v2/ActivitiesService/ActivityFeeds/Count | Count activity feeds |
| [**getActivityTypeByIdAsync**](ActivityFeedsApi.md#getActivityTypeByIdAsync) | **GET** /api/v2/ActivitiesService/ActivityTypes/{activityTypeId} | Get Activity Type |
| [**getActivityTypesAsync**](ActivityFeedsApi.md#getActivityTypesAsync) | **GET** /api/v2/ActivitiesService/ActivityTypes | Get Activity Types |
| [**patchActivityAsync**](ActivityFeedsApi.md#patchActivityAsync) | **PATCH** /api/v2/ActivitiesService/ActivityFeeds/{activityFeedId}/Activities/{activityId} | Patch an activity |
| [**patchActivityTypeAsync**](ActivityFeedsApi.md#patchActivityTypeAsync) | **PATCH** /api/v2/ActivitiesService/ActivityTypes/{activityTypeId} | Patch Activity Type |
| [**updateActivityAsync**](ActivityFeedsApi.md#updateActivityAsync) | **PUT** /api/v2/ActivitiesService/ActivityFeeds/{activityFeedId}/Activities/{activityId} | Update an activity |
| [**updateActivityTypeAsync**](ActivityFeedsApi.md#updateActivityTypeAsync) | **PUT** /api/v2/ActivitiesService/ActivityTypes/{activityTypeId} | Update Activity Type |


<a id="countActivityTypesAsync"></a>
# **countActivityTypesAsync**
> Int32Envelope countActivityTypesAsync(tenantId, apiVersion, xApiVersion)

Count Activity Types

Count activity types for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countActivityTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#countActivityTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#countActivityTypesAsync")
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

<a id="createActivityAsync"></a>
# **createActivityAsync**
> ActivityRecordDtoEnvelope createActivityAsync(activityFeedId, tenantId, apiVersion, xApiVersion, activityRecordCreateDto)

Create an activity

Creates a new activity in a specific activity feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val activityRecordCreateDto : ActivityRecordCreateDto =  // ActivityRecordCreateDto | 
try {
    val result : ActivityRecordDtoEnvelope = apiInstance.createActivityAsync(activityFeedId, tenantId, apiVersion, xApiVersion, activityRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#createActivityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#createActivityAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityFeedId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activityRecordCreateDto** | [**ActivityRecordCreateDto**](ActivityRecordCreateDto.md)|  | [optional] |

### Return type

[**ActivityRecordDtoEnvelope**](ActivityRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createActivityTypeAsync"></a>
# **createActivityTypeAsync**
> Envelope createActivityTypeAsync(tenantId, apiVersion, xApiVersion, activityTypeCreateDto)

Create Activity Type

Create a new activity type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val activityTypeCreateDto : ActivityTypeCreateDto =  // ActivityTypeCreateDto | 
try {
    val result : Envelope = apiInstance.createActivityTypeAsync(tenantId, apiVersion, xApiVersion, activityTypeCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#createActivityTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#createActivityTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activityTypeCreateDto** | [**ActivityTypeCreateDto**](ActivityTypeCreateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteActivityAsync"></a>
# **deleteActivityAsync**
> EmptyEnvelope deleteActivityAsync(activityFeedId, activityId, tenantId, apiVersion, xApiVersion)

Delete an activity

Deletes an activity from an activity feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val activityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteActivityAsync(activityFeedId, activityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#deleteActivityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#deleteActivityAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityFeedId** | **java.util.UUID**|  | |
| **activityId** | **java.util.UUID**|  | |
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

<a id="deleteActivityTypeAsync"></a>
# **deleteActivityTypeAsync**
> Envelope deleteActivityTypeAsync(activityTypeId, tenantId, apiVersion, xApiVersion)

Delete Activity Type

Delete an activity type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Envelope = apiInstance.deleteActivityTypeAsync(activityTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#deleteActivityTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#deleteActivityTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getActivitiesAsync"></a>
# **getActivitiesAsync**
> ActivityRecordDtoListEnvelope getActivitiesAsync(activityFeedId, tenantId, apiVersion, xApiVersion)

Get activities

Retrieves activities for a specific activity feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ActivityRecordDtoListEnvelope = apiInstance.getActivitiesAsync(activityFeedId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#getActivitiesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#getActivitiesAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityFeedId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ActivityRecordDtoListEnvelope**](ActivityRecordDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getActivitiesCountAsync"></a>
# **getActivitiesCountAsync**
> Int32Envelope getActivitiesCountAsync(activityFeedId, tenantId, apiVersion, xApiVersion)

Count activities

Returns the count of activities for a specific activity feed.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getActivitiesCountAsync(activityFeedId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#getActivitiesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#getActivitiesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityFeedId** | **java.util.UUID**|  | |
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

<a id="getActivityAsync"></a>
# **getActivityAsync**
> ActivityRecordDtoEnvelope getActivityAsync(activityFeedId, activityId, tenantId, apiVersion, xApiVersion)

Get activity by ID

Retrieves a specific activity by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val activityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ActivityRecordDtoEnvelope = apiInstance.getActivityAsync(activityFeedId, activityId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#getActivityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#getActivityAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityFeedId** | **java.util.UUID**|  | |
| **activityId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ActivityRecordDtoEnvelope**](ActivityRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getActivityFeedAsync"></a>
# **getActivityFeedAsync**
> ActivityFeedDtoEnvelope getActivityFeedAsync(activityFeedId, tenantId, apiVersion, xApiVersion)

Get activity feed by ID

Retrieves a specific activity feed by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ActivityFeedDtoEnvelope = apiInstance.getActivityFeedAsync(activityFeedId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#getActivityFeedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#getActivityFeedAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityFeedId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ActivityFeedDtoEnvelope**](ActivityFeedDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getActivityFeedsAsync"></a>
# **getActivityFeedsAsync**
> ActivityFeedDtoListEnvelope getActivityFeedsAsync(tenantId, apiVersion, xApiVersion)

Get activity feeds

Retrieves a list of activity feeds for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ActivityFeedDtoListEnvelope = apiInstance.getActivityFeedsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#getActivityFeedsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#getActivityFeedsAsync")
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

[**ActivityFeedDtoListEnvelope**](ActivityFeedDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getActivityFeedsCountAsync"></a>
# **getActivityFeedsCountAsync**
> Int32Envelope getActivityFeedsCountAsync(tenantId, apiVersion, xApiVersion)

Count activity feeds

Returns the count of activity feeds for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getActivityFeedsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#getActivityFeedsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#getActivityFeedsCountAsync")
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

<a id="getActivityTypeByIdAsync"></a>
# **getActivityTypeByIdAsync**
> ActivityTypeDtoEnvelope getActivityTypeByIdAsync(activityTypeId, tenantId, apiVersion, xApiVersion)

Get Activity Type

Get an activity type by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ActivityTypeDtoEnvelope = apiInstance.getActivityTypeByIdAsync(activityTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#getActivityTypeByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#getActivityTypeByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ActivityTypeDtoEnvelope**](ActivityTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getActivityTypesAsync"></a>
# **getActivityTypesAsync**
> ActivityTypeDtoListEnvelope getActivityTypesAsync(tenantId, apiVersion, xApiVersion)

Get Activity Types

Get a list of activity types for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ActivityTypeDtoListEnvelope = apiInstance.getActivityTypesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#getActivityTypesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#getActivityTypesAsync")
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

[**ActivityTypeDtoListEnvelope**](ActivityTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchActivityAsync"></a>
# **patchActivityAsync**
> EmptyEnvelope patchActivityAsync(activityFeedId, activityId, tenantId, apiVersion, xApiVersion, operation)

Patch an activity

Patch an activity

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val activityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchActivityAsync(activityFeedId, activityId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#patchActivityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#patchActivityAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityFeedId** | **java.util.UUID**|  | |
| **activityId** | **java.util.UUID**|  | |
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

<a id="patchActivityTypeAsync"></a>
# **patchActivityTypeAsync**
> EmptyEnvelope patchActivityTypeAsync(activityTypeId, tenantId, apiVersion, xApiVersion, operation)

Patch Activity Type

Patch an activity type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchActivityTypeAsync(activityTypeId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#patchActivityTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#patchActivityTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityTypeId** | **java.util.UUID**|  | |
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

<a id="updateActivityAsync"></a>
# **updateActivityAsync**
> ActivityRecordDtoEnvelope updateActivityAsync(activityFeedId, activityId, tenantId, apiVersion, xApiVersion, activityRecordUpdateDto)

Update an activity

Updates an existing activity.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityFeedId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val activityId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val activityRecordUpdateDto : ActivityRecordUpdateDto =  // ActivityRecordUpdateDto | 
try {
    val result : ActivityRecordDtoEnvelope = apiInstance.updateActivityAsync(activityFeedId, activityId, tenantId, apiVersion, xApiVersion, activityRecordUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#updateActivityAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#updateActivityAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityFeedId** | **java.util.UUID**|  | |
| **activityId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activityRecordUpdateDto** | [**ActivityRecordUpdateDto**](ActivityRecordUpdateDto.md)|  | [optional] |

### Return type

[**ActivityRecordDtoEnvelope**](ActivityRecordDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateActivityTypeAsync"></a>
# **updateActivityTypeAsync**
> Envelope updateActivityTypeAsync(activityTypeId, tenantId, apiVersion, xApiVersion, activityTypeUpdateDto)

Update Activity Type

Update an existing activity type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityFeedsApi()
val activityTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val activityTypeUpdateDto : ActivityTypeUpdateDto =  // ActivityTypeUpdateDto | 
try {
    val result : Envelope = apiInstance.updateActivityTypeAsync(activityTypeId, tenantId, apiVersion, xApiVersion, activityTypeUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityFeedsApi#updateActivityTypeAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityFeedsApi#updateActivityTypeAsync")
    e.printStackTrace()
}
```

### Parameters
| **activityTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **activityTypeUpdateDto** | [**ActivityTypeUpdateDto**](ActivityTypeUpdateDto.md)|  | [optional] |

### Return type

[**Envelope**](Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

