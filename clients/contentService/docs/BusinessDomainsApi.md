# BusinessDomainsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBusinessDomainAsync**](BusinessDomainsApi.md#createBusinessDomainAsync) | **POST** /api/v2/ContentService/BusinessDomains | Register a business domain |
| [**deleteBusinessDomainAsync**](BusinessDomainsApi.md#deleteBusinessDomainAsync) | **DELETE** /api/v2/ContentService/BusinessDomains/{businessDomainId} | Delete a business domain |
| [**getBusinessDomainByIdAsync**](BusinessDomainsApi.md#getBusinessDomainByIdAsync) | **GET** /api/v2/ContentService/BusinessDomains/{businessDomainId} | Get business domain by ID |
| [**getBusinessDomainsAsync**](BusinessDomainsApi.md#getBusinessDomainsAsync) | **GET** /api/v2/ContentService/BusinessDomains | Get business domains |
| [**getBusinessDomainsCountAsync**](BusinessDomainsApi.md#getBusinessDomainsCountAsync) | **GET** /api/v2/ContentService/BusinessDomains/Count | Get business domains count |
| [**updateBusinessDomainAsync**](BusinessDomainsApi.md#updateBusinessDomainAsync) | **PUT** /api/v2/ContentService/BusinessDomains/{businessDomainId} | Update a business domain |
| [**verifyBusinessDomainAsync**](BusinessDomainsApi.md#verifyBusinessDomainAsync) | **POST** /api/v2/ContentService/BusinessDomains/{businessDomainId}/Verify | Verify a business domain |


<a id="createBusinessDomainAsync"></a>
# **createBusinessDomainAsync**
> EmptyEnvelope createBusinessDomainAsync(tenantId, businessDomainCreateDto, apiVersion, xApiVersion)

Register a business domain

Registers a new (unverified) business domain for the tenant and issues a DNS TXT verification token.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val businessDomainCreateDto : BusinessDomainCreateDto =  // BusinessDomainCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createBusinessDomainAsync(tenantId, businessDomainCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#createBusinessDomainAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#createBusinessDomainAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **businessDomainCreateDto** | [**BusinessDomainCreateDto**](BusinessDomainCreateDto.md)|  | |
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

<a id="deleteBusinessDomainAsync"></a>
# **deleteBusinessDomainAsync**
> EmptyEnvelope deleteBusinessDomainAsync(businessDomainId, tenantId, apiVersion, xApiVersion)

Delete a business domain

Removes a business domain from the tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val businessDomainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBusinessDomainAsync(businessDomainId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#deleteBusinessDomainAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#deleteBusinessDomainAsync")
    e.printStackTrace()
}
```

### Parameters
| **businessDomainId** | **java.util.UUID**|  | |
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

<a id="getBusinessDomainByIdAsync"></a>
# **getBusinessDomainByIdAsync**
> BusinessDomainDtoEnvelope getBusinessDomainByIdAsync(businessDomainId, tenantId, apiVersion, xApiVersion)

Get business domain by ID

Retrieves a specific business domain.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val businessDomainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessDomainDtoEnvelope = apiInstance.getBusinessDomainByIdAsync(businessDomainId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getBusinessDomainByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getBusinessDomainByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **businessDomainId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BusinessDomainDtoEnvelope**](BusinessDomainDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessDomainsAsync"></a>
# **getBusinessDomainsAsync**
> BusinessDomainDtoListEnvelope getBusinessDomainsAsync(tenantId, apiVersion, xApiVersion)

Get business domains

Retrieves business domains for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessDomainDtoListEnvelope = apiInstance.getBusinessDomainsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getBusinessDomainsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getBusinessDomainsAsync")
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

[**BusinessDomainDtoListEnvelope**](BusinessDomainDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessDomainsCountAsync"></a>
# **getBusinessDomainsCountAsync**
> Int32Envelope getBusinessDomainsCountAsync(tenantId, apiVersion, xApiVersion)

Get business domains count

Retrieves the count of business domains for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBusinessDomainsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getBusinessDomainsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getBusinessDomainsCountAsync")
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

<a id="updateBusinessDomainAsync"></a>
# **updateBusinessDomainAsync**
> EmptyEnvelope updateBusinessDomainAsync(businessDomainId, tenantId, businessDomainUpdateDto, apiVersion, xApiVersion)

Update a business domain

Updates a business domain. Changing the host re-issues the verification token and clears verification.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val businessDomainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val businessDomainUpdateDto : BusinessDomainUpdateDto =  // BusinessDomainUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateBusinessDomainAsync(businessDomainId, tenantId, businessDomainUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#updateBusinessDomainAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#updateBusinessDomainAsync")
    e.printStackTrace()
}
```

### Parameters
| **businessDomainId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **businessDomainUpdateDto** | [**BusinessDomainUpdateDto**](BusinessDomainUpdateDto.md)|  | |
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

<a id="verifyBusinessDomainAsync"></a>
# **verifyBusinessDomainAsync**
> EmptyEnvelope verifyBusinessDomainAsync(businessDomainId, tenantId, apiVersion, xApiVersion)

Verify a business domain

Checks the domain&#39;s DNS TXT records for the verification token and marks the domain verified.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val businessDomainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.verifyBusinessDomainAsync(businessDomainId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#verifyBusinessDomainAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#verifyBusinessDomainAsync")
    e.printStackTrace()
}
```

### Parameters
| **businessDomainId** | **java.util.UUID**|  | |
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

