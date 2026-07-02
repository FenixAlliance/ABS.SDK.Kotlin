# ExpenseClaimsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createExpenseClaim**](ExpenseClaimsApi.md#createExpenseClaim) | **POST** /api/v2/AccountingService/ExpenseClaims | Create an expense claim |
| [**deleteExpenseClaim**](ExpenseClaimsApi.md#deleteExpenseClaim) | **DELETE** /api/v2/AccountingService/ExpenseClaims/{expenseClaimId} | Delete an expense claim |
| [**getExpenseClaim**](ExpenseClaimsApi.md#getExpenseClaim) | **GET** /api/v2/AccountingService/ExpenseClaims/{expenseClaimId} | Get an expense claim by id |
| [**getExpenseClaims**](ExpenseClaimsApi.md#getExpenseClaims) | **GET** /api/v2/AccountingService/ExpenseClaims | Get all expense claims for a tenant |
| [**getExpenseClaimsCount**](ExpenseClaimsApi.md#getExpenseClaimsCount) | **GET** /api/v2/AccountingService/ExpenseClaims/Count | Get the count of expense claims for a tenant |
| [**patchExpenseClaim**](ExpenseClaimsApi.md#patchExpenseClaim) | **PATCH** /api/v2/AccountingService/ExpenseClaims/{expenseClaimId} | Patch an expense claim |
| [**updateExpenseClaim**](ExpenseClaimsApi.md#updateExpenseClaim) | **PUT** /api/v2/AccountingService/ExpenseClaims/{expenseClaimId} | Update an expense claim |


<a id="createExpenseClaim"></a>
# **createExpenseClaim**
> EmptyEnvelope createExpenseClaim(tenantId, expenseClaimCreateDto, apiVersion, xApiVersion)

Create an expense claim

Creates a new expense claim.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseClaimsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expenseClaimCreateDto : ExpenseClaimCreateDto =  // ExpenseClaimCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createExpenseClaim(tenantId, expenseClaimCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseClaimsApi#createExpenseClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseClaimsApi#createExpenseClaim")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **expenseClaimCreateDto** | [**ExpenseClaimCreateDto**](ExpenseClaimCreateDto.md)|  | |
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

<a id="deleteExpenseClaim"></a>
# **deleteExpenseClaim**
> EmptyEnvelope deleteExpenseClaim(expenseClaimId, tenantId, apiVersion, xApiVersion)

Delete an expense claim

Deletes an expense claim.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseClaimsApi()
val expenseClaimId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteExpenseClaim(expenseClaimId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseClaimsApi#deleteExpenseClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseClaimsApi#deleteExpenseClaim")
    e.printStackTrace()
}
```

### Parameters
| **expenseClaimId** | **java.util.UUID**|  | |
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

<a id="getExpenseClaim"></a>
# **getExpenseClaim**
> ExpenseClaimDtoEnvelope getExpenseClaim(expenseClaimId, tenantId, apiVersion, xApiVersion)

Get an expense claim by id

Retrieves an expense claim by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseClaimsApi()
val expenseClaimId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExpenseClaimDtoEnvelope = apiInstance.getExpenseClaim(expenseClaimId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseClaimsApi#getExpenseClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseClaimsApi#getExpenseClaim")
    e.printStackTrace()
}
```

### Parameters
| **expenseClaimId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ExpenseClaimDtoEnvelope**](ExpenseClaimDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExpenseClaims"></a>
# **getExpenseClaims**
> ExpenseClaimDtoListEnvelope getExpenseClaims(tenantId, apiVersion, xApiVersion)

Get all expense claims for a tenant

Retrieves all expense claims for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseClaimsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ExpenseClaimDtoListEnvelope = apiInstance.getExpenseClaims(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseClaimsApi#getExpenseClaims")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseClaimsApi#getExpenseClaims")
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

[**ExpenseClaimDtoListEnvelope**](ExpenseClaimDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getExpenseClaimsCount"></a>
# **getExpenseClaimsCount**
> Int32Envelope getExpenseClaimsCount(tenantId, apiVersion, xApiVersion)

Get the count of expense claims for a tenant

Retrieves the count of expense claims for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseClaimsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getExpenseClaimsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseClaimsApi#getExpenseClaimsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseClaimsApi#getExpenseClaimsCount")
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

<a id="patchExpenseClaim"></a>
# **patchExpenseClaim**
> EmptyEnvelope patchExpenseClaim(expenseClaimId, tenantId, apiVersion, xApiVersion, operation)

Patch an expense claim

Partially updates an existing expense claim.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseClaimsApi()
val expenseClaimId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchExpenseClaim(expenseClaimId, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseClaimsApi#patchExpenseClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseClaimsApi#patchExpenseClaim")
    e.printStackTrace()
}
```

### Parameters
| **expenseClaimId** | **java.util.UUID**|  | |
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

<a id="updateExpenseClaim"></a>
# **updateExpenseClaim**
> EmptyEnvelope updateExpenseClaim(expenseClaimId, tenantId, expenseClaimUpdateDto, apiVersion, xApiVersion)

Update an expense claim

Updates an existing expense claim.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ExpenseClaimsApi()
val expenseClaimId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val expenseClaimUpdateDto : ExpenseClaimUpdateDto =  // ExpenseClaimUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateExpenseClaim(expenseClaimId, tenantId, expenseClaimUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ExpenseClaimsApi#updateExpenseClaim")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExpenseClaimsApi#updateExpenseClaim")
    e.printStackTrace()
}
```

### Parameters
| **expenseClaimId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **expenseClaimUpdateDto** | [**ExpenseClaimUpdateDto**](ExpenseClaimUpdateDto.md)|  | |
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

