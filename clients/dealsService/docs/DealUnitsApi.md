# DealUnitsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateDealUnitAsync**](DealUnitsApi.md#calculateDealUnitAsync) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Calculate | Calculate a deal unit |
| [**calculateDealUnitLineAsync**](DealUnitsApi.md#calculateDealUnitLineAsync) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId}/Calculate | Calculate a deal unit line |
| [**createDealUnitAsync**](DealUnitsApi.md#createDealUnitAsync) | **POST** /api/v2/DealsService/DealUnits | Create a deal unit |
| [**createGetDealUnitLinesAsync**](DealUnitsApi.md#createGetDealUnitLinesAsync) | **POST** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines | Create a deal unit line |
| [**deleteDealUnitAsync**](DealUnitsApi.md#deleteDealUnitAsync) | **DELETE** /api/v2/DealsService/DealUnits/{dealUnitId} | Delete a deal unit |
| [**deleteDealUnitPriceAsync**](DealUnitsApi.md#deleteDealUnitPriceAsync) | **DELETE** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} | Delete a deal unit line |
| [**getDealUnitAsync**](DealUnitsApi.md#getDealUnitAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId} | Get deal unit by ID |
| [**getDealUnitLinesAsync**](DealUnitsApi.md#getDealUnitLinesAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines | Get deal unit lines |
| [**getDealUnitLinesCountAsync**](DealUnitsApi.md#getDealUnitLinesCountAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/Count | Get deal unit lines count |
| [**getDealUnitPriceAsync**](DealUnitsApi.md#getDealUnitPriceAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} | Get a deal unit line by ID |
| [**getDealUnitsAsync**](DealUnitsApi.md#getDealUnitsAsync) | **GET** /api/v2/DealsService/DealUnits | Get deal units |
| [**getDealUnitsCountAsync**](DealUnitsApi.md#getDealUnitsCountAsync) | **GET** /api/v2/DealsService/DealUnits/Count | Get deal units count |
| [**getExtendedDealUnitAsync**](DealUnitsApi.md#getExtendedDealUnitAsync) | **GET** /api/v2/DealsService/DealUnits/{dealUnitId}/Extended | Get extended deal unit by ID |
| [**getExtendedDealUnitsAsync**](DealUnitsApi.md#getExtendedDealUnitsAsync) | **GET** /api/v2/DealsService/DealUnits/Extended | Get extended deal units |
| [**updateDealUnitAsync**](DealUnitsApi.md#updateDealUnitAsync) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId} | Update a deal unit |
| [**updateDealUnitPriceAsync**](DealUnitsApi.md#updateDealUnitPriceAsync) | **PUT** /api/v2/DealsService/DealUnits/{dealUnitId}/Lines/{dealUnitLineId} | Update a deal unit line |


<a id="calculateDealUnitAsync"></a>
# **calculateDealUnitAsync**
> EmptyEnvelope calculateDealUnitAsync(dealUnitId, tenantId)

Calculate a deal unit

Triggers recalculation of totals and derived values for a specific deal unit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.calculateDealUnitAsync(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#calculateDealUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#calculateDealUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="calculateDealUnitLineAsync"></a>
# **calculateDealUnitLineAsync**
> EmptyEnvelope calculateDealUnitLineAsync(dealUnitId, dealUnitLineId, tenantId)

Calculate a deal unit line

Triggers recalculation of totals and derived values for a specific deal unit line.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.calculateDealUnitLineAsync(dealUnitId, dealUnitLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#calculateDealUnitLineAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#calculateDealUnitLineAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **dealUnitLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="createDealUnitAsync"></a>
# **createDealUnitAsync**
> EmptyEnvelope createDealUnitAsync(tenantId, dealUnitCreateDto)

Create a deal unit

Creates a new deal unit for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitCreateDto : DealUnitCreateDto =  // DealUnitCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createDealUnitAsync(tenantId, dealUnitCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#createDealUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#createDealUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitCreateDto** | [**DealUnitCreateDto**](DealUnitCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createGetDealUnitLinesAsync"></a>
# **createGetDealUnitLinesAsync**
> EmptyEnvelope createGetDealUnitLinesAsync(dealUnitId, tenantId, dealUnitLineCreateDto)

Create a deal unit line

Creates a new line within a specific deal unit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineCreateDto : DealUnitLineCreateDto =  // DealUnitLineCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createGetDealUnitLinesAsync(dealUnitId, tenantId, dealUnitLineCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#createGetDealUnitLinesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#createGetDealUnitLinesAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitLineCreateDto** | [**DealUnitLineCreateDto**](DealUnitLineCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteDealUnitAsync"></a>
# **deleteDealUnitAsync**
> EmptyEnvelope deleteDealUnitAsync(dealUnitId, tenantId)

Delete a deal unit

Deletes an existing deal unit by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteDealUnitAsync(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#deleteDealUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#deleteDealUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="deleteDealUnitPriceAsync"></a>
# **deleteDealUnitPriceAsync**
> EmptyEnvelope deleteDealUnitPriceAsync(dealUnitId, dealUnitLineId, tenantId)

Delete a deal unit line

Deletes an existing line from a specific deal unit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteDealUnitPriceAsync(dealUnitId, dealUnitLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#deleteDealUnitPriceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#deleteDealUnitPriceAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **dealUnitLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitAsync"></a>
# **getDealUnitAsync**
> DealUnitDtoEnvelope getDealUnitAsync(dealUnitId, tenantId)

Get deal unit by ID

Retrieves a single deal unit by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitDtoEnvelope = apiInstance.getDealUnitAsync(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getDealUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getDealUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitDtoEnvelope**](DealUnitDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitLinesAsync"></a>
# **getDealUnitLinesAsync**
> DealUnitLineDtoListEnvelope getDealUnitLinesAsync(dealUnitId, tenantId, itemId)

Get deal unit lines

Retrieves a list of lines for a specific deal unit with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitLineDtoListEnvelope = apiInstance.getDealUnitLinesAsync(dealUnitId, tenantId, itemId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getDealUnitLinesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getDealUnitLinesAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemId** | **java.util.UUID**|  | [optional] |

### Return type

[**DealUnitLineDtoListEnvelope**](DealUnitLineDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitLinesCountAsync"></a>
# **getDealUnitLinesCountAsync**
> Int32Envelope getDealUnitLinesCountAsync(dealUnitId, tenantId)

Get deal unit lines count

Returns the total count of lines for a specific deal unit with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getDealUnitLinesCountAsync(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getDealUnitLinesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getDealUnitLinesCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitPriceAsync"></a>
# **getDealUnitPriceAsync**
> DealUnitLineDtoEnvelope getDealUnitPriceAsync(dealUnitId, dealUnitLineId, tenantId)

Get a deal unit line by ID

Retrieves a single deal unit line by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitLineDtoEnvelope = apiInstance.getDealUnitPriceAsync(dealUnitId, dealUnitLineId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getDealUnitPriceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getDealUnitPriceAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **dealUnitLineId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitLineDtoEnvelope**](DealUnitLineDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitsAsync"></a>
# **getDealUnitsAsync**
> DealUnitDtoListEnvelope getDealUnitsAsync(tenantId)

Get deal units

Retrieves a list of deal units for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DealUnitDtoListEnvelope = apiInstance.getDealUnitsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getDealUnitsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getDealUnitsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DealUnitDtoListEnvelope**](DealUnitDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDealUnitsCountAsync"></a>
# **getDealUnitsCountAsync**
> Int32Envelope getDealUnitsCountAsync(tenantId)

Get deal units count

Returns the total count of deal units for the specified tenant with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getDealUnitsCountAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getDealUnitsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getDealUnitsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedDealUnitAsync"></a>
# **getExtendedDealUnitAsync**
> ExtendedDealUnitDtoEnvelope getExtendedDealUnitAsync(dealUnitId, tenantId)

Get extended deal unit by ID

Retrieves a single deal unit with extended details by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedDealUnitDtoEnvelope = apiInstance.getExtendedDealUnitAsync(dealUnitId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getExtendedDealUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getExtendedDealUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedDealUnitDtoEnvelope**](ExtendedDealUnitDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExtendedDealUnitsAsync"></a>
# **getExtendedDealUnitsAsync**
> ExtendedDealUnitDtoListEnvelope getExtendedDealUnitsAsync(tenantId)

Get extended deal units

Retrieves a list of deal units with extended details for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : ExtendedDealUnitDtoListEnvelope = apiInstance.getExtendedDealUnitsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#getExtendedDealUnitsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#getExtendedDealUnitsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**ExtendedDealUnitDtoListEnvelope**](ExtendedDealUnitDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateDealUnitAsync"></a>
# **updateDealUnitAsync**
> EmptyEnvelope updateDealUnitAsync(dealUnitId, tenantId, dealUnitUpdateDto)

Update a deal unit

Updates an existing deal unit by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitUpdateDto : DealUnitUpdateDto =  // DealUnitUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateDealUnitAsync(dealUnitId, tenantId, dealUnitUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#updateDealUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#updateDealUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitUpdateDto** | [**DealUnitUpdateDto**](DealUnitUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateDealUnitPriceAsync"></a>
# **updateDealUnitPriceAsync**
> EmptyEnvelope updateDealUnitPriceAsync(dealUnitId, dealUnitLineId, tenantId, dealUnitLineUpdateDto)

Update a deal unit line

Updates an existing line within a specific deal unit.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DealUnitsApi()
val dealUnitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val dealUnitLineUpdateDto : DealUnitLineUpdateDto =  // DealUnitLineUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateDealUnitPriceAsync(dealUnitId, dealUnitLineId, tenantId, dealUnitLineUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DealUnitsApi#updateDealUnitPriceAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DealUnitsApi#updateDealUnitPriceAsync")
    e.printStackTrace()
}
```

### Parameters
| **dealUnitId** | **java.util.UUID**|  | |
| **dealUnitLineId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dealUnitLineUpdateDto** | [**DealUnitLineUpdateDto**](DealUnitLineUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

