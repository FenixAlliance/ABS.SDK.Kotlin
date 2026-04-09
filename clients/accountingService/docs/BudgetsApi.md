# BudgetsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBudgetAccountEntryAsync**](BudgetsApi.md#createBudgetAccountEntryAsync) | **POST** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries | Creates a budget account entry |
| [**createBudgetAsync**](BudgetsApi.md#createBudgetAsync) | **POST** /api/v2/AccountingService/Budgets | Creates a budget |
| [**deleteBudgetAccountEntryAsync**](BudgetsApi.md#deleteBudgetAccountEntryAsync) | **DELETE** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries/{entryId} | Deletes a budget account entry |
| [**deleteBudgetAsync**](BudgetsApi.md#deleteBudgetAsync) | **DELETE** /api/v2/AccountingService/Budgets/{budgetId} | Deletes a budget |
| [**getBudgetAccountEntriesCollectionAsync**](BudgetsApi.md#getBudgetAccountEntriesCollectionAsync) | **GET** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries | Gets all budget account entries |
| [**getBudgetAccountEntryAsync**](BudgetsApi.md#getBudgetAccountEntryAsync) | **GET** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries/{entryId} | Gets a budget account entry by id |
| [**getBudgetDetailsAsync**](BudgetsApi.md#getBudgetDetailsAsync) | **GET** /api/v2/AccountingService/Budgets/{budgetId} | Gets a budget by id |
| [**getBudgetsAsync**](BudgetsApi.md#getBudgetsAsync) | **GET** /api/v2/AccountingService/Budgets | Gets all budgets |
| [**updateBudgetAccountEntryAsync**](BudgetsApi.md#updateBudgetAccountEntryAsync) | **PUT** /api/v2/AccountingService/Budgets/{budgetId}/AccountEntries/{entryId} | Updates a budget account entry |
| [**updateBudgetAsync**](BudgetsApi.md#updateBudgetAsync) | **PUT** /api/v2/AccountingService/Budgets/{budgetId} | Updates a budget |


<a id="createBudgetAccountEntryAsync"></a>
# **createBudgetAccountEntryAsync**
> EmptyEnvelope createBudgetAccountEntryAsync(budgetId, tenantId, budgetAccountEntryCreateDto, apiVersion, xApiVersion)

Creates a budget account entry

Create a budget account entry

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val budgetAccountEntryCreateDto : BudgetAccountEntryCreateDto =  // BudgetAccountEntryCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createBudgetAccountEntryAsync(budgetId, tenantId, budgetAccountEntryCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#createBudgetAccountEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#createBudgetAccountEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **budgetAccountEntryCreateDto** | [**BudgetAccountEntryCreateDto**](BudgetAccountEntryCreateDto.md)|  | |
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

<a id="createBudgetAsync"></a>
# **createBudgetAsync**
> EmptyEnvelope createBudgetAsync(tenantId, budgetCreateDto, apiVersion, xApiVersion)

Creates a budget

Create a budget

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val budgetCreateDto : BudgetCreateDto =  // BudgetCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createBudgetAsync(tenantId, budgetCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#createBudgetAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#createBudgetAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **budgetCreateDto** | [**BudgetCreateDto**](BudgetCreateDto.md)|  | |
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

<a id="deleteBudgetAccountEntryAsync"></a>
# **deleteBudgetAccountEntryAsync**
> EmptyEnvelope deleteBudgetAccountEntryAsync(budgetId, entryId, tenantId, apiVersion, xApiVersion)

Deletes a budget account entry

Delete a budget account entry

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBudgetAccountEntryAsync(budgetId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#deleteBudgetAccountEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#deleteBudgetAccountEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
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

<a id="deleteBudgetAsync"></a>
# **deleteBudgetAsync**
> EmptyEnvelope deleteBudgetAsync(budgetId, tenantId, apiVersion, xApiVersion)

Deletes a budget

Delete a budget

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBudgetAsync(budgetId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#deleteBudgetAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#deleteBudgetAsync")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
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

<a id="getBudgetAccountEntriesCollectionAsync"></a>
# **getBudgetAccountEntriesCollectionAsync**
> BudgetAccountEntryDtoIReadOnlyListEnvelope getBudgetAccountEntriesCollectionAsync(budgetId, tenantId, apiVersion, xApiVersion)

Gets all budget account entries

Get all budget account entries

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BudgetAccountEntryDtoIReadOnlyListEnvelope = apiInstance.getBudgetAccountEntriesCollectionAsync(budgetId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#getBudgetAccountEntriesCollectionAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#getBudgetAccountEntriesCollectionAsync")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BudgetAccountEntryDtoIReadOnlyListEnvelope**](BudgetAccountEntryDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBudgetAccountEntryAsync"></a>
# **getBudgetAccountEntryAsync**
> BudgetAccountEntryDtoEnvelope getBudgetAccountEntryAsync(budgetId, entryId, tenantId, apiVersion, xApiVersion)

Gets a budget account entry by id

Get a budget account entry by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BudgetAccountEntryDtoEnvelope = apiInstance.getBudgetAccountEntryAsync(budgetId, entryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#getBudgetAccountEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#getBudgetAccountEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BudgetAccountEntryDtoEnvelope**](BudgetAccountEntryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBudgetDetailsAsync"></a>
# **getBudgetDetailsAsync**
> BudgetDtoEnvelope getBudgetDetailsAsync(budgetId, tenantId, apiVersion, xApiVersion)

Gets a budget by id

Get a budget by id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BudgetDtoEnvelope = apiInstance.getBudgetDetailsAsync(budgetId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#getBudgetDetailsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#getBudgetDetailsAsync")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BudgetDtoEnvelope**](BudgetDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBudgetsAsync"></a>
# **getBudgetsAsync**
> BudgetDtoIReadOnlyListEnvelope getBudgetsAsync(tenantId, apiVersion, xApiVersion)

Gets all budgets

Get all budgets

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BudgetDtoIReadOnlyListEnvelope = apiInstance.getBudgetsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#getBudgetsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#getBudgetsAsync")
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

[**BudgetDtoIReadOnlyListEnvelope**](BudgetDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateBudgetAccountEntryAsync"></a>
# **updateBudgetAccountEntryAsync**
> EmptyEnvelope updateBudgetAccountEntryAsync(budgetId, entryId, tenantId, budgetAccountEntryUpdateDto, apiVersion, xApiVersion)

Updates a budget account entry

Update a budget account entry

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val entryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val budgetAccountEntryUpdateDto : BudgetAccountEntryUpdateDto =  // BudgetAccountEntryUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateBudgetAccountEntryAsync(budgetId, entryId, tenantId, budgetAccountEntryUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#updateBudgetAccountEntryAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#updateBudgetAccountEntryAsync")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
| **entryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **budgetAccountEntryUpdateDto** | [**BudgetAccountEntryUpdateDto**](BudgetAccountEntryUpdateDto.md)|  | |
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

<a id="updateBudgetAsync"></a>
# **updateBudgetAsync**
> EmptyEnvelope updateBudgetAsync(budgetId, tenantId, budgetUpdateDto, apiVersion, xApiVersion)

Updates a budget

Update a budget

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BudgetsApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val budgetUpdateDto : BudgetUpdateDto =  // BudgetUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateBudgetAsync(budgetId, tenantId, budgetUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BudgetsApi#updateBudgetAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BudgetsApi#updateBudgetAsync")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **budgetUpdateDto** | [**BudgetUpdateDto**](BudgetUpdateDto.md)|  | |
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

