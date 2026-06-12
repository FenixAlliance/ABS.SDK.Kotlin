# LoyaltyProgramsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**countLoyaltyProgramsAsync**](LoyaltyProgramsApi.md#countLoyaltyProgramsAsync) | **GET** /api/v2/SalesService/LoyaltyPrograms/Count | Get loyalty programs count |
| [**createLoyaltyProgramAsync**](LoyaltyProgramsApi.md#createLoyaltyProgramAsync) | **POST** /api/v2/SalesService/LoyaltyPrograms | Create a loyalty program |
| [**deleteLoyaltyProgramAsync**](LoyaltyProgramsApi.md#deleteLoyaltyProgramAsync) | **DELETE** /api/v2/SalesService/LoyaltyPrograms/{loyaltyProgramId} | Delete a loyalty program |
| [**getLoyaltyProgramAsync**](LoyaltyProgramsApi.md#getLoyaltyProgramAsync) | **GET** /api/v2/SalesService/LoyaltyPrograms/{loyaltyProgramId} | Get loyalty program by ID |
| [**getLoyaltyProgramsAsync**](LoyaltyProgramsApi.md#getLoyaltyProgramsAsync) | **GET** /api/v2/SalesService/LoyaltyPrograms | Get loyalty programs |
| [**patchLoyaltyProgramAsync**](LoyaltyProgramsApi.md#patchLoyaltyProgramAsync) | **PATCH** /api/v2/SalesService/LoyaltyPrograms/{loyaltyProgramId} | Patch a loyalty program |
| [**updateLoyaltyProgramAsync**](LoyaltyProgramsApi.md#updateLoyaltyProgramAsync) | **PUT** /api/v2/SalesService/LoyaltyPrograms/{loyaltyProgramId} | Update a loyalty program |


<a id="countLoyaltyProgramsAsync"></a>
# **countLoyaltyProgramsAsync**
> Int32Envelope countLoyaltyProgramsAsync(tenantId)

Get loyalty programs count

Returns the total count of loyalty programs for the specified tenant with OData filter support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoyaltyProgramsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : Int32Envelope = apiInstance.countLoyaltyProgramsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoyaltyProgramsApi#countLoyaltyProgramsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoyaltyProgramsApi#countLoyaltyProgramsAsync")
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

<a id="createLoyaltyProgramAsync"></a>
# **createLoyaltyProgramAsync**
> EmptyEnvelope createLoyaltyProgramAsync(tenantId, loyaltyProgramCreateDto)

Create a loyalty program

Creates a new loyalty program for the specified tenant.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoyaltyProgramsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val loyaltyProgramCreateDto : LoyaltyProgramCreateDto =  // LoyaltyProgramCreateDto | 
try {
    val result : EmptyEnvelope = apiInstance.createLoyaltyProgramAsync(tenantId, loyaltyProgramCreateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoyaltyProgramsApi#createLoyaltyProgramAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoyaltyProgramsApi#createLoyaltyProgramAsync")
    e.printStackTrace()
}
```

### Parameters
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loyaltyProgramCreateDto** | [**LoyaltyProgramCreateDto**](LoyaltyProgramCreateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteLoyaltyProgramAsync"></a>
# **deleteLoyaltyProgramAsync**
> EmptyEnvelope deleteLoyaltyProgramAsync(loyaltyProgramId, tenantId)

Delete a loyalty program

Deletes an existing loyalty program by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoyaltyProgramsApi()
val loyaltyProgramId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : EmptyEnvelope = apiInstance.deleteLoyaltyProgramAsync(loyaltyProgramId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoyaltyProgramsApi#deleteLoyaltyProgramAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoyaltyProgramsApi#deleteLoyaltyProgramAsync")
    e.printStackTrace()
}
```

### Parameters
| **loyaltyProgramId** | **java.util.UUID**|  | |
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

<a id="getLoyaltyProgramAsync"></a>
# **getLoyaltyProgramAsync**
> LoyaltyProgramDtoEnvelope getLoyaltyProgramAsync(loyaltyProgramId, tenantId)

Get loyalty program by ID

Retrieves a single loyalty program by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoyaltyProgramsApi()
val loyaltyProgramId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : LoyaltyProgramDtoEnvelope = apiInstance.getLoyaltyProgramAsync(loyaltyProgramId, tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoyaltyProgramsApi#getLoyaltyProgramAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoyaltyProgramsApi#getLoyaltyProgramAsync")
    e.printStackTrace()
}
```

### Parameters
| **loyaltyProgramId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**LoyaltyProgramDtoEnvelope**](LoyaltyProgramDtoEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getLoyaltyProgramsAsync"></a>
# **getLoyaltyProgramsAsync**
> LoyaltyProgramDtoListEnvelope getLoyaltyProgramsAsync(tenantId)

Get loyalty programs

Retrieves a list of loyalty programs for the specified tenant with OData query support.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoyaltyProgramsApi()
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
try {
    val result : LoyaltyProgramDtoListEnvelope = apiInstance.getLoyaltyProgramsAsync(tenantId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoyaltyProgramsApi#getLoyaltyProgramsAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoyaltyProgramsApi#getLoyaltyProgramsAsync")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **tenantId** | **java.util.UUID**|  | |

### Return type

[**LoyaltyProgramDtoListEnvelope**](LoyaltyProgramDtoListEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="patchLoyaltyProgramAsync"></a>
# **patchLoyaltyProgramAsync**
> EmptyEnvelope patchLoyaltyProgramAsync(loyaltyProgramId, tenantId, operation)

Patch a loyalty program

Partially updates an existing loyalty program using a JSON Patch document.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoyaltyProgramsApi()
val loyaltyProgramId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val operation : kotlin.collections.List<Operation> =  // kotlin.collections.List<Operation> | 
try {
    val result : EmptyEnvelope = apiInstance.patchLoyaltyProgramAsync(loyaltyProgramId, tenantId, operation)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoyaltyProgramsApi#patchLoyaltyProgramAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoyaltyProgramsApi#patchLoyaltyProgramAsync")
    e.printStackTrace()
}
```

### Parameters
| **loyaltyProgramId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
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

<a id="updateLoyaltyProgramAsync"></a>
# **updateLoyaltyProgramAsync**
> EmptyEnvelope updateLoyaltyProgramAsync(loyaltyProgramId, tenantId, loyaltyProgramUpdateDto)

Update a loyalty program

Updates an existing loyalty program by its unique identifier.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = LoyaltyProgramsApi()
val loyaltyProgramId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val tenantId : java.util.UUID = 38400000-8cf0-11bd-b23e-10b96e4ef00d // java.util.UUID | 
val loyaltyProgramUpdateDto : LoyaltyProgramUpdateDto =  // LoyaltyProgramUpdateDto | 
try {
    val result : EmptyEnvelope = apiInstance.updateLoyaltyProgramAsync(loyaltyProgramId, tenantId, loyaltyProgramUpdateDto)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoyaltyProgramsApi#updateLoyaltyProgramAsync")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoyaltyProgramsApi#updateLoyaltyProgramAsync")
    e.printStackTrace()
}
```

### Parameters
| **loyaltyProgramId** | **java.util.UUID**|  | |
| **tenantId** | **java.util.UUID**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loyaltyProgramUpdateDto** | [**LoyaltyProgramUpdateDto**](LoyaltyProgramUpdateDto.md)|  | [optional] |

### Return type

[**EmptyEnvelope**](EmptyEnvelope.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

