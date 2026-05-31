# MaintenanceVisitsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createMaintenanceVisitAsync**](MaintenanceVisitsApi.md#createMaintenanceVisitAsync) | **POST** /api/v2/SupportService/MaintenanceVisits | Create a maintenance visit |
| [**deleteMaintenanceVisitAsync**](MaintenanceVisitsApi.md#deleteMaintenanceVisitAsync) | **DELETE** /api/v2/SupportService/MaintenanceVisits/{maintenanceVisitId} | Delete a maintenance visit |
| [**getMaintenanceVisitAsync**](MaintenanceVisitsApi.md#getMaintenanceVisitAsync) | **GET** /api/v2/SupportService/MaintenanceVisits/{maintenanceVisitId} | Retrieve a maintenance visit by ID |
| [**getMaintenanceVisitsAsync**](MaintenanceVisitsApi.md#getMaintenanceVisitsAsync) | **GET** /api/v2/SupportService/MaintenanceVisits | Retrieve maintenance visits |
| [**getMaintenanceVisitsCountAsync**](MaintenanceVisitsApi.md#getMaintenanceVisitsCountAsync) | **GET** /api/v2/SupportService/MaintenanceVisits/Count | Get maintenance visits count |
| [**updateMaintenanceVisitAsync**](MaintenanceVisitsApi.md#updateMaintenanceVisitAsync) | **PUT** /api/v2/SupportService/MaintenanceVisits/{maintenanceVisitId} | Update a maintenance visit |


<a id="createMaintenanceVisitAsync"></a>
# **createMaintenanceVisitAsync**
> EmptyEnvelope createMaintenanceVisitAsync(tenantId, apiVersion, xApiVersion, maintenanceVisitCreateDto)

Create a maintenance visit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MaintenanceVisitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val maintenanceVisitCreateDto : MaintenanceVisitCreateDto =  // MaintenanceVisitCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createMaintenanceVisitAsync(tenantId, apiVersion, xApiVersion, maintenanceVisitCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MaintenanceVisitsApi#createMaintenanceVisitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MaintenanceVisitsApi#createMaintenanceVisitAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **maintenanceVisitCreateDto** | [**MaintenanceVisitCreateDto**](MaintenanceVisitCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteMaintenanceVisitAsync"></a>
# **deleteMaintenanceVisitAsync**
> EmptyEnvelope deleteMaintenanceVisitAsync(maintenanceVisitId, tenantId, apiVersion, xApiVersion)

Delete a maintenance visit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MaintenanceVisitsApi()
val maintenanceVisitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteMaintenanceVisitAsync(maintenanceVisitId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MaintenanceVisitsApi#deleteMaintenanceVisitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MaintenanceVisitsApi#deleteMaintenanceVisitAsync")
    e.printStackTrace()
}
```

### Parameters
| **maintenanceVisitId** | **java.util.UUID**|  | |
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

<a id="getMaintenanceVisitAsync"></a>
# **getMaintenanceVisitAsync**
> MaintenanceVisitDtoEnvelope getMaintenanceVisitAsync(maintenanceVisitId, tenantId, apiVersion, xApiVersion)

Retrieve a maintenance visit by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MaintenanceVisitsApi()
val maintenanceVisitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MaintenanceVisitDtoEnvelope = apiInstance.getMaintenanceVisitAsync(maintenanceVisitId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MaintenanceVisitsApi#getMaintenanceVisitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MaintenanceVisitsApi#getMaintenanceVisitAsync")
    e.printStackTrace()
}
```

### Parameters
| **maintenanceVisitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MaintenanceVisitDtoEnvelope**](MaintenanceVisitDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMaintenanceVisitsAsync"></a>
# **getMaintenanceVisitsAsync**
> MaintenanceVisitDtoListEnvelope getMaintenanceVisitsAsync(tenantId, apiVersion, xApiVersion)

Retrieve maintenance visits

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MaintenanceVisitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MaintenanceVisitDtoListEnvelope = apiInstance.getMaintenanceVisitsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MaintenanceVisitsApi#getMaintenanceVisitsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MaintenanceVisitsApi#getMaintenanceVisitsAsync")
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

[**MaintenanceVisitDtoListEnvelope**](MaintenanceVisitDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMaintenanceVisitsCountAsync"></a>
# **getMaintenanceVisitsCountAsync**
> Int32Envelope getMaintenanceVisitsCountAsync(tenantId, apiVersion, xApiVersion)

Get maintenance visits count

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MaintenanceVisitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getMaintenanceVisitsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MaintenanceVisitsApi#getMaintenanceVisitsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MaintenanceVisitsApi#getMaintenanceVisitsCountAsync")
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

<a id="updateMaintenanceVisitAsync"></a>
# **updateMaintenanceVisitAsync**
> EmptyEnvelope updateMaintenanceVisitAsync(maintenanceVisitId, tenantId, apiVersion, xApiVersion, body)

Update a maintenance visit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MaintenanceVisitsApi()
val maintenanceVisitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val body : kotlin.Any = Object // kotlin.Any | 
try {
    val result : EmptyEnvelope = apiInstance.updateMaintenanceVisitAsync(maintenanceVisitId, tenantId, apiVersion, xApiVersion, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MaintenanceVisitsApi#updateMaintenanceVisitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MaintenanceVisitsApi#updateMaintenanceVisitAsync")
    e.printStackTrace()
}
```

### Parameters
| **maintenanceVisitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

