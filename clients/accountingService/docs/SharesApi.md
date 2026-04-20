# SharesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createShareClass**](SharesApi.md#createShareClass) | **POST** /api/v2/AccountingService/Shares/Classes | Creates a new share class |
| [**createShareIssuance**](SharesApi.md#createShareIssuance) | **POST** /api/v2/AccountingService/Shares/Issuances | Creates a new share issuance |
| [**createShareTransfer**](SharesApi.md#createShareTransfer) | **POST** /api/v2/AccountingService/Shares/Transfers | Creates a new share transfer |
| [**createShareTransferReason**](SharesApi.md#createShareTransferReason) | **POST** /api/v2/AccountingService/Shares/TransferReasons | Creates a new share transfer reason |
| [**deleteShareClass**](SharesApi.md#deleteShareClass) | **DELETE** /api/v2/AccountingService/Shares/Classes/{shareClassId} | Deletes an existing share class |
| [**deleteShareIssuance**](SharesApi.md#deleteShareIssuance) | **DELETE** /api/v2/AccountingService/Shares/Issuances/{issuanceId} | Deletes an existing share issuance |
| [**deleteShareTransfer**](SharesApi.md#deleteShareTransfer) | **DELETE** /api/v2/AccountingService/Shares/Transfers/{transferId} | Deletes an existing share transfer |
| [**deleteShareTransferReason**](SharesApi.md#deleteShareTransferReason) | **DELETE** /api/v2/AccountingService/Shares/TransferReasons/{reasonId} | Deletes an existing share transfer reason |
| [**getShareClass**](SharesApi.md#getShareClass) | **GET** /api/v2/AccountingService/Shares/Classes/{shareClassId} | Gets a share class by id |
| [**getShareClasses**](SharesApi.md#getShareClasses) | **GET** /api/v2/AccountingService/Shares/Classes | Gets the current tenant share classes |
| [**getShareClassesCount**](SharesApi.md#getShareClassesCount) | **GET** /api/v2/AccountingService/Shares/Classes/Count | Gets the current tenant share classes count |
| [**getShareIssuance**](SharesApi.md#getShareIssuance) | **GET** /api/v2/AccountingService/Shares/Issuances/{issuanceId} | Gets a share issuance by id |
| [**getShareIssuances**](SharesApi.md#getShareIssuances) | **GET** /api/v2/AccountingService/Shares/Issuances | Gets the current tenant share issuances |
| [**getShareIssuancesCount**](SharesApi.md#getShareIssuancesCount) | **GET** /api/v2/AccountingService/Shares/Issuances/Count | Gets the current tenant share issuances count |
| [**getShareTransfer**](SharesApi.md#getShareTransfer) | **GET** /api/v2/AccountingService/Shares/Transfers/{transferId} | Gets a share transfer by id |
| [**getShareTransferReason**](SharesApi.md#getShareTransferReason) | **GET** /api/v2/AccountingService/Shares/TransferReasons/{reasonId} | Gets a share transfer reason by id |
| [**getShareTransferReasons**](SharesApi.md#getShareTransferReasons) | **GET** /api/v2/AccountingService/Shares/TransferReasons | Gets the current tenant share transfer reasons |
| [**getShareTransferReasonsCount**](SharesApi.md#getShareTransferReasonsCount) | **GET** /api/v2/AccountingService/Shares/TransferReasons/Count | Gets the current tenant share transfer reasons count |
| [**getShareTransfers**](SharesApi.md#getShareTransfers) | **GET** /api/v2/AccountingService/Shares/Transfers | Gets the current tenant share transfers |
| [**getShareTransfersCount**](SharesApi.md#getShareTransfersCount) | **GET** /api/v2/AccountingService/Shares/Transfers/Count | Gets the current tenant share transfers count |
| [**updateShareClass**](SharesApi.md#updateShareClass) | **PUT** /api/v2/AccountingService/Shares/Classes/{shareClassId} | Updates an existing share class |
| [**updateShareIssuance**](SharesApi.md#updateShareIssuance) | **PUT** /api/v2/AccountingService/Shares/Issuances/{issuanceId} | Updates an existing share issuance |
| [**updateShareTransfer**](SharesApi.md#updateShareTransfer) | **PUT** /api/v2/AccountingService/Shares/Transfers/{transferId} | Updates an existing share transfer |
| [**updateShareTransferReason**](SharesApi.md#updateShareTransferReason) | **PUT** /api/v2/AccountingService/Shares/TransferReasons/{reasonId} | Updates an existing share transfer reason |


<a id="createShareClass"></a>
# **createShareClass**
> ShareClassDtoEnvelope createShareClass(tenantId, apiVersion, xApiVersion, shareClassCreateDto)

Creates a new share class

Creates a new share class.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shareClassCreateDto : ShareClassCreateDto =  // ShareClassCreateDto | 
try {
    val result : ShareClassDtoEnvelope = apiInstance.createShareClass(tenantId, apiVersion, xApiVersion, shareClassCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#createShareClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#createShareClass")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareClassCreateDto** | [**ShareClassCreateDto**](ShareClassCreateDto.md)|  | [optional] |

### Return type

[**ShareClassDtoEnvelope**](ShareClassDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createShareIssuance"></a>
# **createShareIssuance**
> ShareIssuanceDtoEnvelope createShareIssuance(tenantId, apiVersion, xApiVersion, shareIssuanceCreateDto)

Creates a new share issuance

Creates a new share issuance.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shareIssuanceCreateDto : ShareIssuanceCreateDto =  // ShareIssuanceCreateDto | 
try {
    val result : ShareIssuanceDtoEnvelope = apiInstance.createShareIssuance(tenantId, apiVersion, xApiVersion, shareIssuanceCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#createShareIssuance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#createShareIssuance")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareIssuanceCreateDto** | [**ShareIssuanceCreateDto**](ShareIssuanceCreateDto.md)|  | [optional] |

### Return type

[**ShareIssuanceDtoEnvelope**](ShareIssuanceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createShareTransfer"></a>
# **createShareTransfer**
> ShareTransferDtoEnvelope createShareTransfer(tenantId, apiVersion, xApiVersion, shareTransferCreateDto)

Creates a new share transfer

Creates a new share transfer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shareTransferCreateDto : ShareTransferCreateDto =  // ShareTransferCreateDto | 
try {
    val result : ShareTransferDtoEnvelope = apiInstance.createShareTransfer(tenantId, apiVersion, xApiVersion, shareTransferCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#createShareTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#createShareTransfer")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareTransferCreateDto** | [**ShareTransferCreateDto**](ShareTransferCreateDto.md)|  | [optional] |

### Return type

[**ShareTransferDtoEnvelope**](ShareTransferDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createShareTransferReason"></a>
# **createShareTransferReason**
> ShareTransferReasonDtoEnvelope createShareTransferReason(tenantId, apiVersion, xApiVersion, shareTransferReasonCreateDto)

Creates a new share transfer reason

Creates a new share transfer reason.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shareTransferReasonCreateDto : ShareTransferReasonCreateDto =  // ShareTransferReasonCreateDto | 
try {
    val result : ShareTransferReasonDtoEnvelope = apiInstance.createShareTransferReason(tenantId, apiVersion, xApiVersion, shareTransferReasonCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#createShareTransferReason")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#createShareTransferReason")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareTransferReasonCreateDto** | [**ShareTransferReasonCreateDto**](ShareTransferReasonCreateDto.md)|  | [optional] |

### Return type

[**ShareTransferReasonDtoEnvelope**](ShareTransferReasonDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteShareClass"></a>
# **deleteShareClass**
> deleteShareClass(shareClassId, tenantId, apiVersion, xApiVersion)

Deletes an existing share class

Deletes an existing share class.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val shareClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShareClass(shareClassId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#deleteShareClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#deleteShareClass")
    e.printStackTrace()
}
```

### Parameters
| **shareClassId** | **java.util.UUID**|  | |
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

<a id="deleteShareIssuance"></a>
# **deleteShareIssuance**
> deleteShareIssuance(issuanceId, tenantId, apiVersion, xApiVersion)

Deletes an existing share issuance

Deletes an existing share issuance.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val issuanceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShareIssuance(issuanceId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#deleteShareIssuance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#deleteShareIssuance")
    e.printStackTrace()
}
```

### Parameters
| **issuanceId** | **java.util.UUID**|  | |
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

<a id="deleteShareTransfer"></a>
# **deleteShareTransfer**
> deleteShareTransfer(transferId, tenantId, apiVersion, xApiVersion)

Deletes an existing share transfer

Deletes an existing share transfer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShareTransfer(transferId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#deleteShareTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#deleteShareTransfer")
    e.printStackTrace()
}
```

### Parameters
| **transferId** | **java.util.UUID**|  | |
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

<a id="deleteShareTransferReason"></a>
# **deleteShareTransferReason**
> deleteShareTransferReason(reasonId, tenantId, apiVersion, xApiVersion)

Deletes an existing share transfer reason

Deletes an existing share transfer reason.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val reasonId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteShareTransferReason(reasonId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#deleteShareTransferReason")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#deleteShareTransferReason")
    e.printStackTrace()
}
```

### Parameters
| **reasonId** | **java.util.UUID**|  | |
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

<a id="getShareClass"></a>
# **getShareClass**
> ShareClassDtoEnvelope getShareClass(shareClassId, tenantId, apiVersion, xApiVersion)

Gets a share class by id

Get a specific share class by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val shareClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShareClassDtoEnvelope = apiInstance.getShareClass(shareClassId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareClass")
    e.printStackTrace()
}
```

### Parameters
| **shareClassId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShareClassDtoEnvelope**](ShareClassDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShareClasses"></a>
# **getShareClasses**
> ShareClassDtoListEnvelope getShareClasses(tenantId, apiVersion, xApiVersion)

Gets the current tenant share classes

Get the currently acting tenant share classes.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShareClassDtoListEnvelope = apiInstance.getShareClasses(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareClasses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareClasses")
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

[**ShareClassDtoListEnvelope**](ShareClassDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShareClassesCount"></a>
# **getShareClassesCount**
> Int32Envelope getShareClassesCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant share classes count

Get the currently acting tenant share classes count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShareClassesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareClassesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareClassesCount")
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

<a id="getShareIssuance"></a>
# **getShareIssuance**
> ShareIssuanceDtoEnvelope getShareIssuance(issuanceId, tenantId, apiVersion, xApiVersion)

Gets a share issuance by id

Get a specific share issuance by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val issuanceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShareIssuanceDtoEnvelope = apiInstance.getShareIssuance(issuanceId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareIssuance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareIssuance")
    e.printStackTrace()
}
```

### Parameters
| **issuanceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShareIssuanceDtoEnvelope**](ShareIssuanceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShareIssuances"></a>
# **getShareIssuances**
> ShareIssuanceDtoListEnvelope getShareIssuances(tenantId, apiVersion, xApiVersion)

Gets the current tenant share issuances

Get the currently acting tenant share issuances.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShareIssuanceDtoListEnvelope = apiInstance.getShareIssuances(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareIssuances")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareIssuances")
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

[**ShareIssuanceDtoListEnvelope**](ShareIssuanceDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShareIssuancesCount"></a>
# **getShareIssuancesCount**
> Int32Envelope getShareIssuancesCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant share issuances count

Get the currently acting tenant share issuances count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShareIssuancesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareIssuancesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareIssuancesCount")
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

<a id="getShareTransfer"></a>
# **getShareTransfer**
> ShareTransferDtoEnvelope getShareTransfer(transferId, tenantId, apiVersion, xApiVersion)

Gets a share transfer by id

Get a specific share transfer by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShareTransferDtoEnvelope = apiInstance.getShareTransfer(transferId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareTransfer")
    e.printStackTrace()
}
```

### Parameters
| **transferId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShareTransferDtoEnvelope**](ShareTransferDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShareTransferReason"></a>
# **getShareTransferReason**
> ShareTransferReasonDtoEnvelope getShareTransferReason(reasonId, tenantId, apiVersion, xApiVersion)

Gets a share transfer reason by id

Get a specific share transfer reason by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val reasonId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShareTransferReasonDtoEnvelope = apiInstance.getShareTransferReason(reasonId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareTransferReason")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareTransferReason")
    e.printStackTrace()
}
```

### Parameters
| **reasonId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ShareTransferReasonDtoEnvelope**](ShareTransferReasonDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShareTransferReasons"></a>
# **getShareTransferReasons**
> ShareTransferReasonDtoListEnvelope getShareTransferReasons(tenantId, apiVersion, xApiVersion)

Gets the current tenant share transfer reasons

Get the currently acting tenant share transfer reasons.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShareTransferReasonDtoListEnvelope = apiInstance.getShareTransferReasons(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareTransferReasons")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareTransferReasons")
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

[**ShareTransferReasonDtoListEnvelope**](ShareTransferReasonDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShareTransferReasonsCount"></a>
# **getShareTransferReasonsCount**
> Int32Envelope getShareTransferReasonsCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant share transfer reasons count

Get the currently acting tenant share transfer reasons count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShareTransferReasonsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareTransferReasonsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareTransferReasonsCount")
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

<a id="getShareTransfers"></a>
# **getShareTransfers**
> ShareTransferDtoListEnvelope getShareTransfers(tenantId, apiVersion, xApiVersion)

Gets the current tenant share transfers

Get the currently acting tenant share transfers.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ShareTransferDtoListEnvelope = apiInstance.getShareTransfers(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareTransfers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareTransfers")
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

[**ShareTransferDtoListEnvelope**](ShareTransferDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getShareTransfersCount"></a>
# **getShareTransfersCount**
> Int32Envelope getShareTransfersCount(tenantId, apiVersion, xApiVersion)

Gets the current tenant share transfers count

Get the currently acting tenant share transfers count.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getShareTransfersCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#getShareTransfersCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#getShareTransfersCount")
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

<a id="updateShareClass"></a>
# **updateShareClass**
> ShareClassDtoEnvelope updateShareClass(shareClassId, tenantId, apiVersion, xApiVersion, shareClassUpdateDto)

Updates an existing share class

Updates an existing share class.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val shareClassId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shareClassUpdateDto : ShareClassUpdateDto =  // ShareClassUpdateDto | 
try {
    val result : ShareClassDtoEnvelope = apiInstance.updateShareClass(shareClassId, tenantId, apiVersion, xApiVersion, shareClassUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#updateShareClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#updateShareClass")
    e.printStackTrace()
}
```

### Parameters
| **shareClassId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareClassUpdateDto** | [**ShareClassUpdateDto**](ShareClassUpdateDto.md)|  | [optional] |

### Return type

[**ShareClassDtoEnvelope**](ShareClassDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateShareIssuance"></a>
# **updateShareIssuance**
> ShareIssuanceDtoEnvelope updateShareIssuance(issuanceId, tenantId, apiVersion, xApiVersion, shareIssuanceUpdateDto)

Updates an existing share issuance

Updates an existing share issuance.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val issuanceId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shareIssuanceUpdateDto : ShareIssuanceUpdateDto =  // ShareIssuanceUpdateDto | 
try {
    val result : ShareIssuanceDtoEnvelope = apiInstance.updateShareIssuance(issuanceId, tenantId, apiVersion, xApiVersion, shareIssuanceUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#updateShareIssuance")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#updateShareIssuance")
    e.printStackTrace()
}
```

### Parameters
| **issuanceId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareIssuanceUpdateDto** | [**ShareIssuanceUpdateDto**](ShareIssuanceUpdateDto.md)|  | [optional] |

### Return type

[**ShareIssuanceDtoEnvelope**](ShareIssuanceDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateShareTransfer"></a>
# **updateShareTransfer**
> ShareTransferDtoEnvelope updateShareTransfer(transferId, tenantId, apiVersion, xApiVersion, shareTransferUpdateDto)

Updates an existing share transfer

Updates an existing share transfer.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val transferId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shareTransferUpdateDto : ShareTransferUpdateDto =  // ShareTransferUpdateDto | 
try {
    val result : ShareTransferDtoEnvelope = apiInstance.updateShareTransfer(transferId, tenantId, apiVersion, xApiVersion, shareTransferUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#updateShareTransfer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#updateShareTransfer")
    e.printStackTrace()
}
```

### Parameters
| **transferId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareTransferUpdateDto** | [**ShareTransferUpdateDto**](ShareTransferUpdateDto.md)|  | [optional] |

### Return type

[**ShareTransferDtoEnvelope**](ShareTransferDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateShareTransferReason"></a>
# **updateShareTransferReason**
> ShareTransferReasonDtoEnvelope updateShareTransferReason(reasonId, tenantId, apiVersion, xApiVersion, shareTransferReasonUpdateDto)

Updates an existing share transfer reason

Updates an existing share transfer reason.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SharesApi()
val reasonId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val shareTransferReasonUpdateDto : ShareTransferReasonUpdateDto =  // ShareTransferReasonUpdateDto | 
try {
    val result : ShareTransferReasonDtoEnvelope = apiInstance.updateShareTransferReason(reasonId, tenantId, apiVersion, xApiVersion, shareTransferReasonUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SharesApi#updateShareTransferReason")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SharesApi#updateShareTransferReason")
    e.printStackTrace()
}
```

### Parameters
| **reasonId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **shareTransferReasonUpdateDto** | [**ShareTransferReasonUpdateDto**](ShareTransferReasonUpdateDto.md)|  | [optional] |

### Return type

[**ShareTransferReasonDtoEnvelope**](ShareTransferReasonDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

