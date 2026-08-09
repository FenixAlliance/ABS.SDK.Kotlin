# BusinessDomainsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteSystemBusinessDomain**](BusinessDomainsApi.md#deleteSystemBusinessDomain) | **DELETE** /api/v2/SystemService/BusinessDomains/{businessDomainId} | Delete a business domain |
| [**getSystemBusinessDomainById**](BusinessDomainsApi.md#getSystemBusinessDomainById) | **GET** /api/v2/SystemService/BusinessDomains/{businessDomainId} | Retrieve a business domain by its ID |
| [**getSystemBusinessDomains**](BusinessDomainsApi.md#getSystemBusinessDomains) | **GET** /api/v2/SystemService/BusinessDomains | Retrieve all business domains in the system |
| [**getSystemBusinessDomainsCount**](BusinessDomainsApi.md#getSystemBusinessDomainsCount) | **GET** /api/v2/SystemService/BusinessDomains/Count | Get the count of all business domains in the system |
| [**verifySystemBusinessDomain**](BusinessDomainsApi.md#verifySystemBusinessDomain) | **POST** /api/v2/SystemService/BusinessDomains/{businessDomainId}/Verify | Verify a business domain |


<a id="deleteSystemBusinessDomain"></a>
# **deleteSystemBusinessDomain**
> EmptyEnvelope deleteSystemBusinessDomain(businessDomainId, apiVersion, xApiVersion)

Delete a business domain

Removes any business domain from the system, regardless of owning tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val businessDomainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSystemBusinessDomain(businessDomainId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#deleteSystemBusinessDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#deleteSystemBusinessDomain")
    e.printStackTrace()
}
```

### Parameters
| **businessDomainId** | **java.util.UUID**|  | |
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

<a id="getSystemBusinessDomainById"></a>
# **getSystemBusinessDomainById**
> BusinessDomainDtoEnvelope getSystemBusinessDomainById(businessDomainId, apiVersion, xApiVersion)

Retrieve a business domain by its ID

Retrieve any business domain by its ID, regardless of owning tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val businessDomainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessDomainDtoEnvelope = apiInstance.getSystemBusinessDomainById(businessDomainId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getSystemBusinessDomainById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getSystemBusinessDomainById")
    e.printStackTrace()
}
```

### Parameters
| **businessDomainId** | **java.util.UUID**|  | |
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

<a id="getSystemBusinessDomains"></a>
# **getSystemBusinessDomains**
> BusinessDomainDtoListEnvelope getSystemBusinessDomains(apiVersion, xApiVersion, businessDomainDtoCollectionQueryParameters)

Retrieve all business domains in the system

Retrieve all registered business domains across every tenant (global administrators only).

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val businessDomainDtoCollectionQueryParameters : BusinessDomainDtoCollectionQueryParameters =  // BusinessDomainDtoCollectionQueryParameters | 
try {
    val result : BusinessDomainDtoListEnvelope = apiInstance.getSystemBusinessDomains(apiVersion, xApiVersion, businessDomainDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getSystemBusinessDomains")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getSystemBusinessDomains")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessDomainDtoCollectionQueryParameters** | [**BusinessDomainDtoCollectionQueryParameters**](BusinessDomainDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**BusinessDomainDtoListEnvelope**](BusinessDomainDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getSystemBusinessDomainsCount"></a>
# **getSystemBusinessDomainsCount**
> Int32Envelope getSystemBusinessDomainsCount(apiVersion, xApiVersion, businessDomainDtoCollectionQueryParameters)

Get the count of all business domains in the system

Get the count of all registered business domains across every tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val businessDomainDtoCollectionQueryParameters : BusinessDomainDtoCollectionQueryParameters =  // BusinessDomainDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getSystemBusinessDomainsCount(apiVersion, xApiVersion, businessDomainDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#getSystemBusinessDomainsCount")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#getSystemBusinessDomainsCount")
    e.printStackTrace()
}
```

### Parameters
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessDomainDtoCollectionQueryParameters** | [**BusinessDomainDtoCollectionQueryParameters**](BusinessDomainDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="verifySystemBusinessDomain"></a>
# **verifySystemBusinessDomain**
> EmptyEnvelope verifySystemBusinessDomain(businessDomainId, apiVersion, xApiVersion)

Verify a business domain

Checks the domain&#39;s DNS TXT records for the verification token and marks it verified.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessDomainsApi()
val businessDomainId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.verifySystemBusinessDomain(businessDomainId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessDomainsApi#verifySystemBusinessDomain")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessDomainsApi#verifySystemBusinessDomain")
    e.printStackTrace()
}
```

### Parameters
| **businessDomainId** | **java.util.UUID**|  | |
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

