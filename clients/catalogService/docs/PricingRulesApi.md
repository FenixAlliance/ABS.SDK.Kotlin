# PricingRulesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPricingRule**](PricingRulesApi.md#createPricingRule) | **POST** /api/v2/CatalogService/PricingRules | Create a new pricing rule |
| [**deletePricingRule**](PricingRulesApi.md#deletePricingRule) | **DELETE** /api/v2/CatalogService/PricingRules/{pricingRuleId} | Delete a pricing rule |
| [**getPricingRuleById**](PricingRulesApi.md#getPricingRuleById) | **GET** /api/v2/CatalogService/PricingRules/{pricingRuleId} | Get pricing rule by ID |
| [**getPricingRules**](PricingRulesApi.md#getPricingRules) | **GET** /api/v2/CatalogService/PricingRules | Get all pricing rules |
| [**updatePricingRule**](PricingRulesApi.md#updatePricingRule) | **PUT** /api/v2/CatalogService/PricingRules/Update | Update a pricing rule |


<a id="createPricingRule"></a>
# **createPricingRule**
> PricingRuleDtoEnvelope createPricingRule(tenantId, apiVersion, xApiVersion, pricingRuleCreateDto)

Create a new pricing rule

Creates a new pricing rule for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricingRulesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val pricingRuleCreateDto : PricingRuleCreateDto =  // PricingRuleCreateDto | 
try {
    val result : PricingRuleDtoEnvelope = apiInstance.createPricingRule(tenantId, apiVersion, xApiVersion, pricingRuleCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricingRulesApi#createPricingRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricingRulesApi#createPricingRule")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pricingRuleCreateDto** | [**PricingRuleCreateDto**](PricingRuleCreateDto.md)|  | [optional] |

### Return type

[**PricingRuleDtoEnvelope**](PricingRuleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deletePricingRule"></a>
# **deletePricingRule**
> deletePricingRule(pricingRuleId, tenantId, apiVersion, xApiVersion)

Delete a pricing rule

Deletes a pricing rule for the specified tenant and rule ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricingRulesApi()
val pricingRuleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deletePricingRule(pricingRuleId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling PricingRulesApi#deletePricingRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricingRulesApi#deletePricingRule")
    e.printStackTrace()
}
```

### Parameters
| **pricingRuleId** | **java.util.UUID**|  | |
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

<a id="getPricingRuleById"></a>
# **getPricingRuleById**
> PricingRuleDtoEnvelope getPricingRuleById(pricingRuleId, apiVersion, xApiVersion)

Get pricing rule by ID

Retrieves a pricing rule by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricingRulesApi()
val pricingRuleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PricingRuleDtoEnvelope = apiInstance.getPricingRuleById(pricingRuleId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricingRulesApi#getPricingRuleById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricingRulesApi#getPricingRuleById")
    e.printStackTrace()
}
```

### Parameters
| **pricingRuleId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**PricingRuleDtoEnvelope**](PricingRuleDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getPricingRules"></a>
# **getPricingRules**
> PricingRuleDtoListEnvelope getPricingRules(tenantId, apiVersion, xApiVersion)

Get all pricing rules

Retrieves all pricing rules for the specified tenant, with optional OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricingRulesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PricingRuleDtoListEnvelope = apiInstance.getPricingRules(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PricingRulesApi#getPricingRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricingRulesApi#getPricingRules")
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

[**PricingRuleDtoListEnvelope**](PricingRuleDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updatePricingRule"></a>
# **updatePricingRule**
> updatePricingRule(tenantId, pricingRuleId, apiVersion, xApiVersion, pricingRuleUpdateDto)

Update a pricing rule

Updates an existing pricing rule for the specified tenant and rule ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = PricingRulesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val pricingRuleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val pricingRuleUpdateDto : PricingRuleUpdateDto =  // PricingRuleUpdateDto | 
try {
    apiInstance.updatePricingRule(tenantId, pricingRuleId, apiVersion, xApiVersion, pricingRuleUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling PricingRulesApi#updatePricingRule")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PricingRulesApi#updatePricingRule")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **pricingRuleId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pricingRuleUpdateDto** | [**PricingRuleUpdateDto**](PricingRuleUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

