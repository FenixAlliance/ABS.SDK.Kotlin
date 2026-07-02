# BusinessRelationshipsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getBusinessRelationshipsCountAsync**](BusinessRelationshipsApi.md#getBusinessRelationshipsCountAsync) | **GET** /api/v2/TenantsService/BusinessRelationships/Count | Get business relationships count |


<a id="getBusinessRelationshipsCountAsync"></a>
# **getBusinessRelationshipsCountAsync**
> Int32Envelope getBusinessRelationshipsCountAsync(tenantId, apiVersion, xApiVersion)

Get business relationships count

Returns the count of child business relationships owned by the specified parent tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessRelationshipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBusinessRelationshipsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessRelationshipsApi#getBusinessRelationshipsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessRelationshipsApi#getBusinessRelationshipsCountAsync")
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

