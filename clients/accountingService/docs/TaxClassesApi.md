# TaxClassesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createTaxClass**](TaxClassesApi.md#createTaxClass) | **POST** /api/v2/AccountingService/TaxClasses | Create a tax class |
| [**deleteTaxClass**](TaxClassesApi.md#deleteTaxClass) | **DELETE** /api/v2/AccountingService/TaxClasses/{id} | Delete a tax class |
| [**getTaxClass**](TaxClassesApi.md#getTaxClass) | **GET** /api/v2/AccountingService/TaxClasses/{id} | Get tax class by ID |
| [**getTaxClasses**](TaxClassesApi.md#getTaxClasses) | **GET** /api/v2/AccountingService/TaxClasses | Get all tax classes for a tenant |
| [**getTaxClassesCount**](TaxClassesApi.md#getTaxClassesCount) | **GET** /api/v2/AccountingService/TaxClasses/Count | Get tax classes count |
| [**patchTaxClass**](TaxClassesApi.md#patchTaxClass) | **PATCH** /api/v2/AccountingService/TaxClasses/{id} | Patch a tax class |
| [**updateTaxClass**](TaxClassesApi.md#updateTaxClass) | **PUT** /api/v2/AccountingService/TaxClasses/{id} | Update a tax class |


<a id="createTaxClass"></a>
# **createTaxClass**
> EmptyEnvelope createTaxClass(tenantId, apiVersion, xApiVersion, taxClassCreateDto)

Create a tax class

Creates a new tax class for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxClassesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taxClassCreateDto : TaxClassCreateDto =  // TaxClassCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createTaxClass(tenantId, apiVersion, xApiVersion, taxClassCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxClassesApi#createTaxClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxClassesApi#createTaxClass")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **taxClassCreateDto** | [**TaxClassCreateDto**](TaxClassCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteTaxClass"></a>
# **deleteTaxClass**
> EmptyEnvelope deleteTaxClass(id, tenantId, apiVersion, xApiVersion)

Delete a tax class

Deletes a tax class identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxClassesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteTaxClass(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxClassesApi#deleteTaxClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxClassesApi#deleteTaxClass")
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

<a id="getTaxClass"></a>
# **getTaxClass**
> TaxClassDtoEnvelope getTaxClass(id, tenantId, apiVersion, xApiVersion)

Get tax class by ID

Retrieves a specific tax class by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxClassesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaxClassDtoEnvelope = apiInstance.getTaxClass(id, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxClassesApi#getTaxClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxClassesApi#getTaxClass")
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

[**TaxClassDtoEnvelope**](TaxClassDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaxClasses"></a>
# **getTaxClasses**
> TaxClassDtoListEnvelope getTaxClasses(tenantId, apiVersion, xApiVersion)

Get all tax classes for a tenant

Retrieves all tax classes for the specified tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxClassesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : TaxClassDtoListEnvelope = apiInstance.getTaxClasses(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxClassesApi#getTaxClasses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxClassesApi#getTaxClasses")
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

[**TaxClassDtoListEnvelope**](TaxClassDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getTaxClassesCount"></a>
# **getTaxClassesCount**
> Int32Envelope getTaxClassesCount(tenantId, apiVersion, xApiVersion)

Get tax classes count

Returns the count of tax classes for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxClassesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getTaxClassesCount(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxClassesApi#getTaxClassesCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxClassesApi#getTaxClassesCount")
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

<a id="patchTaxClass"></a>
# **patchTaxClass**
> EmptyEnvelope patchTaxClass(id, tenantId, apiVersion, xApiVersion, operation)

Patch a tax class

Partially updates an existing tax class identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxClassesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchTaxClass(id, tenantId, apiVersion, xApiVersion, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxClassesApi#patchTaxClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxClassesApi#patchTaxClass")
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
| **operation** | [**kotlin.collections.List&lt;Operation&gt;**](Operation.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateTaxClass"></a>
# **updateTaxClass**
> EmptyEnvelope updateTaxClass(id, tenantId, apiVersion, xApiVersion, taxClassUpdateDto)

Update a tax class

Updates an existing tax class identified by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TaxClassesApi()
val id : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val taxClassUpdateDto : TaxClassUpdateDto =  // TaxClassUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateTaxClass(id, tenantId, apiVersion, xApiVersion, taxClassUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TaxClassesApi#updateTaxClass")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TaxClassesApi#updateTaxClass")
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
| **taxClassUpdateDto** | [**TaxClassUpdateDto**](TaxClassUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

