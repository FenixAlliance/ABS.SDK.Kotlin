# CostCentresApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCostCentre**](CostCentresApi.md#createCostCentre) | **POST** /api/v2/AccountingService/CostCentres | Create a cost centre |
| [**createCostCentreBudget**](CostCentresApi.md#createCostCentreBudget) | **POST** /api/v2/AccountingService/CostCentres/CostCentreBudgets | Create a cost centre budget |
| [**createCostCentreGroup**](CostCentresApi.md#createCostCentreGroup) | **POST** /api/v2/AccountingService/CostCentres/CostCentreGroups | Create a cost centre group |
| [**deleteCostCentre**](CostCentresApi.md#deleteCostCentre) | **DELETE** /api/v2/AccountingService/CostCentres/{costCentreId} | Delete a cost centre |
| [**deleteCostCentreBudget**](CostCentresApi.md#deleteCostCentreBudget) | **DELETE** /api/v2/AccountingService/CostCentres/CostCentreBudgets/{budgetId} | Delete a cost centre budget |
| [**deleteCostCentreGroup**](CostCentresApi.md#deleteCostCentreGroup) | **DELETE** /api/v2/AccountingService/CostCentres/CostCentreGroups/{groupId} | Delete a cost centre group |
| [**getCostCentre**](CostCentresApi.md#getCostCentre) | **GET** /api/v2/AccountingService/CostCentres/{costCentreId} | Get a cost centre by id |
| [**getCostCentreBudget**](CostCentresApi.md#getCostCentreBudget) | **GET** /api/v2/AccountingService/CostCentres/CostCentreBudgets/{budgetId} | Get a cost centre budget by id |
| [**getCostCentreBudgets**](CostCentresApi.md#getCostCentreBudgets) | **GET** /api/v2/AccountingService/CostCentres/CostCentreBudgets | Get all cost centre budgets for a tenant |
| [**getCostCentreGroup**](CostCentresApi.md#getCostCentreGroup) | **GET** /api/v2/AccountingService/CostCentres/CostCentreGroups/{groupId} | Get a cost centre group by id |
| [**getCostCentreGroups**](CostCentresApi.md#getCostCentreGroups) | **GET** /api/v2/AccountingService/CostCentres/CostCentreGroups | Get all cost centre groups for a tenant |
| [**getCostCentreGroupsCount**](CostCentresApi.md#getCostCentreGroupsCount) | **GET** /api/v2/AccountingService/CostCentres/CostCentreGroups/Count | Get the count of cost centre groups for a tenant |
| [**getCostCentres**](CostCentresApi.md#getCostCentres) | **GET** /api/v2/AccountingService/CostCentres | Get all cost centres for a tenant |
| [**getCostCentresCount**](CostCentresApi.md#getCostCentresCount) | **GET** /api/v2/AccountingService/CostCentres/Count | Get the count of cost centres for a tenant |
| [**updateCostCentre**](CostCentresApi.md#updateCostCentre) | **PUT** /api/v2/AccountingService/CostCentres/{costCentreId} | Update a cost centre |
| [**updateCostCentreBudget**](CostCentresApi.md#updateCostCentreBudget) | **PUT** /api/v2/AccountingService/CostCentres/CostCentreBudgets/{budgetId} | Update a cost centre budget |
| [**updateCostCentreGroup**](CostCentresApi.md#updateCostCentreGroup) | **PUT** /api/v2/AccountingService/CostCentres/CostCentreGroups/{groupId} | Update a cost centre group |


<a id="createCostCentre"></a>
# **createCostCentre**
> EmptyEnvelope createCostCentre(tenantId, costCentreCreateDto, apiVersion, xApiVersion)

Create a cost centre

Creates a new cost centre.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val costCentreCreateDto : CostCentreCreateDto =  // CostCentreCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createCostCentre(tenantId, costCentreCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#createCostCentre")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#createCostCentre")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **costCentreCreateDto** | [**CostCentreCreateDto**](CostCentreCreateDto.md)|  | |
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

<a id="createCostCentreBudget"></a>
# **createCostCentreBudget**
> EmptyEnvelope createCostCentreBudget(tenantId, costCentreBudgetCreateDto, apiVersion, xApiVersion)

Create a cost centre budget

Creates a new cost centre budget.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val costCentreBudgetCreateDto : CostCentreBudgetCreateDto =  // CostCentreBudgetCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createCostCentreBudget(tenantId, costCentreBudgetCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#createCostCentreBudget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#createCostCentreBudget")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **costCentreBudgetCreateDto** | [**CostCentreBudgetCreateDto**](CostCentreBudgetCreateDto.md)|  | |
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

<a id="createCostCentreGroup"></a>
# **createCostCentreGroup**
> EmptyEnvelope createCostCentreGroup(tenantId, costCentreGroupCreateDto, apiVersion, xApiVersion)

Create a cost centre group

Creates a new cost centre group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val costCentreGroupCreateDto : CostCentreGroupCreateDto =  // CostCentreGroupCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createCostCentreGroup(tenantId, costCentreGroupCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#createCostCentreGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#createCostCentreGroup")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **costCentreGroupCreateDto** | [**CostCentreGroupCreateDto**](CostCentreGroupCreateDto.md)|  | |
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

<a id="deleteCostCentre"></a>
# **deleteCostCentre**
> EmptyEnvelope deleteCostCentre(costCentreId, tenantId, apiVersion, xApiVersion)

Delete a cost centre

Deletes a cost centre.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val costCentreId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteCostCentre(costCentreId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#deleteCostCentre")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#deleteCostCentre")
    e.printStackTrace()
}
```

### Parameters
| **costCentreId** | **java.util.UUID**|  | |
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

<a id="deleteCostCentreBudget"></a>
# **deleteCostCentreBudget**
> EmptyEnvelope deleteCostCentreBudget(budgetId, tenantId, apiVersion, xApiVersion)

Delete a cost centre budget

Deletes a cost centre budget.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteCostCentreBudget(budgetId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#deleteCostCentreBudget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#deleteCostCentreBudget")
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

<a id="deleteCostCentreGroup"></a>
# **deleteCostCentreGroup**
> EmptyEnvelope deleteCostCentreGroup(groupId, tenantId, apiVersion, xApiVersion)

Delete a cost centre group

Deletes a cost centre group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteCostCentreGroup(groupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#deleteCostCentreGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#deleteCostCentreGroup")
    e.printStackTrace()
}
```

### Parameters
| **groupId** | **java.util.UUID**|  | |
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

<a id="getCostCentre"></a>
# **getCostCentre**
> CostCentreDtoEnvelope getCostCentre(costCentreId, tenantId, apiVersion, xApiVersion)

Get a cost centre by id

Retrieves a cost centre by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val costCentreId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CostCentreDtoEnvelope = apiInstance.getCostCentre(costCentreId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#getCostCentre")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#getCostCentre")
    e.printStackTrace()
}
```

### Parameters
| **costCentreId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CostCentreDtoEnvelope**](CostCentreDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCostCentreBudget"></a>
# **getCostCentreBudget**
> CostCentreBudgetDtoEnvelope getCostCentreBudget(budgetId, tenantId, apiVersion, xApiVersion)

Get a cost centre budget by id

Retrieves a cost centre budget by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CostCentreBudgetDtoEnvelope = apiInstance.getCostCentreBudget(budgetId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#getCostCentreBudget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#getCostCentreBudget")
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

[**CostCentreBudgetDtoEnvelope**](CostCentreBudgetDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCostCentreBudgets"></a>
# **getCostCentreBudgets**
> CostCentreBudgetDtoListEnvelope getCostCentreBudgets(tenantId, apiVersion, xApiVersion)

Get all cost centre budgets for a tenant

Retrieves all cost centre budgets for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CostCentreBudgetDtoListEnvelope = apiInstance.getCostCentreBudgets(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#getCostCentreBudgets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#getCostCentreBudgets")
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

[**CostCentreBudgetDtoListEnvelope**](CostCentreBudgetDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCostCentreGroup"></a>
# **getCostCentreGroup**
> CostCentreGroupDtoEnvelope getCostCentreGroup(groupId, tenantId, apiVersion, xApiVersion)

Get a cost centre group by id

Retrieves a cost centre group by its identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CostCentreGroupDtoEnvelope = apiInstance.getCostCentreGroup(groupId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#getCostCentreGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#getCostCentreGroup")
    e.printStackTrace()
}
```

### Parameters
| **groupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CostCentreGroupDtoEnvelope**](CostCentreGroupDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCostCentreGroups"></a>
# **getCostCentreGroups**
> CostCentreGroupDtoListEnvelope getCostCentreGroups(tenantId, apiVersion, xApiVersion)

Get all cost centre groups for a tenant

Retrieves all cost centre groups for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CostCentreGroupDtoListEnvelope = apiInstance.getCostCentreGroups(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#getCostCentreGroups")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#getCostCentreGroups")
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

[**CostCentreGroupDtoListEnvelope**](CostCentreGroupDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCostCentreGroupsCount"></a>
# **getCostCentreGroupsCount**
> Int32Envelope getCostCentreGroupsCount(tenantId, apiVersion, xApiVersion)

Get the count of cost centre groups for a tenant

Retrieves the count of cost centre groups for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getCostCentreGroupsCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#getCostCentreGroupsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#getCostCentreGroupsCount")
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

<a id="getCostCentres"></a>
# **getCostCentres**
> CostCentreDtoListEnvelope getCostCentres(tenantId, apiVersion, xApiVersion)

Get all cost centres for a tenant

Retrieves all cost centres for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CostCentreDtoListEnvelope = apiInstance.getCostCentres(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#getCostCentres")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#getCostCentres")
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

[**CostCentreDtoListEnvelope**](CostCentreDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getCostCentresCount"></a>
# **getCostCentresCount**
> Int32Envelope getCostCentresCount(tenantId, apiVersion, xApiVersion)

Get the count of cost centres for a tenant

Retrieves the count of cost centres for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getCostCentresCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#getCostCentresCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#getCostCentresCount")
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

<a id="updateCostCentre"></a>
# **updateCostCentre**
> EmptyEnvelope updateCostCentre(costCentreId, tenantId, costCentreUpdateDto, apiVersion, xApiVersion)

Update a cost centre

Updates an existing cost centre.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val costCentreId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val costCentreUpdateDto : CostCentreUpdateDto =  // CostCentreUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateCostCentre(costCentreId, tenantId, costCentreUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#updateCostCentre")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#updateCostCentre")
    e.printStackTrace()
}
```

### Parameters
| **costCentreId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **costCentreUpdateDto** | [**CostCentreUpdateDto**](CostCentreUpdateDto.md)|  | |
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

<a id="updateCostCentreBudget"></a>
# **updateCostCentreBudget**
> EmptyEnvelope updateCostCentreBudget(budgetId, tenantId, costCentreBudgetUpdateDto, apiVersion, xApiVersion)

Update a cost centre budget

Updates an existing cost centre budget.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val budgetId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val costCentreBudgetUpdateDto : CostCentreBudgetUpdateDto =  // CostCentreBudgetUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateCostCentreBudget(budgetId, tenantId, costCentreBudgetUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#updateCostCentreBudget")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#updateCostCentreBudget")
    e.printStackTrace()
}
```

### Parameters
| **budgetId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **costCentreBudgetUpdateDto** | [**CostCentreBudgetUpdateDto**](CostCentreBudgetUpdateDto.md)|  | |
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

<a id="updateCostCentreGroup"></a>
# **updateCostCentreGroup**
> EmptyEnvelope updateCostCentreGroup(groupId, tenantId, costCentreGroupUpdateDto, apiVersion, xApiVersion)

Update a cost centre group

Updates an existing cost centre group.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CostCentresApi()
val groupId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val costCentreGroupUpdateDto : CostCentreGroupUpdateDto =  // CostCentreGroupUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateCostCentreGroup(groupId, tenantId, costCentreGroupUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CostCentresApi#updateCostCentreGroup")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CostCentresApi#updateCostCentreGroup")
    e.printStackTrace()
}
```

### Parameters
| **groupId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **costCentreGroupUpdateDto** | [**CostCentreGroupUpdateDto**](CostCentreGroupUpdateDto.md)|  | |
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

