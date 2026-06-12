# BillsOfLadingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBillOfLadingAsync**](BillsOfLadingApi.md#createBillOfLadingAsync) | **POST** /api/v2/ShipmentsService/BillsOfLading | Create a bill of lading |
| [**createBillOfLadingLineAsync**](BillsOfLadingApi.md#createBillOfLadingLineAsync) | **POST** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines | Create a bill of lading line |
| [**deleteBillOfLadingAsync**](BillsOfLadingApi.md#deleteBillOfLadingAsync) | **DELETE** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId} | Delete a bill of lading |
| [**deleteBillOfLadingLineAsync**](BillsOfLadingApi.md#deleteBillOfLadingLineAsync) | **DELETE** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/{lineId} | Delete a bill of lading line |
| [**getBillOfLadingByIdAsync**](BillsOfLadingApi.md#getBillOfLadingByIdAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId} | Get bill of lading by ID |
| [**getBillOfLadingLineByIdAsync**](BillsOfLadingApi.md#getBillOfLadingLineByIdAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/{lineId} | Get bill of lading line by ID |
| [**getBillOfLadingLinesAsync**](BillsOfLadingApi.md#getBillOfLadingLinesAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines | Get bill of lading lines |
| [**getBillOfLadingLinesCountAsync**](BillsOfLadingApi.md#getBillOfLadingLinesCountAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/Count | Get bill of lading lines count |
| [**getBillsOfLadingAsync**](BillsOfLadingApi.md#getBillsOfLadingAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading | Get all bills of lading |
| [**getBillsOfLadingCountAsync**](BillsOfLadingApi.md#getBillsOfLadingCountAsync) | **GET** /api/v2/ShipmentsService/BillsOfLading/Count | Get bills of lading count |
| [**patchBillOfLadingAsync**](BillsOfLadingApi.md#patchBillOfLadingAsync) | **PATCH** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId} | Patch a bill of lading |
| [**patchBillOfLadingLineAsync**](BillsOfLadingApi.md#patchBillOfLadingLineAsync) | **PATCH** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/{lineId} | Patch a bill of lading line |
| [**updateBillOfLadingAsync**](BillsOfLadingApi.md#updateBillOfLadingAsync) | **PUT** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId} | Update a bill of lading |
| [**updateBillOfLadingLineAsync**](BillsOfLadingApi.md#updateBillOfLadingLineAsync) | **PUT** /api/v2/ShipmentsService/BillsOfLading/{billOfLadingId}/Lines/{lineId} | Update a bill of lading line |


<a id="createBillOfLadingAsync"></a>
# **createBillOfLadingAsync**
> EmptyEnvelope createBillOfLadingAsync(tenantId, apiVersion, xApiVersion, billOfLadingCreateDto)

Create a bill of lading

Creates a new bill of lading for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val billOfLadingCreateDto : BillOfLadingCreateDto =  // BillOfLadingCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createBillOfLadingAsync(tenantId, apiVersion, xApiVersion, billOfLadingCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#createBillOfLadingAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#createBillOfLadingAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **billOfLadingCreateDto** | [**BillOfLadingCreateDto**](BillOfLadingCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createBillOfLadingLineAsync"></a>
# **createBillOfLadingLineAsync**
> EmptyEnvelope createBillOfLadingLineAsync(billOfLadingId, tenantId, apiVersion, xApiVersion, billOfLadingLineCreateDto)

Create a bill of lading line

Creates a new line for a bill of lading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val billOfLadingLineCreateDto : BillOfLadingLineCreateDto =  // BillOfLadingLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createBillOfLadingLineAsync(billOfLadingId, tenantId, apiVersion, xApiVersion, billOfLadingLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#createBillOfLadingLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#createBillOfLadingLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **billOfLadingLineCreateDto** | [**BillOfLadingLineCreateDto**](BillOfLadingLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteBillOfLadingAsync"></a>
# **deleteBillOfLadingAsync**
> EmptyEnvelope deleteBillOfLadingAsync(billOfLadingId, tenantId, apiVersion, xApiVersion)

Delete a bill of lading

Deletes a bill of lading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBillOfLadingAsync(billOfLadingId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#deleteBillOfLadingAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#deleteBillOfLadingAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
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

<a id="deleteBillOfLadingLineAsync"></a>
# **deleteBillOfLadingLineAsync**
> EmptyEnvelope deleteBillOfLadingLineAsync(billOfLadingId, lineId, tenantId, apiVersion, xApiVersion)

Delete a bill of lading line

Deletes a line from a bill of lading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBillOfLadingLineAsync(billOfLadingId, lineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#deleteBillOfLadingLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#deleteBillOfLadingLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
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

<a id="getBillOfLadingByIdAsync"></a>
# **getBillOfLadingByIdAsync**
> BillOfLadingDtoEnvelope getBillOfLadingByIdAsync(billOfLadingId, tenantId, apiVersion, xApiVersion)

Get bill of lading by ID

Retrieves a specific bill of lading by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BillOfLadingDtoEnvelope = apiInstance.getBillOfLadingByIdAsync(billOfLadingId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#getBillOfLadingByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#getBillOfLadingByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BillOfLadingDtoEnvelope**](BillOfLadingDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBillOfLadingLineByIdAsync"></a>
# **getBillOfLadingLineByIdAsync**
> BillOfLadingLineDtoEnvelope getBillOfLadingLineByIdAsync(billOfLadingId, lineId, tenantId, apiVersion, xApiVersion)

Get bill of lading line by ID

Retrieves a specific line from a bill of lading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BillOfLadingLineDtoEnvelope = apiInstance.getBillOfLadingLineByIdAsync(billOfLadingId, lineId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#getBillOfLadingLineByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#getBillOfLadingLineByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BillOfLadingLineDtoEnvelope**](BillOfLadingLineDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBillOfLadingLinesAsync"></a>
# **getBillOfLadingLinesAsync**
> BillOfLadingLineDtoListEnvelope getBillOfLadingLinesAsync(billOfLadingId, tenantId, apiVersion, xApiVersion)

Get bill of lading lines

Retrieves all lines for a specific bill of lading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BillOfLadingLineDtoListEnvelope = apiInstance.getBillOfLadingLinesAsync(billOfLadingId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#getBillOfLadingLinesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#getBillOfLadingLinesAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BillOfLadingLineDtoListEnvelope**](BillOfLadingLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBillOfLadingLinesCountAsync"></a>
# **getBillOfLadingLinesCountAsync**
> Int32Envelope getBillOfLadingLinesCountAsync(billOfLadingId, tenantId, apiVersion, xApiVersion)

Get bill of lading lines count

Returns the count of lines for a specific bill of lading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBillOfLadingLinesCountAsync(billOfLadingId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#getBillOfLadingLinesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#getBillOfLadingLinesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
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

<a id="getBillsOfLadingAsync"></a>
# **getBillsOfLadingAsync**
> BillOfLadingDtoListEnvelope getBillsOfLadingAsync(tenantId, apiVersion, xApiVersion)

Get all bills of lading

Retrieves all bills of lading for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BillOfLadingDtoListEnvelope = apiInstance.getBillsOfLadingAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#getBillsOfLadingAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#getBillsOfLadingAsync")
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

[**BillOfLadingDtoListEnvelope**](BillOfLadingDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBillsOfLadingCountAsync"></a>
# **getBillsOfLadingCountAsync**
> Int32Envelope getBillsOfLadingCountAsync(tenantId, apiVersion, xApiVersion)

Get bills of lading count

Returns the count of bills of lading for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBillsOfLadingCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#getBillsOfLadingCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#getBillsOfLadingCountAsync")
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

<a id="patchBillOfLadingAsync"></a>
# **patchBillOfLadingAsync**
> EmptyEnvelope patchBillOfLadingAsync(billOfLadingId, tenantId, apiVersion, xApiVersion, operation)

Patch a bill of lading

Partially updates an existing bill of lading using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchBillOfLadingAsync(billOfLadingId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#patchBillOfLadingAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#patchBillOfLadingAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
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

<a id="patchBillOfLadingLineAsync"></a>
# **patchBillOfLadingLineAsync**
> EmptyEnvelope patchBillOfLadingLineAsync(billOfLadingId, lineId, tenantId, apiVersion, xApiVersion, operation)

Patch a bill of lading line

Partially updates an existing line on a bill of lading using JSON Patch.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchBillOfLadingLineAsync(billOfLadingId, lineId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#patchBillOfLadingLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#patchBillOfLadingLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
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

<a id="updateBillOfLadingAsync"></a>
# **updateBillOfLadingAsync**
> EmptyEnvelope updateBillOfLadingAsync(billOfLadingId, tenantId, apiVersion, xApiVersion, billOfLadingUpdateDto)

Update a bill of lading

Updates an existing bill of lading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val billOfLadingUpdateDto : BillOfLadingUpdateDto =  // BillOfLadingUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateBillOfLadingAsync(billOfLadingId, tenantId, apiVersion, xApiVersion, billOfLadingUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#updateBillOfLadingAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#updateBillOfLadingAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **billOfLadingUpdateDto** | [**BillOfLadingUpdateDto**](BillOfLadingUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBillOfLadingLineAsync"></a>
# **updateBillOfLadingLineAsync**
> EmptyEnvelope updateBillOfLadingLineAsync(billOfLadingId, lineId, tenantId, apiVersion, xApiVersion, billOfLadingLineUpdateDto)

Update a bill of lading line

Updates an existing line on a bill of lading.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillsOfLadingApi()
val billOfLadingId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val lineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val billOfLadingLineUpdateDto : BillOfLadingLineUpdateDto =  // BillOfLadingLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateBillOfLadingLineAsync(billOfLadingId, lineId, tenantId, apiVersion, xApiVersion, billOfLadingLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillsOfLadingApi#updateBillOfLadingLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillsOfLadingApi#updateBillOfLadingLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **billOfLadingId** | **java.util.UUID**|  | |
| **lineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **billOfLadingLineUpdateDto** | [**BillOfLadingLineUpdateDto**](BillOfLadingLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

