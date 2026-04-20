# DiscountListsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createDiscountList**](DiscountListsApi.md#createDiscountList) | **POST** /api/v2/PricingService/DiscountLists | Creates a new discount list |
| [**createDiscountListEntry**](DiscountListsApi.md#createDiscountListEntry) | **POST** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts | Creates a discount list entry |
| [**deleteDiscountList**](DiscountListsApi.md#deleteDiscountList) | **DELETE** /api/v2/PricingService/DiscountLists/{discountListId} | Deletes a discount list |
| [**deleteDiscountListEntry**](DiscountListsApi.md#deleteDiscountListEntry) | **DELETE** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} | Deletes a discount list entry |
| [**getDiscountList**](DiscountListsApi.md#getDiscountList) | **GET** /api/v2/PricingService/DiscountLists/{discountListId} | Gets a discount list by ID |
| [**getDiscountListEntries**](DiscountListsApi.md#getDiscountListEntries) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts | Retrieves discounts in a discount list |
| [**getDiscountListEntriesCount**](DiscountListsApi.md#getDiscountListEntriesCount) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/Count | Counts discounts in a discount list |
| [**getDiscountListEntry**](DiscountListsApi.md#getDiscountListEntry) | **GET** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} | Gets a discount list entry by ID |
| [**getDiscountLists**](DiscountListsApi.md#getDiscountLists) | **GET** /api/v2/PricingService/DiscountLists | Retrieves all discount lists |
| [**getDiscountListsCount**](DiscountListsApi.md#getDiscountListsCount) | **GET** /api/v2/PricingService/DiscountLists/Count | Counts discount lists |
| [**updateDiscountList**](DiscountListsApi.md#updateDiscountList) | **PUT** /api/v2/PricingService/DiscountLists/{discountListId} | Updates a discount list |
| [**updateDiscountListEntry**](DiscountListsApi.md#updateDiscountListEntry) | **PUT** /api/v2/PricingService/DiscountLists/{discountListId}/Discounts/{discountListEntryId} | Updates a discount list entry |


<a id="createDiscountList"></a>
# **createDiscountList**
> EmptyEnvelope createDiscountList(tenantId, discountListCreateDto)

Creates a new discount list

Creates a new discount list for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountListCreateDto : DiscountListCreateDto =  // DiscountListCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createDiscountList(tenantId, discountListCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#createDiscountList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#createDiscountList")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **discountListCreateDto** | [**DiscountListCreateDto**](DiscountListCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="createDiscountListEntry"></a>
# **createDiscountListEntry**
> EmptyEnvelope createDiscountListEntry(discountListId, tenantId, discountCreateDto)

Creates a discount list entry

Creates a new discount entry in the specified discount list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountCreateDto : DiscountCreateDto =  // DiscountCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createDiscountListEntry(discountListId, tenantId, discountCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#createDiscountListEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#createDiscountListEntry")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **discountCreateDto** | [**DiscountCreateDto**](DiscountCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteDiscountList"></a>
# **deleteDiscountList**
> EmptyEnvelope deleteDiscountList(discountListId, tenantId)

Deletes a discount list

Deletes the specified discount list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteDiscountList(discountListId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#deleteDiscountList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#deleteDiscountList")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
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

<a id="deleteDiscountListEntry"></a>
# **deleteDiscountListEntry**
> EmptyEnvelope deleteDiscountListEntry(discountListId, discountListEntryId, tenantId)

Deletes a discount list entry

Deletes the specified discount entry from a discount list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountListEntryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteDiscountListEntry(discountListId, discountListEntryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#deleteDiscountListEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#deleteDiscountListEntry")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **discountListEntryId** | **java.util.UUID**|  | |
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

<a id="getDiscountList"></a>
# **getDiscountList**
> DiscountListDtoEnvelope getDiscountList(discountListId, tenantId)

Gets a discount list by ID

Retrieves the details of a discount list using its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DiscountListDtoEnvelope = apiInstance.getDiscountList(discountListId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#getDiscountList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#getDiscountList")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DiscountListDtoEnvelope**](DiscountListDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDiscountListEntries"></a>
# **getDiscountListEntries**
> DiscountDtoListEnvelope getDiscountListEntries(discountListId, tenantId)

Retrieves discounts in a discount list

Gets all discount entries for a specific discount list with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DiscountDtoListEnvelope = apiInstance.getDiscountListEntries(discountListId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#getDiscountListEntries")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#getDiscountListEntries")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DiscountDtoListEnvelope**](DiscountDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDiscountListEntriesCount"></a>
# **getDiscountListEntriesCount**
> Int32Envelope getDiscountListEntriesCount(discountListId, tenantId)

Counts discounts in a discount list

Gets the count of discount entries for a specific discount list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getDiscountListEntriesCount(discountListId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#getDiscountListEntriesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#getDiscountListEntriesCount")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
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

<a id="getDiscountListEntry"></a>
# **getDiscountListEntry**
> DiscountDtoEnvelope getDiscountListEntry(discountListId, discountListEntryId, tenantId)

Gets a discount list entry by ID

Retrieves a specific discount entry from a discount list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountListEntryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DiscountDtoEnvelope = apiInstance.getDiscountListEntry(discountListId, discountListEntryId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#getDiscountListEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#getDiscountListEntry")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **discountListEntryId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DiscountDtoEnvelope**](DiscountDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDiscountLists"></a>
# **getDiscountLists**
> DiscountListDtoListEnvelope getDiscountLists(tenantId)

Retrieves all discount lists

Gets all discount lists for the current tenant with OData support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : DiscountListDtoListEnvelope = apiInstance.getDiscountLists(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#getDiscountLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#getDiscountLists")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**DiscountListDtoListEnvelope**](DiscountListDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getDiscountListsCount"></a>
# **getDiscountListsCount**
> Int32Envelope getDiscountListsCount(tenantId)

Counts discount lists

Gets the count of discount lists for the current tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.getDiscountListsCount(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#getDiscountListsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#getDiscountListsCount")
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

<a id="updateDiscountList"></a>
# **updateDiscountList**
> EmptyEnvelope updateDiscountList(discountListId, tenantId, discountListUpdateDto)

Updates a discount list

Updates the specified discount list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountListUpdateDto : DiscountListUpdateDto =  // DiscountListUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateDiscountList(discountListId, tenantId, discountListUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#updateDiscountList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#updateDiscountList")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **discountListUpdateDto** | [**DiscountListUpdateDto**](DiscountListUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateDiscountListEntry"></a>
# **updateDiscountListEntry**
> EmptyEnvelope updateDiscountListEntry(discountListId, discountListEntryId, tenantId, discountUpdateDto)

Updates a discount list entry

Updates the specified discount entry in a discount list.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DiscountListsApi()
val discountListId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountListEntryId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val discountUpdateDto : DiscountUpdateDto =  // DiscountUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateDiscountListEntry(discountListId, discountListEntryId, tenantId, discountUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DiscountListsApi#updateDiscountListEntry")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DiscountListsApi#updateDiscountListEntry")
    e.printStackTrace()
}
```

### Parameters
| **discountListId** | **java.util.UUID**|  | |
| **discountListEntryId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **discountUpdateDto** | [**DiscountUpdateDto**](DiscountUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

