# SeawayBillsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addSeawayBillLineAsync**](SeawayBillsApi.md#addSeawayBillLineAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/Lines | Add a line to seaway bill |
| [**cancelSeawayBillAsync**](SeawayBillsApi.md#cancelSeawayBillAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/Cancel | Cancel a seaway bill |
| [**createSeawayBillAsync**](SeawayBillsApi.md#createSeawayBillAsync) | **POST** /api/v2/LogisticsService/SeawayBills | Create a seaway bill |
| [**deleteSeawayBillAsync**](SeawayBillsApi.md#deleteSeawayBillAsync) | **DELETE** /api/v2/LogisticsService/SeawayBills/{billId} | Delete a seaway bill |
| [**getSeawayBillByIdAsync**](SeawayBillsApi.md#getSeawayBillByIdAsync) | **GET** /api/v2/LogisticsService/SeawayBills/{billId} | Get seaway bill by ID |
| [**getSeawayBillLinesAsync**](SeawayBillsApi.md#getSeawayBillLinesAsync) | **GET** /api/v2/LogisticsService/SeawayBills/{billId}/Lines | Get seaway bill lines |
| [**getSeawayBillLinesCountAsync**](SeawayBillsApi.md#getSeawayBillLinesCountAsync) | **GET** /api/v2/LogisticsService/SeawayBills/{billId}/Lines/Count | Get seaway bill lines count |
| [**getSeawayBillsAsync**](SeawayBillsApi.md#getSeawayBillsAsync) | **GET** /api/v2/LogisticsService/SeawayBills | Get all seaway bills |
| [**getSeawayBillsCountAsync**](SeawayBillsApi.md#getSeawayBillsCountAsync) | **GET** /api/v2/LogisticsService/SeawayBills/Count | Get seaway bills count |
| [**issueSeawayBillAsync**](SeawayBillsApi.md#issueSeawayBillAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/Issue | Issue a seaway bill |
| [**markSeawayBillArrivedAsync**](SeawayBillsApi.md#markSeawayBillArrivedAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/MarkArrived | Mark seaway bill arrived |
| [**markSeawayBillInTransitAsync**](SeawayBillsApi.md#markSeawayBillInTransitAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/MarkInTransit | Mark seaway bill in transit |
| [**releaseSeawayBillAsync**](SeawayBillsApi.md#releaseSeawayBillAsync) | **POST** /api/v2/LogisticsService/SeawayBills/{billId}/Release | Release a seaway bill |
| [**removeSeawayBillLineAsync**](SeawayBillsApi.md#removeSeawayBillLineAsync) | **DELETE** /api/v2/LogisticsService/SeawayBills/{billId}/Lines/{lineId} | Remove a seaway bill line |
| [**updateSeawayBillAsync**](SeawayBillsApi.md#updateSeawayBillAsync) | **PUT** /api/v2/LogisticsService/SeawayBills/{billId} | Update a seaway bill |
| [**updateSeawayBillLineAsync**](SeawayBillsApi.md#updateSeawayBillLineAsync) | **PUT** /api/v2/LogisticsService/SeawayBills/{billId}/Lines/{lineId} | Update a seaway bill line |


<a id="addSeawayBillLineAsync"></a>
# **addSeawayBillLineAsync**
> EmptyEnvelope addSeawayBillLineAsync(billId, tenantId, apiVersion, xApiVersion, waybillLineCreateDto)

Add a line to seaway bill

Adds a new line to a seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineCreateDto : WaybillLineCreateDto =  // WaybillLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.addSeawayBillLineAsync(billId, tenantId, apiVersion, xApiVersion, waybillLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#addSeawayBillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#addSeawayBillLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **waybillLineCreateDto** | [**WaybillLineCreateDto**](WaybillLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="cancelSeawayBillAsync"></a>
# **cancelSeawayBillAsync**
> EmptyEnvelope cancelSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion)

Cancel a seaway bill

Cancels a seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.cancelSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#cancelSeawayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#cancelSeawayBillAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
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

<a id="createSeawayBillAsync"></a>
# **createSeawayBillAsync**
> EmptyEnvelope createSeawayBillAsync(tenantId, apiVersion, xApiVersion, seawayBillCreateDto)

Create a seaway bill

Creates a new seaway bill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val seawayBillCreateDto : SeawayBillCreateDto =  // SeawayBillCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSeawayBillAsync(tenantId, apiVersion, xApiVersion, seawayBillCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#createSeawayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#createSeawayBillAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **seawayBillCreateDto** | [**SeawayBillCreateDto**](SeawayBillCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSeawayBillAsync"></a>
# **deleteSeawayBillAsync**
> EmptyEnvelope deleteSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion)

Delete a seaway bill

Deletes a seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#deleteSeawayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#deleteSeawayBillAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
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

<a id="getSeawayBillByIdAsync"></a>
# **getSeawayBillByIdAsync**
> SeawayBillDtoEnvelope getSeawayBillByIdAsync(billId, tenantId, apiVersion, xApiVersion)

Get seaway bill by ID

Retrieves a specific seaway bill by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SeawayBillDtoEnvelope = apiInstance.getSeawayBillByIdAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#getSeawayBillByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#getSeawayBillByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SeawayBillDtoEnvelope**](SeawayBillDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSeawayBillLinesAsync"></a>
# **getSeawayBillLinesAsync**
> WaybillLineDtoListEnvelope getSeawayBillLinesAsync(billId, tenantId, apiVersion, xApiVersion)

Get seaway bill lines

Retrieves all lines for a specific seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WaybillLineDtoListEnvelope = apiInstance.getSeawayBillLinesAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#getSeawayBillLinesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#getSeawayBillLinesAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**WaybillLineDtoListEnvelope**](WaybillLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSeawayBillLinesCountAsync"></a>
# **getSeawayBillLinesCountAsync**
> Int32Envelope getSeawayBillLinesCountAsync(billId, tenantId, apiVersion, xApiVersion)

Get seaway bill lines count

Returns the count of lines for a specific seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSeawayBillLinesCountAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#getSeawayBillLinesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#getSeawayBillLinesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
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

<a id="getSeawayBillsAsync"></a>
# **getSeawayBillsAsync**
> SeawayBillDtoListEnvelope getSeawayBillsAsync(tenantId, apiVersion, xApiVersion)

Get all seaway bills

Retrieves all seaway bills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SeawayBillDtoListEnvelope = apiInstance.getSeawayBillsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#getSeawayBillsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#getSeawayBillsAsync")
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

[**SeawayBillDtoListEnvelope**](SeawayBillDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSeawayBillsCountAsync"></a>
# **getSeawayBillsCountAsync**
> Int32Envelope getSeawayBillsCountAsync(tenantId, apiVersion, xApiVersion)

Get seaway bills count

Returns the count of seaway bills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSeawayBillsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#getSeawayBillsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#getSeawayBillsCountAsync")
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

<a id="issueSeawayBillAsync"></a>
# **issueSeawayBillAsync**
> EmptyEnvelope issueSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion)

Issue a seaway bill

Issues a seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.issueSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#issueSeawayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#issueSeawayBillAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
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

<a id="markSeawayBillArrivedAsync"></a>
# **markSeawayBillArrivedAsync**
> EmptyEnvelope markSeawayBillArrivedAsync(billId, tenantId, apiVersion, xApiVersion)

Mark seaway bill arrived

Marks a seaway bill as arrived.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markSeawayBillArrivedAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#markSeawayBillArrivedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#markSeawayBillArrivedAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
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

<a id="markSeawayBillInTransitAsync"></a>
# **markSeawayBillInTransitAsync**
> EmptyEnvelope markSeawayBillInTransitAsync(billId, tenantId, apiVersion, xApiVersion)

Mark seaway bill in transit

Marks a seaway bill as in transit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markSeawayBillInTransitAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#markSeawayBillInTransitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#markSeawayBillInTransitAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
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

<a id="releaseSeawayBillAsync"></a>
# **releaseSeawayBillAsync**
> EmptyEnvelope releaseSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion)

Release a seaway bill

Releases a seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.releaseSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#releaseSeawayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#releaseSeawayBillAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
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

<a id="removeSeawayBillLineAsync"></a>
# **removeSeawayBillLineAsync**
> EmptyEnvelope removeSeawayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion)

Remove a seaway bill line

Removes a line from a seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.removeSeawayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#removeSeawayBillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#removeSeawayBillLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
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

<a id="updateSeawayBillAsync"></a>
# **updateSeawayBillAsync**
> EmptyEnvelope updateSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion, seawayBillUpdateDto)

Update a seaway bill

Updates an existing seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val seawayBillUpdateDto : SeawayBillUpdateDto =  // SeawayBillUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSeawayBillAsync(billId, tenantId, apiVersion, xApiVersion, seawayBillUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#updateSeawayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#updateSeawayBillAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **seawayBillUpdateDto** | [**SeawayBillUpdateDto**](SeawayBillUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateSeawayBillLineAsync"></a>
# **updateSeawayBillLineAsync**
> EmptyEnvelope updateSeawayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion, waybillLineUpdateDto)

Update a seaway bill line

Updates an existing line on a seaway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SeawayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineUpdateDto : WaybillLineUpdateDto =  // WaybillLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSeawayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion, waybillLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SeawayBillsApi#updateSeawayBillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SeawayBillsApi#updateSeawayBillLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **billId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **waybillLineUpdateDto** | [**WaybillLineUpdateDto**](WaybillLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

