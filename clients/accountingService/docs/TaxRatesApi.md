# TaxRatesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTaxRate**](TaxRatesApi.md#createTaxRate) | **POST** /api/v2/AccountingService/TaxRates | Create a tax rate |
| [**deleteTaxRate**](TaxRatesApi.md#deleteTaxRate) | **DELETE** /api/v2/AccountingService/TaxRates/{id} | Delete a tax rate |
| [**getTaxRate**](TaxRatesApi.md#getTaxRate) | **GET** /api/v2/AccountingService/TaxRates/{id} | Get tax rate by ID |
| [**getTaxRates**](TaxRatesApi.md#getTaxRates) | **GET** /api/v2/AccountingService/TaxRates | Get all tax rates for a tenant |
| [**getTaxRatesCount**](TaxRatesApi.md#getTaxRatesCount) | **GET** /api/v2/AccountingService/TaxRates/Count | Get tax rates count |
| [**updateTaxRate**](TaxRatesApi.md#updateTaxRate) | **PUT** /api/v2/AccountingService/TaxRates/{id} | Update a tax rate |


<a id="createTaxRate"></a>
# **createTaxRate**
> EmptyEnvelope createTaxRate(tenantId, apiVersion, xApiVersion, taxRateCreateDto)

Create a tax rate

Creates a new tax rate for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxRatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taxRateCreateDto : TaxRateCreateDto =  // TaxRateCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTaxRate(tenantId, apiVersion, xApiVersion, taxRateCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#createTaxRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#createTaxRate")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taxRateCreateDto** | [**TaxRateCreateDto**](TaxRateCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTaxRate"></a>
# **deleteTaxRate**
> EmptyEnvelope deleteTaxRate(id, tenantId, apiVersion, xApiVersion)

Delete a tax rate

Deletes a tax rate identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxRatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTaxRate(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#deleteTaxRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#deleteTaxRate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
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

<a id="getTaxRate"></a>
# **getTaxRate**
> TaxRateDtoEnvelope getTaxRate(id, tenantId, apiVersion, xApiVersion)

Get tax rate by ID

Retrieves a specific tax rate by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxRatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaxRateDtoEnvelope = apiInstance.getTaxRate(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#getTaxRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#getTaxRate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**TaxRateDtoEnvelope**](TaxRateDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaxRates"></a>
# **getTaxRates**
> TaxRateDtoListEnvelope getTaxRates(tenantId, apiVersion, xApiVersion)

Get all tax rates for a tenant

Retrieves all tax rates for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxRatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaxRateDtoListEnvelope = apiInstance.getTaxRates(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#getTaxRates")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#getTaxRates")
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

[**TaxRateDtoListEnvelope**](TaxRateDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaxRatesCount"></a>
# **getTaxRatesCount**
> Int32Envelope getTaxRatesCount(tenantId, apiVersion, xApiVersion)

Get tax rates count

Returns the count of tax rates for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxRatesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTaxRatesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#getTaxRatesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#getTaxRatesCount")
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

<a id="updateTaxRate"></a>
# **updateTaxRate**
> EmptyEnvelope updateTaxRate(id, tenantId, apiVersion, xApiVersion, taxRateUpdateDto)

Update a tax rate

Updates an existing tax rate identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxRatesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taxRateUpdateDto : TaxRateUpdateDto =  // TaxRateUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTaxRate(id, tenantId, apiVersion, xApiVersion, taxRateUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxRatesApi#updateTaxRate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxRatesApi#updateTaxRate")
    e.printStackTrace()
}
```

### Parameters
| **id** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taxRateUpdateDto** | [**TaxRateUpdateDto**](TaxRateUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

