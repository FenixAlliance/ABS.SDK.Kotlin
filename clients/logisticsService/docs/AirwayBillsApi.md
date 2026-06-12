# AirwayBillsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addAirwayBillLineAsync**](AirwayBillsApi.md#addAirwayBillLineAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/Lines | Add a line to airway bill |
| [**cancelAirwayBillAsync**](AirwayBillsApi.md#cancelAirwayBillAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/Cancel | Cancel an airway bill |
| [**createAirwayBillAsync**](AirwayBillsApi.md#createAirwayBillAsync) | **POST** /api/v2/LogisticsService/AirwayBills | Create an airway bill |
| [**deleteAirwayBillAsync**](AirwayBillsApi.md#deleteAirwayBillAsync) | **DELETE** /api/v2/LogisticsService/AirwayBills/{billId} | Delete an airway bill |
| [**getAirwayBillByIdAsync**](AirwayBillsApi.md#getAirwayBillByIdAsync) | **GET** /api/v2/LogisticsService/AirwayBills/{billId} | Get airway bill by ID |
| [**getAirwayBillLinesAsync**](AirwayBillsApi.md#getAirwayBillLinesAsync) | **GET** /api/v2/LogisticsService/AirwayBills/{billId}/Lines | Get airway bill lines |
| [**getAirwayBillLinesCountAsync**](AirwayBillsApi.md#getAirwayBillLinesCountAsync) | **GET** /api/v2/LogisticsService/AirwayBills/{billId}/Lines/Count | Get airway bill lines count |
| [**getAirwayBillsAsync**](AirwayBillsApi.md#getAirwayBillsAsync) | **GET** /api/v2/LogisticsService/AirwayBills | Get all airway bills |
| [**getAirwayBillsCountAsync**](AirwayBillsApi.md#getAirwayBillsCountAsync) | **GET** /api/v2/LogisticsService/AirwayBills/Count | Get airway bills count |
| [**issueAirwayBillAsync**](AirwayBillsApi.md#issueAirwayBillAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/Issue | Issue an airway bill |
| [**markAirwayBillArrivedAsync**](AirwayBillsApi.md#markAirwayBillArrivedAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/MarkArrived | Mark airway bill arrived |
| [**markAirwayBillDeliveredAsync**](AirwayBillsApi.md#markAirwayBillDeliveredAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/MarkDelivered | Mark airway bill delivered |
| [**markAirwayBillInTransitAsync**](AirwayBillsApi.md#markAirwayBillInTransitAsync) | **POST** /api/v2/LogisticsService/AirwayBills/{billId}/MarkInTransit | Mark airway bill in transit |
| [**patchAirwayBillAsync**](AirwayBillsApi.md#patchAirwayBillAsync) | **PATCH** /api/v2/LogisticsService/AirwayBills/{billId} | Patch an airway bill |
| [**patchAirwayBillLineAsync**](AirwayBillsApi.md#patchAirwayBillLineAsync) | **PATCH** /api/v2/LogisticsService/AirwayBills/{billId}/Lines/{lineId} | Patch an airway bill line |
| [**removeAirwayBillLineAsync**](AirwayBillsApi.md#removeAirwayBillLineAsync) | **DELETE** /api/v2/LogisticsService/AirwayBills/{billId}/Lines/{lineId} | Remove an airway bill line |
| [**updateAirwayBillAsync**](AirwayBillsApi.md#updateAirwayBillAsync) | **PUT** /api/v2/LogisticsService/AirwayBills/{billId} | Update an airway bill |
| [**updateAirwayBillLineAsync**](AirwayBillsApi.md#updateAirwayBillLineAsync) | **PUT** /api/v2/LogisticsService/AirwayBills/{billId}/Lines/{lineId} | Update an airway bill line |


<a id="addAirwayBillLineAsync"></a>
# **addAirwayBillLineAsync**
> EmptyEnvelope addAirwayBillLineAsync(billId, tenantId, apiVersion, xApiVersion, waybillLineCreateDto)

Add a line to airway bill

Adds a new line to an airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineCreateDto : WaybillLineCreateDto =  // WaybillLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.addAirwayBillLineAsync(billId, tenantId, apiVersion, xApiVersion, waybillLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#addAirwayBillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#addAirwayBillLineAsync")
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

<a id="cancelAirwayBillAsync"></a>
# **cancelAirwayBillAsync**
> EmptyEnvelope cancelAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion)

Cancel an airway bill

Cancels an airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.cancelAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#cancelAirwayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#cancelAirwayBillAsync")
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

<a id="createAirwayBillAsync"></a>
# **createAirwayBillAsync**
> EmptyEnvelope createAirwayBillAsync(tenantId, apiVersion, xApiVersion, airwayBillCreateDto)

Create an airway bill

Creates a new airway bill for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val airwayBillCreateDto : AirwayBillCreateDto =  // AirwayBillCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createAirwayBillAsync(tenantId, apiVersion, xApiVersion, airwayBillCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#createAirwayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#createAirwayBillAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **airwayBillCreateDto** | [**AirwayBillCreateDto**](AirwayBillCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteAirwayBillAsync"></a>
# **deleteAirwayBillAsync**
> EmptyEnvelope deleteAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion)

Delete an airway bill

Deletes an airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#deleteAirwayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#deleteAirwayBillAsync")
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

<a id="getAirwayBillByIdAsync"></a>
# **getAirwayBillByIdAsync**
> AirwayBillDtoEnvelope getAirwayBillByIdAsync(billId, tenantId, apiVersion, xApiVersion)

Get airway bill by ID

Retrieves a specific airway bill by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AirwayBillDtoEnvelope = apiInstance.getAirwayBillByIdAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#getAirwayBillByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#getAirwayBillByIdAsync")
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

[**AirwayBillDtoEnvelope**](AirwayBillDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAirwayBillLinesAsync"></a>
# **getAirwayBillLinesAsync**
> WaybillLineDtoListEnvelope getAirwayBillLinesAsync(billId, tenantId, apiVersion, xApiVersion)

Get airway bill lines

Retrieves all lines for a specific airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : WaybillLineDtoListEnvelope = apiInstance.getAirwayBillLinesAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#getAirwayBillLinesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#getAirwayBillLinesAsync")
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

<a id="getAirwayBillLinesCountAsync"></a>
# **getAirwayBillLinesCountAsync**
> Int32Envelope getAirwayBillLinesCountAsync(billId, tenantId, apiVersion, xApiVersion)

Get airway bill lines count

Returns the count of lines for a specific airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAirwayBillLinesCountAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#getAirwayBillLinesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#getAirwayBillLinesCountAsync")
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

<a id="getAirwayBillsAsync"></a>
# **getAirwayBillsAsync**
> AirwayBillDtoListEnvelope getAirwayBillsAsync(tenantId, apiVersion, xApiVersion)

Get all airway bills

Retrieves all airway bills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : AirwayBillDtoListEnvelope = apiInstance.getAirwayBillsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#getAirwayBillsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#getAirwayBillsAsync")
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

[**AirwayBillDtoListEnvelope**](AirwayBillDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getAirwayBillsCountAsync"></a>
# **getAirwayBillsCountAsync**
> Int32Envelope getAirwayBillsCountAsync(tenantId, apiVersion, xApiVersion)

Get airway bills count

Returns the count of airway bills for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getAirwayBillsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#getAirwayBillsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#getAirwayBillsCountAsync")
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

<a id="issueAirwayBillAsync"></a>
# **issueAirwayBillAsync**
> EmptyEnvelope issueAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion)

Issue an airway bill

Issues an airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.issueAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#issueAirwayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#issueAirwayBillAsync")
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

<a id="markAirwayBillArrivedAsync"></a>
# **markAirwayBillArrivedAsync**
> EmptyEnvelope markAirwayBillArrivedAsync(billId, tenantId, apiVersion, xApiVersion)

Mark airway bill arrived

Marks an airway bill as arrived.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markAirwayBillArrivedAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#markAirwayBillArrivedAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#markAirwayBillArrivedAsync")
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

<a id="markAirwayBillDeliveredAsync"></a>
# **markAirwayBillDeliveredAsync**
> EmptyEnvelope markAirwayBillDeliveredAsync(billId, tenantId, apiVersion, xApiVersion)

Mark airway bill delivered

Marks an airway bill as delivered.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markAirwayBillDeliveredAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#markAirwayBillDeliveredAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#markAirwayBillDeliveredAsync")
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

<a id="markAirwayBillInTransitAsync"></a>
# **markAirwayBillInTransitAsync**
> EmptyEnvelope markAirwayBillInTransitAsync(billId, tenantId, apiVersion, xApiVersion)

Mark airway bill in transit

Marks an airway bill as in transit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.markAirwayBillInTransitAsync(billId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#markAirwayBillInTransitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#markAirwayBillInTransitAsync")
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

<a id="patchAirwayBillAsync"></a>
# **patchAirwayBillAsync**
> EmptyEnvelope patchAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion, operation)

Patch an airway bill

Partially updates an existing airway bill using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#patchAirwayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#patchAirwayBillAsync")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchAirwayBillLineAsync"></a>
# **patchAirwayBillLineAsync**
> EmptyEnvelope patchAirwayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion, operation)

Patch an airway bill line

Partially updates a line on an airway bill using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchAirwayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#patchAirwayBillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#patchAirwayBillLineAsync")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="removeAirwayBillLineAsync"></a>
# **removeAirwayBillLineAsync**
> EmptyEnvelope removeAirwayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion)

Remove an airway bill line

Removes a line from an airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.removeAirwayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#removeAirwayBillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#removeAirwayBillLineAsync")
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

<a id="updateAirwayBillAsync"></a>
# **updateAirwayBillAsync**
> EmptyEnvelope updateAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion, airwayBillUpdateDto)

Update an airway bill

Updates an existing airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val airwayBillUpdateDto : AirwayBillUpdateDto =  // AirwayBillUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAirwayBillAsync(billId, tenantId, apiVersion, xApiVersion, airwayBillUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#updateAirwayBillAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#updateAirwayBillAsync")
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
| **airwayBillUpdateDto** | [**AirwayBillUpdateDto**](AirwayBillUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateAirwayBillLineAsync"></a>
# **updateAirwayBillLineAsync**
> EmptyEnvelope updateAirwayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion, waybillLineUpdateDto)

Update an airway bill line

Updates an existing line on an airway bill.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AirwayBillsApi()
val billId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val waybillLineUpdateDto : WaybillLineUpdateDto =  // WaybillLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateAirwayBillLineAsync(billId, lineId, tenantId, apiVersion, xApiVersion, waybillLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AirwayBillsApi#updateAirwayBillLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AirwayBillsApi#updateAirwayBillLineAsync")
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

