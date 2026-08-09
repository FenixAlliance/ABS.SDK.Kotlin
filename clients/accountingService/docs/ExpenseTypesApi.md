# ExpenseTypesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createExpenseType**](ExpenseTypesApi.md#createExpenseType) | **POST** /api/v2/AccountingService/ExpenseTypes | Create an expense type |
| [**deleteExpenseType**](ExpenseTypesApi.md#deleteExpenseType) | **DELETE** /api/v2/AccountingService/ExpenseTypes/{expenseTypeId} | Delete an expense type |
| [**getExpenseType**](ExpenseTypesApi.md#getExpenseType) | **GET** /api/v2/AccountingService/ExpenseTypes/{expenseTypeId} | Get an expense type by id |
| [**getExpenseTypes**](ExpenseTypesApi.md#getExpenseTypes) | **GET** /api/v2/AccountingService/ExpenseTypes | Get all expense types for a tenant |
| [**getExpenseTypesCount**](ExpenseTypesApi.md#getExpenseTypesCount) | **GET** /api/v2/AccountingService/ExpenseTypes/Count | Get the count of expense types for a tenant |
| [**patchExpenseType**](ExpenseTypesApi.md#patchExpenseType) | **PATCH** /api/v2/AccountingService/ExpenseTypes/{expenseTypeId} | Patch an expense type |
| [**updateExpenseType**](ExpenseTypesApi.md#updateExpenseType) | **PUT** /api/v2/AccountingService/ExpenseTypes/{expenseTypeId} | Update an expense type |


<a id="createExpenseType"></a>
# **createExpenseType**
> EmptyEnvelope createExpenseType(tenantId, expenseTypeCreateDto, apiVersion, xApiVersion)

Create an expense type

Creates a new expense type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expenseTypeCreateDto : ExpenseTypeCreateDto =  // ExpenseTypeCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createExpenseType(tenantId, expenseTypeCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseTypesApi#createExpenseType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseTypesApi#createExpenseType")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **expenseTypeCreateDto** | [**ExpenseTypeCreateDto**](ExpenseTypeCreateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteExpenseType"></a>
# **deleteExpenseType**
> EmptyEnvelope deleteExpenseType(expenseTypeId, tenantId, apiVersion, xApiVersion)

Delete an expense type

Deletes an expense type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseTypesApi()
val expenseTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteExpenseType(expenseTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseTypesApi#deleteExpenseType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseTypesApi#deleteExpenseType")
    e.printStackTrace()
}
```

### Parameters
| **expenseTypeId** | **java.util.UUID**|  | |
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

<a id="getExpenseType"></a>
# **getExpenseType**
> ExpenseTypeDtoEnvelope getExpenseType(expenseTypeId, tenantId, apiVersion, xApiVersion)

Get an expense type by id

Retrieves an expense type by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseTypesApi()
val expenseTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExpenseTypeDtoEnvelope = apiInstance.getExpenseType(expenseTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseTypesApi#getExpenseType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseTypesApi#getExpenseType")
    e.printStackTrace()
}
```

### Parameters
| **expenseTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExpenseTypeDtoEnvelope**](ExpenseTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExpenseTypes"></a>
# **getExpenseTypes**
> ExpenseTypeDtoListEnvelope getExpenseTypes(tenantId, apiVersion, xApiVersion, expenseTypeDtoCollectionQueryParameters)

Get all expense types for a tenant

Retrieves all expense types for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val expenseTypeDtoCollectionQueryParameters : ExpenseTypeDtoCollectionQueryParameters =  // ExpenseTypeDtoCollectionQueryParameters | 
try {
    val result : ExpenseTypeDtoListEnvelope = apiInstance.getExpenseTypes(tenantId, apiVersion, xApiVersion, expenseTypeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseTypesApi#getExpenseTypes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseTypesApi#getExpenseTypes")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expenseTypeDtoCollectionQueryParameters** | [**ExpenseTypeDtoCollectionQueryParameters**](ExpenseTypeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**ExpenseTypeDtoListEnvelope**](ExpenseTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getExpenseTypesCount"></a>
# **getExpenseTypesCount**
> Int32Envelope getExpenseTypesCount(tenantId, apiVersion, xApiVersion, expenseTypeDtoCollectionQueryParameters)

Get the count of expense types for a tenant

Retrieves the count of expense types for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseTypesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val expenseTypeDtoCollectionQueryParameters : ExpenseTypeDtoCollectionQueryParameters =  // ExpenseTypeDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getExpenseTypesCount(tenantId, apiVersion, xApiVersion, expenseTypeDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseTypesApi#getExpenseTypesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseTypesApi#getExpenseTypesCount")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **expenseTypeDtoCollectionQueryParameters** | [**ExpenseTypeDtoCollectionQueryParameters**](ExpenseTypeDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="patchExpenseType"></a>
# **patchExpenseType**
> EmptyEnvelope patchExpenseType(expenseTypeId, tenantId, apiVersion, xApiVersion, patchOperation)

Patch an expense type

Partially updates an existing expense type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseTypesApi()
val expenseTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val patchOperation : kotlin.collections.List<PatchOperation> =  // kotlin.collections.List<PatchOperation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchExpenseType(expenseTypeId, tenantId, apiVersion, xApiVersion, patchOperation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseTypesApi#patchExpenseType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseTypesApi#patchExpenseType")
    e.printStackTrace()
}
```

### Parameters
| **expenseTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **patchOperation** | [**kotlin.collections.List&lt;PatchOperation&gt;**](PatchOperation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateExpenseType"></a>
# **updateExpenseType**
> EmptyEnvelope updateExpenseType(expenseTypeId, tenantId, expenseTypeUpdateDto, apiVersion, xApiVersion)

Update an expense type

Updates an existing expense type.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseTypesApi()
val expenseTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expenseTypeUpdateDto : ExpenseTypeUpdateDto =  // ExpenseTypeUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateExpenseType(expenseTypeId, tenantId, expenseTypeUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseTypesApi#updateExpenseType")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseTypesApi#updateExpenseType")
    e.printStackTrace()
}
```

### Parameters
| **expenseTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **expenseTypeUpdateDto** | [**ExpenseTypeUpdateDto**](ExpenseTypeUpdateDto.md)|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

