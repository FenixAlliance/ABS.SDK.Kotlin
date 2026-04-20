# UnitGroupsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createUnitAsync**](UnitGroupsApi.md#createUnitAsync) | **POST** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units | Create a unit within a unit group |
| [**createUnitGroupAsync**](UnitGroupsApi.md#createUnitGroupAsync) | **POST** /api/v2/TenantsService/UnitGroups | Create a new unit group |
| [**deleteUnitAsync**](UnitGroupsApi.md#deleteUnitAsync) | **DELETE** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/{unitId} | Delete a unit from a unit group |
| [**deleteUnitGroupAsync**](UnitGroupsApi.md#deleteUnitGroupAsync) | **DELETE** /api/v2/TenantsService/UnitGroups/{unitGroupId} | Delete a unit group |
| [**getUnitAsync**](UnitGroupsApi.md#getUnitAsync) | **GET** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/{unitId} | Retrieve a unit by ID within a unit group |
| [**getUnitGroupAsync**](UnitGroupsApi.md#getUnitGroupAsync) | **GET** /api/v2/TenantsService/UnitGroups/{unitGroupId} | Retrieve a unit group by ID |
| [**getUnitGroupsAsync**](UnitGroupsApi.md#getUnitGroupsAsync) | **GET** /api/v2/TenantsService/UnitGroups | Retrieve a list of unit groups |
| [**getUnitGroupsCountAsync**](UnitGroupsApi.md#getUnitGroupsCountAsync) | **GET** /api/v2/TenantsService/UnitGroups/Count | Get the count of unit groups |
| [**getUnitsAsync**](UnitGroupsApi.md#getUnitsAsync) | **GET** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units | Retrieve units for a unit group |
| [**getUnitsCountAsync**](UnitGroupsApi.md#getUnitsCountAsync) | **GET** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/Count | Get the count of units in a unit group |
| [**updateUnitAsync**](UnitGroupsApi.md#updateUnitAsync) | **PUT** /api/v2/TenantsService/UnitGroups/{unitGroupId}/Units/{unitId} | Update a unit within a unit group |
| [**updateUnitGroupAsync**](UnitGroupsApi.md#updateUnitGroupAsync) | **PUT** /api/v2/TenantsService/UnitGroups/{unitGroupId} | Update a unit group |


<a id="createUnitAsync"></a>
# **createUnitAsync**
> EmptyEnvelope createUnitAsync(unitGroupId, tenantId, apiVersion, xApiVersion, unitCreateDto)

Create a unit within a unit group

Creates a new unit within a specific unit group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val unitCreateDto : UnitCreateDto =  // UnitCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createUnitAsync(unitGroupId, tenantId, apiVersion, xApiVersion, unitCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#createUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#createUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **unitCreateDto** | [**UnitCreateDto**](UnitCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createUnitGroupAsync"></a>
# **createUnitGroupAsync**
> EmptyEnvelope createUnitGroupAsync(tenantId, apiVersion, xApiVersion, unitGroupCreateDto)

Create a new unit group

Creates a new unit group for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val unitGroupCreateDto : UnitGroupCreateDto =  // UnitGroupCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createUnitGroupAsync(tenantId, apiVersion, xApiVersion, unitGroupCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#createUnitGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#createUnitGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **unitGroupCreateDto** | [**UnitGroupCreateDto**](UnitGroupCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteUnitAsync"></a>
# **deleteUnitAsync**
> EmptyEnvelope deleteUnitAsync(unitGroupId, unitId, tenantId, apiVersion, xApiVersion)

Delete a unit from a unit group

Deletes a unit from a specific unit group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val unitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteUnitAsync(unitGroupId, unitId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#deleteUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#deleteUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
| **unitId** | **java.util.UUID**|  | |
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

<a id="deleteUnitGroupAsync"></a>
# **deleteUnitGroupAsync**
> EmptyEnvelope deleteUnitGroupAsync(unitGroupId, tenantId, apiVersion, xApiVersion)

Delete a unit group

Deletes a unit group by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteUnitGroupAsync(unitGroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#deleteUnitGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#deleteUnitGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
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

<a id="getUnitAsync"></a>
# **getUnitAsync**
> UnitDtoEnvelope getUnitAsync(unitGroupId, unitId, tenantId, apiVersion, xApiVersion)

Retrieve a unit by ID within a unit group

Retrieves a single unit by its unique identifier within a specific unit group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val unitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UnitDtoEnvelope = apiInstance.getUnitAsync(unitGroupId, unitId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#getUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#getUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
| **unitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**UnitDtoEnvelope**](UnitDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUnitGroupAsync"></a>
# **getUnitGroupAsync**
> UnitGroupDtoEnvelope getUnitGroupAsync(unitGroupId, tenantId, apiVersion, xApiVersion)

Retrieve a unit group by ID

Retrieves a single unit group by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UnitGroupDtoEnvelope = apiInstance.getUnitGroupAsync(unitGroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#getUnitGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#getUnitGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**UnitGroupDtoEnvelope**](UnitGroupDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUnitGroupsAsync"></a>
# **getUnitGroupsAsync**
> UnitGroupDtoListEnvelope getUnitGroupsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of unit groups

Retrieves a list of unit groups for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UnitGroupDtoListEnvelope = apiInstance.getUnitGroupsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#getUnitGroupsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#getUnitGroupsAsync")
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

[**UnitGroupDtoListEnvelope**](UnitGroupDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUnitGroupsCountAsync"></a>
# **getUnitGroupsCountAsync**
> Int32Envelope getUnitGroupsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of unit groups

Returns the total count of unit groups for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getUnitGroupsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#getUnitGroupsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#getUnitGroupsCountAsync")
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

<a id="getUnitsAsync"></a>
# **getUnitsAsync**
> UnitDtoListEnvelope getUnitsAsync(unitGroupId, tenantId, apiVersion, xApiVersion)

Retrieve units for a unit group

Retrieves a list of units belonging to a specific unit group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : UnitDtoListEnvelope = apiInstance.getUnitsAsync(unitGroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#getUnitsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#getUnitsAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**UnitDtoListEnvelope**](UnitDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getUnitsCountAsync"></a>
# **getUnitsCountAsync**
> Int32Envelope getUnitsCountAsync(unitGroupId, tenantId, apiVersion, xApiVersion)

Get the count of units in a unit group

Returns the total count of units in a specific unit group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getUnitsCountAsync(unitGroupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#getUnitsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#getUnitsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
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

<a id="updateUnitAsync"></a>
# **updateUnitAsync**
> EmptyEnvelope updateUnitAsync(unitGroupId, unitId, tenantId, apiVersion, xApiVersion, unitUpdateDto)

Update a unit within a unit group

Updates an existing unit within a specific unit group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val unitId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val unitUpdateDto : UnitUpdateDto =  // UnitUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateUnitAsync(unitGroupId, unitId, tenantId, apiVersion, xApiVersion, unitUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#updateUnitAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#updateUnitAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
| **unitId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **unitUpdateDto** | [**UnitUpdateDto**](UnitUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateUnitGroupAsync"></a>
# **updateUnitGroupAsync**
> EmptyEnvelope updateUnitGroupAsync(unitGroupId, tenantId, apiVersion, xApiVersion, unitGroupUpdateDto)

Update a unit group

Updates an existing unit group by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = UnitGroupsApi()
val unitGroupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val unitGroupUpdateDto : UnitGroupUpdateDto =  // UnitGroupUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateUnitGroupAsync(unitGroupId, tenantId, apiVersion, xApiVersion, unitGroupUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UnitGroupsApi#updateUnitGroupAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UnitGroupsApi#updateUnitGroupAsync")
    e.printStackTrace()
}
```

### Parameters
| **unitGroupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **unitGroupUpdateDto** | [**UnitGroupUpdateDto**](UnitGroupUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

