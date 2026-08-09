# BusinessRelationshipsApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBusinessRelationshipAsync**](BusinessRelationshipsApi.md#createBusinessRelationshipAsync) | **POST** /api/v2/TenantsService/BusinessRelationships | Create a business relationship |
| [**deleteBusinessRelationshipAsync**](BusinessRelationshipsApi.md#deleteBusinessRelationshipAsync) | **DELETE** /api/v2/TenantsService/BusinessRelationships/{businessRelationshipId} | Delete a business relationship |
| [**getBusinessRelationshipByIdAsync**](BusinessRelationshipsApi.md#getBusinessRelationshipByIdAsync) | **GET** /api/v2/TenantsService/BusinessRelationships/{businessRelationshipId} | Get business relationship by ID |
| [**getBusinessRelationshipsAsync**](BusinessRelationshipsApi.md#getBusinessRelationshipsAsync) | **GET** /api/v2/TenantsService/BusinessRelationships | Get business relationships |
| [**getBusinessRelationshipsCountAsync**](BusinessRelationshipsApi.md#getBusinessRelationshipsCountAsync) | **GET** /api/v2/TenantsService/BusinessRelationships/Count | Get business relationships count |
| [**updateBusinessRelationshipAsync**](BusinessRelationshipsApi.md#updateBusinessRelationshipAsync) | **PUT** /api/v2/TenantsService/BusinessRelationships/{businessRelationshipId} | Update a business relationship |


<a id="createBusinessRelationshipAsync"></a>
# **createBusinessRelationshipAsync**
> EmptyEnvelope createBusinessRelationshipAsync(tenantId, businessRelationshipCreateDto, apiVersion, xApiVersion)

Create a business relationship

Creates a new business relationship owned by the specified parent tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessRelationshipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val businessRelationshipCreateDto : BusinessRelationshipCreateDto =  // BusinessRelationshipCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createBusinessRelationshipAsync(tenantId, businessRelationshipCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessRelationshipsApi#createBusinessRelationshipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessRelationshipsApi#createBusinessRelationshipAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **businessRelationshipCreateDto** | [**BusinessRelationshipCreateDto**](BusinessRelationshipCreateDto.md)|  | |
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

<a id="deleteBusinessRelationshipAsync"></a>
# **deleteBusinessRelationshipAsync**
> EmptyEnvelope deleteBusinessRelationshipAsync(businessRelationshipId, tenantId, apiVersion, xApiVersion)

Delete a business relationship

Deletes a business relationship by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessRelationshipsApi()
val businessRelationshipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBusinessRelationshipAsync(businessRelationshipId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessRelationshipsApi#deleteBusinessRelationshipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessRelationshipsApi#deleteBusinessRelationshipAsync")
    e.printStackTrace()
}
```

### Parameters
| **businessRelationshipId** | **java.util.UUID**|  | |
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

<a id="getBusinessRelationshipByIdAsync"></a>
# **getBusinessRelationshipByIdAsync**
> BusinessRelationshipDtoEnvelope getBusinessRelationshipByIdAsync(businessRelationshipId, tenantId, apiVersion, xApiVersion)

Get business relationship by ID

Retrieves the details of a specific business relationship by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessRelationshipsApi()
val businessRelationshipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BusinessRelationshipDtoEnvelope = apiInstance.getBusinessRelationshipByIdAsync(businessRelationshipId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessRelationshipsApi#getBusinessRelationshipByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessRelationshipsApi#getBusinessRelationshipByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **businessRelationshipId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BusinessRelationshipDtoEnvelope**](BusinessRelationshipDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBusinessRelationshipsAsync"></a>
# **getBusinessRelationshipsAsync**
> BusinessRelationshipDtoListEnvelope getBusinessRelationshipsAsync(tenantId, apiVersion, xApiVersion, businessRelationshipDtoCollectionQueryParameters)

Get business relationships

Retrieves the child business relationships owned by the specified parent tenant using OData query options.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessRelationshipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val businessRelationshipDtoCollectionQueryParameters : BusinessRelationshipDtoCollectionQueryParameters =  // BusinessRelationshipDtoCollectionQueryParameters | 
try {
    val result : BusinessRelationshipDtoListEnvelope = apiInstance.getBusinessRelationshipsAsync(tenantId, apiVersion, xApiVersion, businessRelationshipDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessRelationshipsApi#getBusinessRelationshipsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessRelationshipsApi#getBusinessRelationshipsAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessRelationshipDtoCollectionQueryParameters** | [**BusinessRelationshipDtoCollectionQueryParameters**](BusinessRelationshipDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**BusinessRelationshipDtoListEnvelope**](BusinessRelationshipDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getBusinessRelationshipsCountAsync"></a>
# **getBusinessRelationshipsCountAsync**
> Int32Envelope getBusinessRelationshipsCountAsync(tenantId, apiVersion, xApiVersion, businessRelationshipDtoCollectionQueryParameters)

Get business relationships count

Returns the count of child business relationships owned by the specified parent tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessRelationshipsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val businessRelationshipDtoCollectionQueryParameters : BusinessRelationshipDtoCollectionQueryParameters =  // BusinessRelationshipDtoCollectionQueryParameters | 
try {
    val result : Int32Envelope = apiInstance.getBusinessRelationshipsCountAsync(tenantId, apiVersion, xApiVersion, businessRelationshipDtoCollectionQueryParameters)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessRelationshipsApi#getBusinessRelationshipsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessRelationshipsApi#getBusinessRelationshipsCountAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessRelationshipDtoCollectionQueryParameters** | [**BusinessRelationshipDtoCollectionQueryParameters**](BusinessRelationshipDtoCollectionQueryParameters.md)|  | [optional] |

### Return type

[**Int32Envelope**](Int32Envelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="updateBusinessRelationshipAsync"></a>
# **updateBusinessRelationshipAsync**
> EmptyEnvelope updateBusinessRelationshipAsync(businessRelationshipId, tenantId, businessRelationshipUpdateDto, apiVersion, xApiVersion)

Update a business relationship

Updates an existing business relationship by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BusinessRelationshipsApi()
val businessRelationshipId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val businessRelationshipUpdateDto : BusinessRelationshipUpdateDto =  // BusinessRelationshipUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateBusinessRelationshipAsync(businessRelationshipId, tenantId, businessRelationshipUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessRelationshipsApi#updateBusinessRelationshipAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessRelationshipsApi#updateBusinessRelationshipAsync")
    e.printStackTrace()
}
```

### Parameters
| **businessRelationshipId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **businessRelationshipUpdateDto** | [**BusinessRelationshipUpdateDto**](BusinessRelationshipUpdateDto.md)|  | |
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

