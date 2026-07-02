# ActivityRecordsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getActivityRecordsCountAsync**](ActivityRecordsApi.md#getActivityRecordsCountAsync) | **GET** /api/v2/ActivitiesService/ActivityRecords/Count | Count activity records |


<a id="getActivityRecordsCountAsync"></a>
# **getActivityRecordsCountAsync**
> Int32Envelope getActivityRecordsCountAsync(tenantId, apiVersion, xApiVersion)

Count activity records

Returns the tenant-wide count of activity records across all feeds owned by the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ActivityRecordsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getActivityRecordsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ActivityRecordsApi#getActivityRecordsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ActivityRecordsApi#getActivityRecordsCountAsync")
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

