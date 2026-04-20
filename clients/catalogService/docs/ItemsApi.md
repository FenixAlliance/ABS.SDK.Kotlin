# ItemsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countStockItemTagsByItemId**](ItemsApi.md#countStockItemTagsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Tags/Count | Count tags for a stock item |
| [**countStockItemsByBusiness**](ItemsApi.md#countStockItemsByBusiness) | **GET** /api/v2/CatalogService/Items/Count | Count stock items by business |
| [**createStockItem**](ItemsApi.md#createStockItem) | **POST** /api/v2/CatalogService/Items | Create a new stock item |
| [**deleteStockItem**](ItemsApi.md#deleteStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId} | Delete a stock item |
| [**getExtendedStockItemById**](ItemsApi.md#getExtendedStockItemById) | **GET** /api/v2/CatalogService/Items/{itemId}/Extended | Get extended stock item by ID |
| [**getProductPrimaryImageAsync**](ItemsApi.md#getProductPrimaryImageAsync) | **GET** /api/v2/CatalogService/Items/{itemId}/Images/Primary | Get item primary image |
| [**getStockItemAttachmentById**](ItemsApi.md#getStockItemAttachmentById) | **GET** /api/v2/CatalogService/Items/{itemId}/Attachments/{itemAttachmentId} | Get attachment by ID for a stock item |
| [**getStockItemAttachmentsByItemId**](ItemsApi.md#getStockItemAttachmentsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Attachments | Get attachments for a stock item |
| [**getStockItemAttributeOptionById**](ItemsApi.md#getStockItemAttributeOptionById) | **GET** /api/v2/CatalogService/Items/{itemId}/AttributeOptions/{itemAttributeOptionId} | Get attribute option by ID for a stock item |
| [**getStockItemAttributeOptionsByItemId**](ItemsApi.md#getStockItemAttributeOptionsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/AttributeOptions | Get attribute options for a stock item |
| [**getStockItemBrandById**](ItemsApi.md#getStockItemBrandById) | **GET** /api/v2/CatalogService/Items/{itemId}/Brands/{itemBrandId} | Get brand by ID for a stock item |
| [**getStockItemBrandsByItemId**](ItemsApi.md#getStockItemBrandsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Brands | Get brands for a stock item |
| [**getStockItemById**](ItemsApi.md#getStockItemById) | **GET** /api/v2/CatalogService/Items/{itemId} | Get stock item by ID |
| [**getStockItemCategoriesByItemId**](ItemsApi.md#getStockItemCategoriesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Categories | Get categories for a stock item |
| [**getStockItemCategoryById**](ItemsApi.md#getStockItemCategoryById) | **GET** /api/v2/CatalogService/Items/{itemId}/Categories/{itemCategoryId} | Get category by ID for a stock item |
| [**getStockItemGoogleCategoriesByItemId**](ItemsApi.md#getStockItemGoogleCategoriesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/GoogleCategories | Get Google categories for a stock item |
| [**getStockItemGoogleCategoryById**](ItemsApi.md#getStockItemGoogleCategoryById) | **GET** /api/v2/CatalogService/Items/{itemId}/GoogleCategories/{itemGoogleCategoryId} | Get Google category by ID for a stock item |
| [**getStockItemImageById**](ItemsApi.md#getStockItemImageById) | **GET** /api/v2/CatalogService/Items/{itemId}/Images/{itemImageId} | Get image by ID for a stock item |
| [**getStockItemImagesByItemId**](ItemsApi.md#getStockItemImagesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Images | Get images for a stock item |
| [**getStockItemPriceRuleById**](ItemsApi.md#getStockItemPriceRuleById) | **GET** /api/v2/CatalogService/Items/{itemId}/PriceRules/{itemPriceRuleId} | Get price rule by ID for a stock item |
| [**getStockItemPriceRulesByItemId**](ItemsApi.md#getStockItemPriceRulesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/PriceRules | Get price rules for a stock item |
| [**getStockItemQuestionById**](ItemsApi.md#getStockItemQuestionById) | **GET** /api/v2/CatalogService/Items/{itemId}/Questions/{itemQuestionId} | Get question by ID for a stock item |
| [**getStockItemQuestionsByItemId**](ItemsApi.md#getStockItemQuestionsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Questions | Get questions for a stock item |
| [**getStockItemRefundPoliciesByItemId**](ItemsApi.md#getStockItemRefundPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/RefundPolicies | Get refund policies for a stock item |
| [**getStockItemRefundPolicyById**](ItemsApi.md#getStockItemRefundPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/RefundPolicies/{itemRefundPolicyId} | Get refund policy by ID for a stock item |
| [**getStockItemReturnPoliciesByItemId**](ItemsApi.md#getStockItemReturnPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/ReturnPolicies | Get return policies for a stock item |
| [**getStockItemReturnPolicyById**](ItemsApi.md#getStockItemReturnPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/ReturnPolicies/{itemReturnPolicyId} | Get return policy by ID for a stock item |
| [**getStockItemReviewById**](ItemsApi.md#getStockItemReviewById) | **GET** /api/v2/CatalogService/Items/{itemId}/Reviews/{itemReviewId} | Get review by ID for a stock item |
| [**getStockItemReviewsByItemId**](ItemsApi.md#getStockItemReviewsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Reviews | Get reviews for a stock item |
| [**getStockItemShippingPoliciesByItemId**](ItemsApi.md#getStockItemShippingPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/ShippingPolicies | Get shipping policies for a stock item |
| [**getStockItemShippingPolicyById**](ItemsApi.md#getStockItemShippingPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/ShippingPolicies/{itemShippingPolicyId} | Get shipping policy by ID for a stock item |
| [**getStockItemTagById**](ItemsApi.md#getStockItemTagById) | **GET** /api/v2/CatalogService/Items/{itemId}/Tags/{itemTagId} | Get tag by ID for a stock item |
| [**getStockItemTagsByItemId**](ItemsApi.md#getStockItemTagsByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Tags | Get tags for a stock item |
| [**getStockItemTaxPoliciesByItemId**](ItemsApi.md#getStockItemTaxPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/TaxPolicies | Get tax policies for a stock item |
| [**getStockItemTaxPolicyById**](ItemsApi.md#getStockItemTaxPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/TaxPolicies/{itemTaxPolicyId} | Get tax policy by ID for a stock item |
| [**getStockItemTypeById**](ItemsApi.md#getStockItemTypeById) | **GET** /api/v2/CatalogService/Items/{itemId}/Types/{itemTypeId} | Get type by ID for a stock item |
| [**getStockItemTypesByItemId**](ItemsApi.md#getStockItemTypesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/Types | Get types for a stock item |
| [**getStockItemWarrantyPoliciesByItemId**](ItemsApi.md#getStockItemWarrantyPoliciesByItemId) | **GET** /api/v2/CatalogService/Items/{itemId}/WarrantyPolicies | Get warranty policies for a stock item |
| [**getStockItemWarrantyPolicyById**](ItemsApi.md#getStockItemWarrantyPolicyById) | **GET** /api/v2/CatalogService/Items/{itemId}/WarrantyPolicies/{itemWarrantyPolicyId} | Get warranty policy by ID for a stock item |
| [**getStockItemsOdataMaxPrice**](ItemsApi.md#getStockItemsOdataMaxPrice) | **GET** /api/v2/CatalogService/Items/MaxPrice | Get max price of stock items |
| [**getStockItemsOdataMinPrice**](ItemsApi.md#getStockItemsOdataMinPrice) | **GET** /api/v2/CatalogService/Items/MinPrice | Get min price of stock items |
| [**getStockItemsQuery**](ItemsApi.md#getStockItemsQuery) | **GET** /api/v2/CatalogService/Items | Get all stock items |
| [**relateAttachmentToStockItem**](ItemsApi.md#relateAttachmentToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Attachments/{itemAttachmentId} | Relate attachment to stock item |
| [**relateAttributeOptionToStockItem**](ItemsApi.md#relateAttributeOptionToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/AttributeOptions/{itemAttributeOptionId} | Relate attribute option to stock item |
| [**relateBrandToStockItem**](ItemsApi.md#relateBrandToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Brands/{itemBrandId} | Relate brand to stock item |
| [**relateCategoryToStockItem**](ItemsApi.md#relateCategoryToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Categories/{itemCategoryId} | Relate category to stock item |
| [**relateGoogleCategoryToStockItem**](ItemsApi.md#relateGoogleCategoryToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/GoogleCategories/{itemGoogleCategoryId} | Relate Google category to stock item |
| [**relateImageToStockItem**](ItemsApi.md#relateImageToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Images/{itemImageId} | Relate image to stock item |
| [**relatePriceRuleToStockItem**](ItemsApi.md#relatePriceRuleToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/PriceRules/{itemPriceRuleId} | Relate price rule to stock item |
| [**relateQuestionToStockItem**](ItemsApi.md#relateQuestionToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Questions | Create question for stock item |
| [**relateRefundPolicyToStockItem**](ItemsApi.md#relateRefundPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/RefundPolicies/{itemRefundPolicyId} | Relate refund policy to stock item |
| [**relateReturnPolicyToStockItem**](ItemsApi.md#relateReturnPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/ReturnPolicies/{itemReturnPolicyId} | Relate return policy to stock item |
| [**relateReviewToStockItem**](ItemsApi.md#relateReviewToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Reviews | Create review for stock item |
| [**relateShippingPolicyToStockItem**](ItemsApi.md#relateShippingPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/ShippingPolicies/{itemShippingPolicyId} | Relate shipping policy to stock item |
| [**relateTagToStockItem**](ItemsApi.md#relateTagToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Tags/{itemTagId} | Relate tag to stock item |
| [**relateTaxPolicyToStockItem**](ItemsApi.md#relateTaxPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/TaxPolicies/{itemTaxPolicyId} | Relate tax policy to stock item |
| [**relateTypeToStockItem**](ItemsApi.md#relateTypeToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/Types/{itemTypeId} | Relate type to stock item |
| [**relateWarrantyPolicyToStockItem**](ItemsApi.md#relateWarrantyPolicyToStockItem) | **POST** /api/v2/CatalogService/Items/{itemId}/WarrantyPolicies/{itemWarrantyPolicyId} | Relate warranty policy to stock item |
| [**removeAttachmentFromStockItem**](ItemsApi.md#removeAttachmentFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Attachments/{itemAttachmentId} | Remove attachment from stock item |
| [**removeAttributeOptionFromStockItem**](ItemsApi.md#removeAttributeOptionFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/AttributeOptions/{itemAttributeOptionId} | Remove attribute option from stock item |
| [**removeBrandFromStockItem**](ItemsApi.md#removeBrandFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Brands/{itemBrandId} | Remove brand from stock item |
| [**removeCategoryFromStockItem**](ItemsApi.md#removeCategoryFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Categories/{itemCategoryId} | Remove category from stock item |
| [**removeGoogleCategoryFromStockItem**](ItemsApi.md#removeGoogleCategoryFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/GoogleCategories/{itemGoogleCategoryId} | Remove Google category from stock item |
| [**removeImageFromStockItem**](ItemsApi.md#removeImageFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Images/{itemImageId} | Remove image from stock item |
| [**removePriceRuleFromStockItem**](ItemsApi.md#removePriceRuleFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/PriceRules/{itemPriceRuleId} | Remove price rule from stock item |
| [**removeQuestionFromStockItem**](ItemsApi.md#removeQuestionFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Questions/{itemQuestionId} | Remove question from stock item |
| [**removeRefundPolicyFromStockItem**](ItemsApi.md#removeRefundPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/RefundPolicies/{itemRefundPolicyId} | Remove refund policy from stock item |
| [**removeReturnPolicyFromStockItem**](ItemsApi.md#removeReturnPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/ReturnPolicies/{itemReturnPolicyId} | Remove return policy from stock item |
| [**removeReviewFromStockItem**](ItemsApi.md#removeReviewFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Reviews/{itemReviewId} | Remove review from stock item |
| [**removeShippingPolicyFromStockItem**](ItemsApi.md#removeShippingPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/ShippingPolicies/{itemShippingPolicyId} | Remove shipping policy from stock item |
| [**removeTagFromStockItem**](ItemsApi.md#removeTagFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Tags/{itemTagId} | Remove tag from stock item |
| [**removeTaxPolicyFromStockItem**](ItemsApi.md#removeTaxPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/TaxPolicies/{itemTaxPolicyId} | Remove tax policy from stock item |
| [**removeTypeFromStockItem**](ItemsApi.md#removeTypeFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/Types/{itemTypeId} | Remove type from stock item |
| [**removeWarrantyPolicyFromStockItem**](ItemsApi.md#removeWarrantyPolicyFromStockItem) | **DELETE** /api/v2/CatalogService/Items/{itemId}/WarrantyPolicies/{itemWarrantyPolicyId} | Remove warranty policy from stock item |
| [**updateProductPrimaryImageAsync**](ItemsApi.md#updateProductPrimaryImageAsync) | **POST** /api/v2/CatalogService/Items/{itemId}/Images/Primary | Update item primary image |
| [**updateStockItem**](ItemsApi.md#updateStockItem) | **PUT** /api/v2/CatalogService/Items/{itemId} | Update a stock item |


<a id="countStockItemTagsByItemId"></a>
# **countStockItemTagsByItemId**
> Int32Envelope countStockItemTagsByItemId(itemId, apiVersion, xApiVersion)

Count tags for a stock item

Counts the number of tags associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countStockItemTagsByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#countStockItemTagsByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#countStockItemTagsByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
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

<a id="countStockItemsByBusiness"></a>
# **countStockItemsByBusiness**
> Int32Envelope countStockItemsByBusiness(tenantId, apiVersion, xApiVersion)

Count stock items by business

Counts the number of stock items for a business, optionally filtered by tenant and OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.countStockItemsByBusiness(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#countStockItemsByBusiness")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#countStockItemsByBusiness")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
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

<a id="createStockItem"></a>
# **createStockItem**
> createStockItem(tenantId, apiVersion, xApiVersion, catalogItemCreateDto)

Create a new stock item

Creates a new stock item for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val catalogItemCreateDto : CatalogItemCreateDto =  // CatalogItemCreateDto | 
try {
    apiInstance.createStockItem(tenantId, apiVersion, xApiVersion, catalogItemCreateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#createStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#createStockItem")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemCreateDto** | [**CatalogItemCreateDto**](CatalogItemCreateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteStockItem"></a>
# **deleteStockItem**
> deleteStockItem(itemId, tenantId, apiVersion, xApiVersion)

Delete a stock item

Deletes a stock item for the specified tenant and item ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    apiInstance.deleteStockItem(itemId, tenantId, apiVersion, xApiVersion)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#deleteStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#deleteStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
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

<a id="getExtendedStockItemById"></a>
# **getExtendedStockItemById**
> CatalogItemDtoEnvelope getExtendedStockItemById(itemId, apiVersion, xApiVersion)

Get extended stock item by ID

Retrieves extended information for a stock item by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CatalogItemDtoEnvelope = apiInstance.getExtendedStockItemById(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getExtendedStockItemById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getExtendedStockItemById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CatalogItemDtoEnvelope**](CatalogItemDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getProductPrimaryImageAsync"></a>
# **getProductPrimaryImageAsync**
> EmptyEnvelope getProductPrimaryImageAsync(itemId, apiVersion, xApiVersion)

Get item primary image

Retrieves the primary image for a specific catalog item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.getProductPrimaryImageAsync(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getProductPrimaryImageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getProductPrimaryImageAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
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

<a id="getStockItemAttachmentById"></a>
# **getStockItemAttachmentById**
> ItemAttachmentDtoEnvelope getStockItemAttachmentById(itemId, itemAttachmentId, apiVersion, xApiVersion)

Get attachment by ID for a stock item

Retrieves a specific attachment by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttachmentDtoEnvelope = apiInstance.getStockItemAttachmentById(itemId, itemAttachmentId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemAttachmentById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemAttachmentById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemAttachmentId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemAttachmentsByItemId"></a>
# **getStockItemAttachmentsByItemId**
> ItemAttachmentDtoListEnvelope getStockItemAttachmentsByItemId(itemId, apiVersion, xApiVersion)

Get attachments for a stock item

Retrieves all attachments associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttachmentDtoListEnvelope = apiInstance.getStockItemAttachmentsByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemAttachmentsByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemAttachmentsByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttachmentDtoListEnvelope**](ItemAttachmentDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemAttributeOptionById"></a>
# **getStockItemAttributeOptionById**
> ItemAttributeOptionDtoEnvelope getStockItemAttributeOptionById(itemId, itemAttributeOptionId, apiVersion, xApiVersion)

Get attribute option by ID for a stock item

Retrieves a specific attribute option by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemAttributeOptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttributeOptionDtoEnvelope = apiInstance.getStockItemAttributeOptionById(itemId, itemAttributeOptionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemAttributeOptionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemAttributeOptionById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemAttributeOptionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemAttributeOptionsByItemId"></a>
# **getStockItemAttributeOptionsByItemId**
> ItemAttributeOptionDtoListEnvelope getStockItemAttributeOptionsByItemId(itemId, apiVersion, xApiVersion)

Get attribute options for a stock item

Retrieves all attribute options associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttributeOptionDtoListEnvelope = apiInstance.getStockItemAttributeOptionsByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemAttributeOptionsByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemAttributeOptionsByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoListEnvelope**](ItemAttributeOptionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemBrandById"></a>
# **getStockItemBrandById**
> ItemBrandDtoEnvelope getStockItemBrandById(itemId, itemBrandId, apiVersion, xApiVersion)

Get brand by ID for a stock item

Retrieves a specific brand by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemBrandId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemBrandDtoEnvelope = apiInstance.getStockItemBrandById(itemId, itemBrandId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemBrandById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemBrandById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemBrandId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemBrandsByItemId"></a>
# **getStockItemBrandsByItemId**
> ItemBrandDtoListEnvelope getStockItemBrandsByItemId(itemId, apiVersion, xApiVersion)

Get brands for a stock item

Retrieves all brands associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemBrandDtoListEnvelope = apiInstance.getStockItemBrandsByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemBrandsByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemBrandsByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemBrandDtoListEnvelope**](ItemBrandDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemById"></a>
# **getStockItemById**
> CatalogItemDtoEnvelope getStockItemById(itemId, apiVersion, xApiVersion)

Get stock item by ID

Retrieves a stock item by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CatalogItemDtoEnvelope = apiInstance.getStockItemById(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CatalogItemDtoEnvelope**](CatalogItemDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemCategoriesByItemId"></a>
# **getStockItemCategoriesByItemId**
> ItemCategoryDtoListEnvelope getStockItemCategoriesByItemId(itemId, apiVersion, xApiVersion)

Get categories for a stock item

Retrieves all categories associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemCategoryDtoListEnvelope = apiInstance.getStockItemCategoriesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemCategoriesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemCategoriesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemCategoryDtoListEnvelope**](ItemCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemCategoryById"></a>
# **getStockItemCategoryById**
> ItemCategoryDtoEnvelope getStockItemCategoryById(itemId, itemCategoryId, apiVersion, xApiVersion)

Get category by ID for a stock item

Retrieves a specific category by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemCategoryDtoEnvelope = apiInstance.getStockItemCategoryById(itemId, itemCategoryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemCategoryById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemCategoryById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemCategoryId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemGoogleCategoriesByItemId"></a>
# **getStockItemGoogleCategoriesByItemId**
> ItemGoogleCategoryDtoListEnvelope getStockItemGoogleCategoriesByItemId(itemId, apiVersion, xApiVersion)

Get Google categories for a stock item

Retrieves all Google categories associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoListEnvelope = apiInstance.getStockItemGoogleCategoriesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemGoogleCategoriesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemGoogleCategoriesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoListEnvelope**](ItemGoogleCategoryDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemGoogleCategoryById"></a>
# **getStockItemGoogleCategoryById**
> ItemGoogleCategoryDtoEnvelope getStockItemGoogleCategoryById(itemId, itemGoogleCategoryId, apiVersion, xApiVersion)

Get Google category by ID for a stock item

Retrieves a specific Google category by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemGoogleCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoEnvelope = apiInstance.getStockItemGoogleCategoryById(itemId, itemGoogleCategoryId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemGoogleCategoryById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemGoogleCategoryById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemGoogleCategoryId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoEnvelope**](ItemGoogleCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemImageById"></a>
# **getStockItemImageById**
> ItemImageDtoEnvelope getStockItemImageById(itemId, itemImageId, apiVersion, xApiVersion)

Get image by ID for a stock item

Retrieves a specific image by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemImageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemImageDtoEnvelope = apiInstance.getStockItemImageById(itemId, itemImageId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemImageById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemImageById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemImageId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemImagesByItemId"></a>
# **getStockItemImagesByItemId**
> ItemImageDtoListEnvelope getStockItemImagesByItemId(itemId, apiVersion, xApiVersion)

Get images for a stock item

Retrieves all images associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemImageDtoListEnvelope = apiInstance.getStockItemImagesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemImagesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemImagesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemImageDtoListEnvelope**](ItemImageDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemPriceRuleById"></a>
# **getStockItemPriceRuleById**
> PricingRuleDtoEnvelope getStockItemPriceRuleById(itemId, itemPriceRuleId, apiVersion, xApiVersion)

Get price rule by ID for a stock item

Retrieves a specific pricing rule by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemPriceRuleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PricingRuleDtoEnvelope = apiInstance.getStockItemPriceRuleById(itemId, itemPriceRuleId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemPriceRuleById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemPriceRuleById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemPriceRuleId** | **java.util.UUID**|  | |
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

<a id="getStockItemPriceRulesByItemId"></a>
# **getStockItemPriceRulesByItemId**
> PricingRuleDtoListEnvelope getStockItemPriceRulesByItemId(itemId, apiVersion, xApiVersion)

Get price rules for a stock item

Retrieves all pricing rules associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PricingRuleDtoListEnvelope = apiInstance.getStockItemPriceRulesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemPriceRulesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemPriceRulesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
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

<a id="getStockItemQuestionById"></a>
# **getStockItemQuestionById**
> ItemQuestionDtoEnvelope getStockItemQuestionById(itemId, itemQuestionId, apiVersion, xApiVersion)

Get question by ID for a stock item

Retrieves a specific question by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemQuestionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemQuestionDtoEnvelope = apiInstance.getStockItemQuestionById(itemId, itemQuestionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemQuestionById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemQuestionById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemQuestionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemQuestionsByItemId"></a>
# **getStockItemQuestionsByItemId**
> ItemQuestionDtoListEnvelope getStockItemQuestionsByItemId(itemId, apiVersion, xApiVersion)

Get questions for a stock item

Retrieves all questions associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemQuestionDtoListEnvelope = apiInstance.getStockItemQuestionsByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemQuestionsByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemQuestionsByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemQuestionDtoListEnvelope**](ItemQuestionDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemRefundPoliciesByItemId"></a>
# **getStockItemRefundPoliciesByItemId**
> ItemRefundPolicyDtoListEnvelope getStockItemRefundPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get refund policies for a stock item

Retrieves all refund policies associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRefundPolicyDtoListEnvelope = apiInstance.getStockItemRefundPoliciesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemRefundPoliciesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemRefundPoliciesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoListEnvelope**](ItemRefundPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemRefundPolicyById"></a>
# **getStockItemRefundPolicyById**
> ItemRefundPolicyDtoEnvelope getStockItemRefundPolicyById(itemId, itemRefundPolicyId, apiVersion, xApiVersion)

Get refund policy by ID for a stock item

Retrieves a specific refund policy by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemRefundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRefundPolicyDtoEnvelope = apiInstance.getStockItemRefundPolicyById(itemId, itemRefundPolicyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemRefundPolicyById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemRefundPolicyById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemRefundPolicyId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoEnvelope**](ItemRefundPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemReturnPoliciesByItemId"></a>
# **getStockItemReturnPoliciesByItemId**
> ItemReturnPolicyDtoListEnvelope getStockItemReturnPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get return policies for a stock item

Retrieves all return policies associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReturnPolicyDtoListEnvelope = apiInstance.getStockItemReturnPoliciesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemReturnPoliciesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemReturnPoliciesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoListEnvelope**](ItemReturnPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemReturnPolicyById"></a>
# **getStockItemReturnPolicyById**
> ItemReturnPolicyDtoEnvelope getStockItemReturnPolicyById(itemId, itemReturnPolicyId, apiVersion, xApiVersion)

Get return policy by ID for a stock item

Retrieves a specific return policy by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemReturnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReturnPolicyDtoEnvelope = apiInstance.getStockItemReturnPolicyById(itemId, itemReturnPolicyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemReturnPolicyById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemReturnPolicyById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemReturnPolicyId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoEnvelope**](ItemReturnPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemReviewById"></a>
# **getStockItemReviewById**
> ItemReviewDtoEnvelope getStockItemReviewById(itemId, itemReviewId, apiVersion, xApiVersion)

Get review by ID for a stock item

Retrieves a specific review by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReviewDtoEnvelope = apiInstance.getStockItemReviewById(itemId, itemReviewId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemReviewById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemReviewById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemReviewId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemReviewsByItemId"></a>
# **getStockItemReviewsByItemId**
> ItemReviewDtoListEnvelope getStockItemReviewsByItemId(itemId, apiVersion, xApiVersion)

Get reviews for a stock item

Retrieves all reviews associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReviewDtoListEnvelope = apiInstance.getStockItemReviewsByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemReviewsByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemReviewsByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReviewDtoListEnvelope**](ItemReviewDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemShippingPoliciesByItemId"></a>
# **getStockItemShippingPoliciesByItemId**
> ItemShippingPolicyDtoListEnvelope getStockItemShippingPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get shipping policies for a stock item

Retrieves all shipping policies associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemShippingPolicyDtoListEnvelope = apiInstance.getStockItemShippingPoliciesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemShippingPoliciesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemShippingPoliciesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoListEnvelope**](ItemShippingPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemShippingPolicyById"></a>
# **getStockItemShippingPolicyById**
> ItemShippingPolicyDtoEnvelope getStockItemShippingPolicyById(itemId, itemShippingPolicyId, apiVersion, xApiVersion)

Get shipping policy by ID for a stock item

Retrieves a specific shipping policy by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemShippingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemShippingPolicyDtoEnvelope = apiInstance.getStockItemShippingPolicyById(itemId, itemShippingPolicyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemShippingPolicyById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemShippingPolicyById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemShippingPolicyId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoEnvelope**](ItemShippingPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemTagById"></a>
# **getStockItemTagById**
> ItemTagDtoEnvelope getStockItemTagById(itemId, itemTagId, apiVersion, xApiVersion)

Get tag by ID for a stock item

Retrieves a specific tag by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTagDtoEnvelope = apiInstance.getStockItemTagById(itemId, itemTagId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemTagById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemTagById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTagId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemTagsByItemId"></a>
# **getStockItemTagsByItemId**
> ItemTagDtoListEnvelope getStockItemTagsByItemId(itemId, apiVersion, xApiVersion)

Get tags for a stock item

Retrieves all tags associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTagDtoListEnvelope = apiInstance.getStockItemTagsByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemTagsByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemTagsByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTagDtoListEnvelope**](ItemTagDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemTaxPoliciesByItemId"></a>
# **getStockItemTaxPoliciesByItemId**
> ItemTaxPolicyDtoListEnvelope getStockItemTaxPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get tax policies for a stock item

Retrieves all tax policies associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTaxPolicyDtoListEnvelope = apiInstance.getStockItemTaxPoliciesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemTaxPoliciesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemTaxPoliciesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoListEnvelope**](ItemTaxPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemTaxPolicyById"></a>
# **getStockItemTaxPolicyById**
> ItemTaxPolicyDtoEnvelope getStockItemTaxPolicyById(itemId, itemTaxPolicyId, apiVersion, xApiVersion)

Get tax policy by ID for a stock item

Retrieves a specific tax policy by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTaxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTaxPolicyDtoEnvelope = apiInstance.getStockItemTaxPolicyById(itemId, itemTaxPolicyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemTaxPolicyById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemTaxPolicyById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTaxPolicyId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoEnvelope**](ItemTaxPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemTypeById"></a>
# **getStockItemTypeById**
> ItemTypeDtoEnvelope getStockItemTypeById(itemId, itemTypeId, apiVersion, xApiVersion)

Get type by ID for a stock item

Retrieves a specific type by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTypeDtoEnvelope = apiInstance.getStockItemTypeById(itemId, itemTypeId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemTypeById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemTypeById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTypeId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemTypesByItemId"></a>
# **getStockItemTypesByItemId**
> ItemTypeDtoListEnvelope getStockItemTypesByItemId(itemId, apiVersion, xApiVersion)

Get types for a stock item

Retrieves all types associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTypeDtoListEnvelope = apiInstance.getStockItemTypesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemTypesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemTypesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTypeDtoListEnvelope**](ItemTypeDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemWarrantyPoliciesByItemId"></a>
# **getStockItemWarrantyPoliciesByItemId**
> ItemWarrantyPolicyDtoListEnvelope getStockItemWarrantyPoliciesByItemId(itemId, apiVersion, xApiVersion)

Get warranty policies for a stock item

Retrieves all warranty policies associated with a specific stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemWarrantyPolicyDtoListEnvelope = apiInstance.getStockItemWarrantyPoliciesByItemId(itemId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemWarrantyPoliciesByItemId")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemWarrantyPoliciesByItemId")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoListEnvelope**](ItemWarrantyPolicyDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemWarrantyPolicyById"></a>
# **getStockItemWarrantyPolicyById**
> ItemWarrantyPolicyDtoEnvelope getStockItemWarrantyPolicyById(itemId, itemWarrantyPolicyId, apiVersion, xApiVersion)

Get warranty policy by ID for a stock item

Retrieves a specific warranty policy by ID for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemWarrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemWarrantyPolicyDtoEnvelope = apiInstance.getStockItemWarrantyPolicyById(itemId, itemWarrantyPolicyId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemWarrantyPolicyById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemWarrantyPolicyById")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemWarrantyPolicyId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoEnvelope**](ItemWarrantyPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemsOdataMaxPrice"></a>
# **getStockItemsOdataMaxPrice**
> MoneyEnvelope getStockItemsOdataMaxPrice(tenantId, apiVersion, xApiVersion)

Get max price of stock items

Retrieves the maximum price among all stock items, optionally filtered by tenant and OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.getStockItemsOdataMaxPrice(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemsOdataMaxPrice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemsOdataMaxPrice")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemsOdataMinPrice"></a>
# **getStockItemsOdataMinPrice**
> MoneyEnvelope getStockItemsOdataMinPrice(tenantId, apiVersion, xApiVersion)

Get min price of stock items

Retrieves the minimum price among all stock items, optionally filtered by tenant and OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MoneyEnvelope = apiInstance.getStockItemsOdataMinPrice(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemsOdataMinPrice")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemsOdataMinPrice")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MoneyEnvelope**](MoneyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getStockItemsQuery"></a>
# **getStockItemsQuery**
> CatalogItemDtoListEnvelope getStockItemsQuery(tenantId, apiVersion, xApiVersion)

Get all stock items

Retrieves all stock items, optionally filtered by tenant and OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : CatalogItemDtoListEnvelope = apiInstance.getStockItemsQuery(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#getStockItemsQuery")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#getStockItemsQuery")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**CatalogItemDtoListEnvelope**](CatalogItemDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateAttachmentToStockItem"></a>
# **relateAttachmentToStockItem**
> ItemAttachmentDtoEnvelope relateAttachmentToStockItem(itemId, itemAttachmentId, tenantId, apiVersion, xApiVersion, itemAttachmentCreateDto)

Relate attachment to stock item

Associates an attachment with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemAttachmentId : kotlin.String = itemAttachmentId_example // kotlin.String | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemAttachmentCreateDto : ItemAttachmentCreateDto =  // ItemAttachmentCreateDto | 
try {
    val result : ItemAttachmentDtoEnvelope = apiInstance.relateAttachmentToStockItem(itemId, itemAttachmentId, tenantId, apiVersion, xApiVersion, itemAttachmentCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateAttachmentToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateAttachmentToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemAttachmentId** | **kotlin.String**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemAttachmentCreateDto** | [**ItemAttachmentCreateDto**](ItemAttachmentCreateDto.md)|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="relateAttributeOptionToStockItem"></a>
# **relateAttributeOptionToStockItem**
> ItemAttributeOptionDtoEnvelope relateAttributeOptionToStockItem(itemId, itemAttributeOptionId, apiVersion, xApiVersion)

Relate attribute option to stock item

Associates an attribute option with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemAttributeOptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttributeOptionDtoEnvelope = apiInstance.relateAttributeOptionToStockItem(itemId, itemAttributeOptionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateAttributeOptionToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateAttributeOptionToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemAttributeOptionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateBrandToStockItem"></a>
# **relateBrandToStockItem**
> ItemBrandDtoEnvelope relateBrandToStockItem(itemId, itemBrandId, tenantId, apiVersion, xApiVersion)

Relate brand to stock item

Associates a brand with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemBrandId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemBrandDtoEnvelope = apiInstance.relateBrandToStockItem(itemId, itemBrandId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateBrandToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateBrandToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemBrandId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateCategoryToStockItem"></a>
# **relateCategoryToStockItem**
> ItemCategoryDtoEnvelope relateCategoryToStockItem(itemId, itemCategoryId, tenantId, apiVersion, xApiVersion)

Relate category to stock item

Associates a category with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemCategoryDtoEnvelope = apiInstance.relateCategoryToStockItem(itemId, itemCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateCategoryToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateCategoryToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateGoogleCategoryToStockItem"></a>
# **relateGoogleCategoryToStockItem**
> ItemGoogleCategoryDtoEnvelope relateGoogleCategoryToStockItem(itemId, itemGoogleCategoryId, tenantId, apiVersion, xApiVersion)

Relate Google category to stock item

Associates a Google category with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemGoogleCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoEnvelope = apiInstance.relateGoogleCategoryToStockItem(itemId, itemGoogleCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateGoogleCategoryToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateGoogleCategoryToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemGoogleCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoEnvelope**](ItemGoogleCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateImageToStockItem"></a>
# **relateImageToStockItem**
> ItemImageDtoEnvelope relateImageToStockItem(itemId, itemImageId, tenantId, apiVersion, xApiVersion)

Relate image to stock item

Associates an image with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemImageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemImageDtoEnvelope = apiInstance.relateImageToStockItem(itemId, itemImageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateImageToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateImageToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemImageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relatePriceRuleToStockItem"></a>
# **relatePriceRuleToStockItem**
> PricingRuleDtoEnvelope relatePriceRuleToStockItem(itemId, itemPriceRuleId, apiVersion, xApiVersion)

Relate price rule to stock item

Associates a pricing rule with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemPriceRuleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PricingRuleDtoEnvelope = apiInstance.relatePriceRuleToStockItem(itemId, itemPriceRuleId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relatePriceRuleToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relatePriceRuleToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemPriceRuleId** | **java.util.UUID**|  | |
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

<a id="relateQuestionToStockItem"></a>
# **relateQuestionToStockItem**
> ItemQuestionDtoEnvelope relateQuestionToStockItem(itemId, tenantId, apiVersion, xApiVersion, itemQuestionRecordCreateDto)

Create question for stock item

Creates a new question for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemQuestionRecordCreateDto : ItemQuestionRecordCreateDto =  // ItemQuestionRecordCreateDto | 
try {
    val result : ItemQuestionDtoEnvelope = apiInstance.relateQuestionToStockItem(itemId, tenantId, apiVersion, xApiVersion, itemQuestionRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateQuestionToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateQuestionToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemQuestionRecordCreateDto** | [**ItemQuestionRecordCreateDto**](ItemQuestionRecordCreateDto.md)|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="relateRefundPolicyToStockItem"></a>
# **relateRefundPolicyToStockItem**
> ItemRefundPolicyDtoEnvelope relateRefundPolicyToStockItem(itemId, itemRefundPolicyId, tenantId, apiVersion, xApiVersion)

Relate refund policy to stock item

Associates a refund policy with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemRefundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRefundPolicyDtoEnvelope = apiInstance.relateRefundPolicyToStockItem(itemId, itemRefundPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateRefundPolicyToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateRefundPolicyToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemRefundPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoEnvelope**](ItemRefundPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateReturnPolicyToStockItem"></a>
# **relateReturnPolicyToStockItem**
> ItemReturnPolicyDtoEnvelope relateReturnPolicyToStockItem(itemId, itemReturnPolicyId, tenantId, apiVersion, xApiVersion)

Relate return policy to stock item

Associates a return policy with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemReturnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReturnPolicyDtoEnvelope = apiInstance.relateReturnPolicyToStockItem(itemId, itemReturnPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateReturnPolicyToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateReturnPolicyToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemReturnPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoEnvelope**](ItemReturnPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateReviewToStockItem"></a>
# **relateReviewToStockItem**
> ItemReviewDtoEnvelope relateReviewToStockItem(itemId, tenantId, apiVersion, xApiVersion, itemReviewRecordCreateDto)

Create review for stock item

Creates a new review for a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val itemReviewRecordCreateDto : ItemReviewRecordCreateDto =  // ItemReviewRecordCreateDto | 
try {
    val result : ItemReviewDtoEnvelope = apiInstance.relateReviewToStockItem(itemId, tenantId, apiVersion, xApiVersion, itemReviewRecordCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateReviewToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateReviewToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **itemReviewRecordCreateDto** | [**ItemReviewRecordCreateDto**](ItemReviewRecordCreateDto.md)|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="relateShippingPolicyToStockItem"></a>
# **relateShippingPolicyToStockItem**
> ItemShippingPolicyDtoEnvelope relateShippingPolicyToStockItem(itemId, itemShippingPolicyId, tenantId, apiVersion, xApiVersion)

Relate shipping policy to stock item

Associates a shipping policy with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemShippingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemShippingPolicyDtoEnvelope = apiInstance.relateShippingPolicyToStockItem(itemId, itemShippingPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateShippingPolicyToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateShippingPolicyToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemShippingPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoEnvelope**](ItemShippingPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateTagToStockItem"></a>
# **relateTagToStockItem**
> ItemTagDtoEnvelope relateTagToStockItem(itemId, itemTagId, tenantId, apiVersion, xApiVersion)

Relate tag to stock item

Associates a tag with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTagDtoEnvelope = apiInstance.relateTagToStockItem(itemId, itemTagId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateTagToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateTagToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateTaxPolicyToStockItem"></a>
# **relateTaxPolicyToStockItem**
> ItemTaxPolicyDtoEnvelope relateTaxPolicyToStockItem(itemId, itemTaxPolicyId, tenantId, apiVersion, xApiVersion)

Relate tax policy to stock item

Associates a tax policy with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTaxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTaxPolicyDtoEnvelope = apiInstance.relateTaxPolicyToStockItem(itemId, itemTaxPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateTaxPolicyToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateTaxPolicyToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTaxPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoEnvelope**](ItemTaxPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateTypeToStockItem"></a>
# **relateTypeToStockItem**
> ItemTypeDtoEnvelope relateTypeToStockItem(itemId, itemTypeId, tenantId, apiVersion, xApiVersion)

Relate type to stock item

Associates a type with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTypeDtoEnvelope = apiInstance.relateTypeToStockItem(itemId, itemTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateTypeToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateTypeToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="relateWarrantyPolicyToStockItem"></a>
# **relateWarrantyPolicyToStockItem**
> ItemWarrantyPolicyDtoEnvelope relateWarrantyPolicyToStockItem(itemId, itemWarrantyPolicyId, tenantId, apiVersion, xApiVersion)

Relate warranty policy to stock item

Associates a warranty policy with a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemWarrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemWarrantyPolicyDtoEnvelope = apiInstance.relateWarrantyPolicyToStockItem(itemId, itemWarrantyPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#relateWarrantyPolicyToStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#relateWarrantyPolicyToStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemWarrantyPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoEnvelope**](ItemWarrantyPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeAttachmentFromStockItem"></a>
# **removeAttachmentFromStockItem**
> ItemAttachmentDtoEnvelope removeAttachmentFromStockItem(itemId, itemAttachmentId, tenantId, apiVersion, xApiVersion)

Remove attachment from stock item

Removes an attachment from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemAttachmentId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttachmentDtoEnvelope = apiInstance.removeAttachmentFromStockItem(itemId, itemAttachmentId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeAttachmentFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeAttachmentFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemAttachmentId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttachmentDtoEnvelope**](ItemAttachmentDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeAttributeOptionFromStockItem"></a>
# **removeAttributeOptionFromStockItem**
> ItemAttributeOptionDtoEnvelope removeAttributeOptionFromStockItem(itemId, itemAttributeOptionId, apiVersion, xApiVersion)

Remove attribute option from stock item

Removes an attribute option from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemAttributeOptionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemAttributeOptionDtoEnvelope = apiInstance.removeAttributeOptionFromStockItem(itemId, itemAttributeOptionId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeAttributeOptionFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeAttributeOptionFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemAttributeOptionId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemAttributeOptionDtoEnvelope**](ItemAttributeOptionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeBrandFromStockItem"></a>
# **removeBrandFromStockItem**
> ItemBrandDtoEnvelope removeBrandFromStockItem(itemId, itemBrandId, tenantId, apiVersion, xApiVersion)

Remove brand from stock item

Removes a brand association from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemBrandId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemBrandDtoEnvelope = apiInstance.removeBrandFromStockItem(itemId, itemBrandId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeBrandFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeBrandFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemBrandId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemBrandDtoEnvelope**](ItemBrandDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeCategoryFromStockItem"></a>
# **removeCategoryFromStockItem**
> ItemCategoryDtoEnvelope removeCategoryFromStockItem(itemId, itemCategoryId, tenantId, apiVersion, xApiVersion)

Remove category from stock item

Removes a category association from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemCategoryDtoEnvelope = apiInstance.removeCategoryFromStockItem(itemId, itemCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeCategoryFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeCategoryFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemCategoryDtoEnvelope**](ItemCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeGoogleCategoryFromStockItem"></a>
# **removeGoogleCategoryFromStockItem**
> ItemGoogleCategoryDtoEnvelope removeGoogleCategoryFromStockItem(itemId, itemGoogleCategoryId, tenantId, apiVersion, xApiVersion)

Remove Google category from stock item

Removes a Google category from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemGoogleCategoryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemGoogleCategoryDtoEnvelope = apiInstance.removeGoogleCategoryFromStockItem(itemId, itemGoogleCategoryId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeGoogleCategoryFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeGoogleCategoryFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemGoogleCategoryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemGoogleCategoryDtoEnvelope**](ItemGoogleCategoryDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeImageFromStockItem"></a>
# **removeImageFromStockItem**
> ItemImageDtoEnvelope removeImageFromStockItem(itemId, itemImageId, tenantId, apiVersion, xApiVersion)

Remove image from stock item

Removes an image association from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemImageId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemImageDtoEnvelope = apiInstance.removeImageFromStockItem(itemId, itemImageId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeImageFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeImageFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemImageId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemImageDtoEnvelope**](ItemImageDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removePriceRuleFromStockItem"></a>
# **removePriceRuleFromStockItem**
> PricingRuleDtoEnvelope removePriceRuleFromStockItem(itemId, itemPriceRuleId, apiVersion, xApiVersion)

Remove price rule from stock item

Removes a pricing rule from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemPriceRuleId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : PricingRuleDtoEnvelope = apiInstance.removePriceRuleFromStockItem(itemId, itemPriceRuleId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removePriceRuleFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removePriceRuleFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemPriceRuleId** | **java.util.UUID**|  | |
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

<a id="removeQuestionFromStockItem"></a>
# **removeQuestionFromStockItem**
> ItemQuestionDtoEnvelope removeQuestionFromStockItem(itemId, itemQuestionId, tenantId, apiVersion, xApiVersion)

Remove question from stock item

Removes a question from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemQuestionId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemQuestionDtoEnvelope = apiInstance.removeQuestionFromStockItem(itemId, itemQuestionId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeQuestionFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeQuestionFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemQuestionId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemQuestionDtoEnvelope**](ItemQuestionDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeRefundPolicyFromStockItem"></a>
# **removeRefundPolicyFromStockItem**
> ItemRefundPolicyDtoEnvelope removeRefundPolicyFromStockItem(itemId, itemRefundPolicyId, tenantId, apiVersion, xApiVersion)

Remove refund policy from stock item

Removes a refund policy from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemRefundPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemRefundPolicyDtoEnvelope = apiInstance.removeRefundPolicyFromStockItem(itemId, itemRefundPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeRefundPolicyFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeRefundPolicyFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemRefundPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemRefundPolicyDtoEnvelope**](ItemRefundPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeReturnPolicyFromStockItem"></a>
# **removeReturnPolicyFromStockItem**
> ItemReturnPolicyDtoEnvelope removeReturnPolicyFromStockItem(itemId, itemReturnPolicyId, tenantId, apiVersion, xApiVersion)

Remove return policy from stock item

Removes a return policy from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemReturnPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReturnPolicyDtoEnvelope = apiInstance.removeReturnPolicyFromStockItem(itemId, itemReturnPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeReturnPolicyFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeReturnPolicyFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemReturnPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReturnPolicyDtoEnvelope**](ItemReturnPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeReviewFromStockItem"></a>
# **removeReviewFromStockItem**
> ItemReviewDtoEnvelope removeReviewFromStockItem(itemId, itemReviewId, tenantId, apiVersion, xApiVersion)

Remove review from stock item

Removes a review from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemReviewId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemReviewDtoEnvelope = apiInstance.removeReviewFromStockItem(itemId, itemReviewId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeReviewFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeReviewFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemReviewId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemReviewDtoEnvelope**](ItemReviewDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeShippingPolicyFromStockItem"></a>
# **removeShippingPolicyFromStockItem**
> ItemShippingPolicyDtoEnvelope removeShippingPolicyFromStockItem(itemId, itemShippingPolicyId, tenantId, apiVersion, xApiVersion)

Remove shipping policy from stock item

Removes a shipping policy from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemShippingPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemShippingPolicyDtoEnvelope = apiInstance.removeShippingPolicyFromStockItem(itemId, itemShippingPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeShippingPolicyFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeShippingPolicyFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemShippingPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemShippingPolicyDtoEnvelope**](ItemShippingPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeTagFromStockItem"></a>
# **removeTagFromStockItem**
> ItemTagDtoEnvelope removeTagFromStockItem(itemId, itemTagId, tenantId, apiVersion, xApiVersion)

Remove tag from stock item

Removes a tag association from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTagId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTagDtoEnvelope = apiInstance.removeTagFromStockItem(itemId, itemTagId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeTagFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeTagFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTagId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTagDtoEnvelope**](ItemTagDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeTaxPolicyFromStockItem"></a>
# **removeTaxPolicyFromStockItem**
> ItemTaxPolicyDtoEnvelope removeTaxPolicyFromStockItem(itemId, itemTaxPolicyId, tenantId, apiVersion, xApiVersion)

Remove tax policy from stock item

Removes a tax policy from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTaxPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTaxPolicyDtoEnvelope = apiInstance.removeTaxPolicyFromStockItem(itemId, itemTaxPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeTaxPolicyFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeTaxPolicyFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTaxPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTaxPolicyDtoEnvelope**](ItemTaxPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeTypeFromStockItem"></a>
# **removeTypeFromStockItem**
> ItemTypeDtoEnvelope removeTypeFromStockItem(itemId, itemTypeId, tenantId, apiVersion, xApiVersion)

Remove type from stock item

Removes a type association from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemTypeId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemTypeDtoEnvelope = apiInstance.removeTypeFromStockItem(itemId, itemTypeId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeTypeFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeTypeFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemTypeId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemTypeDtoEnvelope**](ItemTypeDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="removeWarrantyPolicyFromStockItem"></a>
# **removeWarrantyPolicyFromStockItem**
> ItemWarrantyPolicyDtoEnvelope removeWarrantyPolicyFromStockItem(itemId, itemWarrantyPolicyId, tenantId, apiVersion, xApiVersion)

Remove warranty policy from stock item

Removes a warranty policy from a stock item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val itemWarrantyPolicyId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : ItemWarrantyPolicyDtoEnvelope = apiInstance.removeWarrantyPolicyFromStockItem(itemId, itemWarrantyPolicyId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#removeWarrantyPolicyFromStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#removeWarrantyPolicyFromStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **itemWarrantyPolicyId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**ItemWarrantyPolicyDtoEnvelope**](ItemWarrantyPolicyDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateProductPrimaryImageAsync"></a>
# **updateProductPrimaryImageAsync**
> EmptyEnvelope updateProductPrimaryImageAsync(itemId, tenantId, apiVersion, xApiVersion, `data`)

Update item primary image

Updates the primary image for a specific catalog item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val `data` : java.io.File = BINARY_DATA_HERE // java.io.File | 
try {
    val result : EmptyEnvelope = apiInstance.updateProductPrimaryImageAsync(itemId, tenantId, apiVersion, xApiVersion, `data`)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#updateProductPrimaryImageAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#updateProductPrimaryImageAsync")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | [optional] |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **&#x60;data&#x60;** | **java.io.File**|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="updateStockItem"></a>
# **updateStockItem**
> updateStockItem(itemId, tenantId, apiVersion, xApiVersion, catalogItemUpdateDto)

Update a stock item

Updates an existing stock item for the specified tenant and item ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val itemId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val catalogItemUpdateDto : CatalogItemUpdateDto =  // CatalogItemUpdateDto | 
try {
    apiInstance.updateStockItem(itemId, tenantId, apiVersion, xApiVersion, catalogItemUpdateDto)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#updateStockItem")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#updateStockItem")
    e.printStackTrace()
}
```

### Parameters
| **itemId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **catalogItemUpdateDto** | [**CatalogItemUpdateDto**](CatalogItemUpdateDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

