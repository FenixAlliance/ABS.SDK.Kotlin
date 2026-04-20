# MerchantsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getMerchantById**](MerchantsApi.md#getMerchantById) | **GET** /api/v2/CatalogService/Merchants/{merchantId} | Get merchant by ID |
| [**getMerchants**](MerchantsApi.md#getMerchants) | **GET** /api/v2/CatalogService/Merchants | Get all merchants |
| [**getMerchantsCount**](MerchantsApi.md#getMerchantsCount) | **GET** /api/v2/CatalogService/Merchants/Count | Count merchants |


<a id="getMerchantById"></a>
# **getMerchantById**
> MerchantDtoEnvelope getMerchantById(merchantId, apiVersion, xApiVersion)

Get merchant by ID

Retrieves a merchant by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MerchantsApi()
val merchantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MerchantDtoEnvelope = apiInstance.getMerchantById(merchantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MerchantsApi#getMerchantById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MerchantsApi#getMerchantById")
    e.printStackTrace()
}
```

### Parameters
| **merchantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MerchantDtoEnvelope**](MerchantDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMerchants"></a>
# **getMerchants**
> MerchantDtoListEnvelope getMerchants(apiVersion, xApiVersion)

Get all merchants

Retrieves all merchants, optionally filtered by OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MerchantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : MerchantDtoListEnvelope = apiInstance.getMerchants(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MerchantsApi#getMerchants")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MerchantsApi#getMerchants")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**MerchantDtoListEnvelope**](MerchantDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getMerchantsCount"></a>
# **getMerchantsCount**
> Int32Envelope getMerchantsCount(apiVersion, xApiVersion)

Count merchants

Counts the number of merchants, optionally filtered by OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MerchantsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getMerchantsCount(apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MerchantsApi#getMerchantsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MerchantsApi#getMerchantsCount")
    e.printStackTrace()
}
```

### Parameters
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

