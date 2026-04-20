# BillingProfilesApi

All URIs are relative to *https://absuite.net*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createBillingProfileAsync**](BillingProfilesApi.md#createBillingProfileAsync) | **POST** /api/v2/AccountingService/BillingProfiles | Creates a new billing profile |
| [**deleteBillingProfileAsync**](BillingProfilesApi.md#deleteBillingProfileAsync) | **DELETE** /api/v2/AccountingService/BillingProfiles/{billingProfileId} | Deletes a billing profile |
| [**getBillingProfileByIdAsync**](BillingProfilesApi.md#getBillingProfileByIdAsync) | **GET** /api/v2/AccountingService/BillingProfiles/{billingProfileId} | Gets a billing profile by id |
| [**getBillingProfilesAsync**](BillingProfilesApi.md#getBillingProfilesAsync) | **GET** /api/v2/AccountingService/BillingProfiles | Gets all billing profiles |
| [**getBillingProfilesCountAsync**](BillingProfilesApi.md#getBillingProfilesCountAsync) | **GET** /api/v2/AccountingService/BillingProfiles/Count | Gets the count of billing profiles |
| [**updateBillingProfileAsync**](BillingProfilesApi.md#updateBillingProfileAsync) | **PUT** /api/v2/AccountingService/BillingProfiles/{billingProfileId} | Updates an existing billing profile |


<a id="createBillingProfileAsync"></a>
# **createBillingProfileAsync**
> EmptyEnvelope createBillingProfileAsync(tenantId, billingProfileCreateDto, apiVersion, xApiVersion)

Creates a new billing profile

Adds a new billing profile record for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val billingProfileCreateDto : BillingProfileCreateDto =  // BillingProfileCreateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.createBillingProfileAsync(tenantId, billingProfileCreateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingProfilesApi#createBillingProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingProfilesApi#createBillingProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| **billingProfileCreateDto** | [**BillingProfileCreateDto**](BillingProfileCreateDto.md)|  | |
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

<a id="deleteBillingProfileAsync"></a>
# **deleteBillingProfileAsync**
> EmptyEnvelope deleteBillingProfileAsync(billingProfileId, tenantId, apiVersion, xApiVersion)

Deletes a billing profile

Removes a billing profile from the system using its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingProfilesApi()
val billingProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.deleteBillingProfileAsync(billingProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingProfilesApi#deleteBillingProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingProfilesApi#deleteBillingProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **billingProfileId** | **java.util.UUID**|  | |
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

<a id="getBillingProfileByIdAsync"></a>
# **getBillingProfileByIdAsync**
> BillingProfileDtoEnvelope getBillingProfileByIdAsync(billingProfileId, tenantId, apiVersion, xApiVersion)

Gets a billing profile by id

Retrieves a specific billing profile using its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingProfilesApi()
val billingProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BillingProfileDtoEnvelope = apiInstance.getBillingProfileByIdAsync(billingProfileId, tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingProfilesApi#getBillingProfileByIdAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingProfilesApi#getBillingProfileByIdAsync")
    e.printStackTrace()
}
```

### Parameters
| **billingProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **apiVersion** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **xApiVersion** | **kotlin.String**|  | [optional] |

### Return type

[**BillingProfileDtoEnvelope**](BillingProfileDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBillingProfilesAsync"></a>
# **getBillingProfilesAsync**
> BillingProfileDtoIReadOnlyListEnvelope getBillingProfilesAsync(tenantId, apiVersion, xApiVersion)

Gets all billing profiles

Fetches all billing profiles for a tenant with support for OData queries.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : BillingProfileDtoIReadOnlyListEnvelope = apiInstance.getBillingProfilesAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingProfilesApi#getBillingProfilesAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingProfilesApi#getBillingProfilesAsync")
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

[**BillingProfileDtoIReadOnlyListEnvelope**](BillingProfileDtoIReadOnlyListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getBillingProfilesCountAsync"></a>
# **getBillingProfilesCountAsync**
> Int32Envelope getBillingProfilesCountAsync(tenantId, apiVersion, xApiVersion)

Gets the count of billing profiles

Returns the number of billing profiles for a tenant, supporting OData filtering.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingProfilesApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : Int32Envelope = apiInstance.getBillingProfilesCountAsync(tenantId, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingProfilesApi#getBillingProfilesCountAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingProfilesApi#getBillingProfilesCountAsync")
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

<a id="updateBillingProfileAsync"></a>
# **updateBillingProfileAsync**
> EmptyEnvelope updateBillingProfileAsync(billingProfileId, tenantId, billingProfileUpdateDto, apiVersion, xApiVersion)

Updates an existing billing profile

Modifies an existing billing profile using the provided data.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BillingProfilesApi()
val billingProfileId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val billingProfileUpdateDto : BillingProfileUpdateDto =  // BillingProfileUpdateDto | 
val apiVersion : kotlin.String = apiVersion_example // kotlin.String | 
val xApiVersion : kotlin.String = xApiVersion_example // kotlin.String | 
try {
    val result : EmptyEnvelope = apiInstance.updateBillingProfileAsync(billingProfileId, tenantId, billingProfileUpdateDto, apiVersion, xApiVersion)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BillingProfilesApi#updateBillingProfileAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BillingProfilesApi#updateBillingProfileAsync")
    e.printStackTrace()
}
```

### Parameters
| **billingProfileId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| **billingProfileUpdateDto** | [**BillingProfileUpdateDto**](BillingProfileUpdateDto.md)|  | |
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

