# SupportEntitlementsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createSupportEntitlementAsync**](SupportEntitlementsApi.md#createSupportEntitlementAsync) | **POST** /api/v2/SupportService/SupportEntitlements | Create a new support entitlement |
| [**deleteSupportEntitlementAsync**](SupportEntitlementsApi.md#deleteSupportEntitlementAsync) | **DELETE** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | Delete a support entitlement |
| [**getSupportEntitlementAsync**](SupportEntitlementsApi.md#getSupportEntitlementAsync) | **GET** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | Retrieve a support entitlement by ID |
| [**getSupportEntitlementsAsync**](SupportEntitlementsApi.md#getSupportEntitlementsAsync) | **GET** /api/v2/SupportService/SupportEntitlements | Retrieve a list of support entitlements |
| [**getSupportEntitlementsCountAsync**](SupportEntitlementsApi.md#getSupportEntitlementsCountAsync) | **GET** /api/v2/SupportService/SupportEntitlements/Count | Get the count of support entitlements |
| [**updateSupportEntitlementAsync**](SupportEntitlementsApi.md#updateSupportEntitlementAsync) | **PUT** /api/v2/SupportService/SupportEntitlements/{supportEntitlementId} | Update a support entitlement |


<a id="createSupportEntitlementAsync"></a>
# **createSupportEntitlementAsync**
> EmptyEnvelope createSupportEntitlementAsync(tenantId, apiVersion, xApiVersion, supportEntitlementCreateDto)

Create a new support entitlement

Creates a new support entitlement for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportEntitlementCreateDto : SupportEntitlementCreateDto =  // SupportEntitlementCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createSupportEntitlementAsync(tenantId, apiVersion, xApiVersion, supportEntitlementCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#createSupportEntitlementAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#createSupportEntitlementAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportEntitlementCreateDto** | [**SupportEntitlementCreateDto**](SupportEntitlementCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteSupportEntitlementAsync"></a>
# **deleteSupportEntitlementAsync**
> EmptyEnvelope deleteSupportEntitlementAsync(supportEntitlementId, tenantId, apiVersion, xApiVersion)

Delete a support entitlement

Deletes a support entitlement by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val supportEntitlementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteSupportEntitlementAsync(supportEntitlementId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#deleteSupportEntitlementAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#deleteSupportEntitlementAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportEntitlementId** | **java.util.UUID**|  | |
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

<a id="getSupportEntitlementAsync"></a>
# **getSupportEntitlementAsync**
> SupportEntitlementDtoEnvelope getSupportEntitlementAsync(supportEntitlementId, tenantId, apiVersion, xApiVersion)

Retrieve a support entitlement by ID

Retrieves a single support entitlement by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val supportEntitlementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportEntitlementDtoEnvelope = apiInstance.getSupportEntitlementAsync(supportEntitlementId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#getSupportEntitlementAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#getSupportEntitlementAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportEntitlementId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**SupportEntitlementDtoEnvelope**](SupportEntitlementDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportEntitlementsAsync"></a>
# **getSupportEntitlementsAsync**
> SupportEntitlementDtoListEnvelope getSupportEntitlementsAsync(tenantId, apiVersion, xApiVersion)

Retrieve a list of support entitlements

Retrieves a list of support entitlements for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : SupportEntitlementDtoListEnvelope = apiInstance.getSupportEntitlementsAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#getSupportEntitlementsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#getSupportEntitlementsAsync")
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

[**SupportEntitlementDtoListEnvelope**](SupportEntitlementDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getSupportEntitlementsCountAsync"></a>
# **getSupportEntitlementsCountAsync**
> Int32Envelope getSupportEntitlementsCountAsync(tenantId, apiVersion, xApiVersion)

Get the count of support entitlements

Returns the total count of support entitlements for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getSupportEntitlementsCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#getSupportEntitlementsCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#getSupportEntitlementsCountAsync")
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

<a id="updateSupportEntitlementAsync"></a>
# **updateSupportEntitlementAsync**
> EmptyEnvelope updateSupportEntitlementAsync(supportEntitlementId, tenantId, apiVersion, xApiVersion, supportEntitlementUpdateDto)

Update a support entitlement

Updates an existing support entitlement by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SupportEntitlementsApi()
val supportEntitlementId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
val supportEntitlementUpdateDto : SupportEntitlementUpdateDto =  // SupportEntitlementUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateSupportEntitlementAsync(supportEntitlementId, tenantId, apiVersion, xApiVersion, supportEntitlementUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SupportEntitlementsApi#updateSupportEntitlementAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SupportEntitlementsApi#updateSupportEntitlementAsync")
    e.printStackTrace()
}
```

### Parameters
| **supportEntitlementId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| **xApiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **supportEntitlementUpdateDto** | [**SupportEntitlementUpdateDto**](SupportEntitlementUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

